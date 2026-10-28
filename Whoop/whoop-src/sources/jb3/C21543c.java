package jb3;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30154o;
import r93.InterfaceC31117e;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.InterfaceC32307i;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import u93.AbstractC34710x;
import u93.C34682j;
import va3.C35850h;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: jb3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C21543c extends C34682j implements InterfaceC21542b {

    /* JADX INFO: renamed from: f0 */
    public final C30154o f82615f0;

    /* JADX INFO: renamed from: g0 */
    public final InterfaceC32332f f82616g0;

    /* JADX INFO: renamed from: h0 */
    public final C32334h f82617h0;

    /* JADX INFO: renamed from: i0 */
    public final C32336j f82618i0;

    /* JADX INFO: renamed from: j0 */
    public final InterfaceC21550j f82619j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21543c(InterfaceC31117e containingDeclaration, InterfaceC31132j interfaceC31132j, InterfaceC32307i annotations, boolean z4, int i13, C30154o proto, InterfaceC32332f nameResolver, C32334h typeTable, C32336j versionRequirementTable, InterfaceC21550j interfaceC21550j, InterfaceC31155s0 interfaceC31155s0) {
        super(containingDeclaration, interfaceC31132j, annotations, z4, i13, interfaceC31155s0 == null ? InterfaceC31155s0.f128370q : interfaceC31155s0);
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        AbstractC22676k.m65750j(versionRequirementTable, "versionRequirementTable");
        this.f82615f0 = proto;
        this.f82616g0 = nameResolver;
        this.f82617h0 = typeTable;
        this.f82618i0 = versionRequirementTable;
        this.f82619j0 = interfaceC21550j;
    }

    @Override // u93.C34682j, u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final /* bridge */ /* synthetic */ AbstractC34710x mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        return m60565a1(interfaceC31135k, interfaceC31162w, i13, interfaceC32307i, interfaceC31155s0);
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: R */
    public final InterfaceC37019v mo60564R() {
        return this.f82615f0;
    }

    @Override // u93.C34682j
    /* JADX INFO: renamed from: U0 */
    public final /* bridge */ /* synthetic */ C34682j mo48177L0(int i13, InterfaceC31135k interfaceC31135k, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        return m60565a1(interfaceC31135k, interfaceC31162w, i13, interfaceC32307i, interfaceC31155s0);
    }

    /* JADX INFO: renamed from: a1 */
    public final C21543c m60565a1(InterfaceC31135k newOwner, InterfaceC31162w interfaceC31162w, int i13, InterfaceC32307i annotations, InterfaceC31155s0 interfaceC31155s0) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(annotations, "annotations");
        C21543c c21543c = new C21543c((InterfaceC31117e) newOwner, (InterfaceC31132j) interfaceC31162w, annotations, this.f146080e0, i13, this.f82615f0, this.f82616g0, this.f82617h0, this.f82618i0, this.f82619j0, interfaceC31155s0);
        c21543c.f146209W = this.f146209W;
        return c21543c;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31168z
    public final boolean isExternal() {
        return false;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    public final boolean isInline() {
        return false;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    public final boolean isSuspend() {
        return false;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    /* JADX INFO: renamed from: q */
    public final boolean mo60566q() {
        return false;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: t */
    public final C32334h mo60567t() {
        return this.f82617h0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: w */
    public final InterfaceC32332f mo60568w() {
        return this.f82616g0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: x */
    public final InterfaceC21550j mo60569x() {
        return this.f82619j0;
    }
}
