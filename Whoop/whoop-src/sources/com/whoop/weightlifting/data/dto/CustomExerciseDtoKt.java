package com.whoop.weightlifting.data.dto;

import com.whoop.weightlifting.data.domain.CustomExerciseInfo;
import com.whoop.weightlifting.data.domain.FilterItem;
import com.whoop.weightlifting.data.domain.FilterOptions;
import com.whoop.weightlifting.data.domain.LinkedExercise;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m65681d2 = {"toDomain", "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;", "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;", "Lcom/whoop/weightlifting/data/domain/LinkedExercise;", "Lcom/whoop/weightlifting/data/dto/LinkedExerciseDto;", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "Lcom/whoop/weightlifting/data/dto/FilterOptionsDto;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "Lcom/whoop/weightlifting/data/dto/FilterItemDto;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CustomExerciseDtoKt {
    public static final CustomExerciseInfo toDomain(CustomExerciseInfoDto customExerciseInfoDto) {
        AbstractC22676k.m65750j(customExerciseInfoDto, "<this>");
        LinkedExerciseDto linkedExercise = customExerciseInfoDto.getLinkedExercise();
        return new CustomExerciseInfo(linkedExercise != null ? toDomain(linkedExercise) : null);
    }

    public static final LinkedExercise toDomain(LinkedExerciseDto linkedExerciseDto) {
        AbstractC22676k.m65750j(linkedExerciseDto, "<this>");
        return new LinkedExercise(linkedExerciseDto.getExerciseId(), linkedExerciseDto.getName(), linkedExerciseDto.getImageUrl());
    }

    public static final FilterOptions toDomain(FilterOptionsDto filterOptionsDto) {
        AbstractC22676k.m65750j(filterOptionsDto, "<this>");
        List<FilterItemDto> equipment = filterOptionsDto.getEquipment();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(equipment, 10));
        Iterator<T> it = equipment.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((FilterItemDto) it.next()));
        }
        List<FilterItemDto> muscleGroups = filterOptionsDto.getMuscleGroups();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(muscleGroups, 10));
        Iterator<T> it3 = muscleGroups.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toDomain((FilterItemDto) it3.next()));
        }
        List<FilterItemDto> movementPatterns = filterOptionsDto.getMovementPatterns();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(movementPatterns, 10));
        Iterator<T> it4 = movementPatterns.iterator();
        while (it4.hasNext()) {
            arrayList3.add(toDomain((FilterItemDto) it4.next()));
        }
        return new FilterOptions(arrayList, arrayList2, arrayList3);
    }

    public static final FilterItem toDomain(FilterItemDto filterItemDto) {
        AbstractC22676k.m65750j(filterItemDto, "<this>");
        return new FilterItem(filterItemDto.getInternalValue(), filterItemDto.getTranslatedValue());
    }
}
