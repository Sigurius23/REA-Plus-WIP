package p133f1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import p002a0.AbstractC0058w;
import p002a0.C0035k0;
import p026b2.C2319y;
import p181h2.C16617b;
import p181h2.C16618c;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f1.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13931d0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49669w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13988w0 f49670x;

    public /* synthetic */ C13931d0(C13988w0 c13988w0, int i13) {
        this.f49669w = i13;
        this.f49670x = c13988w0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC39147y interfaceC39147y;
        C16618c c16618c;
        C16618c c16618c2;
        int i13;
        InterfaceC39147y interfaceC39147yM39736d;
        int[] iArr;
        int i14;
        C13954l c13954l;
        boolean z4;
        long j7;
        int iNextIndex;
        InterfaceC2994c0 interfaceC2994c0;
        C13981u c13981u;
        int i15 = this.f49669w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        boolean z13 = false;
        int i16 = 1;
        C13988w0 c13988w0 = this.f49670x;
        switch (i15) {
            case 0:
                C16617b c16617b = (C16617b) c13988w0.f49915p.getValue();
                return new C16617b(c16617b != null ? c16617b.f63937a : 9205357640488583168L);
            case 1:
                C16617b c16617b2 = (C16617b) c13988w0.f49916q.getValue();
                return new C16617b(c16617b2 != null ? c16617b2.f63937a : 9205357640488583168L);
            case 2:
                c13988w0.m39805j();
                return c23454a0;
            case 3:
                C13926b1 c13926b1 = c13988w0.f49900a;
                c13988w0.f49912m.getValue();
                if (c13988w0.m39802g() != null && (interfaceC39147y = c13988w0.f49911l) != null && interfaceC39147y.mo3532g()) {
                    ArrayList arrayListM39694e = c13926b1.m39694e(c13988w0.m39806k());
                    ArrayList arrayList = new ArrayList(arrayListM39694e.size());
                    int size = arrayListM39694e.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        C13954l c13954l2 = (C13954l) arrayListM39694e.get(i17);
                        C13981u c13981u2 = (C13981u) c13926b1.m39690a().m81e(c13954l2.f49741a);
                        C23465k c23465k = c13981u2 != null ? new C23465k(c13954l2, c13981u2) : null;
                        if (c23465k != null) {
                            arrayList.add(c23465k);
                        }
                    }
                    int size2 = arrayList.size();
                    List listM118959K = arrayList;
                    listM118959K = arrayList;
                    if (size2 != 0 && size2 != 1) {
                        listM118959K = AbstractC37056f.m118959K(AbstractC25265s.m74096F0(arrayList), AbstractC25265s.m74112P0(arrayList));
                    }
                    if (!listM118959K.isEmpty()) {
                        boolean zIsEmpty = listM118959K.isEmpty();
                        C16618c c16618c3 = AbstractC13994y0.f49937a;
                        if (zIsEmpty) {
                            c16618c2 = c16618c3;
                            c16618c = c16618c2;
                        } else {
                            int size3 = listM118959K.size();
                            int i18 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            while (i18 < size3) {
                                C23465k c23465k2 = (C23465k) listM118959K.get(i18);
                                C13954l c13954l3 = (C13954l) c23465k2.f92937w;
                                C13981u c13981u3 = (C13981u) c23465k2.f92938x;
                                int i19 = c13981u3.f49879a.f49872b;
                                int i24 = c13981u3.f49880b.f49872b;
                                if (i19 == i24 || (interfaceC39147yM39736d = c13954l3.m39736d()) == null) {
                                    i13 = size3;
                                } else {
                                    boolean z14 = z13;
                                    int iMin = Math.min(i19, i24);
                                    int iMax = Math.max(i19, i24) - i16;
                                    if (iMin == iMax) {
                                        iArr = new int[i16];
                                        iArr[z14 ? 1 : 0] = iMin;
                                    } else {
                                        int[] iArr2 = new int[2];
                                        iArr2[z14 ? 1 : 0] = iMin;
                                        iArr2[i16] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    int i25 = z14 ? 1 : 0;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    while (i25 < length) {
                                        int i26 = iArr[i25];
                                        C23277r0 c23277r0 = (C23277r0) c13954l3.f49743c.invoke();
                                        C16618c c16618cM67333b = C16618c.f63938e;
                                        if (c23277r0 == null) {
                                            i14 = size3;
                                            c13954l = c13954l3;
                                        } else {
                                            i14 = size3;
                                            int length2 = c23277r0.f92227a.f92216a.f92135x.length();
                                            c13954l = c13954l3;
                                            if (length2 >= 1) {
                                                z4 = z14;
                                                c16618cM67333b = c23277r0.m67333b(AbstractC12889b.m36284n(i26, z4 ? 1 : 0, length2 - 1));
                                            }
                                            C16618c c16618c4 = c16618cM67333b;
                                            fMin3 = Math.min(fMin3, c16618c4.f63939a);
                                            fMin4 = Math.min(fMin4, c16618c4.f63940b);
                                            fMax3 = Math.max(fMax3, c16618c4.f63941c);
                                            fMax4 = Math.max(fMax4, c16618c4.f63942d);
                                            i25++;
                                            z14 = z4;
                                            size3 = i14;
                                            c13954l3 = c13954l;
                                        }
                                        z4 = z14;
                                        C16618c c16618c5 = c16618cM67333b;
                                        fMin3 = Math.min(fMin3, c16618c5.f63939a);
                                        fMin4 = Math.min(fMin4, c16618c5.f63940b);
                                        fMax3 = Math.max(fMax3, c16618c5.f63941c);
                                        fMax4 = Math.max(fMax4, c16618c5.f63942d);
                                        i25++;
                                        z14 = z4;
                                        size3 = i14;
                                        c13954l3 = c13954l;
                                    }
                                    i13 = size3;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMin3)) << 32);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fMax4)) & 4294967295L;
                                    long jMo3537k = interfaceC39147y.mo3537k(interfaceC39147yM39736d, jFloatToRawIntBits);
                                    long jMo3537k2 = interfaceC39147y.mo3537k(interfaceC39147yM39736d, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jMo3537k >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jMo3537k & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jMo3537k2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jMo3537k2 & 4294967295L)));
                                }
                                i18++;
                                c16618c3 = c16618c3;
                                size3 = i13;
                                z13 = false;
                                i16 = 1;
                            }
                            c16618c = c16618c3;
                            c16618c2 = new C16618c(fMin, fMin2, fMax, fMax2);
                        }
                        if (!c16618c2.equals(c16618c)) {
                            C16618c c16618cM47202h = AbstractC13994y0.m39837z(interfaceC39147y).m47202h(c16618c2);
                            if (c16618cM47202h.f63941c - c16618cM47202h.f63939a >= 0.0f && c16618cM47202h.f63942d - c16618cM47202h.f63940b >= 0.0f) {
                                C16618c c16618cM47206l = c16618cM47202h.m47206l(interfaceC39147y.mo3523Z(0L));
                                return C16618c.m47195b(c16618cM47206l, 0.0f, 0.0f, (AbstractC13967p0.f49804b * 4) + c16618cM47206l.f63942d, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                C13988w0 c13988w1 = this.f49670x;
                c13988w1.f49923x = true;
                c13988w1.m39811p();
                c13988w1.f49917r.setValue(null);
                c13988w1.f49918s.setValue(null);
                if (c13988w1.f49920u && c13988w1.m39804i()) {
                    C22669g0 c22669g0 = new C22669g0();
                    C22669g0 c22669g1 = new C22669g0();
                    C22667f0 c22667f0 = new C22667f0();
                    C13926b1 c13926b2 = c13988w1.f49900a;
                    ArrayList arrayListM39694e2 = c13926b2.m39694e(c13988w1.m39806k());
                    ListIterator listIterator = arrayListM39694e2.listIterator(arrayListM39694e2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            j7 = 0;
                            C13981u c13981u4 = (C13981u) c13926b2.m39690a().m81e(((C13954l) listIterator.previous()).f49741a);
                            if (c13981u4 != null && c13981u4.f49879a.f49872b != c13981u4.f49880b.f49872b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            j7 = 0;
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size4 = arrayListM39694e2.size();
                        int i27 = 0;
                        while (i27 < size4) {
                            C13954l c13954l4 = (C13954l) arrayListM39694e2.get(i27);
                            C13981u c13981u5 = (C13981u) c13926b2.m39690a().m81e(c13954l4.f49741a);
                            if (c13981u5 != null) {
                                C23254g c23254gM39737e = c13954l4.m39737e();
                                long jM60431f = AbstractC21478l0.m60431f(c13981u5.f49879a.f49872b, c13981u5.f49880b.f49872b);
                                i16 = i27 < iNextIndex ? 0 : 1;
                                long j13 = c13954l4.f49741a;
                                if (i16 != 0) {
                                    c22669g0.f89336w = c23254gM39737e;
                                    c22669g1.f89336w = new C23283u0(jM60431f);
                                    c22667f0.f89335w = j13;
                                }
                            } else {
                                i27++;
                            }
                        }
                    }
                    Object obj = c22669g0.f89336w;
                    if (obj != null && c22669g1.f89336w != null && c22667f0.f89335w != j7 && ((CharSequence) obj).length() > 0 && (interfaceC2994c0 = c13988w1.f49921v) != null) {
                        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C2319y(c13988w1, c22669g0, c22669g1, c22667f0, (InterfaceC30057d) null, 5), 3);
                    }
                }
                c13988w1.f49920u = false;
                return c23454a0;
            case 5:
                c13988w0.m39798c();
                return c23454a0;
            case 6:
                return Boolean.valueOf((c13988w0.f49923x && c13988w0.m39803h()) ? false : true);
            default:
                C13926b1 c13926b3 = c13988w0.f49900a;
                ArrayList arrayListM39694e3 = c13926b3.m39694e(c13988w0.m39806k());
                if (arrayListM39694e3.isEmpty()) {
                    return c23454a0;
                }
                C0035k0 c0035k0 = AbstractC0058w.f176a;
                C0035k0 c0035k1 = new C0035k0();
                int size5 = arrayListM39694e3.size();
                int i28 = 0;
                C13981u c13981u6 = null;
                C13981u c13981u7 = null;
                while (i28 < size5) {
                    C13954l c13954l5 = (C13954l) arrayListM39694e3.get(i28);
                    long j14 = c13954l5.f49741a;
                    C23277r0 c23277r1 = (C23277r0) c13954l5.f49743c.invoke();
                    if (c23277r1 == null) {
                        c13981u = null;
                    } else {
                        int length3 = c23277r1.f92227a.f92216a.f92135x.length();
                        c13981u = new C13981u(new C13978t(c23277r1.m67332a(0), 0, j14), new C13978t(c23277r1.m67332a(Math.max(length3 - 1, 0)), length3, j14), false);
                    }
                    if (c13981u != null) {
                        if (c13981u6 == null) {
                            c13981u6 = c13981u;
                        }
                        long j15 = c13954l5.f49741a;
                        int iM79c = c0035k1.m79c(j15);
                        Object[] objArr = c0035k1.f101c;
                        Object obj2 = objArr[iM79c];
                        c0035k1.f100b[iM79c] = j15;
                        objArr[iM79c] = c13981u;
                        c13981u7 = c13981u;
                    }
                    i28++;
                    arrayListM39694e3 = arrayListM39694e3;
                    size5 = size5;
                    c23454a0 = c23454a0;
                }
                C23454a0 c23454a1 = c23454a0;
                if (c0035k1.f103e == 0) {
                    return c23454a1;
                }
                if (c13981u6 != c13981u7) {
                    AbstractC22676k.m65747g(c13981u6);
                    C13978t c13978t = c13981u6.f49879a;
                    AbstractC22676k.m65747g(c13981u7);
                    c13981u6 = new C13981u(c13978t, c13981u7.f49880b, false);
                }
                c13926b3.f49656k.setValue(c0035k1);
                c13988w0.f49903d.invoke(c13981u6);
                c13988w0.f49919t = null;
                return c23454a1;
        }
    }
}
