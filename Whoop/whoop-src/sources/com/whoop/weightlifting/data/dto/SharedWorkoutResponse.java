package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;", "", "Lcom/whoop/design/util/TextResource;", "subtitle", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "workoutTemplate", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getSubtitle", "getSubtitle$annotations", "()V", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "getWorkoutTemplate", "getWorkoutTemplate$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SharedWorkoutResponse {

    @SerializedName("subtitle")
    private final TextResource subtitle;

    @SerializedName("template")
    private final WorkoutTemplateDto workoutTemplate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SharedWorkoutResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SharedWorkoutResponse(int i13, TextResource textResource, WorkoutTemplateDto workoutTemplateDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SharedWorkoutResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.subtitle = textResource;
        this.workoutTemplate = workoutTemplateDto;
    }

    public static /* synthetic */ SharedWorkoutResponse copy$default(SharedWorkoutResponse sharedWorkoutResponse, TextResource textResource, WorkoutTemplateDto workoutTemplateDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = sharedWorkoutResponse.subtitle;
        }
        if ((i13 & 2) != 0) {
            workoutTemplateDto = sharedWorkoutResponse.workoutTemplate;
        }
        return sharedWorkoutResponse.copy(textResource, workoutTemplateDto);
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("template")
    public static /* synthetic */ void getWorkoutTemplate$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(SharedWorkoutResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.subtitle);
        output.encodeSerializableElement(serialDesc, 1, WorkoutTemplateDto$$serializer.INSTANCE, self.workoutTemplate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkoutTemplateDto getWorkoutTemplate() {
        return this.workoutTemplate;
    }

    public final SharedWorkoutResponse copy(TextResource subtitle, WorkoutTemplateDto workoutTemplate) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        return new SharedWorkoutResponse(subtitle, workoutTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedWorkoutResponse)) {
            return false;
        }
        SharedWorkoutResponse sharedWorkoutResponse = (SharedWorkoutResponse) other;
        return AbstractC22676k.m65745e(this.subtitle, sharedWorkoutResponse.subtitle) && AbstractC22676k.m65745e(this.workoutTemplate, sharedWorkoutResponse.workoutTemplate);
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final WorkoutTemplateDto getWorkoutTemplate() {
        return this.workoutTemplate;
    }

    public int hashCode() {
        return this.workoutTemplate.hashCode() + (this.subtitle.hashCode() * 31);
    }

    public String toString() {
        return "SharedWorkoutResponse(subtitle=" + this.subtitle + ", workoutTemplate=" + this.workoutTemplate + ")";
    }

    public SharedWorkoutResponse(TextResource subtitle, WorkoutTemplateDto workoutTemplate) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        this.subtitle = subtitle;
        this.workoutTemplate = workoutTemplate;
    }
}
