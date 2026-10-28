package b30;

import a30.C0273a;
import a30.C0307l0;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import d00.C11433l;
import d30.C11529f;
import e30.AbstractC12605c;
import ec3.C13045h2;
import f31.C14044a;
import g40.AbstractC15327b3;
import g40.AbstractC15387m;
import g40.C15319a1;
import g40.C15320a2;
import g40.C15333c3;
import g40.C15347f;
import g40.C15366i0;
import g40.C15371j;
import g40.C15377k;
import g40.InterfaceC15450y2;
import h00.C16528v;
import h20.C16621a;
import h20.C16651f;
import h20.C16687l;
import h20.C16689l1;
import h20.C16722q4;
import h20.C16742u0;
import h20.C16754w0;
import h20.C16761x1;
import h20.EnumC16677j1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import my.EnumC26028b;
import n83.C26459b;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p163g1.C15185x;
import p599wz.C37708d;
import p599wz.C37718g0;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.AbstractC40434p6;
import q20.AbstractC29840y;
import q20.C29828m;
import q20.EnumC29806a;
import r20.C30866d;
import r20.C30878p;
import u00.C34377e;
import u10.C34416d;
import u10.C34425m;
import u10.C34427o;
import u10.C34429q;
import u10.C34433u;
import v00.C35459c0;
import v00.C35473j0;
import v00.C35482o;
import v00.C35484p;
import v00.EnumC35491s0;
import wb3.AbstractC37056f;
import y00.C38840g6;

