package jb3;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30122c0;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.InterfaceC32307i;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import u93.AbstractC34710x;
import u93.C34697q0;
import va3.C35850h;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: jb3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C21560t extends C34697q0 implements InterfaceC21542b {

    /* JADX INFO: renamed from: e0 */
    public final C30122c0 f82685e0;

    /* JADX INFO: renamed from: f0 */
    public final InterfaceC32332f f82686f0;

    /* JADX INFO: renamed from: g0 */
    public final C32334h f82687g0;

    /* JADX INFO: renamed from: h0 */
    public final C32336j f82688h0;

    /* JADX INFO: renamed from: i0 */
    public final InterfaceC21550j f82689i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21560t(InterfaceC31135k containingDeclaration, C34697q0 c34697q0, InterfaceC32307i annotations, C35850h c35850h, int i13, C30122c0 proto, InterfaceC32332f nameResolver, C32334h typeTable, C32336j versionRequirementTable, InterfaceC21550j interfaceC21550j, InterfaceC31155s0 interfaceC31155s0) {
        super(containingDeclaration, c34697q0, annotations, c35850h, i13, interfaceC31155s0 == null ? InterfaceC31155s0.f128370q : interfaceC31155s0);
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        AbstractC22676k.m65750j(versionRequirementTable, "versionRequirementTable");
        this.f82685e0 = proto;
        this.f82686f0 = nameResolver;
        this.f82687g0 = typeTable;
        this.f82688h0 = versionRequirementTable;
        this.f82689i0 = interfaceC21550j;
    }

    @Override // u93.C34697q0, u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final AbstractC34710x mo48177L0(int i13, InterfaceC31135k newOwner, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i annotations, C35850h c35850h) {
        C35850h c35850h2;
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(annotations, "annotations");
        C34697q0 c34697q0 = (C34697q0) interfaceC31162w;
        if (c35850h == null) {
            C35850h name = getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            c35850h2 = name;
        } else {
            c35850h2 = c35850h;
        }
        C21560t c21560t = new C21560t(newOwner, c34697q0, annotations, c35850h2, i13, this.f82685e0, this.f82686f0, this.f82687g0, this.f82688h0, this.f82689i0, interfaceC31155s0);
        c21560t.f146209W = this.f146209W;
        return c21560t;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: R */
    public final InterfaceC37019v mo60564R() {
        return this.f82685e0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: t */
    public final C32334h mo60567t() {
        return this.f82687g0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: w */
    public final InterfaceC32332f mo60568w() {
        return this.f82686f0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: x */
    public final InterfaceC21550j mo60569x() {
        return this.f82689i0;
    }
}
