package p654yn;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import ed3.C13117a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012ab.C0679g;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: yn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39666f extends AbstractC39668h {

    /* JADX INFO: renamed from: g */
    public final C13117a f170700g = new C13117a();

    /* JADX INFO: renamed from: h */
    public final C24561s f170701h = new C24561s(0);

    /* JADX INFO: renamed from: i */
    public int f170702i = -1;

    /* JADX INFO: renamed from: j */
    public final int f170703j;

    /* JADX INFO: renamed from: k */
    public final C39665e[] f170704k;

    /* JADX INFO: renamed from: l */
    public C39665e f170705l;

    /* JADX INFO: renamed from: m */
    public List f170706m;

    /* JADX INFO: renamed from: n */
    public List f170707n;

    /* JADX INFO: renamed from: o */
    public C24561s f170708o;

    /* JADX INFO: renamed from: p */
    public int f170709p;

    public C39666f(int i13, List list) {
        this.f170703j = i13 == -1 ? 1 : i13;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.f170704k = new C39665e[8];
        for (int i14 = 0; i14 < 8; i14++) {
            this.f170704k[i14] = new C39665e();
        }
        this.f170705l = this.f170704k[0];
    }

    @Override // p654yn.AbstractC39668h
    /* JADX INFO: renamed from: e */
    public final C0679g mo126798e() {
        List list = this.f170706m;
        this.f170707n = list;
        list.getClass();
        return new C0679g(list, 5);
    }

    @Override // p654yn.AbstractC39668h
    /* JADX INFO: renamed from: f */
    public final void mo126799f(C39667g c39667g) {
        ByteBuffer byteBuffer = c39667g.f148801z;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C13117a c13117a = this.f170700g;
        c13117a.m36687I(iLimit, bArrArray);
        while (c13117a.m36692a() >= 3) {
            int iM36715y = c13117a.m36715y();
            int i13 = iM36715y & 3;
            boolean z4 = (iM36715y & 4) == 4;
            byte bM36715y = (byte) c13117a.m36715y();
            byte bM36715y2 = (byte) c13117a.m36715y();
            if (i13 == 2 || i13 == 3) {
                if (z4) {
                    if (i13 == 3) {
                        m126811i();
                        int i14 = (bM36715y & 192) >> 6;
                        int i15 = this.f170702i;
                        if (i15 != -1 && i14 != (i15 + 1) % 4) {
                            m126813k();
                            int i16 = this.f170702i;
                            StringBuilder sb4 = new StringBuilder(71);
                            sb4.append("Sequence number discontinuity. previous=");
                            sb4.append(i16);
                            sb4.append(" current=");
                            sb4.append(i14);
                            Log.w("Cea708Decoder", sb4.toString());
                        }
                        this.f170702i = i14;
                        int i17 = bM36715y & 63;
                        if (i17 == 0) {
                            i17 = 64;
                        }
                        C24561s c24561s = new C24561s(i14, i17, 7);
                        this.f170708o = c24561s;
                        byte[] bArr = c24561s.f95858b;
                        c24561s.f95861e = 1;
                        bArr[0] = bM36715y2;
                    } else {
                        AbstractC24543a.m71569e(i13 == 2);
                        C24561s c24561s2 = this.f170708o;
                        if (c24561s2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c24561s2.f95858b;
                            int i18 = c24561s2.f95861e;
                            int i19 = i18 + 1;
                            c24561s2.f95861e = i19;
                            bArr2[i18] = bM36715y;
                            c24561s2.f95861e = i18 + 2;
                            bArr2[i19] = bM36715y2;
                        }
                    }
                    C24561s c24561s3 = this.f170708o;
                    if (c24561s3.f95861e == (c24561s3.f95860d * 2) - 1) {
                        m126811i();
                    }
                }
            }
        }
    }

    @Override // p654yn.AbstractC39668h, p527um.InterfaceC35072b
    public final void flush() {
        super.flush();
        this.f170706m = null;
        this.f170707n = null;
        this.f170709p = 0;
        this.f170705l = this.f170704k[0];
        m126813k();
        this.f170708o = null;
    }

    @Override // p654yn.AbstractC39668h
    /* JADX INFO: renamed from: h */
    public final boolean mo126801h() {
        return this.f170706m != this.f170707n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: i */
    public final void m126811i() {
        int i13;
        boolean z4;
        char c3;
        char c7;
        C24561s c24561s = this.f170708o;
        if (c24561s == null) {
            return;
        }
        int i14 = c24561s.f95861e;
        int i15 = 2;
        int i16 = (c24561s.f95860d * 2) - 1;
        if (i14 != i16) {
            int i17 = c24561s.f95859c;
            StringBuilder sb4 = new StringBuilder(115);
            sb4.append("DtvCcPacket ended prematurely; size is ");
            sb4.append(i16);
            sb4.append(", but current index is ");
            sb4.append(i14);
            sb4.append(" (sequence number ");
            sb4.append(i17);
            sb4.append(");");
            Log.d("Cea708Decoder", sb4.toString());
        }
        C24561s c24561s2 = this.f170708o;
        byte[] bArr = c24561s2.f95858b;
        int i18 = c24561s2.f95861e;
        C24561s c24561s3 = this.f170701h;
        c24561s3.m71638o(i18, bArr);
        int i19 = 3;
        int iM71632i = c24561s3.m71632i(3);
        int iM71632i2 = c24561s3.m71632i(5);
        if (iM71632i == 7) {
            c24561s3.m71643t(2);
            iM71632i = c24561s3.m71632i(6);
            if (iM71632i < 7) {
                AbstractC30007c.m91850t(44, iM71632i, "Invalid extended service number: ", "Cea708Decoder");
            }
        }
        if (iM71632i2 == 0) {
            if (iM71632i != 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("serviceNumber is non-zero (");
                sb5.append(iM71632i);
                sb5.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb5.toString());
            }
        } else if (iM71632i == this.f170703j) {
            int i24 = 8;
            int iM71630g = (iM71632i2 * 8) + c24561s3.m71630g();
            boolean z13 = false;
            while (c24561s3.m71625b() > 0 && c24561s3.m71630g() < iM71630g) {
                int iM71632i3 = c24561s3.m71632i(i24);
                if (iM71632i3 != 16) {
                    if (iM71632i3 <= 31) {
                        if (iM71632i3 != 0) {
                            if (iM71632i3 == i19) {
                                this.f170706m = m126812j();
                            } else if (iM71632i3 != i24) {
                                switch (iM71632i3) {
                                    case 12:
                                        m126813k();
                                        break;
                                    case 13:
                                        this.f170705l.m126806a('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (iM71632i3 >= 17 && iM71632i3 <= 23) {
                                            AbstractC30007c.m91850t(55, iM71632i3, "Currently unsupported COMMAND_EXT1 Command: ", "Cea708Decoder");
                                            c24561s3.m71643t(i24);
                                        } else if (iM71632i3 < 24 || iM71632i3 > 31) {
                                            AbstractC30007c.m91850t(31, iM71632i3, "Invalid C0 command: ", "Cea708Decoder");
                                        } else {
                                            AbstractC30007c.m91850t(54, iM71632i3, "Currently unsupported COMMAND_P16 Command: ", "Cea708Decoder");
                                            c24561s3.m71643t(16);
                                        }
                                        break;
                                }
                            } else {
                                SpannableStringBuilder spannableStringBuilder = this.f170705l.f170679b;
                                int length = spannableStringBuilder.length();
                                if (length > 0) {
                                    spannableStringBuilder.delete(length - 1, length);
                                }
                            }
                        }
                        c7 = DateTimeRange.lowerUpperDelimiter;
                        z4 = true;
                    } else if (iM71632i3 <= 127) {
                        if (iM71632i3 == 127) {
                            this.f170705l.m126806a((char) 9835);
                        } else {
                            this.f170705l.m126806a((char) (iM71632i3 & 255));
                        }
                        c7 = DateTimeRange.lowerUpperDelimiter;
                        z4 = true;
                        z13 = true;
                    } else {
                        if (iM71632i3 <= 159) {
                            C39665e[] c39665eArr = this.f170704k;
                            switch (iM71632i3) {
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    z4 = true;
                                    int i25 = iM71632i3 - 128;
                                    if (this.f170709p != i25) {
                                        this.f170709p = i25;
                                        this.f170705l = c39665eArr[i25];
                                    }
                                    break;
                                case 136:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    z4 = true;
                                    int i26 = 1;
                                    for (int i27 = i24; i26 <= i27; i27 = 8) {
                                        if (c24561s3.m71631h()) {
                                            C39665e c39665e = c39665eArr[8 - i26];
                                            c39665e.f170678a.clear();
                                            c39665e.f170679b.clear();
                                            c39665e.f170693p = -1;
                                            c39665e.f170694q = -1;
                                            c39665e.f170695r = -1;
                                            c39665e.f170697t = -1;
                                            c39665e.f170699v = 0;
                                        }
                                        i26++;
                                    }
                                    break;
                                case 137:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    int i28 = 1;
                                    for (int i29 = i24; i28 <= i29; i29 = 8) {
                                        if (c24561s3.m71631h()) {
                                            c39665eArr[8 - i28].f170681d = true;
                                        }
                                        i28++;
                                    }
                                    z4 = true;
                                    break;
                                case 138:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    int i34 = 1;
                                    for (int i35 = i24; i34 <= i35; i35 = 8) {
                                        if (c24561s3.m71631h()) {
                                            c39665eArr[8 - i34].f170681d = false;
                                        }
                                        i34++;
                                    }
                                    z4 = true;
                                    break;
                                case 139:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    int i36 = 1;
                                    for (int i37 = i24; i36 <= i37; i37 = 8) {
                                        if (c24561s3.m71631h()) {
                                            C39665e c39665e2 = c39665eArr[8 - i36];
                                            c39665e2.f170681d = !c39665e2.f170681d;
                                        }
                                        i36++;
                                    }
                                    z4 = true;
                                    break;
                                case 140:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    int i38 = 1;
                                    for (int i39 = i24; i38 <= i39; i39 = 8) {
                                        if (c24561s3.m71631h()) {
                                            c39665eArr[8 - i38].m126808d();
                                        }
                                        i38++;
                                    }
                                    z4 = true;
                                    break;
                                case 141:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    c24561s3.m71643t(i24);
                                    z4 = true;
                                    break;
                                case 142:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    z4 = true;
                                    break;
                                case 143:
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    m126813k();
                                    z4 = true;
                                    break;
                                case 144:
                                    int i44 = i15;
                                    iM71630g = iM71630g;
                                    if (this.f170705l.f170680c) {
                                        c24561s3.m71632i(4);
                                        c24561s3.m71632i(i44);
                                        c24561s3.m71632i(i44);
                                        boolean zM71631h = c24561s3.m71631h();
                                        boolean zM71631h2 = c24561s3.m71631h();
                                        i13 = 3;
                                        c24561s3.m71632i(3);
                                        c24561s3.m71632i(3);
                                        this.f170705l.m126809e(zM71631h, zM71631h2);
                                    } else {
                                        c24561s3.m71643t(16);
                                        i13 = 3;
                                    }
                                    z4 = true;
                                    break;
                                case 145:
                                    iM71630g = iM71630g;
                                    if (this.f170705l.f170680c) {
                                        int iM126805c = C39665e.m126805c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2));
                                        int iM126805c2 = C39665e.m126805c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2));
                                        c24561s3.m71643t(2);
                                        C39665e.m126805c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), 0);
                                        this.f170705l.m126810f(iM126805c, iM126805c2);
                                    } else {
                                        c24561s3.m71643t(24);
                                    }
                                    i13 = 3;
                                    z4 = true;
                                    break;
                                case 146:
                                    iM71630g = iM71630g;
                                    if (this.f170705l.f170680c) {
                                        c24561s3.m71643t(4);
                                        int iM71632i4 = c24561s3.m71632i(4);
                                        c24561s3.m71643t(2);
                                        c24561s3.m71632i(6);
                                        C39665e c39665e3 = this.f170705l;
                                        if (c39665e3.f170699v != iM71632i4) {
                                            c39665e3.m126806a('\n');
                                        }
                                        c39665e3.f170699v = iM71632i4;
                                    } else {
                                        c24561s3.m71643t(16);
                                    }
                                    i13 = 3;
                                    z4 = true;
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    AbstractC30007c.m91850t(31, iM71632i3, "Invalid C1 command: ", "Cea708Decoder");
                                    i13 = i19;
                                    iM71630g = iM71630g;
                                    z4 = true;
                                    break;
                                case 151:
                                    iM71630g = iM71630g;
                                    if (this.f170705l.f170680c) {
                                        int iM126805c3 = C39665e.m126805c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2));
                                        c24561s3.m71632i(2);
                                        C39665e.m126805c(c24561s3.m71632i(2), c24561s3.m71632i(2), c24561s3.m71632i(2), 0);
                                        c24561s3.m71631h();
                                        c24561s3.m71631h();
                                        c24561s3.m71632i(2);
                                        c24561s3.m71632i(2);
                                        int iM71632i5 = c24561s3.m71632i(2);
                                        c24561s3.m71643t(8);
                                        C39665e c39665e4 = this.f170705l;
                                        c39665e4.f170692o = iM126805c3;
                                        c39665e4.f170689l = iM71632i5;
                                    } else {
                                        c24561s3.m71643t(32);
                                    }
                                    i13 = 3;
                                    z4 = true;
                                    break;
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i45 = iM71632i3 - 152;
                                    C39665e c39665e5 = c39665eArr[i45];
                                    c24561s3.m71643t(i15);
                                    boolean zM71631h3 = c24561s3.m71631h();
                                    boolean zM71631h4 = c24561s3.m71631h();
                                    c24561s3.m71631h();
                                    int iM71632i6 = c24561s3.m71632i(i19);
                                    boolean zM71631h5 = c24561s3.m71631h();
                                    int iM71632i7 = c24561s3.m71632i(7);
                                    int iM71632i8 = c24561s3.m71632i(i24);
                                    int iM71632i9 = c24561s3.m71632i(4);
                                    int iM71632i10 = c24561s3.m71632i(4);
                                    c24561s3.m71643t(i15);
                                    c24561s3.m71632i(6);
                                    c24561s3.m71643t(i15);
                                    int iM71632i11 = c24561s3.m71632i(3);
                                    iM71630g = iM71630g;
                                    int iM71632i12 = c24561s3.m71632i(3);
                                    ArrayList arrayList = c39665e5.f170678a;
                                    c39665e5.f170680c = true;
                                    c39665e5.f170681d = zM71631h3;
                                    c39665e5.f170688k = zM71631h4;
                                    c39665e5.f170682e = iM71632i6;
                                    c39665e5.f170683f = zM71631h5;
                                    c39665e5.f170684g = iM71632i7;
                                    c39665e5.f170685h = iM71632i8;
                                    c39665e5.f170686i = iM71632i9;
                                    int i46 = iM71632i10 + 1;
                                    if (c39665e5.f170687j != i46) {
                                        c39665e5.f170687j = i46;
                                        while (true) {
                                            if ((zM71631h4 && arrayList.size() >= c39665e5.f170687j) || arrayList.size() >= 15) {
                                                arrayList.remove(0);
                                            }
                                        }
                                    }
                                    if (iM71632i11 != 0 && c39665e5.f170690m != iM71632i11) {
                                        c39665e5.f170690m = iM71632i11;
                                        int i47 = iM71632i11 - 1;
                                        int i48 = C39665e.f170670C[i47];
                                        boolean z14 = C39665e.f170669B[i47];
                                        int i49 = C39665e.f170677z[i47];
                                        int i54 = C39665e.f170668A[i47];
                                        int i55 = C39665e.f170676y[i47];
                                        c39665e5.f170692o = i48;
                                        c39665e5.f170689l = i55;
                                    }
                                    if (iM71632i12 != 0 && c39665e5.f170691n != iM71632i12) {
                                        c39665e5.f170691n = iM71632i12;
                                        int i56 = iM71632i12 - 1;
                                        int i57 = C39665e.f170672E[i56];
                                        int i58 = C39665e.f170671D[i56];
                                        c39665e5.m126809e(false, false);
                                        c39665e5.m126810f(C39665e.f170674w, C39665e.f170673F[i56]);
                                    }
                                    if (this.f170709p != i45) {
                                        this.f170709p = i45;
                                        this.f170705l = c39665eArr[i45];
                                    }
                                    i13 = 3;
                                    z4 = true;
                                    break;
                            }
                        } else {
                            i13 = i19;
                            iM71630g = iM71630g;
                            z4 = true;
                            if (iM71632i3 <= 255) {
                                this.f170705l.m126806a((char) (iM71632i3 & 255));
                            } else {
                                AbstractC30007c.m91850t(33, iM71632i3, "Invalid base command: ", "Cea708Decoder");
                            }
                            c7 = DateTimeRange.lowerUpperDelimiter;
                            i15 = 2;
                            c3 = 7;
                            i24 = 8;
                        }
                        z13 = z4;
                        c7 = DateTimeRange.lowerUpperDelimiter;
                        i15 = 2;
                        c3 = 7;
                        i24 = 8;
                    }
                    c3 = 7;
                    i13 = i19;
                } else {
                    i13 = i19;
                    iM71630g = iM71630g;
                    int i59 = i24;
                    z4 = true;
                    int iM71632i13 = c24561s3.m71632i(i59);
                    if (iM71632i13 <= 31) {
                        c3 = 7;
                        if (iM71632i13 > 7) {
                            if (iM71632i13 <= 15) {
                                c24561s3.m71643t(i59);
                            } else if (iM71632i13 <= 23) {
                                c24561s3.m71643t(16);
                            } else if (iM71632i13 <= 31) {
                                c24561s3.m71643t(24);
                            }
                        }
                        c7 = DateTimeRange.lowerUpperDelimiter;
                    } else {
                        c3 = 7;
                        if (iM71632i13 <= 127) {
                            if (iM71632i13 == 32) {
                                c7 = DateTimeRange.lowerUpperDelimiter;
                                this.f170705l.m126806a(' ');
                            } else if (iM71632i13 == 33) {
                                c7 = DateTimeRange.lowerUpperDelimiter;
                                this.f170705l.m126806a((char) 160);
                            } else if (iM71632i13 == 37) {
                                c7 = DateTimeRange.lowerUpperDelimiter;
                                this.f170705l.m126806a((char) 8230);
                            } else if (iM71632i13 != 42) {
                                c7 = DateTimeRange.lowerUpperDelimiter;
                                if (iM71632i13 == 44) {
                                    this.f170705l.m126806a((char) 338);
                                } else if (iM71632i13 == 63) {
                                    this.f170705l.m126806a((char) 376);
                                } else if (iM71632i13 == 57) {
                                    this.f170705l.m126806a((char) 8482);
                                } else if (iM71632i13 == 58) {
                                    this.f170705l.m126806a((char) 353);
                                } else if (iM71632i13 == 60) {
                                    this.f170705l.m126806a((char) 339);
                                } else if (iM71632i13 != 61) {
                                    switch (iM71632i13) {
                                        case 48:
                                            this.f170705l.m126806a((char) 9608);
                                            break;
                                        case 49:
                                            this.f170705l.m126806a((char) 8216);
                                            break;
                                        case 50:
                                            this.f170705l.m126806a((char) 8217);
                                            break;
                                        case 51:
                                            this.f170705l.m126806a((char) 8220);
                                            break;
                                        case 52:
                                            this.f170705l.m126806a((char) 8221);
                                            break;
                                        case 53:
                                            this.f170705l.m126806a((char) 8226);
                                            break;
                                        default:
                                            switch (iM71632i13) {
                                                case 118:
                                                    this.f170705l.m126806a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f170705l.m126806a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f170705l.m126806a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f170705l.m126806a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f170705l.m126806a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f170705l.m126806a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f170705l.m126806a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f170705l.m126806a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f170705l.m126806a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f170705l.m126806a((char) 9484);
                                                    break;
                                                default:
                                                    AbstractC30007c.m91850t(33, iM71632i13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f170705l.m126806a((char) 8480);
                                }
                            } else {
                                c7 = DateTimeRange.lowerUpperDelimiter;
                                this.f170705l.m126806a((char) 352);
                            }
                            z13 = true;
                        } else {
                            c7 = DateTimeRange.lowerUpperDelimiter;
                            if (iM71632i13 > 159) {
                                i15 = 2;
                                i24 = 8;
                                if (iM71632i13 <= 255) {
                                    if (iM71632i13 == 160) {
                                        this.f170705l.m126806a((char) 13252);
                                    } else {
                                        AbstractC30007c.m91850t(33, iM71632i13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f170705l.m126806a('_');
                                    }
                                    z13 = true;
                                } else {
                                    AbstractC30007c.m91850t(37, iM71632i13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iM71632i13 <= 135) {
                                c24561s3.m71643t(32);
                            } else if (iM71632i13 <= 143) {
                                c24561s3.m71643t(40);
                            } else if (iM71632i13 <= 159) {
                                i15 = 2;
                                c24561s3.m71643t(2);
                                i24 = 8;
                                c24561s3.m71643t(c24561s3.m71632i(6) * 8);
                            }
                        }
                    }
                    i15 = 2;
                    i24 = 8;
                }
                i19 = i13;
                i15 = i15;
                i24 = i24;
                iM71630g = iM71630g;
            }
            if (z13) {
                this.f170706m = m126812j();
            }
        }
        this.f170708o = null;
    }

    /* JADX INFO: renamed from: j */
    public final List m126812j() {
        C39664d c39664d;
        Layout.Alignment alignment;
        float f13;
        float f14;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            C39665e[] c39665eArr = this.f170704k;
            C39665e c39665e = c39665eArr[i13];
            if (c39665e.f170680c && (!c39665e.f170678a.isEmpty() || c39665e.f170679b.length() != 0)) {
                C39665e c39665e2 = c39665eArr[i13];
                if (c39665e2.f170681d) {
                    ArrayList arrayList2 = c39665e2.f170678a;
                    if (!c39665e2.f170680c || (arrayList2.isEmpty() && c39665e2.f170679b.length() == 0)) {
                        c39664d = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i14));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c39665e2.m126807b());
                        int i15 = c39665e2.f170689l;
                        if (i15 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i15 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i15 != 2) {
                            if (i15 != 3) {
                                throw new IllegalArgumentException(AbstractC31061c.m95634j(43, c39665e2.f170689l, "Unexpected justification value: "));
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (c39665e2.f170683f) {
                            f13 = c39665e2.f170685h / 99.0f;
                            f14 = c39665e2.f170684g / 99.0f;
                        } else {
                            f13 = c39665e2.f170685h / 209.0f;
                            f14 = c39665e2.f170684g / 74.0f;
                        }
                        float f15 = (f13 * 0.9f) + 0.05f;
                        float f16 = (f14 * 0.9f) + 0.05f;
                        int i16 = c39665e2.f170686i;
                        int i17 = i16 / 3;
                        int i18 = i17 == 0 ? 0 : i17 == 1 ? 1 : 2;
                        int i19 = i16 % 3;
                        int i24 = i19 == 0 ? 0 : i19 == 1 ? 1 : 2;
                        int i25 = c39665e2.f170692o;
                        c39664d = new C39664d(spannableStringBuilder, alignment2, f16, i18, f15, i24, i25 != C39665e.f170675x, i25, c39665e2.f170682e);
                    }
                    if (c39664d != null) {
                        arrayList.add(c39664d);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C39664d.f170665c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i26 = 0; i26 < arrayList.size(); i26++) {
            arrayList3.add(((C39664d) arrayList.get(i26)).f170666a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: k */
    public final void m126813k() {
        for (int i13 = 0; i13 < 8; i13++) {
            this.f170704k[i13].m126808d();
        }
    }
}
