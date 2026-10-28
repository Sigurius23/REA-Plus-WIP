package p618xk;

import al.C0960g;
import androidx.profileinstaller.ProfileVerifier;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: xk.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C38412c extends OutputStream {

    /* JADX INFO: renamed from: w */
    public final FileOutputStream f164475w;

    /* JADX INFO: renamed from: x */
    public byte[] f164476x;

    /* JADX INFO: renamed from: y */
    public final C0960g f164477y;

    /* JADX INFO: renamed from: z */
    public int f164478z;

    public C38412c(FileOutputStream fileOutputStream, C0960g c0960g) {
        this.f164475w = fileOutputStream;
        this.f164477y = c0960g;
        this.f164476x = (byte[]) c0960g.m2444c(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f164475w;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f164476x;
            if (bArr != null) {
                this.f164477y.m2448g(bArr);
                this.f164476x = null;
            }
        } catch (Throwable th3) {
            fileOutputStream.close();
            throw th3;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i13 = this.f164478z;
        FileOutputStream fileOutputStream = this.f164475w;
        if (i13 > 0) {
            fileOutputStream.write(this.f164476x, 0, i13);
            this.f164478z = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i13) throws IOException {
        byte[] bArr = this.f164476x;
        int i14 = this.f164478z;
        int i15 = i14 + 1;
        this.f164478z = i15;
        bArr[i14] = (byte) i13;
        if (i15 != bArr.length || i15 <= 0) {
            return;
        }
        this.f164475w.write(bArr, 0, i15);
        this.f164478z = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = 0;
        do {
            int i16 = i14 - i15;
            int i17 = i13 + i15;
            int i18 = this.f164478z;
            FileOutputStream fileOutputStream = this.f164475w;
            if (i18 == 0 && i16 >= this.f164476x.length) {
                fileOutputStream.write(bArr, i17, i16);
                return;
            }
            int iMin = Math.min(i16, this.f164476x.length - i18);
            System.arraycopy(bArr, i17, this.f164476x, this.f164478z, iMin);
            int i19 = this.f164478z + iMin;
            this.f164478z = i19;
            i15 += iMin;
            byte[] bArr2 = this.f164476x;
            if (i19 == bArr2.length && i19 > 0) {
                fileOutputStream.write(bArr2, 0, i19);
                this.f164478z = 0;
            }
        } while (i15 < i14);
    }
}
