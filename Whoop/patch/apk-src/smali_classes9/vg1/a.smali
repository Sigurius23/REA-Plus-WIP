.class public abstract Lvg1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "",
        "b",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Ljava/lang/String;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
        "firmware-update-service_release"
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
.method public static final a(Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->Companion:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice$a;

    invoke-virtual {v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {v0, v1, p0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    return-object p0
.end method

.method public static final b(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->Companion:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice$a;

    invoke-virtual {v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
