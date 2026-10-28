package z82;

import j93.InterfaceC21493z;
import oh3.AbstractC27946d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import q92.C30070b;
import u92.C34660d;

/* JADX INFO: renamed from: z82.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lz82/j;", "", "Lu92/d;", "mainPrefs", "<init>", "(Lu92/d;)V", "", "d", "()Z", "Ll83/a0;", "c", "()V", "a", "Lu92/d;", "Loh3/d;", "b", "Lq92/b;", "()Loh3/d;", "log", "", "value", "()I", "e", "(I)V", "onboardingCounter", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40196j {

    /* JADX INFO: renamed from: c */
    static final /* synthetic */ InterfaceC21493z[] f173494c = {AbstractC22671h0.f89337a.property1(new C22693x(C40196j.class, "log", "getLog()Ltimber/log/Timber$Tree;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d mainPrefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30070b log;

    public C40196j(C34660d mainPrefs) {
        AbstractC22676k.m65750j(mainPrefs, "mainPrefs");
        this.mainPrefs = mainPrefs;
        this.log = new C30070b("OnboardingTracker");
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC27946d m129075a() {
        return this.log.getValue(this, f173494c[0]);
    }

    /* JADX INFO: renamed from: e */
    private final void m129076e(int i13) {
        this.mainPrefs.m109541t("onboardingCounter", i13);
    }

    /* JADX INFO: renamed from: b */
    public final int m129077b() {
        return this.mainPrefs.m109531h("onboardingCounter", 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m129078c() {
        m129076e(m129077b() + 1);
        m129075a().mo84367a(AbstractC2875y.m8295h(m129077b(), "After incrementing, current count is "), new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m129079d() {
        m129075a().mo84367a("Current counter is " + m129077b() + ". Returning " + (m129077b() == 1), new Object[0]);
        return m129077b() == 1;
    }
}
