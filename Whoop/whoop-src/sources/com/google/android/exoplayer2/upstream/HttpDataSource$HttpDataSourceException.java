package com.google.android.exoplayer2.upstream;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import live.hms.video.error.ErrorCodes;
import p460rg.AbstractC31375j;

/* JADX INFO: loaded from: classes6.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i13, int i14) {
        if (i13 == 2000 && i14 == 1) {
            i13 = ErrorCodes.InitAPIErrors.cConnectionLost;
        }
        super(i13, iOException);
    }

    /* JADX INFO: renamed from: a */
    public static HttpDataSource$HttpDataSourceException m15582a(IOException iOException, int i13) {
        int i14;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i14 = ErrorCodes.InitAPIErrors.cInvalidEndpointURL;
        } else if (iOException instanceof InterruptedIOException) {
            i14 = MessageListItemViewType.CUSTOM_ATTACHMENTS;
        } else {
            i14 = (message == null || !AbstractC31375j.m96499o(message).matches("cleartext.*not permitted.*")) ? ErrorCodes.InitAPIErrors.cConnectionLost : 2007;
        }
        return i14 == 2007 ? new HttpDataSource$CleartextNotPermittedException(iOException, "Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", 2007) : new HttpDataSource$HttpDataSourceException(iOException, i14, i13);
    }
}
