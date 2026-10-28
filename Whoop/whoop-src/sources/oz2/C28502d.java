package oz2;

import android.content.Context;
import com.whoop.whooplabs.workers.BtHrSubmissionWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oz2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Loz2/d;", "Loz2/c;", "Lic/p0;", "workManager", "Landroid/content/Context;", "context", "<init>", "(Lic/p0;Landroid/content/Context;)V", "", "delayHours", "Ll83/a0;", "a", "(I)V", "delayInHours", "Lic/a0;", "b", "(I)Lic/a0;", "Lic/p0;", "Landroid/content/Context;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28502d implements InterfaceC28501c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    public C28502d(AbstractC18377p0 workManager, Context context) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(context, "context");
        this.workManager = workManager;
        this.context = context;
    }

    @Override // oz2.InterfaceC28501c
    /* JADX INFO: renamed from: a */
    public void mo86814a(int delayHours) {
        this.workManager.m52876e("DWL_BTHR_UPLOAD", EnumC18368l.f71503w, m86815b(delayHours));
    }

    /* JADX INFO: renamed from: b */
    public final C18347a0 m86815b(int delayInHours) {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        return (C18347a0) ((C18392z) ((C18392z) ((C18392z) new C18392z(BtHrSubmissionWorker.class).m52881g(delayInHours, TimeUnit.HOURS)).m52880f(new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(new LinkedHashSet())))).m52879e(EnumC18346a.f71443w, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }
}
