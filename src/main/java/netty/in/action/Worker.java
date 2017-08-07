package netty.in.action;

/**
 * Created by spark on 17-7-31.
 */
public class Worker {
    public void doWork() {
        Fetcher fetcher = new MyFetcher(new Data(1, 0));
        fetcher.fetcherData(new FetcherCallBack() {
            public void onData(Data data) throws Exception {
                System.out.println("Data received..." + data);
            }

            public void onError(Throwable cause) {
                System.out.println();
            }
        });
    }
}
