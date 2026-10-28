package at;

import com.google.crypto.tink.internal.AbstractC5113r0;
import gs.C16143l;
import gs.C16145n;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p075ct.C11105a;
import p154fs.InterfaceC14723a;
import p715kotlin.jvm.internal.AbstractC22674j;
import se.AbstractC32411b;

/* JADX INFO: renamed from: at.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C1960d implements InterfaceC14723a {

    /* JADX INFO: renamed from: f */
    public static final C1956b f7765f = new C1956b(1);

    /* JADX INFO: renamed from: g */
    public static final C1956b f7766g = new C1956b(2);

    /* JADX INFO: renamed from: a */
    public final byte[] f7767a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7768b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7769c;

    /* JADX INFO: renamed from: d */
    public final SecretKeySpec f7770d;

    /* JADX INFO: renamed from: e */
    public final int f7771e;

    public C1960d(int i13, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i13 != 12 && i13 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f7771e = i13;
        AbstractC1959c0.m5971a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7770d = secretKeySpec;
        Cipher cipher = (Cipher) f7765f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM5977d = m5977d(cipher.doFinal(new byte[16]));
        this.f7767a = bArrM5977d;
        this.f7768b = m5977d(bArrM5977d);
        this.f7769c = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static C1960d m5976c(C16143l c16143l) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        C16145n c16145n = c16143l.f61332b;
        if (c16145n.f61341c == 16) {
            return new C1960d(c16145n.f61340b, ((C11105a) c16143l.f61333c.f130665x).m30035b(), c16143l.f61334d.m30035b());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c16145n.f61341c);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m5977d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i13 = 0;
        while (i13 < 15) {
            int i14 = i13 + 1;
            bArr2[i13] = (byte) (((bArr[i13] << 1) ^ ((bArr[i14] & 255) >>> 7)) & 255);
            i13 = i14;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m5978g(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            bArr3[i13] = (byte) (bArr[i13] ^ bArr2[i13]);
        }
        return bArr3;
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i13 = this.f7771e;
        if (length > 2147483631 - i13) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i13 + 16];
        byte[] bArrM101079W = AbstractC32411b.m101079W(i13);
        System.arraycopy(bArrM101079W, 0, bArr3, 0, i13);
        Cipher cipher = (Cipher) f7765f.get();
        SecretKeySpec secretKeySpec = this.f7770d;
        cipher.init(1, secretKeySpec);
        byte[] bArrM5981e = m5981e(cipher, 0, bArrM101079W, 0, bArrM101079W.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM5981e2 = m5981e(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f7766g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM5981e));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f7771e);
        byte[] bArrM5981e3 = m5981e(cipher, 2, bArr3, this.f7771e, bArr.length);
        int length2 = bArr.length + i13;
        for (int i14 = 0; i14 < 16; i14++) {
            bArr3[length2 + i14] = (byte) ((bArrM5981e2[i14] ^ bArrM5981e[i14]) ^ bArrM5981e3[i14]);
        }
        byte[] bArr5 = this.f7769c;
        return bArr5.length == 0 ? bArr3 : AbstractC22674j.m65737w(bArr5, bArr3);
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f7769c;
        if (bArr3.length == 0) {
            return m5982f(bArr, bArr2);
        }
        if (AbstractC5113r0.m16077a(bArr3, bArr)) {
            return m5982f(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m5981e(Cipher cipher, int i13, byte[] bArr, int i14, int i15) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i13;
        byte[] bArr3 = this.f7767a;
        if (i15 == 0) {
            return cipher.doFinal(m5978g(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i16 = 0;
        while (i15 - i16 > 16) {
            for (int i17 = 0; i17 < 16; i17++) {
                bArrDoFinal[i17] = (byte) (bArrDoFinal[i17] ^ bArr[(i14 + i16) + i17]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i16 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i16 + i14, i14 + i15);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = m5978g(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f7768b, 16);
            for (int i18 = 0; i18 < bArrCopyOfRange.length; i18++) {
                bArrCopyOf[i18] = (byte) (bArrCopyOf[i18] ^ bArrCopyOfRange[i18]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(m5978g(bArrDoFinal, bArrCopyOf));
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m5982f(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i13 = this.f7771e;
        int i14 = (length - i13) - 16;
        if (i14 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f7765f.get();
        SecretKeySpec secretKeySpec = this.f7770d;
        cipher.init(1, secretKeySpec);
        byte[] bArrM5981e = m5981e(cipher, 0, bArr, 0, this.f7771e);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM5981e2 = m5981e(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM5981e3 = m5981e(cipher, 2, bArr, this.f7771e, i14);
        int length2 = bArr.length - 16;
        byte b = 0;
        for (int i15 = 0; i15 < 16; i15++) {
            b = (byte) (b | (((bArr[length2 + i15] ^ bArrM5981e2[i15]) ^ bArrM5981e[i15]) ^ bArrM5981e3[i15]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f7766g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrM5981e));
        return cipher2.doFinal(bArr, i13, i14);
    }
}
