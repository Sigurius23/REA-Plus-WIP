package gl1;

import fi0.InterfaceC14515a;
import fm1.EnumC14604h;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: gl1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lgl1/e;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Lfm1/h;", "previousStreakState", "currentStreakState", "", "a", "(Lfm1/h;Lfm1/h;)Ljava/lang/String;", "Ll83/a0;", "b", "(Lfm1/h;Lfm1/h;)V", "c", "()V", "Lfi0/a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15970e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C15970e(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m45107a(EnumC14604h previousStreakState, EnumC14604h currentStreakState) {
        EnumC14604h enumC14604h = EnumC14604h.ACTIVE;
        if (previousStreakState == enumC14604h && currentStreakState == enumC14604h) {
            return "iterate up";
        }
        if (previousStreakState == enumC14604h && currentStreakState == EnumC14604h.PENDING) {
            return "healthy to at risk";
        }
        if (previousStreakState == EnumC14604h.PENDING && currentStreakState == enumC14604h) {
            return "at risk to healthy";
        }
        if (previousStreakState == enumC14604h && currentStreakState == EnumC14604h.BROKEN) {
            return "reset";
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m45108b(EnumC14604h previousStreakState, EnumC14604h currentStreakState) {
        AbstractC22676k.m65750j(previousStreakState, "previousStreakState");
        AbstractC22676k.m65750j(currentStreakState, "currentStreakState");
        this.baseAnalytics.mo41422d(null, "animation fires", m45107a(previousStreakState, currentStreakState), "Streaks", null, C25272z.f99163w);
    }

    /* JADX INFO: renamed from: c */
    public final void m45109c() {
        this.baseAnalytics.mo41422d(null, "click streak icon", null, "Streaks", null, AbstractC31061c.m95645u("source", "home screen"));
    }
}
