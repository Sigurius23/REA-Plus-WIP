package il1;

import am1.C1005b;
import bm1.InterfaceC3420c;
import cm1.C4810a;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import em1.EnumC13344r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import jl1.C21770a;
import kl1.C22565e;
import ol1.AbstractC28015a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sl1.AbstractC32703b;
import sl1.C32702a;
import tl1.C33917a;
import ul1.AbstractC35065b;
import vl1.C36103a;
import wl1.AbstractC37356b;
import xl1.C38453c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: il1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020!\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020,HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020!2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bA\u0010MR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bV\u0010B\u001a\u0004\bW\u00103R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bP\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bI\u0010_\u001a\u0004\bR\u0010`R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b]\u0010a\u001a\u0004\bN\u0010bR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bW\u0010c\u001a\u0004\bV\u0010dR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bT\u0010e\u001a\u0004\bK\u0010fR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bY\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010#\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bj\u0010g\u001a\u0004\bj\u0010iR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bh\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bE\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bo\u0010q\u001a\u0004\b7\u0010rR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bl\u0010s\u001a\u0004\b[\u0010tR\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bG\u00101¨\u0006w"}, m65681d2 = {"Lil1/n;", "", "Lkl1/e;", "calendarResponseAccumulator", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "bffFeed", "Ljava/time/LocalDate;", "currentDateTime", "", "monthOffset", "Lsl1/a;", "strapStatusIconIndicatorResult", "Lxl1/c;", "journalData", "Lsl1/b;", "connectivityTileType", "Lul1/b;", "homeDialogDomainResult", "Lol1/a;", "processNowDomainResult", "pillarChangeIndex", "Lem1/r;", "refreshType", "Lam1/b;", "onboardingDomainState", "Lil1/h;", "dismissConfigCtaState", "Lil1/f;", "dismissAlertTileState", "Lvl1/a;", "hideRecoveryDomainState", "Ltl1/a;", "dayOneTransitionDomainState", "", "shouldShowGiftIconNewIndicator", "shouldRequestPermissions", "Lcm1/a;", "weeklyPlanHomeTileDomainState", "Lbm1/c;", "streaksDomainState", "Ljl1/a;", "autoPopDomainState", "Lwl1/b;", "inAppReviewDomainState", "", "currentUserId", "<init>", "(Lkl1/e;Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILsl1/a;Lxl1/c;Lsl1/b;Lul1/b;Lol1/a;ILem1/r;Lam1/b;Lil1/h;Lil1/f;Lvl1/a;Ltl1/a;ZZLcm1/a;Lbm1/c;Ljl1/a;Lwl1/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkl1/e;", "c", "()Lkl1/e;", "b", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "Ljava/time/LocalDate;", "e", "()Ljava/time/LocalDate;", "d", "I", "getMonthOffset", "Lsl1/a;", "t", "()Lsl1/a;", "f", "Lxl1/c;", "m", "()Lxl1/c;", "g", "Lsl1/b;", "()Lsl1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lul1/b;", "k", "()Lul1/b;", "i", "Lol1/a;", "p", "()Lol1/a;", "j", "o", "Lem1/r;", "q", "()Lem1/r;", "l", "Lam1/b;", "n", "()Lam1/b;", "Lil1/h;", "()Lil1/h;", "Lil1/f;", "()Lil1/f;", "Lvl1/a;", "()Lvl1/a;", "Ltl1/a;", "()Ltl1/a;", "Z", "s", "()Z", "r", "Lcm1/a;", "v", "()Lcm1/a;", "Lbm1/c;", "u", "()Lbm1/c;", "Ljl1/a;", "()Ljl1/a;", "Lwl1/b;", "()Lwl1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18637n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22565e calendarResponseAccumulator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HomeBffFeedResponse bffFeed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDate currentDateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int monthOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C32702a strapStatusIconIndicatorResult;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C38453c journalData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC32703b connectivityTileType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC35065b homeDialogDomainResult;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AbstractC28015a processNowDomainResult;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int pillarChangeIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC13344r refreshType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C1005b onboardingDomainState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC18631h dismissConfigCtaState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C18629f dismissAlertTileState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C36103a hideRecoveryDomainState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C33917a dayOneTransitionDomainState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean shouldShowGiftIconNewIndicator;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean shouldRequestPermissions;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C4810a weeklyPlanHomeTileDomainState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final InterfaceC3420c streaksDomainState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C21770a autoPopDomainState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final AbstractC37356b inAppReviewDomainState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String currentUserId;

    public C18637n(C22565e calendarResponseAccumulator, HomeBffFeedResponse homeBffFeedResponse, LocalDate currentDateTime, int i13, C32702a strapStatusIconIndicatorResult, C38453c journalData, AbstractC32703b connectivityTileType, AbstractC35065b homeDialogDomainResult, AbstractC28015a processNowDomainResult, int i14, EnumC13344r refreshType, C1005b onboardingDomainState, InterfaceC18631h dismissConfigCtaState, C18629f dismissAlertTileState, C36103a hideRecoveryDomainState, C33917a dayOneTransitionDomainState, boolean z4, boolean z13, C4810a weeklyPlanHomeTileDomainState, InterfaceC3420c streaksDomainState, C21770a autoPopDomainState, AbstractC37356b inAppReviewDomainState, String currentUserId) {
        AbstractC22676k.m65750j(calendarResponseAccumulator, "calendarResponseAccumulator");
        AbstractC22676k.m65750j(currentDateTime, "currentDateTime");
        AbstractC22676k.m65750j(strapStatusIconIndicatorResult, "strapStatusIconIndicatorResult");
        AbstractC22676k.m65750j(journalData, "journalData");
        AbstractC22676k.m65750j(connectivityTileType, "connectivityTileType");
        AbstractC22676k.m65750j(homeDialogDomainResult, "homeDialogDomainResult");
        AbstractC22676k.m65750j(processNowDomainResult, "processNowDomainResult");
        AbstractC22676k.m65750j(refreshType, "refreshType");
        AbstractC22676k.m65750j(onboardingDomainState, "onboardingDomainState");
        AbstractC22676k.m65750j(dismissConfigCtaState, "dismissConfigCtaState");
        AbstractC22676k.m65750j(dismissAlertTileState, "dismissAlertTileState");
        AbstractC22676k.m65750j(hideRecoveryDomainState, "hideRecoveryDomainState");
        AbstractC22676k.m65750j(dayOneTransitionDomainState, "dayOneTransitionDomainState");
        AbstractC22676k.m65750j(weeklyPlanHomeTileDomainState, "weeklyPlanHomeTileDomainState");
        AbstractC22676k.m65750j(streaksDomainState, "streaksDomainState");
        AbstractC22676k.m65750j(autoPopDomainState, "autoPopDomainState");
        AbstractC22676k.m65750j(inAppReviewDomainState, "inAppReviewDomainState");
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        this.calendarResponseAccumulator = calendarResponseAccumulator;
        this.bffFeed = homeBffFeedResponse;
        this.currentDateTime = currentDateTime;
        this.monthOffset = i13;
        this.strapStatusIconIndicatorResult = strapStatusIconIndicatorResult;
        this.journalData = journalData;
        this.connectivityTileType = connectivityTileType;
        this.homeDialogDomainResult = homeDialogDomainResult;
        this.processNowDomainResult = processNowDomainResult;
        this.pillarChangeIndex = i14;
        this.refreshType = refreshType;
        this.onboardingDomainState = onboardingDomainState;
        this.dismissConfigCtaState = dismissConfigCtaState;
        this.dismissAlertTileState = dismissAlertTileState;
        this.hideRecoveryDomainState = hideRecoveryDomainState;
        this.dayOneTransitionDomainState = dayOneTransitionDomainState;
        this.shouldShowGiftIconNewIndicator = z4;
        this.shouldRequestPermissions = z13;
        this.weeklyPlanHomeTileDomainState = weeklyPlanHomeTileDomainState;
        this.streaksDomainState = streaksDomainState;
        this.autoPopDomainState = autoPopDomainState;
        this.inAppReviewDomainState = inAppReviewDomainState;
        this.currentUserId = currentUserId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C21770a getAutoPopDomainState() {
        return this.autoPopDomainState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final HomeBffFeedResponse getBffFeed() {
        return this.bffFeed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22565e getCalendarResponseAccumulator() {
        return this.calendarResponseAccumulator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC32703b getConnectivityTileType() {
        return this.connectivityTileType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getCurrentDateTime() {
        return this.currentDateTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18637n)) {
            return false;
        }
        C18637n c18637n = (C18637n) other;
        return AbstractC22676k.m65745e(this.calendarResponseAccumulator, c18637n.calendarResponseAccumulator) && AbstractC22676k.m65745e(this.bffFeed, c18637n.bffFeed) && AbstractC22676k.m65745e(this.currentDateTime, c18637n.currentDateTime) && this.monthOffset == c18637n.monthOffset && AbstractC22676k.m65745e(this.strapStatusIconIndicatorResult, c18637n.strapStatusIconIndicatorResult) && AbstractC22676k.m65745e(this.journalData, c18637n.journalData) && AbstractC22676k.m65745e(this.connectivityTileType, c18637n.connectivityTileType) && AbstractC22676k.m65745e(this.homeDialogDomainResult, c18637n.homeDialogDomainResult) && AbstractC22676k.m65745e(this.processNowDomainResult, c18637n.processNowDomainResult) && this.pillarChangeIndex == c18637n.pillarChangeIndex && this.refreshType == c18637n.refreshType && AbstractC22676k.m65745e(this.onboardingDomainState, c18637n.onboardingDomainState) && AbstractC22676k.m65745e(this.dismissConfigCtaState, c18637n.dismissConfigCtaState) && AbstractC22676k.m65745e(this.dismissAlertTileState, c18637n.dismissAlertTileState) && AbstractC22676k.m65745e(this.hideRecoveryDomainState, c18637n.hideRecoveryDomainState) && AbstractC22676k.m65745e(this.dayOneTransitionDomainState, c18637n.dayOneTransitionDomainState) && this.shouldShowGiftIconNewIndicator == c18637n.shouldShowGiftIconNewIndicator && this.shouldRequestPermissions == c18637n.shouldRequestPermissions && AbstractC22676k.m65745e(this.weeklyPlanHomeTileDomainState, c18637n.weeklyPlanHomeTileDomainState) && AbstractC22676k.m65745e(this.streaksDomainState, c18637n.streaksDomainState) && AbstractC22676k.m65745e(this.autoPopDomainState, c18637n.autoPopDomainState) && AbstractC22676k.m65745e(this.inAppReviewDomainState, c18637n.inAppReviewDomainState) && AbstractC22676k.m65745e(this.currentUserId, c18637n.currentUserId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C33917a getDayOneTransitionDomainState() {
        return this.dayOneTransitionDomainState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C18629f getDismissAlertTileState() {
        return this.dismissAlertTileState;
    }

    public int hashCode() {
        int iHashCode = this.calendarResponseAccumulator.hashCode() * 31;
        HomeBffFeedResponse homeBffFeedResponse = this.bffFeed;
        return this.currentUserId.hashCode() + ((this.inAppReviewDomainState.hashCode() + ((this.autoPopDomainState.hashCode() + ((this.streaksDomainState.hashCode() + ((this.weeklyPlanHomeTileDomainState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.dayOneTransitionDomainState.hashCode() + ((this.hideRecoveryDomainState.hashCode() + ((this.dismissAlertTileState.hashCode() + ((this.dismissConfigCtaState.hashCode() + ((this.onboardingDomainState.hashCode() + ((this.refreshType.hashCode() + AbstractC11266d.m30448b(this.pillarChangeIndex, (this.processNowDomainResult.hashCode() + ((this.homeDialogDomainResult.hashCode() + ((this.connectivityTileType.hashCode() + ((this.journalData.hashCode() + ((this.strapStatusIconIndicatorResult.hashCode() + AbstractC11266d.m30448b(this.monthOffset, AbstractC13673n.m38558e(this.currentDateTime, (iHashCode + (homeBffFeedResponse == null ? 0 : homeBffFeedResponse.hashCode())) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.shouldShowGiftIconNewIndicator), 31, this.shouldRequestPermissions)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC18631h getDismissConfigCtaState() {
        return this.dismissConfigCtaState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C36103a getHideRecoveryDomainState() {
        return this.hideRecoveryDomainState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final AbstractC35065b getHomeDialogDomainResult() {
        return this.homeDialogDomainResult;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AbstractC37356b getInAppReviewDomainState() {
        return this.inAppReviewDomainState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C38453c getJournalData() {
        return this.journalData;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C1005b getOnboardingDomainState() {
        return this.onboardingDomainState;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getPillarChangeIndex() {
        return this.pillarChangeIndex;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final AbstractC28015a getProcessNowDomainResult() {
        return this.processNowDomainResult;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final EnumC13344r getRefreshType() {
        return this.refreshType;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShouldRequestPermissions() {
        return this.shouldRequestPermissions;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShouldShowGiftIconNewIndicator() {
        return this.shouldShowGiftIconNewIndicator;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C32702a getStrapStatusIconIndicatorResult() {
        return this.strapStatusIconIndicatorResult;
    }

    public String toString() {
        C22565e c22565e = this.calendarResponseAccumulator;
        HomeBffFeedResponse homeBffFeedResponse = this.bffFeed;
        LocalDate localDate = this.currentDateTime;
        int i13 = this.monthOffset;
        C32702a c32702a = this.strapStatusIconIndicatorResult;
        C38453c c38453c = this.journalData;
        AbstractC32703b abstractC32703b = this.connectivityTileType;
        AbstractC35065b abstractC35065b = this.homeDialogDomainResult;
        AbstractC28015a abstractC28015a = this.processNowDomainResult;
        int i14 = this.pillarChangeIndex;
        EnumC13344r enumC13344r = this.refreshType;
        C1005b c1005b = this.onboardingDomainState;
        InterfaceC18631h interfaceC18631h = this.dismissConfigCtaState;
        C18629f c18629f = this.dismissAlertTileState;
        C36103a c36103a = this.hideRecoveryDomainState;
        C33917a c33917a = this.dayOneTransitionDomainState;
        boolean z4 = this.shouldShowGiftIconNewIndicator;
        boolean z13 = this.shouldRequestPermissions;
        C4810a c4810a = this.weeklyPlanHomeTileDomainState;
        InterfaceC3420c interfaceC3420c = this.streaksDomainState;
        C21770a c21770a = this.autoPopDomainState;
        AbstractC37356b abstractC37356b = this.inAppReviewDomainState;
        String str = this.currentUserId;
        StringBuilder sb4 = new StringBuilder("HomeData(calendarResponseAccumulator=");
        sb4.append(c22565e);
        sb4.append(", bffFeed=");
        sb4.append(homeBffFeedResponse);
        sb4.append(", currentDateTime=");
        sb4.append(localDate);
        sb4.append(", monthOffset=");
        sb4.append(i13);
        sb4.append(", strapStatusIconIndicatorResult=");
        sb4.append(c32702a);
        sb4.append(", journalData=");
        sb4.append(c38453c);
        sb4.append(", connectivityTileType=");
        sb4.append(abstractC32703b);
        sb4.append(", homeDialogDomainResult=");
        sb4.append(abstractC35065b);
        sb4.append(", processNowDomainResult=");
        sb4.append(abstractC28015a);
        sb4.append(", pillarChangeIndex=");
        sb4.append(i14);
        sb4.append(", refreshType=");
        sb4.append(enumC13344r);
        sb4.append(", onboardingDomainState=");
        sb4.append(c1005b);
        sb4.append(", dismissConfigCtaState=");
        sb4.append(interfaceC18631h);
        sb4.append(", dismissAlertTileState=");
        sb4.append(c18629f);
        sb4.append(", hideRecoveryDomainState=");
        sb4.append(c36103a);
        sb4.append(", dayOneTransitionDomainState=");
        sb4.append(c33917a);
        sb4.append(", shouldShowGiftIconNewIndicator=");
        AbstractC38963t7.m124392v(sb4, z4, ", shouldRequestPermissions=", z13, ", weeklyPlanHomeTileDomainState=");
        sb4.append(c4810a);
        sb4.append(", streaksDomainState=");
        sb4.append(interfaceC3420c);
        sb4.append(", autoPopDomainState=");
        sb4.append(c21770a);
        sb4.append(", inAppReviewDomainState=");
        sb4.append(abstractC37356b);
        sb4.append(", currentUserId=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final InterfaceC3420c getStreaksDomainState() {
        return this.streaksDomainState;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C4810a getWeeklyPlanHomeTileDomainState() {
        return this.weeklyPlanHomeTileDomainState;
    }
}
