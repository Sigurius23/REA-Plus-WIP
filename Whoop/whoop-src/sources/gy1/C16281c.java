package gy1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.metrics.common.ScreenState;
import iy1.InterfaceC21030c;
import java.util.Locale;
import jy1.C22047a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gy1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lgy1/c;", "", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Liy1/c;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ljy1/a;", "metric", "Ll83/a0;", "a", "(Ljy1/a;Lq83/d;)Ljava/lang/Object;", "", "screenStateTag", "Lcom/whoop/metrics/common/ScreenState;", "screenState", "d", "(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;Lq83/d;)Ljava/lang/Object;", "screenTag", "", "durationNanos", "transitionType", "c", "(Ljava/lang/String;JLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "b", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "Liy1/c;", "getMetricWriter", "()Liy1/c;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16281c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C16281c(InterfaceC21030c metricWriter, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.metricWriter = metricWriter;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final Object m46097a(C22047a c22047a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a;
        return (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.MOBILE_SCREEN_ERROR_OBSERVABILITY) && (objMo58700a = this.metricWriter.mo58700a(c22047a, interfaceC30057d)) == EnumC31071a.f128113w) ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m46098b(String str, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "feature.screen.first_visible.histogram", new Double(j7), AbstractC31061c.m95644t("screen:", str), null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m46099c(String str, long j7, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM46097a = m46097a(new C22047a(0, "feature.screen.histogram", new Double(j7), AbstractC37056f.m118959K(AbstractC11266d.m30461o("screen:", str), AbstractC11266d.m30461o("transition_type:", str2)), null, 17, null), interfaceC30057d);
        return objM46097a == EnumC31071a.f128113w ? objM46097a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m46100d(String str, ScreenState screenState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String strM30461o = AbstractC11266d.m30461o("screen:", str);
        String lowerCase = screenState.name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        Object objM46097a = m46097a(new C22047a(0, "feature.screen", null, AbstractC37056f.m118959K(strM30461o, "state:".concat(lowerCase)), null, 21, null), interfaceC30057d);
        return objM46097a == EnumC31071a.f128113w ? objM46097a : C23454a0.f92919a;
    }
}
