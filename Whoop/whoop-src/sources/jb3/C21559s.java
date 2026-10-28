package jb3;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30146k0;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import sa3.AbstractC32330d;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import u93.C34689m0;
import va3.C35850h;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: jb3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C21559s extends C34689m0 implements InterfaceC21542b {

    /* JADX INFO: renamed from: b0 */
    public final C30146k0 f82680b0;

    /* JADX INFO: renamed from: c0 */
    public final InterfaceC32332f f82681c0;

    /* JADX INFO: renamed from: d0 */
    public final C32334h f82682d0;

    /* JADX INFO: renamed from: e0 */
    public final C32336j f82683e0;

    /* JADX INFO: renamed from: f0 */
    public final InterfaceC21550j f82684f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21559s(InterfaceC31135k containingDeclaration, InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i annotations, EnumC31106a0 modality, AbstractC31152r visibility, boolean z4, C35850h name, int i13, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, C30146k0 proto, InterfaceC32332f nameResolver, C32334h typeTable, C32336j versionRequirementTable, InterfaceC21550j interfaceC21550j) {
        super(containingDeclaration, interfaceC31145n0, annotations, modality, visibility, z4, name, i13, InterfaceC31155s0.f128370q, z13, z14, z17, z15, z16);
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(modality, "modality");
        AbstractC22676k.m65750j(visibility, "visibility");
        AbstractC22676k.m65750j(name, "name");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        AbstractC22676k.m65750j(versionRequirementTable, "versionRequirementTable");
        this.f82680b0 = proto;
        this.f82681c0 = nameResolver;
        this.f82682d0 = typeTable;
        this.f82683e0 = versionRequirementTable;
        this.f82684f0 = interfaceC21550j;
    }

    @Override // u93.C34689m0
    /* JADX INFO: renamed from: L0 */
    public final C34689m0 mo48188L0(InterfaceC31135k newOwner, EnumC31106a0 newModality, AbstractC31152r newVisibility, InterfaceC31145n0 interfaceC31145n0, int i13, C35850h newName) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC22676k.m65750j(newModality, "newModality");
        AbstractC22676k.m65750j(newVisibility, "newVisibility");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(newName, "newName");
        return new C21559s(newOwner, interfaceC31145n0, getAnnotations(), newModality, newVisibility, this.f146111G, newName, i13, this.f146119O, this.f146120P, isExternal(), this.f146123S, this.f146121Q, this.f82680b0, this.f82681c0, this.f82682d0, this.f82683e0, this.f82684f0);
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: R */
    public final InterfaceC37019v mo60564R() {
        return this.f82680b0;
    }

    @Override // u93.C34689m0, r93.InterfaceC31168z
    public final boolean isExternal() {
        return AbstractC32330d.f133789E.mo91233e(this.f82680b0.f123332z).booleanValue();
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: t */
    public final C32334h mo60567t() {
        return this.f82682d0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: w */
    public final InterfaceC32332f mo60568w() {
        return this.f82681c0;
    }

    @Override // jb3.InterfaceC21551k
    /* JADX INFO: renamed from: x */
    public final InterfaceC21550j mo60569x() {
        return this.f82684f0;
    }
}
