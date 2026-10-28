package com.mapbox.common.module.okhttp;

import com.mapbox.common.HttpMethod;
import com.mapbox.common.ReadStream;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import j93.InterfaceC21461d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34846v0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34844u0;
import zd3.C40571o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;", "Lcom/mapbox/common/module/HttpClientDetail;", "<init>", "()V", "", "max", "Ll83/a0;", "setMaxRequestsPerHost", "(B)V", "", "supportsKeepCompression", "()Z", "Lcom/mapbox/common/http_backend/Request;", "request", "", "Lcom/mapbox/common/module/RequestId;", "id", "Lcom/mapbox/common/http_backend/RequestObserver;", "requestObserver", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "Lcom/mapbox/common/module/RequestDetail;", "buildRequest", "(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;", "Ljava/util/concurrent/ExecutorService;", "executor", "()Ljava/util/concurrent/ExecutorService;", "Lcom/mapbox/common/module/okhttp/LazyClient;", "httpClient", "Lcom/mapbox/common/module/okhttp/LazyClient;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class OkHttpClientDetail implements HttpClientDetail {
    private final LazyClient httpClient = new LazyClient(null, false);

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long id4, RequestObserver requestObserver, Function1 onRequestFinished) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(requestObserver, "requestObserver");
        AbstractC22676k.m65750j(onRequestFinished, "onRequestFinished");
        C34830n0 c34830n0 = new C34830n0();
        String url = request.getUrl();
        AbstractC22676k.m65749i(url, "request.url");
        c34830n0.m109905f(url);
        String lowerCase = url.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        InterfaceC21461d type = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class);
        AbstractC22676k.m65750j(type, "type");
        c34830n0.f146691e = c34830n0.f146691e.mo113254k(type, lowerCase);
        HashMap<String, String> headers = request.getHeaders();
        AbstractC22676k.m65749i(headers, "request.headers");
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AbstractC22676k.m65749i(key, "key");
            AbstractC22676k.m65749i(value, "value");
            c34830n0.m109900a(key, value);
        }
        if ((request.getFlags() & 1) != 0) {
            c34830n0.m109900a("Accept-Encoding", "gzip, deflate");
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[request.getMethod().ordinal()];
        if (i13 == 1) {
            c34830n0.m109904e("HEAD", null);
        } else if (i13 == 2) {
            c34830n0.m109904e("GET", null);
        } else if (i13 == 3) {
            ReadStream body = request.getBody();
            if (body == null) {
                c34830n0.m109904e("POST", C34844u0.m109927d(AbstractC34846v0.Companion, new byte[0], null, 0, 7));
            } else {
                c34830n0.m109904e("POST", new StreamingRequestBody(body, null));
            }
        }
        C40571o c40571oM109898b = this.httpClient.get().m109898b(new C34832o0(c34830n0));
        c40571oM109898b.f174706F.mo79277g(request.getTimeout(), TimeUnit.SECONDS);
        return new OkHttpRequestDetail(c40571oM109898b, new CallbackWrapper(this, id4, c40571oM109898b, new HttpCallback(id4, requestObserver, onRequestFinished), onRequestFinished));
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public ExecutorService executor() {
        return this.httpClient.get().f146649a.m109920a();
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte max) {
        this.httpClient.setMaxRequestsPerHost(max);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return true;
    }
}
