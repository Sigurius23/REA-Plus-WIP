package jt2;

import java.util.Locale;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jt2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ljt2/n;", "", "Ljt2/q;", "metricSliderMatcher", "Lls2/b;", "analyticHelper", "<init>", "(Ljt2/q;Lls2/b;)V", "Ljt2/p;", "domainAction", "Ljt2/j;", "domainState", "a", "(Ljt2/p;Ljt2/j;)Ljt2/j;", "Ll83/a0;", "c", "()V", "", "action", "b", "(Ljava/lang/String;)V", "Ljt2/q;", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21952n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24717b analyticHelper;

    public C21952n(C21955q metricSliderMatcher, C24717b analyticHelper) {
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.metricSliderMatcher = metricSliderMatcher;
        this.analyticHelper = analyticHelper;
    }

    /* JADX INFO: renamed from: a */
    public final C21948j m62641a(AbstractC21954p domainAction, C21948j domainState) {
        AbstractC22676k.m65750j(domainAction, "domainAction");
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainAction instanceof AbstractC21954p.a) {
            m62642b("Add");
            return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, AbstractC25265s.m74128f1(Integer.valueOf(((AbstractC21954p.a) domainAction).getId()), domainState.getAccumulatedStateForVS().m62553t()), null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097149, null), 1, null);
        }
        if (domainAction instanceof AbstractC21954p.r) {
            m62642b("Remove");
            return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), null, AbstractC25265s.m74124b1(domainState.getAccumulatedStateForVS().m62553t(), Integer.valueOf(((AbstractC21954p.r) domainAction).getId())), null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097149, null), 1, null);
        }
        if (!(domainAction instanceof AbstractC21954p.n)) {
            return domainState;
        }
        m62643c();
        return C21948j.m62591b(domainState, null, C21942d.m62534b(domainState.getAccumulatedStateForVS(), domainState.getAccumulatedStateForVS().m62553t(), domainState.getAccumulatedStateForVS().m62553t(), null, this.metricSliderMatcher.m62676e(domainState), this.metricSliderMatcher.m62676e(domainState), null, null, null, null, null, null, true, null, false, null, null, null, null, null, null, null, 2095076, null), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m62642b(String action) {
        AbstractC22676k.m65750j(action, "action");
        C24717b c24717b = this.analyticHelper;
        String lowerCase = "Metrics".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        c24717b.m72377q(new AbstractC24716a.d(action, lowerCase));
    }

    /* JADX INFO: renamed from: c */
    public final void m62643c() {
        C24717b c24717b = this.analyticHelper;
        String lowerCase = "Metrics".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        c24717b.m72377q(new AbstractC24716a.d("Save", lowerCase));
    }
}
