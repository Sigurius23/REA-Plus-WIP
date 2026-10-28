package vm0;

import androidx.core.app.NotificationCompat;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fy1.C14866b;
import fy1.InterfaceC14867c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vm0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lvm0/b;", "", "Lfy1/c;", "currentScreenProvider", "<init>", "(Lfy1/c;)V", "Lvm0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lvm0/a;)V", "Lfy1/c;", "Lec3/o1;", "Lvm0/k;", "b", "Lec3/o1;", "events", "Lec3/t1;", "c", "Lec3/t1;", "()Lec3/t1;", "stream", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36144b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14867c currentScreenProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13072o1 events;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13087t1 stream;

    public C36144b(InterfaceC14867c currentScreenProvider) {
        AbstractC22676k.m65750j(currentScreenProvider, "currentScreenProvider");
        this.currentScreenProvider = currentScreenProvider;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 64, EnumC11916a.f38983x, 1);
        this.events = c13096w1M36592b;
        this.stream = c13096w1M36592b;
    }

    /* JADX INFO: renamed from: a */
    public final void m114975a(InterfaceC36143a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC13072o1 interfaceC13072o1 = this.events;
        C14866b c14866b = (C14866b) this.currentScreenProvider.getCurrentScreen().getValue();
        interfaceC13072o1.mo36564a(new C36153k(event, c14866b != null ? c14866b.getTag() : null));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13087t1 getStream() {
        return this.stream;
    }
}
