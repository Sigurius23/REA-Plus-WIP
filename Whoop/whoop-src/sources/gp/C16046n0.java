package gp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import mp.C25801t0;
import org.json.JSONException;
import org.json.JSONObject;
import p088dc.AbstractC11895b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16046n0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16046n0> CREATOR = new C16040k0(20);

    /* JADX INFO: renamed from: w */
    public final boolean f60694w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60695x;

    public C16046n0(boolean z4, C25801t0 c25801t0) {
        this.f60694w = z4;
        this.f60695x = c25801t0;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m45354b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f60694w) {
                jSONObject.put("enabled", true);
            }
            C25801t0 c25801t0 = this.f60695x;
            byte[] bArrM76050m = c25801t0 == null ? null : c25801t0.m76050m();
            if (bArrM76050m != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM76050m, 32), 11));
                if (bArrM76050m.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM76050m, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e5) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16046n0)) {
            return false;
        }
        C16046n0 c16046n0 = (C16046n0) obj;
        return this.f60694w == c16046n0.f60694w && AbstractC35135w.m111097i(this.f60695x, c16046n0.f60695x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f60694w), this.f60695x});
    }

    public final String toString() {
        return AbstractC11895b.m31996o("AuthenticationExtensionsPrfOutputs{", m45354b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f60694w ? 1 : 0);
        C25801t0 c25801t0 = this.f60695x;
        AbstractC36221c.m115325f(parcel, 2, c25801t0 == null ? null : c25801t0.m76050m());
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
