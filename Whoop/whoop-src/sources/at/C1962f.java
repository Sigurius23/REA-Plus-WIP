package at;

import com.google.crypto.tink.internal.AbstractC5113r0;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ls.C24704a;
import p075ct.C11105a;
import p154fs.InterfaceC14725c;
import p715kotlin.jvm.internal.AbstractC22674j;
import rs.AbstractC31780b;

/* JADX INFO: renamed from: at.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C1962f implements InterfaceC14725c {

    /* JADX INFO: renamed from: d */
    public static final List f7775d = Arrays.asList(64);

    /* JADX INFO: renamed from: e */
    public static final byte[] f7776e = new byte[16];

    /* JADX INFO: renamed from: f */
    public static final byte[] f7777f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a */
    public final C1980x f7778a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7779b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7780c;

    public C1962f(byte[] bArr, C11105a c11105a) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f7775d.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(AbstractC18489d0.m53371l(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f7779b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f7778a = new C1980x(bArrCopyOfRange);
        this.f7780c = c11105a.m30035b();
    }

    /* JADX INFO: renamed from: c */
    public static C1962f m5992c(C24704a c24704a) {
        return new C1962f(((C11105a) c24704a.f96624b.f130665x).m30035b(), c24704a.f96625c);
    }

    @Override // p154fs.InterfaceC14725c
    /* JADX INFO: renamed from: a */
    public final byte[] mo5993a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) C1977u.f7819b.f7825a.m6025a("AES/CTR/NoPadding");
        byte[] bArrM5995d = m5995d(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrM5995d.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f7779b, "AES"), new IvParameterSpec(bArr3));
        return AbstractC22674j.m65737w(this.f7780c, bArrM5995d, cipher.doFinal(bArr));
    }

    @Override // p154fs.InterfaceC14725c
    /* JADX INFO: renamed from: b */
    public final byte[] mo5994b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f7780c;
        if (length < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!AbstractC5113r0.m16077a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) C1977u.f7819b.f7825a.m6025a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr3.length + 16);
        byte[] bArr4 = (byte[]) bArrCopyOfRange.clone();
        bArr4[8] = (byte) (bArr4[8] & 127);
        bArr4[12] = (byte) (bArr4[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f7779b, "AES"), new IvParameterSpec(bArr4));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length + 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, m5995d(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m5995d(byte[]... bArr) {
        byte[] bArrM65714V;
        int length = bArr.length;
        C1980x c1980x = this.f7778a;
        if (length == 0) {
            return c1980x.mo6031a(16, f7777f);
        }
        byte[] bArrMo6031a = c1980x.mo6031a(16, f7776e);
        for (int i13 = 0; i13 < bArr.length - 1; i13++) {
            byte[] bArr2 = bArr[i13];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrMo6031a = AbstractC22674j.m65714V(AbstractC31780b.m98684e(bArrMo6031a), c1980x.mo6031a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrMo6031a.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrMo6031a.length;
            bArrM65714V = Arrays.copyOf(bArr3, bArr3.length);
            for (int i14 = 0; i14 < bArrMo6031a.length; i14++) {
                int i15 = length2 + i14;
                bArrM65714V[i15] = (byte) (bArrM65714V[i15] ^ bArrMo6031a[i14]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrM65714V = AbstractC22674j.m65714V(bArrCopyOf, AbstractC31780b.m98684e(bArrMo6031a));
        }
        return c1980x.mo6031a(16, bArrM65714V);
    }
}
