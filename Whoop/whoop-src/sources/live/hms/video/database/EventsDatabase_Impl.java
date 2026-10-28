package live.hms.video.database;

import android.content.Context;
import androidx.room.AbstractC1796i1;
import androidx.room.AbstractC1821q0;
import androidx.room.AbstractC1848z0;
import androidx.room.C1786g;
import androidx.room.C1800j1;
import androidx.room.C1804k1;
import androidx.room.C1835v;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import live.hms.video.database.dao.AnalyticsEventsDao;
import live.hms.video.database.dao.AnalyticsEventsDao_Impl;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27788k;
import p518ub.C34730c;
import p518ub.InterfaceC34728a;
import p518ub.InterfaceC34732e;
import p555vl.AbstractC36095b;
import p578wb.C37024a;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32417h;

/* JADX INFO: loaded from: classes3.dex */
public final class EventsDatabase_Impl extends EventsDatabase {
    private volatile AnalyticsEventsDao _analyticsEventsDao;

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC34728a interfaceC34728aMo109675E0 = super.getOpenHelper().mo109675E0();
        try {
            super.beginTransaction();
            interfaceC34728aMo109675E0.mo109660E("DELETE FROM `analytics_table`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            interfaceC34728aMo109675E0.mo109661G0("PRAGMA wal_checkpoint(FULL)").close();
            if (!interfaceC34728aMo109675E0.mo109672v()) {
                interfaceC34728aMo109675E0.mo109660E("VACUUM");
            }
        }
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), EventsDatabase.TABLE_NAME);
    }

    @Override // androidx.room.AbstractC1848z0
    public InterfaceC34732e createOpenHelper(C1786g c1786g) {
        C1804k1 c1804k1 = new C1804k1(c1786g, new AbstractC1796i1(4) { // from class: live.hms.video.database.EventsDatabase_Impl.1
            @Override // androidx.room.AbstractC1796i1
            public void createAllTables(InterfaceC34728a interfaceC34728a) {
                interfaceC34728a.mo109660E("CREATE TABLE IF NOT EXISTS `analytics_table` (`timestamp` INTEGER NOT NULL, `eventId` TEXT NOT NULL, `payload` TEXT NOT NULL, `eventName` TEXT NOT NULL, `token` TEXT NOT NULL, `isQa` INTEGER NOT NULL, `peerId` TEXT, `role` TEXT, `joinedAt` INTEGER, `leftAt` INTEGER, `roomName` TEXT, `sessionStartedAt` INTEGER, `userData` TEXT, `userName` TEXT, `templateId` TEXT, `sessionId` TEXT, `websocketUrl` TEXT, PRIMARY KEY(`eventId`))");
                interfaceC34728a.mo109660E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC34728a.mo109660E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '356e4a21530b2975a5e43ebcfbd41316')");
            }

            @Override // androidx.room.AbstractC1796i1
            public void dropAllTables(InterfaceC34728a interfaceC34728a) {
                interfaceC34728a.mo109660E("DROP TABLE IF EXISTS `analytics_table`");
                List list = ((AbstractC1848z0) EventsDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1821q0) it.next()).getClass();
                    }
                }
            }

            @Override // androidx.room.AbstractC1796i1
            public void onCreate(InterfaceC34728a interfaceC34728a) {
                List list = ((AbstractC1848z0) EventsDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1821q0) it.next()).onCreate(interfaceC34728a);
                    }
                }
            }

            @Override // androidx.room.AbstractC1796i1
            public void onOpen(InterfaceC34728a interfaceC34728a) {
                ((AbstractC1848z0) EventsDatabase_Impl.this).mDatabase = interfaceC34728a;
                EventsDatabase_Impl.this.internalInitInvalidationTracker(interfaceC34728a);
                List list = ((AbstractC1848z0) EventsDatabase_Impl.this).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1821q0) it.next()).onOpen(interfaceC34728a);
                    }
                }
            }

            @Override // androidx.room.AbstractC1796i1
            public void onPostMigrate(InterfaceC34728a interfaceC34728a) {
            }

            @Override // androidx.room.AbstractC1796i1
            public void onPreMigrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                AbstractC32410a.m101001I(new C37024a(db4));
            }

            @Override // androidx.room.AbstractC1796i1
            public C1800j1 onValidateSchema(InterfaceC34728a database) {
                HashMap map = new HashMap(17);
                map.put("timestamp", new C27785h(0, 1, "timestamp", "INTEGER", null, true));
                map.put("eventId", new C27785h(1, 1, "eventId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("payload", new C27785h(0, 1, "payload", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("eventName", new C27785h(0, 1, "eventName", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("token", new C27785h(0, 1, "token", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
                map.put("isQa", new C27785h(0, 1, "isQa", "INTEGER", null, true));
                map.put("peerId", new C27785h(0, 1, "peerId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("role", new C27785h(0, 1, "role", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("joinedAt", new C27785h(0, 1, "joinedAt", "INTEGER", null, false));
                map.put("leftAt", new C27785h(0, 1, "leftAt", "INTEGER", null, false));
                map.put("roomName", new C27785h(0, 1, "roomName", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("sessionStartedAt", new C27785h(0, 1, "sessionStartedAt", "INTEGER", null, false));
                map.put("userData", new C27785h(0, 1, "userData", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("userName", new C27785h(0, 1, "userName", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("templateId", new C27785h(0, 1, "templateId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                map.put("sessionId", new C27785h(0, 1, "sessionId", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
                C27788k c27788k = new C27788k(EventsDatabase.TABLE_NAME, map, AbstractC36095b.m114687o(map, "websocketUrl", new C27785h(0, 1, "websocketUrl", ShippingAddressField.TEXT_FIELD_TYPE, null, false), 0), new HashSet(0));
                AbstractC22676k.m65750j(database, "database");
                C27788k c27788kM101188S = AbstractC32417h.m101188S(EventsDatabase.TABLE_NAME, new C37024a(database));
                return !c27788k.equals(c27788kM101188S) ? new C1800j1(false, AbstractC17176i.m48505g("analytics_table(live.hms.video.database.entity.AnalyticsEntityModel).\n Expected:\n", c27788k, "\n Found:\n", c27788kM101188S)) : new C1800j1(true, null);
            }
        });
        Context context = c1786g.f7042a;
        AbstractC22676k.m65750j(context, "context");
        return c1786g.f7044c.mo60609a(new C34730c(context, c1786g.f7043b, c1804k1, false, false));
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
        map.put(AnalyticsEventsDao.class, AnalyticsEventsDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // live.hms.video.database.EventsDatabase
    public AnalyticsEventsDao logDao() {
        AnalyticsEventsDao analyticsEventsDao;
        if (this._analyticsEventsDao != null) {
            return this._analyticsEventsDao;
        }
        synchronized (this) {
            try {
                if (this._analyticsEventsDao == null) {
                    this._analyticsEventsDao = new AnalyticsEventsDao_Impl(this);
                }
                analyticsEventsDao = this._analyticsEventsDao;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return analyticsEventsDao;
    }
}
