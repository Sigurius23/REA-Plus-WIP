package vf0;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q31.C29944b;
import q31.C29948f;
import zf0.InterfaceC40609a;

/* JADX INFO: renamed from: vf0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lvf0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lzf0/a$e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lzf0/a$e;)V", "Lzf0/a$a;", "a", "(Lzf0/a$a;)V", "Lfi0/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35944a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C35944a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m114183b(InterfaceC40609a.e event) {
        if (event.getElement() instanceof C29948f) {
            Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (obj instanceof C29944b) {
                AbstractC35945b.m114185a(this.analytics, ((C29944b) obj).getSegmentId());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m114184a(InterfaceC40609a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC40609a.g) {
            InterfaceC40609a.g gVar = (InterfaceC40609a.g) event;
            AbstractC35945b.m114187c(this.analytics, gVar.getSource(), gVar.getTestCount());
        } else {
            if (!(event instanceof InterfaceC40609a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            m114183b((InterfaceC40609a.e) event);
        }
    }
}
