package p187h9;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import com.mapbox.maps.C5538l;
import e10.C12554k0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import live.hms.video.error.ErrorCodes;
import p010a9.C0580e;
import p031b9.AbstractC2829f;
import p122em.C13322b;
import p516u8.C34610p;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: h9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17022f extends AbstractC2829f {

    /* JADX INFO: renamed from: R */
    public final InterfaceC17019c f65420R;

    /* JADX INFO: renamed from: S */
    public final C0580e f65421S;

    /* JADX INFO: renamed from: T */
    public final ArrayDeque f65422T;

    /* JADX INFO: renamed from: U */
    public boolean f65423U;

    /* JADX INFO: renamed from: V */
    public boolean f65424V;

    /* JADX INFO: renamed from: W */
    public C17021e f65425W;

    /* JADX INFO: renamed from: X */
    public long f65426X;

    /* JADX INFO: renamed from: Y */
    public long f65427Y;

    /* JADX INFO: renamed from: Z */
    public int f65428Z;

    /* JADX INFO: renamed from: a0 */
    public int f65429a0;

    /* JADX INFO: renamed from: b0 */
    public C34610p f65430b0;

    /* JADX INFO: renamed from: c0 */
    public C17018b f65431c0;

    /* JADX INFO: renamed from: d0 */
    public C0580e f65432d0;

    /* JADX INFO: renamed from: e0 */
    public ImageOutput f65433e0;

    /* JADX INFO: renamed from: f0 */
    public Bitmap f65434f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f65435g0;

    /* JADX INFO: renamed from: h0 */
    public C13322b f65436h0;

    /* JADX INFO: renamed from: i0 */
    public C13322b f65437i0;

    /* JADX INFO: renamed from: j0 */
    public int f65438j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f65439k0;

    public C17022f(InterfaceC17019c interfaceC17019c) {
        super(4);
        this.f65420R = interfaceC17019c;
        this.f65433e0 = ImageOutput.f6392a;
        this.f65421S = new C0580e(0);
        this.f65425W = C17021e.f65417c;
        this.f65422T = new ArrayDeque();
        this.f65427Y = -9223372036854775807L;
        this.f65426X = -9223372036854775807L;
        this.f65428Z = 0;
        this.f65429a0 = 1;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: A */
    public final int mo8057A(C34610p c34610p) {
        return ((C12554k0) this.f65420R).m35224M(c34610p);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX INFO: renamed from: C */
    public final boolean m48002C(long j7) throws ExoPlaybackException {
        boolean z4;
        C13322b c13322b;
        Bitmap bitmap;
        long j13;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        int i15;
        C34610p c34610p;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.f65434f0;
        if ((bitmap2 == null || this.f65436h0 != null) && (this.f65429a0 != 0 || this.f11084H == 2)) {
            ArrayDeque arrayDeque = this.f65422T;
            if (bitmap2 == null) {
                AbstractC35849g.m113808j(this.f65431c0);
                C17017a c17017a = (C17017a) this.f65431c0.mo1502b();
                if (c17017a != null) {
                    if (!c17017a.m1496f(4)) {
                        AbstractC35849g.m113809k(c17017a.f65399E, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f65434f0 = c17017a.f65399E;
                        c17017a.mo1511p();
                        if (this.f65435g0 && this.f65434f0 != null && this.f65436h0 != null) {
                            AbstractC35849g.m113808j(this.f65430b0);
                            C34610p c34610p2 = this.f65430b0;
                            int i16 = c34610p2.f145766K;
                            int i17 = c34610p2.f145767L;
                            z4 = ((i16 != 1 && i17 == 1) || i16 == -1 || i17 == -1) ? false : true;
                            c13322b = this.f65436h0;
                            if (((Bitmap) c13322b.f46160c) == null) {
                                if (z4) {
                                    int i18 = c13322b.f46158a;
                                    AbstractC35849g.m113808j(this.f65434f0);
                                    int width = this.f65434f0.getWidth();
                                    C34610p c34610p3 = this.f65430b0;
                                    AbstractC35849g.m113808j(c34610p3);
                                    int i19 = width / c34610p3.f145766K;
                                    int height = this.f65434f0.getHeight();
                                    C34610p c34610p4 = this.f65430b0;
                                    AbstractC35849g.m113808j(c34610p4);
                                    int i24 = height / c34610p4.f145767L;
                                    int i25 = this.f65430b0.f145766K;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f65434f0, (i18 % i25) * i19, (i18 / i25) * i24, i19, i24);
                                } else {
                                    bitmapCreateBitmap = this.f65434f0;
                                    AbstractC35849g.m113808j(bitmapCreateBitmap);
                                }
                                c13322b.f46160c = bitmapCreateBitmap;
                            }
                            bitmap = (Bitmap) this.f65436h0.f46160c;
                            AbstractC35849g.m113808j(bitmap);
                            j13 = this.f65436h0.f46159b;
                            long j14 = j13 - j7;
                            if (this.f11084H == 2) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i13 = this.f65429a0;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    z13 = true;
                                } else {
                                    if (i13 == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z13 = false;
                                }
                            }
                            if (!z13 || j14 < 30000) {
                                this.f65433e0.onImageAvailable(j13 - this.f65425W.f65419b, bitmap);
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                C13322b c13322b2 = this.f65436h0;
                                AbstractC35849g.m113808j(c13322b2);
                                long j15 = c13322b2.f46159b;
                                this.f65426X = j15;
                                while (!arrayDeque.isEmpty() && j15 >= ((C17021e) arrayDeque.peek()).f65418a) {
                                    this.f65425W = (C17021e) arrayDeque.removeFirst();
                                }
                                this.f65429a0 = 3;
                                if (z4) {
                                    C13322b c13322b3 = this.f65436h0;
                                    AbstractC35849g.m113808j(c13322b3);
                                    i14 = c13322b3.f46158a;
                                    C34610p c34610p5 = this.f65430b0;
                                    AbstractC35849g.m113808j(c34610p5);
                                    i15 = c34610p5.f145767L;
                                    c34610p = this.f65430b0;
                                    AbstractC35849g.m113808j(c34610p);
                                    if (i14 == (i15 * c34610p.f145766K) - 1) {
                                        this.f65434f0 = null;
                                    }
                                } else {
                                    this.f65434f0 = null;
                                }
                                this.f65436h0 = this.f65437i0;
                                this.f65437i0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f65428Z == 3) {
                            m48005F();
                            AbstractC35849g.m113808j(this.f65430b0);
                            m48004E();
                            return false;
                        }
                        c17017a.mo1511p();
                        if (arrayDeque.isEmpty()) {
                            this.f65424V = true;
                            return false;
                        }
                    }
                }
            } else if (this.f65435g0) {
                AbstractC35849g.m113808j(this.f65430b0);
                C34610p c34610p6 = this.f65430b0;
                int i110 = c34610p6.f145766K;
                int i111 = c34610p6.f145767L;
                if (i110 != 1) {
                }
                c13322b = this.f65436h0;
                if (((Bitmap) c13322b.f46160c) == null) {
                    if (z4) {
                        int i112 = c13322b.f46158a;
                        AbstractC35849g.m113808j(this.f65434f0);
                        int width2 = this.f65434f0.getWidth();
                        C34610p c34610p7 = this.f65430b0;
                        AbstractC35849g.m113808j(c34610p7);
                        int i113 = width2 / c34610p7.f145766K;
                        int height2 = this.f65434f0.getHeight();
                        C34610p c34610p8 = this.f65430b0;
                        AbstractC35849g.m113808j(c34610p8);
                        int i26 = height2 / c34610p8.f145767L;
                        int i27 = this.f65430b0.f145766K;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f65434f0, (i112 % i27) * i113, (i112 / i27) * i26, i113, i26);
                    } else {
                        bitmapCreateBitmap = this.f65434f0;
                        AbstractC35849g.m113808j(bitmapCreateBitmap);
                    }
                    c13322b.f46160c = bitmapCreateBitmap;
                }
                bitmap = (Bitmap) this.f65436h0.f46160c;
                AbstractC35849g.m113808j(bitmap);
                j13 = this.f65436h0.f46159b;
                long j16 = j13 - j7;
                if (this.f11084H == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i13 = this.f65429a0;
                if (i13 != 0) {
                    if (i13 != 1) {
                        z13 = true;
                    } else {
                        if (i13 == 3) {
                            throw new IllegalStateException();
                        }
                        z13 = false;
                    }
                }
                if (z13) {
                    this.f65433e0.onImageAvailable(j13 - this.f65425W.f65419b, bitmap);
                    z14 = true;
                } else {
                    this.f65433e0.onImageAvailable(j13 - this.f65425W.f65419b, bitmap);
                    z14 = true;
                }
                if (z14) {
                    C13322b c13322b4 = this.f65436h0;
                    AbstractC35849g.m113808j(c13322b4);
                    long j17 = c13322b4.f46159b;
                    this.f65426X = j17;
                    while (!arrayDeque.isEmpty()) {
                        this.f65425W = (C17021e) arrayDeque.removeFirst();
                    }
                    this.f65429a0 = 3;
                    if (z4) {
                        C13322b c13322b5 = this.f65436h0;
                        AbstractC35849g.m113808j(c13322b5);
                        i14 = c13322b5.f46158a;
                        C34610p c34610p9 = this.f65430b0;
                        AbstractC35849g.m113808j(c34610p9);
                        i15 = c34610p9.f145767L;
                        c34610p = this.f65430b0;
                        AbstractC35849g.m113808j(c34610p);
                        if (i14 == (i15 * c34610p.f145766K) - 1) {
                            this.f65434f0 = null;
                        }
                    } else {
                        this.f65434f0 = null;
                    }
                    this.f65436h0 = this.f65437i0;
                    this.f65437i0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    /* JADX INFO: renamed from: D */
    public final boolean m48003D(long j7) {
        int iM8074w;
        ByteBuffer byteBuffer;
        C0580e c0580e;
        boolean z4;
        C0580e c0580e2;
        long j13;
        boolean z13;
        C13322b c13322b;
        boolean z14;
        C34610p c34610p;
        boolean z15;
        boolean z16;
        C34610p c34610p2;
        int i13;
        C0580e c0580e3;
        if (!this.f65435g0 || this.f65436h0 == null) {
            C30352d c30352d = this.f11096y;
            c30352d.m92812k();
            C17018b c17018b = this.f65431c0;
            if (c17018b != null && this.f65428Z != 3 && !this.f65423U) {
                if (this.f65432d0 == null) {
                    C0580e c0580e4 = (C0580e) c17018b.mo1503c();
                    this.f65432d0 = c0580e4;
                    if (c0580e4 != null) {
                        if (this.f65428Z == 2) {
                            AbstractC35849g.m113808j(this.f65432d0);
                            this.f65432d0.f2052x = 4;
                            C17018b c17018b2 = this.f65431c0;
                            AbstractC35849g.m113808j(c17018b2);
                            c17018b2.mo1505e(this.f65432d0);
                            this.f65432d0 = null;
                            this.f65428Z = 3;
                            return false;
                        }
                        iM8074w = m8074w(c30352d, this.f65432d0, 0);
                        if (iM8074w != -5) {
                            C34610p c34610p3 = (C34610p) c30352d.f124536y;
                            AbstractC35849g.m113808j(c34610p3);
                            this.f65430b0 = c34610p3;
                            this.f65439k0 = true;
                            this.f65428Z = 2;
                            return true;
                        }
                        if (iM8074w != -4) {
                            this.f65432d0.m1509r();
                            byteBuffer = this.f65432d0.f2063E;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c0580e = this.f65432d0;
                                AbstractC35849g.m113808j(c0580e);
                                if (c0580e.m1496f(4)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                C17018b c17018b3 = this.f65431c0;
                                AbstractC35849g.m113808j(c17018b3);
                                C0580e c0580e5 = this.f65432d0;
                                AbstractC35849g.m113808j(c0580e5);
                                c17018b3.mo1505e(c0580e5);
                                this.f65438j0 = 0;
                            }
                            c0580e2 = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e2);
                            if (c0580e2.m1496f(4)) {
                                this.f65435g0 = true;
                            } else {
                                int i14 = this.f65438j0;
                                j13 = c0580e2.f2065G;
                                C13322b c13322b2 = new C13322b();
                                c13322b2.f46158a = i14;
                                c13322b2.f46159b = j13;
                                this.f65437i0 = c13322b2;
                                this.f65438j0 = i14 + 1;
                                if (this.f65435g0) {
                                    this.f65436h0 = this.f65437i0;
                                    this.f65437i0 = null;
                                } else {
                                    if (j13 - 30000 <= j7 || j7 > 30000 + j13) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    c13322b = this.f65436h0;
                                    if (c13322b != null || c13322b.f46159b > j7 || j7 >= j13) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    c34610p = this.f65430b0;
                                    AbstractC35849g.m113808j(c34610p);
                                    if (c34610p.f145766K != -1 || (i13 = (c34610p2 = this.f65430b0).f145767L) == -1 || i14 == (i13 * c34610p2.f145766K) - 1) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (!z13 || z14 || z15) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    this.f65435g0 = z16;
                                    if (z14 || z13) {
                                        this.f65436h0 = this.f65437i0;
                                        this.f65437i0 = null;
                                    }
                                }
                            }
                            c0580e3 = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e3);
                            if (c0580e3.m1496f(4)) {
                                this.f65423U = true;
                                this.f65432d0 = null;
                                return false;
                            }
                            long j14 = this.f65427Y;
                            C0580e c0580e6 = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e6);
                            this.f65427Y = Math.max(j14, c0580e6.f2065G);
                            if (z4) {
                                this.f65432d0 = null;
                            } else {
                                C0580e c0580e7 = this.f65432d0;
                                AbstractC35849g.m113808j(c0580e7);
                                c0580e7.mo1506o();
                            }
                            return !this.f65435g0;
                        }
                        if (iM8074w != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f65428Z == 2) {
                        AbstractC35849g.m113808j(this.f65432d0);
                        this.f65432d0.f2052x = 4;
                        C17018b c17018b4 = this.f65431c0;
                        AbstractC35849g.m113808j(c17018b4);
                        c17018b4.mo1505e(this.f65432d0);
                        this.f65432d0 = null;
                        this.f65428Z = 3;
                        return false;
                    }
                    iM8074w = m8074w(c30352d, this.f65432d0, 0);
                    if (iM8074w != -5) {
                        C34610p c34610p4 = (C34610p) c30352d.f124536y;
                        AbstractC35849g.m113808j(c34610p4);
                        this.f65430b0 = c34610p4;
                        this.f65439k0 = true;
                        this.f65428Z = 2;
                        return true;
                    }
                    if (iM8074w != -4) {
                        this.f65432d0.m1509r();
                        byteBuffer = this.f65432d0.f2063E;
                        if (byteBuffer != null) {
                            c0580e = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e);
                            if (c0580e.m1496f(4)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            c0580e = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e);
                            if (c0580e.m1496f(4)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        if (z4) {
                            C17018b c17018b5 = this.f65431c0;
                            AbstractC35849g.m113808j(c17018b5);
                            C0580e c0580e8 = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e8);
                            c17018b5.mo1505e(c0580e8);
                            this.f65438j0 = 0;
                        }
                        c0580e2 = this.f65432d0;
                        AbstractC35849g.m113808j(c0580e2);
                        if (c0580e2.m1496f(4)) {
                            this.f65435g0 = true;
                        } else {
                            int i15 = this.f65438j0;
                            j13 = c0580e2.f2065G;
                            C13322b c13322b3 = new C13322b();
                            c13322b3.f46158a = i15;
                            c13322b3.f46159b = j13;
                            this.f65437i0 = c13322b3;
                            this.f65438j0 = i15 + 1;
                            if (this.f65435g0) {
                                this.f65436h0 = this.f65437i0;
                                this.f65437i0 = null;
                            } else {
                                if (j13 - 30000 <= j7) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                c13322b = this.f65436h0;
                                if (c13322b != null) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                c34610p = this.f65430b0;
                                AbstractC35849g.m113808j(c34610p);
                                if (c34610p.f145766K != -1) {
                                    z15 = true;
                                } else {
                                    z15 = true;
                                }
                                if (z13) {
                                    z16 = true;
                                } else {
                                    z16 = true;
                                }
                                this.f65435g0 = z16;
                                if (z14) {
                                    this.f65436h0 = this.f65437i0;
                                    this.f65437i0 = null;
                                } else {
                                    this.f65436h0 = this.f65437i0;
                                    this.f65437i0 = null;
                                }
                            }
                        }
                        c0580e3 = this.f65432d0;
                        AbstractC35849g.m113808j(c0580e3);
                        if (c0580e3.m1496f(4)) {
                            this.f65423U = true;
                            this.f65432d0 = null;
                            return false;
                        }
                        long j15 = this.f65427Y;
                        C0580e c0580e9 = this.f65432d0;
                        AbstractC35849g.m113808j(c0580e9);
                        this.f65427Y = Math.max(j15, c0580e9.f2065G);
                        if (z4) {
                            this.f65432d0 = null;
                        } else {
                            C0580e c0580e10 = this.f65432d0;
                            AbstractC35849g.m113808j(c0580e10);
                            c0580e10.mo1506o();
                        }
                        return !this.f65435g0;
                    }
                    if (iM8074w != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m48004E() throws ExoPlaybackException {
        if (this.f65439k0) {
            C34610p c34610p = this.f65430b0;
            c34610p.getClass();
            C12554k0 c12554k0 = (C12554k0) this.f65420R;
            int iM35224M = c12554k0.m35224M(c34610p);
            if (iM35224M != AbstractC2829f.m8055f(4, 0, 0, 0) && iM35224M != AbstractC2829f.m8055f(3, 0, 0, 0)) {
                throw m8059g(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f65430b0, false, ErrorCodes.WebrtcErrors.cICEFailure);
            }
            C17018b c17018b = this.f65431c0;
            if (c17018b != null) {
                c17018b.release();
            }
            this.f65431c0 = new C17018b((C5538l) c12554k0.f42881x);
            this.f65439k0 = false;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m48005F() {
        this.f65432d0 = null;
        this.f65428Z = 0;
        this.f65427Y = -9223372036854775807L;
        C17018b c17018b = this.f65431c0;
        if (c17018b != null) {
            c17018b.release();
            this.f65431c0 = null;
        }
    }

    @Override // p031b9.AbstractC2829f, p031b9.InterfaceC2828e1
    /* JADX INFO: renamed from: a */
    public final void mo8047a(int i13, Object obj) {
        if (i13 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f6392a;
        }
        this.f65433e0 = imageOutput;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: j */
    public final String mo8062j() {
        return "ImageRenderer";
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: l */
    public final boolean mo8064l() {
        return this.f65424V;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public final boolean mo8065n() {
        int i13 = this.f65429a0;
        if (i13 != 3) {
            return i13 == 0 && this.f65435g0;
        }
        return true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public final void mo8066o() {
        this.f65430b0 = null;
        this.f65425W = C17021e.f65417c;
        this.f65422T.clear();
        m48005F();
        this.f65433e0.mo5059a();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: p */
    public final void mo8067p(boolean z4, boolean z13) {
        this.f65429a0 = z13 ? 1 : 0;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public final void mo8068q(long j7, boolean z4) {
        this.f65429a0 = Math.min(this.f65429a0, 1);
        this.f65424V = false;
        this.f65423U = false;
        this.f65434f0 = null;
        this.f65436h0 = null;
        this.f65437i0 = null;
        this.f65435g0 = false;
        this.f65432d0 = null;
        C17018b c17018b = this.f65431c0;
        if (c17018b != null) {
            c17018b.flush();
        }
        this.f65422T.clear();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: r */
    public final void mo8069r() {
        m48005F();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: s */
    public final void mo8070s() {
        m48005F();
        this.f65429a0 = Math.min(this.f65429a0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8073v(p516u8.C34610p[] r5, long r6, long r8, p299l9.C23488c0 r10) {
        /*
            r4 = this;
            h9.e r5 = r4.f65425W
            long r5 = r5.f65419b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f65422T
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f65427Y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f65426X
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            h9.e r6 = new h9.e
            long r0 = r4.f65427Y
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            h9.e r5 = new h9.e
            r5.<init>(r0, r8)
            r4.f65425W = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187h9.C17022f.mo8073v(u8.p[], long, long, l9.c0):void");
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: x */
    public final void mo8075x(long j7, long j13) throws ExoPlaybackException {
        if (this.f65424V) {
            return;
        }
        if (this.f65430b0 == null) {
            C30352d c30352d = this.f11096y;
            c30352d.m92812k();
            C0580e c0580e = this.f65421S;
            c0580e.mo1506o();
            int iM8074w = m8074w(c30352d, c0580e, 2);
            if (iM8074w != -5) {
                if (iM8074w == -4) {
                    AbstractC35849g.m113807i(c0580e.m1496f(4));
                    this.f65423U = true;
                    this.f65424V = true;
                    return;
                }
                return;
            }
            C34610p c34610p = (C34610p) c30352d.f124536y;
            AbstractC35849g.m113808j(c34610p);
            this.f65430b0 = c34610p;
            this.f65439k0 = true;
        }
        if (this.f65431c0 == null) {
            m48004E();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m48002C(j7)) {
            }
            while (m48003D(j7)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e5) {
            throw m8059g(e5, null, false, ErrorCodes.WebrtcErrors.cSetLocalDescriptionFailed);
        }
    }
}
