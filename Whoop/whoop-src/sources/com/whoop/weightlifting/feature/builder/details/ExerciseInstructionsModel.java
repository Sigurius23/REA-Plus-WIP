package com.whoop.weightlifting.feature.builder.details;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0092\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b:\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b;\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b=\u00109\u001a\u0004\b<\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\bE\u00109\u001a\u0004\bD\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\bG\u00109\u001a\u0004\bF\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010H\u0012\u0004\bJ\u00109\u001a\u0004\bI\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\bL\u00109\u001a\u0004\bK\u0010\u0017¨\u0006P"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "exerciseId", "instructions", "name", "imageUrl", "videoUrl", "equipmentTitle", "equipmentBody", "muscleGroupsTitle", "muscleGroupsBody", "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;", "customExerciseInfo", "volumeInputFormat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getExerciseId", "getExerciseId$annotations", "()V", "getInstructions", "getName", "getImageUrl", "getImageUrl$annotations", "getVideoUrl", "getVideoUrl$annotations", "getEquipmentTitle", "getEquipmentTitle$annotations", "getEquipmentBody", "getEquipmentBody$annotations", "getMuscleGroupsTitle", "getMuscleGroupsTitle$annotations", "getMuscleGroupsBody", "getMuscleGroupsBody$annotations", "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;", "getCustomExerciseInfo", "getCustomExerciseInfo$annotations", "getVolumeInputFormat", "getVolumeInputFormat$annotations", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseInstructionsModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ExerciseInstructionsCustomExerciseInfo customExerciseInfo;
    private final String equipmentBody;
    private final String equipmentTitle;
    private final String exerciseId;
    private final String imageUrl;
    private final String instructions;
    private final String muscleGroupsBody;
    private final String muscleGroupsTitle;
    private final String name;
    private final String videoUrl;
    private final String volumeInputFormat;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.builder.details.ExerciseInstructionsModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseInstructionsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExerciseInstructionsModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ExerciseInstructionsCustomExerciseInfo) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ExerciseInstructionsModel copy$default(ExerciseInstructionsModel exerciseInstructionsModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo, String str10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseInstructionsModel.exerciseId;
        }
        if ((i13 & 2) != 0) {
            str2 = exerciseInstructionsModel.instructions;
        }
        if ((i13 & 4) != 0) {
            str3 = exerciseInstructionsModel.name;
        }
        if ((i13 & 8) != 0) {
            str4 = exerciseInstructionsModel.imageUrl;
        }
        if ((i13 & 16) != 0) {
            str5 = exerciseInstructionsModel.videoUrl;
        }
        if ((i13 & 32) != 0) {
            str6 = exerciseInstructionsModel.equipmentTitle;
        }
        if ((i13 & 64) != 0) {
            str7 = exerciseInstructionsModel.equipmentBody;
        }
        if ((i13 & 128) != 0) {
            str8 = exerciseInstructionsModel.muscleGroupsTitle;
        }
        if ((i13 & 256) != 0) {
            str9 = exerciseInstructionsModel.muscleGroupsBody;
        }
        if ((i13 & 512) != 0) {
            exerciseInstructionsCustomExerciseInfo = exerciseInstructionsModel.customExerciseInfo;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str10 = exerciseInstructionsModel.volumeInputFormat;
        }
        ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo2 = exerciseInstructionsCustomExerciseInfo;
        String str11 = str10;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return exerciseInstructionsModel.copy(str, str2, str17, str4, str16, str14, str15, str12, str13, exerciseInstructionsCustomExerciseInfo2, str11);
    }

    @InterfaceC37143h("custom_exercise_info")
    public static /* synthetic */ void getCustomExerciseInfo$annotations() {
    }

    @InterfaceC37143h("equipment_body")
    public static /* synthetic */ void getEquipmentBody$annotations() {
    }

    @InterfaceC37143h("equipment_title")
    public static /* synthetic */ void getEquipmentTitle$annotations() {
    }

    @InterfaceC37143h("exercise_id")
    public static /* synthetic */ void getExerciseId$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @InterfaceC37143h("muscle_groups_body")
    public static /* synthetic */ void getMuscleGroupsBody$annotations() {
    }

    @InterfaceC37143h("muscle_groups_title")
    public static /* synthetic */ void getMuscleGroupsTitle$annotations() {
    }

    @InterfaceC37143h("video_url")
    public static /* synthetic */ void getVideoUrl$annotations() {
    }

    @InterfaceC37143h("volume_input_format")
    public static /* synthetic */ void getVolumeInputFormat$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(ExerciseInstructionsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.exerciseId, "")) {
            output.encodeStringElement(serialDesc, 0, self.exerciseId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.instructions != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.instructions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.videoUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.videoUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.equipmentTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.equipmentTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.equipmentBody != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.equipmentBody);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.muscleGroupsTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.muscleGroupsTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.muscleGroupsBody != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.muscleGroupsBody);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.customExerciseInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, ExerciseInstructionsCustomExerciseInfo$$serializer.INSTANCE, self.customExerciseInfo);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.volumeInputFormat == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.volumeInputFormat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ExerciseInstructionsCustomExerciseInfo getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEquipmentTitle() {
        return this.equipmentTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEquipmentBody() {
        return this.equipmentBody;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMuscleGroupsTitle() {
        return this.muscleGroupsTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMuscleGroupsBody() {
        return this.muscleGroupsBody;
    }

    public final ExerciseInstructionsModel copy(String exerciseId, String instructions, String name, String imageUrl, String videoUrl, String equipmentTitle, String equipmentBody, String muscleGroupsTitle, String muscleGroupsBody, ExerciseInstructionsCustomExerciseInfo customExerciseInfo, String volumeInputFormat) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        return new ExerciseInstructionsModel(exerciseId, instructions, name, imageUrl, videoUrl, equipmentTitle, equipmentBody, muscleGroupsTitle, muscleGroupsBody, customExerciseInfo, volumeInputFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseInstructionsModel)) {
            return false;
        }
        ExerciseInstructionsModel exerciseInstructionsModel = (ExerciseInstructionsModel) other;
        return AbstractC22676k.m65745e(this.exerciseId, exerciseInstructionsModel.exerciseId) && AbstractC22676k.m65745e(this.instructions, exerciseInstructionsModel.instructions) && AbstractC22676k.m65745e(this.name, exerciseInstructionsModel.name) && AbstractC22676k.m65745e(this.imageUrl, exerciseInstructionsModel.imageUrl) && AbstractC22676k.m65745e(this.videoUrl, exerciseInstructionsModel.videoUrl) && AbstractC22676k.m65745e(this.equipmentTitle, exerciseInstructionsModel.equipmentTitle) && AbstractC22676k.m65745e(this.equipmentBody, exerciseInstructionsModel.equipmentBody) && AbstractC22676k.m65745e(this.muscleGroupsTitle, exerciseInstructionsModel.muscleGroupsTitle) && AbstractC22676k.m65745e(this.muscleGroupsBody, exerciseInstructionsModel.muscleGroupsBody) && AbstractC22676k.m65745e(this.customExerciseInfo, exerciseInstructionsModel.customExerciseInfo) && AbstractC22676k.m65745e(this.volumeInputFormat, exerciseInstructionsModel.volumeInputFormat);
    }

    public final ExerciseInstructionsCustomExerciseInfo getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    public final String getEquipmentBody() {
        return this.equipmentBody;
    }

    public final String getEquipmentTitle() {
        return this.equipmentTitle;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final String getMuscleGroupsBody() {
        return this.muscleGroupsBody;
    }

    public final String getMuscleGroupsTitle() {
        return this.muscleGroupsTitle;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    public int hashCode() {
        int iHashCode = this.exerciseId.hashCode() * 31;
        String str = this.instructions;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.equipmentTitle;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.equipmentBody;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.muscleGroupsTitle;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.muscleGroupsBody;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo = this.customExerciseInfo;
        int iHashCode10 = (iHashCode9 + (exerciseInstructionsCustomExerciseInfo == null ? 0 : exerciseInstructionsCustomExerciseInfo.hashCode())) * 31;
        String str9 = this.volumeInputFormat;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.instructions;
        String str3 = this.name;
        String str4 = this.imageUrl;
        String str5 = this.videoUrl;
        String str6 = this.equipmentTitle;
        String str7 = this.equipmentBody;
        String str8 = this.muscleGroupsTitle;
        String str9 = this.muscleGroupsBody;
        ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo = this.customExerciseInfo;
        String str10 = this.volumeInputFormat;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExerciseInstructionsModel(exerciseId=", str, ", instructions=", str2, ", name=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", videoUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", equipmentTitle=", str6, ", equipmentBody=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", muscleGroupsTitle=", str8, ", muscleGroupsBody=");
        sbM32001t.append(str9);
        sbM32001t.append(", customExerciseInfo=");
        sbM32001t.append(exerciseInstructionsCustomExerciseInfo);
        sbM32001t.append(", volumeInputFormat=");
        return AbstractC25012a.m73376i(str10, ")", sbM32001t);
    }

    public /* synthetic */ ExerciseInstructionsModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        this.exerciseId = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.instructions = null;
        } else {
            this.instructions = str2;
        }
        if ((i13 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i13 & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str4;
        }
        if ((i13 & 16) == 0) {
            this.videoUrl = null;
        } else {
            this.videoUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.equipmentTitle = null;
        } else {
            this.equipmentTitle = str6;
        }
        if ((i13 & 64) == 0) {
            this.equipmentBody = null;
        } else {
            this.equipmentBody = str7;
        }
        if ((i13 & 128) == 0) {
            this.muscleGroupsTitle = null;
        } else {
            this.muscleGroupsTitle = str8;
        }
        if ((i13 & 256) == 0) {
            this.muscleGroupsBody = null;
        } else {
            this.muscleGroupsBody = str9;
        }
        if ((i13 & 512) == 0) {
            this.customExerciseInfo = null;
        } else {
            this.customExerciseInfo = exerciseInstructionsCustomExerciseInfo;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.volumeInputFormat = null;
        } else {
            this.volumeInputFormat = str10;
        }
    }

    public ExerciseInstructionsModel(String exerciseId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo, String str9) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        this.exerciseId = exerciseId;
        this.instructions = str;
        this.name = str2;
        this.imageUrl = str3;
        this.videoUrl = str4;
        this.equipmentTitle = str5;
        this.equipmentBody = str6;
        this.muscleGroupsTitle = str7;
        this.muscleGroupsBody = str8;
        this.customExerciseInfo = exerciseInstructionsCustomExerciseInfo;
        this.volumeInputFormat = str9;
    }

    public /* synthetic */ ExerciseInstructionsModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ExerciseInstructionsCustomExerciseInfo exerciseInstructionsCustomExerciseInfo, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : str9, (i13 & 512) != 0 ? null : exerciseInstructionsCustomExerciseInfo, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str10);
    }
}
