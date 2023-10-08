import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ListenFetcherDto {
    @JsonProperty("count")
    private int count;
    @JsonProperty("from_ts")
    private int fromTs;
    @JsonProperty("last_updated")
    private int lastUpdated;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("range")
    private String range;
    @JsonProperty("recordings")
    private List<RecordingDto> recordings;
    @JsonProperty("to_ts")
    private int toTs;
    @JsonProperty("total_recording_count")
    private int totalRecordingCount;
    @JsonProperty("user_id")
    private String userId;

    public int getCount() {
        return count;
    }

    public int getFromTs() {
        return fromTs;
    }

    public int getLastUpdated() {
        return lastUpdated;
    }

    public int getOffset() {
        return offset;
    }

    public String getRange() {
        return range;
    }

    public List<RecordingDto> getRecordings() {
        return recordings;
    }

    public int getToTs() {
        return toTs;
    }

    public int getTotalRecordingCount() {
        return totalRecordingCount;
    }

    public String getUserId() {
        return userId;
    }
}
