package com.whoop.design.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/design/models/AchievementsBackgroundStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "EMPTY", "SLEEP", "RECOVERY", "LOW_RECOVERY", "STRAIN", "ACTIVITY", "HEALTHSPAN", "BLUE_WHITE_RED", "BRONZE", "SILVER", "GOLD", "PLATINUM", "PURPLE_AQUA", "Companion", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = AchievementsBackgroundStyleSerializer.class)
public enum AchievementsBackgroundStyle {
    DEFAULT,
    EMPTY,
    SLEEP,
    RECOVERY,
    LOW_RECOVERY,
    STRAIN,
    ACTIVITY,
    HEALTHSPAN,
    BLUE_WHITE_RED,
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM,
    PURPLE_AQUA;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/AchievementsBackgroundStyle$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/AchievementsBackgroundStyle;", "serializer", "()Lwc3/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AchievementsBackgroundStyleSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
