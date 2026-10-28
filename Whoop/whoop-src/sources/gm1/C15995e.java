package gm1;

import com.whoop.home.domain.models.CycleDays;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import com.whoop.home.domain.models.HomeResponseMetaData;
import com.whoop.home.domain.models.JournalMetaData;
import com.whoop.navigation.AchievementMilestoneUnlockScreenModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.StreakCelebrationScreenModel;
import com.whoop.navigation.WeeklyPlanSummaryScreenModel;
import com.whoop.service.network.model.cycles.Period;
import dm1.AbstractC12177a;
import fm1.C14598b;
import fm1.C14601e;
import il1.InterfaceC18640q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import jl1.C21770a;
import jl1.C21773d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sx1.C33067c;
import sx1.EnumC33066b;
import ul1.AbstractC35065b;
import vv1.C36530a;
import xl1.C38453c;

/* JADX INFO: renamed from: gm1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010 \u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*¨\u0006,"}, m65681d2 = {"Lgm1/e;", "", "Lsx1/c;", "reactivationModalCoordinator", "Lvv1/a;", "dunningBottomSheetCoordinator", "<init>", "(Lsx1/c;Lvv1/a;)V", "Lcom/whoop/home/domain/models/JournalMetaData;", "journalMetaData", "Lxl1/c;", "journalData", "Lfm1/e;", "c", "(Lcom/whoop/home/domain/models/JournalMetaData;Lxl1/c;)Lfm1/e;", "Lcom/whoop/home/domain/models/CycleDays;", "cycleDays", "Lfm1/b;", "b", "(Lcom/whoop/home/domain/models/CycleDays;)Lfm1/b;", "", "cycleId", "Ljl1/a;", "autoPopDomainState", "", "f", "(JLjl1/a;)Z", "Lcom/whoop/navigation/e;", "destination", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/navigation/e;Ljl1/a;)Z", "d", "g", "e", "Lil1/q$c;", "domainState", "Ldm1/a;", "a", "(Lil1/q$c;)Ldm1/a;", "Lsx1/c;", "Lvv1/a;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "dateTimeFormatter", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15995e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33067c reactivationModalCoordinator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36530a dunningBottomSheetCoordinator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final DateTimeFormatter dateTimeFormatter;

    public C15995e(C33067c reactivationModalCoordinator, C36530a dunningBottomSheetCoordinator) {
        AbstractC22676k.m65750j(reactivationModalCoordinator, "reactivationModalCoordinator");
        AbstractC22676k.m65750j(dunningBottomSheetCoordinator, "dunningBottomSheetCoordinator");
        this.reactivationModalCoordinator = reactivationModalCoordinator;
        this.dunningBottomSheetCoordinator = dunningBottomSheetCoordinator;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        AbstractC22676k.m65749i(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.dateTimeFormatter = dateTimeFormatterOfPattern;
    }

    /* JADX INFO: renamed from: b */
    private final C14598b m45258b(CycleDays cycleDays) {
        if (cycleDays.getLowerEndpoint() == null || cycleDays.getLowerBoundType() == null || cycleDays.getUpperEndpoint() == null || cycleDays.getUpperBoundType() == null) {
            return null;
        }
        Period period = new Period(cycleDays.getLowerEndpoint(), cycleDays.getUpperEndpoint());
        return new C14598b(period.getLower().getMillis(), cycleDays.getLowerBoundType(), period.getUpper().getMillis(), cycleDays.getUpperBoundType());
    }

    /* JADX INFO: renamed from: c */
    private final C14601e m45259c(JournalMetaData journalMetaData, C38453c journalData) {
        return new C14601e(journalData.getShouldShowJournalTutorial(), journalData.getShouldShowJournal(), journalMetaData.getJournalCompleted(), m45258b(journalMetaData.getPreviousCycleDuring()));
    }

    /* JADX INFO: renamed from: d */
    private final boolean m45260d(C9598e destination, C21770a autoPopDomainState) {
        if ((destination != null ? destination.getParameters() : null) instanceof AchievementMilestoneUnlockScreenModel) {
            return !C21770a.INSTANCE.m61544e(autoPopDomainState, destination);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m45261e(C9598e destination, C21770a autoPopDomainState) {
        return !C21770a.INSTANCE.m61544e(autoPopDomainState, destination);
    }

    /* JADX INFO: renamed from: f */
    private final boolean m45262f(long cycleId, C21770a autoPopDomainState) {
        List<C21773d> listM61538e = autoPopDomainState.m61538e();
        boolean z4 = false;
        if (!(listM61538e instanceof Collection) || !listM61538e.isEmpty()) {
            for (C21773d c21773d : listM61538e) {
                if (AbstractC22676k.m65745e(c21773d.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9275b3.f27499w.getName()) && AbstractC22676k.m65745e(c21773d.getIdentifier(), String.valueOf(cycleId))) {
                    z4 = true;
                    break;
                }
            }
        }
        return !z4;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m45263g(C9598e destination, C21770a autoPopDomainState) {
        if ((destination != null ? destination.getParameters() : null) instanceof StreakCelebrationScreenModel) {
            return !C21770a.INSTANCE.m61544e(autoPopDomainState, destination);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m45264h(C9598e destination, C21770a autoPopDomainState) {
        if ((destination != null ? destination.getParameters() : null) instanceof WeeklyPlanSummaryScreenModel) {
            return !C21770a.INSTANCE.m61544e(autoPopDomainState, destination);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC12177a m45265a(InterfaceC18640q.c domainState) {
        HomeResponseMetaData metadata;
        AbstractC22676k.m65750j(domainState, "domainState");
        C9598e nextDestination = domainState.getHomeData().getAutoPopDomainState().getNextDestination();
        if (AbstractC22676k.m65745e(nextDestination != null ? nextDestination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9275b3.f27499w)) {
            HomeBffFeedResponse bffFeed = domainState.getHomeData().getBffFeed();
            if (bffFeed == null || (metadata = bffFeed.getMetadata()) == null || !m45262f(metadata.getCycleMetaData().getCycleId(), domainState.getHomeData().getAutoPopDomainState())) {
                return null;
            }
            C14601e c14601eM45259c = m45259c(metadata.getJournalMetaData(), domainState.getHomeData().getJournalData());
            LocalDate localDate = LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getLowerEndpoint(), this.dateTimeFormatter);
            long cycleId = metadata.getCycleMetaData().getCycleId();
            String string = localDate.minusDays(1L).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            C14598b previousCycleDuring = c14601eM45259c.getPreviousCycleDuring();
            Long lValueOf = previousCycleDuring != null ? Long.valueOf(previousCycleDuring.getLowerEndpoint()) : null;
            C14598b previousCycleDuring2 = c14601eM45259c.getPreviousCycleDuring();
            Long lValueOf2 = previousCycleDuring2 != null ? Long.valueOf(previousCycleDuring2.getUpperEndpoint()) : null;
            LocalDate localDate2 = LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getLowerEndpoint(), this.dateTimeFormatter);
            AbstractC22676k.m65749i(localDate2, "parse(...)");
            return new AbstractC12177a.r(false, null, "Auto-Pop", true, c14601eM45259c.getShouldShowJournalTutorial(), cycleId, lValueOf, lValueOf2, localDate2, LocalDate.parse(metadata.getCycleMetaData().getCycleDays().getUpperEndpoint(), this.dateTimeFormatter), string);
        }
        if (AbstractC22676k.m65745e(nextDestination != null ? nextDestination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9382o6.f27834w)) {
            if (m45264h(nextDestination, domainState.getHomeData().getAutoPopDomainState())) {
                return new AbstractC12177a.e(nextDestination);
            }
            return null;
        }
        if (AbstractC22676k.m65745e(nextDestination != null ? nextDestination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9271b.f27485w)) {
            if (m45260d(nextDestination, domainState.getHomeData().getAutoPopDomainState())) {
                return new AbstractC12177a.e(nextDestination);
            }
            return null;
        }
        if (AbstractC22676k.m65745e(nextDestination != null ? nextDestination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9421t5.f27948w)) {
            if (m45263g(nextDestination, domainState.getHomeData().getAutoPopDomainState())) {
                return new AbstractC12177a.e(nextDestination);
            }
            return null;
        }
        if (AbstractC22676k.m65745e(nextDestination != null ? nextDestination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9441w1.f28009w)) {
            if (m45261e(nextDestination, domainState.getHomeData().getAutoPopDomainState())) {
                return new AbstractC12177a.e(nextDestination);
            }
            return null;
        }
        if (nextDestination != null) {
            return new AbstractC12177a.e(nextDestination);
        }
        if (domainState.getHomeData().getHomeDialogDomainResult() instanceof AbstractC35065b.j) {
            this.reactivationModalCoordinator.m104725f(EnumC33066b.HOME_SCREEN, false);
            return AbstractC12177a.u.f40570a;
        }
        if (!(domainState.getHomeData().getHomeDialogDomainResult() instanceof AbstractC35065b.c)) {
            return null;
        }
        this.dunningBottomSheetCoordinator.m117079r();
        return AbstractC12177a.k.f40541a;
    }
}
