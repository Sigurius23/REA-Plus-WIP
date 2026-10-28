package p047c9;

import cg3.InterfaceC4579d;
import com.squareup.wire.AbstractC5583n;
import ih0.AbstractC18489d0;
import jg3.EnumC21674a;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26699l;

/* JADX INFO: renamed from: c9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C4320k implements InterfaceC4579d, InterfaceC26699l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17540w;

    /* JADX INFO: renamed from: x */
    public int f17541x;

    /* JADX INFO: renamed from: y */
    public int f17542y;

    /* JADX INFO: renamed from: a */
    public int m13611a() {
        switch (this.f17540w) {
            case 8:
                int i13 = this.f17542y;
                if (i13 == 2) {
                    return 10;
                }
                if (i13 == 5) {
                    return 11;
                }
                if (i13 == 29) {
                    return 12;
                }
                if (i13 == 42) {
                    return 16;
                }
                if (i13 != 22) {
                    return i13 != 23 ? 0 : 15;
                }
                return 1073741824;
            default:
                int i14 = this.f17542y;
                if (i14 == 2) {
                    return 10;
                }
                if (i14 == 5) {
                    return 11;
                }
                if (i14 == 29) {
                    return 12;
                }
                if (i14 == 42) {
                    return 16;
                }
                if (i14 != 22) {
                    return i14 != 23 ? 0 : 15;
                }
                return 1073741824;
        }
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        int i13 = this.f17542y;
        int iMo14018f = interfaceC26697j.mo14018f(EnumC26688a.DAY_OF_WEEK);
        int i14 = this.f17541x;
        if (i14 < 2 && iMo14018f == i13) {
            return interfaceC26697j;
        }
        if ((i14 & 1) == 0) {
            int i15 = iMo14018f - i13;
            return interfaceC26697j.mo60994c(i15 >= 0 ? 7 - i15 : -i15, EnumC26689b.DAYS);
        }
        int i16 = i13 - iMo14018f;
        return interfaceC26697j.mo60995i(i16 >= 0 ? 7 - i16 : -i16, EnumC26689b.DAYS);
    }

    @Override // cg3.InterfaceC4579d
    public int getBeginIndex() {
        return this.f17541x;
    }

    @Override // cg3.InterfaceC4579d
    public int getEndIndex() {
        return this.f17542y;
    }

    public String toString() {
        switch (this.f17540w) {
            case 1:
                StringBuilder sb4 = new StringBuilder("Span{beginIndex=");
                sb4.append(this.f17541x);
                sb4.append(", endIndex=");
                return AbstractC18489d0.m53371l(sb4, this.f17542y, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4320k(int i13, int i14, int i15) {
        this.f17540w = i15;
        this.f17541x = i13;
        this.f17542y = i14;
    }

    public C4320k(C4320k c4320k) {
        this.f17540w = 3;
        this.f17541x = c4320k.f17541x;
        this.f17542y = c4320k.f17542y;
    }

    public C4320k(int i13, EnumC21674a enumC21674a) {
        this.f17540w = 9;
        AbstractC5583n.m16762V(enumC21674a, "dayOfWeek");
        this.f17541x = i13;
        this.f17542y = enumC21674a.m60988k();
    }
}
