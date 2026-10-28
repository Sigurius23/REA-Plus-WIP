.class final Lze2/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lze2/h;->i(Ljava/lang/String;Lze2/e;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lze2/g;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor$deleteScheduleById$2"
    f = "SleepScheduleListInteractor.kt"
    l = {
        0x4f,
        0x50,
        0x52,
        0x54,
        0x57,
        0x5a,
        0x5b,
        0x5c,
        0x61,
        0x65
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lze2/e;

.field final synthetic I:Lze2/h;

.field final synthetic J:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lze2/e;Lze2/h;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze2/e;",
            "Lze2/h;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lze2/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lze2/h$b;->H:Lze2/e;

    iput-object p2, p0, Lze2/h$b;->I:Lze2/h;

    iput-object p3, p0, Lze2/h$b;->J:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lze2/h$b;

    iget-object v1, p0, Lze2/h$b;->H:Lze2/e;

    iget-object v2, p0, Lze2/h$b;->I:Lze2/h;

    iget-object v3, p0, Lze2/h$b;->J:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lze2/h$b;-><init>(Lze2/e;Lze2/h;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lze2/h$b;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lze2/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lze2/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lze2/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lze2/h$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lze2/h$b;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget v2, p0, Lze2/h$b;->E:I

    iget-object v3, p0, Lze2/h$b;->y:Ljava/lang/Object;

    check-cast v3, Lze2/h$a;

    iget-object v5, p0, Lze2/h$b;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    iget-object v5, p0, Lze2/h$b;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_1
    iget v2, p0, Lze2/h$b;->E:I

    iget-object v3, p0, Lze2/h$b;->y:Ljava/lang/Object;

    check-cast v3, Lze2/h$a;

    iget-object v5, p0, Lze2/h$b;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    iget-object v5, p0, Lze2/h$b;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    iget-object v0, p0, Lze2/h$b;->y:Ljava/lang/Object;

    check-cast v0, Lze2/h$a;

    :pswitch_3
    iget-object v0, p0, Lze2/h$b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/commons/Resource;

    :pswitch_4
    iget-object v0, p0, Lze2/h$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    iget v2, p0, Lze2/h$b;->E:I

    iget-object v5, p0, Lze2/h$b;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    iget-object v5, p0, Lze2/h$b;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    iget-object v5, p0, Lze2/h$b;->w:Ljava/lang/Object;

    check-cast v5, Lze2/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_6
    iget v2, p0, Lze2/h$b;->E:I

    iget-object v5, p0, Lze2/h$b;->z:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/data/remote/commons/Resource;

    iget-object v5, p0, Lze2/h$b;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lze2/h$b;->x:Ljava/lang/Object;

    check-cast v6, Lze2/e;

    iget-object v7, p0, Lze2/h$b;->w:Ljava/lang/Object;

    check-cast v7, Lze2/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v6

    move-object v6, v5

    move-object v5, v7

    move-object v7, v9

    goto :goto_2

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lze2/g$c;

    new-instance v2, Lze2/d$a;

    iget-object v5, p0, Lze2/h$b;->H:Lze2/e;

    invoke-direct {v2, v5}, Lze2/d$a;-><init>(Lze2/e;)V

    invoke-direct {p1, v2}, Lze2/g$c;-><init>(Lze2/d;)V

    iput-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lze2/h$b;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_0
    iget-object p1, p0, Lze2/h$b;->I:Lze2/h;

    invoke-static {p1}, Lze2/h;->e(Lze2/h;)Lef2/a;

    move-result-object p1

    iget-object v2, p0, Lze2/h$b;->J:Ljava/lang/String;

    iput-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lze2/h$b;->F:I

    invoke-virtual {p1, v2, p0}, Lef2/a;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    iget-object v2, p0, Lze2/h$b;->I:Lze2/h;

    iget-object v6, p0, Lze2/h$b;->H:Lze2/e;

    iget-object v5, p0, Lze2/h$b;->J:Ljava/lang/String;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {v2}, Lze2/h;->g(Lze2/h;)Lff2/a;

    move-result-object p1

    iput-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v2, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v6, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object v5, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->z:Ljava/lang/Object;

    iput v3, p0, Lze2/h$b;->E:I

    const/4 v7, 0x3

    iput v7, p0, Lze2/h$b;->F:I

    invoke-virtual {p1, p0}, Lff2/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_6

    :cond_2
    move-object v7, v6

    move-object v6, v5

    move-object v5, v2

    move v2, v3

    :goto_2
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result v8

    if-eqz v8, :cond_8

    iput-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v5, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->z:Ljava/lang/Object;

    iput v2, p0, Lze2/h$b;->E:I

    const/4 p1, 0x4

    iput p1, p0, Lze2/h$b;->F:I

    invoke-static {v5, p0}, Lze2/h;->b(Lze2/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_3
    check-cast p1, Lze2/h$a;

    sget-object v6, Lze2/h$a$a;->a:Lze2/h$a$a;

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v5}, Lze2/h;->d(Lze2/h;)Ltr2/n;

    move-result-object p1

    const-string v5, "Failed to fetch smart alarm preferences"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v5, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lze2/g$a;->a:Lze2/g$a;

    iput-object v4, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput v2, p0, Lze2/h$b;->E:I

    const/4 v2, 0x5

    iput v2, p0, Lze2/h$b;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_6

    :cond_4
    instance-of v3, p1, Lze2/h$a$b;

    if-eqz v3, :cond_7

    new-instance v3, Lze2/g$c;

    new-instance v5, Lze2/d$c;

    move-object v6, p1

    check-cast v6, Lze2/h$a$b;

    invoke-virtual {v6}, Lze2/h$a$b;->a()Lze2/e;

    move-result-object v6

    invoke-direct {v5, v6}, Lze2/d$c;-><init>(Lze2/e;)V

    invoke-direct {v3, v5}, Lze2/g$c;-><init>(Lze2/d;)V

    iput-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object p1, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput v2, p0, Lze2/h$b;->E:I

    const/4 v5, 0x6

    iput v5, p0, Lze2/h$b;->F:I

    invoke-interface {v0, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_5

    goto/16 :goto_6

    :cond_5
    move-object v3, p1

    :goto_4
    iput-object v0, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object v3, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput v2, p0, Lze2/h$b;->E:I

    const/4 p1, 0x7

    iput p1, p0, Lze2/h$b;->F:I

    const-wide/16 v5, 0x7d0

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_6

    :cond_6
    :goto_5
    new-instance p1, Lze2/g$c;

    new-instance v5, Lze2/d$d;

    check-cast v3, Lze2/h$a$b;

    invoke-virtual {v3}, Lze2/h$a$b;->a()Lze2/e;

    move-result-object v3

    invoke-direct {v5, v3}, Lze2/d$d;-><init>(Lze2/e;)V

    invoke-direct {p1, v5}, Lze2/g$c;-><init>(Lze2/d;)V

    iput-object v4, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput v2, p0, Lze2/h$b;->E:I

    const/16 v2, 0x8

    iput v2, p0, Lze2/h$b;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_6

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    invoke-static {v5}, Lze2/h;->d(Lze2/h;)Ltr2/n;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    const-string v8, "delete schedule success but update strap failed: "

    invoke-static {v8, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v5, p1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lze2/g$c;

    new-instance v3, Lze2/d$b;

    invoke-direct {v3, v7, v6}, Lze2/d$b;-><init>(Lze2/e;Ljava/lang/String;)V

    invoke-direct {p1, v3}, Lze2/g$c;-><init>(Lze2/d;)V

    iput-object v4, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->x:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->y:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->z:Ljava/lang/Object;

    iput v2, p0, Lze2/h$b;->E:I

    const/16 v2, 0x9

    iput v2, p0, Lze2/h$b;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_6

    :cond_9
    invoke-static {v2}, Lze2/h;->d(Lze2/h;)Ltr2/n;

    move-result-object p1

    const-string v2, "failed to delete "

    new-array v7, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lze2/g$c;

    new-instance v2, Lze2/d$b;

    invoke-direct {v2, v6, v5}, Lze2/d$b;-><init>(Lze2/e;Ljava/lang/String;)V

    invoke-direct {p1, v2}, Lze2/g$c;-><init>(Lze2/d;)V

    iput-object v4, p0, Lze2/h$b;->G:Ljava/lang/Object;

    iput-object v4, p0, Lze2/h$b;->w:Ljava/lang/Object;

    iput v3, p0, Lze2/h$b;->E:I

    const/16 v2, 0xa

    iput v2, p0, Lze2/h$b;->F:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_6
    return-object v1

    :cond_a
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
