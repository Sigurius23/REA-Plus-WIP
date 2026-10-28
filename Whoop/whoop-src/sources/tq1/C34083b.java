package tq1;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import d13.AbstractC11478a;
import gq1.C16081a;
import j02.InterfaceC21159o0;
import lh2.C24075f;
import nf1.AbstractC26660a;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tq1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltq1/b;", "", "Lgq1/a;", "analyticsHelper", "Lkotlin/Function0;", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "<init>", "(Lgq1/a;Lc93/a;Lj02/o0;)V", "Landroidx/fragment/app/m0;", "fragment", "(Landroidx/fragment/app/m0;Lgq1/a;Lj02/o0;)V", "Ltq1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Ltq1/a;)V", "a", "Lgq1/a;", "b", "Lc93/a;", "Lj02/o0;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34083b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16081a analyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C34083b(C16081a analyticsHelper, InterfaceC4339a navController, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.analyticsHelper = analyticsHelper;
        this.navController = navController;
        this.navigator = navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final AbstractC12939a0 m107738b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        return AbstractC5583n.m16799z(abstractComponentCallbacksC1320m0);
    }

    /* JADX INFO: renamed from: c */
    public final void m107739c(AbstractC34082a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC34082a.b) {
            C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p);
            AbstractC34082a.b bVar = (AbstractC34082a.b) event;
            Uri uri = Uri.parse("android-app://com.whoop/behavior_impact_details?impactId=" + bVar.getDetailId() + "?isNew=" + bVar.getIsNew() + "?source=");
            C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uri, "uri", uri, null, null);
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
            abstractC12939a0.getClass();
            abstractC12939a0.m36409x(c12969k0M30854f, c12997x0);
            return;
        }
        if (event instanceof AbstractC34082a.c) {
            this.analyticsHelper.m45431b();
            Uri uri2 = Uri.parse("android-app://com.whoop/journal_settings_fragment_v2");
            AbstractC22676k.m65750j(uri2, "uri");
            ((AbstractC12939a0) this.navController.invoke()).m36404s(new C12969k0(uri2, null, null));
            return;
        }
        if (event instanceof AbstractC34082a.e) {
            ((AbstractC12939a0) this.navController.invoke()).m36410z();
        } else if (event instanceof AbstractC34082a.d) {
            this.navigator.mo59392a(((AbstractC34082a.d) event).getNavigationAction());
        } else if (!event.equals(AbstractC34082a.f.f142950a) && !(event instanceof AbstractC34082a.a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34083b(AbstractComponentCallbacksC1320m0 fragment, C16081a analyticsHelper, InterfaceC21159o0 navigator) {
        this(analyticsHelper, new C24075f(fragment, 3), navigator);
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(navigator, "navigator");
    }
}
