package com.whoop.profile.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import ci0.C4726a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.view.navigation.ProfileNavHostKt;
import ge3.AbstractC15751g;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p003a1.C0111j;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/profile/view/ProfileFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lcom/whoop/profile/navigation/ProfileActionRouter;", "actionRouter$delegate", "Ll83/h;", "getActionRouter", "()Lcom/whoop/profile/navigation/ProfileActionRouter;", "actionRouter", "Lj02/o0;", "navigator$delegate", "getNavigator", "()Lj02/o0;", "navigator", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileFragment extends AbstractComponentCallbacksC1320m0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: actionRouter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: navigator$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    public ProfileFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new ProfileFragment$special$$inlined$inject$default$1(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new ProfileFragment$special$$inlined$inject$default$2(this, null, new C0111j(this, 18)));
    }

    private final ProfileActionRouter getActionRouter() {
        return (ProfileActionRouter) this.actionRouter.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a navigator_delegate$lambda$0(ProfileFragment profileFragment) {
        return AbstractC15751g.m44431K(profileFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    public static final C23454a0 onCreateView$lambda$0(ProfileFragment profileFragment, Composer composer, int i13) {
        Integer num;
        Integer num2;
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = profileFragment.getArguments();
            String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
            if (strM85315e == null || AbstractC39414r.m125890i0(strM85315e)) {
                strM85315e = null;
            }
            if (strM85315e == null) {
                strM85315e = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            }
            String str = strM85315e;
            Bundle arguments2 = profileFragment.getArguments();
            if (arguments2 != null) {
                int i14 = arguments2.getInt(ProfileApiKt.TARGET_USER_ID_PARAM, -1);
                Integer numValueOf = Integer.valueOf(i14);
                if (i14 != -1) {
                    num = numValueOf;
                } else {
                    num = null;
                }
            } else {
                num = null;
            }
            Bundle arguments3 = profileFragment.getArguments();
            if (arguments3 != null) {
                int i15 = arguments3.getInt(ProfileApiKt.COMMUNITY_ID_PARAM, -1);
                Integer numValueOf2 = Integer.valueOf(i15);
                if (i15 != -1) {
                    num2 = numValueOf2;
                } else {
                    num2 = null;
                }
            } else {
                num2 = null;
            }
            Bundle arguments4 = profileFragment.getArguments();
            String string2 = arguments4 != null ? arguments4.getString("educationType") : null;
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("ProfileNavHost", null, c28655q, 6, 2);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(profileFragment);
            InterfaceC21159o0 navigator = profileFragment.getNavigator();
            InterfaceC34116n.Companion companion = InterfaceC34116n.INSTANCE;
            ProfileNavHostKt.ProfileNavHost(new ProfileNavigationRouter(c12991u0M58963a, abstractC12939a0M16799z, navigator, companion.m107848a("ProfileNavigationRouter")), profileFragment.getActionRouter(), c12991u0M58963a, companion.m107848a("ProfileScreen"), null, profileFragment.getActivity(), str, num, num2, string2, c28655q, 0, 16);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 5), true, 515779527));
    }
}
