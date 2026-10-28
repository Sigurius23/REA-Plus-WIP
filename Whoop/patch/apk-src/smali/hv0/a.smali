.class public final Lhv0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lhv0/a;",
        "",
        "Lat0/a;",
        "Lzt0/b;",
        "<init>",
        "()V",
        "from",
        "a",
        "(Lat0/a;)Lzt0/b;",
        "console-packets_release"
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
.method public a(Lat0/a;)Lzt0/b;
    .locals 16

    const-string v0, "from"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lat0/a;->e()J

    move-result-wide v5

    invoke-virtual {v1}, Lat0/a;->f()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-virtual {v1}, Lat0/a;->g()I

    move-result v4

    invoke-virtual {v1}, Lat0/a;->i()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lat0/a;->c()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lat0/a;->d()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lat0/a;->b()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lat0/a;->a()I

    move-result v15

    invoke-virtual {v1}, Lat0/a;->h()Ljava/lang/String;

    move-result-object v11

    new-instance v7, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    move-object v9, v7

    invoke-direct/range {v9 .. v15}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v1, Lzt0/b;

    const/4 v9, 0x1

    const/4 v10, 0x0

    const-wide/16 v2, 0x0

    invoke-direct/range {v1 .. v10}, Lzt0/b;-><init>(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
