package oe1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: oe1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Loe1/b;", "", "Lz82/b;", "analyticsManager", "<init>", "(Lz82/b;)V", "Loe1/a;", "analyticsEvent", "Ll83/a0;", "a", "(Loe1/a;)V", "Lz82/b;", "b", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27872b {

    /* JADX INFO: renamed from: c */
    public static final int f112386c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    public C27872b(InterfaceC40188b analyticsManager) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m84134a(InterfaceC27871a analyticsEvent) {
        AbstractC22676k.m65750j(analyticsEvent, "analyticsEvent");
        this.analyticsManager.mo41428k(analyticsEvent.getCategory(), analyticsEvent.getAction(), analyticsEvent.getLabel(), analyticsEvent.getEventName(), analyticsEvent.mo84133d());
    }
}
