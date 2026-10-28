package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WeightliftingExercise$$serializer;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ku2.C22837a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bw\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"Jl\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00107\u0012\u0004\b<\u0010:\u001a\u0004\b;\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b=\u0010\u0018R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bA\u0010:\u001a\u0004\b@\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bD\u0010:\u001a\u0004\bC\u0010\u001eR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bF\u0010:\u001a\u0004\bE\u0010\u001cR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010\u0018R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bK\u0010:\u001a\u0004\bJ\u0010\"¨\u0006N"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "", "Lcom/whoop/design/util/TextResource;", "callToActionDisplay", "detailsPageTitle", "exerciseListTitleDisplay", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercises", "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;", "prebuiltTemplateDetailsHeader", "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;", "workoutMetadataDescriptions", "workoutSummaryDisplay", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "workoutTemplate", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;", "component6", "component7", "component8", "()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getCallToActionDisplay", "getCallToActionDisplay$annotations", "()V", "getDetailsPageTitle", "getDetailsPageTitle$annotations", "getExerciseListTitleDisplay", "getExerciseListTitleDisplay$annotations", "Ljava/util/List;", "getExercises", "getExercises$annotations", "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;", "getPrebuiltTemplateDetailsHeader", "getPrebuiltTemplateDetailsHeader$annotations", "getWorkoutMetadataDescriptions", "getWorkoutMetadataDescriptions$annotations", "getWorkoutSummaryDisplay", "getWorkoutSummaryDisplay$annotations", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "getWorkoutTemplate", "getWorkoutTemplate$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutDetailsModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("call_to_action_display")
    private final TextResource callToActionDisplay;

    @SerializedName("details_page_title")
    private final TextResource detailsPageTitle;

    @SerializedName("exercise_list_title_display")
    private final TextResource exerciseListTitleDisplay;

    @SerializedName("exercises")
    private final List<WeightliftingExercise> exercises;

    @SerializedName("prebuilt_template_details_header")
    private final PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader;

    @SerializedName("workout_metadata_descriptions")
    private final List<WorkoutMetadataDescriptionsItem> workoutMetadataDescriptions;

    @SerializedName("workout_summary_display")
    private final TextResource workoutSummaryDisplay;

    @SerializedName("workout_template")
    private final WorkoutTemplateDto workoutTemplate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22837a(6)), null, AbstractC30060g.m92087G(enumC23463i, new C22837a(7)), null, null};
    }

    public /* synthetic */ WorkoutDetailsModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader, List list2, TextResource textResource4, WorkoutTemplateDto workoutTemplateDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, WorkoutDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.callToActionDisplay = textResource;
        this.detailsPageTitle = textResource2;
        this.exerciseListTitleDisplay = textResource3;
        this.exercises = list;
        this.prebuiltTemplateDetailsHeader = prebuiltTemplateDetailsHeader;
        this.workoutMetadataDescriptions = list2;
        this.workoutSummaryDisplay = textResource4;
        this.workoutTemplate = workoutTemplateDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WeightliftingExercise$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WorkoutMetadataDescriptionsItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WorkoutDetailsModel copy$default(WorkoutDetailsModel workoutDetailsModel, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader, List list2, TextResource textResource4, WorkoutTemplateDto workoutTemplateDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = workoutDetailsModel.callToActionDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = workoutDetailsModel.detailsPageTitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = workoutDetailsModel.exerciseListTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            list = workoutDetailsModel.exercises;
        }
        if ((i13 & 16) != 0) {
            prebuiltTemplateDetailsHeader = workoutDetailsModel.prebuiltTemplateDetailsHeader;
        }
        if ((i13 & 32) != 0) {
            list2 = workoutDetailsModel.workoutMetadataDescriptions;
        }
        if ((i13 & 64) != 0) {
            textResource4 = workoutDetailsModel.workoutSummaryDisplay;
        }
        if ((i13 & 128) != 0) {
            workoutTemplateDto = workoutDetailsModel.workoutTemplate;
        }
        TextResource textResource5 = textResource4;
        WorkoutTemplateDto workoutTemplateDto2 = workoutTemplateDto;
        PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader2 = prebuiltTemplateDetailsHeader;
        List list3 = list2;
        return workoutDetailsModel.copy(textResource, textResource2, textResource3, list, prebuiltTemplateDetailsHeader2, list3, textResource5, workoutTemplateDto2);
    }

    @InterfaceC37143h("call_to_action_display")
    public static /* synthetic */ void getCallToActionDisplay$annotations() {
    }

    @InterfaceC37143h("details_page_title")
    public static /* synthetic */ void getDetailsPageTitle$annotations() {
    }

    @InterfaceC37143h("exercise_list_title_display")
    public static /* synthetic */ void getExerciseListTitleDisplay$annotations() {
    }

    @InterfaceC37143h("exercises")
    public static /* synthetic */ void getExercises$annotations() {
    }

    @InterfaceC37143h("prebuilt_template_details_header")
    public static /* synthetic */ void getPrebuiltTemplateDetailsHeader$annotations() {
    }

    @InterfaceC37143h("workout_metadata_descriptions")
    public static /* synthetic */ void getWorkoutMetadataDescriptions$annotations() {
    }

    @InterfaceC37143h("workout_summary_display")
    public static /* synthetic */ void getWorkoutSummaryDisplay$annotations() {
    }

    @InterfaceC37143h("workout_template")
    public static /* synthetic */ void getWorkoutTemplate$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WorkoutDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.callToActionDisplay);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.detailsPageTitle);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.exerciseListTitleDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.exercises);
        output.encodeSerializableElement(serialDesc, 4, PrebuiltTemplateDetailsHeader$$serializer.INSTANCE, self.prebuiltTemplateDetailsHeader);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.workoutMetadataDescriptions);
        output.encodeSerializableElement(serialDesc, 6, c25452a, self.workoutSummaryDisplay);
        output.encodeSerializableElement(serialDesc, 7, WorkoutTemplateDto$$serializer.INSTANCE, self.workoutTemplate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getCallToActionDisplay() {
        return this.callToActionDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDetailsPageTitle() {
        return this.detailsPageTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getExerciseListTitleDisplay() {
        return this.exerciseListTitleDisplay;
    }

    public final List<WeightliftingExercise> component4() {
        return this.exercises;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PrebuiltTemplateDetailsHeader getPrebuiltTemplateDetailsHeader() {
        return this.prebuiltTemplateDetailsHeader;
    }

    public final List<WorkoutMetadataDescriptionsItem> component6() {
        return this.workoutMetadataDescriptions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getWorkoutSummaryDisplay() {
        return this.workoutSummaryDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WorkoutTemplateDto getWorkoutTemplate() {
        return this.workoutTemplate;
    }

    public final WorkoutDetailsModel copy(TextResource callToActionDisplay, TextResource detailsPageTitle, TextResource exerciseListTitleDisplay, List<WeightliftingExercise> exercises, PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader, List<WorkoutMetadataDescriptionsItem> workoutMetadataDescriptions, TextResource workoutSummaryDisplay, WorkoutTemplateDto workoutTemplate) {
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(detailsPageTitle, "detailsPageTitle");
        AbstractC22676k.m65750j(exerciseListTitleDisplay, "exerciseListTitleDisplay");
        AbstractC22676k.m65750j(exercises, "exercises");
        AbstractC22676k.m65750j(prebuiltTemplateDetailsHeader, "prebuiltTemplateDetailsHeader");
        AbstractC22676k.m65750j(workoutMetadataDescriptions, "workoutMetadataDescriptions");
        AbstractC22676k.m65750j(workoutSummaryDisplay, "workoutSummaryDisplay");
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        return new WorkoutDetailsModel(callToActionDisplay, detailsPageTitle, exerciseListTitleDisplay, exercises, prebuiltTemplateDetailsHeader, workoutMetadataDescriptions, workoutSummaryDisplay, workoutTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutDetailsModel)) {
            return false;
        }
        WorkoutDetailsModel workoutDetailsModel = (WorkoutDetailsModel) other;
        return AbstractC22676k.m65745e(this.callToActionDisplay, workoutDetailsModel.callToActionDisplay) && AbstractC22676k.m65745e(this.detailsPageTitle, workoutDetailsModel.detailsPageTitle) && AbstractC22676k.m65745e(this.exerciseListTitleDisplay, workoutDetailsModel.exerciseListTitleDisplay) && AbstractC22676k.m65745e(this.exercises, workoutDetailsModel.exercises) && AbstractC22676k.m65745e(this.prebuiltTemplateDetailsHeader, workoutDetailsModel.prebuiltTemplateDetailsHeader) && AbstractC22676k.m65745e(this.workoutMetadataDescriptions, workoutDetailsModel.workoutMetadataDescriptions) && AbstractC22676k.m65745e(this.workoutSummaryDisplay, workoutDetailsModel.workoutSummaryDisplay) && AbstractC22676k.m65745e(this.workoutTemplate, workoutDetailsModel.workoutTemplate);
    }

    public final TextResource getCallToActionDisplay() {
        return this.callToActionDisplay;
    }

    public final TextResource getDetailsPageTitle() {
        return this.detailsPageTitle;
    }

    public final TextResource getExerciseListTitleDisplay() {
        return this.exerciseListTitleDisplay;
    }

    public final List<WeightliftingExercise> getExercises() {
        return this.exercises;
    }

    public final PrebuiltTemplateDetailsHeader getPrebuiltTemplateDetailsHeader() {
        return this.prebuiltTemplateDetailsHeader;
    }

    public final List<WorkoutMetadataDescriptionsItem> getWorkoutMetadataDescriptions() {
        return this.workoutMetadataDescriptions;
    }

    public final TextResource getWorkoutSummaryDisplay() {
        return this.workoutSummaryDisplay;
    }

    public final WorkoutTemplateDto getWorkoutTemplate() {
        return this.workoutTemplate;
    }

    public int hashCode() {
        return this.workoutTemplate.hashCode() + AbstractC31061c.m95625a(AbstractC11895b.m31983b((this.prebuiltTemplateDetailsHeader.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.callToActionDisplay.hashCode() * 31, this.detailsPageTitle, 31), this.exerciseListTitleDisplay, 31), 31, this.exercises)) * 31, 31, this.workoutMetadataDescriptions), this.workoutSummaryDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.callToActionDisplay;
        TextResource textResource2 = this.detailsPageTitle;
        TextResource textResource3 = this.exerciseListTitleDisplay;
        List<WeightliftingExercise> list = this.exercises;
        PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader = this.prebuiltTemplateDetailsHeader;
        List<WorkoutMetadataDescriptionsItem> list2 = this.workoutMetadataDescriptions;
        TextResource textResource4 = this.workoutSummaryDisplay;
        WorkoutTemplateDto workoutTemplateDto = this.workoutTemplate;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("WorkoutDetailsModel(callToActionDisplay=", textResource, ", detailsPageTitle=", textResource2, ", exerciseListTitleDisplay=");
        AbstractC21702c.m61143n(textResource3, ", exercises=", ", prebuiltTemplateDetailsHeader=", sbM106658q, list);
        sbM106658q.append(prebuiltTemplateDetailsHeader);
        sbM106658q.append(", workoutMetadataDescriptions=");
        sbM106658q.append(list2);
        sbM106658q.append(", workoutSummaryDisplay=");
        sbM106658q.append(textResource4);
        sbM106658q.append(", workoutTemplate=");
        sbM106658q.append(workoutTemplateDto);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public WorkoutDetailsModel(TextResource callToActionDisplay, TextResource detailsPageTitle, TextResource exerciseListTitleDisplay, List<WeightliftingExercise> exercises, PrebuiltTemplateDetailsHeader prebuiltTemplateDetailsHeader, List<WorkoutMetadataDescriptionsItem> workoutMetadataDescriptions, TextResource workoutSummaryDisplay, WorkoutTemplateDto workoutTemplate) {
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(detailsPageTitle, "detailsPageTitle");
        AbstractC22676k.m65750j(exerciseListTitleDisplay, "exerciseListTitleDisplay");
        AbstractC22676k.m65750j(exercises, "exercises");
        AbstractC22676k.m65750j(prebuiltTemplateDetailsHeader, "prebuiltTemplateDetailsHeader");
        AbstractC22676k.m65750j(workoutMetadataDescriptions, "workoutMetadataDescriptions");
        AbstractC22676k.m65750j(workoutSummaryDisplay, "workoutSummaryDisplay");
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        this.callToActionDisplay = callToActionDisplay;
        this.detailsPageTitle = detailsPageTitle;
        this.exerciseListTitleDisplay = exerciseListTitleDisplay;
        this.exercises = exercises;
        this.prebuiltTemplateDetailsHeader = prebuiltTemplateDetailsHeader;
        this.workoutMetadataDescriptions = workoutMetadataDescriptions;
        this.workoutSummaryDisplay = workoutSummaryDisplay;
        this.workoutTemplate = workoutTemplate;
    }
}
