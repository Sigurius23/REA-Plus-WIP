package uo2;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import iy1.InterfaceC21030c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import xo2.InterfaceC38495a;

/* JADX INFO: renamed from: uo2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Luo2/a;", "", "Lfi0/a;", "analytics", "Liy1/c;", "metricWriter", "<init>", "(Lfi0/a;Liy1/c;)V", "Lxo2/a$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lxo2/a$a;)V", "Lfi0/a;", "b", "Liy1/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35143a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C35143a(InterfaceC14515a analytics, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.analytics = analytics;
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    public final void m111143a(InterfaceC38495a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC38495a.d) {
            return;
        }
        if (event.equals(InterfaceC38495a.c.f164959a)) {
            AbstractC35144b.m111145b(this.metricWriter);
        } else {
            if (!event.equals(InterfaceC38495a.i.f164964a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC35144b.m111144a(this.metricWriter);
        }
    }
}
