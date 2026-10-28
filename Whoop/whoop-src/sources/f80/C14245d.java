package f80;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import h80.C17003c;
import h80.EnumC17005e;
import h80.EnumC17006f;
import h80.EnumC17007g;
import h80.InterfaceC17002b;
import h80.InterfaceC17004d;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f80.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006\""}, m65681d2 = {"Lf80/d;", "", "Lh80/c;", "analyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lh80/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lh80/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lh80/d;)V", "", "b", "()Z", "Lf80/b;", "outcome", "d", "(Lf80/b;)V", "Lh80/g;", HMSTrackSource.SCREEN, "Lf80/c;", "e", "(Lh80/g;Lf80/c;)V", "Lh80/e;", "mode", "f", "(Lh80/e;)V", "success", "c", "(Lh80/e;Z)V", "Lh80/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14245d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f80.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52028a;

        static {
            int[] iArr = new int[EnumC14244c.values().length];
            try {
                iArr[EnumC14244c.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14244c.UserCancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14244c.Failure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14244c.NotAttempted.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52028a = iArr;
        }
    }

    public C14245d(C17003c analyticsHelper, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.analyticsHelper = analyticsHelper;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final void m40703a(InterfaceC17004d event) {
        this.analyticsHelper.m47941p(new InterfaceC17002b.e(event));
    }

    /* JADX INFO: renamed from: b */
    private final boolean m40704b() {
        return this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.CREDENTIAL_MANAGER_ANDROID);
    }

    /* JADX INFO: renamed from: c */
    public final void m40705c(EnumC17005e mode, boolean success) {
        AbstractC22676k.m65750j(mode, "mode");
        if (m40704b()) {
            m40703a(new InterfaceC17004d.a(mode, success));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m40706d(AbstractC14243b outcome) {
        InterfaceC17004d.b bVar;
        AbstractC22676k.m65750j(outcome, "outcome");
        if (m40704b()) {
            if (outcome instanceof AbstractC14243b.b) {
                bVar = new InterfaceC17004d.b(EnumC17006f.Success, null, 2, null);
            } else if (outcome.equals(AbstractC14243b.c.f52025a)) {
                bVar = new InterfaceC17004d.b(EnumC17006f.Cancel, null, 2, null);
            } else {
                if (!(outcome instanceof AbstractC14243b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new InterfaceC17004d.b(EnumC17006f.Failure, ((AbstractC14243b.a) outcome).getReason());
            }
            m40703a(bVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m40707e(EnumC17007g screen, EnumC14244c outcome) {
        EnumC17006f enumC17006f;
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(outcome, "outcome");
        if (m40704b()) {
            int i13 = a.f52028a[outcome.ordinal()];
            if (i13 == 1) {
                enumC17006f = EnumC17006f.Success;
            } else if (i13 == 2) {
                enumC17006f = EnumC17006f.Cancel;
            } else {
                if (i13 != 3) {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                enumC17006f = EnumC17006f.Failure;
            }
            m40703a(new InterfaceC17004d.c(screen, enumC17006f));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m40708f(EnumC17005e mode) {
        AbstractC22676k.m65750j(mode, "mode");
        if (m40704b()) {
            m40703a(new InterfaceC17004d.d(mode));
        }
    }
}
