package p409q0;

import java.util.List;
import p026b2.C2306l;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p180h0.EnumC16377d2;
import p268k0.AbstractC22086a;
import p635y2.AbstractC39104j1;
import p636y3.EnumC39181m;
import p715kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: q0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C29678d {

    /* JADX INFO: renamed from: a */
    public final int f121294a;

    /* JADX INFO: renamed from: b */
    public final List f121295b;

    /* JADX INFO: renamed from: c */
    public final long f121296c;

    /* JADX INFO: renamed from: d */
    public final Object f121297d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2300f f121298e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2301g f121299f;

    /* JADX INFO: renamed from: g */
    public final EnumC39181m f121300g;

    /* JADX INFO: renamed from: h */
    public final boolean f121301h;

    /* JADX INFO: renamed from: i */
    public final int f121302i;

    /* JADX INFO: renamed from: j */
    public final int[] f121303j;

    /* JADX INFO: renamed from: k */
    public int f121304k;

    /* JADX INFO: renamed from: l */
    public int f121305l;

    public C29678d(int i13, int i14, List list, long j7, Object obj, EnumC16377d2 enumC16377d2, InterfaceC2300f interfaceC2300f, InterfaceC2301g interfaceC2301g, EnumC39181m enumC39181m) {
        this.f121294a = i13;
        this.f121295b = list;
        this.f121296c = j7;
        this.f121297d = obj;
        this.f121298e = interfaceC2300f;
        this.f121299f = interfaceC2301g;
        this.f121300g = enumC39181m;
        this.f121301h = enumC16377d2 == EnumC16377d2.f62971w;
        int size = list.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i15);
            iMax = Math.max(iMax, !this.f121301h ? abstractC39104j1.f168212x : abstractC39104j1.f168211w);
        }
        this.f121302i = iMax;
        this.f121303j = new int[this.f121295b.size() * 2];
        this.f121305l = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m91151a(int i13) {
        this.f121304k += i13;
        int[] iArr = this.f121303j;
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            boolean z4 = this.f121301h;
            if ((z4 && i14 % 2 == 1) || (!z4 && i14 % 2 == 0)) {
                iArr[i14] = iArr[i14] + i13;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m91152b(int i13, int i14, int i15) {
        int i16;
        this.f121304k = i13;
        boolean z4 = this.f121301h;
        this.f121305l = z4 ? i15 : i14;
        List list = this.f121295b;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i17);
            int i18 = i17 * 2;
            int[] iArr = this.f121303j;
            if (z4) {
                InterfaceC2300f interfaceC2300f = this.f121298e;
                if (interfaceC2300f == null) {
                    AbstractC22086a.m63159b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i18] = interfaceC2300f.mo7155a(abstractC39104j1.f168211w, i14, this.f121300g);
                iArr[i18 + 1] = i13;
                i16 = abstractC39104j1.f168212x;
            } else {
                iArr[i18] = i13;
                int i19 = i18 + 1;
                InterfaceC2301g interfaceC2301g = this.f121299f;
                if (interfaceC2301g == null) {
                    AbstractC22086a.m63159b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i19] = ((C2306l) interfaceC2301g).m7157a(abstractC39104j1.f168212x, i15);
                i16 = abstractC39104j1.f168211w;
            }
            i13 += i16;
        }
    }
}
