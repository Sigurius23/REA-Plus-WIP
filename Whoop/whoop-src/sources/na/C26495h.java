package na;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.C2817b;
import p094dn.C12194n;
import p094dn.C12199s;
import p112e9.C12876o;
import p113ea.C12890a;
import p113ea.C12891b;
import p499t9.AbstractC33618a;
import p499t9.C33634i;
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
import p516u8.C34600k;
import p516u8.C34602l;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p641y8.AbstractC39319n;
import p641y8.C39308c;
import p641y8.C39309d;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.InterfaceC30105j;
import re.C31271g;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: na.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C26495h implements InterfaceC33644n {

    /* JADX INFO: renamed from: K */
    public static final byte[] f105225K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: L */
    public static final C34610p f105226L;

    /* JADX INFO: renamed from: A */
    public C26494g f105227A;

    /* JADX INFO: renamed from: B */
    public int f105228B;

    /* JADX INFO: renamed from: C */
    public int f105229C;

    /* JADX INFO: renamed from: D */
    public int f105230D;

    /* JADX INFO: renamed from: E */
    public boolean f105231E;

    /* JADX INFO: renamed from: F */
    public boolean f105232F;

    /* JADX INFO: renamed from: G */
    public InterfaceC33648q f105233G;

    /* JADX INFO: renamed from: H */
    public InterfaceC33639k0[] f105234H;

    /* JADX INFO: renamed from: I */
    public InterfaceC33639k0[] f105235I;

    /* JADX INFO: renamed from: J */
    public boolean f105236J;

    /* JADX INFO: renamed from: a */
    public final InterfaceC30105j f105237a;

    /* JADX INFO: renamed from: b */
    public final int f105238b;

    /* JADX INFO: renamed from: c */
    public final List f105239c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f105240d;

    /* JADX INFO: renamed from: e */
    public final C38059n f105241e;

    /* JADX INFO: renamed from: f */
    public final C38059n f105242f;

    /* JADX INFO: renamed from: g */
    public final C38059n f105243g;

    /* JADX INFO: renamed from: h */
    public final byte[] f105244h;

    /* JADX INFO: renamed from: i */
    public final C38059n f105245i;

    /* JADX INFO: renamed from: j */
    public final C12891b f105246j;

    /* JADX INFO: renamed from: k */
    public final C38059n f105247k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f105248l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f105249m;

    /* JADX INFO: renamed from: n */
    public final C31271g f105250n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC33639k0 f105251o;

    /* JADX INFO: renamed from: p */
    public C41060w0 f105252p;

    /* JADX INFO: renamed from: q */
    public int f105253q;

    /* JADX INFO: renamed from: r */
    public int f105254r;

    /* JADX INFO: renamed from: s */
    public long f105255s;

    /* JADX INFO: renamed from: t */
    public int f105256t;

    /* JADX INFO: renamed from: u */
    public C38059n f105257u;

    /* JADX INFO: renamed from: v */
    public long f105258v;

    /* JADX INFO: renamed from: w */
    public int f105259w;

    /* JADX INFO: renamed from: x */
    public long f105260x;

    /* JADX INFO: renamed from: y */
    public long f105261y;

    /* JADX INFO: renamed from: z */
    public long f105262z;

    static {
        C34608o c34608o = new C34608o();
        c34608o.f145741m = AbstractC34587d0.m109382o("application/x-emsg");
        f105226L = new C34610p(c34608o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26495h(InterfaceC30105j interfaceC30105j, int i13) {
        this(interfaceC30105j, i13, C41060w0.f177067E, null);
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
    }

    /* JADX INFO: renamed from: a */
    public static C34602l m78548a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            C39309d c39309d = (C39309d) list.get(i13);
            if (c39309d.f2052x == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c39309d.f169113y.f163017a;
                C12194n c12194nM78562j = AbstractC26501n.m78562j(bArr);
                UUID uuid = c12194nM78562j == null ? null : c12194nM78562j.f40710a;
                if (uuid == null) {
                    AbstractC38046a.m121826u("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C34600k(uuid, null, MimeType.MIME_TYPE_VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C34602l(null, false, (C34600k[]) arrayList.toArray(new C34600k[0]));
    }

    /* JADX INFO: renamed from: c */
    public static void m78549c(C38059n c38059n, int i13, C12199s c12199s) throws ParserException {
        c38059n.m121846F(i13 + 8);
        int iM121854g = c38059n.m121854g();
        byte[] bArr = AbstractC26490c.f105203a;
        if ((iM121854g & 1) != 0) {
            throw ParserException.m5051c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (iM121854g & 2) != 0;
        int iM121871x = c38059n.m121871x();
        if (iM121871x == 0) {
            Arrays.fill(c12199s.f40744k, 0, c12199s.f40737d, false);
            return;
        }
        int i14 = c12199s.f40737d;
        C38059n c38059n2 = (C38059n) c12199s.f40750q;
        if (iM121871x != i14) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(iM121871x, "Senc sample count ", " is different from fragment sample count");
            sbM30466t.append(c12199s.f40737d);
            throw ParserException.m5049a(null, sbM30466t.toString());
        }
        Arrays.fill(c12199s.f40744k, 0, iM121871x, z4);
        c38059n2.m121843C(c38059n.m121848a());
        c12199s.f40743j = true;
        c12199s.f40745l = true;
        c38059n.m121852e(c38059n2.f163017a, 0, c38059n2.f163019c);
        c38059n2.m121846F(0);
        c12199s.f40745l = false;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        SparseArray sparseArray = this.f105240d;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C26494g) sparseArray.valueAt(i13)).m78547f();
        }
        this.f105249m.clear();
        this.f105259w = 0;
        ((PriorityQueue) this.f105250n.f128788e).clear();
        this.f105260x = j13;
        this.f105248l.clear();
        this.f105253q = 0;
        this.f105256t = 0;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0393  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ce  */
    /* JADX INFO: renamed from: d */
    public final void m78550d(long j7) throws ParserException {
        C26491d c26491d;
        C26491d c26491d2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        int i17;
        while (true) {
            ArrayDeque arrayDeque = this.f105248l;
            if (arrayDeque.isEmpty() || ((C39308c) arrayDeque.peek()).f169111y != j7) {
                break;
            }
            C39308c c39308c = (C39308c) arrayDeque.pop();
            int i18 = c39308c.f2052x;
            ArrayList arrayList4 = c39308c.f169110E;
            ArrayList arrayList5 = c39308c.f169112z;
            int i19 = this.f105238b;
            int i24 = 12;
            SparseArray sparseArray = this.f105240d;
            if (i18 == 1836019574) {
                C34602l c34602lM78548a = m78548a(arrayList5);
                C39308c c39308cM125272o = c39308c.m125272o(1836475768);
                c39308cM125272o.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = c39308cM125272o.f169112z;
                int size = arrayList6.size();
                int i25 = 0;
                long jM121869v = -9223372036854775807L;
                while (i25 < size) {
                    C39309d c39309d = (C39309d) arrayList6.get(i25);
                    int i26 = c39309d.f2052x;
                    C38059n c38059n = c39309d.f169113y;
                    if (i26 == 1953654136) {
                        c38059n.m121846F(i24);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(c38059n.m121854g()), new C26491d(c38059n.m121854g() - 1, c38059n.m121854g(), c38059n.m121854g(), c38059n.m121854g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (C26491d) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i26 == 1835362404) {
                            c38059n.m121846F(8);
                            jM121869v = AbstractC26490c.m78536c(c38059n.m121854g()) == 0 ? c38059n.m121869v() : c38059n.m121872y();
                        }
                    }
                    i25++;
                    arrayList6 = arrayList;
                    i24 = 12;
                }
                int i27 = 1;
                ArrayList arrayListM78540g = AbstractC26490c.m78540g(c39308c, new C33655x(), jM121869v, c34602lM78548a, (i19 & 16) != 0, false, new C26492e(this));
                int size2 = arrayListM78540g.size();
                if (sparseArray.size() == 0) {
                    String strM78555c = AbstractC26501n.m78555c(arrayListM78540g);
                    int i28 = 0;
                    while (i28 < size2) {
                        C26504q c26504q = (C26504q) arrayListM78540g.get(i28);
                        C26502o c26502o = c26504q.f105328a;
                        InterfaceC33648q interfaceC33648q = this.f105233G;
                        int i29 = c26502o.f105312b;
                        int i34 = c26502o.f105311a;
                        InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(i28, i29);
                        interfaceC33639k0Mo3101o.getClass();
                        if (sparseArray2.size() == i27) {
                            c26491d = (C26491d) sparseArray2.valueAt(0);
                        } else {
                            c26491d = (C26491d) sparseArray2.get(i34);
                            c26491d.getClass();
                        }
                        sparseArray.put(i34, new C26494g(interfaceC33639k0Mo3101o, c26504q, c26491d, strM78555c));
                        this.f105261y = Math.max(this.f105261y, c26502o.f105315e);
                        i28++;
                        i27 = 1;
                    }
                    this.f105233G.mo3098l();
                } else {
                    AbstractC35849g.m113807i(sparseArray.size() == size2);
                    for (int i35 = 0; i35 < size2; i35++) {
                        C26504q c26504q2 = (C26504q) arrayListM78540g.get(i35);
                        C26502o c26502o2 = c26504q2.f105328a;
                        C26494g c26494g = (C26494g) sparseArray.get(c26502o2.f105311a);
                        int i36 = c26502o2.f105311a;
                        if (sparseArray2.size() == 1) {
                            c26491d2 = (C26491d) sparseArray2.valueAt(0);
                        } else {
                            c26491d2 = (C26491d) sparseArray2.get(i36);
                            c26491d2.getClass();
                        }
                        c26494g.m78546e(c26504q2, c26491d2);
                    }
                }
            } else {
                int i37 = i19;
                if (i18 == 1836019558) {
                    int size3 = arrayList4.size();
                    int i38 = 0;
                    while (i38 < size3) {
                        C39308c c39308c2 = (C39308c) arrayList4.get(i38);
                        if (c39308c2.f2052x == 1953653094) {
                            C39309d c39309dM125273p = c39308c2.m125273p(1952868452);
                            ArrayList arrayList7 = c39308c2.f169112z;
                            c39309dM125273p.getClass();
                            C38059n c38059n2 = c39309dM125273p.f169113y;
                            c38059n2.m121846F(8);
                            int iM121854g = c38059n2.m121854g();
                            byte[] bArr = AbstractC26490c.f105203a;
                            C26494g c26494g2 = (C26494g) sparseArray.get(c38059n2.m121854g());
                            if (c26494g2 == null) {
                                size3 = size3;
                                c26494g2 = null;
                            } else {
                                C12199s c12199s = c26494g2.f105213b;
                                if ((iM121854g & 1) != 0) {
                                    long jM121872y = c38059n2.m121872y();
                                    c12199s.f40734a = jM121872y;
                                    c12199s.f40735b = jM121872y;
                                }
                                C26491d c26491d3 = c26494g2.f105216e;
                                c12199s.f40748o = new C26491d((iM121854g & 2) != 0 ? c38059n2.m121854g() - 1 : c26491d3.f105204a, (iM121854g & 8) != 0 ? c38059n2.m121854g() : c26491d3.f105205b, (iM121854g & 16) != 0 ? c38059n2.m121854g() : c26491d3.f105206c, (iM121854g & 32) != 0 ? c38059n2.m121854g() : c26491d3.f105207d);
                            }
                            if (c26494g2 != null) {
                                C12199s c12199s2 = c26494g2.f105213b;
                                long j13 = c12199s2.f40746m;
                                boolean z13 = c12199s2.f40747n;
                                c26494g2.m78547f();
                                c26494g2.f105224m = true;
                                C39309d c39309dM125273p2 = c39308c2.m125273p(1952867444);
                                if (c39309dM125273p2 == null || (i37 & 2) != 0) {
                                    c12199s2.f40746m = j13;
                                    c12199s2.f40747n = z13;
                                } else {
                                    C38059n c38059n3 = c39309dM125273p2.f169113y;
                                    c38059n3.m121846F(8);
                                    c12199s2.f40746m = AbstractC26490c.m78536c(c38059n3.m121854g()) == 1 ? c38059n3.m121872y() : c38059n3.m121869v();
                                    c12199s2.f40747n = true;
                                }
                                int size4 = arrayList7.size();
                                int i39 = 0;
                                int i44 = 0;
                                int i45 = 0;
                                while (true) {
                                    i15 = 1953658222;
                                    if (i39 >= size4) {
                                        break;
                                    }
                                    C39309d c39309d2 = (C39309d) arrayList7.get(i39);
                                    int i46 = i39;
                                    if (c39309d2.f2052x == 1953658222) {
                                        C38059n c38059n4 = c39309d2.f169113y;
                                        c38059n4.m121846F(12);
                                        int iM121871x = c38059n4.m121871x();
                                        if (iM121871x > 0) {
                                            i45 += iM121871x;
                                            i44++;
                                        }
                                    }
                                    i39 = i46 + 1;
                                }
                                c26494g2.f105219h = 0;
                                c26494g2.f105218g = 0;
                                c26494g2.f105217f = 0;
                                c12199s2.f40736c = i44;
                                c12199s2.f40737d = i45;
                                if (c12199s2.f40739f.length < i44) {
                                    c12199s2.f40738e = new long[i44];
                                    c12199s2.f40739f = new int[i44];
                                }
                                if (c12199s2.f40740g.length < i45) {
                                    int i47 = (i45 * 125) / 100;
                                    c12199s2.f40740g = new int[i47];
                                    c12199s2.f40741h = new long[i47];
                                    c12199s2.f40742i = new boolean[i47];
                                    c12199s2.f40744k = new boolean[i47];
                                }
                                int i48 = 0;
                                int i49 = 0;
                                int i54 = 0;
                                while (true) {
                                    long j14 = 0;
                                    if (i48 >= size4) {
                                        arrayList2 = arrayList4;
                                        arrayList3 = arrayList5;
                                        i13 = i37;
                                        i14 = i38;
                                        C26502o c26502o3 = c26494g2.f105215d.f105328a;
                                        C26491d c26491d4 = (C26491d) c12199s2.f40748o;
                                        c26491d4.getClass();
                                        C26503p c26503p = c26502o3.f105322l[c26491d4.f105204a];
                                        C39309d c39309dM125273p3 = c39308c2.m125273p(1935763834);
                                        if (c39309dM125273p3 != null) {
                                            c26503p.getClass();
                                            C38059n c38059n5 = c39309dM125273p3.f169113y;
                                            int i55 = c26503p.f105326d;
                                            c38059n5.m121846F(8);
                                            int iM121854g2 = c38059n5.m121854g();
                                            byte[] bArr2 = AbstractC26490c.f105203a;
                                            if ((iM121854g2 & 1) == 1) {
                                                c38059n5.m121847G(8);
                                            }
                                            int iM121867t = c38059n5.m121867t();
                                            int iM121871x2 = c38059n5.m121871x();
                                            if (iM121871x2 > c12199s2.f40737d) {
                                                StringBuilder sbM30466t = AbstractC11266d.m30466t(iM121871x2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbM30466t.append(c12199s2.f40737d);
                                                throw ParserException.m5049a(null, sbM30466t.toString());
                                            }
                                            if (iM121867t == 0) {
                                                boolean[] zArr = c12199s2.f40744k;
                                                i16 = 0;
                                                for (int i56 = 0; i56 < iM121871x2; i56++) {
                                                    int iM121867t2 = c38059n5.m121867t();
                                                    i16 += iM121867t2;
                                                    zArr[i56] = iM121867t2 > i55;
                                                }
                                                z4 = false;
                                            } else {
                                                i16 = iM121867t * iM121871x2;
                                                z4 = false;
                                                Arrays.fill(c12199s2.f40744k, 0, iM121871x2, iM121867t > i55);
                                            }
                                            Arrays.fill(c12199s2.f40744k, iM121871x2, c12199s2.f40737d, z4);
                                            if (i16 > 0) {
                                                ((C38059n) c12199s2.f40750q).m121843C(i16);
                                                c12199s2.f40743j = true;
                                                c12199s2.f40745l = true;
                                            }
                                        }
                                        C39309d c39309dM125273p4 = c39308c2.m125273p(1935763823);
                                        if (c39309dM125273p4 != null) {
                                            C38059n c38059n6 = c39309dM125273p4.f169113y;
                                            c38059n6.m121846F(8);
                                            int iM121854g3 = c38059n6.m121854g();
                                            byte[] bArr3 = AbstractC26490c.f105203a;
                                            if ((iM121854g3 & 1) == 1) {
                                                c38059n6.m121847G(8);
                                            }
                                            int iM121871x3 = c38059n6.m121871x();
                                            if (iM121871x3 != 1) {
                                                throw ParserException.m5049a(null, "Unexpected saio entry count: " + iM121871x3);
                                            }
                                            c12199s2.f40735b += AbstractC26490c.m78536c(iM121854g3) == 0 ? c38059n6.m121869v() : c38059n6.m121872y();
                                        }
                                        byte[] bArr4 = null;
                                        C39309d c39309dM125273p5 = c39308c2.m125273p(1936027235);
                                        if (c39309dM125273p5 != null) {
                                            m78549c(c39309dM125273p5.f169113y, 0, c12199s2);
                                        }
                                        String str = c26503p != null ? c26503p.f105324b : null;
                                        C38059n c38059n7 = null;
                                        C38059n c38059n8 = null;
                                        for (int i57 = 0; i57 < arrayList7.size(); i57++) {
                                            C39309d c39309d3 = (C39309d) arrayList7.get(i57);
                                            C38059n c38059n9 = c39309d3.f169113y;
                                            int i58 = c39309d3.f2052x;
                                            if (i58 == 1935828848) {
                                                c38059n9.m121846F(12);
                                                if (c38059n9.m121854g() == 1936025959) {
                                                    c38059n8 = c38059n9;
                                                }
                                            } else if (i58 == 1936158820) {
                                                c38059n9.m121846F(12);
                                                if (c38059n9.m121854g() == 1936025959) {
                                                    c38059n7 = c38059n9;
                                                }
                                            }
                                        }
                                        if (c38059n8 != null && c38059n7 != null) {
                                            c38059n8.m121846F(8);
                                            int iM78536c = AbstractC26490c.m78536c(c38059n8.m121854g());
                                            c38059n8.m121847G(4);
                                            if (iM78536c == 1) {
                                                c38059n8.m121847G(4);
                                            }
                                            if (c38059n8.m121854g() != 1) {
                                                throw ParserException.m5051c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c38059n7.m121846F(8);
                                            int iM78536c2 = AbstractC26490c.m78536c(c38059n7.m121854g());
                                            c38059n7.m121847G(4);
                                            if (iM78536c2 == 1) {
                                                if (c38059n7.m121869v() == 0) {
                                                    throw ParserException.m5051c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iM78536c2 >= 2) {
                                                c38059n7.m121847G(4);
                                            }
                                            if (c38059n7.m121869v() != 1) {
                                                throw ParserException.m5051c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c38059n7.m121847G(1);
                                            int iM121867t3 = c38059n7.m121867t();
                                            int i59 = (iM121867t3 & 240) >> 4;
                                            int i64 = iM121867t3 & 15;
                                            boolean z14 = c38059n7.m121867t() == 1;
                                            if (z14) {
                                                int iM121867t4 = c38059n7.m121867t();
                                                byte[] bArr5 = new byte[16];
                                                c38059n7.m121852e(bArr5, 0, 16);
                                                if (iM121867t4 == 0) {
                                                    int iM121867t5 = c38059n7.m121867t();
                                                    bArr4 = new byte[iM121867t5];
                                                    c38059n7.m121852e(bArr4, 0, iM121867t5);
                                                }
                                                c12199s2.f40743j = true;
                                                c12199s2.f40749p = new C26503p(z14, str, iM121867t4, bArr5, i59, i64, bArr4);
                                            }
                                        }
                                        int size5 = arrayList7.size();
                                        for (int i65 = 0; i65 < size5; i65++) {
                                            C39309d c39309d4 = (C39309d) arrayList7.get(i65);
                                            if (c39309d4.f2052x == 1970628964) {
                                                C38059n c38059n10 = c39309d4.f169113y;
                                                c38059n10.m121846F(8);
                                                byte[] bArr6 = this.f105244h;
                                                c38059n10.m121852e(bArr6, 0, 16);
                                                if (Arrays.equals(bArr6, f105225K)) {
                                                    m78549c(c38059n10, 16, c12199s2);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    C39309d c39309d5 = (C39309d) arrayList7.get(i48);
                                    int i66 = size4;
                                    if (c39309d5.f2052x == i15) {
                                        int i67 = i49 + 1;
                                        C38059n c38059n11 = c39309d5.f169113y;
                                        c38059n11.m121846F(8);
                                        int iM121854g4 = c38059n11.m121854g();
                                        byte[] bArr7 = AbstractC26490c.f105203a;
                                        C26502o c26502o4 = c26494g2.f105215d.f105328a;
                                        C26491d c26491d5 = (C26491d) c12199s2.f40748o;
                                        int i68 = AbstractC38065t.f163031a;
                                        c12199s2.f40739f[i49] = c38059n11.m121871x();
                                        long[] jArr = c12199s2.f40738e;
                                        long j15 = c12199s2.f40734a;
                                        jArr[i49] = j15;
                                        if ((iM121854g4 & 1) != 0) {
                                            jArr[i49] = j15 + ((long) c38059n11.m121854g());
                                        }
                                        boolean z15 = (iM121854g4 & 4) != 0;
                                        int iM121854g5 = c26491d5.f105207d;
                                        if (z15) {
                                            iM121854g5 = c38059n11.m121854g();
                                        }
                                        boolean z16 = z15;
                                        boolean z17 = (iM121854g4 & 256) != 0;
                                        boolean z18 = (iM121854g4 & 512) != 0;
                                        boolean z19 = (iM121854g4 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0;
                                        boolean z24 = (iM121854g4 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0;
                                        boolean z25 = z19;
                                        long[] jArr2 = c26502o4.f105319i;
                                        int i69 = iM121854g5;
                                        long[] jArr3 = c26502o4.f105320j;
                                        if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                            long j16 = jArr2[0];
                                            if (j16 == 0) {
                                                j14 = jArr3[0];
                                            } else {
                                                long j17 = c26502o4.f105314d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                if (AbstractC38065t.m121903Q(j16, 1000000L, j17, roundingMode) + AbstractC38065t.m121903Q(jArr3[0], 1000000L, c26502o4.f105313c, roundingMode) >= c26502o4.f105315e) {
                                                    j14 = jArr3[0];
                                                }
                                            }
                                        }
                                        int[] iArr = c12199s2.f40740g;
                                        long[] jArr4 = c12199s2.f40741h;
                                        boolean[] zArr2 = c12199s2.f40742i;
                                        boolean z26 = c26502o4.f105312b == 2 && (i37 & 1) != 0;
                                        int i74 = c12199s2.f40739f[i49] + i54;
                                        long j18 = c26502o4.f105313c;
                                        long j19 = c12199s2.f40746m;
                                        int i75 = i54;
                                        while (i75 < i74) {
                                            int iM121854g6 = z17 ? c38059n11.m121854g() : c26491d5.f105205b;
                                            int i76 = i75;
                                            if (iM121854g6 < 0) {
                                                throw ParserException.m5049a(null, "Unexpected negative value: " + iM121854g6);
                                            }
                                            int iM121854g7 = z18 ? c38059n11.m121854g() : c26491d5.f105206c;
                                            if (iM121854g7 < 0) {
                                                throw ParserException.m5049a(null, "Unexpected negative value: " + iM121854g7);
                                            }
                                            int iM121854g8 = z25 ? c38059n11.m121854g() : (i76 == 0 && z16) ? i69 : c26491d5.f105207d;
                                            int i77 = i74;
                                            int i78 = i37;
                                            long jM121903Q = AbstractC38065t.m121903Q((((long) (z24 ? c38059n11.m121854g() : 0)) + j19) - j14, 1000000L, j18, RoundingMode.DOWN);
                                            jArr4[i76] = jM121903Q;
                                            if (!c12199s2.f40747n) {
                                                jArr4[i76] = jM121903Q + c26494g2.f105215d.f105335h;
                                            }
                                            iArr[i76] = iM121854g7;
                                            zArr2[i76] = ((iM121854g8 >> 16) & 1) == 0 && (!z26 || i76 == 0);
                                            j19 += (long) iM121854g6;
                                            i75 = i76 + 1;
                                            z26 = z26;
                                            i37 = i78;
                                            i74 = i77;
                                        }
                                        i17 = i37;
                                        c12199s2.f40746m = j19;
                                        i49 = i67;
                                        i54 = i74;
                                    } else {
                                        i17 = i37;
                                    }
                                    i48++;
                                    size4 = i66;
                                    arrayList4 = arrayList4;
                                    arrayList5 = arrayList5;
                                    i38 = i38;
                                    i37 = i17;
                                    i15 = 1953658222;
                                }
                            } else {
                                arrayList2 = arrayList4;
                                arrayList3 = arrayList5;
                                i13 = i37;
                                i14 = i38;
                            }
                        } else {
                            size3 = size3;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i13 = i37;
                            i14 = i38;
                        }
                        i38 = i14 + 1;
                        size3 = size3;
                        arrayList4 = arrayList2;
                        arrayList5 = arrayList3;
                        i37 = i13;
                    }
                    C34602l c34602lM78548a2 = m78548a(arrayList5);
                    if (c34602lM78548a2 != null) {
                        int size6 = sparseArray.size();
                        for (int i79 = 0; i79 < size6; i79++) {
                            C26494g c26494g3 = (C26494g) sparseArray.valueAt(i79);
                            C26502o c26502o5 = c26494g3.f105215d.f105328a;
                            C26491d c26491d6 = (C26491d) c26494g3.f105213b.f40748o;
                            int i83 = AbstractC38065t.f163031a;
                            C26503p c26503p2 = c26502o5.f105322l[c26491d6.f105204a];
                            C34602l c34602lM109391b = c34602lM78548a2.m109391b(c26503p2 != null ? c26503p2.f105324b : null);
                            C34608o c34608oM109410a = c26494g3.f105215d.f105328a.f105317g.m109410a();
                            c34608oM109410a.f145740l = AbstractC34587d0.m109382o(c26494g3.f105221j);
                            c34608oM109410a.f145745q = c34602lM109391b;
                            c26494g3.f105212a.mo36173a(new C34610p(c34608oM109410a));
                        }
                    }
                    if (this.f105260x != -9223372036854775807L) {
                        int size7 = sparseArray.size();
                        for (int i84 = 0; i84 < size7; i84++) {
                            C26494g c26494g4 = (C26494g) sparseArray.valueAt(i84);
                            long j24 = this.f105260x;
                            int i85 = c26494g4.f105217f;
                            while (true) {
                                C12199s c12199s3 = c26494g4.f105213b;
                                if (i85 >= c12199s3.f40737d || c12199s3.f40741h[i85] > j24) {
                                    break;
                                }
                                if (c12199s3.f40742i[i85]) {
                                    c26494g4.f105220i = i85;
                                }
                                i85++;
                            }
                        }
                        this.f105260x = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((C39308c) arrayDeque.peek()).f169110E.add(c39308c);
                }
            }
        }
        this.f105253q = 0;
        this.f105256t = 0;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        int i13;
        int i14 = this.f105238b;
        if ((i14 & 32) == 0) {
            interfaceC33648q = new C2817b(interfaceC33648q, this.f105237a);
        }
        this.f105233G = interfaceC33648q;
        int i15 = 0;
        this.f105253q = 0;
        this.f105256t = 0;
        InterfaceC33639k0[] interfaceC33639k0Arr = new InterfaceC33639k0[2];
        this.f105234H = interfaceC33639k0Arr;
        InterfaceC33639k0 interfaceC33639k0 = this.f105251o;
        if (interfaceC33639k0 != null) {
            interfaceC33639k0Arr[0] = interfaceC33639k0;
            i13 = 1;
        } else {
            i13 = 0;
        }
        int i16 = 100;
        if ((i14 & 4) != 0) {
            interfaceC33639k0Arr[i13] = interfaceC33648q.mo3101o(100, 5);
            i16 = 101;
            i13++;
        }
        InterfaceC33639k0[] interfaceC33639k0Arr2 = (InterfaceC33639k0[]) AbstractC38065t.m121898L(i13, this.f105234H);
        this.f105234H = interfaceC33639k0Arr2;
        for (InterfaceC33639k0 interfaceC33639k1 : interfaceC33639k0Arr2) {
            interfaceC33639k1.mo36173a(f105226L);
        }
        List list = this.f105239c;
        this.f105235I = new InterfaceC33639k0[list.size()];
        while (i15 < this.f105235I.length) {
            InterfaceC33639k0 interfaceC33639k0Mo3101o = this.f105233G.mo3101o(i16, 3);
            interfaceC33639k0Mo3101o.mo36173a((C34610p) list.get(i15));
            this.f105235I[i15] = interfaceC33639k0Mo3101o;
            i15++;
            i16++;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        C41060w0 c41060w0M133256r;
        InterfaceC33635i0 interfaceC33635i0M78564l = AbstractC26501n.m78564l(interfaceC33646o, true, false);
        if (interfaceC33635i0M78564l != null) {
            c41060w0M133256r = AbstractC41023g0.m133256r(interfaceC33635i0M78564l);
        } else {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            c41060w0M133256r = C41060w0.f177067E;
        }
        this.f105252p = c41060w0M133256r;
        return interfaceC33635i0M78564l == null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:129:0x026a  */
    /* JADX WARN: Code duplicated, block: B:463:0x0277 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        C31271g c31271g;
        ArrayDeque arrayDeque;
        C26494g c26494g;
        boolean z4;
        int i13;
        C26494g c26494g2;
        int i14;
        int i15;
        int iMo36175c;
        int i16;
        boolean z13;
        String strM121862o;
        String strM121862o2;
        long jM121903Q;
        long j7;
        long jM121903Q2;
        long jM121869v;
        long jM121872y;
        long jM121872y2;
        while (true) {
            int i17 = this.f105253q;
            ArrayDeque arrayDeque2 = this.f105248l;
            c31271g = this.f105250n;
            SparseArray sparseArray = this.f105240d;
            boolean z14 = true;
            if (i17 != 0) {
                arrayDeque = this.f105249m;
                if (i17 == 1) {
                    int i18 = (int) (this.f105255s - ((long) this.f105256t));
                    C38059n c38059n = this.f105257u;
                    if (c38059n != null) {
                        interfaceC33646o.readFully(c38059n.f163017a, 8, i18);
                        int i19 = this.f105254r;
                        C39309d c39309d = new C39309d(i19, c38059n);
                        long position = interfaceC33646o.getPosition();
                        if (!arrayDeque2.isEmpty()) {
                            ((C39308c) arrayDeque2.peek()).f169112z.add(c39309d);
                        } else if (i19 == 1936286840) {
                            c38059n.m121846F(8);
                            int iM78536c = AbstractC26490c.m78536c(c38059n.m121854g());
                            c38059n.m121847G(4);
                            long jM121869v2 = c38059n.m121869v();
                            if (iM78536c == 0) {
                                jM121872y = c38059n.m121869v();
                                jM121872y2 = c38059n.m121869v();
                            } else {
                                jM121872y = c38059n.m121872y();
                                jM121872y2 = c38059n.m121872y();
                            }
                            long j13 = jM121872y2 + position;
                            long j14 = jM121872y;
                            long j15 = j13;
                            int i24 = AbstractC38065t.f163031a;
                            long jM121903Q3 = AbstractC38065t.m121903Q(j14, 1000000L, jM121869v2, RoundingMode.DOWN);
                            c38059n.m121847G(2);
                            int iM121873z = c38059n.m121873z();
                            int[] iArr = new int[iM121873z];
                            long[] jArr = new long[iM121873z];
                            long[] jArr2 = new long[iM121873z];
                            long j16 = jM121903Q3;
                            long[] jArr3 = new long[iM121873z];
                            int i25 = 0;
                            while (i25 < iM121873z) {
                                int iM121854g = c38059n.m121854g();
                                if ((iM121854g & Integer.MIN_VALUE) != 0) {
                                    throw ParserException.m5049a(null, "Unhandled indirect reference");
                                }
                                long jM121869v3 = c38059n.m121869v();
                                iArr[i25] = iM121854g & Integer.MAX_VALUE;
                                jArr3[i25] = j15;
                                jArr2[i25] = j16;
                                j14 += jM121869v3;
                                int i26 = i25;
                                long[] jArr4 = jArr;
                                long[] jArr5 = jArr2;
                                long jM121903Q4 = AbstractC38065t.m121903Q(j14, 1000000L, jM121869v2, RoundingMode.DOWN);
                                jArr4[i26] = jM121903Q4 - jArr5[i26];
                                c38059n.m121847G(4);
                                jArr3 = jArr3;
                                j16 = jM121903Q4;
                                i25 = i26 + 1;
                                iM121873z = iM121873z;
                                jArr = jArr4;
                                jArr2 = jArr5;
                                j15 += (long) iArr[i26];
                                jM121903Q3 = jM121903Q3;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM121903Q3), new C33634i(iArr, jArr3, jArr, jArr2));
                            this.f105262z = ((Long) pairCreate.first).longValue();
                            this.f105233G.mo3109v((InterfaceC33627e0) pairCreate.second);
                            this.f105236J = true;
                        } else if (i19 == 1701671783 && this.f105234H.length != 0) {
                            c38059n.m121846F(8);
                            int iM78536c2 = AbstractC26490c.m78536c(c38059n.m121854g());
                            if (iM78536c2 == 0) {
                                strM121862o = c38059n.m121862o();
                                strM121862o.getClass();
                                strM121862o2 = c38059n.m121862o();
                                strM121862o2.getClass();
                                long jM121869v4 = c38059n.m121869v();
                                long jM121869v5 = c38059n.m121869v();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                jM121903Q = AbstractC38065t.m121903Q(jM121869v5, 1000000L, jM121869v4, roundingMode);
                                long j17 = this.f105262z;
                                j7 = j17 != -9223372036854775807L ? j17 + jM121903Q : -9223372036854775807L;
                                jM121903Q2 = AbstractC38065t.m121903Q(c38059n.m121869v(), 1000L, jM121869v4, roundingMode);
                                jM121869v = c38059n.m121869v();
                            } else if (iM78536c2 != 1) {
                                AbstractC38963t7.m124388r(iM78536c2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jM121869v6 = c38059n.m121869v();
                                long jM121872y3 = c38059n.m121872y();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jM121903Q5 = AbstractC38065t.m121903Q(jM121872y3, 1000000L, jM121869v6, roundingMode2);
                                long jM121903Q6 = AbstractC38065t.m121903Q(c38059n.m121869v(), 1000L, jM121869v6, roundingMode2);
                                long jM121869v7 = c38059n.m121869v();
                                strM121862o = c38059n.m121862o();
                                strM121862o.getClass();
                                strM121862o2 = c38059n.m121862o();
                                strM121862o2.getClass();
                                jM121903Q2 = jM121903Q6;
                                jM121869v = jM121869v7;
                                j7 = jM121903Q5;
                                jM121903Q = -9223372036854775807L;
                            }
                            String str = strM121862o;
                            String str2 = strM121862o2;
                            byte[] bArr = new byte[c38059n.m121848a()];
                            c38059n.m121852e(bArr, 0, c38059n.m121848a());
                            C38059n c38059n2 = new C38059n(this.f105246j.m36299a(new C12890a(str, str2, jM121903Q2, jM121869v, bArr)));
                            int iM121848a = c38059n2.m121848a();
                            for (InterfaceC33639k0 interfaceC33639k0 : this.f105234H) {
                                c38059n2.m121846F(0);
                                interfaceC33639k0.mo36176d(c38059n2, iM121848a, 0);
                            }
                            if (j7 == -9223372036854775807L) {
                                arrayDeque.addLast(new C26493f(iM121848a, jM121903Q, true));
                                this.f105259w += iM121848a;
                            } else if (arrayDeque.isEmpty()) {
                                for (InterfaceC33639k0 interfaceC33639k1 : this.f105234H) {
                                    interfaceC33639k1.mo36174b(j7, 1, iM121848a, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new C26493f(iM121848a, j7, false));
                                this.f105259w += iM121848a;
                            }
                        }
                    } else {
                        interfaceC33646o.mo3100n(i18);
                    }
                    m78550d(interfaceC33646o.getPosition());
                } else if (i17 != 2) {
                    c26494g = this.f105227A;
                    if (c26494g != null) {
                        z4 = true;
                        i13 = 8;
                        break;
                    }
                    int size = sparseArray.size();
                    C26494g c26494g3 = null;
                    int i27 = 0;
                    long j18 = Long.MAX_VALUE;
                    while (i27 < size) {
                        C26494g c26494g4 = (C26494g) sparseArray.valueAt(i27);
                        boolean z15 = c26494g4.f105224m;
                        C12199s c12199s = c26494g4.f105213b;
                        boolean z16 = z14;
                        if ((z15 || c26494g4.f105217f != c26494g4.f105215d.f105329b) && (!z15 || c26494g4.f105219h != c12199s.f40736c)) {
                            long j19 = !z15 ? c26494g4.f105215d.f105330c[c26494g4.f105217f] : c12199s.f40738e[c26494g4.f105219h];
                            if (j19 < j18) {
                                j18 = j19;
                                c26494g3 = c26494g4;
                            }
                        }
                        i27++;
                        z14 = z16;
                    }
                    z4 = z14;
                    i13 = 8;
                    if (c26494g3 != null) {
                        int position2 = (int) ((!c26494g3.f105224m ? c26494g3.f105215d.f105330c[c26494g3.f105217f] : c26494g3.f105213b.f40738e[c26494g3.f105219h]) - interfaceC33646o.getPosition());
                        if (position2 < 0) {
                            AbstractC38046a.m121826u("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            position2 = 0;
                        }
                        interfaceC33646o.mo3100n(position2);
                        this.f105227A = c26494g3;
                        c26494g = c26494g3;
                        break;
                    }
                    int position3 = (int) (this.f105258v - interfaceC33646o.getPosition());
                    if (position3 < 0) {
                        throw ParserException.m5049a(null, "Offset to end of mdat was negative.");
                    }
                    interfaceC33646o.mo3100n(position3);
                    this.f105253q = 0;
                    this.f105256t = 0;
                } else {
                    int size2 = sparseArray.size();
                    C26494g c26494g5 = null;
                    long j24 = Long.MAX_VALUE;
                    for (int i28 = 0; i28 < size2; i28++) {
                        C12199s c12199s2 = ((C26494g) sparseArray.valueAt(i28)).f105213b;
                        if (c12199s2.f40745l) {
                            long j25 = c12199s2.f40735b;
                            if (j25 < j24) {
                                c26494g5 = (C26494g) sparseArray.valueAt(i28);
                                j24 = j25;
                            }
                        }
                    }
                    if (c26494g5 == null) {
                        this.f105253q = 3;
                    } else {
                        int position4 = (int) (j24 - interfaceC33646o.getPosition());
                        if (position4 < 0) {
                            throw ParserException.m5049a(null, "Offset to encryption data was negative.");
                        }
                        interfaceC33646o.mo3100n(position4);
                        C12199s c12199s3 = c26494g5.f105213b;
                        C38059n c38059n3 = (C38059n) c12199s3.f40750q;
                        interfaceC33646o.readFully(c38059n3.f163017a, 0, c38059n3.f163019c);
                        c38059n3.m121846F(0);
                        c12199s3.f40745l = false;
                    }
                }
            } else {
                int i29 = this.f105256t;
                C38059n c38059n4 = this.f105247k;
                if (i29 == 0) {
                    if (!interfaceC33646o.mo3094f(c38059n4.f163017a, 0, 8, true)) {
                        c31271g.m96290b(0);
                        return -1;
                    }
                    this.f105256t = 8;
                    c38059n4.m121846F(0);
                    this.f105255s = c38059n4.m121869v();
                    this.f105254r = c38059n4.m121854g();
                }
                long j26 = this.f105255s;
                if (j26 == 1) {
                    interfaceC33646o.readFully(c38059n4.f163017a, 8, 8);
                    this.f105256t += 8;
                    this.f105255s = c38059n4.m121872y();
                } else if (j26 == 0) {
                    long length = interfaceC33646o.getLength();
                    if (length == -1 && !arrayDeque2.isEmpty()) {
                        length = ((C39308c) arrayDeque2.peek()).f169111y;
                    }
                    if (length != -1) {
                        this.f105255s = (length - interfaceC33646o.getPosition()) + ((long) this.f105256t);
                    }
                }
                if (this.f105255s < this.f105256t) {
                    throw ParserException.m5051c("Atom size less than header length (unsupported).");
                }
                long position5 = interfaceC33646o.getPosition() - ((long) this.f105256t);
                int i34 = this.f105254r;
                if ((i34 == 1836019558 || i34 == 1835295092) && !this.f105236J) {
                    this.f105233G.mo3109v(new C33651t(this.f105261y, position5));
                    this.f105236J = true;
                }
                if (this.f105254r == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i35 = 0; i35 < size3; i35++) {
                        C12199s c12199s4 = ((C26494g) sparseArray.valueAt(i35)).f105213b;
                        c12199s4.getClass();
                        c12199s4.f40735b = position5;
                        c12199s4.f40734a = position5;
                    }
                }
                int i36 = this.f105254r;
                if (i36 == 1835295092) {
                    this.f105227A = null;
                    this.f105258v = position5 + this.f105255s;
                    this.f105253q = 2;
                } else if (i36 == 1836019574 || i36 == 1953653099 || i36 == 1835297121 || i36 == 1835626086 || i36 == 1937007212 || i36 == 1836019558 || i36 == 1953653094 || i36 == 1836475768 || i36 == 1701082227) {
                    long position6 = (interfaceC33646o.getPosition() + this.f105255s) - 8;
                    arrayDeque2.push(new C39308c(this.f105254r, position6));
                    if (this.f105255s == this.f105256t) {
                        m78550d(position6);
                    } else {
                        this.f105253q = 0;
                        this.f105256t = 0;
                    }
                } else if (i36 == 1751411826 || i36 == 1835296868 || i36 == 1836476516 || i36 == 1936286840 || i36 == 1937011556 || i36 == 1937011827 || i36 == 1668576371 || i36 == 1937011555 || i36 == 1937011578 || i36 == 1937013298 || i36 == 1937007471 || i36 == 1668232756 || i36 == 1937011571 || i36 == 1952867444 || i36 == 1952868452 || i36 == 1953196132 || i36 == 1953654136 || i36 == 1953658222 || i36 == 1886614376 || i36 == 1935763834 || i36 == 1935763823 || i36 == 1936027235 || i36 == 1970628964 || i36 == 1935828848 || i36 == 1936158820 || i36 == 1701606260 || i36 == 1835362404 || i36 == 1701671783) {
                    if (this.f105256t != 8) {
                        throw ParserException.m5051c("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f105255s > 2147483647L) {
                        throw ParserException.m5051c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C38059n c38059n5 = new C38059n((int) this.f105255s);
                    System.arraycopy(c38059n4.f163017a, 0, c38059n5.f163017a, 0, 8);
                    this.f105257u = c38059n5;
                    this.f105253q = 1;
                } else {
                    if (this.f105255s > 2147483647L) {
                        throw ParserException.m5051c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f105257u = null;
                    this.f105253q = 1;
                }
            }
        }
        InterfaceC33639k0 interfaceC33639k2 = c26494g.f105212a;
        C12199s c12199s5 = c26494g.f105213b;
        if (this.f105253q == 3) {
            this.f105228B = !c26494g.f105224m ? c26494g.f105215d.f105331d[c26494g.f105217f] : c12199s5.f40740g[c26494g.f105217f];
            C34610p c34610p = c26494g.f105215d.f105328a.f105317g;
            boolean zEquals = Objects.equals(c34610p.f145783n, "video/avc");
            int i37 = this.f105238b;
            this.f105231E = !((!zEquals ? !(!Objects.equals(c34610p.f145783n, "video/hevc") || (i37 & 128) == 0) : (i37 & 64) != 0) ? false : z4);
            if (c26494g.f105217f < c26494g.f105220i) {
                interfaceC33646o.mo3100n(this.f105228B);
                C26503p c26503pM78543b = c26494g.m78543b();
                if (c26503pM78543b != null) {
                    C38059n c38059n6 = (C38059n) c12199s5.f40750q;
                    int i38 = c26503pM78543b.f105326d;
                    if (i38 != 0) {
                        c38059n6.m121847G(i38);
                    }
                    int i39 = c26494g.f105217f;
                    if (c12199s5.f40743j && c12199s5.f40744k[i39]) {
                        c38059n6.m121847G(c38059n6.m121873z() * 6);
                    }
                }
                if (!c26494g.m78544c()) {
                    this.f105227A = null;
                }
                this.f105253q = 3;
                return 0;
            }
            if (c26494g.f105215d.f105328a.f105318h == z4) {
                this.f105228B -= 8;
                interfaceC33646o.mo3100n(i13);
            }
            if ("audio/ac4".equals(c26494g.f105215d.f105328a.f105317g.f145783n)) {
                this.f105229C = c26494g.m78545d(this.f105228B, 7);
                int i44 = this.f105228B;
                C38059n c38059n7 = this.f105245i;
                AbstractC33618a.m106215g(i44, c38059n7);
                interfaceC33639k2.mo36176d(c38059n7, 7, 0);
                this.f105229C += 7;
            } else {
                this.f105229C = c26494g.m78545d(this.f105228B, 0);
            }
            this.f105228B += this.f105229C;
            this.f105253q = 4;
            this.f105230D = 0;
        }
        C26504q c26504q = c26494g.f105215d;
        C26502o c26502o = c26504q.f105328a;
        long j27 = c26494g.f105224m ? c12199s5.f40741h[c26494g.f105217f] : c26504q.f105333f[c26494g.f105217f];
        int i45 = c26502o.f105321k;
        C34610p c34610p2 = c26502o.f105317g;
        if (i45 == 0) {
            c26494g2 = c26494g;
            while (true) {
                int i46 = this.f105229C;
                int i47 = this.f105228B;
                if (i46 >= i47) {
                    break;
                }
                this.f105229C += interfaceC33639k2.mo36175c(interfaceC33646o, i47 - i46, false);
            }
        } else {
            C38059n c38059n8 = this.f105242f;
            byte[] bArr2 = c38059n8.f163017a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i48 = 4 - i45;
            while (true) {
                c26494g2 = c26494g;
                if (this.f105229C >= this.f105228B) {
                    break;
                }
                int i49 = this.f105230D;
                if (i49 == 0) {
                    if (this.f105235I.length > 0 || !this.f105231E) {
                        int iM125278e = AbstractC39319n.m125278e(c34610p2);
                        if (i45 + iM125278e <= this.f105228B - this.f105229C) {
                            i16 = iM125278e;
                        } else {
                            i16 = 0;
                        }
                    } else {
                        i16 = 0;
                    }
                    interfaceC33646o.readFully(bArr2, i48, i45 + i16);
                    c38059n8.m121846F(0);
                    int iM121854g2 = c38059n8.m121854g();
                    if (iM121854g2 < 0) {
                        throw ParserException.m5049a(null, "Invalid NAL length");
                    }
                    this.f105230D = iM121854g2 - i16;
                    C38059n c38059n9 = this.f105241e;
                    i14 = i48;
                    c38059n9.m121846F(0);
                    i15 = i45;
                    interfaceC33639k2.mo36176d(c38059n9, 4, 0);
                    this.f105229C += 4;
                    this.f105228B += i14;
                    if (this.f105235I.length > 0 && i16 > 0) {
                        byte b = bArr2[4];
                        String str3 = c34610p2.f145783n;
                        String str4 = c34610p2.f145780k;
                        if ((!Objects.equals(str3, "video/avc") && !AbstractC34587d0.m109369b(str4, "video/avc")) || (b & 31) != 6) {
                            if ((Objects.equals(c34610p2.f145783n, "video/hevc") || AbstractC34587d0.m109369b(str4, "video/hevc")) && ((b & 126) >> 1) == 39) {
                            }
                            this.f105232F = z13;
                            interfaceC33639k2.mo36176d(c38059n8, i16, 0);
                            this.f105229C += i16;
                            if (i16 <= 0 && !this.f105231E && AbstractC39319n.m125277d(bArr2, i16, c34610p2)) {
                                this.f105231E = true;
                            }
                        }
                        z13 = true;
                        this.f105232F = z13;
                        interfaceC33639k2.mo36176d(c38059n8, i16, 0);
                        this.f105229C += i16;
                        if (i16 <= 0) {
                        }
                    }
                    z13 = false;
                    this.f105232F = z13;
                    interfaceC33639k2.mo36176d(c38059n8, i16, 0);
                    this.f105229C += i16;
                    if (i16 <= 0) {
                    }
                } else {
                    i14 = i48;
                    i15 = i45;
                    if (this.f105232F) {
                        C38059n c38059n10 = this.f105243g;
                        c38059n10.m121843C(i49);
                        interfaceC33646o.readFully(c38059n10.f163017a, 0, this.f105230D);
                        interfaceC33639k2.mo36176d(c38059n10, this.f105230D, 0);
                        int i54 = this.f105230D;
                        int iM125287n = AbstractC39319n.m125287n(c38059n10.f163019c, c38059n10.f163017a);
                        c38059n10.m121846F(0);
                        c38059n10.m121845E(iM125287n);
                        int i55 = c34610p2.f145785p;
                        if (i55 == -1) {
                            if (c31271g.f128784a != 0) {
                                c31271g.f128784a = 0;
                                c31271g.m96290b(0);
                            }
                        } else if (c31271g.f128784a != i55) {
                            AbstractC35849g.m113807i(i55 >= 0);
                            c31271g.f128784a = i55;
                            c31271g.m96290b(i55);
                        }
                        c31271g.m96289a(j27, c38059n10);
                        if ((c26494g2.m78542a() & 4) != 0) {
                            c31271g.m96290b(0);
                        }
                        iMo36175c = i54;
                    } else {
                        iMo36175c = interfaceC33639k2.mo36175c(interfaceC33646o, i49, false);
                    }
                    this.f105229C += iMo36175c;
                    this.f105230D -= iMo36175c;
                }
                c26494g = c26494g2;
                i48 = i14;
                i45 = i15;
            }
        }
        int iM78542a = c26494g2.m78542a();
        if (!this.f105231E) {
            iM78542a |= 67108864;
        }
        int i56 = iM78542a;
        C26503p c26503pM78543b2 = c26494g2.m78543b();
        long j28 = j27;
        interfaceC33639k2.mo36174b(j28, i56, this.f105228B, 0, c26503pM78543b2 != null ? c26503pM78543b2.f105325c : null);
        while (!arrayDeque.isEmpty()) {
            C26493f c26493f = (C26493f) arrayDeque.removeFirst();
            this.f105259w -= c26493f.f105211c;
            long j29 = c26493f.f105209a;
            if (c26493f.f105210b) {
                j29 += j28;
            }
            long j34 = j29;
            for (InterfaceC33639k0 interfaceC33639k3 : this.f105234H) {
                interfaceC33639k3.mo36174b(j34, 1, c26493f.f105211c, this.f105259w, null);
            }
        }
        if (!c26494g2.m78544c()) {
            this.f105227A = null;
        }
        this.f105253q = 3;
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: j */
    public final List mo78551j() {
        return this.f105252p;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }

    public C26495h(InterfaceC30105j interfaceC30105j, int i13, List list, C12876o c12876o) {
        this.f105237a = interfaceC30105j;
        this.f105238b = i13;
        this.f105239c = Collections.unmodifiableList(list);
        this.f105251o = c12876o;
        this.f105246j = new C12891b(0);
        this.f105247k = new C38059n(16);
        this.f105241e = new C38059n(AbstractC39319n.f169167a);
        this.f105242f = new C38059n(6);
        this.f105243g = new C38059n();
        byte[] bArr = new byte[16];
        this.f105244h = bArr;
        this.f105245i = new C38059n(bArr);
        this.f105248l = new ArrayDeque();
        this.f105249m = new ArrayDeque();
        this.f105240d = new SparseArray();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f105252p = C41060w0.f177067E;
        this.f105261y = -9223372036854775807L;
        this.f105260x = -9223372036854775807L;
        this.f105262z = -9223372036854775807L;
        this.f105233G = InterfaceC33648q.f140435u;
        this.f105234H = new InterfaceC33639k0[0];
        this.f105235I = new InterfaceC33639k0[0];
        this.f105250n = new C31271g(new C26492e(this));
    }
}
