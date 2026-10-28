package gp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import mp.AbstractC25753b;
import mp.AbstractC25769g0;
import mp.AbstractC25772h0;
import mp.AbstractC25775i0;
import mp.C25766f0;
import mp.C25778j0;
import org.json.JSONException;
import org.json.JSONObject;
import p076d.C11311s;
import p088dc.AbstractC11895b;
import p126eq.C13433b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16038j0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16038j0> CREATOR = new C13433b(29);

    /* JADX INFO: renamed from: x */
    public static final byte[] f60667x = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: w */
    public final byte[][] f60668w;

    public C16038j0(byte[][] bArr) {
        AbstractC35135w.m111089a(bArr != null);
        AbstractC35135w.m111089a(1 == ((bArr.length & 1) ^ 1));
        int i13 = 0;
        while (i13 < bArr.length) {
            AbstractC35135w.m111089a(i13 == 0 || bArr[i13] != null);
            int i14 = i13 + 1;
            AbstractC35135w.m111089a(bArr[i14] != null);
            int length = bArr[i14].length;
            AbstractC35135w.m111089a(length == 32 || length == 64);
            i13 += 2;
        }
        this.f60668w = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static C16038j0 m45346b(JSONObject jSONObject, boolean z4) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z4) {
                    arrayList.add(m45349i(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(m45350k(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(AbstractC40909b.m132599a(next));
                    if (z4) {
                        arrayList.add(m45349i(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(m45350k(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new C16038j0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m45347f(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m45348h(byte[] bArr) {
        C11311s c11311s;
        C25766f0 c25766f0;
        int i13 = AbstractC25775i0.f101490a;
        C25778j0 c25778j0 = AbstractC25772h0.f101486a;
        int i14 = c25778j0.f101495F;
        MessageDigest messageDigest = c25778j0.f101494E;
        if (c25778j0.f101496G) {
            try {
                c11311s = new C11311s((MessageDigest) messageDigest.clone(), i14);
            } catch (CloneNotSupportedException unused) {
                try {
                    c11311s = new C11311s(MessageDigest.getInstance(messageDigest.getAlgorithm()), i14);
                } catch (NoSuchAlgorithmException e5) {
                    throw new AssertionError(e5);
                }
            }
        } else {
            c11311s = new C11311s(MessageDigest.getInstance(messageDigest.getAlgorithm()), i14);
        }
        MessageDigest messageDigest2 = (MessageDigest) c11311s.f36246c;
        byte[] bArr2 = f60667x;
        bArr2.getClass();
        int length = bArr2.length;
        if (c11311s.f36245b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (c11311s.f36245b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (c11311s.f36245b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        c11311s.f36245b = true;
        int i15 = c11311s.f36244a;
        if (i15 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = AbstractC25769g0.f101483w;
            c25766f0 = new C25766f0(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i15);
            char[] cArr2 = AbstractC25769g0.f101483w;
            c25766f0 = new C25766f0(bArrCopyOf);
        }
        return (byte[]) c25766f0.f101481x.clone();
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m45349i(JSONObject jSONObject) throws JSONException {
        byte[] bArrM132599a = AbstractC40909b.m132599a(jSONObject.getString("first"));
        if (bArrM132599a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrM132599a;
        }
        byte[] bArrM132599a2 = AbstractC40909b.m132599a(jSONObject.getString("second"));
        if (bArrM132599a2.length == 32) {
            return AbstractC25753b.m75998j(bArrM132599a, bArrM132599a2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m45350k(JSONObject jSONObject) {
        byte[] bArrM45348h = m45348h(AbstractC40909b.m132599a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrM45348h : AbstractC25753b.m75998j(bArrM45348h, m45348h(AbstractC40909b.m132599a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16038j0) {
            return Arrays.deepEquals(this.f60668w, ((C16038j0) obj).f60668w);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f60668w) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.f60668w;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i13 = 0; i13 < bArr.length; i13 += 2) {
                if (bArr[i13] == null) {
                    jSONObject.put("eval", m45347f(bArr[i13 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(AbstractC40909b.m132600b(bArr[i13]), m45347f(bArr[i13 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e5) {
            return AbstractC11895b.m31996o("PrfExtension{Exception:", e5.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        byte[][] bArr = this.f60668w;
        if (bArr != null) {
            int iM115338s2 = AbstractC36221c.m115338s(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            AbstractC36221c.m115339t(parcel, iM115338s2);
        }
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
