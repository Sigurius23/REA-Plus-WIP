package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.WorkoutTemplateOverview;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010!R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u001fR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u001f¨\u0006="}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;", "", "", "workoutTemplateKey", "", "name", "userId", "createdAt", "updatedAt", "<init>", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;", "toWorkoutTemplate", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "component5", "copy", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWorkoutTemplateKey", "getWorkoutTemplateKey$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "Ljava/lang/Long;", "getUserId", "getUserId$annotations", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutTemplateOverviewDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("name")
    private final String name;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("user_id")
    private final Long userId;

    @SerializedName("workout_template_key")
    private final long workoutTemplateKey;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutTemplateOverviewDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WorkoutTemplateOverviewDto(int i13, long j7, String str, Long l7, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, WorkoutTemplateOverviewDto$$serializer.INSTANCE.getDescriptor());
        }
        this.workoutTemplateKey = j7;
        this.name = str;
        this.userId = l7;
        this.createdAt = str2;
        this.updatedAt = str3;
    }

    public static /* synthetic */ WorkoutTemplateOverviewDto copy$default(WorkoutTemplateOverviewDto workoutTemplateOverviewDto, long j7, String str, Long l7, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = workoutTemplateOverviewDto.workoutTemplateKey;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = workoutTemplateOverviewDto.name;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            l7 = workoutTemplateOverviewDto.userId;
        }
        Long l12 = l7;
        if ((i13 & 8) != 0) {
            str2 = workoutTemplateOverviewDto.createdAt;
        }
        String str5 = str2;
        if ((i13 & 16) != 0) {
            str3 = workoutTemplateOverviewDto.updatedAt;
        }
        return workoutTemplateOverviewDto.copy(j13, str4, l12, str5, str3);
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @InterfaceC37143h("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @InterfaceC37143h("workout_template_key")
    public static /* synthetic */ void getWorkoutTemplateKey$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutTemplateOverviewDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.workoutTemplateKey);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.userId);
        output.encodeStringElement(serialDesc, 3, self.createdAt);
        output.encodeStringElement(serialDesc, 4, self.updatedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final WorkoutTemplateOverviewDto copy(long workoutTemplateKey, String name, Long userId, String createdAt, String updatedAt) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new WorkoutTemplateOverviewDto(workoutTemplateKey, name, userId, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutTemplateOverviewDto)) {
            return false;
        }
        WorkoutTemplateOverviewDto workoutTemplateOverviewDto = (WorkoutTemplateOverviewDto) other;
        return this.workoutTemplateKey == workoutTemplateOverviewDto.workoutTemplateKey && AbstractC22676k.m65745e(this.name, workoutTemplateOverviewDto.name) && AbstractC22676k.m65745e(this.userId, workoutTemplateOverviewDto.userId) && AbstractC22676k.m65745e(this.createdAt, workoutTemplateOverviewDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, workoutTemplateOverviewDto.updatedAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final long getWorkoutTemplateKey() {
        return this.workoutTemplateKey;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.workoutTemplateKey) * 31, 31, this.name);
        Long l7 = this.userId;
        return this.updatedAt.hashCode() + AbstractC11266d.m30450d((iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.createdAt);
    }

    public String toString() {
        long j7 = this.workoutTemplateKey;
        String str = this.name;
        Long l7 = this.userId;
        String str2 = this.createdAt;
        String str3 = this.updatedAt;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("WorkoutTemplateOverviewDto(workoutTemplateKey=", ", name=", j7, str);
        sbM114685m.append(", userId=");
        sbM114685m.append(l7);
        sbM114685m.append(", createdAt=");
        sbM114685m.append(str2);
        return AbstractC2875y.m8304q(sbM114685m, ", updatedAt=", str3, ")");
    }

    public final WorkoutTemplateOverview toWorkoutTemplate() {
        return new WorkoutTemplateOverview(this.workoutTemplateKey, this.name, this.userId, this.createdAt, this.updatedAt);
    }

    public WorkoutTemplateOverviewDto(long j7, String name, Long l7, String createdAt, String updatedAt) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.workoutTemplateKey = j7;
        this.name = name;
        this.userId = l7;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
