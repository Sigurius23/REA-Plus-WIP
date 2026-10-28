package p294l3;

import aa3.C0627i1;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.room.AbstractC1772c1;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p132f0.C13819r;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17922y0;
import p208i2.C17875c1;
import p208i2.C17924z0;
import p208i2.InterfaceC17915v;
import p213i7.C18194g;
import p270k2.AbstractC22132f;
import p318m3.AbstractC24984n;
import p318m3.C24982l;
import p318m3.C24983m;
import p448r3.AbstractC30895a;
import p493t3.C33491c;
import p571w3.C36776l;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22665e0;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C23286w {

    /* JADX INFO: renamed from: a */
    public final C0627i1 f92258a;

    /* JADX INFO: renamed from: b */
    public final int f92259b;

    /* JADX INFO: renamed from: c */
    public final boolean f92260c;

    /* JADX INFO: renamed from: d */
    public final float f92261d;

    /* JADX INFO: renamed from: e */
    public final float f92262e;

    /* JADX INFO: renamed from: f */
    public final int f92263f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f92264g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f92265h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public C23286w(C0627i1 c0627i1, long j7, int i13, int i14) {
        boolean z4;
        int i15;
        int iM124764h;
        int i16;
        this.f92258a = c0627i1;
        this.f92259b = i13;
        if (C39169a.m124767k(j7) != 0 || C39169a.m124766j(j7) != 0) {
            AbstractC30895a.m95015a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0627i1.f2199f;
        int size = arrayList2.size();
        float f13 = 0.0f;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i17 >= size) {
                z4 = false;
                break;
            }
            C23291z c23291z = (C23291z) arrayList2.get(i17);
            C33491c c33491c = c23291z.f92277a;
            int iM124765i = C39169a.m124765i(j7);
            if (C39169a.m124760d(j7)) {
                i15 = i17;
                iM124764h = C39169a.m124764h(j7) - ((int) Math.ceil(f13));
                if (iM124764h < 0) {
                    iM124764h = 0;
                }
            } else {
                i15 = i17;
                iM124764h = C39169a.m124764h(j7);
            }
            C23242a c23242a = new C23242a(c33491c, this.f92259b - i18, i14, AbstractC39170b.m124770b(iM124765i, iM124764h, 5));
            float fM67290b = c23242a.m67290b() + f13;
            C24983m c24983m = c23242a.f92101d;
            int i19 = i18 + c24983m.f97769g;
            arrayList.add(new C23290y(c23242a, c23291z.f92278b, c23291z.f92279c, i18, i19, f13, fM67290b));
            if (!c24983m.f97766d) {
                if (i19 == this.f92259b) {
                    i16 = i15;
                    if (i16 != AbstractC37056f.m118951C((ArrayList) this.f92258a.f2199f)) {
                    }
                } else {
                    i16 = i15;
                }
                i17 = i16 + 1;
                i18 = i19;
                f13 = fM67290b;
            }
            z4 = true;
            i18 = i19;
            f13 = fM67290b;
            break;
        }
        this.f92262e = f13;
        this.f92263f = i18;
        this.f92260c = z4;
        this.f92265h = arrayList;
        this.f92261d = C39169a.m124765i(j7);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i24 = 0; i24 < size2; i24++) {
            C23290y c23290y = (C23290y) arrayList.get(i24);
            ?? r10 = c23290y.f92270a.f92103f;
            ArrayList arrayList4 = new ArrayList(r10.size());
            int size3 = ((Collection) r10).size();
            for (int i25 = 0; i25 < size3; i25++) {
                C16618c c16618c = (C16618c) r10.get(i25);
                arrayList4.add(c16618c != null ? c23290y.m67384a(c16618c) : null);
            }
            AbstractC25265s.m74141p0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f92258a.f2196c).size()) {
            int size4 = ((List) this.f92258a.f2196c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i26 = 0; i26 < size4; i26++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC25265s.m74129g1(arrayList3, arrayList5);
        }
        this.f92264g = arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public static void m67369i(C23286w c23286w, InterfaceC17915v interfaceC17915v, long j7, C17924z0 c17924z0, C36776l c36776l, AbstractC22132f abstractC22132f) {
        interfaceC17915v.mo51426q();
        ArrayList arrayList = c23286w.f92265h;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C23290y c23290y = (C23290y) arrayList.get(i13);
            c23290y.f92270a.m67294f(interfaceC17915v, j7, c17924z0, c36776l, abstractC22132f);
            interfaceC17915v.mo51416f(0.0f, c23290y.f92270a.m67290b());
        }
        interfaceC17915v.mo51417g();
    }

    /* JADX INFO: renamed from: j */
    public static void m67370j(C23286w c23286w, InterfaceC17915v interfaceC17915v, AbstractC17911t abstractC17911t, float f13, C17924z0 c17924z0, C36776l c36776l, AbstractC22132f abstractC22132f) {
        interfaceC17915v.mo51426q();
        ArrayList arrayList = c23286w.f92265h;
        if (arrayList.size() <= 1 || (abstractC17911t instanceof C17875c1)) {
            AbstractC1772c1.m5397o(c23286w, interfaceC17915v, abstractC17911t, f13, c17924z0, c36776l, abstractC22132f);
        } else {
            if (!(abstractC17911t instanceof AbstractC17922y0)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM67290b = 0.0f;
            for (int i13 = 0; i13 < size; i13++) {
                C23290y c23290y = (C23290y) arrayList.get(i13);
                fM67290b += c23290y.f92270a.m67290b();
                fMax = Math.max(fMax, c23290y.f92270a.m67292d());
            }
            Shader shaderMo29549b = ((AbstractC17922y0) abstractC17911t).mo29549b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM67290b)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo29549b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                C23242a c23242a = ((C23290y) arrayList.get(i14)).f92270a;
                c23242a.m67295g(interfaceC17915v, AbstractC34924m.m110145f(shaderMo29549b), f13, c17924z0, c36776l, abstractC22132f);
                interfaceC17915v.mo51416f(0.0f, c23242a.m67290b());
                matrix.setTranslate(0.0f, -c23242a.m67290b());
                shaderMo29549b.setLocalMatrix(matrix);
            }
        }
        interfaceC17915v.mo51417g();
    }

    /* JADX INFO: renamed from: a */
    public final void m67371a(long j7, float[] fArr) {
        m67379k(C23283u0.m67360f(j7));
        m67380l(C23283u0.m67359e(j7));
        C22665e0 c22665e0 = new C22665e0();
        c22665e0.f89334w = 0;
        AbstractC23278s.m67349f(this.f92265h, j7, new C13819r(j7, fArr, c22665e0, new C22663d0()));
    }

    /* JADX INFO: renamed from: b */
    public final float m67372b(int i13) {
        m67381m(i13);
        ArrayList arrayList = this.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        return c23242a.f92101d.m73311e(i13 - c23290y.f92273d) + c23290y.f92275f;
    }

    /* JADX INFO: renamed from: c */
    public final int m67373c(int i13, boolean z4) {
        int iM73312f;
        m67381m(i13);
        ArrayList arrayList = this.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        int i14 = i13 - c23290y.f92273d;
        C24983m c24983m = c23242a.f92101d;
        if (z4) {
            Layout layout = c24983m.f97768f;
            C24982l c24982l = AbstractC24984n.f97780a;
            if (layout.getEllipsisCount(i14) <= 0 || c24983m.f97764b != TextUtils.TruncateAt.END) {
                iM73312f = c24983m.m73309c().m7499z(i14);
            } else {
                iM73312f = layout.getEllipsisStart(i14) + layout.getLineStart(i14);
            }
        } else {
            iM73312f = c24983m.m73312f(i14);
        }
        return iM73312f + c23290y.f92271b;
    }

    /* JADX INFO: renamed from: d */
    public final int m67374d(int i13) {
        int iM67346c;
        int length = ((C23254g) this.f92258a.f2195b).f92135x.length();
        ArrayList arrayList = this.f92265h;
        if (i13 >= length) {
            iM67346c = AbstractC37056f.m118951C(arrayList);
        } else {
            iM67346c = i13 < 0 ? 0 : AbstractC23278s.m67346c(i13, arrayList);
        }
        C23290y c23290y = (C23290y) arrayList.get(iM67346c);
        return c23290y.f92270a.f92101d.f97768f.getLineForOffset(c23290y.m67387d(i13)) + c23290y.f92273d;
    }

    /* JADX INFO: renamed from: e */
    public final int m67375e(float f13) {
        ArrayList arrayList = this.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67348e(arrayList, f13));
        int i13 = c23290y.f92272c - c23290y.f92271b;
        int i14 = c23290y.f92273d;
        if (i13 == 0) {
            return i14;
        }
        C23242a c23242a = c23290y.f92270a;
        float f14 = f13 - c23290y.f92275f;
        C24983m c24983m = c23242a.f92101d;
        return c24983m.f97768f.getLineForVertical(((int) f14) - c24983m.f97770h) + i14;
    }

    /* JADX INFO: renamed from: f */
    public final float m67376f(int i13) {
        m67381m(i13);
        ArrayList arrayList = this.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67347d(i13, arrayList));
        C23242a c23242a = c23290y.f92270a;
        return c23242a.f92101d.m73313g(i13 - c23290y.f92273d) + c23290y.f92275f;
    }

    /* JADX INFO: renamed from: g */
    public final int m67377g(long j7) {
        int i13 = (int) (j7 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i13);
        ArrayList arrayList = this.f92265h;
        C23290y c23290y = (C23290y) arrayList.get(AbstractC23278s.m67348e(arrayList, fIntBitsToFloat));
        int i14 = c23290y.f92272c;
        int i15 = c23290y.f92271b;
        if (i14 - i15 == 0) {
            return i15;
        }
        C23242a c23242a = c23290y.f92270a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - c23290y.f92275f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        C24983m c24983m = c23242a.f92101d;
        int lineForVertical = c24983m.f97768f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c24983m.f97770h);
        return c24983m.f97768f.getOffsetForHorizontal(lineForVertical, (c24983m.m73308b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i15;
    }

    /* JADX INFO: renamed from: h */
    public final long m67378h(C16618c c16618c, int i13, C18194g c18194g) {
        long jM67385b;
        long j7;
        float f13 = c16618c.f63940b;
        ArrayList arrayList = this.f92265h;
        int iM67348e = AbstractC23278s.m67348e(arrayList, f13);
        float f14 = ((C23290y) arrayList.get(iM67348e)).f92276g;
        float f15 = c16618c.f63942d;
        if (f14 >= f15 || iM67348e == AbstractC37056f.m118951C(arrayList)) {
            C23290y c23290y = (C23290y) arrayList.get(iM67348e);
            return c23290y.m67385b(c23290y.f92270a.m67291c(c23290y.m67386c(c16618c), i13, c18194g), true);
        }
        int iM67348e2 = AbstractC23278s.m67348e(arrayList, f15);
        long jM67385b2 = C23283u0.f92251b;
        while (true) {
            jM67385b = C23283u0.f92251b;
            if (!C23283u0.m67356b(jM67385b2, jM67385b) || iM67348e > iM67348e2) {
                break;
            }
            C23290y c23290y2 = (C23290y) arrayList.get(iM67348e);
            jM67385b2 = c23290y2.m67385b(c23290y2.f92270a.m67291c(c23290y2.m67386c(c16618c), i13, c18194g), true);
            iM67348e++;
        }
        if (C23283u0.m67356b(jM67385b2, jM67385b)) {
            return jM67385b;
        }
        while (true) {
            j7 = C23283u0.f92251b;
            if (!C23283u0.m67356b(jM67385b, j7) || iM67348e > iM67348e2) {
                break;
            }
            C23290y c23290y3 = (C23290y) arrayList.get(iM67348e2);
            jM67385b = c23290y3.m67385b(c23290y3.f92270a.m67291c(c23290y3.m67386c(c16618c), i13, c18194g), true);
            iM67348e2--;
        }
        return C23283u0.m67356b(jM67385b, j7) ? jM67385b2 : AbstractC21478l0.m60431f((int) (jM67385b2 >> 32), (int) (4294967295L & jM67385b));
    }

    /* JADX INFO: renamed from: k */
    public final void m67379k(int i13) {
        boolean z4 = false;
        C0627i1 c0627i1 = this.f92258a;
        if (i13 >= 0 && i13 < ((C23254g) c0627i1.f2195b).f92135x.length()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "offset(", ") is out of bounds [0, ");
        sbM30466t.append(((C23254g) c0627i1.f2195b).f92135x.length());
        sbM30466t.append(')');
        AbstractC30895a.m95015a(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m67380l(int i13) {
        boolean z4 = false;
        C0627i1 c0627i1 = this.f92258a;
        if (i13 >= 0 && i13 <= ((C23254g) c0627i1.f2195b).f92135x.length()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "offset(", ") is out of bounds [0, ");
        sbM30466t.append(((C23254g) c0627i1.f2195b).f92135x.length());
        sbM30466t.append(']');
        AbstractC30895a.m95015a(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: m */
    public final void m67381m(int i13) {
        boolean z4 = false;
        int i14 = this.f92263f;
        if (i13 >= 0 && i13 < i14) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        AbstractC30895a.m95015a("lineIndex(" + i13 + ") is out of bounds [0, " + i14 + ')');
    }
}
