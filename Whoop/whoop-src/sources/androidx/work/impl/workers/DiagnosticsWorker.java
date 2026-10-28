package androidx.work.impl.workers;

import ai1.C0910b;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import ge3.AbstractC15751g;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p218ic.AbstractC18386u;
import p218ic.C18384t;
import p218ic.C18389w;
import p249jc.C21596v;
import p420qc.C30199i;
import p420qc.C30202l;
import p420qc.C30211u;
import p420qc.C30213w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pl0.C29343a;
import tc.AbstractC33694a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: a */
    public final C18384t mo5513a() {
        C21596v c21596vM60637g = C21596v.m60637g(getApplicationContext());
        WorkDatabase workDatabase = c21596vM60637g.f82807c;
        AbstractC22676k.m65749i(workDatabase, "getWorkDatabase(...)");
        C30211u c30211uMo5521h = workDatabase.mo5521h();
        C30202l c30202lMo5519f = workDatabase.mo5519f();
        C30213w c30213wMo5522i = workDatabase.mo5522i();
        C30199i c30199iMo5518e = workDatabase.mo5518e();
        c21596vM60637g.f82806b.f71449d.getClass();
        List list = (List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C0910b(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L), 26));
        List list2 = (List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C29343a(25));
        List list3 = (List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C29343a(28));
        if (!list.isEmpty()) {
            C18389w c18389wM52886d = C18389w.m52886d();
            String str = AbstractC33694a.f140784a;
            c18389wM52886d.m52891e(str, "Recently completed work:\n\n");
            C18389w.m52886d().m52891e(str, AbstractC33694a.m106451a(c30202lMo5519f, c30213wMo5522i, c30199iMo5518e, list));
        }
        if (!list2.isEmpty()) {
            C18389w c18389wM52886d2 = C18389w.m52886d();
            String str2 = AbstractC33694a.f140784a;
            c18389wM52886d2.m52891e(str2, "Running work:\n\n");
            C18389w.m52886d().m52891e(str2, AbstractC33694a.m106451a(c30202lMo5519f, c30213wMo5522i, c30199iMo5518e, list2));
        }
        if (!list3.isEmpty()) {
            C18389w c18389wM52886d3 = C18389w.m52886d();
            String str3 = AbstractC33694a.f140784a;
            c18389wM52886d3.m52891e(str3, "Enqueued work:\n\n");
            C18389w.m52886d().m52891e(str3, AbstractC33694a.m106451a(c30202lMo5519f, c30213wMo5522i, c30199iMo5518e, list3));
        }
        return AbstractC18386u.m52885b();
    }
}
