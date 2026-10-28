.class public final Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_40_41$1;
.super Lmb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_40_41$1",
        "Lmb/b;",
        "Lub/a;",
        "database",
        "Ll83/a0;",
        "migrate",
        "(Lub/a;)V",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x28

    const/16 v1, 0x29

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE table_user (id INTEGER NOT NULL,created_at TEXT NOT NULL, first_name TEXT NOT NULL, last_name TEXT NOT NULL, full_name TEXT NOT NULL, email_address TEXT NOT NULL, password TEXT NOT NULL, username TEXT NOT NULL, avatar_url TEXT NOT NULL, city TEXT, admin_division TEXT, country TEXT NOT NULL, concealed INTEGER DEFAULT 0 NOT NULL, age INTEGER NOT NULL, PRIMARY KEY(id))"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE table_user_profile (id INTEGER NOT NULL,gender TEXT NOT NULL, height REAL NOT NULL, weight REAL NOT NULL, birthday TEXT NOT NULL, time_zone_offset TEXT NOT NULL, unit_system TEXT NOT NULL, fitness_level TEXT NOT NULL, max_heart_rate INTEGER NOT NULL, min_heart_rate INTEGER NOT NULL, physiological_baseline TEXT, can_upload_data INTEGER NOT NULL, PRIMARY KEY(id))"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
