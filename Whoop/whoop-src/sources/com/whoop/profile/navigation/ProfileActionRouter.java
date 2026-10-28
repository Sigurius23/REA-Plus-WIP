package com.whoop.profile.navigation;

import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.analytics.ProfileAnalyticsHelper;
import com.whoop.profile.domain.ProfileGenericInteractionHandler;
import com.whoop.profile.domain.ProfileInteractionResolution;
import com.whoop.profile.presentation.NavigateToHealthspanViewState;
import com.whoop.profile.presentation.NavigateToLevelsViewState;
import com.whoop.profile.presentation.NavigateToStreaksViewState;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.view.components.StreaksTileViewState;
import com.whoop.whoopaction.domain.models.Action;
import j02.C21166s;
import k11.AbstractC22122e;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;
import w51.C36837c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006%"}, m65681d2 = {"Lcom/whoop/profile/navigation/ProfileActionRouter;", "", "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "analytics", "Lad3/c;", "json", "<init>", "(Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lad3/c;)V", "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/profile/presentation/ProfileEvent;", "processItemClick", "(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "processGenericInteraction", "(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/profile/presentation/ProfileEvent;", "Lny0/h;", "state", "processCardButtonState", "(Lny0/h;)Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;", "processAppDrivenNavigation", "(Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;)Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/navigation/e;", "navigationAction", "processNavigationAction", "(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;", "Lm91/u;", "element", "Ll83/a0;", "fireAnalyticsForElement", "(Lm91/u;)V", "route", "(Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "Lad3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileActionRouter {
    public static final int $stable = 8;
    private final ProfileAnalyticsHelper analytics;
    private final AbstractC0757c json;

    public ProfileActionRouter(ProfileAnalyticsHelper analytics, AbstractC0757c json) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(json, "json");
        this.analytics = analytics;
        this.json = json;
    }

    private final void fireAnalyticsForElement(InterfaceC25312u element) {
        if (element instanceof StreaksTileViewState) {
            this.analytics.sendAnalytics(ProfileEvent.StreaksTappedAnalyticEvent.INSTANCE);
            return;
        }
        if (element instanceof NavigateToHealthspanViewState) {
            this.analytics.sendAnalytics(ProfileEvent.HealthspanTappedAnalyticEvent.INSTANCE);
        } else if (element instanceof NavigateToStreaksViewState) {
            this.analytics.sendAnalytics(ProfileEvent.StreaksTappedAnalyticEvent.INSTANCE);
        } else if (element instanceof NavigateToLevelsViewState) {
            this.analytics.sendAnalytics(ProfileEvent.LevelsTappedAnalyticEvent.INSTANCE);
        }
    }

    private final ProfileEvent processAppDrivenNavigation(ProfileEvent.AppDrivenNavigation event) {
        fireAnalyticsForElement(event.getItemViewState());
        return event;
    }

    private final ProfileEvent processCardButtonState(C27256h state) {
        Action action = state.getAction();
        Object actionArgument = state.getActionArgument();
        AnyModal anyModal = actionArgument instanceof AnyModal ? (AnyModal) actionArgument : null;
        C21166s dismissEvent = state.getDismissEvent();
        if (action != null) {
            return new ProfileEvent.ExecuteWhoopAction(action, state.getId());
        }
        if (anyModal != null) {
            return new ProfileEvent.PresentDesignModal(anyModal, state.getId());
        }
        return dismissEvent != null ? new ProfileEvent.PerformDismissNavigation(dismissEvent) : processNavigationAction(state.getDestination());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ProfileEvent processGenericInteraction(GenericInteraction interaction) {
        ProfileInteractionResolution profileInteractionResolutionResolve = ProfileGenericInteractionHandler.INSTANCE.resolve(interaction, this.json);
        AnalyticEventModel analyticEvent = profileInteractionResolutionResolve.getAnalyticEvent();
        if (analyticEvent != null) {
            this.analytics.sendAnalytics(new ProfileEvent.BffAnalyticEvent(analyticEvent));
        }
        int i13 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.PresentModal) {
            return new ProfileEvent.PresentDesignModal(((ProfileInteractionResolution.PresentModal) profileInteractionResolutionResolve).getModal(), str, i13, objArr3 == true ? 1 : 0);
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.PerformAction) {
            return new ProfileEvent.ExecuteWhoopAction(((ProfileInteractionResolution.PerformAction) profileInteractionResolutionResolve).getAction(), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.Navigate) {
            return processNavigationAction(((ProfileInteractionResolution.Navigate) profileInteractionResolutionResolve).getDestination());
        }
        if (profileInteractionResolutionResolve instanceof ProfileInteractionResolution.None) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ProfileEvent processItemClick(ProfileEvent.ItemClicked event) {
        fireAnalyticsForElement(event.getElement());
        Object event2 = event.getEvent();
        int i13 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (event2 instanceof DesignItemInteraction) {
            DesignItemInteraction designItemInteraction = (DesignItemInteraction) event2;
            AnalyticEventModel analyticEvent = designItemInteraction.getAnalyticEvent();
            if (analyticEvent != null) {
                this.analytics.sendAnalytics(new ProfileEvent.BffAnalyticEvent(analyticEvent));
            }
            Object actionArgument = designItemInteraction.getActionArgument();
            if (actionArgument != null) {
                return processItemClick(ProfileEvent.ItemClicked.copy$default(event, actionArgument, null, 2, null));
            }
            return null;
        }
        if (event2 instanceof Action) {
            return new ProfileEvent.ExecuteWhoopAction((Action) event2, str, i13, objArr5 == true ? 1 : 0);
        }
        if (event2 instanceof AbstractC22122e.a) {
            return new ProfileEvent.ExecuteWhoopAction(((AbstractC22122e.a) event2).getAction(), objArr4 == true ? 1 : 0, i13, objArr3 == true ? 1 : 0);
        }
        if (event2 instanceof AnyModal) {
            return new ProfileEvent.PresentDesignModal((AnyModal) event2, objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
        }
        if (event2 instanceof C27256h) {
            return processCardButtonState((C27256h) event2);
        }
        if (event2 instanceof C9598e) {
            return processNavigationAction((C9598e) event2);
        }
        if (event2 instanceof AbstractC22122e.b) {
            return processNavigationAction(((AbstractC22122e.b) event2).getDestination());
        }
        if (event2 instanceof C29944b) {
            C29944b c29944b = (C29944b) event2;
            return new ProfileEvent.SegmentSelected(c29944b.getSegmentId(), c29944b.m91585a());
        }
        if (event2 instanceof C36837c) {
            return new ProfileEvent.ExpandableStatisticListEvent(((C36837c) event2).getIsExpanded());
        }
        if (event2 instanceof InterfaceC25312u) {
            return new ProfileEvent.AppDrivenNavigation((InterfaceC25312u) event2);
        }
        if (event2 instanceof GenericInteraction) {
            return processGenericInteraction((GenericInteraction) event2);
        }
        return null;
    }

    private final ProfileEvent processNavigationAction(C9598e navigationAction) {
        AppScreen appScreen = navigationAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (appScreen instanceof AppScreen.C9402r2) {
            this.analytics.sendAnalytics(ProfileEvent.HealthspanTappedAnalyticEvent.INSTANCE);
        } else if (appScreen instanceof AppScreen.C9371n3) {
            this.analytics.sendAnalytics(ProfileEvent.LevelsTappedAnalyticEvent.INSTANCE);
        }
        return new ProfileEvent.BackendDrivenNavigation(navigationAction, "profile", null, 4, null);
    }

    public final ProfileEvent route(ProfileEvent event) {
        ProfileEvent profileEventProcessAppDrivenNavigation;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof ProfileEvent.AnalyticEvent) {
            this.analytics.sendAnalytics((ProfileEvent.AnalyticEvent) event);
        }
        if (event instanceof ProfileEvent.ItemClicked) {
            profileEventProcessAppDrivenNavigation = processItemClick((ProfileEvent.ItemClicked) event);
        } else {
            profileEventProcessAppDrivenNavigation = event instanceof ProfileEvent.AppDrivenNavigation ? processAppDrivenNavigation((ProfileEvent.AppDrivenNavigation) event) : event;
        }
        if ((profileEventProcessAppDrivenNavigation instanceof ProfileEvent.AnalyticEvent) && !profileEventProcessAppDrivenNavigation.equals(event)) {
            this.analytics.sendAnalytics((ProfileEvent.AnalyticEvent) profileEventProcessAppDrivenNavigation);
        }
        return profileEventProcessAppDrivenNavigation;
    }
}
