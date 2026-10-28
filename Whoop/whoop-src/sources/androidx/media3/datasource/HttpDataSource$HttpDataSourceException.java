package androidx.media3.datasource;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import live.hms.video.error.ErrorCodes;
import p460rg.AbstractC31375j;

/* JADX INFO: loaded from: classes5.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: x */
    public final int f6369x;

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.f6369x = 1;
    }

    /* JADX INFO: renamed from: b */
    public static HttpDataSource$HttpDataSourceException m5053b(IOException iOException, int i13) {
        int i14;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i14 = ErrorCodes.InitAPIErrors.cInvalidEndpointURL;
        } else if (iOException instanceof InterruptedIOException) {
            i14 = MessageListItemViewType.CUSTOM_ATTACHMENTS;
        } else {
            i14 = (message == null || !AbstractC31375j.m96499o(message).matches("cleartext.*not permitted.*")) ? ErrorCodes.InitAPIErrors.cConnectionLost : 2007;
        }
        return i14 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSource$HttpDataSourceException(iOException, i14, i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i13, int i14) {
        if (i13 == 2000 && i14 == 1) {
            i13 = ErrorCodes.InitAPIErrors.cConnectionLost;
        }
        super(i13, iOException);
        this.f6369x = i14;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i13) {
        super(iOException, str, i13 == 2000 ? ErrorCodes.InitAPIErrors.cConnectionLost : i13);
        this.f6369x = 1;
    }
}
