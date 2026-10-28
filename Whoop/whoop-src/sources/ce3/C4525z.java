package ce3;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m83.AbstractC25260n;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.InterfaceC26618i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: ce3.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C4525z implements Closeable {

    /* JADX INFO: renamed from: F */
    public static final Logger f18252F = Logger.getLogger(AbstractC4506g.class.getName());

    /* JADX INFO: renamed from: E */
    public final C4504e f18253E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26618i f18254w;

    /* JADX INFO: renamed from: x */
    public final C26616h f18255x;

    /* JADX INFO: renamed from: y */
    public int f18256y;

    /* JADX INFO: renamed from: z */
    public boolean f18257z;

    public C4525z(C26617h0 sink) {
        AbstractC22676k.m65750j(sink, "sink");
        this.f18254w = sink;
        C26616h c26616h = new C26616h();
        this.f18255x = c26616h;
        this.f18256y = DfuBaseService.ERROR_CONNECTION_MASK;
        this.f18253E = new C4504e(c26616h);
    }

    /* JADX INFO: renamed from: J */
    public final void m14159J(int i13, long j7) {
        synchronized (this) {
            try {
                if (this.f18257z) {
                    throw new IOException("closed");
                }
                if (j7 == 0 || j7 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j7).toString());
                }
                Logger logger = f18252F;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC4506g.m14129c(i13, 4, j7, false));
                }
                m14162i(i13, 4, 8, 0);
                this.f18254w.writeInt((int) j7);
                this.f18254w.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14160b(C4503d0 peerSettings) {
        AbstractC22676k.m65750j(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f18257z) {
                    throw new IOException("closed");
                }
                int i13 = this.f18256y;
                int i14 = peerSettings.f18142a;
                if ((i14 & 32) != 0) {
                    i13 = peerSettings.f18143b[5];
                }
                this.f18256y = i13;
                if (((i14 & 2) != 0 ? peerSettings.f18143b[1] : -1) != -1) {
                    C4504e c4504e = this.f18253E;
                    int i15 = (i14 & 2) != 0 ? peerSettings.f18143b[1] : -1;
                    c4504e.getClass();
                    int iMin = Math.min(i15, DfuBaseService.ERROR_CONNECTION_MASK);
                    int i16 = c4504e.f18147d;
                    if (i16 != iMin) {
                        if (iMin < i16) {
                            c4504e.f18145b = Math.min(c4504e.f18145b, iMin);
                        }
                        c4504e.f18146c = true;
                        c4504e.f18147d = iMin;
                        int i17 = c4504e.f18151h;
                        if (iMin < i17) {
                            if (iMin == 0) {
                                C4500c[] c4500cArr = c4504e.f18148e;
                                AbstractC25260n.m74073n0(0, c4500cArr.length, null, c4500cArr);
                                c4504e.f18149f = c4504e.f18148e.length - 1;
                                c4504e.f18150g = 0;
                                c4504e.f18151h = 0;
                            } else {
                                c4504e.m14121a(i17 - iMin);
                            }
                        }
                    }
                }
                m14162i(0, 0, 4, 1);
                this.f18254w.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f18257z = true;
            this.f18254w.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f18257z) {
                throw new IOException("closed");
            }
            this.f18254w.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14161h(boolean z4, int i13, C26616h c26616h, int i14) {
        synchronized (this) {
            if (this.f18257z) {
                throw new IOException("closed");
            }
            m14162i(i13, i14, 0, z4 ? 1 : 0);
            if (i14 > 0) {
                InterfaceC26618i interfaceC26618i = this.f18254w;
                AbstractC22676k.m65747g(c26616h);
                interfaceC26618i.write(c26616h, i14);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14162i(int i13, int i14, int i15, int i16) {
        if (i15 != 8) {
            Level level = Level.FINE;
            Logger logger = f18252F;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC4506g.m14128b(i13, i14, i15, i16, false));
            }
        }
        if (i14 > this.f18256y) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f18256y + ": " + i14).toString());
        }
        if ((Integer.MIN_VALUE & i13) != 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "reserved bit set: ").toString());
        }
        byte[] bArr = AbstractC37172f.f158958a;
        InterfaceC26618i interfaceC26618i = this.f18254w;
        AbstractC22676k.m65750j(interfaceC26618i, "<this>");
        interfaceC26618i.writeByte((i14 >>> 16) & 255);
        interfaceC26618i.writeByte((i14 >>> 8) & 255);
        interfaceC26618i.writeByte(i14 & 255);
        interfaceC26618i.writeByte(i15 & 255);
        interfaceC26618i.writeByte(i16 & 255);
        interfaceC26618i.writeInt(i13 & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k */
    public final void m14163k(int i13, EnumC4496a enumC4496a, byte[] bArr) {
        synchronized (this) {
            if (this.f18257z) {
                throw new IOException("closed");
            }
            if (enumC4496a.f18117w == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m14162i(0, bArr.length + 8, 7, 0);
            this.f18254w.writeInt(i13);
            this.f18254w.writeInt(enumC4496a.f18117w);
            if (bArr.length != 0) {
                this.f18254w.write(bArr);
            }
            this.f18254w.flush();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14164m(boolean z4, int i13, ArrayList arrayList) {
        synchronized (this) {
            if (this.f18257z) {
                throw new IOException("closed");
            }
            this.f18253E.m14124d(arrayList);
            long j7 = this.f18255x.f105866x;
            long jMin = Math.min(this.f18256y, j7);
            int i14 = j7 == jMin ? 4 : 0;
            if (z4) {
                i14 |= 1;
            }
            m14162i(i13, (int) jMin, 1, i14);
            this.f18254w.write(this.f18255x, jMin);
            if (j7 > jMin) {
                long j13 = j7 - jMin;
                while (j13 > 0) {
                    long jMin2 = Math.min(this.f18256y, j13);
                    j13 -= jMin2;
                    m14162i(i13, (int) jMin2, 9, j13 == 0 ? 4 : 0);
                    this.f18254w.write(this.f18255x, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m14165s(int i13, int i14, boolean z4) {
        synchronized (this) {
            if (this.f18257z) {
                throw new IOException("closed");
            }
            m14162i(0, 8, 6, z4 ? 1 : 0);
            this.f18254w.writeInt(i13);
            this.f18254w.writeInt(i14);
            this.f18254w.flush();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14166x(int i13, EnumC4496a enumC4496a) {
        synchronized (this) {
            if (this.f18257z) {
                throw new IOException("closed");
            }
            if (enumC4496a.f18117w == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m14162i(i13, 4, 3, 0);
            this.f18254w.writeInt(enumC4496a.f18117w);
            this.f18254w.flush();
        }
    }
}
