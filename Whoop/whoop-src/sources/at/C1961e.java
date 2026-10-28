package at;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import gs.C16138i0;
import gs.C16146o;
import gs.C16148q;
import gs.C16152u;
import ih0.AbstractC18489d0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p075ct.C11105a;
import p154fs.AbstractC14737o;
import p154fs.InterfaceC14723a;
import p200hs.AbstractC17595g;
import p200hs.AbstractC17596h;
import p200hs.C17593e;
import p200hs.C17598j;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import p715kotlin.jvm.internal.AbstractC22674j;
import se.AbstractC32411b;

/* JADX INFO: renamed from: at.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C1961e implements InterfaceC14723a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7772a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7773b;

    /* JADX INFO: renamed from: c */
    public final Object f7774c;

    public C1961e(int i13, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f7772a = i13;
        switch (i13) {
            case 2:
                this.f7774c = new C17598j(bArr, 1);
                this.f7773b = bArr2;
                return;
            case 3:
            default:
                this.f7774c = new C17598j(bArr, 0);
                this.f7773b = bArr2;
                return;
            case 4:
                if (!AbstractC18489d0.m53360a(1)) {
                    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
                }
                if (!m5989i()) {
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                if (bArr.length != 32) {
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                }
                this.f7773b = bArr;
                this.f7774c = bArr2;
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1961e m5983c(C5110q c5110q) throws GeneralSecurityException {
        byte[] bArrArray;
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        InterfaceC14723a interfaceC14723a = (InterfaceC14723a) AbstractC14737o.m42241a((C36391m3) c36379k3M116432G.m16347b(), InterfaceC14723a.class);
        EnumC36362h4 enumC36362h4 = (EnumC36362h4) c5099k0.f21437F;
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + enumC36362h4);
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new C1961e(interfaceC14723a, bArrArray);
    }

    /* JADX INFO: renamed from: d */
    public static C1961e m5984d(InterfaceC14723a interfaceC14723a, C11105a c11105a) {
        return new C1961e(interfaceC14723a, c11105a.m30035b());
    }

    /* JADX INFO: renamed from: e */
    public static C1961e m5985e(C16146o c16146o) throws GeneralSecurityException {
        C16148q c16148q = c16146o.f61343b;
        if (c16148q.f61353b != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + c16148q.f61353b);
        }
        if (c16148q.f61354c == 16) {
            return new C1961e(((C11105a) c16146o.f61344c.f130665x).m30035b(), c16146o.f61345d);
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + c16148q.f61354c);
    }

    /* JADX INFO: renamed from: f */
    public static C1961e m5986f(C16152u c16152u) {
        return new C1961e(1, ((C11105a) c16152u.f61367c.f130665x).m30035b(), c16152u.f61368d.m30035b());
    }

    /* JADX INFO: renamed from: g */
    public static C1961e m5987g(C16138i0 c16138i0) {
        return new C1961e(2, ((C11105a) c16138i0.f61293c.f130665x).m30035b(), c16138i0.f61294d.m30035b());
    }

    /* JADX INFO: renamed from: h */
    public static C1961e m5988h(C16138i0 c16138i0) {
        return new C1961e(4, ((C11105a) c16138i0.f61293c.f130665x).m30035b(), c16138i0.f61294d.m30035b());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m5989i() {
        return ((Cipher) C17593e.f68162f.get()) != null;
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f7772a) {
            case 0:
                if (bArr == null) {
                    throw new NullPointerException("plaintext is null");
                }
                byte[] bArrM101079W = AbstractC32411b.m101079W(12);
                AlgorithmParameterSpec algorithmParameterSpecM50112a = AbstractC17596h.m50112a(bArrM101079W);
                Cipher cipher = (Cipher) AbstractC17596h.f68170a.get();
                cipher.init(1, (SecretKeySpec) this.f7774c, algorithmParameterSpecM50112a);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                int outputSize = cipher.getOutputSize(bArr.length);
                byte[] bArr3 = this.f7773b;
                if (outputSize > 2147483635 - bArr3.length) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
                System.arraycopy(bArrM101079W, 0, bArrCopyOf, bArr3.length, 12);
                if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
                    return bArrCopyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrM101079W2 = AbstractC32411b.m101079W(12);
                byteBufferAllocate.put(bArrM101079W2);
                ((C17598j) this.f7774c).m7259l(byteBufferAllocate, bArrM101079W2, bArr, bArr2);
                byte[] bArrArray = byteBufferAllocate.array();
                byte[] bArr4 = this.f7773b;
                return bArr4.length == 0 ? bArrArray : AbstractC22674j.m65737w(bArr4, bArrArray);
            case 2:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrM101079W3 = AbstractC32411b.m101079W(24);
                byteBufferAllocate2.put(bArrM101079W3);
                ((C17598j) this.f7774c).m7259l(byteBufferAllocate2, bArrM101079W3, bArr, bArr2);
                byte[] bArrArray2 = byteBufferAllocate2.array();
                byte[] bArr5 = this.f7773b;
                return bArr5.length == 0 ? bArrArray2 : AbstractC22674j.m65737w(bArr5, bArrArray2);
            case 3:
                InterfaceC14723a interfaceC14723a = (InterfaceC14723a) this.f7774c;
                byte[] bArr6 = this.f7773b;
                return bArr6.length == 0 ? interfaceC14723a.mo5979a(bArr, bArr2) : AbstractC22674j.m65737w(bArr6, interfaceC14723a.mo5979a(bArr, bArr2));
            default:
                byte[] bArr7 = (byte[]) this.f7774c;
                if (bArr == null) {
                    throw new NullPointerException("plaintext is null");
                }
                byte[] bArrM101079W4 = AbstractC32411b.m101079W(24);
                SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC17595g.m50107a(this.f7773b, bArrM101079W4), "ChaCha20");
                byte[] bArr8 = new byte[12];
                System.arraycopy(bArrM101079W4, 16, bArr8, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr8);
                Cipher cipher2 = (Cipher) C17593e.f68162f.get();
                cipher2.init(1, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                int outputSize2 = cipher2.getOutputSize(bArr.length);
                if (outputSize2 > 2147483623 - bArr7.length) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArrCopyOf2 = Arrays.copyOf(bArr7, bArr7.length + 24 + outputSize2);
                System.arraycopy(bArrM101079W4, 0, bArrCopyOf2, bArr7.length, 24);
                if (cipher2.doFinal(bArr, 0, bArr.length, bArrCopyOf2, bArr7.length + 24) == outputSize2) {
                    return bArrCopyOf2;
                }
                throw new GeneralSecurityException("not enough data written");
        }
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) {
        switch (this.f7772a) {
            case 0:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                int length = bArr.length;
                byte[] bArr3 = this.f7773b;
                if (length < bArr3.length + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!AbstractC5113r0.m16077a(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr4 = new byte[12];
                System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
                AlgorithmParameterSpec algorithmParameterSpecM50112a = AbstractC17596h.m50112a(bArr4);
                Cipher cipher = (Cipher) AbstractC17596h.f68170a.get();
                cipher.init(2, (SecretKeySpec) this.f7774c, algorithmParameterSpecM50112a);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
            case 1:
                byte[] bArr5 = this.f7773b;
                if (bArr5.length == 0) {
                    return m5990j(bArr, bArr2);
                }
                if (AbstractC5113r0.m16077a(bArr5, bArr)) {
                    return m5990j(Arrays.copyOfRange(bArr, bArr5.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            case 2:
                byte[] bArr6 = this.f7773b;
                if (bArr6.length == 0) {
                    return m5991k(bArr, bArr2);
                }
                if (AbstractC5113r0.m16077a(bArr6, bArr)) {
                    return m5991k(Arrays.copyOfRange(bArr, bArr6.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            case 3:
                InterfaceC14723a interfaceC14723a = (InterfaceC14723a) this.f7774c;
                byte[] bArr7 = this.f7773b;
                if (bArr7.length == 0) {
                    return interfaceC14723a.mo5980b(bArr, bArr2);
                }
                if (AbstractC5113r0.m16077a(bArr7, bArr)) {
                    return interfaceC14723a.mo5980b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            default:
                byte[] bArr8 = (byte[]) this.f7774c;
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                if (bArr.length < bArr8.length + 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!AbstractC5113r0.m16077a(bArr8, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr9 = new byte[24];
                System.arraycopy(bArr, bArr8.length, bArr9, 0, 24);
                SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC17595g.m50107a(this.f7773b, bArr9), "ChaCha20");
                byte[] bArr10 = new byte[12];
                System.arraycopy(bArr9, 16, bArr10, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr10);
                Cipher cipher2 = (Cipher) C17593e.f68162f.get();
                cipher2.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                return cipher2.doFinal(bArr, bArr8.length + 24, (bArr.length - bArr8.length) - 24);
        }
    }

    /* JADX INFO: renamed from: j */
    public byte[] m5990j(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return ((C17598j) this.f7774c).m7258k(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    /* JADX INFO: renamed from: k */
    public byte[] m5991k(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return ((C17598j) this.f7774c).m7258k(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    public C1961e(byte[] bArr, C11105a c11105a) throws GeneralSecurityException {
        this.f7772a = 0;
        if (AbstractC18489d0.m53361b(2)) {
            AbstractC1959c0.m5971a(bArr.length);
            this.f7774c = new SecretKeySpec(bArr, "AES");
            this.f7773b = c11105a.m30035b();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public C1961e(InterfaceC14723a interfaceC14723a, byte[] bArr) {
        this.f7772a = 3;
        this.f7774c = interfaceC14723a;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f7773b = bArr;
    }
}
