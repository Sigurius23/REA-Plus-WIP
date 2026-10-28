package tk2;

import e93.AbstractC12889b;
import java.time.Duration;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: tk2.r */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Ltk2/r;", "", "<init>", "()V", "Ljava/time/Duration;", "active", "", "targetSeconds", "Ltk2/s;", "a", "(Ljava/time/Duration;Ljava/lang/Long;)Ltk2/s;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33900r {

    /* JADX INFO: renamed from: a */
    public static final C33900r f142071a = new C33900r();

    private C33900r() {
    }

    /* JADX INFO: renamed from: a */
    public final C33901s m107248a(Duration active, Long targetSeconds) {
        Duration durationOfSeconds;
        AbstractC22676k.m65750j(active, "active");
        if (targetSeconds != null) {
            if (targetSeconds.longValue() <= 0) {
                targetSeconds = null;
            }
            if (targetSeconds != null && (durationOfSeconds = Duration.ofSeconds(targetSeconds.longValue())) != null) {
                return new C33901s(C33887e.f141968a.m107175a(durationOfSeconds), new C33896n(AbstractC12889b.m36258X(AbstractC12889b.m36283m((float) (active.getSeconds() / durationOfSeconds.getSeconds()), 0.0f, 1.0f) * 1000), 1000, EnumC39333f.BRAND_WHITE, null, 0.0f, 0, false, 120, null));
            }
        }
        return new C33901s(null, null, 3, null);
    }
}
