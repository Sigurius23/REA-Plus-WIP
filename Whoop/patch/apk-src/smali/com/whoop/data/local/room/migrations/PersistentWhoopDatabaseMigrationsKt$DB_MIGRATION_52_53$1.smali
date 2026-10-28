.class public final Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_52_53$1;
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
        "com/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_52_53$1",
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

    const/16 v0, 0x34

    const/16 v1, 0x35

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 4

    const-string v0, "INSERT INTO whoop_labs_mystic_reading (id, systolic, diastolic, timestamp) SELECT id, systolic, diastolic, timestamp FROM whoop_labs_bp_reading"

    const-string v1, "DROP TABLE whoop_labs_bp_reading"

    const-string v2, "database"

    const-string v3, "CREATE TABLE whoop_labs_mystic_reading (id INTEGER NOT NULL,systolic INTEGER NOT NULL,diastolic INTEGER NOT NULL,timestamp TEXT NOT NULL,PRIMARY KEY (id))"

    invoke-static {p1, v2, v3, v0, v1}, Lhc3/i;->s(Lub/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
