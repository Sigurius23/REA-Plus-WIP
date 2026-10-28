package h53;

import a30.C0332w0;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b30.C2570m;
import b33.C2689j;
import b33.EnumC2683d;
import b33.EnumC2686g;
import bc3.AbstractC3006f0;
import bc3.InterfaceC3027k1;
import c53.C4255a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import i53.AbstractC18137i;
import i53.AbstractC18138j;
import i53.C18129a;
import i53.C18130b;
import i53.C18131c;
import i53.C18132d;
import i53.C18133e;
import i53.C18134f;
import i53.C18135g;
import i53.C18136h;
import i53.C18142n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import n23.C26200c;
import p002a0.C0006a1;
import p408q.C29662f;
import p479s4.AbstractC32120a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qg3.C30352d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s93.AbstractC32309k;
import so.C32800q;
import stream.video.sfu.event.JoinRequest;
import stream.video.sfu.event.SfuRequest;
import stream.video.sfu.models.Error;
import u33.EnumC34512e;
import v33.AbstractC35638w;
import v33.C35617b0;
import v33.C35623h;
import v33.C35639x;
import w23.C36750h;
import x23.C37869e;
import x23.EnumC37870f;
import x43.AbstractC37979k;
import x43.AbstractC37984p;
import x43.C37971c;
import x43.C37976h;
import x43.C37981m;
import x43.C37982n;
import z23.C40031a;
import z23.C40033c;
import z33.C40053b;

