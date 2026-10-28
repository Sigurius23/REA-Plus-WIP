package at;

import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: at.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C1958c {

    /* JADX INFO: renamed from: d */
    public static final C1956b f7761d = new C1956b(0);

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f7762a;

    /* JADX INFO: renamed from: b */
    public final int f7763b;

    /* JADX INFO: renamed from: c */
    public final int f7764c;

    public C1958c(byte[] bArr, int i13) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC1959c0.m5971a(bArr.length);
        this.f7762a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f7761d.get()).getBlockSize();
        this.f7764c = blockSize;
        if (i13 < 12 || i13 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f7763b = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m5970a(byte[] bArr, int i13, int i14, byte[] bArr2, int i15, byte[] bArr3, boolean z4) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f7761d.get();
        byte[] bArr4 = new byte[this.f7764c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f7763b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f7762a;
        if (z4) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i13, i14, bArr2, i15) != i14) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
