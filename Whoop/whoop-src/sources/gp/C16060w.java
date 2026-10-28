package gp;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import mp.C25801t0;
import p319m4.AbstractC25012a;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C16060w extends AbstractC36219a {
    public static final Parcelable.Creator<C16060w> CREATOR = new C16040k0(6);

    /* JADX INFO: renamed from: w */
    public final C25801t0 f60735w;

    /* JADX INFO: renamed from: x */
    public final String f60736x;

    /* JADX INFO: renamed from: y */
    public final String f60737y;

    /* JADX INFO: renamed from: z */
    public final String f60738z;

    public C16060w(String str, String str2, String str3, byte[] bArr) {
        AbstractC35135w.m111094f(bArr);
        this.f60735w = C25801t0.m76048l(bArr.length, bArr);
        AbstractC35135w.m111094f(str);
        this.f60736x = str;
        this.f60737y = str2;
        AbstractC35135w.m111094f(str3);
        this.f60738z = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16060w)) {
            return false;
        }
        C16060w c16060w = (C16060w) obj;
        return AbstractC35135w.m111097i(this.f60735w, c16060w.f60735w) && AbstractC35135w.m111097i(this.f60736x, c16060w.f60736x) && AbstractC35135w.m111097i(this.f60737y, c16060w.f60737y) && AbstractC35135w.m111097i(this.f60738z, c16060w.f60738z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60735w, this.f60736x, this.f60737y, this.f60738z});
    }

    public final String toString() {
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("PublicKeyCredentialUserEntity{\n id=", AbstractC40909b.m132600b(this.f60735w.m76050m()), ", \n name='");
        sbM53375p.append(this.f60736x);
        sbM53375p.append("', \n icon='");
        sbM53375p.append(this.f60737y);
        sbM53375p.append("', \n displayName='");
        return AbstractC25012a.m73376i(this.f60738z, "'}", sbM53375p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115325f(parcel, 2, this.f60735w.m76050m());
        AbstractC36221c.m115332m(parcel, 3, this.f60736x);
        AbstractC36221c.m115332m(parcel, 4, this.f60737y);
        AbstractC36221c.m115332m(parcel, 5, this.f60738z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
