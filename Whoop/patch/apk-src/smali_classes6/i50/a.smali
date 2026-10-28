.class public abstract Li50/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;",
        "Lj50/d;",
        "a",
        "(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;",
        "access_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;)Lj50/d;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj50/d;

    invoke-virtual {p0}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->getPreviewText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Lgz0/m0;->NOTES_EDIT:Lgz0/m0;

    invoke-static {v0, v5}, Lgz0/n0;->c(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/access/careupdateentrypointtile/models/CareUpdateEntrypointTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lj50/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;)V

    return-object v1
.end method
