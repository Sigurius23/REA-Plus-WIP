package p291l0;

import c93.InterfaceC4351m;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C22971k implements InterfaceC22968j {

    /* JADX INFO: renamed from: a */
    public final float f90635a;

    /* JADX INFO: renamed from: b */
    public final boolean f90636b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m f90637c;

    /* JADX INFO: renamed from: d */
    public final float f90638d;

    public C22971k(float f13, boolean z4, InterfaceC4351m interfaceC4351m) {
        this.f90635a = f13;
        this.f90636b = z4;
        this.f90637c = interfaceC4351m;
        this.f90638d = f13;
    }

    @Override // p291l0.InterfaceC22965i, p291l0.InterfaceC22974l
    /* JADX INFO: renamed from: a */
    public final float mo66735a() {
        return this.f90638d;
    }

    @Override // p291l0.InterfaceC22974l
    /* JADX INFO: renamed from: b */
    public final void mo66728b(InterfaceC39171c interfaceC39171c, int i13, int[] iArr, int[] iArr2) {
        mo66713c(interfaceC39171c, i13, iArr, EnumC39181m.f168423w, iArr2);
    }

    @Override // p291l0.InterfaceC22965i
    /* JADX INFO: renamed from: c */
    public final void mo66713c(InterfaceC39171c interfaceC39171c, int i13, int[] iArr, EnumC39181m enumC39181m, int[] iArr2) {
        int i14;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iMo724F = interfaceC39171c.mo724F(this.f90635a);
        boolean z4 = this.f90636b && enumC39181m == EnumC39181m.f168424x;
        C22949e c22949e = AbstractC22977m.f90650a;
        if (z4) {
            i14 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i15 = iArr[length];
                int iMin2 = Math.min(i14, i13 - i15);
                iArr2[length] = iMin2;
                iMin = Math.min(iMo724F, (i13 - iMin2) - i15);
                i14 = iArr2[length] + i15 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i16 = 0;
            i14 = 0;
            iMin = 0;
            int i17 = 0;
            while (i16 < length2) {
                int i18 = iArr[i16];
                int iMin3 = Math.min(i14, i13 - i18);
                iArr2[i17] = iMin3;
                int iMin4 = Math.min(iMo724F, (i13 - iMin3) - i18);
                int i19 = iArr2[i17] + i18 + iMin4;
                i16++;
                iMin = iMin4;
                i14 = i19;
                i17++;
            }
        }
        int i24 = i14 - iMin;
        InterfaceC4351m interfaceC4351m = this.f90637c;
        if (interfaceC4351m == null || i24 >= i13) {
            return;
        }
        int iIntValue = ((Number) interfaceC4351m.invoke(Integer.valueOf(i13 - i24), enumC39181m)).intValue();
        int length3 = iArr2.length;
        for (int i25 = 0; i25 < length3; i25++) {
            iArr2[i25] = iArr2[i25] + iIntValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22971k)) {
            return false;
        }
        C22971k c22971k = (C22971k) obj;
        return C39174f.m124782b(this.f90635a, c22971k.f90635a) && this.f90636b == c22971k.f90636b && AbstractC22676k.m65745e(this.f90637c, c22971k.f90637c);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Float.hashCode(this.f90635a) * 31, 31, this.f90636b);
        InterfaceC4351m interfaceC4351m = this.f90637c;
        return iM8289b + (interfaceC4351m == null ? 0 : interfaceC4351m.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f90636b ? "" : "Absolute");
        sb4.append("Arrangement#spacedAligned(");
        AbstractC13673n.m38572s(this.f90635a, ", ", sb4);
        sb4.append(this.f90637c);
        sb4.append(')');
        return sb4.toString();
    }
}
