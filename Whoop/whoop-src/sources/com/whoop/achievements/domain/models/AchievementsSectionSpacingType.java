package com.whoop.achievements.domain.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LARGE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;", "", "Ly3/f;", "spacing", "<init>", "(Ljava/lang/String;IF)V", "F", "getSpacing-D9Ej5fM", "()F", "LARGE", "NORMAL", "COMPACT", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AchievementsSectionSpacingType {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ AchievementsSectionSpacingType[] $VALUES;
    public static final AchievementsSectionSpacingType COMPACT;
    public static final AchievementsSectionSpacingType LARGE;
    public static final AchievementsSectionSpacingType NORMAL;
    private final float spacing;

    private static final /* synthetic */ AchievementsSectionSpacingType[] $values() {
        return new AchievementsSectionSpacingType[]{LARGE, NORMAL, COMPACT};
    }

    static {
        float f13 = 4;
        LARGE = new AchievementsSectionSpacingType("LARGE", 0, 16 * f13);
        NORMAL = new AchievementsSectionSpacingType("NORMAL", 1, 8 * f13);
        COMPACT = new AchievementsSectionSpacingType("COMPACT", 2, 6 * f13);
        AchievementsSectionSpacingType[] achievementsSectionSpacingTypeArr$values = $values();
        $VALUES = achievementsSectionSpacingTypeArr$values;
        $ENTRIES = AbstractC15751g.m44468u(achievementsSectionSpacingTypeArr$values);
    }

    private AchievementsSectionSpacingType(String str, int i13, float f13) {
        super(str, i13);
        this.spacing = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static AchievementsSectionSpacingType valueOf(String str) {
        return (AchievementsSectionSpacingType) Enum.valueOf(AchievementsSectionSpacingType.class, str);
    }

    public static AchievementsSectionSpacingType[] values() {
        return (AchievementsSectionSpacingType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSpacing() {
        return this.spacing;
    }
}
