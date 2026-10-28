package o92;

import android.content.Context;
import bc3.InterfaceC2994c0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.NotificationRepository;
import java.util.Arrays;
import java.util.Locale;
import m92.C25323f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29020i;
import p92.InterfaceC29015d;
import r80.AbstractC31061c;
import rr2.InterfaceC31766c;
import z82.C40191e;

/* JADX INFO: renamed from: o92.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lo92/q;", "Lp92/d;", "Lrr2/c;", "crashReporter", "Lz82/e;", "eventDispatcher", "Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lrr2/c;Lz82/e;Lcom/whoop/data/repositories/NotificationRepository;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "", "strainGoal", "Landroid/content/Context;", "context", "Lp92/i;", "realTimeStreamController", "Ll83/a0;", "a", "(DLandroid/content/Context;Lp92/i;)V", "Lz82/e;", "Lo92/s;", "b", "Lo92/s;", "pushContext", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27719q implements InterfaceC29015d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27721s pushContext;

    public C27719q(InterfaceC31766c crashReporter, C40191e eventDispatcher, NotificationRepository notificationRepository, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(notificationRepository, "notificationRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.eventDispatcher = eventDispatcher;
        this.pushContext = new C27721s(crashReporter, featureFlagChecker, notificationRepository, coroutineScope);
    }

    @Override // p92.InterfaceC29015d
    /* JADX INFO: renamed from: a */
    public void mo83778a(double strainGoal, Context context, C29020i realTimeStreamController) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(realTimeStreamController, "realTimeStreamController");
        new C27718p(this.pushContext, this.eventDispatcher, realTimeStreamController).mo24524a(new C25323f(AbstractC31061c.m95645u("optimalKey", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(strainGoal)}, 1)))), context);
    }
}
