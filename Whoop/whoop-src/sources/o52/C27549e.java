package o52;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: o52.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, m65681d2 = {"Lo52/e;", "", "<init>", "()V", "", "a", "()Z", "Ll83/a0;", "b", "", "Ljava/lang/Long;", "lockTime", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27549e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Long lockTime;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m83141a() {
        boolean z4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l7 = this.lockTime;
        z4 = true;
        if (l7 != null && jCurrentTimeMillis - l7.longValue() <= 2000) {
            z4 = false;
        }
        return z4;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m83142b() {
        this.lockTime = null;
    }
}
