.class public final Lvt0/c$a;
.super Lmb/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvt0/c;
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
        "vt0/c$a",
        "Lmb/b;",
        "Lub/a;",
        "database",
        "Ll83/a0;",
        "migrate",
        "(Lub/a;)V",
        "connectivity-data-packets_release"
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

    const/16 v0, 0xd

    const/16 v1, 0xe

    invoke-direct {p0, v0, v1}, Lmb/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public migrate(Lub/a;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ALTER TABLE table_heart_data_versions ADD COLUMN firmware_version TEXT NOT NULL DEFAULT \'\'"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "UPDATE table_heart_data_versions SET firmware_version = firmware_major || \'.\' || firmware_minor || \'.\' || firmware_build || \'.\' || firmware_unreleased"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
