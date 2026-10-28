package com.whoop.strengthworkout.domain.models;

import bf2.C3201a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0096\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\bA\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\bB\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010%R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bI\u0010%R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bJ\u0010%R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bK\u0010%R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010*¨\u0006P"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;", "", "", "weightliftingWorkoutId", "activityId", "during", "timezone", "name", "", "workoutTemplateId", "", "rpe", "", "mskTotalVolumeKg", "rawMskStrainScore", "mskIntensityPercent", "scaledMskStrainScore", "", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;", "workoutGroups", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Ljava/lang/Integer;", "component8", "()F", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strength_workout_release", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getWeightliftingWorkoutId", "getActivityId", "getDuring", "getTimezone", "getName", "Ljava/lang/Long;", "getWorkoutTemplateId", "Ljava/lang/Integer;", "getRpe", "F", "getMskTotalVolumeKg", "getRawMskStrainScore", "getMskIntensityPercent", "getScaledMskStrainScore", "Ljava/util/List;", "getWorkoutGroups", "Companion", "$serializer", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthWorkoutSaveBody {
    private final String activityId;
    private final String during;
    private final float mskIntensityPercent;
    private final float mskTotalVolumeKg;
    private final String name;
    private final float rawMskStrainScore;
    private final Integer rpe;
    private final float scaledMskStrainScore;
    private final String timezone;
    private final String weightliftingWorkoutId;
    private final List<StrengthWorkoutSaveGroup> workoutGroups;
    private final Long workoutTemplateId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(15))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;", "serializer", "()Lwc3/c;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthWorkoutSaveBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrengthWorkoutSaveBody(int i13, String str, String str2, String str3, String str4, String str5, Long l7, Integer num, float f13, float f14, float f15, float f16, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, StrengthWorkoutSaveBody$$serializer.INSTANCE.getDescriptor());
        }
        this.weightliftingWorkoutId = str;
        this.activityId = str2;
        this.during = str3;
        this.timezone = str4;
        this.name = str5;
        this.workoutTemplateId = l7;
        this.rpe = num;
        this.mskTotalVolumeKg = f13;
        this.rawMskStrainScore = f14;
        this.mskIntensityPercent = f15;
        this.scaledMskStrainScore = f16;
        this.workoutGroups = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StrengthWorkoutSaveGroup$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrengthWorkoutSaveBody copy$default(StrengthWorkoutSaveBody strengthWorkoutSaveBody, String str, String str2, String str3, String str4, String str5, Long l7, Integer num, float f13, float f14, float f15, float f16, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = strengthWorkoutSaveBody.weightliftingWorkoutId;
        }
        if ((i13 & 2) != 0) {
            str2 = strengthWorkoutSaveBody.activityId;
        }
        if ((i13 & 4) != 0) {
            str3 = strengthWorkoutSaveBody.during;
        }
        if ((i13 & 8) != 0) {
            str4 = strengthWorkoutSaveBody.timezone;
        }
        if ((i13 & 16) != 0) {
            str5 = strengthWorkoutSaveBody.name;
        }
        if ((i13 & 32) != 0) {
            l7 = strengthWorkoutSaveBody.workoutTemplateId;
        }
        if ((i13 & 64) != 0) {
            num = strengthWorkoutSaveBody.rpe;
        }
        if ((i13 & 128) != 0) {
            f13 = strengthWorkoutSaveBody.mskTotalVolumeKg;
        }
        if ((i13 & 256) != 0) {
            f14 = strengthWorkoutSaveBody.rawMskStrainScore;
        }
        if ((i13 & 512) != 0) {
            f15 = strengthWorkoutSaveBody.mskIntensityPercent;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            f16 = strengthWorkoutSaveBody.scaledMskStrainScore;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            list = strengthWorkoutSaveBody.workoutGroups;
        }
        float f17 = f16;
        List list2 = list;
        float f18 = f14;
        float f19 = f15;
        Integer num2 = num;
        float f24 = f13;
        String str6 = str5;
        Long l12 = l7;
        return strengthWorkoutSaveBody.copy(str, str2, str3, str4, str6, l12, num2, f24, f18, f19, f17, list2);
    }

    public static final /* synthetic */ void write$Self$strength_workout_release(StrengthWorkoutSaveBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.weightliftingWorkoutId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.activityId);
        output.encodeStringElement(serialDesc, 2, self.during);
        output.encodeStringElement(serialDesc, 3, self.timezone);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.name);
        output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.workoutTemplateId);
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.rpe);
        output.encodeFloatElement(serialDesc, 7, self.mskTotalVolumeKg);
        output.encodeFloatElement(serialDesc, 8, self.rawMskStrainScore);
        output.encodeFloatElement(serialDesc, 9, self.mskIntensityPercent);
        output.encodeFloatElement(serialDesc, 10, self.scaledMskStrainScore);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.workoutGroups);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWeightliftingWorkoutId() {
        return this.weightliftingWorkoutId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getMskIntensityPercent() {
        return this.mskIntensityPercent;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getScaledMskStrainScore() {
        return this.scaledMskStrainScore;
    }

    public final List<StrengthWorkoutSaveGroup> component12() {
        return this.workoutGroups;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getRpe() {
        return this.rpe;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getMskTotalVolumeKg() {
        return this.mskTotalVolumeKg;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getRawMskStrainScore() {
        return this.rawMskStrainScore;
    }

    public final StrengthWorkoutSaveBody copy(String weightliftingWorkoutId, String activityId, String during, String timezone, String name, Long workoutTemplateId, Integer rpe, float mskTotalVolumeKg, float rawMskStrainScore, float mskIntensityPercent, float scaledMskStrainScore, List<StrengthWorkoutSaveGroup> workoutGroups) {
        AbstractC22676k.m65750j(weightliftingWorkoutId, "weightliftingWorkoutId");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        return new StrengthWorkoutSaveBody(weightliftingWorkoutId, activityId, during, timezone, name, workoutTemplateId, rpe, mskTotalVolumeKg, rawMskStrainScore, mskIntensityPercent, scaledMskStrainScore, workoutGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthWorkoutSaveBody)) {
            return false;
        }
        StrengthWorkoutSaveBody strengthWorkoutSaveBody = (StrengthWorkoutSaveBody) other;
        return AbstractC22676k.m65745e(this.weightliftingWorkoutId, strengthWorkoutSaveBody.weightliftingWorkoutId) && AbstractC22676k.m65745e(this.activityId, strengthWorkoutSaveBody.activityId) && AbstractC22676k.m65745e(this.during, strengthWorkoutSaveBody.during) && AbstractC22676k.m65745e(this.timezone, strengthWorkoutSaveBody.timezone) && AbstractC22676k.m65745e(this.name, strengthWorkoutSaveBody.name) && AbstractC22676k.m65745e(this.workoutTemplateId, strengthWorkoutSaveBody.workoutTemplateId) && AbstractC22676k.m65745e(this.rpe, strengthWorkoutSaveBody.rpe) && Float.compare(this.mskTotalVolumeKg, strengthWorkoutSaveBody.mskTotalVolumeKg) == 0 && Float.compare(this.rawMskStrainScore, strengthWorkoutSaveBody.rawMskStrainScore) == 0 && Float.compare(this.mskIntensityPercent, strengthWorkoutSaveBody.mskIntensityPercent) == 0 && Float.compare(this.scaledMskStrainScore, strengthWorkoutSaveBody.scaledMskStrainScore) == 0 && AbstractC22676k.m65745e(this.workoutGroups, strengthWorkoutSaveBody.workoutGroups);
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final String getDuring() {
        return this.during;
    }

    public final float getMskIntensityPercent() {
        return this.mskIntensityPercent;
    }

    public final float getMskTotalVolumeKg() {
        return this.mskTotalVolumeKg;
    }

    public final String getName() {
        return this.name;
    }

    public final float getRawMskStrainScore() {
        return this.rawMskStrainScore;
    }

    public final Integer getRpe() {
        return this.rpe;
    }

    public final float getScaledMskStrainScore() {
        return this.scaledMskStrainScore;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getWeightliftingWorkoutId() {
        return this.weightliftingWorkoutId;
    }

    public final List<StrengthWorkoutSaveGroup> getWorkoutGroups() {
        return this.workoutGroups;
    }

    public final Long getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    public int hashCode() {
        int iHashCode = this.weightliftingWorkoutId.hashCode() * 31;
        String str = this.activityId;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.during), 31, this.timezone);
        String str2 = this.name;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l7 = this.workoutTemplateId;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num = this.rpe;
        return this.workoutGroups.hashCode() + AbstractC11266d.m30447a(this.scaledMskStrainScore, AbstractC11266d.m30447a(this.mskIntensityPercent, AbstractC11266d.m30447a(this.rawMskStrainScore, AbstractC11266d.m30447a(this.mskTotalVolumeKg, (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.weightliftingWorkoutId;
        String str2 = this.activityId;
        String str3 = this.during;
        String str4 = this.timezone;
        String str5 = this.name;
        Long l7 = this.workoutTemplateId;
        Integer num = this.rpe;
        float f13 = this.mskTotalVolumeKg;
        float f14 = this.rawMskStrainScore;
        float f15 = this.mskIntensityPercent;
        float f16 = this.scaledMskStrainScore;
        List<StrengthWorkoutSaveGroup> list = this.workoutGroups;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StrengthWorkoutSaveBody(weightliftingWorkoutId=", str, ", activityId=", str2, ", during=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", timezone=", str4, ", name=");
        sbM32001t.append(str5);
        sbM32001t.append(", workoutTemplateId=");
        sbM32001t.append(l7);
        sbM32001t.append(", rpe=");
        sbM32001t.append(num);
        sbM32001t.append(", mskTotalVolumeKg=");
        sbM32001t.append(f13);
        sbM32001t.append(", rawMskStrainScore=");
        AbstractC30802r.m94772u(sbM32001t, f14, ", mskIntensityPercent=", f15, ", scaledMskStrainScore=");
        sbM32001t.append(f16);
        sbM32001t.append(", workoutGroups=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StrengthWorkoutSaveBody(String weightliftingWorkoutId, String str, String during, String timezone, String str2, Long l7, Integer num, float f13, float f14, float f15, float f16, List<StrengthWorkoutSaveGroup> workoutGroups) {
        AbstractC22676k.m65750j(weightliftingWorkoutId, "weightliftingWorkoutId");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        this.weightliftingWorkoutId = weightliftingWorkoutId;
        this.activityId = str;
        this.during = during;
        this.timezone = timezone;
        this.name = str2;
        this.workoutTemplateId = l7;
        this.rpe = num;
        this.mskTotalVolumeKg = f13;
        this.rawMskStrainScore = f14;
        this.mskIntensityPercent = f15;
        this.scaledMskStrainScore = f16;
        this.workoutGroups = workoutGroups;
    }
}
