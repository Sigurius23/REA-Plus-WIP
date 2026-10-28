package p034bl;

import p684zk.C40787l;
import p684zk.InterfaceC40801z;
import tl.C33909h;

/* JADX INFO: renamed from: bl.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3365e extends C33909h {

    /* JADX INFO: renamed from: d */
    public C40787l f13109d;

    @Override // tl.C33909h
    /* JADX INFO: renamed from: b */
    public final int mo9716b(Object obj) {
        InterfaceC40801z interfaceC40801z = (InterfaceC40801z) obj;
        if (interfaceC40801z == null) {
            return 1;
        }
        return interfaceC40801z.getSize();
    }

    @Override // tl.C33909h
    /* JADX INFO: renamed from: c */
    public final void mo9717c(Object obj, Object obj2) {
        InterfaceC40801z interfaceC40801z = (InterfaceC40801z) obj2;
        C40787l c40787l = this.f13109d;
        if (c40787l == null || interfaceC40801z == null) {
            return;
        }
        c40787l.f175901e.m9002m(interfaceC40801z, true);
    }
}
