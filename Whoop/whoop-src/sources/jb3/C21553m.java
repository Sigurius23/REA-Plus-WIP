package jb3;

import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hb3.C17118h0;
import hb3.C17122k;
import hb3.C17135x;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25267u;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p581we.C37199o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30115a;
import qa3.C30122c0;
import qa3.C30136h;
import qa3.C30146k0;
import qa3.C30175y0;
import qa3.EnumC30147k1;
import s93.C32305g;
import s93.C32308j;
import sa3.AbstractC32330d;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import ub3.AbstractC34756j;
import va3.C35850h;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: jb3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C21553m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82652w;

    /* JADX INFO: renamed from: x */
    public final C21556p f82653x;

    public /* synthetic */ C21553m(C21556p c21556p, int i13) {
        this.f82652w = i13;
        this.f82653x = c21556p;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C35850h it = (C35850h) obj;
        switch (this.f82652w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                C21556p c21556p = this.f82653x;
                LinkedHashMap linkedHashMap = c21556p.f82662a;
                C30115a PARSER = C30122c0.f123035Z;
                AbstractC22676k.m65749i(PARSER, "PARSER");
                AbstractC21557q abstractC21557q = c21556p.f82670i;
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                Collection<C30122c0> collectionM122276E = bArr != null ? AbstractC38176k.m122276E(AbstractC38176k.m122287w(new C21555o(PARSER, new ByteArrayInputStream(bArr), abstractC21557q))) : C25271y.f99162w;
                ArrayList arrayList = new ArrayList(collectionM122276E.size());
                for (C30122c0 c30122c0 : collectionM122276E) {
                    C17135x c17135x = abstractC21557q.f82672b.f65768i;
                    AbstractC22676k.m65747g(c30122c0);
                    C21560t c21560tM48378f = c17135x.m48378f(c30122c0);
                    if (!abstractC21557q.mo60577k(c21560tM48378f)) {
                        c21560tM48378f = null;
                    }
                    if (c21560tM48378f != null) {
                        arrayList.add(c21560tM48378f);
                    }
                }
                abstractC21557q.mo60571c(arrayList, it);
                return AbstractC34756j.m109752b(arrayList);
            case 1:
                AbstractC22676k.m65750j(it, "it");
                C21556p c21556p2 = this.f82653x;
                LinkedHashMap linkedHashMap2 = c21556p2.f82663b;
                C30115a PARSER2 = C30146k0.f123303f0;
                AbstractC22676k.m65749i(PARSER2, "PARSER");
                AbstractC21557q abstractC21557q2 = c21556p2.f82670i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(it);
                Collection<C30146k0> collectionM122276E2 = bArr2 != null ? AbstractC38176k.m122276E(AbstractC38176k.m122287w(new C21555o(PARSER2, new ByteArrayInputStream(bArr2), abstractC21557q2))) : C25271y.f99162w;
                ArrayList arrayList2 = new ArrayList(collectionM122276E2.size());
                for (C30146k0 c30146k0 : collectionM122276E2) {
                    C17135x c17135x2 = abstractC21557q2.f82672b.f65768i;
                    AbstractC22676k.m65747g(c30146k0);
                    arrayList2.add(c17135x2.m48379g(c30146k0, false));
                }
                abstractC21557q2.mo60572d(arrayList2, it);
                return AbstractC34756j.m109752b(arrayList2);
            default:
                AbstractC22676k.m65750j(it, "it");
                C21556p c21556p3 = this.f82653x;
                C17122k c17122k = c21556p3.f82670i.f82672b;
                byte[] bArr3 = (byte[]) c21556p3.f82664c.get(it);
                if (bArr3 != null) {
                    C30175y0 c30175y0 = (C30175y0) C30175y0.f123524Q.m118734c(new ByteArrayInputStream(bArr3), c17122k.f65760a.f65750p);
                    if (c30175y0 != null) {
                        C17135x c17135x3 = c17122k.f65768i;
                        C17122k c17122k2 = c17135x3.f65803a;
                        InterfaceC32332f interfaceC32332f = c17122k2.f65761b;
                        C32334h c32334h = c17122k2.f65763d;
                        List list = c30175y0.f123531K;
                        AbstractC22676k.m65749i(list, "getAnnotationList(...)");
                        List<C30136h> list2 = list;
                        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                        for (C30136h c30136h : list2) {
                            C37199o c37199o = c17135x3.f65804b;
                            AbstractC22676k.m65747g(c30136h);
                            arrayList3.add(c37199o.m119229m(c30136h, interfaceC32332f));
                        }
                        C21561u c21561u = new C21561u(c17122k2.f65760a.f65735a, c17122k2.f65762c, arrayList3.isEmpty() ? C32305g.f133684a : new C32308j(arrayList3, 0), AbstractC12889b.m36240F(interfaceC32332f, c30175y0.f123525E), AbstractC15751g.m44466s((EnumC30147k1) AbstractC32330d.f133804d.mo91233e(c30175y0.f123538z)), c30175y0, c17122k2.f65761b, c32334h, c17122k2.f65764e, c17122k2.f65766g);
                        List list3 = c30175y0.f123526F;
                        AbstractC22676k.m65749i(list3, "getTypeParameterList(...)");
                        C17118h0 c17118h0 = c17122k2.m48372a(c21561u, list3, c17122k2.f65761b, c17122k2.f65763d, c17122k2.f65764e, c17122k2.f65765f).f65767h;
                        c21561u.m60592M0(c17118h0.m48359b(), c17118h0.m48361d(AbstractC21598x.m60715z0(c30175y0, c32334h), false), c17118h0.m48361d(AbstractC21598x.m60651G(c30175y0, c32334h), false));
                        return c21561u;
                    }
                }
                return null;
        }
    }
}
