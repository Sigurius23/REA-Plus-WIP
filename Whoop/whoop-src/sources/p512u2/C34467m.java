package p512u2;

import p005a3.AbstractC0201g;
import p027b3.AbstractC2453v1;
import p027b3.C2407m0;
import p027b3.C2461x;

/* JADX INFO: renamed from: u2.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C34467m extends AbstractC34455e {
    @Override // p512u2.AbstractC34455e
    /* JADX INFO: renamed from: Y0 */
    public final void mo108896Y0(InterfaceC34469o interfaceC34469o) {
        InterfaceC34470p interfaceC34470p = (InterfaceC34470p) AbstractC0201g.m506f(this, AbstractC2453v1.f9582u);
        if (interfaceC34470p != null) {
            C2461x c2461x = (C2461x) interfaceC34470p;
            if (interfaceC34469o == null) {
                InterfaceC34469o.f144811a.getClass();
                interfaceC34469o = AbstractC34471q.f144812a;
            }
            C2407m0.f9462a.m7404a(c2461x.f9609b, interfaceC34469o);
        }
    }

    @Override // p512u2.AbstractC34455e
    /* JADX INFO: renamed from: a1 */
    public final boolean mo108897a1(int i13) {
        return (i13 == 3 || i13 == 4) ? false : true;
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo276f() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
