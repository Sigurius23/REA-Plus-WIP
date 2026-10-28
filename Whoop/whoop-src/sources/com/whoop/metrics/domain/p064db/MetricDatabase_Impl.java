package com.whoop.metrics.domain.p064db;

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
import jy1.C22049c;
import jy1.InterfaceC22048b;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import se.AbstractC32410a;

/* JADX INFO: loaded from: classes4.dex */
public final class MetricDatabase_Impl extends MetricDatabase {

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC22048b f27365a;

    /* JADX INFO: renamed from: com.whoop.metrics.domain.db.MetricDatabase_Impl$a */
    public class C9146a extends AbstractC1788g1 {
        public C9146a(int i13, String str, String str2) {
            super(i13, str, str2);
        }

        @Override // androidx.room.AbstractC1788g1
        public void createAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `metrics_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `value` REAL, `tags` TEXT NOT NULL, `metric_type` TEXT)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
            AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '24b29960f175146e05e6ea5109e61c87')", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void dropAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `metrics_table`", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onCreate(InterfaceC33687a interfaceC33687a) {
        }

        @Override // androidx.room.AbstractC1788g1
        public void onOpen(InterfaceC33687a interfaceC33687a) {
            MetricDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
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
            HashMap map = new HashMap(5);
            map.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map.put("name", new C27785h(0, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map.put("value", new C27785h(0, 1, "value", "REAL", null, false));
            map.put("tags", new C27785h(0, 1, "tags", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            C27788k c27788k = new C27788k("metrics_table", map, AbstractC36095b.m114687o(map, "metric_type", new C27785h(0, 1, "metric_type", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
            C27788k c27788kM83879a = C27788k.m83879a("metrics_table", interfaceC33687a);
            return !c27788k.equals(c27788kM83879a) ? new C1784f1(false, AbstractC17176i.m48505g("metrics_table(com.whoop.metrics.domain.db.Metric).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a)) : new C1784f1(true, null);
        }
    }

    @Override // com.whoop.metrics.domain.p064db.MetricDatabase
    /* JADX INFO: renamed from: b */
    public InterfaceC22048b mo22885b() {
        InterfaceC22048b interfaceC22048b;
        if (this.f27365a != null) {
            return this.f27365a;
        }
        synchronized (this) {
            try {
                if (this.f27365a == null) {
                    this.f27365a = new C22049c(this);
                }
                interfaceC22048b = this.f27365a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC22048b;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "metrics_table");
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "metrics_table");
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
        map.put(InterfaceC22048b.class, C22049c.m63117k());
        return map;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new C9146a(2, "24b29960f175146e05e6ea5109e61c87", "57834016dde83ec5656f9871116b09fa");
    }
}
