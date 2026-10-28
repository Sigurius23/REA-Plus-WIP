package pe2;

import android.net.Uri;
import fi0.InterfaceC14515a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pe2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpe2/b;", "", "Leb/a0;", "fragmentNavController", "Lfi0/a;", "analytics", "Lj02/o0;", "navigator", "<init>", "(Leb/a0;Lfi0/a;Lj02/o0;)V", "Lpe2/a;", "navEvent", "Ll83/a0;", "a", "(Lpe2/a;)V", "Leb/a0;", "b", "Lfi0/a;", "c", "Lj02/o0;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29118b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C29118b(AbstractC12939a0 fragmentNavController, InterfaceC14515a analytics, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.fragmentNavController = fragmentNavController;
        this.analytics = analytics;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m88488a(AbstractC29117a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(AbstractC29117a.m.f117880a)) {
            this.fragmentNavController.m36410z();
            return;
        }
        if (navEvent.equals(AbstractC29117a.l.f117879a)) {
            this.fragmentNavController.m36410z();
            return;
        }
        if (navEvent instanceof AbstractC29117a.k) {
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/shepherdOnboarding?entryPoint=" + ((AbstractC29117a.k) navEvent).getEntryPoint()));
            return;
        }
        if (navEvent instanceof AbstractC29117a.j) {
            Uri uri = Uri.parse("android-app://com.whoop/shepherdTermsOfUse?entryPoint=" + ((AbstractC29117a.j) navEvent).getEntryPoint());
            this.fragmentNavController.m36410z();
            this.fragmentNavController.m36402q(uri);
            return;
        }
        if (navEvent instanceof AbstractC29117a.f) {
            AbstractC29117a.f fVar = (AbstractC29117a.f) navEvent;
            this.navigator.mo59393b(new AbstractC21155m0.l3(fVar.getOnboardingStoryName(), fVar.getEntryPoint(), 0L, 4, null));
            return;
        }
        if (navEvent instanceof AbstractC29117a.a) {
            this.navigator.mo59392a(((AbstractC29117a.a) navEvent).getNavigationAction());
            return;
        }
        if (navEvent instanceof AbstractC29117a.b) {
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/shepherdDetails?date=" + ((AbstractC29117a.b) navEvent).getHistoryDate()));
            return;
        }
        if (navEvent.equals(AbstractC29117a.h.f117875a)) {
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/settings/shepherdNotificationHistoryFragment"));
            return;
        }
        if (navEvent.equals(AbstractC29117a.i.f117876a)) {
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/settings/shepherdToggleSettingsFragment"));
            return;
        }
        if (navEvent instanceof AbstractC29117a.d) {
            this.navigator.mo59392a(((AbstractC29117a.d) navEvent).getAction());
            return;
        }
        if (navEvent instanceof AbstractC29117a.e) {
            this.navigator.mo59393b(new AbstractC21155m0.w1("ARRHYTHMIA_INAPP", ((AbstractC29117a.e) navEvent).getEntryPoint(), null, null, 12, null));
        } else if (navEvent instanceof AbstractC29117a.c) {
            this.navigator.mo59392a(((AbstractC29117a.c) navEvent).getAction());
        } else {
            if (!(navEvent instanceof AbstractC29117a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((AbstractC29117a.g) navEvent).getAction());
        }
    }
}
