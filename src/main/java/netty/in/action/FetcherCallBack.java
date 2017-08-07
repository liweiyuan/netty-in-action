package netty.in.action;

/**
 * Created by spark on 17-7-31.
 */
public interface FetcherCallBack {
    void onData(Data data) throws Exception;
    void onError(Throwable cause);
}
