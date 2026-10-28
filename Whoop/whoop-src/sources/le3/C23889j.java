package le3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26624l;
import ne3.C26644x;
import ne3.InterfaceC26620j;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: le3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C23889j implements Closeable {

    /* JADX INFO: renamed from: E */
    public boolean f94475E;

    /* JADX INFO: renamed from: F */
    public int f94476F;

    /* JADX INFO: renamed from: G */
    public long f94477G;

    /* JADX INFO: renamed from: H */
    public boolean f94478H;

    /* JADX INFO: renamed from: I */
    public boolean f94479I;

    /* JADX INFO: renamed from: J */
    public boolean f94480J;

    /* JADX INFO: renamed from: K */
    public final C26616h f94481K;

    /* JADX INFO: renamed from: L */
    public final C26616h f94482L;

    /* JADX INFO: renamed from: M */
    public C23880a f94483M;

    /* JADX INFO: renamed from: N */
    public final byte[] f94484N;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f94485w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC23888i f94486x;

    /* JADX INFO: renamed from: y */
    public final boolean f94487y;

    /* JADX INFO: renamed from: z */
    public final boolean f94488z;

    public C23889j(InterfaceC26620j source, InterfaceC23888i interfaceC23888i, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(source, "source");
        this.f94485w = source;
        this.f94486x = interfaceC23888i;
        this.f94487y = z4;
        this.f94488z = z13;
        this.f94481K = new C26616h();
        this.f94482L = new C26616h();
        this.f94484N = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m70168b() throws IOException {
        m70170i();
        if (this.f94479I) {
            m70169h();
            return;
        }
        int i13 = this.f94476F;
        if (i13 != 1 && i13 != 2) {
            TimeZone timeZone = AbstractC37174h.f158962a;
            String hexString = Integer.toHexString(i13);
            AbstractC22676k.m65749i(hexString, "toHexString(...)");
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.f94475E) {
            long j7 = this.f94477G;
            C26616h c26616h = this.f94482L;
            if (j7 > 0) {
                this.f94485w.mo79212j0(c26616h, j7);
            }
            if (this.f94478H) {
                if (this.f94480J) {
                    C23880a c23880a = this.f94483M;
                    if (c23880a == null) {
                        c23880a = new C23880a(this.f94488z, 1);
                        this.f94483M = c23880a;
                    }
                    C26616h c26616h2 = c23880a.f94432y;
                    if (c26616h2.f105866x != 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    Inflater inflater = (Inflater) c23880a.f94433z;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        c23880a.f94433z = inflater;
                    }
                    C26644x c26644x = (C26644x) c23880a.f94429E;
                    if (c26644x == null) {
                        c26644x = new C26644x(AbstractC26604b.m79158c(c26616h2), inflater);
                        c23880a.f94429E = c26644x;
                    }
                    if (c23880a.f94431x) {
                        inflater.reset();
                    }
                    c26616h2.mo79189N0(c26616h);
                    c26616h2.m79226p1(65535);
                    long bytesRead = inflater.getBytesRead() + c26616h2.f105866x;
                    do {
                        c26644x.m79286b(c26616h, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        c26616h2.m79200b();
                        c26644x.close();
                        c23880a.f94429E = null;
                        c23880a.f94433z = null;
                    }
                }
                InterfaceC23888i interfaceC23888i = this.f94486x;
                if (i13 == 1) {
                    C23886g c23886g = (C23886g) interfaceC23888i;
                    c23886g.f94446b.onMessage(c23886g, c26616h.m79194S0());
                    return;
                } else {
                    C26624l bytes = c26616h.mo79218m0(c26616h.f105866x);
                    C23886g c23886g2 = (C23886g) interfaceC23888i;
                    AbstractC22676k.m65750j(bytes, "bytes");
                    c23886g2.f94446b.onMessage(c23886g2, bytes);
                    return;
                }
            }
            while (!this.f94475E) {
                m70170i();
                if (!this.f94479I) {
                    break;
                } else {
                    m70169h();
                }
            }
            if (this.f94476F != 0) {
                int i14 = this.f94476F;
                TimeZone timeZone2 = AbstractC37174h.f158962a;
                String hexString2 = Integer.toHexString(i14);
                AbstractC22676k.m65749i(hexString2, "toHexString(...)");
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C23880a c23880a = this.f94483M;
        if (c23880a != null) {
            AbstractC37172f.m119117b(c23880a);
        }
        AbstractC37172f.m119117b(this.f94485w);
    }

    /* JADX INFO: renamed from: h */
    public final void m70169h() throws ProtocolException, EOFException {
        String strM79194S0;
        short s13;
        String strM8295h;
        long j7 = this.f94477G;
        if (j7 > 0) {
            this.f94485w.mo79212j0(this.f94481K, j7);
        }
        switch (this.f94476F) {
            case 8:
                C26616h c26616h = this.f94481K;
                long j13 = c26616h.f105866x;
                if (j13 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j13 != 0) {
                    s13 = c26616h.readShort();
                    strM79194S0 = this.f94481K.m79194S0();
                    if (s13 < 1000 || s13 >= 5000) {
                        strM8295h = AbstractC2875y.m8295h(s13, "Code must be in range [1000,5000): ");
                    } else {
                        strM8295h = ((1004 > s13 || s13 >= 1007) && (1015 > s13 || s13 >= 3000)) ? null : AbstractC2875y.m8296i(s13, "Code ", " is reserved and may not be used.");
                    }
                    if (strM8295h != null) {
                        throw new ProtocolException(strM8295h);
                    }
                } else {
                    strM79194S0 = "";
                    s13 = 1005;
                }
                C23886g c23886g = (C23886g) this.f94486x;
                if (s13 == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (c23886g) {
                    if (c23886g.f94464t != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    c23886g.f94464t = s13;
                    c23886g.f94465u = strM79194S0;
                }
                c23886g.f94446b.onClosing(c23886g, s13, strM79194S0);
                this.f94475E = true;
                return;
            case 9:
                InterfaceC23888i interfaceC23888i = this.f94486x;
                C26616h c26616h2 = this.f94481K;
                C26624l payload = c26616h2.mo79218m0(c26616h2.f105866x);
                C23886g c23886g2 = (C23886g) interfaceC23888i;
                synchronized (c23886g2) {
                    try {
                        AbstractC22676k.m65750j(payload, "payload");
                        if (!c23886g2.f94466v && (!c23886g2.f94463s || !c23886g2.f94461q.isEmpty())) {
                            c23886g2.f94460p.add(payload);
                            c23886g2.m70164f();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 10:
                InterfaceC23888i interfaceC23888i2 = this.f94486x;
                C26616h c26616h3 = this.f94481K;
                C26624l payload2 = c26616h3.mo79218m0(c26616h3.f105866x);
                C23886g c23886g3 = (C23886g) interfaceC23888i2;
                synchronized (c23886g3) {
                    AbstractC22676k.m65750j(payload2, "payload");
                    c23886g3.f94468x = false;
                }
                return;
            default:
                int i13 = this.f94476F;
                TimeZone timeZone = AbstractC37174h.f158962a;
                String hexString = Integer.toHexString(i13);
                AbstractC22676k.m65749i(hexString, "toHexString(...)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m70170i() throws IOException {
        boolean z4;
        if (this.f94475E) {
            throw new IOException("closed");
        }
        InterfaceC26620j interfaceC26620j = this.f94485w;
        long jMo79282h = interfaceC26620j.timeout().mo79282h();
        interfaceC26620j.timeout().mo79279b();
        try {
            byte b = interfaceC26620j.readByte();
            byte[] bArr = AbstractC37172f.f158958a;
            interfaceC26620j.timeout().mo79277g(jMo79282h, TimeUnit.NANOSECONDS);
            int i13 = b & 15;
            this.f94476F = i13;
            boolean z13 = (b & 128) != 0;
            this.f94478H = z13;
            boolean z14 = (b & 8) != 0;
            this.f94479I = z14;
            if (z14 && !z13) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z15 = (b & 64) != 0;
            if (i13 == 1 || i13 == 2) {
                if (!z15) {
                    z4 = false;
                } else {
                    if (!this.f94487y) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z4 = true;
                }
                this.f94480J = z4;
            } else if (z15) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b6 = interfaceC26620j.readByte();
            boolean z16 = (b6 & 128) != 0;
            if (z16) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j7 = b6 & 127;
            this.f94477G = j7;
            if (j7 == 126) {
                this.f94477G = interfaceC26620j.readShort() & 65535;
            } else if (j7 == 127) {
                long j13 = interfaceC26620j.readLong();
                this.f94477G = j13;
                if (j13 < 0) {
                    StringBuilder sb4 = new StringBuilder("Frame length 0x");
                    long j14 = this.f94477G;
                    TimeZone timeZone = AbstractC37174h.f158962a;
                    String hexString = Long.toHexString(j14);
                    AbstractC22676k.m65749i(hexString, "toHexString(...)");
                    sb4.append(hexString);
                    sb4.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb4.toString());
                }
            }
            if (this.f94479I && this.f94477G > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z16) {
                byte[] bArr2 = this.f94484N;
                AbstractC22676k.m65747g(bArr2);
                interfaceC26620j.readFully(bArr2);
            }
        } catch (Throwable th3) {
            interfaceC26620j.timeout().mo79277g(jMo79282h, TimeUnit.NANOSECONDS);
            throw th3;
        }
    }
}
