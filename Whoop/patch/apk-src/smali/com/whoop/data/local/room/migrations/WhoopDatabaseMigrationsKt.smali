.class public final Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lmb/b;",
        "WHOOP_DB_MIGRATION_41_42",
        "Lmb/b;",
        "getWHOOP_DB_MIGRATION_41_42",
        "()Lmb/b;",
        "WHOOP_DB_MIGRATION_42_43",
        "getWHOOP_DB_MIGRATION_42_43",
        "WHOOP_DB_MIGRATION_43_44",
        "getWHOOP_DB_MIGRATION_43_44",
        "",
        "WHOOP_DB_ALL_MIGRATIONS",
        "[Lmb/b;",
        "getWHOOP_DB_ALL_MIGRATIONS",
        "()[Lmb/b;",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final WHOOP_DB_ALL_MIGRATIONS:[Lmb/b;

.field private static final WHOOP_DB_MIGRATION_41_42:Lmb/b;

.field private static final WHOOP_DB_MIGRATION_42_43:Lmb/b;

.field private static final WHOOP_DB_MIGRATION_43_44:Lmb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_41_42$1;

    invoke-direct {v0}, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_41_42$1;-><init>()V

    sput-object v0, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_MIGRATION_41_42:Lmb/b;

    new-instance v1, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_42_43$1;

    invoke-direct {v1}, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_42_43$1;-><init>()V

    sput-object v1, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_MIGRATION_42_43:Lmb/b;

    new-instance v2, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_43_44$1;

    invoke-direct {v2}, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt$WHOOP_DB_MIGRATION_43_44$1;-><init>()V

    sput-object v2, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_MIGRATION_43_44:Lmb/b;

    const/4 v3, 0x3

    new-array v3, v3, [Lmb/b;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_ALL_MIGRATIONS:[Lmb/b;

    return-void
.end method

.method public static final getWHOOP_DB_ALL_MIGRATIONS()[Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_ALL_MIGRATIONS:[Lmb/b;

    return-object v0
.end method

.method public static final getWHOOP_DB_MIGRATION_41_42()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_MIGRATION_41_42:Lmb/b;

    return-object v0
.end method

.method public static final getWHOOP_DB_MIGRATION_42_43()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_MIGRATION_42_43:Lmb/b;

    return-object v0
.end method

.method public static final getWHOOP_DB_MIGRATION_43_44()Lmb/b;
    .locals 1

    sget-object v0, Lcom/whoop/data/local/room/migrations/WhoopDatabaseMigrationsKt;->WHOOP_DB_MIGRATION_43_44:Lmb/b;

    return-object v0
.end method
