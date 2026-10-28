package com.whoop.profile.presentation;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileMembershipAnalyticsProperties;
import com.whoop.whoopaction.domain.models.Action;
import j02.C21166s;
import java.util.List;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u001e2\u00020\u0001:\u001d\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u0082\u0001\u0004\u001f !\"¨\u0006#À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent;", "", "ViewEvent", "Refresh", "Report", "DismissReportDialog", "NavigationEvent", "GoBack", "AppDrivenNavigation", "BackendDrivenNavigation", "PerformDismissNavigation", "ActionEvent", "ItemClicked", "SegmentSelected", "ExpandableStatisticListEvent", "AnalyticEvent", "ProfileScreenViewedAnalyticEvent", "ScrolledToBottomAnalyticEvent", "ProfileSaveTappedAnalyticEvent", "UsernameFieldTappedAnalyticEvent", "UsernameSaveAttemptedAnalyticEvent", "HealthspanTappedAnalyticEvent", "StreaksTappedAnalyticEvent", "LevelsTappedAnalyticEvent", "OtherProfileOpenedAnalyticEvent", "BffAnalyticEvent", "PresentDesignModal", "DismissDesignModal", "ExecuteWhoopAction", "ConsumeSideEffects", "Companion", "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ProfileEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;", "Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface ActionEvent extends ProfileEvent {
    }

    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;", "Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ProfileSaveTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ScrolledToBottomAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;", "Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$UsernameFieldTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$UsernameSaveAttemptedAnalyticEvent;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface AnalyticEvent extends ProfileEvent {
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "Lm91/u;", "itemViewState", "<init>", "(Lm91/u;)V", "component1", "()Lm91/u;", "copy", "(Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm91/u;", "getItemViewState", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class AppDrivenNavigation implements NavigationEvent {
        public static final int $stable = 8;
        private final InterfaceC25312u itemViewState;

        public AppDrivenNavigation(InterfaceC25312u itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            this.itemViewState = itemViewState;
        }

        public static /* synthetic */ AppDrivenNavigation copy$default(AppDrivenNavigation appDrivenNavigation, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                interfaceC25312u = appDrivenNavigation.itemViewState;
            }
            return appDrivenNavigation.copy(interfaceC25312u);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        public final AppDrivenNavigation copy(InterfaceC25312u itemViewState) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            return new AppDrivenNavigation(itemViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AppDrivenNavigation) && AbstractC22676k.m65745e(this.itemViewState, ((AppDrivenNavigation) other).itemViewState);
        }

        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        public int hashCode() {
            return this.itemViewState.hashCode();
        }

        public String toString() {
            return AbstractC38963t7.m124379i(this.itemViewState, "AppDrivenNavigation(itemViewState=", ")");
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "Lcom/whoop/navigation/e;", "navAction", "", "source", "Lm91/u;", "itemViewState", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V", "component1", "()Lcom/whoop/navigation/e;", "component2", "()Ljava/lang/String;", "component3", "()Lm91/u;", "copy", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/e;", "getNavAction", "Ljava/lang/String;", "getSource", "Lm91/u;", "getItemViewState", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class BackendDrivenNavigation implements NavigationEvent {
        public static final int $stable = 8;
        private final InterfaceC25312u itemViewState;
        private final C9598e navAction;
        private final String source;

        public BackendDrivenNavigation(C9598e navAction, String source, InterfaceC25312u interfaceC25312u) {
            AbstractC22676k.m65750j(navAction, "navAction");
            AbstractC22676k.m65750j(source, "source");
            this.navAction = navAction;
            this.source = source;
            this.itemViewState = interfaceC25312u;
        }

        public static /* synthetic */ BackendDrivenNavigation copy$default(BackendDrivenNavigation backendDrivenNavigation, C9598e c9598e, String str, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c9598e = backendDrivenNavigation.navAction;
            }
            if ((i13 & 2) != 0) {
                str = backendDrivenNavigation.source;
            }
            if ((i13 & 4) != 0) {
                interfaceC25312u = backendDrivenNavigation.itemViewState;
            }
            return backendDrivenNavigation.copy(c9598e, str, interfaceC25312u);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        public final BackendDrivenNavigation copy(C9598e navAction, String source, InterfaceC25312u itemViewState) {
            AbstractC22676k.m65750j(navAction, "navAction");
            AbstractC22676k.m65750j(source, "source");
            return new BackendDrivenNavigation(navAction, source, itemViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackendDrivenNavigation)) {
                return false;
            }
            BackendDrivenNavigation backendDrivenNavigation = (BackendDrivenNavigation) other;
            return AbstractC22676k.m65745e(this.navAction, backendDrivenNavigation.navAction) && AbstractC22676k.m65745e(this.source, backendDrivenNavigation.source) && AbstractC22676k.m65745e(this.itemViewState, backendDrivenNavigation.itemViewState);
        }

        public final InterfaceC25312u getItemViewState() {
            return this.itemViewState;
        }

        public final C9598e getNavAction() {
            return this.navAction;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.navAction.hashCode() * 31, 31, this.source);
            InterfaceC25312u interfaceC25312u = this.itemViewState;
            return iM30450d + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode());
        }

        public String toString() {
            return "BackendDrivenNavigation(navAction=" + this.navAction + ", source=" + this.source + ", itemViewState=" + this.itemViewState + ")";
        }

        public /* synthetic */ BackendDrivenNavigation(C9598e c9598e, String str, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c9598e, (i13 & 2) != 0 ? "profile" : str, (i13 & 4) != 0 ? null : interfaceC25312u);
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "getEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class BffAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 8;
        private final AnalyticEventModel event;

        public BffAnalyticEvent(AnalyticEventModel event) {
            AbstractC22676k.m65750j(event, "event");
            this.event = event;
        }

        public static /* synthetic */ BffAnalyticEvent copy$default(BffAnalyticEvent bffAnalyticEvent, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                analyticEventModel = bffAnalyticEvent.event;
            }
            return bffAnalyticEvent.copy(analyticEventModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnalyticEventModel getEvent() {
            return this.event;
        }

        public final BffAnalyticEvent copy(AnalyticEventModel event) {
            AbstractC22676k.m65750j(event, "event");
            return new BffAnalyticEvent(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BffAnalyticEvent) && AbstractC22676k.m65745e(this.event, ((BffAnalyticEvent) other).event);
        }

        public final AnalyticEventModel getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "BffAnalyticEvent(event=" + this.event + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$Companion;", "", "<init>", "()V", "screenViewedAnalyticEvent", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "source", "", "isSelfProfile", "", "membershipAnalytics", "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ AnalyticEvent screenViewedAnalyticEvent$default(Companion companion, String str, boolean z4, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                profileMembershipAnalyticsProperties = null;
            }
            return companion.screenViewedAnalyticEvent(str, z4, profileMembershipAnalyticsProperties);
        }

        public final AnalyticEvent screenViewedAnalyticEvent(String source, boolean isSelfProfile, ProfileMembershipAnalyticsProperties membershipAnalytics) {
            AbstractC22676k.m65750j(source, "source");
            return isSelfProfile ? new ProfileScreenViewedAnalyticEvent(source, membershipAnalytics) : new OtherProfileOpenedAnalyticEvent(membershipAnalytics);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ConsumeSideEffects;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ConsumeSideEffects implements ViewEvent {
        public static final int $stable = 0;
        public static final ConsumeSideEffects INSTANCE = new ConsumeSideEffects();

        private ConsumeSideEffects() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$DismissDesignModal;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DismissDesignModal implements ViewEvent {
        public static final int $stable = 0;
        public static final DismissDesignModal INSTANCE = new DismissDesignModal();

        private DismissDesignModal() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DismissReportDialog implements ViewEvent {
        public static final int $stable = 0;
        public static final DismissReportDialog INSTANCE = new DismissReportDialog();

        private DismissReportDialog() {
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "action", "Lcom/whoop/whoopaction/domain/models/Action;", "cardButtonId", "", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "getAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "getCardButtonId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ExecuteWhoopAction implements ViewEvent {
        public static final int $stable = 8;
        private final Action action;
        private final String cardButtonId;

        public ExecuteWhoopAction(Action action, String str) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
            this.cardButtonId = str;
        }

        public static /* synthetic */ ExecuteWhoopAction copy$default(ExecuteWhoopAction executeWhoopAction, Action action, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                action = executeWhoopAction.action;
            }
            if ((i13 & 2) != 0) {
                str = executeWhoopAction.cardButtonId;
            }
            return executeWhoopAction.copy(action, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardButtonId() {
            return this.cardButtonId;
        }

        public final ExecuteWhoopAction copy(Action action, String cardButtonId) {
            AbstractC22676k.m65750j(action, "action");
            return new ExecuteWhoopAction(action, cardButtonId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExecuteWhoopAction)) {
                return false;
            }
            ExecuteWhoopAction executeWhoopAction = (ExecuteWhoopAction) other;
            return AbstractC22676k.m65745e(this.action, executeWhoopAction.action) && AbstractC22676k.m65745e(this.cardButtonId, executeWhoopAction.cardButtonId);
        }

        public final Action getAction() {
            return this.action;
        }

        public final String getCardButtonId() {
            return this.cardButtonId;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.cardButtonId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteWhoopAction(action=" + this.action + ", cardButtonId=" + this.cardButtonId + ")";
        }

        public /* synthetic */ ExecuteWhoopAction(Action action, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, (i13 & 2) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "isExpanded", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ExpandableStatisticListEvent implements ActionEvent, AnalyticEvent {
        public static final int $stable = 0;
        private final boolean isExpanded;

        public ExpandableStatisticListEvent(boolean z4) {
            this.isExpanded = z4;
        }

        public static /* synthetic */ ExpandableStatisticListEvent copy$default(ExpandableStatisticListEvent expandableStatisticListEvent, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = expandableStatisticListEvent.isExpanded;
            }
            return expandableStatisticListEvent.copy(z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        public final ExpandableStatisticListEvent copy(boolean isExpanded) {
            return new ExpandableStatisticListEvent(isExpanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpandableStatisticListEvent) && this.isExpanded == ((ExpandableStatisticListEvent) other).isExpanded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isExpanded);
        }

        public final boolean isExpanded() {
            return this.isExpanded;
        }

        public String toString() {
            return AbstractC3855a.m11827k("ExpandableStatisticListEvent(isExpanded=", ")", this.isExpanded);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$GoBack;", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class GoBack implements NavigationEvent {
        public static final int $stable = 0;
        public static final GoBack INSTANCE = new GoBack();

        private GoBack() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class HealthspanTappedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final HealthspanTappedAnalyticEvent INSTANCE = new HealthspanTappedAnalyticEvent();

        private HealthspanTappedAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;", "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "<init>", "(Ljava/lang/Object;Lm91/u;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lm91/u;", "copy", "(Ljava/lang/Object;Lm91/u;)Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "Lm91/u;", "getElement", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ItemClicked implements ActionEvent, AnalyticEvent {
        public static final int $stable = 8;
        private final InterfaceC25312u element;
        private final Object event;

        public ItemClicked(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        public static /* synthetic */ ItemClicked copy$default(ItemClicked itemClicked, Object obj, InterfaceC25312u interfaceC25312u, int i13, Object obj2) {
            if ((i13 & 1) != 0) {
                obj = itemClicked.event;
            }
            if ((i13 & 2) != 0) {
                interfaceC25312u = itemClicked.element;
            }
            return itemClicked.copy(obj, interfaceC25312u);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InterfaceC25312u getElement() {
            return this.element;
        }

        public final ItemClicked copy(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            return new ItemClicked(event, element);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemClicked)) {
                return false;
            }
            ItemClicked itemClicked = (ItemClicked) other;
            return AbstractC22676k.m65745e(this.event, itemClicked.event) && AbstractC22676k.m65745e(this.element, itemClicked.element);
        }

        public final InterfaceC25312u getElement() {
            return this.element;
        }

        public final Object getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return AbstractC33745d.m106652k("ItemClicked(event=", this.event, ", element=", this.element, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class LevelsTappedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final LevelsTappedAnalyticEvent INSTANCE = new LevelsTappedAnalyticEvent();

        private LevelsTappedAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;", "Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;", "Lcom/whoop/profile/presentation/ProfileEvent$GoBack;", "Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface NavigationEvent extends ProfileEvent {
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "membershipAnalytics", "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "<init>", "(Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V", "getMembershipAnalytics", "()Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class OtherProfileOpenedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        private final ProfileMembershipAnalyticsProperties membershipAnalytics;

        /* JADX WARN: Multi-variable type inference failed */
        public OtherProfileOpenedAnalyticEvent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OtherProfileOpenedAnalyticEvent copy$default(OtherProfileOpenedAnalyticEvent otherProfileOpenedAnalyticEvent, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                profileMembershipAnalyticsProperties = otherProfileOpenedAnalyticEvent.membershipAnalytics;
            }
            return otherProfileOpenedAnalyticEvent.copy(profileMembershipAnalyticsProperties);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProfileMembershipAnalyticsProperties getMembershipAnalytics() {
            return this.membershipAnalytics;
        }

        public final OtherProfileOpenedAnalyticEvent copy(ProfileMembershipAnalyticsProperties membershipAnalytics) {
            return new OtherProfileOpenedAnalyticEvent(membershipAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OtherProfileOpenedAnalyticEvent) && AbstractC22676k.m65745e(this.membershipAnalytics, ((OtherProfileOpenedAnalyticEvent) other).membershipAnalytics);
        }

        public final ProfileMembershipAnalyticsProperties getMembershipAnalytics() {
            return this.membershipAnalytics;
        }

        public int hashCode() {
            ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties = this.membershipAnalytics;
            if (profileMembershipAnalyticsProperties == null) {
                return 0;
            }
            return profileMembershipAnalyticsProperties.hashCode();
        }

        public String toString() {
            return "OtherProfileOpenedAnalyticEvent(membershipAnalytics=" + this.membershipAnalytics + ")";
        }

        public OtherProfileOpenedAnalyticEvent(ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties) {
            this.membershipAnalytics = profileMembershipAnalyticsProperties;
        }

        public /* synthetic */ OtherProfileOpenedAnalyticEvent(ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : profileMembershipAnalyticsProperties);
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;", "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;", "Lj02/s;", "dismissEvent", "<init>", "(Lj02/s;)V", "component1", "()Lj02/s;", "copy", "(Lj02/s;)Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj02/s;", "getDismissEvent", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PerformDismissNavigation implements NavigationEvent {
        public static final int $stable = C21166s.f80697d;
        private final C21166s dismissEvent;

        public PerformDismissNavigation(C21166s dismissEvent) {
            AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
            this.dismissEvent = dismissEvent;
        }

        public static /* synthetic */ PerformDismissNavigation copy$default(PerformDismissNavigation performDismissNavigation, C21166s c21166s, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c21166s = performDismissNavigation.dismissEvent;
            }
            return performDismissNavigation.copy(c21166s);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C21166s getDismissEvent() {
            return this.dismissEvent;
        }

        public final PerformDismissNavigation copy(C21166s dismissEvent) {
            AbstractC22676k.m65750j(dismissEvent, "dismissEvent");
            return new PerformDismissNavigation(dismissEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PerformDismissNavigation) && AbstractC22676k.m65745e(this.dismissEvent, ((PerformDismissNavigation) other).dismissEvent);
        }

        public final C21166s getDismissEvent() {
            return this.dismissEvent;
        }

        public int hashCode() {
            return this.dismissEvent.hashCode();
        }

        public String toString() {
            return "PerformDismissNavigation(dismissEvent=" + this.dismissEvent + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "modal", "Lcom/whoop/design/models/modal/AnyModal;", "cardButtonId", "", "<init>", "(Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;)V", "getModal", "()Lcom/whoop/design/models/modal/AnyModal;", "getCardButtonId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class PresentDesignModal implements ViewEvent {
        public static final int $stable = AnyModal.$stable;
        private final String cardButtonId;
        private final AnyModal modal;

        public PresentDesignModal(AnyModal modal, String str) {
            AbstractC22676k.m65750j(modal, "modal");
            this.modal = modal;
            this.cardButtonId = str;
        }

        public static /* synthetic */ PresentDesignModal copy$default(PresentDesignModal presentDesignModal, AnyModal anyModal, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                anyModal = presentDesignModal.modal;
            }
            if ((i13 & 2) != 0) {
                str = presentDesignModal.cardButtonId;
            }
            return presentDesignModal.copy(anyModal, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AnyModal getModal() {
            return this.modal;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCardButtonId() {
            return this.cardButtonId;
        }

        public final PresentDesignModal copy(AnyModal modal, String cardButtonId) {
            AbstractC22676k.m65750j(modal, "modal");
            return new PresentDesignModal(modal, cardButtonId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentDesignModal)) {
                return false;
            }
            PresentDesignModal presentDesignModal = (PresentDesignModal) other;
            return AbstractC22676k.m65745e(this.modal, presentDesignModal.modal) && AbstractC22676k.m65745e(this.cardButtonId, presentDesignModal.cardButtonId);
        }

        public final String getCardButtonId() {
            return this.cardButtonId;
        }

        public final AnyModal getModal() {
            return this.modal;
        }

        public int hashCode() {
            int iHashCode = this.modal.hashCode() * 31;
            String str = this.cardButtonId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PresentDesignModal(modal=" + this.modal + ", cardButtonId=" + this.cardButtonId + ")";
        }

        public /* synthetic */ PresentDesignModal(AnyModal anyModal, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(anyModal, (i13 & 2) != 0 ? null : str);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ProfileSaveTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ProfileSaveTappedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final ProfileSaveTappedAnalyticEvent INSTANCE = new ProfileSaveTappedAnalyticEvent();

        private ProfileSaveTappedAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$Refresh;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Refresh implements ViewEvent {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$Report;", "Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Report implements ViewEvent {
        public static final int $stable = 0;
        public static final Report INSTANCE = new Report();

        private Report() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ScrolledToBottomAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ScrolledToBottomAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final ScrolledToBottomAnalyticEvent INSTANCE = new ScrolledToBottomAnalyticEvent();

        private ScrolledToBottomAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;", "Lcom/whoop/profile/presentation/ProfileEvent$ActionEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "", "selectedSegmentId", "", "Lm91/u;", "segmentItems", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectedSegmentId", "Ljava/util/List;", "getSegmentItems", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class SegmentSelected implements ActionEvent, AnalyticEvent {
        public static final int $stable = 8;
        private final List<InterfaceC25312u> segmentItems;
        private final String selectedSegmentId;

        /* JADX WARN: Multi-variable type inference failed */
        public SegmentSelected(String selectedSegmentId, List<? extends InterfaceC25312u> segmentItems) {
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            AbstractC22676k.m65750j(segmentItems, "segmentItems");
            this.selectedSegmentId = selectedSegmentId;
            this.segmentItems = segmentItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SegmentSelected copy$default(SegmentSelected segmentSelected, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = segmentSelected.selectedSegmentId;
            }
            if ((i13 & 2) != 0) {
                list = segmentSelected.segmentItems;
            }
            return segmentSelected.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public final List<InterfaceC25312u> component2() {
            return this.segmentItems;
        }

        public final SegmentSelected copy(String selectedSegmentId, List<? extends InterfaceC25312u> segmentItems) {
            AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
            AbstractC22676k.m65750j(segmentItems, "segmentItems");
            return new SegmentSelected(selectedSegmentId, segmentItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentSelected)) {
                return false;
            }
            SegmentSelected segmentSelected = (SegmentSelected) other;
            return AbstractC22676k.m65745e(this.selectedSegmentId, segmentSelected.selectedSegmentId) && AbstractC22676k.m65745e(this.segmentItems, segmentSelected.segmentItems);
        }

        public final List<InterfaceC25312u> getSegmentItems() {
            return this.segmentItems;
        }

        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public int hashCode() {
            return this.segmentItems.hashCode() + (this.selectedSegmentId.hashCode() * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("SegmentSelected(selectedSegmentId=", this.selectedSegmentId, ", segmentItems=", ")", this.segmentItems);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class StreaksTappedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final StreaksTappedAnalyticEvent INSTANCE = new StreaksTappedAnalyticEvent();

        private StreaksTappedAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$UsernameFieldTappedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class UsernameFieldTappedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final UsernameFieldTappedAnalyticEvent INSTANCE = new UsernameFieldTappedAnalyticEvent();

        private UsernameFieldTappedAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$UsernameSaveAttemptedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "<init>", "()V", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class UsernameSaveAttemptedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        public static final UsernameSaveAttemptedAnalyticEvent INSTANCE = new UsernameSaveAttemptedAnalyticEvent();

        private UsernameSaveAttemptedAnalyticEvent() {
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;", "Lcom/whoop/profile/presentation/ProfileEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$ConsumeSideEffects;", "Lcom/whoop/profile/presentation/ProfileEvent$DismissDesignModal;", "Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;", "Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;", "Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;", "Lcom/whoop/profile/presentation/ProfileEvent$Refresh;", "Lcom/whoop/profile/presentation/ProfileEvent$Report;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface ViewEvent extends ProfileEvent {
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "source", "", "membershipAnalytics", "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "<init>", "(Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V", "getSource", "()Ljava/lang/String;", "getMembershipAnalytics", "()Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class ProfileScreenViewedAnalyticEvent implements AnalyticEvent {
        public static final int $stable = 0;
        private final ProfileMembershipAnalyticsProperties membershipAnalytics;
        private final String source;

        public ProfileScreenViewedAnalyticEvent(String source, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties) {
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
            this.membershipAnalytics = profileMembershipAnalyticsProperties;
        }

        public static /* synthetic */ ProfileScreenViewedAnalyticEvent copy$default(ProfileScreenViewedAnalyticEvent profileScreenViewedAnalyticEvent, String str, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = profileScreenViewedAnalyticEvent.source;
            }
            if ((i13 & 2) != 0) {
                profileMembershipAnalyticsProperties = profileScreenViewedAnalyticEvent.membershipAnalytics;
            }
            return profileScreenViewedAnalyticEvent.copy(str, profileMembershipAnalyticsProperties);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ProfileMembershipAnalyticsProperties getMembershipAnalytics() {
            return this.membershipAnalytics;
        }

        public final ProfileScreenViewedAnalyticEvent copy(String source, ProfileMembershipAnalyticsProperties membershipAnalytics) {
            AbstractC22676k.m65750j(source, "source");
            return new ProfileScreenViewedAnalyticEvent(source, membershipAnalytics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileScreenViewedAnalyticEvent)) {
                return false;
            }
            ProfileScreenViewedAnalyticEvent profileScreenViewedAnalyticEvent = (ProfileScreenViewedAnalyticEvent) other;
            return AbstractC22676k.m65745e(this.source, profileScreenViewedAnalyticEvent.source) && AbstractC22676k.m65745e(this.membershipAnalytics, profileScreenViewedAnalyticEvent.membershipAnalytics);
        }

        public final ProfileMembershipAnalyticsProperties getMembershipAnalytics() {
            return this.membershipAnalytics;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties = this.membershipAnalytics;
            return iHashCode + (profileMembershipAnalyticsProperties == null ? 0 : profileMembershipAnalyticsProperties.hashCode());
        }

        public String toString() {
            return "ProfileScreenViewedAnalyticEvent(source=" + this.source + ", membershipAnalytics=" + this.membershipAnalytics + ")";
        }

        public /* synthetic */ ProfileScreenViewedAnalyticEvent(String str, ProfileMembershipAnalyticsProperties profileMembershipAnalyticsProperties, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : profileMembershipAnalyticsProperties);
        }
    }
}
