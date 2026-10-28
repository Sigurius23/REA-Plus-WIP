.class public final Lcom/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_55_56$1;
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
        "com/whoop/data/local/room/migrations/PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_55_56$1",
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

    const/16 v0, 0x37

    const/16 v1, 0x38

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE gps_locations (timestamp INTEGER NOT NULL,latitude REAL NOT NULL,longitude REAL NOT NULL,altitude REAL NOT NULL,horizontal_accuracy_meters REAL NOT NULL,vertical_accuracy_meters REAL NOT NULL,PRIMARY KEY (timestamp))"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX index_gps_locations_timestamp ON gps_locations(timestamp)"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
