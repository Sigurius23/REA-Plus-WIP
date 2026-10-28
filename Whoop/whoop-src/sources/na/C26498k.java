package na;

import androidx.media3.common.ParserException;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import jh3.AbstractC21702c;
import live.hms.video.factories.C24148c;
import p010a9.AbstractC0576a;
import p031b9.C2817b;
import p188ha.AbstractC17042k;
import p188ha.C17043l;
import p188ha.C17046o;
import p216ia.C18288a;
import p216ia.C18289b;
import p216ia.C18290c;
import p216ia.C18291d;
import p319m4.AbstractC25012a;
import p499t9.AbstractC33618a;
import p499t9.C33625d0;
import p499t9.C33629f0;
import p499t9.C33641l0;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.C33655x;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33635i0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.InterfaceC34583b0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p641y8.C39306a;
import p641y8.C39308c;
import p641y8.C39309d;
import p641y8.C39310e;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.InterfaceC30105j;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: na.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C26498k implements InterfaceC33644n, InterfaceC33627e0 {

    /* JADX INFO: renamed from: A */
    public C26497j[] f105271A;

    /* JADX INFO: renamed from: B */
    public long[][] f105272B;

    /* JADX INFO: renamed from: C */
    public int f105273C;

    /* JADX INFO: renamed from: D */
    public long f105274D;

    /* JADX INFO: renamed from: E */
    public int f105275E;

    /* JADX INFO: renamed from: F */
    public C18288a f105276F;

    /* JADX INFO: renamed from: a */
    public final InterfaceC30105j f105277a;

    /* JADX INFO: renamed from: b */
    public final int f105278b;

    /* JADX INFO: renamed from: c */
    public final C38059n f105279c;

    /* JADX INFO: renamed from: d */
    public final C38059n f105280d;

    /* JADX INFO: renamed from: e */
    public final C38059n f105281e;

    /* JADX INFO: renamed from: f */
    public final C38059n f105282f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f105283g;

    /* JADX INFO: renamed from: h */
    public final C26500m f105284h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f105285i;

    /* JADX INFO: renamed from: j */
    public C41060w0 f105286j;

    /* JADX INFO: renamed from: k */
    public int f105287k;

    /* JADX INFO: renamed from: l */
    public int f105288l;

    /* JADX INFO: renamed from: m */
    public long f105289m;

    /* JADX INFO: renamed from: n */
    public int f105290n;

    /* JADX INFO: renamed from: o */
    public C38059n f105291o;

    /* JADX INFO: renamed from: p */
    public int f105292p;

    /* JADX INFO: renamed from: q */
    public int f105293q;

    /* JADX INFO: renamed from: r */
    public int f105294r;

    /* JADX INFO: renamed from: s */
    public int f105295s;

    /* JADX INFO: renamed from: t */
    public boolean f105296t;

    /* JADX INFO: renamed from: u */
    public boolean f105297u;

    /* JADX INFO: renamed from: v */
    public boolean f105298v;

    /* JADX INFO: renamed from: w */
    public long f105299w;

    /* JADX INFO: renamed from: x */
    public boolean f105300x;

    /* JADX INFO: renamed from: y */
    public long f105301y;

    /* JADX INFO: renamed from: z */
    public InterfaceC33648q f105302z;

    public C26498k(InterfaceC30105j interfaceC30105j, int i13) {
        this.f105277a = interfaceC30105j;
        this.f105278b = i13;
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f105286j = C41060w0.f177067E;
        this.f105287k = (i13 & 4) != 0 ? 3 : 0;
        this.f105284h = new C26500m();
        this.f105285i = new ArrayList();
        this.f105282f = new C38059n(16);
        this.f105283g = new ArrayDeque();
        this.f105279c = new C38059n(AbstractC39319n.f169167a);
        this.f105280d = new C38059n(6);
        this.f105281e = new C38059n();
        this.f105292p = -1;
        this.f105302z = InterfaceC33648q.f140435u;
        this.f105271A = new C26497j[0];
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f105283g.clear();
        this.f105290n = 0;
        this.f105292p = -1;
        this.f105293q = 0;
        this.f105294r = 0;
        this.f105295s = 0;
        this.f105296t = false;
        if (j7 == 0) {
            if (this.f105287k != 3) {
                this.f105287k = 0;
                this.f105290n = 0;
                return;
            } else {
                C26500m c26500m = this.f105284h;
                c26500m.f105307a.clear();
                c26500m.f105308b = 0;
                this.f105285i.clear();
                return;
            }
        }
        for (C26497j c26497j : this.f105271A) {
            C26504q c26504q = c26497j.f105267b;
            int iM121911d = AbstractC38065t.m121911d(c26504q.f105333f, j13, false);
            while (true) {
                if (iM121911d < 0) {
                    iM121911d = -1;
                    break;
                } else if ((c26504q.f105334g[iM121911d] & 1) != 0) {
                    break;
                } else {
                    iM121911d--;
                }
            }
            if (iM121911d == -1) {
                iM121911d = c26504q.m78566a(j13);
            }
            c26497j.f105270e = iM121911d;
            C33641l0 c33641l0 = c26497j.f105269d;
            if (c33641l0 != null) {
                c33641l0.f140418b = false;
                c33641l0.f140419c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[LOOP:2: B:37:0x0087->B:41:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[LOOP:3: B:51:0x00b2->B:55:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ba A[EDGE_INSN: B:81:0x00ba->B:54:0x00ba BREAK  A[LOOP:3: B:51:0x00b2->B:55:0x00bc], SYNTHETIC] */
    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        long j13;
        long j14;
        long j15;
        int i13;
        long jMin;
        C26497j[] c26497jArr;
        int i14;
        C26504q c26504q;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM121911d;
        int iM78566a;
        int iM121911d2;
        int iM78566a2;
        C26497j[] c26497jArr2 = this.f105271A;
        int length = c26497jArr2.length;
        C33629f0 c33629f0 = C33629f0.f140370c;
        if (length == 0) {
            return new C33625d0(c33629f0, c33629f0);
        }
        int i15 = this.f105273C;
        boolean z4 = false;
        int i16 = -1;
        long jMin2 = -1;
        if (i15 != -1) {
            C26504q c26504q2 = c26497jArr2[i15].f105267b;
            long[] jArr3 = c26504q2.f105333f;
            int iM121911d3 = AbstractC38065t.m121911d(jArr3, j7, false);
            while (true) {
                if (iM121911d3 < 0) {
                    iM121911d3 = -1;
                    break;
                }
                if ((c26504q2.f105334g[iM121911d3] & 1) != 0) {
                    break;
                }
                iM121911d3--;
            }
            if (iM121911d3 == -1) {
                iM121911d3 = c26504q2.m78566a(j7);
            }
            long[] jArr4 = c26504q2.f105330c;
            if (iM121911d3 == -1) {
                return new C33625d0(c33629f0, c33629f0);
            }
            j14 = jArr3[iM121911d3];
            j13 = jArr4[iM121911d3];
            if (j14 < j7 && iM121911d3 < c26504q2.f105329b - 1 && (iM78566a2 = c26504q2.m78566a(j7)) != -1 && iM78566a2 != iM121911d3) {
                j15 = jArr3[iM78566a2];
                jMin2 = jArr4[iM78566a2];
            }
            i13 = 0;
            jMin = j13;
            while (true) {
                c26497jArr = this.f105271A;
                if (i13 < c26497jArr.length) {
                    break;
                }
                if (i13 != this.f105273C) {
                    c26504q = c26497jArr[i13].f105267b;
                    jArr = c26504q.f105330c;
                    iArr = c26504q.f105334g;
                    jArr2 = c26504q.f105333f;
                    iM121911d = AbstractC38065t.m121911d(jArr2, j14, z4);
                    while (true) {
                        if (iM121911d >= 0) {
                            iM78566a = i16;
                            break;
                        }
                        if ((iArr[iM121911d] & 1) != 0) {
                            iM78566a = iM121911d;
                            break;
                        }
                        iM121911d--;
                    }
                    if (iM78566a == i16) {
                        iM78566a = c26504q.m78566a(j14);
                    }
                    if (iM78566a == i16) {
                        jMin = Math.min(jArr[iM78566a], jMin);
                    }
                    if (j15 != -9223372036854775807L) {
                        z4 = false;
                        iM121911d2 = AbstractC38065t.m121911d(jArr2, j15, false);
                        while (true) {
                            if (iM121911d2 >= 0) {
                                iM121911d2 = -1;
                                break;
                            }
                            if ((iArr[iM121911d2] & 1) != 0) {
                                break;
                            }
                            iM121911d2--;
                        }
                        i14 = -1;
                        if (iM121911d2 == -1) {
                            iM121911d2 = c26504q.m78566a(j15);
                        }
                        if (iM121911d2 == -1) {
                            jMin2 = jMin2;
                        } else {
                            jMin2 = Math.min(jArr[iM121911d2], jMin2);
                        }
                    } else {
                        jMin2 = jMin2;
                        z4 = false;
                        i14 = -1;
                    }
                } else {
                    i14 = i16;
                }
                i13++;
                i16 = i14;
            }
            C33629f0 c33629f1 = new C33629f0(j14, jMin);
            return j15 == -9223372036854775807L ? new C33625d0(c33629f1, c33629f1) : new C33625d0(c33629f1, new C33629f0(j15, jMin2));
        }
        j13 = Long.MAX_VALUE;
        j14 = j7;
        j15 = -9223372036854775807L;
        i13 = 0;
        jMin = j13;
        while (true) {
            c26497jArr = this.f105271A;
            if (i13 < c26497jArr.length) {
                break;
                break;
            }
            if (i13 != this.f105273C) {
                c26504q = c26497jArr[i13].f105267b;
                jArr = c26504q.f105330c;
                iArr = c26504q.f105334g;
                jArr2 = c26504q.f105333f;
                iM121911d = AbstractC38065t.m121911d(jArr2, j14, z4);
                while (true) {
                    if (iM121911d >= 0) {
                        iM78566a = i16;
                        break;
                    }
                    if ((iArr[iM121911d] & 1) != 0) {
                        iM78566a = iM121911d;
                        break;
                    }
                    iM121911d--;
                }
                if (iM78566a == i16) {
                    iM78566a = c26504q.m78566a(j14);
                }
                if (iM78566a == i16) {
                    jMin = Math.min(jArr[iM78566a], jMin);
                }
                if (j15 != -9223372036854775807L) {
                    z4 = false;
                    iM121911d2 = AbstractC38065t.m121911d(jArr2, j15, false);
                    while (true) {
                        if (iM121911d2 >= 0) {
                            iM121911d2 = -1;
                            break;
                        }
                        if ((iArr[iM121911d2] & 1) != 0) {
                            break;
                            break;
                        }
                        iM121911d2--;
                    }
                    i14 = -1;
                    if (iM121911d2 == -1) {
                        iM121911d2 = c26504q.m78566a(j15);
                    }
                    if (iM121911d2 == -1) {
                        jMin2 = jMin2;
                    } else {
                        jMin2 = Math.min(jArr[iM121911d2], jMin2);
                    }
                } else {
                    jMin2 = jMin2;
                    z4 = false;
                    i14 = -1;
                }
            } else {
                i14 = i16;
            }
            i13++;
            i16 = i14;
        }
        C33629f0 c33629f2 = new C33629f0(j14, jMin);
        if (j15 == -9223372036854775807L) {
        }
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f105274D;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        if ((this.f105278b & 16) == 0) {
            interfaceC33648q = new C2817b(interfaceC33648q, this.f105277a);
        }
        this.f105302z = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        C41060w0 c41060w0M133256r;
        InterfaceC33635i0 interfaceC33635i0M78564l = AbstractC26501n.m78564l(interfaceC33646o, false, (this.f105278b & 2) != 0);
        if (interfaceC33635i0M78564l != null) {
            c41060w0M133256r = AbstractC41023g0.m133256r(interfaceC33635i0M78564l);
        } else {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            c41060w0M133256r = C41060w0.f177067E;
        }
        this.f105286j = c41060w0M133256r;
        return interfaceC33635i0M78564l == null;
    }

    /* JADX WARN: Code duplicated, block: B:260:0x050e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0522  */
    /* JADX WARN: Code duplicated, block: B:286:0x0595  */
    /* JADX WARN: Code duplicated, block: B:287:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:289:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:299:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:314:0x0605  */
    /* JADX WARN: Code duplicated, block: B:365:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:369:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:373:0x0709  */
    /* JADX WARN: Code duplicated, block: B:374:0x070d  */
    /* JADX WARN: Code duplicated, block: B:385:0x0525 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0718 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        char c3;
        int i13;
        int i14;
        int i15;
        int i16;
        byte b;
        char c7;
        int i17;
        ArrayList arrayList;
        List listM1707w;
        int i18;
        List listM1707w2;
        boolean z4;
        boolean z13;
        long j7;
        long length;
        C39308c c39308c;
        long j13;
        int i19;
        int i24;
        boolean z14;
        long j14;
        long j15;
        long j16;
        int i25;
        boolean z15;
        while (true) {
            int i26 = this.f105287k;
            ArrayDeque arrayDeque = this.f105283g;
            int i27 = this.f105278b;
            C38059n c38059n = this.f105281e;
            int i28 = 4;
            int i29 = 2;
            if (i26 == 0) {
                int i34 = this.f105290n;
                C38059n c38059n2 = this.f105282f;
                if (i34 != 0) {
                    j7 = this.f105289m;
                    if (j7 == 1) {
                        interfaceC33646o.readFully(c38059n2.f163017a, 8, 8);
                        this.f105290n += 8;
                        this.f105289m = c38059n2.m121872y();
                    } else if (j7 == 0) {
                        length = interfaceC33646o.getLength();
                        if (length == -1 && (c39308c = (C39308c) arrayDeque.peek()) != null) {
                            length = c39308c.f169111y;
                        }
                        if (length != -1) {
                            this.f105289m = (length - interfaceC33646o.getPosition()) + ((long) this.f105290n);
                        }
                    }
                    j13 = this.f105289m;
                    i19 = this.f105290n;
                    if (j13 >= i19) {
                        throw ParserException.m5051c("Atom size less than header length (unsupported).");
                    }
                    i24 = this.f105288l;
                    if (i24 != 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1701082227 || i24 == 1835365473 || i24 == 1635284069) {
                        z14 = true;
                        long position = interfaceC33646o.getPosition();
                        j14 = this.f105289m;
                        j15 = this.f105290n;
                        j16 = (position + j14) - j15;
                        if (j14 != j15 && this.f105288l == 1835365473) {
                            c38059n.m121843C(8);
                            interfaceC33646o.mo3103p(c38059n.f163017a, 0, 8);
                            byte[] bArr = AbstractC26490c.f105203a;
                            i25 = c38059n.f163018b;
                            c38059n.m121847G(4);
                            if (c38059n.m121854g() != 1751411826) {
                                i25 += 4;
                            }
                            c38059n.m121846F(i25);
                            interfaceC33646o.mo3100n(c38059n.f163018b);
                            interfaceC33646o.mo3093e();
                        }
                        arrayDeque.push(new C39308c(this.f105288l, j16));
                        if (this.f105289m == this.f105290n) {
                            m78552l(j16);
                        } else {
                            this.f105287k = 0;
                            this.f105290n = 0;
                        }
                    } else if (i24 == 1835296868 || i24 == 1836476516 || i24 == 1751411826 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1937011571 || i24 == 1668576371 || i24 == 1701606260 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1953196132 || i24 == 1718909296 || i24 == 1969517665 || i24 == 1801812339 || i24 == 1768715124) {
                        AbstractC35849g.m113807i(i19 == 8);
                        AbstractC35849g.m113807i(this.f105289m <= 2147483647L);
                        C38059n c38059n3 = new C38059n((int) this.f105289m);
                        System.arraycopy(c38059n2.f163017a, 0, c38059n3.f163017a, 0, 8);
                        this.f105291o = c38059n3;
                        z14 = true;
                        this.f105287k = 1;
                    } else {
                        long position2 = interfaceC33646o.getPosition();
                        long j17 = this.f105290n;
                        long j18 = position2 - j17;
                        if (this.f105288l == 1836086884) {
                            this.f105276F = new C18288a(0L, j18, -9223372036854775807L, j18 + j17, this.f105289m - j17);
                        }
                        this.f105291o = null;
                        z14 = true;
                        this.f105287k = 1;
                    }
                    z15 = z14;
                } else if (interfaceC33646o.mo3094f(c38059n2.f163017a, 0, 8, true)) {
                    this.f105290n = 8;
                    c38059n2.m121846F(0);
                    this.f105289m = c38059n2.m121869v();
                    this.f105288l = c38059n2.m121854g();
                    j7 = this.f105289m;
                    if (j7 == 1) {
                        interfaceC33646o.readFully(c38059n2.f163017a, 8, 8);
                        this.f105290n += 8;
                        this.f105289m = c38059n2.m121872y();
                    } else if (j7 == 0) {
                        length = interfaceC33646o.getLength();
                        if (length == -1) {
                            length = c39308c.f169111y;
                        }
                        if (length != -1) {
                            this.f105289m = (length - interfaceC33646o.getPosition()) + ((long) this.f105290n);
                        }
                    }
                    j13 = this.f105289m;
                    i19 = this.f105290n;
                    if (j13 >= i19) {
                        throw ParserException.m5051c("Atom size less than header length (unsupported).");
                    }
                    i24 = this.f105288l;
                    if (i24 != 1836019574) {
                        z14 = true;
                        long position3 = interfaceC33646o.getPosition();
                        j14 = this.f105289m;
                        j15 = this.f105290n;
                        j16 = (position3 + j14) - j15;
                        if (j14 != j15) {
                            c38059n.m121843C(8);
                            interfaceC33646o.mo3103p(c38059n.f163017a, 0, 8);
                            byte[] bArr2 = AbstractC26490c.f105203a;
                            i25 = c38059n.f163018b;
                            c38059n.m121847G(4);
                            if (c38059n.m121854g() != 1751411826) {
                                i25 += 4;
                            }
                            c38059n.m121846F(i25);
                            interfaceC33646o.mo3100n(c38059n.f163018b);
                            interfaceC33646o.mo3093e();
                        }
                        arrayDeque.push(new C39308c(this.f105288l, j16));
                        if (this.f105289m == this.f105290n) {
                            m78552l(j16);
                        } else {
                            this.f105287k = 0;
                            this.f105290n = 0;
                        }
                    } else {
                        z14 = true;
                        long position4 = interfaceC33646o.getPosition();
                        j14 = this.f105289m;
                        j15 = this.f105290n;
                        j16 = (position4 + j14) - j15;
                        if (j14 != j15) {
                            c38059n.m121843C(8);
                            interfaceC33646o.mo3103p(c38059n.f163017a, 0, 8);
                            byte[] bArr3 = AbstractC26490c.f105203a;
                            i25 = c38059n.f163018b;
                            c38059n.m121847G(4);
                            if (c38059n.m121854g() != 1751411826) {
                                i25 += 4;
                            }
                            c38059n.m121846F(i25);
                            interfaceC33646o.mo3100n(c38059n.f163018b);
                            interfaceC33646o.mo3093e();
                        }
                        arrayDeque.push(new C39308c(this.f105288l, j16));
                        if (this.f105289m == this.f105290n) {
                            m78552l(j16);
                        } else {
                            this.f105287k = 0;
                            this.f105290n = 0;
                        }
                    }
                    z15 = z14;
                } else {
                    if (this.f105275E == 2 && (i27 & 2) != 0) {
                        InterfaceC33639k0 interfaceC33639k0Mo3101o = this.f105302z.mo3101o(0, 4);
                        C18288a c18288a = this.f105276F;
                        C34585c0 c34585c0 = c18288a == null ? null : new C34585c0(c18288a);
                        C34608o c34608o = new C34608o();
                        c34608o.f145739k = c34585c0;
                        AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o);
                        this.f105302z.mo3098l();
                        this.f105302z.mo3109v(new C33651t(-9223372036854775807L));
                    }
                    z15 = false;
                }
                if (!z15) {
                    return -1;
                }
            } else {
                if (i26 != 1) {
                    if (i26 == 2) {
                        long position5 = interfaceC33646o.getPosition();
                        if (this.f105292p == -1) {
                            int i35 = 0;
                            int i36 = -1;
                            int i37 = -1;
                            boolean z16 = true;
                            boolean z17 = true;
                            long j19 = Long.MAX_VALUE;
                            long j24 = Long.MAX_VALUE;
                            long j25 = Long.MAX_VALUE;
                            while (true) {
                                C26497j[] c26497jArr = this.f105271A;
                                if (i35 >= c26497jArr.length) {
                                    break;
                                }
                                C26497j c26497j = c26497jArr[i35];
                                int i38 = c26497j.f105270e;
                                C26504q c26504q = c26497j.f105267b;
                                if (i38 != c26504q.f105329b) {
                                    long j26 = c26504q.f105330c[i38];
                                    long[][] jArr = this.f105272B;
                                    int i39 = AbstractC38065t.f163031a;
                                    long j27 = jArr[i35][i38];
                                    long j28 = j26 - position5;
                                    boolean z18 = j28 < 0 || j28 >= 262144;
                                    if ((!z18 && z17) || (z18 == z17 && j28 < j25)) {
                                        i37 = i35;
                                        j24 = j27;
                                        z17 = z18;
                                        j25 = j28;
                                    }
                                    if (j27 < j19) {
                                        i36 = i35;
                                        j19 = j27;
                                        z16 = z18;
                                    }
                                }
                                i35++;
                            }
                            if (j19 == Long.MAX_VALUE || !z16 || j24 < j19 + AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES) {
                                i36 = i37;
                            }
                            this.f105292p = i36;
                            if (i36 == -1) {
                                return -1;
                            }
                        }
                        C26497j c26497j2 = this.f105271A[this.f105292p];
                        InterfaceC33639k0 interfaceC33639k0 = c26497j2.f105268c;
                        C26504q c26504q2 = c26497j2.f105267b;
                        C26502o c26502o = c26497j2.f105266a;
                        int i44 = c26497j2.f105270e;
                        long[] jArr2 = c26504q2.f105330c;
                        int[] iArr = c26504q2.f105331d;
                        long j29 = jArr2[i44] + this.f105301y;
                        int i45 = iArr[i44];
                        C33641l0 c33641l0 = c26497j2.f105269d;
                        long j34 = (j29 - position5) + ((long) this.f105293q);
                        if (j34 < 0 || j34 >= 262144) {
                            c33650s.f140436a = j29;
                            return 1;
                        }
                        int i46 = c26502o.f105318h;
                        int i47 = c26502o.f105321k;
                        C34610p c34610p = c26502o.f105317g;
                        if (i46 == 1) {
                            j34 += 8;
                            i45 -= 8;
                        }
                        interfaceC33646o.mo3100n((int) j34);
                        String str = c34610p.f145783n;
                        String str2 = c34610p.f145783n;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i27 & 128) == 0 : (i27 & 32) == 0) {
                            c3 = 1;
                            this.f105296t = true;
                        } else {
                            c3 = 1;
                        }
                        if (i47 == 0) {
                            if ("audio/ac4".equals(str2)) {
                                if (this.f105294r == 0) {
                                    AbstractC33618a.m106215g(i45, c38059n);
                                    interfaceC33639k0.mo36176d(c38059n, 7, 0);
                                    this.f105294r += 7;
                                }
                                i45 += 7;
                            } else if (c33641l0 != null) {
                                c33641l0.m106263e(interfaceC33646o);
                            }
                            while (true) {
                                int i48 = this.f105294r;
                                if (i48 >= i45) {
                                    break;
                                }
                                int iMo36175c = interfaceC33639k0.mo36175c(interfaceC33646o, i45 - i48, false);
                                this.f105293q += iMo36175c;
                                this.f105294r += iMo36175c;
                                this.f105295s -= iMo36175c;
                            }
                        } else {
                            C38059n c38059n4 = this.f105280d;
                            byte[] bArr4 = c38059n4.f163017a;
                            bArr4[0] = 0;
                            bArr4[c3] = 0;
                            bArr4[2] = 0;
                            int i49 = 4 - i47;
                            i45 += i49;
                            while (this.f105294r < i45) {
                                int i54 = this.f105295s;
                                if (i54 == 0) {
                                    if (this.f105296t || AbstractC39319n.m125278e(c34610p) + i47 > iArr[i44] - this.f105293q) {
                                        i14 = i47;
                                        i15 = 0;
                                    } else {
                                        int iM125278e = AbstractC39319n.m125278e(c34610p);
                                        i14 = i47 + iM125278e;
                                        i15 = iM125278e;
                                    }
                                    interfaceC33646o.readFully(bArr4, i49, i14);
                                    this.f105293q += i14;
                                    c38059n4.m121846F(0);
                                    int iM121854g = c38059n4.m121854g();
                                    if (iM121854g < 0) {
                                        throw ParserException.m5049a(null, "Invalid NAL length");
                                    }
                                    this.f105295s = iM121854g - i15;
                                    C38059n c38059n5 = this.f105279c;
                                    c38059n5.m121846F(0);
                                    i13 = i49;
                                    interfaceC33639k0.mo36176d(c38059n5, 4, 0);
                                    this.f105294r += 4;
                                    if (i15 > 0) {
                                        interfaceC33639k0.mo36176d(c38059n4, i15, 0);
                                        this.f105294r += i15;
                                        if (AbstractC39319n.m125277d(bArr4, i15, c34610p)) {
                                            this.f105296t = true;
                                        }
                                    }
                                } else {
                                    i13 = i49;
                                    int iMo36175c2 = interfaceC33639k0.mo36175c(interfaceC33646o, i54, false);
                                    this.f105293q += iMo36175c2;
                                    this.f105294r += iMo36175c2;
                                    this.f105295s -= iMo36175c2;
                                }
                                i49 = i13;
                            }
                        }
                        int i55 = i45;
                        long j35 = c26504q2.f105333f[i44];
                        int i56 = c26504q2.f105334g[i44];
                        if (!this.f105296t) {
                            i56 |= 67108864;
                        }
                        int i57 = i56;
                        if (c33641l0 != null) {
                            c33641l0.m106261c(interfaceC33639k0, j35, i57, i55, 0, null);
                            if (i44 + 1 == c26504q2.f105329b) {
                                c33641l0.m106259a(interfaceC33639k0, null);
                            }
                        } else {
                            interfaceC33639k0.mo36174b(j35, i57, i55, 0, null);
                        }
                        c26497j2.f105270e++;
                        this.f105292p = -1;
                        this.f105293q = 0;
                        this.f105294r = 0;
                        this.f105295s = 0;
                        this.f105296t = false;
                        return 0;
                    }
                    if (i26 != 3) {
                        throw new IllegalStateException();
                    }
                    C26500m c26500m = this.f105284h;
                    ArrayList arrayList2 = c26500m.f105307a;
                    int i58 = c26500m.f105308b;
                    if (i58 != 0) {
                        if (i58 != 1) {
                            short s13 = 2817;
                            int i59 = 8;
                            short s14 = 2192;
                            if (i58 == 2) {
                                long length2 = interfaceC33646o.getLength();
                                int i64 = c26500m.f105309c - 20;
                                C38059n c38059n6 = new C38059n(i64);
                                interfaceC33646o.readFully(c38059n6.f163017a, 0, i64);
                                int i65 = 0;
                                while (i65 < i64 / 12) {
                                    c38059n6.m121847G(i29);
                                    byte[] bArr5 = c38059n6.f163017a;
                                    int i66 = c38059n6.f163018b;
                                    int i67 = i29;
                                    int i68 = i66 + 1;
                                    c38059n6.f163018b = i68;
                                    int i69 = bArr5[i66] & 255;
                                    c38059n6.f163018b = i66 + 2;
                                    short s15 = (short) (i69 | ((bArr5[i68] & 255) << 8));
                                    if (s15 != s14 && s15 != 2816 && s15 != s13) {
                                        if (s15 != 2819 && s15 != 2820) {
                                            c38059n6.m121847G(i59);
                                        }
                                        i65++;
                                        i64 = i64;
                                        i29 = i67;
                                        s14 = 2192;
                                        s13 = 2817;
                                        i59 = 8;
                                    }
                                    arrayList2.add(new C26499l((length2 - ((long) c26500m.f105309c)) - ((long) c38059n6.m121856i()), c38059n6.m121856i()));
                                    i65++;
                                    i64 = i64;
                                    i29 = i67;
                                    s14 = 2192;
                                    s13 = 2817;
                                    i59 = 8;
                                }
                                if (arrayList2.isEmpty()) {
                                    c33650s.f140436a = 0L;
                                } else {
                                    c26500m.f105308b = 3;
                                    c33650s.f140436a = ((C26499l) arrayList2.get(0)).f105303a;
                                }
                            } else {
                                if (i58 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position6 = interfaceC33646o.getPosition();
                                int length3 = (int) ((interfaceC33646o.getLength() - interfaceC33646o.getPosition()) - ((long) c26500m.f105309c));
                                C38059n c38059n7 = new C38059n(length3);
                                interfaceC33646o.readFully(c38059n7.f163017a, 0, length3);
                                int i74 = 0;
                                while (i74 < arrayList2.size()) {
                                    C26499l c26499l = (C26499l) arrayList2.get(i74);
                                    c38059n7.m121846F((int) (c26499l.f105303a - position6));
                                    c38059n7.m121847G(i28);
                                    int iM121856i = c38059n7.m121856i();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String strM121865r = c38059n7.m121865r(iM121856i, charset);
                                    switch (strM121865r.hashCode()) {
                                        case -1711564334:
                                            if (strM121865r.equals("SlowMotion_Data")) {
                                                b = 0;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c7 = 2192;
                                                    break;
                                                case 1:
                                                    c7 = 2819;
                                                    break;
                                                case 2:
                                                    c7 = 2816;
                                                    break;
                                                case 3:
                                                    c7 = 2820;
                                                    break;
                                                case 4:
                                                    c7 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m5049a(null, "Invalid SEF name");
                                            }
                                            i17 = c26499l.f105304b - (iM121856i + 8);
                                            if (c7 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C26500m.f105306e.m1707w(c38059n7.m121865r(i17, charset));
                                                for (i18 = 0; i18 < listM1707w.size(); i18++) {
                                                    listM1707w2 = C26500m.f105305d.m1707w((CharSequence) listM1707w.get(i18));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m5049a(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new C18289b(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                    } catch (NumberFormatException e5) {
                                                        throw ParserException.m5049a(e5, null);
                                                    }
                                                }
                                                this.f105285i.add(new C18290c(arrayList));
                                            } else if (c7 != 2816 && c7 != 2817 && c7 != 2819 && c7 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i74++;
                                            i28 = 4;
                                            break;
                                        case -1332107749:
                                            if (strM121865r.equals("Super_SlowMotion_Edit_Data")) {
                                                b = 1;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c7 = 2192;
                                                    break;
                                                case 1:
                                                    c7 = 2819;
                                                    break;
                                                case 2:
                                                    c7 = 2816;
                                                    break;
                                                case 3:
                                                    c7 = 2820;
                                                    break;
                                                case 4:
                                                    c7 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m5049a(null, "Invalid SEF name");
                                            }
                                            i17 = c26499l.f105304b - (iM121856i + 8);
                                            if (c7 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C26500m.f105306e.m1707w(c38059n7.m121865r(i17, charset));
                                                while (i18 < listM1707w.size()) {
                                                    listM1707w2 = C26500m.f105305d.m1707w((CharSequence) listM1707w.get(i18));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m5049a(null, null);
                                                    }
                                                    arrayList.add(new C18289b(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f105285i.add(new C18290c(arrayList));
                                            } else if (c7 != 2816) {
                                                continue;
                                            }
                                            i74++;
                                            i28 = 4;
                                            break;
                                        case -1251387154:
                                            if (strM121865r.equals("Super_SlowMotion_Data")) {
                                                b = 2;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c7 = 2192;
                                                    break;
                                                case 1:
                                                    c7 = 2819;
                                                    break;
                                                case 2:
                                                    c7 = 2816;
                                                    break;
                                                case 3:
                                                    c7 = 2820;
                                                    break;
                                                case 4:
                                                    c7 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m5049a(null, "Invalid SEF name");
                                            }
                                            i17 = c26499l.f105304b - (iM121856i + 8);
                                            if (c7 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C26500m.f105306e.m1707w(c38059n7.m121865r(i17, charset));
                                                while (i18 < listM1707w.size()) {
                                                    listM1707w2 = C26500m.f105305d.m1707w((CharSequence) listM1707w.get(i18));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m5049a(null, null);
                                                    }
                                                    arrayList.add(new C18289b(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f105285i.add(new C18290c(arrayList));
                                            } else if (c7 != 2816) {
                                                continue;
                                            }
                                            i74++;
                                            i28 = 4;
                                            break;
                                        case -830665521:
                                            if (strM121865r.equals("Super_SlowMotion_Deflickering_On")) {
                                                b = 3;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c7 = 2192;
                                                    break;
                                                case 1:
                                                    c7 = 2819;
                                                    break;
                                                case 2:
                                                    c7 = 2816;
                                                    break;
                                                case 3:
                                                    c7 = 2820;
                                                    break;
                                                case 4:
                                                    c7 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m5049a(null, "Invalid SEF name");
                                            }
                                            i17 = c26499l.f105304b - (iM121856i + 8);
                                            if (c7 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C26500m.f105306e.m1707w(c38059n7.m121865r(i17, charset));
                                                while (i18 < listM1707w.size()) {
                                                    listM1707w2 = C26500m.f105305d.m1707w((CharSequence) listM1707w.get(i18));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m5049a(null, null);
                                                    }
                                                    arrayList.add(new C18289b(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f105285i.add(new C18290c(arrayList));
                                            } else if (c7 != 2816) {
                                                continue;
                                            }
                                            i74++;
                                            i28 = 4;
                                            break;
                                        case 1760745220:
                                            if (strM121865r.equals("Super_SlowMotion_BGM")) {
                                                b = 4;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c7 = 2192;
                                                    break;
                                                case 1:
                                                    c7 = 2819;
                                                    break;
                                                case 2:
                                                    c7 = 2816;
                                                    break;
                                                case 3:
                                                    c7 = 2820;
                                                    break;
                                                case 4:
                                                    c7 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m5049a(null, "Invalid SEF name");
                                            }
                                            i17 = c26499l.f105304b - (iM121856i + 8);
                                            if (c7 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C26500m.f105306e.m1707w(c38059n7.m121865r(i17, charset));
                                                while (i18 < listM1707w.size()) {
                                                    listM1707w2 = C26500m.f105305d.m1707w((CharSequence) listM1707w.get(i18));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m5049a(null, null);
                                                    }
                                                    arrayList.add(new C18289b(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f105285i.add(new C18290c(arrayList));
                                            } else if (c7 != 2816) {
                                                continue;
                                            }
                                            i74++;
                                            i28 = 4;
                                            break;
                                    }
                                    b = -1;
                                    switch (b) {
                                        case 0:
                                            c7 = 2192;
                                            break;
                                        case 1:
                                            c7 = 2819;
                                            break;
                                        case 2:
                                            c7 = 2816;
                                            break;
                                        case 3:
                                            c7 = 2820;
                                            break;
                                        case 4:
                                            c7 = 2817;
                                            break;
                                        default:
                                            throw ParserException.m5049a(null, "Invalid SEF name");
                                    }
                                    i17 = c26499l.f105304b - (iM121856i + 8);
                                    if (c7 != 2192) {
                                        arrayList = new ArrayList();
                                        listM1707w = C26500m.f105306e.m1707w(c38059n7.m121865r(i17, charset));
                                        while (i18 < listM1707w.size()) {
                                            listM1707w2 = C26500m.f105305d.m1707w((CharSequence) listM1707w.get(i18));
                                            if (listM1707w2.size() == 3) {
                                                throw ParserException.m5049a(null, null);
                                            }
                                            arrayList.add(new C18289b(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                        }
                                        this.f105285i.add(new C18290c(arrayList));
                                    } else if (c7 != 2816) {
                                        continue;
                                    }
                                    i74++;
                                    i28 = 4;
                                }
                                c33650s.f140436a = 0L;
                            }
                        } else {
                            C38059n c38059n8 = new C38059n(8);
                            interfaceC33646o.readFully(c38059n8.f163017a, 0, 8);
                            c26500m.f105309c = c38059n8.m121856i() + 8;
                            if (c38059n8.m121854g() != 1397048916) {
                                c33650s.f140436a = 0L;
                            } else {
                                c33650s.f140436a = interfaceC33646o.getPosition() - ((long) (c26500m.f105309c - 12));
                                c26500m.f105308b = 2;
                            }
                        }
                        i16 = 1;
                    } else {
                        long length4 = interfaceC33646o.getLength();
                        c33650s.f140436a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        i16 = 1;
                        c26500m.f105308b = 1;
                    }
                    if (c33650s.f140436a != 0) {
                        return i16;
                    }
                    this.f105287k = 0;
                    this.f105290n = 0;
                    return i16;
                }
                long j36 = this.f105289m - ((long) this.f105290n);
                long position7 = interfaceC33646o.getPosition() + j36;
                C38059n c38059n9 = this.f105291o;
                if (c38059n9 != null) {
                    interfaceC33646o.readFully(c38059n9.f163017a, this.f105290n, (int) j36);
                    if (this.f105288l == 1718909296) {
                        this.f105297u = true;
                        c38059n9.m121846F(8);
                        int iM121854g2 = c38059n9.m121854g();
                        int i75 = iM121854g2 != 1751476579 ? iM121854g2 != 1903435808 ? 0 : 1 : 2;
                        if (i75 == 0) {
                            c38059n9.m121847G(4);
                            do {
                                if (c38059n9.m121848a() <= 0) {
                                    i75 = 0;
                                    break;
                                }
                                int iM121854g3 = c38059n9.m121854g();
                                i75 = iM121854g3 != 1751476579 ? iM121854g3 != 1903435808 ? 0 : 1 : 2;
                            } while (i75 == 0);
                        }
                        this.f105275E = i75;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C39308c) arrayDeque.peek()).f169112z.add(new C39309d(this.f105288l, c38059n9));
                    }
                } else {
                    if (!this.f105297u && this.f105288l == 1835295092) {
                        this.f105275E = 1;
                    }
                    if (j36 < 262144) {
                        interfaceC33646o.mo3100n((int) j36);
                    } else {
                        c33650s.f140436a = interfaceC33646o.getPosition() + j36;
                        z4 = true;
                    }
                    m78552l(position7);
                    if (this.f105298v) {
                        this.f105300x = true;
                        c33650s.f140436a = this.f105299w;
                        this.f105298v = false;
                        z4 = true;
                    }
                    if (z4 || this.f105287k == 2) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        return 1;
                    }
                }
                z4 = false;
                m78552l(position7);
                if (this.f105298v) {
                    this.f105300x = true;
                    c33650s.f140436a = this.f105299w;
                    this.f105298v = false;
                    z4 = true;
                }
                if (z4) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    return 1;
                }
            }
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: j */
    public final List mo78551j() {
        return this.f105286j;
    }

    /* JADX WARN: Code duplicated, block: B:286:0x0562 A[EDGE_INSN: B:286:0x0562->B:289:0x0586 BREAK  A[LOOP:9: B:245:0x04df->B:287:0x0575]] */
    /* JADX WARN: Code duplicated, block: B:419:0x0851 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:425:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m78552l(long j7) {
        ArrayList arrayList;
        C34585c0 c34585c0;
        ArrayDeque arrayDeque;
        boolean z4;
        ArrayList arrayList2;
        C34585c0 c34585c1;
        C34585c0 c34585c2;
        String str;
        int i13;
        C33655x c33655x;
        C34585c0 c34585c3;
        C34585c0 c34585c4;
        char c3;
        ArrayList arrayList3;
        int i14;
        int i15;
        ArrayDeque arrayDeque2;
        boolean z13;
        ArrayList arrayList4;
        int i16;
        C34585c0 c34585c5;
        C34585c0 c34585c0M109366b;
        C34585c0 c34585c6;
        int iM121868u;
        C34585c0 c34585c7;
        C34585c0 c34585c8;
        Object obj;
        Object objM78563k;
        Object obj2;
        C17046o c17046o;
        C39306a c39306aM78554b;
        int i17;
        C39306a c39306a;
        while (true) {
            ArrayDeque arrayDeque3 = this.f105283g;
            if (arrayDeque3.isEmpty() || ((C39308c) arrayDeque3.peek()).f169111y != j7) {
                break;
            }
            C39308c c39308c = (C39308c) arrayDeque3.pop();
            if (c39308c.f2052x == 1836019574) {
                C39308c c39308cM125272o = c39308c.m125272o(1835365473);
                ArrayList arrayList5 = new ArrayList();
                boolean z14 = true;
                int i18 = 4;
                int i19 = 1684108385;
                int i24 = this.f105278b;
                int i25 = 8;
                if (c39308cM125272o != null) {
                    byte[] bArr = AbstractC26490c.f105203a;
                    C39309d c39309dM125273p = c39308cM125272o.m125273p(1751411826);
                    C39309d c39309dM125273p2 = c39308cM125272o.m125273p(1801812339);
                    C39309d c39309dM125273p3 = c39308cM125272o.m125273p(1768715124);
                    if (c39309dM125273p == null || c39309dM125273p2 == null || c39309dM125273p3 == null) {
                        c34585c0 = null;
                    } else {
                        C38059n c38059n = c39309dM125273p.f169113y;
                        c38059n.m121846F(16);
                        if (c38059n.m121854g() != 1835299937) {
                            c34585c0 = null;
                        } else {
                            C38059n c38059n2 = c39309dM125273p2.f169113y;
                            c38059n2.m121846F(12);
                            int iM121854g = c38059n2.m121854g();
                            String[] strArr = new String[iM121854g];
                            int i26 = 0;
                            while (i26 < iM121854g) {
                                int iM121854g2 = c38059n2.m121854g();
                                c38059n2.m121847G(i18);
                                strArr[i26] = c38059n2.m121865r(iM121854g2 - 8, StandardCharsets.UTF_8);
                                i26++;
                                i18 = 4;
                            }
                            C38059n c38059n3 = c39309dM125273p3.f169113y;
                            c38059n3.m121846F(8);
                            ArrayList arrayList6 = new ArrayList();
                            while (c38059n3.m121848a() > i25) {
                                int i27 = c38059n3.f163018b;
                                int iM121854g3 = c38059n3.m121854g();
                                int iM121854g4 = c38059n3.m121854g() - 1;
                                if (iM121854g4 < 0 || iM121854g4 >= iM121854g) {
                                    AbstractC38963t7.m124388r(iM121854g4, "Skipped metadata with unknown key index: ", "BoxParsers");
                                } else {
                                    String str2 = strArr[iM121854g4];
                                    int i28 = i27 + iM121854g3;
                                    while (true) {
                                        int i29 = c38059n3.f163018b;
                                        if (i29 >= i28) {
                                            c39306a = null;
                                            break;
                                        }
                                        int iM121854g5 = c38059n3.m121854g();
                                        if (c38059n3.m121854g() == i19) {
                                            int iM121854g6 = c38059n3.m121854g();
                                            int iM121854g7 = c38059n3.m121854g();
                                            int i34 = iM121854g5 - 16;
                                            byte[] bArr2 = new byte[i34];
                                            c38059n3.m121852e(bArr2, 0, i34);
                                            c39306a = new C39306a(str2, bArr2, iM121854g7, iM121854g6);
                                            break;
                                        }
                                        c38059n3.m121846F(i29 + iM121854g5);
                                        i19 = 1684108385;
                                    }
                                    if (c39306a != null) {
                                        arrayList6.add(c39306a);
                                    }
                                }
                                c38059n3.m121846F(i27 + iM121854g3);
                                i25 = 8;
                                i19 = 1684108385;
                            }
                            if (arrayList6.isEmpty()) {
                                c34585c0 = null;
                            } else {
                                c34585c0 = new C34585c0(arrayList6);
                            }
                        }
                    }
                    if (this.f105300x) {
                        AbstractC35849g.m113808j(c34585c0);
                        C39306a c39306aM78554b2 = AbstractC26501n.m78554b(c34585c0, "auxiliary.tracks.interleaved");
                        if (c39306aM78554b2 != null && c39306aM78554b2.f169106b[0] == 0) {
                            this.f105301y = this.f105299w + 16;
                        }
                        C39306a c39306aM78554b3 = AbstractC26501n.m78554b(c34585c0, "auxiliary.tracks.map");
                        AbstractC35849g.m113808j(c39306aM78554b3);
                        ArrayList arrayListM125271b = c39306aM78554b3.m125271b();
                        ArrayList arrayList7 = new ArrayList(arrayListM125271b.size());
                        for (int i35 = 0; i35 < arrayListM125271b.size(); i35++) {
                            int iIntValue = ((Integer) arrayListM125271b.get(i35)).intValue();
                            if (iIntValue == 0) {
                                i17 = 1;
                            } else if (iIntValue == 1) {
                                i17 = 2;
                            } else if (iIntValue != 2) {
                                i17 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i17 = 3;
                            }
                            arrayList7.add(Integer.valueOf(i17));
                        }
                        arrayList = arrayList7;
                    } else {
                        if (c34585c0 != null && (i24 & 64) != 0 && (c39306aM78554b = AbstractC26501n.m78554b(c34585c0, "auxiliary.tracks.offset")) != null) {
                            long jM121872y = new C38059n(c39306aM78554b.f169106b).m121872y();
                            if (jM121872y > 0) {
                                this.f105299w = jM121872y;
                                this.f105298v = true;
                                arrayDeque = arrayDeque3;
                            }
                            arrayDeque.clear();
                            if (!this.f105298v) {
                                this.f105287k = 2;
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    arrayList = arrayList5;
                    c34585c0 = null;
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z15 = this.f105275E == 1;
                C33655x c33655x2 = new C33655x();
                C39309d c39309dM125273p4 = c39308c.m125273p(1969517665);
                if (c39309dM125273p4 != null) {
                    byte[] bArr3 = AbstractC26490c.f105203a;
                    C38059n c38059n4 = c39309dM125273p4.f169113y;
                    int i36 = 8;
                    c38059n4.m121846F(8);
                    C34585c0 c34585c9 = new C34585c0(new InterfaceC34583b0[0]);
                    while (c38059n4.m121848a() >= i36) {
                        int i37 = c38059n4.f163018b;
                        int iM121854g8 = c38059n4.m121854g();
                        int iM121854g9 = c38059n4.m121854g();
                        if (iM121854g9 == 1835365473) {
                            c38059n4.m121846F(i37);
                            int i38 = i37 + iM121854g8;
                            c38059n4.m121847G(i36);
                            int i39 = c38059n4.f163018b;
                            c38059n4.m121847G(4);
                            if (c38059n4.m121854g() != 1751411826) {
                                i39 += 4;
                            }
                            c38059n4.m121846F(i39);
                            while (true) {
                                int i44 = c38059n4.f163018b;
                                if (i44 < i38) {
                                    int iM121854g10 = c38059n4.m121854g();
                                    boolean z16 = z14;
                                    if (c38059n4.m121854g() == 1768715124) {
                                        c38059n4.m121846F(i44);
                                        int i45 = i44 + iM121854g10;
                                        c38059n4.m121847G(8);
                                        ArrayList arrayList9 = new ArrayList();
                                        while (true) {
                                            int i46 = c38059n4.f163018b;
                                            if (i46 >= i45) {
                                                break;
                                            }
                                            int iM121854g11 = c38059n4.m121854g() + i46;
                                            int iM121854g12 = c38059n4.m121854g();
                                            ArrayDeque arrayDeque4 = arrayDeque3;
                                            int i47 = (iM121854g12 >> 24) & 255;
                                            int i48 = i45;
                                            boolean z17 = z15;
                                            ArrayList arrayList10 = arrayList8;
                                            if (i47 == 169 || i47 == 253) {
                                                obj = null;
                                                int i49 = 16777215 & iM121854g12;
                                                if (i49 == 6516084) {
                                                    objM78563k = AbstractC26501n.m78557e(iM121854g12, c38059n4);
                                                } else if (i49 == 7233901 || i49 == 7631467) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TIT2", c38059n4);
                                                } else if (i49 == 6516589 || i49 == 7828084) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TCOM", c38059n4);
                                                } else if (i49 == 6578553) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TDRC", c38059n4);
                                                } else if (i49 == 4280916) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TPE1", c38059n4);
                                                } else if (i49 == 7630703) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TSSE", c38059n4);
                                                } else if (i49 == 6384738) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TALB", c38059n4);
                                                } else if (i49 == 7108978) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "USLT", c38059n4);
                                                } else if (i49 == 6776174) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TCON", c38059n4);
                                                } else if (i49 == 6779504) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TIT1", c38059n4);
                                                } else {
                                                    AbstractC38046a.m121811f("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0576a.m1493e(iM121854g12));
                                                    c38059n4.m121846F(iM121854g11);
                                                    objM78563k = obj;
                                                }
                                                c38059n4.m121846F(iM121854g11);
                                            } else if (iM121854g12 == 1735291493) {
                                                try {
                                                    String strM48122a = AbstractC17042k.m48122a(AbstractC26501n.m78560h(c38059n4) - 1);
                                                    if (strM48122a != null) {
                                                        obj2 = null;
                                                        c17046o = new C17046o("TCON", null, AbstractC41023g0.m133256r(strM48122a));
                                                    } else {
                                                        obj2 = null;
                                                        AbstractC38046a.m121826u("MetadataUtil", "Failed to parse standard genre code");
                                                        c17046o = null;
                                                    }
                                                    c38059n4.m121846F(iM121854g11);
                                                    objM78563k = c17046o;
                                                } catch (Throwable th3) {
                                                    c38059n4.m121846F(iM121854g11);
                                                    throw th3;
                                                }
                                            } else {
                                                obj = null;
                                                if (iM121854g12 == 1684632427) {
                                                    objM78563k = AbstractC26501n.m78559g(iM121854g12, "TPOS", c38059n4);
                                                } else if (iM121854g12 == 1953655662) {
                                                    objM78563k = AbstractC26501n.m78559g(iM121854g12, "TRCK", c38059n4);
                                                } else if (iM121854g12 == 1953329263) {
                                                    objM78563k = AbstractC26501n.m78561i(iM121854g12, "TBPM", c38059n4, z16, false);
                                                } else if (iM121854g12 == 1668311404) {
                                                    objM78563k = AbstractC26501n.m78561i(iM121854g12, "TCMP", c38059n4, true, true);
                                                } else if (iM121854g12 == 1668249202) {
                                                    objM78563k = AbstractC26501n.m78558f(c38059n4);
                                                } else if (iM121854g12 == 1631670868) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TPE2", c38059n4);
                                                } else if (iM121854g12 == 1936682605) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TSOT", c38059n4);
                                                } else if (iM121854g12 == 1936679276) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TSOA", c38059n4);
                                                } else if (iM121854g12 == 1936679282) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TSOP", c38059n4);
                                                } else if (iM121854g12 == 1936679265) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TSO2", c38059n4);
                                                } else if (iM121854g12 == 1936679791) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TSOC", c38059n4);
                                                } else if (iM121854g12 == 1920233063) {
                                                    objM78563k = AbstractC26501n.m78561i(iM121854g12, "ITUNESADVISORY", c38059n4, false, false);
                                                } else if (iM121854g12 == 1885823344) {
                                                    objM78563k = AbstractC26501n.m78561i(iM121854g12, "ITUNESGAPLESS", c38059n4, false, true);
                                                } else if (iM121854g12 == 1936683886) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TVSHOWSORT", c38059n4);
                                                } else if (iM121854g12 == 1953919848) {
                                                    objM78563k = AbstractC26501n.m78563k(iM121854g12, "TVSHOW", c38059n4);
                                                } else if (iM121854g12 == 757935405) {
                                                    String strM121863p = null;
                                                    String strM121863p2 = null;
                                                    int i54 = -1;
                                                    int i55 = -1;
                                                    while (true) {
                                                        int i56 = c38059n4.f163018b;
                                                        if (i56 >= iM121854g11) {
                                                            break;
                                                        }
                                                        int iM121854g13 = c38059n4.m121854g();
                                                        int i57 = i55;
                                                        int iM121854g14 = c38059n4.m121854g();
                                                        c38059n4.m121847G(4);
                                                        if (iM121854g14 == 1835360622) {
                                                            strM121863p2 = c38059n4.m121863p(iM121854g13 - 12);
                                                        } else if (iM121854g14 == 1851878757) {
                                                            strM121863p = c38059n4.m121863p(iM121854g13 - 12);
                                                        } else {
                                                            if (iM121854g14 == 1684108385) {
                                                                i55 = iM121854g13;
                                                                i54 = i56;
                                                            } else {
                                                                i55 = i57;
                                                            }
                                                            c38059n4.m121847G(iM121854g13 - 12);
                                                        }
                                                        i55 = i57;
                                                    }
                                                    int i58 = i55;
                                                    if (strM121863p2 == null || strM121863p == null || i54 == -1) {
                                                        objM78563k = null;
                                                    } else {
                                                        c38059n4.m121846F(i54);
                                                        c38059n4.m121847G(16);
                                                        objM78563k = new C17043l(strM121863p2, strM121863p, c38059n4.m121863p(i58 - 16));
                                                    }
                                                    c38059n4.m121846F(iM121854g11);
                                                } else {
                                                    AbstractC38046a.m121811f("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0576a.m1493e(iM121854g12));
                                                    c38059n4.m121846F(iM121854g11);
                                                    objM78563k = obj;
                                                }
                                                c38059n4.m121846F(iM121854g11);
                                            }
                                            if (objM78563k != null) {
                                                arrayList9.add(objM78563k);
                                            }
                                            arrayDeque3 = arrayDeque4;
                                            i45 = i48;
                                            z15 = z17;
                                            arrayList8 = arrayList10;
                                            z16 = true;
                                        }
                                        arrayDeque2 = arrayDeque3;
                                        z13 = z15;
                                        arrayList4 = arrayList8;
                                        c34585c7 = null;
                                        if (!arrayList9.isEmpty()) {
                                            c34585c8 = new C34585c0(arrayList9);
                                            break;
                                        }
                                        break;
                                    }
                                    c38059n4.m121846F(i44 + iM121854g10);
                                    z14 = true;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    z13 = z15;
                                    arrayList4 = arrayList8;
                                    c34585c7 = null;
                                }
                                c34585c8 = c34585c7;
                                break;
                            }
                            c34585c9 = c34585c9.m109366b(c34585c8);
                            i16 = 8;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            z13 = z15;
                            arrayList4 = arrayList8;
                            if (iM121854g9 == 1936553057) {
                                c38059n4.m121846F(i37);
                                int i59 = i37 + iM121854g8;
                                c38059n4.m121847G(12);
                                while (true) {
                                    int i64 = c38059n4.f163018b;
                                    if (i64 < i59) {
                                        int iM121854g15 = c38059n4.m121854g();
                                        if (c38059n4.m121854g() == 1935766900) {
                                            if (iM121854g15 >= 16) {
                                                c38059n4.m121847G(4);
                                                int i65 = -1;
                                                int i66 = 0;
                                                for (int i67 = 0; i67 < 2; i67++) {
                                                    int iM121867t = c38059n4.m121867t();
                                                    int iM121867t2 = c38059n4.m121867t();
                                                    if (iM121867t == 0) {
                                                        i65 = iM121867t2;
                                                    } else if (iM121867t == 1) {
                                                        i66 = iM121867t2;
                                                    }
                                                }
                                                if (i65 != 12) {
                                                    if (i65 != 13) {
                                                        if (i65 != 21) {
                                                            iM121868u = -2147483647;
                                                        } else {
                                                            i16 = 8;
                                                            if (c38059n4.m121848a() >= 8 && c38059n4.f163018b + 8 <= i59) {
                                                                int iM121854g16 = c38059n4.m121854g();
                                                                int iM121854g17 = c38059n4.m121854g();
                                                                if (iM121854g16 >= 12 && iM121854g17 == 1936877170) {
                                                                    iM121868u = c38059n4.m121868u();
                                                                }
                                                            }
                                                            iM121868u = -2147483647;
                                                        }
                                                        if (iM121868u == -2147483647) {
                                                            c34585c6 = new C34585c0(new C18291d(iM121868u, i66));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    iM121868u = 120;
                                                } else {
                                                    iM121868u = 240;
                                                }
                                                i16 = 8;
                                                if (iM121868u == -2147483647) {
                                                    c34585c6 = new C34585c0(new C18291d(iM121868u, i66));
                                                    break;
                                                }
                                                break;
                                            }
                                            c34585c6 = null;
                                            i16 = 8;
                                            break;
                                        }
                                        c38059n4.m121846F(i64 + iM121854g15);
                                    } else {
                                        i16 = 8;
                                    }
                                    c34585c6 = null;
                                    break;
                                }
                                c34585c0M109366b = c34585c9.m109366b(c34585c6);
                            } else {
                                i16 = 8;
                                if (iM121854g9 == -1451722374) {
                                    short sM121864q = c38059n4.m121864q();
                                    c38059n4.m121847G(2);
                                    String strM121865r = c38059n4.m121865r(sM121864q, StandardCharsets.UTF_8);
                                    int iMax = Math.max(strM121865r.lastIndexOf(43), strM121865r.lastIndexOf(45));
                                    try {
                                        c34585c5 = new C34585c0(new C39310e(Float.parseFloat(strM121865r.substring(0, iMax)), Float.parseFloat(strM121865r.substring(iMax, strM121865r.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        c34585c5 = null;
                                    }
                                    c34585c0M109366b = c34585c9.m109366b(c34585c5);
                                }
                            }
                            c34585c9 = c34585c0M109366b;
                        }
                        c38059n4.m121846F(i37 + iM121854g8);
                        i36 = i16;
                        arrayDeque3 = arrayDeque2;
                        z15 = z13;
                        arrayList8 = arrayList4;
                        z14 = true;
                    }
                    arrayDeque = arrayDeque3;
                    z4 = z15;
                    arrayList2 = arrayList8;
                    c34585c1 = null;
                    c33655x2.m106296b(c34585c9);
                    c34585c2 = c34585c9;
                } else {
                    arrayDeque = arrayDeque3;
                    z4 = z15;
                    arrayList2 = arrayList8;
                    c34585c1 = null;
                    c34585c2 = null;
                }
                C39309d c39309dM125273p5 = c39308c.m125273p(1836476516);
                c39309dM125273p5.getClass();
                C34585c0 c34585c10 = new C34585c0(AbstractC26490c.m78537d(c39309dM125273p5.f169113y));
                ArrayList arrayListM78540g = AbstractC26490c.m78540g(c39308c, c33655x2, -9223372036854775807L, null, (i24 & 1) != 0, z4, new C24148c(16));
                if (this.f105300x) {
                    boolean z18 = arrayList.size() == arrayListM78540g.size();
                    Locale locale = Locale.US;
                    AbstractC35849g.m113806h(AbstractC25012a.m73372e(arrayList.size(), arrayListM78540g.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z18);
                }
                String strM78555c = AbstractC26501n.m78555c(arrayListM78540g);
                int i68 = 0;
                int size = -1;
                int i69 = 0;
                long jMax = -9223372036854775807L;
                while (i68 < arrayListM78540g.size()) {
                    C26504q c26504q = (C26504q) arrayListM78540g.get(i68);
                    int i74 = c26504q.f105329b;
                    int i75 = c26504q.f105332e;
                    if (i74 == 0) {
                        c34585c3 = c34585c2;
                        c34585c4 = c34585c0;
                        str = strM78555c;
                        i13 = i69;
                        arrayList3 = arrayList2;
                        c3 = 3;
                        c33655x = c33655x2;
                    } else {
                        C26502o c26502o = c26504q.f105328a;
                        str = strM78555c;
                        InterfaceC33648q interfaceC33648q = this.f105302z;
                        i13 = i69 + 1;
                        int i76 = c26502o.f105312b;
                        C34585c0 c34585c11 = c34585c0;
                        C34610p c34610p = c26502o.f105317g;
                        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(i69, i76);
                        C26497j c26497j = new C26497j(c26502o, c26504q, interfaceC33639k0Mo3101o);
                        c33655x = c33655x2;
                        long j13 = c26502o.f105315e;
                        if (j13 == -9223372036854775807L) {
                            j13 = c26504q.f105335h;
                        }
                        interfaceC33639k0Mo3101o.getClass();
                        jMax = Math.max(jMax, j13);
                        int i77 = "audio/true-hd".equals(c34610p.f145783n) ? i75 * 16 : i75 + 30;
                        C34608o c34608oM109410a = c34610p.m109410a();
                        c34608oM109410a.f145742n = i77;
                        if (i76 == 2) {
                            int i78 = c34610p.f145775f;
                            if ((i24 & 8) != 0) {
                                i78 |= size == -1 ? 1 : 2;
                            }
                            if (this.f105300x) {
                                i78 |= 32768;
                                c34608oM109410a.f145735g = ((Integer) arrayList.get(i68)).intValue();
                            }
                            c34608oM109410a.f145734f = i78;
                        }
                        if (i76 == 1 && (i14 = c33655x.f140458a) != -1 && (i15 = c33655x.f140459b) != -1) {
                            c34608oM109410a.f145722F = i14;
                            c34608oM109410a.f145723G = i15;
                        }
                        C34585c0 c34585c0M109366b2 = c34610p.f145781l;
                        ArrayList arrayList11 = this.f105285i;
                        C34585c0[] c34585c0Arr = {arrayList11.isEmpty() ? c34585c1 : new C34585c0(arrayList11), c34585c2, c34585c10};
                        if (c34585c0M109366b2 == null) {
                            c34585c0M109366b2 = new C34585c0(new InterfaceC34583b0[0]);
                        }
                        if (c34585c11 != null) {
                            c34585c4 = c34585c11;
                            int i79 = 0;
                            while (true) {
                                InterfaceC34583b0[] interfaceC34583b0Arr = c34585c4.f145640a;
                                c34585c3 = c34585c2;
                                if (i79 >= interfaceC34583b0Arr.length) {
                                    break;
                                }
                                InterfaceC34583b0 interfaceC34583b0 = interfaceC34583b0Arr[i79];
                                if (interfaceC34583b0 instanceof C39306a) {
                                    C39306a c39306a2 = (C39306a) interfaceC34583b0;
                                    if (!c39306a2.f169105a.equals("com.android.capture.fps")) {
                                        c34585c0M109366b2 = c34585c0M109366b2.m109365a(c39306a2);
                                    } else if (i76 == 2) {
                                        c34585c0M109366b2 = c34585c0M109366b2.m109365a(c39306a2);
                                    }
                                }
                                i79++;
                                c34585c2 = c34585c3;
                            }
                        } else {
                            c34585c3 = c34585c2;
                            c34585c4 = c34585c11;
                        }
                        c3 = 3;
                        for (int i83 = 0; i83 < 3; i83++) {
                            c34585c0M109366b2 = c34585c0M109366b2.m109366b(c34585c0Arr[i83]);
                        }
                        if (c34585c0M109366b2.f145640a.length > 0) {
                            c34608oM109410a.f145739k = c34585c0M109366b2;
                        }
                        c34608oM109410a.f145740l = AbstractC34587d0.m109382o(str);
                        AbstractC21702c.m61152w(c34608oM109410a, c26497j.f105268c);
                        if (i76 == 2 && size == -1) {
                            size = arrayList2.size();
                        }
                        arrayList3 = arrayList2;
                        arrayList3.add(c26497j);
                    }
                    i68++;
                    arrayList2 = arrayList3;
                    c34585c0 = c34585c4;
                    c33655x2 = c33655x;
                    arrayListM78540g = arrayListM78540g;
                    strM78555c = str;
                    i69 = i13;
                    c34585c2 = c34585c3;
                }
                this.f105273C = size;
                this.f105274D = jMax;
                C26497j[] c26497jArr = (C26497j[]) arrayList2.toArray(new C26497j[0]);
                this.f105271A = c26497jArr;
                long[][] jArr = new long[c26497jArr.length][];
                int[] iArr = new int[c26497jArr.length];
                long[] jArr2 = new long[c26497jArr.length];
                boolean[] zArr = new boolean[c26497jArr.length];
                for (int i84 = 0; i84 < c26497jArr.length; i84++) {
                    jArr[i84] = new long[c26497jArr[i84].f105267b.f105329b];
                    jArr2[i84] = c26497jArr[i84].f105267b.f105333f[0];
                }
                long j14 = 0;
                int i85 = 0;
                while (i85 < c26497jArr.length) {
                    long j15 = Long.MAX_VALUE;
                    int i86 = -1;
                    for (int i87 = 0; i87 < c26497jArr.length; i87++) {
                        if (!zArr[i87]) {
                            long j16 = jArr2[i87];
                            if (j16 <= j15) {
                                i86 = i87;
                                j15 = j16;
                            }
                        }
                    }
                    int i88 = iArr[i86];
                    long[] jArr3 = jArr[i86];
                    jArr3[i88] = j14;
                    C26504q c26504q2 = c26497jArr[i86].f105267b;
                    j14 += (long) c26504q2.f105331d[i88];
                    int i89 = i88 + 1;
                    iArr[i86] = i89;
                    if (i89 < jArr3.length) {
                        jArr2[i86] = c26504q2.f105333f[i89];
                    } else {
                        zArr[i86] = true;
                        i85++;
                    }
                }
                this.f105272B = jArr;
                this.f105302z.mo3098l();
                this.f105302z.mo3109v(this);
                arrayDeque.clear();
                if (!this.f105298v) {
                    this.f105287k = 2;
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((C39308c) arrayDeque3.peek()).f169110E.add(c39308c);
            }
        }
        if (this.f105287k != 2) {
            this.f105287k = 0;
            this.f105290n = 0;
        }
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
