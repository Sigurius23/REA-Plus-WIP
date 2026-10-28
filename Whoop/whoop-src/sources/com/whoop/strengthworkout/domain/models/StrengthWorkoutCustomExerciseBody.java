package com.whoop.strengthworkout.domain.models;

import bf2.C3201a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBc\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 J^\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 ¨\u00065"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;", "", "", "exerciseId", "name", "equipment", "movementPattern", "", "muscleGroups", "instructions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExerciseId", "getName", "getEquipment", "getMovementPattern", "Ljava/util/List;", "getMuscleGroups", "getInstructions", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutCustomExerciseBody {
    private static final InterfaceC23462h[] $childSerializers;
    private final String equipment;
    private final String exerciseId;
    private final List<String> instructions;
    private final String movementPattern;
    private final List<String> muscleGroups;
    private final String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutCustomExerciseBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C3201a(7)), AbstractC30060g.m92087G(enumC23463i, new C3201a(8))};
    }

    public /* synthetic */ StrengthWorkoutCustomExerciseBody(int i13, String str, String str2, String str3, String str4, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StrengthWorkoutCustomExerciseBody$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseId = str;
        this.name = str2;
        this.equipment = str3;
        this.movementPattern = str4;
        int i14 = i13 & 16;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.muscleGroups = c25271y;
        } else {
            this.muscleGroups = list;
        }
        if ((i13 & 32) == 0) {
            this.instructions = c25271y;
        } else {
            this.instructions = list2;
        }
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
    public static /* synthetic */ StrengthWorkoutCustomExerciseBody copy$default(StrengthWorkoutCustomExerciseBody strengthWorkoutCustomExerciseBody, String str, String str2, String str3, String str4, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = strengthWorkoutCustomExerciseBody.exerciseId;
        }
        if ((i13 & 2) != 0) {
            str2 = strengthWorkoutCustomExerciseBody.name;
        }
        if ((i13 & 4) != 0) {
            str3 = strengthWorkoutCustomExerciseBody.equipment;
        }
        if ((i13 & 8) != 0) {
            str4 = strengthWorkoutCustomExerciseBody.movementPattern;
        }
        if ((i13 & 16) != 0) {
            list = strengthWorkoutCustomExerciseBody.muscleGroups;
        }
        if ((i13 & 32) != 0) {
            list2 = strengthWorkoutCustomExerciseBody.instructions;
        }
        List list3 = list;
        List list4 = list2;
        return strengthWorkoutCustomExerciseBody.copy(str, str2, str3, str4, list3, list4);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutCustomExerciseBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.exerciseId);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.equipment);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.movementPattern);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 4);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.muscleGroups, c25271y)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.muscleGroups);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.instructions, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.instructions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEquipment() {
        return this.equipment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMovementPattern() {
        return this.movementPattern;
    }

    public final List<String> component5() {
        return this.muscleGroups;
    }

    public final List<String> component6() {
        return this.instructions;
    }

    public final StrengthWorkoutCustomExerciseBody copy(String exerciseId, String name, String equipment, String movementPattern, List<String> muscleGroups, List<String> instructions) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(instructions, "instructions");
        return new StrengthWorkoutCustomExerciseBody(exerciseId, name, equipment, movementPattern, muscleGroups, instructions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutCustomExerciseBody)) {
            return false;
        }
        StrengthWorkoutCustomExerciseBody strengthWorkoutCustomExerciseBody = (StrengthWorkoutCustomExerciseBody) other;
        return AbstractC22676k.m65745e(this.exerciseId, strengthWorkoutCustomExerciseBody.exerciseId) && AbstractC22676k.m65745e(this.name, strengthWorkoutCustomExerciseBody.name) && AbstractC22676k.m65745e(this.equipment, strengthWorkoutCustomExerciseBody.equipment) && AbstractC22676k.m65745e(this.movementPattern, strengthWorkoutCustomExerciseBody.movementPattern) && AbstractC22676k.m65745e(this.muscleGroups, strengthWorkoutCustomExerciseBody.muscleGroups) && AbstractC22676k.m65745e(this.instructions, strengthWorkoutCustomExerciseBody.instructions);
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

    public int hashCode() {
        String str = this.exerciseId;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        String str2 = this.equipment;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.movementPattern;
        return this.instructions.hashCode() + AbstractC11895b.m31983b((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.muscleGroups);
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.equipment;
        String str4 = this.movementPattern;
        List<String> list = this.muscleGroups;
        List<String> list2 = this.instructions;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StrengthWorkoutCustomExerciseBody(exerciseId=", str, ", name=", str2, ", equipment=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", movementPattern=", str4, ", muscleGroups=");
        return AbstractC30007c.m91843m(sbM32001t, list, ", instructions=", list2, ")");
    }

    public StrengthWorkoutCustomExerciseBody(String str, String name, String str2, String str3, List<String> muscleGroups, List<String> instructions) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(instructions, "instructions");
        this.exerciseId = str;
        this.name = name;
        this.equipment = str2;
        this.movementPattern = str3;
        this.muscleGroups = muscleGroups;
        this.instructions = instructions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrengthWorkoutCustomExerciseBody(String str, String str2, String str3, String str4, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 16;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, str3, str4, i14 != 0 ? c25271y : list, (i13 & 32) != 0 ? c25271y : list2);
    }
}
