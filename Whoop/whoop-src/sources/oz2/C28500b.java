package oz2;

import android.content.Context;
import com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker;
import java.util.concurrent.TimeUnit;
import p218ic.AbstractC18377p0;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18366k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oz2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Loz2/b;", "Loz2/a;", "Lic/p0;", "workManager", "Landroid/content/Context;", "context", "<init>", "(Lic/p0;Landroid/content/Context;)V", "Lic/k0;", "c", "()Lic/k0;", "Ll83/a0;", "a", "()V", "b", "Lic/p0;", "Landroid/content/Context;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28500b implements InterfaceC28499a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    public C28500b(AbstractC18377p0 workManager, Context context) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(context, "context");
        this.workManager = workManager;
        this.context = context;
    }

    /* JADX INFO: renamed from: c */
    private final C18367k0 m86813c() {
        C18365j0 c18365j0 = (C18365j0) new C18365j0(BtHrPeriodicCheckWorker.class).m52881g(10L, TimeUnit.MINUTES);
        c18365j0.f71544c.f123657x = "DWL_BTHR_PERIODIC_CHECK_TAG";
        return (C18367k0) c18365j0.m52878b();
    }

    @Override // oz2.InterfaceC28499a
    /* JADX INFO: renamed from: a */
    public void mo86811a() {
        this.workManager.mo52875d("DWL_BTHR_PERIODIC_CHECK", EnumC18366k.f71500x, m86813c());
    }

    @Override // oz2.InterfaceC28499a
    /* JADX INFO: renamed from: b */
    public void mo86812b() {
        this.workManager.mo52873b("DWL_BTHR_PERIODIC_CHECK");
    }
}
