package h03;

import com.whoop.widget.network.WidgetRefreshWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.concurrent.TimeUnit;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h03.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lh03/b;", "", "Lic/p0;", "workManager", "<init>", "(Lic/p0;)V", "Lic/k0;", "b", "()Lic/k0;", "Lic/a0;", "a", "()Lic/a0;", "Ll83/a0;", "d", "()V", "c", "Lic/p0;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16604b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    public C16604b(AbstractC18377p0 workManager) {
        AbstractC22676k.m65750j(workManager, "workManager");
        this.workManager = workManager;
    }

    /* JADX INFO: renamed from: a */
    private final C18347a0 m47118a() {
        return (C18347a0) ((C18392z) new C18392z(WidgetRefreshWorker.class).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX INFO: renamed from: b */
    private final C18367k0 m47119b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (C18367k0) ((C18365j0) new C18365j0(WidgetRefreshWorker.class, 900000L, timeUnit).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
    }

    /* JADX INFO: renamed from: c */
    public final void m47120c() {
        this.workManager.m52876e("ONE_TIME_WIDGET_REFRESH", EnumC18368l.f71503w, m47118a());
    }

    /* JADX INFO: renamed from: d */
    public final void m47121d() {
        this.workManager.mo52875d("PERIODIC_WIDGET_REFRESH", EnumC18366k.f71499w, m47119b());
    }
}
