package ip2;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import mn2.EnumC25719b;
import np2.InterfaceC27034a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ip2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lip2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lnp2/a$m;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lnp2/a$m;)V", "Lnp2/a$a;", "a", "(Lnp2/a$a;)V", "Lfi0/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20814a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C20814a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m57401b(InterfaceC27034a.m event) {
    }

    /* JADX INFO: renamed from: a */
    public final void m57402a(InterfaceC27034a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27034a.p) {
            AbstractC20815b.m57405c(this.analytics, EnumC25719b.INSTANCE.m75836a(((InterfaceC27034a.p) event).getSource()));
            return;
        }
        if (event instanceof InterfaceC27034a.i) {
            AbstractC20815b.m57403a(this.analytics, EnumC25719b.INSTANCE.m75836a(((InterfaceC27034a.i) event).getSource()));
        } else if (event instanceof InterfaceC27034a.g) {
            AbstractC20815b.m57404b(this.analytics, EnumC25719b.INSTANCE.m75836a(((InterfaceC27034a.g) event).getSource()));
        } else {
            if (!(event instanceof InterfaceC27034a.m)) {
                throw new NoWhenBranchMatchedException();
            }
            m57401b((InterfaceC27034a.m) event);
        }
    }
}
