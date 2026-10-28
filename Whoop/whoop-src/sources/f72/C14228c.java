package f72;

import com.whoop.data.repositories.FeatureFlagChecker;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import or2.AbstractC28152c1;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: f72.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lf72/c;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lzr2/a;", "dateAndTimeProvider", "Lorg/joda/time/LocalDate;", "localDate", "<init>", "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;Lorg/joda/time/LocalDate;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lzr2/a;", "d", "Lorg/joda/time/LocalDate;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14228c implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalDate localDate;

    public C14228c(C21147i0 navDeepLinkRequestHelper, FeatureFlagChecker featureFlagChecker, InterfaceC41070a dateAndTimeProvider, LocalDate localDate) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(localDate, "localDate");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.featureFlagChecker = featureFlagChecker;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.localDate = localDate;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        String strConcat;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.e4) || !this.featureFlagChecker.isFeatureEnabled("sage-feature")) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.e4 e4Var = (AbstractC21155m0.e4) navigationScreen;
        String str = e4Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        if (str == null || (strConcat = "android-app://com.whoop/sage?date=".concat(str)) == null) {
            strConcat = "android-app://com.whoop/sage?date=" + this.localDate;
        }
        String source = e4Var.getSource();
        if (source != null) {
            strConcat = ((Object) strConcat) + "&source=" + source;
        }
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(strConcat), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation")), null, 4, null);
    }

    public /* synthetic */ C14228c(C21147i0 c21147i0, FeatureFlagChecker featureFlagChecker, InterfaceC41070a interfaceC41070a, LocalDate localDate, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, featureFlagChecker, interfaceC41070a, (i13 & 8) != 0 ? interfaceC41070a.mo133365d() : localDate);
    }
}
