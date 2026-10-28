package gk2;

import com.whoop.tombstone.TombstoneWorker;
import java.time.Duration;
import java.util.LinkedHashSet;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gk2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m65681d2 = {"Lgk2/f;", "", "Lic/p0;", "workManager", "<init>", "(Lic/p0;)V", "Ll83/a0;", "a", "()V", "Lic/p0;", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15931f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    public C15931f(AbstractC18377p0 workManager) {
        AbstractC22676k.m65750j(workManager, "workManager");
        this.workManager = workManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m44978a() {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C18354e c18354e = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
        Duration durationOfDays = Duration.ofDays(1L);
        AbstractC22676k.m65749i(durationOfDays, "ofDays(...)");
        Duration durationOfHours = Duration.ofHours(2L);
        AbstractC22676k.m65749i(durationOfHours, "ofHours(...)");
        C18365j0 c18365j0 = new C18365j0(TombstoneWorker.class);
        c18365j0.f71544c.m92429f(durationOfDays.toMillis(), durationOfHours.toMillis());
        C18365j0 c18365j1 = (C18365j0) c18365j0.m52880f(c18354e);
        EnumC18346a enumC18346a = EnumC18346a.f71443w;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        AbstractC22676k.m65749i(durationOfMinutes, "ofMinutes(...)");
        EnumC18346a enumC18346a2 = EnumC18346a.f71444x;
        c18365j1.f71542a = true;
        C30207q c30207q = c18365j1.f71544c;
        c30207q.f123645l = enumC18346a2;
        c30207q.m92427d(durationOfMinutes.toMillis());
        this.workManager.mo52875d("tombstoneworker", EnumC18366k.f71499w, (C18367k0) c18365j1.m52878b());
    }
}
