package p077d0;

import java.util.Arrays;
import m83.AbstractC25260n;
import p002a0.C0020f0;
import p002a0.C0023g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: d0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11389p0 implements InterfaceC11416y {

    /* JADX INFO: renamed from: a */
    public final C11385o0 f36519a;

    public C11389p0(C11385o0 c11385o0) {
        this.f36519a = c11385o0;
    }

    @Override // p077d0.InterfaceC11416y, p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C11383n2 mo30534a(C11351f2 c11351f2) {
        int[] iArr;
        Object[] objArr;
        C11385o0 c11385o0 = this.f36519a;
        C0023g0 c0023g0 = c11385o0.f36507b;
        C0020f0 c0020f0 = new C0020f0(c0023g0.f152e + 2);
        C0023g0 c0023g1 = new C0023g0(c0023g0.f152e);
        int[] iArr2 = c0023g0.f149b;
        Object[] objArr2 = c0023g0.f150c;
        long[] jArr = c0023g0.f148a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j7 & 255) < 128) {
                            int i17 = (i13 << 3) + i16;
                            int i18 = iArr2[i17];
                            C11381n0 c11381n0 = (C11381n0) objArr2[i17];
                            c0020f0.m26a(i18);
                            c0023g1.m51h(i18, new C11379m2((AbstractC11395r) c11351f2.f36396a.invoke(c11381n0.f36484a), c11381n0.f36485b));
                        }
                        j7 >>= i14;
                        i16++;
                        iArr2 = iArr2;
                        i14 = i14;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!c0023g0.m120a(0)) {
            int i19 = c0020f0.f47b;
            if (i19 < 0) {
                AbstractC34924m.m110135Q("Index must be between 0 and size");
                throw null;
            }
            c0020f0.m27b(i19 + 1);
            int[] iArr3 = c0020f0.f46a;
            int i24 = c0020f0.f47b;
            if (i24 != 0) {
                AbstractC25260n.m74064e0(1, 0, iArr3, iArr3, i24);
            }
            iArr3[0] = 0;
            c0020f0.f47b++;
        }
        if (!c0023g0.m120a(c11385o0.f36506a)) {
            c0020f0.m26a(c11385o0.f36506a);
        }
        int i25 = c0020f0.f47b;
        if (i25 != 0) {
            int[] iArr4 = c0020f0.f46a;
            AbstractC22676k.m65750j(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i25);
        }
        return new C11383n2(c0020f0, c0023g1, c11385o0.f36506a, AbstractC11333b0.f36312c);
    }
}
