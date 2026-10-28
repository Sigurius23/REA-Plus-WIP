package at;

import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5088f;
import ih0.AbstractC18489d0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import p154fs.InterfaceC14736n;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22674j;
import se.AbstractC32410a;
import ws.C37593o;
import ws.C37594p;
import ws.C37595q;
import ws.C37597s;

/* JADX INFO: renamed from: at.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1955a0 implements InterfaceC14736n {

    /* JADX INFO: renamed from: e */
    public static final C37199o f7754e;

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f7755a;

    /* JADX INFO: renamed from: b */
    public final EnumC1979w f7756b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7757c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7758d;

    static {
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC1979w.f7830y, C37593o.f160771b);
        c5088fM119196j.m15967a(EnumC1979w.f7831z, C37593o.f160772c);
        c5088fM119196j.m15967a(EnumC1979w.f7826E, C37593o.f160773d);
        f7754e = c5088fM119196j.m15968b();
    }

    public C1955a0(RSAPublicKey rSAPublicKey, EnumC1979w enumC1979w, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1959c0.m5975e(enumC1979w);
        AbstractC1959c0.m5973c(rSAPublicKey.getModulus().bitLength());
        AbstractC1959c0.m5974d(rSAPublicKey.getPublicExponent());
        this.f7755a = rSAPublicKey;
        this.f7756b = enumC1979w;
        this.f7757c = bArr;
        this.f7758d = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static C1955a0 m5966a(C37597s c37597s) {
        KeyFactory keyFactory = (KeyFactory) C1977u.f7824g.f7825a.m6025a("RSA");
        BigInteger bigInteger = c37597s.f160793c;
        C37595q c37595q = c37597s.f160792b;
        return new C1955a0((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c37595q.f160782b)), (EnumC1979w) f7754e.m119215U(c37595q.f160784d), c37597s.f160794d.m30035b(), c37595q.f160783c.equals(C37594p.f160777d) ? new byte[]{0} : new byte[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m5967b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        String str;
        byte[] bArrM101055y;
        RSAPublicKey rSAPublicKey = this.f7755a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigIntegerM15934g = AbstractC5078a.m15934g(bArr);
        if (bigIntegerM15934g.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrM15950w = AbstractC5078a.m15950w(iBitLength, bigIntegerM15934g.modPow(publicExponent, modulus));
        EnumC1979w enumC1979w = this.f7756b;
        AbstractC1959c0.m5975e(enumC1979w);
        C1977u c1977u = C1977u.f7822e;
        int iOrdinal = enumC1979w.ordinal();
        if (iOrdinal == 0) {
            str = "SHA-1";
        } else if (iOrdinal == 1) {
            str = "SHA-224";
        } else if (iOrdinal == 2) {
            str = "SHA-256";
        } else if (iOrdinal == 3) {
            str = "SHA-384";
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash " + enumC1979w);
            }
            str = "SHA-512";
        }
        MessageDigest messageDigest = (MessageDigest) c1977u.f7825a.m6025a(str);
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal2 = enumC1979w.ordinal();
        int i13 = 2;
        if (iOrdinal2 == 2) {
            bArrM101055y = AbstractC32410a.m101055y("3031300d060960864801650304020105000420");
        } else if (iOrdinal2 == 3) {
            bArrM101055y = AbstractC32410a.m101055y("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal2 != 4) {
                throw new GeneralSecurityException("Unsupported hash " + enumC1979w);
            }
            bArrM101055y = AbstractC32410a.m101055y("3051300d060960864801650304020305000440");
        }
        int length = bArrM101055y.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr3 = new byte[iBitLength];
        bArr3[0] = 0;
        bArr3[1] = 1;
        int i14 = 0;
        while (i14 < (iBitLength - length) - 3) {
            bArr3[i13] = -1;
            i14++;
            i13++;
        }
        int i15 = i13 + 1;
        bArr3[i13] = 0;
        System.arraycopy(bArrM101055y, 0, bArr3, i15, bArrM101055y.length);
        System.arraycopy(bArrDigest, 0, bArr3, i15 + bArrM101055y.length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrM15950w, bArr3)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5968c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f7757c;
        int length = bArr3.length;
        byte[] bArr4 = this.f7758d;
        if (length == 0 && bArr4.length == 0) {
            m5967b(bArr, bArr2);
        } else {
            if (!AbstractC5113r0.m16077a(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            if (bArr4.length != 0) {
                bArr2 = AbstractC22674j.m65737w(bArr2, bArr4);
            }
            m5967b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }
}
