package com.mapbox.common.module.okhttp;

import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.ResponseData;
import com.mapbox.common.experimental.wss_backend.WsOpCode;
import java.util.HashMap;
import java.util.Locale;
import ne3.C26616h;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ud3.AbstractC34814f1;
import ud3.C34807d0;
import ud3.C34850x0;
import ud3.InterfaceC34811e1;
import yb3.AbstractC39397a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 82\u00020\u0001:\u00018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0019J)\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;", "Lud3/f1;", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "requestObserver", "", "id", "<init>", "(Lcom/mapbox/common/experimental/wss_backend/RequestObserver;J)V", "Lud3/x0;", "response", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "generateOutputHeaders", "(Lud3/x0;)Ljava/util/HashMap;", "Lud3/e1;", "webSocket", "Ll83/a0;", "onOpen", "(Lud3/e1;Lud3/x0;)V", "Lne3/l;", "bytes", "onMessage", "(Lud3/e1;Lne3/l;)V", "text", "(Lud3/e1;Ljava/lang/String;)V", "", "t", "onFailure", "(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V", "", "code", "reason", "onClosed", "(Lud3/e1;ILjava/lang/String;)V", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "getRequestObserver", "()Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "J", "Lud3/e1;", "getWebSocket", "()Lud3/e1;", "setWebSocket", "(Lud3/e1;)V", "Lne3/h;", "buffer", "Lne3/h;", "getBuffer", "()Lne3/h;", "Lcom/mapbox/common/ResultCallback;", "onClosedCallback", "Lcom/mapbox/common/ResultCallback;", "getOnClosedCallback", "()Lcom/mapbox/common/ResultCallback;", "setOnClosedCallback", "(Lcom/mapbox/common/ResultCallback;)V", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
final class WebsocketObserverWrapper extends AbstractC34814f1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int websocketClosedNormalCode = 1000;
    private final C26616h buffer;
    private final long id;
    public ResultCallback onClosedCallback;
    private final RequestObserver requestObserver;
    public InterfaceC34811e1 webSocket;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;", "", "()V", "websocketClosedNormalCode", "", "getWebsocketClosedNormalCode", "()I", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWebsocketClosedNormalCode() {
            return WebsocketObserverWrapper.websocketClosedNormalCode;
        }

        private Companion() {
        }
    }

    public WebsocketObserverWrapper(RequestObserver requestObserver, long j7) {
        AbstractC22676k.m65750j(requestObserver, "requestObserver");
        this.requestObserver = requestObserver;
        this.id = j7;
        this.buffer = new C26616h();
    }

    private final HashMap<String, String> generateOutputHeaders(C34850x0 response) {
        HashMap<String, String> map = new HashMap<>();
        C34807d0 c34807d0 = response.f146777F;
        int size = c34807d0.size();
        for (int i13 = 0; i13 < size; i13++) {
            String lowerCase = c34807d0.m109864c(i13).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            map.put(lowerCase, c34807d0.m109867g(i13));
        }
        return map;
    }

    public final C26616h getBuffer() {
        return this.buffer;
    }

    public final ResultCallback getOnClosedCallback() {
        ResultCallback resultCallback = this.onClosedCallback;
        if (resultCallback != null) {
            return resultCallback;
        }
        AbstractC22676k.m65757q("onClosedCallback");
        throw null;
    }

    public final RequestObserver getRequestObserver() {
        return this.requestObserver;
    }

    public final InterfaceC34811e1 getWebSocket() {
        InterfaceC34811e1 interfaceC34811e1 = this.webSocket;
        if (interfaceC34811e1 != null) {
            return interfaceC34811e1;
        }
        AbstractC22676k.m65757q("webSocket");
        throw null;
    }

    @Override // ud3.AbstractC34814f1
    public void onClosed(InterfaceC34811e1 webSocket, int code, String reason) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(reason, "reason");
        try {
            if (this.onClosedCallback != null) {
                if (code == websocketClosedNormalCode) {
                    getOnClosedCallback().run(true);
                    return;
                } else {
                    getOnClosedCallback().run(false);
                    return;
                }
            }
            this.requestObserver.onFailed(this.id, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Unexpected socket closure: " + code + ' ' + reason), null);
        } catch (Throwable unused) {
        }
    }

    @Override // ud3.AbstractC34814f1
    public void onFailure(InterfaceC34811e1 webSocket, Throwable t14, C34850x0 response) {
        String message;
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(t14, "t");
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if ((response == null || (message = response.f146791y) == null) && (message = t14.getMessage()) == null) {
            message = "Unknown error";
        }
        this.requestObserver.onFailed(this.id, new HttpRequestError(httpRequestErrorType, message), response != null ? Integer.valueOf(response.f146792z) : null);
    }

    @Override // ud3.AbstractC34814f1
    public void onMessage(InterfaceC34811e1 webSocket, C26624l bytes) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(bytes, "bytes");
        this.buffer.m79217l1(bytes);
        this.requestObserver.onData(this.id, WsOpCode.BINARY, true);
    }

    @Override // ud3.AbstractC34814f1
    public void onOpen(InterfaceC34811e1 webSocket, C34850x0 response) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(response, "response");
        int i13 = response.f146792z;
        if (i13 == 101) {
            this.requestObserver.onSwitchingProtocols(this.id);
        }
        this.requestObserver.onResponse(this.id, new ResponseData(generateOutputHeaders(response), i13, new ResponseReadStream(this.buffer)));
    }

    public final void setOnClosedCallback(ResultCallback resultCallback) {
        AbstractC22676k.m65750j(resultCallback, "<set-?>");
        this.onClosedCallback = resultCallback;
    }

    public final void setWebSocket(InterfaceC34811e1 interfaceC34811e1) {
        AbstractC22676k.m65750j(interfaceC34811e1, "<set-?>");
        this.webSocket = interfaceC34811e1;
    }

    @Override // ud3.AbstractC34814f1
    public void onMessage(InterfaceC34811e1 webSocket, String text) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(text, "text");
        C26616h c26616h = this.buffer;
        byte[] bytes = text.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "this as java.lang.String).getBytes(charset)");
        c26616h.m134462write(bytes);
        this.requestObserver.onData(this.id, WsOpCode.TEXT, true);
    }
}
