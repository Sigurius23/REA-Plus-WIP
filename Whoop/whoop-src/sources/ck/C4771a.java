package ck;

import fj.C14525a;
import fj.C14526b;
import p005a3.C0237p;
import p173gj.C15903d;
import p255jk.C21743a;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p692zt.C41113q;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ck.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4771a implements InterfaceC22536e {

    /* JADX INFO: renamed from: w */
    public C14525a f19659w;

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: a */
    public final C21743a mo15042a(C21743a c21743a) {
        return null;
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        String str = c15903d.f60128a.f60156e;
        Object obj = C14525a.f53072c;
        C14525a c14525aM92135z = AbstractC30060g.m92135z(str);
        this.f19659w = c14525aM92135z;
        C41113q c41113q = c14525aM92135z.f53074a;
        C0237p c0237p = c15903d.f60129b;
        c41113q.m133456H(new C14526b((String) c0237p.f812x, (String) c0237p.f813y, 4));
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        return EnumC22535d.f88571E;
    }
}
