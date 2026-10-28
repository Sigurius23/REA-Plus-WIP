package nj2;

import a11.C0140r;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ep0.C13404j;
import h51.C16934f;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import k51.C22204c;
import k71.C22245c0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import s01.C32048d;
import v31.C35611g;

/* JADX INFO: renamed from: nj2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0018\u00010!j\u0004\u0018\u0001`#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bA\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bR\u0010Q\u001a\u0004\bT\u0010SR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bJ\u0010SR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b;\u0010XR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bV\u0010[R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bU\u0010^R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010N\u001a\u0004\bY\u0010PR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bO\u0010c\u001a\u0004\b?\u0010dR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bC\u0010gR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0018\u00010!j\u0004\u0018\u0001`#8\u0006¢\u0006\f\n\u0004\ba\u0010h\u001a\u0004\b7\u0010iR\u0019\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010N\u001a\u0004\bj\u0010PR\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bL\u0010k\u001a\u0004\be\u0010lR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bj\u0010m\u001a\u0004\b_\u0010nR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b9\u0010o\u001a\u0004\b\\\u0010p¨\u0006q"}, m65681d2 = {"Lnj2/p;", "", "", "isLoading", "Lnj2/m;", "error", "Lnj2/a;", "education", "Lnj2/n;", "meterState", "Lk51/c;", "vowCoachingCard", "Ls01/d;", "whoopCoachVowViewState", "Lk71/c0;", "stressGraphingCardState", "Lh51/f;", "onboardingCarouselState", "sessionsCarouselModel", "educationCarouselModel", "Lcom/whoop/design/util/TextResource;", "calibrationText", "Lnj2/e;", "pendingActivityDialogueState", "Lnj2/d;", "onboardingDismissDialogueState", "previousStressGraphingCardState", "Lnj2/y;", "trendState", "La11/r;", "connectivityTileViewState", "Lnj2/f;", "dateSelectorState", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "zoomedOutGraphingCardState", "", "trendListState", "Lv31/g;", "stepperComponentState", "Lep0/j;", "screenContextMetadata", "<init>", "(ZLnj2/m;Lnj2/a;Lnj2/n;Lk51/c;Ls01/d;Lk71/c0;Lh51/f;Lh51/f;Lh51/f;Lcom/whoop/design/util/TextResource;Lnj2/e;Lnj2/d;Lk71/c0;Lnj2/y;La11/r;Lnj2/f;Lh91/b;Lk71/c0;Ljava/util/List;Lv31/g;Lep0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "v", "()Z", "b", "Lnj2/m;", "g", "()Lnj2/m;", "c", "Lnj2/a;", "e", "()Lnj2/a;", "d", "Lnj2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lnj2/n;", "Lk51/c;", "s", "()Lk51/c;", "f", "Ls01/d;", "t", "()Ls01/d;", "Lk71/c0;", "p", "()Lk71/c0;", "Lh51/f;", "i", "()Lh51/f;", "n", "j", "k", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "l", "Lnj2/e;", "()Lnj2/e;", "m", "Lnj2/d;", "()Lnj2/d;", "o", "Lnj2/y;", "r", "()Lnj2/y;", "La11/r;", "()La11/r;", "q", "Lnj2/f;", "()Lnj2/f;", "Lh91/b;", "()Lh91/b;", "u", "Ljava/util/List;", "()Ljava/util/List;", "Lv31/g;", "()Lv31/g;", "Lep0/j;", "()Lep0/j;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26769p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC26766m error;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C26754a education;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C26767n meterState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22204c vowCoachingCard;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C32048d whoopCoachVowViewState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C22245c0 stressGraphingCardState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C16934f onboardingCarouselState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C16934f sessionsCarouselModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C16934f educationCarouselModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource calibrationText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C26758e pendingActivityDialogueState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C26757d onboardingDismissDialogueState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C22245c0 previousStressGraphingCardState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C26778y trendState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C0140r connectivityTileViewState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C26759f dateSelectorState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C17027b<CalendarDateModel> calendarDomainState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C22245c0 zoomedOutGraphingCardState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final List<C26778y> trendListState;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C35611g stepperComponentState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    public C26769p(boolean z4, EnumC26766m enumC26766m, C26754a education, C26767n meterState, C22204c c22204c, C32048d c32048d, C22245c0 c22245c0, C16934f c16934f, C16934f c16934f2, C16934f c16934f3, TextResource calibrationText, C26758e c26758e, C26757d c26757d, C22245c0 c22245c1, C26778y c26778y, C0140r c0140r, C26759f c26759f, C17027b<CalendarDateModel> c17027b, C22245c0 c22245c2, List<C26778y> list, C35611g c35611g, C13404j c13404j) {
        AbstractC22676k.m65750j(education, "education");
        AbstractC22676k.m65750j(meterState, "meterState");
        AbstractC22676k.m65750j(calibrationText, "calibrationText");
        this.isLoading = z4;
        this.error = enumC26766m;
        this.education = education;
        this.meterState = meterState;
        this.vowCoachingCard = c22204c;
        this.whoopCoachVowViewState = c32048d;
        this.stressGraphingCardState = c22245c0;
        this.onboardingCarouselState = c16934f;
        this.sessionsCarouselModel = c16934f2;
        this.educationCarouselModel = c16934f3;
        this.calibrationText = calibrationText;
        this.pendingActivityDialogueState = c26758e;
        this.onboardingDismissDialogueState = c26757d;
        this.previousStressGraphingCardState = c22245c1;
        this.trendState = c26778y;
        this.connectivityTileViewState = c0140r;
        this.dateSelectorState = c26759f;
        this.calendarDomainState = c17027b;
        this.zoomedOutGraphingCardState = c22245c2;
        this.trendListState = list;
        this.stepperComponentState = c35611g;
        this.screenContextMetadata = c13404j;
    }

    /* JADX INFO: renamed from: a */
    public final C17027b<CalendarDateModel> m79741a() {
        return this.calendarDomainState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCalibrationText() {
        return this.calibrationText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C0140r getConnectivityTileViewState() {
        return this.connectivityTileViewState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C26759f getDateSelectorState() {
        return this.dateSelectorState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C26754a getEducation() {
        return this.education;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26769p)) {
            return false;
        }
        C26769p c26769p = (C26769p) other;
        return this.isLoading == c26769p.isLoading && this.error == c26769p.error && AbstractC22676k.m65745e(this.education, c26769p.education) && AbstractC22676k.m65745e(this.meterState, c26769p.meterState) && AbstractC22676k.m65745e(this.vowCoachingCard, c26769p.vowCoachingCard) && AbstractC22676k.m65745e(this.whoopCoachVowViewState, c26769p.whoopCoachVowViewState) && AbstractC22676k.m65745e(this.stressGraphingCardState, c26769p.stressGraphingCardState) && AbstractC22676k.m65745e(this.onboardingCarouselState, c26769p.onboardingCarouselState) && AbstractC22676k.m65745e(this.sessionsCarouselModel, c26769p.sessionsCarouselModel) && AbstractC22676k.m65745e(this.educationCarouselModel, c26769p.educationCarouselModel) && AbstractC22676k.m65745e(this.calibrationText, c26769p.calibrationText) && AbstractC22676k.m65745e(this.pendingActivityDialogueState, c26769p.pendingActivityDialogueState) && AbstractC22676k.m65745e(this.onboardingDismissDialogueState, c26769p.onboardingDismissDialogueState) && AbstractC22676k.m65745e(this.previousStressGraphingCardState, c26769p.previousStressGraphingCardState) && AbstractC22676k.m65745e(this.trendState, c26769p.trendState) && AbstractC22676k.m65745e(this.connectivityTileViewState, c26769p.connectivityTileViewState) && AbstractC22676k.m65745e(this.dateSelectorState, c26769p.dateSelectorState) && AbstractC22676k.m65745e(this.calendarDomainState, c26769p.calendarDomainState) && AbstractC22676k.m65745e(this.zoomedOutGraphingCardState, c26769p.zoomedOutGraphingCardState) && AbstractC22676k.m65745e(this.trendListState, c26769p.trendListState) && AbstractC22676k.m65745e(this.stepperComponentState, c26769p.stepperComponentState) && AbstractC22676k.m65745e(this.screenContextMetadata, c26769p.screenContextMetadata);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C16934f getEducationCarouselModel() {
        return this.educationCarouselModel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC26766m getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C26767n getMeterState() {
        return this.meterState;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        EnumC26766m enumC26766m = this.error;
        int iHashCode2 = (this.meterState.hashCode() + ((this.education.hashCode() + ((iHashCode + (enumC26766m == null ? 0 : enumC26766m.hashCode())) * 31)) * 31)) * 31;
        C22204c c22204c = this.vowCoachingCard;
        int iHashCode3 = (iHashCode2 + (c22204c == null ? 0 : c22204c.hashCode())) * 31;
        C32048d c32048d = this.whoopCoachVowViewState;
        int iHashCode4 = (iHashCode3 + (c32048d == null ? 0 : c32048d.hashCode())) * 31;
        C22245c0 c22245c0 = this.stressGraphingCardState;
        int iHashCode5 = (iHashCode4 + (c22245c0 == null ? 0 : c22245c0.hashCode())) * 31;
        C16934f c16934f = this.onboardingCarouselState;
        int iHashCode6 = (iHashCode5 + (c16934f == null ? 0 : c16934f.hashCode())) * 31;
        C16934f c16934f2 = this.sessionsCarouselModel;
        int iHashCode7 = (iHashCode6 + (c16934f2 == null ? 0 : c16934f2.hashCode())) * 31;
        C16934f c16934f3 = this.educationCarouselModel;
        int iM95625a = AbstractC31061c.m95625a((iHashCode7 + (c16934f3 == null ? 0 : c16934f3.hashCode())) * 31, this.calibrationText, 31);
        C26758e c26758e = this.pendingActivityDialogueState;
        int iHashCode8 = (iM95625a + (c26758e == null ? 0 : c26758e.hashCode())) * 31;
        C26757d c26757d = this.onboardingDismissDialogueState;
        int iHashCode9 = (iHashCode8 + (c26757d == null ? 0 : c26757d.hashCode())) * 31;
        C22245c0 c22245c1 = this.previousStressGraphingCardState;
        int iHashCode10 = (iHashCode9 + (c22245c1 == null ? 0 : c22245c1.hashCode())) * 31;
        C26778y c26778y = this.trendState;
        int iHashCode11 = (iHashCode10 + (c26778y == null ? 0 : c26778y.hashCode())) * 31;
        C0140r c0140r = this.connectivityTileViewState;
        int iHashCode12 = (iHashCode11 + (c0140r == null ? 0 : c0140r.hashCode())) * 31;
        C26759f c26759f = this.dateSelectorState;
        int iHashCode13 = (iHashCode12 + (c26759f == null ? 0 : c26759f.hashCode())) * 31;
        C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
        int iHashCode14 = (iHashCode13 + (c17027b == null ? 0 : c17027b.hashCode())) * 31;
        C22245c0 c22245c2 = this.zoomedOutGraphingCardState;
        int iHashCode15 = (iHashCode14 + (c22245c2 == null ? 0 : c22245c2.hashCode())) * 31;
        List<C26778y> list = this.trendListState;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        C35611g c35611g = this.stepperComponentState;
        int iHashCode17 = (iHashCode16 + (c35611g == null ? 0 : c35611g.hashCode())) * 31;
        C13404j c13404j = this.screenContextMetadata;
        return iHashCode17 + (c13404j != null ? c13404j.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C16934f getOnboardingCarouselState() {
        return this.onboardingCarouselState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C26757d getOnboardingDismissDialogueState() {
        return this.onboardingDismissDialogueState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C26758e getPendingActivityDialogueState() {
        return this.pendingActivityDialogueState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C22245c0 getPreviousStressGraphingCardState() {
        return this.previousStressGraphingCardState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C16934f getSessionsCarouselModel() {
        return this.sessionsCarouselModel;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C35611g getStepperComponentState() {
        return this.stepperComponentState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C22245c0 getStressGraphingCardState() {
        return this.stressGraphingCardState;
    }

    /* JADX INFO: renamed from: q */
    public final List<C26778y> m79757q() {
        return this.trendListState;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C26778y getTrendState() {
        return this.trendState;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final C22204c getVowCoachingCard() {
        return this.vowCoachingCard;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final C32048d getWhoopCoachVowViewState() {
        return this.whoopCoachVowViewState;
    }

    public String toString() {
        return "StressMonitorViewState(isLoading=" + this.isLoading + ", error=" + this.error + ", education=" + this.education + ", meterState=" + this.meterState + ", vowCoachingCard=" + this.vowCoachingCard + ", whoopCoachVowViewState=" + this.whoopCoachVowViewState + ", stressGraphingCardState=" + this.stressGraphingCardState + ", onboardingCarouselState=" + this.onboardingCarouselState + ", sessionsCarouselModel=" + this.sessionsCarouselModel + ", educationCarouselModel=" + this.educationCarouselModel + ", calibrationText=" + this.calibrationText + ", pendingActivityDialogueState=" + this.pendingActivityDialogueState + ", onboardingDismissDialogueState=" + this.onboardingDismissDialogueState + ", previousStressGraphingCardState=" + this.previousStressGraphingCardState + ", trendState=" + this.trendState + ", connectivityTileViewState=" + this.connectivityTileViewState + ", dateSelectorState=" + this.dateSelectorState + ", calendarDomainState=" + this.calendarDomainState + ", zoomedOutGraphingCardState=" + this.zoomedOutGraphingCardState + ", trendListState=" + this.trendListState + ", stepperComponentState=" + this.stepperComponentState + ", screenContextMetadata=" + this.screenContextMetadata + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final C22245c0 getZoomedOutGraphingCardState() {
        return this.zoomedOutGraphingCardState;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public /* synthetic */ C26769p(boolean z4, EnumC26766m enumC26766m, C26754a c26754a, C26767n c26767n, C22204c c22204c, C32048d c32048d, C22245c0 c22245c0, C16934f c16934f, C16934f c16934f2, C16934f c16934f3, TextResource textResource, C26758e c26758e, C26757d c26757d, C22245c0 c22245c1, C26778y c26778y, C0140r c0140r, C26759f c26759f, C17027b c17027b, C22245c0 c22245c2, List list, C35611g c35611g, C13404j c13404j, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : enumC26766m, (i13 & 4) != 0 ? new C26754a(null, null, 3, null) : c26754a, (i13 & 8) != 0 ? C26767n.INSTANCE.m79740a() : c26767n, (i13 & 16) != 0 ? null : c22204c, (i13 & 32) != 0 ? null : c32048d, (i13 & 64) != 0 ? null : c22245c0, (i13 & 128) != 0 ? null : c16934f, (i13 & 256) != 0 ? null : c16934f2, (i13 & 512) != 0 ? null : c16934f3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c26758e, (i13 & 4096) != 0 ? null : c26757d, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c22245c1, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c26778y, (i13 & 32768) != 0 ? null : c0140r, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : c26759f, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : c17027b, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : c22245c2, (i13 & 524288) != 0 ? null : list, (i13 & 1048576) != 0 ? null : c35611g, (i13 & 2097152) != 0 ? null : c13404j);
    }
}
