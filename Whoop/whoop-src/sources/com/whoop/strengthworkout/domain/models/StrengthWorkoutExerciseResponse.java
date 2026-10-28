package com.whoop.strengthworkout.domain.models;

import bf2.C3201a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jf\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010%¨\u0006:"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;", "", "", "exerciseId", "name", "equipment", "movementPattern", "", "muscleGroups", "imageUrl", "", "deleted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExerciseId", "getName", "getEquipment", "getMovementPattern", "Ljava/util/List;", "getMuscleGroups", "getImageUrl", "Ljava/lang/Boolean;", "getDeleted", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutExerciseResponse {
    private final Boolean deleted;
    private final String equipment;
    private final String exerciseId;
    private final String imageUrl;
    private final String movementPattern;
    private final List<String> muscleGroups;
    private final String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(10)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutExerciseResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutExerciseResponse(int i13, String str, String str2, String str3, String str4, List list, String str5, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, StrengthWorkoutExerciseResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseId = str;
        this.name = str2;
        this.equipment = str3;
        this.movementPattern = str4;
        this.muscleGroups = list;
        this.imageUrl = str5;
        this.deleted = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrengthWorkoutExerciseResponse copy$default(StrengthWorkoutExerciseResponse strengthWorkoutExerciseResponse, String str, String str2, String str3, String str4, List list, String str5, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = strengthWorkoutExerciseResponse.exerciseId;
        }
        if ((i13 & 2) != 0) {
            str2 = strengthWorkoutExerciseResponse.name;
        }
        if ((i13 & 4) != 0) {
            str3 = strengthWorkoutExerciseResponse.equipment;
        }
        if ((i13 & 8) != 0) {
            str4 = strengthWorkoutExerciseResponse.movementPattern;
        }
        if ((i13 & 16) != 0) {
            list = strengthWorkoutExerciseResponse.muscleGroups;
        }
        if ((i13 & 32) != 0) {
            str5 = strengthWorkoutExerciseResponse.imageUrl;
        }
        if ((i13 & 64) != 0) {
            bool = strengthWorkoutExerciseResponse.deleted;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        List list2 = list;
        String str7 = str3;
        return strengthWorkoutExerciseResponse.copy(str, str2, str7, str4, list2, str6, bool2);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutExerciseResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.exerciseId);
        output.encodeStringElement(serialDesc, 1, self.name);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.equipment);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.movementPattern);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.muscleGroups);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.deleted);
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

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getDeleted() {
        return this.deleted;
    }

    public final StrengthWorkoutExerciseResponse copy(String exerciseId, String name, String equipment, String movementPattern, List<String> muscleGroups, String imageUrl, Boolean deleted) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        return new StrengthWorkoutExerciseResponse(exerciseId, name, equipment, movementPattern, muscleGroups, imageUrl, deleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutExerciseResponse)) {
            return false;
        }
        StrengthWorkoutExerciseResponse strengthWorkoutExerciseResponse = (StrengthWorkoutExerciseResponse) other;
        return AbstractC22676k.m65745e(this.exerciseId, strengthWorkoutExerciseResponse.exerciseId) && AbstractC22676k.m65745e(this.name, strengthWorkoutExerciseResponse.name) && AbstractC22676k.m65745e(this.equipment, strengthWorkoutExerciseResponse.equipment) && AbstractC22676k.m65745e(this.movementPattern, strengthWorkoutExerciseResponse.movementPattern) && AbstractC22676k.m65745e(this.muscleGroups, strengthWorkoutExerciseResponse.muscleGroups) && AbstractC22676k.m65745e(this.imageUrl, strengthWorkoutExerciseResponse.imageUrl) && AbstractC22676k.m65745e(this.deleted, strengthWorkoutExerciseResponse.deleted);
    }

    public final Boolean getDeleted() {
        return this.deleted;
    }

    public final String getEquipment() {
        return this.equipment;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
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
        int iM30450d = AbstractC11266d.m30450d(this.exerciseId.hashCode() * 31, 31, this.name);
        String str = this.equipment;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.movementPattern;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.muscleGroups;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.deleted;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.exerciseId;
        String str2 = this.name;
        String str3 = this.equipment;
        String str4 = this.movementPattern;
        List<String> list = this.muscleGroups;
        String str5 = this.imageUrl;
        Boolean bool = this.deleted;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StrengthWorkoutExerciseResponse(exerciseId=", str, ", name=", str2, ", equipment=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", movementPattern=", str4, ", muscleGroups=");
        AbstractC17176i.m48511m(", imageUrl=", str5, ", deleted=", sbM32001t, list);
        return AbstractC11478a.m30858j(sbM32001t, bool, ")");
    }

    public StrengthWorkoutExerciseResponse(String exerciseId, String name, String str, String str2, List<String> list, String str3, Boolean bool) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(name, "name");
        this.exerciseId = exerciseId;
        this.name = name;
        this.equipment = str;
        this.movementPattern = str2;
        this.muscleGroups = list;
        this.imageUrl = str3;
        this.deleted = bool;
    }
}
