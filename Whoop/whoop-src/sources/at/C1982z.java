package at;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
import p075ct.C11105a;
import p154fs.InterfaceC14732j;
import p436qs.C30557a;
import p436qs.C30559c;
import p436qs.C30560d;
import p436qs.C30564h;
import p436qs.C30567k;
import p436qs.C30568l;
import p505ts.InterfaceC34130m;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: at.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C1982z implements InterfaceC14732j {

    /* JADX INFO: renamed from: e */
    public static final byte[] f7839e = {0};

    /* JADX INFO: renamed from: a */
    public final InterfaceC34130m f7840a;

    /* JADX INFO: renamed from: b */
    public final int f7841b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7842c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7843d;

    public C1982z(C1981y c1981y, int i13) throws InvalidAlgorithmParameterException {
        this.f7840a = c1981y;
        this.f7841b = i13;
        this.f7842c = new byte[0];
        this.f7843d = new byte[0];
        if (i13 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        c1981y.mo6031a(i13, new byte[0]);
    }

    /* JADX INFO: renamed from: b */
    public static C1982z m6033b(C30557a c30557a) {
        return new C1982z(c30557a);
    }

    /* JADX INFO: renamed from: c */
    public static C1982z m6034c(C30564h c30564h) {
        return new C1982z(c30564h);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m6035a(byte[] bArr) {
        byte[] bArr2 = this.f7843d;
        int length = bArr2.length;
        int i13 = this.f7841b;
        InterfaceC34130m interfaceC34130m = this.f7840a;
        byte[] bArr3 = this.f7842c;
        return length > 0 ? AbstractC22674j.m65737w(bArr3, interfaceC34130m.mo6031a(i13, AbstractC22674j.m65737w(bArr, bArr2))) : AbstractC22674j.m65737w(bArr3, interfaceC34130m.mo6031a(i13, bArr));
    }

    public C1982z(C30557a c30557a) {
        this.f7840a = new C1980x(((C11105a) c30557a.f125749c.f130665x).m30035b());
        C30560d c30560d = c30557a.f125748b;
        this.f7841b = c30560d.f125762b;
        this.f7842c = c30557a.f125750d.m30035b();
        if (c30560d.f125763c.equals(C30559c.f125758d)) {
            this.f7843d = Arrays.copyOf(f7839e, 1);
        } else {
            this.f7843d = new byte[0];
        }
    }

    public C1982z(C30564h c30564h) {
        StringBuilder sb4 = new StringBuilder("HMAC");
        C30568l c30568l = c30564h.f125768b;
        sb4.append(c30568l.f125792d);
        this.f7840a = new C1981y(sb4.toString(), new SecretKeySpec(((C11105a) c30564h.f125769c.f130665x).m30035b(), "HMAC"));
        this.f7841b = c30568l.f125790b;
        this.f7842c = c30564h.f125770d.m30035b();
        if (c30568l.f125791c.equals(C30567k.f125786d)) {
            this.f7843d = Arrays.copyOf(f7839e, 1);
        } else {
            this.f7843d = new byte[0];
        }
    }
}
