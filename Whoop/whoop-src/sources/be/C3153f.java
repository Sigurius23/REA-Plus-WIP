package be;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import bi.AbstractC3269g;
import gm.C15990r;
import p091dg.C12002a;
import p326mf.C25500t;
import p459rf.C31341l;
import p522uf.InterfaceC34879h;
import p715kotlin.jvm.internal.AbstractC22676k;
import wf.C37236a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: be.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C3153f implements InterfaceC34879h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C15990r f12343a;

    public C3153f(C15990r c15990r) {
        this.f12343a = c15990r;
    }

    @Override // p522uf.InterfaceC34879h
    /* JADX INFO: renamed from: a */
    public final Object mo9053a(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C37236a c37236a = call.f128964x;
        this.f12343a.mo394s(null, new C3152e(call, 0));
        C25500t c25500t = c37236a.f159235a;
        if (!AbstractC3269g.m9483L(c25500t)) {
            throw new EC2MetadataError(c25500t, "error retrieving instance metadata: ".concat(c25500t.f99857b));
        }
        AbstractC22676k.m65747g(bArr);
        return AbstractC39421y.m125916A(bArr);
    }
}
