package com.whoop.profile.analytics;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.presentation.NavigateToHealthspanViewState;
import com.whoop.profile.presentation.NavigateToLevelsViewState;
import com.whoop.profile.presentation.NavigateToStreaksViewState;
import com.whoop.profile.presentation.ProfileEvent;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import s51.C32207d;
import w51.C36842h;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "sendItemClickAnalytics", "(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)V", "", "convertToAnalyticsId", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;", "handleSegmentSelectedEvent", "(Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;)V", "", "isExpanded", "segmentId", "handleExpandableStatisticListEvent", "(ZLjava/lang/String;)V", "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;", "sendAnalytics", "(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V", "Lfi0/a;", "previousSegmentSelected", "Ljava/lang/String;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileAnalyticsHelper {
    public static final int $stable = 8;
    private final InterfaceC14515a analytics;
    private String previousSegmentSelected;

    public ProfileAnalyticsHelper(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this.previousSegmentSelected = "1m";
    }

    private final String convertToAnalyticsId(String str) {
        if (AbstractC39414r.m125876U(str, "1m", true)) {
            return "1m";
        }
        if (AbstractC39414r.m125876U(str, "3m", true)) {
            return "3m";
        }
        return AbstractC39414r.m125876U(str, "all_time", true) ? "all_time" : "unknown";
    }

    private final void handleExpandableStatisticListEvent(boolean isExpanded, String segmentId) {
        if (isExpanded) {
            ProfileAnalyticsKt.activitySummaryCollapsed(this.analytics, segmentId);
        } else {
            if (isExpanded) {
                throw new NoWhenBranchMatchedException();
            }
            ProfileAnalyticsKt.activitySummaryExpanded(this.analytics, segmentId);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[LOOP:0: B:22:0x0054->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    private final void handleSegmentSelectedEvent(ProfileEvent.SegmentSelected event) {
        Iterator<T> it;
        List<InterfaceC25312u> segmentItems = event.getSegmentItems();
        boolean z4 = segmentItems instanceof Collection;
        if (!z4 || !segmentItems.isEmpty()) {
            Iterator<T> it3 = segmentItems.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC25312u) it3.next()) instanceof C32207d) {
                }
            }
            if (!AbstractC39414r.m125876U(event.getSelectedSegmentId(), "Data_Highlight", true)) {
                if (z4 || !segmentItems.isEmpty()) {
                    it = segmentItems.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC25312u) it.next()) instanceof C36842h) {
                        }
                    }
                    if (!AbstractC39414r.m125876U(event.getSelectedSegmentId(), "Activity_Summary", true)) {
                        return;
                    }
                } else if (!AbstractC39414r.m125876U(event.getSelectedSegmentId(), "Activity_Summary", true)) {
                    return;
                }
                this.previousSegmentSelected = event.getSelectedSegmentId();
                ProfileAnalyticsKt.activitySummaryToggleTapped(this.analytics, convertToAnalyticsId(event.getSelectedSegmentId()));
                return;
            }
        } else if (!AbstractC39414r.m125876U(event.getSelectedSegmentId(), "Data_Highlight", true)) {
            if (z4) {
                it = segmentItems.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC25312u) it.next()) instanceof C36842h) {
                    }
                }
                if (!AbstractC39414r.m125876U(event.getSelectedSegmentId(), "Activity_Summary", true)) {
                    return;
                }
            } else {
                it = segmentItems.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC25312u) it.next()) instanceof C36842h) {
                    }
                }
                if (!AbstractC39414r.m125876U(event.getSelectedSegmentId(), "Activity_Summary", true)) {
                    return;
                }
            }
            this.previousSegmentSelected = event.getSelectedSegmentId();
            ProfileAnalyticsKt.activitySummaryToggleTapped(this.analytics, convertToAnalyticsId(event.getSelectedSegmentId()));
            return;
        }
        ProfileAnalyticsKt.dataHighlightsToggleTapped(this.analytics, convertToAnalyticsId(event.getSelectedSegmentId()));
    }

    private final void sendItemClickAnalytics(ProfileEvent.ItemClicked event) {
        InterfaceC25312u element = event.getElement();
        if (element instanceof NavigateToHealthspanViewState) {
            ProfileAnalyticsKt.healthspanTapped(this.analytics);
        } else if (element instanceof NavigateToStreaksViewState) {
            ProfileAnalyticsKt.streaksTapped(this.analytics);
        } else if (element instanceof NavigateToLevelsViewState) {
            ProfileAnalyticsKt.levelsTapped(this.analytics);
        }
    }

    public final void sendAnalytics(ProfileEvent.AnalyticEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof ProfileEvent.BffAnalyticEvent) {
            AbstractC14516b.m41429a(this.analytics, ((ProfileEvent.BffAnalyticEvent) event).getEvent());
            return;
        }
        if (event instanceof ProfileEvent.ProfileScreenViewedAnalyticEvent) {
            ProfileEvent.ProfileScreenViewedAnalyticEvent profileScreenViewedAnalyticEvent = (ProfileEvent.ProfileScreenViewedAnalyticEvent) event;
            ProfileAnalyticsKt.profileOpened(this.analytics, profileScreenViewedAnalyticEvent.getSource(), profileScreenViewedAnalyticEvent.getMembershipAnalytics());
            return;
        }
        if (event instanceof ProfileEvent.ItemClicked) {
            sendItemClickAnalytics((ProfileEvent.ItemClicked) event);
            return;
        }
        if (event instanceof ProfileEvent.ScrolledToBottomAnalyticEvent) {
            ProfileAnalyticsKt.hitBottomOfProfileEvent(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.ProfileSaveTappedAnalyticEvent) {
            ProfileAnalyticsKt.profileSaveTapped(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.UsernameFieldTappedAnalyticEvent) {
            ProfileAnalyticsKt.usernameFieldTapped(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.UsernameSaveAttemptedAnalyticEvent) {
            ProfileAnalyticsKt.usernameSaveAttempted(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.HealthspanTappedAnalyticEvent) {
            ProfileAnalyticsKt.healthspanTapped(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.StreaksTappedAnalyticEvent) {
            ProfileAnalyticsKt.streaksTapped(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.LevelsTappedAnalyticEvent) {
            ProfileAnalyticsKt.levelsTapped(this.analytics);
            return;
        }
        if (event instanceof ProfileEvent.OtherProfileOpenedAnalyticEvent) {
            ProfileAnalyticsKt.otherProfileOpened(this.analytics, ((ProfileEvent.OtherProfileOpenedAnalyticEvent) event).getMembershipAnalytics());
        } else if (event instanceof ProfileEvent.SegmentSelected) {
            handleSegmentSelectedEvent((ProfileEvent.SegmentSelected) event);
        } else {
            if (!(event instanceof ProfileEvent.ExpandableStatisticListEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            handleExpandableStatisticListEvent(((ProfileEvent.ExpandableStatisticListEvent) event).isExpanded(), convertToAnalyticsId(this.previousSegmentSelected));
        }
    }
}
