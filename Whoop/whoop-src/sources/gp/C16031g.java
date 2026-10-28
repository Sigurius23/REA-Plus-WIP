package gp;

import android.os.Parcel;
import android.os.Parcelable;
import gm.C15990r;
import java.util.Arrays;
import mp.C25784l0;
import mp.C25789n0;
import mp.C25801t0;
import org.json.JSONException;
import org.json.JSONObject;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16031g extends AbstractC16037j {
    public static final Parcelable.Creator<C16031g> CREATOR = new C16040k0(21);

    /* JADX INFO: renamed from: E */
    public final C25801t0 f60649E;

    /* JADX INFO: renamed from: w */
    public final C25801t0 f60650w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60651x;

    /* JADX INFO: renamed from: y */
    public final C25801t0 f60652y;

    /* JADX INFO: renamed from: z */
    public final C25801t0 f60653z;

    public C16031g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        AbstractC35135w.m111094f(bArr);
        C25801t0 c25801t0M76048l = C25801t0.m76048l(bArr.length, bArr);
        AbstractC35135w.m111094f(bArr2);
        C25801t0 c25801t0M76048l2 = C25801t0.m76048l(bArr2.length, bArr2);
        AbstractC35135w.m111094f(bArr3);
        C25801t0 c25801t0M76048l3 = C25801t0.m76048l(bArr3.length, bArr3);
        AbstractC35135w.m111094f(bArr4);
        C25801t0 c25801t0M76048l4 = C25801t0.m76048l(bArr4.length, bArr4);
        C25801t0 c25801t0M76048l5 = bArr5 == null ? null : C25801t0.m76048l(bArr5.length, bArr5);
        this.f60650w = c25801t0M76048l;
        this.f60651x = c25801t0M76048l2;
        this.f60652y = c25801t0M76048l3;
        this.f60653z = c25801t0M76048l4;
        this.f60649E = c25801t0M76048l5;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m45344b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", AbstractC40909b.m132600b(this.f60651x.m76050m()));
            jSONObject.put("authenticatorData", AbstractC40909b.m132600b(this.f60652y.m76050m()));
            jSONObject.put("signature", AbstractC40909b.m132600b(this.f60653z.m76050m()));
            C25801t0 c25801t0 = this.f60649E;
            if (c25801t0 == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", AbstractC40909b.m132600b(c25801t0 == null ? null : c25801t0.m76050m()));
            return jSONObject;
        } catch (JSONException e5) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16031g)) {
            return false;
        }
        C16031g c16031g = (C16031g) obj;
        return AbstractC35135w.m111097i(this.f60650w, c16031g.f60650w) && AbstractC35135w.m111097i(this.f60651x, c16031g.f60651x) && AbstractC35135w.m111097i(this.f60652y, c16031g.f60652y) && AbstractC35135w.m111097i(this.f60653z, c16031g.f60653z) && AbstractC35135w.m111097i(this.f60649E, c16031g.f60649E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f60650w})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f60651x})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f60652y})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f60653z})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f60649E}))});
    }

    public final String toString() {
        C15990r c15990r = new C15990r(getClass().getSimpleName());
        C25784l0 c25784l0 = C25789n0.f101516d;
        byte[] bArrM76050m = this.f60650w.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m.length, bArrM76050m), "keyHandle");
        byte[] bArrM76050m2 = this.f60651x.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m2.length, bArrM76050m2), "clientDataJSON");
        byte[] bArrM76050m3 = this.f60652y.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m3.length, bArrM76050m3), "authenticatorData");
        byte[] bArrM76050m4 = this.f60653z.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m4.length, bArrM76050m4), "signature");
        C25801t0 c25801t0 = this.f60649E;
        byte[] bArrM76050m5 = c25801t0 == null ? null : c25801t0.m76050m();
        if (bArrM76050m5 != null) {
            c15990r.m45157W(c25784l0.m76028c(bArrM76050m5.length, bArrM76050m5), "userHandle");
        }
        return c15990r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115325f(parcel, 2, this.f60650w.m76050m());
        AbstractC36221c.m115325f(parcel, 3, this.f60651x.m76050m());
        AbstractC36221c.m115325f(parcel, 4, this.f60652y.m76050m());
        AbstractC36221c.m115325f(parcel, 5, this.f60653z.m76050m());
        C25801t0 c25801t0 = this.f60649E;
        AbstractC36221c.m115325f(parcel, 6, c25801t0 == null ? null : c25801t0.m76050m());
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
