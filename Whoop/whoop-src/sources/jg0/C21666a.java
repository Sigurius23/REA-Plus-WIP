package jg0;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import og0.InterfaceC27915a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ljg0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Log0/a$f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Log0/a$f;)V", "Log0/a$b;", "a", "(Log0/a$b;)V", "Lfi0/a;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21666a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C21666a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m60925b(InterfaceC27915a.f event) {
    }

    /* JADX INFO: renamed from: a */
    public final void m60926a(InterfaceC27915a.b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27915a.a) {
            AbstractC21667b.m60927a(this.analytics, ((InterfaceC27915a.a) event).getSource());
        } else {
            if (!(event instanceof InterfaceC27915a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            m60925b((InterfaceC27915a.f) event);
        }
    }
}
