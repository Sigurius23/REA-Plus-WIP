package com.mapbox.common.module.okhttp;

import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import zd3.C40571o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001a\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R(\u0010\u000e\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "Lud3/k;", "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", NotificationCompat.CATEGORY_SERVICE, "", "id", "Lud3/j;", NotificationCompat.CATEGORY_CALL, "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "callback", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "Ll83/a0;", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;JLud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lud3/j;Ljava/io/IOException;)V", "Lud3/x0;", "response", "onResponse", "(Lud3/j;Lud3/x0;)V", "cancel", "()V", "Lcom/mapbox/common/HttpRequestError;", "error", "(Lcom/mapbox/common/HttpRequestError;)V", "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "J", "Lud3/j;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "Lkotlin/jvm/functions/Function1;", "requestError", "Lcom/mapbox/common/HttpRequestError;", "RequestCallback", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CallbackWrapper implements InterfaceC34823k {
    private final InterfaceC34821j call;
    private final RequestCallback callback;
    private final long id;
    private final Function1 onRequestFinished;
    private HttpRequestError requestError;
    private final OkHttpClientDetail service;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "", "Lcom/mapbox/common/HttpRequestError;", "error", "Ll83/a0;", "onFailure", "(Lcom/mapbox/common/HttpRequestError;)V", "Lud3/j;", NotificationCompat.CATEGORY_CALL, "Lud3/x0;", "response", "onResponse", "(Lud3/j;Lud3/x0;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public interface RequestCallback {
        void onFailure(HttpRequestError error);

        void onResponse(InterfaceC34821j call, C34850x0 response) throws IOException;
    }

    public CallbackWrapper(OkHttpClientDetail service, long j7, InterfaceC34821j call, RequestCallback callback, Function1 onRequestFinished) {
        AbstractC22676k.m65750j(service, "service");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC22676k.m65750j(onRequestFinished, "onRequestFinished");
        this.service = service;
        this.id = j7;
        this.call = call;
        this.callback = callback;
        this.onRequestFinished = onRequestFinished;
    }

    public final void cancel() {
        this.requestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, "Request cancelled");
        ((C40571o) this.call).cancel();
    }

    @Override // ud3.InterfaceC34823k
    public void onFailure(InterfaceC34821j call, IOException e5) {
        HttpRequestError httpRequestError;
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(e5, "e");
        if (!((C40571o) call).f174718R || (httpRequestError = this.requestError) == null) {
            HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
            if (e5 instanceof UnknownHostException ? true : e5 instanceof SSLException ? true : e5 instanceof UnknownServiceException ? true : e5 instanceof SocketException ? true : e5 instanceof ProtocolException) {
                httpRequestErrorType = HttpRequestErrorType.CONNECTION_ERROR;
            } else if (e5 instanceof InterruptedIOException) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            }
            this.callback.onFailure(new HttpRequestError(httpRequestErrorType, String.valueOf(e5.getMessage())));
        } else {
            this.callback.onFailure(httpRequestError);
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // ud3.InterfaceC34823k
    public void onResponse(InterfaceC34821j call, C34850x0 response) throws IOException {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        try {
            this.callback.onResponse(call, response);
        } catch (IOException e5) {
            onFailure(call, e5);
        } catch (Exception e13) {
            this.callback.onFailure(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(e13.getMessage())));
        }
    }

    public final void cancel(HttpRequestError error) {
        this.requestError = error;
        ((C40571o) this.call).cancel();
    }
}
