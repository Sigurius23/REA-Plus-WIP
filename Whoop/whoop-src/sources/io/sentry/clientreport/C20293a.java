package io.sentry.clientreport;

import androidx.health.platform.client.proto.C1533u;
import io.sentry.C20306d;
import io.sentry.C20353h7;
import io.sentry.C20446o5;
import io.sentry.C20510q3;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20392j3;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20603v1;
import io.sentry.profilemeasurements.C20462a;
import io.sentry.profilemeasurements.C20463b;
import io.sentry.protocol.AbstractC20480h;
import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20468b;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20471c0;
import io.sentry.protocol.C20472d;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20476f;
import io.sentry.protocol.C20477f0;
import io.sentry.protocol.C20481h0;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20486k;
import io.sentry.protocol.C20488l;
import io.sentry.protocol.C20489m;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20491o;
import io.sentry.protocol.C20492p;
import io.sentry.protocol.C20496q;
import io.sentry.protocol.C20498s;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20500u;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.C20502w;
import io.sentry.protocol.C20503x;
import io.sentry.protocol.C20504y;
import io.sentry.protocol.C20505z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC20467a0;
import io.sentry.protocol.EnumC20474e;
import io.sentry.protocol.EnumC20479g0;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import se.AbstractC32417h;

/* JADX INFO: renamed from: io.sentry.clientreport.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20293a implements InterfaceC20603v1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76188a;

    public /* synthetic */ C20293a(int i13) {
        this.f76188a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C20466a m56286b(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20466a c20466a = new C20466a();
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "split_names":
                    List list = (List) interfaceC20392j3.mo56499U0();
                    if (list == null) {
                        break;
                    } else {
                        c20466a.f76604M = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    c20466a.f76608y = interfaceC20392j3.mo56509w0();
                    break;
                case "start_type":
                    c20466a.f76601J = interfaceC20392j3.mo56509w0();
                    break;
                case "view_names":
                    List list2 = (List) interfaceC20392j3.mo56499U0();
                    if (list2 == null) {
                        break;
                    } else {
                        c20466a.f76600I = list2;
                        break;
                    }
                    break;
                case "app_version":
                    c20466a.f76597F = interfaceC20392j3.mo56509w0();
                    break;
                case "in_foreground":
                    c20466a.f76602K = interfaceC20392j3.mo56500W();
                    break;
                case "build_type":
                    c20466a.f76609z = interfaceC20392j3.mo56509w0();
                    break;
                case "app_identifier":
                    c20466a.f76606w = interfaceC20392j3.mo56509w0();
                    break;
                case "app_start_time":
                    c20466a.f76607x = interfaceC20392j3.mo56498U(interfaceC20602v0);
                    break;
                case "permissions":
                    c20466a.f76599H = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                    break;
                case "app_name":
                    c20466a.f76596E = interfaceC20392j3.mo56509w0();
                    break;
                case "app_build":
                    c20466a.f76598G = interfaceC20392j3.mo56509w0();
                    break;
                case "is_split_apks":
                    c20466a.f76603L = interfaceC20392j3.mo56500W();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
                    break;
            }
        }
        c20466a.f76605N = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20466a;
    }

    /* JADX INFO: renamed from: c */
    public static C20470c m56287c(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        byte b;
        C20470c c20470c = new C20470c();
        interfaceC20392j3.beginObject();
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            int i13 = 2;
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "spring":
                    b = 1;
                    break;
                case "response":
                    b = 2;
                    break;
                case "profile":
                    b = 3;
                    break;
                case "feedback":
                    b = 4;
                    break;
                case "os":
                    b = 5;
                    break;
                case "app":
                    b = 6;
                    break;
                case "gpu":
                    b = 7;
                    break;
                case "flags":
                    b = 8;
                    break;
                case "trace":
                    b = 9;
                    break;
                case "browser":
                    b = 10;
                    break;
                case "runtime":
                    b = 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            ConcurrentHashMap concurrentHashMap = null;
            switch (b) {
                case 0:
                    c20470c.mo56549o(m56288d(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 1:
                    c20470c.mo56555u(AbstractC20480h.m56657d(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 2:
                    c20470c.mo56553s(AbstractC20480h.m56656c(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 3:
                    interfaceC20392j3.beginObject();
                    C20510q3 c20510q3 = new C20510q3(C20501v.f76802x);
                    while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                        String strNextName2 = interfaceC20392j3.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("profiler_id")) {
                            C20501v c20501v = (C20501v) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20297e(i13));
                            if (c20501v != null) {
                                c20510q3.f76851w = c20501v;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName2);
                        }
                    }
                    c20510q3.f76852x = concurrentHashMap;
                    interfaceC20392j3.endObject();
                    c20470c.mo56545k(c20510q3, "profile");
                    break;
                case 4:
                    c20470c.mo56545k(m56289e(interfaceC20392j3, interfaceC20602v0), "feedback");
                    break;
                case 5:
                    c20470c.mo56552r(m56291g(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 6:
                    c20470c.mo56547m(m56286b(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 7:
                    c20470c.mo56551q(m56290f(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 8:
                    c20470c.mo56550p(AbstractC20480h.m56655b(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 9:
                    c20470c.mo56556v(C20306d.m56363b(interfaceC20392j3, interfaceC20602v0));
                    break;
                case 10:
                    interfaceC20392j3.beginObject();
                    C20468b c20468b = new C20468b();
                    while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                        String strNextName3 = interfaceC20392j3.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("name")) {
                            c20468b.f76610w = interfaceC20392j3.mo56509w0();
                        } else if (strNextName3.equals("version")) {
                            c20468b.f76611x = interfaceC20392j3.mo56509w0();
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName3);
                        }
                    }
                    c20468b.f76612y = concurrentHashMap;
                    interfaceC20392j3.endObject();
                    c20470c.mo56548n(c20468b);
                    break;
                case 11:
                    interfaceC20392j3.beginObject();
                    C20503x c20503x = new C20503x();
                    while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                        String strNextName4 = interfaceC20392j3.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "raw_description":
                                c20503x.f76809y = interfaceC20392j3.mo56509w0();
                                break;
                            case "name":
                                c20503x.f76807w = interfaceC20392j3.mo56509w0();
                                break;
                            case "version":
                                c20503x.f76808x = interfaceC20392j3.mo56509w0();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName4);
                                break;
                        }
                    }
                    c20503x.f76810z = concurrentHashMap;
                    interfaceC20392j3.endObject();
                    c20470c.mo56554t(c20503x);
                    break;
                default:
                    Object objMo56499U0 = interfaceC20392j3.mo56499U0();
                    if (objMo56499U0 != null) {
                        c20470c.mo56545k(objMo56499U0, strNextName);
                    }
                    break;
            }
        }
        interfaceC20392j3.endObject();
        return c20470c;
    }

    /* JADX INFO: renamed from: d */
    public static C20476f m56288d(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20476f c20476f = new C20476f();
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            int i13 = 9;
            switch (strNextName) {
                case "timezone":
                    c20476f.f76664Z = interfaceC20392j3.mo56495K(interfaceC20602v0);
                    break;
                case "boot_time":
                    if (interfaceC20392j3.peek() != EnumC20612b.STRING) {
                        break;
                    } else {
                        c20476f.f76663Y = interfaceC20392j3.mo56498U(interfaceC20602v0);
                        break;
                    }
                    break;
                case "simulator":
                    c20476f.f76650L = interfaceC20392j3.mo56500W();
                    break;
                case "manufacturer":
                    c20476f.f76675x = interfaceC20392j3.mo56509w0();
                    break;
                case "processor_count":
                    c20476f.f76669e0 = interfaceC20392j3.mo56507q0();
                    break;
                case "orientation":
                    c20476f.f76649K = (EnumC20474e) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20293a(i13));
                    break;
                case "battery_temperature":
                    c20476f.f76668d0 = interfaceC20392j3.mo56496O0();
                    break;
                case "family":
                    c20476f.f76677z = interfaceC20392j3.mo56509w0();
                    break;
                case "locale":
                    c20476f.f76666b0 = interfaceC20392j3.mo56509w0();
                    break;
                case "online":
                    c20476f.f76648J = interfaceC20392j3.mo56500W();
                    break;
                case "battery_level":
                    c20476f.f76646H = interfaceC20392j3.mo56496O0();
                    break;
                case "model_id":
                    c20476f.f76644F = interfaceC20392j3.mo56509w0();
                    break;
                case "screen_density":
                    c20476f.f76661W = interfaceC20392j3.mo56496O0();
                    break;
                case "screen_dpi":
                    c20476f.f76662X = interfaceC20392j3.mo56507q0();
                    break;
                case "free_memory":
                    c20476f.f76652N = interfaceC20392j3.mo56508s0();
                    break;
                case "id":
                    c20476f.f76665a0 = interfaceC20392j3.mo56509w0();
                    break;
                case "name":
                    c20476f.f76674w = interfaceC20392j3.mo56509w0();
                    break;
                case "low_memory":
                    c20476f.f76654P = interfaceC20392j3.mo56500W();
                    break;
                case "archs":
                    List list = (List) interfaceC20392j3.mo56499U0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c20476f.f76645G = strArr;
                        break;
                    }
                    break;
                case "brand":
                    c20476f.f76676y = interfaceC20392j3.mo56509w0();
                    break;
                case "model":
                    c20476f.f76643E = interfaceC20392j3.mo56509w0();
                    break;
                case "cpu_description":
                    c20476f.f76671g0 = interfaceC20392j3.mo56509w0();
                    break;
                case "processor_frequency":
                    c20476f.f76670f0 = interfaceC20392j3.mo56497R();
                    break;
                case "connection_type":
                    c20476f.f76667c0 = interfaceC20392j3.mo56509w0();
                    break;
                case "chipset":
                    c20476f.f76672h0 = interfaceC20392j3.mo56509w0();
                    break;
                case "screen_width_pixels":
                    c20476f.f76659U = interfaceC20392j3.mo56507q0();
                    break;
                case "external_storage_size":
                    c20476f.f76657S = interfaceC20392j3.mo56508s0();
                    break;
                case "storage_size":
                    c20476f.f76655Q = interfaceC20392j3.mo56508s0();
                    break;
                case "usable_memory":
                    c20476f.f76653O = interfaceC20392j3.mo56508s0();
                    break;
                case "memory_size":
                    c20476f.f76651M = interfaceC20392j3.mo56508s0();
                    break;
                case "charging":
                    c20476f.f76647I = interfaceC20392j3.mo56500W();
                    break;
                case "external_free_storage":
                    c20476f.f76658T = interfaceC20392j3.mo56508s0();
                    break;
                case "free_storage":
                    c20476f.f76656R = interfaceC20392j3.mo56508s0();
                    break;
                case "screen_height_pixels":
                    c20476f.f76660V = interfaceC20392j3.mo56507q0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
                    break;
            }
        }
        c20476f.f76673i0 = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20476f;
    }

    /* JADX INFO: renamed from: e */
    public static C20484j m56289e(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        String strMo56509w0 = null;
        String strMo56509w1 = null;
        String strMo56509w2 = null;
        C20501v c20501vM56295b = null;
        C20501v c20501vM56295b2 = null;
        String strMo56509w3 = null;
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "associated_event_id":
                    c20501vM56295b = C20297e.m56295b(interfaceC20392j3);
                    break;
                case "replay_id":
                    c20501vM56295b2 = C20297e.m56295b(interfaceC20392j3);
                    break;
                case "url":
                    strMo56509w3 = interfaceC20392j3.mo56509w0();
                    break;
                case "name":
                    strMo56509w2 = interfaceC20392j3.mo56509w0();
                    break;
                case "contact_email":
                    strMo56509w1 = interfaceC20392j3.mo56509w0();
                    break;
                case "message":
                    strMo56509w0 = interfaceC20392j3.mo56509w0();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
                    break;
            }
        }
        interfaceC20392j3.endObject();
        if (strMo56509w0 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"message\"", illegalStateException);
            throw illegalStateException;
        }
        C20484j c20484j = new C20484j(strMo56509w0);
        c20484j.f76698x = strMo56509w1;
        c20484j.f76699y = strMo56509w2;
        c20484j.f76700z = c20501vM56295b;
        c20484j.f76694E = c20501vM56295b2;
        c20484j.f76695F = strMo56509w3;
        c20484j.f76696G = map;
        return c20484j;
    }

    /* JADX INFO: renamed from: f */
    public static C20488l m56290f(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20488l c20488l = new C20488l();
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "npot_support":
                    c20488l.f76724I = interfaceC20392j3.mo56509w0();
                    break;
                case "vendor_id":
                    c20488l.f76728y = interfaceC20392j3.mo56509w0();
                    break;
                case "multi_threaded_rendering":
                    c20488l.f76722G = interfaceC20392j3.mo56500W();
                    break;
                case "id":
                    c20488l.f76727x = interfaceC20392j3.mo56507q0();
                    break;
                case "name":
                    c20488l.f76726w = interfaceC20392j3.mo56509w0();
                    break;
                case "vendor_name":
                    c20488l.f76729z = interfaceC20392j3.mo56509w0();
                    break;
                case "version":
                    c20488l.f76723H = interfaceC20392j3.mo56509w0();
                    break;
                case "api_type":
                    c20488l.f76721F = interfaceC20392j3.mo56509w0();
                    break;
                case "memory_size":
                    c20488l.f76720E = interfaceC20392j3.mo56507q0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
                    break;
            }
        }
        c20488l.f76725J = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20488l;
    }

    /* JADX INFO: renamed from: g */
    public static C20492p m56291g(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20492p c20492p = new C20492p();
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "rooted":
                    c20492p.f76749F = interfaceC20392j3.mo56500W();
                    break;
                case "raw_description":
                    c20492p.f76753y = interfaceC20392j3.mo56509w0();
                    break;
                case "name":
                    c20492p.f76751w = interfaceC20392j3.mo56509w0();
                    break;
                case "build":
                    c20492p.f76754z = interfaceC20392j3.mo56509w0();
                    break;
                case "version":
                    c20492p.f76752x = interfaceC20392j3.mo56509w0();
                    break;
                case "kernel_version":
                    c20492p.f76748E = interfaceC20392j3.mo56509w0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
                    break;
            }
        }
        c20492p.f76750G = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20492p;
    }

    /* JADX INFO: renamed from: h */
    public static IllegalStateException m56292h(InterfaceC20602v0 interfaceC20602v0, String str) {
        String strM31996o = AbstractC11895b.m31996o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM31996o);
        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, strM31996o, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: i */
    public static IllegalStateException m56293i(InterfaceC20602v0 interfaceC20602v0, String str) {
        String strM31996o = AbstractC11895b.m31996o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM31996o);
        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, strM31996o, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.InterfaceC20603v1
    /* JADX INFO: renamed from: a */
    public final Object mo56294a(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        Double dValueOf;
        int i13 = 12;
        int i14 = 13;
        int i15 = 6;
        int i16 = 0;
        switch (this.f76188a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                interfaceC20392j3.beginObject();
                Date dateMo56498U = null;
                HashMap map = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName = interfaceC20392j3.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("discarded_events")) {
                        arrayList.addAll(interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20297e(i16)));
                    } else if (strNextName.equals("timestamp")) {
                        dateMo56498U = interfaceC20392j3.mo56498U(interfaceC20602v0);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
                    }
                }
                interfaceC20392j3.endObject();
                if (dateMo56498U == null) {
                    throw m56292h(interfaceC20602v0, "timestamp");
                }
                if (arrayList.isEmpty()) {
                    throw m56292h(interfaceC20602v0, "discarded_events");
                }
                C20294b c20294b = new C20294b(dateMo56498U, arrayList);
                c20294b.f76191y = map;
                return c20294b;
            case 1:
                interfaceC20392j3.beginObject();
                C20462a c20462a = new C20462a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("values")) {
                        ArrayList arrayListMo56503c1 = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20293a(2));
                        if (arrayListMo56503c1 != null) {
                            c20462a.f76591y = arrayListMo56503c1;
                        }
                    } else if (strNextName2.equals("unit")) {
                        String strMo56509w0 = interfaceC20392j3.mo56509w0();
                        if (strMo56509w0 != null) {
                            c20462a.f76590x = strMo56509w0;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName2);
                    }
                }
                c20462a.f76589w = concurrentHashMap;
                interfaceC20392j3.endObject();
                return c20462a;
            case 2:
                interfaceC20392j3.beginObject();
                C20463b c20463b = new C20463b(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName3 = interfaceC20392j3.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "elapsed_since_start_ns":
                            String strMo56509w1 = interfaceC20392j3.mo56509w0();
                            if (strMo56509w1 != null) {
                                c20463b.f76594y = strMo56509w1;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "timestamp":
                            try {
                                dValueOf = interfaceC20392j3.mo56497R();
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateMo56498U2 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                                dValueOf = dateMo56498U2 != null ? Double.valueOf(dateMo56498U2.getTime() / 1000.0d) : null;
                            }
                            if (dValueOf != null) {
                                c20463b.f76593x = dValueOf.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "value":
                            Double dMo56497R = interfaceC20392j3.mo56497R();
                            if (dMo56497R != null) {
                                c20463b.f76595z = dMo56497R.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap2, strNextName3);
                            break;
                    }
                }
                c20463b.f76592w = concurrentHashMap2;
                interfaceC20392j3.endObject();
                return c20463b;
            case 3:
                return m56286b(interfaceC20392j3, interfaceC20602v0);
            case 4:
                interfaceC20392j3.beginObject();
                C20468b c20468b = new C20468b();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName4 = interfaceC20392j3.nextName();
                    strNextName4.getClass();
                    if (strNextName4.equals("name")) {
                        c20468b.f76610w = interfaceC20392j3.mo56509w0();
                    } else if (strNextName4.equals("version")) {
                        c20468b.f76611x = interfaceC20392j3.mo56509w0();
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap3, strNextName4);
                    }
                }
                c20468b.f76612y = concurrentHashMap3;
                interfaceC20392j3.endObject();
                return c20468b;
            case 5:
                return m56287c(interfaceC20392j3, interfaceC20602v0);
            case 6:
                DebugImage debugImage = new DebugImage();
                interfaceC20392j3.beginObject();
                AbstractMap map2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName5 = interfaceC20392j3.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "debug_file":
                            debugImage.debugFile = interfaceC20392j3.mo56509w0();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = interfaceC20392j3.mo56509w0();
                            break;
                        case "image_size":
                            debugImage.imageSize = interfaceC20392j3.mo56508s0();
                            break;
                        case "code_file":
                            debugImage.codeFile = interfaceC20392j3.mo56509w0();
                            break;
                        case "arch":
                            debugImage.arch = interfaceC20392j3.mo56509w0();
                            break;
                        case "type":
                            debugImage.type = interfaceC20392j3.mo56509w0();
                            break;
                        case "uuid":
                            debugImage.uuid = interfaceC20392j3.mo56509w0();
                            break;
                        case "debug_id":
                            debugImage.debugId = interfaceC20392j3.mo56509w0();
                            break;
                        case "code_id":
                            debugImage.codeId = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map2, strNextName5);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                debugImage.setUnknown(map2);
                return debugImage;
            case 7:
                C20472d c20472d = new C20472d();
                interfaceC20392j3.beginObject();
                HashMap map3 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName6 = interfaceC20392j3.nextName();
                    strNextName6.getClass();
                    if (strNextName6.equals("images")) {
                        c20472d.f76632x = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20293a(i15));
                    } else if (strNextName6.equals("sdk_info")) {
                        c20472d.f76631w = (C20498s) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20293a(18));
                    } else {
                        if (map3 == null) {
                            map3 = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map3, strNextName6);
                    }
                }
                interfaceC20392j3.endObject();
                c20472d.f76633y = map3;
                return c20472d;
            case 8:
                return m56288d(interfaceC20392j3, interfaceC20602v0);
            case 9:
                return EnumC20474e.valueOf(interfaceC20392j3.nextString().toUpperCase(Locale.ROOT));
            case 10:
                return m56289e(interfaceC20392j3, interfaceC20602v0);
            case 11:
                interfaceC20392j3.beginObject();
                C20486k c20486k = new C20486k();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName7 = interfaceC20392j3.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "region":
                            c20486k.f76706y = interfaceC20392j3.mo56509w0();
                            break;
                        case "city":
                            c20486k.f76704w = interfaceC20392j3.mo56509w0();
                            break;
                        case "country_code":
                            c20486k.f76705x = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap4, strNextName7);
                            break;
                    }
                }
                c20486k.f76707z = concurrentHashMap4;
                interfaceC20392j3.endObject();
                return c20486k;
            case 12:
                return m56290f(interfaceC20392j3, interfaceC20602v0);
            case 13:
                interfaceC20392j3.beginObject();
                Number number = null;
                String strMo56509w2 = null;
                ConcurrentHashMap concurrentHashMap5 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName8 = interfaceC20392j3.nextName();
                    strNextName8.getClass();
                    if (strNextName8.equals("unit")) {
                        strMo56509w2 = interfaceC20392j3.mo56509w0();
                    } else if (strNextName8.equals("value")) {
                        number = (Number) interfaceC20392j3.mo56499U0();
                    } else {
                        if (concurrentHashMap5 == null) {
                            concurrentHashMap5 = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap5, strNextName8);
                    }
                }
                interfaceC20392j3.endObject();
                if (number != null) {
                    C20489m c20489m = new C20489m(strMo56509w2, number);
                    c20489m.f76732y = concurrentHashMap5;
                    return c20489m;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"value\"", illegalStateException);
                throw illegalStateException;
            case 14:
                C20490n c20490n = new C20490n();
                interfaceC20392j3.beginObject();
                HashMap map4 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName9 = interfaceC20392j3.nextName();
                    strNextName9.getClass();
                    switch (strNextName9) {
                        case "description":
                            c20490n.f76741x = interfaceC20392j3.mo56509w0();
                            break;
                        case "exception_id":
                            c20490n.f76736H = interfaceC20392j3.mo56507q0();
                            break;
                        case "data":
                            c20490n.f76734F = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                            break;
                        case "meta":
                            c20490n.f76733E = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                            break;
                        case "type":
                            c20490n.f76740w = interfaceC20392j3.mo56509w0();
                            break;
                        case "handled":
                            c20490n.f76743z = interfaceC20392j3.mo56500W();
                            break;
                        case "synthetic":
                            c20490n.f76735G = interfaceC20392j3.mo56500W();
                            break;
                        case "is_exception_group":
                            c20490n.f76738J = interfaceC20392j3.mo56500W();
                            break;
                        case "help_link":
                            c20490n.f76742y = interfaceC20392j3.mo56509w0();
                            break;
                        case "parent_id":
                            c20490n.f76737I = interfaceC20392j3.mo56507q0();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map4, strNextName9);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                c20490n.f76739K = map4;
                return c20490n;
            case 15:
                interfaceC20392j3.beginObject();
                C20491o c20491o = new C20491o();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName10 = interfaceC20392j3.nextName();
                    strNextName10.getClass();
                    switch (strNextName10) {
                        case "params":
                            List list = (List) interfaceC20392j3.mo56499U0();
                            if (list != null) {
                                c20491o.f76746y = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            c20491o.f76745x = interfaceC20392j3.mo56509w0();
                            break;
                        case "formatted":
                            c20491o.f76744w = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap6, strNextName10);
                            break;
                    }
                }
                c20491o.f76747z = concurrentHashMap6;
                interfaceC20392j3.endObject();
                return c20491o;
            case 16:
                return m56291g(interfaceC20392j3, interfaceC20602v0);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                interfaceC20392j3.beginObject();
                C20496q c20496q = new C20496q();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName11 = interfaceC20392j3.nextName();
                    strNextName11.getClass();
                    switch (strNextName11) {
                        case "fragment":
                            c20496q.f76772J = interfaceC20392j3.mo56509w0();
                            break;
                        case "method":
                            c20496q.f76776x = interfaceC20392j3.mo56509w0();
                            break;
                        case "env":
                            Map map5 = (Map) interfaceC20392j3.mo56499U0();
                            if (map5 != null) {
                                c20496q.f76769G = AbstractC12350b.m34553B(map5);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            c20496q.f76775w = interfaceC20392j3.mo56509w0();
                            break;
                        case "data":
                            c20496q.f76778z = interfaceC20392j3.mo56499U0();
                            break;
                        case "other":
                            Map map6 = (Map) interfaceC20392j3.mo56499U0();
                            if (map6 != null) {
                                c20496q.f76771I = AbstractC12350b.m34553B(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map7 = (Map) interfaceC20392j3.mo56499U0();
                            if (map7 != null) {
                                c20496q.f76768F = AbstractC12350b.m34553B(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            c20496q.f76767E = interfaceC20392j3.mo56509w0();
                            break;
                        case "body_size":
                            c20496q.f76770H = interfaceC20392j3.mo56508s0();
                            break;
                        case "query_string":
                            c20496q.f76777y = interfaceC20392j3.mo56509w0();
                            break;
                        case "api_target":
                            c20496q.f76773K = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap7, strNextName11);
                            break;
                    }
                }
                c20496q.f76774L = concurrentHashMap7;
                interfaceC20392j3.endObject();
                return c20496q;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C20498s c20498s = new C20498s();
                interfaceC20392j3.beginObject();
                HashMap map8 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName12 = interfaceC20392j3.nextName();
                    strNextName12.getClass();
                    switch (strNextName12) {
                        case "sdk_name":
                            c20498s.f76786w = interfaceC20392j3.mo56509w0();
                            break;
                        case "version_patchlevel":
                            c20498s.f76789z = interfaceC20392j3.mo56507q0();
                            break;
                        case "version_major":
                            c20498s.f76787x = interfaceC20392j3.mo56507q0();
                            break;
                        case "version_minor":
                            c20498s.f76788y = interfaceC20392j3.mo56507q0();
                            break;
                        default:
                            if (map8 == null) {
                                map8 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map8, strNextName12);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                c20498s.f76785E = map8;
                return c20498s;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                interfaceC20392j3.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                HashMap map9 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName13 = interfaceC20392j3.nextName();
                    strNextName13.getClass();
                    switch (strNextName13) {
                        case "name":
                            strNextString = interfaceC20392j3.nextString();
                            break;
                        case "version":
                            strNextString2 = interfaceC20392j3.nextString();
                            break;
                        case "packages":
                            ArrayList arrayListMo56503c2 = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20293a(21));
                            if (arrayListMo56503c2 != null) {
                                arrayList2.addAll(arrayListMo56503c2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) interfaceC20392j3.mo56499U0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map9, strNextName13);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                if (strNextString == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"name\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"name\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (strNextString2 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"version\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"version\"", illegalStateException3);
                    throw illegalStateException3;
                }
                C20499t c20499t = new C20499t(strNextString, strNextString2);
                c20499t.f76793y = new CopyOnWriteArraySet(arrayList2);
                c20499t.f76794z = new CopyOnWriteArraySet(arrayList3);
                c20499t.f76790E = map9;
                return c20499t;
            case 20:
                C20500u c20500u = new C20500u();
                interfaceC20392j3.beginObject();
                HashMap map10 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName14 = interfaceC20392j3.nextName();
                    strNextName14.getClass();
                    switch (strNextName14) {
                        case "thread_id":
                            c20500u.f76801z = interfaceC20392j3.mo56508s0();
                            break;
                        case "module":
                            c20500u.f76800y = interfaceC20392j3.mo56509w0();
                            break;
                        case "type":
                            c20500u.f76798w = interfaceC20392j3.mo56509w0();
                            break;
                        case "value":
                            c20500u.f76799x = interfaceC20392j3.mo56509w0();
                            break;
                        case "mechanism":
                            c20500u.f76796F = (C20490n) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20293a(14));
                            break;
                        case "stacktrace":
                            c20500u.f76795E = (C20469b0) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20293a(25));
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map10, strNextName14);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                c20500u.f76797G = map10;
                return c20500u;
            case 21:
                interfaceC20392j3.beginObject();
                String strNextString3 = null;
                String strNextString4 = null;
                HashMap map11 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName15 = interfaceC20392j3.nextName();
                    strNextName15.getClass();
                    if (strNextName15.equals("name")) {
                        strNextString3 = interfaceC20392j3.nextString();
                    } else if (strNextName15.equals("version")) {
                        strNextString4 = interfaceC20392j3.nextString();
                    } else {
                        if (map11 == null) {
                            map11 = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map11, strNextName15);
                    }
                }
                interfaceC20392j3.endObject();
                if (strNextString3 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strNextString4 != null) {
                    C20502w c20502w = new C20502w(strNextString3, strNextString4);
                    c20502w.f76806y = map11;
                    return c20502w;
                }
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"version\"", illegalStateException5);
                throw illegalStateException5;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                interfaceC20392j3.beginObject();
                C20503x c20503x = new C20503x();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName16 = interfaceC20392j3.nextName();
                    strNextName16.getClass();
                    switch (strNextName16) {
                        case "raw_description":
                            c20503x.f76809y = interfaceC20392j3.mo56509w0();
                            break;
                        case "name":
                            c20503x.f76807w = interfaceC20392j3.mo56509w0();
                            break;
                        case "version":
                            c20503x.f76808x = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap8, strNextName16);
                            break;
                    }
                }
                c20503x.f76810z = concurrentHashMap8;
                interfaceC20392j3.endObject();
                return c20503x;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap9 = null;
                Map map12 = null;
                HashMap map13 = null;
                Double dValueOf2 = null;
                Double dValueOf3 = null;
                C20501v c20501vM56295b = null;
                C20353h7 c20353h7 = null;
                C20353h7 c20353h8 = null;
                String strMo56509w3 = null;
                String strMo56509w4 = null;
                EnumC20374i7 enumC20374i7 = null;
                String strMo56509w5 = null;
                Map map14 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName17 = interfaceC20392j3.nextName();
                    strNextName17.getClass();
                    switch (strNextName17) {
                        case "span_id":
                            c20353h7 = new C20353h7(interfaceC20392j3.nextString());
                            break;
                        case "parent_span_id":
                            c20353h8 = (C20353h7) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(18));
                            break;
                        case "description":
                            strMo56509w4 = interfaceC20392j3.mo56509w0();
                            break;
                        case "start_timestamp":
                            try {
                                dValueOf2 = interfaceC20392j3.mo56497R();
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateMo56498U3 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                                dValueOf2 = dateMo56498U3 == null ? null : Double.valueOf(dateMo56498U3.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "origin":
                            strMo56509w5 = interfaceC20392j3.mo56509w0();
                            break;
                        case "status":
                            enumC20374i7 = (EnumC20374i7) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(19));
                            break;
                        case "measurements":
                            map13 = interfaceC20392j3.mo56510y0(interfaceC20602v0, new C20293a(i14));
                            break;
                        case "op":
                            strMo56509w3 = interfaceC20392j3.mo56509w0();
                            break;
                        case "data":
                            map14 = (Map) interfaceC20392j3.mo56499U0();
                            break;
                        case "tags":
                            map12 = (Map) interfaceC20392j3.mo56499U0();
                            break;
                        case "timestamp":
                            try {
                                dValueOf3 = interfaceC20392j3.mo56497R();
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateMo56498U4 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                                dValueOf3 = dateMo56498U4 == null ? null : Double.valueOf(dateMo56498U4.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "trace_id":
                            c20501vM56295b = C20297e.m56295b(interfaceC20392j3);
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap9, strNextName17);
                            break;
                    }
                }
                if (dValueOf2 == null) {
                    throw m56293i(interfaceC20602v0, "start_timestamp");
                }
                if (c20501vM56295b == null) {
                    throw m56293i(interfaceC20602v0, "trace_id");
                }
                if (c20353h7 == null) {
                    throw m56293i(interfaceC20602v0, "span_id");
                }
                if (strMo56509w3 == null) {
                    throw m56293i(interfaceC20602v0, "op");
                }
                if (map12 == null) {
                    map12 = new HashMap();
                }
                Map map15 = map12;
                if (map13 == null) {
                    map13 = new HashMap();
                }
                C20504y c20504y = new C20504y(dValueOf2, dValueOf3, c20501vM56295b, c20353h7, c20353h8, strMo56509w3, strMo56509w4, enumC20374i7, strMo56509w5, map15, map13, map14);
                c20504y.f76819M = concurrentHashMap9;
                interfaceC20392j3.endObject();
                return c20504y;
            case 24:
                C20505z c20505z = new C20505z();
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap10 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName18 = interfaceC20392j3.nextName();
                    strNextName18.getClass();
                    switch (strNextName18) {
                        case "post_context":
                            c20505z.f76843x = (List) interfaceC20392j3.mo56499U0();
                            break;
                        case "image_addr":
                            c20505z.f76834O = interfaceC20392j3.mo56509w0();
                            break;
                        case "in_app":
                            c20505z.f76830K = interfaceC20392j3.mo56500W();
                            break;
                        case "raw_function":
                            c20505z.f76840U = interfaceC20392j3.mo56509w0();
                            break;
                        case "lineno":
                            c20505z.f76826G = interfaceC20392j3.mo56507q0();
                            break;
                        case "module":
                            c20505z.f76825F = interfaceC20392j3.mo56509w0();
                            break;
                        case "native":
                            c20505z.f76832M = interfaceC20392j3.mo56500W();
                            break;
                        case "symbol":
                            c20505z.f76838S = interfaceC20392j3.mo56509w0();
                            break;
                        case "package":
                            c20505z.f76831L = interfaceC20392j3.mo56509w0();
                            break;
                        case "filename":
                            c20505z.f76845z = interfaceC20392j3.mo56509w0();
                            break;
                        case "symbol_addr":
                            c20505z.f76835P = interfaceC20392j3.mo56509w0();
                            break;
                        case "lock":
                            c20505z.f76841V = (C20446o5) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20306d(i13));
                            break;
                        case "vars":
                            c20505z.f76844y = (Map) interfaceC20392j3.mo56499U0();
                            break;
                        case "colno":
                            c20505z.f76827H = interfaceC20392j3.mo56507q0();
                            break;
                        case "instruction_addr":
                            c20505z.f76836Q = interfaceC20392j3.mo56509w0();
                            break;
                        case "pre_context":
                            c20505z.f76842w = (List) interfaceC20392j3.mo56499U0();
                            break;
                        case "addr_mode":
                            c20505z.f76837R = interfaceC20392j3.mo56509w0();
                            break;
                        case "context_line":
                            c20505z.f76829J = interfaceC20392j3.mo56509w0();
                            break;
                        case "function":
                            c20505z.f76824E = interfaceC20392j3.mo56509w0();
                            break;
                        case "abs_path":
                            c20505z.f76828I = interfaceC20392j3.mo56509w0();
                            break;
                        case "platform":
                            c20505z.f76833N = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap10, strNextName18);
                            break;
                    }
                }
                c20505z.f76839T = concurrentHashMap10;
                interfaceC20392j3.endObject();
                return c20505z;
            case 25:
                C20469b0 c20469b0 = new C20469b0();
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName19 = interfaceC20392j3.nextName();
                    strNextName19.getClass();
                    switch (strNextName19) {
                        case "frames":
                            c20469b0.f76614w = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20293a(24));
                            break;
                        case "instruction_addr_adjustment":
                            c20469b0.f76617z = (EnumC20467a0) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20293a(26));
                            break;
                        case "registers":
                            c20469b0.f76615x = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                            break;
                        case "snapshot":
                            c20469b0.f76616y = interfaceC20392j3.mo56500W();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap11, strNextName19);
                            break;
                    }
                }
                c20469b0.f76613E = concurrentHashMap11;
                interfaceC20392j3.endObject();
                return c20469b0;
            case 26:
                return EnumC20467a0.valueOf(interfaceC20392j3.nextString().toUpperCase(Locale.ROOT));
            case 27:
                C20471c0 c20471c0 = new C20471c0();
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName20 = interfaceC20392j3.nextName();
                    strNextName20.getClass();
                    switch (strNextName20) {
                        case "daemon":
                            c20471c0.f76622G = interfaceC20392j3.mo56500W();
                            break;
                        case "priority":
                            c20471c0.f76628x = interfaceC20392j3.mo56507q0();
                            break;
                        case "held_locks":
                            HashMap mapMo56510y0 = interfaceC20392j3.mo56510y0(interfaceC20602v0, new C20306d(i13));
                            if (mapMo56510y0 != null) {
                                c20471c0.f76625J = new HashMap(mapMo56510y0);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            c20471c0.f76627w = interfaceC20392j3.mo56508s0();
                            break;
                        case "main":
                            c20471c0.f76623H = interfaceC20392j3.mo56500W();
                            break;
                        case "name":
                            c20471c0.f76629y = interfaceC20392j3.mo56509w0();
                            break;
                        case "state":
                            c20471c0.f76630z = interfaceC20392j3.mo56509w0();
                            break;
                        case "crashed":
                            c20471c0.f76620E = interfaceC20392j3.mo56500W();
                            break;
                        case "current":
                            c20471c0.f76621F = interfaceC20392j3.mo56500W();
                            break;
                        case "stacktrace":
                            c20471c0.f76624I = (C20469b0) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20293a(25));
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap12, strNextName20);
                            break;
                    }
                }
                c20471c0.f76626K = concurrentHashMap12;
                interfaceC20392j3.endObject();
                return c20471c0;
            case 28:
                interfaceC20392j3.beginObject();
                C20473d0 c20473d0 = new C20473d0(new ArrayList(), new HashMap(), new C20477f0(EnumC20479g0.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap13 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName21 = interfaceC20392j3.nextName();
                    strNextName21.getClass();
                    switch (strNextName21) {
                        case "start_timestamp":
                            try {
                                Double dMo56497R2 = interfaceC20392j3.mo56497R();
                                if (dMo56497R2 != null) {
                                    c20473d0.f76635Q = dMo56497R2;
                                }
                                break;
                            } catch (NumberFormatException unused4) {
                                Date dateMo56498U5 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                                if (dateMo56498U5 != null) {
                                    c20473d0.f76635Q = Double.valueOf(dateMo56498U5.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapMo56510y1 = interfaceC20392j3.mo56510y0(interfaceC20602v0, new C20293a(i14));
                            if (mapMo56510y1 != null) {
                                c20473d0.f76638T.putAll(mapMo56510y1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            interfaceC20392j3.nextString();
                            break;
                        case "timestamp":
                            try {
                                Double dMo56497R3 = interfaceC20392j3.mo56497R();
                                if (dMo56497R3 != null) {
                                    c20473d0.f76636R = dMo56497R3;
                                }
                                break;
                            } catch (NumberFormatException unused5) {
                                Date dateMo56498U6 = interfaceC20392j3.mo56498U(interfaceC20602v0);
                                if (dateMo56498U6 != null) {
                                    c20473d0.f76636R = Double.valueOf(dateMo56498U6.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListMo56503c3 = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20293a(23));
                            if (arrayListMo56503c3 != null) {
                                c20473d0.f76637S.addAll(arrayListMo56503c3);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            c20473d0.f76639U = AbstractC20480h.m56658e(interfaceC20392j3, interfaceC20602v0);
                            break;
                        case "transaction":
                            c20473d0.f76634P = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (AbstractC32417h.m101170A(c20473d0, strNextName21, interfaceC20392j3, interfaceC20602v0)) {
                                break;
                            } else {
                                if (concurrentHashMap13 == null) {
                                    concurrentHashMap13 = new ConcurrentHashMap();
                                }
                                interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap13, strNextName21);
                                break;
                            }
                            break;
                    }
                }
                c20473d0.f76640V = concurrentHashMap13;
                interfaceC20392j3.endObject();
                return c20473d0;
            default:
                interfaceC20392j3.beginObject();
                C20481h0 c20481h0 = new C20481h0();
                ConcurrentHashMap concurrentHashMap14 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName22 = interfaceC20392j3.nextName();
                    strNextName22.getClass();
                    switch (strNextName22) {
                        case "username":
                            c20481h0.f76689y = interfaceC20392j3.mo56509w0();
                            break;
                        case "id":
                            c20481h0.f76688x = interfaceC20392j3.mo56509w0();
                            break;
                        case "geo":
                            interfaceC20392j3.beginObject();
                            C20486k c20486k2 = new C20486k();
                            ConcurrentHashMap concurrentHashMap15 = null;
                            while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                                String strNextName23 = interfaceC20392j3.nextName();
                                strNextName23.getClass();
                                switch (strNextName23) {
                                    case "region":
                                        c20486k2.f76706y = interfaceC20392j3.mo56509w0();
                                        break;
                                    case "city":
                                        c20486k2.f76704w = interfaceC20392j3.mo56509w0();
                                        break;
                                    case "country_code":
                                        c20486k2.f76705x = interfaceC20392j3.mo56509w0();
                                        break;
                                    default:
                                        if (concurrentHashMap15 == null) {
                                            concurrentHashMap15 = new ConcurrentHashMap();
                                        }
                                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap15, strNextName23);
                                        break;
                                }
                            }
                            c20486k2.f76707z = concurrentHashMap15;
                            interfaceC20392j3.endObject();
                            c20481h0.f76684F = c20486k2;
                            break;
                        case "data":
                            c20481h0.f76685G = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                            break;
                        case "name":
                            c20481h0.f76683E = interfaceC20392j3.mo56509w0();
                            break;
                        case "email":
                            c20481h0.f76687w = interfaceC20392j3.mo56509w0();
                            break;
                        case "ip_address":
                            c20481h0.f76690z = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (concurrentHashMap14 == null) {
                                concurrentHashMap14 = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap14, strNextName22);
                            break;
                    }
                }
                c20481h0.f76686H = concurrentHashMap14;
                interfaceC20392j3.endObject();
                return c20481h0;
        }
    }
}
