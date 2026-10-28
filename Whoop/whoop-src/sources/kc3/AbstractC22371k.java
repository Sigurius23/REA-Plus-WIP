package kc3;

import hc3.AbstractC17167b;
import hc3.AbstractC17192y;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: kc3.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22371k {

    /* JADX INFO: renamed from: a */
    public static final String f87324a;

    /* JADX INFO: renamed from: b */
    public static final long f87325b;

    /* JADX INFO: renamed from: c */
    public static final int f87326c;

    /* JADX INFO: renamed from: d */
    public static final int f87327d;

    /* JADX INFO: renamed from: e */
    public static final long f87328e;

    /* JADX INFO: renamed from: f */
    public static final C22367g f87329f;

    static {
        String property;
        int i13 = AbstractC17192y.f66011a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f87324a = property;
        f87325b = AbstractC17167b.m48484j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i14 = AbstractC17192y.f66011a;
        if (i14 < 2) {
            i14 = 2;
        }
        f87326c = AbstractC17167b.m48485k(i14, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f87327d = AbstractC17167b.m48485k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f87328e = TimeUnit.SECONDS.toNanos(AbstractC17167b.m48484j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f87329f = C22367g.f87319a;
    }
}
