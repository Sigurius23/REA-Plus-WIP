package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010 ¨\u00066"}, m65681d2 = {"Lcom/whoop/navigation/MemberLevelInfo;", "", "", "id", "", "level", "experience", "userId", "Lcom/whoop/navigation/ProgressionLevel;", "progressionLevel", "<init>", "(JIIJLcom/whoop/navigation/ProgressionLevel;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJIIJLcom/whoop/navigation/ProgressionLevel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/MemberLevelInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "()Lcom/whoop/navigation/ProgressionLevel;", "copy", "(JIIJLcom/whoop/navigation/ProgressionLevel;)Lcom/whoop/navigation/MemberLevelInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "I", "getLevel", "getExperience", "getUserId", "Lcom/whoop/navigation/ProgressionLevel;", "getProgressionLevel", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MemberLevelInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int experience;
    private final long id;
    private final int level;
    private final ProgressionLevel progressionLevel;
    private final long userId;

    /* JADX INFO: renamed from: com.whoop.navigation.MemberLevelInfo$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/MemberLevelInfo$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/MemberLevelInfo;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MemberLevelInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MemberLevelInfo(int i13, long j7, int i14, int i15, long j13, ProgressionLevel progressionLevel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MemberLevelInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j7;
        this.level = i14;
        this.experience = i15;
        this.userId = j13;
        this.progressionLevel = progressionLevel;
    }

    public static /* synthetic */ MemberLevelInfo copy$default(MemberLevelInfo memberLevelInfo, long j7, int i13, int i14, long j13, ProgressionLevel progressionLevel, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j7 = memberLevelInfo.id;
        }
        long j14 = j7;
        if ((i15 & 2) != 0) {
            i13 = memberLevelInfo.level;
        }
        int i16 = i13;
        if ((i15 & 4) != 0) {
            i14 = memberLevelInfo.experience;
        }
        int i17 = i14;
        if ((i15 & 8) != 0) {
            j13 = memberLevelInfo.userId;
        }
        long j15 = j13;
        if ((i15 & 16) != 0) {
            progressionLevel = memberLevelInfo.progressionLevel;
        }
        return memberLevelInfo.copy(j14, i16, i17, j15, progressionLevel);
    }

    public static final /* synthetic */ void write$Self$navigation_release(MemberLevelInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.level);
        output.encodeIntElement(serialDesc, 2, self.experience);
        output.encodeLongElement(serialDesc, 3, self.userId);
        output.encodeSerializableElement(serialDesc, 4, ProgressionLevel$$serializer.INSTANCE, self.progressionLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getExperience() {
        return this.experience;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProgressionLevel getProgressionLevel() {
        return this.progressionLevel;
    }

    public final MemberLevelInfo copy(long id4, int level, int experience, long userId, ProgressionLevel progressionLevel) {
        AbstractC22676k.m65750j(progressionLevel, "progressionLevel");
        return new MemberLevelInfo(id4, level, experience, userId, progressionLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberLevelInfo)) {
            return false;
        }
        MemberLevelInfo memberLevelInfo = (MemberLevelInfo) other;
        return this.id == memberLevelInfo.id && this.level == memberLevelInfo.level && this.experience == memberLevelInfo.experience && this.userId == memberLevelInfo.userId && AbstractC22676k.m65745e(this.progressionLevel, memberLevelInfo.progressionLevel);
    }

    public final int getExperience() {
        return this.experience;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final ProgressionLevel getProgressionLevel() {
        return this.progressionLevel;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.progressionLevel.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.experience, AbstractC11266d.m30448b(this.level, Long.hashCode(this.id) * 31, 31), 31), this.userId, 31);
    }

    public String toString() {
        return "MemberLevelInfo(id=" + this.id + ", level=" + this.level + ", experience=" + this.experience + ", userId=" + this.userId + ", progressionLevel=" + this.progressionLevel + ")";
    }

    public MemberLevelInfo(long j7, int i13, int i14, long j13, ProgressionLevel progressionLevel) {
        AbstractC22676k.m65750j(progressionLevel, "progressionLevel");
        this.id = j7;
        this.level = i13;
        this.experience = i14;
        this.userId = j13;
        this.progressionLevel = progressionLevel;
    }
}
