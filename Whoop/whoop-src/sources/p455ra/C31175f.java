package p455ra;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012ab.C0679g;
import p309lo.C24561s;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38047b;
import p607x8.C38059n;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ra.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C31175f extends AbstractC31177h {

    /* JADX INFO: renamed from: h */
    public final C38059n f128455h = new C38059n();

    /* JADX INFO: renamed from: i */
    public final C24561s f128456i = new C24561s(5);

    /* JADX INFO: renamed from: j */
    public int f128457j = -1;

    /* JADX INFO: renamed from: k */
    public final int f128458k;

    /* JADX INFO: renamed from: l */
    public final C31174e[] f128459l;

    /* JADX INFO: renamed from: m */
    public C31174e f128460m;

    /* JADX INFO: renamed from: n */
    public List f128461n;

    /* JADX INFO: renamed from: o */
    public List f128462o;

    /* JADX INFO: renamed from: p */
    public C24561s f128463p;

    /* JADX INFO: renamed from: q */
    public int f128464q;

    public C31175f(int i13, List list) {
        this.f128458k = i13 == -1 ? 1 : i13;
        if (list != null) {
            byte[] bArr = AbstractC38047b.f162977a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f128459l = new C31174e[8];
        for (int i14 = 0; i14 < 8; i14++) {
            this.f128459l[i14] = new C31174e();
        }
        this.f128460m = this.f128459l[0];
    }

    @Override // p455ra.AbstractC31177h
    /* JADX INFO: renamed from: f */
    public final C0679g mo95892f() {
        List list = this.f128461n;
        this.f128462o = list;
        list.getClass();
        return new C0679g(list, 4);
    }

    @Override // p455ra.AbstractC31177h, p010a9.InterfaceC0579d
    public final void flush() {
        super.flush();
        this.f128461n = null;
        this.f128462o = null;
        this.f128464q = 0;
        this.f128460m = this.f128459l[0];
        m95907l();
        this.f128463p = null;
    }

    @Override // p455ra.AbstractC31177h
    /* JADX INFO: renamed from: g */
    public final void mo95893g(C31176g c31176g) {
        ByteBuffer byteBuffer = c31176g.f2063E;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C38059n c38059n = this.f128455h;
        c38059n.m121844D(iLimit, bArrArray);
        while (c38059n.m121848a() >= 3) {
            int iM121867t = c38059n.m121867t();
            int i13 = iM121867t & 3;
            boolean z4 = (iM121867t & 4) == 4;
            byte bM121867t = (byte) c38059n.m121867t();
            byte bM121867t2 = (byte) c38059n.m121867t();
            if (i13 == 2 || i13 == 3) {
                if (z4) {
                    if (i13 == 3) {
                        m95905j();
                        int i14 = (bM121867t & 192) >> 6;
                        int i15 = this.f128457j;
                        if (i15 != -1 && i14 != (i15 + 1) % 4) {
                            m95907l();
                            AbstractC38046a.m121826u("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f128457j + " current=" + i14);
                        }
                        this.f128457j = i14;
                        int i16 = bM121867t & 63;
                        if (i16 == 0) {
                            i16 = 64;
                        }
                        C24561s c24561s = new C24561s(i14, i16, 2);
                        this.f128463p = c24561s;
                        byte[] bArr = c24561s.f95858b;
                        c24561s.f95861e = 1;
                        bArr[0] = bM121867t2;
                    } else {
                        AbstractC35849g.m113802d(i13 == 2);
                        C24561s c24561s2 = this.f128463p;
                        if (c24561s2 == null) {
                            AbstractC38046a.m121812g("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c24561s2.f95858b;
                            int i17 = c24561s2.f95861e;
                            int i18 = i17 + 1;
                            c24561s2.f95861e = i18;
                            bArr2[i17] = bM121867t;
                            c24561s2.f95861e = i17 + 2;
                            bArr2[i18] = bM121867t2;
                        }
                    }
                    C24561s c24561s3 = this.f128463p;
                    if (c24561s3.f95861e == (c24561s3.f95860d * 2) - 1) {
                        m95905j();
                    }
                }
            }
        }
    }

    @Override // p455ra.AbstractC31177h
    /* JADX INFO: renamed from: i */
    public final boolean mo95895i() {
        return this.f128461n != this.f128462o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x053f  */
    /* JADX INFO: renamed from: j */
    public final void m95905j() {
        char c3;
        boolean z4;
        C24561s c24561s = this.f128463p;
        if (c24561s == null) {
            return;
        }
        int i13 = 2;
        if (c24561s.f95861e != (c24561s.f95860d * 2) - 1) {
            AbstractC38046a.m121811f("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f128463p.f95860d * 2) - 1) + ", but current index is " + this.f128463p.f95861e + " (sequence number " + this.f128463p.f95859c + ");");
        }
        C24561s c24561s2 = this.f128463p;
        byte[] bArr = c24561s2.f95858b;
        int i14 = c24561s2.f95861e;
        C24561s c24561s3 = this.f128456i;
        c24561s3.m71638o(i14, bArr);
        boolean z13 = false;
        while (c24561s3.m71625b() > 0) {
            int i15 = 3;
            int iM71632i = c24561s3.m71632i(3);
            int iM71632i2 = c24561s3.m71632i(5);
            if (iM71632i == 7) {
                c24561s3.m71643t(i13);
                iM71632i = c24561s3.m71632i(6);
                if (iM71632i < 7) {
                    AbstractC38963t7.m124388r(iM71632i, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iM71632i2 == 0) {
                if (iM71632i != 0) {
                    AbstractC38046a.m121826u("Cea708Decoder", "serviceNumber is non-zero (" + iM71632i + ") when blockSize is 0");
                }
                if (z13) {
                    this.f128461n = m95906k();
                }
                this.f128463p = null;
            }
            if (iM71632i != this.f128458k) {
                c24561s3.m71644u(iM71632i2);
            } else {
                int iM71630g = (iM71632i2 * 8) + c24561s3.m71630g();
                while (c24561s3.m71630g() < iM71630g) {
                    int iM71632i3 = c24561s3.m71632i(8);
                    if (iM71632i3 != 16) {
                        if (iM71632i3 <= 31) {
                            if (iM71632i3 != 0) {
                                if (iM71632i3 == i15) {
                                    this.f128461n = m95906k();
                                } else if (iM71632i3 != 8) {
                                    switch (iM71632i3) {
                                        case 12:
                                            m95907l();
                                            break;
                                        case 13:
                                            this.f128460m.m95900a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iM71632i3 >= 17 && iM71632i3 <= 23) {
                                                AbstractC38046a.m121826u("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM71632i3);
                                                c24561s3.m71643t(8);
                                            } else if (iM71632i3 < 24 || iM71632i3 > 31) {
                                                AbstractC38963t7.m124388r(iM71632i3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                AbstractC38046a.m121826u("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM71632i3);
                                                c24561s3.m71643t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f128460m.f128435b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iM71632i3 <= 127) {
                            if (iM71632i3 == 127) {
                                this.f128460m.m95900a((char) 9835);
                            } else {
                                this.f128460m.m95900a((char) (iM71632i3 & 255));
                            }
                            z13 = true;
                        } else {
                            if (iM71632i3 <= 159) {
                                C31174e[] c31174eArr = this.f128459l;
                                switch (iM71632i3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z4 = true;
                                        int i16 = iM71632i3 - 128;
                                        if (this.f128464q != i16) {
                                            this.f128464q = i16;
                                            this.f128460m = c31174eArr[i16];
                                        }
                                        break;
                                    case 136:
                                        z4 = true;
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (c24561s3.m71631h()) {
                                                C31174e c31174e = c31174eArr[8 - i17];
                                                c31174e.f128434a.clear();
                                                c31174e.f128435b.clear();
                                                c31174e.f128448o = -1;
                                                c31174e.f128449p = -1;
                                                c31174e.f128450q = -1;
                                                c31174e.f128452s = -1;
                                                c31174e.f128454u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (c24561s3.m71631h()) {
                                                c31174eArr[8 - i18].f128437d = true;
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 138:
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (c24561s3.m71631h()) {
                                                c31174eArr[8 - i19].f128437d = false;
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 139:
                                        for (int i24 = 1; i24 <= 8; i24++) {
                                            if (c24561s3.m71631h()) {
                                                C31174e c31174e2 = c31174eArr[8 - i24];
                                                c31174e2.f128437d = !c31174e2.f128437d;
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 140:
                                        for (int i25 = 1; i25 <= 8; i25++) {
                                            if (c24561s3.m71631h()) {
                                                c31174eArr[8 - i25].m95902d();
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 141:
                                        c24561s3.m71643t(8);
                                        z4 = true;
                                        break;
                                    case 142:
                                        z4 = true;
                                        break;
                                    case 143:
                                        m95907l();
                                        z4 = true;
                                        break;
                                    case 144:
                                        int i26 = i13;
                                        if (this.f128460m.f128436c) {
                                            c24561s3.m71632i(4);
                                            c24561s3.m71632i(i26);
                                            c24561s3.m71632i(i26);
                                            boolean zM71631h = c24561s3.m71631h();
                                            boolean zM71631h2 = c24561s3.m71631h();
                                            i15 = 3;
                                            c24561s3.m71632i(3);
                                            c24561s3.m71632i(3);
                                            this.f128460m.m95903e(zM71631h, zM71631h2);
                                            z4 = true;
                                        } else {
                                            c24561s3.m71643t(16);
                                            z4 = true;
                                            i15 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.f128460m.f128436c) {
                                            int iM95899c = C31174e.m95899c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2));
                                            int iM95899c2 = C31174e.m95899c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2));
                                            c24561s3.m71643t(2);
                                            C31174e.m95899c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), 0);
                                            this.f128460m.m95904f(iM95899c, iM95899c2);
                                        } else {
                                            c24561s3.m71643t(24);
                                        }
                                        z4 = true;
                                        i15 = 3;
                                        break;
                                    case 146:
                                        if (this.f128460m.f128436c) {
                                            c24561s3.m71643t(4);
                                            int iM71632i4 = c24561s3.m71632i(4);
                                            c24561s3.m71643t(2);
                                            c24561s3.m71632i(6);
                                            C31174e c31174e3 = this.f128460m;
                                            if (c31174e3.f128454u != iM71632i4) {
                                                c31174e3.m95900a('\n');
                                            }
                                            c31174e3.f128454u = iM71632i4;
                                        } else {
                                            c24561s3.m71643t(16);
                                        }
                                        z4 = true;
                                        i15 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        AbstractC38963t7.m124388r(iM71632i3, "Invalid C1 command: ", "Cea708Decoder");
                                        z4 = true;
                                        break;
                                    case 151:
                                        if (this.f128460m.f128436c) {
                                            int iM95899c3 = C31174e.m95899c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2));
                                            c24561s3.m71632i(2);
                                            C31174e.m95899c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), 0);
                                            c24561s3.m71631h();
                                            c24561s3.m71631h();
                                            c24561s3.m71632i(2);
                                            c24561s3.m71632i(2);
                                            int iM71632i5 = c24561s3.m71632i(2);
                                            c24561s3.m71643t(8);
                                            C31174e c31174e4 = this.f128460m;
                                            c31174e4.f128447n = iM95899c3;
                                            c31174e4.f128444k = iM71632i5;
                                        } else {
                                            c24561s3.m71643t(32);
                                        }
                                        z4 = true;
                                        i15 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i27 = iM71632i3 - 152;
                                        C31174e c31174e5 = c31174eArr[i27];
                                        c24561s3.m71643t(i13);
                                        boolean zM71631h3 = c24561s3.m71631h();
                                        c24561s3.m71643t(i13);
                                        int iM71632i6 = c24561s3.m71632i(i15);
                                        boolean zM71631h4 = c24561s3.m71631h();
                                        int iM71632i7 = c24561s3.m71632i(7);
                                        int iM71632i8 = c24561s3.m71632i(8);
                                        int iM71632i9 = c24561s3.m71632i(4);
                                        int iM71632i10 = c24561s3.m71632i(4);
                                        c24561s3.m71643t(i13);
                                        c24561s3.m71643t(6);
                                        c24561s3.m71643t(i13);
                                        int iM71632i11 = c24561s3.m71632i(3);
                                        int iM71632i12 = c24561s3.m71632i(3);
                                        ArrayList arrayList = c31174e5.f128434a;
                                        c31174e5.f128436c = true;
                                        c31174e5.f128437d = zM71631h3;
                                        c31174e5.f128438e = iM71632i6;
                                        c31174e5.f128439f = zM71631h4;
                                        c31174e5.f128440g = iM71632i7;
                                        c31174e5.f128441h = iM71632i8;
                                        c31174e5.f128442i = iM71632i9;
                                        int i28 = iM71632i10 + 1;
                                        if (c31174e5.f128443j != i28) {
                                            c31174e5.f128443j = i28;
                                            while (true) {
                                                if (arrayList.size() >= c31174e5.f128443j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iM71632i11 != 0 && c31174e5.f128445l != iM71632i11) {
                                            c31174e5.f128445l = iM71632i11;
                                            int i29 = iM71632i11 - 1;
                                            int i34 = C31174e.f128425B[i29];
                                            boolean z14 = C31174e.f128424A[i29];
                                            int i35 = C31174e.f128432y[i29];
                                            int i36 = C31174e.f128433z[i29];
                                            int i37 = C31174e.f128431x[i29];
                                            c31174e5.f128447n = i34;
                                            c31174e5.f128444k = i37;
                                        }
                                        if (iM71632i12 != 0 && c31174e5.f128446m != iM71632i12) {
                                            c31174e5.f128446m = iM71632i12;
                                            int i38 = iM71632i12 - 1;
                                            int i39 = C31174e.f128427D[i38];
                                            int i44 = C31174e.f128426C[i38];
                                            c31174e5.m95903e(false, false);
                                            c31174e5.m95904f(C31174e.f128429v, C31174e.f128428E[i38]);
                                        }
                                        if (this.f128464q != i27) {
                                            this.f128464q = i27;
                                            this.f128460m = c31174eArr[i27];
                                        }
                                        z4 = true;
                                        i15 = 3;
                                        break;
                                }
                            } else {
                                z4 = true;
                                if (iM71632i3 <= 255) {
                                    this.f128460m.m95900a((char) (iM71632i3 & 255));
                                } else {
                                    AbstractC38963t7.m124388r(iM71632i3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i13 = 2;
                                c3 = 7;
                            }
                            z13 = z4;
                            i13 = 2;
                            c3 = 7;
                        }
                        c3 = 7;
                    } else {
                        int iM71632i13 = c24561s3.m71632i(8);
                        if (iM71632i13 <= 31) {
                            c3 = 7;
                            if (iM71632i13 > 7) {
                                if (iM71632i13 <= 15) {
                                    c24561s3.m71643t(8);
                                } else if (iM71632i13 <= 23) {
                                    c24561s3.m71643t(16);
                                } else if (iM71632i13 <= 31) {
                                    c24561s3.m71643t(24);
                                }
                            }
                        } else {
                            c3 = 7;
                            if (iM71632i13 <= 127) {
                                if (iM71632i13 == 32) {
                                    this.f128460m.m95900a(' ');
                                } else if (iM71632i13 == 33) {
                                    this.f128460m.m95900a((char) 160);
                                } else if (iM71632i13 == 37) {
                                    this.f128460m.m95900a((char) 8230);
                                } else if (iM71632i13 == 42) {
                                    this.f128460m.m95900a((char) 352);
                                } else if (iM71632i13 == 44) {
                                    this.f128460m.m95900a((char) 338);
                                } else if (iM71632i13 == 63) {
                                    this.f128460m.m95900a((char) 376);
                                } else if (iM71632i13 == 57) {
                                    this.f128460m.m95900a((char) 8482);
                                } else if (iM71632i13 == 58) {
                                    this.f128460m.m95900a((char) 353);
                                } else if (iM71632i13 == 60) {
                                    this.f128460m.m95900a((char) 339);
                                } else if (iM71632i13 != 61) {
                                    switch (iM71632i13) {
                                        case 48:
                                            this.f128460m.m95900a((char) 9608);
                                            break;
                                        case 49:
                                            this.f128460m.m95900a((char) 8216);
                                            break;
                                        case 50:
                                            this.f128460m.m95900a((char) 8217);
                                            break;
                                        case 51:
                                            this.f128460m.m95900a((char) 8220);
                                            break;
                                        case 52:
                                            this.f128460m.m95900a((char) 8221);
                                            break;
                                        case 53:
                                            this.f128460m.m95900a((char) 8226);
                                            break;
                                        default:
                                            switch (iM71632i13) {
                                                case 118:
                                                    this.f128460m.m95900a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f128460m.m95900a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f128460m.m95900a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f128460m.m95900a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f128460m.m95900a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f128460m.m95900a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f128460m.m95900a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f128460m.m95900a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f128460m.m95900a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f128460m.m95900a((char) 9484);
                                                    break;
                                                default:
                                                    AbstractC38963t7.m124388r(iM71632i13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f128460m.m95900a((char) 8480);
                                }
                                i13 = 2;
                                z13 = true;
                            } else if (iM71632i13 > 159) {
                                i13 = 2;
                                if (iM71632i13 <= 255) {
                                    if (iM71632i13 == 160) {
                                        this.f128460m.m95900a((char) 13252);
                                    } else {
                                        AbstractC38963t7.m124388r(iM71632i13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f128460m.m95900a('_');
                                    }
                                    z13 = true;
                                } else {
                                    AbstractC38963t7.m124388r(iM71632i13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iM71632i13 <= 135) {
                                c24561s3.m71643t(32);
                            } else if (iM71632i13 <= 143) {
                                c24561s3.m71643t(40);
                            } else if (iM71632i13 <= 159) {
                                i13 = 2;
                                c24561s3.m71643t(2);
                                c24561s3.m71643t(c24561s3.m71632i(6) * 8);
                            }
                        }
                        i13 = 2;
                    }
                    i13 = i13;
                }
            }
        }
        if (z13) {
            this.f128461n = m95906k();
        }
        this.f128463p = null;
    }

    /* JADX INFO: renamed from: k */
    public final List m95906k() {
        C31173d c31173d;
        Layout.Alignment alignment;
        float f13;
        float f14;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            C31174e[] c31174eArr = this.f128459l;
            C31174e c31174e = c31174eArr[i13];
            if (c31174e.f128436c && (!c31174e.f128434a.isEmpty() || c31174e.f128435b.length() != 0)) {
                C31174e c31174e2 = c31174eArr[i13];
                if (c31174e2.f128437d) {
                    ArrayList arrayList2 = c31174e2.f128434a;
                    if (!c31174e2.f128436c || (arrayList2.isEmpty() && c31174e2.f128435b.length() == 0)) {
                        c31173d = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i14));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c31174e2.m95901b());
                        int i15 = c31174e2.f128444k;
                        if (i15 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i15 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i15 != 2) {
                            if (i15 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + c31174e2.f128444k);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (c31174e2.f128439f) {
                            f13 = c31174e2.f128441h / 99.0f;
                            f14 = c31174e2.f128440g / 99.0f;
                        } else {
                            f13 = c31174e2.f128441h / 209.0f;
                            f14 = c31174e2.f128440g / 74.0f;
                        }
                        float f15 = (f13 * 0.9f) + 0.05f;
                        float f16 = (f14 * 0.9f) + 0.05f;
                        int i16 = c31174e2.f128442i;
                        int i17 = i16 / 3;
                        int i18 = i17 == 0 ? 0 : i17 == 1 ? 1 : 2;
                        int i19 = i16 % 3;
                        int i24 = i19 == 0 ? 0 : i19 == 1 ? 1 : 2;
                        int i25 = c31174e2.f128447n;
                        c31173d = new C31173d(spannableStringBuilder, alignment2, f16, i18, f15, i24, i25 != C31174e.f128430w, i25, c31174e2.f128438e);
                    }
                    if (c31173d != null) {
                        arrayList.add(c31173d);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C31173d.f128421c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i26 = 0; i26 < arrayList.size(); i26++) {
            arrayList3.add(((C31173d) arrayList.get(i26)).f128422a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: l */
    public final void m95907l() {
        for (int i13 = 0; i13 < 8; i13++) {
            this.f128459l[i13].m95902d();
        }
    }
}
