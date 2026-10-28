package com.whoop.weightlifting.data.dto;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J@\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0018¨\u00060"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "", "", "Lcom/whoop/weightlifting/data/dto/FilterItemDto;", "equipment", "muscleGroups", "movementPatterns", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEquipment", "getEquipment$annotations", "()V", "getMuscleGroups", "getMuscleGroups$annotations", "getMovementPatterns", "getMovementPatterns$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FilterOptionsDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("equipment")
    private final List<FilterItemDto> equipment;

    @SerializedName("movement_patterns")
    private final List<FilterItemDto> movementPatterns;

    @SerializedName("muscle_groups")
    private final List<FilterItemDto> muscleGroups;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/FilterOptionsDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FilterOptionsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C22831a(20)), AbstractC30060g.m92087G(enumC23463i, new C22831a(21)), AbstractC30060g.m92087G(enumC23463i, new C22831a(22))};
    }

    public /* synthetic */ FilterOptionsDto(int i13, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FilterOptionsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.equipment = list;
        this.muscleGroups = list2;
        this.movementPatterns = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(FilterItemDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(FilterItemDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(FilterItemDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterOptionsDto copy$default(FilterOptionsDto filterOptionsDto, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = filterOptionsDto.equipment;
        }
        if ((i13 & 2) != 0) {
            list2 = filterOptionsDto.muscleGroups;
        }
        if ((i13 & 4) != 0) {
            list3 = filterOptionsDto.movementPatterns;
        }
        return filterOptionsDto.copy(list, list2, list3);
    }

    @InterfaceC37143h("equipment")
    public static /* synthetic */ void getEquipment$annotations() {
    }

    @InterfaceC37143h("movement_patterns")
    public static /* synthetic */ void getMovementPatterns$annotations() {
    }

    @InterfaceC37143h("muscle_groups")
    public static /* synthetic */ void getMuscleGroups$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(FilterOptionsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.equipment);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.muscleGroups);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.movementPatterns);
    }

    public final List<FilterItemDto> component1() {
        return this.equipment;
    }

    public final List<FilterItemDto> component2() {
        return this.muscleGroups;
    }

    public final List<FilterItemDto> component3() {
        return this.movementPatterns;
    }

    public final FilterOptionsDto copy(List<FilterItemDto> equipment, List<FilterItemDto> muscleGroups, List<FilterItemDto> movementPatterns) {
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(movementPatterns, "movementPatterns");
        return new FilterOptionsDto(equipment, muscleGroups, movementPatterns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterOptionsDto)) {
            return false;
        }
        FilterOptionsDto filterOptionsDto = (FilterOptionsDto) other;
        return AbstractC22676k.m65745e(this.equipment, filterOptionsDto.equipment) && AbstractC22676k.m65745e(this.muscleGroups, filterOptionsDto.muscleGroups) && AbstractC22676k.m65745e(this.movementPatterns, filterOptionsDto.movementPatterns);
    }

    public final List<FilterItemDto> getEquipment() {
        return this.equipment;
    }

    public final List<FilterItemDto> getMovementPatterns() {
        return this.movementPatterns;
    }

    public final List<FilterItemDto> getMuscleGroups() {
        return this.muscleGroups;
    }

    public int hashCode() {
        return this.movementPatterns.hashCode() + AbstractC11895b.m31983b(this.equipment.hashCode() * 31, 31, this.muscleGroups);
    }

    public String toString() {
        List<FilterItemDto> list = this.equipment;
        List<FilterItemDto> list2 = this.muscleGroups;
        return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("FilterOptionsDto(equipment=", ", muscleGroups=", list, ", movementPatterns=", list2), this.movementPatterns, ")");
    }

    public FilterOptionsDto(List<FilterItemDto> equipment, List<FilterItemDto> muscleGroups, List<FilterItemDto> movementPatterns) {
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(movementPatterns, "movementPatterns");
        this.equipment = equipment;
        this.muscleGroups = muscleGroups;
        this.movementPatterns = movementPatterns;
    }
}
