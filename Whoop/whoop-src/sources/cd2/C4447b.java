package cd2;

import androidx.core.app.NotificationCompat;
import fd2.AbstractC14406d;
import fd2.EnumC14403a;
import fd2.EnumC14404b;
import fd2.EnumC14405c;
import fd2.EnumC14407e;
import fi0.InterfaceC14515a;
import iy1.InterfaceC21030c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcd2/b;", "", "Lfi0/a;", "analytics", "Liy1/c;", "metricWriter", "<init>", "(Lfi0/a;Liy1/c;)V", "Lcd2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcd2/a;)V", "", "durationNanos", "Lfd2/e;", "result", "d", "(JLfd2/e;)V", "Lfd2/a;", "action", "Lfd2/b;", "b", "(Lfd2/a;Lfd2/b;)V", "Lfd2/c;", "c", "(Lfd2/c;)V", "Lfi0/a;", "Liy1/c;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4447b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    public C4447b(InterfaceC14515a analytics, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.analytics = analytics;
        this.metricWriter = metricWriter;
    }

    /* JADX INFO: renamed from: a */
    public final void m13910a(AbstractC4446a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC4446a.f) {
            AbstractC4446a.f fVar = (AbstractC4446a.f) event;
            AbstractC4448c.m13921h(this.analytics, fVar.m13908a(), fVar.getBackgroundEnabled());
            return;
        }
        if (event instanceof AbstractC4446a.b) {
            AbstractC4446a.b bVar = (AbstractC4446a.b) event;
            AbstractC4448c.m13917d(this.analytics, bVar.m13896a(), bVar.getBackgroundEnabled(), bVar.getAssetId());
            return;
        }
        if (event instanceof AbstractC4446a.c) {
            AbstractC4446a.c cVar = (AbstractC4446a.c) event;
            AbstractC4448c.m13918e(this.analytics, cVar.m13899a(), cVar.getBackgroundEnabled(), cVar.getAssetId());
            return;
        }
        if (event instanceof AbstractC4446a.d) {
            AbstractC4446a.d dVar = (AbstractC4446a.d) event;
            AbstractC4448c.m13919f(this.analytics, dVar.m13902a(), dVar.getBackgroundEnabled(), dVar.getAssetId());
        } else if (event instanceof AbstractC4446a.e) {
            AbstractC4446a.e eVar = (AbstractC4446a.e) event;
            AbstractC4448c.m13920g(this.analytics, eVar.m13905a(), eVar.getBackgroundEnabled(), eVar.getAssetId());
        } else {
            if (!(event instanceof AbstractC4446a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC4446a.a aVar = (AbstractC4446a.a) event;
            AbstractC4448c.m13916c(this.analytics, aVar.m13893a(), aVar.getBackgroundEnabledAfterToggle(), aVar.getAssetId());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13911b(EnumC14403a action, EnumC14404b result) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(result, "result");
        AbstractC14406d.m41047a(this.metricWriter, action, result);
    }

    /* JADX INFO: renamed from: c */
    public final void m13912c(EnumC14405c result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC14406d.m41048b(this.metricWriter, result);
    }

    /* JADX INFO: renamed from: d */
    public final void m13913d(long durationNanos, EnumC14407e result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC14406d.m41049c(this.metricWriter, durationNanos, result);
    }
}
