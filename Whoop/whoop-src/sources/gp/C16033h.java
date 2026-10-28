package gp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzho;
import gm.C15990r;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import mp.AbstractC25753b;
import mp.AbstractC25755b1;
import mp.C25752a1;
import mp.C25761d1;
import mp.C25784l0;
import mp.C25789n0;
import mp.C25798s;
import mp.C25799s0;
import mp.C25801t0;
import mp.C25809x0;
import mp.C25811y0;
import mp.C25813z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36221c;
import p687zo.AbstractC40909b;

/* JADX INFO: renamed from: gp.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16033h extends AbstractC16037j {
    public static final Parcelable.Creator<C16033h> CREATOR = new C16040k0(22);

    /* JADX INFO: renamed from: w */
    public final C25801t0 f60655w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60656x;

    /* JADX INFO: renamed from: y */
    public final C25801t0 f60657y;

    /* JADX INFO: renamed from: z */
    public final String[] f60658z;

    public C16033h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        AbstractC35135w.m111094f(bArr);
        C25801t0 c25801t0M76048l = C25801t0.m76048l(bArr.length, bArr);
        AbstractC35135w.m111094f(bArr2);
        C25801t0 c25801t0M76048l2 = C25801t0.m76048l(bArr2.length, bArr2);
        AbstractC35135w.m111094f(bArr3);
        C25801t0 c25801t0M76048l3 = C25801t0.m76048l(bArr3.length, bArr3);
        this.f60655w = c25801t0M76048l;
        this.f60656x = c25801t0M76048l2;
        this.f60657y = c25801t0M76048l3;
        AbstractC35135w.m111094f(strArr);
        this.f60658z = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0145 A[Catch: JSONException -> 0x0021, zzho -> 0x01a9, TRY_LEAVE, TryCatch #7 {zzho -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3 A[Catch: JSONException -> 0x0021, zzho -> 0x01a9, TryCatch #7 {zzho -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0 A[Catch: JSONException -> 0x0021, zzho -> 0x01a9, TryCatch #7 {zzho -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5 A[Catch: JSONException -> 0x0021, zzho -> 0x01a9, TryCatch #7 {zzho -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fb A[Catch: JSONException -> 0x0021, zzho -> 0x01a9, TryCatch #7 {zzho -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0221  */
    /* JADX INFO: renamed from: b */
    public final JSONObject m45345b() {
        AbstractC25755b1 abstractC25755b1;
        AbstractC25755b1 abstractC25755b2;
        C25801t0 c25801t0;
        String[] strArr = this.f60658z;
        try {
            JSONObject jSONObject = new JSONObject();
            C25801t0 c25801t1 = this.f60656x;
            if (c25801t1 != null) {
                jSONObject.put("clientDataJSON", AbstractC40909b.m132600b(c25801t1.m76050m()));
            }
            C25801t0 c25801t2 = this.f60657y;
            if (c25801t2 != null) {
                jSONObject.put("attestationObject", AbstractC40909b.m132600b(c25801t2.m76050m()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (strArr[i13].equals("cable")) {
                    jSONArray.put(i13, "hybrid");
                } else {
                    jSONArray.put(i13, strArr[i13]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    AbstractC25755b1 abstractC25755b3 = (AbstractC25755b1) ((C25813z0) AbstractC25755b1.m76005e(c25801t2.m76050m()).m76007c(C25813z0.class)).f101564x.get(new C25752a1("authData"));
                    if (abstractC25755b3 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    C25801t0 c25801t3 = ((C25809x0) abstractC25755b3.m76007c(C25809x0.class)).f101551w;
                    byte[] bArr = c25801t3.f101541x;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, c25801t3.mo76042e()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            try {
                                int iPosition = byteBufferAsReadOnlyBuffer.position();
                                int iM76047j = C25801t0.m76047j(iPosition, bArr.length, c25801t3.mo76042e());
                                C25761d1 c25761d1 = new C25761d1((iM76047j == 0 ? C25801t0.f101539y : new C25799s0(bArr, iPosition, iM76047j)).m76049g());
                                try {
                                    AbstractC25755b1 abstractC25755b1M75999k = AbstractC25753b.m75999k(c25761d1);
                                    try {
                                        c25761d1.close();
                                    } catch (IOException unused) {
                                    }
                                    C25798s c25798s = ((C25813z0) abstractC25755b1M75999k.m76007c(C25813z0.class)).f101564x;
                                    AbstractC25755b1 abstractC25755b4 = (AbstractC25755b1) c25798s.get(new C25811y0(3L));
                                    AbstractC25755b1 abstractC25755b5 = (AbstractC25755b1) c25798s.get(new C25811y0(1L));
                                    if (abstractC25755b4 == null || abstractC25755b5 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j7 = ((C25811y0) abstractC25755b4.m76007c(C25811y0.class)).f101555w;
                                        long j13 = ((C25811y0) abstractC25755b5.m76007c(C25811y0.class)).f101555w;
                                        byte[] bArrM75998j = null;
                                        if (j13 == 1) {
                                            abstractC25755b1 = (AbstractC25755b1) c25798s.get(new C25811y0(-1L));
                                            if (abstractC25755b1 != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j14 = ((C25811y0) abstractC25755b1.m76007c(C25811y0.class)).f101555w;
                                            if (j13 != 2 && j14 == 1) {
                                                AbstractC25755b1 abstractC25755b6 = (AbstractC25755b1) c25798s.get(new C25811y0(-2L));
                                                AbstractC25755b1 abstractC25755b7 = (AbstractC25755b1) c25798s.get(new C25811y0(-3L));
                                                if (abstractC25755b6 == null || abstractC25755b7 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                C25801t0 c25801t4 = ((C25809x0) abstractC25755b6.m76007c(C25809x0.class)).f101551w;
                                                C25801t0 c25801t5 = ((C25809x0) abstractC25755b7.m76007c(C25809x0.class)).f101551w;
                                                if (c25801t4.f101541x.length != 32 || c25801t5.f101541x.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrM75998j = AbstractC25753b.m75998j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), c25801t4.m76050m(), c25801t5.m76050m());
                                            } else if (j13 == 1 && j14 == 6) {
                                                abstractC25755b2 = (AbstractC25755b1) c25798s.get(new C25811y0(-2L));
                                                if (abstractC25755b2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                c25801t0 = ((C25809x0) abstractC25755b2.m76007c(C25809x0.class)).f101551w;
                                                if (c25801t0.f101541x.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrM75998j = AbstractC25753b.m75998j(Base64.decode("MCowBQYDK2VwAyEA", 0), c25801t0.m76050m());
                                            }
                                        } else if (j13 == 2) {
                                            j13 = 2;
                                            abstractC25755b1 = (AbstractC25755b1) c25798s.get(new C25811y0(-1L));
                                            if (abstractC25755b1 != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j15 = ((C25811y0) abstractC25755b1.m76007c(C25811y0.class)).f101555w;
                                            if (j13 != 2) {
                                                if (j13 == 1) {
                                                    abstractC25755b2 = (AbstractC25755b1) c25798s.get(new C25811y0(-2L));
                                                    if (abstractC25755b2 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    c25801t0 = ((C25809x0) abstractC25755b2.m76007c(C25809x0.class)).f101551w;
                                                    if (c25801t0.f101541x.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArrM75998j = AbstractC25753b.m75998j(Base64.decode("MCowBQYDK2VwAyEA", 0), c25801t0.m76050m());
                                                }
                                            } else if (j13 == 1) {
                                                abstractC25755b2 = (AbstractC25755b1) c25798s.get(new C25811y0(-2L));
                                                if (abstractC25755b2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                c25801t0 = ((C25809x0) abstractC25755b2.m76007c(C25809x0.class)).f101551w;
                                                if (c25801t0.f101541x.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrM75998j = AbstractC25753b.m75998j(Base64.decode("MCowBQYDK2VwAyEA", 0), c25801t0.m76050m());
                                            }
                                        }
                                        byte[] bArr2 = bArrM75998j;
                                        jSONObject.put("authenticatorData", AbstractC40909b.m132600b(c25801t3.m76050m()));
                                        jSONObject.put("publicKeyAlgorithm", j7);
                                        if (bArr2 != null) {
                                            jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                        }
                                        return jSONObject;
                                    } catch (zzho e5) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e5);
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        c25761d1.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th3;
                                }
                            } catch (zzhj e13) {
                                e = e13;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (zzho e14) {
                            e = e14;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e15) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e15);
                    }
                } catch (zzho e16) {
                    throw new IllegalArgumentException("authData value has wrong type", e16);
                }
            } catch (zzhj e17) {
                e = e17;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e18) {
                e = e18;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e19) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e19);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16033h)) {
            return false;
        }
        C16033h c16033h = (C16033h) obj;
        return AbstractC35135w.m111097i(this.f60655w, c16033h.f60655w) && AbstractC35135w.m111097i(this.f60656x, c16033h.f60656x) && AbstractC35135w.m111097i(this.f60657y, c16033h.f60657y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f60655w})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f60656x})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f60657y}))});
    }

    public final String toString() {
        C15990r c15990r = new C15990r(getClass().getSimpleName());
        C25784l0 c25784l0 = C25789n0.f101516d;
        byte[] bArrM76050m = this.f60655w.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m.length, bArrM76050m), "keyHandle");
        byte[] bArrM76050m2 = this.f60656x.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m2.length, bArrM76050m2), "clientDataJSON");
        byte[] bArrM76050m3 = this.f60657y.m76050m();
        c15990r.m45157W(c25784l0.m76028c(bArrM76050m3.length, bArrM76050m3), "attestationObject");
        c15990r.m45157W(Arrays.toString(this.f60658z), "transports");
        return c15990r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115325f(parcel, 2, this.f60655w.m76050m());
        AbstractC36221c.m115325f(parcel, 3, this.f60656x.m76050m());
        AbstractC36221c.m115325f(parcel, 4, this.f60657y.m76050m());
        AbstractC36221c.m115333n(parcel, 5, this.f60658z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
