package ak2;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import or2.AbstractC28163g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ak2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lak2/b;", "", "Landroidx/fragment/app/m0;", "fragment", "<init>", "(Landroidx/fragment/app/m0;)V", "Lak2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lak2/a;)V", "Landroidx/fragment/app/m0;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0953b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    public C0953b(AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        this.fragment = fragment;
    }

    /* JADX INFO: renamed from: a */
    public final void m2411a(AbstractC0952a event) {
        AbstractC22676k.m65750j(event, "event");
        if (!event.equals(AbstractC0952a.a.f3533a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC28163g0.m85259o(this.fragment).m85343i();
    }
}
