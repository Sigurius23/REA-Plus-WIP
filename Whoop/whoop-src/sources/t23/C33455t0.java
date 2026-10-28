package t23;

import android.os.Build;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import d33.C11602h1;
import e33.C12662v0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13105z1;
import hc3.C17171d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23470p;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import n33.C26243q;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.RTCStats;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p460rg.AbstractC31366a;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: t23.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33455t0 {

    /* JADX INFO: renamed from: a */
    public final C33368c0 f139705a;

    /* JADX INFO: renamed from: b */
    public final C23470p f139706b = AbstractC1772c1.m5382S(this, "CallStats");

    /* JADX INFO: renamed from: c */
    public final C25126d f139707c;

    /* JADX INFO: renamed from: d */
    public final C25126d f139708d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f139709e;

    public C33455t0(C33368c0 c33368c0, C17171d c17171d) {
        this.f139705a = c33368c0;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(c17171d.f65971w.plus(AbstractC3006f0.m8710d()));
        this.f139707c = new C25126d(c17171dM8708b);
        this.f139708d = new C25126d(c17171dM8708b);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f139709e = c13045h2M36593c;
        AbstractC13091v.m36587M(c13045h2M36593c, c17171dM8708b, C13105z1.m36630a(3, 0L), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    /* JADX WARN: Code duplicated, block: B:110:0x0204  */
    /* JADX WARN: Code duplicated, block: B:118:0x0213  */
    /* JADX WARN: Code duplicated, block: B:119:0x0215  */
    /* JADX WARN: Code duplicated, block: B:142:0x0284  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[PHI: r11
      0x00bd: PHI (r11v1 java.lang.String) = 
      (r11v0 java.lang.String)
      (r11v0 java.lang.String)
      (r11v0 java.lang.String)
      (r11v0 java.lang.String)
      (r11v47 java.lang.String)
      (r11v0 java.lang.String)
      (r11v48 java.lang.String)
     binds: [B:27:0x008e, B:29:0x0096, B:49:0x00fe, B:37:0x00c7, B:46:0x00ed, B:32:0x00a0, B:34:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public final void m105870a(C26243q c26243q, boolean z4) {
        Iterator<Map.Entry<String, RTCStats>> it;
        List list;
        Map map;
        Map map2;
        C23470p c23470p;
        String str;
        Object obj;
        RTCStats rTCStats;
        String str2;
        RTCStats rTCStats2;
        RTCStats rTCStats3;
        RTCStats rTCStats4;
        C33481y1 c33481y1M96472l;
        C33481y1 c33481y1M96472l2;
        C33481y1 c33481y1M96472l3;
        String str3;
        String str4;
        Double d3;
        RTCStats rTCStats5;
        RTCStats rTCStats6;
        RTCStats rTCStats7;
        String str5;
        C13045h2 c13045h2;
        C12662v0 c12662v0;
        C13045h2 c13045h3;
        C12662v0 c12662v1;
        this = this;
        C13045h2 c13045h4 = this.f139705a.f139268C;
        if (c26243q == null) {
            return;
        }
        List listM118959K = AbstractC37056f.m118959K("certificate", "data-channel");
        C11602h1 c11602h1 = (C11602h1) c13045h4.getValue();
        C25272z c25272z = C25272z.f99163w;
        Map mapM74001j0 = (c11602h1 == null || (c13045h3 = c11602h1.f37464z) == null || (c12662v1 = (C12662v0) c13045h3.getValue()) == null) ? c25272z : AbstractC25247g0.m74001j0(c12662v1.f43300M);
        C11602h1 c11602h2 = (C11602h1) c13045h4.getValue();
        Map mapM35429s = (c11602h2 == null || (c13045h2 = c11602h2.f37464z) == null || (c12662v0 = (C12662v0) c13045h2.getValue()) == null) ? c25272z : c12662v0.m35429s();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, RTCStats> statsMap = c26243q.f104348a.getStatsMap();
        AbstractC22676k.m65749i(statsMap, "getStatsMap(...)");
        Iterator<Map.Entry<String, RTCStats>> it3 = statsMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            C23470p c23470p2 = this.f139706b;
            if (!zHasNext) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    C2345k c2345k = (C2345k) c23470p2.getValue();
                    InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                    String str6 = c2345k.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.INFO;
                    if (interfaceC2339e.isLoggable(enumC2341g, str6)) {
                        c2345k.f9274b.log(enumC2341g, str6, "statgroup " + entry.getKey() + ":" + entry.getValue(), null);
                    }
                }
                return;
            }
            RTCStats value = it3.next().getValue();
            String type = value.getType();
            if (!listM118959K.contains(type)) {
                if (type != null) {
                    switch (type.hashCode()) {
                        case -994679270:
                            it = it3;
                            if (type.equals("inbound-rtp")) {
                                type = type + ":" + value.getMembers().get("kind");
                            }
                            break;
                        case -819060207:
                            if (type.equals("outbound-rtp")) {
                                it = it3;
                                Object obj2 = value.getMembers().get("rid");
                                type = type + ":" + value.getMembers().get("kind") + (obj2 != null ? AbstractC25012a.m73375h(obj2, ":") : "");
                            } else {
                                it = it3;
                            }
                            break;
                        case 94834710:
                            if (type.equals("codec")) {
                                Object obj3 = value.getMembers().get("mimeType");
                                String str7 = obj3 instanceof String ? (String) obj3 : null;
                                if (str7 == null || (str5 = (String) AbstractC25265s.m74100H0(AbstractC39414r.m125906y0(str7, new String[]{"/"}, 6))) == null) {
                                    it = it3;
                                    type = null;
                                } else {
                                    type = "codec:".concat(str5);
                                    it = it3;
                                }
                            } else {
                                it = it3;
                            }
                            break;
                        case 110621003:
                            if (type.equals("track")) {
                                type = type + ":" + value.getMembers().get("kind");
                            }
                            it = it3;
                            break;
                        default:
                            it = it3;
                            break;
                    }
                } else {
                    it = it3;
                }
                if (type != null) {
                    if (!linkedHashMap.containsKey(type)) {
                        linkedHashMap.put(type, new ArrayList());
                    }
                    List list2 = (List) linkedHashMap.get(type);
                    if (list2 != null) {
                        list2.add(value);
                    }
                }
                C25126d c25126d = this.f139707c;
                if (z4) {
                    List list3 = (List) linkedHashMap.get("outbound-rtp:video:f");
                    if (list3 == null || (rTCStats7 = (RTCStats) AbstractC25265s.m74100H0(list3)) == null) {
                        c33481y1M96472l = null;
                    } else {
                        Map<String, Object> members = rTCStats7.getMembers();
                        AbstractC22676k.m65749i(members, "getMembers(...)");
                        c33481y1M96472l = AbstractC31366a.m96472l(members);
                    }
                    List list4 = (List) linkedHashMap.get("outbound-rtp:video:h");
                    if (list4 == null || (rTCStats6 = (RTCStats) AbstractC25265s.m74100H0(list4)) == null) {
                        c33481y1M96472l2 = null;
                    } else {
                        Map<String, Object> members2 = rTCStats6.getMembers();
                        AbstractC22676k.m65749i(members2, "getMembers(...)");
                        c33481y1M96472l2 = AbstractC31366a.m96472l(members2);
                    }
                    list = listM118959K;
                    List list5 = (List) linkedHashMap.get("outbound-rtp:video:q");
                    if (list5 == null || (rTCStats5 = (RTCStats) AbstractC25265s.m74100H0(list5)) == null) {
                        c33481y1M96472l3 = null;
                    } else {
                        Map<String, Object> members3 = rTCStats5.getMembers();
                        AbstractC22676k.m65749i(members3, "getMembers(...)");
                        c33481y1M96472l3 = AbstractC31366a.m96472l(members3);
                    }
                    if (c33481y1M96472l == null) {
                        if (c33481y1M96472l2 != null || c33481y1M96472l2.f139788c == null || c33481y1M96472l2.f139789d == null || c33481y1M96472l2.f139790e == null) {
                            c33481y1M96472l2 = null;
                        }
                        if (c33481y1M96472l2 == null) {
                            c33481y1M96472l3 = c33481y1M96472l2;
                        } else if (c33481y1M96472l3 != null || c33481y1M96472l3.f139788c == null || c33481y1M96472l3.f139789d == null || c33481y1M96472l3.f139790e == null) {
                            c33481y1M96472l3 = null;
                        }
                    } else {
                        if (c33481y1M96472l.f139788c == null || c33481y1M96472l.f139789d == null || c33481y1M96472l.f139790e == null) {
                            c33481y1M96472l = null;
                        }
                        if (c33481y1M96472l == null) {
                            if (c33481y1M96472l2 != null) {
                                c33481y1M96472l2 = null;
                            } else {
                                c33481y1M96472l2 = null;
                            }
                            if (c33481y1M96472l2 == null) {
                                c33481y1M96472l3 = c33481y1M96472l2;
                            } else if (c33481y1M96472l3 != null) {
                                c33481y1M96472l3 = null;
                            } else {
                                c33481y1M96472l3 = null;
                            }
                        } else {
                            c33481y1M96472l3 = c33481y1M96472l;
                        }
                    }
                    C13045h2 c13045h5 = (C13045h2) c25126d.f98479E;
                    if (c33481y1M96472l3 == null || (str3 = c33481y1M96472l3.f139786a) == null) {
                        str3 = "";
                    }
                    c13045h5.getClass();
                    c13045h5.m36571k(null, str3);
                    C13045h2 c13045h6 = (C13045h2) c25126d.f98480F;
                    Integer numValueOf = Integer.valueOf((c33481y1M96472l3 == null || (d3 = c33481y1M96472l3.f139787b) == null) ? 0 : (int) (((double) 1000) * d3.doubleValue()));
                    c13045h6.getClass();
                    c13045h6.m36571k(null, numValueOf);
                    if (c33481y1M96472l3 == null) {
                        str4 = null;
                    } else {
                        if (c33481y1M96472l3.f139788c == null || c33481y1M96472l3.f139789d == null || c33481y1M96472l3.f139790e == null) {
                            c33481y1M96472l3 = null;
                        }
                        if (c33481y1M96472l3 != null) {
                            str4 = c33481y1M96472l3.f139788c + " x " + c33481y1M96472l3.f139789d + " @ " + c33481y1M96472l3.f139790e + "fps";
                        } else {
                            str4 = null;
                        }
                    }
                    if (str4 != null) {
                        C13045h2 c13045h7 = (C13045h2) c25126d.f98486z;
                        c13045h7.getClass();
                        c13045h7.m36571k(null, str4);
                    }
                } else {
                    list = listM118959K;
                    c25272z = c25272z;
                }
                List list6 = (List) linkedHashMap.get("outbound-rtp:video");
                String str8 = " fps";
                if (list6 == null || (rTCStats4 = (RTCStats) AbstractC25265s.m74100H0(list6)) == null) {
                    map = mapM35429s;
                    map2 = mapM74001j0;
                    c23470p = c23470p2;
                    str = "/";
                    obj = "mimeType";
                } else {
                    c23470p = c23470p2;
                    Object obj4 = rTCStats4.getMembers().get("jitter");
                    str = "/";
                    Double d14 = obj4 instanceof Double ? (Double) obj4 : null;
                    Object obj5 = rTCStats4.getMembers().get("frameWidth");
                    Double d15 = d14;
                    Long l7 = obj5 instanceof Long ? (Long) obj5 : null;
                    Object obj6 = rTCStats4.getMembers().get("frameHeight");
                    Long l12 = obj6 instanceof Long ? (Long) obj6 : null;
                    Object obj7 = rTCStats4.getMembers().get("framesPerSecond");
                    obj = "mimeType";
                    Double d16 = obj7 instanceof Double ? (Double) obj7 : null;
                    Map<String, Object> members4 = rTCStats4.getMembers();
                    map = mapM35429s;
                    Object obj8 = members4.get("qualityLimitationReason");
                    String str9 = obj8 instanceof String ? (String) obj8 : null;
                    C13045h2 c13045h8 = (C13045h2) c25126d.f98479E;
                    if (str9 == null) {
                        str9 = "";
                    }
                    c13045h8.getClass();
                    map2 = mapM74001j0;
                    c13045h8.m36571k(null, str9);
                    if (d15 != null) {
                        C13045h2 c13045h9 = (C13045h2) c25126d.f98480F;
                        Integer numValueOf2 = Integer.valueOf((int) (((double) 1000) * d15.doubleValue()));
                        c13045h9.getClass();
                        c13045h9.m36571k(null, numValueOf2);
                    }
                    if (l7 == null || l12 == null || d16 == null) {
                        str8 = str8;
                    } else {
                        C13045h2 c13045h10 = (C13045h2) c25126d.f98486z;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(l7);
                        sb4.append(" x ");
                        sb4.append(l12);
                        sb4.append(" @ ");
                        sb4.append(d16);
                        str8 = " fps";
                        sb4.append(str8);
                        c13045h10.m36570j(sb4.toString());
                    }
                }
                List list7 = (List) linkedHashMap.get("inbound-rtp:video");
                C25126d c25126d2 = this.f139708d;
                if (list7 != null && (rTCStats3 = (RTCStats) AbstractC25265s.m74100H0(list7)) != null) {
                    Object obj9 = rTCStats3.getMembers().get("jitter");
                    AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type kotlin.Double");
                    double dDoubleValue = ((Double) obj9).doubleValue();
                    Object obj10 = rTCStats3.getMembers().get("frameWidth");
                    Long l13 = obj10 instanceof Long ? (Long) obj10 : null;
                    Object obj11 = rTCStats3.getMembers().get("frameHeight");
                    Long l14 = obj11 instanceof Long ? (Long) obj11 : null;
                    Object obj12 = rTCStats3.getMembers().get("framesPerSecond");
                    Double d17 = obj12 instanceof Double ? (Double) obj12 : null;
                    C13045h2 c13045h11 = (C13045h2) c25126d2.f98480F;
                    Integer numValueOf3 = Integer.valueOf((int) (((double) 1000) * dDoubleValue));
                    c13045h11.getClass();
                    c13045h11.m36571k(null, numValueOf3);
                    if (l13 != null && l14 != null && d17 != null) {
                        ((C13045h2) c25126d2.f98486z).m36570j(l13 + " x " + l14 + " @ " + d17 + str8);
                    }
                }
                List list8 = (List) linkedHashMap.get("candidate-pair");
                if (list8 != null && (rTCStats2 = (RTCStats) AbstractC25265s.m74100H0(list8)) != null) {
                    Object obj13 = rTCStats2.getMembers().get("currentRoundTripTime");
                    Double d18 = obj13 instanceof Double ? (Double) obj13 : null;
                    Object obj14 = rTCStats2.getMembers().get("availableOutgoingBitrate");
                    Double d19 = obj14 instanceof Double ? (Double) obj14 : null;
                    Object obj15 = rTCStats2.getMembers().get("availableIncomingBitrate");
                    Double d24 = obj15 instanceof Double ? (Double) obj15 : null;
                    if (d18 != null) {
                        C13045h2 c13045h12 = (C13045h2) c25126d.f98484x;
                        Integer numValueOf4 = Integer.valueOf((int) (d18.doubleValue() * ((double) 1000)));
                        c13045h12.getClass();
                        c13045h12.m36571k(null, numValueOf4);
                    }
                    if (d19 != null) {
                        C13045h2 c13045h13 = (C13045h2) c25126d.f98481G;
                        Float fValueOf = Float.valueOf((float) (d19.doubleValue() / ((double) 1000)));
                        c13045h13.getClass();
                        c13045h13.m36571k(null, fValueOf);
                    }
                    if (d24 != null) {
                        C13045h2 c13045h14 = (C13045h2) c25126d2.f98481G;
                        Float fValueOf2 = Float.valueOf((float) (d24.doubleValue() / ((double) 1000)));
                        c13045h14.getClass();
                        c13045h14.m36571k(null, fValueOf2);
                    }
                }
                List<RTCStats> list9 = (List) linkedHashMap.get("track:video");
                if (list9 != null) {
                    for (RTCStats rTCStats8 : list9) {
                        Map map3 = map2;
                        String str10 = (String) map3.get(rTCStats8.getMembers().get("trackIdentifier"));
                        Map map4 = map;
                        Map map5 = (Map) map4.get(str10);
                        if (map5 == null) {
                            map5 = c25272z;
                        }
                        if (map5.get(TrackType.TRACK_TYPE_VIDEO) != null) {
                            throw new ClassCastException();
                        }
                        rTCStats8.getMembers().get("totalFreezesDuration");
                        Object obj16 = rTCStats8.getMembers().get("frameWidth");
                        Long l15 = obj16 instanceof Long ? (Long) obj16 : null;
                        rTCStats8.getMembers().get("frameHeight");
                        rTCStats8.getMembers().get("framesReceived");
                        rTCStats8.getMembers().get("totalFramesDuration");
                        if (str10 != null) {
                            C2345k c2345k2 = (C2345k) c23470p.getValue();
                            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
                            String str11 = c2345k2.f9273a;
                            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                            if (interfaceC2339e2.isLoggable(enumC2341g2, str11)) {
                                InterfaceC2344j interfaceC2344j = c2345k2.f9274b;
                                Object obj17 = rTCStats8.getMembers().get("frameWidth");
                                StringBuilder sb5 = new StringBuilder("[stats] #manual-quality-selection; receiving video for ");
                                sb5.append(str10);
                                sb5.append(" at ");
                                sb5.append(l15);
                                sb5.append(": ");
                                interfaceC2344j.log(enumC2341g2, str11, AbstractC2875y.m8303p(sb5, " and rendering it at null visible: null", obj17), null);
                            }
                        }
                        map2 = map3;
                        map = map4;
                    }
                }
                Map map6 = map;
                Map map7 = map2;
                List list10 = (List) linkedHashMap.get("codec:video");
                if (list10 != null && (rTCStats = (RTCStats) AbstractC25265s.m74100H0(list10)) != null) {
                    Object obj18 = rTCStats.getMembers().get(obj);
                    String str12 = obj18 instanceof String ? (String) obj18 : null;
                    if (str12 != null && (str2 = (String) AbstractC39414r.m125906y0(str12, new String[]{str}, 6).get(1)) != null) {
                        if (z4) {
                            C13045h2 c13045h15 = (C13045h2) c25126d.f98482H;
                            c13045h15.getClass();
                            c13045h15.m36571k(null, str2);
                        } else {
                            C13045h2 c13045h16 = (C13045h2) c25126d2.f98482H;
                            c13045h16.getClass();
                            c13045h16.m36571k(null, str2);
                        }
                    }
                }
                mapM74001j0 = map7;
                mapM35429s = map6;
                it3 = it;
                listM118959K = list;
                c25272z = c25272z;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m105871b() {
        Object next;
        C13045h2 c13045h2;
        C12662v0 c12662v0;
        C33368c0 c33368c0 = this.f139705a;
        C13045h2 c13045h3 = c33368c0.f139268C;
        C11602h1 c11602h1 = (C11602h1) c13045h3.getValue();
        if (c11602h1 != null && (c13045h2 = c11602h1.f37464z) != null && (c12662v0 = (C12662v0) c13045h2.getValue()) != null) {
            c12662v0.m35429s();
        }
        CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) c33368c0.m105814e().f139360q.getValue();
        List list = (List) c33368c0.m105814e().f139362s.getValue();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) next;
                int i13 = captureFormat2.width * captureFormat2.height;
                do {
                    Object next2 = it.next();
                    CameraEnumerationAndroid.CaptureFormat captureFormat3 = (CameraEnumerationAndroid.CaptureFormat) next2;
                    int i14 = captureFormat3.width * captureFormat3.height;
                    if (i13 < i14) {
                        next = next2;
                        i13 = i14;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        CameraEnumerationAndroid.CaptureFormat captureFormat4 = (CameraEnumerationAndroid.CaptureFormat) next;
        C11602h1 c11602h2 = (C11602h1) c13045h3.getValue();
        String str = c11602h2 != null ? c11602h2.f37443e : null;
        String str2 = Build.VERSION.RELEASE;
        String str3 = str2 == null ? "" : str2;
        String str4 = Build.MANUFACTURER;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = Build.MODEL;
        if (str5 == null) {
            str5 = "";
        }
        C33451s1 c33451s1 = new C33451s1(captureFormat, list, captureFormat4, str == null ? "" : str, str3, AbstractC39414r.m125869O0(str4 + " " + str5).toString());
        C13045h2 c13045h4 = this.f139709e;
        c13045h4.getClass();
        c13045h4.m36571k(null, c33451s1);
    }
}
