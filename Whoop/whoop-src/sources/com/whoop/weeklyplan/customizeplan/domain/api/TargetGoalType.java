package com.whoop.weeklyplan.customizeplan.domain.api;

import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "", HMSTrackSource.SCREEN, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getScreen", "()Ljava/lang/String;", "STEPS", "SLEEP_PERFORMANCE", "SLEEP_CONSISTENCY", "SLEEP_HOURS", "STRAIN", "STRENGTH_TRAINING_TIME", "ACTIVITIES", "BEHAVIORS", "WEIGHT", "METRIC", "HR_ZONES_ONE_TO_THREE", "HR_ZONES_FOUR_TO_FIVE", "Companion", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum TargetGoalType {
    STEPS("STEPS"),
    SLEEP_PERFORMANCE("SLEEP_PERFORMANCE"),
    SLEEP_CONSISTENCY("SLEEP_CONSISTENCY"),
    SLEEP_HOURS("SLEEP_HOURS"),
    STRAIN("STRAIN"),
    STRENGTH_TRAINING_TIME("STRENGTH_TRAINING_TIME"),
    ACTIVITIES("ACTIVITIES"),
    BEHAVIORS("BEHAVIORS"),
    WEIGHT("WEIGHT"),
    METRIC("METRIC"),
    HR_ZONES_ONE_TO_THREE("HR_ZONES_ONE_TO_THREE"),
    HR_ZONES_FOUR_TO_FIVE("HR_ZONES_FOUR_TO_FIVE");

    private final String screen;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(0));

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) TargetGoalType.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    TargetGoalType(String str) {
        this.screen = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getScreen() {
        return this.screen;
    }
}
