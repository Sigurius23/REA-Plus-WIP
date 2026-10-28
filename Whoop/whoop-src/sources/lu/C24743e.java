package lu;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import no.nordicsemi.android.dfu.DfuBaseService;
import tk.AbstractC33874e;

/* JADX INFO: renamed from: lu.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C24743e implements Closeable {

    /* JADX INFO: renamed from: E */
    public int f96757E;

    /* JADX INFO: renamed from: F */
    public int f96758F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96759w;

    /* JADX INFO: renamed from: x */
    public final FileInputStream f96760x;

    /* JADX INFO: renamed from: y */
    public final Charset f96761y;

    /* JADX INFO: renamed from: z */
    public byte[] f96762z;

    public C24743e(FileInputStream fileInputStream, Charset charset, int i13) {
        this.f96759w = i13;
        switch (i13) {
            case 1:
                if (charset == null) {
                    throw null;
                }
                if (!charset.equals(AbstractC33874e.f141891a)) {
                    throw new IllegalArgumentException("Unsupported encoding");
                }
                this.f96760x = fileInputStream;
                this.f96761y = charset;
                this.f96762z = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                return;
            default:
                if (charset == null) {
                    throw null;
                }
                if (!charset.equals(AbstractC24744f.f96763a)) {
                    throw new IllegalArgumentException("Unsupported encoding");
                }
                this.f96760x = fileInputStream;
                this.f96761y = charset;
                this.f96762z = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m72448b() {
        return this.f96758F == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f96759w) {
            case 0:
                synchronized (this.f96760x) {
                    try {
                        if (this.f96762z != null) {
                            this.f96762z = null;
                            this.f96760x.close();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f96760x) {
                    try {
                        if (this.f96762z != null) {
                            this.f96762z = null;
                            this.f96760x.close();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX INFO: renamed from: h */
    public final String m72449h() {
        String string;
        int i13;
        String string2;
        int i14;
        switch (this.f96759w) {
            case 0:
                synchronized (this.f96760x) {
                    try {
                        byte[] bArr = this.f96762z;
                        if (bArr == null) {
                            throw new IOException("LineReader is closed");
                        }
                        if (this.f96757E >= this.f96758F) {
                            int i15 = this.f96760x.read(bArr, 0, bArr.length);
                            if (i15 == -1) {
                                throw new EOFException();
                            }
                            this.f96757E = 0;
                            this.f96758F = i15;
                        }
                        for (int i16 = this.f96757E; i16 != this.f96758F; i16++) {
                            byte[] bArr2 = this.f96762z;
                            if (bArr2[i16] == 10) {
                                int i17 = this.f96757E;
                                if (i16 != i17) {
                                    i13 = i16 - 1;
                                    if (bArr2[i13] != 13) {
                                        i13 = i16;
                                    }
                                } else {
                                    i13 = i16;
                                }
                                string = new String(bArr2, i17, i13 - i17, this.f96761y.name());
                                this.f96757E = i16 + 1;
                            }
                        }
                        C24742d c24742d = new C24742d(this, (this.f96758F - this.f96757E) + 80, 0);
                        while (true) {
                            byte[] bArr3 = this.f96762z;
                            int i18 = this.f96757E;
                            c24742d.write(bArr3, i18, this.f96758F - i18);
                            this.f96758F = -1;
                            FileInputStream fileInputStream = this.f96760x;
                            byte[] bArr4 = this.f96762z;
                            int i19 = fileInputStream.read(bArr4, 0, bArr4.length);
                            if (i19 == -1) {
                                throw new EOFException();
                            }
                            this.f96757E = 0;
                            this.f96758F = i19;
                            for (int i24 = 0; i24 != this.f96758F; i24++) {
                                byte[] bArr5 = this.f96762z;
                                if (bArr5[i24] == 10) {
                                    int i25 = this.f96757E;
                                    if (i24 != i25) {
                                        c24742d.write(bArr5, i25, i24 - i25);
                                    }
                                    this.f96757E = i24 + 1;
                                    string = c24742d.toString();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return string;
            default:
                synchronized (this.f96760x) {
                    try {
                        byte[] bArr6 = this.f96762z;
                        if (bArr6 == null) {
                            throw new IOException("LineReader is closed");
                        }
                        if (this.f96757E >= this.f96758F) {
                            int i26 = this.f96760x.read(bArr6, 0, bArr6.length);
                            if (i26 == -1) {
                                throw new EOFException();
                            }
                            this.f96757E = 0;
                            this.f96758F = i26;
                        }
                        for (int i27 = this.f96757E; i27 != this.f96758F; i27++) {
                            byte[] bArr7 = this.f96762z;
                            if (bArr7[i27] == 10) {
                                int i28 = this.f96757E;
                                if (i27 != i28) {
                                    i14 = i27 - 1;
                                    if (bArr7[i14] != 13) {
                                        i14 = i27;
                                    }
                                } else {
                                    i14 = i27;
                                }
                                string2 = new String(bArr7, i28, i14 - i28, this.f96761y.name());
                                this.f96757E = i27 + 1;
                            }
                        }
                        C24742d c24742d2 = new C24742d(this, (this.f96758F - this.f96757E) + 80, 1);
                        while (true) {
                            byte[] bArr8 = this.f96762z;
                            int i29 = this.f96757E;
                            c24742d2.write(bArr8, i29, this.f96758F - i29);
                            this.f96758F = -1;
                            FileInputStream fileInputStream2 = this.f96760x;
                            byte[] bArr9 = this.f96762z;
                            int i34 = fileInputStream2.read(bArr9, 0, bArr9.length);
                            if (i34 == -1) {
                                throw new EOFException();
                            }
                            this.f96757E = 0;
                            this.f96758F = i34;
                            for (int i35 = 0; i35 != this.f96758F; i35++) {
                                byte[] bArr10 = this.f96762z;
                                if (bArr10[i35] == 10) {
                                    int i36 = this.f96757E;
                                    if (i35 != i36) {
                                        c24742d2.write(bArr10, i36, i35 - i36);
                                    }
                                    this.f96757E = i35 + 1;
                                    string2 = c24742d2.toString();
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return string2;
        }
    }
}
