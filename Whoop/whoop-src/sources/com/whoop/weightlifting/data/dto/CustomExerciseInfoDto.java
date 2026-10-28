package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "", "Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;", "linkedExercise", "<init>", "(Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weightlifting/data/dto/LinkedExerciseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;", "copy", "(Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;)Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;", "getLinkedExercise", "getLinkedExercise$annotations", "()V", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomExerciseInfoDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("linked_exercise")
    private final LinkedExerciseDto linkedExercise;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomExerciseInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomExerciseInfoDto(int i13, LinkedExerciseDto linkedExerciseDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CustomExerciseInfoDto$$serializer.INSTANCE.getDescriptor());
        }
        this.linkedExercise = linkedExerciseDto;
    }

    public static /* synthetic */ CustomExerciseInfoDto copy$default(CustomExerciseInfoDto customExerciseInfoDto, LinkedExerciseDto linkedExerciseDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            linkedExerciseDto = customExerciseInfoDto.linkedExercise;
        }
        return customExerciseInfoDto.copy(linkedExerciseDto);
    }

    @InterfaceC37143h("linked_exercise")
    public static /* synthetic */ void getLinkedExercise$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkedExerciseDto getLinkedExercise() {
        return this.linkedExercise;
    }

    public final CustomExerciseInfoDto copy(LinkedExerciseDto linkedExercise) {
        return new CustomExerciseInfoDto(linkedExercise);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomExerciseInfoDto) && AbstractC22676k.m65745e(this.linkedExercise, ((CustomExerciseInfoDto) other).linkedExercise);
    }

    public final LinkedExerciseDto getLinkedExercise() {
        return this.linkedExercise;
    }

    public int hashCode() {
        LinkedExerciseDto linkedExerciseDto = this.linkedExercise;
        if (linkedExerciseDto == null) {
            return 0;
        }
        return linkedExerciseDto.hashCode();
    }

    public String toString() {
        return "CustomExerciseInfoDto(linkedExercise=" + this.linkedExercise + ")";
    }

    public CustomExerciseInfoDto(LinkedExerciseDto linkedExerciseDto) {
        this.linkedExercise = linkedExerciseDto;
    }
}
