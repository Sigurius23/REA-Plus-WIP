package com.whoop.bot.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import ci0.C4726a;
import cj0.C4744f;
import ck1.C4780c;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import xk0.C38423a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006&²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lcom/whoop/bot/settings/CoachSettingsViewModel;", "viewModel$delegate", "Ll83/h;", "getViewModel", "()Lcom/whoop/bot/settings/CoachSettingsViewModel;", "viewModel", "Lxk0/a;", "analyticsHelper$delegate", "getAnalyticsHelper", "()Lxk0/a;", "analyticsHelper", "Lj02/o0;", "appNavigator$delegate", "getAppNavigator", "()Lj02/o0;", "appNavigator", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "state", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsFragment extends AbstractComponentCallbacksC1320m0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: analyticsHelper$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: appNavigator$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h appNavigator;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new CoachSettingsFragment$special$$inlined$viewModel$default$2(this, null, new CoachSettingsFragment$special$$inlined$viewModel$default$1(this), null));

    public CoachSettingsFragment() {
        C4744f c4744f = new C4744f(17);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new CoachSettingsFragment$special$$inlined$inject$default$1(this, null, c4744f));
        this.appNavigator = AbstractC30060g.m92087G(enumC23463i, new CoachSettingsFragment$special$$inlined$inject$default$2(this, null, new C6072b(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a analyticsHelper_delegate$lambda$0() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a appNavigator_delegate$lambda$0(CoachSettingsFragment coachSettingsFragment) {
        return AbstractC15751g.m44431K(coachSettingsFragment.requireActivity());
    }

    private final C38423a getAnalyticsHelper() {
        return (C38423a) this.analyticsHelper.getValue();
    }

    private final InterfaceC21159o0 getAppNavigator() {
        return (InterfaceC21159o0) this.appNavigator.getValue();
    }

    private final CoachSettingsViewModel getViewModel() {
        return (CoachSettingsViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onCreateView$lambda$0(CoachSettingsFragment coachSettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            CoachSettingsViewState coachSettingsViewStateOnCreateView$lambda$0$0 = onCreateView$lambda$0$0(AbstractC28683x.m87260n(coachSettingsFragment.getViewModel().getViewState(), CoachSettingsViewState.Loading.INSTANCE, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(coachSettingsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4780c(coachSettingsFragment, 3);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(coachSettingsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C6072b(coachSettingsFragment, 0);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(coachSettingsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C6072b(coachSettingsFragment, 1);
                c28655q.m87172p0(objM87133R3);
            }
            CoachSettingsScreenKt.CoachSettingsScreen(coachSettingsViewStateOnCreateView$lambda$0$0, null, function1, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    private static final CoachSettingsViewState onCreateView$lambda$0$0(InterfaceC28670t2 interfaceC28670t2) {
        return (CoachSettingsViewState) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onCreateView$lambda$0$1$0(CoachSettingsFragment coachSettingsFragment, CoachSettingsViewEvent it) {
        AbstractC22676k.m65750j(it, "it");
        coachSettingsFragment.getViewModel().sendViewEvent(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onCreateView$lambda$0$2$0(CoachSettingsFragment coachSettingsFragment) {
        coachSettingsFragment.getAnalyticsHelper().m123084v();
        coachSettingsFragment.getAppNavigator().mo59393b(new AbstractC21155m0.w1(CoachSettingsFragmentKt.HELP_TYPE_KEY, CoachSettingsFragmentKt.ENTRY_POINT, null, null, 12, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onCreateView$lambda$0$3$0(CoachSettingsFragment coachSettingsFragment) {
        AbstractC28163g0.m85259o(coachSettingsFragment).m85343i();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 4), true, -1764881449));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((InterfaceC14515a) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null)).mo41425g("AI Coach Settings");
    }
}
