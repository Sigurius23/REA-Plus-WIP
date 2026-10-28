package at;

import com.google.crypto.tink.internal.AbstractC5086e;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5088f;
import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Arrays;
import p154fs.InterfaceC14736n;
import p477s2.AbstractC32073e;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22674j;
import ws.C37577a;
import ws.C37579b;
import ws.C37581c;
import ws.C37583e;

/* JADX INFO: renamed from: at.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C1966j implements InterfaceC14736n {

    /* JADX INFO: renamed from: f */
    public static final C37199o f7790f;

    /* JADX INFO: renamed from: g */
    public static final C37199o f7791g;

    /* JADX INFO: renamed from: h */
    public static final C37199o f7792h;

    /* JADX INFO: renamed from: a */
    public final ECPublicKey f7793a;

    /* JADX INFO: renamed from: b */
    public final String f7794b;

    /* JADX INFO: renamed from: c */
    public final EnumC1973q f7795c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7796d;

    /* JADX INFO: renamed from: e */
    public final byte[] f7797e;

    static {
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC1979w.f7830y, C37579b.f160703c);
        c5088fM119196j.m15967a(EnumC1979w.f7831z, C37579b.f160704d);
        c5088fM119196j.m15967a(EnumC1979w.f7826E, C37579b.f160705e);
        f7790f = c5088fM119196j.m15968b();
        C5088f c5088fM119196j2 = C37199o.m119196j();
        c5088fM119196j2.m15967a(EnumC1973q.f7806w, C37579b.f160706f);
        c5088fM119196j2.m15967a(EnumC1973q.f7807x, C37579b.f160707g);
        f7791g = c5088fM119196j2.m15968b();
        C5088f c5088fM119196j3 = C37199o.m119196j();
        c5088fM119196j3.m15967a(EnumC1972p.f7802w, C37577a.f160693c);
        c5088fM119196j3.m15967a(EnumC1972p.f7803x, C37577a.f160694d);
        c5088fM119196j3.m15967a(EnumC1972p.f7804y, C37577a.f160695e);
        f7792h = c5088fM119196j3.m15968b();
    }

    public C1966j(ECPublicKey eCPublicKey, EnumC1979w enumC1979w, EnumC1973q enumC1973q, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53361b(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        AbstractC5086e.m15960b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        AbstractC1959c0.m5975e(enumC1979w);
        this.f7794b = enumC1979w + "withECDSA";
        this.f7793a = eCPublicKey;
        this.f7795c = enumC1973q;
        this.f7796d = bArr;
        this.f7797e = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public static C1966j m6003a(C37583e c37583e) throws GeneralSecurityException {
        EnumC1972p enumC1972p = (EnumC1972p) f7792h.m119215U(c37583e.f160720b.f160715b);
        ECPoint eCPoint = c37583e.f160721c;
        ECPublicKey eCPublicKeyM99713B = AbstractC32073e.m99713B(enumC1972p, eCPoint.getAffineX().toByteArray(), eCPoint.getAffineY().toByteArray());
        C37581c c37581c = c37583e.f160720b;
        return new C1966j(eCPublicKeyM99713B, (EnumC1979w) f7790f.m119215U(c37581c.f160716c), (EnumC1973q) f7791g.m119215U(c37581c.f160714a), c37583e.f160722d.m30035b(), c37581c.f160717d.equals(C37579b.f160710j) ? new byte[]{0} : new byte[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m6004b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int i13;
        EnumC1973q enumC1973q = this.f7795c;
        EnumC1973q enumC1973q2 = EnumC1973q.f7806w;
        boolean zVerify = false;
        ECPublicKey eCPublicKey = this.f7793a;
        if (enumC1973q == enumC1973q2) {
            if (bArr.length != AbstractC32073e.m99760s(eCPublicKey.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            }
            byte[] bArrM99746g0 = AbstractC32073e.m99746g0(Arrays.copyOf(bArr, bArr.length / 2));
            byte[] bArrM99746g1 = AbstractC32073e.m99746g0(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
            int length = bArrM99746g0.length + 4 + bArrM99746g1.length;
            if (length >= 128) {
                bArr3 = new byte[length + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) length;
                i13 = 3;
            } else {
                bArr3 = new byte[length + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) length;
                i13 = 2;
            }
            int i14 = i13 + 1;
            bArr3[i13] = 2;
            int i15 = i13 + 2;
            bArr3[i14] = (byte) bArrM99746g0.length;
            System.arraycopy(bArrM99746g0, 0, bArr3, i15, bArrM99746g0.length);
            int length2 = i15 + bArrM99746g0.length;
            bArr3[length2] = 2;
            bArr3[length2 + 1] = (byte) bArrM99746g1.length;
            System.arraycopy(bArrM99746g1, 0, bArr3, length2 + 2, bArrM99746g1.length);
            bArr = bArr3;
        }
        if (!AbstractC32073e.m99724P(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signature = (Signature) C1977u.f7821d.f7825a.m6026b(this.f7794b, C1977u.m6027b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"));
        signature.initVerify(eCPublicKey);
        signature.update(bArr2);
        try {
            zVerify = signature.verify(bArr);
        } catch (RuntimeException unused) {
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6005c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f7796d;
        int length = bArr3.length;
        byte[] bArr4 = this.f7797e;
        if (length == 0 && bArr4.length == 0) {
            m6004b(bArr, bArr2);
        } else {
            if (!AbstractC5113r0.m16077a(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            if (bArr4.length != 0) {
                bArr2 = AbstractC22674j.m65737w(bArr2, bArr4);
            }
            m6004b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
    }
}
