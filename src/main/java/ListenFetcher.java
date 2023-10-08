import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jshell.spi.ExecutionControlProvider;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ListenFetcher {
    private ObjectMapper mapper = new ObjectMapper();
    private String userId;
    public ListenFetcher(String userId) {
        this.userId = userId;
    }

    public String getListenStats() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.listenbrainz.org/1/stats/user/" + userId + "/recordings?range=week"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public ListenFetcherDto getListenFetcherDto(String json) throws JsonParseException, JsonMappingException, IOException {
        ListenFetcherDto lfd = mapper.readValue(json, ListenFetcherPayloadDto.class).getPayload();
        return lfd;
    }
}
