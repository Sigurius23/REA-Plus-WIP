package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mp.C25779j1;
import mp.C25801t0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C16051q extends AbstractC36219a {
    public static final Parcelable.Creator<C16051q> CREATOR = new C16040k0(1);

    /* JADX INFO: renamed from: E */
    public final C16031g f60703E;

    /* JADX INFO: renamed from: F */
    public final C16035i f60704F;

    /* JADX INFO: renamed from: G */
    public final C16027e f60705G;

    /* JADX INFO: renamed from: H */
    public final String f60706H;

    /* JADX INFO: renamed from: w */
    public final String f60707w;

    /* JADX INFO: renamed from: x */
    public final String f60708x;

    /* JADX INFO: renamed from: y */
    public final C25801t0 f60709y;

    /* JADX INFO: renamed from: z */
    public final C16033h f60710z;

    public C16051q(String str, String str2, byte[] bArr, C16033h c16033h, C16031g c16031g, C16035i c16035i, C16027e c16027e, String str3) {
        C25801t0 c25801t0M76048l = bArr == null ? null : C25801t0.m76048l(bArr.length, bArr);
        boolean z4 = false;
        AbstractC35135w.m111090b((c16033h != null && c16031g == null && c16035i == null) || (c16033h == null && c16031g != null && c16035i == null) || (c16033h == null && c16031g == null && c16035i != null), "Must provide a response object.");
        if (c16035i != null || (str != null && c25801t0M76048l != null)) {
            z4 = true;
        }
        AbstractC35135w.m111090b(z4, "Must provide id and rawId if not an error response.");
        this.f60707w = str;
        this.f60708x = str2;
        this.f60709y = c25801t0M76048l;
        this.f60710z = c16033h;
        this.f60703E = c16031g;
        this.f60704F = c16035i;
        this.f60705G = c16027e;
        this.f60706H = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16051q)) {
            return false;
        }
        C16051q c16051q = (C16051q) obj;
        return AbstractC35135w.m111097i(this.f60707w, c16051q.f60707w) && AbstractC35135w.m111097i(this.f60708x, c16051q.f60708x) && AbstractC35135w.m111097i(this.f60709y, c16051q.f60709y) && AbstractC35135w.m111097i(this.f60710z, c16051q.f60710z) && AbstractC35135w.m111097i(this.f60703E, c16051q.f60703E) && AbstractC35135w.m111097i(this.f60704F, c16051q.f60704F) && AbstractC35135w.m111097i(this.f60705G, c16051q.f60705G) && AbstractC35135w.m111097i(this.f60706H, c16051q.f60706H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60707w, this.f60708x, this.f60709y, this.f60703E, this.f60710z, this.f60704F, this.f60705G, this.f60706H});
    }

    public final String toString() {
        C25801t0 c25801t0 = this.f60709y;
        String strM132600b = AbstractC40909b.m132600b(c25801t0 == null ? null : c25801t0.m76050m());
        String strValueOf = String.valueOf(this.f60710z);
        String strValueOf2 = String.valueOf(this.f60703E);
        String strValueOf3 = String.valueOf(this.f60704F);
        String strValueOf4 = String.valueOf(this.f60705G);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PublicKeyCredential{\n id='", this.f60707w, "', \n type='", this.f60708x, "', \n rawId=");
        AbstractC11266d.m30444B(sbM32001t, strM132600b, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        AbstractC11266d.m30444B(sbM32001t, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return AbstractC11266d.m30464r(sbM32001t, strValueOf4, ", \n authenticatorAttachment='", this.f60706H, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        C25779j1.f101498a.m40835f();
        throw null;
    }
}
