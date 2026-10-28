package uy1;

import c41.C4092p2;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import gz0.C16317o0;
import gz0.EnumC16313m0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p743vy1.AbstractC36602d;
import p745y81.C39336i;
import py1.AbstractC29625d;
import x81.C38072d;

/* JADX INFO: renamed from: uy1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Luy1/f;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Luy1/b;", "domainState", "Lvy1/d;", "a", "(Luy1/b;)Lvy1/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35382f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: uy1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f150769w = new a();

        /* JADX INFO: renamed from: a */
        public final long m112307a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlertTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112307a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: uy1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f150770w = new b();

        /* JADX INFO: renamed from: a */
        public final long m112308a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m112308a((C39336i) obj));
        }
    }

    public C35382f(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC36602d m112306a(C35378b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (!domainState.getIsVisible()) {
            return AbstractC36602d.a.f156795a;
        }
        boolean z4 = domainState.getMethodType() == EnumC35383g.EMAIL;
        boolean z13 = domainState.getRequirementReason() == EnumC35384h.CMS_ACCESS || this.featureFlagChecker.isFeatureEnabled("mobile-mfa-disable-turn-off-mfa");
        C16317o0 c16317o0M121951d = C38072d.f163053a.m121951d();
        return new AbstractC36602d.b(z4 ? c16317o0M121951d.getAction().getEmail() : c16317o0M121951d.getVarious().getPhone(), AbstractC8693b.m21277k(z4 ? AbstractC29625d.f121008v : AbstractC29625d.f121009w), domainState.getMethod(), 0, domainState.getEnabled(), z13 ? domainState.getCanDisable() : true, AbstractC29625d.f120983N, domainState.getDisablingError() ? new C4092p2(EnumC16313m0.TINY_ATTENTION, 0.0f, null, null, AbstractC8693b.m21277k(AbstractC29625d.f121007u), null, p745y81.Function1.m125323a(a.f150769w), null, p745y81.Function1.m125323a(b.f150770w), null, null, null, null, false, null, null, null, null, null, null, 1048238, null) : null, domainState.getMethodType(), 8, null);
    }
}
