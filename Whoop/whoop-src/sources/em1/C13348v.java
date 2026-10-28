package em1;

import a11.C0140r;
import am1.C1005b;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.metrics.common.ScreenState;
import fm1.C14599c;
import fm1.C14605i;
import fy1.InterfaceC14875k;
import h91.C17027b;
import ik2.C18613a;
import ik2.C18614b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import sm1.C32715a;
import vm1.AbstractC36155b;
import wl1.AbstractC37356b;
import x31.EnumC37944c;
import x51.C37992d;
import xl1.EnumC38451a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: em1.v */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010=R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bB\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b@\u00105R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b:\u0010QR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bO\u0010TR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bK\u0010Y\u001a\u0004\bM\u0010ZR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b>\u0010]R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bH\u0010b\u001a\u0004\bU\u0010cR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bd\u0010fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\b[\u0010iR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bR\u0010lR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bF\u0010oR\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bW\u0010p\u001a\u0004\bD\u0010qR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\bg\u0010=R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b^\u0010=R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\br\u0010=R\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bm\u0010tR\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bj\u0010wR\u0014\u0010{\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, m65681d2 = {"Lem1/v;", "Lfy1/k;", "", "isLoading", "isUpdating", "Lem1/m;", "errorState", "isPullToRefresh", "Lam1/b;", "onboardingDomainState", "Lfm1/c;", "homeFeed", "", "currentPageIndex", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "Lm91/u;", "headerState", "Lik2/b;", "toolbarViewState", "Lx51/d;", "fabScreenViewState", "Ljava/time/LocalDate;", "currentCalendarDate", "La11/r;", "connectivityTileViewState", "Lem1/l;", "homeDialogViewState", "Lvm1/b;", "processNowViewState", "Lx31/c;", "homeTabGroupCenterConfig", "Lsm1/a;", "hideRecoveryViewState", "Lxl1/a;", "displayCycleState", "Lik2/a;", "dayOneTransitionOverlayViewState", "shouldShowHomeTabs", "makePermissionsCheck", "isWeeklyPlanTileExpanded", "Lfm1/i;", "streaksHomeViewState", "Lwl1/b;", "showInAppReviewPrompt", "<init>", "(ZZLem1/m;ZLam1/b;Lfm1/c;ILh91/b;Lm91/u;Lik2/b;Lx51/d;Ljava/time/LocalDate;La11/r;Lem1/l;Lvm1/b;Lx31/c;Lsm1/a;Lxl1/a;Lik2/a;ZZZLfm1/i;Lwl1/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "u", "()Z", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "d", "Lem1/m;", "g", "()Lem1/m;", "e", "v", "f", "Lam1/b;", "o", "()Lam1/b;", "Lfm1/c;", "l", "()Lfm1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "i", "Lh91/b;", "()Lh91/b;", "j", "Lm91/u;", "()Lm91/u;", "k", "Lik2/b;", "t", "()Lik2/b;", "Lx51/d;", "()Lx51/d;", "m", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "n", "La11/r;", "getConnectivityTileViewState", "()La11/r;", "Lem1/l;", "()Lem1/l;", "p", "Lvm1/b;", "()Lvm1/b;", "q", "Lx31/c;", "()Lx31/c;", "r", "Lsm1/a;", "()Lsm1/a;", "s", "Lxl1/a;", "()Lxl1/a;", "Lik2/a;", "()Lik2/a;", "x", "Lfm1/i;", "()Lfm1/i;", "y", "Lwl1/b;", "()Lwl1/b;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13348v implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isUpdating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC13339m errorState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isPullToRefresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C1005b onboardingDomainState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C14599c homeFeed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int currentPageIndex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendarDomainState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC25312u headerState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C18614b toolbarViewState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C37992d fabScreenViewState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final LocalDate currentCalendarDate;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C0140r connectivityTileViewState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C13338l homeDialogViewState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final AbstractC36155b processNowViewState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final EnumC37944c homeTabGroupCenterConfig;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C32715a hideRecoveryViewState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final EnumC38451a displayCycleState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C18613a dayOneTransitionOverlayViewState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean shouldShowHomeTabs;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean makePermissionsCheck;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean isWeeklyPlanTileExpanded;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14605i streaksHomeViewState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC37356b showInAppReviewPrompt;

    public C13348v(boolean z4, boolean z13, EnumC13339m errorState, boolean z14, C1005b onboardingDomainState, C14599c c14599c, int i13, C17027b<CalendarDateModel> c17027b, InterfaceC25312u interfaceC25312u, C18614b toolbarViewState, C37992d c37992d, LocalDate currentCalendarDate, C0140r connectivityTileViewState, C13338l homeDialogViewState, AbstractC36155b abstractC36155b, EnumC37944c homeTabGroupCenterConfig, C32715a hideRecoveryViewState, EnumC38451a displayCycleState, C18613a c18613a, boolean z15, boolean z16, boolean z17, C14605i c14605i, AbstractC37356b showInAppReviewPrompt) {
        AbstractC22676k.m65750j(errorState, "errorState");
        AbstractC22676k.m65750j(onboardingDomainState, "onboardingDomainState");
        AbstractC22676k.m65750j(toolbarViewState, "toolbarViewState");
        AbstractC22676k.m65750j(currentCalendarDate, "currentCalendarDate");
        AbstractC22676k.m65750j(connectivityTileViewState, "connectivityTileViewState");
        AbstractC22676k.m65750j(homeDialogViewState, "homeDialogViewState");
        AbstractC22676k.m65750j(homeTabGroupCenterConfig, "homeTabGroupCenterConfig");
        AbstractC22676k.m65750j(hideRecoveryViewState, "hideRecoveryViewState");
        AbstractC22676k.m65750j(displayCycleState, "displayCycleState");
        AbstractC22676k.m65750j(showInAppReviewPrompt, "showInAppReviewPrompt");
        this.isLoading = z4;
        this.isUpdating = z13;
        this.errorState = errorState;
        this.isPullToRefresh = z14;
        this.onboardingDomainState = onboardingDomainState;
        this.homeFeed = c14599c;
        this.currentPageIndex = i13;
        this.calendarDomainState = c17027b;
        this.headerState = interfaceC25312u;
        this.toolbarViewState = toolbarViewState;
        this.fabScreenViewState = c37992d;
        this.currentCalendarDate = currentCalendarDate;
        this.connectivityTileViewState = connectivityTileViewState;
        this.homeDialogViewState = homeDialogViewState;
        this.processNowViewState = abstractC36155b;
        this.homeTabGroupCenterConfig = homeTabGroupCenterConfig;
        this.hideRecoveryViewState = hideRecoveryViewState;
        this.displayCycleState = displayCycleState;
        this.dayOneTransitionOverlayViewState = c18613a;
        this.shouldShowHomeTabs = z15;
        this.makePermissionsCheck = z16;
        this.isWeeklyPlanTileExpanded = z17;
        this.streaksHomeViewState = c14605i;
        this.showInAppReviewPrompt = showInAppReviewPrompt;
    }

    /* JADX INFO: renamed from: b */
    public final C17027b<CalendarDateModel> m37575b() {
        return this.calendarDomainState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getCurrentCalendarDate() {
        return this.currentCalendarDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18613a getDayOneTransitionOverlayViewState() {
        return this.dayOneTransitionOverlayViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13348v)) {
            return false;
        }
        C13348v c13348v = (C13348v) other;
        return this.isLoading == c13348v.isLoading && this.isUpdating == c13348v.isUpdating && this.errorState == c13348v.errorState && this.isPullToRefresh == c13348v.isPullToRefresh && AbstractC22676k.m65745e(this.onboardingDomainState, c13348v.onboardingDomainState) && AbstractC22676k.m65745e(this.homeFeed, c13348v.homeFeed) && this.currentPageIndex == c13348v.currentPageIndex && AbstractC22676k.m65745e(this.calendarDomainState, c13348v.calendarDomainState) && AbstractC22676k.m65745e(this.headerState, c13348v.headerState) && AbstractC22676k.m65745e(this.toolbarViewState, c13348v.toolbarViewState) && AbstractC22676k.m65745e(this.fabScreenViewState, c13348v.fabScreenViewState) && AbstractC22676k.m65745e(this.currentCalendarDate, c13348v.currentCalendarDate) && AbstractC22676k.m65745e(this.connectivityTileViewState, c13348v.connectivityTileViewState) && AbstractC22676k.m65745e(this.homeDialogViewState, c13348v.homeDialogViewState) && AbstractC22676k.m65745e(this.processNowViewState, c13348v.processNowViewState) && this.homeTabGroupCenterConfig == c13348v.homeTabGroupCenterConfig && AbstractC22676k.m65745e(this.hideRecoveryViewState, c13348v.hideRecoveryViewState) && this.displayCycleState == c13348v.displayCycleState && AbstractC22676k.m65745e(this.dayOneTransitionOverlayViewState, c13348v.dayOneTransitionOverlayViewState) && this.shouldShowHomeTabs == c13348v.shouldShowHomeTabs && this.makePermissionsCheck == c13348v.makePermissionsCheck && this.isWeeklyPlanTileExpanded == c13348v.isWeeklyPlanTileExpanded && AbstractC22676k.m65745e(this.streaksHomeViewState, c13348v.streaksHomeViewState) && AbstractC22676k.m65745e(this.showInAppReviewPrompt, c13348v.showInAppReviewPrompt);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC38451a getDisplayCycleState() {
        return this.displayCycleState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC13339m getErrorState() {
        return this.errorState;
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this.isLoading || this.isUpdating) {
            return ScreenState.LOADING;
        }
        return this.errorState == EnumC13339m.NONE ? ScreenState.SUCCESS : ScreenState.ERROR;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C37992d getFabScreenViewState() {
        return this.fabScreenViewState;
    }

    public int hashCode() {
        int iHashCode = (this.onboardingDomainState.hashCode() + AbstractC2875y.m8289b((this.errorState.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isUpdating)) * 31, 31, this.isPullToRefresh)) * 31;
        C14599c c14599c = this.homeFeed;
        int iM30448b = AbstractC11266d.m30448b(this.currentPageIndex, (iHashCode + (c14599c == null ? 0 : c14599c.hashCode())) * 31, 31);
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        int iHashCode2 = (iM30448b + (c17027b == null ? 0 : c17027b.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.headerState;
        int iHashCode3 = (this.toolbarViewState.hashCode() + ((iHashCode2 + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31)) * 31;
        C37992d c37992d = this.fabScreenViewState;
        int iHashCode4 = (this.homeDialogViewState.hashCode() + ((this.connectivityTileViewState.hashCode() + AbstractC13673n.m38558e(this.currentCalendarDate, (iHashCode3 + (c37992d == null ? 0 : c37992d.hashCode())) * 31, 31)) * 31)) * 31;
        AbstractC36155b abstractC36155b = this.processNowViewState;
        int iHashCode5 = (this.displayCycleState.hashCode() + ((this.hideRecoveryViewState.hashCode() + ((this.homeTabGroupCenterConfig.hashCode() + ((iHashCode4 + (abstractC36155b == null ? 0 : abstractC36155b.hashCode())) * 31)) * 31)) * 31)) * 31;
        C18613a c18613a = this.dayOneTransitionOverlayViewState;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode5 + (c18613a == null ? 0 : c18613a.hashCode())) * 31, 31, this.shouldShowHomeTabs), 31, this.makePermissionsCheck), 31, this.isWeeklyPlanTileExpanded);
        C14605i c14605i = this.streaksHomeViewState;
        return this.showInAppReviewPrompt.hashCode() + ((iM8289b + (c14605i != null ? c14605i.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC25312u getHeaderState() {
        return this.headerState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C32715a getHideRecoveryViewState() {
        return this.hideRecoveryViewState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C13338l getHomeDialogViewState() {
        return this.homeDialogViewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C14599c getHomeFeed() {
        return this.homeFeed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC37944c getHomeTabGroupCenterConfig() {
        return this.homeTabGroupCenterConfig;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getMakePermissionsCheck() {
        return this.makePermissionsCheck;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C1005b getOnboardingDomainState() {
        return this.onboardingDomainState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final AbstractC36155b getProcessNowViewState() {
        return this.processNowViewState;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShouldShowHomeTabs() {
        return this.shouldShowHomeTabs;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final AbstractC37356b getShowInAppReviewPrompt() {
        return this.showInAppReviewPrompt;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final C14605i getStreaksHomeViewState() {
        return this.streaksHomeViewState;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C18614b getToolbarViewState() {
        return this.toolbarViewState;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isUpdating;
        EnumC13339m enumC13339m = this.errorState;
        boolean z14 = this.isPullToRefresh;
        C1005b c1005b = this.onboardingDomainState;
        C14599c c14599c = this.homeFeed;
        int i13 = this.currentPageIndex;
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        InterfaceC25312u interfaceC25312u = this.headerState;
        C18614b c18614b = this.toolbarViewState;
        C37992d c37992d = this.fabScreenViewState;
        LocalDate localDate = this.currentCalendarDate;
        C0140r c0140r = this.connectivityTileViewState;
        C13338l c13338l = this.homeDialogViewState;
        AbstractC36155b abstractC36155b = this.processNowViewState;
        EnumC37944c enumC37944c = this.homeTabGroupCenterConfig;
        C32715a c32715a = this.hideRecoveryViewState;
        EnumC38451a enumC38451a = this.displayCycleState;
        C18613a c18613a = this.dayOneTransitionOverlayViewState;
        boolean z15 = this.shouldShowHomeTabs;
        boolean z16 = this.makePermissionsCheck;
        boolean z17 = this.isWeeklyPlanTileExpanded;
        C14605i c14605i = this.streaksHomeViewState;
        AbstractC37356b abstractC37356b = this.showInAppReviewPrompt;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("HomeViewState(isLoading=", ", isUpdating=", ", errorState=", z4, z13);
        sbM32002u.append(enumC13339m);
        sbM32002u.append(", isPullToRefresh=");
        sbM32002u.append(z14);
        sbM32002u.append(", onboardingDomainState=");
        sbM32002u.append(c1005b);
        sbM32002u.append(", homeFeed=");
        sbM32002u.append(c14599c);
        sbM32002u.append(", currentPageIndex=");
        sbM32002u.append(i13);
        sbM32002u.append(", calendarDomainState=");
        sbM32002u.append(c17027b);
        sbM32002u.append(", headerState=");
        sbM32002u.append(interfaceC25312u);
        sbM32002u.append(", toolbarViewState=");
        sbM32002u.append(c18614b);
        sbM32002u.append(", fabScreenViewState=");
        sbM32002u.append(c37992d);
        sbM32002u.append(", currentCalendarDate=");
        sbM32002u.append(localDate);
        sbM32002u.append(", connectivityTileViewState=");
        sbM32002u.append(c0140r);
        sbM32002u.append(", homeDialogViewState=");
        sbM32002u.append(c13338l);
        sbM32002u.append(", processNowViewState=");
        sbM32002u.append(abstractC36155b);
        sbM32002u.append(", homeTabGroupCenterConfig=");
        sbM32002u.append(enumC37944c);
        sbM32002u.append(", hideRecoveryViewState=");
        sbM32002u.append(c32715a);
        sbM32002u.append(", displayCycleState=");
        sbM32002u.append(enumC38451a);
        sbM32002u.append(", dayOneTransitionOverlayViewState=");
        sbM32002u.append(c18613a);
        sbM32002u.append(", shouldShowHomeTabs=");
        sbM32002u.append(z15);
        sbM32002u.append(", makePermissionsCheck=");
        AbstractC38963t7.m124392v(sbM32002u, z16, ", isWeeklyPlanTileExpanded=", z17, ", streaksHomeViewState=");
        sbM32002u.append(c14605i);
        sbM32002u.append(", showInAppReviewPrompt=");
        sbM32002u.append(abstractC37356b);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsPullToRefresh() {
        return this.isPullToRefresh;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsWeeklyPlanTileExpanded() {
        return this.isWeeklyPlanTileExpanded;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C13348v(boolean z4, boolean z13, EnumC13339m enumC13339m, boolean z14, C1005b c1005b, C14599c c14599c, int i13, C17027b c17027b, InterfaceC25312u interfaceC25312u, C18614b c18614b, C37992d c37992d, LocalDate localDate, C0140r c0140r, C13338l c13338l, AbstractC36155b abstractC36155b, EnumC37944c enumC37944c, C32715a c32715a, EnumC38451a enumC38451a, C18613a c18613a, boolean z15, boolean z16, boolean z17, C14605i c14605i, AbstractC37356b abstractC37356b, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        LocalDate localDateNow;
        boolean z18 = (i14 & 1) != 0 ? true : z4;
        boolean z19 = (i14 & 2) != 0 ? false : z13;
        EnumC13339m enumC13339m2 = (i14 & 4) != 0 ? EnumC13339m.NONE : enumC13339m;
        boolean z24 = (i14 & 8) != 0 ? false : z14;
        C1005b c1005b2 = (i14 & 16) != 0 ? new C1005b(false, false, 3, null) : c1005b;
        C14599c c14599c2 = (i14 & 32) != 0 ? null : c14599c;
        int i15 = (i14 & 64) != 0 ? 0 : i13;
        C17027b c17027b2 = (i14 & 128) != 0 ? null : c17027b;
        InterfaceC25312u interfaceC25312u2 = (i14 & 256) != 0 ? null : interfaceC25312u;
        C18614b c18614b2 = (i14 & 512) != 0 ? new C18614b(null, false, false, null, null, false, false, false, false, false, 1023, null) : c18614b;
        C37992d c37992d2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c37992d;
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            localDateNow = LocalDate.now();
            AbstractC22676k.m65749i(localDateNow, "now(...)");
        } else {
            localDateNow = localDate;
        }
        this(z18, z19, enumC13339m2, z24, c1005b2, c14599c2, i15, c17027b2, interfaceC25312u2, c18614b2, c37992d2, localDateNow, (i14 & 4096) != 0 ? new C0140r(null, null, null, null, false, null, null, null, false, null, null, null, null, false, 8191, null) : c0140r, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? new C13338l(false, null, null, null, null, null, null, false, null, null, false, false, null, false, 16383, null) : c13338l, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : abstractC36155b, (i14 & 32768) != 0 ? EnumC37944c.DYNAMIC : enumC37944c, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? new C32715a(false, false, false, 7, null) : c32715a, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? EnumC38451a.ADD_SLEEP : enumC38451a, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : c18613a, (i14 & 524288) != 0 ? true : z15, (i14 & 1048576) != 0 ? false : z16, (i14 & 2097152) == 0 ? z17 : false, (i14 & 4194304) == 0 ? c14605i : null, (i14 & 8388608) != 0 ? AbstractC37356b.a.f159779a : abstractC37356b);
    }
}
