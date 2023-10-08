import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testListenFetcher {

    @Test
    public void testUnmarshalling() throws Exception {
        String jsonAsString =
                """
{
  "payload": {
    "count": 25,
    "from_ts": 1695600000,
    "last_updated": 1696731171,
    "offset": 0,
    "range": "week",
    "recordings": [
      {
        "artist_mbids": [
          "8c529495-91f5-4e2f-b71b-adcb66878d04"
        ],
        "artist_name": "Japanese Breakfast",
        "caa_id": 29955763885,
        "caa_release_mbid": "edceeb0b-c5dc-4508-a467-9ae0be4d6815",
        "listen_count": 8,
        "recording_mbid": "b895e437-a233-4f69-ab04-e482417a5c46",
        "release_mbid": "edceeb0b-c5dc-4508-a467-9ae0be4d6815",
        "release_name": "Jubilee",
        "track_name": "Posing in Bondage"
      },
      {
        "artist_mbids": [
          "8c529495-91f5-4e2f-b71b-adcb66878d04"
        ],
        "artist_name": "Japanese Breakfast",
        "caa_id": 29955763885,
        "caa_release_mbid": "edceeb0b-c5dc-4508-a467-9ae0be4d6815",
        "listen_count": 8,
        "recording_mbid": "e94e4013-4236-4106-be51-1f37437936b6",
        "release_mbid": "edceeb0b-c5dc-4508-a467-9ae0be4d6815",
        "release_name": "Jubilee",
        "track_name": "Be Sweet"
      }
    ],
    "to_ts": 1696204800,
    "total_recording_count": 46,
    "user_id": "finallyworn"
  }
}
                        """;
        ListenFetcher lf = new ListenFetcher();
        ListenFetcherDto lfd = lf.getListenFetcherDto(jsonAsString);
        assertEquals(46, lfd.getTotalRecordingCount());
        assertEquals(2, lfd.getRecordings().size());
    }
}
