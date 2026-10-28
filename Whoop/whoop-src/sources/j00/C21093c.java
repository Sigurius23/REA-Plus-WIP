package j00;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import c00.C3796b;
import n20.C26170e;
import p442qy.C30765d;
import p599wz.C37718g0;
import p631xz.C38747x;
import p665yz.C39899b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21093c implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final EnumC21096d0 f79976a;

    /* JADX INFO: renamed from: b */
    public final AbstractC21106i0 f79977b;

    /* JADX INFO: renamed from: c */
    public final Boolean f79978c;

    /* JADX INFO: renamed from: d */
    public final C26170e f79979d;

    public C21093c(EnumC21096d0 signupMode, AbstractC21106i0 abstractC21106i0, Boolean bool, C26170e linkComponent) {
        AbstractC22676k.m65750j(signupMode, "signupMode");
        AbstractC22676k.m65750j(linkComponent, "linkComponent");
        this.f79976a = signupMode;
        this.f79977b = abstractC21106i0;
        this.f79978c = bool;
        this.f79979d = linkComponent;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        C3796b c3796b;
        AbstractC22676k.m65750j(modelClass, "modelClass");
        C26170e c26170e = this.f79979d;
        switch (c26170e.f103756a) {
            case 0:
                c3796b = (C3796b) c26170e.f103762g.f151137w;
                break;
            case 1:
                c3796b = (C3796b) c26170e.f103762g.f151137w;
                break;
            case 2:
                c3796b = (C3796b) c26170e.f103762g.f151137w;
                break;
            default:
                c3796b = (C3796b) c26170e.f103762g.f151137w;
                break;
        }
        C21105i c21105i = c3796b.f15535a;
        return new C21103h(this.f79977b, this.f79976a, this.f79978c, (C37718g0) c21105i.f80039a.get(), (C38747x) c21105i.f80040b.get(), (C39899b) c21105i.f80041c.get(), (C30765d) c21105i.f80042d.get());
    }
}
