package com.whoop.data.room;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao;
import com.whoop.data.local.room.dao.persistent.CachedMetricsDataDaoKt;
import com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao_Impl;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import se.AbstractC32410a;

/* JADX INFO: loaded from: classes.dex */
public final class CachedStrapPacketDatabase_Impl extends CachedStrapPacketDatabase {
    private volatile CachedMetricsDataDao _cachedMetricsDataDao;

    @Override // com.whoop.data.room.CachedStrapPacketDatabase
    public CachedMetricsDataDao cachedMetricsDataDao() {
        CachedMetricsDataDao cachedMetricsDataDao;
        if (this._cachedMetricsDataDao != null) {
            return this._cachedMetricsDataDao;
        }
        synchronized (this) {
            try {
                if (this._cachedMetricsDataDao == null) {
                    this._cachedMetricsDataDao = new CachedMetricsDataDao_Impl(this);
                }
                cachedMetricsDataDao = this._cachedMetricsDataDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cachedMetricsDataDao;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, CachedMetricsDataDaoKt.CACHED_METRICS_TABLE_ROOM);
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), CachedMetricsDataDaoKt.CACHED_METRICS_TABLE_ROOM);
    }

    @Override // androidx.room.AbstractC1848z0
    public List<AbstractC25380b> getAutoMigrations(Map<Class<? extends InterfaceC25379a>, InterfaceC25379a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.AbstractC1848z0
    public Set<Class<? extends InterfaceC25379a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(CachedMetricsDataDao.class, CachedMetricsDataDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new AbstractC1788g1(1, "e588be881027354707d18b8b717dbf61", "64572c6b46a415410054cc734519ab4e") { // from class: com.whoop.data.room.CachedStrapPacketDatabase_Impl.1
            @Override // androidx.room.AbstractC1788g1
            public void createAllTables(InterfaceC33687a interfaceC33687a) {
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `cached_table_metrics_data` (`packet_revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
                AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
                AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e588be881027354707d18b8b717dbf61')", interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void dropAllTables(InterfaceC33687a interfaceC33687a) {
                AbstractC17269i.m48864K("DROP TABLE IF EXISTS `cached_table_metrics_data`", interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void onCreate(InterfaceC33687a interfaceC33687a) {
            }

            @Override // androidx.room.AbstractC1788g1
            public void onOpen(InterfaceC33687a interfaceC33687a) {
                CachedStrapPacketDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public void onPostMigrate(InterfaceC33687a interfaceC33687a) {
            }

            @Override // androidx.room.AbstractC1788g1
            public void onPreMigrate(InterfaceC33687a interfaceC33687a) {
                AbstractC32410a.m101001I(interfaceC33687a);
            }

            @Override // androidx.room.AbstractC1788g1
            public C1784f1 onValidateSchema(InterfaceC33687a interfaceC33687a) {
                HashMap map = new HashMap(4);
                map.put("packet_revision", new C27785h(0, 1, "packet_revision", "INTEGER", null, true));
                map.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
                map.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
                C27788k c27788k = new C27788k(CachedMetricsDataDaoKt.CACHED_METRICS_TABLE_ROOM, map, AbstractC36095b.m114687o(map, "version_id", new C27785h(0, 1, "version_id", "INTEGER", null, true), 0), new HashSet(0));
                C27788k c27788kM83879a = C27788k.m83879a(CachedMetricsDataDaoKt.CACHED_METRICS_TABLE_ROOM, interfaceC33687a);
                return !c27788k.equals(c27788kM83879a) ? new C1784f1(false, AbstractC17176i.m48505g("cached_table_metrics_data(com.whoop.data.local.room.entity.connectivity.CachedMetricsDataDto).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a)) : new C1784f1(true, null);
            }
        };
    }
}
