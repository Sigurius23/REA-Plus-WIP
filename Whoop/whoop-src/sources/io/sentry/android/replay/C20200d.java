package io.sentry.android.replay;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.models.MessageType;
import io.sentry.C20315e;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20575u3;
import io.sentry.rrweb.AbstractC20523b;
import io.sentry.rrweb.C20522a;
import io.sentry.rrweb.C20533l;
import io.sentry.util.network.C20597e;
import io.sentry.util.network.EnumC20593a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l83.EnumC23463i;
import live.hms.video.media.tracks.HMSTrackSource;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25267u;
import p005a3.C0237p;
import p581we.C37199o;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: io.sentry.android.replay.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C20200d implements InterfaceC20575u3 {

    /* JADX INFO: renamed from: c */
    public static final Object f75873c = AbstractC30060g.m92087G(EnumC23463i.f92935y, C20179a.f75805x);

    /* JADX INFO: renamed from: d */
    public static final HashSet f75874d;

    /* JADX INFO: renamed from: a */
    public String f75875a;

    /* JADX INFO: renamed from: b */
    public final Map f75876b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f75874d = hashSet;
    }

    public C20200d(C20513q6 options) {
        AbstractC22676k.m65750j(options, "options");
        this.f75876b = Collections.synchronizedMap(new C20181b());
        options.setBeforeBreadcrumb(new C37199o(this, options.getBeforeBreadcrumb(), false));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0299  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d4  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, l83.h] */
    @Override // io.sentry.InterfaceC20575u3
    /* JADX INFO: renamed from: a */
    public final AbstractC20523b mo56122a(C20315e c20315e) {
        String str;
        EnumC20436n5 enumC20436n5;
        Object obj;
        String strM125860F0;
        double dLongValue;
        double dLongValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AbstractC22676k.m65745e(c20315e.f76288G, "http")) {
            Object obj2 = c20315e.f76287F.get(QueryParams.URL);
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null && str2.length() != 0) {
                ConcurrentHashMap concurrentHashMap = c20315e.f76287F;
                AbstractC22676k.m65749i(concurrentHashMap, "getData(...)");
                if (concurrentHashMap.containsKey("http.start_timestamp")) {
                    ConcurrentHashMap concurrentHashMap2 = c20315e.f76287F;
                    AbstractC22676k.m65749i(concurrentHashMap2, "getData(...)");
                    if (concurrentHashMap2.containsKey("http.end_timestamp")) {
                        Object obj3 = c20315e.f76287F.get("http.start_timestamp");
                        Object obj4 = c20315e.f76287F.get("http.end_timestamp");
                        C20533l c20533l = new C20533l();
                        c20533l.f76901x = c20315e.m56469b().getTime();
                        c20533l.f76934z = "resource.http";
                        Object obj5 = c20315e.f76287F.get(QueryParams.URL);
                        AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type kotlin.String");
                        c20533l.f76926E = (String) obj5;
                        if (obj3 instanceof Double) {
                            dLongValue = ((Number) obj3).doubleValue();
                        } else {
                            AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Long");
                            dLongValue = ((Long) obj3).longValue();
                        }
                        c20533l.f76927F = dLongValue / 1000.0d;
                        if (obj4 instanceof Double) {
                            dLongValue2 = ((Number) obj4).doubleValue();
                        } else {
                            AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Long");
                            dLongValue2 = ((Long) obj4).longValue();
                        }
                        c20533l.f76928G = dLongValue2 / 1000.0d;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        C20597e c20597e = (C20597e) this.f75876b.remove(c20315e);
                        if (c20597e != null) {
                            String str3 = c20597e.f77101a;
                            if (str3 != null) {
                                linkedHashMap2.put("method", str3);
                            }
                            Integer num = c20597e.f77102b;
                            if (num != null) {
                                linkedHashMap2.put("statusCode", num);
                            }
                            Long l7 = c20597e.f77103c;
                            if (l7 != null) {
                                linkedHashMap2.put("requestBodySize", l7);
                            }
                            Long l12 = c20597e.f77104d;
                            if (l12 != null) {
                                linkedHashMap2.put("responseBodySize", l12);
                            }
                            C0237p c0237p = c20597e.f77105e;
                            if (c0237p != null) {
                                LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0237p.f814z;
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                Long l13 = (Long) c0237p.f812x;
                                if (l13 != null) {
                                    linkedHashMap4.put("size", l13);
                                }
                                C38445a c38445a = (C38445a) c0237p.f813y;
                                if (c38445a != null) {
                                    linkedHashMap4.put("body", c38445a.m123181r());
                                    List listM123184v = c38445a.m123184v();
                                    if (listM123184v != null) {
                                        List list = listM123184v;
                                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((EnumC20593a) it.next()).getValue());
                                        }
                                        linkedHashMap4.put("warnings", arrayList);
                                    }
                                }
                                if (!linkedHashMap3.isEmpty()) {
                                    linkedHashMap4.put("headers", linkedHashMap3);
                                }
                                if (!linkedHashMap4.isEmpty()) {
                                    linkedHashMap2.put("request", linkedHashMap4);
                                }
                            }
                            C0237p c0237p2 = c20597e.f77106f;
                            if (c0237p2 != null) {
                                LinkedHashMap linkedHashMap5 = (LinkedHashMap) c0237p2.f814z;
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                Long l14 = (Long) c0237p2.f812x;
                                if (l14 != null) {
                                    linkedHashMap6.put("size", l14);
                                }
                                C38445a c38445a2 = (C38445a) c0237p2.f813y;
                                if (c38445a2 != null) {
                                    linkedHashMap6.put("body", c38445a2.m123181r());
                                    List listM123184v2 = c38445a2.m123184v();
                                    if (listM123184v2 != null) {
                                        List list2 = listM123184v2;
                                        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(((EnumC20593a) it3.next()).getValue());
                                        }
                                        linkedHashMap6.put("warnings", arrayList2);
                                    }
                                }
                                if (!linkedHashMap5.isEmpty()) {
                                    linkedHashMap6.put("headers", linkedHashMap5);
                                }
                                if (!linkedHashMap6.isEmpty()) {
                                    linkedHashMap2.put("response", linkedHashMap6);
                                }
                            }
                        }
                        ConcurrentHashMap concurrentHashMap3 = c20315e.f76287F;
                        AbstractC22676k.m65749i(concurrentHashMap3, "getData(...)");
                        for (Map.Entry entry : concurrentHashMap3.entrySet()) {
                            String str4 = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (f75874d.contains(str4)) {
                                AbstractC22676k.m65747g(str4);
                                String strM125926K = AbstractC39421y.m125926K(str4, "content_length", "body_size", false);
                                linkedHashMap2.put(((C39412p) f75873c.getValue()).m125853g(AbstractC39414r.m125859E0(strM125926K, ".", strM125926K), C20183c.f75817x), value);
                            }
                        }
                        c20533l.f76929H = new ConcurrentHashMap(linkedHashMap2);
                        return c20533l;
                    }
                }
            }
        } else {
            String str5 = c20315e.f76286E;
            String str6 = NotificationCompat.CATEGORY_NAVIGATION;
            if (AbstractC22676k.m65745e(str5, NotificationCompat.CATEGORY_NAVIGATION) && AbstractC22676k.m65745e(c20315e.f76288G, "app.lifecycle")) {
                str6 = "app." + c20315e.f76287F.get("state");
            } else if (AbstractC22676k.m65745e(c20315e.f76286E, NotificationCompat.CATEGORY_NAVIGATION) && AbstractC22676k.m65745e(c20315e.f76288G, "device.orientation")) {
                str6 = c20315e.f76288G;
                AbstractC22676k.m65747g(str6);
                Object obj6 = c20315e.f76287F.get("position");
                if (AbstractC22676k.m65745e(obj6, "landscape") || AbstractC22676k.m65745e(obj6, "portrait")) {
                    linkedHashMap.put("position", obj6);
                }
            } else if (AbstractC22676k.m65745e(c20315e.f76286E, NotificationCompat.CATEGORY_NAVIGATION)) {
                if (AbstractC22676k.m65745e(c20315e.f76287F.get("state"), "resumed")) {
                    Object obj7 = c20315e.f76287F.get(HMSTrackSource.SCREEN);
                    String str7 = obj7 instanceof String ? (String) obj7 : null;
                    if (str7 != null) {
                        strM125860F0 = AbstractC39414r.m125860F0('.', str7, str7);
                    } else {
                        strM125860F0 = null;
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap4 = c20315e.f76287F;
                    AbstractC22676k.m65749i(concurrentHashMap4, "getData(...)");
                    if (concurrentHashMap4.containsKey("to")) {
                        Object obj8 = c20315e.f76287F.get("to");
                        if (obj8 instanceof String) {
                            strM125860F0 = (String) obj8;
                        } else {
                            strM125860F0 = null;
                        }
                    } else {
                        strM125860F0 = null;
                    }
                }
                if (strM125860F0 != null) {
                    linkedHashMap.put("to", strM125860F0);
                }
            } else if (AbstractC22676k.m65745e(c20315e.f76288G, "ui.click")) {
                Object obj9 = c20315e.f76287F.get("view.id");
                if (obj9 == null && (obj9 = c20315e.f76287F.get("view.tag")) == null) {
                    obj9 = c20315e.f76287F.get("view.class");
                }
                str = obj9 instanceof String ? (String) obj9 : null;
                if (str != null) {
                    ConcurrentHashMap concurrentHashMap5 = c20315e.f76287F;
                    AbstractC22676k.m65749i(concurrentHashMap5, "getData(...)");
                    linkedHashMap.putAll(concurrentHashMap5);
                    str6 = "ui.tap";
                    enumC20436n5 = null;
                    if (str6 != null && str6.length() != 0) {
                        C20522a c20522a = new C20522a();
                        c20522a.f76901x = c20315e.m56469b().getTime();
                        c20522a.f76899z = c20315e.m56469b().getTime() / 1000.0d;
                        c20522a.f76890E = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
                        c20522a.f76891F = str6;
                        c20522a.f76892G = str;
                        c20522a.f76893H = enumC20436n5;
                        c20522a.f76894I = new ConcurrentHashMap(linkedHashMap);
                        return c20522a;
                    }
                }
            } else if (AbstractC22676k.m65745e(c20315e.f76286E, MessageType.SYSTEM) && AbstractC22676k.m65745e(c20315e.f76288G, "network.event")) {
                if (!AbstractC22676k.m65745e(c20315e.f76287F.get("action"), "NETWORK_LOST")) {
                    ConcurrentHashMap concurrentHashMap6 = c20315e.f76287F;
                    AbstractC22676k.m65749i(concurrentHashMap6, "getData(...)");
                    if (concurrentHashMap6.containsKey("network_type")) {
                        Object obj10 = c20315e.f76287F.get("network_type");
                        String str8 = obj10 instanceof String ? (String) obj10 : null;
                        obj = (str8 == null || str8.length() == 0) ? "offline" : c20315e.f76287F.get("network_type");
                    }
                }
                linkedHashMap.put("state", obj);
                if (!AbstractC22676k.m65745e(this.f75875a, linkedHashMap.get("state"))) {
                    Object obj11 = linkedHashMap.get("state");
                    this.f75875a = obj11 instanceof String ? (String) obj11 : null;
                    str6 = "device.connectivity";
                }
            } else {
                if (AbstractC22676k.m65745e(c20315e.f76287F.get("action"), "BATTERY_CHANGED")) {
                    ConcurrentHashMap concurrentHashMap7 = c20315e.f76287F;
                    AbstractC22676k.m65749i(concurrentHashMap7, "getData(...)");
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    for (Map.Entry entry2 : concurrentHashMap7.entrySet()) {
                        String str9 = (String) entry2.getKey();
                        if (AbstractC22676k.m65745e(str9, "level") || AbstractC22676k.m65745e(str9, "charging")) {
                            linkedHashMap7.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap7);
                    str6 = "device.battery";
                } else {
                    str6 = c20315e.f76288G;
                    str = c20315e.f76295z;
                    enumC20436n5 = c20315e.f76290I;
                    ConcurrentHashMap concurrentHashMap8 = c20315e.f76287F;
                    AbstractC22676k.m65749i(concurrentHashMap8, "getData(...)");
                    linkedHashMap.putAll(concurrentHashMap8);
                }
                if (str6 != null) {
                    C20522a c20522a2 = new C20522a();
                    c20522a2.f76901x = c20315e.m56469b().getTime();
                    c20522a2.f76899z = c20315e.m56469b().getTime() / 1000.0d;
                    c20522a2.f76890E = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
                    c20522a2.f76891F = str6;
                    c20522a2.f76892G = str;
                    c20522a2.f76893H = enumC20436n5;
                    c20522a2.f76894I = new ConcurrentHashMap(linkedHashMap);
                    return c20522a2;
                }
            }
            str = null;
            enumC20436n5 = null;
            if (str6 != null) {
                C20522a c20522a3 = new C20522a();
                c20522a3.f76901x = c20315e.m56469b().getTime();
                c20522a3.f76899z = c20315e.m56469b().getTime() / 1000.0d;
                c20522a3.f76890E = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
                c20522a3.f76891F = str6;
                c20522a3.f76892G = str;
                c20522a3.f76893H = enumC20436n5;
                c20522a3.f76894I = new ConcurrentHashMap(linkedHashMap);
                return c20522a3;
            }
        }
        return null;
    }
}
