package com.whoop.profile.view.edit;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3603v;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p635y2.InterfaceC39127r0;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent;", "Ll83/a0;", "onEvent", "EditProfileFullScreenModal", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileFullScreenModalKt {
    public static final void EditProfileFullScreenModal(final EditProfileViewState.FullScreenModal viewState, final Function1 onEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2025984533);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            EditProfileEvent backClickEvent = viewState.getBackClickEvent();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (backClickEvent == null) {
                c28655q.m87150e0(1070347891);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1070347892);
                boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(backClickEvent);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C3603v(22, onEvent, backClickEvent);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
                c28655q.m87173q(false);
            }
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
            c28655q.m87150e0(908821883);
            C33211q0 state = viewState.getState();
            if (state.getType() instanceof AbstractC33208p0.h) {
                TextResource textResourceM114676d = AbstractC36095b.m114676d(c28655q, -131129739, state);
                boolean z14 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState)));
                Object objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    final int i15 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$0$0(viewState, onEvent);
                                case 1:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$1$0(viewState, onEvent);
                                default:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$2$0(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                z4 = false;
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d, 0L, (InterfaceC4339a) objM87133R2, 2, null), state.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
                z13 = true;
            } else {
                int i16 = i14;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(-130743944);
                C33211q0 state2 = viewState.getState();
                int i17 = i16 & 14;
                int i18 = i16 & 112;
                boolean z15 = (i17 == 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) | (i18 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (z15 || objM87133R3 == c28676v0) {
                    final int i19 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$0$0(viewState, onEvent);
                                case 1:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$1$0(viewState, onEvent);
                                default:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$2$0(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                boolean z16 = (i17 == 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) | (i18 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (z16 || objM87133R4 == c28676v0) {
                    final int i24 = 2;
                    objM87133R4 = new InterfaceC4339a() { // from class: com.whoop.profile.view.edit.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$0$0(viewState, onEvent);
                                case 1:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$1$0(viewState, onEvent);
                                default:
                                    return EditProfileFullScreenModalKt.EditProfileFullScreenModal$lambda$1$0$2$0(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                Function0.m105274p(state2, interfaceC4339a, (InterfaceC4339a) objM87133R4, c28655q, C33211q0.f138501k, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onEvent, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFullScreenModal$lambda$0$0$0(Function1 function1, EditProfileEvent editProfileEvent) {
        function1.invoke(editProfileEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFullScreenModal$lambda$1$0$0$0(EditProfileViewState.FullScreenModal fullScreenModal, Function1 function1) {
        EditProfileEvent primaryClickEvent = fullScreenModal.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFullScreenModal$lambda$1$0$1$0(EditProfileViewState.FullScreenModal fullScreenModal, Function1 function1) {
        EditProfileEvent primaryClickEvent = fullScreenModal.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFullScreenModal$lambda$1$0$2$0(EditProfileViewState.FullScreenModal fullScreenModal, Function1 function1) {
        EditProfileEvent secondaryClickEvent = fullScreenModal.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EditProfileFullScreenModal$lambda$2(EditProfileViewState.FullScreenModal fullScreenModal, Function1 function1, int i13, Composer composer, int i14) {
        EditProfileFullScreenModal(fullScreenModal, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
