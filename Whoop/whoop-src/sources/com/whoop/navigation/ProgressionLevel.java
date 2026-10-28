package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010\u001aR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010!¨\u0006="}, m65681d2 = {"Lcom/whoop/navigation/ProgressionLevel;", "", "", "tier", "", "level", "badge", "miniBadge", "minimumExperience", "maximumExperience", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ProgressionLevel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/whoop/navigation/ProgressionLevel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTier", "getTier$annotations", "()V", "I", "getLevel", "getLevel$annotations", "getBadge", "getBadge$annotations", "getMiniBadge", "getMiniBadge$annotations", "getMinimumExperience", "getMinimumExperience$annotations", "Ljava/lang/Integer;", "getMaximumExperience", "getMaximumExperience$annotations", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressionLevel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String badge;
    private final int level;
    private final Integer maximumExperience;
    private final String miniBadge;
    private final int minimumExperience;
    private final String tier;

    /* JADX INFO: renamed from: com.whoop.navigation.ProgressionLevel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ProgressionLevel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ProgressionLevel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressionLevel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressionLevel(int i13, String str, int i14, String str2, String str3, int i15, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ProgressionLevel$$serializer.INSTANCE.getDescriptor());
        }
        this.tier = str;
        this.level = i14;
        this.badge = str2;
        this.miniBadge = str3;
        this.minimumExperience = i15;
        if ((i13 & 32) == 0) {
            this.maximumExperience = null;
        } else {
            this.maximumExperience = num;
        }
    }

    public static /* synthetic */ ProgressionLevel copy$default(ProgressionLevel progressionLevel, String str, int i13, String str2, String str3, int i14, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = progressionLevel.tier;
        }
        if ((i15 & 2) != 0) {
            i13 = progressionLevel.level;
        }
        if ((i15 & 4) != 0) {
            str2 = progressionLevel.badge;
        }
        if ((i15 & 8) != 0) {
            str3 = progressionLevel.miniBadge;
        }
        if ((i15 & 16) != 0) {
            i14 = progressionLevel.minimumExperience;
        }
        if ((i15 & 32) != 0) {
            num = progressionLevel.maximumExperience;
        }
        int i16 = i14;
        Integer num2 = num;
        return progressionLevel.copy(str, i13, str2, str3, i16, num2);
    }

    @InterfaceC37143h("badge")
    public static /* synthetic */ void getBadge$annotations() {
    }

    @InterfaceC37143h("level")
    public static /* synthetic */ void getLevel$annotations() {
    }

    @InterfaceC37143h("maximum_experience")
    public static /* synthetic */ void getMaximumExperience$annotations() {
    }

    @InterfaceC37143h("mini_badge")
    public static /* synthetic */ void getMiniBadge$annotations() {
    }

    @InterfaceC37143h("minimum_experience")
    public static /* synthetic */ void getMinimumExperience$annotations() {
    }

    @InterfaceC37143h("tier")
    public static /* synthetic */ void getTier$annotations() {
    }

    public static final /* synthetic */ void write$Self$navigation_release(ProgressionLevel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.tier);
        output.encodeIntElement(serialDesc, 1, self.level);
        output.encodeStringElement(serialDesc, 2, self.badge);
        output.encodeStringElement(serialDesc, 3, self.miniBadge);
        output.encodeIntElement(serialDesc, 4, self.minimumExperience);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.maximumExperience == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.maximumExperience);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTier() {
        return this.tier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMiniBadge() {
        return this.miniBadge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinimumExperience() {
        return this.minimumExperience;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaximumExperience() {
        return this.maximumExperience;
    }

    public final ProgressionLevel copy(String tier, int level, String badge, String miniBadge, int minimumExperience, Integer maximumExperience) {
        AbstractC22676k.m65750j(tier, "tier");
        AbstractC22676k.m65750j(badge, "badge");
        AbstractC22676k.m65750j(miniBadge, "miniBadge");
        return new ProgressionLevel(tier, level, badge, miniBadge, minimumExperience, maximumExperience);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressionLevel)) {
            return false;
        }
        ProgressionLevel progressionLevel = (ProgressionLevel) other;
        return AbstractC22676k.m65745e(this.tier, progressionLevel.tier) && this.level == progressionLevel.level && AbstractC22676k.m65745e(this.badge, progressionLevel.badge) && AbstractC22676k.m65745e(this.miniBadge, progressionLevel.miniBadge) && this.minimumExperience == progressionLevel.minimumExperience && AbstractC22676k.m65745e(this.maximumExperience, progressionLevel.maximumExperience);
    }

    public final String getBadge() {
        return this.badge;
    }

    public final int getLevel() {
        return this.level;
    }

    public final Integer getMaximumExperience() {
        return this.maximumExperience;
    }

    public final String getMiniBadge() {
        return this.miniBadge;
    }

    public final int getMinimumExperience() {
        return this.minimumExperience;
    }

    public final String getTier() {
        return this.tier;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.minimumExperience, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.level, this.tier.hashCode() * 31, 31), 31, this.badge), 31, this.miniBadge), 31);
        Integer num = this.maximumExperience;
        return iM30448b + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.tier;
        int i13 = this.level;
        String str2 = this.badge;
        String str3 = this.miniBadge;
        int i14 = this.minimumExperience;
        Integer num = this.maximumExperience;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ProgressionLevel(tier=", str, ", level=", ", badge=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", miniBadge=", str3, ", minimumExperience=");
        sbM30467u.append(i14);
        sbM30467u.append(", maximumExperience=");
        sbM30467u.append(num);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public ProgressionLevel(String tier, int i13, String badge, String miniBadge, int i14, Integer num) {
        AbstractC22676k.m65750j(tier, "tier");
        AbstractC22676k.m65750j(badge, "badge");
        AbstractC22676k.m65750j(miniBadge, "miniBadge");
        this.tier = tier;
        this.level = i13;
        this.badge = badge;
        this.miniBadge = miniBadge;
        this.minimumExperience = i14;
        this.maximumExperience = num;
    }

    public /* synthetic */ ProgressionLevel(String str, int i13, String str2, String str3, int i14, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, str3, i14, (i15 & 32) != 0 ? null : num);
    }
}
