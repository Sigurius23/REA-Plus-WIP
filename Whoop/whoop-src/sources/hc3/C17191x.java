package hc3;

import io.sentry.C20269c;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.AbstractC20591m;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: hc3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C17191x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66009a;

    /* JADX INFO: renamed from: b */
    public final String f66010b;

    public /* synthetic */ C17191x(String str, int i13) {
        this.f66009a = i13;
        this.f66010b = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x0214 A[Catch: all -> 0x0224, TryCatch #1 {all -> 0x0224, blocks: (B:109:0x01f0, B:111:0x0214, B:114:0x0226), top: B:138:0x01f0 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0226 A[Catch: all -> 0x0224, TRY_LEAVE, TryCatch #1 {all -> 0x0224, blocks: (B:109:0x01f0, B:111:0x0214, B:114:0x0226), top: B:138:0x01f0 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x024b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:148:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x016f  */
    /* JADX WARN: Code duplicated, block: B:94:0x019d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b2  */
    /* JADX INFO: renamed from: a */
    public static C17191x m48545a(C20269c c20269c, List list) {
        boolean z4;
        Double dValueOf;
        Double dValueOf2;
        String strM56725b;
        ConcurrentHashMap concurrentHashMap;
        InterfaceC20602v0 interfaceC20602v0;
        StringBuilder sb4;
        String str;
        int i13;
        String str2;
        C20535s c20535sM56711a;
        int i14;
        String str3;
        String string;
        String strM56225b;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z13;
        String str8;
        boolean z14;
        C20269c c20269c2 = c20269c;
        String str9 = "%20";
        InterfaceC20602v0 interfaceC20602v1 = c20269c2.f76120h;
        String strM56725b2 = AbstractC20591m.m56725b(list);
        String str10 = "UTF-8";
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        if (strM56725b2 != null) {
            try {
                String[] strArrSplit = strM56725b2.split(",", -1);
                int length = strArrSplit.length;
                int i15 = 0;
                boolean z15 = false;
                dValueOf = null;
                dValueOf2 = null;
                while (i15 < length) {
                    try {
                        String str11 = strArrSplit[i15];
                        if (str11.trim().startsWith("sentry-")) {
                            try {
                                int iIndexOf = str11.indexOf("=");
                                try {
                                    String strTrim = str11.substring(0, iIndexOf).trim();
                                    String strDecode = URLDecoder.decode(strTrim, str10);
                                    str7 = strM56725b2;
                                    try {
                                        String strDecode2 = URLDecoder.decode(str11.substring(iIndexOf + 1).trim(), str10);
                                        str8 = str10;
                                        try {
                                            if ("sentry-sample_rate".equals(strDecode)) {
                                                if (strDecode2 != null) {
                                                    try {
                                                        double d3 = Double.parseDouble(strDecode2);
                                                        if (AbstractC34132o.m107858C(Double.valueOf(d3), false)) {
                                                            dValueOf = Double.valueOf(d3);
                                                        } else {
                                                            dValueOf = null;
                                                        }
                                                    } catch (NumberFormatException unused) {
                                                    }
                                                } else {
                                                    dValueOf = null;
                                                }
                                            } else if (!"sentry-sample_rand".equals(strDecode)) {
                                                concurrentHashMap2.put(strDecode, strDecode2);
                                            } else if (strDecode2 != null) {
                                                try {
                                                    double d14 = Double.parseDouble(strDecode2);
                                                    z14 = false;
                                                    try {
                                                        dValueOf2 = AbstractC34132o.m107858C(Double.valueOf(d14), false) ? Double.valueOf(d14) : null;
                                                    } catch (NumberFormatException unused2) {
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        try {
                                                            interfaceC20602v1.mo16058i(EnumC20436n5.ERROR, th, "Unable to decode baggage key value pair %s", str11);
                                                            i15++;
                                                            str10 = str8;
                                                            strM56725b2 = str7;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z13 = z15;
                                                            interfaceC20602v1.mo16058i(EnumC20436n5.ERROR, th, "Unable to decode baggage header %s", str7);
                                                            z4 = z13;
                                                            if (arrayList.isEmpty()) {
                                                                strM56725b = null;
                                                            } else {
                                                                strM56725b = AbstractC20591m.m56725b(arrayList);
                                                            }
                                                            C20269c c20269c3 = new C20269c(concurrentHashMap2, dValueOf, dValueOf2, strM56725b, z4, interfaceC20602v1);
                                                            concurrentHashMap = c20269c2.f76113a;
                                                            interfaceC20602v0 = c20269c2.f76120h;
                                                            sb4 = new StringBuilder();
                                                            str = c20269c3.f76117e;
                                                            i13 = 0;
                                                            if (str != null) {
                                                                str2 = "";
                                                            } else {
                                                                str2 = "";
                                                            }
                                                            c20535sM56711a = c20269c2.f76114b.m56711a();
                                                            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
                                                            c20535sM56711a.close();
                                                            treeSet.add("sentry-sample_rate");
                                                            treeSet.add("sentry-sample_rand");
                                                            i14 = i13;
                                                            str3 = str2;
                                                            for (String str12 : treeSet) {
                                                                if ("sentry-sample_rate".equals(str12)) {
                                                                    strM56225b = C20269c.m56225b(c20269c2.f76115c);
                                                                } else if ("sentry-sample_rand".equals(str12)) {
                                                                    strM56225b = C20269c.m56225b(c20269c2.f76116d);
                                                                } else {
                                                                    strM56225b = (String) concurrentHashMap.get(str12);
                                                                }
                                                                str4 = strM56225b;
                                                                if (str4 == null) {
                                                                    str5 = str9;
                                                                } else if (i14 >= 64) {
                                                                    interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str12, 64);
                                                                    str5 = str9;
                                                                } else {
                                                                    try {
                                                                        str5 = str9;
                                                                        try {
                                                                            str6 = str3 + URLEncoder.encode(str12, "UTF-8").replaceAll("\\+", str9) + "=" + URLEncoder.encode(str4, "UTF-8").replaceAll("\\+", str9);
                                                                            if (sb4.length() + str6.length() > 8192) {
                                                                                interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str12, Integer.valueOf(DfuBaseService.ERROR_REMOTE_MASK));
                                                                            } else {
                                                                                i14++;
                                                                                sb4.append(str6);
                                                                                str3 = ",";
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str12, str4);
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        str5 = str9;
                                                                    }
                                                                }
                                                                c20269c2 = c20269c;
                                                                str9 = str5;
                                                            }
                                                            string = sb4.toString();
                                                            if (string.isEmpty()) {
                                                                return null;
                                                            }
                                                            return new C17191x(string, 1);
                                                        }
                                                    }
                                                } catch (NumberFormatException unused3) {
                                                    z14 = false;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    z14 = false;
                                                }
                                            } else {
                                                z14 = false;
                                            }
                                            try {
                                                if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
                                                    z15 = true;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                interfaceC20602v1.mo16058i(EnumC20436n5.ERROR, th, "Unable to decode baggage key value pair %s", str11);
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            interfaceC20602v1.mo16058i(EnumC20436n5.ERROR, th, "Unable to decode baggage key value pair %s", str11);
                                            i15++;
                                            str10 = str8;
                                            strM56725b2 = str7;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        str8 = str10;
                                        interfaceC20602v1.mo16058i(EnumC20436n5.ERROR, th, "Unable to decode baggage key value pair %s", str11);
                                        i15++;
                                        str10 = str8;
                                        strM56725b2 = str7;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    str7 = strM56725b2;
                                    str8 = str10;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                str7 = strM56725b2;
                            }
                        } else {
                            str7 = strM56725b2;
                            str8 = str10;
                            arrayList.add(str11.trim());
                        }
                        i15++;
                        str10 = str8;
                        strM56725b2 = str7;
                    } catch (Throwable th13) {
                        th = th13;
                        str7 = strM56725b2;
                    }
                }
                z4 = z15;
            } catch (Throwable th14) {
                th = th14;
                str7 = strM56725b2;
                z13 = false;
                dValueOf = null;
                dValueOf2 = null;
            }
        } else {
            z4 = false;
            dValueOf = null;
            dValueOf2 = null;
        }
        if (arrayList.isEmpty()) {
            strM56725b = null;
        } else {
            strM56725b = AbstractC20591m.m56725b(arrayList);
        }
        C20269c c20269c4 = new C20269c(concurrentHashMap2, dValueOf, dValueOf2, strM56725b, z4, interfaceC20602v1);
        concurrentHashMap = c20269c2.f76113a;
        interfaceC20602v0 = c20269c2.f76120h;
        sb4 = new StringBuilder();
        str = c20269c4.f76117e;
        i13 = 0;
        if (str != null || str.isEmpty()) {
            str2 = "";
        } else {
            sb4.append(str);
            int i16 = 0;
            while (i13 < str.length()) {
                if (str.charAt(i13) == ',') {
                    i16++;
                }
                i13++;
            }
            i13 = i16 + 1;
            str2 = ",";
        }
        c20535sM56711a = c20269c2.f76114b.m56711a();
        try {
            TreeSet<String> treeSet2 = new TreeSet(Collections.list(concurrentHashMap.keys()));
            c20535sM56711a.close();
            treeSet2.add("sentry-sample_rate");
            treeSet2.add("sentry-sample_rand");
            i14 = i13;
            str3 = str2;
            while (r11.hasNext()) {
                if ("sentry-sample_rate".equals(str12)) {
                    strM56225b = C20269c.m56225b(c20269c2.f76115c);
                } else if ("sentry-sample_rand".equals(str12)) {
                    strM56225b = C20269c.m56225b(c20269c2.f76116d);
                } else {
                    strM56225b = (String) concurrentHashMap.get(str12);
                }
                str4 = strM56225b;
                if (str4 == null) {
                    str5 = str9;
                } else if (i14 >= 64) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str12, 64);
                    str5 = str9;
                } else {
                    str5 = str9;
                    str6 = str3 + URLEncoder.encode(str12, "UTF-8").replaceAll("\\+", str9) + "=" + URLEncoder.encode(str4, "UTF-8").replaceAll("\\+", str9);
                    if (sb4.length() + str6.length() > 8192) {
                        interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str12, Integer.valueOf(DfuBaseService.ERROR_REMOTE_MASK));
                    } else {
                        i14++;
                        sb4.append(str6);
                        str3 = ",";
                    }
                }
                c20269c2 = c20269c;
                str9 = str5;
            }
            string = sb4.toString();
            if (string.isEmpty()) {
                return null;
            }
            return new C17191x(string, 1);
        } catch (Throwable th15) {
            try {
                c20535sM56711a.close();
                throw th15;
            } catch (Throwable th16) {
                th15.addSuppressed(th16);
                throw th15;
            }
        }
    }

    public String toString() {
        switch (this.f66009a) {
            case 0:
                return AbstractC25012a.m73377j(new StringBuilder("<"), this.f66010b, '>');
            case 1:
            default:
                return super.toString();
            case 2:
                return AbstractC25012a.m73376i(this.f66010b, "')", new StringBuilder("Phase('"));
        }
    }
}
