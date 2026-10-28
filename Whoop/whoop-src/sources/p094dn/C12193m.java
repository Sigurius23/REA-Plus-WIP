package p094dn;

import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.mapbox.maps.C5538l;
import ed3.C13117a;
import in.C18715c;
import in.InterfaceC18714b;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p010a9.AbstractC0576a;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p345nn.C26859j;
import p345nn.C26862m;
import p373on.C28040a;
import p373on.C28041b;
import p373on.C28042c;
import p373on.C28043d;
import p373on.C28044e;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33641l0;
import p499t9.C33650s;
import p588wm.C37371m;
import p588wm.C37373o;
import p588wm.C37375q;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import p658yr.AbstractC39717d;
import q63.AbstractC30007c;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: dn.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C12193m implements InterfaceC37367i, InterfaceC37374p {

    /* JADX INFO: renamed from: i */
    public int f40696i;

    /* JADX INFO: renamed from: j */
    public long f40697j;

    /* JADX INFO: renamed from: k */
    public int f40698k;

    /* JADX INFO: renamed from: l */
    public C13117a f40699l;

    /* JADX INFO: renamed from: n */
    public int f40701n;

    /* JADX INFO: renamed from: o */
    public int f40702o;

    /* JADX INFO: renamed from: p */
    public int f40703p;

    /* JADX INFO: renamed from: q */
    public InterfaceC37369k f40704q;

    /* JADX INFO: renamed from: r */
    public C12192l[] f40705r;

    /* JADX INFO: renamed from: s */
    public long[][] f40706s;

    /* JADX INFO: renamed from: t */
    public int f40707t;

    /* JADX INFO: renamed from: u */
    public long f40708u;

    /* JADX INFO: renamed from: v */
    public int f40709v;

    /* JADX INFO: renamed from: h */
    public int f40695h = 0;

    /* JADX INFO: renamed from: f */
    public final C12196p f40693f = new C12196p();

    /* JADX INFO: renamed from: g */
    public final ArrayList f40694g = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final C13117a f40691d = new C13117a(16);

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f40692e = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final C13117a f40688a = new C13117a(AbstractC24543a.f95799c, 1, (byte) 0);

    /* JADX INFO: renamed from: b */
    public final C13117a f40689b = new C13117a(4);

    /* JADX INFO: renamed from: c */
    public final C13117a f40690c = new C13117a();

    /* JADX INFO: renamed from: m */
    public int f40700m = -1;

    public C12193m(int i13) {
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        this.f40692e.clear();
        this.f40698k = 0;
        this.f40700m = -1;
        this.f40701n = 0;
        this.f40702o = 0;
        this.f40703p = 0;
        if (j7 == 0) {
            if (this.f40695h != 3) {
                this.f40695h = 0;
                this.f40698k = 0;
                return;
            } else {
                C12196p c12196p = this.f40693f;
                c12196p.f40715a.clear();
                c12196p.f40716b = 0;
                this.f40694g.clear();
                return;
            }
        }
        C12192l[] c12192lArr = this.f40705r;
        if (c12192lArr != null) {
            for (C12192l c12192l : c12192lArr) {
                C12200t c12200t = c12192l.f40684b;
                int iM71674e = AbstractC24567y.m71674e(c12200t.f40756f, j13, false);
                while (true) {
                    if (iM71674e < 0) {
                        iM71674e = -1;
                        break;
                    } else if ((c12200t.f40757g[iM71674e] & 1) != 0) {
                        break;
                    } else {
                        iM71674e--;
                    }
                }
                if (iM71674e == -1) {
                    iM71674e = c12200t.m33817a(j13);
                }
                c12192l.f40687e = iM71674e;
                C33641l0 c33641l0 = c12192l.f40686d;
                if (c33641l0 != null) {
                    c33641l0.f140418b = false;
                    c33641l0.f140419c = 0;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[LOOP:2: B:37:0x008c->B:41:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1 A[LOOP:3: B:51:0x00b7->B:55:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3 A[EDGE_INSN: B:73:0x00e3->B:65:0x00e3 BREAK  A[LOOP:1: B:32:0x0070->B:64:0x00de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00bf A[EDGE_INSN: B:81:0x00bf->B:54:0x00bf BREAK  A[LOOP:3: B:51:0x00b7->B:55:0x00c1], SYNTHETIC] */
    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        long j13;
        long j14;
        long j15;
        int i13;
        long jMin;
        C12192l[] c12192lArr;
        int i14;
        C12200t c12200t;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM71674e;
        int iM33817a;
        int iM71674e2;
        int iM33817a2;
        C12192l[] c12192lArr2 = this.f40705r;
        c12192lArr2.getClass();
        int length = c12192lArr2.length;
        C37375q c37375q = C37375q.f159869c;
        if (length == 0) {
            return new C37373o(c37375q, c37375q);
        }
        int i15 = this.f40707t;
        boolean z4 = false;
        int i16 = -1;
        long jMin2 = -1;
        if (i15 != -1) {
            C12200t c12200t2 = this.f40705r[i15].f40684b;
            long[] jArr3 = c12200t2.f40756f;
            int iM71674e3 = AbstractC24567y.m71674e(jArr3, j7, false);
            while (true) {
                if (iM71674e3 < 0) {
                    iM71674e3 = -1;
                    break;
                }
                if ((c12200t2.f40757g[iM71674e3] & 1) != 0) {
                    break;
                }
                iM71674e3--;
            }
            if (iM71674e3 == -1) {
                iM71674e3 = c12200t2.m33817a(j7);
            }
            long[] jArr4 = c12200t2.f40753c;
            if (iM71674e3 == -1) {
                return new C37373o(c37375q, c37375q);
            }
            j14 = jArr3[iM71674e3];
            j13 = jArr4[iM71674e3];
            if (j14 < j7 && iM71674e3 < c12200t2.f40752b - 1 && (iM33817a2 = c12200t2.m33817a(j7)) != -1 && iM33817a2 != iM71674e3) {
                j15 = jArr3[iM33817a2];
                jMin2 = jArr4[iM33817a2];
            }
            i13 = 0;
            jMin = j13;
            while (true) {
                c12192lArr = this.f40705r;
                if (i13 < c12192lArr.length) {
                    break;
                }
                if (i13 != this.f40707t) {
                    c12200t = c12192lArr[i13].f40684b;
                    jArr = c12200t.f40753c;
                    iArr = c12200t.f40757g;
                    jArr2 = c12200t.f40756f;
                    iM71674e = AbstractC24567y.m71674e(jArr2, j14, z4);
                    while (true) {
                        if (iM71674e >= 0) {
                            iM33817a = i16;
                            break;
                        }
                        if ((iArr[iM71674e] & 1) != 0) {
                            iM33817a = iM71674e;
                            break;
                        }
                        iM71674e--;
                    }
                    if (iM33817a == i16) {
                        iM33817a = c12200t.m33817a(j14);
                    }
                    if (iM33817a == i16) {
                        jMin = Math.min(jArr[iM33817a], jMin);
                    }
                    if (j15 != -9223372036854775807L) {
                        iM71674e2 = AbstractC24567y.m71674e(jArr2, j15, false);
                        while (true) {
                            if (iM71674e2 >= 0) {
                                iM71674e2 = -1;
                                break;
                            }
                            if ((iArr[iM71674e2] & 1) != 0) {
                                break;
                            }
                            iM71674e2--;
                        }
                        i14 = -1;
                        if (iM71674e2 == -1) {
                            iM71674e2 = c12200t.m33817a(j15);
                        }
                        if (iM71674e2 == -1) {
                            jMin2 = Math.min(jArr[iM71674e2], jMin2);
                        }
                    } else {
                        i14 = -1;
                    }
                } else {
                    i14 = i16;
                }
                i13++;
                i16 = i14;
                z4 = false;
            }
            C37375q c37375q2 = new C37375q(j14, jMin);
            return j15 == -9223372036854775807L ? new C37373o(c37375q2, c37375q2) : new C37373o(c37375q2, new C37375q(j15, jMin2));
        }
        j13 = Long.MAX_VALUE;
        j14 = j7;
        j15 = -9223372036854775807L;
        i13 = 0;
        jMin = j13;
        while (true) {
            c12192lArr = this.f40705r;
            if (i13 < c12192lArr.length) {
                break;
                break;
            }
            if (i13 != this.f40707t) {
                c12200t = c12192lArr[i13].f40684b;
                jArr = c12200t.f40753c;
                iArr = c12200t.f40757g;
                jArr2 = c12200t.f40756f;
                iM71674e = AbstractC24567y.m71674e(jArr2, j14, z4);
                while (true) {
                    if (iM71674e >= 0) {
                        iM33817a = i16;
                        break;
                    }
                    if ((iArr[iM71674e] & 1) != 0) {
                        iM33817a = iM71674e;
                        break;
                    }
                    iM71674e--;
                }
                if (iM33817a == i16) {
                    iM33817a = c12200t.m33817a(j14);
                }
                if (iM33817a == i16) {
                    jMin = Math.min(jArr[iM33817a], jMin);
                }
                if (j15 != -9223372036854775807L) {
                    iM71674e2 = AbstractC24567y.m71674e(jArr2, j15, false);
                    while (true) {
                        if (iM71674e2 >= 0) {
                            iM71674e2 = -1;
                            break;
                        }
                        if ((iArr[iM71674e2] & 1) != 0) {
                            break;
                            break;
                        }
                        iM71674e2--;
                    }
                    i14 = -1;
                    if (iM71674e2 == -1) {
                        iM71674e2 = c12200t.m33817a(j15);
                    }
                    if (iM71674e2 == -1) {
                        jMin2 = Math.min(jArr[iM71674e2], jMin2);
                    }
                } else {
                    i14 = -1;
                }
            } else {
                i14 = i16;
            }
            i13++;
            i16 = i14;
            z4 = false;
        }
        C37375q c37375q3 = new C37375q(j14, jMin);
        if (j15 == -9223372036854775807L) {
        }
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return true;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f40708u;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        return AbstractC12191k.m33815i(interfaceC37368j, false, false);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f40704q = interfaceC37369k;
    }

    /* JADX WARN: Code duplicated, block: B:330:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x015b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException {
        int i13;
        byte b;
        char c3;
        int i14;
        ArrayList arrayList;
        List listM1707w;
        int i15;
        List listM1707w2;
        boolean z4;
        C12181a c12181a;
        while (true) {
            int i16 = this.f40695h;
            ArrayDeque arrayDeque = this.f40692e;
            C13117a c13117a = this.f40690c;
            int i17 = 4;
            if (i16 != 0) {
                int i18 = 2;
                if (i16 != 1) {
                    if (i16 == 2) {
                        long position = interfaceC37368j.getPosition();
                        if (this.f40700m == -1) {
                            int i19 = -1;
                            int i24 = -1;
                            boolean z13 = true;
                            boolean z14 = true;
                            int i25 = 0;
                            long j7 = Long.MAX_VALUE;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            while (true) {
                                C12192l[] c12192lArr = this.f40705r;
                                int i26 = AbstractC24567y.f95875a;
                                if (i25 >= c12192lArr.length) {
                                    break;
                                }
                                C12192l c12192l = c12192lArr[i25];
                                int i27 = c12192l.f40687e;
                                C12200t c12200t = c12192l.f40684b;
                                if (i27 != c12200t.f40752b) {
                                    long j15 = c12200t.f40753c[i27];
                                    long j16 = this.f40706s[i25][i27];
                                    long j17 = j15 - position;
                                    boolean z15 = j17 < 0 || j17 >= 262144;
                                    if ((!z15 && z14) || (z15 == z14 && j17 < j14)) {
                                        j13 = j16;
                                        z14 = z15;
                                        i24 = i25;
                                        j14 = j17;
                                    }
                                    if (j16 < j7) {
                                        j7 = j16;
                                        z13 = z15;
                                        i19 = i25;
                                    }
                                }
                                i25++;
                            }
                            if (j7 == Long.MAX_VALUE || !z13 || j13 < j7 + AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES) {
                                i19 = i24;
                            }
                            this.f40700m = i19;
                            if (i19 == -1) {
                                return -1;
                            }
                        }
                        C12192l[] c12192lArr2 = this.f40705r;
                        int i28 = AbstractC24567y.f95875a;
                        C12192l c12192l2 = c12192lArr2[this.f40700m];
                        InterfaceC37377s interfaceC37377s = c12192l2.f40685c;
                        C12197q c12197q = c12192l2.f40683a;
                        C12200t c12200t2 = c12192l2.f40684b;
                        int i29 = c12192l2.f40687e;
                        long j18 = c12200t2.f40753c[i29];
                        int i34 = c12200t2.f40754d[i29];
                        C33641l0 c33641l0 = c12192l2.f40686d;
                        long j19 = (j18 - position) + ((long) this.f40701n);
                        if (j19 < 0 || j19 >= 262144) {
                            c33650s.f140436a = j18;
                            return 1;
                        }
                        if (c12197q.f40724g == 1) {
                            j19 += 8;
                            i34 -= 8;
                        }
                        interfaceC37368j.mo3100n((int) j19);
                        int i35 = c12197q.f40727j;
                        if (i35 == 0) {
                            if ("audio/ac4".equals(c12197q.f40723f.f130077L)) {
                                if (this.f40702o == 0) {
                                    AbstractC33922a.m107329c(i34, c13117a);
                                    interfaceC37377s.mo102732c(7, c13117a);
                                    this.f40702o += 7;
                                }
                                i34 += 7;
                            } else if (c33641l0 != null) {
                                c33641l0.m106264f(interfaceC37368j);
                            }
                            while (true) {
                                int i36 = this.f40702o;
                                if (i36 >= i34) {
                                    break;
                                }
                                int iMo102731b = interfaceC37377s.mo102731b(interfaceC37368j, i34 - i36, false);
                                this.f40701n += iMo102731b;
                                this.f40702o += iMo102731b;
                                this.f40703p -= iMo102731b;
                            }
                        } else {
                            C13117a c13117a2 = this.f40689b;
                            byte[] bArr = c13117a2.f45381a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i37 = 4 - i35;
                            while (this.f40702o < i34) {
                                int i38 = this.f40703p;
                                if (i38 == 0) {
                                    interfaceC37368j.readFully(bArr, i37, i35);
                                    this.f40701n += i35;
                                    c13117a2.m36689K(0);
                                    int iM36699i = c13117a2.m36699i();
                                    if (iM36699i < 0) {
                                        throw ParserException.m15562a(null, "Invalid NAL length");
                                    }
                                    this.f40703p = iM36699i;
                                    C13117a c13117a3 = this.f40688a;
                                    c13117a3.m36689K(0);
                                    interfaceC37377s.mo102732c(4, c13117a3);
                                    this.f40702o += 4;
                                    i34 += i37;
                                } else {
                                    int iMo102731b2 = interfaceC37377s.mo102731b(interfaceC37368j, i38, false);
                                    this.f40701n += iMo102731b2;
                                    this.f40702o += iMo102731b2;
                                    this.f40703p -= iMo102731b2;
                                }
                            }
                        }
                        long j24 = c12200t2.f40756f[i29];
                        int i39 = c12200t2.f40757g[i29];
                        if (c33641l0 != null) {
                            c33641l0.m106262d(interfaceC37377s, j24, i39, i34, 0, null);
                            if (i29 + 1 == c12200t2.f40752b) {
                                c33641l0.m106260b(interfaceC37377s, null);
                            }
                        } else {
                            interfaceC37377s.mo102733d(j24, i39, i34, 0, null);
                        }
                        c12192l2.f40687e++;
                        this.f40700m = -1;
                        this.f40701n = 0;
                        this.f40702o = 0;
                        this.f40703p = 0;
                        return 0;
                    }
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    C12196p c12196p = this.f40693f;
                    ArrayList arrayList2 = c12196p.f40715a;
                    int i44 = c12196p.f40716b;
                    if (i44 != 0) {
                        if (i44 != 1) {
                            int i45 = 8;
                            short s13 = 2816;
                            short s14 = 2192;
                            if (i44 == 2) {
                                long length = interfaceC37368j.getLength();
                                int i46 = c12196p.f40717c - 20;
                                C13117a c13117a4 = new C13117a(i46);
                                interfaceC37368j.readFully(c13117a4.f45381a, 0, i46);
                                int i47 = 0;
                                while (i47 < i46 / 12) {
                                    c13117a4.m36690L(i18);
                                    byte[] bArr2 = c13117a4.f45381a;
                                    int i48 = c13117a4.f45382b;
                                    int i49 = i18;
                                    int i54 = i48 + 1;
                                    c13117a4.f45382b = i54;
                                    int i55 = bArr2[i48] & 255;
                                    c13117a4.f45382b = i48 + 2;
                                    short s15 = (short) (((bArr2[i54] & 255) << 8) | i55);
                                    if (s15 != s14 && s15 != s13) {
                                        if (s15 != 2817) {
                                            if (s15 != 2819 && s15 != 2820) {
                                                c13117a4.m36690L(i45);
                                            }
                                            i47++;
                                            i18 = i49;
                                            s14 = 2192;
                                            s13 = 2816;
                                            i45 = 8;
                                        }
                                        arrayList2.add(new C12195o((length - ((long) c12196p.f40717c)) - ((long) c13117a4.m36701k()), c13117a4.m36701k()));
                                        i47++;
                                        i18 = i49;
                                        s14 = 2192;
                                        s13 = 2816;
                                        i45 = 8;
                                    }
                                    arrayList2.add(new C12195o((length - ((long) c12196p.f40717c)) - ((long) c13117a4.m36701k()), c13117a4.m36701k()));
                                    i47++;
                                    i18 = i49;
                                    s14 = 2192;
                                    s13 = 2816;
                                    i45 = 8;
                                }
                                if (arrayList2.isEmpty()) {
                                    c33650s.f140436a = 0L;
                                } else {
                                    c12196p.f40716b = 3;
                                    c33650s.f140436a = ((C12195o) arrayList2.get(0)).f40711a;
                                }
                            } else {
                                if (i44 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position2 = interfaceC37368j.getPosition();
                                int length2 = (int) ((interfaceC37368j.getLength() - interfaceC37368j.getPosition()) - ((long) c12196p.f40717c));
                                C13117a c13117a5 = new C13117a(length2);
                                interfaceC37368j.readFully(c13117a5.f45381a, 0, length2);
                                int i56 = 0;
                                while (i56 < arrayList2.size()) {
                                    C12195o c12195o = (C12195o) arrayList2.get(i56);
                                    c13117a5.m36689K((int) (c12195o.f40711a - position2));
                                    c13117a5.m36690L(i17);
                                    int iM36701k = c13117a5.m36701k();
                                    Charset charset = AbstractC39717d.f170958c;
                                    String strM36712v = c13117a5.m36712v(iM36701k, charset);
                                    switch (strM36712v.hashCode()) {
                                        case -1711564334:
                                            if (strM36712v.equals("SlowMotion_Data")) {
                                                b = 0;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m15562a(null, "Invalid SEF name");
                                            }
                                            i14 = c12195o.f40712b - (iM36701k + 8);
                                            if (c3 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C12196p.f40714e.m1707w(c13117a5.m36712v(i14, charset));
                                                for (i15 = 0; i15 < listM1707w.size(); i15++) {
                                                    listM1707w2 = C12196p.f40713d.m1707w((CharSequence) listM1707w.get(i15));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m15562a(null, null);
                                                    }
                                                    try {
                                                        arrayList.add(new C28042c(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                    } catch (NumberFormatException e5) {
                                                        throw ParserException.m15562a(e5, null);
                                                    }
                                                }
                                                this.f40694g.add(new C28043d(arrayList));
                                            } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i56++;
                                            i17 = 4;
                                            break;
                                        case -1332107749:
                                            if (strM36712v.equals("Super_SlowMotion_Edit_Data")) {
                                                b = 1;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m15562a(null, "Invalid SEF name");
                                            }
                                            i14 = c12195o.f40712b - (iM36701k + 8);
                                            if (c3 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C12196p.f40714e.m1707w(c13117a5.m36712v(i14, charset));
                                                while (i15 < listM1707w.size()) {
                                                    listM1707w2 = C12196p.f40713d.m1707w((CharSequence) listM1707w.get(i15));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m15562a(null, null);
                                                    }
                                                    arrayList.add(new C28042c(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f40694g.add(new C28043d(arrayList));
                                            } else if (c3 != 2816) {
                                                continue;
                                            }
                                            i56++;
                                            i17 = 4;
                                            break;
                                        case -1251387154:
                                            if (strM36712v.equals("Super_SlowMotion_Data")) {
                                                b = 2;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m15562a(null, "Invalid SEF name");
                                            }
                                            i14 = c12195o.f40712b - (iM36701k + 8);
                                            if (c3 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C12196p.f40714e.m1707w(c13117a5.m36712v(i14, charset));
                                                while (i15 < listM1707w.size()) {
                                                    listM1707w2 = C12196p.f40713d.m1707w((CharSequence) listM1707w.get(i15));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m15562a(null, null);
                                                    }
                                                    arrayList.add(new C28042c(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f40694g.add(new C28043d(arrayList));
                                            } else if (c3 != 2816) {
                                                continue;
                                            }
                                            i56++;
                                            i17 = 4;
                                            break;
                                        case -830665521:
                                            if (strM36712v.equals("Super_SlowMotion_Deflickering_On")) {
                                                b = 3;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m15562a(null, "Invalid SEF name");
                                            }
                                            i14 = c12195o.f40712b - (iM36701k + 8);
                                            if (c3 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C12196p.f40714e.m1707w(c13117a5.m36712v(i14, charset));
                                                while (i15 < listM1707w.size()) {
                                                    listM1707w2 = C12196p.f40713d.m1707w((CharSequence) listM1707w.get(i15));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m15562a(null, null);
                                                    }
                                                    arrayList.add(new C28042c(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f40694g.add(new C28043d(arrayList));
                                            } else if (c3 != 2816) {
                                                continue;
                                            }
                                            i56++;
                                            i17 = 4;
                                            break;
                                        case 1760745220:
                                            if (strM36712v.equals("Super_SlowMotion_BGM")) {
                                                b = 4;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.m15562a(null, "Invalid SEF name");
                                            }
                                            i14 = c12195o.f40712b - (iM36701k + 8);
                                            if (c3 != 2192) {
                                                arrayList = new ArrayList();
                                                listM1707w = C12196p.f40714e.m1707w(c13117a5.m36712v(i14, charset));
                                                while (i15 < listM1707w.size()) {
                                                    listM1707w2 = C12196p.f40713d.m1707w((CharSequence) listM1707w.get(i15));
                                                    if (listM1707w2.size() == 3) {
                                                        throw ParserException.m15562a(null, null);
                                                    }
                                                    arrayList.add(new C28042c(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                                }
                                                this.f40694g.add(new C28043d(arrayList));
                                            } else if (c3 != 2816) {
                                                continue;
                                            }
                                            i56++;
                                            i17 = 4;
                                            break;
                                    }
                                    b = -1;
                                    switch (b) {
                                        case 0:
                                            c3 = 2192;
                                            break;
                                        case 1:
                                            c3 = 2819;
                                            break;
                                        case 2:
                                            c3 = 2816;
                                            break;
                                        case 3:
                                            c3 = 2820;
                                            break;
                                        case 4:
                                            c3 = 2817;
                                            break;
                                        default:
                                            throw ParserException.m15562a(null, "Invalid SEF name");
                                    }
                                    i14 = c12195o.f40712b - (iM36701k + 8);
                                    if (c3 != 2192) {
                                        arrayList = new ArrayList();
                                        listM1707w = C12196p.f40714e.m1707w(c13117a5.m36712v(i14, charset));
                                        while (i15 < listM1707w.size()) {
                                            listM1707w2 = C12196p.f40713d.m1707w((CharSequence) listM1707w.get(i15));
                                            if (listM1707w2.size() == 3) {
                                                throw ParserException.m15562a(null, null);
                                            }
                                            arrayList.add(new C28042c(Long.parseLong((String) listM1707w2.get(0)), Long.parseLong((String) listM1707w2.get(1)), 1 << (Integer.parseInt((String) listM1707w2.get(2)) - 1)));
                                        }
                                        this.f40694g.add(new C28043d(arrayList));
                                    } else if (c3 != 2816) {
                                        continue;
                                    }
                                    i56++;
                                    i17 = 4;
                                }
                                c33650s.f140436a = 0L;
                            }
                        } else {
                            C13117a c13117a6 = new C13117a(8);
                            interfaceC37368j.readFully(c13117a6.f45381a, 0, 8);
                            c12196p.f40717c = c13117a6.m36701k() + 8;
                            if (c13117a6.m36699i() != 1397048916) {
                                c33650s.f140436a = 0L;
                            } else {
                                c33650s.f140436a = interfaceC37368j.getPosition() - ((long) (c12196p.f40717c - 12));
                                c12196p.f40716b = 2;
                            }
                        }
                        i13 = 1;
                    } else {
                        long length3 = interfaceC37368j.getLength();
                        c33650s.f140436a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                        i13 = 1;
                        c12196p.f40716b = 1;
                    }
                    if (c33650s.f140436a != 0) {
                        return i13;
                    }
                    this.f40695h = 0;
                    this.f40698k = 0;
                    return i13;
                }
                long j25 = this.f40697j - ((long) this.f40698k);
                long position3 = interfaceC37368j.getPosition() + j25;
                C13117a c13117a7 = this.f40699l;
                if (c13117a7 != null) {
                    interfaceC37368j.readFully(c13117a7.f45381a, this.f40698k, (int) j25);
                    if (this.f40696i == 1718909296) {
                        c13117a7.m36689K(8);
                        int iM36699i2 = c13117a7.m36699i();
                        int i57 = iM36699i2 != 1751476579 ? iM36699i2 != 1903435808 ? 0 : 1 : 2;
                        if (i57 == 0) {
                            c13117a7.m36690L(4);
                            do {
                                if (c13117a7.m36692a() <= 0) {
                                    i57 = 0;
                                    break;
                                }
                                int iM36699i3 = c13117a7.m36699i();
                                i57 = iM36699i3 != 1751476579 ? iM36699i3 != 1903435808 ? 0 : 1 : 2;
                            } while (i57 == 0);
                        }
                        this.f40709v = i57;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C12181a) arrayDeque.peek()).f40609z.add(new C12182b(this.f40696i, c13117a7));
                    }
                } else {
                    if (j25 < 262144) {
                        interfaceC37368j.mo3100n((int) j25);
                    } else {
                        c33650s.f140436a = interfaceC37368j.getPosition() + j25;
                        z4 = true;
                    }
                    m33816j(position3);
                    if (z4 && this.f40695h != 2) {
                        return 1;
                    }
                }
                z4 = false;
                m33816j(position3);
                if (z4) {
                    continue;
                }
            } else {
                int i58 = this.f40698k;
                C13117a c13117a8 = this.f40691d;
                if (i58 == 0) {
                    if (!interfaceC37368j.mo3094f(c13117a8.f45381a, 0, 8, true)) {
                        return -1;
                    }
                    this.f40698k = 8;
                    c13117a8.m36689K(0);
                    this.f40697j = c13117a8.m36716z();
                    this.f40696i = c13117a8.m36699i();
                }
                long j26 = this.f40697j;
                if (j26 == 1) {
                    interfaceC37368j.readFully(c13117a8.f45381a, 8, 8);
                    this.f40698k += 8;
                    this.f40697j = c13117a8.m36681C();
                } else if (j26 == 0) {
                    long length4 = interfaceC37368j.getLength();
                    if (length4 == -1 && (c12181a = (C12181a) arrayDeque.peek()) != null) {
                        length4 = c12181a.f40608y;
                    }
                    if (length4 != -1) {
                        this.f40697j = (length4 - interfaceC37368j.getPosition()) + ((long) this.f40698k);
                    }
                }
                long j27 = this.f40697j;
                int i59 = this.f40698k;
                if (j27 < i59) {
                    throw ParserException.m15564c("Atom size less than header length (unsupported).");
                }
                int i64 = this.f40696i;
                if (i64 == 1836019574 || i64 == 1953653099 || i64 == 1835297121 || i64 == 1835626086 || i64 == 1937007212 || i64 == 1701082227 || i64 == 1835365473) {
                    long position4 = interfaceC37368j.getPosition();
                    long j28 = this.f40697j;
                    long j29 = this.f40698k;
                    long j34 = (position4 + j28) - j29;
                    if (j28 != j29 && this.f40696i == 1835365473) {
                        c13117a.m36686H(8);
                        interfaceC37368j.mo3103p(c13117a.f45381a, 0, 8);
                        byte[] bArr3 = AbstractC12186f.f40627a;
                        int i65 = c13117a.f45382b;
                        c13117a.m36690L(4);
                        if (c13117a.m36699i() != 1751411826) {
                            i65 += 4;
                        }
                        c13117a.m36689K(i65);
                        interfaceC37368j.mo3100n(c13117a.f45382b);
                        interfaceC37368j.mo3093e();
                    }
                    arrayDeque.push(new C12181a(this.f40696i, j34));
                    if (this.f40697j == this.f40698k) {
                        m33816j(j34);
                    } else {
                        this.f40695h = 0;
                        this.f40698k = 0;
                    }
                } else if (i64 == 1835296868 || i64 == 1836476516 || i64 == 1751411826 || i64 == 1937011556 || i64 == 1937011827 || i64 == 1937011571 || i64 == 1668576371 || i64 == 1701606260 || i64 == 1937011555 || i64 == 1937011578 || i64 == 1937013298 || i64 == 1937007471 || i64 == 1668232756 || i64 == 1953196132 || i64 == 1718909296 || i64 == 1969517665 || i64 == 1801812339 || i64 == 1768715124) {
                    AbstractC24543a.m71573i(i59 == 8);
                    AbstractC24543a.m71573i(this.f40697j <= 2147483647L);
                    C13117a c13117a9 = new C13117a((int) this.f40697j);
                    System.arraycopy(c13117a8.f45381a, 0, c13117a9.f45381a, 0, 8);
                    this.f40699l = c13117a9;
                    this.f40695h = 1;
                } else {
                    long position5 = interfaceC37368j.getPosition();
                    long j35 = this.f40698k;
                    long j36 = position5 - j35;
                    if (this.f40696i == 1836086884) {
                        new C28041b(0L, j36, -9223372036854775807L, j36 + j35, this.f40697j - j35);
                    }
                    this.f40699l = null;
                    this.f40695h = 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02ae A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:38:0x00c4, B:40:0x00ca, B:42:0x00d0, B:45:0x00d8, B:46:0x00df, B:51:0x00f5, B:56:0x0104, B:59:0x0110, B:62:0x011e, B:65:0x012b, B:68:0x0135, B:71:0x0141, B:74:0x014d, B:77:0x0159, B:80:0x0165, B:83:0x0172, B:86:0x017f, B:89:0x018d, B:92:0x019c, B:95:0x01a9, B:99:0x01ba, B:101:0x01be, B:103:0x01d3, B:106:0x01df, B:110:0x01ee, B:118:0x0204, B:157:0x029e, B:159:0x02ae, B:161:0x02b9, B:160:0x02b3, B:125:0x022e, B:138:0x0250, B:141:0x025c, B:144:0x0268, B:147:0x0274, B:150:0x0280, B:153:0x028c, B:156:0x0296, B:163:0x02c1, B:164:0x02c9), top: B:337:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b3 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:38:0x00c4, B:40:0x00ca, B:42:0x00d0, B:45:0x00d8, B:46:0x00df, B:51:0x00f5, B:56:0x0104, B:59:0x0110, B:62:0x011e, B:65:0x012b, B:68:0x0135, B:71:0x0141, B:74:0x014d, B:77:0x0159, B:80:0x0165, B:83:0x0172, B:86:0x017f, B:89:0x018d, B:92:0x019c, B:95:0x01a9, B:99:0x01ba, B:101:0x01be, B:103:0x01d3, B:106:0x01df, B:110:0x01ee, B:118:0x0204, B:157:0x029e, B:159:0x02ae, B:161:0x02b9, B:160:0x02b3, B:125:0x022e, B:138:0x0250, B:141:0x025c, B:144:0x0268, B:147:0x0274, B:150:0x0280, B:153:0x028c, B:156:0x0296, B:163:0x02c1, B:164:0x02c9), top: B:337:0x00c4 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:275:0x057a A[PHI: r0
      0x057a: PHI (r0v11 in.c) = (r0v4 in.c), (r0v4 in.c), (r0v6 in.c), (r0v4 in.c) binds: [B:277:0x057e, B:278:0x0580, B:378:0x057a, B:273:0x0573] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    /* JADX INFO: renamed from: j */
    public final void m33816j(long j7) throws ParserException {
        ArrayDeque arrayDeque;
        int i13;
        C18715c c18715c;
        C18715c c18715c2;
        C18715c c18715c3;
        C12181a c12181a;
        C37371m c37371m;
        C18715c c18715c4;
        int i14;
        C18715c c18715c5;
        InterfaceC18714b[] interfaceC18714bArr;
        C18715c c18715c6;
        int i15;
        int i16;
        C18715c c18715c7;
        C12181a c12181a2;
        C28040a c28040a;
        ArrayDeque arrayDeque2;
        int i17;
        ArrayDeque arrayDeque3;
        int i18;
        Parcelable parcelableM33812f;
        String strValueOf;
        String str;
        String str2;
        while (true) {
            ArrayDeque arrayDeque4 = this.f40692e;
            if (arrayDeque4.isEmpty() || ((C12181a) arrayDeque4.peek()).f40608y != j7) {
                break;
            }
            C12181a c12181a3 = (C12181a) arrayDeque4.pop();
            if (c12181a3.f2052x == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z4 = this.f40709v == 1;
                C37371m c37371m2 = new C37371m();
                C12182b c12182bM33783p = c12181a3.m33783p(1969517665);
                int i19 = 1751411826;
                int i24 = 4;
                int i25 = 1768715124;
                int i26 = 1835365473;
                int i27 = 8;
                if (c12182bM33783p != null) {
                    byte[] bArr = AbstractC12186f.f40627a;
                    C13117a c13117a = c12182bM33783p.f40610y;
                    c13117a.m36689K(8);
                    C18715c c18715c8 = null;
                    C18715c c18715c9 = null;
                    while (c13117a.m36692a() >= i27) {
                        int i28 = c13117a.f45382b;
                        int iM36699i = c13117a.m36699i();
                        int iM36699i2 = c13117a.m36699i();
                        if (iM36699i2 == i26) {
                            c13117a.m36689K(i28);
                            int i29 = i28 + iM36699i;
                            c13117a.m36690L(i27);
                            int i34 = c13117a.f45382b;
                            c13117a.m36690L(i24);
                            if (c13117a.m36699i() != i19) {
                                i34 += 4;
                            }
                            c13117a.m36689K(i34);
                            while (true) {
                                int i35 = c13117a.f45382b;
                                if (i35 < i29) {
                                    int iM36699i3 = c13117a.m36699i();
                                    if (c13117a.m36699i() == i25) {
                                        c13117a.m36689K(i35);
                                        int i36 = i35 + iM36699i3;
                                        c13117a.m36690L(i27);
                                        ArrayList arrayList2 = new ArrayList();
                                        while (true) {
                                            int i37 = c13117a.f45382b;
                                            if (i37 >= i36) {
                                                break;
                                            }
                                            int iM36699i4 = c13117a.m36699i() + i37;
                                            int iM36699i5 = c13117a.m36699i();
                                            int i38 = i27;
                                            int i39 = (iM36699i5 >> 24) & 255;
                                            if (i39 == 169 || i39 == 253) {
                                                arrayDeque3 = arrayDeque4;
                                                i18 = i36;
                                                int i44 = 16777215 & iM36699i5;
                                                if (i44 == 6516084) {
                                                    parcelableM33812f = AbstractC12191k.m33808b(iM36699i5, c13117a);
                                                } else if (i44 == 7233901 || i44 == 7631467) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TIT2");
                                                } else if (i44 == 6516589 || i44 == 7828084) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TCOM");
                                                } else if (i44 == 6578553) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TDRC");
                                                } else if (i44 == 4280916) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TPE1");
                                                } else if (i44 == 7630703) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TSSE");
                                                } else if (i44 == 6384738) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TALB");
                                                } else if (i44 == 7108978) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "USLT");
                                                } else if (i44 == 6776174) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TCON");
                                                } else if (i44 == 6779504) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TIT1");
                                                } else {
                                                    strValueOf = String.valueOf(AbstractC0576a.m1492c(iM36699i5));
                                                    if (strValueOf.length() != 0) {
                                                        str = "Skipped unknown metadata entry: ".concat(strValueOf);
                                                    } else {
                                                        str = new String("Skipped unknown metadata entry: ");
                                                    }
                                                    Log.d("MetadataUtil", str);
                                                    c13117a.m36689K(iM36699i4);
                                                    parcelableM33812f = null;
                                                }
                                                c13117a.m36689K(iM36699i4);
                                            } else {
                                                if (iM36699i5 == 1735291493) {
                                                    try {
                                                        int iM33814h = AbstractC12191k.m33814h(c13117a);
                                                        if (iM33814h > 0) {
                                                            String[] strArr = AbstractC12191k.f40681a;
                                                            if (iM33814h <= 192) {
                                                                str2 = strArr[iM33814h - 1];
                                                            } else {
                                                                str2 = null;
                                                            }
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        if (str2 != null) {
                                                            parcelableM33812f = new C26862m("TCON", null, str2);
                                                        } else {
                                                            Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                            parcelableM33812f = null;
                                                        }
                                                    } catch (Throwable th3) {
                                                        c13117a.m36689K(iM36699i4);
                                                        throw th3;
                                                    }
                                                } else if (iM36699i5 == 1684632427) {
                                                    parcelableM33812f = AbstractC12191k.m33810d(iM36699i5, c13117a, "TPOS");
                                                } else if (iM36699i5 == 1953655662) {
                                                    parcelableM33812f = AbstractC12191k.m33810d(iM36699i5, c13117a, "TRCK");
                                                } else if (iM36699i5 == 1953329263) {
                                                    parcelableM33812f = AbstractC12191k.m33813g(iM36699i5, "TBPM", c13117a, true, false);
                                                } else if (iM36699i5 == 1668311404) {
                                                    parcelableM33812f = AbstractC12191k.m33813g(iM36699i5, "TCMP", c13117a, true, true);
                                                } else if (iM36699i5 == 1668249202) {
                                                    parcelableM33812f = AbstractC12191k.m33809c(c13117a);
                                                } else if (iM36699i5 == 1631670868) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TPE2");
                                                } else if (iM36699i5 == 1936682605) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TSOT");
                                                } else if (iM36699i5 == 1936679276) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TSO2");
                                                } else if (iM36699i5 == 1936679282) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TSOA");
                                                } else if (iM36699i5 == 1936679265) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TSOP");
                                                } else if (iM36699i5 == 1936679791) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TSOC");
                                                } else if (iM36699i5 == 1920233063) {
                                                    parcelableM33812f = AbstractC12191k.m33813g(iM36699i5, "ITUNESADVISORY", c13117a, false, false);
                                                } else if (iM36699i5 == 1885823344) {
                                                    parcelableM33812f = AbstractC12191k.m33813g(iM36699i5, "ITUNESGAPLESS", c13117a, false, true);
                                                } else if (iM36699i5 == 1936683886) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TVSHOWSORT");
                                                } else if (iM36699i5 == 1953919848) {
                                                    parcelableM33812f = AbstractC12191k.m33812f(iM36699i5, c13117a, "TVSHOW");
                                                } else if (iM36699i5 == 757935405) {
                                                    String strM36709s = null;
                                                    String strM36709s2 = null;
                                                    int i45 = -1;
                                                    int i46 = -1;
                                                    while (true) {
                                                        int i47 = c13117a.f45382b;
                                                        if (i47 >= iM36699i4) {
                                                            break;
                                                        }
                                                        int iM36699i6 = c13117a.m36699i();
                                                        ArrayDeque arrayDeque5 = arrayDeque4;
                                                        int iM36699i7 = c13117a.m36699i();
                                                        int i48 = i36;
                                                        c13117a.m36690L(4);
                                                        if (iM36699i7 == 1835360622) {
                                                            strM36709s = c13117a.m36709s(iM36699i6 - 12);
                                                        } else if (iM36699i7 == 1851878757) {
                                                            strM36709s2 = c13117a.m36709s(iM36699i6 - 12);
                                                        } else {
                                                            if (iM36699i7 == 1684108385) {
                                                                i45 = i47;
                                                                i46 = iM36699i6;
                                                            }
                                                            c13117a.m36690L(iM36699i6 - 12);
                                                        }
                                                        arrayDeque4 = arrayDeque5;
                                                        i36 = i48;
                                                    }
                                                    arrayDeque3 = arrayDeque4;
                                                    i18 = i36;
                                                    if (strM36709s == null || strM36709s2 == null || i45 == -1) {
                                                        parcelableM33812f = null;
                                                    } else {
                                                        c13117a.m36689K(i45);
                                                        c13117a.m36690L(16);
                                                        parcelableM33812f = new C26859j(strM36709s, strM36709s2, c13117a.m36709s(i46 - 16));
                                                    }
                                                    c13117a.m36689K(iM36699i4);
                                                } else {
                                                    arrayDeque3 = arrayDeque4;
                                                    i18 = i36;
                                                    strValueOf = String.valueOf(AbstractC0576a.m1492c(iM36699i5));
                                                    if (strValueOf.length() != 0) {
                                                        str = "Skipped unknown metadata entry: ".concat(strValueOf);
                                                    } else {
                                                        str = new String("Skipped unknown metadata entry: ");
                                                    }
                                                    Log.d("MetadataUtil", str);
                                                    c13117a.m36689K(iM36699i4);
                                                    parcelableM33812f = null;
                                                }
                                                c13117a.m36689K(iM36699i4);
                                                arrayDeque3 = arrayDeque4;
                                                i18 = i36;
                                            }
                                            if (parcelableM33812f != null) {
                                                arrayList2.add(parcelableM33812f);
                                            }
                                            i27 = i38;
                                            arrayDeque4 = arrayDeque3;
                                            i36 = i18;
                                        }
                                        arrayDeque2 = arrayDeque4;
                                        i17 = i27;
                                        if (!arrayList2.isEmpty()) {
                                            c18715c8 = new C18715c(arrayList2);
                                            break;
                                        }
                                    } else {
                                        c13117a.m36689K(i35 + iM36699i3);
                                        i25 = 1768715124;
                                    }
                                } else {
                                    arrayDeque2 = arrayDeque4;
                                    i17 = i27;
                                }
                                c18715c8 = null;
                                break;
                            }
                        } else {
                            arrayDeque2 = arrayDeque4;
                            i17 = i27;
                            if (iM36699i2 == 1936553057) {
                                c13117a.m36689K(i28);
                                int i49 = i28 + iM36699i;
                                c13117a.m36690L(12);
                                while (true) {
                                    int i54 = c13117a.f45382b;
                                    if (i54 < i49) {
                                        int iM36699i8 = c13117a.m36699i();
                                        if (c13117a.m36699i() != 1935766900) {
                                            c13117a.m36689K(i54 + iM36699i8);
                                        } else if (iM36699i8 >= 14) {
                                            c13117a.m36690L(5);
                                            int iM36715y = c13117a.m36715y();
                                            if (iM36715y == 12 || iM36715y == 13) {
                                                float f13 = iM36715y == 12 ? 240.0f : 120.0f;
                                                c13117a.m36690L(1);
                                                c18715c9 = new C18715c(new C28044e(f13, c13117a.m36715y()));
                                                break;
                                            }
                                        }
                                    }
                                    c18715c9 = null;
                                    break;
                                }
                            }
                        }
                        c13117a.m36689K(i28 + iM36699i);
                        i27 = i17;
                        arrayDeque4 = arrayDeque2;
                        i26 = 1835365473;
                        i19 = 1751411826;
                        i24 = 4;
                        i25 = 1768715124;
                    }
                    arrayDeque = arrayDeque4;
                    i13 = i27;
                    Pair pairCreate = Pair.create(c18715c8, c18715c9);
                    c18715c2 = (C18715c) pairCreate.first;
                    c18715c = (C18715c) pairCreate.second;
                    if (c18715c2 != null) {
                        c37371m2.m119654b(c18715c2);
                    }
                    i26 = 1835365473;
                } else {
                    arrayDeque = arrayDeque4;
                    i13 = 8;
                    c18715c = null;
                    c18715c2 = null;
                }
                C12181a c12181aM33782o = c12181a3.m33782o(i26);
                if (c12181aM33782o != null) {
                    byte[] bArr2 = AbstractC12186f.f40627a;
                    C12182b c12182bM33783p2 = c12181aM33782o.m33783p(1751411826);
                    C12182b c12182bM33783p3 = c12181aM33782o.m33783p(1801812339);
                    C12182b c12182bM33783p4 = c12181aM33782o.m33783p(1768715124);
                    if (c12182bM33783p2 == null || c12182bM33783p3 == null || c12182bM33783p4 == null) {
                        c18715c3 = c18715c2;
                        c12181a = c12181a3;
                        c37371m = c37371m2;
                        c18715c4 = null;
                    } else {
                        C13117a c13117a2 = c12182bM33783p2.f40610y;
                        c13117a2.m36689K(16);
                        if (c13117a2.m36699i() != 1835299937) {
                            c18715c3 = c18715c2;
                            c12181a = c12181a3;
                            c37371m = c37371m2;
                        } else {
                            C13117a c13117a3 = c12182bM33783p3.f40610y;
                            c13117a3.m36689K(12);
                            int iM36699i9 = c13117a3.m36699i();
                            String[] strArr2 = new String[iM36699i9];
                            for (int i55 = 0; i55 < iM36699i9; i55++) {
                                int iM36699i10 = c13117a3.m36699i();
                                c13117a3.m36690L(4);
                                strArr2[i55] = c13117a3.m36712v(iM36699i10 - 8, AbstractC39717d.f170958c);
                            }
                            C13117a c13117a4 = c12182bM33783p4.f40610y;
                            int i56 = i13;
                            c13117a4.m36689K(i56);
                            ArrayList arrayList3 = new ArrayList();
                            while (c13117a4.m36692a() > i56) {
                                int i57 = c13117a4.f45382b;
                                int iM36699i11 = c13117a4.m36699i();
                                int iM36699i12 = c13117a4.m36699i() - 1;
                                if (iM36699i12 < 0 || iM36699i12 >= iM36699i9) {
                                    c18715c7 = c18715c2;
                                    c12181a2 = c12181a3;
                                    c37371m2 = c37371m2;
                                    AbstractC30007c.m91850t(52, iM36699i12, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str3 = strArr2[iM36699i12];
                                    int i58 = i57 + iM36699i11;
                                    while (true) {
                                        int i59 = c13117a4.f45382b;
                                        if (i59 >= i58) {
                                            c18715c7 = c18715c2;
                                            c12181a2 = c12181a3;
                                            c28040a = null;
                                            break;
                                        }
                                        int iM36699i13 = c13117a4.m36699i();
                                        c18715c7 = c18715c2;
                                        c12181a2 = c12181a3;
                                        if (c13117a4.m36699i() == 1684108385) {
                                            int iM36699i14 = c13117a4.m36699i();
                                            int iM36699i15 = c13117a4.m36699i();
                                            int i64 = iM36699i13 - 16;
                                            byte[] bArr3 = new byte[i64];
                                            c13117a4.m36697g(bArr3, 0, i64);
                                            c28040a = new C28040a(str3, bArr3, iM36699i15, iM36699i14);
                                            break;
                                        }
                                        c13117a4.m36689K(i59 + iM36699i13);
                                        c18715c2 = c18715c7;
                                        c12181a3 = c12181a2;
                                    }
                                    if (c28040a != null) {
                                        arrayList3.add(c28040a);
                                    }
                                }
                                c13117a4.m36689K(i57 + iM36699i11);
                                c18715c2 = c18715c7;
                                c12181a3 = c12181a2;
                                c37371m2 = c37371m2;
                                i56 = 8;
                            }
                            c18715c3 = c18715c2;
                            c12181a = c12181a3;
                            c37371m = c37371m2;
                            if (!arrayList3.isEmpty()) {
                                c18715c4 = new C18715c(arrayList3);
                            }
                        }
                        c18715c4 = null;
                    }
                } else {
                    c18715c3 = c18715c2;
                    c12181a = c12181a3;
                    c37371m = c37371m2;
                    c18715c4 = null;
                }
                C37371m c37371m3 = c37371m;
                ArrayList arrayListM33799e = AbstractC12186f.m33799e(c12181a, c37371m3, -9223372036854775807L, null, false, z4, new C5538l(20));
                InterfaceC37369k interfaceC37369k = this.f40704q;
                interfaceC37369k.getClass();
                int size = arrayListM33799e.size();
                int size2 = -1;
                int i65 = 0;
                long j13 = -9223372036854775807L;
                while (i65 < size) {
                    C12200t c12200t = (C12200t) arrayListM33799e.get(i65);
                    int i66 = c12200t.f40752b;
                    int i67 = c12200t.f40755e;
                    if (i66 == 0) {
                        c18715c5 = c18715c;
                        c18715c6 = c18715c4;
                    } else {
                        C12197q c12197q = c12200t.f40751a;
                        long j14 = c12197q.f40722e;
                        C31521c0 c31521c0 = c12197q.f40723f;
                        int i68 = c12197q.f40719b;
                        if (j14 == -9223372036854775807L) {
                            j14 = c12200t.f40758h;
                        }
                        long jMax = Math.max(j13, j14);
                        C12192l c12192l = new C12192l(c12197q, c12200t, interfaceC37369k.mo3102o(i65, i68));
                        int i69 = "audio/true-hd".equals(c31521c0.f130077L) ? i67 * 16 : i67 + 30;
                        C31518b0 c31518b0M97113a = c31521c0.m97113a();
                        c31518b0M97113a.f130048l = i69;
                        if (i68 != 2 || j14 <= 0) {
                            i14 = 1;
                        } else {
                            int i74 = c12200t.f40752b;
                            i14 = 1;
                            if (i74 > 1) {
                                c31518b0M97113a.f130054r = i74 / (j14 / 1000000.0f);
                            }
                        }
                        if (i68 == i14 && (i15 = c37371m3.f159861a) != -1 && (i16 = c37371m3.f159862b) != -1) {
                            c31518b0M97113a.f130033A = i15;
                            c31518b0M97113a.f130034B = i16;
                        }
                        ArrayList arrayList4 = this.f40694g;
                        C18715c[] c18715cArr = {c18715c, arrayList4.isEmpty() ? null : new C18715c(arrayList4)};
                        C18715c c18715c10 = new C18715c(new InterfaceC18714b[0]);
                        if (i68 != 1) {
                            if (i68 != 2 || c18715c4 == null) {
                                c18715c5 = c18715c;
                                break;
                            }
                            int i75 = 0;
                            while (true) {
                                InterfaceC18714b[] interfaceC18714bArr2 = c18715c4.f73525w;
                                if (i75 >= interfaceC18714bArr2.length) {
                                    c18715c5 = c18715c;
                                    break;
                                }
                                InterfaceC18714b interfaceC18714b = interfaceC18714bArr2[i75];
                                if (interfaceC18714b instanceof C28040a) {
                                    C28040a c28040a2 = (C28040a) interfaceC18714b;
                                    c18715c5 = c18715c;
                                    if ("com.android.capture.fps".equals(c28040a2.f113168w)) {
                                        c18715c10 = new C18715c(c28040a2);
                                        break;
                                    }
                                } else {
                                    c18715c5 = c18715c;
                                }
                                i75++;
                                c18715c = c18715c5;
                            }
                        } else if (c18715c3 == null) {
                            c18715c5 = c18715c;
                            break;
                        } else {
                            c18715c5 = c18715c;
                            c18715c10 = c18715c3;
                        }
                        int i76 = 0;
                        while (true) {
                            interfaceC18714bArr = c18715c10.f73525w;
                            if (i76 >= 2) {
                                break;
                            }
                            C18715c c18715c11 = c18715cArr[i76];
                            if (c18715c11 != null) {
                                InterfaceC18714b[] interfaceC18714bArr3 = c18715c11.f73525w;
                                if (interfaceC18714bArr3.length != 0) {
                                    int i77 = AbstractC24567y.f95875a;
                                    Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr, interfaceC18714bArr.length + interfaceC18714bArr3.length);
                                    System.arraycopy(interfaceC18714bArr3, 0, objArrCopyOf, interfaceC18714bArr.length, interfaceC18714bArr3.length);
                                    c18715c10 = new C18715c((InterfaceC18714b[]) objArrCopyOf);
                                }
                            }
                            i76++;
                            c18715c4 = c18715c4;
                        }
                        c18715c6 = c18715c4;
                        if (interfaceC18714bArr.length > 0) {
                            c31518b0M97113a.f130045i = c18715c10;
                        }
                        c12192l.f40685c.mo102730a(new C31521c0(c31518b0M97113a));
                        if (i68 == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(c12192l);
                        j13 = jMax;
                    }
                    i65++;
                    c18715c = c18715c5;
                    arrayListM33799e = arrayListM33799e;
                    size = size;
                    c18715c4 = c18715c6;
                }
                long j15 = 0;
                this.f40707t = size2;
                this.f40708u = j13;
                C12192l[] c12192lArr = (C12192l[]) arrayList.toArray(new C12192l[0]);
                this.f40705r = c12192lArr;
                long[][] jArr = new long[c12192lArr.length][];
                int[] iArr = new int[c12192lArr.length];
                long[] jArr2 = new long[c12192lArr.length];
                boolean[] zArr = new boolean[c12192lArr.length];
                for (int i78 = 0; i78 < c12192lArr.length; i78++) {
                    jArr[i78] = new long[c12192lArr[i78].f40684b.f40752b];
                    jArr2[i78] = c12192lArr[i78].f40684b.f40756f[0];
                }
                int i79 = 0;
                while (i79 < c12192lArr.length) {
                    long j16 = Long.MAX_VALUE;
                    int i83 = -1;
                    for (int i84 = 0; i84 < c12192lArr.length; i84++) {
                        if (!zArr[i84]) {
                            long j17 = jArr2[i84];
                            if (j17 <= j16) {
                                i83 = i84;
                                j16 = j17;
                            }
                        }
                    }
                    int i85 = iArr[i83];
                    long[] jArr3 = jArr[i83];
                    jArr3[i85] = j15;
                    C12200t c12200t2 = c12192lArr[i83].f40684b;
                    j15 += (long) c12200t2.f40754d[i85];
                    int i86 = i85 + 1;
                    iArr[i83] = i86;
                    if (i86 < jArr3.length) {
                        jArr2[i83] = c12200t2.f40756f[i86];
                    } else {
                        zArr[i83] = true;
                        i79++;
                    }
                }
                this.f40706s = jArr;
                interfaceC37369k.mo3098l();
                interfaceC37369k.mo3111x(this);
                arrayDeque.clear();
                this.f40695h = 2;
            } else if (!arrayDeque4.isEmpty()) {
                ((C12181a) arrayDeque4.peek()).f40607E.add(c12181a3);
            }
        }
        if (this.f40695h != 2) {
            this.f40695h = 0;
            this.f40698k = 0;
        }
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
