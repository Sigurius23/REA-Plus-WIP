package is;

import at.AbstractC1959c0;
import at.C1956b;
import com.google.crypto.tink.internal.AbstractC5113r0;
import gs.C16149r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p031b9.AbstractC2875y;
import p075ct.C11105a;
import p154fs.InterfaceC14723a;
import p715kotlin.jvm.internal.AbstractC22674j;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: renamed from: is.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C20869a implements InterfaceC14723a {

    /* JADX INFO: renamed from: c */
    public static final byte[] f78511c = AbstractC32410a.m101055y("7a806c");

    /* JADX INFO: renamed from: d */
    public static final byte[] f78512d = AbstractC32410a.m101055y("46bb91c3c5");

    /* JADX INFO: renamed from: e */
    public static final byte[] f78513e = AbstractC32410a.m101055y("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f */
    public static final byte[] f78514f = AbstractC32410a.m101055y("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g */
    public static final byte[] f78515g = AbstractC32410a.m101055y("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h */
    public static final C1956b f78516h = new C1956b(9);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f78517a;

    /* JADX INFO: renamed from: b */
    public final byte[] f78518b;

    public C20869a(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f78518b = bArr2;
        AbstractC1959c0.m5971a(bArr.length);
        this.f78517a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m57650c(Cipher cipher) {
        try {
            byte[] bArr = f78514f;
            cipher.init(2, new SecretKeySpec(f78513e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f78512d);
            byte[] bArr2 = f78515g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f78511c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C20869a m57651d(C16149r c16149r) {
        return new C20869a(((C11105a) c16149r.f61357c.f130665x).m30035b(), c16149r.f61358d.m30035b());
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f78516h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrM101079W = AbstractC32411b.m101079W(12);
        System.arraycopy(bArrM101079W, 0, bArr3, 0, 12);
        cipher.init(1, this.f78517a, new GCMParameterSpec(128, bArrM101079W, 0, bArrM101079W.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int iDoFinal = cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal != bArr.length + 16) {
            throw new GeneralSecurityException(AbstractC2875y.m8296i(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        byte[] bArr4 = this.f78518b;
        return bArr4.length == 0 ? bArr3 : AbstractC22674j.m65737w(bArr4, bArr3);
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f78518b;
        if (bArr3.length == 0) {
            return m57652e(bArr, bArr2);
        }
        if (AbstractC5113r0.m16077a(bArr3, bArr)) {
            return m57652e(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m57652e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f78516h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f78517a, new GCMParameterSpec(128, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }
}
