package p047c9;

import p299l9.C23488c0;
import p516u8.AbstractC34609o0;
import p516u8.C34607n0;

/* JADX INFO: renamed from: c9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C4318i {

    /* JADX INFO: renamed from: a */
    public final String f17524a;

    /* JADX INFO: renamed from: b */
    public int f17525b;

    /* JADX INFO: renamed from: c */
    public long f17526c;

    /* JADX INFO: renamed from: d */
    public final C23488c0 f17527d;

    /* JADX INFO: renamed from: e */
    public boolean f17528e;

    /* JADX INFO: renamed from: f */
    public boolean f17529f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4319j f17530g;

    public C4318i(C4319j c4319j, String str, int i13, C23488c0 c23488c0) {
        this.f17530g = c4319j;
        this.f17524a = str;
        this.f17525b = i13;
        this.f17526c = c23488c0 == null ? -1L : c23488c0.f92979d;
        if (c23488c0 == null || !c23488c0.m68054b()) {
            return;
        }
        this.f17527d = c23488c0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13604a(C4310a c4310a) {
        C23488c0 c23488c0 = c4310a.f17498d;
        AbstractC34609o0 abstractC34609o0 = c4310a.f17496b;
        if (c23488c0 == null) {
            return this.f17525b != c4310a.f17497c;
        }
        long j7 = this.f17526c;
        if (j7 == -1) {
            return false;
        }
        if (c23488c0.f92979d > j7) {
            return true;
        }
        C23488c0 c23488c1 = this.f17527d;
        if (c23488c1 == null) {
            return false;
        }
        int i13 = c23488c1.f92977b;
        int iMo8132b = abstractC34609o0.mo8132b(c23488c0.f92976a);
        int iMo8132b2 = abstractC34609o0.mo8132b(c23488c1.f92976a);
        if (c23488c0.f92979d < c23488c1.f92979d || iMo8132b < iMo8132b2) {
            return false;
        }
        if (iMo8132b > iMo8132b2) {
            return true;
        }
        if (!c23488c0.m68054b()) {
            int i14 = c23488c0.f92980e;
            return i14 == -1 || i14 > i13;
        }
        int i15 = c23488c0.f92977b;
        int i16 = c23488c0.f92978c;
        if (i15 <= i13) {
            return i15 == i13 && i16 > c23488c1.f92978c;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13605b(AbstractC34609o0 abstractC34609o0, AbstractC34609o0 abstractC34609o1) {
        C23488c0 c23488c0;
        int i13 = this.f17525b;
        if (i13 < abstractC34609o0.mo8139o()) {
            C4319j c4319j = this.f17530g;
            C34607n0 c34607n0 = c4319j.f17533a;
            abstractC34609o0.m109407n(i13, c34607n0);
            int i14 = c34607n0.f145714n;
            while (true) {
                if (i14 > c34607n0.f145715o) {
                    i13 = -1;
                    break;
                }
                int iMo8132b = abstractC34609o1.mo8132b(abstractC34609o0.mo8138l(i14));
                if (iMo8132b != -1) {
                    i13 = abstractC34609o1.mo8128f(iMo8132b, c4319j.f17534b, false).f145693c;
                    break;
                }
                i14++;
            }
        } else if (i13 >= abstractC34609o1.mo8139o()) {
            i13 = -1;
            break;
        }
        this.f17525b = i13;
        return i13 != -1 && ((c23488c0 = this.f17527d) == null || abstractC34609o1.mo8132b(c23488c0.f92976a) != -1);
    }
}
