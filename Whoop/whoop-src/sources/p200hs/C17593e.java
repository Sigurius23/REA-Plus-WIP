package p200hs;

import at.C1956b;
import com.google.crypto.tink.internal.AbstractC5113r0;
import gs.C16152u;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p075ct.C11105a;
import p154fs.InterfaceC14723a;
import se.AbstractC32410a;
import se.AbstractC32411b;

/* JADX INFO: renamed from: hs.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17593e implements InterfaceC14723a {

    /* JADX INFO: renamed from: c */
    public static final byte[] f68159c = AbstractC32410a.m101055y("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: d */
    public static final byte[] f68160d = AbstractC32410a.m101055y("070000004041424344454647");

    /* JADX INFO: renamed from: e */
    public static final byte[] f68161e = AbstractC32410a.m101055y("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: f */
    public static final C1956b f68162f = new C1956b(7);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f68163a;

    /* JADX INFO: renamed from: b */
    public final byte[] f68164b;

    public C17593e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!m50104e()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f68163a = new SecretKeySpec(bArr, "ChaCha20");
        this.f68164b = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m50102c(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f68160d);
            byte[] bArr = f68159c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f68161e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C17593e m50103d(C16152u c16152u) {
        return new C17593e(((C11105a) c16152u.f61367c.f130665x).m30035b(), c16152u.f61368d.m30035b());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m50104e() {
        return f68162f.get() != null;
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrM101079W = AbstractC32411b.m101079W(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrM101079W);
        Cipher cipher = (Cipher) f68162f.get();
        cipher.init(1, this.f68163a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f68164b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrM101079W, 0, bArrCopyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f68164b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!AbstractC5113r0.m16077a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f68162f.get();
        cipher.init(2, this.f68163a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
