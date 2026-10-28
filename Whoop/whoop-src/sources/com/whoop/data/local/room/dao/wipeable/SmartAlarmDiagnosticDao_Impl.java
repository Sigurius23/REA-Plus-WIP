package com.whoop.data.local.room.dao.wipeable;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bp0.C3526n;
import com.whoop.data.local.room.dao.persistent.C6491b;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto;
import com.whoop.data.local.room.entity.SmartAlarmDiagnosticDtoConverter;
import com.whoop.service.network.model.MobileEventMetaData;
import f82.EnumC14250a;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p007a6.C0428i;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class SmartAlarmDiagnosticDao_Impl implements SmartAlarmDiagnosticDao {
    private final AbstractC1848z0 __db;
    private final SmartAlarmDiagnosticDtoConverter __smartAlarmDiagnosticDtoConverter = new SmartAlarmDiagnosticDtoConverter();
    private final AbstractC1802k __insertAdapterOfSmartAlarmDiagnosticDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_smart_alarm_diagnostics` (`event_type`,`alarm_trigger`,`timestamp_millis`,`id`,`isAckSuccess`,`devicePlatform`,`deviceOs`,`deviceModel`,`strapId`,`maximVersion`,`nordicVersion`,`batteryOptimizationOn`,`phoneSetAlarmTime`,`strapReportedAlarmTime`,`isStrapConnected`) VALUES (?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, SmartAlarmDiagnosticDto smartAlarmDiagnosticDto) {
            String strFromSmartAlarmEventType = SmartAlarmDiagnosticDao_Impl.this.__smartAlarmDiagnosticDtoConverter.fromSmartAlarmEventType(smartAlarmDiagnosticDto.getEventType());
            if (strFromSmartAlarmEventType == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, strFromSmartAlarmEventType);
            }
            if (smartAlarmDiagnosticDto.getAlarmTrigger() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, smartAlarmDiagnosticDto.getAlarmTrigger());
            }
            interfaceC33689c.mo5356p(3, smartAlarmDiagnosticDto.getTimestamp());
            interfaceC33689c.mo5356p(4, smartAlarmDiagnosticDto.getId());
            MobileEventMetaData mobileEventMetadata = smartAlarmDiagnosticDto.getMobileEventMetadata();
            Integer numValueOf = mobileEventMetadata.isAckSuccess() == null ? null : Integer.valueOf(mobileEventMetadata.isAckSuccess().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5356p(5, numValueOf.intValue());
            }
            if (mobileEventMetadata.getDevicePlatform() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, mobileEventMetadata.getDevicePlatform());
            }
            if (mobileEventMetadata.getDeviceOs() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, mobileEventMetadata.getDeviceOs());
            }
            if (mobileEventMetadata.getDeviceModel() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, mobileEventMetadata.getDeviceModel());
            }
            if (mobileEventMetadata.getStrapId() == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5354L(9, mobileEventMetadata.getStrapId());
            }
            if (mobileEventMetadata.getMaximVersion() == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, mobileEventMetadata.getMaximVersion());
            }
            if (mobileEventMetadata.getNordicVersion() == null) {
                interfaceC33689c.mo5359u(11);
            } else {
                interfaceC33689c.mo5354L(11, mobileEventMetadata.getNordicVersion());
            }
            interfaceC33689c.mo5356p(12, mobileEventMetadata.getBatteryOptimizationOn() ? 1L : 0L);
            if (mobileEventMetadata.getPhoneSetAlarmTime() == null) {
                interfaceC33689c.mo5359u(13);
            } else {
                interfaceC33689c.mo5354L(13, mobileEventMetadata.getPhoneSetAlarmTime());
            }
            if (mobileEventMetadata.getStrapReportedAlarmTime() == null) {
                interfaceC33689c.mo5359u(14);
            } else {
                interfaceC33689c.mo5354L(14, mobileEventMetadata.getStrapReportedAlarmTime());
            }
            Integer numValueOf2 = mobileEventMetadata.isStrapConnected() != null ? Integer.valueOf(mobileEventMetadata.isStrapConnected().booleanValue() ? 1 : 0) : null;
            if (numValueOf2 == null) {
                interfaceC33689c.mo5359u(15);
            } else {
                interfaceC33689c.mo5356p(15, numValueOf2.intValue());
            }
        }
    };

    public SmartAlarmDiagnosticDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$delete$2(long j7, long j13, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_smart_alarm_diagnostics WHERE id IN(SELECT id FROM table_smart_alarm_diagnostics WHERE timestamp_millis >= ? AND timestamp_millis <= ? ORDER BY timestamp_millis ASC LIMIT ?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            interfaceC33689cMo68212g1.mo5356p(3, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$deleteAll$3(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_smart_alarm_diagnostics");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getAll$1(InterfaceC33687a interfaceC33687a) throws Exception {
        Boolean boolValueOf;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_smart_alarm_diagnostics ORDER BY timestamp_millis ASC");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "event_type");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "alarm_trigger");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp_millis");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isAckSuccess");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "devicePlatform");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deviceOs");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deviceModel");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strapId");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maximVersion");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "nordicVersion");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "batteryOptimizationOn");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "phoneSetAlarmTime");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strapReportedAlarmTime");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isStrapConnected");
            int i13 = iM60658N4;
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                Boolean boolValueOf2 = null;
                EnumC14250a smartAlarmEventType = this.__smartAlarmDiagnosticDtoConverter.toSmartAlarmEventType(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N));
                String strMo5353J0 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                long j7 = interfaceC33689cMo68212g1.getLong(iM60658N3);
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N5));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                String strMo5353J1 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0;
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13);
                String strMo5353J8 = interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N14);
                int i14 = iM60658N15;
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(i14) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                if (numValueOf2 != null) {
                    boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                SmartAlarmDiagnosticDto smartAlarmDiagnosticDto = new SmartAlarmDiagnosticDto(smartAlarmEventType, new MobileEventMetaData(boolValueOf, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, strMo5353J6, z4, strMo5353J7, strMo5353J8, boolValueOf2), strMo5353J0, j7);
                int i15 = i13;
                int i16 = iM60658N6;
                smartAlarmDiagnosticDto.setId(interfaceC33689cMo68212g1.getLong(i15));
                ArrayList arrayList2 = arrayList;
                arrayList2.add(smartAlarmDiagnosticDto);
                iM60658N15 = i14;
                iM60658N3 = iM60658N3;
                iM60658N6 = i16;
                iM60658N2 = iM60658N2;
                i13 = i15;
                arrayList = arrayList2;
                iM60658N = iM60658N;
                iM60658N5 = iM60658N5;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$insert$0(SmartAlarmDiagnosticDto smartAlarmDiagnosticDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfSmartAlarmDiagnosticDto.insert(interfaceC33687a, smartAlarmDiagnosticDto);
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao
    public Object delete(int i13, long j7, long j13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6491b(j7, j13, i13), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6498i(8), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao
    public Object getAll(InterfaceC30057d<? super List<SmartAlarmDiagnosticDto>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C0428i(this, 5), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.SmartAlarmDiagnosticDao
    public Object insert(SmartAlarmDiagnosticDto smartAlarmDiagnosticDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        smartAlarmDiagnosticDto.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3526n(6, this, smartAlarmDiagnosticDto), interfaceC30057d);
    }
}
