package com.whoop.cache.persistence;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23462h;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27786i;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import sc0.C32355c;
import se.AbstractC32410a;
import se.AbstractC32417h;
import um0.AbstractC35075a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;", "Lcom/whoop/cache/persistence/BffCacheDatabase;", "<init>", "()V", "Landroidx/room/g1;", "createOpenDelegate", "()Landroidx/room/g1;", "Landroidx/room/v;", "createInvalidationTracker", "()Landroidx/room/v;", "Ll83/a0;", "clearAllTables", "", "Lj93/d;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Lmb/a;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Lmb/b;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lum0/a;", "b", "()Lum0/a;", "Ll83/h;", "a", "Ll83/h;", "_bffCacheDao", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BffCacheDatabase_Impl extends BffCacheDatabase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h _bffCacheDao = AbstractC30060g.m92088H(new C32355c(this, 21));

    /* JADX INFO: renamed from: com.whoop.cache.persistence.BffCacheDatabase_Impl$a */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"com/whoop/cache/persistence/BffCacheDatabase_Impl$a", "Landroidx/room/g1;", "Ltb/a;", "connection", "Ll83/a0;", "createAllTables", "(Ltb/a;)V", "dropAllTables", "onCreate", "onOpen", "onPreMigrate", "onPostMigrate", "Landroidx/room/f1;", "onValidateSchema", "(Ltb/a;)Landroidx/room/f1;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6100a extends AbstractC1788g1 {
        public C6100a() {
            super(1, "fdc37bd8a1eb858fff6b9d0f40a9cffb", "4a693d5f73d2b96c6730d97e08aa51aa");
        }

        @Override // androidx.room.AbstractC1788g1
        public void createAllTables(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `cache_entries` (`uri` TEXT NOT NULL, `data` BLOB NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`uri`))", connection);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `cache_scopes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uri` TEXT NOT NULL, `scope` TEXT NOT NULL, FOREIGN KEY(`uri`) REFERENCES `cache_entries`(`uri`) ON UPDATE NO ACTION ON DELETE CASCADE )", connection);
            AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_cache_scopes_uri` ON `cache_scopes` (`uri`)", connection);
            AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_cache_scopes_scope` ON `cache_scopes` (`scope`)", connection);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", connection);
            AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fdc37bd8a1eb858fff6b9d0f40a9cffb')", connection);
        }

        @Override // androidx.room.AbstractC1788g1
        public void dropAllTables(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `cache_entries`", connection);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `cache_scopes`", connection);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onCreate(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
        }

        @Override // androidx.room.AbstractC1788g1
        public void onOpen(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
            AbstractC17269i.m48864K("PRAGMA foreign_keys = ON", connection);
            BffCacheDatabase_Impl.this.internalInitInvalidationTracker(connection);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onPostMigrate(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
        }

        @Override // androidx.room.AbstractC1788g1
        public void onPreMigrate(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
            AbstractC32410a.m101001I(connection);
        }

        @Override // androidx.room.AbstractC1788g1
        public C1784f1 onValidateSchema(InterfaceC33687a connection) {
            AbstractC22676k.m65750j(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("uri", new C27785h(1, 1, "uri", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            linkedHashMap.put("data", new C27785h(0, 1, "data", "BLOB", null, true));
            C27788k c27788k = new C27788k("cache_entries", linkedHashMap, AbstractC17176i.m48507i(linkedHashMap, "lastUpdated", new C27785h(0, 1, "lastUpdated", "INTEGER", null, true)), new LinkedHashSet());
            C27788k c27788kM101188S = AbstractC32417h.m101188S("cache_entries", connection);
            if (!c27788k.equals(c27788kM101188S)) {
                return new C1784f1(false, AbstractC17176i.m48505g("cache_entries(com.whoop.cache.persistence.CacheEntryEntity).\n Expected:\n", c27788k, "\n Found:\n", c27788kM101188S));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            linkedHashMap2.put("uri", new C27785h(0, 1, "uri", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            LinkedHashSet linkedHashSetM48507i = AbstractC17176i.m48507i(linkedHashMap2, "scope", new C27785h(0, 1, "scope", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            linkedHashSetM48507i.add(new C27786i("cache_entries", "CASCADE", AbstractC37056f.m118958J("uri"), "NO ACTION", AbstractC37056f.m118958J("uri")));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new C27787j("index_cache_scopes_uri", AbstractC37056f.m118958J("uri"), AbstractC37056f.m118958J("ASC"), false));
            linkedHashSet.add(new C27787j("index_cache_scopes_scope", AbstractC37056f.m118958J("scope"), AbstractC37056f.m118958J("ASC"), false));
            C27788k c27788k2 = new C27788k("cache_scopes", linkedHashMap2, linkedHashSetM48507i, linkedHashSet);
            C27788k c27788kM101188S2 = AbstractC32417h.m101188S("cache_scopes", connection);
            return !c27788k2.equals(c27788kM101188S2) ? new C1784f1(false, AbstractC17176i.m48505g("cache_scopes(com.whoop.cache.persistence.CacheScopeEntity).\n Expected:\n", c27788k2, "\n Found:\n", c27788kM101188S2)) : new C1784f1(true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C6101a m18301d(BffCacheDatabase_Impl bffCacheDatabase_Impl) {
        return new C6101a(bffCacheDatabase_Impl);
    }

    @Override // com.whoop.cache.persistence.BffCacheDatabase
    /* JADX INFO: renamed from: b */
    public AbstractC35075a mo18299b() {
        return (AbstractC35075a) this._bffCacheDao.getValue();
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(true, "cache_entries", "cache_scopes");
    }

    @Override // androidx.room.AbstractC1848z0
    public List<AbstractC25380b> createAutoMigrations(Map<InterfaceC21461d, ? extends InterfaceC25379a> autoMigrationSpecs) {
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new LinkedHashMap(), new LinkedHashMap(), "cache_entries", "cache_scopes");
    }

    @Override // androidx.room.AbstractC1848z0
    public Set<InterfaceC21461d> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public Map<InterfaceC21461d, List<InterfaceC21461d>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC35075a.class), C6101a.INSTANCE.m18341a());
        return linkedHashMap;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new C6100a();
    }
}
