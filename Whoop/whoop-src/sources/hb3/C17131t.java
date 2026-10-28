package hb3;

import c93.InterfaceC4339a;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import qa3.C30146k0;
import r93.InterfaceC31135k;

/* JADX INFO: renamed from: hb3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C17131t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final C17135x f65784w;

    /* JADX INFO: renamed from: x */
    public final boolean f65785x;

    /* JADX INFO: renamed from: y */
    public final C30146k0 f65786y;

    public C17131t(C17135x c17135x, boolean z4, C30146k0 c30146k0) {
        this.f65784w = c17135x;
        this.f65785x = z4;
        this.f65786y = c30146k0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        List listM74093D1;
        C17135x c17135x = this.f65784w;
        C17122k c17122k = c17135x.f65803a;
        InterfaceC31135k interfaceC31135k = c17122k.f65762c;
        InterfaceC17103a interfaceC17103a = c17122k.f65760a.f65739e;
        AbstractC17104a0 abstractC17104a0M48373a = c17135x.m48373a(interfaceC31135k);
        if (abstractC17104a0M48373a != null) {
            boolean z4 = this.f65785x;
            C30146k0 c30146k0 = this.f65786y;
            listM74093D1 = z4 ? AbstractC25265s.m74093D1(interfaceC17103a.mo16003c(abstractC17104a0M48373a, c30146k0)) : AbstractC25265s.m74093D1(interfaceC17103a.mo16005e(abstractC17104a0M48373a, c30146k0));
        } else {
            listM74093D1 = null;
        }
        return listM74093D1 == null ? C25271y.f99162w : listM74093D1;
    }
}
