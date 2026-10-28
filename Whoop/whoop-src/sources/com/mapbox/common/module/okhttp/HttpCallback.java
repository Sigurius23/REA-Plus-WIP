package com.mapbox.common.module.okhttp;

import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import live.hms.video.utils.HMSConstantsKt;
import ne3.C26616h;
import ne3.InterfaceC26620j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R(\u0010\n\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/HttpCallback;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;", "", "id", "Lcom/mapbox/common/http_backend/RequestObserver;", "observer", "Lkotlin/Function1;", "Lcom/mapbox/common/module/RequestId;", "Ll83/a0;", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "<init>", "(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V", "Lcom/mapbox/common/HttpRequestError;", "error", "onFailure", "(Lcom/mapbox/common/HttpRequestError;)V", "Lud3/j;", NotificationCompat.CATEGORY_CALL, "Lud3/x0;", "response", "onResponse", "(Lud3/j;Lud3/x0;)V", "J", "Lcom/mapbox/common/http_backend/RequestObserver;", "Lkotlin/jvm/functions/Function1;", "chunkSize", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class HttpCallback implements CallbackWrapper.RequestCallback {
    private final long chunkSize;
    private final long id;
    private final RequestObserver observer;
    private final Function1 onRequestFinished;

    public HttpCallback(long j7, RequestObserver observer, Function1 onRequestFinished) {
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(onRequestFinished, "onRequestFinished");
        this.id = j7;
        this.observer = observer;
        this.onRequestFinished = onRequestFinished;
        this.chunkSize = 65536L;
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onFailure(HttpRequestError error) {
        AbstractC22676k.m65750j(error, "error");
        this.observer.onFailed(this.id, error);
    }

    @Override // com.mapbox.common.module.okhttp.CallbackWrapper.RequestCallback
    public void onResponse(InterfaceC34821j call, C34850x0 response) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(response, "response");
        try {
            C26616h c26616h = new C26616h();
            this.observer.onResponse(this.id, new ResponseData(HttpCallbackKt.generateOutputHeaders(response), response.f146792z, new ResponseReadStream(c26616h)));
            AbstractC34799a1 abstractC34799a1 = response.f146778G;
            if (abstractC34799a1 != null) {
                try {
                    InterfaceC26620j interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1();
                    boolean z4 = false;
                    while (!z4) {
                        long j7 = 0;
                        do {
                            try {
                                long jMo9164h1 = interfaceC26620jMo1940d1.mo9164h1(c26616h, this.chunkSize - j7);
                                if (jMo9164h1 == -1) {
                                    z4 = true;
                                    break;
                                } else {
                                    j7 += jMo9164h1;
                                    if (jMo9164h1 != HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) {
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    AbstractC35854l.m113829i(interfaceC26620jMo1940d1, th3);
                                    throw th4;
                                }
                            }
                        } while (j7 < this.chunkSize);
                        if (j7 > 0) {
                            this.observer.onData(this.id);
                        }
                    }
                    AbstractC35854l.m113829i(interfaceC26620jMo1940d1, null);
                    abstractC34799a1.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC35854l.m113829i(abstractC34799a1, th5);
                        throw th6;
                    }
                }
            }
            this.observer.onSucceeded(this.id);
            this.onRequestFinished.invoke(Long.valueOf(this.id));
        } catch (Throwable th7) {
            this.onRequestFinished.invoke(Long.valueOf(this.id));
            throw th7;
        }
    }
}
