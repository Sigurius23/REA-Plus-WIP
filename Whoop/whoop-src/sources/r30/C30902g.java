package r30;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;
import q30.C29926q0;

/* JADX INFO: renamed from: r30.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C30902g implements Parcelable {
    public static final Parcelable.Creator<C30902g> CREATOR = new C29912j0(12);

    /* JADX INFO: renamed from: E */
    public final EnumC30901f f127436E;

    /* JADX INFO: renamed from: F */
    public final String f127437F;

    /* JADX INFO: renamed from: G */
    public final String f127438G;

    /* JADX INFO: renamed from: H */
    public final String f127439H;

    /* JADX INFO: renamed from: I */
    public final String f127440I;

    /* JADX INFO: renamed from: J */
    public final C29926q0 f127441J;

    /* JADX INFO: renamed from: w */
    public final String f127442w;

    /* JADX INFO: renamed from: x */
    public final String f127443x;

    /* JADX INFO: renamed from: y */
    public final String f127444y;

    /* JADX INFO: renamed from: z */
    public final String f127445z;

    public /* synthetic */ C30902g(String str, String str2, String str3, String str4, String str5, String str6, String str7, C29926q0 c29926q0, int i13) {
        this(str, str2, null, str3, EnumC30901f.ThreeDsSdk, str4, str5, (i13 & 128) != 0 ? null : str6, str7, c29926q0);
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m95020b() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("messageType", "Erro").put("messageVersion", this.f127440I).put("sdkTransID", this.f127441J).put("errorCode", this.f127445z).put("errorDescription", this.f127437F).put("errorDetail", this.f127438G);
        String str = this.f127442w;
        if (str != null) {
            jSONObjectPut.put("threeDSServerTransID", str);
        }
        String str2 = this.f127443x;
        if (str2 != null) {
            jSONObjectPut.put("acsTransID", str2);
        }
        String str3 = this.f127444y;
        if (str3 != null) {
            jSONObjectPut.put("dsTransID", str3);
        }
        EnumC30901f enumC30901f = this.f127436E;
        if (enumC30901f != null) {
            jSONObjectPut.put("errorComponent", enumC30901f.f127435w);
        }
        String str4 = this.f127439H;
        if (str4 != null) {
            jSONObjectPut.put("errorMessageType", str4);
        }
        AbstractC22676k.m65747g(jSONObjectPut);
        return jSONObjectPut;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30902g)) {
            return false;
        }
        C30902g c30902g = (C30902g) obj;
        return AbstractC22676k.m65745e(this.f127442w, c30902g.f127442w) && AbstractC22676k.m65745e(this.f127443x, c30902g.f127443x) && AbstractC22676k.m65745e(this.f127444y, c30902g.f127444y) && AbstractC22676k.m65745e(this.f127445z, c30902g.f127445z) && this.f127436E == c30902g.f127436E && AbstractC22676k.m65745e(this.f127437F, c30902g.f127437F) && AbstractC22676k.m65745e(this.f127438G, c30902g.f127438G) && AbstractC22676k.m65745e(this.f127439H, c30902g.f127439H) && AbstractC22676k.m65745e(this.f127440I, c30902g.f127440I) && AbstractC22676k.m65745e(this.f127441J, c30902g.f127441J);
    }

    public final int hashCode() {
        String str = this.f127442w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f127443x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f127444y;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f127445z);
        EnumC30901f enumC30901f = this.f127436E;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (enumC30901f == null ? 0 : enumC30901f.hashCode())) * 31, 31, this.f127437F), 31, this.f127438G);
        String str4 = this.f127439H;
        int iM30450d3 = AbstractC11266d.m30450d((iM30450d2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f127440I);
        C29926q0 c29926q0 = this.f127441J;
        return iM30450d3 + (c29926q0 != null ? c29926q0.f122226w.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ErrorData(serverTransId=", this.f127442w, ", acsTransId=", this.f127443x, ", dsTransId=");
        AbstractC11266d.m30444B(sbM32001t, this.f127444y, ", errorCode=", this.f127445z, ", errorComponent=");
        sbM32001t.append(this.f127436E);
        sbM32001t.append(", errorDescription=");
        sbM32001t.append(this.f127437F);
        sbM32001t.append(", errorDetail=");
        AbstractC11266d.m30444B(sbM32001t, this.f127438G, ", errorMessageType=", this.f127439H, ", messageVersion=");
        sbM32001t.append(this.f127440I);
        sbM32001t.append(", sdkTransId=");
        sbM32001t.append(this.f127441J);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f127442w);
        dest.writeString(this.f127443x);
        dest.writeString(this.f127444y);
        dest.writeString(this.f127445z);
        EnumC30901f enumC30901f = this.f127436E;
        if (enumC30901f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30901f.name());
        }
        dest.writeString(this.f127437F);
        dest.writeString(this.f127438G);
        dest.writeString(this.f127439H);
        dest.writeString(this.f127440I);
        C29926q0 c29926q0 = this.f127441J;
        if (c29926q0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c29926q0.writeToParcel(dest, i13);
        }
    }

    public C30902g(String str, String str2, String str3, String errorCode, EnumC30901f enumC30901f, String errorDescription, String errorDetail, String str4, String messageVersion, C29926q0 c29926q0) {
        AbstractC22676k.m65750j(errorCode, "errorCode");
        AbstractC22676k.m65750j(errorDescription, "errorDescription");
        AbstractC22676k.m65750j(errorDetail, "errorDetail");
        AbstractC22676k.m65750j(messageVersion, "messageVersion");
        this.f127442w = str;
        this.f127443x = str2;
        this.f127444y = str3;
        this.f127445z = errorCode;
        this.f127436E = enumC30901f;
        this.f127437F = errorDescription;
        this.f127438G = errorDetail;
        this.f127439H = str4;
        this.f127440I = messageVersion;
        this.f127441J = c29926q0;
    }
}
