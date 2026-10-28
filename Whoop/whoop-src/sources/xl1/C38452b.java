package xl1;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import java.time.LocalDate;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: xl1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, m65681d2 = {"Lxl1/b;", "", "Lu92/d;", "sharedPreferences", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lu92/d;Lzr2/a;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "isJournalEnabled", "Ljava/time/LocalDate;", "requestDate", "", "cycleId", "memberCompletedJournalAlready", "Lxl1/a;", "displayCycleState", "autoPopJournal", "hasEnoughRecoveries", "Lxl1/c;", "a", "(ZLjava/time/LocalDate;JZLxl1/a;ZZ)Lxl1/c;", "Lu92/d;", "b", "Lzr2/a;", "c", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "e", "Ltr2/n;", "logger", "f", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38452b {

    /* JADX INFO: renamed from: g */
    public static final int f164646g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final OnboardingStatusChecker onboardingStatusChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C38452b(C34660d sharedPreferences, InterfaceC41070a dateAndTimeProvider, OnboardingStatusChecker onboardingStatusChecker, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onboardingStatusChecker, "onboardingStatusChecker");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.sharedPreferences = sharedPreferences;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.onboardingStatusChecker = onboardingStatusChecker;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("JournalDomainInteractor");
    }

    /* JADX INFO: renamed from: a */
    public final C38453c m123206a(boolean isJournalEnabled, LocalDate requestDate, long cycleId, boolean memberCompletedJournalAlready, EnumC38451a displayCycleState, boolean autoPopJournal, boolean hasEnoughRecoveries) {
        AbstractC22676k.m65750j(requestDate, "requestDate");
        AbstractC22676k.m65750j(displayCycleState, "displayCycleState");
        org.joda.time.LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        LocalDate.of(localDateMo133365d.getYear(), localDateMo133365d.getMonthOfYear(), localDateMo133365d.getDayOfMonth());
        long jM109532i = this.sharedPreferences.m109532i(SharedPreferenceConstants.KEY_HAS_JOURNAL_BEEN_SEEN_FOR_TODAY, -1L);
        boolean z4 = jM109532i == cycleId;
        this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PREVENT_JOURNAL_AUTOPOP_RECOVERY_COUNT);
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("autoPop: shouldAutoPop: ", ", haveAlreadyAutoPopped: ", ", today cycleId: ", autoPopJournal, z4);
        sbM32002u.append(cycleId);
        sbM32002u.append(", lastJournalPopCycleId: ");
        sbM32002u.append(jM109532i);
        interfaceC34116n.mo85228t(sbM32002u.toString(), new AbstractC30556a.a[0]);
        return new C38453c(autoPopJournal && !z4, this.onboardingStatusChecker.shouldGoToFeatureEducation(FeatureEducationType.CUSTOMIZE_JOURNAL));
    }
}
