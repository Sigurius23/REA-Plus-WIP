package e63;

import i63.C18182u;
import i63.C18183v;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30005a;
import q63.C30006b;
import q83.InterfaceC30063j;
import z53.C40116h;

/* JADX INFO: renamed from: e63.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C12778g {

    /* JADX INFO: renamed from: a */
    public final C18183v f43734a;

    /* JADX INFO: renamed from: b */
    public final C30006b f43735b;

    /* JADX INFO: renamed from: c */
    public final C40116h f43736c;

    /* JADX INFO: renamed from: d */
    public final C18182u f43737d;

    /* JADX INFO: renamed from: e */
    public final Object f43738e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC30063j f43739f;

    /* JADX INFO: renamed from: g */
    public final C30006b f43740g;

    public C12778g(C18183v c18183v, C30006b requestTime, C40116h c40116h, C18182u version, Object body, InterfaceC30063j callContext) {
        AbstractC22676k.m65750j(requestTime, "requestTime");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(callContext, "callContext");
        this.f43734a = c18183v;
        this.f43735b = requestTime;
        this.f43736c = c40116h;
        this.f43737d = version;
        this.f43738e = body;
        this.f43739f = callContext;
        this.f43740g = AbstractC30005a.m91825a(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f43734a + ')';
    }
}
