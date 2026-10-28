package us0;

import fi0.InterfaceC14515a;
import java.time.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: us0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lus0/f;", "", "Lfi0/a;", "baseAnalytics", "Ljava/time/Clock;", "clock", "<init>", "(Lfi0/a;Ljava/time/Clock;)V", "", "", "", "a", "()Ljava/util/Map;", "Ll83/a0;", "c", "()V", "b", "Lfi0/a;", "Ljava/time/Clock;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35210f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    public C35210f(InterfaceC14515a baseAnalytics, Clock clock) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(clock, "clock");
        this.baseAnalytics = baseAnalytics;
        this.clock = clock;
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, Long> m111552a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Timestamp", Long.valueOf(this.clock.millis()));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final void m111553b() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", "Silent Recovery Processed Push Received", null, "Process Now Sync", null, m111552a(), 20, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m111554c() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Connectivity", "Send", null, "Process Now Sync", null, m111552a(), 20, null);
    }
}
