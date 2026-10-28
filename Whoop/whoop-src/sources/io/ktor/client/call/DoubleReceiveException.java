package io.ktor.client.call;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w53.C36845b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/client/call/DoubleReceiveException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class DoubleReceiveException extends IllegalStateException {

    /* JADX INFO: renamed from: w */
    public final String f74968w;

    public DoubleReceiveException(C36845b call) {
        AbstractC22676k.m65750j(call, "call");
        this.f74968w = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f74968w;
    }
}
