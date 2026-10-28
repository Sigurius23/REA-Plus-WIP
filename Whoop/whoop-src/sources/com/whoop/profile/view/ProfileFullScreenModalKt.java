package com.whoop.profile.view;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.samples.ProfileSamples;
import dp0.C12253i;
import fy1.C14873i;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\t\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Ll83/a0;", "onEvent", "ProfileContentAreaModal", "(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PreviewProfileLoadingContentAreaModal", "(Landroidx/compose/runtime/Composer;I)V", "PreviewProfileNetworkErrorContentAreaModal", "PreviewProfileServerErrorContentAreaModal", "PreviewProfileSuccessContentAreaModal", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileFullScreenModalKt {
    public static final void PreviewProfileLoadingContentAreaModal(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-715585937);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileLoadingContentAreaModal$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(1579334879);
                    ProfileViewState sampleLoadingViewState = ProfileSamples.INSTANCE.getSampleLoadingViewState();
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileLoadingContentAreaModal$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileScreenKt.ProfileScreen(sampleLoadingViewState, null, (Function1) objM87133R, c28655q2, 384, 2);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewProfileLoadingContentAreaModal$lambda$1(int i13, Composer composer, int i14) {
        PreviewProfileLoadingContentAreaModal(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void PreviewProfileNetworkErrorContentAreaModal(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-821116885);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileNetworkErrorContentAreaModal$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(2005155686);
                    ProfileViewState sampleNetworkErrorViewState = ProfileSamples.INSTANCE.getSampleNetworkErrorViewState();
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileNetworkErrorContentAreaModal$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileScreenKt.ProfileScreen(sampleNetworkErrorViewState, null, (Function1) objM87133R, c28655q2, 384, 2);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewProfileNetworkErrorContentAreaModal$lambda$1(int i13, Composer composer, int i14) {
        PreviewProfileNetworkErrorContentAreaModal(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void PreviewProfileServerErrorContentAreaModal(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1730609352);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileServerErrorContentAreaModal$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-1327387088);
                    ProfileViewState sampleRequestFailedViewState = ProfileSamples.INSTANCE.getSampleRequestFailedViewState();
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileServerErrorContentAreaModal$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileScreenKt.ProfileScreen(sampleRequestFailedViewState, null, (Function1) objM87133R, c28655q2, 384, 2);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewProfileServerErrorContentAreaModal$lambda$1(int i13, Composer composer, int i14) {
        PreviewProfileServerErrorContentAreaModal(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void PreviewProfileSuccessContentAreaModal(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1977827126);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-1826096456);
                    ProfileViewState sampleSuccessViewState = ProfileSamples.INSTANCE.getSampleSuccessViewState();
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new Function1() { // from class: com.whoop.profile.view.ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$1$1$1
                            public final void invoke(ProfileEvent it) {
                                AbstractC22676k.m65750j(it, "it");
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((ProfileEvent) obj);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    ProfileScreenKt.ProfileScreen(sampleSuccessViewState, null, (Function1) objM87133R, c28655q2, 384, 2);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PreviewProfileSuccessContentAreaModal$lambda$1(int i13, Composer composer, int i14) {
        PreviewProfileSuccessContentAreaModal(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ProfileContentAreaModal(final ProfileViewState.FullScreenModal viewState, final Function1 onEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(809266826);
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
            c28655q.m87150e0(-652894002);
            C33211q0 state = viewState.getState();
            boolean z14 = state.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z14) {
                TextResource textResourceM114676d = AbstractC36095b.m114676d(c28655q, -1323699542, state);
                boolean z15 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    final int i15 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: com.whoop.profile.view.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$0$0(viewState, onEvent);
                                case 1:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$1$0(viewState, onEvent);
                                default:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$2$0(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                z4 = false;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d, 0L, (InterfaceC4339a) objM87133R, 2, null), state.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
                z13 = true;
            } else {
                int i16 = i14;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(-1323366447);
                C33211q0 state2 = viewState.getState();
                int i17 = i16 & 14;
                int i18 = i16 & 112;
                boolean z16 = (i17 == 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) | (i18 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    final int i19 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: com.whoop.profile.view.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$0$0(viewState, onEvent);
                                case 1:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$1$0(viewState, onEvent);
                                default:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$2$0(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean z17 = (i18 == 32) | (i17 == 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R3 = c28655q.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    final int i24 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: com.whoop.profile.view.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$0$0(viewState, onEvent);
                                case 1:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$1$0(viewState, onEvent);
                                default:
                                    return ProfileFullScreenModalKt.ProfileContentAreaModal$lambda$0$0$2$0(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                Function0.m105274p(state2, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C33211q0.f138501k, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onEvent, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentAreaModal$lambda$0$0$0$0(ProfileViewState.FullScreenModal fullScreenModal, Function1 function1) {
        ProfileEvent primaryClickEvent = fullScreenModal.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentAreaModal$lambda$0$0$1$0(ProfileViewState.FullScreenModal fullScreenModal, Function1 function1) {
        ProfileEvent primaryClickEvent = fullScreenModal.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentAreaModal$lambda$0$0$2$0(ProfileViewState.FullScreenModal fullScreenModal, Function1 function1) {
        ProfileEvent secondaryClickEvent = fullScreenModal.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileContentAreaModal$lambda$1(ProfileViewState.FullScreenModal fullScreenModal, Function1 function1, int i13, Composer composer, int i14) {
        ProfileContentAreaModal(fullScreenModal, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
