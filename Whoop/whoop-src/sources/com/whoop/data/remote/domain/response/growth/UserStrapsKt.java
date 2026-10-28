package com.whoop.data.remote.domain.response.growth;

import com.whoop.data.remote.domain.dto.growth.UserStrapsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, m65681d2 = {"toDomainModel", "Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;", "Lcom/whoop/data/remote/domain/response/growth/UserStraps;", "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserStrapsKt {
    public static final UserStraps.Strap toDomainModel(UserStrapsDto.StrapDto strapDto) {
        StrapGeneration strapGeneration;
        AbstractC22676k.m65750j(strapDto, "<this>");
        String generation = strapDto.getGeneration();
        StrapGeneration strapGeneration2 = StrapGeneration.UNKNOWN;
        StrapGeneration[] strapGenerationArrValues = StrapGeneration.values();
        int length = strapGenerationArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                strapGeneration = null;
                break;
            }
            strapGeneration = strapGenerationArrValues[i13];
            if (AbstractC22676k.m65745e(strapGeneration.getSerializedValue(), generation)) {
                break;
            }
            i13++;
        }
        if (strapGeneration != null) {
            strapGeneration2 = strapGeneration;
        }
        return new UserStraps.Strap(strapGeneration2, strapDto.getSerial(), strapDto.getFirstSeen());
    }

    public static final UserStraps toDomainModel(UserStrapsDto userStrapsDto) {
        AbstractC22676k.m65750j(userStrapsDto, "<this>");
        UserStrapsDto.StrapDto lastSeenStrap = userStrapsDto.getLastSeenStrap();
        UserStraps.Strap domainModel = lastSeenStrap != null ? toDomainModel(lastSeenStrap) : null;
        UserStrapsDto.StrapDto orderedStrap = userStrapsDto.getOrderedStrap();
        UserStraps.Strap domainModel2 = orderedStrap != null ? toDomainModel(orderedStrap) : null;
        List<UserStrapsDto.StrapDto> previousStraps = userStrapsDto.getPreviousStraps();
        if (previousStraps == null) {
            previousStraps = C25271y.f99162w;
        }
        List<UserStrapsDto.StrapDto> list = previousStraps;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomainModel((UserStrapsDto.StrapDto) it.next()));
        }
        return new UserStraps(domainModel, domainModel2, arrayList);
    }
}
