.class public abstract Ly42/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ly42/a;",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "a",
        "(Ly42/a;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "puffin_release"
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
.method public static final a(Ly42/a;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;

    sget-object v1, Lht0/a;->NORDIC:Lht0/a;

    invoke-interface {p0}, Ly42/a;->O()Lc52/d;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lc52/d;->a()Loh2/b;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const-string v4, ""

    if-nez v2, :cond_1

    move-object v2, v4

    :cond_1
    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;-><init>(Lht0/a;Ljava/lang/String;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    sget-object v2, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->PUFFIN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    invoke-interface {p0}, Ly42/a;->O()Lc52/d;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lc52/d;->c()Ljava/lang/String;

    move-result-object v3

    :cond_2
    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v3

    :goto_1
    invoke-direct {v1, v2, v4, v0}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method
