package vn;

import android.util.Log;
import ed3.C13117a;
import java.io.EOFException;
import java.util.Arrays;
import kn.C22597a;
import p256jn.C21797b;
import p284ko.InterfaceC22622i;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.C37376r;
import p588wm.InterfaceC37377s;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vn.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C36184o implements InterfaceC37377s {

    /* JADX INFO: renamed from: f */
    public static final C31521c0 f154851f;

    /* JADX INFO: renamed from: g */
    public static final C31521c0 f154852g;

    /* JADX INFO: renamed from: a */
    public final InterfaceC37377s f154853a;

    /* JADX INFO: renamed from: b */
    public final C31521c0 f154854b;

    /* JADX INFO: renamed from: c */
    public C31521c0 f154855c;

    /* JADX INFO: renamed from: d */
    public byte[] f154856d;

    /* JADX INFO: renamed from: e */
    public int f154857e;

    static {
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = "application/id3";
        f154851f = new C31521c0(c31518b0);
        C31518b0 c31518b1 = new C31518b0();
        c31518b1.f130047k = "application/x-emsg";
        f154852g = new C31521c0(c31518b1);
    }

    public C36184o(InterfaceC37377s interfaceC37377s, int i13) {
        this.f154853a = interfaceC37377s;
        if (i13 == 1) {
            this.f154854b = f154851f;
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException(AbstractC31061c.m95634j(33, i13, "Unknown metadataType: "));
            }
            this.f154854b = f154852g;
        }
        this.f154856d = new byte[0];
        this.f154857e = 0;
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: a */
    public final void mo102730a(C31521c0 c31521c0) {
        this.f154855c = c31521c0;
        this.f154853a.mo102730a(this.f154854b);
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: b */
    public final int mo102731b(InterfaceC22622i interfaceC22622i, int i13, boolean z4) throws EOFException {
        int i14 = this.f154857e + i13;
        byte[] bArr = this.f154856d;
        if (bArr.length < i14) {
            this.f154856d = Arrays.copyOf(bArr, (i14 / 2) + i14);
        }
        int i15 = interfaceC22622i.read(this.f154856d, this.f154857e, i13);
        if (i15 != -1) {
            this.f154857e += i15;
            return i15;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: c */
    public final void mo102732c(int i13, C13117a c13117a) {
        int i14 = this.f154857e + i13;
        byte[] bArr = this.f154856d;
        if (bArr.length < i14) {
            this.f154856d = Arrays.copyOf(bArr, (i14 / 2) + i14);
        }
        c13117a.m36697g(this.f154856d, this.f154857e, i13);
        this.f154857e += i13;
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: d */
    public final void mo102733d(long j7, int i13, int i14, int i15, C37376r c37376r) {
        this.f154855c.getClass();
        int i16 = this.f154857e - i15;
        C13117a c13117a = new C13117a(Arrays.copyOfRange(this.f154856d, i16 - i14, i16), 1, (byte) 0);
        byte[] bArr = this.f154856d;
        System.arraycopy(bArr, i16, bArr, 0, i15);
        this.f154857e = i15;
        String str = this.f154855c.f130077L;
        C31521c0 c31521c0 = this.f154854b;
        String str2 = c31521c0.f130077L;
        String str3 = c31521c0.f130077L;
        if (!AbstractC24567y.m71670a(str, str2)) {
            if (!"application/x-emsg".equals(this.f154855c.f130077L)) {
                String strValueOf = String.valueOf(this.f154855c.f130077L);
                Log.w("HlsSampleStreamWrapper", strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                return;
            }
            C22597a c22597aM61677f0 = C21797b.m61677f0(c13117a);
            C31521c0 c31521c0Mo54414d = c22597aM61677f0.mo54414d();
            if (c31521c0Mo54414d == null || !AbstractC24567y.m71670a(str3, c31521c0Mo54414d.f130077L)) {
                Log.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c22597aM61677f0.mo54414d());
                return;
            }
            byte[] bArrMo54415j = c22597aM61677f0.mo54415j();
            bArrMo54415j.getClass();
            c13117a = new C13117a(bArrMo54415j, 1, (byte) 0);
        }
        int iM36692a = c13117a.m36692a();
        InterfaceC37377s interfaceC37377s = this.f154853a;
        interfaceC37377s.mo102732c(iM36692a, c13117a);
        interfaceC37377s.mo102733d(j7, i13, iM36692a, i15, c37376r);
    }
}
