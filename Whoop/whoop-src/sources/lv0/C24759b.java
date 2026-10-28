package lv0;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pv0.InterfaceC29575b;

/* JADX INFO: renamed from: lv0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llv0/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Llv0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Llv0/a;)V", "Lpv0/b;", "b", "(Lpv0/b;)V", "Lfi0/a;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24759b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C24759b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m72499a(AbstractC24758a event) {
        AbstractC22676k.m65750j(event, "event");
        this.analytics.mo41422d(event.getCategory(), event.getAction(), event.getLabel(), event.getEventName(), event.getValue(), event.mo72497e());
    }

    /* JADX INFO: renamed from: b */
    public final void m72500b(InterfaceC29575b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC29575b.d) {
            InterfaceC29575b.d dVar = (InterfaceC29575b.d) event;
            m72499a(new AbstractC24758a.c(dVar.getFilter(), null, null, dVar.getFilter(), 6, null));
        }
    }
}
