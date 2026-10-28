package du1;

import android.net.Uri;
import p114eb.AbstractC12939a0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ss1.C32948a;

/* JADX INFO: renamed from: du1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ldu1/a;", "", "Leb/a0;", "fragmentNavController", "Lss1/a;", "analytics", "<init>", "(Leb/a0;Lss1/a;)V", "Ldu1/b;", "navEvent", "Ll83/a0;", "a", "(Ldu1/b;)V", "Leb/a0;", "b", "Lss1/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12375a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32948a analytics;

    public C12375a(AbstractC12939a0 fragmentNavController, C32948a analytics) {
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.fragmentNavController = fragmentNavController;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m34723a(AbstractC12376b navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(AbstractC12376b.a.f41832a)) {
            this.fragmentNavController.m36410z();
            return;
        }
        if (navEvent instanceof AbstractC12376b.f) {
            AbstractC12376b.f fVar = (AbstractC12376b.f) navEvent;
            this.analytics.m104039m(fVar.getSelectedWrist());
            Uri uri = Uri.parse("android-app://com.whoop/labradorReading?selectedWrist=" + fVar.getSelectedWrist());
            this.fragmentNavController.m36410z();
            this.fragmentNavController.m36402q(uri);
            return;
        }
        if (navEvent.equals(AbstractC12376b.e.f41838a)) {
            Uri uri2 = Uri.parse("android-app://com.whoop/labradorDeviceLocationFragment");
            this.fragmentNavController.m36410z();
            this.fragmentNavController.m36402q(uri2);
            return;
        }
        if (navEvent instanceof AbstractC12376b.g) {
            this.analytics.m104035i();
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/onboardingStoriesFragmentRedesign/ECG_EDUCATION?entryPoint=" + ((AbstractC12376b.g) navEvent).getEntryPoint()));
            return;
        }
        if (!(navEvent instanceof AbstractC12376b.d)) {
            if (navEvent instanceof AbstractC12376b.c) {
                this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/labradorAboutFragment"));
                return;
            } else {
                if (!(navEvent instanceof AbstractC12376b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.fragmentNavController.m36410z();
                return;
            }
        }
        AbstractC12376b.d dVar = (AbstractC12376b.d) navEvent;
        String id4 = dVar.getId();
        boolean showSaveButton = dVar.getShowSaveButton();
        boolean isNewReading = dVar.getIsNewReading();
        StringBuilder sbM73379l = AbstractC25012a.m73379l("android-app://com.whoop/labradorDetailsFragment?id=", id4, "&showSaveButton=", "&isNewReading=", showSaveButton);
        sbM73379l.append(isNewReading);
        Uri uri3 = Uri.parse(sbM73379l.toString());
        this.fragmentNavController.m36410z();
        this.fragmentNavController.m36402q(uri3);
    }
}
