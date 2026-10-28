package p715kotlin.time;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005J\n\u0010\u0002\u001a\u00020\u0003H¦\u0080\u0004¨\u0006\u0006"}, m65681d2 = {"Lkotlin/time/Clock;", "", "now", "Lkotlin/time/Instant;", "System", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface Clock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkotlin/time/Clock$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005H\u0096\u0080\u0004¨\u0006\u0006"}, m65681d2 = {"Lkotlin/time/Clock$System;", "Lkotlin/time/Clock;", "<init>", "()V", "now", "Lkotlin/time/Instant;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class System implements Clock {
        public static final System INSTANCE = new System();

        private System() {
        }

        @Override // p715kotlin.time.Clock
        public Instant now() {
            return InstantJvmKt.systemClockNow();
        }
    }

    Instant now();
}
