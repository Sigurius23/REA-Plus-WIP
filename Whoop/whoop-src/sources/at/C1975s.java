package at;

import com.google.crypto.tink.internal.AbstractC5113r0;
import gs.C16133g;
import gs.C16141k;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import p031b9.AbstractC2875y;
import p075ct.C11105a;
import p154fs.InterfaceC14723a;
import p715kotlin.jvm.internal.AbstractC22674j;
import se.AbstractC32411b;

/* JADX INFO: renamed from: at.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C1975s implements InterfaceC14723a {

    /* JADX INFO: renamed from: a */
    public final C1958c f7813a;

    /* JADX INFO: renamed from: b */
    public final C1982z f7814b;

    /* JADX INFO: renamed from: c */
    public final int f7815c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7816d;

    public C1975s(C1958c c1958c, C1982z c1982z, int i13, byte[] bArr) {
        this.f7813a = c1958c;
        this.f7814b = c1982z;
        this.f7815c = i13;
        this.f7816d = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static C1975s m6024c(C16133g c16133g) {
        byte[] bArrM30035b = ((C11105a) c16133g.f61273c.f130665x).m30035b();
        C16141k c16141k = c16133g.f61272b;
        C1958c c1958c = new C1958c(bArrM30035b, c16141k.f61327c);
        C1981y c1981y = new C1981y("HMAC" + c16141k.f61330f, new SecretKeySpec(((C11105a) c16133g.f61274d.f130665x).m30035b(), "HMAC"));
        int i13 = c16141k.f61328d;
        return new C1975s(c1958c, new C1982z(c1981y, i13), i13, c16133g.f61275e.m30035b());
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        C1958c c1958c = this.f7813a;
        int i13 = c1958c.f7763b;
        int i14 = Integer.MAX_VALUE - i13;
        if (length > i14) {
            throw new GeneralSecurityException(AbstractC2875y.m8295h(i14, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i13];
        byte[] bArrM101079W = AbstractC32411b.m101079W(i13);
        System.arraycopy(bArrM101079W, 0, bArr3, 0, i13);
        c1958c.m5970a(bArr, 0, bArr.length, bArr3, c1958c.f7763b, bArrM101079W, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC22674j.m65737w(this.f7816d, bArr3, this.f7814b.m6035a(AbstractC22674j.m65737w(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f7816d;
        int length2 = bArr3.length;
        int i13 = this.f7815c;
        if (length < length2 + i13) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!AbstractC5113r0.m16077a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, bArr.length - i13);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i13, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (!MessageDigest.isEqual(this.f7814b.m6035a(AbstractC22674j.m65737w(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        C1958c c1958c = this.f7813a;
        int i14 = c1958c.f7763b;
        if (length3 < i14) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr4 = new byte[i14];
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 0, i14);
        int length4 = bArrCopyOfRange.length;
        int i15 = c1958c.f7763b;
        byte[] bArr5 = new byte[length4 - i15];
        c1958c.m5970a(bArrCopyOfRange, i15, bArrCopyOfRange.length - i15, bArr5, 0, bArr4, false);
        return bArr5;
    }
}
