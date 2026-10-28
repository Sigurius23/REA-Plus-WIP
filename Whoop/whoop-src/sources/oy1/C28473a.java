package oy1;

import com.whoop.metrics.worker.DataDogMetricsUploader;
import java.util.concurrent.TimeUnit;
import p218ic.AbstractC18377p0;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18366k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oy1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m65681d2 = {"Loy1/a;", "", "Lic/p0;", "workManager", "<init>", "(Lic/p0;)V", "Ll83/a0;", "a", "()V", "Lic/p0;", "b", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28473a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    public C28473a(AbstractC18377p0 workManager) {
        AbstractC22676k.m65750j(workManager, "workManager");
        this.workManager = workManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m86385a() {
        this.workManager.mo52875d("PERIODIC_METRICS_TO_DATA_DOG_WORK", EnumC18366k.f71499w, (C18367k0) new C18365j0(DataDogMetricsUploader.class, 15L, TimeUnit.MINUTES).m52878b());
    }
}
