import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.List;

public class RecordingDto {
    @JsonProperty("artist_mbids")
    private List<String> artistMbids;
    @JsonProperty("artist_name")
    private String artistName;
    @JsonProperty("caa_id")
    private BigInteger caaId;
    @JsonProperty("caa_release_mbid")
    private String caaReleaseMbid;
    @JsonProperty("listen_count")
    private int listenCount;
    @JsonProperty("recording_mbid")
    private String recordingMbid;
    @JsonProperty("release_mbid")
    private String releaseMbid;
    @JsonProperty("release_name")
    private String releaseName;
    @JsonProperty("track_name")
    private String trackName;

    public List<String> getArtistMbids() {
        return artistMbids;
    }

    public String getArtistName() {
        return artistName;
    }

    public BigInteger getCaaId() {
        return caaId;
    }

    public String getCaaReleaseMbid() {
        return caaReleaseMbid;
    }

    public int getListenCount() {
        return listenCount;
    }

    public String getRecordingMbid() {
        return recordingMbid;
    }

    public String getReleaseMbid() {
        return releaseMbid;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public String getTrackName() {
        return trackName;
    }
}
