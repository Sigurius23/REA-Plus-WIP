package com.whoop.weightlifting.data.dto;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import ku2.C22837a;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0098\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00132\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bC\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bD\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010$R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bI\u0010$R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bJ\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010*R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010,R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\b\u0014\u0010.R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bR\u0010\u001d¨\u0006U"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "", "", "source", "during", "timezone", "name", "", "msk_total_volume_kg", "raw_msk_strain_score", "msk_intensity_percent", "scaled_msk_strain_score", "", "workout_template_id", "", "rpe", "", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;", "workout_groups", "", "is_simple_strength_logging", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V", "seen0", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Float;", "component6", "()F", "component7", "component8", "component9", "()Ljava/lang/Long;", "component10", "()Ljava/lang/Integer;", "component11", "()Ljava/util/List;", "component12", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSource", "getDuring", "getTimezone", "getName", "Ljava/lang/Float;", "getMsk_total_volume_kg", "F", "getRaw_msk_strain_score", "getMsk_intensity_percent", "getScaled_msk_strain_score", "Ljava/lang/Long;", "getWorkout_template_id", "Ljava/lang/Integer;", "getRpe", "Ljava/util/List;", "getWorkout_groups", "Z", "getType", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WeightliftingWorkoutDto {
    private final String during;
    private final boolean is_simple_strength_logging;
    private final float msk_intensity_percent;
    private final Float msk_total_volume_kg;
    private final String name;
    private final float raw_msk_strain_score;
    private final Integer rpe;
    private final float scaled_msk_strain_score;
    private final String source;
    private final String timezone;
    private final String type;
    private final List<WeightliftingWorkoutGroupDto> workout_groups;
    private final Long workout_template_id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22837a(3)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WeightliftingWorkoutDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WeightliftingWorkoutDto(int i13, String str, String str2, String str3, String str4, Float f13, float f14, float f15, float f16, Long l7, Integer num, List list, boolean z4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (486 != (i13 & 486)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 486, WeightliftingWorkoutDto$$serializer.INSTANCE.getDescriptor());
        }
        this.source = (i13 & 1) == 0 ? UserState.Sources.USER : str;
        this.during = str2;
        this.timezone = str3;
        if ((i13 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i13 & 16) == 0) {
            this.msk_total_volume_kg = null;
        } else {
            this.msk_total_volume_kg = f13;
        }
        this.raw_msk_strain_score = f14;
        this.msk_intensity_percent = f15;
        this.scaled_msk_strain_score = f16;
        this.workout_template_id = l7;
        if ((i13 & 512) == 0) {
            this.rpe = null;
        } else {
            this.rpe = num;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.workout_groups = null;
        } else {
            this.workout_groups = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.is_simple_strength_logging = false;
        } else {
            this.is_simple_strength_logging = z4;
        }
        this.type = (i13 & 4096) == 0 ? WeightliftingWorkoutKt.WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE : str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WeightliftingWorkoutGroupDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightliftingWorkoutDto copy$default(WeightliftingWorkoutDto weightliftingWorkoutDto, String str, String str2, String str3, String str4, Float f13, float f14, float f15, float f16, Long l7, Integer num, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = weightliftingWorkoutDto.source;
        }
        if ((i13 & 2) != 0) {
            str2 = weightliftingWorkoutDto.during;
        }
        if ((i13 & 4) != 0) {
            str3 = weightliftingWorkoutDto.timezone;
        }
        if ((i13 & 8) != 0) {
            str4 = weightliftingWorkoutDto.name;
        }
        if ((i13 & 16) != 0) {
            f13 = weightliftingWorkoutDto.msk_total_volume_kg;
        }
        if ((i13 & 32) != 0) {
            f14 = weightliftingWorkoutDto.raw_msk_strain_score;
        }
        if ((i13 & 64) != 0) {
            f15 = weightliftingWorkoutDto.msk_intensity_percent;
        }
        if ((i13 & 128) != 0) {
            f16 = weightliftingWorkoutDto.scaled_msk_strain_score;
        }
        if ((i13 & 256) != 0) {
            l7 = weightliftingWorkoutDto.workout_template_id;
        }
        if ((i13 & 512) != 0) {
            num = weightliftingWorkoutDto.rpe;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list = weightliftingWorkoutDto.workout_groups;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            z4 = weightliftingWorkoutDto.is_simple_strength_logging;
        }
        List list2 = list;
        boolean z13 = z4;
        Long l12 = l7;
        Integer num2 = num;
        float f17 = f15;
        float f18 = f16;
        Float f19 = f13;
        float f24 = f14;
        return weightliftingWorkoutDto.copy(str, str2, str3, str4, f19, f24, f17, f18, l12, num2, list2, z13);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(WeightliftingWorkoutDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.source, UserState.Sources.USER)) {
            output.encodeStringElement(serialDesc, 0, self.source);
        }
        output.encodeStringElement(serialDesc, 1, self.during);
        output.encodeStringElement(serialDesc, 2, self.timezone);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.msk_total_volume_kg != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, FloatSerializer.INSTANCE, self.msk_total_volume_kg);
        }
        output.encodeFloatElement(serialDesc, 5, self.raw_msk_strain_score);
        output.encodeFloatElement(serialDesc, 6, self.msk_intensity_percent);
        output.encodeFloatElement(serialDesc, 7, self.scaled_msk_strain_score);
        output.encodeNullableSerializableElement(serialDesc, 8, LongSerializer.INSTANCE, self.workout_template_id);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.rpe != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.rpe);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.workout_groups != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.workout_groups);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.is_simple_strength_logging) {
            output.encodeBooleanElement(serialDesc, 11, self.is_simple_strength_logging);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && AbstractC22676k.m65745e(self.type, WeightliftingWorkoutKt.WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE)) {
            return;
        }
        output.encodeStringElement(serialDesc, 12, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getRpe() {
        return this.rpe;
    }

    public final List<WeightliftingWorkoutGroupDto> component11() {
        return this.workout_groups;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIs_simple_strength_logging() {
        return this.is_simple_strength_logging;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getMsk_total_volume_kg() {
        return this.msk_total_volume_kg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getRaw_msk_strain_score() {
        return this.raw_msk_strain_score;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getMsk_intensity_percent() {
        return this.msk_intensity_percent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getScaled_msk_strain_score() {
        return this.scaled_msk_strain_score;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getWorkout_template_id() {
        return this.workout_template_id;
    }

    public final WeightliftingWorkoutDto copy(String source, String during, String timezone, String name, Float msk_total_volume_kg, float raw_msk_strain_score, float msk_intensity_percent, float scaled_msk_strain_score, Long workout_template_id, Integer rpe, List<WeightliftingWorkoutGroupDto> workout_groups, boolean is_simple_strength_logging) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        return new WeightliftingWorkoutDto(source, during, timezone, name, msk_total_volume_kg, raw_msk_strain_score, msk_intensity_percent, scaled_msk_strain_score, workout_template_id, rpe, workout_groups, is_simple_strength_logging);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingWorkoutDto)) {
            return false;
        }
        WeightliftingWorkoutDto weightliftingWorkoutDto = (WeightliftingWorkoutDto) other;
        return AbstractC22676k.m65745e(this.source, weightliftingWorkoutDto.source) && AbstractC22676k.m65745e(this.during, weightliftingWorkoutDto.during) && AbstractC22676k.m65745e(this.timezone, weightliftingWorkoutDto.timezone) && AbstractC22676k.m65745e(this.name, weightliftingWorkoutDto.name) && AbstractC22676k.m65745e(this.msk_total_volume_kg, weightliftingWorkoutDto.msk_total_volume_kg) && Float.compare(this.raw_msk_strain_score, weightliftingWorkoutDto.raw_msk_strain_score) == 0 && Float.compare(this.msk_intensity_percent, weightliftingWorkoutDto.msk_intensity_percent) == 0 && Float.compare(this.scaled_msk_strain_score, weightliftingWorkoutDto.scaled_msk_strain_score) == 0 && AbstractC22676k.m65745e(this.workout_template_id, weightliftingWorkoutDto.workout_template_id) && AbstractC22676k.m65745e(this.rpe, weightliftingWorkoutDto.rpe) && AbstractC22676k.m65745e(this.workout_groups, weightliftingWorkoutDto.workout_groups) && this.is_simple_strength_logging == weightliftingWorkoutDto.is_simple_strength_logging;
    }

    public final String getDuring() {
        return this.during;
    }

    public final float getMsk_intensity_percent() {
        return this.msk_intensity_percent;
    }

    public final Float getMsk_total_volume_kg() {
        return this.msk_total_volume_kg;
    }

    public final String getName() {
        return this.name;
    }

    public final float getRaw_msk_strain_score() {
        return this.raw_msk_strain_score;
    }

    public final Integer getRpe() {
        return this.rpe;
    }

    public final float getScaled_msk_strain_score() {
        return this.scaled_msk_strain_score;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getType() {
        return this.type;
    }

    public final List<WeightliftingWorkoutGroupDto> getWorkout_groups() {
        return this.workout_groups;
    }

    public final Long getWorkout_template_id() {
        return this.workout_template_id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.source.hashCode() * 31, 31, this.during), 31, this.timezone);
        String str = this.name;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Float f13 = this.msk_total_volume_kg;
        int iM30447a = AbstractC11266d.m30447a(this.scaled_msk_strain_score, AbstractC11266d.m30447a(this.msk_intensity_percent, AbstractC11266d.m30447a(this.raw_msk_strain_score, (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31), 31);
        Long l7 = this.workout_template_id;
        int iHashCode2 = (iM30447a + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num = this.rpe;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<WeightliftingWorkoutGroupDto> list = this.workout_groups;
        return Boolean.hashCode(this.is_simple_strength_logging) + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final boolean is_simple_strength_logging() {
        return this.is_simple_strength_logging;
    }

    public String toString() {
        String str = this.source;
        String str2 = this.during;
        String str3 = this.timezone;
        String str4 = this.name;
        Float f13 = this.msk_total_volume_kg;
        float f14 = this.raw_msk_strain_score;
        float f15 = this.msk_intensity_percent;
        float f16 = this.scaled_msk_strain_score;
        Long l7 = this.workout_template_id;
        Integer num = this.rpe;
        List<WeightliftingWorkoutGroupDto> list = this.workout_groups;
        boolean z4 = this.is_simple_strength_logging;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WeightliftingWorkoutDto(source=", str, ", during=", str2, ", timezone=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", name=", str4, ", msk_total_volume_kg=");
        sbM32001t.append(f13);
        sbM32001t.append(", raw_msk_strain_score=");
        sbM32001t.append(f14);
        sbM32001t.append(", msk_intensity_percent=");
        AbstractC30802r.m94772u(sbM32001t, f15, ", scaled_msk_strain_score=", f16, ", workout_template_id=");
        sbM32001t.append(l7);
        sbM32001t.append(", rpe=");
        sbM32001t.append(num);
        sbM32001t.append(", workout_groups=");
        sbM32001t.append(list);
        sbM32001t.append(", is_simple_strength_logging=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public WeightliftingWorkoutDto(String source, String during, String timezone, String str, Float f13, float f14, float f15, float f16, Long l7, Integer num, List<WeightliftingWorkoutGroupDto> list, boolean z4) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timezone, "timezone");
        this.source = source;
        this.during = during;
        this.timezone = timezone;
        this.name = str;
        this.msk_total_volume_kg = f13;
        this.raw_msk_strain_score = f14;
        this.msk_intensity_percent = f15;
        this.scaled_msk_strain_score = f16;
        this.workout_template_id = l7;
        this.rpe = num;
        this.workout_groups = list;
        this.is_simple_strength_logging = z4;
        this.type = WeightliftingWorkoutKt.WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE;
    }

    public /* synthetic */ WeightliftingWorkoutDto(String str, String str2, String str3, String str4, Float f13, float f14, float f15, float f16, Long l7, Integer num, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? UserState.Sources.USER : str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : f13, f14, f15, f16, l7, (i13 & 512) != 0 ? null : num, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4);
    }
}
