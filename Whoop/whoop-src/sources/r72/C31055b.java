package r72;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: r72.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lr72/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lr72/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lr72/a;)V", "Lfi0/a;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31055b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C31055b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m95615a(AbstractC31054a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC31054a.b) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "join_waitlist", null, "Bloodwork", null, AbstractC31061c.m95645u("source", ((AbstractC31054a.b) event).getSource()), 20, null);
            return;
        }
        if (event instanceof AbstractC31054a.h) {
            AbstractC31054a.h hVar = (AbstractC31054a.h) event;
            this.analytics.mo41422d("bloodwork", "view_details", hVar.getLabel(), "Bloodwork", hVar.getIsOn() ? "joined" : "not_joined", AbstractC31061c.m95645u("source", hVar.getSource()));
            return;
        }
        if (event instanceof AbstractC31054a.f) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "life_upgrade", null, "Bloodwork", null, null, 52, null);
            return;
        }
        if (event instanceof AbstractC31054a.c) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "waitlist_share", null, "Bloodwork", null, null, 52, null);
            return;
        }
        if (event instanceof AbstractC31054a.g) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "all_biomarkers", null, "Bloodwork", null, null, 52, null);
            return;
        }
        if (event instanceof AbstractC31054a.d) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "bloodwork_category", null, "Bloodwork", ((AbstractC31054a.d) event).getName(), null, 36, null);
            return;
        }
        if (event instanceof AbstractC31054a.e) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "bloodwork_faq", null, "Bloodwork", String.valueOf(((AbstractC31054a.e) event).getNumber()), null, 36, null);
        } else if (event instanceof AbstractC31054a.a) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "details_load_error", null, "Bloodwork", null, null, 52, null);
        } else {
            if (!(event instanceof AbstractC31054a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "waitlist_join_error", null, "Bloodwork", null, null, 52, null);
        }
    }
}
