package com.whoop.weightlifting.data.domain;

import c13.AbstractC3855a;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/FilterOptions;", "", "equipment", "", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "muscleGroups", "movementPatterns", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEquipment", "()Ljava/util/List;", "getMuscleGroups", "getMovementPatterns", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FilterOptions {
    public static final int $stable = 8;
    private final List<FilterItem> equipment;
    private final List<FilterItem> movementPatterns;
    private final List<FilterItem> muscleGroups;

    public FilterOptions(List<FilterItem> equipment, List<FilterItem> muscleGroups, List<FilterItem> movementPatterns) {
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(movementPatterns, "movementPatterns");
        this.equipment = equipment;
        this.muscleGroups = muscleGroups;
        this.movementPatterns = movementPatterns;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterOptions copy$default(FilterOptions filterOptions, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = filterOptions.equipment;
        }
        if ((i13 & 2) != 0) {
            list2 = filterOptions.muscleGroups;
        }
        if ((i13 & 4) != 0) {
            list3 = filterOptions.movementPatterns;
        }
        return filterOptions.copy(list, list2, list3);
    }

    public final List<FilterItem> component1() {
        return this.equipment;
    }

    public final List<FilterItem> component2() {
        return this.muscleGroups;
    }

    public final List<FilterItem> component3() {
        return this.movementPatterns;
    }

    public final FilterOptions copy(List<FilterItem> equipment, List<FilterItem> muscleGroups, List<FilterItem> movementPatterns) {
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroups, "muscleGroups");
        AbstractC22676k.m65750j(movementPatterns, "movementPatterns");
        return new FilterOptions(equipment, muscleGroups, movementPatterns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterOptions)) {
            return false;
        }
        FilterOptions filterOptions = (FilterOptions) other;
        return AbstractC22676k.m65745e(this.equipment, filterOptions.equipment) && AbstractC22676k.m65745e(this.muscleGroups, filterOptions.muscleGroups) && AbstractC22676k.m65745e(this.movementPatterns, filterOptions.movementPatterns);
    }

    public final List<FilterItem> getEquipment() {
        return this.equipment;
    }

    public final List<FilterItem> getMovementPatterns() {
        return this.movementPatterns;
    }

    public final List<FilterItem> getMuscleGroups() {
        return this.muscleGroups;
    }

    public int hashCode() {
        return this.movementPatterns.hashCode() + AbstractC11895b.m31983b(this.equipment.hashCode() * 31, 31, this.muscleGroups);
    }

    public String toString() {
        List<FilterItem> list = this.equipment;
        List<FilterItem> list2 = this.muscleGroups;
        return AbstractC3855a.m11829m(AbstractC38963t7.m124380j("FilterOptions(equipment=", ", muscleGroups=", list, ", movementPatterns=", list2), this.movementPatterns, ")");
    }
}
