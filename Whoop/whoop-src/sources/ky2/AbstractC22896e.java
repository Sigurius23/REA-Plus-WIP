package ky2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import gz0.AbstractC16319p0;
import h02.C16576i;
import hy2.AbstractC17810a;
import io.sentry.config.AbstractC20301a;
import j11.C21214q;
import kz2.AbstractC22926c;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import wb3.AbstractC37056f;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: ky2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lky2/g;", "viewState", "Lkotlin/Function1;", "Lhy2/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/whooplabs/feature/navigation/c;", "onNavEvent", "i", "(Lky2/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22896e {
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final void m66564i(InterfaceC22898g viewState, final Function1 onViewEvent, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        int i15;
        boolean z4;
        boolean z13;
        InterfaceC22898g.a aVar;
        int i16;
        boolean z14;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(94739256);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zEquals = viewState.equals(InterfaceC22898g.d.f90429a);
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zEquals) {
                c28655q.m87150e0(583915730);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
                i15 = i14;
                c28676v0 = c28676v1;
            } else {
                if (viewState instanceof InterfaceC22898g.b) {
                    c28655q.m87150e0(584153376);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC39833e.f171727l, null, i17, 0 == true ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC39833e.f171729n, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC39833e.f171715B, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC39833e.f171716a, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
                    boolean z15 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | ((i14 & 112) == 32);
                    Object objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        c28676v0 = c28676v1;
                    } else {
                        c28676v0 = c28676v1;
                        if (objM87133R2 == c28676v0) {
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        if ((i14 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == c28676v0) {
                            objM87133R = new C22892a(onNavEvent, 6);
                            c28655q.m87172p0(objM87133R);
                        }
                        int i18 = 196608 | AbstractC33208p0.b.f138467h;
                        int i19 = TextResource.C8688b.f25889c;
                        AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a, true, false, c8688b3, (InterfaceC4339a) objM87133R, null, true, false, c28655q, i18 | (i19 << 3) | (i19 << 9) | (i19 << 21), 6, 2628);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    objM87133R2 = new C21214q(27, onViewEvent, viewState);
                    c28655q.m87172p0(objM87133R2);
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    if ((i14 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C22892a(onNavEvent, 6);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C22892a(onNavEvent, 6);
                        c28655q.m87172p0(objM87133R);
                    }
                    int i110 = 196608 | AbstractC33208p0.b.f138467h;
                    int i111 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, interfaceC4339a2, true, false, c8688b3, (InterfaceC4339a) objM87133R, null, true, false, c28655q, i110 | (i111 << 3) | (i111 << 9) | (i111 << 21), 6, 2628);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28676v0 = c28676v1;
                    if (viewState instanceof InterfaceC22898g.a) {
                        c28655q.m87150e0(584994406);
                        InterfaceC22898g.a aVar2 = (InterfaceC22898g.a) viewState;
                        c28655q.m87144b0(850155204, Integer.valueOf(aVar2.getQuestionId()));
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        int iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        C0209i c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        if (aVar2 instanceof InterfaceC22898g.a.b) {
                            c28655q.m87150e0(-1446784998);
                            AbstractC22894c.m66550f((InterfaceC22898g.a.b) viewState, onViewEvent, onNavEvent, c28655q, i14 & 1022);
                            z13 = false;
                            c28655q.m87173q(false);
                        } else {
                            z13 = false;
                            if (!(aVar2 instanceof InterfaceC22898g.a.C41939a)) {
                                throw AbstractC11895b.m32003v(-185221816, c28655q, false);
                            }
                            c28655q.m87150e0(-1446377286);
                            AbstractC22893b.m66539f((InterfaceC22898g.a.C41939a) viewState, onViewEvent, onNavEvent, c28655q, i14 & 1022);
                            c28655q.m87173q(false);
                        }
                        C22903l c22903lMo66580c = aVar2.getSubmitting();
                        if (c22903lMo66580c == null) {
                            c28655q.m87150e0(-1446024321);
                            c28655q.m87173q(z13);
                            aVar = aVar2;
                            i16 = 32;
                        } else {
                            c28655q.m87150e0(-1446024320);
                            aVar = aVar2;
                            i16 = 32;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.e(c22903lMo66580c.getTitle(), AbstractC16319p0.m46430a().getVarious().getNotesEdit()), c22903lMo66580c.getSubtitle(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.e.f138475g | (TextResource.$stable << 3), 54, 1020);
                            c28655q = c28655q;
                            z13 = false;
                            c28655q.m87173q(false);
                        }
                        final C22902k c22902kMo66579b = aVar.getSubmitted();
                        if (c22902kMo66579b == null) {
                            c28655q.m87150e0(-1445509318);
                            c28655q.m87173q(z13);
                        } else {
                            c28655q.m87150e0(-1445509317);
                            TextResource textResourceM66635c = c22902kMo66579b.getTitle();
                            boolean zM87157i = c28655q.m87157i(c22902kMo66579b) | ((i14 & 112) == i16);
                            Object objM87133R3 = c28655q.m87133R();
                            if (zM87157i || objM87133R3 == c28676v0) {
                                final int i24 = 0;
                                objM87133R3 = new InterfaceC4339a() { // from class: ky2.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i24) {
                                            case 0:
                                                return AbstractC22896e.m66567l(onViewEvent, c22902kMo66579b);
                                            default:
                                                return AbstractC22896e.m66570o(onViewEvent, c22902kMo66579b);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            C28655q c28655q2 = c28655q;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM66635c, 0L, (InterfaceC4339a) objM87133R3, 2, null), AbstractC8693b.m21272f(c22902kMo66579b.getSubtitle()), null, null, null, false, false, null, null, null, false, true, c28655q2, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 54, 1020);
                            c28655q = c28655q2;
                            z13 = false;
                            c28655q.m87173q(false);
                        }
                        AbstractC25012a.m73392y(c28655q, true, z13, z13);
                    } else if (viewState instanceof InterfaceC22898g.e) {
                        c28655q.m87150e0(587149557);
                        c28655q.m87173q(false);
                        InterfaceC22898g.e eVar = (InterfaceC22898g.e) viewState;
                        onNavEvent.invoke(new AbstractC10840c.f(eVar.getCampaignId(), eVar.getSessionId()));
                    } else if (viewState instanceof InterfaceC22898g.c) {
                        c28655q.m87150e0(587367146);
                        InterfaceC22898g.c cVar = (InterfaceC22898g.c) viewState;
                        TextResource textResourceM66610h = cVar.getTitle();
                        TextResource textResourceM66609g = cVar.getSubtitle();
                        TextResource textResourceM66606d = cVar.getPositiveButton();
                        TextResource textResourceM66605c = cVar.getNegativeButton();
                        int i25 = i14 & 112;
                        boolean z16 = i25 == 32;
                        Object objM87133R4 = c28655q.m87133R();
                        if (z16 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C22892a(onViewEvent, 7);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                        boolean z17 = (i14 & 896) == 256;
                        Object objM87133R5 = c28655q.m87133R();
                        if (z17 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C22892a(onNavEvent, 8);
                            c28655q.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                        int i26 = TextResource.$stable;
                        int i27 = i26 << 3;
                        i15 = i14;
                        AbstractC22926c.m66675n(interfaceC4339a3, textResourceM66606d, interfaceC4339a4, textResourceM66605c, textResourceM66610h, textResourceM66609g, false, c28655q, (i26 << 15) | i27 | (i26 << 9) | (i26 << 12), 64);
                        C22903l c22903lM66608f = cVar.getSubmitting();
                        if (c22903lM66608f == null) {
                            c28655q.m87150e0(587857410);
                            z4 = false;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(587857411);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.e(c22903lM66608f.getTitle(), AbstractC16319p0.m46430a().getVarious().getNotesEdit()), c22903lM66608f.getSubtitle(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.e.f138475g | i27, 54, 1020);
                            c28655q = c28655q;
                            z4 = false;
                            c28655q.m87173q(false);
                        }
                        final C22902k c22902kM66607e = cVar.getSubmitted();
                        if (c22902kM66607e == null) {
                            c28655q.m87150e0(588283629);
                            c28655q.m87173q(z4);
                        } else {
                            c28655q.m87150e0(588283630);
                            TextResource textResourceM66635c2 = c22902kM66607e.getTitle();
                            boolean zM87157i2 = c28655q.m87157i(c22902kM66607e) | (i25 == 32);
                            Object objM87133R6 = c28655q.m87133R();
                            if (zM87157i2 || objM87133R6 == c28676v0) {
                                final int i28 = 1;
                                objM87133R6 = new InterfaceC4339a() { // from class: ky2.d
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                return AbstractC22896e.m66567l(onViewEvent, c22902kM66607e);
                                            default:
                                                return AbstractC22896e.m66570o(onViewEvent, c22902kM66607e);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R6);
                            }
                            C28655q c28655q3 = c28655q;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM66635c2, 0L, (InterfaceC4339a) objM87133R6, 2, null), AbstractC8693b.m21272f(c22902kM66607e.getSubtitle()), null, null, null, false, false, null, null, null, false, true, c28655q3, AbstractC33208p0.h.f138482h | i27, 54, 1020);
                            c28655q = c28655q3;
                            z4 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z4);
                    } else {
                        i15 = i14;
                        if (!(viewState instanceof InterfaceC22898g.f)) {
                            throw AbstractC11895b.m32003v(850122875, c28655q, false);
                        }
                        c28655q.m87150e0(850279667);
                        AbstractC22901j.m66629d((InterfaceC22898g.f) viewState, onNavEvent, c28655q, (i15 & 14) | ((i15 >> 3) & 112));
                        c28655q.m87173q(false);
                    }
                }
                i15 = i14;
            }
            boolean z18 = (i15 & 896) == 256;
            Object objM87133R7 = c28655q.m87133R();
            if (z18 || objM87133R7 == c28676v0) {
                objM87133R7 = new C22892a(onNavEvent, 9);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, true, c28655q, 6, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(i13, 26, viewState, onNavEvent, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66565j(Function1 function1, InterfaceC22898g interfaceC22898g) {
        InterfaceC22898g.b bVar = (InterfaceC22898g.b) interfaceC22898g;
        function1.invoke(new AbstractC17810a.b(bVar.getCampaignId(), bVar.getSessionId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66566k(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m66567l(Function1 function1, C22902k c22902k) {
        function1.invoke(new AbstractC17810a.f(c22902k.getScreeningSubmissionResponse()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m66568m(Function1 function1) {
        function1.invoke(AbstractC17810a.e.f69271a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m66569n(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m66570o(Function1 function1, C22902k c22902k) {
        function1.invoke(new AbstractC17810a.f(c22902k.getScreeningSubmissionResponse()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m66571p(Function1 function1) {
        function1.invoke(AbstractC10840c.a.f33256a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m66572q(InterfaceC22898g interfaceC22898g, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m66564i(interfaceC22898g, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
