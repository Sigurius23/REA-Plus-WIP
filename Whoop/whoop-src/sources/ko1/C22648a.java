package ko1;

import ho1.C17537a;
import lo1.InterfaceC24616a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ko1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lko1/a;", "", "Lho1/a;", "analytics", "<init>", "(Lho1/a;)V", "Llo1/a;", "actionEvent", "a", "(Llo1/a;)Llo1/a;", "Lho1/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22648a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17537a analytics;

    public C22648a(C17537a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC24616a m65605a(InterfaceC24616a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC24616a.a) {
            this.analytics.m49840f((InterfaceC24616a.a) actionEvent);
        }
        return actionEvent;
    }
}
