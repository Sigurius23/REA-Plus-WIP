package yf1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14983d3;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v90.C35813e;
import vv2.C36537c;
import wb3.AbstractC37056f;
import wf1.C37245c;
import wf1.InterfaceC37243a;

/* JADX INFO: renamed from: yf1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lwf1/c$c;", "viewState", "Lkotlin/Function1;", "Lwf1/a;", "Ll83/a0;", "onEvent", "j", "(Lwf1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "g", "(Ll0/u;Lwf1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feedback-survey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39515d {

    /* JADX INFO: renamed from: yf1.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.feedbacksurvey.view.FeedbackSurveyFullScreenModalKt$FeedbackSurveyFullScreenModal$1$1$4$1", m100430f = "FeedbackSurveyFullScreenModal.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169939w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37245c.c f169940x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f169941y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C37245c.c cVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169940x = cVar;
            this.f169941y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f169940x, this.f169941y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169939w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC37243a followUpEvent = this.f169940x.getFollowUpEvent();
            if (followUpEvent != null) {
                this.f169941y.invoke(followUpEvent);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m126183g(InterfaceC23001u interfaceC23001u, C37245c.c cVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1830230951);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(cVar) : c28655q.m87157i(cVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (cVar.getState().getType() instanceof AbstractC33208p0.b) {
            c28655q.m87150e0(199759757);
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(cVar)));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39514c(cVar, function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, AbstractC1099a.m3398t(interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9114w), 1 * f13, 4 * f13, 0.0f, 0.0f, 12), false, C39512a.f169932a.m126171b(), c28655q, 24576, 12);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(200247945);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(interfaceC23001u, cVar, function1, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m126184h(C37245c.c cVar, Function1 function1) {
        InterfaceC37243a backClickEvent = cVar.getBackClickEvent();
        if (backClickEvent != null) {
            function1.invoke(backClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126185i(InterfaceC23001u interfaceC23001u, C37245c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m126183g(interfaceC23001u, cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m126186j(C37245c.c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        int i15;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1489512769);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            c28655q.m87150e0(-1508495572);
            C33211q0 state = viewState.getState();
            boolean z13 = state.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13) {
                TextResource textResourceM114676d = AbstractC36095b.m114676d(c28655q, 1824178645, state);
                boolean z14 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C39514c(viewState, onEvent, 0);
                    c28655q.m87172p0(objM87133R);
                }
                i15 = i14;
                z4 = false;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d, 0L, (InterfaceC4339a) objM87133R, 2, null), state.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                i15 = i14;
                z4 = false;
                c28655q.m87150e0(1824514995);
                C33211q0 state2 = viewState.getState();
                int i16 = i15 & 14;
                int i17 = i15 & 112;
                boolean z15 = (i17 == 32) | (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R2 = c28655q.m87133R();
                if (z15 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C39514c(viewState, onEvent, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean z16 = (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (z16 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C39514c(viewState, onEvent, 2);
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m105274p(state2, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C33211q0.f138501k, 0);
                InterfaceC37243a followUpEvent = viewState.getFollowUpEvent();
                boolean z17 = (i17 == 32) | (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R4 = c28655q.m87133R();
                if (z17 || objM87133R4 == c28676v0) {
                    objM87133R4 = new a(viewState, onEvent, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, followUpEvent);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            int i18 = i15 << 3;
            m126183g(C1100b.f4583a, viewState, onEvent, c28655q, (i18 & 896) | (i18 & 112) | 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, onEvent, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126187k(C37245c.c cVar, Function1 function1) {
        InterfaceC37243a primaryClickEvent = cVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126188l(C37245c.c cVar, Function1 function1) {
        InterfaceC37243a primaryClickEvent = cVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m126189m(C37245c.c cVar, Function1 function1) {
        InterfaceC37243a secondaryClickEvent = cVar.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m126190n(C37245c.c cVar, Function1 function1, int i13, Composer composer, int i14) {
        m126186j(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
