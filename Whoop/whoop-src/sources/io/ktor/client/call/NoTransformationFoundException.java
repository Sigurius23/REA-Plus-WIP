package io.ktor.client.call;

import androidx.room.AbstractC1772c1;
import f63.AbstractC14155c;
import j93.InterfaceC21461d;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w53.C36846c;
import yb3.AbstractC39415s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "ktor-client-core"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class NoTransformationFoundException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: w */
    public final String f74969w;

    public NoTransformationFoundException(AbstractC14155c abstractC14155c, InterfaceC21461d from, InterfaceC21461d to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        this.f74969w = AbstractC39415s.m125910t("No transformation found: " + from + " -> " + to3 + "\n        |with response from " + abstractC14155c.mo13321a().m118139c().getUrl() + ":\n        |status: " + abstractC14155c.mo13325e() + "\n        |response headers: \n        |" + AbstractC25265s.m74110N0(AbstractC1772c1.m5400r(abstractC14155c.getHeaders()), null, null, null, C36846c.f157618w, 31) + "\n    ");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f74969w;
    }
}
