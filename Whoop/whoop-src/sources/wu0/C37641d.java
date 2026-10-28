package wu0;

import js0.AbstractC21907a;
import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: wu0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lwu0/d;", "Ljs0/a;", "", "<init>", "()V", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37641d extends AbstractC21907a<Long> {

    /* JADX INFO: renamed from: a */
    public static final C37641d f161196a = new C37641d();

    /* JADX INFO: renamed from: b */
    public static final int f161197b = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C37641d() {
        super("OFF_BODY_NOTIFICATION_DELAY", Long.valueOf(Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(10, DurationUnit.MINUTES))));
        Duration.Companion companion = Duration.INSTANCE;
    }
}
