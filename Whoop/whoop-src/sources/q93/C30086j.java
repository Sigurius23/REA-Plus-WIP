package q93;

import ce3.C4515p;
import j93.InterfaceC21493z;
import kb3.C22340i;
import kb3.C22342k;
import m83.AbstractC25265s;
import o93.AbstractC27736h;
import o93.C27739k;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import t93.InterfaceC33666b;
import t93.InterfaceC33668d;
import u93.C34673e0;

/* JADX INFO: renamed from: q93.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C30086j extends AbstractC27736h {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC21493z[] f122785h = {AbstractC22671h0.f89337a.property1(new C22693x(C30086j.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: f */
    public C27739k f122786f;

    /* JADX INFO: renamed from: g */
    public final C22340i f122787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30086j(C22342k c22342k) {
        super(c22342k);
        EnumC30084h[] enumC30084hArr = EnumC30084h.f122783w;
        this.f122787g = new C22340i(c22342k, new C4515p(this, c22342k, false, 6));
    }

    /* JADX INFO: renamed from: K */
    public final C30092p m92215K() {
        return (C30092p) AbstractC29125c.m88494C(this.f122787g, f122785h[0]);
    }

    @Override // o93.AbstractC27736h
    /* JADX INFO: renamed from: d */
    public final InterfaceC33666b mo83816d() {
        return m92215K();
    }

    @Override // o93.AbstractC27736h
    /* JADX INFO: renamed from: m */
    public final Iterable mo83825m() {
        Iterable iterableMo83825m = super.mo83825m();
        C34673e0 c34673e0M83824l = m83824l();
        AbstractC22676k.m65749i(c34673e0M83824l, "getBuiltInsModule(...)");
        return AbstractC25265s.m74127e1(iterableMo83825m, new C30083g(this.f111793d, c34673e0M83824l));
    }

    @Override // o93.AbstractC27736h
    /* JADX INFO: renamed from: q */
    public final InterfaceC33668d mo83829q() {
        return m92215K();
    }
}
