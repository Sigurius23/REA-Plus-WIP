package p588wm;

import androidx.profileinstaller.ProfileVerifier;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p284ko.InterfaceC22622i;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31515a0;

/* JADX INFO: renamed from: wm.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C37364f implements InterfaceC37368j {

    /* JADX INFO: renamed from: F */
    public int f159847F;

    /* JADX INFO: renamed from: G */
    public int f159848G;

    /* JADX INFO: renamed from: x */
    public final InterfaceC22622i f159850x;

    /* JADX INFO: renamed from: y */
    public final long f159851y;

    /* JADX INFO: renamed from: z */
    public long f159852z;

    /* JADX INFO: renamed from: E */
    public byte[] f159846E = new byte[ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST];

    /* JADX INFO: renamed from: w */
    public final byte[] f159849w = new byte[4096];

    static {
        AbstractC31515a0.m97109a("goog.exo.extractor");
    }

    public C37364f(InterfaceC22622i interfaceC22622i, long j7, long j13) {
        this.f159850x = interfaceC22622i;
        this.f159852z = j7;
        this.f159851y = j13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m119648a(int i13, boolean z4) throws EOFException, InterruptedIOException {
        m119649b(i13);
        int iM119650d = this.f159848G - this.f159847F;
        while (iM119650d < i13) {
            int i14 = i13;
            boolean z13 = z4;
            iM119650d = m119650d(this.f159846E, this.f159847F, i14, iM119650d, z13);
            if (iM119650d == -1) {
                return false;
            }
            this.f159848G = this.f159847F + iM119650d;
            i13 = i14;
            z4 = z13;
        }
        this.f159847F += i13;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m119649b(int i13) {
        int i14 = this.f159847F + i13;
        byte[] bArr = this.f159846E;
        if (i14 > bArr.length) {
            this.f159846E = Arrays.copyOf(this.f159846E, AbstractC24567y.m71677h(bArr.length * 2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST + i14, i14 + 524288));
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: c */
    public final boolean mo3092c(byte[] bArr, int i13, int i14, boolean z4) {
        if (!m119648a(i14, z4)) {
            return false;
        }
        System.arraycopy(this.f159846E, this.f159847F - i14, bArr, i13, i14);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m119650d(byte[] bArr, int i13, int i14, int i15, boolean z4) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i16 = this.f159850x.read(bArr, i13 + i15, i14 - i15);
        if (i16 != -1) {
            return i15 + i16;
        }
        if (i15 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: e */
    public final void mo3093e() {
        this.f159847F = 0;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: f */
    public final boolean mo3094f(byte[] bArr, int i13, int i14, boolean z4) throws EOFException, InterruptedIOException {
        int iMin;
        int i15 = this.f159848G;
        if (i15 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i15, i14);
            System.arraycopy(this.f159846E, 0, bArr, i13, iMin);
            m119651h(iMin);
        }
        int iM119650d = iMin;
        while (iM119650d < i14 && iM119650d != -1) {
            iM119650d = m119650d(bArr, i13, i14, iM119650d, z4);
        }
        if (iM119650d != -1) {
            this.f159852z += (long) iM119650d;
        }
        return iM119650d != -1;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: g */
    public final long mo3095g() {
        return this.f159852z + ((long) this.f159847F);
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    public final long getLength() {
        return this.f159851y;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    public final long getPosition() {
        return this.f159852z;
    }

    /* JADX INFO: renamed from: h */
    public final void m119651h(int i13) {
        int i14 = this.f159848G - i13;
        this.f159848G = i14;
        this.f159847F = 0;
        byte[] bArr = this.f159846E;
        byte[] bArr2 = i14 < bArr.length - 524288 ? new byte[ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST + i14] : bArr;
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        this.f159846E = bArr2;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: i */
    public final void mo3096i(int i13) throws EOFException, InterruptedIOException {
        m119648a(i13, false);
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: k */
    public final int mo3097k(int i13) throws EOFException, InterruptedIOException {
        C37364f c37364f;
        int iMin = Math.min(this.f159848G, i13);
        m119651h(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f159849w;
            c37364f = this;
            iMin = c37364f.m119650d(bArr, 0, Math.min(i13, bArr.length), 0, true);
        } else {
            c37364f = this;
        }
        if (iMin != -1) {
            c37364f.f159852z += (long) iMin;
        }
        return iMin;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: m */
    public final int mo3099m(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        C37364f c37364f;
        int iMin;
        m119649b(i14);
        int i15 = this.f159848G;
        int i16 = this.f159847F;
        int i17 = i15 - i16;
        if (i17 == 0) {
            c37364f = this;
            iMin = c37364f.m119650d(this.f159846E, i16, i14, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c37364f.f159848G += iMin;
        } else {
            c37364f = this;
            iMin = Math.min(i14, i17);
        }
        System.arraycopy(c37364f.f159846E, c37364f.f159847F, bArr, i13, iMin);
        c37364f.f159847F += iMin;
        return iMin;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: n */
    public final void mo3100n(int i13) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f159848G, i13);
        m119651h(iMin);
        int iM119650d = iMin;
        while (iM119650d < i13 && iM119650d != -1) {
            byte[] bArr = this.f159849w;
            iM119650d = m119650d(bArr, -iM119650d, Math.min(i13, bArr.length + iM119650d), iM119650d, false);
        }
        if (iM119650d != -1) {
            this.f159852z += (long) iM119650d;
        }
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: p */
    public final void mo3103p(byte[] bArr, int i13, int i14) {
        mo3092c(bArr, i13, i14, false);
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        C37364f c37364f;
        int i15 = this.f159848G;
        int iM119650d = 0;
        if (i15 != 0) {
            int iMin = Math.min(i15, i14);
            System.arraycopy(this.f159846E, 0, bArr, i13, iMin);
            m119651h(iMin);
            iM119650d = iMin;
        }
        if (iM119650d == 0) {
            c37364f = this;
            iM119650d = c37364f.m119650d(bArr, i13, i14, 0, true);
        } else {
            c37364f = this;
        }
        if (iM119650d != -1) {
            c37364f.f159852z += (long) iM119650d;
        }
        return iM119650d;
    }

    @Override // p588wm.InterfaceC37368j, p499t9.InterfaceC33646o
    public final void readFully(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        mo3094f(bArr, i13, i14, false);
    }
}
