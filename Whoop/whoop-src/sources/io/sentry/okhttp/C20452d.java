package io.sentry.okhttp;

import ae3.C0801i;
import androidx.room.AbstractC1772c1;
import com.whoop.data.repositories.C6656c;
import hc3.C17191x;
import io.getstream.chat.android.client.api.QueryParams;
import io.sentry.C20315e;
import io.sentry.C20323e7;
import io.sentry.C20337g0;
import io.sentry.C20371i4;
import io.sentry.C20407l0;
import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.C20621w6;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20408l1;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.AbstractC20580b;
import io.sentry.util.AbstractC20587i;
import io.sentry.util.AbstractC20590l;
import io.sentry.util.network.C20597e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p005a3.C0237p;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p211i5.C18090c;
import p218ic.C18374o;
import p249jc.AbstractC21598x;
import p477s2.AbstractC32073e;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34818h0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import wb3.AbstractC37056f;
import yb3.AbstractC39397a;
import zd3.C40571o;

/* JADX INFO: renamed from: io.sentry.okhttp.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C20452d implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC20308d1 f76550w;

    static {
        C20412l5.m56626d().m56628b("maven:io.sentry:sentry-okhttp", "8.41.0");
    }

    public C20452d() {
        AbstractC37056f.m118958J(new C20407l0(500, 599));
        AbstractC37056f.m118958J(C20513q6.DEFAULT_PROPAGATION_TARGETS);
        this.f76550w = C20371i4.f76402a;
        AbstractC21598x.m60683i("OkHttp");
    }

    /* JADX INFO: renamed from: a */
    public static C38445a m56649a(C20452d c20452d, C34850x0 resp) {
        Charset charsetM109889a;
        AbstractC22676k.m65750j(resp, "resp");
        InterfaceC20602v0 logger = c20452d.f76550w.mo56432l().getLogger();
        AbstractC22676k.m65749i(logger, "getLogger(...)");
        AbstractC34799a1 abstractC34799a1 = resp.f146778G;
        if (abstractC34799a1 != null) {
            try {
                C34818h0 c34818h0Mo1942k = abstractC34799a1.mo1942k();
                String str = c34818h0Mo1942k != null ? c34818h0Mo1942k.f146591a : null;
                byte[] bArrM109859h = resp.m109934i(((long) 153600) + 1).m109859h();
                String strName = (c34818h0Mo1942k == null || (charsetM109889a = c34818h0Mo1942k.m109889a(AbstractC39397a.f169546a)) == null) ? null : charsetM109889a.name();
                if (strName == null) {
                    strName = "UTF-8";
                }
                return AbstractC32073e.m99761t(bArrM109859h, str, strName, logger);
            } catch (Exception e5) {
                logger.mo16066m(EnumC20436n5.ERROR, AbstractC2875y.m8298k(e5, new StringBuilder("Failed to read http response body for Network Details: ")), new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashMap m56650c(C34807d0 c34807d0) {
        AbstractC22676k.m65750j(c34807d0, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = c34807d0.size();
        for (int i13 = 0; i13 < size; i13++) {
            String strM109864c = c34807d0.m109864c(i13);
            String strM109867g = c34807d0.m109867g(i13);
            String str = (String) linkedHashMap.get(strM109864c);
            if (str != null) {
                linkedHashMap.put(strM109864c, str + "; " + strM109867g);
            } else {
                linkedHashMap.put(strM109864c, strM109867g);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final void m56651b(C34832o0 c34832o0, Integer num, C34850x0 c34850x0, long j7, C20597e c20597e) {
        AbstractC34799a1 abstractC34799a1;
        EnumC20436n5 enumC20436n5;
        String str = c34832o0.f146712a.f146570i;
        String str2 = c34832o0.f146713b;
        C20315e c20315e = new C20315e();
        C0237p c0237pM5371H = AbstractC1772c1.m5371H(str);
        c20315e.f76286E = "http";
        c20315e.f76288G = "http";
        String str3 = (String) c0237pM5371H.f812x;
        if (str3 != null) {
            c20315e.m56470c(str3, QueryParams.URL);
        }
        c20315e.m56470c(str2.toUpperCase(Locale.ROOT), "method");
        String str4 = (String) c0237pM5371H.f813y;
        if (str4 != null) {
            c20315e.m56470c(str4, "http.query");
        }
        String str5 = (String) c0237pM5371H.f814z;
        if (str5 != null) {
            c20315e.m56470c(str5, "http.fragment");
        }
        Long lValueOf = null;
        if (num != null) {
            c20315e.m56470c(num, "status_code");
            int iIntValue = num.intValue();
            C20407l0 c20407l0 = AbstractC20580b.f77080a;
            if (iIntValue < c20407l0.f76481a || iIntValue > c20407l0.f76482b) {
                int iIntValue2 = num.intValue();
                C20407l0 c20407l1 = AbstractC20580b.f77081b;
                enumC20436n5 = (iIntValue2 < c20407l1.f76481a || iIntValue2 > c20407l1.f76482b) ? null : EnumC20436n5.ERROR;
            } else {
                enumC20436n5 = EnumC20436n5.WARNING;
            }
            c20315e.f76290I = enumC20436n5;
        }
        AbstractC34846v0 abstractC34846v0 = c34832o0.f146715d;
        Long lValueOf2 = abstractC34846v0 != null ? Long.valueOf(abstractC34846v0.contentLength()) : null;
        C20451c c20451c = new C20451c(c20315e, 0);
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            c20451c.invoke(lValueOf2);
        }
        if (c34850x0 != null && (abstractC34799a1 = c34850x0.f146778G) != null) {
            lValueOf = Long.valueOf(abstractC34799a1.mo1941i());
        }
        C20451c c20451c2 = new C20451c(c20315e, 1);
        if (lValueOf != null && lValueOf.longValue() != -1) {
            c20451c2.invoke(lValueOf);
        }
        C20337g0 c20337g0 = new C20337g0();
        c20337g0.m56493d(c34832o0, "okHttp:request");
        if (c34850x0 != null) {
            c20337g0.m56493d(c34850x0, "okHttp:response");
        }
        if (c20597e != null) {
            c20337g0.m56493d(c20597e, "sentry:replayNetworkDetails");
        }
        c20315e.m56470c(Long.valueOf(j7), "http.start_timestamp");
        c20315e.m56470c(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        this.f76550w.mo56429i(c20315e, c20337g0);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0241 A[Catch: all -> 0x01bf, TRY_ENTER, TryCatch #6 {all -> 0x01bf, blocks: (B:78:0x01b9, B:109:0x0241, B:110:0x0249), top: B:124:0x01b9 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0295  */
    /* JADX WARN: Code duplicated, block: B:121:0x029d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[EDGE_INSN: B:54:0x00f7->B:129:0x00f8 BREAK  A[LOOP:1: B:47:0x00dd->B:142:0x00dd]] */
    /* JADX WARN: Code duplicated, block: B:57:0x010e A[Catch: all -> 0x0146, IOException -> 0x014b, TryCatch #7 {IOException -> 0x014b, all -> 0x0146, blocks: (B:55:0x00f8, B:57:0x010e, B:59:0x0125, B:61:0x013b, B:66:0x0150, B:68:0x0156, B:69:0x015f, B:71:0x0167, B:74:0x0174, B:75:0x01a4), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0125 A[Catch: all -> 0x0146, IOException -> 0x014b, TryCatch #7 {IOException -> 0x014b, all -> 0x0146, blocks: (B:55:0x00f8, B:57:0x010e, B:59:0x0125, B:61:0x013b, B:66:0x0150, B:68:0x0156, B:69:0x015f, B:71:0x0167, B:74:0x0174, B:75:0x01a4), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013b A[Catch: all -> 0x0146, IOException -> 0x014b, TryCatch #7 {IOException -> 0x014b, all -> 0x0146, blocks: (B:55:0x00f8, B:57:0x010e, B:59:0x0125, B:61:0x013b, B:66:0x0150, B:68:0x0156, B:69:0x015f, B:71:0x0167, B:74:0x0174, B:75:0x01a4), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0156 A[Catch: all -> 0x0146, IOException -> 0x014b, TryCatch #7 {IOException -> 0x014b, all -> 0x0146, blocks: (B:55:0x00f8, B:57:0x010e, B:59:0x0125, B:61:0x013b, B:66:0x0150, B:68:0x0156, B:69:0x015f, B:71:0x0167, B:74:0x0174, B:75:0x01a4), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0167 A[Catch: all -> 0x0146, IOException -> 0x014b, TryCatch #7 {IOException -> 0x014b, all -> 0x0146, blocks: (B:55:0x00f8, B:57:0x010e, B:59:0x0125, B:61:0x013b, B:66:0x0150, B:68:0x0156, B:69:0x015f, B:71:0x0167, B:74:0x0174, B:75:0x01a4), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174 A[Catch: all -> 0x0146, IOException -> 0x014b, TryCatch #7 {IOException -> 0x014b, all -> 0x0146, blocks: (B:55:0x00f8, B:57:0x010e, B:59:0x0125, B:61:0x013b, B:66:0x0150, B:68:0x0156, B:69:0x015f, B:71:0x0167, B:74:0x0174, B:75:0x01a4), top: B:129:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0222  */
    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) throws Throwable {
        InterfaceC20408l1 interfaceC20408l1Mo56465w;
        C20323e7 c20323e7Mo56462t;
        List list;
        List list2;
        Iterator it;
        String str;
        C20597e c20597e;
        Integer numValueOf;
        C34850x0 c34850x0M1939b;
        C34850x0 c34850x0;
        C34830n0 c34830n0M109907b;
        AbstractC34846v0 abstractC34846v0;
        Long lValueOf;
        int i13;
        C34850x0 c34850x1;
        C0237p c0237pM118981f0;
        C17191x c17191x;
        C0237p c0237p;
        Iterator it3;
        String str2;
        String str3;
        String str4;
        AbstractC22676k.m65750j(chain, "chain");
        C22669g0 c22669g0 = new C22669g0();
        C0801i c0801i = (C0801i) chain;
        C40571o c40571o = c0801i.f2951a;
        C34832o0 c34832o0 = c0801i.f2955e;
        c22669g0.f89336w = c34832o0;
        C0237p c0237pM5371H = AbstractC1772c1.m5371H(c34832o0.f146712a.f146570i);
        String str5 = (String) c0237pM5371H.f812x;
        if (str5 == null) {
            str5 = "unknown";
        }
        String str6 = ((C34832o0) c22669g0.f89336w).f146713b;
        ConcurrentHashMap concurrentHashMap = AbstractC20449a.f76546a;
        boolean zContainsKey = concurrentHashMap.containsKey(c40571o);
        InterfaceC20308d1 interfaceC20308d1 = this.f76550w;
        try {
            try {
                if (!zContainsKey) {
                    InterfaceC20408l1 interfaceC20408l1Mo56433m = AbstractC20587i.f77090a ? interfaceC20308d1.mo56433m() : interfaceC20308d1.mo56426f();
                    if (interfaceC20408l1Mo56433m != null) {
                        interfaceC20408l1Mo56465w = interfaceC20408l1Mo56433m.mo56465w("http.client", str6 + ' ' + str5);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (interfaceC20408l1Mo56465w != null) {
                        c20323e7Mo56462t = interfaceC20408l1Mo56465w.mo56462t();
                    } else {
                        c20323e7Mo56462t = null;
                    }
                    if (c20323e7Mo56462t != null) {
                        c20323e7Mo56462t.f76314I = "auto.http.okhttp";
                    }
                    if (interfaceC20408l1Mo56465w != null) {
                        str3 = (String) c0237pM5371H.f813y;
                        if (str3 != null) {
                            interfaceC20408l1Mo56465w.mo56459o(str3, "http.query");
                        }
                        str4 = (String) c0237pM5371H.f814z;
                        if (str4 != null) {
                            interfaceC20408l1Mo56465w.mo56459o(str4, "http.fragment");
                        }
                    }
                    C34832o0 c34832o1 = (C34832o0) c22669g0.f89336w;
                    String str7 = c34832o1.f146712a.f146570i;
                    String str8 = c34832o1.f146713b;
                    list = interfaceC20308d1.mo56432l().getSessionReplay().f77075q;
                    list2 = interfaceC20308d1.mo56432l().getSessionReplay().f77076r;
                    if (list2 != null) {
                        if (list != null) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    c20597e = null;
                                    break;
                                }
                                str = (String) it.next();
                                if (str == null) {
                                }
                            }
                        } else {
                            c20597e = null;
                            break;
                        }
                    } else {
                        it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                str2 = (String) it3.next();
                                if (str2 != null || !str7.matches(str2)) {
                                }
                            } else if (list != null) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        str = (String) it.next();
                                        if (str == null && str7.matches(str)) {
                                            c20597e = new C20597e(str8);
                                            break;
                                        }
                                    }
                                }
                            }
                            c20597e = null;
                            break;
                        }
                    }
                    c34830n0M109907b = ((C34832o0) c22669g0.f89336w).m109907b();
                    if (!AbstractC20590l.m56723a("auto.http.okhttp", interfaceC20308d1.mo56432l().getIgnoredSpanOrigins())) {
                        Object obj = c22669g0.f89336w;
                        c0237pM118981f0 = AbstractC37056f.m118981f0(interfaceC20308d1, ((C34832o0) obj).f146712a.f146570i, ((C34832o0) obj).f146714c.m109868j("baggage"), interfaceC20408l1Mo56465w);
                        if (c0237pM118981f0 != null) {
                            C20621w6 c20621w6 = (C20621w6) c0237pM118981f0.f812x;
                            c20621w6.getClass();
                            c34830n0M109907b.m109900a("sentry-trace", c20621w6.m56759a());
                            c17191x = (C17191x) c0237pM118981f0.f813y;
                            if (c17191x != null) {
                                c34830n0M109907b.f146689c.m65769j("baggage");
                                c34830n0M109907b.m109900a("baggage", c17191x.f66010b);
                            }
                            c0237p = (C0237p) c0237pM118981f0.f814z;
                            if (c0237p != null) {
                                c34830n0M109907b.m109900a("traceparent", c0237p.m671B());
                            }
                        }
                    }
                    abstractC34846v0 = ((C34832o0) c22669g0.f89336w).f146715d;
                    if (abstractC34846v0 != null) {
                        lValueOf = Long.valueOf(abstractC34846v0.contentLength());
                    } else {
                        lValueOf = null;
                    }
                    if (c20597e != null) {
                        C0237p c0237pM34592m = AbstractC12350b.m34592m(c22669g0.f89336w, lValueOf, interfaceC20308d1.mo56432l().getSessionReplay().f77077s, new C18374o(c34830n0M109907b, c22669g0, this), interfaceC20308d1.mo56432l().getSessionReplay().f77078t, new C18090c(this));
                        c20597e.f77105e = c0237pM34592m;
                        c20597e.f77103c = (Long) c0237pM34592m.f812x;
                    }
                    C34832o0 c34832o2 = new C34832o0(c34830n0M109907b);
                    c22669g0.f89336w = c34832o2;
                    c34850x0M1939b = ((C0801i) chain).m1939b(c34832o2);
                    i13 = c34850x0M1939b.f146792z;
                    numValueOf = Integer.valueOf(i13);
                    if (interfaceC20408l1Mo56465w != null) {
                        try {
                            try {
                                interfaceC20408l1Mo56465w.mo56459o(numValueOf, "http.response.status_code");
                            } catch (IOException e5) {
                                e = e5;
                                if (interfaceC20408l1Mo56465w != null) {
                                    interfaceC20408l1Mo56465w.mo56457m(e);
                                    interfaceC20408l1Mo56465w.mo56448a(EnumC20374i7.INTERNAL_ERROR);
                                }
                                throw e;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (c34850x0M1939b != null || c20597e == null) {
                                c34850x0 = c34850x0M1939b;
                            } else {
                                int i14 = c34850x0M1939b.f146792z;
                                AbstractC34799a1 abstractC34799a1 = c34850x0M1939b.f146778G;
                                Long lValueOf2 = abstractC34799a1 != null ? Long.valueOf(abstractC34799a1.mo1941i()) : null;
                                c34850x0 = c34850x0M1939b;
                                C0237p c0237pM34592m2 = AbstractC12350b.m34592m(c34850x0, lValueOf2, interfaceC20308d1.mo56432l().getSessionReplay().f77077s, new C6656c(this, 13), interfaceC20308d1.mo56432l().getSessionReplay().f77079u, new C20450b(this));
                                c20597e.f77102b = Integer.valueOf(i14);
                                c20597e.f77106f = c0237pM34592m2;
                                c20597e.f77104d = (Long) c0237pM34592m2.f812x;
                            }
                            if (interfaceC20408l1Mo56465w != null) {
                                interfaceC20408l1Mo56465w.mo56453g();
                            }
                            m56651b((C34832o0) c22669g0.f89336w, numValueOf, c34850x0, jCurrentTimeMillis, c20597e);
                            throw th;
                        }
                    }
                    if (interfaceC20408l1Mo56465w != null) {
                        try {
                            interfaceC20408l1Mo56465w.mo56448a(EnumC20374i7.fromHttpStatusCode(i13));
                        } catch (IOException e13) {
                            e = e13;
                            if (interfaceC20408l1Mo56465w != null) {
                                interfaceC20408l1Mo56465w.mo56457m(e);
                                interfaceC20408l1Mo56465w.mo56448a(EnumC20374i7.INTERNAL_ERROR);
                            }
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            if (c34850x0M1939b != null) {
                                c34850x0 = c34850x0M1939b;
                            } else {
                                c34850x0 = c34850x0M1939b;
                            }
                            if (interfaceC20408l1Mo56465w != null) {
                                interfaceC20408l1Mo56465w.mo56453g();
                            }
                            m56651b((C34832o0) c22669g0.f89336w, numValueOf, c34850x0, jCurrentTimeMillis, c20597e);
                            throw th;
                        }
                    }
                    if (c20597e != null) {
                        AbstractC34799a1 abstractC34799a2 = c34850x0M1939b.f146778G;
                        c34850x1 = c34850x0M1939b;
                        C0237p c0237pM34592m3 = AbstractC12350b.m34592m(c34850x1, abstractC34799a2 != null ? Long.valueOf(abstractC34799a2.mo1941i()) : null, interfaceC20308d1.mo56432l().getSessionReplay().f77077s, new C6656c(this, 13), interfaceC20308d1.mo56432l().getSessionReplay().f77079u, new C20450b(this));
                        c20597e.f77102b = Integer.valueOf(i13);
                        c20597e.f77106f = c0237pM34592m3;
                        c20597e.f77104d = (Long) c0237pM34592m3.f812x;
                    } else {
                        c34850x1 = c34850x0M1939b;
                    }
                    if (interfaceC20408l1Mo56465w != null) {
                        interfaceC20408l1Mo56465w.mo56453g();
                    }
                    m56651b((C34832o0) c22669g0.f89336w, numValueOf, c34850x1, jCurrentTimeMillis, c20597e);
                    return c34850x1;
                }
                if (concurrentHashMap.get(c40571o) != null) {
                    throw new ClassCastException();
                }
                i13 = c34850x0M1939b.f146792z;
                numValueOf = Integer.valueOf(i13);
                if (interfaceC20408l1Mo56465w != null) {
                    interfaceC20408l1Mo56465w.mo56459o(numValueOf, "http.response.status_code");
                }
                if (interfaceC20408l1Mo56465w != null) {
                    interfaceC20408l1Mo56465w.mo56448a(EnumC20374i7.fromHttpStatusCode(i13));
                }
                if (c20597e != null) {
                    AbstractC34799a1 abstractC34799a3 = c34850x0M1939b.f146778G;
                    c34850x1 = c34850x0M1939b;
                    C0237p c0237pM34592m4 = AbstractC12350b.m34592m(c34850x1, abstractC34799a3 != null ? Long.valueOf(abstractC34799a3.mo1941i()) : null, interfaceC20308d1.mo56432l().getSessionReplay().f77077s, new C6656c(this, 13), interfaceC20308d1.mo56432l().getSessionReplay().f77079u, new C20450b(this));
                    c20597e.f77102b = Integer.valueOf(i13);
                    c20597e.f77106f = c0237pM34592m4;
                    c20597e.f77104d = (Long) c0237pM34592m4.f812x;
                } else {
                    c34850x1 = c34850x0M1939b;
                }
                if (interfaceC20408l1Mo56465w != null) {
                    interfaceC20408l1Mo56465w.mo56453g();
                }
                m56651b((C34832o0) c22669g0.f89336w, numValueOf, c34850x1, jCurrentTimeMillis, c20597e);
                return c34850x1;
            } catch (IOException e14) {
                e = e14;
                numValueOf = null;
            } catch (Throwable th5) {
                th = th5;
                numValueOf = null;
            }
            c34830n0M109907b = ((C34832o0) c22669g0.f89336w).m109907b();
            if (!AbstractC20590l.m56723a("auto.http.okhttp", interfaceC20308d1.mo56432l().getIgnoredSpanOrigins())) {
                Object obj2 = c22669g0.f89336w;
                c0237pM118981f0 = AbstractC37056f.m118981f0(interfaceC20308d1, ((C34832o0) obj2).f146712a.f146570i, ((C34832o0) obj2).f146714c.m109868j("baggage"), interfaceC20408l1Mo56465w);
                if (c0237pM118981f0 != null) {
                    C20621w6 c20621w7 = (C20621w6) c0237pM118981f0.f812x;
                    c20621w7.getClass();
                    c34830n0M109907b.m109900a("sentry-trace", c20621w7.m56759a());
                    c17191x = (C17191x) c0237pM118981f0.f813y;
                    if (c17191x != null) {
                        c34830n0M109907b.f146689c.m65769j("baggage");
                        c34830n0M109907b.m109900a("baggage", c17191x.f66010b);
                    }
                    c0237p = (C0237p) c0237pM118981f0.f814z;
                    if (c0237p != null) {
                        c34830n0M109907b.m109900a("traceparent", c0237p.m671B());
                    }
                }
            }
            abstractC34846v0 = ((C34832o0) c22669g0.f89336w).f146715d;
            if (abstractC34846v0 != null) {
                lValueOf = Long.valueOf(abstractC34846v0.contentLength());
            } else {
                lValueOf = null;
            }
            if (c20597e != null) {
                C0237p c0237pM34592m5 = AbstractC12350b.m34592m(c22669g0.f89336w, lValueOf, interfaceC20308d1.mo56432l().getSessionReplay().f77077s, new C18374o(c34830n0M109907b, c22669g0, this), interfaceC20308d1.mo56432l().getSessionReplay().f77078t, new C18090c(this));
                c20597e.f77105e = c0237pM34592m5;
                c20597e.f77103c = (Long) c0237pM34592m5.f812x;
            }
            C34832o0 c34832o3 = new C34832o0(c34830n0M109907b);
            c22669g0.f89336w = c34832o3;
            c34850x0M1939b = ((C0801i) chain).m1939b(c34832o3);
        } catch (IOException e15) {
            e = e15;
            numValueOf = null;
            c34850x0M1939b = null;
        } catch (Throwable th6) {
            th = th6;
            numValueOf = null;
            c34850x0M1939b = null;
        }
        interfaceC20408l1Mo56465w = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (interfaceC20408l1Mo56465w != null) {
            c20323e7Mo56462t = interfaceC20408l1Mo56465w.mo56462t();
        } else {
            c20323e7Mo56462t = null;
        }
        if (c20323e7Mo56462t != null) {
            c20323e7Mo56462t.f76314I = "auto.http.okhttp";
        }
        if (interfaceC20408l1Mo56465w != null) {
            str3 = (String) c0237pM5371H.f813y;
            if (str3 != null) {
                interfaceC20408l1Mo56465w.mo56459o(str3, "http.query");
            }
            str4 = (String) c0237pM5371H.f814z;
            if (str4 != null) {
                interfaceC20408l1Mo56465w.mo56459o(str4, "http.fragment");
            }
        }
        C34832o0 c34832o4 = (C34832o0) c22669g0.f89336w;
        String str9 = c34832o4.f146712a.f146570i;
        String str10 = c34832o4.f146713b;
        list = interfaceC20308d1.mo56432l().getSessionReplay().f77075q;
        list2 = interfaceC20308d1.mo56432l().getSessionReplay().f77076r;
        if (list2 != null) {
            if (list != null) {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c20597e = null;
                        break;
                    }
                    str = (String) it.next();
                    if (str == null) {
                    }
                }
            } else {
                c20597e = null;
                break;
            }
        } else {
            it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    str2 = (String) it3.next();
                    if (str2 != null) {
                    }
                } else {
                    if (list != null) {
                        break;
                    }
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str = (String) it.next();
                            if (str == null) {
                            }
                        }
                    }
                }
                c20597e = null;
                break;
            }
        }
    }
}
