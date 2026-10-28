.class public final Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_56_57$1;
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
        "com/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_56_57$1",
        "Lmb/b;",
        "Lub/a;",
        "db",
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

    const/16 v0, 0x38

    const/16 v1, 0x39

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 4

    const-string v0, "INSERT INTO whoop_labs_study_new (study_id, start_time, end_time, activity, hr_device_connected, status, campaign_id, pdf_file_name, protocol_step, protocol_completed) SELECT study_id, start_time, end_time, activity, hr_device_connected, status, campaign_id, pdf_file_name, protocol_step, protocol_completed FROM whoop_labs_study"

    const-string v1, "DROP TABLE whoop_labs_study"

    const-string v2, "db"

    const-string v3, "CREATE TABLE whoop_labs_study_new (study_id INTEGER NOT NULL,start_time TEXT NULL,end_time TEXT NULL,activity TEXT NULL,hr_device_connected INTEGER NOT NULL,status TEXT NOT NULL,campaign_id INTEGER NOT NULL,pdf_file_name TEXT NULL,protocol_step INTEGER NOT NULL DEFAULT 0,protocol_completed INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(study_id))"

    invoke-static {p1, v2, v3, v0, v1}, Lhc3/i;->s(Lub/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ALTER TABLE whoop_labs_study_new RENAME TO whoop_labs_study"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS sensor_position_to_campaign"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS sensor_positions"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
