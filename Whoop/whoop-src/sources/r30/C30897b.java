package r30;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import l83.C23468n;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;
import q30.C29926q0;

/* JADX INFO: renamed from: r30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30897b implements Serializable, Parcelable {
    public static final Parcelable.Creator<C30897b> CREATOR = new C29912j0(8);

    /* JADX INFO: renamed from: E */
    public final String f127385E;

    /* JADX INFO: renamed from: F */
    public final String f127386F;

    /* JADX INFO: renamed from: G */
    public final EnumC30896a f127387G;

    /* JADX INFO: renamed from: H */
    public final String f127388H;

    /* JADX INFO: renamed from: I */
    public final List f127389I;

    /* JADX INFO: renamed from: J */
    public final Boolean f127390J;

    /* JADX INFO: renamed from: K */
    public final Boolean f127391K;

    /* JADX INFO: renamed from: L */
    public final Boolean f127392L;

    /* JADX INFO: renamed from: w */
    public final String f127393w;

    /* JADX INFO: renamed from: x */
    public final String f127394x;

    /* JADX INFO: renamed from: y */
    public final String f127395y;

    /* JADX INFO: renamed from: z */
    public final C29926q0 f127396z;

    public C30897b(String messageVersion, String threeDsServerTransId, String acsTransId, C29926q0 sdkTransId, String str, String str2, EnumC30896a enumC30896a, String str3, List list, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC22676k.m65750j(messageVersion, "messageVersion");
        AbstractC22676k.m65750j(threeDsServerTransId, "threeDsServerTransId");
        AbstractC22676k.m65750j(acsTransId, "acsTransId");
        AbstractC22676k.m65750j(sdkTransId, "sdkTransId");
        this.f127393w = messageVersion;
        this.f127394x = threeDsServerTransId;
        this.f127395y = acsTransId;
        this.f127396z = sdkTransId;
        this.f127385E = str;
        this.f127386F = str2;
        this.f127387G = enumC30896a;
        this.f127388H = str3;
        this.f127389I = list;
        this.f127390J = bool;
        this.f127391K = bool2;
        this.f127392L = bool3;
    }

    /* JADX INFO: renamed from: b */
    public static C30897b m95018b(C30897b c30897b, String str, String str2, Boolean bool, int i13) {
        EnumC30896a enumC30896a = EnumC30896a.UserSelected;
        Boolean bool2 = Boolean.TRUE;
        String messageVersion = c30897b.f127393w;
        String threeDsServerTransId = c30897b.f127394x;
        String acsTransId = c30897b.f127395y;
        C29926q0 sdkTransId = c30897b.f127396z;
        String str3 = c30897b.f127385E;
        String str4 = (i13 & 32) != 0 ? c30897b.f127386F : str;
        if ((i13 & 64) != 0) {
            enumC30896a = c30897b.f127387G;
        }
        EnumC30896a enumC30896a2 = enumC30896a;
        String str5 = (i13 & 128) != 0 ? c30897b.f127388H : str2;
        List list = c30897b.f127389I;
        Boolean bool3 = (i13 & 512) != 0 ? c30897b.f127390J : bool2;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            bool2 = c30897b.f127391K;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c30897b.f127392L : bool;
        AbstractC22676k.m65750j(messageVersion, "messageVersion");
        AbstractC22676k.m65750j(threeDsServerTransId, "threeDsServerTransId");
        AbstractC22676k.m65750j(acsTransId, "acsTransId");
        AbstractC22676k.m65750j(sdkTransId, "sdkTransId");
        return new C30897b(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, str3, str4, enumC30896a2, str5, list, bool3, bool4, bool5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30897b)) {
            return false;
        }
        C30897b c30897b = (C30897b) obj;
        return AbstractC22676k.m65745e(this.f127393w, c30897b.f127393w) && AbstractC22676k.m65745e(this.f127394x, c30897b.f127394x) && AbstractC22676k.m65745e(this.f127395y, c30897b.f127395y) && AbstractC22676k.m65745e(this.f127396z, c30897b.f127396z) && AbstractC22676k.m65745e(this.f127385E, c30897b.f127385E) && AbstractC22676k.m65745e(this.f127386F, c30897b.f127386F) && this.f127387G == c30897b.f127387G && AbstractC22676k.m65745e(this.f127388H, c30897b.f127388H) && AbstractC22676k.m65745e(this.f127389I, c30897b.f127389I) && AbstractC22676k.m65745e(this.f127390J, c30897b.f127390J) && AbstractC22676k.m65745e(this.f127391K, c30897b.f127391K) && AbstractC22676k.m65745e(this.f127392L, c30897b.f127392L);
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m95019f() {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("messageType", "CReq").put("messageVersion", this.f127393w).put("sdkTransID", this.f127396z.f122226w).put("threeDSServerTransID", this.f127394x).put("acsTransID", this.f127395y);
            EnumC30896a enumC30896a = this.f127387G;
            if (enumC30896a != null) {
                jSONObjectPut.put("challengeCancel", enumC30896a.f127384w);
            }
            String str = this.f127385E;
            if (str != null && str.length() != 0) {
                jSONObjectPut.put("threeDSRequestorAppURL", str);
            }
            String str2 = this.f127386F;
            if (str2 != null && str2.length() != 0) {
                jSONObjectPut.put("challengeDataEntry", str2);
            }
            String str3 = this.f127388H;
            if (str3 != null && str3.length() != 0) {
                jSONObjectPut.put("challengeHTMLDataEntry", str3);
            }
            String str4 = "Y";
            if ((str2 == null || str2.length() == 0) && ((str3 == null || str3.length() == 0) && enumC30896a == null)) {
                jSONObjectPut.put("challengeNoEntry", "Y");
            }
            JSONArray jSONArrayM10371K = AbstractC3511b.m10371K(this.f127389I);
            if (jSONArrayM10371K != null) {
                jSONObjectPut.put("messageExtensions", jSONArrayM10371K);
            }
            Boolean bool = this.f127390J;
            if (bool != null) {
                jSONObjectPut.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.f127391K;
            if (bool2 != null) {
                jSONObjectPut.put("resendChallenge", bool2.booleanValue() ? "Y" : "N");
            }
            Boolean bool3 = this.f127392L;
            if (bool3 != null) {
                if (!bool3.booleanValue()) {
                    str4 = "N";
                }
                jSONObjectPut.put("whitelistingDataEntry", str4);
            }
            AbstractC22676k.m65747g(jSONObjectPut);
            return jSONObjectPut;
        } catch (Throwable th3) {
            Throwable thM68037a = C23468n.m68037a(AbstractC34132o.m107888l(th3));
            if (thM68037a == null) {
                throw new KotlinNothingValueException();
            }
            throw new SDKRuntimeException(thM68037a);
        }
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f127393w.hashCode() * 31, 31, this.f127394x), 31, this.f127395y), 31, this.f127396z.f122226w);
        String str = this.f127385E;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127386F;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC30896a enumC30896a = this.f127387G;
        int iHashCode3 = (iHashCode2 + (enumC30896a == null ? 0 : enumC30896a.hashCode())) * 31;
        String str3 = this.f127388H;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f127389I;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f127390J;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f127391K;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f127392L;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeRequestData(messageVersion=", this.f127393w, ", threeDsServerTransId=", this.f127394x, ", acsTransId=");
        sbM32001t.append(this.f127395y);
        sbM32001t.append(", sdkTransId=");
        sbM32001t.append(this.f127396z);
        sbM32001t.append(", threeDSRequestorAppURL=");
        AbstractC11266d.m30444B(sbM32001t, this.f127385E, ", challengeDataEntry=", this.f127386F, ", cancelReason=");
        sbM32001t.append(this.f127387G);
        sbM32001t.append(", challengeHtmlDataEntry=");
        sbM32001t.append(this.f127388H);
        sbM32001t.append(", messageExtensions=");
        sbM32001t.append(this.f127389I);
        sbM32001t.append(", oobContinue=");
        sbM32001t.append(this.f127390J);
        sbM32001t.append(", shouldResendChallenge=");
        sbM32001t.append(this.f127391K);
        sbM32001t.append(", whitelistingDataEntry=");
        sbM32001t.append(this.f127392L);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f127393w);
        dest.writeString(this.f127394x);
        dest.writeString(this.f127395y);
        this.f127396z.writeToParcel(dest, i13);
        dest.writeString(this.f127385E);
        dest.writeString(this.f127386F);
        EnumC30896a enumC30896a = this.f127387G;
        if (enumC30896a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30896a.name());
        }
        dest.writeString(this.f127388H);
        List list = this.f127389I;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C30903h) it.next()).writeToParcel(dest, i13);
            }
        }
        Boolean bool = this.f127390J;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        Boolean bool2 = this.f127391K;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool2);
        }
        Boolean bool3 = this.f127392L;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool3);
        }
    }

    public /* synthetic */ C30897b(String str, String str2, String str3, C29926q0 c29926q0, String str4, List list, int i13) {
        this(str, str2, str3, c29926q0, str4, null, null, null, (i13 & 256) != 0 ? null : list, null, null, null);
    }
}
