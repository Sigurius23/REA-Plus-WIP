.class final Lvr2/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr2/d;->g(Lud3/v0;)Z
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
    c = "com.whoop.util.log.logService.LogEventUploaderImpl$doUpload$1"
    f = "LogEventUploaderImpl.kt"
    l = {
        0xaa
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field x:I

.field final synthetic y:Lvr2/d;

.field final synthetic z:Lud3/v0;


# direct methods
.method public constructor <init>(Lvr2/d;Lud3/v0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr2/d;",
            "Lud3/v0;",
            "Lq83/d<",
            "-",
            "Lvr2/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr2/d$b;->y:Lvr2/d;

    iput-object p2, p0, Lvr2/d$b;->z:Lud3/v0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lvr2/d$b;

    iget-object v0, p0, Lvr2/d$b;->y:Lvr2/d;

    iget-object v1, p0, Lvr2/d$b;->z:Lud3/v0;

    invoke-direct {p1, v0, v1, p2}, Lvr2/d$b;-><init>(Lvr2/d;Lud3/v0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvr2/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvr2/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvr2/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvr2/d$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const-string v0, "Could not read the errorBody of the response: "

    const-string v1, "ErrorBody: "

    const-string v2, "Uploading of logs failed due to HTTP status code: "

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lvr2/d$b;->x:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    iget v3, p0, Lvr2/d$b;->w:I

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lvr2/d$b;->y:Lvr2/d;

    invoke-virtual {p1}, Lvr2/d;->i()Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;

    move-result-object p1

    iget-object v4, p0, Lvr2/d$b;->z:Lud3/v0;

    iget-object v7, p0, Lvr2/d$b;->y:Lvr2/d;

    invoke-static {v7}, Lvr2/d;->b(Lvr2/d;)Ljava/util/Map;

    move-result-object v7

    iput v6, p0, Lvr2/d$b;->w:I

    iput v5, p0, Lvr2/d$b;->x:I

    invoke-interface {p1, v4, v7, p0}, Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;->uploadLogs(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-ne p1, v3, :cond_2

    return-object v3

    :cond_2
    move v3, v6

    :goto_0
    :try_start_2
    check-cast p1, Lpg3/v0;

    iget-object v4, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v3, v4, Lud3/x0;->Q:Z

    if-nez v3, :cond_3

    iget-object v4, p0, Lvr2/d$b;->y:Lvr2/d;

    invoke-static {v4}, Lvr2/d;->c(Lvr2/d;)Loh3/d;

    move-result-object v4

    iget-object v7, p1, Lpg3/v0;->a:Lud3/x0;

    iget v7, v7, Lud3/x0;->z:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v6, [Ljava/lang/Object;

    invoke-virtual {v4, v2, v7}, Loh3/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lvr2/d$b;->y:Lvr2/d;

    invoke-static {v2}, Lvr2/d;->c(Lvr2/d;)Loh3/d;

    move-result-object v2

    new-instance v4, Lcom/google/gson/GsonBuilder;

    invoke-direct {v4}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/google/gson/GsonBuilder;->setPrettyPrinting()Lcom/google/gson/GsonBuilder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v6, [Ljava/lang/Object;

    invoke-virtual {v2, p1, v1}, Loh3/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    :try_start_4
    iget-object v1, p0, Lvr2/d$b;->y:Lvr2/d;

    invoke-static {v1}, Lvr2/d;->c(Lvr2/d;)Loh3/d;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v0}, Loh3/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :catch_2
    move-exception p1

    move v3, v6

    :goto_1
    iget-object v0, p0, Lvr2/d$b;->y:Lvr2/d;

    invoke-static {v0}, Lvr2/d;->c(Lvr2/d;)Loh3/d;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Encountered exception while synchronously uploading logs: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v6, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Loh3/d;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    move v5, v6

    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
