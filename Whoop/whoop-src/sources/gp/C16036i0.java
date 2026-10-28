package gp;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import mp.C25801t0;
import p088dc.AbstractC11895b;
import p126eq.C13433b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16036i0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16036i0> CREATOR = new C13433b(28);

    /* JADX INFO: renamed from: w */
    public final C25801t0 f60663w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60664x;

    /* JADX INFO: renamed from: y */
    public final C25801t0 f60665y;

    /* JADX INFO: renamed from: z */
    public final int f60666z;

    public C16036i0(C25801t0 c25801t0, C25801t0 c25801t1, C25801t0 c25801t2, int i13) {
        this.f60663w = c25801t0;
        this.f60664x = c25801t1;
        this.f60665y = c25801t2;
        this.f60666z = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16036i0)) {
            return false;
        }
        C16036i0 c16036i0 = (C16036i0) obj;
        return AbstractC35135w.m111097i(this.f60663w, c16036i0.f60663w) && AbstractC35135w.m111097i(this.f60664x, c16036i0.f60664x) && AbstractC35135w.m111097i(this.f60665y, c16036i0.f60665y) && this.f60666z == c16036i0.f60666z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60663w, this.f60664x, this.f60665y, Integer.valueOf(this.f60666z)});
    }

    public final String toString() {
        C25801t0 c25801t0 = this.f60663w;
        String strM132600b = AbstractC40909b.m132600b(c25801t0 == null ? null : c25801t0.m76050m());
        C25801t0 c25801t1 = this.f60664x;
        String strM132600b2 = AbstractC40909b.m132600b(c25801t1 == null ? null : c25801t1.m76050m());
        C25801t0 c25801t2 = this.f60665y;
        String strM132600b3 = AbstractC40909b.m132600b(c25801t2 != null ? c25801t2.m76050m() : null);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HmacSecretExtension{coseKeyAgreement=", strM132600b, ", saltEnc=", strM132600b2, ", saltAuth=");
        sbM32001t.append(strM132600b3);
        sbM32001t.append(", getPinUvAuthProtocol=");
        return AbstractC18489d0.m53371l(sbM32001t, this.f60666z, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        C25801t0 c25801t0 = this.f60663w;
        AbstractC36221c.m115325f(parcel, 1, c25801t0 == null ? null : c25801t0.m76050m());
        C25801t0 c25801t1 = this.f60664x;
        AbstractC36221c.m115325f(parcel, 2, c25801t1 == null ? null : c25801t1.m76050m());
        C25801t0 c25801t2 = this.f60665y;
        AbstractC36221c.m115325f(parcel, 3, c25801t2 != null ? c25801t2.m76050m() : null);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f60666z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
