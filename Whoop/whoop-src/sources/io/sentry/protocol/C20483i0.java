package io.sentry.protocol;

import com.squareup.wire.AbstractC5583n;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20392j3;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20603v1;
import io.sentry.clientreport.C20297e;
import io.sentry.rrweb.C20522a;
import io.sentry.rrweb.C20528g;
import io.sentry.rrweb.C20530i;
import io.sentry.rrweb.C20531j;
import io.sentry.rrweb.C20533l;
import io.sentry.rrweb.C20534m;
import io.sentry.rrweb.EnumC20524c;
import io.sentry.rrweb.EnumC20527f;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p095dp.AbstractC12240d;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: io.sentry.protocol.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20483i0 implements InterfaceC20603v1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76693a;

    public /* synthetic */ C20483i0(int i13) {
        this.f76693a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C20522a m56659b(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20522a c20522a = new C20522a();
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("payload")) {
                        interfaceC20392j3.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                            String strNextName3 = interfaceC20392j3.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                                    if (concurrentHashMapM34553B == null) {
                                        break;
                                    } else {
                                        c20522a.f76894I = concurrentHashMapM34553B;
                                        break;
                                    }
                                    break;
                                case "type":
                                    c20522a.f76890E = interfaceC20392j3.mo56509w0();
                                    break;
                                case "category":
                                    c20522a.f76891F = interfaceC20392j3.mo56509w0();
                                    break;
                                case "timestamp":
                                    c20522a.f76899z = interfaceC20392j3.nextDouble();
                                    break;
                                case "level":
                                    try {
                                        c20522a.f76893H = EnumC20436n5.valueOf(interfaceC20392j3.nextString().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e5) {
                                        interfaceC20602v0.mo16058i(EnumC20436n5.DEBUG, e5, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    c20522a.f76892G = interfaceC20392j3.mo56509w0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap2, strNextName3);
                                    break;
                            }
                        }
                        c20522a.f76896K = concurrentHashMap2;
                        interfaceC20392j3.endObject();
                    } else if (strNextName2.equals("tag")) {
                        String strMo56509w0 = interfaceC20392j3.mo56509w0();
                        if (strMo56509w0 == null) {
                            strMo56509w0 = "";
                        }
                        c20522a.f76898y = strMo56509w0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName2);
                    }
                }
                c20522a.f76897L = concurrentHashMap;
                interfaceC20392j3.endObject();
            } else if (!AbstractC5583n.m16795v(c20522a, strNextName, interfaceC20392j3, interfaceC20602v0)) {
                if (map == null) {
                    map = new HashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
            }
        }
        c20522a.f76895J = map;
        interfaceC20392j3.endObject();
        return c20522a;
    }

    /* JADX INFO: renamed from: c */
    public static C20528g m56660c(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20528g c20528g = new C20528g();
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                interfaceC20392j3.beginObject();
                HashMap map2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "x":
                            c20528g.f76904F = interfaceC20392j3.nextFloat();
                            break;
                        case "y":
                            c20528g.f76905G = interfaceC20392j3.nextFloat();
                            break;
                        case "id":
                            c20528g.f76903E = interfaceC20392j3.nextInt();
                            break;
                        case "type":
                            c20528g.f76910z = (EnumC20527f) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20297e(8));
                            break;
                        case "pointerType":
                            c20528g.f76906H = interfaceC20392j3.nextInt();
                            break;
                        case "pointerId":
                            c20528g.f76907I = interfaceC20392j3.nextInt();
                            break;
                        default:
                            if (!AbstractC12240d.m34089z(c20528g, strNextName2, interfaceC20392j3, interfaceC20602v0)) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                interfaceC20392j3.mo56494I(interfaceC20602v0, map2, strNextName2);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                c20528g.f76909K = map2;
                interfaceC20392j3.endObject();
            } else if (!AbstractC5583n.m16795v(c20528g, strNextName, interfaceC20392j3, interfaceC20602v0)) {
                if (map == null) {
                    map = new HashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
            }
        }
        c20528g.f76908J = map;
        interfaceC20392j3.endObject();
        return c20528g;
    }

    /* JADX INFO: renamed from: d */
    public static C20530i m56661d(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20530i c20530i = new C20530i();
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                interfaceC20392j3.beginObject();
                HashMap map2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("pointerId")) {
                        c20530i.f76919z = interfaceC20392j3.nextInt();
                    } else if (strNextName2.equals("positions")) {
                        c20530i.f76916E = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20297e(9));
                    } else if (!AbstractC12240d.m34089z(c20530i, strNextName2, interfaceC20392j3, interfaceC20602v0)) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map2, strNextName2);
                    }
                }
                c20530i.f76918G = map2;
                interfaceC20392j3.endObject();
            } else if (!AbstractC5583n.m16795v(c20530i, strNextName, interfaceC20392j3, interfaceC20602v0)) {
                if (map == null) {
                    map = new HashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
            }
        }
        c20530i.f76917F = map;
        interfaceC20392j3.endObject();
        return c20530i;
    }

    /* JADX INFO: renamed from: e */
    public static C20531j m56662e(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20531j c20531j = new C20531j();
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                interfaceC20392j3.beginObject();
                AbstractMap concurrentHashMap = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "height":
                            Integer numMo56507q0 = interfaceC20392j3.mo56507q0();
                            c20531j.f76923z = numMo56507q0 != null ? numMo56507q0.intValue() : 0;
                            break;
                        case "href":
                            String strMo56509w0 = interfaceC20392j3.mo56509w0();
                            if (strMo56509w0 == null) {
                                strMo56509w0 = "";
                            }
                            c20531j.f76922y = strMo56509w0;
                            break;
                        case "width":
                            Integer numMo56507q1 = interfaceC20392j3.mo56507q0();
                            c20531j.f76920E = numMo56507q1 != null ? numMo56507q1.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName2);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
            } else if (!AbstractC5583n.m16795v(c20531j, strNextName, interfaceC20392j3, interfaceC20602v0)) {
                if (map == null) {
                    map = new HashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
            }
        }
        c20531j.f76921F = map;
        interfaceC20392j3.endObject();
        return c20531j;
    }

    /* JADX INFO: renamed from: f */
    public static C20533l m56663f(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20533l c20533l = new C20533l();
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("payload")) {
                        interfaceC20392j3.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                            String strNextName3 = interfaceC20392j3.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "description":
                                    c20533l.f76926E = interfaceC20392j3.mo56509w0();
                                    break;
                                case "endTimestamp":
                                    c20533l.f76928G = interfaceC20392j3.nextDouble();
                                    break;
                                case "startTimestamp":
                                    c20533l.f76927F = interfaceC20392j3.nextDouble();
                                    break;
                                case "op":
                                    c20533l.f76934z = interfaceC20392j3.mo56509w0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapM34553B = AbstractC12350b.m34553B((Map) interfaceC20392j3.mo56499U0());
                                    if (concurrentHashMapM34553B == null) {
                                        break;
                                    } else {
                                        c20533l.f76929H = concurrentHashMapM34553B;
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
                        c20533l.f76931J = concurrentHashMap2;
                        interfaceC20392j3.endObject();
                    } else if (strNextName2.equals("tag")) {
                        String strMo56509w0 = interfaceC20392j3.mo56509w0();
                        if (strMo56509w0 == null) {
                            strMo56509w0 = "";
                        }
                        c20533l.f76933y = strMo56509w0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName2);
                    }
                }
                c20533l.f76932K = concurrentHashMap;
                interfaceC20392j3.endObject();
            } else if (!AbstractC5583n.m16795v(c20533l, strNextName, interfaceC20392j3, interfaceC20602v0)) {
                if (map == null) {
                    map = new HashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
            }
        }
        c20533l.f76930I = map;
        interfaceC20392j3.endObject();
        return c20533l;
    }

    /* JADX INFO: renamed from: g */
    public static C20534m m56664g(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20534m c20534m = new C20534m();
        HashMap map = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                interfaceC20392j3.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("payload")) {
                        interfaceC20392j3.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                            String strNextName3 = interfaceC20392j3.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "duration":
                                    c20534m.f76936F = interfaceC20392j3.nextLong();
                                    break;
                                case "segmentId":
                                    c20534m.f76950z = interfaceC20392j3.nextInt();
                                    break;
                                case "height":
                                    Integer numMo56507q0 = interfaceC20392j3.mo56507q0();
                                    c20534m.f76939I = numMo56507q0 != null ? numMo56507q0.intValue() : 0;
                                    break;
                                case "container":
                                    String strMo56509w0 = interfaceC20392j3.mo56509w0();
                                    if (strMo56509w0 == null) {
                                        strMo56509w0 = "";
                                    }
                                    c20534m.f76938H = strMo56509w0;
                                    break;
                                case "frameCount":
                                    Integer numMo56507q1 = interfaceC20392j3.mo56507q0();
                                    c20534m.f76941K = numMo56507q1 != null ? numMo56507q1.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numMo56507q2 = interfaceC20392j3.mo56507q0();
                                    c20534m.f76945O = numMo56507q2 != null ? numMo56507q2.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numMo56507q3 = interfaceC20392j3.mo56507q0();
                                    c20534m.f76944N = numMo56507q3 != null ? numMo56507q3.intValue() : 0;
                                    break;
                                case "size":
                                    Long lMo56508s0 = interfaceC20392j3.mo56508s0();
                                    c20534m.f76935E = lMo56508s0 == null ? 0L : lMo56508s0.longValue();
                                    break;
                                case "width":
                                    Integer numMo56507q4 = interfaceC20392j3.mo56507q0();
                                    c20534m.f76940J = numMo56507q4 != null ? numMo56507q4.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numMo56507q5 = interfaceC20392j3.mo56507q0();
                                    c20534m.f76943M = numMo56507q5 != null ? numMo56507q5.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strMo56509w1 = interfaceC20392j3.mo56509w0();
                                    if (strMo56509w1 == null) {
                                        strMo56509w1 = "";
                                    }
                                    c20534m.f76937G = strMo56509w1;
                                    break;
                                case "frameRateType":
                                    String strMo56509w2 = interfaceC20392j3.mo56509w0();
                                    if (strMo56509w2 == null) {
                                        strMo56509w2 = "";
                                    }
                                    c20534m.f76942L = strMo56509w2;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap2, strNextName3);
                                    break;
                            }
                        }
                        c20534m.f76947Q = concurrentHashMap2;
                        interfaceC20392j3.endObject();
                    } else if (strNextName2.equals("tag")) {
                        String strMo56509w3 = interfaceC20392j3.mo56509w0();
                        c20534m.f76949y = strMo56509w3 != null ? strMo56509w3 : "";
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName2);
                    }
                }
                c20534m.f76948R = concurrentHashMap;
                interfaceC20392j3.endObject();
            } else if (!AbstractC5583n.m16795v(c20534m, strNextName, interfaceC20392j3, interfaceC20602v0)) {
                if (map == null) {
                    map = new HashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName);
            }
        }
        c20534m.f76946P = map;
        interfaceC20392j3.endObject();
        return c20534m;
    }

    @Override // io.sentry.InterfaceC20603v1
    /* JADX INFO: renamed from: a */
    public final Object mo56294a(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        int i13 = 1;
        String strMo56509w0 = null;
        HashMap map = null;
        switch (this.f76693a) {
            case 0:
                interfaceC20392j3.beginObject();
                ArrayList arrayListMo56503c1 = null;
                HashMap map2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName = interfaceC20392j3.nextName();
                    strNextName.getClass();
                    if (strNextName.equals("rendering_system")) {
                        strMo56509w0 = interfaceC20392j3.mo56509w0();
                    } else if (strNextName.equals("windows")) {
                        arrayListMo56503c1 = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20483i0(i13));
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map2, strNextName);
                    }
                }
                interfaceC20392j3.endObject();
                C20485j0 c20485j0 = new C20485j0(strMo56509w0, arrayListMo56503c1);
                c20485j0.f76703y = map2;
                return c20485j0;
            case 1:
                C20487k0 c20487k0 = new C20487k0();
                interfaceC20392j3.beginObject();
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "rendering_system":
                            c20487k0.f76716w = interfaceC20392j3.mo56509w0();
                            break;
                        case "identifier":
                            c20487k0.f76718y = interfaceC20392j3.mo56509w0();
                            break;
                        case "height":
                            c20487k0.f76709F = interfaceC20392j3.mo56497R();
                            break;
                        case "x":
                            c20487k0.f76710G = interfaceC20392j3.mo56497R();
                            break;
                        case "y":
                            c20487k0.f76711H = interfaceC20392j3.mo56497R();
                            break;
                        case "tag":
                            c20487k0.f76719z = interfaceC20392j3.mo56509w0();
                            break;
                        case "type":
                            c20487k0.f76717x = interfaceC20392j3.mo56509w0();
                            break;
                        case "alpha":
                            c20487k0.f76713J = interfaceC20392j3.mo56497R();
                            break;
                        case "width":
                            c20487k0.f76708E = interfaceC20392j3.mo56497R();
                            break;
                        case "children":
                            c20487k0.f76714K = interfaceC20392j3.mo56503c1(interfaceC20602v0, this);
                            break;
                        case "visibility":
                            c20487k0.f76712I = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName2);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                c20487k0.f76715L = map;
                return c20487k0;
            case 2:
                return m56659b(interfaceC20392j3, interfaceC20602v0);
            case 3:
                return EnumC20524c.values()[interfaceC20392j3.nextInt()];
            case 4:
                return m56660c(interfaceC20392j3, interfaceC20602v0);
            case 5:
                return m56661d(interfaceC20392j3, interfaceC20602v0);
            case 6:
                return m56662e(interfaceC20392j3, interfaceC20602v0);
            case 7:
                return m56663f(interfaceC20392j3, interfaceC20602v0);
            default:
                return m56664g(interfaceC20392j3, interfaceC20602v0);
        }
    }
}
