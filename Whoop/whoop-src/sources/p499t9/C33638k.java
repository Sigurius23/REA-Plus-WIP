package p499t9;

import androidx.profileinstaller.ProfileVerifier;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p516u8.AbstractC34628y;
import p516u8.InterfaceC34594h;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: t9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C33638k implements InterfaceC33646o {

    /* JADX INFO: renamed from: F */
    public int f140403F;

    /* JADX INFO: renamed from: G */
    public int f140404G;

    /* JADX INFO: renamed from: x */
    public final InterfaceC34594h f140406x;

    /* JADX INFO: renamed from: y */
    public final long f140407y;

    /* JADX INFO: renamed from: z */
    public long f140408z;

    /* JADX INFO: renamed from: E */
    public byte[] f140402E = new byte[ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST];

    /* JADX INFO: renamed from: w */
    public final byte[] f140405w = new byte[4096];

    static {
        AbstractC34628y.m109420a("media3.extractor");
    }

    public C33638k(InterfaceC34594h interfaceC34594h, long j7, long j13) {
        this.f140406x = interfaceC34594h;
        this.f140408z = j7;
        this.f140407y = j13;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: C */
    public final boolean mo3078C(int i13, boolean z4) throws EOFException, InterruptedIOException {
        m106254a(i13);
        int iM106255b = this.f140404G - this.f140403F;
        while (iM106255b < i13) {
            int i14 = i13;
            boolean z13 = z4;
            iM106255b = m106255b(this.f140402E, this.f140403F, i14, iM106255b, z13);
            if (iM106255b == -1) {
                return false;
            }
            this.f140404G = this.f140403F + iM106255b;
            i13 = i14;
            z4 = z13;
        }
        this.f140403F += i13;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m106254a(int i13) {
        int i14 = this.f140403F + i13;
        byte[] bArr = this.f140402E;
        if (i14 > bArr.length) {
            this.f140402E = Arrays.copyOf(this.f140402E, AbstractC38065t.m121914g(bArr.length * 2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST + i14, i14 + 524288));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m106255b(byte[] bArr, int i13, int i14, int i15, boolean z4) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i16 = this.f140406x.read(bArr, i13 + i15, i14 - i15);
        if (i16 != -1) {
            return i15 + i16;
        }
        if (i15 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: c */
    public final boolean mo3092c(byte[] bArr, int i13, int i14, boolean z4) {
        if (!mo3078C(i14, z4)) {
            return false;
        }
        System.arraycopy(this.f140402E, this.f140403F - i14, bArr, i13, i14);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m106256d(int i13) {
        int i14 = this.f140404G - i13;
        this.f140404G = i14;
        this.f140403F = 0;
        byte[] bArr = this.f140402E;
        byte[] bArr2 = i14 < bArr.length - 524288 ? new byte[ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST + i14] : bArr;
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        this.f140402E = bArr2;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: e */
    public final void mo3093e() {
        this.f140403F = 0;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: f */
    public final boolean mo3094f(byte[] bArr, int i13, int i14, boolean z4) throws EOFException, InterruptedIOException {
        int iMin;
        int i15 = this.f140404G;
        if (i15 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i15, i14);
            System.arraycopy(this.f140402E, 0, bArr, i13, iMin);
            m106256d(iMin);
        }
        int iM106255b = iMin;
        while (iM106255b < i14 && iM106255b != -1) {
            iM106255b = m106255b(bArr, i13, i14, iM106255b, z4);
        }
        if (iM106255b != -1) {
            this.f140408z += (long) iM106255b;
        }
        return iM106255b != -1;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: g */
    public final long mo3095g() {
        return this.f140408z + ((long) this.f140403F);
    }

    @Override // p499t9.InterfaceC33646o
    public final long getLength() {
        return this.f140407y;
    }

    @Override // p499t9.InterfaceC33646o
    public final long getPosition() {
        return this.f140408z;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: i */
    public final void mo3096i(int i13) throws EOFException, InterruptedIOException {
        mo3078C(i13, false);
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: k */
    public final int mo3097k(int i13) throws EOFException, InterruptedIOException {
        C33638k c33638k;
        int iMin = Math.min(this.f140404G, i13);
        m106256d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f140405w;
            c33638k = this;
            iMin = c33638k.m106255b(bArr, 0, Math.min(i13, bArr.length), 0, true);
        } else {
            c33638k = this;
        }
        if (iMin != -1) {
            c33638k.f140408z += (long) iMin;
        }
        return iMin;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: m */
    public final int mo3099m(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        C33638k c33638k;
        int iMin;
        m106254a(i14);
        int i15 = this.f140404G;
        int i16 = this.f140403F;
        int i17 = i15 - i16;
        if (i17 == 0) {
            c33638k = this;
            iMin = c33638k.m106255b(this.f140402E, i16, i14, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c33638k.f140404G += iMin;
        } else {
            c33638k = this;
            iMin = Math.min(i14, i17);
        }
        System.arraycopy(c33638k.f140402E, c33638k.f140403F, bArr, i13, iMin);
        c33638k.f140403F += iMin;
        return iMin;
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: n */
    public final void mo3100n(int i13) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f140404G, i13);
        m106256d(iMin);
        int iM106255b = iMin;
        while (iM106255b < i13 && iM106255b != -1) {
            byte[] bArr = this.f140405w;
            iM106255b = m106255b(bArr, -iM106255b, Math.min(i13, bArr.length + iM106255b), iM106255b, false);
        }
        if (iM106255b != -1) {
            this.f140408z += (long) iM106255b;
        }
    }

    @Override // p499t9.InterfaceC33646o
    /* JADX INFO: renamed from: p */
    public final void mo3103p(byte[] bArr, int i13, int i14) {
        mo3092c(bArr, i13, i14, false);
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        C33638k c33638k;
        int i15 = this.f140404G;
        int iM106255b = 0;
        if (i15 != 0) {
            int iMin = Math.min(i15, i14);
            System.arraycopy(this.f140402E, 0, bArr, i13, iMin);
            m106256d(iMin);
            iM106255b = iMin;
        }
        if (iM106255b == 0) {
            c33638k = this;
            iM106255b = c33638k.m106255b(bArr, i13, i14, 0, true);
        } else {
            c33638k = this;
        }
        if (iM106255b != -1) {
            c33638k.f140408z += (long) iM106255b;
        }
        return iM106255b;
    }

    @Override // p499t9.InterfaceC33646o
    public final void readFully(byte[] bArr, int i13, int i14) throws EOFException, InterruptedIOException {
        mo3094f(bArr, i13, i14, false);
    }
}
