package if2;

import android.net.Uri;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import n12.AbstractC26164a;
import or2.C28216y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: if2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lif2/b;", "Ln12/a;", "Landroidx/fragment/app/m0;", "fragment", "Lor2/y;", "externalLinkNavigator", "<init>", "(Landroidx/fragment/app/m0;Lor2/y;)V", "Lif2/a;", "navEvent", "Ll83/a0;", "g", "(Lif2/a;)V", "c", "Landroidx/fragment/app/m0;", "getFragment", "()Landroidx/fragment/app/m0;", "d", "Lor2/y;", "getExternalLinkNavigator", "()Lor2/y;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18455b extends AbstractC26164a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18455b(AbstractComponentCallbacksC1320m0 fragment, C28216y externalLinkNavigator) {
        super(fragment);
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        this.fragment = fragment;
        this.externalLinkNavigator = externalLinkNavigator;
    }

    /* JADX INFO: renamed from: g */
    public final void m53199g(AbstractC18454a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent instanceof AbstractC18454a.b) {
            C28216y c28216y = this.externalLinkNavigator;
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, ((AbstractC18454a.b) navEvent).getLink(), false, 4, null);
            return;
        }
        if (!(navEvent instanceof AbstractC18454a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!((AbstractC18454a.a) navEvent).getFromOnboarding()) {
            m77710e().m36410z();
        } else {
            m77711f().m85343i();
            m77711f().m85338d(Uri.parse("whoop://com.whoop/sleepCoachFragment/?entryPoint=deeplink&clickType="));
        }
    }
}
