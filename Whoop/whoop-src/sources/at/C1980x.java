package at;

import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p075ct.C11105a;
import p505ts.C34118a;
import p505ts.InterfaceC34130m;
import p715kotlin.jvm.internal.AbstractC22674j;
import rs.AbstractC31780b;

/* JADX INFO: renamed from: at.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C1980x implements InterfaceC34130m {

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f7832a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7833b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7834c;

    public C1980x(byte[] bArr) throws GeneralSecurityException {
        AbstractC1959c0.m5971a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7832a = secretKeySpec;
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) C1977u.f7819b.f7825a.m6025a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrM98684e = AbstractC31780b.m98684e(cipher.doFinal(new byte[16]));
        this.f7833b = bArrM98684e;
        this.f7834c = AbstractC31780b.m98684e(bArrM98684e);
    }

    /* JADX INFO: renamed from: b */
    public static C1980x m6030b(C34118a c34118a) {
        return new C1980x(((C11105a) c34118a.f143032c.f130665x).m30035b());
    }

    @Override // p505ts.InterfaceC34130m
    /* JADX INFO: renamed from: a */
    public final byte[] mo6031a(int i13, byte[] bArr) {
        byte[] bArrM65714V;
        if (i13 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) C1977u.f7819b.f7825a.m6025a("AES/ECB/NoPadding");
        cipher.init(1, this.f7832a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrM65714V = AbstractC22674j.m65713U((iMax - 1) * 16, 0, 16, bArr, this.f7833b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrM65714V = AbstractC22674j.m65714V(bArrCopyOf, this.f7834c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i14 = 0; i14 < iMax - 1; i14++) {
            bArrDoFinal = cipher.doFinal(AbstractC22674j.m65713U(0, i14 * 16, 16, bArrDoFinal, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(AbstractC22674j.m65714V(bArrM65714V, bArrDoFinal)), i13);
    }
}
