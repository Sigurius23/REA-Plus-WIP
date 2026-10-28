package io.sentry.android.core.internal.tombstone;

import aa3.C0656u0;
import ai.C0902h;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.material.textfield.C5057p;
import ed3.C13117a;
import io.sentry.C20321e5;
import io.sentry.EnumC20436n5;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20491o;
import io.sentry.protocol.C20500u;
import io.sentry.protocol.C20505z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC20467a0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import ng3.C26701n;
import ng3.C26702o;
import ni.C26726a;
import ni.C26727b;
import ni.C26728c;
import ni.C26729d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p014aj.C0929d;
import p108e4.AbstractC12682p;
import q63.AbstractC30007c;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: io.sentry.android.core.internal.tombstone.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20099b implements Closeable {

    /* JADX INFO: renamed from: E */
    public final HashMap f75501E;

    /* JADX INFO: renamed from: w */
    public final InputStream f75502w;

    /* JADX INFO: renamed from: x */
    public final List f75503x;

    /* JADX INFO: renamed from: y */
    public final List f75504y;

    /* JADX INFO: renamed from: z */
    public final String f75505z;

    public C20099b(InputStream inputStream, List list, List list2, String str) {
        HashMap map = new HashMap();
        this.f75501E = map;
        this.f75502w = inputStream;
        this.f75503x = list;
        this.f75504y = list2;
        this.f75505z = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    /* JADX INFO: renamed from: b */
    public final C20321e5 m55980b() throws IOException {
        DebugImage debugImageM2212t;
        DebugImage debugImageM2212t2;
        C13117a c13117a;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap map;
        int i13;
        C13117a c13117a2;
        ArrayList arrayList3;
        HashMap map2;
        ArrayList arrayList4;
        HashMap map3;
        C13117a c13117a3;
        C13117a c13117a4;
        InputStream inputStream = this.f75502w;
        if (inputStream == null) {
            throw new IOException("No InputStream provided; use parse(Tombstone) instead.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
        while (true) {
            int i14 = inputStream.read(bArr);
            if (i14 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i14);
        }
        C13117a c13117a5 = new C13117a(byteArrayOutputStream.toByteArray(), 2, (byte) 0);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str = "";
        int iM36684F = 0;
        int iM36684F2 = 0;
        String strM36711u = "";
        C5057p c5057p = null;
        while (true) {
            int iM36714x = c13117a5.m36714x();
            if (iM36714x == 0) {
                String str2 = str;
                int i15 = iM36684F2;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map4);
                Collections.unmodifiableMap(map5);
                List<C26727b> listUnmodifiableList2 = Collections.unmodifiableList(arrayList8);
                Collections.unmodifiableList(arrayList9);
                Collections.unmodifiableList(arrayList10);
                C20321e5 c20321e5 = new C20321e5();
                c20321e5.f76305U = EnumC20436n5.FATAL;
                c20321e5.f76875H = "native";
                C20491o c20491o = new C20491o();
                String strJoin = String.join(" ", listUnmodifiableList);
                if (c5057p != null) {
                    Locale locale = Locale.ROOT;
                    String strConcat = !strM36711u.isEmpty() ? strM36711u.concat(": ") : str2;
                    c20491o.f76744w = strConcat + "Fatal signal " + ((String) c5057p.f21239d) + " (" + c5057p.f21237b + "), " + ((String) c5057p.f21240e) + " (" + c5057p.f21238c + "), pid = " + iM36684F + " (" + strJoin + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    c20491o.f76744w = AbstractC30007c.m91838h(iM36684F, "Fatal exit pid = ", " (", strJoin, ")");
                }
                c20321e5.f76301Q = c20491o;
                ArrayList arrayList11 = new ArrayList();
                C0902h c0902h = null;
                for (C26727b c26727b : listUnmodifiableList2) {
                    boolean z4 = c26727b.f106327d;
                    String str3 = c26727b.f106329f;
                    String str4 = c26727b.f106328e;
                    long j7 = c26727b.f106325b;
                    if (z4 && !str4.isEmpty() && !str4.startsWith("/dev/")) {
                        boolean zIsEmpty = str3.isEmpty();
                        boolean z13 = c26727b.f106326c == 0;
                        if (zIsEmpty || !z13) {
                            if (c0902h != null && str4.equals((String) c0902h.f3297z)) {
                                c0902h.f3296y = j7;
                            }
                        } else if (c0902h == null || !str4.equals((String) c0902h.f3297z)) {
                            if (c0902h != null && (debugImageM2212t2 = c0902h.m2212t()) != null) {
                                arrayList11.add(debugImageM2212t2);
                            }
                            C0902h c0902h2 = new C0902h(4);
                            c0902h2.f3297z = str4;
                            c0902h2.f3293E = str3;
                            c0902h2.f3295x = c26727b.f106324a;
                            c0902h2.f3296y = j7;
                            c0902h = c0902h2;
                        } else {
                            c0902h.f3296y = j7;
                        }
                    }
                }
                if (c0902h != null && (debugImageM2212t = c0902h.m2212t()) != null) {
                    arrayList11.add(debugImageM2212t);
                }
                C20472d c20472d = new C20472d();
                c20472d.f76632x = new ArrayList(arrayList11);
                c20321e5.f76881N = c20472d;
                C20500u c20500u = new C20500u();
                if (c5057p != null) {
                    String str5 = (String) c5057p.f21239d;
                    c20500u.f76798w = str5;
                    c20500u.f76799x = (String) this.f75501E.get(str5);
                    C20490n c20490n = new C20490n();
                    c20490n.f76740w = EnumC20098a.TOMBSTONE.getValue();
                    c20490n.f76743z = Boolean.FALSE;
                    c20490n.f76735G = Boolean.TRUE;
                    HashMap map6 = new HashMap();
                    map6.put("number", Integer.valueOf(c5057p.f21237b));
                    map6.put("name", (String) c5057p.f21239d);
                    map6.put("code", Integer.valueOf(c5057p.f21238c));
                    map6.put("code_name", (String) c5057p.f21240e);
                    c20490n.f76733E = new HashMap(map6);
                    c20500u.f76796F = c20490n;
                }
                c20500u.f76801z = Long.valueOf(i15);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(c20500u);
                c20321e5.f76304T = new C0656u0(arrayList12);
                ArrayList arrayListM56480d = c20321e5.m56480d();
                Objects.requireNonNull(arrayListM56480d);
                C20500u c20500u2 = (C20500u) arrayListM56480d.get(0);
                ArrayList arrayList13 = new ArrayList();
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    C26729d c26729d = (C26729d) entry.getValue();
                    C20471c0 c20471c0 = new C20471c0();
                    c20471c0.f76627w = Long.valueOf(((Integer) entry.getKey()).intValue());
                    c20471c0.f76629y = c26729d.f106333b;
                    ArrayList arrayList14 = new ArrayList();
                    for (C26726a c26726a : c26729d.f106335d) {
                        String str6 = c26726a.f106323c;
                        String str7 = c26726a.f106322b;
                        if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
                            C20505z c20505z = new C20505z();
                            c20505z.f76831L = str6;
                            c20505z.f76824E = str7;
                            c20505z.f76836Q = String.format("0x%x", Long.valueOf(c26726a.f106321a));
                            Boolean boolM2335q = str7.isEmpty() ? Boolean.FALSE : C0929d.m2335q(str7, this.f75503x, this.f75504y);
                            String str8 = this.f75505z;
                            c20505z.f76830K = Boolean.valueOf((boolM2335q != null && boolM2335q.booleanValue()) || (str8 != null && str6.startsWith(str8)));
                            arrayList14.add(0, c20505z);
                        }
                    }
                    C20469b0 c20469b0 = new C20469b0();
                    c20469b0.f76614w = arrayList14;
                    c20469b0.f76617z = EnumC20467a0.NONE;
                    HashMap map7 = new HashMap();
                    for (C26728c c26728c : c26729d.f106334c) {
                        map7.put(c26728c.f106330a, String.format("0x%x", Long.valueOf(c26728c.f106331b)));
                    }
                    c20469b0.f76615x = map7;
                    c20471c0.f76624I = c20469b0;
                    if (i15 == c26729d.f106332a) {
                        c20471c0.f76620E = Boolean.TRUE;
                        c20500u2.f76795E = c20469b0;
                    }
                    arrayList13.add(c20471c0);
                }
                c20321e5.f76303S = new C0656u0(arrayList13);
                return c20321e5;
            }
            int i16 = iM36714x >>> 3;
            int i17 = iM36714x & 7;
            String str9 = str;
            switch (i16) {
                case 1:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    int iM36684F3 = (int) c13117a.m36684F();
                    int[] iArrM35486f = AbstractC12682p.m35486f(6);
                    int length = iArrM35486f.length;
                    for (int i18 = 0; i18 < length && AbstractC12682p.m35485e(iArrM35486f[i18]) != iM36684F3; i18++) {
                    }
                    iM36684F2 = i13;
                    break;
                case 2:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    C13117a.m36678d(i16, 2, i17);
                    c13117a.m36711u();
                    break;
                case 3:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    C13117a.m36678d(i16, 2, i17);
                    c13117a.m36711u();
                    break;
                case 4:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    C13117a.m36678d(i16, 2, i17);
                    c13117a.m36711u();
                    break;
                case 5:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    iM36684F = (int) c13117a.m36684F();
                    iM36684F2 = i13;
                    break;
                case 6:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    C13117a.m36678d(i16, 0, i17);
                    iM36684F2 = (int) c13117a.m36684F();
                    break;
                case 7:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    c13117a.m36684F();
                    iM36684F2 = i13;
                    break;
                case 8:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    C13117a.m36678d(i16, 2, i17);
                    c13117a.m36711u();
                    break;
                case 9:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 2, i17);
                    arrayList5.add(c13117a.m36711u());
                    iM36684F2 = i13;
                    break;
                case 10:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    map = map4;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q = c13117a.m36707q();
                    String strM36711u2 = str9;
                    String strM36711u3 = strM36711u2;
                    int iM36684F4 = 0;
                    int iM36684F5 = 0;
                    while (true) {
                        int iM36714x2 = c13117aM36707q.m36714x();
                        if (iM36714x2 == 0) {
                            arrayList2 = arrayList7;
                            c5057p = new C5057p(iM36684F4, iM36684F5, strM36711u2, strM36711u3);
                            iM36684F2 = i13;
                        } else {
                            int i19 = iM36714x2 >>> 3;
                            int i24 = iM36714x2 & 7;
                            switch (i19) {
                                case 1:
                                    C13117a.m36678d(i19, 0, i24);
                                    iM36684F4 = (int) c13117aM36707q.m36684F();
                                    break;
                                case 2:
                                    C13117a.m36678d(i19, 2, i24);
                                    strM36711u2 = c13117aM36707q.m36711u();
                                    break;
                                case 3:
                                    C13117a.m36678d(i19, 0, i24);
                                    iM36684F5 = (int) c13117aM36707q.m36684F();
                                    break;
                                case 4:
                                    C13117a.m36678d(i19, 2, i24);
                                    strM36711u3 = c13117aM36707q.m36711u();
                                    break;
                                case 5:
                                    C13117a.m36678d(i19, 0, i24);
                                    c13117aM36707q.m36696f();
                                    break;
                                case 6:
                                    C13117a.m36678d(i19, 0, i24);
                                    c13117aM36707q.m36684F();
                                    break;
                                case 7:
                                    C13117a.m36678d(i19, 0, i24);
                                    c13117aM36707q.m36684F();
                                    break;
                                case 8:
                                    C13117a.m36678d(i19, 0, i24);
                                    c13117aM36707q.m36696f();
                                    break;
                                case 9:
                                    C13117a.m36678d(i19, 0, i24);
                                    c13117aM36707q.m36684F();
                                    break;
                                case 10:
                                    C13117a.m36678d(i19, 2, i24);
                                    AbstractC34924m.m110161v(c13117aM36707q.m36707q());
                                    break;
                                default:
                                    c13117aM36707q.m36691M(i24);
                                    break;
                            }
                            arrayList7 = arrayList7;
                        }
                        break;
                    }
                    break;
                case 11:
                case 12:
                case 13:
                default:
                    c13117a5.m36691M(i17);
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    i13 = iM36684F2;
                    iM36684F2 = i13;
                    break;
                case 14:
                    c13117a = c13117a5;
                    arrayList = arrayList6;
                    map = map4;
                    C13117a.m36678d(i16, 2, i17);
                    strM36711u = c13117a.m36711u();
                    arrayList2 = arrayList7;
                    break;
                case 15:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    int i25 = 2;
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q2 = c13117a.m36707q();
                    while (true) {
                        int iM36714x3 = c13117aM36707q2.m36714x();
                        if (iM36714x3 == 0) {
                            arrayList = arrayList6;
                            map = map4;
                            arrayList7.add(new C26702o(2, false));
                            arrayList2 = arrayList7;
                            iM36684F2 = i13;
                        } else {
                            int i26 = iM36714x3 >>> 3;
                            int i27 = iM36714x3 & 7;
                            if (i26 != 1) {
                                if (i26 != i25) {
                                    c13117aM36707q2.m36691M(i27);
                                } else {
                                    C13117a.m36678d(i26, i25, i27);
                                    C13117a c13117aM36707q3 = c13117aM36707q2.m36707q();
                                    while (true) {
                                        int iM36714x4 = c13117aM36707q3.m36714x();
                                        if (iM36714x4 != 0) {
                                            int i28 = iM36714x4 >>> 3;
                                            int i29 = iM36714x4 & 7;
                                            C13117a c13117a6 = c13117aM36707q2;
                                            if (i28 == 1) {
                                                arrayList4 = arrayList6;
                                                map3 = map4;
                                                C13117a.m36678d(i28, 0, i29);
                                                int iM36684F6 = (int) c13117aM36707q3.m36684F();
                                                int[] iArrM35486f2 = AbstractC12682p.m35486f(2);
                                                int length2 = iArrM35486f2.length;
                                                for (int i34 = 0; i34 < length2 && AbstractC12682p.m35485e(iArrM35486f2[i34]) != iM36684F6; i34++) {
                                                }
                                            } else if (i28 == i25) {
                                                arrayList4 = arrayList6;
                                                map3 = map4;
                                                C13117a.m36678d(i28, 0, i29);
                                                int iM36684F7 = (int) c13117aM36707q3.m36684F();
                                                int[] iArrM35486f3 = AbstractC12682p.m35486f(6);
                                                int length3 = iArrM35486f3.length;
                                                for (int i35 = 0; i35 < length3 && AbstractC12682p.m35485e(iArrM35486f3[i35]) != iM36684F7; i35++) {
                                                }
                                            } else if (i28 != 3) {
                                                c13117aM36707q3.m36691M(i29);
                                                arrayList4 = arrayList6;
                                                map3 = map4;
                                            } else {
                                                C13117a.m36678d(i28, i25, i29);
                                                C13117a c13117aM36707q4 = c13117aM36707q3.m36707q();
                                                ArrayList arrayList15 = new ArrayList();
                                                ArrayList arrayList16 = new ArrayList();
                                                while (true) {
                                                    int iM36714x5 = c13117aM36707q4.m36714x();
                                                    if (iM36714x5 != 0) {
                                                        int i36 = iM36714x5 >>> 3;
                                                        ArrayList arrayList17 = arrayList6;
                                                        int i37 = iM36714x5 & 7;
                                                        switch (i36) {
                                                            case 1:
                                                                map4 = map4;
                                                                C13117a.m36678d(i36, 0, i37);
                                                                c13117aM36707q4.m36684F();
                                                                break;
                                                            case 2:
                                                                map4 = map4;
                                                                C13117a.m36678d(i36, 0, i37);
                                                                c13117aM36707q4.m36684F();
                                                                break;
                                                            case 3:
                                                                map4 = map4;
                                                                C13117a.m36678d(i36, 0, i37);
                                                                c13117aM36707q4.m36684F();
                                                                break;
                                                            case 4:
                                                                C13117a.m36678d(i36, 2, i37);
                                                                arrayList15.add(AbstractC34924m.m110160u(c13117aM36707q4.m36707q()));
                                                                break;
                                                            case 5:
                                                                map4 = map4;
                                                                C13117a.m36678d(i36, 0, i37);
                                                                c13117aM36707q4.m36684F();
                                                                break;
                                                            case 6:
                                                                C13117a.m36678d(i36, 2, i37);
                                                                arrayList16.add(AbstractC34924m.m110160u(c13117aM36707q4.m36707q()));
                                                                break;
                                                            default:
                                                                c13117aM36707q4.m36691M(i37);
                                                                break;
                                                        }
                                                        arrayList6 = arrayList17;
                                                        map4 = map4;
                                                    } else {
                                                        arrayList4 = arrayList6;
                                                        map3 = map4;
                                                        Collections.unmodifiableList(arrayList15);
                                                        Collections.unmodifiableList(arrayList16);
                                                    }
                                                }
                                            }
                                            c13117aM36707q2 = c13117a6;
                                            arrayList6 = arrayList4;
                                            map4 = map3;
                                            i25 = 2;
                                        }
                                    }
                                }
                                c13117a2 = c13117aM36707q2;
                                arrayList3 = arrayList6;
                                map2 = map4;
                            } else {
                                c13117a2 = c13117aM36707q2;
                                arrayList3 = arrayList6;
                                map2 = map4;
                                C13117a.m36678d(i26, i25, i27);
                                c13117a2.m36711u();
                            }
                            c13117aM36707q2 = c13117a2;
                            arrayList6 = arrayList3;
                            map4 = map2;
                        }
                        break;
                    }
                    break;
                case 16:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 2, i17);
                    AbstractC34924m.m110162w(c13117a.m36707q(), map4);
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iM36684F2 = i13;
                    break;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q5 = c13117a.m36707q();
                    String strM36711u4 = str9;
                    String strM36711u5 = strM36711u4;
                    long jM36684F = 0;
                    long jM36684F2 = 0;
                    long jM36684F3 = 0;
                    boolean zM36696f = false;
                    while (true) {
                        int iM36714x6 = c13117aM36707q5.m36714x();
                        if (iM36714x6 == 0) {
                            arrayList8.add(new C26727b(jM36684F, jM36684F2, jM36684F3, zM36696f, strM36711u4, strM36711u5));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iM36684F2 = i13;
                            break;
                        } else {
                            int i38 = iM36714x6 >>> 3;
                            int i39 = iM36714x6 & 7;
                            switch (i38) {
                                case 1:
                                    C13117a.m36678d(i38, 0, i39);
                                    jM36684F = c13117aM36707q5.m36684F();
                                    break;
                                case 2:
                                    C13117a.m36678d(i38, 0, i39);
                                    jM36684F2 = c13117aM36707q5.m36684F();
                                    break;
                                case 3:
                                    C13117a.m36678d(i38, 0, i39);
                                    jM36684F3 = c13117aM36707q5.m36684F();
                                    break;
                                case 4:
                                    C13117a.m36678d(i38, 0, i39);
                                    zM36696f = c13117aM36707q5.m36696f();
                                    break;
                                case 5:
                                    C13117a.m36678d(i38, 0, i39);
                                    c13117aM36707q5.m36696f();
                                    break;
                                case 6:
                                    C13117a.m36678d(i38, 0, i39);
                                    c13117aM36707q5.m36696f();
                                    break;
                                case 7:
                                    C13117a.m36678d(i38, 2, i39);
                                    strM36711u4 = c13117aM36707q5.m36711u();
                                    break;
                                case 8:
                                    C13117a.m36678d(i38, 2, i39);
                                    strM36711u5 = c13117aM36707q5.m36711u();
                                    break;
                                case 9:
                                    C13117a.m36678d(i38, 0, i39);
                                    c13117aM36707q5.m36684F();
                                    break;
                                default:
                                    c13117aM36707q5.m36691M(i39);
                                    break;
                            }
                        }
                    }
                    break;
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q6 = c13117a.m36707q();
                    ArrayList arrayList18 = new ArrayList();
                    while (true) {
                        int iM36714x7 = c13117aM36707q6.m36714x();
                        if (iM36714x7 == 0) {
                            C26701n c26701n = new C26701n(4);
                            Collections.unmodifiableList(arrayList18);
                            arrayList9.add(c26701n);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iM36684F2 = i13;
                        } else {
                            int i44 = iM36714x7 >>> 3;
                            int i45 = iM36714x7 & 7;
                            if (i44 == 1) {
                                c13117a3 = c13117aM36707q6;
                                C13117a.m36678d(i44, 2, i45);
                                c13117a3.m36711u();
                            } else if (i44 != 2) {
                                c13117aM36707q6.m36691M(i45);
                                c13117a3 = c13117aM36707q6;
                            } else {
                                C13117a.m36678d(i44, 2, i45);
                                C13117a c13117aM36707q7 = c13117aM36707q6.m36707q();
                                while (true) {
                                    int iM36714x8 = c13117aM36707q7.m36714x();
                                    if (iM36714x8 != 0) {
                                        int i46 = iM36714x8 >>> 3;
                                        int i47 = iM36714x8 & 7;
                                        switch (i46) {
                                            case 1:
                                                c13117aM36707q6 = c13117aM36707q6;
                                                C13117a.m36678d(i46, 2, i47);
                                                c13117aM36707q7.m36711u();
                                                break;
                                            case 2:
                                                C13117a.m36678d(i46, 0, i47);
                                                c13117aM36707q7.m36684F();
                                                break;
                                            case 3:
                                                C13117a.m36678d(i46, 0, i47);
                                                c13117aM36707q7.m36684F();
                                                break;
                                            case 4:
                                                C13117a.m36678d(i46, 0, i47);
                                                c13117aM36707q7.m36684F();
                                                break;
                                            case 5:
                                                C13117a.m36678d(i46, 2, i47);
                                                c13117aM36707q7.m36711u();
                                                break;
                                            case 6:
                                                c13117aM36707q6 = c13117aM36707q6;
                                                C13117a.m36678d(i46, 2, i47);
                                                c13117aM36707q7.m36711u();
                                                break;
                                            default:
                                                c13117aM36707q7.m36691M(i47);
                                                break;
                                        }
                                        c13117aM36707q6 = c13117aM36707q6;
                                    } else {
                                        c13117a3 = c13117aM36707q6;
                                        arrayList18.add(new C26702o(4, false));
                                    }
                                }
                            }
                            c13117aM36707q6 = c13117a3;
                        }
                        break;
                    }
                    break;
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    int i48 = 2;
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q8 = c13117a.m36707q();
                    while (true) {
                        int iM36714x9 = c13117aM36707q8.m36714x();
                        if (iM36714x9 == 0) {
                            arrayList10.add(new C26702o(3, false));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iM36684F2 = i13;
                        } else {
                            int i49 = iM36714x9 >>> 3;
                            int i54 = iM36714x9 & 7;
                            if (i49 == 1) {
                                C13117a.m36678d(i49, 0, i54);
                                c13117aM36707q8.m36684F();
                            } else if (i49 == i48) {
                                C13117a.m36678d(i49, i48, i54);
                                c13117aM36707q8.m36711u();
                            } else if (i49 == 3) {
                                C13117a.m36678d(i49, i48, i54);
                                c13117aM36707q8.m36711u();
                            } else if (i49 != 4) {
                                c13117aM36707q8.m36691M(i54);
                            } else {
                                C13117a.m36678d(i49, 0, i54);
                                c13117aM36707q8.m36684F();
                            }
                            i48 = 2;
                        }
                        break;
                    }
                    break;
                case 20:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    c13117a.m36684F();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iM36684F2 = i13;
                    break;
                case 21:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    int i55 = 2;
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q9 = c13117a.m36707q();
                    while (true) {
                        int iM36714x10 = c13117aM36707q9.m36714x();
                        if (iM36714x10 == 0) {
                            arrayList6.add(new C26701n(3));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iM36684F2 = i13;
                        } else {
                            int i56 = iM36714x10 >>> 3;
                            int i57 = iM36714x10 & 7;
                            if (i56 == 1) {
                                C13117a.m36678d(i56, i55, i57);
                                c13117aM36707q9.m36698h();
                            } else if (i56 != i55) {
                                c13117aM36707q9.m36691M(i57);
                            } else {
                                C13117a.m36678d(i56, i55, i57);
                                c13117aM36707q9.m36698h();
                            }
                            i55 = 2;
                        }
                        break;
                    }
                    break;
                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    c13117a.m36684F();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iM36684F2 = i13;
                    break;
                case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    c13117a.m36696f();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iM36684F2 = i13;
                    break;
                case 24:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 0, i17);
                    int iM36684F8 = (int) c13117a.m36684F();
                    int[] iArrM35486f4 = AbstractC12682p.m35486f(6);
                    int length4 = iArrM35486f4.length;
                    for (int i58 = 0; i58 < length4 && AbstractC12682p.m35485e(iArrM35486f4[i58]) != iM36684F8; i58++) {
                    }
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iM36684F2 = i13;
                    break;
                case 25:
                    c13117a = c13117a5;
                    i13 = iM36684F2;
                    C13117a.m36678d(i16, 2, i17);
                    AbstractC34924m.m110162w(c13117a.m36707q(), map5);
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iM36684F2 = i13;
                    break;
                case 26:
                    C13117a.m36678d(i16, 2, i17);
                    C13117a c13117aM36707q10 = c13117a5.m36707q();
                    ArrayList arrayList19 = new ArrayList();
                    while (true) {
                        int iM36714x11 = c13117aM36707q10.m36714x();
                        if (iM36714x11 == 0) {
                            c13117a = c13117a5;
                            i13 = iM36684F2;
                            Collections.unmodifiableList(arrayList19);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iM36684F2 = i13;
                        } else {
                            C13117a c13117a7 = c13117a5;
                            int i59 = iM36714x11 >>> 3;
                            int i64 = iM36714x11 & 7;
                            int i65 = iM36684F2;
                            if (i59 == 1) {
                                c13117a4 = c13117aM36707q10;
                                C13117a.m36678d(i59, 0, i64);
                                c13117a4.m36684F();
                            } else if (i59 != 2) {
                                c13117aM36707q10.m36691M(i64);
                                c13117a4 = c13117aM36707q10;
                            } else {
                                C13117a.m36678d(i59, 2, i64);
                                C13117a c13117aM36707q11 = c13117aM36707q10.m36707q();
                                while (true) {
                                    int iM36714x12 = c13117aM36707q11.m36714x();
                                    if (iM36714x12 != 0) {
                                        int i66 = iM36714x12 >>> 3;
                                        int i67 = iM36714x12 & 7;
                                        C13117a c13117a8 = c13117aM36707q10;
                                        if (i66 == 1) {
                                            C13117a.m36678d(i66, 2, i67);
                                            AbstractC34924m.m110160u(c13117aM36707q11.m36707q());
                                        } else if (i66 == 2) {
                                            C13117a.m36678d(i66, 0, i67);
                                            c13117aM36707q11.m36684F();
                                        } else if (i66 != 3) {
                                            c13117aM36707q11.m36691M(i67);
                                        } else {
                                            C13117a.m36678d(i66, 0, i67);
                                            c13117aM36707q11.m36684F();
                                        }
                                        c13117aM36707q10 = c13117a8;
                                    } else {
                                        c13117a4 = c13117aM36707q10;
                                        arrayList19.add(new C26702o(5, false));
                                    }
                                }
                            }
                            c13117aM36707q10 = c13117a4;
                            c13117a5 = c13117a7;
                            iM36684F2 = i65;
                        }
                        break;
                    }
                    break;
            }
            str = str9;
            arrayList7 = arrayList2;
            c13117a5 = c13117a;
            arrayList6 = arrayList;
            map4 = map;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f75502w;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
