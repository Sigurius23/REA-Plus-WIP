package d33;

import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import c43.AbstractC4191g;
import c43.EnumC4206v;
import e33.C12642l0;
import e33.C12644m0;
import e33.C12662v0;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import i53.AbstractC18138j;
import i53.C18129a;
import i53.C18130b;
import i53.C18133e;
import i53.C18136h;
import io.getstream.video.android.core.model.IceCandidate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l53.C23372m;
import l53.EnumC23360a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import org.webrtc.MediaStream;
import p000.AbstractC11266d;
import p003a1.C0109h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import q83.InterfaceC30057d;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import t23.C33368c0;
import t23.C33392g2;
import t23.C33397h2;
import t23.C33412k2;
import t23.C33422m2;
import t23.C33432o2;
import t23.InterfaceC33442q2;
import v33.AbstractC35638w;
import v33.C35616b;
import v33.C35619d;
import v33.C35620e;
import v33.C35623h;
import v33.C35624i;

/* JADX INFO: renamed from: d33.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C11612l implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37488w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37489x;

    public /* synthetic */ C11612l(C11602h1 c11602h1, int i13) {
        this.f37488w = i13;
        this.f37489x = c11602h1;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37488w) {
            case 0:
                C12642l0 c12642l0 = (C12642l0) obj;
                String str = c12642l0.f43177a;
                TrackType trackType = c12642l0.f43178b;
                AbstractC4191g abstractC4191g = c12642l0.f43179c;
                C11602h1 c11602h1 = this.f37489x;
                C2345k c2345kM31043s = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str2 = c2345kM31043s.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    c2345kM31043s.f9274b.log(enumC2341g, str2, "[streams] #sfu; #track; sessionId: " + str + ", trackType: " + trackType + ", mediaStream: " + abstractC4191g, null);
                }
                c11602h1.m31029G(str, trackType, abstractC4191g);
                return C23454a0.f92919a;
            case 1:
                C12644m0 c12644m0 = (C12644m0) obj;
                String str3 = c12644m0.f43183a;
                TrackType trackType2 = c12644m0.f43184b;
                C11602h1 c11602h2 = this.f37489x;
                C2345k c2345kM31043s2 = c11602h2.m31043s();
                InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
                EnumC2341g enumC2341g2 = EnumC2341g.INFO;
                String str4 = c2345kM31043s2.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str4)) {
                    c2345kM31043s2.f9274b.log(enumC2341g2, str4, "[removedStreams] #sfu; #track; #orphaned-track; Cleaning up orphaned tracks for sessionId=" + str3 + ", trackType=" + trackType2, null);
                }
                String strM73373f = AbstractC25012a.m73373f(trackType2.getValue(), str3, ":");
                ConcurrentHashMap concurrentHashMap = c11602h2.f37461w;
                if (((C11626s) concurrentHashMap.remove(strM73373f)) != null) {
                    C2345k c2345kM31043s3 = c11602h2.m31043s();
                    InterfaceC2339e interfaceC2339e3 = c2345kM31043s3.f9275c;
                    String str5 = c2345kM31043s3.f9273a;
                    if (interfaceC2339e3.isLoggable(enumC2341g2, str5)) {
                        c2345kM31043s3.f9274b.log(enumC2341g2, str5, "[cleanupOrphanedTracksForSessionAndType] #orphaned-track; Removed orphaned track for sessionId=" + str3 + ", trackType=" + trackType2 + " due to stream removal, remaining orphaned=" + concurrentHashMap.size(), null);
                    }
                }
                return C23454a0.f92919a;
            case 2:
                List list = (List) obj;
                C12662v0 c12662v0 = (C12662v0) this.f37489x.f37464z.getValue();
                if (c12662v0 != null) {
                    List<C33392g2> list2 = list;
                    int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                    for (C33392g2 c33392g2 : list2) {
                        linkedHashMap.put(c33392g2.f139427f, c33392g2.f139422a);
                    }
                    synchronized (c12662v0.f43301N) {
                        try {
                            try {
                                C2345k c2345kM35417f = c12662v0.m35417f();
                                InterfaceC2339e interfaceC2339e4 = c2345kM35417f.f9275c;
                                EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                                if (interfaceC2339e4.isLoggable(enumC2341g3, c2345kM35417f.f9273a)) {
                                    c2345kM35417f.f9274b.log(enumC2341g3, c2345kM35417f.f9273a, "[setTrackLookupPrefixes] #sfu; #track; lookupPrefixes: " + linkedHashMap, null);
                                }
                                c12662v0.f43299L.clear();
                                c12662v0.f43299L.putAll(linkedHashMap);
                                if (!c12662v0.f43301N.isEmpty()) {
                                    Iterator it = c12662v0.f43301N.iterator();
                                    while (it.hasNext()) {
                                        c12662v0.m35425o((MediaStream) it.next());
                                    }
                                    c12662v0.f43301N.clear();
                                }
                            } catch (Exception e5) {
                                C2343i c2343i = C2343i.f9269a;
                                InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
                                EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
                                if (interfaceC2339e5.isLoggable(enumC2341g4, "SafeCall")) {
                                    C2343i.f9271c.log(enumC2341g4, "SafeCall", "Exception occurred: " + e5.getMessage(), e5);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return C23454a0.f92919a;
            case 3:
                AbstractC18138j abstractC18138j = (AbstractC18138j) obj;
                C11602h1 c11602h3 = this.f37489x;
                C2345k c2345kM31043s4 = c11602h3.m31043s();
                List list3 = c11602h3.f37438R;
                String str6 = c11602h3.f37445g;
                C33368c0 c33368c0 = c11602h3.f37440b;
                InterfaceC2339e interfaceC2339e6 = c2345kM31043s4.f9275c;
                EnumC2341g enumC2341g5 = EnumC2341g.DEBUG;
                String str7 = c2345kM31043s4.f9273a;
                boolean zIsLoggable = interfaceC2339e6.isLoggable(enumC2341g5, str7);
                InterfaceC30057d interfaceC30057d2 = null;
                if (zIsLoggable) {
                    InterfaceC2344j interfaceC2344j = c2345kM31043s4.f9274b;
                    Object value = c33368c0.f139302p.f139652h.getValue();
                    StringBuilder sb4 = new StringBuilder("[stateJob] SFU socket: ");
                    sb4.append(abstractC18138j);
                    sb4.append(" | connection: ");
                    sb4.append(value);
                    sb4.append(" (");
                    interfaceC2344j.log(enumC2341g5, str7, AbstractC25012a.m73376i(str6, ")", sb4), null);
                }
                c11602h3.f37424D.m36570j(abstractC18138j);
                if (abstractC18138j instanceof C18129a) {
                    C13045h2 c13045h2 = c33368c0.f139302p.f139650g;
                    C33397h2 c33397h2 = C33397h2.f139460a;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, c33397h2);
                    c33368c0.f139271F.clear();
                    C2996c2 c2996c2 = c11602h3.f37427G;
                    if (c2996c2 == null || !c2996c2.isActive()) {
                        c11602h3.f37427G = AbstractC3006f0.m8732z(c11602h3.f37448j, null, null, new C11590d1(c11602h3, null), 3);
                    }
                    List<C23465k> listM74093D1 = AbstractC25265s.m74093D1(list3);
                    list3.clear();
                    for (C23465k c23465k : listM74093D1) {
                        C11602h1.m31020f(c11602h3, (IceCandidate) c23465k.f92937w, (EnumC4206v) c23465k.f92938x);
                    }
                    c33368c0.f139276K.f151340c.m7480G(null, 0, null, true);
                } else if (abstractC18138j instanceof C18130b) {
                    InterfaceC33442q2 interfaceC33442q2 = (InterfaceC33442q2) c33368c0.f139302p.f139652h.getValue();
                    if (!(interfaceC33442q2 instanceof C33432o2) && !(interfaceC33442q2 instanceof C33422m2)) {
                        C13045h2 c13045h3 = c33368c0.f139302p.f139650g;
                        C33412k2 c33412k2 = C33412k2.f139497a;
                        c13045h3.getClass();
                        c13045h3.m36571k(null, c33412k2);
                    }
                } else if (abstractC18138j instanceof C18133e) {
                    C18133e c18133e = (C18133e) abstractC18138j;
                    WebsocketReconnectStrategy websocketReconnectStrategy = c18133e.f70430b;
                    String str8 = "SFU:" + c18133e.f70429a.f103912a + ":" + websocketReconnectStrategy;
                    C2345k c2345kM31043s5 = c11602h3.m31043s();
                    InterfaceC2339e interfaceC2339e7 = c2345kM31043s5.f9275c;
                    String str9 = c2345kM31043s5.f9273a;
                    EnumC2341g enumC2341g6 = EnumC2341g.WARN;
                    if (interfaceC2339e7.isLoggable(enumC2341g6, str9)) {
                        c2345kM31043s5.f9274b.log(enumC2341g6, str9, "[stateJob] SFU sent " + websocketReconnectStrategy + " for " + str6, null);
                    }
                    AbstractC3006f0.m8732z(c33368c0.f139300n, null, null, new C0109h(c11602h3, websocketReconnectStrategy, str8, null, 13), 3);
                } else if (abstractC18138j instanceof C18136h) {
                    C2345k c2345kM31043s6 = c11602h3.m31043s();
                    InterfaceC2339e interfaceC2339e8 = c2345kM31043s6.f9275c;
                    String str10 = c2345kM31043s6.f9273a;
                    EnumC2341g enumC2341g7 = EnumC2341g.WARN;
                    if (interfaceC2339e8.isLoggable(enumC2341g7, str10)) {
                        c2345kM31043s6.f9274b.log(enumC2341g7, str10, AbstractC11895b.m31996o("[stateJob] HealthMonitor detected event loss for ", str6, " — triggering reconnect"), null);
                    }
                    AbstractC3006f0.m8732z(c33368c0.f139300n, null, null, new C11614m(c11602h3, interfaceC30057d2, 11), 3);
                }
                return C23454a0.f92919a;
            default:
                AbstractC35638w abstractC35638w = (AbstractC35638w) obj;
                C11602h1 c11602h4 = this.f37489x;
                try {
                    if (abstractC35638w instanceof C35620e) {
                        C23372m c23372m = c11602h4.f37452n;
                        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
                        c23372m.m67653b(c11602h4.f37460v.m30737G(((C35620e) abstractC35638w).f151408a), "changePublishQuality");
                    } else if (abstractC35638w instanceof C35619d) {
                        C23372m c23372m2 = c11602h4.f37452n;
                        EnumC23360a[] enumC23360aArr2 = EnumC23360a.f92601x;
                        c23372m2.m67653b(c11602h4.f37460v.m30737G(((C35619d) abstractC35638w).f151407a.getPublish_options()), "changePublishOptions");
                    } else if (abstractC35638w instanceof C35624i) {
                        C23372m c23372m3 = c11602h4.f37452n;
                        EnumC23360a[] enumC23360aArr3 = EnumC23360a.f92601x;
                        c23372m3.m67653b(c11602h4.f37460v.m30737G(abstractC35638w), "goAway");
                    } else if (abstractC35638w instanceof C35616b) {
                        C23372m c23372m4 = c11602h4.f37452n;
                        EnumC23360a[] enumC23360aArr4 = EnumC23360a.f92601x;
                        c23372m4.m67653b(c11602h4.f37460v.m30737G(abstractC35638w), "callEnded");
                    } else if (abstractC35638w instanceof C35623h) {
                        C23372m c23372m5 = c11602h4.f37452n;
                        EnumC23360a[] enumC23360aArr5 = EnumC23360a.f92601x;
                        c23372m5.m67653b(c11602h4.f37460v.m30737G(abstractC35638w), "error");
                    }
                    break;
                } catch (Exception e13) {
                    C2343i c2343i2 = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e9 = C2343i.f9272d;
                    EnumC2341g enumC2341g8 = EnumC2341g.ERROR;
                    if (interfaceC2339e9.isLoggable(enumC2341g8, "SafeCall")) {
                        C2343i.f9271c.log(enumC2341g8, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e13.getMessage()), e13);
                    }
                }
                C11602h1 c11602h5 = this.f37489x;
                c11602h5.f37446h.m105797o(abstractC35638w, c11602h5.f37440b.f139308v);
                return C23454a0.f92919a;
        }
    }
}
