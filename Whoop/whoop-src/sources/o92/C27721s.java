package o92;

import bc3.InterfaceC2994c0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.NotificationRepository;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.InterfaceC31766c;

/* JADX INFO: renamed from: o92.s */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lo92/s;", "", "Lrr2/c;", "crashReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Lbc3/c0;", "scope", "<init>", "(Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/NotificationRepository;Lbc3/c0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrr2/c;", "()Lrr2/c;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lcom/whoop/data/repositories/NotificationRepository;", "()Lcom/whoop/data/repositories/NotificationRepository;", "d", "Lbc3/c0;", "()Lbc3/c0;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27721s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final NotificationRepository notificationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    public C27721s(InterfaceC31766c crashReporter, FeatureFlagChecker featureFlagChecker, NotificationRepository notificationRepository, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(notificationRepository, "notificationRepository");
        AbstractC22676k.m65750j(scope, "scope");
        this.crashReporter = crashReporter;
        this.featureFlagChecker = featureFlagChecker;
        this.notificationRepository = notificationRepository;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC31766c getCrashReporter() {
        return this.crashReporter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FeatureFlagChecker getFeatureFlagChecker() {
        return this.featureFlagChecker;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final NotificationRepository getNotificationRepository() {
        return this.notificationRepository;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC2994c0 getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27721s)) {
            return false;
        }
        C27721s c27721s = (C27721s) other;
        return AbstractC22676k.m65745e(this.crashReporter, c27721s.crashReporter) && AbstractC22676k.m65745e(this.featureFlagChecker, c27721s.featureFlagChecker) && AbstractC22676k.m65745e(this.notificationRepository, c27721s.notificationRepository) && AbstractC22676k.m65745e(this.scope, c27721s.scope);
    }

    public int hashCode() {
        return this.scope.hashCode() + ((this.notificationRepository.hashCode() + ((this.featureFlagChecker.hashCode() + (this.crashReporter.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PushContext(crashReporter=" + this.crashReporter + ", featureFlagChecker=" + this.featureFlagChecker + ", notificationRepository=" + this.notificationRepository + ", scope=" + this.scope + ")";
    }
}
