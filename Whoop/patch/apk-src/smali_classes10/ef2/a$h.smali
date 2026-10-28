.class final Lef2/a$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lef2/a;->l(ZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/data/remote/commons/Resource;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sleep.coach.data.repository.SleepCoachScheduleRepository$toggleSleepSchedule$2"
    f = "SleepCoachScheduleRepository.kt"
    l = {
        0x59,
        0x5b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Z

.field final synthetic z:Lef2/a;


# direct methods
.method public constructor <init>(ZLef2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lef2/a;",
            "Lq83/d<",
            "-",
            "Lef2/a$h;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lef2/a$h;->y:Z

    iput-object p2, p0, Lef2/a$h;->z:Lef2/a;

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

    new-instance p1, Lef2/a$h;

    iget-boolean v0, p0, Lef2/a$h;->y:Z

    iget-object v1, p0, Lef2/a$h;->z:Lef2/a;

    invoke-direct {p1, v0, v1, p2}, Lef2/a$h;-><init>(ZLef2/a;Lq83/d;)V

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
            "Lcom/whoop/data/remote/commons/Resource<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lef2/a$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lef2/a$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lef2/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lef2/a$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lef2/a$h;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lef2/a$h;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lef2/a$h;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v1, "failed to toggle sleep schedule"

    :try_start_2
    iget-boolean p1, p0, Lef2/a$h;->y:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lef2/a$h;->z:Lef2/a;

    invoke-static {p1}, Lef2/a;->d(Lef2/a;)Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    move-result-object p1

    iput-object v1, p0, Lef2/a$h;->w:Ljava/lang/Object;

    iput v3, p0, Lef2/a$h;->x:I

    invoke-interface {p1, p0}, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;->enableSleepSchedule(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lef2/a$h;->z:Lef2/a;

    invoke-static {p1}, Lef2/a;->d(Lef2/a;)Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    move-result-object p1

    iput-object v1, p0, Lef2/a$h;->w:Ljava/lang/Object;

    iput v2, p0, Lef2/a$h;->x:I

    invoke-interface {p1, p0}, Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;->disableSleepSchedule(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    :goto_3
    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, p1, Lud3/x0;->Q:Z

    if-eqz v0, :cond_6

    sget-object p1, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1

    :cond_6
    sget-object v2, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    iget-object p1, p1, Lud3/x0;->y:Ljava/lang/String;

    if-nez p1, :cond_7

    move-object v3, v1

    goto :goto_4

    :cond_7
    move-object v3, p1

    :goto_4
    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_5
    iget-object v0, p0, Lef2/a$h;->z:Lef2/a;

    invoke-static {v0}, Lef2/a;->b(Lef2/a;)Ltr2/n;

    move-result-object v0

    iget-object v2, p0, Lef2/a$h;->z:Lef2/a;

    invoke-static {v2}, Lef2/a;->a(Lef2/a;)Lrr2/c;

    move-result-object v2

    invoke-static {p1, v1, v0, v2}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    sget-object v3, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    move-object v4, v1

    goto :goto_6

    :cond_8
    move-object v4, p1

    :goto_6
    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method