/* JADX INFO: renamed from: b30.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2624t0 implements InterfaceC4353o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10214w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f10215x;

    public /* synthetic */ C2624t0(Object obj, int i13) {
        this.f10214w = i13;
        this.f10215x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x030f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0317  */
    /* JADX WARN: Code duplicated, block: B:119:0x031b  */
    /* JADX WARN: Code duplicated, block: B:120:0x031e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0326  */
    /* JADX WARN: Code duplicated, block: B:124:0x0329  */
    /* JADX WARN: Code duplicated, block: B:127:0x0330  */
    /* JADX WARN: Code duplicated, block: B:128:0x0333  */
    /* JADX WARN: Code duplicated, block: B:130:0x0336  */
    /* JADX WARN: Code duplicated, block: B:132:0x033c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0341  */
    /* JADX WARN: Code duplicated, block: B:137:0x034e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0357  */
    /* JADX WARN: Code duplicated, block: B:141:0x035c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0371 A[LOOP:0: B:144:0x0368->B:146:0x0371, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x037b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x011e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0121  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        boolean zM65709Q;
        C15319a1 c15319a1;
        C15320a2 c15320a2;
        C26460c c26460cM119000x;
        C26460c c26460cM118988k;
        ListIterator listIterator;
        C26459b c26459b;
        C26460c c26460cM119000x2;
        C23454a0 c23454a0;
        boolean z13;
        C0273a c0273a;
        String str;
        C41210b c41210bM77436a;
        C35484p c35484p;
        C35482o c35482o;
        EnumC26028b enumC26028b;
        C35484p c35484p2;
        int i13 = this.f10214w;
        C23454a0 c23454a1 = C23454a0.f92919a;
        C16722q4 c16722q4 = C16722q4.f64264a;
        int i14 = 2;
        Object obj6 = this.f10215x;
        switch (i13) {
            case 0:
                C2659y0 c2659y0 = (C2659y0) obj6;
                InterfaceC41211c interfaceC41211c = (InterfaceC41211c) obj;
                EnumC2505d6 status = (EnumC2505d6) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                C16621a c16621a = (C16621a) obj5;
                AbstractC22676k.m65750j(status, "status");
                return new C2497c6(interfaceC41211c, status, c2659y0.f10398i || zBooleanValue, (zBooleanValue2 || c16621a != null) && status == EnumC2505d6.Idle);
            case 1:
                C15347f c15347f = (C15347f) obj6;
                String str2 = (String) obj;
                List otherFields = (List) obj2;
                boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                AbstractC22676k.m65750j(otherFields, "otherFields");
                AbstractC15387m abstractC15387m = c15347f.f57663c;
                boolean z14 = c15347f.f57665e;
                boolean z15 = c15347f.f57666f;
                C15366i0 c15366i0 = c15347f.f57664d;
                C15333c3 c15333c3 = c15347f.f57670j;
                AddressFieldConfiguration addressFieldConfigurationMo43582s = abstractC15387m.mo43582s();
                AddressFieldConfiguration addressFieldConfiguration = AddressFieldConfiguration.HIDDEN;
                boolean z16 = addressFieldConfigurationMo43582s == addressFieldConfiguration;
                List listM74077r0 = AbstractC25260n.m74077r0(new AbstractC15327b3[]{!z16 ? c15333c3 : null, !z15 ? c15366i0 : null, c15347f.f57671k});
                List list = otherFields;
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25260n.m74077r0(new AbstractC15327b3[]{!z16 ? c15333c3 : null, !z15 ? c15366i0 : null}), list);
                boolean z17 = abstractC15387m instanceof C15371j;
                if (z17) {
                    if (!AbstractC22674j.m65709Q((C15371j) abstractC15387m, str2, z14)) {
                    }
                    z4 = true;
                    if (z17) {
                        zM65709Q = AbstractC22674j.m65709Q((C15371j) abstractC15387m, str2, z14);
                    } else if (abstractC15387m instanceof C15377k) {
                        zM65709Q = z4;
                    } else {
                        zM65709Q = false;
                    }
                    if (abstractC15387m.mo43581k() != addressFieldConfiguration) {
                        c15319a1 = c15347f.f57669i;
                    } else {
                        c15319a1 = null;
                    }
                    if (abstractC15387m.mo43583x() != addressFieldConfiguration) {
                        c15320a2 = c15347f.f57672l;
                    } else {
                        c15320a2 = null;
                    }
                    if (zM65709Q) {
                        c26460cM119000x2 = AbstractC37056f.m119000x();
                        if (c15319a1 != null) {
                            c26460cM119000x2.add(c15319a1);
                        }
                        if (c15320a2 != null) {
                            c26460cM119000x2.add(c15320a2);
                        }
                        c26460cM119000x2.addAll(listM74077r0);
                        c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x2);
                    } else {
                        c26460cM119000x = AbstractC37056f.m119000x();
                        c26460cM119000x.addAll(listM74077r0);
                        if (c15319a1 != null) {
                            c26460cM119000x.add(c15319a1);
                        }
                        if (c15320a2 != null) {
                            c26460cM119000x.add(c15320a2);
                        }
                        c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                    }
                    listIterator = c26460cM118988k.listIterator(0);
                    while (true) {
                        c26459b = (C26459b) listIterator;
                        if (!c26459b.hasNext()) {
                            return c26460cM118988k;
                        }
                        ((InterfaceC15450y2) c26459b.next()).mo43537b(zBooleanValue3);
                    }
                } else {
                    if (!(abstractC15387m instanceof C15377k)) {
                        if (z16) {
                            c15333c3 = null;
                        }
                        if (z15) {
                            c15366i0 = null;
                        }
                        z4 = true;
                        listM74077r0 = AbstractC25265s.m74129g1(AbstractC25260n.m74077r0(new AbstractC15327b3[]{c15333c3, c15366i0}), list);
                    }
                    if (z17) {
                        zM65709Q = AbstractC22674j.m65709Q((C15371j) abstractC15387m, str2, z14);
                    } else if (abstractC15387m instanceof C15377k) {
                        zM65709Q = z4;
                    } else {
                        zM65709Q = false;
                    }
                    if (abstractC15387m.mo43581k() != addressFieldConfiguration) {
                        c15319a1 = c15347f.f57669i;
                    } else {
                        c15319a1 = null;
                    }
                    if (abstractC15387m.mo43583x() != addressFieldConfiguration) {
                        c15320a2 = c15347f.f57672l;
                    } else {
                        c15320a2 = null;
                    }
                    if (zM65709Q) {
                        c26460cM119000x2 = AbstractC37056f.m119000x();
                        if (c15319a1 != null) {
                            c26460cM119000x2.add(c15319a1);
                        }
                        if (c15320a2 != null) {
                            c26460cM119000x2.add(c15320a2);
                        }
                        c26460cM119000x2.addAll(listM74077r0);
                        c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x2);
                    } else {
                        c26460cM119000x = AbstractC37056f.m119000x();
                        c26460cM119000x.addAll(listM74077r0);
                        if (c15319a1 != null) {
                            c26460cM119000x.add(c15319a1);
                        }
                        if (c15320a2 != null) {
                            c26460cM119000x.add(c15320a2);
                        }
                        c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                    }
                    listIterator = c26460cM118988k.listIterator(0);
                    while (true) {
                        c26459b = (C26459b) listIterator;
                        if (!c26459b.hasNext()) {
                            return c26460cM118988k;
                        }
                        ((InterfaceC15450y2) c26459b.next()).mo43537b(zBooleanValue3);
                    }
                }
                listM74077r0 = arrayListM74129g1;
                z4 = true;
                if (z17) {
                    zM65709Q = AbstractC22674j.m65709Q((C15371j) abstractC15387m, str2, z14);
                } else if (abstractC15387m instanceof C15377k) {
                    zM65709Q = z4;
                } else {
                    zM65709Q = false;
                }
                if (abstractC15387m.mo43581k() != addressFieldConfiguration) {
                    c15319a1 = c15347f.f57669i;
                } else {
                    c15319a1 = null;
                }
                if (abstractC15387m.mo43583x() != addressFieldConfiguration) {
                    c15320a2 = c15347f.f57672l;
                } else {
                    c15320a2 = null;
                }
                if (zM65709Q) {
                    c26460cM119000x2 = AbstractC37056f.m119000x();
                    if (c15319a1 != null) {
                        c26460cM119000x2.add(c15319a1);
                    }
                    if (c15320a2 != null) {
                        c26460cM119000x2.add(c15320a2);
                    }
                    c26460cM119000x2.addAll(listM74077r0);
                    c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x2);
                } else {
                    c26460cM119000x = AbstractC37056f.m119000x();
                    c26460cM119000x.addAll(listM74077r0);
                    if (c15319a1 != null) {
                        c26460cM119000x.add(c15319a1);
                    }
                    if (c15320a2 != null) {
                        c26460cM119000x.add(c15320a2);
                    }
                    c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                }
                listIterator = c26460cM118988k.listIterator(0);
                while (true) {
                    c26459b = (C26459b) listIterator;
                    if (!c26459b.hasNext()) {
                        return c26460cM118988k;
                    }
                    ((InterfaceC15450y2) c26459b.next()).mo43537b(zBooleanValue3);
                }
                break;
            case 2:
                C16754w0 c16754w0 = (C16754w0) obj6;
                C23470p c23470p = c16754w0.f64353l0;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj4;
                C37708d linkAccountInfo = (C37708d) obj5;
                AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
                C35459c0 c35459c0 = c16754w0.f64344c0.f64030w.f1019E;
                C0307l0 c0307l0 = c35459c0.f150995l0;
                C37718g0 c37718g0 = c0307l0 != null ? c0307l0.f1058w : null;
                boolean z18 = (abstractC29840y instanceof C29828m) && ((C29828m) abstractC29840y).f121916y != null;
                boolean z19 = AbstractC22676k.m65745e(bool, Boolean.TRUE) && ((List) c23470p.getValue()).contains(EnumC35491s0.Link);
                boolean z24 = c35459c0.f150974Q && ((List) c23470p.getValue()).contains(EnumC35491s0.GooglePay);
                List listM112535S = c35459c0.m112535S();
                EnumC29806a enumC29806a = EnumC29806a.f121854F;
                boolean z25 = c35459c0.f150996w instanceof C38840g6;
                List listM118958J = (c35459c0.m112535S().size() == 1 && ((List) ((InterfaceC4339a) c16754w0.f43022Z.f64022c.f104635y).invoke()).isEmpty()) ? EnumC35491s0.f151074G : AbstractC37056f.m118958J(EnumC35491s0.Link);
                C11433l c11433l = linkAccountInfo.f161571w;
                return C34377e.m108674p(Boolean.valueOf(z19), str3, z24, enumC29806a, zBooleanValue4, listM112535S, null, new C16742u0(c16754w0, 1), new C16742u0(c16754w0, i14), z25, listM118958J, c11433l != null ? c11433l.f36661y : null, (c37718g0 == null || !c37718g0.f161626Z || z18) ? false : true, c35459c0.f150982Y, c35459c0.f150981X, DfuBaseService.ERROR_REMOTE_MASK);
            case 3:
                AbstractC12605c abstractC12605c = (AbstractC12605c) obj6;
                C13045h2 c13045h2 = abstractC12605c.f43008L;
                C16687l displayableSavedPaymentMethod = (C16687l) obj;
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                Function1 performRemove = (Function1) obj3;
                InterfaceC4351m updatePaymentMethodExecutor = (InterfaceC4351m) obj4;
                InterfaceC4351m setDefaultPaymentMethodExecutor = (InterfaceC4351m) obj5;
                AbstractC22676k.m65750j(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
                AbstractC22676k.m65750j(performRemove, "performRemove");
                AbstractC22676k.m65750j(updatePaymentMethodExecutor, "updatePaymentMethodExecutor");
                AbstractC22676k.m65750j(setDefaultPaymentMethodExecutor, "setDefaultPaymentMethodExecutor");
                if (displayableSavedPaymentMethod.f64179c.equals(c16722q4)) {
                    return c23454a1;
                }
                C16761x1 c16761x1 = abstractC12605c.f43025w;
                C16651f c16651f = abstractC12605c.f43022Z;
                Object value = c13045h2.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean zMo124338q0 = ((C35459c0) value).f150996w.mo124338q0();
                C35459c0 c35459c1 = (C35459c0) c13045h2.getValue();
                C30866d c30866d = abstractC12605c.f43009M;
                boolean zBooleanValue6 = ((Boolean) ((InterfaceC4339a) c16651f.f64026g.f104635y).invoke()).booleanValue();
                C35473j0 c35473j0 = new C35473j0(c16761x1.f64413P);
                C16689l1 c16689l1 = c16761x1.f64407J;
                EnumC16677j1 enumC16677j1 = c16689l1.f64192z;
                Set setM47249b = c16689l1.m47249b();
                if (c35459c1 != null && (c35484p2 = c35459c1.f150973P) != null) {
                    c23454a0 = c23454a1;
                    if (c35484p2.f151062z) {
                        z13 = true;
                    }
                    c0273a = (C0273a) c16651f.f64021b.f45200w.getValue();
                    if (c0273a != null) {
                        str = c0273a.f936x;
                    } else {
                        str = null;
                    }
                    boolean zM65745e = AbstractC22676k.m65745e(displayableSavedPaymentMethod.f64178b.f167527w, str);
                    if (c35459c1 != null || (c35484p = c35459c1.f150973P) == null || (c35482o = c35484p.f151058E) == null || (enumC26028b = c35482o.f151054w) == null) {
                        c41210bM77436a = null;
                    } else {
                        c41210bM77436a = enumC26028b.m77436a(c35459c1.f150966I);
                    }
                    c30866d.m94922e(new C30878p(new C2659y0(zMo124338q0, zBooleanValue5, displayableSavedPaymentMethod, c35473j0, enumC16677j1, setM47249b, zBooleanValue6, c41210bM77436a, zM65745e, z13, new C16528v(1, performRemove, null), new C15185x(updatePaymentMethodExecutor, null), setDefaultPaymentMethodExecutor, new C11529f(abstractC12605c, 7), new C2539i0(0, abstractC12605c.f43009M, C30866d.class, "pop", "pop()V", 0, 13))));
                    return c23454a0;
                }
                c23454a0 = c23454a1;
                z13 = false;
                c0273a = (C0273a) c16651f.f64021b.f45200w.getValue();
                if (c0273a != null) {
                    str = c0273a.f936x;
                } else {
                    str = null;
                }
                boolean zM65745e2 = AbstractC22676k.m65745e(displayableSavedPaymentMethod.f64178b.f167527w, str);
                if (c35459c1 != null) {
                    c41210bM77436a = null;
                } else {
                    c41210bM77436a = null;
                }
                c30866d.m94922e(new C30878p(new C2659y0(zMo124338q0, zBooleanValue5, displayableSavedPaymentMethod, c35473j0, enumC16677j1, setM47249b, zBooleanValue6, c41210bM77436a, zM65745e2, z13, new C16528v(1, performRemove, null), new C15185x(updatePaymentMethodExecutor, null), setDefaultPaymentMethodExecutor, new C11529f(abstractC12605c, 7), new C2539i0(0, abstractC12605c.f43009M, C30866d.class, "pop", "pop()V", 0, 13))));
                return c23454a0;
            case 4:
                C34433u c34433u = (C34433u) obj6;
                C16687l displayableSavedPaymentMethod2 = (C16687l) obj;
                ((Boolean) obj2).getClass();
                AbstractC22676k.m65750j(displayableSavedPaymentMethod2, "displayableSavedPaymentMethod");
                AbstractC22676k.m65750j((Function1) obj3, "<unused var>");
                AbstractC22676k.m65750j((InterfaceC4351m) obj4, "<unused var>");
                AbstractC22676k.m65750j((InterfaceC4351m) obj5, "<unused var>");
                if (!displayableSavedPaymentMethod2.f64179c.equals(c16722q4)) {
                    ((C34429q) c34433u.f144679e.get()).m108796a(new C34425m(new C34427o(((C34416d) c34433u.f144684j.get()).m108791a(displayableSavedPaymentMethod2))));
                }
                return c23454a1;
            default:
                return AbstractC40434p6.m130620q((List) obj6, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    }
}
