package p161g;

import c93.InterfaceC4339a;
import m83.C25258m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g.y */
/* JADX INFO: loaded from: classes.dex */
public final class C14922y implements InterfaceC14896b {

    /* JADX INFO: renamed from: w */
    public final AbstractC14917t f55612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14923z f55613x;

    public C14922y(C14923z c14923z, AbstractC14917t onBackPressedCallback) {
        AbstractC22676k.m65750j(onBackPressedCallback, "onBackPressedCallback");
        this.f55613x = c14923z;
        this.f55612w = onBackPressedCallback;
    }

    @Override // p161g.InterfaceC14896b
    public final void cancel() {
        C14923z c14923z = this.f55613x;
        C25258m c25258m = c14923z.f55615b;
        AbstractC14917t abstractC14917t = this.f55612w;
        c25258m.remove(abstractC14917t);
        if (AbstractC22676k.m65745e(c14923z.f55616c, abstractC14917t)) {
            abstractC14917t.mo4072c();
            c14923z.f55616c = null;
        }
        abstractC14917t.m43012i(this);
        InterfaceC4339a interfaceC4339aM43009b = abstractC14917t.m43009b();
        if (interfaceC4339aM43009b != null) {
            interfaceC4339aM43009b.invoke();
        }
        abstractC14917t.m43014k(null);
    }
}
