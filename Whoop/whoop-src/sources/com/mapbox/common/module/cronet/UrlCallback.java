package com.mapbox.common.module.cronet;

import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.NetworkUsageMetricsMeter;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import io.getstream.chat.android.models.MessageType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import m83.AbstractC25247g0;
import ne3.C26616h;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010!\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010\u001eJ-\u0010&\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b(\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R(\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lcom/mapbox/common/module/cronet/UrlCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "", "id", "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "Ll83/a0;", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V", "Lorg/chromium/net/UrlRequest;", "request", "Lkotlin/Function0;", "callback", "runObserverCallbackSynchronously", "(Lorg/chromium/net/UrlRequest;Lc93/a;)V", "Lcom/mapbox/common/HttpRequestError;", "reason", "setCancelReason", "(Lcom/mapbox/common/HttpRequestError;)V", "Lorg/chromium/net/UrlResponseInfo;", "info", "", "newLocationUrl", "onRedirectReceived", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V", "onResponseStarted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V", "Ljava/nio/ByteBuffer;", "byteBuffer", "onReadCompleted", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V", "onSucceeded", "Lorg/chromium/net/CronetException;", "exception", "onFailed", "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V", "onCanceled", "J", "Lcom/mapbox/common/http_backend/RequestObserver;", "Lkotlin/jvm/functions/Function1;", "", "chunkSize", "I", "", MessageType.FAILED, "Z", "Lne3/h;", "intermediateBuffer", "Lne3/h;", "Ljava/util/concurrent/atomic/AtomicReference;", "cancelReason", "Ljava/util/concurrent/atomic/AtomicReference;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class UrlCallback extends UrlRequest.Callback {
    private AtomicReference<HttpRequestError> cancelReason;
    private final int chunkSize;
    private boolean failed;
    private final long id;
    private final C26616h intermediateBuffer;
    private final RequestObserver observer;
    private final Function1 onRequestFinished;

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onCanceled$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54471 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ HttpRequestError $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54471(HttpRequestError httpRequestError) {
            super(0);
            this.$reason = httpRequestError;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134076invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134076invoke() {
            UrlCallback.this.failed = true;
            UrlCallback.this.observer.onFailed(UrlCallback.this.id, this.$reason);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onFailed$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54481 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ HttpRequestError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54481(HttpRequestError httpRequestError) {
            super(0);
            this.$error = httpRequestError;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134077invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134077invoke() {
            UrlCallback.this.failed = true;
            UrlCallback.this.observer.onFailed(UrlCallback.this.id, this.$error);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onReadCompleted$2 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54492 extends AbstractC22680m implements InterfaceC4339a {
        public C54492() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134078invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134078invoke() {
            UrlCallback.this.observer.onData(UrlCallback.this.id);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onResponseStarted$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54501 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ HashMap<String, String> $headers;
        final /* synthetic */ UrlResponseInfo $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54501(HashMap<String, String> map, UrlResponseInfo urlResponseInfo) {
            super(0);
            this.$headers = map;
            this.$info = urlResponseInfo;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134079invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134079invoke() {
            UrlCallback.this.observer.onResponse(UrlCallback.this.id, new ResponseData(this.$headers, this.$info.getHttpStatusCode(), new ResponseReadStream(UrlCallback.this.intermediateBuffer)));
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.UrlCallback$onSucceeded$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54511 extends AbstractC22680m implements InterfaceC4339a {
        public C54511() {
            super(0);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134080invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134080invoke() {
            UrlCallback.this.observer.onSucceeded(UrlCallback.this.id);
        }
    }

    public UrlCallback(long j7, RequestObserver observer, Function1 onRequestFinished) {
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(onRequestFinished, "onRequestFinished");
        this.id = j7;
        this.observer = observer;
        this.onRequestFinished = onRequestFinished;
        this.chunkSize = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        this.intermediateBuffer = new C26616h();
        this.cancelReason = new AtomicReference<>(null);
    }

    private final void runObserverCallbackSynchronously(UrlRequest request, InterfaceC4339a callback) {
        try {
            synchronized (this) {
                if (!this.failed) {
                    callback.invoke();
                }
            }
        } catch (Exception e5) {
            if (request != null ? request.isDone() : false) {
                return;
            }
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, AbstractC2875y.m8297j(e5, "Exception during callback: ")));
            if (request != null) {
                request.cancel();
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest request, UrlResponseInfo info) {
        HttpRequestError httpRequestError = this.cancelReason.get();
        if (httpRequestError == null) {
            httpRequestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, "Request cancelled");
        }
        runObserverCallbackSynchronously(request, new C54471(httpRequestError));
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException exception) {
        String message;
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if (exception instanceof NetworkException) {
            HttpRequestErrorType httpRequestErrorType2 = HttpRequestErrorType.CONNECTION_ERROR;
            int errorCode = ((NetworkException) exception).getErrorCode();
            if (errorCode == 4 || errorCode == 6) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            } else if (errorCode != 11) {
                httpRequestErrorType = httpRequestErrorType2;
            }
        }
        if (exception == null) {
            message = "No info";
        } else {
            message = exception.getMessage();
            if (message == null) {
                message = "Exception of type ".concat(exception.getClass().getSimpleName());
            }
            if (message == null) {
                message = "No info";
            }
        }
        runObserverCallbackSynchronously(request, new C54481(new HttpRequestError(httpRequestErrorType, "Couldn't connect to server: ".concat(message))));
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
        int i13;
        int iWrite;
        AbstractC22676k.m65747g(byteBuffer);
        byteBuffer.flip();
        try {
            synchronized (this) {
                i13 = 0;
                do {
                    iWrite = this.intermediateBuffer.write(byteBuffer);
                    i13 += iWrite;
                } while (iWrite > 0);
            }
            byteBuffer.clear();
            AbstractC22676k.m65747g(request);
            request.read(byteBuffer);
            if (i13 > 0) {
                runObserverCallbackSynchronously(request, new C54492());
            }
        } catch (IOException e5) {
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Error reading network buffer: " + e5));
            if (request != null) {
                request.cancel();
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) {
        if (request != null) {
            request.followRedirect();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
        if (request == null || info == null) {
            if (request != null) {
                request.cancel();
                return;
            }
            return;
        }
        Map<String, List<String>> allHeaders = info.getAllHeaders();
        AbstractC22676k.m65749i(allHeaders, "info.allHeaders");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : allHeaders.entrySet()) {
            if (entry.getValue().size() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            AbstractC22676k.m65749i(key, "it.key");
            String lowerCase = ((String) key).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), (String) ((List) entry3.getValue()).get(0));
        }
        HashMap map = new HashMap(linkedHashMap3);
        NetworkUsageMetricsMeter.onHttpCodeReceived(info.getHttpStatusCode());
        runObserverCallbackSynchronously(request, new C54501(map, info));
        request.read(ByteBuffer.allocateDirect(this.chunkSize));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest request, UrlResponseInfo info) {
        runObserverCallbackSynchronously(request, new C54511());
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    public final void setCancelReason(HttpRequestError reason) {
        AbstractC22676k.m65750j(reason, "reason");
        this.cancelReason.set(reason);
    }
}
