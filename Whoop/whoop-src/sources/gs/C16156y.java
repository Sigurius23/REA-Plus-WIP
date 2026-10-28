package gs;

import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5115t;
import com.google.crypto.tink.internal.C5120y;
import com.google.crypto.tink.internal.C5121z;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import com.google.crypto.tink.shaded.protobuf.C5143h;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p154fs.AbstractC14724b;
import p154fs.AbstractC14733k;
import p154fs.InterfaceC14723a;
import p505ts.AbstractC34132o;
import p560vs.C36403o3;
import p560vs.C36409p3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import ps.C29500b;

/* JADX INFO: renamed from: gs.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C16156y implements InterfaceC14723a {

    /* JADX INFO: renamed from: d */
    public static final byte[] f61377d = new byte[0];

    /* JADX INFO: renamed from: e */
    public static final Set f61378e;

    /* JADX INFO: renamed from: a */
    public final String f61379a;

    /* JADX INFO: renamed from: b */
    public final AbstractC14733k f61380b;

    /* JADX INFO: renamed from: c */
    public final C29500b f61381c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f61378e = Collections.unmodifiableSet(hashSet);
    }

    public C16156y(C36409p3 c36409p3, C29500b c29500b) {
        if (!f61378e.contains(c36409p3.m116534E())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + c36409p3.m116534E() + ". Only Tink AEAD key types are supported.");
        }
        this.f61379a = c36409p3.m116534E();
        C36403o3 c36403o3M116530H = C36409p3.m116530H(c36409p3);
        c36403o3M116530H.m116483g(EnumC36362h4.RAW);
        this.f61380b = AbstractC14724b.m42225b(((C36409p3) c36403o3M116530H.m16347b()).m16108e());
        this.f61381c = c29500b;
    }

    /* JADX INFO: renamed from: c */
    public static C16156y m45696c(AbstractC16127d abstractC16127d, C29500b c29500b) throws GeneralSecurityException {
        try {
            return new C16156y(C36409p3.m116531I(AbstractC14724b.m42226c(abstractC16127d), C5167p.m16298a()), c29500b);
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: a */
    public final byte[] mo5979a(byte[] bArr, byte[] bArr2) {
        AbstractC34132o abstractC34132oM16082b = C5115t.f21463b.m16082b(this.f61380b);
        byte[] bArrMo5979a = this.f61381c.mo5979a(((AbstractC5146i) ((C5099k0) C5121z.f21474b.m16097g(abstractC34132oM16082b)).f21441z).m16174g(), f61377d);
        byte[] bArrMo5979a2 = ((InterfaceC14723a) C5120y.f21472b.m16088b(abstractC34132oM16082b, InterfaceC14723a.class)).mo5979a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo5979a.length + 4 + bArrMo5979a2.length).putInt(bArrMo5979a.length).put(bArrMo5979a).put(bArrMo5979a2).array();
    }

    @Override // p154fs.InterfaceC14723a
    /* JADX INFO: renamed from: b */
    public final byte[] mo5980b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i13 = byteBufferWrap.getInt();
            if (i13 <= 0 || i13 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i13];
            byteBufferWrap.get(bArr3, 0, i13);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrMo5980b = this.f61381c.mo5980b(bArr3, f61377d);
            String str = this.f61379a;
            C5143h c5143h = AbstractC5146i.f21514x;
            return ((InterfaceC14723a) C5120y.f21472b.m16088b(C5121z.f21474b.m16091a(C5099k0.m15980m(str, AbstractC5146i.m16173d(bArrMo5980b, 0, bArrMo5980b.length), EnumC36385l3.SYMMETRIC, EnumC36362h4.RAW, null)), InterfaceC14723a.class)).mo5980b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e13) {
            e = e13;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e14) {
            e = e14;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
