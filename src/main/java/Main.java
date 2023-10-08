
public class Main {
    public static void main(String args[]) throws Exception {
        ListenFetcher lf = new ListenFetcher(args[0]);
        String json = lf.getListenStats();
        ListenFetcherDto lfd = lf.getListenFetcherDto(json);
        System.out.println("| | Artist | Title | Album | Plays |");
        System.out.println("|-|--------|-------|-------|-------|");
        int i = 1;
        for (RecordingDto recording : lfd.getRecordings()) {
            System.out.println(
                    String.format(
                            "| %s | %s | %s | %s | %s |", i, recording.getArtistName(), recording.getTrackName(), recording.getReleaseName(), recording.getListenCount()
                    )
            );
            i++;
            if (i > 10) break;
        }
    }
}
