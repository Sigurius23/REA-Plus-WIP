package com.whoop.profile.navigation;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.FeatureEducationModel;
import com.whoop.navigation.HealthspanScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.ReferAFriendHubScreenModel;
import com.whoop.profile.presentation.NavigateToAccountViewState;
import com.whoop.profile.presentation.NavigateToEditProfileViewState;
import com.whoop.profile.presentation.NavigateToHealthspanViewState;
import com.whoop.profile.presentation.NavigateToLevelsViewState;
import com.whoop.profile.presentation.NavigateToReferralsViewState;
import com.whoop.profile.presentation.NavigateToSettingsViewState;
import com.whoop.profile.presentation.NavigateToStreaksViewState;
import com.whoop.profile.presentation.ProfileEvent;
import j02.AbstractC21155m0;
import j02.C21166s;
import j02.InterfaceC21159o0;
import or2.AbstractC28152c1;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p114eb.C12995w0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006("}, m65681d2 = {"Lcom/whoop/profile/navigation/ProfileNavigationRouter;", "", "Leb/u0;", "composeNavController", "Leb/a0;", "fragmentHostController", "Lj02/o0;", "navigator", "Ltr2/n;", "logger", "<init>", "(Leb/u0;Leb/a0;Lj02/o0;Ltr2/n;)V", "Lj02/s;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "handleDismissEvent", "(Lj02/s;)V", "Lm91/u;", "handleAppDrivenNavigation", "(Lm91/u;)V", "Lcom/whoop/navigation/e;", "navAction", "", "source", "navigateBackendDriven", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "withSource", "(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;", "Lcom/whoop/navigation/FeatureEducationModel;", "", "isHealthspanEducation", "(Lcom/whoop/navigation/FeatureEducationModel;)Z", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "route", "(Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;)V", "Leb/u0;", "Leb/a0;", "Lj02/o0;", "Ltr2/n;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileNavigationRouter {
    public static final int $stable = 8;
    private final C12991u0 composeNavController;
    private final AbstractC12939a0 fragmentHostController;
    private final InterfaceC34116n logger;
    private final InterfaceC21159o0 navigator;

    public ProfileNavigationRouter(C12991u0 composeNavController, AbstractC12939a0 fragmentHostController, InterfaceC21159o0 navigator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(fragmentHostController, "fragmentHostController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(logger, "logger");
        this.composeNavController = composeNavController;
        this.fragmentHostController = fragmentHostController;
        this.navigator = navigator;
        this.logger = logger;
    }

    private final void handleAppDrivenNavigation(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof NavigateToAccountViewState) {
            this.fragmentHostController.m36403r(Uri.parse("android-app://com.whoop/settings/myAccountFragment?source=profile"), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
            return;
        }
        if (interfaceC25312u instanceof NavigateToSettingsViewState) {
            this.navigator.mo59393b(new AbstractC21155m0.j4("profile"));
            return;
        }
        if (interfaceC25312u instanceof NavigateToEditProfileViewState) {
            AbstractC12939a0.m36374y(this.composeNavController, "EDIT_PROFILE", null, 6);
            return;
        }
        if (interfaceC25312u instanceof NavigateToHealthspanViewState) {
            this.fragmentHostController.m36403r(Uri.parse("android-app://com.whoop/healthspan?source=profile"), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
            return;
        }
        if (interfaceC25312u instanceof NavigateToStreaksViewState) {
            this.fragmentHostController.m36403r(Uri.parse("android-app://com.whoop/streaks"), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
            return;
        }
        if (interfaceC25312u instanceof NavigateToReferralsViewState) {
            this.fragmentHostController.m36403r(Uri.parse("android-app://com.whoop/referrals"), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
        } else if (interfaceC25312u instanceof NavigateToLevelsViewState) {
            this.fragmentHostController.m36403r(Uri.parse("android-app://com.whoop/levels"), AbstractC28152c1.m85188f(new C12995w0()).m36508a());
        } else {
            this.logger.mo85228t("itemClicked " + interfaceC25312u, new AbstractC30556a.a[0]);
        }
    }

    private final void handleDismissEvent(C21166s event) {
        if (event.getPopUpTo() == null) {
            AbstractC9597d.m23114f(this.fragmentHostController, event.getType(), null, 2, null);
        } else {
            AbstractC9597d.m23112d(this.fragmentHostController, event.getPopUpTo(), event.getPopBackCount(), this.logger);
        }
    }

    private final boolean isHealthspanEducation(FeatureEducationModel featureEducationModel) {
        return AbstractC39414r.m125876U(featureEducationModel.getFeatureEducationName(), "HEALTHSPAN", true);
    }

    private final void navigateBackendDriven(C9598e navAction, String source) {
        NavigationScreenModel parameters = navAction.getParameters();
        if ((parameters instanceof FeatureEducationModel) && isHealthspanEducation((FeatureEducationModel) parameters)) {
            this.navigator.mo59393b(new AbstractC21155m0.t1(null, source, null, 5, null));
        } else {
            this.navigator.mo59392a(C9598e.m23127b(navAction, null, withSource(parameters, source), null, 5, null));
        }
    }

    private final NavigationScreenModel withSource(NavigationScreenModel navigationScreenModel, String str) {
        if (navigationScreenModel instanceof ReferAFriendHubScreenModel) {
            return ReferAFriendHubScreenModel.copy$default((ReferAFriendHubScreenModel) navigationScreenModel, null, str, null, false, 13, null);
        }
        if (navigationScreenModel instanceof FeatureEducationModel) {
            return FeatureEducationModel.copy$default((FeatureEducationModel) navigationScreenModel, null, str, null, 5, null);
        }
        return navigationScreenModel instanceof HealthspanScreenModel ? HealthspanScreenModel.copy$default((HealthspanScreenModel) navigationScreenModel, null, str, null, 5, null) : navigationScreenModel;
    }

    public final void route(ProfileEvent.NavigationEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof ProfileEvent.BackendDrivenNavigation) {
            ProfileEvent.BackendDrivenNavigation backendDrivenNavigation = (ProfileEvent.BackendDrivenNavigation) event;
            navigateBackendDriven(backendDrivenNavigation.getNavAction(), backendDrivenNavigation.getSource());
        } else if (event instanceof ProfileEvent.AppDrivenNavigation) {
            handleAppDrivenNavigation(((ProfileEvent.AppDrivenNavigation) event).getItemViewState());
        } else if (event instanceof ProfileEvent.GoBack) {
            this.fragmentHostController.m36410z();
        } else {
            if (!(event instanceof ProfileEvent.PerformDismissNavigation)) {
                throw new NoWhenBranchMatchedException();
            }
            handleDismissEvent(((ProfileEvent.PerformDismissNavigation) event).getDismissEvent());
        }
    }
}
