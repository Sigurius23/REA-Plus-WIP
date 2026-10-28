package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Map;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25247g0;
import m83.C25272z;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y00.z6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39016z6 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C39016z6> CREATOR = new C38943r5(24);

    /* JADX INFO: renamed from: E */
    public final String f167924E;

    /* JADX INFO: renamed from: F */
    public final String f167925F;

    /* JADX INFO: renamed from: G */
    public final String f167926G;

    /* JADX INFO: renamed from: H */
    public final int f167927H;

    /* JADX INFO: renamed from: I */
    public final String f167928I;

    /* JADX INFO: renamed from: w */
    public final String f167929w;

    /* JADX INFO: renamed from: x */
    public final String f167930x;

    /* JADX INFO: renamed from: y */
    public final String f167931y;

    /* JADX INFO: renamed from: z */
    public final String f167932z;

    public C39016z6(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i13, String str) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC22676k.m65750j(sdkAppId, "sdkAppId");
        AbstractC22676k.m65750j(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
        AbstractC22676k.m65750j(deviceData, "deviceData");
        AbstractC22676k.m65750j(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC22676k.m65750j(messageVersion, "messageVersion");
        this.f167929w = sourceId;
        this.f167930x = sdkAppId;
        this.f167931y = sdkReferenceNumber;
        this.f167932z = sdkTransactionId;
        this.f167924E = deviceData;
        this.f167925F = sdkEphemeralPublicKey;
        this.f167926G = messageVersion;
        this.f167927H = i13;
        this.f167928I = str;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m124405b() {
        Object objM107888l;
        try {
            objM107888l = new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) AbstractC37056f.m118959K("01", "02", "03", "04", "05")));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Object jSONObject = new JSONObject();
        if (objM107888l instanceof C23467m) {
            objM107888l = jSONObject;
        }
        return (JSONObject) objM107888l;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Object objM107888l;
        C23465k c23465k = new C23465k("source", this.f167929w);
        try {
            objM107888l = new JSONObject().put("sdkAppID", this.f167930x).put("sdkTransID", this.f167932z).put("sdkEncData", this.f167924E).put("sdkEphemPubKey", new JSONObject(this.f167925F)).put("sdkMaxTimeout", AbstractC39414r.m125895n0(2, String.valueOf(this.f167927H))).put("sdkReferenceNumber", this.f167931y).put("messageVersion", this.f167926G).put("deviceRenderOptions", m124405b());
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Object jSONObject = new JSONObject();
        if (objM107888l instanceof C23467m) {
            objM107888l = jSONObject;
        }
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, new C23465k("app", ((JSONObject) objM107888l).toString()));
        String str = this.f167928I;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("fallback_return_url", str) : null;
        if (mapM95645u == null) {
            mapM95645u = C25272z.f99163w;
        }
        return AbstractC25247g0.m73995d0(mapM73990Y, mapM95645u);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39016z6)) {
            return false;
        }
        C39016z6 c39016z6 = (C39016z6) obj;
        return AbstractC22676k.m65745e(this.f167929w, c39016z6.f167929w) && AbstractC22676k.m65745e(this.f167930x, c39016z6.f167930x) && AbstractC22676k.m65745e(this.f167931y, c39016z6.f167931y) && AbstractC22676k.m65745e(this.f167932z, c39016z6.f167932z) && AbstractC22676k.m65745e(this.f167924E, c39016z6.f167924E) && AbstractC22676k.m65745e(this.f167925F, c39016z6.f167925F) && AbstractC22676k.m65745e(this.f167926G, c39016z6.f167926G) && this.f167927H == c39016z6.f167927H && AbstractC22676k.m65745e(this.f167928I, c39016z6.f167928I);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f167927H, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f167929w.hashCode() * 31, 31, this.f167930x), 31, this.f167931y), 31, this.f167932z), 31, this.f167924E), 31, this.f167925F), 31, this.f167926G), 31);
        String str = this.f167928I;
        return iM30448b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Stripe3ds2AuthParams(sourceId=", this.f167929w, ", sdkAppId=", this.f167930x, ", sdkReferenceNumber=");
        AbstractC11266d.m30444B(sbM32001t, this.f167931y, ", sdkTransactionId=", this.f167932z, ", deviceData=");
        AbstractC11266d.m30444B(sbM32001t, this.f167924E, ", sdkEphemeralPublicKey=", this.f167925F, ", messageVersion=");
        AbstractC11266d.m30470x(this.f167927H, this.f167926G, ", maxTimeout=", ", returnUrl=", sbM32001t);
        return AbstractC25012a.m73376i(this.f167928I, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167929w);
        dest.writeString(this.f167930x);
        dest.writeString(this.f167931y);
        dest.writeString(this.f167932z);
        dest.writeString(this.f167924E);
        dest.writeString(this.f167925F);
        dest.writeString(this.f167926G);
        dest.writeInt(this.f167927H);
        dest.writeString(this.f167928I);
    }
}
