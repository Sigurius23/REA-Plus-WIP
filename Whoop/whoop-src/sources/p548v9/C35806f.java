package p548v9;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p690zr.AbstractC41005a0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41060w0;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: v9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C35806f implements InterfaceC35801a {

    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 f152324a;

    /* JADX INFO: renamed from: b */
    public final int f152325b;

    public C35806f(int i13, C41060w0 c41060w0) {
        this.f152325b = i13;
        this.f152324a = c41060w0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static C35806f m113526b(int i13, C38059n c38059n) {
        String str;
        InterfaceC35801a c35807g;
        String str2;
        int i14 = 4;
        AbstractC41047q.m133273c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i15 = c38059n.f163019c;
        int iM113523a = -2;
        int i16 = 0;
        while (c38059n.m121848a() > 8) {
            int iM121856i = c38059n.m121856i();
            int iM121856i2 = c38059n.f163018b + c38059n.m121856i();
            c38059n.m121845E(iM121856i2);
            if (iM121856i != 1414744396) {
                C35804d c35804d = null;
                switch (iM121856i) {
                    case 1718776947:
                        if (iM113523a != 2) {
                            if (iM113523a == 1) {
                                int iM121860m = c38059n.m121860m();
                                if (iM121860m == 1) {
                                    str = "audio/raw";
                                } else if (iM121860m == 85) {
                                    str = "audio/mpeg";
                                } else if (iM121860m == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM121860m != 8192) {
                                    str = iM121860m != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM121860m2 = c38059n.m121860m();
                                    int iM121856i3 = c38059n.m121856i();
                                    c38059n.m121847G(6);
                                    int iM121930w = AbstractC38065t.m121930w(c38059n.m121860m());
                                    int iM121860m3 = c38059n.m121848a() > 0 ? c38059n.m121860m() : 0;
                                    C34608o c34608o = new C34608o();
                                    c34608o.f145741m = AbstractC34587d0.m109382o(str);
                                    c34608o.f145719C = iM121860m2;
                                    c34608o.f145720D = iM121856i3;
                                    if (str.equals("audio/raw") && iM121930w != 0) {
                                        c34608o.f145721E = iM121930w;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iM121860m3 > 0) {
                                        byte[] bArr = new byte[iM121860m3];
                                        c38059n.m121852e(bArr, 0, iM121860m3);
                                        c34608o.f145744p = AbstractC41023g0.m133256r(bArr);
                                    }
                                    c35807g = new C35807g(new C34610p(c34608o));
                                } else {
                                    AbstractC38963t7.m124388r(iM121860m, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                AbstractC38046a.m121826u("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC38065t.m121887A(iM113523a));
                            }
                            c35807g = c35804d;
                            break;
                        } else {
                            c38059n.m121847G(i14);
                            int iM121856i4 = c38059n.m121856i();
                            int iM121856i5 = c38059n.m121856i();
                            c38059n.m121847G(i14);
                            int iM121856i6 = c38059n.m121856i();
                            switch (iM121856i6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                C34608o c34608o2 = new C34608o();
                                c34608o2.f145748t = iM121856i4;
                                c34608o2.f145749u = iM121856i5;
                                c34608o2.f145741m = AbstractC34587d0.m109382o(str2);
                                c35807g = new C35807g(new C34610p(c34608o2));
                            } else {
                                AbstractC38963t7.m124388r(iM121856i6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                c35807g = c35804d;
                            }
                        }
                        break;
                    case 1751742049:
                        int iM121856i7 = c38059n.m121856i();
                        c38059n.m121847G(8);
                        int iM121856i8 = c38059n.m121856i();
                        int iM121856i9 = c38059n.m121856i();
                        c38059n.m121847G(i14);
                        c38059n.m121856i();
                        c38059n.m121847G(12);
                        c35807g = new C35803c(iM121856i7, iM121856i8, iM121856i9);
                        break;
                    case 1752331379:
                        int iM121856i10 = c38059n.m121856i();
                        c38059n.m121847G(12);
                        c38059n.m121856i();
                        int iM121856i11 = c38059n.m121856i();
                        int iM121856i12 = c38059n.m121856i();
                        c38059n.m121847G(i14);
                        int iM121856i13 = c38059n.m121856i();
                        int iM121856i14 = c38059n.m121856i();
                        c38059n.m121847G(i14);
                        c35804d = new C35804d(iM121856i10, iM121856i11, iM121856i12, iM121856i13, iM121856i14, c38059n.m121856i());
                        c35807g = c35804d;
                        break;
                    case 1852994675:
                        c35807g = new C35808h(c38059n.m121865r(c38059n.m121848a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        c35807g = c35804d;
                        break;
                }
            } else {
                c35807g = m113526b(c38059n.m121856i(), c38059n);
            }
            if (c35807g != null) {
                if (c35807g.getType() == 1752331379) {
                    iM113523a = ((C35804d) c35807g).m113523a();
                }
                int i17 = i16 + 1;
                int iM133221e = AbstractC41005a0.m133221e(objArrCopyOf.length, i17);
                if (iM133221e > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM133221e);
                }
                objArrCopyOf[i16] = c35807g;
                i16 = i17;
            }
            c38059n.m121846F(iM121856i2);
            c38059n.m121845E(i15);
            i14 = 4;
        }
        return new C35806f(i13, AbstractC41023g0.m133250j(i16, objArrCopyOf));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC35801a m113527a(Class cls) {
        C41017e0 c41017e0ListIterator = this.f152324a.listIterator(0);
        while (c41017e0ListIterator.hasNext()) {
            InterfaceC35801a interfaceC35801a = (InterfaceC35801a) c41017e0ListIterator.next();
            if (interfaceC35801a.getClass() == cls) {
                return interfaceC35801a;
            }
        }
        return null;
    }

    @Override // p548v9.InterfaceC35801a
    public final int getType() {
        return this.f152325b;
    }
}
