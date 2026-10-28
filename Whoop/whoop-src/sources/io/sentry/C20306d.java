package io.sentry;

import aa3.C0656u0;
import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.service.network.model.UserSessionDto;
import io.sentry.clientreport.C20293a;
import io.sentry.clientreport.C20297e;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20483i0;
import io.sentry.protocol.C20491o;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.profiling.C20493a;
import io.sentry.rrweb.EnumC20524c;
import io.sentry.rrweb.EnumC20525d;
import io.sentry.util.AbstractC20591m;
import io.sentry.util.C20585g;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import se.AbstractC32417h;

/* JADX INFO: renamed from: io.sentry.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C20306d implements InterfaceC20603v1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76211a;

    public /* synthetic */ C20306d(int i13) {
        this.f76211a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C20323e7 m56363b(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20501v c20501vM56295b = null;
        C20353h7 c20353h7 = null;
        String strNextString = null;
        ConcurrentHashMap concurrentHashMap = null;
        C20353h7 c20353h8 = null;
        String strNextString2 = null;
        EnumC20374i7 enumC20374i7 = null;
        String strNextString3 = null;
        ConcurrentHashMap concurrentHashMapM34553B = null;
        Map map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "span_id":
                    c20353h7 = new C20353h7(interfaceC20392j3.nextString());
                    break;
                case "parent_span_id":
                    c20353h8 = (C20353h7) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(18));
                    break;
                case "description":
                    strNextString2 = interfaceC20392j3.nextString();
                    break;
                case "origin":
                    strNextString3 = interfaceC20392j3.nextString();
                    break;
                case "status":
                    enumC20374i7 = (EnumC20374i7) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(19));
                    break;
                case "op":
                    strNextString = interfaceC20392j3.nextString();
                    break;
                case "data":
                    map = (Map) interfaceC20392j3.mo56499U0();
                    break;
                case "tags":
                    concurrentHashMapM34553B = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                    break;
                case "trace_id":
                    c20501vM56295b = C20297e.m56295b(interfaceC20392j3);
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
                    break;
            }
        }
        if (c20501vM56295b == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (c20353h7 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strNextString == null) {
            strNextString = "";
        }
        C20323e7 c20323e7 = new C20323e7(c20501vM56295b, c20353h7, strNextString, c20353h8);
        c20323e7.f76311F = strNextString2;
        c20323e7.f76312G = enumC20374i7;
        c20323e7.f76314I = strNextString3;
        if (concurrentHashMapM34553B != null) {
            c20323e7.f76313H = concurrentHashMapM34553B;
        }
        if (map != null) {
            c20323e7.f76315J = map;
        }
        c20323e7.f76316K = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20323e7;
    }

    /* JADX INFO: renamed from: c */
    public static IllegalStateException m56364c(InterfaceC20602v0 interfaceC20602v0, String str) {
        String strM31996o = AbstractC11895b.m31996o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM31996o);
        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, strM31996o, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // io.sentry.InterfaceC20603v1
    /* JADX INFO: renamed from: a */
    public final Object mo56294a(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        ?? r10;
        int i13;
        ArrayList arrayList;
        String str;
        InterfaceC20392j3 interfaceC20392j4 = interfaceC20392j3;
        int i14 = 11;
        switch (this.f76211a) {
            case 0:
                boolean z4 = true;
                char c3 = 5;
                String strMo56509w0 = null;
                interfaceC20392j4.beginObject();
                Date dateM60659O = AbstractC21598x.m60659O();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                String strMo56509w1 = null;
                String strMo56509w2 = null;
                String strMo56509w3 = null;
                EnumC20436n5 enumC20436n5ValueOf = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                Date date = dateM60659O;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName = interfaceC20392j4.nextName();
                    strNextName.getClass();
                    switch (strNextName.hashCode()) {
                        case -1008619738:
                            r10 = strNextName.equals(AnalyticsRequestV2.HEADER_ORIGIN) ? 0 : -1;
                            break;
                        case 3076010:
                            r10 = strNextName.equals("data") ? z4 : -1;
                            break;
                        case 3575610:
                            r10 = strNextName.equals("type") ? 2 : -1;
                            break;
                        case 50511102:
                            r10 = strNextName.equals("category") ? 3 : -1;
                            break;
                        case 55126294:
                            r10 = strNextName.equals("timestamp") ? 4 : -1;
                            break;
                        case 102865796:
                            r10 = strNextName.equals("level") ? c3 : -1;
                            break;
                        case 954925063:
                            r10 = strNextName.equals("message") ? 6 : -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case 0:
                            strMo56509w3 = interfaceC20392j3.mo56509w0();
                            continue;
                            interfaceC20392j4 = interfaceC20392j3;
                            z4 = true;
                            c3 = 5;
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                            if (concurrentHashMapM34553B != null) {
                                concurrentHashMap = concurrentHashMapM34553B;
                            } else {
                                continue;
                            }
                            interfaceC20392j4 = interfaceC20392j3;
                            z4 = true;
                            c3 = 5;
                            break;
                        case 2:
                            strMo56509w1 = interfaceC20392j3.mo56509w0();
                            continue;
                            interfaceC20392j4 = interfaceC20392j3;
                            z4 = true;
                            c3 = 5;
                            break;
                        case 3:
                            strMo56509w2 = interfaceC20392j3.mo56509w0();
                            continue;
                            interfaceC20392j4 = interfaceC20392j3;
                            z4 = true;
                            c3 = 5;
                            break;
                        case 4:
                            Date dateMo56498U = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            if (dateMo56498U != null) {
                                date = dateMo56498U;
                            } else {
                                continue;
                            }
                            interfaceC20392j4 = interfaceC20392j3;
                            z4 = true;
                            c3 = 5;
                            break;
                        case 5:
                            try {
                                enumC20436n5ValueOf = EnumC20436n5.valueOf(interfaceC20392j4.nextString().toUpperCase(Locale.ROOT));
                            } catch (Exception e5) {
                                interfaceC20602v0.mo16058i(EnumC20436n5.ERROR, e5, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strMo56509w0 = interfaceC20392j4.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap2, strNextName);
                            break;
                    }
                    interfaceC20392j4 = interfaceC20392j3;
                    z4 = true;
                    c3 = 5;
                }
                C20315e c20315e = new C20315e(date);
                c20315e.f76295z = strMo56509w0;
                c20315e.f76286E = strMo56509w1;
                c20315e.f76287F = concurrentHashMap;
                c20315e.f76288G = strMo56509w2;
                c20315e.f76289H = strMo56509w3;
                c20315e.f76290I = enumC20436n5ValueOf;
                c20315e.f76291J = concurrentHashMap2;
                interfaceC20392j3.endObject();
                return c20315e;
            case 1:
                int i15 = 4;
                int i16 = 2;
                ConcurrentHashMap concurrentHashMap3 = null;
                interfaceC20392j4.beginObject();
                C20501v c20501v = C20501v.f76802x;
                C20457p3 c20457p3 = new C20457p3(c20501v, c20501v, null, new HashMap(), Double.valueOf(0.0d), "android", C20513q6.empty());
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j4.nextName();
                    strNextName2.getClass();
                    switch (strNextName2.hashCode()) {
                        case -1840434063:
                            i13 = strNextName2.equals("debug_meta") ? 0 : -1;
                            break;
                        case -362243017:
                            i13 = strNextName2.equals("measurements") ? 1 : -1;
                            break;
                        case -309425751:
                            i13 = strNextName2.equals("profile") ? i16 : -1;
                            break;
                        case -85904877:
                            i13 = strNextName2.equals("environment") ? 3 : -1;
                            break;
                        case 55126294:
                            i13 = strNextName2.equals("timestamp") ? i15 : -1;
                            break;
                        case 178573617:
                            i13 = strNextName2.equals("profiler_id") ? 5 : -1;
                            break;
                        case 351608024:
                            i13 = strNextName2.equals("version") ? 6 : -1;
                            break;
                        case 1090594823:
                            i13 = strNextName2.equals("release") ? 7 : -1;
                            break;
                        case 1102774726:
                            i13 = strNextName2.equals("client_sdk") ? 8 : -1;
                            break;
                        case 1874684019:
                            i13 = strNextName2.equals("platform") ? 9 : -1;
                            break;
                        case 1953158756:
                            i13 = strNextName2.equals("sampled_profile") ? 10 : -1;
                            break;
                        case 2005113901:
                            i13 = strNextName2.equals("chunk_id") ? 11 : -1;
                            break;
                        default:
                            i13 = -1;
                            break;
                    }
                    switch (i13) {
                        case 0:
                            C20472d c20472d = (C20472d) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20293a(7));
                            if (c20472d != null) {
                                c20457p3.f76566w = c20472d;
                            }
                            break;
                        case 1:
                            HashMap mapMo56510y0 = interfaceC20392j4.mo56510y0(interfaceC20602v0, new C20293a(1));
                            if (mapMo56510y0 != null) {
                                c20457p3.f76556E.putAll(mapMo56510y0);
                            }
                            break;
                        case 2:
                            C20493a c20493a = (C20493a) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20297e(3));
                            if (c20493a != null) {
                                c20457p3.f76564M = c20493a;
                            }
                            break;
                        case 3:
                            String strMo56509w4 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w4 != null) {
                                c20457p3.f76559H = strMo56509w4;
                            }
                            break;
                        case 4:
                            Double dMo56497R = interfaceC20392j4.mo56497R();
                            if (dMo56497R != null) {
                                c20457p3.f76561J = dMo56497R.doubleValue();
                            }
                            break;
                        case 5:
                            C20501v c20501v2 = (C20501v) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20297e(i16));
                            if (c20501v2 != null) {
                                c20457p3.f76567x = c20501v2;
                            }
                            break;
                        case 6:
                            String strMo56509w5 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w5 != null) {
                                c20457p3.f76560I = strMo56509w5;
                            }
                            break;
                        case 7:
                            String strMo56509w6 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w6 != null) {
                                c20457p3.f76558G = strMo56509w6;
                            }
                            break;
                        case 8:
                            C20499t c20499t = (C20499t) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20293a(19));
                            if (c20499t != null) {
                                c20457p3.f76569z = c20499t;
                            }
                            break;
                        case 9:
                            String strMo56509w7 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w7 != null) {
                                c20457p3.f76557F = strMo56509w7;
                            }
                            break;
                        case 10:
                            String strMo56509w8 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w8 != null) {
                                c20457p3.f76563L = strMo56509w8;
                            }
                            break;
                        case 11:
                            C20501v c20501v3 = (C20501v) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20297e(i16));
                            if (c20501v3 != null) {
                                c20457p3.f76568y = c20501v3;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap3, strNextName2);
                            break;
                    }
                    i15 = 4;
                    i16 = 2;
                }
                c20457p3.f76565N = concurrentHashMap3;
                interfaceC20392j4.endObject();
                return c20457p3;
            case 2:
                ConcurrentHashMap concurrentHashMap4 = null;
                interfaceC20392j4.beginObject();
                C20510q3 c20510q3 = new C20510q3(C20501v.f76802x);
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName3 = interfaceC20392j4.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("profiler_id")) {
                        C20501v c20501v4 = (C20501v) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20297e(2));
                        if (c20501v4 != null) {
                            c20510q3.f76851w = c20501v4;
                        }
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap4, strNextName3);
                    }
                }
                c20510q3.f76852x = concurrentHashMap4;
                interfaceC20392j4.endObject();
                return c20510q3;
            case 3:
                interfaceC20392j4.beginObject();
                File file = new File("dummy");
                Date dateM60659O2 = AbstractC21598x.m60659O();
                ArrayList arrayList2 = new ArrayList();
                C20501v c20501v5 = C20501v.f76802x;
                ConcurrentHashMap concurrentHashMap5 = null;
                C20539s3 c20539s3 = new C20539s3(file, dateM60659O2, arrayList2, "", c20501v5.toString(), new C20323e7(c20501v5, C20353h7.f76386x, "op", null).f76321w.toString(), UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, 0, "", new CallableC20346h0(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName4 = interfaceC20392j4.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "device_manufacturer":
                            String strMo56509w9 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w9 == null) {
                                break;
                            } else {
                                c20539s3.f76955E = strMo56509w9;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numMo56507q0 = interfaceC20392j4.mo56507q0();
                            if (numMo56507q0 == null) {
                                break;
                            } else {
                                c20539s3.f76982y = numMo56507q0.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strMo56509w10 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w10 == null) {
                                break;
                            } else {
                                c20539s3.f76965O = strMo56509w10;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strMo56509w11 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w11 == null) {
                                break;
                            } else {
                                c20539s3.f76983z = strMo56509w11;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strMo56509w12 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w12 == null) {
                                break;
                            } else {
                                c20539s3.f76973W = strMo56509w12;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strMo56509w13 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w13 == null) {
                                break;
                            } else {
                                c20539s3.f76957G = strMo56509w13;
                                break;
                            }
                            break;
                        case "device_model":
                            String strMo56509w14 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w14 == null) {
                                break;
                            } else {
                                c20539s3.f76956F = strMo56509w14;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolMo56500W = interfaceC20392j4.mo56500W();
                            if (boolMo56500W == null) {
                                break;
                            } else {
                                c20539s3.f76960J = boolMo56500W.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strMo56509w15 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w15 == null) {
                                break;
                            } else {
                                c20539s3.f76968R = strMo56509w15;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapMo56510y1 = interfaceC20392j4.mo56510y0(interfaceC20602v0, new C20293a(1));
                            if (mapMo56510y1 == null) {
                                break;
                            } else {
                                c20539s3.f76977a0.putAll(mapMo56510y1);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strMo56509w16 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w16 == null) {
                                break;
                            } else {
                                c20539s3.f76963M = strMo56509w16;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) interfaceC20392j4.mo56499U0();
                            if (list == null) {
                                break;
                            } else {
                                c20539s3.f76962L = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strMo56509w17 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w17 == null) {
                                break;
                            } else {
                                c20539s3.f76969S = strMo56509w17;
                                break;
                            }
                            break;
                        case "version_name":
                            String strMo56509w18 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w18 == null) {
                                break;
                            } else {
                                c20539s3.f76970T = strMo56509w18;
                                break;
                            }
                            break;
                        case "environment":
                            String strMo56509w19 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w19 == null) {
                                break;
                            } else {
                                c20539s3.f76974X = strMo56509w19;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateMo56498U2 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            if (dateMo56498U2 == null) {
                                break;
                            } else {
                                c20539s3.f76976Z = dateMo56498U2;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strMo56509w20 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w20 == null) {
                                break;
                            } else {
                                c20539s3.f76967Q = strMo56509w20;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strMo56509w21 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w21 == null) {
                                break;
                            } else {
                                c20539s3.f76958H = strMo56509w21;
                                break;
                            }
                            break;
                        case "architecture":
                            String strMo56509w22 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w22 == null) {
                                break;
                            } else {
                                c20539s3.f76961K = strMo56509w22;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strMo56509w23 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w23 == null) {
                                break;
                            } else {
                                c20539s3.f76971U = strMo56509w23;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strMo56509w24 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w24 == null) {
                                break;
                            } else {
                                c20539s3.f76959I = strMo56509w24;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strMo56509w25 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w25 == null) {
                                break;
                            } else {
                                c20539s3.f76975Y = strMo56509w25;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strMo56509w26 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w26 == null) {
                                break;
                            } else {
                                c20539s3.f76972V = strMo56509w26;
                                break;
                            }
                            break;
                        case "platform":
                            String strMo56509w27 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w27 == null) {
                                break;
                            } else {
                                c20539s3.f76964N = strMo56509w27;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strMo56509w28 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w28 == null) {
                                break;
                            } else {
                                c20539s3.f76978b0 = strMo56509w28;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListMo56503c1 = interfaceC20392j4.mo56503c1(interfaceC20602v0, new C20306d(4));
                            if (arrayListMo56503c1 == null) {
                                break;
                            } else {
                                c20539s3.f76966P.addAll(arrayListMo56503c1);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap5, strNextName4);
                            break;
                    }
                }
                c20539s3.f76979c0 = concurrentHashMap5;
                interfaceC20392j4.endObject();
                return c20539s3;
            case 4:
                interfaceC20392j4.beginObject();
                C20547t3 c20547t3 = new C20547t3(C20340g3.f76358a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap6 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName5 = interfaceC20392j4.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "relative_start_ns":
                            Long lMo56508s0 = interfaceC20392j4.mo56508s0();
                            if (lMo56508s0 == null) {
                                break;
                            } else {
                                c20547t3.f77006z = lMo56508s0;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lMo56508s1 = interfaceC20392j4.mo56508s0();
                            if (lMo56508s1 == null) {
                                break;
                            } else {
                                c20547t3.f76999E = lMo56508s1;
                                break;
                            }
                            break;
                        case "id":
                            String strMo56509w29 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w29 == null) {
                                break;
                            } else {
                                c20547t3.f77003w = strMo56509w29;
                                break;
                            }
                            break;
                        case "name":
                            String strMo56509w30 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w30 == null) {
                                break;
                            } else {
                                c20547t3.f77005y = strMo56509w30;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strMo56509w31 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w31 == null) {
                                break;
                            } else {
                                c20547t3.f77004x = strMo56509w31;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lMo56508s2 = interfaceC20392j4.mo56508s0();
                            if (lMo56508s2 == null) {
                                break;
                            } else {
                                c20547t3.f77001G = lMo56508s2;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lMo56508s3 = interfaceC20392j4.mo56508s0();
                            if (lMo56508s3 == null) {
                                break;
                            } else {
                                c20547t3.f77000F = lMo56508s3;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap6, strNextName5);
                            break;
                    }
                }
                c20547t3.f77002H = concurrentHashMap6;
                interfaceC20392j4.endObject();
                return c20547t3;
            case 5:
                C20626x3 c20626x3 = new C20626x3();
                interfaceC20392j4.beginObject();
                Integer numMo56507q1 = null;
                HashMap map = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName6 = interfaceC20392j4.nextName();
                    strNextName6.getClass();
                    if (strNextName6.equals("segment_id")) {
                        numMo56507q1 = interfaceC20392j4.mo56507q0();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC20392j4.mo56494I(interfaceC20602v0, map, strNextName6);
                    }
                }
                interfaceC20392j4.endObject();
                interfaceC20392j4.setLenient(true);
                List list2 = (List) interfaceC20392j4.mo56499U0();
                interfaceC20392j4.setLenient(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            C20585g c20585g = new C20585g(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str2 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str2.equals("type")) {
                                    EnumC20524c enumC20524c = EnumC20524c.values()[((Integer) value).intValue()];
                                    int i17 = AbstractC20618w3.f77157b[enumC20524c.ordinal()];
                                    if (i17 == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            EnumC20525d enumC20525d = EnumC20525d.values()[num.intValue()];
                                            int i18 = AbstractC20618w3.f77156a[enumC20525d.ordinal()];
                                            if (i18 == 1) {
                                                arrayList.add(C20483i0.m56660c(c20585g, interfaceC20602v0));
                                            } else if (i18 != 2) {
                                                interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Unsupported rrweb incremental snapshot type %s", enumC20525d);
                                            } else {
                                                arrayList.add(C20483i0.m56661d(c20585g, interfaceC20602v0));
                                            }
                                        }
                                    } else if (i17 == 2) {
                                        arrayList.add(C20483i0.m56662e(c20585g, interfaceC20602v0));
                                    } else if (i17 != 3) {
                                        interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Unsupported rrweb event type %s", enumC20524c);
                                    } else {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str3 = (String) map4.get("tag");
                                        if (str3 != null) {
                                            switch (str3) {
                                                case "performanceSpan":
                                                    arrayList.add(C20483i0.m56663f(c20585g, interfaceC20602v0));
                                                    break;
                                                case "video":
                                                    arrayList.add(C20483i0.m56664g(c20585g, interfaceC20602v0));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(C20483i0.m56659b(c20585g, interfaceC20602v0));
                                                    break;
                                                default:
                                                    interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "Unsupported rrweb event type %s", enumC20524c);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                c20626x3.f77171w = numMo56507q1;
                c20626x3.f77172x = arrayList;
                c20626x3.f77173y = map;
                return c20626x3;
            case 6:
                interfaceC20392j4.beginObject();
                C20458p4 c20458p4 = new C20458p4();
                c20458p4.f76581y = false;
                c20458p4.f76582z = null;
                c20458p4.f76579w = false;
                c20458p4.f76580x = null;
                c20458p4.f76574I = false;
                c20458p4.f76570E = null;
                c20458p4.f76571F = false;
                c20458p4.f76572G = false;
                c20458p4.f76577L = EnumC20518r3.MANUAL;
                c20458p4.f76573H = 0;
                c20458p4.f76575J = true;
                c20458p4.f76576K = false;
                ConcurrentHashMap concurrentHashMap7 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName7 = interfaceC20392j4.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "is_enable_app_start_profiling":
                            Boolean boolMo56500W2 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W2 == null) {
                                break;
                            } else {
                                c20458p4.f76575J = boolMo56500W2.booleanValue();
                                break;
                            }
                            break;
                        case "trace_sampled":
                            Boolean boolMo56500W3 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W3 == null) {
                                break;
                            } else {
                                c20458p4.f76581y = boolMo56500W3.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strMo56509w32 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w32 == null) {
                                break;
                            } else {
                                c20458p4.f76570E = strMo56509w32;
                                break;
                            }
                            break;
                        case "is_continuous_profiling_enabled":
                            Boolean boolMo56500W4 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W4 == null) {
                                break;
                            } else {
                                c20458p4.f76572G = boolMo56500W4.booleanValue();
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolMo56500W5 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W5 == null) {
                                break;
                            } else {
                                c20458p4.f76571F = boolMo56500W5.booleanValue();
                                break;
                            }
                            break;
                        case "is_start_profiler_on_app_start":
                            Boolean boolMo56500W6 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W6 == null) {
                                break;
                            } else {
                                c20458p4.f76576K = boolMo56500W6.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolMo56500W7 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W7 == null) {
                                break;
                            } else {
                                c20458p4.f76579w = boolMo56500W7.booleanValue();
                                break;
                            }
                            break;
                        case "profile_lifecycle":
                            String strMo56509w33 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w33 == null) {
                                break;
                            } else {
                                try {
                                    c20458p4.f76577L = EnumC20518r3.valueOf(strMo56509w33);
                                } catch (IllegalArgumentException unused) {
                                    interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strMo56509w33), new Object[0]);
                                }
                                break;
                            }
                            break;
                        case "continuous_profile_sampled":
                            Boolean boolMo56500W8 = interfaceC20392j4.mo56500W();
                            if (boolMo56500W8 == null) {
                                break;
                            } else {
                                c20458p4.f76574I = boolMo56500W8.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numMo56507q2 = interfaceC20392j4.mo56507q0();
                            if (numMo56507q2 == null) {
                                break;
                            } else {
                                c20458p4.f76573H = numMo56507q2.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dMo56497R2 = interfaceC20392j4.mo56497R();
                            if (dMo56497R2 == null) {
                                break;
                            } else {
                                c20458p4.f76582z = dMo56497R2;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dMo56497R3 = interfaceC20392j4.mo56497R();
                            if (dMo56497R3 == null) {
                                break;
                            } else {
                                c20458p4.f76580x = dMo56497R3;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap7, strNextName7);
                            break;
                    }
                }
                c20458p4.f76578M = concurrentHashMap7;
                interfaceC20392j4.endObject();
                return c20458p4;
            case 7:
                interfaceC20392j4.beginObject();
                C20499t c20499t2 = null;
                C20405k7 c20405k7 = null;
                Date dateMo56498U3 = null;
                HashMap map5 = null;
                C20501v c20501v6 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName8 = interfaceC20392j4.nextName();
                    strNextName8.getClass();
                    switch (strNextName8) {
                        case "sdk":
                            c20499t2 = (C20499t) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20293a(19));
                            continue;
                            break;
                        case "trace":
                            c20405k7 = (C20405k7) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20459p5(5));
                            continue;
                            break;
                        case "event_id":
                            c20501v6 = (C20501v) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20297e(2));
                            break;
                        case "sent_at":
                            dateMo56498U3 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, map5, strNextName8);
                            break;
                    }
                }
                C20619w4 c20619w4 = new C20619w4(c20501v6, c20499t2, c20405k7);
                c20619w4.f77162z = dateMo56498U3;
                c20619w4.f77158E = map5;
                interfaceC20392j4.endObject();
                return c20619w4;
            case 8:
                interfaceC20392j4.beginObject();
                int iNextInt = 0;
                HashMap map6 = null;
                EnumC20424m5 enumC20424m5 = null;
                String strMo56509w34 = null;
                String strMo56509w35 = null;
                String strMo56509w36 = null;
                String strMo56509w37 = null;
                Integer numMo56507q3 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName9 = interfaceC20392j4.nextName();
                    strNextName9.getClass();
                    switch (strNextName9) {
                        case "item_count":
                            numMo56507q3 = interfaceC20392j4.mo56507q0();
                            continue;
                            break;
                        case "length":
                            iNextInt = interfaceC20392j4.nextInt();
                            continue;
                            break;
                        case "filename":
                            strMo56509w35 = interfaceC20392j4.mo56509w0();
                            continue;
                            break;
                        case "attachment_type":
                            strMo56509w36 = interfaceC20392j4.mo56509w0();
                            continue;
                            break;
                        case "type":
                            enumC20424m5 = (EnumC20424m5) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20306d(10));
                            continue;
                            break;
                        case "content_type":
                            strMo56509w34 = interfaceC20392j4.mo56509w0();
                            break;
                        case "platform":
                            strMo56509w37 = interfaceC20392j4.mo56509w0();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, map6, strNextName9);
                            break;
                    }
                }
                if (enumC20424m5 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                C20312d5 c20312d5 = new C20312d5(enumC20424m5, iNextInt, strMo56509w34, strMo56509w35, strMo56509w36, strMo56509w37, numMo56507q3);
                c20312d5.f76269I = map6;
                interfaceC20392j4.endObject();
                return c20312d5;
            case 9:
                interfaceC20392j4.beginObject();
                C20321e5 c20321e5 = new C20321e5();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName10 = interfaceC20392j4.nextName();
                    strNextName10.getClass();
                    switch (strNextName10) {
                        case "fingerprint":
                            List list3 = (List) interfaceC20392j4.mo56499U0();
                            if (list3 == null) {
                                break;
                            } else {
                                c20321e5.f76307W = list3;
                                break;
                            }
                            break;
                        case "threads":
                            interfaceC20392j4.beginObject();
                            interfaceC20392j4.nextName();
                            c20321e5.f76303S = new C0656u0(interfaceC20392j4.mo56503c1(interfaceC20602v0, new C20293a(27)));
                            interfaceC20392j4.endObject();
                            break;
                        case "logger":
                            c20321e5.f76302R = interfaceC20392j4.mo56509w0();
                            break;
                        case "timestamp":
                            Date dateMo56498U4 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            if (dateMo56498U4 == null) {
                                break;
                            } else {
                                c20321e5.f76300P = dateMo56498U4;
                                break;
                            }
                            break;
                        case "level":
                            c20321e5.f76305U = (EnumC20436n5) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20306d(i14));
                            break;
                        case "message":
                            c20321e5.f76301Q = (C20491o) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20293a(15));
                            break;
                        case "modules":
                            c20321e5.f76309Y = AbstractC12350b.m34553B((Map) interfaceC20392j4.mo56499U0());
                            break;
                        case "exception":
                            interfaceC20392j4.beginObject();
                            interfaceC20392j4.nextName();
                            c20321e5.f76304T = new C0656u0(interfaceC20392j4.mo56503c1(interfaceC20602v0, new C20293a(20)));
                            interfaceC20392j4.endObject();
                            break;
                        case "transaction":
                            c20321e5.f76306V = interfaceC20392j4.mo56509w0();
                            break;
                        default:
                            if (!AbstractC32417h.m101170A(c20321e5, strNextName10, interfaceC20392j4, interfaceC20602v0)) {
                                if (concurrentHashMap8 == null) {
                                    concurrentHashMap8 = new ConcurrentHashMap();
                                }
                                interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap8, strNextName10);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                c20321e5.f76308X = concurrentHashMap8;
                interfaceC20392j4.endObject();
                return c20321e5;
            case 10:
                return EnumC20424m5.valueOfLabel(interfaceC20392j4.nextString().toLowerCase(Locale.ROOT));
            case 11:
                return EnumC20436n5.valueOf(interfaceC20392j4.nextString().toUpperCase(Locale.ROOT));
            case 12:
                C20446o5 c20446o5 = new C20446o5();
                interfaceC20392j4.beginObject();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName11 = interfaceC20392j4.nextName();
                    strNextName11.getClass();
                    switch (strNextName11) {
                        case "package_name":
                            c20446o5.f76543y = interfaceC20392j4.mo56509w0();
                            break;
                        case "thread_id":
                            c20446o5.f76539E = interfaceC20392j4.mo56508s0();
                            break;
                        case "address":
                            c20446o5.f76542x = interfaceC20392j4.mo56509w0();
                            break;
                        case "class_name":
                            c20446o5.f76544z = interfaceC20392j4.mo56509w0();
                            break;
                        case "type":
                            c20446o5.f76541w = interfaceC20392j4.nextInt();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap9, strNextName11);
                            break;
                    }
                }
                c20446o5.f76540F = concurrentHashMap9;
                interfaceC20392j4.endObject();
                return c20446o5;
            case 13:
                interfaceC20392j4.beginObject();
                HashMap map7 = null;
                ArrayList arrayListMo56503c2 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName12 = interfaceC20392j4.nextName();
                    strNextName12.getClass();
                    if (strNextName12.equals("items")) {
                        arrayListMo56503c2 = interfaceC20392j4.mo56503c1(interfaceC20602v0, new C20459p5(0));
                    } else {
                        if (map7 == null) {
                            map7 = new HashMap();
                        }
                        interfaceC20392j4.mo56494I(interfaceC20602v0, map7, strNextName12);
                    }
                }
                interfaceC20392j4.endObject();
                if (arrayListMo56503c2 != null) {
                    C20541s5 c20541s5 = new C20541s5(arrayListMo56503c2);
                    c20541s5.f76985x = map7;
                    return c20541s5;
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"items\"");
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"items\"", illegalStateException2);
                throw illegalStateException2;
            case 14:
                interfaceC20392j4.beginObject();
                HashMap map8 = null;
                ArrayList arrayListMo56503c3 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName13 = interfaceC20392j4.nextName();
                    strNextName13.getClass();
                    if (strNextName13.equals("items")) {
                        arrayListMo56503c3 = interfaceC20392j4.mo56503c1(interfaceC20602v0, new C20459p5(3));
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        interfaceC20392j4.mo56494I(interfaceC20602v0, map8, strNextName13);
                    }
                }
                interfaceC20392j4.endObject();
                if (arrayListMo56503c3 != null) {
                    C20620w5 c20620w5 = new C20620w5(arrayListMo56503c3);
                    c20620w5.f77164x = map8;
                    return c20620w5;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"items\"");
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"items\"", illegalStateException3);
                throw illegalStateException3;
            case 15:
                C20542s6 c20542s6 = new C20542s6();
                interfaceC20392j4.beginObject();
                EnumC20521r6 enumC20521r6 = null;
                Date dateMo56498U5 = null;
                HashMap map9 = null;
                C20501v c20501v7 = null;
                Date dateMo56498U6 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                String strMo56509w38 = null;
                Integer numMo56507q4 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName14 = interfaceC20392j4.nextName();
                    strNextName14.getClass();
                    switch (strNextName14) {
                        case "replay_id":
                            c20501v7 = (C20501v) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20297e(2));
                            continue;
                            break;
                        case "replay_start_timestamp":
                            dateMo56498U6 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            break;
                        case "type":
                            strMo56509w38 = interfaceC20392j4.mo56509w0();
                            break;
                        case "urls":
                            list4 = (List) interfaceC20392j4.mo56499U0();
                            break;
                        case "timestamp":
                            dateMo56498U5 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            break;
                        case "error_ids":
                            list5 = (List) interfaceC20392j4.mo56499U0();
                            break;
                        case "trace_ids":
                            list6 = (List) interfaceC20392j4.mo56499U0();
                            break;
                        case "replay_type":
                            enumC20521r6 = (EnumC20521r6) interfaceC20392j4.mo56501Z(interfaceC20602v0, new C20459p5(4));
                            break;
                        case "segment_id":
                            numMo56507q4 = interfaceC20392j4.mo56507q0();
                            break;
                        default:
                            if (!AbstractC32417h.m101170A(c20542s6, strNextName14, interfaceC20392j4, interfaceC20602v0)) {
                                if (map9 == null) {
                                    map9 = new HashMap();
                                }
                                interfaceC20392j4.mo56494I(interfaceC20602v0, map9, strNextName14);
                                break;
                            }
                            break;
                    }
                }
                interfaceC20392j4.endObject();
                if (strMo56509w38 != null) {
                    c20542s6.f76987Q = strMo56509w38;
                }
                if (enumC20521r6 != null) {
                    c20542s6.f76988R = enumC20521r6;
                }
                if (numMo56507q4 != null) {
                    c20542s6.f76990T = numMo56507q4.intValue();
                }
                if (dateMo56498U5 != null) {
                    c20542s6.f76991U = dateMo56498U5;
                }
                c20542s6.f76989S = c20501v7;
                c20542s6.f76992V = dateMo56498U6;
                c20542s6.f76993W = list4;
                c20542s6.f76994X = list5;
                c20542s6.f76995Y = list6;
                c20542s6.f76996Z = map9;
                return c20542s6;
            case 16:
                interfaceC20392j4.beginObject();
                ConcurrentHashMap concurrentHashMap10 = null;
                EnumC20048a7 enumC20048a7ValueOf = null;
                Date dateMo56498U7 = null;
                Date dateMo56498U8 = null;
                String strMo56509w39 = null;
                Long lMo56508s4 = null;
                Boolean boolMo56500W9 = null;
                String strMo56509w40 = null;
                String strMo56509w41 = null;
                String strMo56509w42 = null;
                String strMo56509w43 = null;
                Double dMo56497R4 = null;
                Integer numMo56507q5 = null;
                String strMo56509w44 = null;
                String str4 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName15 = interfaceC20392j4.nextName();
                    strNextName15.getClass();
                    switch (strNextName15) {
                        case "duration":
                            dMo56497R4 = interfaceC20392j4.mo56497R();
                            continue;
                            break;
                        case "started":
                            dateMo56498U7 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            continue;
                            break;
                        case "errors":
                            numMo56507q5 = interfaceC20392j4.mo56507q0();
                            continue;
                            break;
                        case "status":
                            String strM56724a = AbstractC20591m.m56724a(interfaceC20392j4.mo56509w0());
                            if (strM56724a != null) {
                                enumC20048a7ValueOf = EnumC20048a7.valueOf(strM56724a);
                            }
                            break;
                        case "did":
                            strMo56509w39 = interfaceC20392j4.mo56509w0();
                            continue;
                            break;
                        case "seq":
                            lMo56508s4 = interfaceC20392j4.mo56508s0();
                            continue;
                            break;
                        case "sid":
                            String strMo56509w45 = interfaceC20392j4.mo56509w0();
                            if (strMo56509w45 != null) {
                                str = strMo56509w45;
                                if (strMo56509w45.length() == 36 || str.length() == 32) {
                                    str4 = str;
                                }
                                break;
                            } else {
                                str = strMo56509w45;
                            }
                            interfaceC20602v0.mo16066m(EnumC20436n5.ERROR, "%s sid is not valid.", str);
                            break;
                        case "init":
                            boolMo56500W9 = interfaceC20392j4.mo56500W();
                            continue;
                            break;
                        case "timestamp":
                            dateMo56498U8 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                            continue;
                            break;
                        case "attrs":
                            interfaceC20392j4.beginObject();
                            while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                                String strNextName16 = interfaceC20392j4.nextName();
                                strNextName16.getClass();
                                switch (strNextName16) {
                                    case "environment":
                                        strMo56509w44 = interfaceC20392j4.mo56509w0();
                                        break;
                                    case "release":
                                        strMo56509w42 = interfaceC20392j4.mo56509w0();
                                        break;
                                    case "ip_address":
                                        strMo56509w40 = interfaceC20392j4.mo56509w0();
                                        break;
                                    case "user_agent":
                                        strMo56509w41 = interfaceC20392j4.mo56509w0();
                                        break;
                                    default:
                                        interfaceC20392j4.skipValue();
                                        break;
                                }
                            }
                            interfaceC20392j4.endObject();
                            continue;
                            break;
                        case "abnormal_mechanism":
                            strMo56509w43 = interfaceC20392j4.mo56509w0();
                            continue;
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, concurrentHashMap10, strNextName15);
                            continue;
                            break;
                    }
                    enumC20048a7ValueOf = enumC20048a7ValueOf;
                }
                EnumC20048a7 enumC20048a7 = enumC20048a7ValueOf;
                if (enumC20048a7 == null) {
                    throw m56364c(interfaceC20602v0, NotificationCompat.CATEGORY_STATUS);
                }
                if (dateMo56498U7 == null) {
                    throw m56364c(interfaceC20602v0, "started");
                }
                if (numMo56507q5 == null) {
                    throw m56364c(interfaceC20602v0, "errors");
                }
                if (strMo56509w42 == null) {
                    throw m56364c(interfaceC20602v0, "release");
                }
                C20265b7 c20265b7 = new C20265b7(enumC20048a7, dateMo56498U7, dateMo56498U8, numMo56507q5.intValue(), strMo56509w39, str4, boolMo56500W9, lMo56508s4, dMo56497R4, strMo56509w40, strMo56509w41, strMo56509w44, strMo56509w42, strMo56509w43);
                c20265b7.f76101P = concurrentHashMap10;
                interfaceC20392j4.endObject();
                return c20265b7;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return m56363b(interfaceC20392j3, interfaceC20602v0);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C20353h7(interfaceC20392j4.nextString());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumC20374i7.valueOf(interfaceC20392j4.nextString().toUpperCase(Locale.ROOT));
            default:
                interfaceC20392j4.beginObject();
                C20501v c20501vM56295b = null;
                String strMo56509w46 = null;
                String strMo56509w47 = null;
                String strMo56509w48 = null;
                HashMap map10 = null;
                while (interfaceC20392j4.peek() == EnumC20612b.NAME) {
                    String strNextName17 = interfaceC20392j4.nextName();
                    strNextName17.getClass();
                    switch (strNextName17) {
                        case "comments":
                            strMo56509w48 = interfaceC20392j4.mo56509w0();
                            break;
                        case "name":
                            strMo56509w46 = interfaceC20392j4.mo56509w0();
                            break;
                        case "email":
                            strMo56509w47 = interfaceC20392j4.mo56509w0();
                            break;
                        case "event_id":
                            c20501vM56295b = C20297e.m56295b(interfaceC20392j4);
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            interfaceC20392j4.mo56494I(interfaceC20602v0, map10, strNextName17);
                            break;
                    }
                }
                interfaceC20392j4.endObject();
                if (c20501vM56295b != null) {
                    C20461p7 c20461p7 = new C20461p7(c20501vM56295b, strMo56509w46, strMo56509w47, strMo56509w48);
                    c20461p7.f76584E = map10;
                    return c20461p7;
                }
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"event_id\"");
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"event_id\"", illegalStateException4);
                throw illegalStateException4;
        }
    }
}
