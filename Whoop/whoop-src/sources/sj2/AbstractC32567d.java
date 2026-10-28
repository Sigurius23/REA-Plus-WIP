package sj2;

import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: sj2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Lkotlin/time/Duration;", "a", "J", "ON_CANCEL_TIMEOUT", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32567d {

    /* JADX INFO: renamed from: a */
    private static final long f134944a;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f134944a = DurationKt.toDuration(30, DurationUnit.SECONDS);
    }
}