/* JADX INFO: renamed from: h53.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16939d extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64994w;

    /* JADX INFO: renamed from: x */
    public int f64995x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f64996y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16940e f64997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16939d(C16940e c16940e, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f64994w = i13;
        this.f64997z = c16940e;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64994w) {
            case 0:
                C16939d c16939d = new C16939d(this.f64997z, interfaceC30057d, 0);
                c16939d.f64996y = obj;
                return c16939d;
            default:
                C16939d c16939d2 = new C16939d(this.f64997z, interfaceC30057d, 1);
                c16939d2.f64996y = obj;
                return c16939d2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f64994w) {
            case 0:
                return ((C16939d) create((AbstractC18138j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C16939d) create((AbstractC37984p) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM124995a;
        switch (this.f64994w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f64995x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                C16940e c16940e = this.f64997z;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC18138j abstractC18138j = (AbstractC18138j) this.f64996y;
                    C2345k c2345kM47699d = c16940e.m47699d();
                    C4255a c4255a = (C4255a) c16940e.f65002e;
                    C37976h c37976h = (C37976h) c16940e.f65013p;
                    InterfaceC2339e interfaceC2339e = c2345kM47699d.f9275c;
                    String str = c2345kM47699d.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.INFO;
                    InterfaceC30057d interfaceC30057d = null;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345kM47699d.f9274b.log(enumC2341g, str, "[onSocketStateChanged] state: " + abstractC18138j, null);
                    }
                    if (abstractC18138j instanceof C18129a) {
                        c37976h.m121613a();
                        c16940e.m47698c(new C0006a1(abstractC18138j, 24));
                    } else if (abstractC18138j instanceof C18130b) {
                        C37971c c37971c = ((C18130b) abstractC18138j).f70425a;
                        JoinRequest joinRequest = c37971c.f162614e;
                        this.f64995x = 1;
                        C2345k c2345kM47699d2 = c16940e.m47699d();
                        InterfaceC2339e interfaceC2339e2 = c2345kM47699d2.f9275c;
                        String str2 = c2345kM47699d2.f9273a;
                        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                            c2345kM47699d2.f9274b.log(enumC2341g2, str2, "[connectUser] connectionConf: " + c37971c, null);
                        }
                        AbstractC3006f0.m8732z(c4255a, null, null, new C16936a(c16940e, interfaceC30057d, 4), 3);
                        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c16940e.f65012o;
                        if (interfaceC3027k1 != null) {
                            interfaceC3027k1.cancel((CancellationException) null);
                        }
                        C29662f c29662f = (C29662f) c16940e.f65006i;
                        if (c29662f != null) {
                            c29662f.m91123l0(1000, "connectUser:cleanup", "Connection close by client");
                        }
                        boolean zM128401c = ((C40053b) c16940e.f65004g).m128401c();
                        if (zM128401c) {
                            C2570m c2570m = (C2570m) c16940e.f65005h;
                            boolean z4 = joinRequest.getReconnect_details() != null;
                            C32800q c32800q = (C32800q) c2570m.f9984E;
                            C0332w0 c0332w0 = (C0332w0) c2570m.f9985F;
                            int iOrdinal = ((EnumC37870f) ((C13081r1) c0332w0.f1164E).f45200w.getValue()).ordinal();
                            if (iOrdinal == 0 || iOrdinal == 2) {
                                C40033c c40033c = (C40033c) c2570m.f9989z;
                                String str3 = (String) c2570m.f9987x;
                                String callType = (String) c2570m.f9988y;
                                String sfuId = (String) ((C13081r1) c0332w0.f1169y).f45200w.getValue();
                                C13081r1 c13081r1 = (C13081r1) c32800q.f136505x;
                                InterfaceC13037f2 interfaceC13037f2 = c13081r1.f45200w;
                                InterfaceC13037f2 interfaceC13037f3 = c13081r1.f45200w;
                                String str4 = ((C36750h) interfaceC13037f2.getValue()).f157282b;
                                if (str4 == null) {
                                    str4 = "unknown";
                                }
                                String str5 = str4;
                                AbstractC32309k abstractC32309k = ((C36750h) interfaceC13037f3.getValue()).f157281a;
                                if (abstractC32309k == null) {
                                    abstractC32309k = C37869e.f162182w;
                                }
                                AbstractC32309k abstractC32309k2 = abstractC32309k;
                                String str6 = ((C36750h) interfaceC13037f3.getValue()).f157285e;
                                c40033c.getClass();
                                AbstractC22676k.m65750j(sfuId, "sfuId");
                                AbstractC22676k.m65750j(callType, "callType");
                                String string = UUID.randomUUID().toString();
                                AbstractC22676k.m65749i(string, "toString(...)");
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                ConcurrentHashMap concurrentHashMap = c40033c.f172742d;
                                EnumC2683d enumC2683d = EnumC2683d.WS_JOIN;
                                concurrentHashMap.put(string, new C2689j(str3, callType, string, enumC2683d, jCurrentTimeMillis, str5, abstractC32309k2, sfuId, str6, null, z4, 1536));
                                c40033c.f172739a.m927P(C40031a.m128361a(c40033c.f172741c, str3, callType, enumC2683d, EnumC2686g.INITIATED, string, abstractC32309k2, str5, null, null, null, null, null, str6, sfuId, null, Boolean.valueOf(z4), null, null, null, 8343424));
                                EnumC37870f enumC37870f = EnumC37870f.f162184x;
                                C13045h2 c13045h2 = (C13045h2) c0332w0.f1170z;
                                c13045h2.getClass();
                                c13045h2.m36571k(null, enumC37870f);
                                C13045h2 c13045h3 = (C13045h2) c0332w0.f1165F;
                                c13045h3.getClass();
                                c13045h3.m36571k(null, string);
                            }
                            C29662f c29662fM91125n0 = ((C29662f) c16940e.f65001d).m91125n0(c37971c, "#sfu");
                            Iterator it = ((LinkedHashSet) c16940e.f65009l).iterator();
                            while (it.hasNext()) {
                                ((AbstractC37979k) it.next()).mo40220e();
                            }
                            C2345k c2345kM47699d3 = c16940e.m47699d();
                            InterfaceC2339e interfaceC2339e3 = c2345kM47699d3.f9275c;
                            String str7 = c2345kM47699d3.f9273a;
                            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                            if (interfaceC2339e3.isLoggable(enumC2341g3, str7)) {
                                c2345kM47699d3.f9274b.log(enumC2341g3, str7, "[connectUser] send join request = " + joinRequest, null);
                            }
                            c29662fM91125n0.m91079C0(new C35639x(new SfuRequest(c37971c.f162614e, null, null, null, 14, null)));
                            c16940e.f65012o = AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36597g((C13096w1) c29662fM91125n0.f121232z), new C16939d(c16940e, interfaceC30057d, 1), 0), c4255a);
                            c16940e.f65006i = c29662fM91125n0;
                        } else {
                            if (!zM128401c) {
                                C30352d c30352d = (C30352d) c16940e.f65010m;
                                C2345k c2345kM92818r = c30352d.m92818r();
                                InterfaceC2339e interfaceC2339e4 = c2345kM92818r.f9275c;
                                String str8 = c2345kM92818r.f9273a;
                                EnumC2341g enumC2341g4 = EnumC2341g.WARN;
                                if (interfaceC2339e4.isLoggable(enumC2341g4, str8)) {
                                    c2345kM92818r.f9274b.log(enumC2341g4, str8, "[onNetworkNotAvailable] no args", null);
                                }
                                objM124995a = c30352d.m92819s().m124995a(C18142n.f70439a, this);
                                if (objM124995a != enumC31071a) {
                                    objM124995a = c23454a0;
                                }
                                if (objM124995a != enumC31071a) {
                                }
                            }
                            if (objM124995a == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                        objM124995a = c23454a0;
                        if (objM124995a == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (abstractC18138j instanceof AbstractC18137i) {
                        AbstractC18137i abstractC18137i = (AbstractC18137i) abstractC18138j;
                        if (abstractC18137i instanceof C18131c) {
                            C29662f c29662f2 = (C29662f) c16940e.f65006i;
                            if (c29662f2 != null) {
                                c29662f2.m91123l0(ErrorCodes.WebrtcErrors.cCreateAnswerFailed, "SfuSocketState.Disconnected.DisconnectedByRequest", "Connection closed to reconnect");
                            }
                            c37976h.m121616d();
                            AbstractC3006f0.m8732z(c4255a, null, null, new C16936a(c16940e, interfaceC30057d, 1), 3);
                        } else if (abstractC18137i instanceof C18134f) {
                            C29662f c29662f3 = (C29662f) c16940e.f65006i;
                            if (c29662f3 != null) {
                                c29662f3.m91123l0(ErrorCodes.WebrtcErrors.cCreateAnswerFailed, "SfuSocketState.Disconnected.NetworkDisconnected", "Connection closed to reconnect");
                            }
                            c37976h.m121616d();
                        } else if (abstractC18137i instanceof C18135g) {
                            C29662f c29662f4 = (C29662f) c16940e.f65006i;
                            if (c29662f4 != null) {
                                c29662f4.m91123l0(1000, "SfuSocketState.Disconnected.Stopped", "Connection close by client");
                            }
                            c37976h.m121616d();
                        } else if (abstractC18137i instanceof C18132d) {
                            C29662f c29662f5 = (C29662f) c16940e.f65006i;
                            if (c29662f5 != null) {
                                c29662f5.m91123l0(1000, "SfuSocketState.Disconnected.DisconnectedPermanently", "Connection close by client");
                            }
                            c37976h.m121616d();
                            AbstractC3006f0.m8732z(c4255a, null, null, new C16936a(c16940e, interfaceC30057d, 2), 3);
                        } else if (abstractC18137i instanceof C18133e) {
                            c37976h.m121616d();
                        } else if (abstractC18137i instanceof C18136h) {
                            C29662f c29662f6 = (C29662f) c16940e.f65006i;
                            if (c29662f6 != null) {
                                c29662f6.m91123l0(ErrorCodes.WebrtcErrors.cCreateAnswerFailed, "SfuSocketState.Disconnected.WebSocketEventLost", "Connection closed to reconnect");
                            }
                            c37976h.m121616d();
                        }
                    }
                    return c23454a0;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c16940e.m47698c(C16938c.f64993w);
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f64995x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC37984p abstractC37984p = (AbstractC37984p) this.f64996y;
                    boolean z13 = abstractC37984p instanceof C37981m;
                    C16940e c16940e2 = this.f64997z;
                    if (z13) {
                        this.f64995x = 1;
                        if (C16940e.m47696a(c16940e2, (C37981m) abstractC37984p, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else if (abstractC37984p instanceof C37982n) {
                        AbstractC35638w abstractC35638w = ((C37982n) abstractC37984p).f162641a;
                        if (abstractC35638w instanceof C35623h) {
                            C35623h c35623h = (C35623h) abstractC35638w;
                            c16940e2.getClass();
                            Error error = c35623h.f151412a;
                            C37981m c37981m = new C37981m(error != null ? new C26200c(error.getMessage(), error.getCode().getValue(), error.getCode().getValue(), 8) : AbstractC32120a.m99978d(EnumC34512e.NO_ERROR_BODY, null, 2), c35623h.f151413b);
                            this.f64995x = 2;
                            if (C16940e.m47696a(c16940e2, c37981m, this) == enumC31071a2) {
                                return enumC31071a2;
                            }
                        } else {
                            this.f64995x = 3;
                            if (C16940e.m47697b(c16940e2, abstractC35638w, this) == enumC31071a2) {
                                return enumC31071a2;
                            }
                        }
                    } else {
                        C35617b0 c35617b0 = new C35617b0(abstractC37984p);
                        this.f64995x = 4;
                        if (C16940e.m47697b(c16940e2, c35617b0, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
