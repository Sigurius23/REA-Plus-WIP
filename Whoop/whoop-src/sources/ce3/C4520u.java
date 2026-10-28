package ce3;

import a11.C0134l;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import i93.C18282h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yd3.C39472c;

/* JADX INFO: renamed from: ce3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C4520u implements Closeable {

    /* JADX INFO: renamed from: z */
    public static final Logger f18224z;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f18225w;

    /* JADX INFO: renamed from: x */
    public final C4519t f18226x;

    /* JADX INFO: renamed from: y */
    public final C4502d f18227y;

    static {
        Logger logger = Logger.getLogger(AbstractC4506g.class.getName());
        AbstractC22676k.m65749i(logger, "getLogger(...)");
        f18224z = logger;
    }

    public C4520u(C26621j0 source) {
        AbstractC22676k.m65750j(source, "source");
        this.f18225w = source;
        C4519t c4519t = new C4519t(source);
        this.f18226x = c4519t;
        this.f18227y = new C4502d(c4519t);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:193:0x031d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0324 A[Catch: all -> 0x032a, TRY_LEAVE, TryCatch #4 {, blocks: (B:194:0x031e, B:196:0x0324), top: B:233:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0331  */
    /* JADX WARN: Code duplicated, block: B:226:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x0173  */
    /* JADX INFO: renamed from: b */
    public final boolean m14141b(boolean z4, C4515p c4515p) throws Exception {
        C4516q c4516q;
        C4524y c4524yM14135i;
        C26624l debugData;
        C4516q c4516q2;
        C4524y[] c4524yArr;
        int length;
        C4524y c4524y;
        int i13 = 0;
        try {
            this.f18225w.mo79207g0(9L);
            int iM119130o = AbstractC37172f.m119130o(this.f18225w);
            if (iM119130o > 16384) {
                throw new IOException(AbstractC2875y.m8295h(iM119130o, "FRAME_SIZE_ERROR: "));
            }
            int i14 = this.f18225w.readByte() & 255;
            byte b = this.f18225w.readByte();
            int i15 = b & 255;
            int i16 = this.f18225w.readInt();
            int i17 = Integer.MAX_VALUE & i16;
            int i18 = 1;
            if (i14 != 8) {
                Logger logger = f18224z;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC4506g.m14128b(i17, iM119130o, i14, i15, true));
                }
            }
            if (z4 && i14 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + AbstractC4506g.m14127a(i14));
            }
            EnumC4496a enumC4496a = null;
            switch (i14) {
                case 0:
                    m14142h(c4515p, iM119130o, i15, i17);
                    return true;
                case 1:
                    m14144k(c4515p, iM119130o, i15, i17);
                    return true;
                case 2:
                    if (iM119130o != 5) {
                        throw new IOException(AbstractC2875y.m8296i(iM119130o, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i17 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    InterfaceC26620j interfaceC26620j = this.f18225w;
                    interfaceC26620j.readInt();
                    interfaceC26620j.readByte();
                    return true;
                case 3:
                    if (iM119130o != 4) {
                        throw new IOException(AbstractC2875y.m8296i(iM119130o, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i17 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i19 = this.f18225w.readInt();
                    EnumC4496a.f18114x.getClass();
                    EnumC4496a[] enumC4496aArrValues = EnumC4496a.values();
                    int length2 = enumC4496aArrValues.length;
                    while (i13 < length2) {
                        EnumC4496a enumC4496a2 = enumC4496aArrValues[i13];
                        if (enumC4496a2.f18117w == i19) {
                            enumC4496a = enumC4496a2;
                            if (enumC4496a != null) {
                                throw new IOException(AbstractC2875y.m8295h(i19, "TYPE_RST_STREAM unexpected error code: "));
                            }
                            c4516q = (C4516q) c4515p.f18182y;
                            if (i17 == 0 && (i16 & 1) == 0) {
                                C39472c.m126116c(c4516q.f18188I, c4516q.f18208y + '[' + i17 + "] onReset", 0L, new C4511l(c4516q, i17, enumC4496a, i18), 6);
                                return true;
                            }
                            c4524yM14135i = c4516q.m14135i(i17);
                            if (c4524yM14135i != null) {
                                synchronized (c4524yM14135i) {
                                    if (c4524yM14135i.m14155g() == null) {
                                        c4524yM14135i.f18246L = enumC4496a;
                                        c4524yM14135i.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                        i13++;
                    }
                    if (enumC4496a != null) {
                        throw new IOException(AbstractC2875y.m8295h(i19, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    c4516q = (C4516q) c4515p.f18182y;
                    if (i17 == 0) {
                    }
                    c4524yM14135i = c4516q.m14135i(i17);
                    if (c4524yM14135i != null) {
                        synchronized (c4524yM14135i) {
                            if (c4524yM14135i.m14155g() == null) {
                                c4524yM14135i.f18246L = enumC4496a;
                                c4524yM14135i.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    InterfaceC26620j interfaceC26620j2 = this.f18225w;
                    if (i17 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) != 0) {
                        if (iM119130o != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iM119130o % 6 != 0) {
                        throw new IOException(AbstractC2875y.m8295h(iM119130o, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    C4503d0 c4503d0 = new C4503d0();
                    C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(6, AbstractC12889b.m36278i0(0, iM119130o));
                    int i24 = c18282hM36268d0.f71133w;
                    int i25 = c18282hM36268d0.f71134x;
                    int i26 = c18282hM36268d0.f71135y;
                    if ((i26 > 0 && i24 <= i25) || (i26 < 0 && i25 <= i24)) {
                        while (true) {
                            short s13 = interfaceC26620j2.readShort();
                            byte[] bArr = AbstractC37172f.f158958a;
                            int i27 = s13 & 65535;
                            int i28 = interfaceC26620j2.readInt();
                            if (i27 != 2) {
                                if (i27 != 4) {
                                    if (i27 == 5 && (i28 < 16384 || i28 > 16777215)) {
                                        throw new IOException(AbstractC2875y.m8295h(i28, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    }
                                } else if (i28 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (i28 != 0 && i28 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            c4503d0.m14120c(i27, i28);
                            if (i24 != i25) {
                                i24 += i26;
                            }
                        }
                    }
                    C4516q c4516q3 = (C4516q) c4515p.f18182y;
                    C39472c.m126116c(c4516q3.f18187H, AbstractC25012a.m73376i(c4516q3.f18208y, " applyAndAckSettings", new StringBuilder()), 0L, new C0134l(12, c4515p, c4503d0), 6);
                    return true;
                case 5:
                    m14145m(c4515p, iM119130o, i15, i17);
                    return true;
                case 6:
                    if (iM119130o != 8) {
                        throw new IOException(AbstractC2875y.m8295h(iM119130o, "TYPE_PING length != 8: "));
                    }
                    if (i17 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int i29 = this.f18225w.readInt();
                    final int i34 = this.f18225w.readInt();
                    if (((b & 1) != 0 ? 1 : 0) == 0) {
                        C39472c c39472c = ((C4516q) c4515p.f18182y).f18187H;
                        String strM73376i = AbstractC25012a.m73376i(((C4516q) c4515p.f18182y).f18208y, " ping", new StringBuilder());
                        final C4516q c4516q4 = (C4516q) c4515p.f18182y;
                        C39472c.m126116c(c39472c, strM73376i, 0L, new InterfaceC4339a() { // from class: ce3.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                C4516q c4516q5 = c4516q4;
                                try {
                                    c4516q5.f18203X.m14165s(i29, i34, true);
                                } catch (IOException e5) {
                                    EnumC4496a enumC4496a3 = EnumC4496a.PROTOCOL_ERROR;
                                    c4516q5.m14133b(enumC4496a3, enumC4496a3, e5);
                                }
                                return C23454a0.f92919a;
                            }
                        }, 6);
                        return true;
                    }
                    C4516q c4516q5 = (C4516q) c4515p.f18182y;
                    synchronized (c4516q5) {
                        try {
                            if (i29 == 1) {
                                c4516q5.f18192M++;
                            } else if (i29 == 2) {
                                c4516q5.f18194O++;
                            } else if (i29 == 3) {
                                c4516q5.notifyAll();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return true;
                case 7:
                    if (iM119130o < 8) {
                        throw new IOException(AbstractC2875y.m8295h(iM119130o, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i17 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i35 = this.f18225w.readInt();
                    int i36 = this.f18225w.readInt();
                    int i37 = iM119130o - 8;
                    EnumC4496a.f18114x.getClass();
                    for (EnumC4496a enumC4496a3 : EnumC4496a.values()) {
                        if (enumC4496a3.f18117w == i36) {
                            enumC4496a = enumC4496a3;
                            if (enumC4496a != null) {
                                throw new IOException(AbstractC2875y.m8295h(i36, "TYPE_GOAWAY unexpected error code: "));
                            }
                            debugData = C26624l.f105881E;
                            if (i37 > 0) {
                                debugData = this.f18225w.mo79218m0(i37);
                            }
                            AbstractC22676k.m65750j(debugData, "debugData");
                            debugData.mo79253d();
                            c4516q2 = (C4516q) c4515p.f18182y;
                            synchronized (c4516q2) {
                                Object[] array = c4516q2.f18207x.values().toArray(new C4524y[0]);
                                c4516q2.f18185F = true;
                            }
                            c4524yArr = (C4524y[]) array;
                            length = c4524yArr.length;
                            while (i13 < length) {
                                c4524y = c4524yArr[i13];
                                if (c4524y.f18248w <= i35 && c4524y.m14156h()) {
                                    EnumC4496a enumC4496a4 = EnumC4496a.REFUSED_STREAM;
                                    synchronized (c4524y) {
                                        if (c4524y.m14155g() == null) {
                                            c4524y.f18246L = enumC4496a4;
                                            c4524y.notifyAll();
                                        }
                                        break;
                                    }
                                    ((C4516q) c4515p.f18182y).m14135i(c4524y.f18248w);
                                }
                                i13++;
                            }
                            return true;
                        }
                    }
                    if (enumC4496a != null) {
                        throw new IOException(AbstractC2875y.m8295h(i36, "TYPE_GOAWAY unexpected error code: "));
                    }
                    debugData = C26624l.f105881E;
                    if (i37 > 0) {
                        debugData = this.f18225w.mo79218m0(i37);
                    }
                    AbstractC22676k.m65750j(debugData, "debugData");
                    debugData.mo79253d();
                    c4516q2 = (C4516q) c4515p.f18182y;
                    synchronized (c4516q2) {
                        Object[] array2 = c4516q2.f18207x.values().toArray(new C4524y[0]);
                        c4516q2.f18185F = true;
                        c4524yArr = (C4524y[]) array2;
                        length = c4524yArr.length;
                        while (i13 < length) {
                            c4524y = c4524yArr[i13];
                            if (c4524y.f18248w <= i35) {
                            }
                            i13++;
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iM119130o != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM119130o);
                        }
                        long j7 = 2147483647L & ((long) this.f18225w.readInt());
                        if (j7 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f18224z;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(AbstractC4506g.m14129c(i17, iM119130o, j7, true));
                        }
                        if (i17 == 0) {
                            C4516q c4516q6 = (C4516q) c4515p.f18182y;
                            synchronized (c4516q6) {
                                c4516q6.f18201V += j7;
                                c4516q6.notifyAll();
                            }
                            return true;
                        }
                        C4524y c4524yM14134h = ((C4516q) c4515p.f18182y).m14134h(i17);
                        if (c4524yM14134h != null) {
                            synchronized (c4524yM14134h) {
                                c4524yM14134h.f18239E += j7;
                                if (j7 > 0) {
                                    c4524yM14134h.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e5) {
                        f18224z.fine(AbstractC4506g.m14128b(i17, iM119130o, 8, i15, true));
                        throw e5;
                    }
                default:
                    this.f18225w.skip(iM119130o);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18225w.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m14142h(C4515p c4515p, int i13, int i14, int i15) throws IOException {
        int i16;
        boolean z4;
        boolean z13;
        boolean z14;
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z15 = (i14 & 1) != 0;
        if ((i14 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i14 & 8) != 0) {
            byte b = this.f18225w.readByte();
            byte[] bArr = AbstractC37172f.f158958a;
            i16 = b & 255;
        } else {
            i16 = 0;
        }
        int iM14140a = AbstractC4518s.m14140a(i13, i14, i16);
        InterfaceC26620j source = this.f18225w;
        AbstractC22676k.m65750j(source, "source");
        C4516q c4516q = (C4516q) c4515p.f18182y;
        if (i15 == 0 || (i15 & 1) != 0) {
            C4524y c4524yM14134h = c4516q.m14134h(i15);
            if (c4524yM14134h == null) {
                ((C4516q) c4515p.f18182y).m14139x(i15, EnumC4496a.PROTOCOL_ERROR);
                long j7 = iM14140a;
                ((C4516q) c4515p.f18182y).m14137m(j7);
                source.skip(j7);
            } else {
                TimeZone timeZone = AbstractC37174h.f158962a;
                C4522w c4522w = c4524yM14134h.f18242H;
                long j13 = iM14140a;
                c4522w.getClass();
                long j14 = j13;
                while (true) {
                    if (j14 <= 0) {
                        z4 = z15;
                        C4524y c4524y = c4522w.f18233F;
                        TimeZone timeZone2 = AbstractC37174h.f158962a;
                        c4524y.f18249x.m14137m(j13);
                        c4522w.f18233F.f18249x.f18196Q.getClass();
                        break;
                    }
                    synchronized (c4522w.f18233F) {
                        z13 = c4522w.f18235x;
                        z4 = z15;
                        z14 = c4522w.f18237z.f105866x + j14 > c4522w.f18234w;
                    }
                    if (z14) {
                        source.skip(j14);
                        c4522w.f18233F.m14154f(EnumC4496a.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z13) {
                        source.skip(j14);
                        break;
                    }
                    long jMo9164h1 = source.mo9164h1(c4522w.f18236y, j14);
                    if (jMo9164h1 == -1) {
                        throw new EOFException();
                    }
                    j14 -= jMo9164h1;
                    C4524y c4524y2 = c4522w.f18233F;
                    synchronized (c4524y2) {
                        try {
                            if (c4522w.f18232E) {
                                c4522w.f18236y.m79200b();
                            } else {
                                C26616h c26616h = c4522w.f18237z;
                                boolean z16 = c26616h.f105866x == 0;
                                c26616h.mo79189N0(c4522w.f18236y);
                                if (z16) {
                                    c4524y2.notifyAll();
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    z15 = z4;
                }
                if (z4) {
                    c4524yM14134h.m14158j(C34807d0.f146547x, true);
                }
            }
        } else {
            C26616h c26616h2 = new C26616h();
            long j15 = iM14140a;
            source.mo79207g0(j15);
            source.mo9164h1(c26616h2, j15);
            C39472c.m126116c(c4516q.f18188I, c4516q.f18208y + '[' + i15 + "] onData", 0L, new C4510k(c4516q, i15, c26616h2, iM14140a, z15), 6);
        }
        this.f18225w.skip(i16);
    }

    /* JADX INFO: renamed from: i */
    public final List m14143i(int i13, int i14, int i15, int i16) throws IOException {
        C4519t c4519t = this.f18226x;
        c4519t.f18218E = i13;
        c4519t.f18221x = i13;
        c4519t.f18219F = i14;
        c4519t.f18222y = i15;
        c4519t.f18223z = i16;
        C4502d c4502d = this.f18227y;
        C26621j0 c26621j0 = c4502d.f18137c;
        ArrayList arrayList = c4502d.f18136b;
        while (!c26621j0.mo79222o()) {
            byte b = c26621j0.readByte();
            byte[] bArr = AbstractC37172f.f158958a;
            int i17 = b & 255;
            if (i17 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iM14117e = c4502d.m14117e(i17, 127);
                int i18 = iM14117e - 1;
                if (i18 >= 0) {
                    C4500c[] c4500cArr = AbstractC4505f.f18152a;
                    if (i18 <= c4500cArr.length - 1) {
                        arrayList.add(c4500cArr[i18]);
                    }
                }
                int length = c4502d.f18139e + 1 + (i18 - AbstractC4505f.f18152a.length);
                if (length >= 0) {
                    C4500c[] c4500cArr2 = c4502d.f18138d;
                    if (length < c4500cArr2.length) {
                        C4500c c4500c = c4500cArr2[length];
                        AbstractC22676k.m65747g(c4500c);
                        arrayList.add(c4500c);
                    }
                }
                throw new IOException(AbstractC2875y.m8295h(iM14117e, "Header index too large "));
            }
            if (i17 == 64) {
                C4500c[] c4500cArr3 = AbstractC4505f.f18152a;
                C26624l c26624lM14116d = c4502d.m14116d();
                AbstractC4505f.m14126a(c26624lM14116d);
                c4502d.m14115c(new C4500c(c26624lM14116d, c4502d.m14116d()));
            } else if ((b & 64) == 64) {
                c4502d.m14115c(new C4500c(c4502d.m14114b(c4502d.m14117e(i17, 63) - 1), c4502d.m14116d()));
            } else if ((b & 32) == 32) {
                int iM14117e2 = c4502d.m14117e(i17, 31);
                c4502d.f18135a = iM14117e2;
                if (iM14117e2 < 0 || iM14117e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c4502d.f18135a);
                }
                int i19 = c4502d.f18141g;
                if (iM14117e2 < i19) {
                    if (iM14117e2 == 0) {
                        C4500c[] c4500cArr4 = c4502d.f18138d;
                        AbstractC25260n.m74073n0(0, c4500cArr4.length, null, c4500cArr4);
                        c4502d.f18139e = c4502d.f18138d.length - 1;
                        c4502d.f18140f = 0;
                        c4502d.f18141g = 0;
                    } else {
                        c4502d.m14113a(i19 - iM14117e2);
                    }
                }
            } else if (i17 == 16 || i17 == 0) {
                C4500c[] c4500cArr5 = AbstractC4505f.f18152a;
                C26624l c26624lM14116d2 = c4502d.m14116d();
                AbstractC4505f.m14126a(c26624lM14116d2);
                arrayList.add(new C4500c(c26624lM14116d2, c4502d.m14116d()));
            } else {
                arrayList.add(new C4500c(c4502d.m14114b(c4502d.m14117e(i17, 15) - 1), c4502d.m14116d()));
            }
        }
        List listM74093D1 = AbstractC25265s.m74093D1(arrayList);
        arrayList.clear();
        return listM74093D1;
    }

    /* JADX INFO: renamed from: k */
    public final void m14144k(C4515p c4515p, int i13, int i14, int i15) throws IOException {
        int i16;
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i17 = 0;
        boolean z4 = (i14 & 1) != 0;
        if ((i14 & 8) != 0) {
            byte b = this.f18225w.readByte();
            byte[] bArr = AbstractC37172f.f158958a;
            i17 = b & 255;
        }
        if ((i14 & 32) != 0) {
            InterfaceC26620j interfaceC26620j = this.f18225w;
            interfaceC26620j.readInt();
            interfaceC26620j.readByte();
            byte[] bArr2 = AbstractC37172f.f158958a;
            i16 = i13 - 5;
        } else {
            i16 = i13;
        }
        List listM14143i = m14143i(AbstractC4518s.m14140a(i16, i14, i17), i17, i14, i15);
        C4516q c4516q = (C4516q) c4515p.f18182y;
        if (i15 != 0 && (i15 & 1) == 0) {
            C39472c.m126116c(c4516q.f18188I, c4516q.f18208y + '[' + i15 + "] onHeaders", 0L, new C4511l(c4516q, i15, listM14143i, z4), 6);
            return;
        }
        synchronized (c4516q) {
            C4524y c4524yM14134h = c4516q.m14134h(i15);
            if (c4524yM14134h != null) {
                c4524yM14134h.m14158j(AbstractC37174h.m119141h(listM14143i), z4);
                return;
            }
            if (c4516q.f18185F) {
                return;
            }
            if (i15 <= c4516q.f18209z) {
                return;
            }
            if (i15 % 2 == c4516q.f18184E % 2) {
                return;
            }
            C4524y c4524y = new C4524y(i15, c4516q, false, z4, AbstractC37174h.m119141h(listM14143i));
            c4516q.f18209z = i15;
            c4516q.f18207x.put(Integer.valueOf(i15), c4524y);
            C39472c.m126116c(c4516q.f18186G.m126126d(), c4516q.f18208y + '[' + i15 + "] onStream", 0L, new C0134l(11, c4516q, c4524y), 6);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14145m(C4515p c4515p, int i13, int i14, int i15) throws IOException {
        int i16;
        if (i15 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i17 = 0;
        if ((i14 & 8) != 0) {
            byte b = this.f18225w.readByte();
            byte[] bArr = AbstractC37172f.f158958a;
            i16 = b & 255;
        } else {
            i16 = 0;
        }
        int i18 = this.f18225w.readInt() & Integer.MAX_VALUE;
        List listM14143i = m14143i(AbstractC4518s.m14140a(i13 - 4, i14, i16), i16, i14, i15);
        C4516q c4516q = (C4516q) c4515p.f18182y;
        synchronized (c4516q) {
            if (c4516q.f18205Z.contains(Integer.valueOf(i18))) {
                c4516q.m14139x(i18, EnumC4496a.PROTOCOL_ERROR);
                return;
            }
            c4516q.f18205Z.add(Integer.valueOf(i18));
            C39472c.m126116c(c4516q.f18188I, c4516q.f18208y + '[' + i18 + "] onRequest", 0L, new C4511l(c4516q, i18, listM14143i, i17), 6);
        }
    }
}
