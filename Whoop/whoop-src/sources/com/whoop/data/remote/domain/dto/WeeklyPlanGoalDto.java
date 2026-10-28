package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.WeeklyPlanGoal;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u001c¨\u0006,"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "", "Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;", "circularProgressIndicator", "", "isAvoided", "<init>", "(Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "toWeeklyPlanGoal", "()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "component1", "()Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;", "component2", "()Z", "copy", "(Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;Z)Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;", "getCircularProgressIndicator", "Z", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeeklyPlanGoalDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("circular_progress_indicator")
    private final CircularProgressIndicatorDto circularProgressIndicator;

    @SerializedName("is_avoided")
    private final boolean isAvoided;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeeklyPlanGoalDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeeklyPlanGoalDto(int i13, CircularProgressIndicatorDto circularProgressIndicatorDto, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, WeeklyPlanGoalDto$$serializer.INSTANCE.getDescriptor());
        }
        this.circularProgressIndicator = circularProgressIndicatorDto;
        this.isAvoided = z4;
    }

    public static /* synthetic */ WeeklyPlanGoalDto copy$default(WeeklyPlanGoalDto weeklyPlanGoalDto, CircularProgressIndicatorDto circularProgressIndicatorDto, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            circularProgressIndicatorDto = weeklyPlanGoalDto.circularProgressIndicator;
        }
        if ((i13 & 2) != 0) {
            z4 = weeklyPlanGoalDto.isAvoided;
        }
        return weeklyPlanGoalDto.copy(circularProgressIndicatorDto, z4);
    }

    public static final /* synthetic */ void write$Self$core_release(WeeklyPlanGoalDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, CircularProgressIndicatorDto$$serializer.INSTANCE, self.circularProgressIndicator);
        output.encodeBooleanElement(serialDesc, 1, self.isAvoided);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CircularProgressIndicatorDto getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAvoided() {
        return this.isAvoided;
    }

    public final WeeklyPlanGoalDto copy(CircularProgressIndicatorDto circularProgressIndicator, boolean isAvoided) {
        return new WeeklyPlanGoalDto(circularProgressIndicator, isAvoided);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyPlanGoalDto)) {
            return false;
        }
        WeeklyPlanGoalDto weeklyPlanGoalDto = (WeeklyPlanGoalDto) other;
        return AbstractC22676k.m65745e(this.circularProgressIndicator, weeklyPlanGoalDto.circularProgressIndicator) && this.isAvoided == weeklyPlanGoalDto.isAvoided;
    }

    public final CircularProgressIndicatorDto getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public int hashCode() {
        CircularProgressIndicatorDto circularProgressIndicatorDto = this.circularProgressIndicator;
        return Boolean.hashCode(this.isAvoided) + ((circularProgressIndicatorDto == null ? 0 : circularProgressIndicatorDto.hashCode()) * 31);
    }

    public final boolean isAvoided() {
        return this.isAvoided;
    }

    public String toString() {
        return "WeeklyPlanGoalDto(circularProgressIndicator=" + this.circularProgressIndicator + ", isAvoided=" + this.isAvoided + ")";
    }

    public final WeeklyPlanGoal toWeeklyPlanGoal() {
        CircularProgressIndicatorDto circularProgressIndicatorDto = this.circularProgressIndicator;
        return new WeeklyPlanGoal(circularProgressIndicatorDto != null ? circularProgressIndicatorDto.toCircularProgressIndicator() : null, this.isAvoided);
    }

    public WeeklyPlanGoalDto(CircularProgressIndicatorDto circularProgressIndicatorDto, boolean z4) {
        this.circularProgressIndicator = circularProgressIndicatorDto;
        this.isAvoided = z4;
    }
}
