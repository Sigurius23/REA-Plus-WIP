package cg0;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import gg0.InterfaceC15822a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q31.C29944b;
import q31.C29948f;

/* JADX INFO: renamed from: cg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcg0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lgg0/a$g;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lgg0/a$g;)V", "Lgg0/a$a;", "a", "(Lgg0/a$a;)V", "Lfi0/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4571a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C4571a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m14244b(InterfaceC15822a.g event) {
        if (event.getElement() instanceof C29948f) {
            Object event2 = event.getEvent();
            if (event2 instanceof C29944b) {
                AbstractC4572b.m14246a(this.analytics, ((C29944b) event2).getSegmentId());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14245a(InterfaceC15822a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC15822a.l) {
            InterfaceC15822a.l lVar = (InterfaceC15822a.l) event;
            AbstractC4572b.m14250e(this.analytics, lVar.getSource(), lVar.getTestCount());
            return;
        }
        if (event instanceof InterfaceC15822a.g) {
            m14244b((InterfaceC15822a.g) event);
            return;
        }
        if (event instanceof InterfaceC15822a.d) {
            InterfaceC15822a.d dVar = (InterfaceC15822a.d) event;
            if (dVar.getCardButtonState().getAction() != null) {
                AbstractC4572b.m14247b(this.analytics, dVar.getSelectedSegmentId());
                return;
            }
            return;
        }
        if (!(event instanceof InterfaceC15822a.k)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC15822a.k kVar = (InterfaceC15822a.k) event;
        AbstractC4572b.m14249d(this.analytics, kVar.getTestsChangingTo(), kVar.getTestsChangingFrom());
    }
}
