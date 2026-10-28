package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001a¨\u0006/"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ExerciseData;", "", "", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "exercises", "Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "filterOptions", "<init>", "(Ljava/util/List;Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/ExerciseData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "copy", "(Ljava/util/List;Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;)Lcom/whoop/weightlifting/data/dto/ExerciseData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getExercises", "getExercises$annotations", "()V", "Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "getFilterOptions", "getFilterOptions$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseData {

    @SerializedName("exercises")
    private final List<WeightliftingExerciseDto> exercises;

    @SerializedName("filter_options")
    private final FilterOptionsDto filterOptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(18)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ExerciseData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/ExerciseData;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseData(int i13, List list, FilterOptionsDto filterOptionsDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ExerciseData$$serializer.INSTANCE.getDescriptor());
        }
        this.exercises = list;
        this.filterOptions = filterOptionsDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WeightliftingExerciseDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExerciseData copy$default(ExerciseData exerciseData, List list, FilterOptionsDto filterOptionsDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = exerciseData.exercises;
        }
        if ((i13 & 2) != 0) {
            filterOptionsDto = exerciseData.filterOptions;
        }
        return exerciseData.copy(list, filterOptionsDto);
    }

    @InterfaceC37143h("exercises")
    public static /* synthetic */ void getExercises$annotations() {
    }

    @InterfaceC37143h("filter_options")
    public static /* synthetic */ void getFilterOptions$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(ExerciseData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.exercises);
        output.encodeSerializableElement(serialDesc, 1, FilterOptionsDto$$serializer.INSTANCE, self.filterOptions);
    }

    public final List<WeightliftingExerciseDto> component1() {
        return this.exercises;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FilterOptionsDto getFilterOptions() {
        return this.filterOptions;
    }

    public final ExerciseData copy(List<WeightliftingExerciseDto> exercises, FilterOptionsDto filterOptions) {
        AbstractC22676k.m65750j(exercises, "exercises");
        AbstractC22676k.m65750j(filterOptions, "filterOptions");
        return new ExerciseData(exercises, filterOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseData)) {
            return false;
        }
        ExerciseData exerciseData = (ExerciseData) other;
        return AbstractC22676k.m65745e(this.exercises, exerciseData.exercises) && AbstractC22676k.m65745e(this.filterOptions, exerciseData.filterOptions);
    }

    public final List<WeightliftingExerciseDto> getExercises() {
        return this.exercises;
    }

    public final FilterOptionsDto getFilterOptions() {
        return this.filterOptions;
    }

    public int hashCode() {
        return this.filterOptions.hashCode() + (this.exercises.hashCode() * 31);
    }

    public String toString() {
        return "ExerciseData(exercises=" + this.exercises + ", filterOptions=" + this.filterOptions + ")";
    }

    public ExerciseData(List<WeightliftingExerciseDto> exercises, FilterOptionsDto filterOptions) {
        AbstractC22676k.m65750j(exercises, "exercises");
        AbstractC22676k.m65750j(filterOptions, "filterOptions");
        this.exercises = exercises;
        this.filterOptions = filterOptions;
    }
}
