package com.whoop.labrador.data;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
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
import us1.C35219b;
import us1.InterfaceC35218a;

/* JADX INFO: loaded from: classes4.dex */
public final class WhoopLabradorDatabase_Impl extends WhoopLabradorDatabase {

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC35218a f26965a;

    /* JADX INFO: renamed from: com.whoop.labrador.data.WhoopLabradorDatabase_Impl$a */
    public class C9006a extends AbstractC1788g1 {
        public C9006a(int i13, String str, String str2) {
            super(i13, str, str2);
        }

        @Override // androidx.room.AbstractC1788g1
        public void createAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_labrador_reading_result_data` (`average_hr` REAL NOT NULL, `classification` INTEGER NOT NULL, `samples` TEXT NOT NULL, `time_stamp` INTEGER NOT NULL, `symptoms_list` TEXT NOT NULL, `notes` TEXT NOT NULL, `uploaded` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`time_stamp`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
            AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '704646f7d26fd9e70dd6a6a2f6512f88')", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void dropAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_labrador_reading_result_data`", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onCreate(InterfaceC33687a interfaceC33687a) {
        }

        @Override // androidx.room.AbstractC1788g1
        public void onOpen(InterfaceC33687a interfaceC33687a) {
            WhoopLabradorDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
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
            HashMap map = new HashMap(8);
            map.put("average_hr", new C27785h(0, 1, "average_hr", "REAL", null, true));
            map.put("classification", new C27785h(0, 1, "classification", "INTEGER", null, true));
            map.put("samples", new C27785h(0, 1, "samples", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map.put("time_stamp", new C27785h(1, 1, "time_stamp", "INTEGER", null, true));
            map.put("symptoms_list", new C27785h(0, 1, "symptoms_list", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map.put("notes", new C27785h(0, 1, "notes", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map.put("uploaded", new C27785h(0, 1, "uploaded", "INTEGER", null, true));
            C27788k c27788k = new C27788k("table_labrador_reading_result_data", map, AbstractC36095b.m114687o(map, "deleted", new C27785h(0, 1, "deleted", "INTEGER", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a = C27788k.m83879a("table_labrador_reading_result_data", interfaceC33687a);
            return !c27788k.equals(c27788kM83879a) ? new C1784f1(false, AbstractC17176i.m48505g("table_labrador_reading_result_data(com.whoop.labrador.data.dto.LabradorReadingResultDto).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a)) : new C1784f1(true, null);
        }
    }

    @Override // com.whoop.labrador.data.WhoopLabradorDatabase
    /* JADX INFO: renamed from: b */
    public InterfaceC35218a mo22421b() {
        InterfaceC35218a interfaceC35218a;
        if (this.f26965a != null) {
            return this.f26965a;
        }
        synchronized (this) {
            try {
                if (this.f26965a == null) {
                    this.f26965a = new C35219b(this);
                }
                interfaceC35218a = this.f26965a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC35218a;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "table_labrador_reading_result_data");
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "table_labrador_reading_result_data");
    }

    @Override // androidx.room.AbstractC1848z0
    public List<AbstractC25380b> getAutoMigrations(Map<Class<? extends InterfaceC25379a>, InterfaceC25379a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9007a());
        return arrayList;
    }

    @Override // androidx.room.AbstractC1848z0
    public Set<Class<? extends InterfaceC25379a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC35218a.class, C35219b.m111577p());
        return map;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new C9006a(2, "704646f7d26fd9e70dd6a6a2f6512f88", "c4a1b3fb36b7c48c6c0f1229653d8256");
    }
}
