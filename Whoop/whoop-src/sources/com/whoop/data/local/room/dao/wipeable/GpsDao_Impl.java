package com.whoop.data.local.room.dao.wipeable;

import ai1.C0910b;
import androidx.lifecycle.AbstractC1615p0;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bb2.C2925a;
import be1.C3169c;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.data.local.room.entity.GpsMetaDataDto;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;

/* JADX INFO: loaded from: classes.dex */
public final class GpsDao_Impl implements GpsDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfGpsDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.GpsDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_gps` (`time_stamp`,`latitude`,`longitude`,`altitude`,`horizontal_accuracy`,`vertical_accuracy`) VALUES (?,?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, GpsDto gpsDto) {
            interfaceC33689c.mo5356p(1, gpsDto.getTimeStamp());
            interfaceC33689c.mo5358t(gpsDto.getLatitude(), 2);
            interfaceC33689c.mo5358t(gpsDto.getLongitude(), 3);
            interfaceC33689c.mo5358t(gpsDto.getAltitude(), 4);
            interfaceC33689c.mo5358t(gpsDto.getHorizontalAccuracy(), 5);
            interfaceC33689c.mo5358t(gpsDto.getVerticalAccuracy(), 6);
        }
    };
    private final AbstractC1802k __insertAdapterOfGpsMetaDataDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.GpsDao_Impl.2
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_gps_meta_data` (`start_date`,`end_date`,`id`) VALUES (?,?,nullif(?, 0))";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, GpsMetaDataDto gpsMetaDataDto) {
            interfaceC33689c.mo5356p(1, gpsMetaDataDto.getStart());
            interfaceC33689c.mo5356p(2, gpsMetaDataDto.getEnd());
            interfaceC33689c.mo5356p(3, gpsMetaDataDto.getId());
        }
    };

    public GpsDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$count$2(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM table_gps");
        try {
            return Long.valueOf(interfaceC33689cMo68212g1.mo5355e1() ? interfaceC33689cMo68212g1.getLong(0) : 0L);
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$deleteGpsMeta$8(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_gps_meta_data WHERE id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return null;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getGpsData$3(long j7, long j13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_gps WHERE time_stamp BETWEEN ? AND ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_stamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "latitude");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "longitude");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "altitude");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "horizontal_accuracy");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "vertical_accuracy");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new GpsDto(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getDouble(iM60658N2), interfaceC33689cMo68212g1.getDouble(iM60658N3), interfaceC33689cMo68212g1.getDouble(iM60658N4), interfaceC33689cMo68212g1.getDouble(iM60658N5), interfaceC33689cMo68212g1.getDouble(iM60658N6)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getGpsLiveData$4(long j7, long j13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_gps WHERE time_stamp BETWEEN ? AND ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_stamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "latitude");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "longitude");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "altitude");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "horizontal_accuracy");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "vertical_accuracy");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new GpsDto(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getDouble(iM60658N2), interfaceC33689cMo68212g1.getDouble(iM60658N3), interfaceC33689cMo68212g1.getDouble(iM60658N4), interfaceC33689cMo68212g1.getDouble(iM60658N5), interfaceC33689cMo68212g1.getDouble(iM60658N6)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getGpsMetaCount$6(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM table_gps_meta_data");
        try {
            return Integer.valueOf(interfaceC33689cMo68212g1.mo5355e1() ? (int) interfaceC33689cMo68212g1.getLong(0) : 0);
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getGpsMetaData$5(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_gps_meta_data");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "start_date");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "end_date");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                GpsMetaDataDto gpsMetaDataDto = new GpsMetaDataDto(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2));
                gpsMetaDataDto.setId(interfaceC33689cMo68212g1.getLong(iM60658N3));
                arrayList.add(gpsMetaDataDto);
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$removeGpsData$7(long j7, long j13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_gps WHERE time_stamp BETWEEN ? AND ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5356p(2, j13);
            interfaceC33689cMo68212g1.mo5355e1();
            return null;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveGpsDto$0(GpsDto gpsDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfGpsDto.insert(interfaceC33687a, gpsDto);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveGpsMetaData$1(GpsMetaDataDto gpsMetaDataDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfGpsMetaDataDto.insert(interfaceC33687a, gpsMetaDataDto);
        return null;
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public long count() {
        return ((Long) AbstractC15751g.m44432L(this.__db, true, false, new C6498i(4))).longValue();
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public void deleteGpsMeta(long j7) {
        AbstractC15751g.m44432L(this.__db, false, true, new C0910b(j7, 4));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public List<GpsDto> getGpsData(long j7, long j13) {
        return (List) AbstractC15751g.m44432L(this.__db, true, false, new C2925a(j7, j13, 4));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public AbstractC1615p0 getGpsLiveData(long j7, long j13) {
        return this.__db.getInvalidationTracker().m5455b(new String[]{"table_gps"}, false, new C2925a(j7, j13, 2));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public int getGpsMetaCount() {
        return ((Integer) AbstractC15751g.m44432L(this.__db, true, false, new C6498i(3))).intValue();
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public AbstractC1615p0 getGpsMetaData() {
        return this.__db.getInvalidationTracker().m5455b(new String[]{"table_gps_meta_data"}, false, new C6498i(2));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public void removeGpsData(long j7, long j13) {
        AbstractC15751g.m44432L(this.__db, false, true, new C2925a(j7, j13, 3));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public void saveGpsDto(GpsDto gpsDto) {
        gpsDto.getClass();
        AbstractC15751g.m44432L(this.__db, false, true, new C3169c(20, this, gpsDto));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.GpsDao
    public void saveGpsMetaData(GpsMetaDataDto gpsMetaDataDto) {
        gpsMetaDataDto.getClass();
        AbstractC15751g.m44432L(this.__db, false, true, new C3169c(21, this, gpsMetaDataDto));
    }
}
