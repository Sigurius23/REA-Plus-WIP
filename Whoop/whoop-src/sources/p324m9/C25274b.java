package p324m9;

import java.util.ArrayList;
import java.util.UUID;
import p499t9.C33637j0;
import p499t9.C33642m;
import p499t9.InterfaceC33639k0;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34600k;
import p516u8.C34602l;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.InterfaceC34594h;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: m9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C25274b implements InterfaceC33639k0 {

    /* JADX INFO: renamed from: a */
    public final int f99169a;

    /* JADX INFO: renamed from: b */
    public final C34610p f99170b;

    /* JADX INFO: renamed from: c */
    public final C33642m f99171c = new C33642m();

    /* JADX INFO: renamed from: d */
    public C34610p f99172d;

    /* JADX INFO: renamed from: e */
    public InterfaceC33639k0 f99173e;

    /* JADX INFO: renamed from: f */
    public long f99174f;

    public C25274b(int i13, int i14, C34610p c34610p) {
        this.f99169a = i14;
        this.f99170b = c34610p;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013e A[EDGE_INSN: B:100:0x013e->B:83:0x013e BREAK  A[LOOP:2: B:76:0x011a->B:80:0x012f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f A[LOOP:2: B:76:0x011a->B:80:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x0154  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ed A[SYNTHETIC] */
    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: a */
    public final void mo36173a(C34610p c34610p) {
        String str;
        AbstractC41023g0 abstractC41023g0;
        String str2;
        String str3;
        C34585c0 c34585c0;
        float f13;
        C34602l c34602l;
        C34602l c34602l2;
        ArrayList arrayList;
        String str4;
        C34602l c34602l3;
        int size;
        C34600k[] c34600kArr;
        int length;
        int i13;
        C34600k c34600k;
        int i14;
        int i15;
        UUID uuid;
        int i16;
        C34600k[] c34600kArr2;
        int length2;
        int i17;
        C34600k c34600k2;
        String string;
        C34610p c34610p2 = c34610p;
        C34610p c34610p3 = this.f99170b;
        if (c34610p3 == null) {
            c34610p2 = c34610p;
        } else if (c34610p2 == c34610p3) {
            c34610p2.getClass();
        } else {
            int iM109376i = AbstractC34587d0.m109376i(c34610p2.f145783n);
            String str5 = c34610p3.f145770a;
            C34585c0 c34585c0M109366b = c34610p3.f145781l;
            AbstractC41023g0 abstractC41023g1 = c34610p3.f145772c;
            int i18 = c34610p3.f145766K;
            int i19 = c34610p3.f145767L;
            String str6 = c34610p3.f145771b;
            if (str6 == null) {
                str6 = c34610p2.f145771b;
            }
            if (abstractC41023g1.isEmpty()) {
                abstractC41023g1 = c34610p2.f145772c;
            }
            String str7 = c34610p2.f145773d;
            if ((iM109376i == 3 || iM109376i == 1) && (str = c34610p3.f145773d) != null) {
                str7 = str;
            }
            int i24 = c34610p2.f145777h;
            if (i24 == -1) {
                i24 = c34610p3.f145777h;
            }
            int i25 = c34610p2.f145778i;
            if (i25 == -1) {
                i25 = c34610p3.f145778i;
            }
            String str8 = c34610p2.f145780k;
            if (str8 == null) {
                String[] strArrM121906T = AbstractC38065t.m121906T(c34610p3.f145780k);
                if (strArrM121906T.length == 0) {
                    abstractC41023g0 = abstractC41023g1;
                    str2 = str8;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    abstractC41023g0 = abstractC41023g1;
                    int length3 = strArrM121906T.length;
                    str2 = str8;
                    int i26 = 0;
                    while (i26 < length3) {
                        int i27 = length3;
                        String str9 = strArrM121906T[i26];
                        int i28 = i26;
                        if (iM109376i == AbstractC34587d0.m109376i(AbstractC34587d0.m109372e(str9))) {
                            if (sb4.length() > 0) {
                                sb4.append(",");
                            }
                            sb4.append(str9);
                        }
                        i26 = i28 + 1;
                        length3 = i27;
                    }
                    if (sb4.length() > 0) {
                        string = sb4.toString();
                    }
                    if (AbstractC38065t.m121906T(string).length == 1) {
                        str3 = string;
                    }
                    c34585c0 = c34610p2.f145781l;
                    if (c34585c0 != null) {
                        c34585c0M109366b = c34585c0.m109366b(c34585c0M109366b);
                    }
                    f13 = c34610p2.f145792w;
                    if (f13 == -1.0f && iM109376i == 2) {
                        f13 = c34610p3.f145792w;
                    }
                    int i29 = c34610p2.f145774e | c34610p3.f145774e;
                    int i34 = c34610p2.f145775f | c34610p3.f145775f;
                    c34602l = c34610p3.f145787r;
                    c34602l2 = c34610p2.f145787r;
                    arrayList = new ArrayList();
                    if (c34602l != null) {
                        String str10 = c34602l.f145689y;
                        c34600kArr2 = c34602l.f145687w;
                        length2 = c34600kArr2.length;
                        i17 = 0;
                        while (i17 < length2) {
                            int i35 = length2;
                            c34600k2 = c34600kArr2[i17];
                            int i36 = i17;
                            if (c34600k2.f145679E != null) {
                                arrayList.add(c34600k2);
                            }
                            i17 = i36 + 1;
                            length2 = i35;
                        }
                        str4 = str10;
                    } else {
                        str4 = null;
                    }
                    if (c34602l2 != null) {
                        if (str4 == null) {
                            str4 = c34602l2.f145689y;
                        }
                        size = arrayList.size();
                        c34600kArr = c34602l2.f145687w;
                        String str11 = str4;
                        length = c34600kArr.length;
                        i13 = 0;
                        while (i13 < length) {
                            int i37 = length;
                            c34600k = c34600kArr[i13];
                            int i38 = i13;
                            if (c34600k.f145679E != null) {
                                uuid = c34600k.f145681x;
                                i15 = i19;
                                i16 = 0;
                                while (true) {
                                    if (i16 >= size) {
                                        i14 = size;
                                        arrayList.add(c34600k);
                                        break;
                                    } else {
                                        i14 = size;
                                        if (((C34600k) arrayList.get(i16)).f145681x.equals(uuid)) {
                                            break;
                                        }
                                        i16++;
                                        size = i14;
                                    }
                                }
                            } else {
                                i14 = size;
                                i15 = i19;
                            }
                            i13 = i38 + 1;
                            length = i37;
                            i19 = i15;
                            size = i14;
                        }
                        str4 = str11;
                    }
                    int i39 = i19;
                    if (arrayList.isEmpty()) {
                        c34602l3 = null;
                    } else {
                        c34602l3 = new C34602l(str4, arrayList);
                    }
                    C34608o c34608oM109410a = c34610p.m109410a();
                    c34608oM109410a.f145729a = str5;
                    c34608oM109410a.f145730b = str6;
                    c34608oM109410a.f145731c = AbstractC41023g0.m133252m(abstractC41023g0);
                    c34608oM109410a.f145732d = str7;
                    c34608oM109410a.f145733e = i29;
                    c34608oM109410a.f145734f = i34;
                    c34608oM109410a.f145736h = i24;
                    c34608oM109410a.f145737i = i25;
                    c34608oM109410a.f145738j = str3;
                    c34608oM109410a.f145739k = c34585c0M109366b;
                    c34608oM109410a.f145745q = c34602l3;
                    c34608oM109410a.f145750v = f13;
                    c34608oM109410a.f145726J = i18;
                    c34608oM109410a.f145727K = i39;
                    c34610p2 = new C34610p(c34608oM109410a);
                }
                string = null;
                if (AbstractC38065t.m121906T(string).length == 1) {
                    str3 = string;
                }
                c34585c0 = c34610p2.f145781l;
                if (c34585c0 != null) {
                    c34585c0M109366b = c34585c0.m109366b(c34585c0M109366b);
                }
                f13 = c34610p2.f145792w;
                if (f13 == -1.0f) {
                    f13 = c34610p3.f145792w;
                }
                int i210 = c34610p2.f145774e | c34610p3.f145774e;
                int i310 = c34610p2.f145775f | c34610p3.f145775f;
                c34602l = c34610p3.f145787r;
                c34602l2 = c34610p2.f145787r;
                arrayList = new ArrayList();
                if (c34602l != null) {
                    String str12 = c34602l.f145689y;
                    c34600kArr2 = c34602l.f145687w;
                    length2 = c34600kArr2.length;
                    i17 = 0;
                    while (i17 < length2) {
                        int i311 = length2;
                        c34600k2 = c34600kArr2[i17];
                        int i312 = i17;
                        if (c34600k2.f145679E != null) {
                            arrayList.add(c34600k2);
                        }
                        i17 = i312 + 1;
                        length2 = i311;
                    }
                    str4 = str12;
                } else {
                    str4 = null;
                }
                if (c34602l2 != null) {
                    if (str4 == null) {
                        str4 = c34602l2.f145689y;
                    }
                    size = arrayList.size();
                    c34600kArr = c34602l2.f145687w;
                    String str13 = str4;
                    length = c34600kArr.length;
                    i13 = 0;
                    while (i13 < length) {
                        int i313 = length;
                        c34600k = c34600kArr[i13];
                        int i314 = i13;
                        if (c34600k.f145679E != null) {
                            uuid = c34600k.f145681x;
                            i15 = i19;
                            i16 = 0;
                            while (true) {
                                if (i16 >= size) {
                                    i14 = size;
                                    arrayList.add(c34600k);
                                    break;
                                    break;
                                } else {
                                    i14 = size;
                                    if (((C34600k) arrayList.get(i16)).f145681x.equals(uuid)) {
                                        break;
                                        break;
                                    } else {
                                        i16++;
                                        size = i14;
                                    }
                                }
                            }
                        } else {
                            i14 = size;
                            i15 = i19;
                        }
                        i13 = i314 + 1;
                        length = i313;
                        i19 = i15;
                        size = i14;
                    }
                    str4 = str13;
                }
                int i315 = i19;
                if (arrayList.isEmpty()) {
                    c34602l3 = null;
                } else {
                    c34602l3 = new C34602l(str4, arrayList);
                }
                C34608o c34608oM109410a2 = c34610p.m109410a();
                c34608oM109410a2.f145729a = str5;
                c34608oM109410a2.f145730b = str6;
                c34608oM109410a2.f145731c = AbstractC41023g0.m133252m(abstractC41023g0);
                c34608oM109410a2.f145732d = str7;
                c34608oM109410a2.f145733e = i210;
                c34608oM109410a2.f145734f = i310;
                c34608oM109410a2.f145736h = i24;
                c34608oM109410a2.f145737i = i25;
                c34608oM109410a2.f145738j = str3;
                c34608oM109410a2.f145739k = c34585c0M109366b;
                c34608oM109410a2.f145745q = c34602l3;
                c34608oM109410a2.f145750v = f13;
                c34608oM109410a2.f145726J = i18;
                c34608oM109410a2.f145727K = i315;
                c34610p2 = new C34610p(c34608oM109410a2);
            } else {
                abstractC41023g0 = abstractC41023g1;
                str2 = str8;
            }
            str3 = str2;
            c34585c0 = c34610p2.f145781l;
            if (c34585c0 != null) {
                c34585c0M109366b = c34585c0.m109366b(c34585c0M109366b);
            }
            f13 = c34610p2.f145792w;
            if (f13 == -1.0f) {
                f13 = c34610p3.f145792w;
            }
            int i211 = c34610p2.f145774e | c34610p3.f145774e;
            int i316 = c34610p2.f145775f | c34610p3.f145775f;
            c34602l = c34610p3.f145787r;
            c34602l2 = c34610p2.f145787r;
            arrayList = new ArrayList();
            if (c34602l != null) {
                String str14 = c34602l.f145689y;
                c34600kArr2 = c34602l.f145687w;
                length2 = c34600kArr2.length;
                i17 = 0;
                while (i17 < length2) {
                    int i317 = length2;
                    c34600k2 = c34600kArr2[i17];
                    int i318 = i17;
                    if (c34600k2.f145679E != null) {
                        arrayList.add(c34600k2);
                    }
                    i17 = i318 + 1;
                    length2 = i317;
                }
                str4 = str14;
            } else {
                str4 = null;
            }
            if (c34602l2 != null) {
                if (str4 == null) {
                    str4 = c34602l2.f145689y;
                }
                size = arrayList.size();
                c34600kArr = c34602l2.f145687w;
                String str15 = str4;
                length = c34600kArr.length;
                i13 = 0;
                while (i13 < length) {
                    int i319 = length;
                    c34600k = c34600kArr[i13];
                    int i3110 = i13;
                    if (c34600k.f145679E != null) {
                        uuid = c34600k.f145681x;
                        i15 = i19;
                        i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                i14 = size;
                                arrayList.add(c34600k);
                                break;
                                break;
                            } else {
                                i14 = size;
                                if (((C34600k) arrayList.get(i16)).f145681x.equals(uuid)) {
                                    break;
                                    break;
                                } else {
                                    i16++;
                                    size = i14;
                                }
                            }
                        }
                    } else {
                        i14 = size;
                        i15 = i19;
                    }
                    i13 = i3110 + 1;
                    length = i319;
                    i19 = i15;
                    size = i14;
                }
                str4 = str15;
            }
            int i3111 = i19;
            if (arrayList.isEmpty()) {
                c34602l3 = null;
            } else {
                c34602l3 = new C34602l(str4, arrayList);
            }
            C34608o c34608oM109410a3 = c34610p.m109410a();
            c34608oM109410a3.f145729a = str5;
            c34608oM109410a3.f145730b = str6;
            c34608oM109410a3.f145731c = AbstractC41023g0.m133252m(abstractC41023g0);
            c34608oM109410a3.f145732d = str7;
            c34608oM109410a3.f145733e = i211;
            c34608oM109410a3.f145734f = i316;
            c34608oM109410a3.f145736h = i24;
            c34608oM109410a3.f145737i = i25;
            c34608oM109410a3.f145738j = str3;
            c34608oM109410a3.f145739k = c34585c0M109366b;
            c34608oM109410a3.f145745q = c34602l3;
            c34608oM109410a3.f145750v = f13;
            c34608oM109410a3.f145726J = i18;
            c34608oM109410a3.f145727K = i3111;
            c34610p2 = new C34610p(c34608oM109410a3);
        }
        this.f99172d = c34610p2;
        InterfaceC33639k0 interfaceC33639k0 = this.f99173e;
        int i44 = AbstractC38065t.f163031a;
        interfaceC33639k0.mo36173a(c34610p2);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: b */
    public final void mo36174b(long j7, int i13, int i14, int i15, C33637j0 c33637j0) {
        long j13 = this.f99174f;
        if (j13 != -9223372036854775807L && j7 >= j13) {
            this.f99173e = this.f99171c;
        }
        InterfaceC33639k0 interfaceC33639k0 = this.f99173e;
        int i16 = AbstractC38065t.f163031a;
        interfaceC33639k0.mo36174b(j7, i13, i14, i15, c33637j0);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: c */
    public final int mo36175c(InterfaceC34594h interfaceC34594h, int i13, boolean z4) {
        InterfaceC33639k0 interfaceC33639k0 = this.f99173e;
        int i14 = AbstractC38065t.f163031a;
        return interfaceC33639k0.mo36175c(interfaceC34594h, i13, z4);
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: d */
    public final void mo36176d(C38059n c38059n, int i13, int i14) {
        InterfaceC33639k0 interfaceC33639k0 = this.f99173e;
        int i15 = AbstractC38065t.f163031a;
        interfaceC33639k0.mo36176d(c38059n, i13, 0);
    }
}
