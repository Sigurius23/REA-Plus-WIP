package a43;

import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import g53.AbstractC15508m;
import g53.C15498c;
import g53.C15499d;
import g53.C15500e;
import g53.C15501f;
import g53.C15502g;
import g53.C15503h;
import g53.C15504i;
import g53.C15515t;
import g53.C15516u;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C12473e;
import p003a1.C0109h;
import r83.EnumC31071a;
import t23.C33366b4;
import t23.C33391g1;
import t23.InterfaceC33408j3;
import x43.C37969a;

/* JADX INFO: renamed from: a43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0379a implements InterfaceC0380b {

    /* JADX INFO: renamed from: a */
    public final List f1316a;

    /* JADX INFO: renamed from: b */
    public final C20378c f1317b;

    public C0379a(List list, C20378c c20378c) {
        this.f1316a = list;
        this.f1317b = c20378c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002a. Please report as an issue. */
    @Override // a43.InterfaceC0380b
    /* JADX INFO: renamed from: a */
    public final Object mo1049a(C0109h c0109h) {
        boolean z4;
        boolean z13;
        C23454a0 c23454a0 = C23454a0.f92919a;
        List<C37969a> list = this.f1316a;
        boolean z14 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C37969a c37969a : list) {
                switch (c37969a.f162606a) {
                    case 0:
                        InterfaceC33408j3 interfaceC33408j3 = (InterfaceC33408j3) c37969a.f162607b.getValue();
                        if (interfaceC33408j3 != null) {
                            C33391g1 c33391g1 = ((C33366b4) interfaceC33408j3).f139248U;
                            c33391g1.getClass();
                            try {
                                boolean z15 = c33391g1.f139403f.getValue() != null;
                                boolean z16 = c33391g1.f139402e.getValue() != null;
                                z4 = z15 || z16;
                                C2345k c2345kM105845a = c33391g1.m105845a();
                                InterfaceC2339e interfaceC2339e = c2345kM105845a.f9275c;
                                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                                if (interfaceC2339e.isLoggable(enumC2341g, c2345kM105845a.f9273a)) {
                                    c2345kM105845a.f9274b.log(enumC2341g, c2345kM105845a.f9273a, "[hasActiveOrRingingCall] active: " + z15 + ", ringing: " + z16, null);
                                }
                            } catch (Exception e5) {
                                C2343i c2343i = C2343i.f9269a;
                                InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
                                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                                if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                                    C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                                }
                                z4 = false;
                            }
                            if (z4) {
                                z13 = false;
                                break;
                            }
                        }
                        z13 = true;
                        break;
                    default:
                        AbstractC15508m abstractC15508m = (AbstractC15508m) c37969a.f162607b.getValue();
                        if ((abstractC15508m instanceof C15498c) || (abstractC15508m instanceof C15499d) || (abstractC15508m instanceof C15502g)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        break;
                }
                if (!z13) {
                    z14 = false;
                }
            }
        }
        C2343i c2343i2 = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
        if (interfaceC2339e3.isLoggable(enumC2341g3, "Video:LifecycleHandler")) {
            C2343i.f9271c.log(enumC2341g3, "Video:LifecycleHandler", AbstractC11266d.m30462p("[stopped] shouldDisconnect: ", z14), null);
        }
        if (z14) {
            C20378c c20378c = this.f1317b;
            C2345k c2345kM56591t = c20378c.m56591t();
            InterfaceC2339e interfaceC2339e4 = c2345kM56591t.f9275c;
            EnumC2341g enumC2341g4 = EnumC2341g.INFO;
            if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM56591t.f9273a)) {
                c2345kM56591t.f9274b.log(enumC2341g4, c2345kM56591t.f9273a, "[onStop] no args", null);
            }
            Object objM124995a = c20378c.m56594w().m124995a(C15516u.f58186a, c0109h);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (objM124995a != enumC31071a) {
                objM124995a = c23454a0;
            }
            if (objM124995a == enumC31071a) {
                return objM124995a;
            }
        }
        return c23454a0;
    }

    @Override // a43.InterfaceC0380b
    /* JADX INFO: renamed from: b */
    public final Object mo1050b(C12473e c12473e) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        List<C37969a> list = this.f1316a;
        boolean z4 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C37969a c37969a : list) {
                switch (c37969a.f162606a) {
                    case 0:
                        break;
                    default:
                        AbstractC15508m abstractC15508m = (AbstractC15508m) c37969a.f162607b.getValue();
                        if (!(abstractC15508m instanceof C15501f) && !(abstractC15508m instanceof C15502g) && !(abstractC15508m instanceof C15503h) && !(abstractC15508m instanceof C15500e) && !(abstractC15508m instanceof C15504i)) {
                            z4 = false;
                        }
                        break;
                }
                if (!z4) {
                    z4 = false;
                }
            }
        }
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, "Video:LifecycleHandler")) {
            C2343i.f9271c.log(enumC2341g, "Video:LifecycleHandler", AbstractC11266d.m30462p("[resume] shouldConnect: ", z4), null);
        }
        if (z4) {
            C20378c c20378c = this.f1317b;
            C2345k c2345kM56591t = c20378c.m56591t();
            InterfaceC2339e interfaceC2339e2 = c2345kM56591t.f9275c;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM56591t.f9273a)) {
                c2345kM56591t.f9274b.log(enumC2341g2, c2345kM56591t.f9273a, "[onResume] no args", null);
            }
            Object objM124995a = c20378c.m56594w().m124995a(C15515t.f58185a, c12473e);
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (objM124995a != enumC31071a) {
                objM124995a = c23454a0;
            }
            if (objM124995a == enumC31071a) {
                return objM124995a;
            }
        }
        return c23454a0;
    }
}
