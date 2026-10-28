package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBw\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJp\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u0015R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u0018R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0018R \u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u0018R \u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bD\u00104\u001a\u0004\bC\u0010\u001e¨\u0006G"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;", "", "", "", "instructions", "muscleGroups", "exerciseId", "name", "equipment", "movementPattern", "volumeInputFormat", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "customExerciseInfo", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getInstructions", "getInstructions$annotations", "()V", "getMuscleGroups", "getMuscleGroups$annotations", "Ljava/lang/String;", "getExerciseId", "getExerciseId$annotations", "getName", "getName$annotations", "getEquipment", "getEquipment$annotations", "getMovementPattern", "getMovementPattern$annotations", "getVolumeInputFormat", "getVolumeInputFormat$annotations", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "getCustomExerciseInfo", "getCustomExerciseInfo$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomExerciseDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("custom_exercise_info")
    private final CustomExerciseInfoDto customExerciseInfo;

    @SerializedName("equipment")
    private final String equipment;

    @SerializedName("exercise_id")
    private final String exerciseId;

    @SerializedName("instructions")
    private final List<String> instructions;

    @SerializedName("movement_pattern")
    private final String movementPattern;

    @SerializedName("muscle_groups")
    private final List<String> muscleGroups;

    @SerializedName("name")
    private final String name;

    @SerializedName("volume_input_format")
    private final String volumeInputFormat;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomExerciseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C22831a(16)), AbstractC30060g.m92087G(enumC23463i, new C22831a(17)), null, null, null, null, null, null};
    }

    public /* synthetic */ CustomExerciseDto(int i13, List list, List list2, String str, String str2, String str3, String str4, String str5, CustomExerciseInfoDto customExerciseInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, CustomExerciseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.instructions = list;
        this.muscleGroups = list2;
        this.exerciseId = str;
        this.name = str2;
        this.equipment = str3;
        this.movementPattern = str4;
        this.volumeInputFormat = str5;
        this.customExerciseInfo = customExerciseInfoDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomExerciseDto copy$default(CustomExerciseDto customExerciseDto, List list, List list2, String str, String str2, String str3, String str4, String str5, CustomExerciseInfoDto customExerciseInfoDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = customExerciseDto.instructions;
        }
        if ((i13 & 2) != 0) {
            list2 = customExerciseDto.muscleGroups;
        }
        if ((i13 & 4) != 0) {
            str = customExerciseDto.exerciseId;
        }
        if ((i13 & 8) != 0) {
            str2 = customExerciseDto.name;
        }
        if ((i13 & 16) != 0) {
            str3 = customExerciseDto.equipment;
        }
        if ((i13 & 32) != 0) {
            str4 = customExerciseDto.movementPattern;
        }
        if ((i13 & 64) != 0) {
            str5 = customExerciseDto.volumeInputFormat;
        }
        if ((i13 & 128) != 0) {
            customExerciseInfoDto = customExerciseDto.customExerciseInfo;
        }
        String str6 = str5;
        CustomExerciseInfoDto customExerciseInfoDto2 = customExerciseInfoDto;
        String str7 = str3;
        String str8 = str4;
        return customExerciseDto.copy(list, list2, str, str2, str7, str8, str6, customExerciseInfoDto2);
    }

    @InterfaceC37143h("custom_exercise_info")
    public static /* synthetic */ void getCustomExerciseInfo$annotations() {
    }

    @InterfaceC37143h("equipment")
    public static /* synthetic */ void getEquipment$annotations() {
    }

    @InterfaceC37143h("exercise_id")
    public static /* synthetic */ void getExerciseId$annotations() {
    }

    @InterfaceC37143h("instructions")
    public static /* synthetic */ void getInstructions$annotations() {
    }

    @InterfaceC37143h("movement_pattern")
    public static /* synthetic */ void getMovementPattern$annotations() {
    }

    @InterfaceC37143h("muscle_groups")
    public static /* synthetic */ void getMuscleGroups$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC37143h("volume_input_format")
    public static /* synthetic */ void getVolumeInputFormat$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(CustomExerciseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.instructions);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.muscleGroups);
        output.encodeStringElement(serialDesc, 2, self.exerciseId);
        output.encodeStringElement(serialDesc, 3, self.name);
        output.encodeStringElement(serialDesc, 4, self.equipment);
        output.encodeStringElement(serialDesc, 5, self.movementPattern);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.volumeInputFormat);
        output.encodeNullableSerializableElement(serialDesc, 7, CustomExerciseInfoDto$$serializer.INSTANCE, self.customExerciseInfo);
    }

    public final List<String> component1() {
        return this.instructions;
    }

    public final List<String> component2() {
        return this.muscleGroups;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMovementPattern() {
        return this.movementPattern;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CustomExerciseInfoDto getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    public final CustomExerciseDto copy(List<String> instructions, List<String> muscleGroups, String exerciseId, String name, String equipment, String movementPattern, String volumeInputFormat, CustomExerciseInfoDto customExerciseInfo) {
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(movementPattern, "movementPattern");
        return new CustomExerciseDto(instructions, muscleGroups, exerciseId, name, equipment, movementPattern, volumeInputFormat, customExerciseInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomExerciseDto)) {
            return false;
        }
        CustomExerciseDto customExerciseDto = (CustomExerciseDto) other;
        return AbstractC22676k.m65745e(this.instructions, customExerciseDto.instructions) && AbstractC22676k.m65745e(this.muscleGroups, customExerciseDto.muscleGroups) && AbstractC22676k.m65745e(this.exerciseId, customExerciseDto.exerciseId) && AbstractC22676k.m65745e(this.name, customExerciseDto.name) && AbstractC22676k.m65745e(this.equipment, customExerciseDto.equipment) && AbstractC22676k.m65745e(this.movementPattern, customExerciseDto.movementPattern) && AbstractC22676k.m65745e(this.volumeInputFormat, customExerciseDto.volumeInputFormat) && AbstractC22676k.m65745e(this.customExerciseInfo, customExerciseDto.customExerciseInfo);
    }

    public final CustomExerciseInfoDto getCustomExerciseInfo() {
        return this.customExerciseInfo;
    }

    public final String getEquipment() {
        return this.equipment;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final List<String> getInstructions() {
        return this.instructions;
    }

    public final String getMovementPattern() {
        return this.movementPattern;
    }

    public final List<String> getMuscleGroups() {
        return this.muscleGroups;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVolumeInputFormat() {
        return this.volumeInputFormat;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.instructions.hashCode() * 31, 31, this.muscleGroups), 31, this.exerciseId), 31, this.name), 31, this.equipment), 31, this.movementPattern);
        String str = this.volumeInputFormat;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        CustomExerciseInfoDto customExerciseInfoDto = this.customExerciseInfo;
        return iHashCode + (customExerciseInfoDto != null ? customExerciseInfoDto.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.instructions;
        List<String> list2 = this.muscleGroups;
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.equipment;
        String str4 = this.movementPattern;
        String str5 = this.volumeInputFormat;
        CustomExerciseInfoDto customExerciseInfoDto = this.customExerciseInfo;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("CustomExerciseDto(instructions=", ", muscleGroups=", list, ", exerciseId=", list2);
        AbstractC11266d.m30444B(sbM124380j, str, ", name=", str2, ", equipment=");
        AbstractC11266d.m30444B(sbM124380j, str3, ", movementPattern=", str4, ", volumeInputFormat=");
        sbM124380j.append(str5);
        sbM124380j.append(", customExerciseInfo=");
        sbM124380j.append(customExerciseInfoDto);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }

    public CustomExerciseDto(List<String> instructions, List<String> muscleGroups, String exerciseId, String name, String equipment, String movementPattern, String str, CustomExerciseInfoDto customExerciseInfoDto) {
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(movementPattern, "movementPattern");
        this.instructions = instructions;
        this.muscleGroups = muscleGroups;
        this.exerciseId = exerciseId;
        this.name = name;
        this.equipment = equipment;
        this.movementPattern = movementPattern;
        this.volumeInputFormat = str;
        this.customExerciseInfo = customExerciseInfoDto;
    }
}
