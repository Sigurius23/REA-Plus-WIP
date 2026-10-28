package com.whoop.dataSyncService.room;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jx0.C22002e;
import jx0.InterfaceC21999b;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import se.AbstractC32410a;

/* JADX INFO: loaded from: classes.dex */
public final class DataSyncWorkDatabase_Impl extends DataSyncWorkDatabase {

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC21999b f25470a;

    /* JADX INFO: renamed from: com.whoop.dataSyncService.room.DataSyncWorkDatabase_Impl$a */
    public class C6666a extends AbstractC1788g1 {
        public C6666a(int i13, String str, String str2) {
            super(i13, str, str2);
        }

        @Override // androidx.room.AbstractC1788g1
        public void createAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `data_sync_work_db` (`workerId` TEXT NOT NULL, `source` TEXT NOT NULL, `trigger_timestamp` INTEGER NOT NULL DEFAULT 0, `result_timestamp` INTEGER NOT NULL DEFAULT 0, `total_packet_upload` INTEGER NOT NULL DEFAULT 0, `upload_retry_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`workerId`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
            AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6e44325657e90a9e8c8243a2dcaec30f')", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void dropAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `data_sync_work_db`", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onCreate(InterfaceC33687a interfaceC33687a) {
        }

        @Override // androidx.room.AbstractC1788g1
        public void onOpen(InterfaceC33687a interfaceC33687a) {
            DataSyncWorkDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
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
            HashMap map = new HashMap(6);
            map.put("workerId", new C27785h(1, 1, "workerId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map.put("source", new C27785h(0, 1, "source", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map.put("trigger_timestamp", new C27785h(0, 1, "trigger_timestamp", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
            map.put("result_timestamp", new C27785h(0, 1, "result_timestamp", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
            map.put("total_packet_upload", new C27785h(0, 1, "total_packet_upload", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
            C27788k c27788k = new C27788k("data_sync_work_db", map, AbstractC36095b.m114687o(map, "upload_retry_count", new C27785h(0, 1, "upload_retry_count", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true), 0), new HashSet(0));
            C27788k c27788kM83879a = C27788k.m83879a("data_sync_work_db", interfaceC33687a);
            return !c27788k.equals(c27788kM83879a) ? new C1784f1(false, AbstractC17176i.m48505g("data_sync_work_db(com.whoop.dataSyncService.room.DataSyncWork).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a)) : new C1784f1(true, null);
        }
    }

    @Override // com.whoop.dataSyncService.room.DataSyncWorkDatabase
    /* JADX INFO: renamed from: b */
    public InterfaceC21999b mo19997b() {
        InterfaceC21999b interfaceC21999b;
        if (this.f25470a != null) {
            return this.f25470a;
        }
        synchronized (this) {
            try {
                if (this.f25470a == null) {
                    this.f25470a = new C22002e(this);
                }
                interfaceC21999b = this.f25470a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC21999b;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "data_sync_work_db");
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "data_sync_work_db");
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
        map.put(InterfaceC21999b.class, C22002e.m62870k());
        return map;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new C6666a(1, "6e44325657e90a9e8c8243a2dcaec30f", "e936ab3b8487d646e4d98c7cb43bff9d");
    }
}
