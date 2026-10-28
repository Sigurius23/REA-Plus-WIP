package io.sentry.protocol;

import io.sentry.InterfaceC20392j3;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20603v1;
import io.sentry.clientreport.C20297e;
import io.sentry.vendor.gson.stream.EnumC20612b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: io.sentry.protocol.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20480h implements InterfaceC20603v1 {
    /* JADX INFO: renamed from: b */
    public static C20482i m56655b(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        ArrayList arrayList = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("values")) {
                arrayList = interfaceC20392j3.mo56503c1(interfaceC20602v0, new C20297e(1));
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        C20482i c20482i = new C20482i(arrayList);
        c20482i.f76692x = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20482i;
    }

    /* JADX INFO: renamed from: c */
    public static C20497r m56656c(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20497r c20497r = new C20497r();
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "status_code":
                    c20497r.f76783y = interfaceC20392j3.mo56507q0();
                    break;
                case "data":
                    c20497r.f76779E = interfaceC20392j3.mo56499U0();
                    break;
                case "headers":
                    Map map = (Map) interfaceC20392j3.mo56499U0();
                    if (map == null) {
                        break;
                    } else {
                        c20497r.f76782x = AbstractC12350b.m34553B(map);
                        break;
                    }
                    break;
                case "cookies":
                    c20497r.f76781w = interfaceC20392j3.mo56509w0();
                    break;
                case "body_size":
                    c20497r.f76784z = interfaceC20392j3.mo56508s0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
                    break;
            }
        }
        c20497r.f76780F = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20497r;
    }

    /* JADX INFO: renamed from: d */
    public static C20475e0 m56657d(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        C20475e0 c20475e0 = new C20475e0();
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("active_profiles")) {
                List list = (List) interfaceC20392j3.mo56499U0();
                if (list != null) {
                    String[] strArr = new String[list.size()];
                    list.toArray(strArr);
                    c20475e0.f76641w = strArr;
                }
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
            }
        }
        c20475e0.f76642x = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20475e0;
    }

    /* JADX INFO: renamed from: e */
    public static C20477f0 m56658e(InterfaceC20392j3 interfaceC20392j3, InterfaceC20602v0 interfaceC20602v0) {
        interfaceC20392j3.beginObject();
        String strMo56509w0 = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (interfaceC20392j3.peek() == EnumC20612b.NAME) {
            String strNextName = interfaceC20392j3.nextName();
            strNextName.getClass();
            if (strNextName.equals("source")) {
                strMo56509w0 = interfaceC20392j3.mo56509w0();
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                interfaceC20392j3.mo56494I(interfaceC20602v0, concurrentHashMap, strNextName);
            }
        }
        C20477f0 c20477f0 = new C20477f0(strMo56509w0);
        c20477f0.f76679x = concurrentHashMap;
        interfaceC20392j3.endObject();
        return c20477f0;
    }
}
