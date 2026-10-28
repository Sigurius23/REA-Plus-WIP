package com.mapbox.common.module.okhttp;

import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.experimental.wss_backend.Data;
import com.mapbox.common.experimental.wss_backend.Request;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.Service;
import com.mapbox.common.module.NetworkIdGenerator;
import io.getstream.chat.android.client.ChatClient;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import le3.C23886g;
import ne3.C26622k;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.InterfaceC34811e1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/WssBackend;", "Lcom/mapbox/common/experimental/wss_backend/Service;", "<init>", "()V", "", "pingTimeout", "Ll83/a0;", "setPingTimeout", "(J)V", "connectTimeout", "setConnectionTimeout", "Lcom/mapbox/common/experimental/wss_backend/Request;", "request", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "observer", "connect", "(Lcom/mapbox/common/experimental/wss_backend/Request;Lcom/mapbox/common/experimental/wss_backend/RequestObserver;)J", "id", "Lcom/mapbox/common/ResultCallback;", "callback", "cancelConnection", "(JLcom/mapbox/common/ResultCallback;)V", "Lcom/mapbox/common/experimental/wss_backend/Data;", "data", "write", "(JLcom/mapbox/common/experimental/wss_backend/Data;)V", "pingTimeoutMs", "J", "connectTimeoutMs", "Lud3/l0;", "wssClient", "Lud3/l0;", "", "Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;", "socketMap", "Ljava/util/Map;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class WssBackend implements Service {
    private Map<Long, WebsocketObserverWrapper> socketMap;
    private C34826l0 wssClient;
    private long pingTimeoutMs = 20000;
    private long connectTimeoutMs = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;

    public WssBackend() {
        C34824k0 c34824k0 = new C34824k0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c34824k0.m109892b(10L, timeUnit);
        c34824k0.m109893c(20L, timeUnit);
        this.wssClient = new C34826l0(c34824k0);
        this.socketMap = new LinkedHashMap();
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void cancelConnection(long id4, ResultCallback callback) {
        AbstractC22676k.m65750j(callback, "callback");
        if (!this.socketMap.containsKey(Long.valueOf(id4))) {
            try {
                callback.run(false);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        WebsocketObserverWrapper websocketObserverWrapper = this.socketMap.get(Long.valueOf(id4));
        AbstractC22676k.m65747g(websocketObserverWrapper);
        websocketObserverWrapper.setOnClosedCallback(callback);
        WebsocketObserverWrapper websocketObserverWrapper2 = this.socketMap.get(Long.valueOf(id4));
        AbstractC22676k.m65747g(websocketObserverWrapper2);
        ((C23886g) websocketObserverWrapper2.getWebSocket()).m70161b(WebsocketObserverWrapper.INSTANCE.getWebsocketClosedNormalCode(), "Closed by client");
        this.socketMap.remove(Long.valueOf(id4));
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public long connect(Request request, RequestObserver observer) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(observer, "observer");
        long jNewId = NetworkIdGenerator.INSTANCE.newId();
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109904e("GET", null);
        String url = request.getUrl();
        AbstractC22676k.m65749i(url, "request.url");
        c34830n0.m109905f(url);
        HashMap<String, String> headers = request.getHeaders();
        AbstractC22676k.m65749i(headers, "request.headers");
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC22676k.m65747g(key);
            AbstractC22676k.m65747g(value);
            c34830n0.m109900a(key, value);
        }
        WebsocketObserverWrapper websocketObserverWrapper = new WebsocketObserverWrapper(observer, jNewId);
        websocketObserverWrapper.setWebSocket(this.wssClient.m109899c(new C34832o0(c34830n0), websocketObserverWrapper));
        this.socketMap.put(Long.valueOf(jNewId), websocketObserverWrapper);
        return jNewId;
    }

    public final void setConnectionTimeout(long connectTimeout) {
        this.connectTimeoutMs = connectTimeout;
        C34824k0 c34824k0 = new C34824k0();
        long j7 = this.connectTimeoutMs;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34824k0.m109892b(j7, timeUnit);
        c34824k0.m109893c(this.pingTimeoutMs, timeUnit);
        this.wssClient = new C34826l0(c34824k0);
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void setPingTimeout(long pingTimeout) {
        this.pingTimeoutMs = pingTimeout;
        C34824k0 c34824k0 = new C34824k0();
        long j7 = this.connectTimeoutMs;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34824k0.m109892b(j7, timeUnit);
        c34824k0.m109893c(this.pingTimeoutMs, timeUnit);
        this.wssClient = new C34826l0(c34824k0);
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void write(long id4, Data data) {
        InterfaceC34811e1 webSocket;
        RequestObserver requestObserver;
        InterfaceC34811e1 webSocket2;
        AbstractC22676k.m65750j(data, "data");
        boolean zM70166h = false;
        if (data.isByteArray()) {
            WebsocketObserverWrapper websocketObserverWrapper = this.socketMap.get(Long.valueOf(id4));
            if (websocketObserverWrapper != null && (webSocket2 = websocketObserverWrapper.getWebSocket()) != null) {
                C26622k c26622k = C26624l.f105882z;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(data.getByteArray());
                AbstractC22676k.m65749i(byteBufferWrap, "wrap(data.byteArray)");
                byte[] bArr = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr);
                zM70166h = ((C23886g) webSocket2).m70165g(2, new C26624l(bArr));
            }
        } else {
            WebsocketObserverWrapper websocketObserverWrapper2 = this.socketMap.get(Long.valueOf(id4));
            if (websocketObserverWrapper2 != null && (webSocket = websocketObserverWrapper2.getWebSocket()) != null) {
                String string = data.getString();
                AbstractC22676k.m65749i(string, "data.string");
                zM70166h = ((C23886g) webSocket).m70166h(string);
            }
        }
        if (zM70166h) {
            return;
        }
        HttpRequestError httpRequestError = new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Message would overflow buffer or shutdown in progress");
        WebsocketObserverWrapper websocketObserverWrapper3 = this.socketMap.get(Long.valueOf(id4));
        if (websocketObserverWrapper3 == null || (requestObserver = websocketObserverWrapper3.getRequestObserver()) == null) {
            return;
        }
        requestObserver.onFailed(id4, httpRequestError, null);
    }
}
