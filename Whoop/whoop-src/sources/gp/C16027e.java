package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p088dc.AbstractC11895b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C16027e extends AbstractC36219a {
    public static final Parcelable.Creator<C16027e> CREATOR = new C16040k0(16);

    /* JADX INFO: renamed from: E */
    public final String f60639E;

    /* JADX INFO: renamed from: w */
    public final C16026d0 f60640w;

    /* JADX INFO: renamed from: x */
    public final C16044m0 f60641x;

    /* JADX INFO: renamed from: y */
    public final C16029f f60642y;

    /* JADX INFO: renamed from: z */
    public final C16046n0 f60643z;

    public C16027e(C16026d0 c16026d0, C16044m0 c16044m0, C16029f c16029f, C16046n0 c16046n0, String str) {
        this.f60640w = c16026d0;
        this.f60641x = c16044m0;
        this.f60642y = c16029f;
        this.f60643z = c16046n0;
        this.f60639E = str;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m45343b() {
        try {
            JSONObject jSONObject = new JSONObject();
            C16029f c16029f = this.f60642y;
            if (c16029f != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", c16029f.f60647w);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e5) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e5);
                }
            }
            C16026d0 c16026d0 = this.f60640w;
            if (c16026d0 != null) {
                jSONObject.put("uvm", c16026d0.m45342b());
            }
            C16046n0 c16046n0 = this.f60643z;
            if (c16046n0 != null) {
                jSONObject.put("prf", c16046n0.m45354b());
            }
            String str = this.f60639E;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e13) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e13);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16027e)) {
            return false;
        }
        C16027e c16027e = (C16027e) obj;
        return AbstractC35135w.m111097i(this.f60640w, c16027e.f60640w) && AbstractC35135w.m111097i(this.f60641x, c16027e.f60641x) && AbstractC35135w.m111097i(this.f60642y, c16027e.f60642y) && AbstractC35135w.m111097i(this.f60643z, c16027e.f60643z) && AbstractC35135w.m111097i(this.f60639E, c16027e.f60639E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60640w, this.f60641x, this.f60642y, this.f60643z, this.f60639E});
    }

    public final String toString() {
        return AbstractC11895b.m31996o("AuthenticationExtensionsClientOutputs{", m45343b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f60640w, i13);
        AbstractC36221c.m115331l(parcel, 2, this.f60641x, i13);
        AbstractC36221c.m115331l(parcel, 3, this.f60642y, i13);
        AbstractC36221c.m115331l(parcel, 4, this.f60643z, i13);
        AbstractC36221c.m115332m(parcel, 5, this.f60639E);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
