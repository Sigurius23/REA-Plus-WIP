package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;", "", "Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;", "currentProgressPercentage", "Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;", "currentProgressSteps", "<init>", "(Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "toCircularProgressIndicator", "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "component1", "()Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;", "component2", "()Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;", "copy", "(Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;)Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/dto/CurrentProgressPercentageDto;", "getCurrentProgressPercentage", "Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;", "getCurrentProgressSteps", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CircularProgressIndicatorDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("current_progress_percentage")
    private final CurrentProgressPercentageDto currentProgressPercentage;

    @SerializedName("current_progress_steps")
    private final CurrentProgressStepsDto currentProgressSteps;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/CircularProgressIndicatorDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CircularProgressIndicatorDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CircularProgressIndicatorDto(int i13, CurrentProgressPercentageDto currentProgressPercentageDto, CurrentProgressStepsDto currentProgressStepsDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CircularProgressIndicatorDto$$serializer.INSTANCE.getDescriptor());
        }
        this.currentProgressPercentage = currentProgressPercentageDto;
        this.currentProgressSteps = currentProgressStepsDto;
    }

    public static /* synthetic */ CircularProgressIndicatorDto copy$default(CircularProgressIndicatorDto circularProgressIndicatorDto, CurrentProgressPercentageDto currentProgressPercentageDto, CurrentProgressStepsDto currentProgressStepsDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            currentProgressPercentageDto = circularProgressIndicatorDto.currentProgressPercentage;
        }
        if ((i13 & 2) != 0) {
            currentProgressStepsDto = circularProgressIndicatorDto.currentProgressSteps;
        }
        return circularProgressIndicatorDto.copy(currentProgressPercentageDto, currentProgressStepsDto);
    }

    public static final /* synthetic */ void write$Self$core_release(CircularProgressIndicatorDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, CurrentProgressPercentageDto$$serializer.INSTANCE, self.currentProgressPercentage);
        output.encodeNullableSerializableElement(serialDesc, 1, CurrentProgressStepsDto$$serializer.INSTANCE, self.currentProgressSteps);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CurrentProgressPercentageDto getCurrentProgressPercentage() {
        return this.currentProgressPercentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CurrentProgressStepsDto getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    public final CircularProgressIndicatorDto copy(CurrentProgressPercentageDto currentProgressPercentage, CurrentProgressStepsDto currentProgressSteps) {
        return new CircularProgressIndicatorDto(currentProgressPercentage, currentProgressSteps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircularProgressIndicatorDto)) {
            return false;
        }
        CircularProgressIndicatorDto circularProgressIndicatorDto = (CircularProgressIndicatorDto) other;
        return AbstractC22676k.m65745e(this.currentProgressPercentage, circularProgressIndicatorDto.currentProgressPercentage) && AbstractC22676k.m65745e(this.currentProgressSteps, circularProgressIndicatorDto.currentProgressSteps);
    }

    public final CurrentProgressPercentageDto getCurrentProgressPercentage() {
        return this.currentProgressPercentage;
    }

    public final CurrentProgressStepsDto getCurrentProgressSteps() {
        return this.currentProgressSteps;
    }

    public int hashCode() {
        CurrentProgressPercentageDto currentProgressPercentageDto = this.currentProgressPercentage;
        int iHashCode = (currentProgressPercentageDto == null ? 0 : currentProgressPercentageDto.hashCode()) * 31;
        CurrentProgressStepsDto currentProgressStepsDto = this.currentProgressSteps;
        return iHashCode + (currentProgressStepsDto != null ? currentProgressStepsDto.hashCode() : 0);
    }

    public final CircularProgressIndicator toCircularProgressIndicator() {
        CurrentProgressPercentageDto currentProgressPercentageDto = this.currentProgressPercentage;
        CurrentProgressPercentage currentProgressPercentage = currentProgressPercentageDto != null ? currentProgressPercentageDto.toCurrentProgressPercentage() : null;
        CurrentProgressStepsDto currentProgressStepsDto = this.currentProgressSteps;
        return new CircularProgressIndicator(currentProgressPercentage, currentProgressStepsDto != null ? currentProgressStepsDto.toCurrentProgressSteps() : null);
    }

    public String toString() {
        return "CircularProgressIndicatorDto(currentProgressPercentage=" + this.currentProgressPercentage + ", currentProgressSteps=" + this.currentProgressSteps + ")";
    }

    public CircularProgressIndicatorDto(CurrentProgressPercentageDto currentProgressPercentageDto, CurrentProgressStepsDto currentProgressStepsDto) {
        this.currentProgressPercentage = currentProgressPercentageDto;
        this.currentProgressSteps = currentProgressStepsDto;
    }
}
