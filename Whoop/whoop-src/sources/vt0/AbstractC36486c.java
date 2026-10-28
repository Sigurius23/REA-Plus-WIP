package vt0;

import p325mb.AbstractC25380b;
import p518ub.InterfaceC34728a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vt0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0005\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"", "a", "Ljava/lang/String;", "METRICS_TABLE_ROOM_NEW_TEMP_NAME", "Lmb/b;", "b", "Lmb/b;", "getSTRAP_PACKET_MIGRATION_1_2", "()Lmb/b;", "STRAP_PACKET_MIGRATION_1_2", "c", "getSTRAP_PACKET_MIGRATION_3_4", "STRAP_PACKET_MIGRATION_3_4", "d", "getSTRAP_PACKET_MIGRATION_4_5", "STRAP_PACKET_MIGRATION_4_5", "e", "getSTRAP_PACKET_MIGRATION_13_14", "STRAP_PACKET_MIGRATION_13_14", "", "f", "[Lmb/b;", "()[Lmb/b;", "ALL_STRAP_PACKET_MIGRATIONS", "connectivity-data-packets_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36486c {

    /* JADX INFO: renamed from: a */
    private static final String f155852a = "table_metrics_data_new";

    /* JADX INFO: renamed from: b */
    private static final AbstractC25380b f155853b;

    /* JADX INFO: renamed from: c */
    private static final AbstractC25380b f155854c;

    /* JADX INFO: renamed from: d */
    private static final AbstractC25380b f155855d;

    /* JADX INFO: renamed from: e */
    private static final AbstractC25380b f155856e;

    /* JADX INFO: renamed from: f */
    private static final AbstractC25380b[] f155857f;

    /* JADX INFO: renamed from: vt0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"vt0/c$a", "Lmb/b;", "Lub/a;", "database", "Ll83/a0;", "migrate", "(Lub/a;)V", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC25380b {
        public a() {
            super(13, 14);
        }

        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC22676k.m65750j(database, "database");
            database.mo109660E("ALTER TABLE table_heart_data_versions ADD COLUMN firmware_version TEXT NOT NULL DEFAULT ''");
            database.mo109660E("UPDATE table_heart_data_versions SET firmware_version = firmware_major || '.' || firmware_minor || '.' || firmware_build || '.' || firmware_unreleased");
        }
    }

    /* JADX INFO: renamed from: vt0.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"vt0/c$b", "Lmb/b;", "Lub/a;", "database", "Ll83/a0;", "migrate", "(Lub/a;)V", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC25380b {
        public b() {
            super(1, 2);
        }

        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC22676k.m65750j(database, "database");
            database.mo109660E("CREATE TABLE " + AbstractC36486c.f155852a + " (packet_revision INTEGER NOT NULL,timestamp INTEGER NOT NULL,packet_data BLOB NOT NULL,version_id INTEGER NOT NULL,PRIMARY KEY(timestamp))");
            database.mo109660E("INSERT INTO " + AbstractC36486c.f155852a + " (packet_revision, timestamp, packet_data, version_id) SELECT packet_revision, timestamp, packet_data, version_id FROM table_metrics_data");
            database.mo109660E("DROP TABLE table_metrics_data");
            database.mo109660E("ALTER TABLE " + AbstractC36486c.f155852a + " RENAME TO table_metrics_data");
        }
    }

    /* JADX INFO: renamed from: vt0.c$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"vt0/c$c", "Lmb/b;", "Lub/a;", "database", "Ll83/a0;", "migrate", "(Lub/a;)V", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC25380b {
        public c() {
            super(3, 4);
        }

        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC22676k.m65750j(database, "database");
            database.mo109660E("DROP TABLE table_strap_firmware_events");
            database.mo109660E("CREATE TABLE table_strap_firmware_events (timestamp INT NOT NULL, type INT NOT NULL, packet_data BLOB NOT NULL, version_id INT NOT NULL, PRIMARY KEY(timestamp, type))");
        }
    }

    /* JADX INFO: renamed from: vt0.c$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"vt0/c$d", "Lmb/b;", "Lub/a;", "database", "Ll83/a0;", "migrate", "(Lub/a;)V", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC25380b {
        public d() {
            super(4, 5);
        }

        @Override // p325mb.AbstractC25380b
        public void migrate(InterfaceC34728a database) {
            AbstractC22676k.m65750j(database, "database");
            database.mo109660E("CREATE UNIQUE INDEX IF NOT EXISTS index_timestamp_raw_data_version ON table_raw_data(timestamp, raw_data_version)");
        }
    }

    static {
        b bVar = new b();
        f155853b = bVar;
        c cVar = new c();
        f155854c = cVar;
        d dVar = new d();
        f155855d = dVar;
        a aVar = new a();
        f155856e = aVar;
        f155857f = new AbstractC25380b[]{bVar, cVar, dVar, aVar};
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC25380b[] m116924b() {
        return f155857f;
    }
}
