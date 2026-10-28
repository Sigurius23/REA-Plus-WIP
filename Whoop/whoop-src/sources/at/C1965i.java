package at;

import ih0.AbstractC18489d0;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import p154fs.InterfaceC14735m;
import p477s2.AbstractC32073e;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22674j;
import ws.C37579b;
import ws.C37581c;
import ws.C37582d;
import ws.C37583e;
import ws.C37594p;
import ws.C37596r;
import ws.C37597s;

/* JADX INFO: renamed from: at.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C1965i implements InterfaceC14735m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7784a = 0;

    /* JADX INFO: renamed from: b */
    public final String f7785b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7786c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7787d;

    /* JADX INFO: renamed from: e */
    public final PrivateKey f7788e;

    /* JADX INFO: renamed from: f */
    public final Serializable f7789f;

    public C1965i(RSAPrivateCrtKey rSAPrivateCrtKey, EnumC1979w enumC1979w, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1959c0.m5975e(enumC1979w);
        AbstractC1959c0.m5973c(rSAPrivateCrtKey.getModulus().bitLength());
        AbstractC1959c0.m5974d(rSAPrivateCrtKey.getPublicExponent());
        this.f7788e = rSAPrivateCrtKey;
        AbstractC1959c0.m5975e(enumC1979w);
        this.f7785b = enumC1979w + "withRSA";
        this.f7789f = (RSAPublicKey) ((KeyFactory) C1977u.f7824g.f7825a.m6025a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f7786c = bArr;
        this.f7787d = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static C1965i m5998a(C37582d c37582d) throws GeneralSecurityException {
        C37199o c37199o = C1966j.f7790f;
        C37583e c37583e = c37582d.f160718b;
        EnumC1979w enumC1979w = (EnumC1979w) c37199o.m119215U(c37583e.f160720b.f160716c);
        EnumC1973q enumC1973q = (EnumC1973q) C1966j.f7791g.m119215U(c37583e.f160720b.f160714a);
        C37199o c37199o2 = C1966j.f7792h;
        C37581c c37581c = c37583e.f160720b;
        C1965i c1965i = new C1965i(AbstractC32073e.m99712A((EnumC1972p) c37199o2.m119215U(c37581c.f160715b), ((BigInteger) c37582d.f160719c.f130665x).toByteArray()), enumC1979w, enumC1973q, c37582d.mo45680X().mo45678V().m30035b(), c37581c.f160717d.equals(C37579b.f160710j) ? new byte[]{0} : new byte[0]);
        try {
            C1966j.m6003a(c37583e).m6005c(c1965i.m6002e(new byte[]{1, 2, 3}), new byte[]{1, 2, 3});
            return c1965i;
        } catch (GeneralSecurityException e5) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1965i m5999b(C37596r c37596r) throws GeneralSecurityException {
        KeyFactory keyFactory = (KeyFactory) C1977u.f7824g.f7825a.m6025a("RSA");
        C37597s c37597s = c37596r.f160785b;
        C1965i c1965i = new C1965i((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c37597s.f160793c, c37597s.f160792b.f160782b, (BigInteger) c37596r.f160786c.f130665x, (BigInteger) c37596r.f160787d.f130665x, (BigInteger) c37596r.f160788e.f130665x, (BigInteger) c37596r.f160789f.f130665x, (BigInteger) c37596r.f160790g.f130665x, (BigInteger) c37596r.f160791h.f130665x)), (EnumC1979w) C1955a0.f7754e.m119215U(c37597s.f160792b.f160784d), c37596r.mo45680X().mo45678V().m30035b(), c37597s.f160792b.f160783c.equals(C37594p.f160777d) ? new byte[]{0} : new byte[0]);
        try {
            C1955a0.m5966a(c37597s).m5968c(c1965i.m6002e(new byte[]{1, 2, 3}), new byte[]{1, 2, 3});
            return c1965i;
        } catch (GeneralSecurityException e5) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public byte[] m6000c(byte[] bArr) throws GeneralSecurityException {
        Signature signature = (Signature) C1977u.f7821d.f7825a.m6026b(this.f7785b, C1977u.m6027b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) this.f7788e;
        signature.initSign(eCPrivateKey);
        signature.update(bArr);
        byte[] bArrSign = signature.sign();
        if (((EnumC1973q) this.f7789f) != EnumC1973q.f7806w) {
            return bArrSign;
        }
        int iM99760s = AbstractC32073e.m99760s(eCPrivateKey.getParams().getCurve()) * 2;
        if (!AbstractC32073e.m99724P(bArrSign)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr2 = new byte[iM99760s];
        int i13 = (bArrSign[1] & 255) >= 128 ? 3 : 2;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = bArrSign[i14];
        int i17 = bArrSign[i15] == 0 ? 1 : 0;
        System.arraycopy(bArrSign, i15 + i17, bArr2, ((iM99760s / 2) - i16) + i17, i16 - i17);
        int i18 = i16 + 1 + i15;
        int i19 = i18 + 1;
        int i24 = bArrSign[i18];
        int i25 = bArrSign[i19] != 0 ? 0 : 1;
        System.arraycopy(bArrSign, i19 + i25, bArr2, (iM99760s - i24) + i25, i24 - i25);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public byte[] m6001d(byte[] bArr) throws SignatureException, InvalidKeyException {
        C1977u c1977u = C1977u.f7821d;
        C1976t c1976t = c1977u.f7825a;
        String str = this.f7785b;
        Signature signature = (Signature) c1976t.m6025a(str);
        signature.initSign((RSAPrivateCrtKey) this.f7788e);
        signature.update(bArr);
        byte[] bArrSign = signature.sign();
        Signature signature2 = (Signature) c1977u.f7825a.m6025a(str);
        signature2.initVerify((RSAPublicKey) this.f7789f);
        signature2.update(bArr);
        if (signature2.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m6002e(byte[] bArr) {
        switch (this.f7784a) {
            case 0:
                byte[] bArr2 = this.f7787d;
                byte[] bArrM6000c = bArr2.length == 0 ? m6000c(bArr) : m6000c(AbstractC22674j.m65737w(bArr, bArr2));
                byte[] bArr3 = this.f7786c;
                return bArr3.length == 0 ? bArrM6000c : AbstractC22674j.m65737w(bArr3, bArrM6000c);
            default:
                byte[] bArr4 = this.f7787d;
                byte[] bArrM6001d = bArr4.length == 0 ? m6001d(bArr) : m6001d(AbstractC22674j.m65737w(bArr, bArr4));
                byte[] bArr5 = this.f7786c;
                return bArr5.length == 0 ? bArrM6001d : AbstractC22674j.m65737w(bArr5, bArrM6001d);
        }
    }

    public C1965i(ECPrivateKey eCPrivateKey, EnumC1979w enumC1979w, EnumC1973q enumC1973q, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (AbstractC18489d0.m53361b(2)) {
            this.f7788e = eCPrivateKey;
            AbstractC1959c0.m5975e(enumC1979w);
            this.f7785b = enumC1979w + "withECDSA";
            this.f7789f = enumC1973q;
            this.f7786c = bArr;
            this.f7787d = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
