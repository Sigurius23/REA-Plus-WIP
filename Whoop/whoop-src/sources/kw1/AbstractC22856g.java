package kw1;

import androidx.compose.runtime.Composer;
import bg0.C3226h;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import iw1.AbstractC20999e;
import iw1.InterfaceC21000f;
import km2.C22594e;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kw1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Liw1/f;", "viewState", "Lkotlin/Function1;", "Liw1/e;", "Ll83/a0;", "onViewEvent", "", "isFromLto", "f", "(Liw1/f;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22856g {
    /* JADX INFO: renamed from: f */
    public static final void m66341f(final InterfaceC21000f viewState, final Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1863376446);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        boolean z13 = true;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C22594e(14);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState instanceof InterfaceC21000f.a) {
                c28655q.m87150e0(296606175);
                ProgressContent content = ((InterfaceC21000f.a) viewState).getContent();
                boolean z14 = (i15 & 112) == 32;
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(viewState))) {
                    z13 = false;
                }
                boolean z15 = z14 | z13;
                Object objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    final int i17 = 0;
                    objM87133R2 = new Function1() { // from class: kw1.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i17) {
                                case 0:
                                    return AbstractC22856g.m66343h(function1, viewState, (CtaAction) obj);
                                case 1:
                                    return AbstractC22856g.m66344i(function1, viewState, (CtaAction) obj);
                                default:
                                    return AbstractC22856g.m66345j(function1, viewState, (CtaAction) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22862m.m66395e(content, (Function1) objM87133R2, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else if (viewState instanceof InterfaceC21000f.b) {
                c28655q.m87150e0(296615170);
                ProgressContent content2 = ((InterfaceC21000f.b) viewState).getContent();
                boolean z16 = (i15 & 112) == 32;
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(viewState))) {
                    z13 = false;
                }
                boolean z17 = z16 | z13;
                Object objM87133R3 = c28655q.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    final int i18 = 1;
                    objM87133R3 = new Function1() { // from class: kw1.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    return AbstractC22856g.m66343h(function1, viewState, (CtaAction) obj);
                                case 1:
                                    return AbstractC22856g.m66344i(function1, viewState, (CtaAction) obj);
                                default:
                                    return AbstractC22856g.m66345j(function1, viewState, (CtaAction) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC22867r.m66414e(content2, (Function1) objM87133R3, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof InterfaceC21000f.c)) {
                    throw AbstractC11895b.m32003v(296604425, c28655q, false);
                }
                c28655q.m87150e0(296624290);
                ProgressContent content3 = ((InterfaceC21000f.c) viewState).getContent();
                boolean z18 = (i15 & 112) == 32;
                if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !c28655q.m87157i(viewState))) {
                    z13 = false;
                }
                boolean z19 = z18 | z13;
                Object objM87133R4 = c28655q.m87133R();
                if (z19 || objM87133R4 == c28676v0) {
                    final int i19 = 2;
                    objM87133R4 = new Function1() { // from class: kw1.f
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    return AbstractC22856g.m66343h(function1, viewState, (CtaAction) obj);
                                case 1:
                                    return AbstractC22856g.m66344i(function1, viewState, (CtaAction) obj);
                                default:
                                    return AbstractC22856g.m66345j(function1, viewState, (CtaAction) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22871v.m66449f(content3, (Function1) objM87133R4, z4, c28655q, i15 & 896, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(viewState, function2, z4, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66342g(AbstractC20999e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66343h(Function1 function1, InterfaceC21000f interfaceC21000f, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20999e.a(interfaceC21000f, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m66344i(Function1 function1, InterfaceC21000f interfaceC21000f, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20999e.a(interfaceC21000f, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66345j(Function1 function1, InterfaceC21000f interfaceC21000f, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20999e.a(interfaceC21000f, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66346k(InterfaceC21000f interfaceC21000f, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m66341f(interfaceC21000f, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
