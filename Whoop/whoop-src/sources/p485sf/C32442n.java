package p485sf;

import cf.InterfaceC4526a;
import gf.C15760a;
import gf.C15762c;
import l83.C23468n;
import mg.InterfaceC25526h;
import ng.C26672b;
import p091dg.C12002a;
import p108e4.AbstractC12667a;
import p249jc.AbstractC21598x;
import p424qg.C30334c;
import p424qg.C30335d;
import p522uf.C34893t;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.TimeMark;
import p715kotlin.time.TimeSource;
import pf.AbstractC29126d;

/* JADX INFO: renamed from: sf.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C32442n implements InterfaceC4526a {

    /* JADX INFO: renamed from: a */
    public final C34893t f134342a;

    /* JADX INFO: renamed from: b */
    public final TimeSource f134343b;

    /* JADX INFO: renamed from: c */
    public TimeMark f134344c;

    /* JADX INFO: renamed from: d */
    public TimeMark f134345d;

    /* JADX INFO: renamed from: e */
    public TimeMark f134346e;

    /* JADX INFO: renamed from: f */
    public TimeMark f134347f;

    /* JADX INFO: renamed from: g */
    public final C15762c f134348g;

    public C32442n(C34893t metrics, String str, String str2) {
        TimeSource.Monotonic timeSource = TimeSource.Monotonic.INSTANCE;
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(timeSource, "timeSource");
        this.f134342a = metrics;
        this.f134343b = timeSource;
        C15762c c15762c = new C15762c();
        c15762c.mo33083c(new C15760a("rpc.service"), str);
        c15762c.mo33083c(new C15760a("rpc.method"), str2);
        this.f134348g = c15762c;
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: b */
    public final void mo14168b(C32433e c32433e) {
        this.f134347f = this.f134343b.markNow();
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: d */
    public final void mo14170d(C32431c c32431c) {
        this.f134345d = this.f134343b.markNow();
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: f */
    public final void mo14172f(C32431c c32431c) {
        this.f134344c = this.f134343b.markNow();
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: h */
    public final void mo14174h(C32432d c32432d) {
        TimeMark timeMark = this.f134346e;
        if (timeMark != null) {
            long jMo134250elapsedNowUwyO8pc = timeMark.mo134250elapsedNowUwyO8pc();
            C34893t c34893t = this.f134342a;
            C30334c recordSeconds = c34893t.f146952h;
            ((C26672b) c34893t.f146945a.mo75076b()).getClass();
            AbstractC22676k.m65750j(recordSeconds, "$this$recordSeconds");
            C15762c attributes = this.f134348g;
            AbstractC22676k.m65750j(attributes, "attributes");
            Duration.m134275getInWholeNanosecondsimpl(jMo134250elapsedNowUwyO8pc);
        }
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: i */
    public final void mo14175i(C32434f c32434f) {
        this.f134346e = this.f134343b.markNow();
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: j */
    public final void mo14176j(C32433e c32433e) {
        AbstractC12667a.m35440L(this.f134342a.f146956l, c32433e.f134268b.getBody().mo74901a());
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: k */
    public final void mo14177k(C32429a c32429a) {
        C34893t c34893t = this.f134342a;
        C30335d c30335d = c34893t.f146947c;
        InterfaceC25526h interfaceC25526h = c34893t.f146945a;
        ((C26672b) interfaceC25526h.mo75076b()).getClass();
        c30335d.getClass();
        C15762c attributes = this.f134348g;
        AbstractC22676k.m65750j(attributes, "attributes");
        TimeMark timeMark = this.f134347f;
        if (timeMark != null) {
            long jMo134250elapsedNowUwyO8pc = timeMark.mo134250elapsedNowUwyO8pc();
            C30334c recordSeconds = c34893t.f146949e;
            ((C26672b) interfaceC25526h.mo75076b()).getClass();
            AbstractC22676k.m65750j(recordSeconds, "$this$recordSeconds");
            AbstractC22676k.m65750j(attributes, "attributes");
            Duration.m134275getInWholeNanosecondsimpl(jMo134250elapsedNowUwyO8pc);
            C12002a c12002a = c32429a.f134255e;
            C15760a key = AbstractC29126d.f117895a;
            AbstractC22676k.m65750j(c12002a, "<this>");
            AbstractC22676k.m65750j(key, "key");
            Object objMo33082b = c12002a.mo33082b(key);
            c12002a.f39588w.m44476e(key);
            Duration duration = (Duration) objMo33082b;
            if (duration != null) {
                AbstractC12667a.m35442N(c34893t.f146950f, Duration.m134290minusLRDsOJo(jMo134250elapsedNowUwyO8pc, duration.getRawValue()), attributes, 4);
            }
        }
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: l */
    public final void mo14178l(C32430b c32430b) {
        C34893t c34893t = this.f134342a;
        ((C26672b) c34893t.f146945a.mo75076b()).getClass();
        TimeMark timeMark = this.f134344c;
        C15762c attributes = this.f134348g;
        if (timeMark != null) {
            long jMo134250elapsedNowUwyO8pc = timeMark.mo134250elapsedNowUwyO8pc();
            C30334c recordSeconds = c34893t.f146946b;
            AbstractC22676k.m65750j(recordSeconds, "$this$recordSeconds");
            AbstractC22676k.m65750j(attributes, "attributes");
            Duration.m134275getInWholeNanosecondsimpl(jMo134250elapsedNowUwyO8pc);
        }
        Throwable thM68037a = C23468n.m68037a(c32430b.f134257b);
        if (thM68037a != null) {
            String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(thM68037a.getClass()).getSimpleName();
            if (simpleName != null) {
                C15762c c15762c = new C15762c();
                c15762c.mo33083c(new C15760a("exception.type"), simpleName);
                AbstractC21598x.m60675c0(c15762c, attributes);
                attributes = c15762c;
            }
            c34893t.f146948d.getClass();
            AbstractC22676k.m65750j(attributes, "attributes");
        }
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: m */
    public final void mo14179m(C32434f c32434f) {
        AbstractC12667a.m35440L(this.f134342a.f146957m, c32434f.f134272c.f159237c.mo74901a());
    }

    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: n */
    public final void mo14180n(C32433e c32433e) {
        TimeMark timeMark = this.f134345d;
        if (timeMark != null) {
            long jMo134250elapsedNowUwyO8pc = timeMark.mo134250elapsedNowUwyO8pc();
            C34893t c34893t = this.f134342a;
            C30334c recordSeconds = c34893t.f146951g;
            ((C26672b) c34893t.f146945a.mo75076b()).getClass();
            AbstractC22676k.m65750j(recordSeconds, "$this$recordSeconds");
            C15762c attributes = this.f134348g;
            AbstractC22676k.m65750j(attributes, "attributes");
            Duration.m134275getInWholeNanosecondsimpl(jMo134250elapsedNowUwyO8pc);
        }
    }
}
