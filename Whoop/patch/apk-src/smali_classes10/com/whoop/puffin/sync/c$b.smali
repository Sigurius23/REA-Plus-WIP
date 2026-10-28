.class final Lcom/whoop/puffin/sync/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/puffin/sync/c;->h(Ly42/a;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/puffin/sync/f$b;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/puffin/sync/f$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.sync.BatterySyncHolder$doWork$2"
    f = "BatterySyncHolder.kt"
    l = {
        0x2b,
        0x2d,
        0x2e,
        0x30,
        0x36
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:J

.field H:J

.field I:I

.field J:I

.field private synthetic K:Ljava/lang/Object;

.field final synthetic L:Ly42/a;

.field final synthetic M:Lcom/whoop/puffin/sync/c;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly42/a;Lcom/whoop/puffin/sync/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lcom/whoop/puffin/sync/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/puffin/sync/c$b;->L:Ly42/a;

    iput-object p2, p0, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lcom/whoop/puffin/sync/c$b;

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$b;->L:Ly42/a;

    iget-object v2, p0, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/puffin/sync/c$b;-><init>(Ly42/a;Lcom/whoop/puffin/sync/c;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/puffin/sync/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/puffin/sync/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v5, p0

    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcom/whoop/puffin/sync/c$b;->J:I

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v2, 0x1

    const/4 v14, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v2, :cond_4

    if-eq v1, v12, :cond_3

    if-eq v1, v11, :cond_2

    if-eq v1, v10, :cond_1

    if-ne v1, v9, :cond_0

    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    check-cast v0, Lc52/d;

    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lvk0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->F:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/puffin/sync/f$b;

    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/puffin/sync/c;

    iget-object v1, v5, Lcom/whoop/puffin/sync/c$b;->z:Ljava/lang/Object;

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    check-cast v2, Lc52/d;

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    check-cast v2, Lvk0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    check-cast v2, Lc52/d;

    iget-object v3, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v3, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    check-cast v3, Lvk0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    :goto_0
    move-object v4, v2

    goto/16 :goto_4

    :cond_3
    iget-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    check-cast v2, Lc52/d;

    iget-object v3, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v4, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    check-cast v4, Lvk0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    iget-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    check-cast v2, Lc52/d;

    iget-object v3, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v4, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    check-cast v4, Lvk0/i;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    check-cast v4, Ll83/n;

    iget-object v4, v4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Lcom/whoop/puffin/sync/c$b;->L:Ly42/a;

    instance-of v3, v1, Lvk0/i;

    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, Lvk0/i;

    goto :goto_1

    :cond_6
    move-object v3, v14

    :goto_1
    if-eqz v3, :cond_d

    new-instance v4, Lcom/whoop/puffin/sync/c$b$a;

    iget-object v6, v5, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    invoke-direct {v4, v6, v1, v14}, Lcom/whoop/puffin/sync/c$b$a;-><init>(Lcom/whoop/puffin/sync/c;Ly42/a;Lq83/d;)V

    invoke-static {v0, v14, v4, v11}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v15

    iget-object v0, v5, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    invoke-static {v0}, Lcom/whoop/puffin/sync/c;->c(Lcom/whoop/puffin/sync/c;)Ljava/time/Clock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    iget-object v4, v5, Lcom/whoop/puffin/sync/c$b;->L:Ly42/a;

    invoke-interface {v4}, Ly42/a;->O()Lc52/d;

    move-result-object v4

    new-instance v6, La52/b;

    invoke-direct {v6}, La52/b;-><init>()V

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    iput-object v4, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    iput-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iput v2, v5, Lcom/whoop/puffin/sync/c$b;->J:I

    move-wide/from16 v16, v0

    move-object v0, v3

    const-wide/16 v2, 0x0

    move-object v1, v4

    const/4 v4, 0x0

    move-object v7, v1

    move-object v1, v6

    const/4 v6, 0x6

    move-object/from16 v18, v7

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v3, v15

    move-wide/from16 v0, v16

    move-object/from16 v2, v18

    :goto_2
    instance-of v4, v4, Ll83/m;

    if-nez v4, :cond_b

    iget-object v4, v5, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    invoke-static {v4}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v4

    const-string v6, "beginning puffin sync"

    new-array v7, v13, [Lqr2/a$a;

    invoke-interface {v4, v6, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v4, v5, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    invoke-static {v4}, Lcom/whoop/puffin/sync/c;->e(Lcom/whoop/puffin/sync/c;)Lx42/b;

    move-result-object v4

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    iput-object v3, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    iput-object v2, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    iput-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iput v12, v5, Lcom/whoop/puffin/sync/c$b;->J:I

    invoke-virtual {v4, v5}, Lx42/b;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_8

    goto/16 :goto_6

    :cond_8
    :goto_3
    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    iput-object v2, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    iput-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iput v11, v5, Lcom/whoop/puffin/sync/c$b;->J:I

    invoke-interface {v3, v5}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_9

    goto/16 :goto_6

    :cond_9
    move-object v6, v3

    goto/16 :goto_0

    :goto_4
    iget-object v7, v5, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    move-object v2, v6

    check-cast v2, Lcom/whoop/puffin/sync/f$b;

    invoke-static {v7}, Lcom/whoop/puffin/sync/c;->c(Lcom/whoop/puffin/sync/c;)Ljava/time/Clock;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/Clock;->millis()J

    move-result-wide v11

    invoke-static {v7}, Lcom/whoop/puffin/sync/c;->e(Lcom/whoop/puffin/sync/c;)Lx42/b;

    move-result-object v3

    sget-object v9, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    move-wide/from16 v16, v11

    sub-long v10, v16, v0

    sget-object v9, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v10, v11, v9}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v9

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    iput-object v6, v5, Lcom/whoop/puffin/sync/c$b;->z:Ljava/lang/Object;

    iput-object v7, v5, Lcom/whoop/puffin/sync/c$b;->E:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->F:Ljava/lang/Object;

    iput-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iput v13, v5, Lcom/whoop/puffin/sync/c$b;->I:I

    move-wide/from16 v0, v16

    iput-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->H:J

    const/4 v15, 0x4

    iput v15, v5, Lcom/whoop/puffin/sync/c$b;->J:I

    move-object v1, v2

    move-object v0, v3

    move-wide v2, v9

    invoke-virtual/range {v0 .. v5}, Lx42/b;->d(Lcom/whoop/puffin/sync/f$b;JLc52/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    goto :goto_6

    :cond_a
    move-object v1, v6

    move-object v0, v7

    :goto_5
    invoke-static {v0}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v2

    const-string v3, "enqueuing one time BP packet upload work"

    new-array v4, v13, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v2, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;->z:Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;

    invoke-static {v0}, Lcom/whoop/puffin/sync/c;->f(Lcom/whoop/puffin/sync/c;)Lic/p0;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;->a(Lic/p0;)V

    check-cast v1, Lcom/whoop/puffin/sync/f$b;

    return-object v1

    :cond_b
    check-cast v3, Lbc3/t1;

    invoke-virtual {v3, v14}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iget-object v2, v5, Lcom/whoop/puffin/sync/c$b;->M:Lcom/whoop/puffin/sync/c;

    invoke-static {v2}, Lcom/whoop/puffin/sync/c;->e(Lcom/whoop/puffin/sync/c;)Lx42/b;

    move-result-object v2

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->K:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->w:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->x:Ljava/lang/Object;

    iput-object v14, v5, Lcom/whoop/puffin/sync/c$b;->y:Ljava/lang/Object;

    iput-wide v0, v5, Lcom/whoop/puffin/sync/c$b;->G:J

    iput v9, v5, Lcom/whoop/puffin/sync/c$b;->J:I

    invoke-virtual {v2, v5}, Lx42/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_c

    :goto_6
    return-object v8

    :cond_c
    :goto_7
    new-instance v9, Lcom/whoop/puffin/sync/f$b$a;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/whoop/puffin/sync/f$b$a;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Puffin must be a GenericGattService"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
