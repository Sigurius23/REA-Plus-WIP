package pu1;

import lu1.C24748a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qu1.InterfaceC30627c;

/* JADX INFO: renamed from: pu1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lpu1/a;", "", "Llu1/a;", "analytics", "<init>", "(Llu1/a;)V", "Lqu1/c;", "actionEvent", "a", "(Lqu1/c;)Lqu1/c;", "Llu1/a;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29552a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24748a analytics;

    public C29552a(C24748a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC30627c m90508a(InterfaceC30627c actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC30627c.a) {
            this.analytics.m72470b((InterfaceC30627c.a) actionEvent);
        }
        return actionEvent;
    }
}
