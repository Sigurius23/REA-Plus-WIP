.class final Lt03/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt03/c;->g(Lud3/v0;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploaderImpl$doUpload$2"
    f = "SmartAlarmDiagnosticUploader.kt"
    l = {
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lt03/c;

.field final synthetic y:Lud3/v0;


# direct methods
.method public constructor <init>(Lt03/c;Lud3/v0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt03/c;",
            "Lud3/v0;",
            "Lq83/d<",
            "-",
            "Lt03/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt03/c$a;->x:Lt03/c;

    iput-object p2, p0, Lt03/c$a;->y:Lud3/v0;

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

    new-instance p1, Lt03/c$a;

    iget-object v0, p0, Lt03/c$a;->x:Lt03/c;

    iget-object v1, p0, Lt03/c$a;->y:Lud3/v0;

    invoke-direct {p1, v0, v1, p2}, Lt03/c$a;-><init>(Lt03/c;Lud3/v0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lt03/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt03/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt03/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt03/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const-string v0, "Unable to upload smart alarm diagnostic data - HTTP "

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lt03/c$a;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

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

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto/16 :goto_4

    :catch_3
    move-exception p1

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {p1}, Lt03/c;->e(Lt03/c;)Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    move-result-object p1

    iget-object v2, p0, Lt03/c$a;->y:Lud3/v0;

    iget-object v7, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {v7}, Lt03/c;->c(Lt03/c;)Ljava/util/Map;

    move-result-object v7

    iput v4, p0, Lt03/c$a;->w:I

    invoke-interface {p1, v2, v7, p0}, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;->sendSmartAlarmDiagnosticAlarmService(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lpg3/v0;

    iget-object v1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v1, v1, Lud3/x0;->Q:Z

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {v1}, Lt03/c;->d(Lt03/c;)Ltr2/n;

    move-result-object v1

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget p1, p1, Lud3/x0;->z:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v6, [Lqr2/a$a;

    invoke-interface {v1, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    move v4, v6

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {v0}, Lt03/c;->b(Lt03/c;)Lrr2/c;

    move-result-object v0

    new-instance v1, Lcom/whoop/domain/exception/ConnectivityException;

    const-string v2, "Some error occurred while uploading smart alarm diagnostic data!"

    invoke-direct {v1, v2, p1}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v1, v5, v3, v5}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_6

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Caught a network exception while uploading smart alarm diagnostic data: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {v0}, Lt03/c;->d(Lt03/c;)Ltr2/n;

    move-result-object v0

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_6

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Caught a NPE during upload of smart alarm diagnostic data: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {v1}, Lt03/c;->b(Lt03/c;)Lrr2/c;

    move-result-object v1

    new-instance v2, Lcom/whoop/domain/exception/ConnectivityException;

    invoke-direct {v2, v0, p1}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, v2, v5, v3, v5}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_6

    :goto_5
    iget-object v0, p0, Lt03/c$a;->x:Lt03/c;

    invoke-static {v0}, Lt03/c;->d(Lt03/c;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Failed to upload smart alarm diagnostic data "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
