.class final Lvk0/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk0/c;->a(Lvk0/a;Lsj2/a;Lvk0/i;Lst0/v;)Lbc3/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lvk0/e;",
        "<anonymous>",
        "()Lvk0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bleTaskExecutor.BleTaskExecutorImpl$submitDeferredTask$1"
    f = "BleTaskExecutorImpl.kt"
    l = {
        0x74
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic F:Lvk0/i;

.field final synthetic G:Lvk0/g;

.field final synthetic H:Lvk0/a;

.field w:I

.field final synthetic x:Lvk0/c;

.field final synthetic y:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic z:Lst0/v;


# direct methods
.method public constructor <init>(Lvk0/c;Lkotlin/jvm/internal/g0;Lst0/v;Lkotlin/jvm/internal/g0;Lvk0/i;Lvk0/g;Lvk0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/c;",
            "Lkotlin/jvm/internal/g0;",
            "Lst0/v;",
            "Lkotlin/jvm/internal/g0;",
            "Lvk0/i;",
            "Lvk0/g;",
            "Lvk0/a;",
            "Lq83/d<",
            "-",
            "Lvk0/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvk0/c$a;->x:Lvk0/c;

    iput-object p2, p0, Lvk0/c$a;->y:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lvk0/c$a;->z:Lst0/v;

    iput-object p4, p0, Lvk0/c$a;->E:Lkotlin/jvm/internal/g0;

    iput-object p5, p0, Lvk0/c$a;->F:Lvk0/i;

    iput-object p6, p0, Lvk0/c$a;->G:Lvk0/g;

    iput-object p7, p0, Lvk0/c$a;->H:Lvk0/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvk0/c$a;

    iget-object v1, p0, Lvk0/c$a;->x:Lvk0/c;

    iget-object v2, p0, Lvk0/c$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Lvk0/c$a;->z:Lst0/v;

    iget-object v4, p0, Lvk0/c$a;->E:Lkotlin/jvm/internal/g0;

    iget-object v5, p0, Lvk0/c$a;->F:Lvk0/i;

    iget-object v6, p0, Lvk0/c$a;->G:Lvk0/g;

    iget-object v7, p0, Lvk0/c$a;->H:Lvk0/a;

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lvk0/c$a;-><init>(Lvk0/c;Lkotlin/jvm/internal/g0;Lst0/v;Lkotlin/jvm/internal/g0;Lvk0/i;Lvk0/g;Lvk0/a;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lvk0/c$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvk0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lvk0/c$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvk0/c$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lvk0/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lvk0/c$a;->w:I

    const/4 v7, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v7, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lvk0/c$a;->x:Lvk0/c;

    invoke-static {v0}, Lvk0/c;->c(Lvk0/c;)Lvk0/h;

    move-result-object v0

    iget-object v1, v5, Lvk0/c$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v5, Lvk0/c$a;->z:Lst0/v;

    invoke-virtual {v0, v1, v2}, Lvk0/h;->i(Ljava/lang/String;Lst0/v;)V

    iget-object v0, v5, Lvk0/c$a;->E:Lkotlin/jvm/internal/g0;

    iget-object v1, v5, Lvk0/c$a;->x:Lvk0/c;

    invoke-virtual {v1}, Lvk0/c;->f()Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v1

    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, v5, Lvk0/c$a;->F:Lvk0/i;

    iget-object v1, v5, Lvk0/c$a;->G:Lvk0/g;

    iget-object v2, v5, Lvk0/c$a;->H:Lvk0/a;

    check-cast v2, Lvk0/g;

    invoke-interface {v2}, Lvk0/g;->I()J

    move-result-wide v2

    iget-object v4, v5, Lvk0/c$a;->G:Lvk0/g;

    invoke-interface {v4}, Lvk0/g;->p()Z

    move-result v4

    iput v7, v5, Lvk0/c$a;->w:I

    invoke-interface/range {v0 .. v5}, Lvk0/i;->i(Lvk0/g;JZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    return-object v6

    :cond_2
    :goto_0
    iget-object v1, v5, Lvk0/c$a;->E:Lkotlin/jvm/internal/g0;

    iget-object v2, v5, Lvk0/c$a;->x:Lvk0/c;

    iget-object v3, v5, Lvk0/c$a;->y:Lkotlin/jvm/internal/g0;

    iget-object v15, v5, Lvk0/c$a;->z:Lst0/v;

    iget-object v4, v5, Lvk0/c$a;->G:Lvk0/g;

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    const/4 v8, 0x0

    if-nez v6, :cond_5

    check-cast v0, Lzj0/h;

    iget-object v4, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v4, :cond_4

    move v9, v8

    invoke-static {v2}, Lvk0/c;->c(Lvk0/c;)Lvk0/h;

    move-result-object v8

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lzj0/h;->W()Z

    move-result v4

    move v10, v4

    goto :goto_1

    :cond_3
    move v10, v9

    :goto_1
    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v2}, Lvk0/c;->f()Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v13

    move-object v9, v3

    invoke-virtual/range {v8 .. v15}, Lvk0/h;->h(Ljava/lang/String;ZJJLst0/v;)V

    :cond_4
    new-instance v1, Lvk0/e$b;

    invoke-direct {v1, v0}, Lvk0/e$b;-><init>(Lzj0/h;)V

    return-object v1

    :cond_5
    move v9, v8

    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_6

    invoke-static {v2}, Lvk0/c;->c(Lvk0/c;)Lvk0/h;

    move-result-object v8

    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v2}, Lvk0/c;->f()Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v13

    const/4 v10, 0x0

    move/from16 v16, v9

    move-object v9, v0

    move/from16 v0, v16

    invoke-virtual/range {v8 .. v15}, Lvk0/h;->h(Ljava/lang/String;ZJJLst0/v;)V

    goto :goto_2

    :cond_6
    move v0, v9

    :goto_2
    invoke-static {v2}, Lvk0/c;->d(Lvk0/c;)Ltr2/n;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v4, v2, v7, v2}, Lvk0/g;->B(Lvk0/g;Lst0/v;ILjava/lang/Object;)Llt0/a;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Command Task "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " failed due to "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, v2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of v0, v6, Ljava/lang/Exception;

    if-eqz v0, :cond_7

    new-instance v0, Lvk0/e$a;

    check-cast v6, Ljava/lang/Exception;

    invoke-direct {v0, v6}, Lvk0/e$a;-><init>(Ljava/lang/Exception;)V

    return-object v0

    :cond_7
    throw v6
.end method
