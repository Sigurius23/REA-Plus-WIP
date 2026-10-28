package p675z9;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.AbstractC1707m0;
import com.iterable.iterableapi.C5363q;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.C33619a0;
import p499t9.C33620b;
import p499t9.C33638k;
import p499t9.C33642m;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: z9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C40200b implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final C38059n f173503a = new C38059n(4);

    /* JADX INFO: renamed from: b */
    public final C38059n f173504b = new C38059n(9);

    /* JADX INFO: renamed from: c */
    public final C38059n f173505c = new C38059n(11);

    /* JADX INFO: renamed from: d */
    public final C38059n f173506d = new C38059n();

    /* JADX INFO: renamed from: e */
    public final C40201c f173507e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33648q f173508f;

    /* JADX INFO: renamed from: g */
    public int f173509g;

    /* JADX INFO: renamed from: h */
    public boolean f173510h;

    /* JADX INFO: renamed from: i */
    public long f173511i;

    /* JADX INFO: renamed from: j */
    public int f173512j;

    /* JADX INFO: renamed from: k */
    public int f173513k;

    /* JADX INFO: renamed from: l */
    public int f173514l;

    /* JADX INFO: renamed from: m */
    public long f173515m;

    /* JADX INFO: renamed from: n */
    public boolean f173516n;

    /* JADX INFO: renamed from: o */
    public C40199a f173517o;

    /* JADX INFO: renamed from: p */
    public C40202d f173518p;

    public C40200b() {
        C40201c c40201c = new C40201c(new C33642m(), 8);
        c40201c.f173520y = -9223372036854775807L;
        c40201c.f173521z = new long[0];
        c40201c.f173519E = new long[0];
        this.f173507e = c40201c;
        this.f173509g = 1;
    }

    /* JADX INFO: renamed from: a */
    public final C38059n m129085a(InterfaceC33646o interfaceC33646o) {
        int i13 = this.f173514l;
        C38059n c38059n = this.f173506d;
        byte[] bArr = c38059n.f163017a;
        if (i13 > bArr.length) {
            c38059n.m121844D(0, new byte[Math.max(bArr.length * 2, i13)]);
        } else {
            c38059n.m121846F(0);
        }
        c38059n.m121845E(this.f173514l);
        interfaceC33646o.readFully(c38059n.f163017a, 0, this.f173514l);
        return c38059n;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        if (j7 == 0) {
            this.f173509g = 1;
            this.f173510h = false;
        } else {
            this.f173509g = 3;
        }
        this.f173512j = 0;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f173508f = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        C38059n c38059n = this.f173503a;
        C33638k c33638k = (C33638k) interfaceC33646o;
        c33638k.mo3092c(c38059n.f163017a, 0, 3, false);
        c38059n.m121846F(0);
        if (c38059n.m121870w() == 4607062) {
            c33638k.mo3092c(c38059n.f163017a, 0, 2, false);
            c38059n.m121846F(0);
            if ((c38059n.m121873z() & AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION) == 0) {
                c33638k.mo3092c(c38059n.f163017a, 0, 4, false);
                c38059n.m121846F(0);
                int iM121854g = c38059n.m121854g();
                c33638k.f140403F = 0;
                c33638k.mo3078C(iM121854g, false);
                c33638k.mo3092c(c38059n.f163017a, 0, 4, false);
                c38059n.m121846F(0);
                if (c38059n.m121854g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        long j7;
        long j13;
        int i13;
        int i14;
        long j14;
        boolean z4;
        boolean z13;
        boolean z14;
        long j15;
        AbstractC35849g.m113808j(this.f173508f);
        while (true) {
            int i15 = this.f173509g;
            if (i15 == 1) {
                C38059n c38059n = this.f173504b;
                if (!interfaceC33646o.mo3094f(c38059n.f163017a, 0, 9, true)) {
                    return -1;
                }
                c38059n.m121846F(0);
                c38059n.m121847G(4);
                int iM121867t = c38059n.m121867t();
                boolean z15 = (iM121867t & 4) != 0;
                boolean z16 = (iM121867t & 1) != 0;
                if (z15 && this.f173517o == null) {
                    this.f173517o = new C40199a(this.f173508f.mo3101o(8, 1), 8);
                }
                if (z16 && this.f173518p == null) {
                    this.f173518p = new C40202d(this.f173508f.mo3101o(9, 2));
                }
                this.f173508f.mo3098l();
                this.f173512j = c38059n.m121854g() - 5;
                this.f173509g = 2;
            } else if (i15 == 2) {
                interfaceC33646o.mo3100n(this.f173512j);
                this.f173512j = 0;
                this.f173509g = 3;
            } else if (i15 == 3) {
                C38059n c38059n2 = this.f173505c;
                if (!interfaceC33646o.mo3094f(c38059n2.f163017a, 0, 11, true)) {
                    return -1;
                }
                c38059n2.m121846F(0);
                this.f173513k = c38059n2.m121867t();
                this.f173514l = c38059n2.m121870w();
                this.f173515m = c38059n2.m121870w();
                this.f173515m = (((long) (c38059n2.m121867t() << 24)) | this.f173515m) * 1000;
                c38059n2.m121847G(3);
                this.f173509g = 4;
            } else {
                if (i15 != 4) {
                    throw new IllegalStateException();
                }
                boolean z17 = this.f173510h;
                C40201c c40201c = this.f173507e;
                if (z17) {
                    j7 = this.f173511i + this.f173515m;
                } else {
                    if (c40201c.f173520y == -9223372036854775807L) {
                        j13 = 0;
                    } else {
                        j7 = this.f173515m;
                    }
                    i13 = this.f173513k;
                    if (i13 == 8 || this.f173517o == null) {
                        i14 = 0;
                        if (i13 == 9 || this.f173518p == null) {
                            j14 = -9223372036854775807L;
                            if (i13 == 18 || this.f173516n) {
                                interfaceC33646o.mo3100n(this.f173514l);
                                z4 = false;
                                z13 = false;
                            } else {
                                C38059n c38059nM129085a = m129085a(interfaceC33646o);
                                c40201c.getClass();
                                c40201c.getClass();
                                if (c38059nM129085a.m121867t() == 2 && "onMetaData".equals(C40201c.m129088S(c38059nM129085a)) && c38059nM129085a.m121848a() != 0 && c38059nM129085a.m121867t() == 8) {
                                    HashMap mapM129087R = C40201c.m129087R(c38059nM129085a);
                                    Object obj = mapM129087R.get(AttachmentExtensionsKt.EXTRA_DURATION);
                                    double d3 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            c40201c.f173520y = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapM129087R.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            c40201c.f173521z = new long[size];
                                            c40201c.f173519E = new long[size];
                                            int i16 = 0;
                                            while (i16 < size) {
                                                Object obj5 = list.get(i16);
                                                Object obj6 = list2.get(i16);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    c40201c.f173521z = new long[0];
                                                    c40201c.f173519E = new long[0];
                                                    break;
                                                }
                                                double d14 = d3;
                                                c40201c.f173521z[i16] = (long) (((Double) obj6).doubleValue() * d14);
                                                c40201c.f173519E[i16] = ((Double) obj5).longValue();
                                                i16++;
                                                d3 = d14;
                                            }
                                        }
                                    }
                                }
                                long j16 = c40201c.f173520y;
                                if (j16 != -9223372036854775807L) {
                                    this.f173508f.mo3109v(new C33619a0(j16, c40201c.f173519E, c40201c.f173521z));
                                    this.f173516n = true;
                                }
                                z13 = false;
                            }
                        } else {
                            if (!this.f173516n) {
                                this.f173508f.mo3109v(new C33651t(-9223372036854775807L));
                                this.f173516n = true;
                            }
                            C40202d c40202d = this.f173518p;
                            C38059n c38059nM129085a2 = m129085a(interfaceC33646o);
                            c40202d.getClass();
                            int iM121867t2 = c38059nM129085a2.m121867t();
                            int i17 = (iM121867t2 >> 4) & 15;
                            int i18 = iM121867t2 & 15;
                            if (i18 != 7) {
                                final String strM8295h = AbstractC2875y.m8295h(i18, "Video format not supported: ");
                                throw new ParserException(strM8295h) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            c40202d.f173525H = i17;
                            if (i17 != 5) {
                                C38059n c38059n3 = c40202d.f173526y;
                                InterfaceC33639k0 interfaceC33639k0 = (InterfaceC33639k0) c40202d.f475x;
                                C38059n c38059n4 = c40202d.f173527z;
                                int iM121867t3 = c38059nM129085a2.m121867t();
                                byte[] bArr = c38059nM129085a2.f163017a;
                                int i19 = c38059nM129085a2.f163018b;
                                int i24 = i19 + 1;
                                c38059nM129085a2.f163018b = i24;
                                j14 = -9223372036854775807L;
                                int i25 = ((bArr[i19] & 255) << 24) >> 8;
                                int i26 = i19 + 2;
                                c38059nM129085a2.f163018b = i26;
                                int i27 = i25 | ((bArr[i24] & 255) << 8);
                                c38059nM129085a2.f163018b = i19 + 3;
                                long j17 = (((long) (i27 | (bArr[i26] & 255))) * 1000) + j13;
                                boolean z18 = false;
                                if (iM121867t3 == 0 && !c40202d.f173523F) {
                                    byte[] bArr2 = new byte[c38059nM129085a2.m121848a()];
                                    C38059n c38059n5 = new C38059n(bArr2);
                                    c38059nM129085a2.m121852e(bArr2, 0, c38059nM129085a2.m121848a());
                                    C33620b c33620bM106232a = C33620b.m106232a(c38059n5);
                                    c40202d.f173522E = c33620bM106232a.f140331b;
                                    C34608o c34608o = new C34608o();
                                    c34608o.f145740l = AbstractC34587d0.m109382o("video/x-flv");
                                    c34608o.f145741m = AbstractC34587d0.m109382o("video/avc");
                                    c34608o.f145738j = c33620bM106232a.f140341l;
                                    c34608o.f145748t = c33620bM106232a.f140332c;
                                    c34608o.f145749u = c33620bM106232a.f140333d;
                                    c34608o.f145752x = c33620bM106232a.f140340k;
                                    c34608o.f145744p = c33620bM106232a.f140330a;
                                    AbstractC21702c.m61152w(c34608o, interfaceC33639k0);
                                    c40202d.f173523F = true;
                                } else if (iM121867t3 == 1 && c40202d.f173523F) {
                                    int i28 = c40202d.f173525H == 1 ? 1 : 0;
                                    if (c40202d.f173524G || i28 != 0) {
                                        byte[] bArr3 = c38059n4.f163017a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i29 = 4 - c40202d.f173522E;
                                        int i34 = 0;
                                        while (c38059nM129085a2.m121848a() > 0) {
                                            c38059nM129085a2.m121852e(c38059n4.f163017a, i29, c40202d.f173522E);
                                            c38059n4.m121846F(0);
                                            int iM121871x = c38059n4.m121871x();
                                            c38059n3.m121846F(0);
                                            interfaceC33639k0.mo36176d(c38059n3, 4, 0);
                                            interfaceC33639k0.mo36176d(c38059nM129085a2, iM121871x, 0);
                                            i34 = i34 + 4 + iM121871x;
                                        }
                                        ((InterfaceC33639k0) c40202d.f475x).mo36174b(j17, i28, i34, 0, null);
                                        c40202d.f173524G = true;
                                        z18 = true;
                                    }
                                }
                                if (z18) {
                                    z14 = true;
                                }
                                z13 = z14;
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            z14 = false;
                            z13 = z14;
                        }
                        z4 = true;
                    } else {
                        if (!this.f173516n) {
                            this.f173508f.mo3109v(new C33651t(-9223372036854775807L));
                            this.f173516n = true;
                        }
                        C40199a c40199a = this.f173517o;
                        C38059n c38059nM129085a3 = m129085a(interfaceC33646o);
                        InterfaceC33639k0 interfaceC33639k1 = (InterfaceC33639k0) c40199a.f475x;
                        if (c40199a.f173501y) {
                            i14 = 0;
                            c38059nM129085a3.m121847G(1);
                        } else {
                            int iM121867t4 = c38059nM129085a3.m121867t();
                            int i35 = (iM121867t4 >> 4) & 15;
                            c40199a.f173500E = i35;
                            i14 = 0;
                            if (i35 == 2) {
                                int i36 = C40199a.f173499F[(iM121867t4 >> 2) & 3];
                                C34608o c34608o2 = new C34608o();
                                c34608o2.f145740l = AbstractC34587d0.m109382o("video/x-flv");
                                c34608o2.f145741m = AbstractC34587d0.m109382o("audio/mpeg");
                                c34608o2.f145719C = 1;
                                c34608o2.f145720D = i36;
                                AbstractC21702c.m61152w(c34608o2, interfaceC33639k1);
                                c40199a.f173502z = true;
                            } else if (i35 == 7 || i35 == 8) {
                                String str = i35 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C34608o c34608o3 = new C34608o();
                                c34608o3.f145740l = AbstractC34587d0.m109382o("video/x-flv");
                                c34608o3.f145741m = AbstractC34587d0.m109382o(str);
                                c34608o3.f145719C = 1;
                                c34608o3.f145720D = 8000;
                                AbstractC21702c.m61152w(c34608o3, interfaceC33639k1);
                                c40199a.f173502z = true;
                            } else if (i35 != 10) {
                                final String str2 = "Audio format not supported: " + c40199a.f173500E;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            c40199a.f173501y = true;
                        }
                        InterfaceC33639k0 interfaceC33639k2 = (InterfaceC33639k0) c40199a.f475x;
                        z13 = false;
                        if (c40199a.f173500E == 2) {
                            int iM121848a = c38059nM129085a3.m121848a();
                            interfaceC33639k2.mo36176d(c38059nM129085a3, iM121848a, 0);
                            ((InterfaceC33639k0) c40199a.f475x).mo36174b(j13, 1, iM121848a, 0, null);
                        } else {
                            int iM121867t5 = c38059nM129085a3.m121867t();
                            if (iM121867t5 == 0 && !c40199a.f173502z) {
                                int iM121848a2 = c38059nM129085a3.m121848a();
                                byte[] bArr4 = new byte[iM121848a2];
                                c38059nM129085a3.m121852e(bArr4, 0, iM121848a2);
                                C5363q c5363qM106221m = AbstractC33618a.m106221m(new C24561s(bArr4, iM121848a2, 5, (byte) 0), false);
                                C34608o c34608o4 = new C34608o();
                                c34608o4.f145740l = AbstractC34587d0.m109382o("video/x-flv");
                                c34608o4.f145741m = AbstractC34587d0.m109382o("audio/mp4a-latm");
                                c34608o4.f145738j = c5363qM106221m.f21805a;
                                c34608o4.f145719C = c5363qM106221m.f21807c;
                                c34608o4.f145720D = c5363qM106221m.f21806b;
                                c34608o4.f145744p = Collections.singletonList(bArr4);
                                AbstractC21702c.m61152w(c34608o4, interfaceC33639k2);
                                c40199a.f173502z = true;
                            } else if (c40199a.f173500E != 10 || iM121867t5 == 1) {
                                int iM121848a3 = c38059nM129085a3.m121848a();
                                interfaceC33639k2.mo36176d(c38059nM129085a3, iM121848a3, 0);
                                ((InterfaceC33639k0) c40199a.f475x).mo36174b(j13, 1, iM121848a3, 0, null);
                            }
                            z4 = true;
                            j14 = -9223372036854775807L;
                        }
                        z13 = true;
                        z4 = true;
                        j14 = -9223372036854775807L;
                    }
                    if (!this.f173510h && z13) {
                        this.f173510h = true;
                        if (c40201c.f173520y == j14) {
                            j15 = -this.f173515m;
                        } else {
                            j15 = 0;
                        }
                        this.f173511i = j15;
                    }
                    this.f173512j = 4;
                    this.f173509g = 2;
                    if (z4) {
                        return i14;
                    }
                }
                j13 = j7;
                i13 = this.f173513k;
                if (i13 == 8) {
                    i14 = 0;
                    if (i13 == 9) {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        interfaceC33646o.mo3100n(this.f173514l);
                        z4 = false;
                        z13 = false;
                    } else {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        interfaceC33646o.mo3100n(this.f173514l);
                        z4 = false;
                        z13 = false;
                    }
                } else {
                    i14 = 0;
                    if (i13 == 9) {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        interfaceC33646o.mo3100n(this.f173514l);
                        z4 = false;
                        z13 = false;
                    } else {
                        j14 = -9223372036854775807L;
                        if (i13 == 18) {
                        }
                        interfaceC33646o.mo3100n(this.f173514l);
                        z4 = false;
                        z13 = false;
                    }
                }
                if (!this.f173510h) {
                    this.f173510h = true;
                    if (c40201c.f173520y == j14) {
                        j15 = -this.f173515m;
                    } else {
                        j15 = 0;
                    }
                    this.f173511i = j15;
                }
                this.f173512j = 4;
                this.f173509g = 2;
                if (z4) {
                    return i14;
                }
            }
        }
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
