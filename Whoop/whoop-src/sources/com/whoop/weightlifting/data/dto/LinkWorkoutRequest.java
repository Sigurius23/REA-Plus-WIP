package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010 ¨\u00069"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;", "", "", "activityId", "", "templateId", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "template", "", "rpe", "<init>", "(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityId", "getActivityId$annotations", "()V", "J", "getTemplateId", "getTemplateId$annotations", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "getTemplate", "getTemplate$annotations", "Ljava/lang/Integer;", "getRpe", "getRpe$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LinkWorkoutRequest {

    @SerializedName("activity_id")
    private final String activityId;

    @SerializedName("rpe")
    private final Integer rpe;

    @SerializedName("template")
    private final WorkoutTemplateDto template;

    @SerializedName("template_id")
    private final long templateId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LinkWorkoutRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LinkWorkoutRequest(int i13, String str, long j7, WorkoutTemplateDto workoutTemplateDto, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, LinkWorkoutRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.activityId = str;
        this.templateId = j7;
        this.template = workoutTemplateDto;
        if ((i13 & 8) == 0) {
            this.rpe = null;
        } else {
            this.rpe = num;
        }
    }

    public static /* synthetic */ LinkWorkoutRequest copy$default(LinkWorkoutRequest linkWorkoutRequest, String str, long j7, WorkoutTemplateDto workoutTemplateDto, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = linkWorkoutRequest.activityId;
        }
        if ((i13 & 2) != 0) {
            j7 = linkWorkoutRequest.templateId;
        }
        if ((i13 & 4) != 0) {
            workoutTemplateDto = linkWorkoutRequest.template;
        }
        if ((i13 & 8) != 0) {
            num = linkWorkoutRequest.rpe;
        }
        return linkWorkoutRequest.copy(str, j7, workoutTemplateDto, num);
    }

    @InterfaceC37143h("activity_id")
    public static /* synthetic */ void getActivityId$annotations() {
    }

    @InterfaceC37143h("rpe")
    public static /* synthetic */ void getRpe$annotations() {
    }

    @InterfaceC37143h("template")
    public static /* synthetic */ void getTemplate$annotations() {
    }

    @InterfaceC37143h("template_id")
    public static /* synthetic */ void getTemplateId$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(LinkWorkoutRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activityId);
        output.encodeLongElement(serialDesc, 1, self.templateId);
        output.encodeSerializableElement(serialDesc, 2, WorkoutTemplateDto$$serializer.INSTANCE, self.template);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.rpe == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.rpe);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WorkoutTemplateDto getTemplate() {
        return this.template;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getRpe() {
        return this.rpe;
    }

    public final LinkWorkoutRequest copy(String activityId, long templateId, WorkoutTemplateDto template, Integer rpe) {
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(template, "template");
        return new LinkWorkoutRequest(activityId, templateId, template, rpe);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkWorkoutRequest)) {
            return false;
        }
        LinkWorkoutRequest linkWorkoutRequest = (LinkWorkoutRequest) other;
        return AbstractC22676k.m65745e(this.activityId, linkWorkoutRequest.activityId) && this.templateId == linkWorkoutRequest.templateId && AbstractC22676k.m65745e(this.template, linkWorkoutRequest.template) && AbstractC22676k.m65745e(this.rpe, linkWorkoutRequest.rpe);
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final Integer getRpe() {
        return this.rpe;
    }

    public final WorkoutTemplateDto getTemplate() {
        return this.template;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        int iHashCode = (this.template.hashCode() + AbstractC11266d.m30451e(this.activityId.hashCode() * 31, this.templateId, 31)) * 31;
        Integer num = this.rpe;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.activityId;
        long j7 = this.templateId;
        WorkoutTemplateDto workoutTemplateDto = this.template;
        Integer num = this.rpe;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("LinkWorkoutRequest(activityId=", str, j7, ", templateId=");
        sbM32000s.append(", template=");
        sbM32000s.append(workoutTemplateDto);
        sbM32000s.append(", rpe=");
        sbM32000s.append(num);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }

    public LinkWorkoutRequest(String activityId, long j7, WorkoutTemplateDto template, Integer num) {
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(template, "template");
        this.activityId = activityId;
        this.templateId = j7;
        this.template = template;
        this.rpe = num;
    }

    public /* synthetic */ LinkWorkoutRequest(String str, long j7, WorkoutTemplateDto workoutTemplateDto, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j7, workoutTemplateDto, (i13 & 8) != 0 ? null : num);
    }
}
