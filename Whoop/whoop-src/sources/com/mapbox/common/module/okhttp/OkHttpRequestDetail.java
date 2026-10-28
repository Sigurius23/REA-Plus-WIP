package com.mapbox.common.module.okhttp;

import androidx.core.app.NotificationCompat;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.module.RequestDetail;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.InterfaceC34821j;
import zd3.C40571o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;", "Lcom/mapbox/common/module/RequestDetail;", "Lud3/j;", NotificationCompat.CATEGORY_CALL, "Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "callback", "<init>", "(Lud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper;)V", "Ll83/a0;", "start", "()V", "Lcom/mapbox/common/HttpRequestError;", "error", "cancel", "(Lcom/mapbox/common/HttpRequestError;)V", "Lud3/j;", "getCall", "()Lud3/j;", "Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "getCallback", "()Lcom/mapbox/common/module/okhttp/CallbackWrapper;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class OkHttpRequestDetail implements RequestDetail {
    private final InterfaceC34821j call;
    private final CallbackWrapper callback;

    public OkHttpRequestDetail(InterfaceC34821j call, CallbackWrapper callback) {
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(callback, "callback");
        this.call = call;
        this.callback = callback;
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void cancel(HttpRequestError error) {
        if (error == null) {
            this.callback.cancel();
        } else {
            this.callback.cancel(error);
        }
    }

    public final InterfaceC34821j getCall() {
        return this.call;
    }

    public final CallbackWrapper getCallback() {
        return this.callback;
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void start() {
        ((C40571o) this.call).m131548d(this.callback);
    }
}
