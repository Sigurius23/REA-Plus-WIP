package p094dn;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import p010a9.AbstractC0576a;
import p012ab.C0680g0;
import p113ea.C12891b;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p479s4.AbstractC32123d;
import p499t9.C33650s;
import p556vm.C36135b;
import p556vm.C36136c;
import p588wm.C37363e;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.C37371m;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import q63.AbstractC30007c;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: dn.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C12190j implements InterfaceC37367i {

    /* JADX INFO: renamed from: G */
    public static final byte[] f40647G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: H */
    public static final C31521c0 f40648H;

    /* JADX INFO: renamed from: A */
    public int f40649A;

    /* JADX INFO: renamed from: B */
    public boolean f40650B;

    /* JADX INFO: renamed from: F */
    public boolean f40654F;

    /* JADX INFO: renamed from: a */
    public final int f40655a;

    /* JADX INFO: renamed from: b */
    public final List f40656b;

    /* JADX INFO: renamed from: g */
    public final byte[] f40661g;

    /* JADX INFO: renamed from: h */
    public final C13117a f40662h;

    /* JADX INFO: renamed from: i */
    public final C24566x f40663i;

    /* JADX INFO: renamed from: n */
    public int f40668n;

    /* JADX INFO: renamed from: o */
    public int f40669o;

    /* JADX INFO: renamed from: p */
    public long f40670p;

    /* JADX INFO: renamed from: q */
    public int f40671q;

    /* JADX INFO: renamed from: r */
    public C13117a f40672r;

    /* JADX INFO: renamed from: s */
    public long f40673s;

    /* JADX INFO: renamed from: t */
    public int f40674t;

    /* JADX INFO: renamed from: x */
    public C12189i f40678x;

    /* JADX INFO: renamed from: y */
    public int f40679y;

    /* JADX INFO: renamed from: z */
    public int f40680z;

    /* JADX INFO: renamed from: j */
    public final C12891b f40664j = new C12891b(1);

    /* JADX INFO: renamed from: k */
    public final C13117a f40665k = new C13117a(16);

    /* JADX INFO: renamed from: d */
    public final C13117a f40658d = new C13117a(AbstractC24543a.f95799c, 1, (byte) 0);

    /* JADX INFO: renamed from: e */
    public final C13117a f40659e = new C13117a(5);

    /* JADX INFO: renamed from: f */
    public final C13117a f40660f = new C13117a();

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f40666l = new ArrayDeque();

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f40667m = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final SparseArray f40657c = new SparseArray();

    /* JADX INFO: renamed from: v */
    public long f40676v = -9223372036854775807L;

    /* JADX INFO: renamed from: u */
    public long f40675u = -9223372036854775807L;

    /* JADX INFO: renamed from: w */
    public long f40677w = -9223372036854775807L;

    /* JADX INFO: renamed from: C */
    public InterfaceC37369k f40651C = InterfaceC37369k.f159856D;

    /* JADX INFO: renamed from: D */
    public InterfaceC37377s[] f40652D = new InterfaceC37377s[0];

    /* JADX INFO: renamed from: E */
    public InterfaceC37377s[] f40653E = new InterfaceC37377s[0];

    static {
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = "application/x-emsg";
        f40648H = new C31521c0(c31518b0);
    }

    public C12190j(int i13, C24566x c24566x, List list) {
        this.f40655a = i13;
        this.f40663i = c24566x;
        this.f40656b = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f40661g = bArr;
        this.f40662h = new C13117a(bArr, 1, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public static C36136c m33804a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            C12182b c12182b = (C12182b) list.get(i13);
            if (c12182b.f2052x == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c12182b.f40610y.f45381a;
                C12194n c12194nM33811e = AbstractC12191k.m33811e(bArr);
                UUID uuid = c12194nM33811e == null ? null : c12194nM33811e.f40710a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C36135b(uuid, null, MimeType.MIME_TYPE_VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C36136c(null, false, (C36135b[]) arrayList.toArray(new C36135b[0]));
    }

    /* JADX INFO: renamed from: c */
    public static void m33805c(C13117a c13117a, int i13, C12199s c12199s) throws ParserException {
        c13117a.m36689K(i13 + 8);
        int iM36699i = c13117a.m36699i();
        if ((iM36699i & 1) != 0) {
            throw ParserException.m15564c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (iM36699i & 2) != 0;
        int iM36680B = c13117a.m36680B();
        if (iM36680B == 0) {
            Arrays.fill(c12199s.f40744k, 0, c12199s.f40737d, false);
            return;
        }
        int i14 = c12199s.f40737d;
        C13117a c13117a2 = (C13117a) c12199s.f40750q;
        if (iM36680B != i14) {
            StringBuilder sb4 = new StringBuilder(80);
            sb4.append("Senc sample count ");
            sb4.append(iM36680B);
            sb4.append(" is different from fragment sample count");
            sb4.append(i14);
            throw ParserException.m15562a(null, sb4.toString());
        }
        Arrays.fill(c12199s.f40744k, 0, iM36680B, z4);
        c13117a2.m36686H(c13117a.m36692a());
        c12199s.f40743j = true;
        c12199s.f40745l = true;
        c13117a.m36697g(c13117a2.f45381a, 0, c13117a2.f45383c);
        c13117a2.m36689K(0);
        c12199s.f40745l = false;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        SparseArray sparseArray = this.f40657c;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((C12189i) sparseArray.valueAt(i13)).m33803d();
        }
        this.f40667m.clear();
        this.f40674t = 0;
        this.f40675u = j13;
        this.f40666l.clear();
        this.f40668n = 0;
        this.f40671q = 0;
    }

    /* JADX WARN: Code duplicated, block: B:252:0x05a2  */
    /* JADX INFO: renamed from: d */
    public final void m33806d(long j7) throws ParserException {
        C12187g c12187g;
        C12187g c12187g2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i13;
        int i14;
        int i15;
        boolean z4;
        while (true) {
            ArrayDeque arrayDeque = this.f40666l;
            if (arrayDeque.isEmpty() || ((C12181a) arrayDeque.peek()).f40608y != j7) {
                break;
            }
            C12181a c12181a = (C12181a) arrayDeque.pop();
            int i16 = c12181a.f2052x;
            ArrayList arrayList4 = c12181a.f40607E;
            ArrayList arrayList5 = c12181a.f40609z;
            int i17 = this.f40655a;
            int i18 = 12;
            SparseArray sparseArray = this.f40657c;
            if (i16 == 1836019574) {
                C36136c c36136cM33804a = m33804a(arrayList5);
                C12181a c12181aM33782o = c12181a.m33782o(1836475768);
                c12181aM33782o.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = c12181aM33782o.f40609z;
                int size = arrayList6.size();
                int i19 = 0;
                long jM36716z = -9223372036854775807L;
                while (i19 < size) {
                    C12182b c12182b = (C12182b) arrayList6.get(i19);
                    int i24 = c12182b.f2052x;
                    C13117a c13117a = c12182b.f40610y;
                    if (i24 == 1953654136) {
                        c13117a.m36689K(i18);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(c13117a.m36699i()), new C12187g(c13117a.m36699i() - 1, c13117a.m36699i(), c13117a.m36699i(), c13117a.m36699i()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (C12187g) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i24 == 1835362404) {
                            c13117a.m36689K(8);
                            jM36716z = AbstractC0576a.m1494n(c13117a.m36699i()) == 0 ? c13117a.m36716z() : c13117a.m36681C();
                        }
                    }
                    i19++;
                    arrayList6 = arrayList;
                    i18 = 12;
                }
                int i25 = 1;
                ArrayList arrayListM33799e = AbstractC12186f.m33799e(c12181a, new C37371m(), jM36716z, c36136cM33804a, (i17 & 16) != 0, false, new C0680g0(this, 27));
                int size2 = arrayListM33799e.size();
                if (sparseArray.size() == 0) {
                    int i26 = 0;
                    while (i26 < size2) {
                        C12200t c12200t = (C12200t) arrayListM33799e.get(i26);
                        C12197q c12197q = c12200t.f40751a;
                        InterfaceC37369k interfaceC37369k = this.f40651C;
                        int i27 = c12197q.f40719b;
                        int i28 = c12197q.f40718a;
                        InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(i26, i27);
                        if (sparseArray2.size() == i25) {
                            c12187g = (C12187g) sparseArray2.valueAt(0);
                        } else {
                            c12187g = (C12187g) sparseArray2.get(i28);
                            c12187g.getClass();
                        }
                        sparseArray.put(i28, new C12189i(interfaceC37377sMo3102o, c12200t, c12187g));
                        this.f40676v = Math.max(this.f40676v, c12197q.f40722e);
                        i26++;
                        i25 = 1;
                    }
                    this.f40651C.mo3098l();
                } else {
                    AbstractC24543a.m71573i(sparseArray.size() == size2);
                    for (int i29 = 0; i29 < size2; i29++) {
                        C12200t c12200t2 = (C12200t) arrayListM33799e.get(i29);
                        C12197q c12197q2 = c12200t2.f40751a;
                        C12189i c12189i = (C12189i) sparseArray.get(c12197q2.f40718a);
                        int i34 = c12197q2.f40718a;
                        if (sparseArray2.size() == 1) {
                            c12187g2 = (C12187g) sparseArray2.valueAt(0);
                        } else {
                            c12187g2 = (C12187g) sparseArray2.get(i34);
                            c12187g2.getClass();
                        }
                        c12189i.f40638d = c12200t2;
                        c12189i.f40639e = c12187g2;
                        c12189i.f40635a.mo102730a(c12200t2.f40751a.f40723f);
                        c12189i.m33803d();
                    }
                }
            } else if (i16 == 1836019558) {
                int size3 = arrayList4.size();
                int i35 = 0;
                while (i35 < size3) {
                    C12181a c12181a2 = (C12181a) arrayList4.get(i35);
                    if (c12181a2.f2052x == 1953653094) {
                        C12182b c12182bM33783p = c12181a2.m33783p(1952868452);
                        ArrayList arrayList7 = c12181a2.f40609z;
                        c12182bM33783p.getClass();
                        C13117a c13117a2 = c12182bM33783p.f40610y;
                        c13117a2.m36689K(8);
                        int iM36699i = c13117a2.m36699i();
                        C12189i c12189i2 = (C12189i) sparseArray.get(c13117a2.m36699i());
                        if (c12189i2 == null) {
                            size3 = size3;
                            c12189i2 = null;
                        } else {
                            C12199s c12199s = c12189i2.f40636b;
                            if ((iM36699i & 1) != 0) {
                                long jM36681C = c13117a2.m36681C();
                                c12199s.f40734a = jM36681C;
                                c12199s.f40735b = jM36681C;
                            }
                            C12187g c12187g3 = c12189i2.f40639e;
                            c12199s.f40748o = new C12187g((iM36699i & 2) != 0 ? c13117a2.m36699i() - 1 : c12187g3.f40628a, (iM36699i & 8) != 0 ? c13117a2.m36699i() : c12187g3.f40629b, (iM36699i & 16) != 0 ? c13117a2.m36699i() : c12187g3.f40630c, (iM36699i & 32) != 0 ? c13117a2.m36699i() : c12187g3.f40631d);
                        }
                        if (c12189i2 != null) {
                            C12199s c12199s2 = c12189i2.f40636b;
                            long j13 = c12199s2.f40746m;
                            boolean z13 = c12199s2.f40747n;
                            c12189i2.m33803d();
                            c12189i2.f40646l = true;
                            C12182b c12182bM33783p2 = c12181a2.m33783p(1952867444);
                            if (c12182bM33783p2 == null || (i17 & 2) != 0) {
                                c12199s2.f40746m = j13;
                                c12199s2.f40747n = z13;
                            } else {
                                C13117a c13117a3 = c12182bM33783p2.f40610y;
                                c13117a3.m36689K(8);
                                c12199s2.f40746m = AbstractC0576a.m1494n(c13117a3.m36699i()) == 1 ? c13117a3.m36681C() : c13117a3.m36716z();
                                c12199s2.f40747n = true;
                            }
                            int size4 = arrayList7.size();
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i36 >= size4) {
                                    break;
                                }
                                C12182b c12182b2 = (C12182b) arrayList7.get(i36);
                                int i39 = i36;
                                if (c12182b2.f2052x == 1953658222) {
                                    C13117a c13117a4 = c12182b2.f40610y;
                                    c13117a4.m36689K(12);
                                    int iM36680B = c13117a4.m36680B();
                                    if (iM36680B > 0) {
                                        i38 += iM36680B;
                                        i37++;
                                    }
                                }
                                i36 = i39 + 1;
                            }
                            c12189i2.f40642h = 0;
                            c12189i2.f40641g = 0;
                            c12189i2.f40640f = 0;
                            c12199s2.f40736c = i37;
                            c12199s2.f40737d = i38;
                            if (c12199s2.f40739f.length < i37) {
                                c12199s2.f40738e = new long[i37];
                                c12199s2.f40739f = new int[i37];
                            }
                            if (c12199s2.f40740g.length < i38) {
                                int i44 = (i38 * 125) / 100;
                                c12199s2.f40740g = new int[i44];
                                c12199s2.f40741h = new long[i44];
                                c12199s2.f40742i = new boolean[i44];
                                c12199s2.f40744k = new boolean[i44];
                            }
                            int i45 = 0;
                            int i46 = 0;
                            int i47 = 0;
                            while (true) {
                                long j14 = 0;
                                if (i45 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i13 = i35;
                                    C12197q c12197q3 = c12189i2.f40638d.f40751a;
                                    C12187g c12187g4 = (C12187g) c12199s2.f40748o;
                                    c12187g4.getClass();
                                    C12198r c12198r = c12197q3.f40728k[c12187g4.f40628a];
                                    C12182b c12182bM33783p3 = c12181a2.m33783p(1935763834);
                                    if (c12182bM33783p3 != null) {
                                        c12198r.getClass();
                                        C13117a c13117a5 = c12182bM33783p3.f40610y;
                                        int i48 = c12198r.f40732d;
                                        c13117a5.m36689K(8);
                                        if ((c13117a5.m36699i() & 1) == 1) {
                                            c13117a5.m36690L(8);
                                        }
                                        int iM36715y = c13117a5.m36715y();
                                        int iM36680B2 = c13117a5.m36680B();
                                        int i49 = c12199s2.f40737d;
                                        if (iM36680B2 > i49) {
                                            StringBuilder sb4 = new StringBuilder(78);
                                            sb4.append("Saiz sample count ");
                                            sb4.append(iM36680B2);
                                            sb4.append(" is greater than fragment sample count");
                                            sb4.append(i49);
                                            throw ParserException.m15562a(null, sb4.toString());
                                        }
                                        if (iM36715y == 0) {
                                            boolean[] zArr = c12199s2.f40744k;
                                            i15 = 0;
                                            for (int i54 = 0; i54 < iM36680B2; i54++) {
                                                int iM36715y2 = c13117a5.m36715y();
                                                i15 += iM36715y2;
                                                zArr[i54] = iM36715y2 > i48;
                                            }
                                            z4 = false;
                                        } else {
                                            boolean z14 = iM36715y > i48;
                                            i15 = iM36715y * iM36680B2;
                                            z4 = false;
                                            Arrays.fill(c12199s2.f40744k, 0, iM36680B2, z14);
                                        }
                                        Arrays.fill(c12199s2.f40744k, iM36680B2, c12199s2.f40737d, z4);
                                        if (i15 > 0) {
                                            ((C13117a) c12199s2.f40750q).m36686H(i15);
                                            c12199s2.f40743j = true;
                                            c12199s2.f40745l = true;
                                        }
                                    }
                                    C12182b c12182bM33783p4 = c12181a2.m33783p(1935763823);
                                    if (c12182bM33783p4 != null) {
                                        C13117a c13117a6 = c12182bM33783p4.f40610y;
                                        c13117a6.m36689K(8);
                                        int iM36699i2 = c13117a6.m36699i();
                                        if ((iM36699i2 & 1) == 1) {
                                            c13117a6.m36690L(8);
                                        }
                                        int iM36680B3 = c13117a6.m36680B();
                                        if (iM36680B3 != 1) {
                                            StringBuilder sb5 = new StringBuilder(40);
                                            sb5.append("Unexpected saio entry count: ");
                                            sb5.append(iM36680B3);
                                            throw ParserException.m15562a(null, sb5.toString());
                                        }
                                        c12199s2.f40735b += AbstractC0576a.m1494n(iM36699i2) == 0 ? c13117a6.m36716z() : c13117a6.m36681C();
                                    }
                                    byte[] bArr = null;
                                    C12182b c12182bM33783p5 = c12181a2.m33783p(1936027235);
                                    if (c12182bM33783p5 != null) {
                                        m33805c(c12182bM33783p5.f40610y, 0, c12199s2);
                                    }
                                    String str = c12198r != null ? c12198r.f40730b : null;
                                    C13117a c13117a7 = null;
                                    C13117a c13117a8 = null;
                                    for (int i55 = 0; i55 < arrayList7.size(); i55++) {
                                        C12182b c12182b3 = (C12182b) arrayList7.get(i55);
                                        C13117a c13117a9 = c12182b3.f40610y;
                                        int i56 = c12182b3.f2052x;
                                        if (i56 == 1935828848) {
                                            c13117a9.m36689K(12);
                                            if (c13117a9.m36699i() == 1936025959) {
                                                c13117a7 = c13117a9;
                                            }
                                        } else if (i56 == 1936158820) {
                                            c13117a9.m36689K(12);
                                            if (c13117a9.m36699i() == 1936025959) {
                                                c13117a8 = c13117a9;
                                            }
                                        }
                                    }
                                    if (c13117a7 != null && c13117a8 != null) {
                                        c13117a7.m36689K(8);
                                        int iM1494n = AbstractC0576a.m1494n(c13117a7.m36699i());
                                        c13117a7.m36690L(4);
                                        if (iM1494n == 1) {
                                            c13117a7.m36690L(4);
                                        }
                                        if (c13117a7.m36699i() != 1) {
                                            throw ParserException.m15564c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        c13117a8.m36689K(8);
                                        int iM1494n2 = AbstractC0576a.m1494n(c13117a8.m36699i());
                                        c13117a8.m36690L(4);
                                        if (iM1494n2 == 1) {
                                            if (c13117a8.m36716z() == 0) {
                                                throw ParserException.m15564c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iM1494n2 >= 2) {
                                            c13117a8.m36690L(4);
                                        }
                                        if (c13117a8.m36716z() != 1) {
                                            throw ParserException.m15564c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        c13117a8.m36690L(1);
                                        int iM36715y3 = c13117a8.m36715y();
                                        int i57 = (iM36715y3 & 240) >> 4;
                                        int i58 = iM36715y3 & 15;
                                        boolean z15 = c13117a8.m36715y() == 1;
                                        if (z15) {
                                            int iM36715y4 = c13117a8.m36715y();
                                            byte[] bArr2 = new byte[16];
                                            c13117a8.m36697g(bArr2, 0, 16);
                                            if (iM36715y4 == 0) {
                                                int iM36715y5 = c13117a8.m36715y();
                                                bArr = new byte[iM36715y5];
                                                c13117a8.m36697g(bArr, 0, iM36715y5);
                                            }
                                            c12199s2.f40743j = true;
                                            c12199s2.f40749p = new C12198r(z15, str, iM36715y4, bArr2, i57, i58, bArr);
                                        }
                                    }
                                    int size5 = arrayList7.size();
                                    for (int i59 = 0; i59 < size5; i59++) {
                                        C12182b c12182b4 = (C12182b) arrayList7.get(i59);
                                        if (c12182b4.f2052x == 1970628964) {
                                            C13117a c13117a10 = c12182b4.f40610y;
                                            c13117a10.m36689K(8);
                                            byte[] bArr3 = this.f40661g;
                                            c13117a10.m36697g(bArr3, 0, 16);
                                            if (Arrays.equals(bArr3, f40647G)) {
                                                m33805c(c13117a10, 16, c12199s2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                C12182b c12182b5 = (C12182b) arrayList7.get(i45);
                                int i64 = size4;
                                if (c12182b5.f2052x == i14) {
                                    int i65 = i46 + 1;
                                    C13117a c13117a11 = c12182b5.f40610y;
                                    c13117a11.m36689K(8);
                                    int iM36699i3 = c13117a11.m36699i();
                                    C12197q c12197q4 = c12189i2.f40638d.f40751a;
                                    C12187g c12187g5 = (C12187g) c12199s2.f40748o;
                                    int i66 = AbstractC24567y.f95875a;
                                    c12199s2.f40739f[i46] = c13117a11.m36680B();
                                    long[] jArr = c12199s2.f40738e;
                                    long j15 = c12199s2.f40734a;
                                    jArr[i46] = j15;
                                    if ((iM36699i3 & 1) != 0) {
                                        jArr[i46] = j15 + ((long) c13117a11.m36699i());
                                    }
                                    boolean z16 = (iM36699i3 & 4) != 0;
                                    int iM36699i4 = c12187g5.f40631d;
                                    if (z16) {
                                        iM36699i4 = c13117a11.m36699i();
                                    }
                                    boolean z17 = z16;
                                    boolean z18 = (iM36699i3 & 256) != 0;
                                    boolean z19 = (iM36699i3 & 512) != 0;
                                    boolean z24 = (iM36699i3 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0;
                                    boolean z25 = (iM36699i3 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0;
                                    boolean z26 = z24;
                                    long[] jArr2 = c12197q4.f40725h;
                                    int i67 = iM36699i4;
                                    if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                        j14 = c12197q4.f40726i[0];
                                    }
                                    int[] iArr = c12199s2.f40740g;
                                    long[] jArr3 = c12199s2.f40741h;
                                    boolean[] zArr2 = c12199s2.f40742i;
                                    boolean z27 = c12197q4.f40719b == 2 && (i17 & 1) != 0;
                                    int i68 = c12199s2.f40739f[i46] + i47;
                                    long j16 = c12197q4.f40720c;
                                    long j17 = c12199s2.f40746m;
                                    while (i47 < i68) {
                                        int iM36699i5 = z18 ? c13117a11.m36699i() : c12187g5.f40629b;
                                        boolean z28 = z27;
                                        int i69 = i68;
                                        if (iM36699i5 < 0) {
                                            StringBuilder sb6 = new StringBuilder(38);
                                            sb6.append("Unexpected negative value: ");
                                            sb6.append(iM36699i5);
                                            throw ParserException.m15562a(null, sb6.toString());
                                        }
                                        int iM36699i6 = z19 ? c13117a11.m36699i() : c12187g5.f40630c;
                                        if (iM36699i6 < 0) {
                                            StringBuilder sb7 = new StringBuilder(38);
                                            sb7.append("Unexpected negative value: ");
                                            sb7.append(iM36699i6);
                                            throw ParserException.m15562a(null, sb7.toString());
                                        }
                                        int iM36699i7 = z26 ? c13117a11.m36699i() : (i47 == 0 && z17) ? i67 : c12187g5.f40631d;
                                        long jM71666D = AbstractC24567y.m71666D((((long) (z25 ? c13117a11.m36699i() : 0)) + j17) - j14, 1000000L, j16);
                                        jArr3[i47] = jM71666D;
                                        if (!c12199s2.f40747n) {
                                            jArr3[i47] = jM71666D + c12189i2.f40638d.f40758h;
                                        }
                                        iArr[i47] = iM36699i6;
                                        zArr2[i47] = ((iM36699i7 >> 16) & 1) == 0 && (!z28 || i47 == 0);
                                        j17 += (long) iM36699i5;
                                        i47++;
                                        z27 = z28;
                                        i68 = i69;
                                        c12187g5 = c12187g5;
                                    }
                                    c12199s2.f40746m = j17;
                                    i46 = i65;
                                    i47 = i68;
                                }
                                i45++;
                                size4 = i64;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i35 = i35;
                                i14 = 1953658222;
                            }
                        } else {
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i13 = i35;
                        }
                    } else {
                        size3 = size3;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i13 = i35;
                    }
                    i35 = i13 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                }
                C36136c c36136cM33804a2 = m33804a(arrayList5);
                if (c36136cM33804a2 != null) {
                    int size6 = sparseArray.size();
                    for (int i74 = 0; i74 < size6; i74++) {
                        C12189i c12189i3 = (C12189i) sparseArray.valueAt(i74);
                        C12197q c12197q5 = c12189i3.f40638d.f40751a;
                        C12187g c12187g6 = (C12187g) c12189i3.f40636b.f40748o;
                        int i75 = AbstractC24567y.f95875a;
                        C12198r c12198r2 = c12197q5.f40728k[c12187g6.f40628a];
                        C36136c c36136cM114963b = c36136cM33804a2.m114963b(c12198r2 != null ? c12198r2.f40730b : null);
                        C31518b0 c31518b0M97113a = c12189i3.f40638d.f40751a.f40723f.m97113a();
                        c31518b0M97113a.f130050n = c36136cM114963b;
                        c12189i3.f40635a.mo102730a(new C31521c0(c31518b0M97113a));
                    }
                }
                if (this.f40675u != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i76 = 0; i76 < size7; i76++) {
                        C12189i c12189i4 = (C12189i) sparseArray.valueAt(i76);
                        long j18 = this.f40675u;
                        int i77 = c12189i4.f40640f;
                        while (true) {
                            C12199s c12199s3 = c12189i4.f40636b;
                            if (i77 >= c12199s3.f40737d || c12199s3.f40741h[i77] >= j18) {
                                break;
                            }
                            if (c12199s3.f40742i[i77]) {
                                c12189i4.f40643i = i77;
                            }
                            i77++;
                        }
                    }
                    this.f40675u = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((C12181a) arrayDeque.peek()).f40607E.add(c12181a);
            }
        }
        this.f40668n = 0;
        this.f40671q = 0;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        return AbstractC12191k.m33815i(interfaceC37368j, true, false);
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        int i13;
        this.f40651C = interfaceC37369k;
        int i14 = 0;
        this.f40668n = 0;
        this.f40671q = 0;
        InterfaceC37377s[] interfaceC37377sArr = new InterfaceC37377s[2];
        this.f40652D = interfaceC37377sArr;
        int i15 = 100;
        if ((this.f40655a & 4) != 0) {
            interfaceC37377sArr[0] = interfaceC37369k.mo3102o(100, 5);
            i13 = 1;
            i15 = 101;
        } else {
            i13 = 0;
        }
        InterfaceC37377s[] interfaceC37377sArr2 = (InterfaceC37377s[]) AbstractC24567y.m71664B(i13, this.f40652D);
        this.f40652D = interfaceC37377sArr2;
        for (InterfaceC37377s interfaceC37377s : interfaceC37377sArr2) {
            interfaceC37377s.mo102730a(f40648H);
        }
        List list = this.f40656b;
        this.f40653E = new InterfaceC37377s[list.size()];
        while (i14 < this.f40653E.length) {
            InterfaceC37377s interfaceC37377sMo3102o = this.f40651C.mo3102o(i15, 3);
            interfaceC37377sMo3102o.mo102730a((C31521c0) list.get(i14));
            this.f40653E[i14] = interfaceC37377sMo3102o;
            i14++;
            i15++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        ArrayDeque arrayDeque;
        C24566x c24566x;
        String strM36708r;
        String strM36708r2;
        long jM71666D;
        long jM36716z;
        long j7;
        long jM71659a;
        long jM36681C;
        long jM36681C2;
        C12189i c12189i;
        char c3;
        int i13;
        ArrayDeque arrayDeque2;
        int iMo102731b;
        int i14;
        boolean z4;
        loop0: while (true) {
            while (true) {
                int i15 = this.f40668n;
                ArrayDeque arrayDeque3 = this.f40666l;
                SparseArray sparseArray = this.f40657c;
                char c7 = 2;
                if (i15 == 0) {
                    int i16 = this.f40671q;
                    C13117a c13117a = this.f40665k;
                    if (i16 == 0) {
                        if (!((C37364f) interfaceC37368j).mo3094f(c13117a.f45381a, 0, 8, true)) {
                            return -1;
                        }
                        this.f40671q = 8;
                        c13117a.m36689K(0);
                        this.f40670p = c13117a.m36716z();
                        this.f40669o = c13117a.m36699i();
                    }
                    long j13 = this.f40670p;
                    if (j13 == 1) {
                        ((C37364f) interfaceC37368j).mo3094f(c13117a.f45381a, 8, 8, false);
                        this.f40671q += 8;
                        this.f40670p = c13117a.m36681C();
                    } else if (j13 == 0) {
                        long j14 = ((C37364f) interfaceC37368j).f159851y;
                        if (j14 == -1 && !arrayDeque3.isEmpty()) {
                            j14 = ((C12181a) arrayDeque3.peek()).f40608y;
                        }
                        if (j14 != -1) {
                            this.f40670p = (j14 - ((C37364f) interfaceC37368j).f159852z) + ((long) this.f40671q);
                        }
                    }
                    long j15 = this.f40670p;
                    int i17 = this.f40671q;
                    if (j15 < i17) {
                        throw ParserException.m15564c("Atom size less than header length (unsupported).");
                    }
                    long j16 = ((C37364f) interfaceC37368j).f159852z - ((long) i17);
                    int i18 = this.f40669o;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.f40654F) {
                        this.f40651C.mo3111x(new C37370l(this.f40676v, j16));
                        this.f40654F = true;
                    }
                    if (this.f40669o == 1836019558) {
                        int size = sparseArray.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            C12199s c12199s = ((C12189i) sparseArray.valueAt(i19)).f40636b;
                            c12199s.getClass();
                            c12199s.f40735b = j16;
                            c12199s.f40734a = j16;
                        }
                    }
                    int i24 = this.f40669o;
                    if (i24 == 1835295092) {
                        this.f40678x = null;
                        this.f40673s = j16 + this.f40670p;
                        this.f40668n = 2;
                        break;
                    }
                    if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1836019558 || i24 == 1953653094 || i24 == 1836475768 || i24 == 1701082227) {
                        long j17 = (((C37364f) interfaceC37368j).f159852z + this.f40670p) - 8;
                        arrayDeque3.push(new C12181a(i24, j17));
                        if (this.f40670p != this.f40671q) {
                            this.f40668n = 0;
                            this.f40671q = 0;
                            break;
                        }
                        m33806d(j17);
                        break;
                    }
                    if (i24 != 1751411826 && i24 != 1835296868 && i24 != 1836476516 && i24 != 1936286840 && i24 != 1937011556 && i24 != 1937011827 && i24 != 1668576371 && i24 != 1937011555 && i24 != 1937011578 && i24 != 1937013298 && i24 != 1937007471 && i24 != 1668232756 && i24 != 1937011571 && i24 != 1952867444 && i24 != 1952868452 && i24 != 1953196132 && i24 != 1953654136 && i24 != 1953658222 && i24 != 1886614376 && i24 != 1935763834 && i24 != 1935763823 && i24 != 1936027235 && i24 != 1970628964 && i24 != 1935828848 && i24 != 1936158820 && i24 != 1701606260 && i24 != 1835362404 && i24 != 1701671783) {
                        if (this.f40670p > 2147483647L) {
                            throw ParserException.m15564c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f40672r = null;
                        this.f40668n = 1;
                        break;
                    }
                    if (this.f40671q != 8) {
                        throw ParserException.m15564c("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j18 = this.f40670p;
                    if (j18 > 2147483647L) {
                        throw ParserException.m15564c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C13117a c13117a2 = new C13117a((int) j18);
                    System.arraycopy(c13117a.f45381a, 0, c13117a2.f45381a, 0, 8);
                    this.f40672r = c13117a2;
                    this.f40668n = 1;
                    break;
                }
                arrayDeque = this.f40667m;
                c24566x = this.f40663i;
                if (i15 == 1) {
                    int i25 = ((int) this.f40670p) - this.f40671q;
                    C13117a c13117a3 = this.f40672r;
                    if (c13117a3 != null) {
                        ((C37364f) interfaceC37368j).mo3094f(c13117a3.f45381a, 8, i25, false);
                        int i26 = this.f40669o;
                        C12182b c12182b = new C12182b(i26, c13117a3);
                        long j19 = ((C37364f) interfaceC37368j).f159852z;
                        if (!arrayDeque3.isEmpty()) {
                            ((C12181a) arrayDeque3.peek()).f40609z.add(c12182b);
                        } else if (i26 == 1936286840) {
                            c13117a3.m36689K(8);
                            int iM1494n = AbstractC0576a.m1494n(c13117a3.m36699i());
                            c13117a3.m36690L(4);
                            long jM36716z2 = c13117a3.m36716z();
                            if (iM1494n == 0) {
                                jM36681C = c13117a3.m36716z();
                                jM36681C2 = c13117a3.m36716z();
                            } else {
                                jM36681C = c13117a3.m36681C();
                                jM36681C2 = c13117a3.m36681C();
                            }
                            long j24 = jM36681C2 + j19;
                            long j25 = jM36681C;
                            long jM71666D2 = AbstractC24567y.m71666D(j25, 1000000L, jM36716z2);
                            c13117a3.m36690L(2);
                            int iM36682D = c13117a3.m36682D();
                            int[] iArr = new int[iM36682D];
                            long[] jArr = new long[iM36682D];
                            long[] jArr2 = new long[iM36682D];
                            long[] jArr3 = new long[iM36682D];
                            long jM71666D3 = jM71666D2;
                            long j26 = j25;
                            int i27 = 0;
                            while (i27 < iM36682D) {
                                int iM36699i = c13117a3.m36699i();
                                if ((iM36699i & Integer.MIN_VALUE) != 0) {
                                    throw ParserException.m15562a(null, "Unhandled indirect reference");
                                }
                                long jM36716z3 = c13117a3.m36716z();
                                iArr[i27] = iM36699i & Integer.MAX_VALUE;
                                jArr[i27] = j24;
                                jArr3[i27] = jM71666D3;
                                long j27 = j26 + jM36716z3;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int i28 = i27;
                                jM71666D3 = AbstractC24567y.m71666D(j27, 1000000L, jM36716z2);
                                jArr4[i28] = jM71666D3 - jArr5[i28];
                                c13117a3.m36690L(4);
                                j24 += (long) iArr[i28];
                                jArr2 = jArr4;
                                jArr3 = jArr5;
                                i27 = i28 + 1;
                                jM71666D2 = jM71666D2;
                                j26 = j27;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM71666D2), new C37363e(iArr, jArr, jArr2, jArr3));
                            this.f40677w = ((Long) pairCreate.first).longValue();
                            this.f40651C.mo3111x((InterfaceC37374p) pairCreate.second);
                            this.f40654F = true;
                        } else if (i26 == 1701671783 && this.f40652D.length != 0) {
                            c13117a3.m36689K(8);
                            int iM1494n2 = AbstractC0576a.m1494n(c13117a3.m36699i());
                            if (iM1494n2 == 0) {
                                strM36708r = c13117a3.m36708r();
                                strM36708r.getClass();
                                strM36708r2 = c13117a3.m36708r();
                                strM36708r2.getClass();
                                long jM36716z4 = c13117a3.m36716z();
                                long jM71666D4 = AbstractC24567y.m71666D(c13117a3.m36716z(), 1000000L, jM36716z4);
                                long j28 = this.f40677w;
                                long j29 = j28 != -9223372036854775807L ? j28 + jM71666D4 : -9223372036854775807L;
                                jM71666D = AbstractC24567y.m71666D(c13117a3.m36716z(), 1000L, jM36716z4);
                                jM36716z = c13117a3.m36716z();
                                long j34 = j29;
                                j7 = jM71666D4;
                                jM71659a = j34;
                            } else if (iM1494n2 != 1) {
                                AbstractC30007c.m91850t(46, iM1494n2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jM36716z5 = c13117a3.m36716z();
                                jM71659a = AbstractC24567y.m71666D(c13117a3.m36681C(), 1000000L, jM36716z5);
                                long jM71666D5 = AbstractC24567y.m71666D(c13117a3.m36716z(), 1000L, jM36716z5);
                                long jM36716z6 = c13117a3.m36716z();
                                strM36708r = c13117a3.m36708r();
                                strM36708r.getClass();
                                strM36708r2 = c13117a3.m36708r();
                                strM36708r2.getClass();
                                jM36716z = jM36716z6;
                                jM71666D = jM71666D5;
                                j7 = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[c13117a3.m36692a()];
                            c13117a3.m36697g(bArr, 0, c13117a3.m36692a());
                            C12891b c12891b = this.f40664j;
                            DataOutputStream dataOutputStream = c12891b.f44385b;
                            ByteArrayOutputStream byteArrayOutputStream = c12891b.f44384a;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strM36708r);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strM36708r2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jM71666D);
                                dataOutputStream.writeLong(jM36716z);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                C13117a c13117a4 = new C13117a(byteArrayOutputStream.toByteArray(), 1, (byte) 0);
                                int iM36692a = c13117a4.m36692a();
                                for (InterfaceC37377s interfaceC37377s : this.f40652D) {
                                    c13117a4.m36689K(0);
                                    interfaceC37377s.mo102732c(iM36692a, c13117a4);
                                }
                                if (jM71659a == -9223372036854775807L) {
                                    arrayDeque.addLast(new C12188h(iM36692a, j7, true));
                                    this.f40674t += iM36692a;
                                } else if (arrayDeque.isEmpty()) {
                                    if (c24566x != null) {
                                        jM71659a = c24566x.m71659a(jM71659a);
                                    }
                                    long j35 = jM71659a;
                                    for (InterfaceC37377s interfaceC37377s2 : this.f40652D) {
                                        interfaceC37377s2.mo102733d(j35, 1, iM36692a, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new C12188h(iM36692a, jM71659a, false));
                                    this.f40674t += iM36692a;
                                }
                            } catch (IOException e5) {
                                throw new RuntimeException(e5);
                            }
                        }
                    } else {
                        ((C37364f) interfaceC37368j).mo3100n(i25);
                    }
                    m33806d(((C37364f) interfaceC37368j).f159852z);
                    break;
                }
                long j36 = Long.MAX_VALUE;
                if (i15 != 2) {
                    c12189i = this.f40678x;
                    if (c12189i != null) {
                        c3 = 2;
                        i13 = 8;
                        break loop0;
                    }
                    int size2 = sparseArray.size();
                    long j37 = Long.MAX_VALUE;
                    C12189i c12189i2 = null;
                    int i29 = 0;
                    while (i29 < size2) {
                        char c14 = c7;
                        C12189i c12189i3 = (C12189i) sparseArray.valueAt(i29);
                        boolean z13 = c12189i3.f40646l;
                        C12199s c12199s2 = c12189i3.f40636b;
                        if ((z13 || c12189i3.f40640f != c12189i3.f40638d.f40752b) && (!z13 || c12189i3.f40642h != c12199s2.f40736c)) {
                            long j38 = !z13 ? c12189i3.f40638d.f40753c[c12189i3.f40640f] : c12199s2.f40738e[c12189i3.f40642h];
                            if (j38 < j37) {
                                c12189i2 = c12189i3;
                                j37 = j38;
                            }
                        }
                        i29++;
                        c7 = c14;
                    }
                    c3 = c7;
                    i13 = 8;
                    if (c12189i2 != null) {
                        int i34 = (int) ((!c12189i2.f40646l ? c12189i2.f40638d.f40753c[c12189i2.f40640f] : c12189i2.f40636b.f40738e[c12189i2.f40642h]) - ((C37364f) interfaceC37368j).f159852z);
                        if (i34 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            i34 = 0;
                        }
                        ((C37364f) interfaceC37368j).mo3100n(i34);
                        this.f40678x = c12189i2;
                        c12189i = c12189i2;
                        break loop0;
                    }
                    int i35 = (int) (this.f40673s - ((C37364f) interfaceC37368j).f159852z);
                    if (i35 < 0) {
                        throw ParserException.m15562a(null, "Offset to end of mdat was negative.");
                    }
                    ((C37364f) interfaceC37368j).mo3100n(i35);
                    this.f40668n = 0;
                    this.f40671q = 0;
                } else {
                    int size3 = sparseArray.size();
                    C12189i c12189i4 = null;
                    for (int i36 = 0; i36 < size3; i36++) {
                        C12199s c12199s3 = ((C12189i) sparseArray.valueAt(i36)).f40636b;
                        if (c12199s3.f40745l) {
                            long j39 = c12199s3.f40735b;
                            if (j39 < j36) {
                                c12189i4 = (C12189i) sparseArray.valueAt(i36);
                                j36 = j39;
                            }
                        }
                    }
                    if (c12189i4 == null) {
                        this.f40668n = 3;
                    } else {
                        int i37 = (int) (j36 - ((C37364f) interfaceC37368j).f159852z);
                        if (i37 < 0) {
                            throw ParserException.m15562a(null, "Offset to encryption data was negative.");
                        }
                        C37364f c37364f = (C37364f) interfaceC37368j;
                        c37364f.mo3100n(i37);
                        C12199s c12199s4 = c12189i4.f40636b;
                        C13117a c13117a5 = (C13117a) c12199s4.f40750q;
                        c37364f.mo3094f(c13117a5.f45381a, 0, c13117a5.f45383c, false);
                        c13117a5.m36689K(0);
                        c12199s4.f40745l = false;
                    }
                }
            }
        }
        C12199s c12199s5 = c12189i.f40636b;
        if (this.f40668n == 3) {
            int i38 = !c12189i.f40646l ? c12189i.f40638d.f40754d[c12189i.f40640f] : c12199s5.f40740g[c12189i.f40640f];
            this.f40679y = i38;
            if (c12189i.f40640f < c12189i.f40643i) {
                ((C37364f) interfaceC37368j).mo3100n(i38);
                C12198r c12198rM33800a = c12189i.m33800a();
                if (c12198rM33800a != null) {
                    C13117a c13117a6 = (C13117a) c12199s5.f40750q;
                    int i39 = c12198rM33800a.f40732d;
                    if (i39 != 0) {
                        c13117a6.m36690L(i39);
                    }
                    int i44 = c12189i.f40640f;
                    if (c12199s5.f40743j && c12199s5.f40744k[i44]) {
                        c13117a6.m36690L(c13117a6.m36682D() * 6);
                    }
                }
                if (!c12189i.m33801b()) {
                    this.f40678x = null;
                }
                this.f40668n = 3;
                return 0;
            }
            if (c12189i.f40638d.f40751a.f40724g == 1) {
                this.f40679y = i38 - 8;
                ((C37364f) interfaceC37368j).mo3100n(i13);
            }
            if ("audio/ac4".equals(c12189i.f40638d.f40751a.f40723f.f130077L)) {
                this.f40680z = c12189i.m33802c(this.f40679y, 7);
                int i45 = this.f40679y;
                C13117a c13117a7 = this.f40662h;
                AbstractC33922a.m107329c(i45, c13117a7);
                c12189i.f40635a.mo102732c(7, c13117a7);
                this.f40680z += 7;
            } else {
                this.f40680z = c12189i.m33802c(this.f40679y, 0);
            }
            this.f40679y += this.f40680z;
            this.f40668n = 4;
            this.f40649A = 0;
        }
        C12200t c12200t = c12189i.f40638d;
        C12197q c12197q = c12200t.f40751a;
        InterfaceC37377s interfaceC37377s3 = c12189i.f40635a;
        long jM71659a2 = c12189i.f40646l ? c12199s5.f40741h[c12189i.f40640f] : c12200t.f40756f[c12189i.f40640f];
        if (c24566x != null) {
            jM71659a2 = c24566x.m71659a(jM71659a2);
        }
        int i46 = c12197q.f40727j;
        C31521c0 c31521c0 = c12197q.f40723f;
        if (i46 == 0) {
            arrayDeque2 = arrayDeque;
            while (true) {
                int i47 = this.f40680z;
                int i48 = this.f40679y;
                if (i47 >= i48) {
                    break;
                }
                this.f40680z += interfaceC37377s3.mo102731b(interfaceC37368j, i48 - i47, false);
            }
        } else {
            C13117a c13117a8 = this.f40659e;
            byte[] bArr2 = c13117a8.f45381a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[c3] = 0;
            int i49 = i46 + 1;
            int i54 = 4 - i46;
            while (this.f40680z < this.f40679y) {
                int i55 = this.f40649A;
                if (i55 == 0) {
                    ((C37364f) interfaceC37368j).mo3094f(bArr2, i54, i49, false);
                    c13117a8.m36689K(0);
                    int iM36699i2 = c13117a8.m36699i();
                    if (iM36699i2 < 1) {
                        throw ParserException.m15562a(null, "Invalid NAL length");
                    }
                    this.f40649A = iM36699i2 - 1;
                    C13117a c13117a9 = this.f40658d;
                    c13117a9.m36689K(0);
                    interfaceC37377s3.mo102732c(4, c13117a9);
                    interfaceC37377s3.mo102732c(1, c13117a8);
                    if (this.f40653E.length > 0) {
                        String str = c31521c0.f130077L;
                        byte b = bArr2[4];
                        if ("video/avc".equals(str)) {
                            i14 = i54;
                            if ((b & 31) != 6) {
                            }
                            z4 = true;
                            this.f40650B = z4;
                            this.f40680z += 5;
                            this.f40679y += i14;
                            i54 = i14;
                        } else {
                            i14 = i54;
                        }
                        if ("video/hevc".equals(str) && ((b & 126) >> 1) == 39) {
                            z4 = true;
                        }
                        this.f40650B = z4;
                        this.f40680z += 5;
                        this.f40679y += i14;
                        i54 = i14;
                    } else {
                        i14 = i54;
                    }
                    z4 = false;
                    this.f40650B = z4;
                    this.f40680z += 5;
                    this.f40679y += i14;
                    i54 = i14;
                } else {
                    int i56 = i54;
                    if (this.f40650B) {
                        C13117a c13117a10 = this.f40660f;
                        c13117a10.m36686H(i55);
                        ((C37364f) interfaceC37368j).mo3094f(c13117a10.f45381a, 0, this.f40649A, false);
                        interfaceC37377s3.mo102732c(this.f40649A, c13117a10);
                        iMo102731b = this.f40649A;
                        int iM71563E = AbstractC24543a.m71563E(c13117a10.f45383c, c13117a10.f45381a);
                        c13117a10.m36689K("video/hevc".equals(c31521c0.f130077L) ? 1 : 0);
                        c13117a10.m36688J(iM71563E);
                        AbstractC32123d.m100022b(jM71659a2, c13117a10, this.f40653E);
                    } else {
                        iMo102731b = interfaceC37377s3.mo102731b(interfaceC37368j, i55, false);
                    }
                    this.f40680z += iMo102731b;
                    this.f40649A -= iMo102731b;
                    i54 = i56;
                    i49 = i49;
                    c13117a8 = c13117a8;
                }
                arrayDeque = arrayDeque;
            }
            arrayDeque2 = arrayDeque;
        }
        int i57 = c12189i.f40646l ? c12199s5.f40742i[c12189i.f40640f] ? 1 : 0 : c12189i.f40638d.f40757g[c12189i.f40640f];
        if (c12189i.m33800a() != null) {
            i57 |= 1073741824;
        }
        int i58 = i57;
        C12198r c12198rM33800a2 = c12189i.m33800a();
        long j44 = jM71659a2;
        interfaceC37377s3.mo102733d(j44, i58, this.f40679y, 0, c12198rM33800a2 != null ? c12198rM33800a2.f40731c : null);
        while (!arrayDeque2.isEmpty()) {
            C12188h c12188h = (C12188h) arrayDeque2.removeFirst();
            this.f40674t -= c12188h.f40634c;
            long jM71659a3 = c12188h.f40632a;
            if (c12188h.f40633b) {
                jM71659a3 += j44;
            }
            if (c24566x != null) {
                jM71659a3 = c24566x.m71659a(jM71659a3);
            }
            long j45 = jM71659a3;
            for (InterfaceC37377s interfaceC37377s4 : this.f40652D) {
                interfaceC37377s4.mo102733d(j45, 1, c12188h.f40634c, this.f40674t, null);
            }
        }
        if (!c12189i.m33801b()) {
            this.f40678x = null;
        }
        this.f40668n = 3;
        return 0;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
