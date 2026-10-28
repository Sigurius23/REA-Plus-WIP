package yr1;

import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: yr1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001e\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\r¢\u0006\u0004\b#\u0010\u001bJ)\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010!J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b-\u0010+J\r\u0010.\u001a\u00020\u0010¢\u0006\u0004\b.\u0010!J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010!J)\u00103\u001a\u00020\u00102\f\u00101\u001a\b\u0012\u0004\u0012\u00020\n002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n00¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0010¢\u0006\u0004\b5\u0010!J\u0015\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b7\u0010+J\u0015\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b9\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010;R\"\u0010=\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u001b¨\u0006@"}, m65681d2 = {"Lyr1/a;", "", "Lfi0/a;", "analyticsManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lfi0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "requestDate", "", "numberOfBehaviors", "numberOfToggles", "", "isIntraday", "usePreviousAnswersAvailable", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;IIZZ)V", "source", "label", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V", "isAutoPop", "c", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V", "i", "(Z)V", "defaultsOn", "notes", "o", "(Ljava/lang/String;ZZIIZZ)V", "d", "()V", "didDismiss", "e", "Lyr1/b;", "navType", HttpHeaders.DATE, "userHasJournalAnswersForTheDay", "f", "(Lyr1/b;Ljava/lang/String;Ljava/lang/Boolean;)V", "m", "(Ljava/lang/String;)V", "l", "b", "k", "p", "", "lastSelectedToggleIds", "savedBehaviors", "n", "(Ljava/util/List;Ljava/util/List;)V", "a", "customBehaviorId", "r", "searchQuery", "q", "Lfi0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Z", "isEditingJournal", "()Z", "setEditingJournal", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39730a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analyticsManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isEditingJournal;

    /* JADX INFO: renamed from: yr1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171067a;

        static {
            int[] iArr = new int[EnumC39731b.values().length];
            try {
                iArr[EnumC39731b.BACK_ARROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39731b.FORWARD_ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39731b.DATE_SELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC39731b.CAROUSEL_DATE_SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f171067a = iArr;
        }
    }

    public C39730a(InterfaceC14515a analyticsManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.analyticsManager = analyticsManager;
        this.featureFlagChecker = featureFlagChecker;
        this.isEditingJournal = true;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m127122g(C39730a c39730a, EnumC39731b enumC39731b, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            bool = null;
        }
        c39730a.m127130f(enumC39731b, str, bool);
    }

    /* JADX INFO: renamed from: h */
    private final void m127123h(String requestDate, int numberOfBehaviors, int numberOfToggles, boolean isIntraday, boolean usePreviousAnswersAvailable) {
        this.analyticsManager.mo41428k("Recording Data", "Open", null, "Journal - Open (Auto)", AbstractC25247g0.m73990Y(new C23465k("value", Integer.valueOf(AbstractC39732c.m127140a(requestDate))), new C23465k("source", "Auto-Pop"), new C23465k("Intraday", Boolean.valueOf(isIntraday)), new C23465k("Number of behaviors", Integer.valueOf(numberOfBehaviors)), new C23465k("Number of toggles", Integer.valueOf(numberOfToggles)), new C23465k("Prefilled Count", 0), new C23465k("Use Previous Answers", usePreviousAnswersAvailable ? "Available" : "Unavailable")));
    }

    /* JADX INFO: renamed from: j */
    private final void m127124j(String requestDate, String source, String label, int numberOfBehaviors, int numberOfToggles, boolean isIntraday, boolean usePreviousAnswersAvailable) {
        Map<String, ? extends Object> mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("value", Integer.valueOf(AbstractC39732c.m127140a(requestDate))), new C23465k("source", source), new C23465k("Intraday", Boolean.valueOf(isIntraday)), new C23465k("Number of behaviors", Integer.valueOf(numberOfBehaviors)), new C23465k("Number of toggles", Integer.valueOf(numberOfToggles)), new C23465k("Prefilled Count", 0), new C23465k("Use Previous Answers", usePreviousAnswersAvailable ? "Available" : "Unavailable"));
        InterfaceC14515a interfaceC14515a = this.analyticsManager;
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) && !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
            label = null;
        }
        interfaceC14515a.mo41428k("Recording Data", "Open", label, "Journal - Open (Manual)", mapM73990Y);
    }

    /* JADX INFO: renamed from: a */
    public final void m127125a() {
        this.analyticsManager.mo41424f("Customize Journal Behaviors", "Close", "Close", "Journal");
    }

    /* JADX INFO: renamed from: b */
    public final void m127126b(String requestDate) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        InterfaceC14515a.m41418i(this.analyticsManager, null, "Pressed Return to Today", null, "Journal - Navigation", requestDate, null, 37, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m127127c(boolean isAutoPop, String requestDate, String source, String label, int numberOfBehaviors, int numberOfToggles, boolean isIntraday, boolean usePreviousAnswersAvailable) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        AbstractC22676k.m65750j(source, "source");
        if (isAutoPop) {
            m127123h(requestDate, numberOfBehaviors, numberOfToggles, isIntraday, usePreviousAnswersAvailable);
        } else {
            m127124j(requestDate, source, label, numberOfBehaviors, numberOfToggles, isIntraday, usePreviousAnswersAvailable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m127128d() {
        this.analyticsManager.mo41428k("Recording Data", null, null, "Journal - Dismiss", AbstractC36095b.m114688p(Boolean.valueOf(this.isEditingJournal), "Editing"));
    }

    /* JADX INFO: renamed from: e */
    public final void m127129e(boolean didDismiss) {
        this.analyticsManager.mo41428k("Recording Data", didDismiss ? "Confirm Dismiss" : "Don't Dismiss", null, "Journal - Dismiss Confirmation", AbstractC36095b.m114688p(Boolean.valueOf(this.isEditingJournal), "Editing"));
    }

    /* JADX INFO: renamed from: f */
    public final void m127130f(EnumC39731b navType, String date, Boolean userHasJournalAnswersForTheDay) {
        String str;
        AbstractC22676k.m65750j(navType, "navType");
        AbstractC22676k.m65750j(date, "date");
        int i13 = a.f171067a[navType.ordinal()];
        if (i13 == 1) {
            str = "Press Previous Date";
        } else if (i13 == 2) {
            str = "Press Next Date";
        } else if (i13 == 3) {
            str = "Select Calendar Date";
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "Clicked Carousel Date";
        }
        InterfaceC14515a.m41418i(this.analyticsManager, "Recording Data", str, null, "Journal - Navigation", (navType == EnumC39731b.DATE_SELECTION || navType == EnumC39731b.CAROUSEL_DATE_SELECTION) ? date : null, userHasJournalAnswersForTheDay != null ? AbstractC36095b.m114688p(userHasJournalAnswersForTheDay, "Has Logged Behaviors") : null, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m127131i(boolean isAutoPop) {
        this.analyticsManager.mo41424f("Recording Data", "Load Failure", null, isAutoPop ? "Journal - Open (Auto)" : "Journal - Open (Manual)");
    }

    /* JADX INFO: renamed from: k */
    public final void m127132k() {
        InterfaceC14515a.m41418i(this.analyticsManager, "Customize Journal Behaviors", "View", null, "Journal", null, AbstractC31061c.m95645u("source", "Journal"), 20, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m127133l() {
        InterfaceC14515a.m41418i(this.analyticsManager, "Journal", null, null, "Insights Button Pressed", null, null, 54, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m127134m(String source) {
        InterfaceC14515a.m41418i(this.analyticsManager, "Recording Data", "View Calendar Date Selector", null, "Journal - Navigation", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 20, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m127135n(List<Integer> lastSelectedToggleIds, List<Integer> savedBehaviors) {
        AbstractC22676k.m65750j(lastSelectedToggleIds, "lastSelectedToggleIds");
        AbstractC22676k.m65750j(savedBehaviors, "savedBehaviors");
        List<Integer> list = savedBehaviors;
        List<Integer> list2 = lastSelectedToggleIds;
        this.analyticsManager.mo41428k("Customize Journal Behaviors", "Close", "Save Behaviors", "Journal", AbstractC25247g0.m73990Y(new C23465k("Behaviors Added", Integer.valueOf(AbstractC12350b.m34605z(AbstractC25265s.m74103I1(list), AbstractC25265s.m74103I1(list2)).size())), new C23465k("Behaviors Removed", Integer.valueOf(AbstractC12350b.m34605z(AbstractC25265s.m74103I1(list2), AbstractC25265s.m74103I1(list)).size()))));
    }

    /* JADX INFO: renamed from: o */
    public final void m127136o(String requestDate, boolean defaultsOn, boolean notes, int numberOfBehaviors, int numberOfToggles, boolean isIntraday, boolean usePreviousAnswersAvailable) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        this.analyticsManager.mo41428k("Recording Data", "Save", null, "Journal - Save", AbstractC25247g0.m73990Y(new C23465k("value", Integer.valueOf(AbstractC39732c.m127140a(requestDate))), new C23465k("source", ""), new C23465k("Defaults on?", Boolean.valueOf(defaultsOn)), new C23465k("Editing", Boolean.valueOf(this.isEditingJournal)), new C23465k("Notes?", Boolean.valueOf(notes)), new C23465k("Number of behaviors", Integer.valueOf(numberOfBehaviors)), new C23465k("Number of toggles", Integer.valueOf(numberOfToggles)), new C23465k("Prefilled Count", 0), new C23465k("Intraday", Boolean.valueOf(isIntraday)), new C23465k("Use Previous Answers", usePreviousAnswersAvailable ? "Available" : "Unavailable")));
    }

    /* JADX INFO: renamed from: p */
    public final void m127137p() {
        this.analyticsManager.mo41424f("Customize Journal Behaviors", "Tap", "Search Started", "Journal");
    }

    /* JADX INFO: renamed from: q */
    public final void m127138q(String searchQuery) {
        AbstractC22676k.m65750j(searchQuery, "searchQuery");
        this.analyticsManager.mo41428k("Customize Journal Behaviors", "Tap", "Behavior Selected", "Journal", AbstractC36095b.m114688p(Boolean.valueOf(searchQuery.length() > 0), "From Search"));
    }

    /* JADX INFO: renamed from: r */
    public final void m127139r(String customBehaviorId) {
        AbstractC22676k.m65750j(customBehaviorId, "customBehaviorId");
        InterfaceC14515a.m41418i(this.analyticsManager, "journal", "stop_tracking_custom_behavior", null, "Customize Journal screen", customBehaviorId, null, 36, null);
    }
}
