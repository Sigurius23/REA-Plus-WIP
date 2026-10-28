package com.whoop.data.local.room.migrations;

import hc3.AbstractC17176i;
import p325mb.AbstractC25380b;
import p518ub.InterfaceC34728a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lmb/b;", "WHOOP_DB_MIGRATION_41_42", "Lmb/b;", "getWHOOP_DB_MIGRATION_41_42", "()Lmb/b;", "WHOOP_DB_MIGRATION_42_43", "getWHOOP_DB_MIGRATION_42_43", "WHOOP_DB_MIGRATION_43_44", "getWHOOP_DB_MIGRATION_43_44", "", "WHOOP_DB_ALL_MIGRATIONS", "[Lmb/b;", "getWHOOP_DB_ALL_MIGRATIONS", "()[Lmb/b;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopDatabaseMigrationsKt {
    private static final AbstractC25380b[] WHOOP_DB_ALL_MIGRATIONS;
    private static final AbstractC25380b WHOOP_DB_MIGRATION_41_42;
    private static final AbstractC25380b WHOOP_DB_MIGRATION_42_43;
    private static final AbstractC25380b WHOOP_DB_MIGRATION_43_44;

    static {
        AbstractC25380b abstractC25380b = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_41_42$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("DROP TABLE table_feature_flags");
            }
        };
        WHOOP_DB_MIGRATION_41_42 = abstractC25380b;
        AbstractC25380b abstractC25380b2 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_42_43$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("DROP TABLE IF EXISTS cycle_workout");
            }
        };
        WHOOP_DB_MIGRATION_42_43 = abstractC25380b2;
        AbstractC25380b abstractC25380b3 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_43_44$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "DROP TABLE IF EXISTS cycle_metadata", "DROP TABLE IF EXISTS cycle_recovery", "DROP TABLE IF EXISTS cycle_sleep");
            }
        };
        WHOOP_DB_MIGRATION_43_44 = abstractC25380b3;
        WHOOP_DB_ALL_MIGRATIONS = new AbstractC25380b[]{abstractC25380b, abstractC25380b2, abstractC25380b3};
    }

    public static final AbstractC25380b[] getWHOOP_DB_ALL_MIGRATIONS() {
        return WHOOP_DB_ALL_MIGRATIONS;
    }

    public static final AbstractC25380b getWHOOP_DB_MIGRATION_41_42() {
        return WHOOP_DB_MIGRATION_41_42;
    }

    public static final AbstractC25380b getWHOOP_DB_MIGRATION_42_43() {
        return WHOOP_DB_MIGRATION_42_43;
    }

    public static final AbstractC25380b getWHOOP_DB_MIGRATION_43_44() {
        return WHOOP_DB_MIGRATION_43_44;
    }
}
