package q80;

import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.activation.domain.models.steps.PlanPickerOptionKt;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import d90.C11812c;
import g80.C15566g;
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import j80.InterfaceC21415c;
import n90.C26475e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p90.C28997e;
import p90.C29002j;
import r80.AbstractC31061c;
import r90.C31100g;
import v90.C35815g;
import v90.C35819k;
import v90.C35823o;
import v90.C35826r;
import v90.C35827s;
import v90.C35830v;

/* JADX INFO: renamed from: q80.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJg\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lq80/j;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "", "b", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)Z", "Lm91/u;", "currentScreen", "Lp90/e;", "card", "newCard", "Lc31/k;", "localProgressButtonState", "Lg80/g;", "viewState", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Lh80/b;", "onAnalyticsEvent", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "a", "(Lm91/u;Lp90/e;Lp90/e;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class C30038j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C30038j(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m91970b(ActivationFlowDestination activationFlowDestination) {
        if (activationFlowDestination == ActivationFlowDestination.AL_PERMISSIONS || activationFlowDestination == ActivationFlowDestination.MEDICARE_PERMISSIONS) {
            return true;
        }
        return activationFlowDestination == ActivationFlowDestination.HW_ONLY_PERMISSIONS && this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HW_ONLY_PERMISSION_SUBMISSION_ANDROID);
    }

    /* JADX INFO: renamed from: a */
    public final void m91971a(InterfaceC25312u currentScreen, C28997e card, C28997e newCard, C3927k localProgressButtonState, C15566g viewState, Function1 onViewEvent, Function1 onAnalyticsEvent, SignUpSource signUpSource) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(card, "card");
        AbstractC22676k.m65750j(newCard, "newCard");
        AbstractC22676k.m65750j(localProgressButtonState, "localProgressButtonState");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        if (currentScreen instanceof C29002j) {
            onViewEvent.invoke(new InterfaceC21413a.r0(card));
            C29002j c29002j = (C29002j) currentScreen;
            onViewEvent.invoke(new InterfaceC21415c.a(card, c29002j.getUpcycleCreditCardVariant(), c29002j.getUserCountryCode()));
        } else if (currentScreen instanceof C35830v) {
            C35827s c35827s = (C35827s) PlanPickerOptionKt.selectedFor(((C35830v) currentScreen).m113719f(), viewState.getMemberInfo().getCommitmentType());
            if (c35827s != null) {
                onAnalyticsEvent.invoke(new InterfaceC17002b.i("upcycle_plan_picker", "advance", null, c35827s.getTrackingLabel(), "upcycle", AbstractC31061c.m95645u("membership", c35827s.getMembershipTier()), 4, null));
            }
            onViewEvent.invoke(new InterfaceC21413a.c0(false, null, signUpSource, 3, null));
        } else if (currentScreen instanceof C35826r) {
            C35826r c35826r = (C35826r) currentScreen;
            onViewEvent.invoke(new InterfaceC21415c.c(c35826r.getPaymentOptions().getOptionSelected() == 0 ? card : newCard, c35826r.getSku(), c35826r.getPromoCode(), c35826r.getOrderDetailsReplaced(), c35826r.getPaymentOptions().getOptionSelected() == 0, c35826r.getUserCountryCode()));
            onAnalyticsEvent.invoke(new InterfaceC17002b.i("upcycle_checkout", null, null, "join", "upcycle", AbstractC31061c.m95645u("membership", c35826r.getMembershipTier()), 6, null));
        } else if (currentScreen instanceof C35823o) {
            C35823o c35823o = (C35823o) currentScreen;
            C35819k c35819k = (C35819k) PlanPickerOptionKt.selectedFor(c35823o.m113636e(), viewState.getMemberInfo().getCommitmentType());
            if (c35819k != null) {
                onAnalyticsEvent.invoke(new InterfaceC17002b.i(c35823o.getAnalyticsName(), "close", c35819k.getTrackingLabel(), null, "20_dollar_discount", null, 40, null));
            }
            onViewEvent.invoke(new InterfaceC21413a.c0(false, null, signUpSource, 3, null));
        } else if (currentScreen instanceof C35815g) {
            C35815g c35815g = (C35815g) currentScreen;
            onViewEvent.invoke(new InterfaceC21415c.b(c35815g.getPaymentOptions().getOptionSelected() == 0 ? card : newCard, c35815g.getSku(), c35815g.getPromoCode(), c35815g.getOrderDetailsReplaced(), c35815g.getPaymentOptions().getOptionSelected() == 0, c35815g.getUserCountryCode()));
            onAnalyticsEvent.invoke(new InterfaceC17002b.i("trial_offer_checkout", null, null, "join", "20_dollar_discount", AbstractC31061c.m95645u("membership", c35815g.getMembershipTier()), 6, null));
        } else {
            if (!(currentScreen instanceof C26475e)) {
                if (currentScreen instanceof C11812c) {
                    if (viewState.getCurrentDestination() == ActivationFlowDestination.ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION) {
                        onViewEvent.invoke(new InterfaceC21413a.c0(false, null, signUpSource, 3, null));
                    } else {
                        onAnalyticsEvent.invoke(new InterfaceC17002b.i(((C11812c) currentScreen).getAnalyticsName(), null, null, "reenter_email", "account_creation", null, 38, null));
                        ActivationFlowDestination currentDestination = viewState.getCurrentDestination();
                        if (currentDestination != null) {
                            onViewEvent.invoke(new InterfaceC21413a.m0(currentDestination));
                        }
                    }
                } else if (!(currentScreen instanceof C31100g)) {
                    onViewEvent.invoke(new InterfaceC21413a.c0(false, null, signUpSource, 3, null));
                } else if (localProgressButtonState.getState() != EnumC3920d.ERROR || m91970b(viewState.getCurrentDestination())) {
                    onViewEvent.invoke(new InterfaceC21413a.c0(false, null, signUpSource, 3, null));
                } else {
                    onViewEvent.invoke(new InterfaceC21415c.a(card, null, ((C31100g) currentScreen).getUserCountryCode(), 2, null));
                }
                onViewEvent.invoke(new InterfaceC21413a.o0(false));
            }
            onViewEvent.invoke(InterfaceC21413a.a.f82094a);
        }
        onViewEvent.invoke(new InterfaceC21413a.o0(false));
    }
}
