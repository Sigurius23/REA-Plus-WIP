.class public final Lzt0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzt0/c;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "metadata",
        "",
        "a",
        "(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;)Ljava/lang/String;",
        "json",
        "b",
        "(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "connectivity-data-packets-model_release"
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
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->Companion:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;

    invoke-virtual {v1}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;
    .locals 2

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->Companion:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;

    invoke-virtual {v1}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata$a;->serializer()Lwc3/c;

    move-result-object v1

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    return-object p1
.end method
