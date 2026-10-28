package gp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.C4999x5ced43e0;
import com.whoop.service.network.model.UserState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import mp.AbstractC25762e;
import mp.C25756c;
import mp.C25765f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C16053r extends AbstractC36219a {
    public static final Parcelable.Creator<C16053r> CREATOR = new C16040k0(0);

    /* JADX INFO: renamed from: E */
    public final Double f60711E;

    /* JADX INFO: renamed from: F */
    public final List f60712F;

    /* JADX INFO: renamed from: G */
    public final C16039k f60713G;

    /* JADX INFO: renamed from: H */
    public final Integer f60714H;

    /* JADX INFO: renamed from: I */
    public final C16020a0 f60715I;

    /* JADX INFO: renamed from: J */
    public final EnumC16023c f60716J;

    /* JADX INFO: renamed from: K */
    public final C16025d f60717K;

    /* JADX INFO: renamed from: L */
    public final String f60718L;

    /* JADX INFO: renamed from: M */
    public final ResultReceiver f60719M;

    /* JADX INFO: renamed from: w */
    public final C16058u f60720w;

    /* JADX INFO: renamed from: x */
    public final C16060w f60721x;

    /* JADX INFO: renamed from: y */
    public final byte[] f60722y;

    /* JADX INFO: renamed from: z */
    public final List f60723z;

    public C16053r(C16058u c16058u, C16060w c16060w, byte[] bArr, ArrayList arrayList, Double d3, ArrayList arrayList2, C16039k c16039k, Integer num, C16020a0 c16020a0, String str, C16025d c16025d, String str2, ResultReceiver resultReceiver) {
        this.f60719M = resultReceiver;
        if (str2 != null) {
            try {
                C16053r c16053rM45355b = m45355b(new JSONObject(str2));
                this.f60720w = c16053rM45355b.f60720w;
                this.f60721x = c16053rM45355b.f60721x;
                this.f60722y = c16053rM45355b.f60722y;
                this.f60723z = c16053rM45355b.f60723z;
                this.f60711E = c16053rM45355b.f60711E;
                this.f60712F = c16053rM45355b.f60712F;
                this.f60713G = c16053rM45355b.f60713G;
                this.f60714H = c16053rM45355b.f60714H;
                this.f60715I = c16053rM45355b.f60715I;
                this.f60716J = c16053rM45355b.f60716J;
                this.f60717K = c16053rM45355b.f60717K;
                this.f60718L = str2;
                return;
            } catch (JSONException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
        AbstractC35135w.m111094f(c16058u);
        this.f60720w = c16058u;
        AbstractC35135w.m111094f(c16060w);
        this.f60721x = c16060w;
        AbstractC35135w.m111094f(bArr);
        this.f60722y = bArr;
        AbstractC35135w.m111094f(arrayList);
        this.f60723z = arrayList;
        this.f60711E = d3;
        this.f60712F = arrayList2;
        this.f60713G = c16039k;
        this.f60714H = num;
        this.f60715I = c16020a0;
        if (str != null) {
            try {
                this.f60716J = EnumC16023c.m45340b(str);
            } catch (C4999x5ced43e0 e13) {
                throw new IllegalArgumentException(e13);
            }
        } else {
            this.f60716J = null;
        }
        this.f60717K = c16025d;
        this.f60718L = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:105:0x027a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0284  */
    /* JADX WARN: Code duplicated, block: B:109:0x0296  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:125:0x0306  */
    /* JADX WARN: Code duplicated, block: B:128:0x0310  */
    /* JADX WARN: Code duplicated, block: B:129:0x0322  */
    /* JADX WARN: Code duplicated, block: B:132:0x032c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0338  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x021f A[LOOP:3: B:97:0x0219->B:99:0x021f, LOOP_END] */
    /* JADX INFO: renamed from: b */
    public static C16053r m45355b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        C16039k c16039k;
        C16025d c16025d;
        EnumC16023c enumC16023cM45340b;
        int i13;
        C16038j0 c16038j0;
        C16038j0 c16038j0M45346b;
        C16050p0 c16050p0;
        C16022b0 c16022b0;
        C16056s0 c16056s0;
        C16030f0 c16030f0;
        C16032g0 c16032g0;
        C16052q0 c16052q0;
        C16034h0 c16034h0;
        C16049p c16049p;
        C16042l0 c16042l0;
        JSONArray jSONArray;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        JSONArray jSONArray2;
        String str2;
        AbstractC25762e c25765f;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        C16058u c16058u = new C16058u(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject(UserState.Sources.USER);
        C16060w c16060w = new C16060w(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), AbstractC40909b.m132599a(jSONObject3.getString("id")));
        byte[] bArrM132599a = AbstractC40909b.m132599a(jSONObject.getString("challenge"));
        AbstractC35135w.m111094f(bArrM132599a);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < jSONArray3.length(); i14++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i14);
            try {
                c25765f = new C25765f(new C16057t(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                c25765f = C25756c.f101470w;
            }
            if (c25765f.mo76009b()) {
                arrayList4.add(c25765f.mo76008a());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i15 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList5 = new ArrayList();
            int i16 = 0;
            while (i16 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i16);
                Parcelable.Creator<C16055s> creator = C16055s.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i15);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    arrayList3 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i17 = 0;
                    while (i17 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i17);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.m15622b(string2));
                            } catch (Transport.UnsupportedTransportException unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i17++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList3 = new ArrayList(hashSet);
                }
                arrayList5.add(new C16055s(string, bArrDecode, arrayList3));
                i16++;
                jSONArray4 = jSONArray4;
                str3 = str;
                i15 = 11;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            c16039k = new C16039k(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            c16039k = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            C16047o c16047o = jSONObject7.has("fidoAppIdExtension") ? new C16047o(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                c16047o = new C16047o(jSONObject7.getString("appid"));
            }
            C16047o c16047o2 = c16047o;
            if (!jSONObject7.has("prf")) {
                i13 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    c16038j0M45346b = C16038j0.m45346b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    c16038j0 = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList2 = new ArrayList();
                    while (i13 < jSONArray.length()) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i13);
                        arrayList2.add(new C16048o0(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                        i13++;
                    }
                    c16050p0 = new C16050p0(arrayList2);
                } else {
                    c16050p0 = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    c16022b0 = new C16022b0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    c16022b0 = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    c16056s0 = new C16056s0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    c16056s0 = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    c16030f0 = new C16030f0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    c16030f0 = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    c16032g0 = new C16032g0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    c16032g0 = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    c16052q0 = new C16052q0();
                } else {
                    c16052q0 = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    c16034h0 = new C16034h0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    c16034h0 = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    c16049p = new C16049p(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    c16049p = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    c16042l0 = new C16042l0(jSONObject7.getString("txAuthSimple"));
                } else {
                    c16042l0 = null;
                }
                c16025d = new C16025d(c16047o2, c16050p0, c16022b0, c16056s0, c16030f0, c16032g0, c16052q0, c16034h0, c16049p, c16038j0, c16042l0, null);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i13 = 0;
                c16038j0M45346b = C16038j0.m45346b(jSONObject7.getJSONObject("prf"), false);
            }
            c16038j0 = c16038j0M45346b;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList2 = new ArrayList();
                while (i13 < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i13);
                    arrayList2.add(new C16048o0(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                    i13++;
                }
                c16050p0 = new C16050p0(arrayList2);
            } else {
                c16050p0 = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                c16022b0 = new C16022b0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                c16022b0 = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                c16056s0 = new C16056s0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                c16056s0 = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                c16030f0 = new C16030f0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                c16030f0 = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                c16032g0 = new C16032g0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                c16032g0 = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                c16052q0 = new C16052q0();
            } else {
                c16052q0 = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                c16034h0 = new C16034h0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                c16034h0 = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                c16049p = new C16049p(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                c16049p = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                c16042l0 = new C16042l0(jSONObject7.getString("txAuthSimple"));
            } else {
                c16042l0 = null;
            }
            c16025d = new C16025d(c16047o2, c16050p0, c16022b0, c16056s0, c16030f0, c16032g0, c16052q0, c16034h0, c16049p, c16038j0, c16042l0, null);
        } else {
            c16025d = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                enumC16023cM45340b = EnumC16023c.m45340b(jSONObject.getString("attestation"));
            } catch (C4999x5ced43e0 e5) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e5);
                enumC16023cM45340b = EnumC16023c.NONE;
            }
        } else {
            enumC16023cM45340b = null;
        }
        return new C16053r(c16058u, c16060w, bArrM132599a, arrayList4, dValueOf, arrayList, c16039k, null, null, enumC16023cM45340b == null ? null : enumC16023cM45340b.f60623w, c16025d, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C16053r)) {
            return false;
        }
        C16053r c16053r = (C16053r) obj;
        List list2 = c16053r.f60723z;
        List list3 = c16053r.f60712F;
        if (AbstractC35135w.m111097i(this.f60720w, c16053r.f60720w) && AbstractC35135w.m111097i(this.f60721x, c16053r.f60721x) && Arrays.equals(this.f60722y, c16053r.f60722y) && AbstractC35135w.m111097i(this.f60711E, c16053r.f60711E)) {
            List list4 = this.f60723z;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f60712F) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && AbstractC35135w.m111097i(this.f60713G, c16053r.f60713G) && AbstractC35135w.m111097i(this.f60714H, c16053r.f60714H) && AbstractC35135w.m111097i(this.f60715I, c16053r.f60715I) && AbstractC35135w.m111097i(this.f60716J, c16053r.f60716J) && AbstractC35135w.m111097i(this.f60717K, c16053r.f60717K) && AbstractC35135w.m111097i(this.f60718L, c16053r.f60718L))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60720w, this.f60721x, Integer.valueOf(Arrays.hashCode(this.f60722y)), this.f60723z, this.f60711E, this.f60712F, this.f60713G, this.f60714H, this.f60715I, this.f60716J, this.f60717K, this.f60718L});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f60720w);
        String strValueOf2 = String.valueOf(this.f60721x);
        String strM132600b = AbstractC40909b.m132600b(this.f60722y);
        String strValueOf3 = String.valueOf(this.f60723z);
        String strValueOf4 = String.valueOf(this.f60712F);
        String strValueOf5 = String.valueOf(this.f60713G);
        String strValueOf6 = String.valueOf(this.f60715I);
        String strValueOf7 = String.valueOf(this.f60716J);
        String strValueOf8 = String.valueOf(this.f60717K);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        AbstractC11266d.m30444B(sbM32001t, strM132600b, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbM32001t.append(this.f60711E);
        sbM32001t.append(", \n excludeList=");
        sbM32001t.append(strValueOf4);
        sbM32001t.append(", \n authenticatorSelection=");
        sbM32001t.append(strValueOf5);
        sbM32001t.append(", \n requestId=");
        AbstractC13673n.m38577x(this.f60714H, ", \n tokenBinding=", strValueOf6, ", \n attestationConveyancePreference=", sbM32001t);
        return AbstractC11266d.m30464r(sbM32001t, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 2, this.f60720w, i13);
        AbstractC36221c.m115331l(parcel, 3, this.f60721x, i13);
        AbstractC36221c.m115325f(parcel, 4, this.f60722y);
        AbstractC36221c.m115336q(parcel, 5, this.f60723z);
        Double d3 = this.f60711E;
        if (d3 != null) {
            AbstractC36221c.m115337r(parcel, 6, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        AbstractC36221c.m115336q(parcel, 7, this.f60712F);
        AbstractC36221c.m115331l(parcel, 8, this.f60713G, i13);
        AbstractC36221c.m115330k(parcel, 9, this.f60714H);
        AbstractC36221c.m115331l(parcel, 10, this.f60715I, i13);
        EnumC16023c enumC16023c = this.f60716J;
        AbstractC36221c.m115332m(parcel, 11, enumC16023c == null ? null : enumC16023c.f60623w);
        AbstractC36221c.m115331l(parcel, 12, this.f60717K, i13);
        AbstractC36221c.m115332m(parcel, 13, this.f60718L);
        AbstractC36221c.m115331l(parcel, 14, this.f60719M, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
