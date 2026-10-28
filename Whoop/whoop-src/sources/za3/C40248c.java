package za3;

import java.util.Collection;
import java.util.List;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.EnumC23776g1;
import m83.C25271y;
import mb3.C25392i;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: za3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C40248c implements InterfaceC40247b {

    /* JADX INFO: renamed from: w */
    public final AbstractC23804u0 f174039w;

    /* JADX INFO: renamed from: x */
    public C25392i f174040x;

    public C40248c(AbstractC23804u0 projection) {
        AbstractC22676k.m65750j(projection, "projection");
        this.f174039w = projection;
        projection.mo69867a();
        EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
    }

    @Override // za3.InterfaceC40247b
    /* JADX INFO: renamed from: b */
    public final AbstractC23804u0 mo74523b() {
        return this.f174039w;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        AbstractC27736h abstractC27736hMo1783c = this.f174039w.mo69868b().mo69844i0().mo1783c();
        AbstractC22676k.m65749i(abstractC27736hMo1783c, "getBuiltIns(...)");
        return abstractC27736hMo1783c;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC31126h mo1784d() {
        return null;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return false;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        return C25271y.f99162w;
    }

    @Override // lb3.InterfaceC23796q0
    public final Collection getSupertypes() {
        AbstractC23804u0 abstractC23804u0 = this.f174039w;
        AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69867a() == EnumC23776g1.OUT_VARIANCE ? abstractC23804u0.mo69868b() : mo1783c().m83828p();
        AbstractC22676k.m65747g(abstractC23811yMo69868b);
        return AbstractC37056f.m118958J(abstractC23811yMo69868b);
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f174039w + ')';
    }
}
