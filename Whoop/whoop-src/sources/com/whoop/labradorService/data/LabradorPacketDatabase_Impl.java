package com.whoop.labradorService.data;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import hu1.C17651h;
import hu1.InterfaceC17647d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import se.AbstractC32410a;

/* JADX INFO: loaded from: classes4.dex */
public final class LabradorPacketDatabase_Impl extends LabradorPacketDatabase {

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC17647d f27086a;

    /* JADX INFO: renamed from: com.whoop.labradorService.data.LabradorPacketDatabase_Impl$a */
    public class C9044a extends AbstractC1788g1 {
        public C9044a(int i13, String str, String str2) {
            super(i13, str, str2);
        }

        @Override // androidx.room.AbstractC1788g1
        public void createAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `ecg_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_ecg_packets_timestamp_packet_revision` ON `ecg_packets` (`timestamp`, `packet_revision`)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
            AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ee3afa1695f87777837a94798d759c94')", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void dropAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `ecg_packets`", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onCreate(InterfaceC33687a interfaceC33687a) {
        }

        @Override // androidx.room.AbstractC1788g1
        public void onOpen(InterfaceC33687a interfaceC33687a) {
            LabradorPacketDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
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
            map.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
            map.put("packet_revision", new C27785h(0, 1, "packet_revision", "INTEGER", null, true));
            map.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
            HashSet hashSetM114687o = AbstractC36095b.m114687o(map, "version_id", new C27785h(0, 1, "version_id", "INTEGER", null, true), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new C27787j("index_ecg_packets_timestamp_packet_revision", Arrays.asList("timestamp", "packet_revision"), Arrays.asList("ASC", "ASC"), true));
            C27788k c27788k = new C27788k("ecg_packets", map, hashSetM114687o, hashSet);
            C27788k c27788kM83879a = C27788k.m83879a("ecg_packets", interfaceC33687a);
            return !c27788k.equals(c27788kM83879a) ? new C1784f1(false, AbstractC17176i.m48505g("ecg_packets(com.whoop.labradorService.data.LabradorPacketDto).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a)) : new C1784f1(true, null);
        }
    }

    @Override // com.whoop.labradorService.data.LabradorPacketDatabase
    /* JADX INFO: renamed from: b */
    public InterfaceC17647d mo22536b() {
        InterfaceC17647d interfaceC17647d;
        if (this.f27086a != null) {
            return this.f27086a;
        }
        synchronized (this) {
            try {
                if (this.f27086a == null) {
                    this.f27086a = new C17651h(this);
                }
                interfaceC17647d = this.f27086a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC17647d;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "ecg_packets");
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "ecg_packets");
    }

    @Override // androidx.room.AbstractC1848z0
    public List<AbstractC25380b> getAutoMigrations(Map<Class<? extends InterfaceC25379a>, InterfaceC25379a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9045a());
        arrayList.add(new C9046b());
        return arrayList;
    }

    @Override // androidx.room.AbstractC1848z0
    public Set<Class<? extends InterfaceC25379a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC17647d.class, C17651h.m50284g());
        return map;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new C9044a(3, "ee3afa1695f87777837a94798d759c94", "f58da63d801f42a352774a1fd2d7e773");
    }
}
