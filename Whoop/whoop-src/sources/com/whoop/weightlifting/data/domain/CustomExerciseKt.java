package com.whoop.weightlifting.data.domain;

import com.whoop.weightlifting.data.dto.CustomExerciseInfoDto;
import com.whoop.weightlifting.data.dto.FilterItemDto;
import com.whoop.weightlifting.data.dto.FilterOptionsDto;
import com.whoop.weightlifting.data.dto.LinkedExerciseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m65681d2 = {"toDto", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;", "Lcom/whoop/weightlifting/data/domain/LinkedExercise;", "Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "Lcom/whoop/weightlifting/data/dto/FilterItemDto;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CustomExerciseKt {
    public static final CustomExerciseInfoDto toDto(CustomExerciseInfo customExerciseInfo) {
        AbstractC22676k.m65750j(customExerciseInfo, "<this>");
        LinkedExercise linkedExercise = customExerciseInfo.getLinkedExercise();
        return new CustomExerciseInfoDto(linkedExercise != null ? toDto(linkedExercise) : null);
    }

    public static final LinkedExerciseDto toDto(LinkedExercise linkedExercise) {
        AbstractC22676k.m65750j(linkedExercise, "<this>");
        return new LinkedExerciseDto(linkedExercise.getExerciseId(), linkedExercise.getName(), linkedExercise.getImageUrl());
    }

    public static final FilterOptionsDto toDto(FilterOptions filterOptions) {
        AbstractC22676k.m65750j(filterOptions, "<this>");
        List<FilterItem> equipment = filterOptions.getEquipment();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(equipment, 10));
        Iterator<T> it = equipment.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((FilterItem) it.next()));
        }
        List<FilterItem> muscleGroups = filterOptions.getMuscleGroups();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(muscleGroups, 10));
        Iterator<T> it3 = muscleGroups.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDto((FilterItem) it3.next()));
        }
        List<FilterItem> movementPatterns = filterOptions.getMovementPatterns();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(movementPatterns, 10));
        Iterator<T> it4 = movementPatterns.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toDto((FilterItem) it4.next()));
        }
        return new FilterOptionsDto(arrayList, arrayList2, arrayList3);
    }

    public static final FilterItemDto toDto(FilterItem filterItem) {
        AbstractC22676k.m65750j(filterItem, "<this>");
        return new FilterItemDto(filterItem.getKey(), filterItem.getValue());
    }
}
