package com.whoop.data.local.room.dao.wipeable;

import androidx.lifecycle.AbstractC1615p0;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.data.local.room.entity.GpsMetaDataDto;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\u00112\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\u0011H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H'¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/GpsDao;", "", "Lcom/whoop/data/local/room/entity/GpsDto;", "gpsDto", "Ll83/a0;", "saveGpsDto", "(Lcom/whoop/data/local/room/entity/GpsDto;)V", "", "count", "()J", "start", "end", "removeGpsData", "(JJ)V", "", "getGpsData", "(JJ)Ljava/util/List;", "Landroidx/lifecycle/p0;", "getGpsLiveData", "(JJ)Landroidx/lifecycle/p0;", "Lcom/whoop/data/local/room/entity/GpsMetaDataDto;", "gpsMetaDataDto", "saveGpsMetaData", "(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;)V", "getGpsMetaData", "()Landroidx/lifecycle/p0;", "", "getGpsMetaCount", "()I", "id", "deleteGpsMeta", "(J)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface GpsDao {
    long count();

    void deleteGpsMeta(long id4);

    List<GpsDto> getGpsData(long start, long end);

    AbstractC1615p0 getGpsLiveData(long start, long end);

    int getGpsMetaCount();

    AbstractC1615p0 getGpsMetaData();

    void removeGpsData(long start, long end);

    void saveGpsDto(GpsDto gpsDto);

    void saveGpsMetaData(GpsMetaDataDto gpsMetaDataDto);
}
