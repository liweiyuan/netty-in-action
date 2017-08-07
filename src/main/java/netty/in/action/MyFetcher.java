package netty.in.action;

/**
 * Created by spark on 17-7-31.
 */
public class MyFetcher implements Fetcher {
    final Data data;

    public MyFetcher(Data data) {
        this.data = data;
    }

    public void fetcherData(FetcherCallBack fetcherCallback) {
        try {
            fetcherCallback.onData(data);
        } catch (Exception e) {
            fetcherCallback.onError(e);
        }
    }
}
