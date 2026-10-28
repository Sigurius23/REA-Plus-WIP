package io.sentry.okhttp;

import io.sentry.C20315e;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.okhttp.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20451c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76548w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20315e f76549x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20451c(C20315e c20315e, int i13) {
        super(1);
        this.f76548w = i13;
        this.f76549x = c20315e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f76548w) {
            case 0:
                this.f76549x.m56470c(Long.valueOf(((Number) obj).longValue()), "http.request_content_length");
                break;
            default:
                this.f76549x.m56470c(Long.valueOf(((Number) obj).longValue()), "http.response_content_length");
                break;
        }
        return C23454a0.f92919a;
    }
}
