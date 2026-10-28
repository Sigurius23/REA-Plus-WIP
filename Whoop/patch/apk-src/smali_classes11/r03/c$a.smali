.class final Lr03/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr03/c;->h(Lud3/v0;Lzt0/a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.workmanager.consolepacketworkmanager.ConsolePacketUploaderImpl$doUpload$1"
    f = "ConsolePacketUploaderImpl.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lr03/c;

.field final synthetic y:Lud3/v0;

.field final synthetic z:Lzt0/a;


# direct methods
.method public constructor <init>(Lr03/c;Lud3/v0;Lzt0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr03/c;",
            "Lud3/v0;",
            "Lzt0/a;",
            "Lq83/d<",
            "-",
            "Lr03/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr03/c$a;->x:Lr03/c;

    iput-object p2, p0, Lr03/c$a;->y:Lud3/v0;

    iput-object p3, p0, Lr03/c$a;->z:Lzt0/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lr03/c$a;

    iget-object v0, p0, Lr03/c$a;->x:Lr03/c;

    iget-object v1, p0, Lr03/c$a;->y:Lud3/v0;

    iget-object v2, p0, Lr03/c$a;->z:Lzt0/a;

    invoke-direct {p1, v0, v1, v2, p2}, Lr03/c$a;-><init>(Lr03/c;Lud3/v0;Lzt0/a;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lr03/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lr03/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lr03/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lr03/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lr03/c$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_3

    :catch_3
    move-exception p1

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lr03/c$a;->x:Lr03/c;

    invoke-static {p1}, Lr03/c;->f(Lr03/c;)Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object p1

    iget-object v1, p0, Lr03/c$a;->y:Lud3/v0;

    iget-object v6, p0, Lr03/c$a;->x:Lr03/c;

    iget-object v7, p0, Lr03/c$a;->z:Lzt0/a;

    invoke-static {v6, v7}, Lr03/c;->d(Lr03/c;Lzt0/a;)Ljava/util/Map;

    move-result-object v6

    iput v3, p0, Lr03/c$a;->w:I

    invoke-interface {p1, v1, v6, p0}, Lcom/whoop/data/remote/RemoteDataSource;->uploadConsoleEventPackets(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v5, p1, Lud3/x0;->Q:Z
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :goto_1
    iget-object v0, p0, Lr03/c$a;->x:Lr03/c;

    invoke-static {v0}, Lr03/c;->b(Lr03/c;)Lrr2/c;

    move-result-object v0

    new-instance v1, Lcom/whoop/domain/exception/ConsolePacketUploadException;

    const-string v3, "Some error occurred while uploading console logs!"

    invoke-direct {v1, v3, p1}, Lcom/whoop/domain/exception/ConsolePacketUploadException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v1, v4, v2, v4}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_5

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Caught a network exception while uploading console logs: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lr03/c$a;->x:Lr03/c;

    invoke-static {v0}, Lr03/c;->e(Lr03/c;)Ltr2/n;

    move-result-object v0

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_5

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Caught a NPE during upload of console logs: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lr03/c$a;->x:Lr03/c;

    invoke-static {v1}, Lr03/c;->b(Lr03/c;)Lrr2/c;

    move-result-object v1

    new-instance v3, Lcom/whoop/domain/exception/ConsolePacketUploadException;

    invoke-direct {v3, v0, p1}, Lcom/whoop/domain/exception/ConsolePacketUploadException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, v3, v4, v2, v4}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_5

    :goto_4
    iget-object v0, p0, Lr03/c$a;->x:Lr03/c;

    invoke-static {v0}, Lr03/c;->e(Lr03/c;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Failed to upload console logs "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
