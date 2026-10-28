package nb3;

import ih0.AbstractC18489d0;
import java.util.Collection;
import la.C23548b;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31146o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.C31148p;
import r93.EnumC31106a0;
import r93.InterfaceC31105a;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31160v;
import r93.InterfaceC31162w;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34710x;
import u93.C34697q0;
import va3.C35850h;

/* JADX INFO: renamed from: nb3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C26546c extends C34697q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26546c(InterfaceC31117e containingDeclaration) {
        super(containingDeclaration, null, C32305g.f133684a, C35850h.m113816g("<Error function>"), 1, InterfaceC31155s0.f128370q);
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        EnumC26545b[] enumC26545bArr = EnumC26545b.f105507w;
        C26552i c26552iM78682c = C26555l.m78682c(EnumC26554k.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        EnumC31106a0 enumC31106a0 = EnumC31106a0.f128312z;
        C31148p c31148p = AbstractC31150q.f128353e;
        C25271y c25271y = C25271y.f99162w;
        mo109605O0(null, null, c25271y, c25271y, c25271y, c26552iM78682c, enumC31106a0, c31148p);
    }

    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: K0 */
    public final C34697q0 mo78655a0(InterfaceC31135k newOwner, EnumC31106a0 enumC31106a0, AbstractC31152r visibility) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC22676k.m65750j(visibility, "visibility");
        AbstractC18489d0.m53382w(2, "kind");
        return this;
    }

    @Override // u93.C34697q0, u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final AbstractC34710x mo48177L0(int i13, InterfaceC31135k newOwner, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i annotations, C35850h c35850h) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(annotations, "annotations");
        return this;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31111c
    /* JADX INFO: renamed from: a0 */
    public final /* bridge */ /* synthetic */ InterfaceC31111c mo78655a0(InterfaceC31117e interfaceC31117e, EnumC31106a0 enumC31106a0, AbstractC31146o abstractC31146o) {
        mo78655a0(interfaceC31117e, enumC31106a0, abstractC31146o);
        return this;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31111c
    /* JADX INFO: renamed from: g0 */
    public final void mo78656g0(Collection overriddenDescriptors) {
        AbstractC22676k.m65750j(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31108b
    /* JADX INFO: renamed from: h0 */
    public final Object mo48190h0(InterfaceC31105a interfaceC31105a) {
        return null;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    public final boolean isSuspend() {
        return false;
    }

    @Override // u93.C34697q0, u93.AbstractC34710x, r93.InterfaceC31162w
    /* JADX INFO: renamed from: l0 */
    public final InterfaceC31160v mo78657l0() {
        return new C23548b(this, 16);
    }
}
