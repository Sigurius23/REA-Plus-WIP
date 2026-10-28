package io.sentry.clientreport;

import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20392j3;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20603v1;
import io.sentry.protocol.C20478g;
import io.sentry.protocol.C20501v;
import io.sentry.protocol.profiling.C20493a;
import io.sentry.protocol.profiling.C20494b;
import io.sentry.protocol.profiling.C20495c;
import io.sentry.rrweb.C20529h;
import io.sentry.rrweb.EnumC20525d;
import io.sentry.rrweb.EnumC20527f;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: io.sentry.clientreport.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20297e implements InterfaceC20603v1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76194a;

    public /* synthetic */ C20297e(int i13) {
        this.f76194a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C20501v m56295b(InterfaceC20392j3 interfaceC20392j3) {
        return new C20501v(interfaceC20392j3.nextString());
    }

    /* JADX INFO: renamed from: c */
    public static IllegalStateException m56296c(InterfaceC20602v0 interfaceC20602v0, String str) {
        String strM31996o = AbstractC11895b.m31996o("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM31996o);
        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, strM31996o, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.InterfaceC20603v1
    /* JADX INFO: renamed from: a */
    public final Object mo56294a(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        String strMo56509w0 = null;
        HashMap map = null;
        HashMap map2 = null;
        HashMap map3 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strMo56509w1 = null;
        switch (this.f76194a) {
            case 0:
                interfaceC20392j3.beginObject();
                String strMo56509w2 = null;
                Long lMo56508s0 = null;
                HashMap map4 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName = interfaceC20392j3.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "quantity":
                            lMo56508s0 = interfaceC20392j3.mo56508s0();
                            break;
                        case "reason":
                            strMo56509w0 = interfaceC20392j3.mo56509w0();
                            break;
                        case "category":
                            strMo56509w2 = interfaceC20392j3.mo56509w0();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map4, strNextName);
                            break;
                    }
                }
                interfaceC20392j3.endObject();
                if (strMo56509w0 == null) {
                    throw m56296c(interfaceC20602v0, "reason");
                }
                if (strMo56509w2 == null) {
                    throw m56296c(interfaceC20602v0, "category");
                }
                if (lMo56508s0 == null) {
                    throw m56296c(interfaceC20602v0, "quantity");
                }
                C20298f c20298f = new C20298f(strMo56509w0, strMo56509w2, lMo56508s0);
                c20298f.f76198z = map4;
                return c20298f;
            case 1:
                interfaceC20392j3.beginObject();
                Boolean boolMo56500W = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName2 = interfaceC20392j3.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("result")) {
                        boolMo56500W = interfaceC20392j3.mo56500W();
                    } else if (strNextName2.equals("flag")) {
                        strMo56509w1 = interfaceC20392j3.mo56509w0();
                    } else {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap2, strNextName2);
                    }
                }
                if (strMo56509w1 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolMo56500W == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                boolean zBooleanValue = boolMo56500W.booleanValue();
                C20478g c20478g = new C20478g();
                c20478g.f76680w = strMo56509w1;
                c20478g.f76681x = zBooleanValue;
                c20478g.f76682y = concurrentHashMap2;
                interfaceC20392j3.endObject();
                return c20478g;
            case 2:
                return m56295b(interfaceC20392j3);
            case 3:
                interfaceC20392j3.beginObject();
                C20493a c20493a = new C20493a();
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName3 = interfaceC20392j3.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "frames":
                            ArrayList arrayListMo56503c1 = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20293a(24));
                            if (arrayListMo56503c1 == null) {
                                break;
                            } else {
                                c20493a.f76758y = arrayListMo56503c1;
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) interfaceC20392j3.mo56501Z(interfaceC20602v0, new C20297e(4));
                            if (list == null) {
                                break;
                            } else {
                                c20493a.f76757x = list;
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListMo56503c2 = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20297e(5));
                            if (arrayListMo56503c2 == null) {
                                break;
                            } else {
                                c20493a.f76756w = arrayListMo56503c2;
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapMo56510y0 = interfaceC20392j3.mo56510y0(interfaceC20602v0, new C20297e(6));
                            if (mapMo56510y0 == null) {
                                break;
                            } else {
                                c20493a.f76759z = mapMo56510y0;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName3);
                            break;
                    }
                }
                c20493a.f76755E = concurrentHashMap;
                interfaceC20392j3.endObject();
                return c20493a;
            case 4:
                ArrayList arrayList = new ArrayList();
                interfaceC20392j3.beginArray();
                while (interfaceC20392j3.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    interfaceC20392j3.beginArray();
                    while (interfaceC20392j3.hasNext()) {
                        arrayList2.add(Integer.valueOf(interfaceC20392j3.nextInt()));
                    }
                    interfaceC20392j3.endArray();
                    arrayList.add(arrayList2);
                }
                interfaceC20392j3.endArray();
                return arrayList;
            case 5:
                interfaceC20392j3.beginObject();
                C20494b c20494b = new C20494b();
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName4 = interfaceC20392j3.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "thread_id":
                            c20494b.f76762y = interfaceC20392j3.mo56509w0();
                            break;
                        case "timestamp":
                            c20494b.f76760w = interfaceC20392j3.nextDouble();
                            break;
                        case "stack_id":
                            c20494b.f76761x = interfaceC20392j3.nextInt();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map3, strNextName4);
                            break;
                    }
                }
                c20494b.f76763z = map3;
                interfaceC20392j3.endObject();
                return c20494b;
            case 6:
                interfaceC20392j3.beginObject();
                C20495c c20495c = new C20495c();
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName5 = interfaceC20392j3.nextName();
                    strNextName5.getClass();
                    if (strNextName5.equals("priority")) {
                        c20495c.f76765x = interfaceC20392j3.nextInt();
                    } else if (strNextName5.equals("name")) {
                        c20495c.f76764w = interfaceC20392j3.mo56509w0();
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        interfaceC20392j3.mo56494I(interfaceC20602v0, map2, strNextName5);
                    }
                }
                c20495c.f76766y = map2;
                interfaceC20392j3.endObject();
                return c20495c;
            case 7:
                return EnumC20525d.values()[interfaceC20392j3.nextInt()];
            case 8:
                return EnumC20527f.values()[interfaceC20392j3.nextInt()];
            default:
                interfaceC20392j3.beginObject();
                C20529h c20529h = new C20529h();
                while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
                    String strNextName6 = interfaceC20392j3.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "x":
                            c20529h.f76913x = interfaceC20392j3.nextFloat();
                            break;
                        case "y":
                            c20529h.f76914y = interfaceC20392j3.nextFloat();
                            break;
                        case "id":
                            c20529h.f76912w = interfaceC20392j3.nextInt();
                            break;
                        case "timeOffset":
                            c20529h.f76915z = interfaceC20392j3.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC20392j3.mo56494I(interfaceC20602v0, map, strNextName6);
                            break;
                    }
                }
                c20529h.f76911E = map;
                interfaceC20392j3.endObject();
                return c20529h;
        }
    }

    public /* synthetic */ C20297e(boolean z4) {
        this.f76194a = 2;
    }
}
