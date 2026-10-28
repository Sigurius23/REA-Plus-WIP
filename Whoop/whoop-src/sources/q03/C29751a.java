package q03;

import android.app.NotificationManager;
import android.content.Context;
import com.whoop.workmanager.batteryworkmanager.DeadBatteryWorker;
import java.util.concurrent.TimeUnit;
import l83.C23465k;
import p024b0.C2178b;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18392z;
import p218ic.EnumC18368l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xu0.InterfaceC38652a;

/* JADX INFO: renamed from: q03.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lq03/a;", "Lxu0/a;", "Lic/p0;", "workManager", "Landroid/content/Context;", "context", "<init>", "(Lic/p0;Landroid/content/Context;)V", "", "delayMinutes", "batteryLevel", "Ll83/a0;", "b", "(II)V", "c", "()V", "a", "Lic/a0;", "d", "(II)Lic/a0;", "Lic/p0;", "Landroid/content/Context;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29751a implements InterfaceC38652a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    public C29751a(AbstractC18377p0 workManager, Context context) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(context, "context");
        this.workManager = workManager;
        this.context = context;
    }

    @Override // xu0.InterfaceC38652a
    /* JADX INFO: renamed from: a */
    public void mo91219a() {
        Object systemService = this.context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(115);
    }

    @Override // xu0.InterfaceC38652a
    /* JADX INFO: renamed from: b */
    public void mo91220b(int delayMinutes, int batteryLevel) {
        this.workManager.m52876e("DeadBatteryConfirmationWork", EnumC18368l.f71503w, m91222d(delayMinutes, batteryLevel));
    }

    @Override // xu0.InterfaceC38652a
    /* JADX INFO: renamed from: c */
    public void mo91221c() {
        this.workManager.mo52873b("DeadBatteryConfirmationWork");
    }

    /* JADX INFO: renamed from: d */
    public final C18347a0 m91222d(int delayMinutes, int batteryLevel) {
        C18392z c18392z = (C18392z) new C18392z(DeadBatteryWorker.class).m52881g(delayMinutes, TimeUnit.MINUTES);
        C23465k[] c23465kArr = {new C23465k("batteryLevel", Integer.valueOf(batteryLevel))};
        C2178b c2178b = new C2178b(1);
        C23465k c23465k = c23465kArr[0];
        c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
        return (C18347a0) ((C18392z) ((C18392z) c18392z.m52882h(c2178b.m6856b())).m52877a("DeadBatteryConfirmationWork")).m52878b();
    }
}
