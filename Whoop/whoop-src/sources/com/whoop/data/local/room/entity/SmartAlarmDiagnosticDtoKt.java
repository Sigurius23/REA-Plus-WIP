package com.whoop.data.local.room.entity;

import com.whoop.service.network.model.SmartAlarmDiagnosticBody;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"toRequestBody", "", "Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;", "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmDiagnosticDtoKt {
    public static final List<SmartAlarmDiagnosticBody> toRequestBody(List<SmartAlarmDiagnosticDto> list) {
        AbstractC22676k.m65750j(list, "<this>");
        List<SmartAlarmDiagnosticDto> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (SmartAlarmDiagnosticDto smartAlarmDiagnosticDto : list2) {
            arrayList.add(new SmartAlarmDiagnosticBody(smartAlarmDiagnosticDto.getEventType(), smartAlarmDiagnosticDto.getMobileEventMetadata(), smartAlarmDiagnosticDto.getAlarmTrigger(), smartAlarmDiagnosticDto.getTimestamp()));
        }
        return arrayList;
    }
}
