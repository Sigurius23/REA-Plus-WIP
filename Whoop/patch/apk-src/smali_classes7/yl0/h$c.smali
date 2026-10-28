.class final Lyl0/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl0/h;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lyl0/g;",
        "state",
        "Lyl0/h$a;",
        "action",
        "<anonymous>",
        "(Lyl0/g;Lyl0/h$a;)Lyl0/g;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$2"
    f = "JournalEntryWidgetInteractor.kt"
    l = {
        0x61
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lyl0/h;


# direct methods
.method public constructor <init>(Lyl0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/h;",
            "Lq83/d<",
            "-",
            "Lyl0/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyl0/h$c;->z:Lyl0/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lyl0/g;Lyl0/h$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/g;",
            "Lyl0/h$a;",
            "Lq83/d<",
            "-",
            "Lyl0/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lyl0/h$c;

    iget-object v1, p0, Lyl0/h$c;->z:Lyl0/h;

    invoke-direct {v0, v1, p3}, Lyl0/h$c;-><init>(Lyl0/h;Lq83/d;)V

    iput-object p1, v0, Lyl0/h$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lyl0/h$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lyl0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyl0/g;

    check-cast p2, Lyl0/h$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lyl0/h$c;->f(Lyl0/g;Lyl0/h$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v5, p0

    iget-object v0, v5, Lyl0/h$c;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lyl0/g;

    iget-object v0, v5, Lyl0/h$c;->y:Ljava/lang/Object;

    check-cast v0, Lyl0/h$a;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lyl0/h$c;->w:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object v15, v5

    move-object v10, v6

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v1, v0, Lyl0/h$a$f;

    if-eqz v1, :cond_3

    check-cast v0, Lyl0/h$a$f;

    invoke-virtual {v0}, Lyl0/h$a$f;->a()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_2

    const/16 v18, 0x7b8

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v0}, Lyl0/h$a$f;->a()Ljava/lang/Boolean;

    move-result-object v7

    const/16 v18, 0x7fe

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v1, v0, Lyl0/h$a$g;

    if-eqz v1, :cond_6

    invoke-virtual {v6}, Lyl0/g;->i()Lyl0/a;

    move-result-object v1

    if-eqz v1, :cond_4

    move-object v3, v0

    check-cast v3, Lyl0/h$a$g;

    invoke-virtual {v3}, Lyl0/h$a$g;->a()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lyl0/a;->a(D)Z

    move-result v1

    if-nez v1, :cond_4

    const/16 v18, 0x7df

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_4
    check-cast v0, Lyl0/h$a$g;

    invoke-virtual {v0}, Lyl0/h$a$g;->a()D

    move-result-wide v0

    invoke-virtual {v6}, Lyl0/g;->c()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    new-instance v8, Ljava/lang/Double;

    invoke-direct {v8, v0, v1}, Ljava/lang/Double;-><init>(D)V

    const/16 v18, 0x7dc

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_6
    instance-of v1, v0, Lyl0/h$a$i;

    if-eqz v1, :cond_7

    const/16 v18, 0x7df

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_7
    instance-of v1, v0, Lyl0/h$a$e;

    if-eqz v1, :cond_8

    const/16 v18, 0x7df

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v1, v0, Lyl0/h$a$h;

    if-eqz v1, :cond_a

    check-cast v0, Lyl0/h$a$h;

    invoke-virtual {v0}, Lyl0/h$a$h;->a()J

    move-result-wide v0

    invoke-virtual {v6}, Lyl0/g;->c()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    new-instance v9, Ljava/lang/Long;

    invoke-direct {v9, v0, v1}, Ljava/lang/Long;-><init>(J)V

    const/16 v18, 0x7fa

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_a
    instance-of v1, v0, Lyl0/h$a$d;

    if-eqz v1, :cond_e

    invoke-virtual {v6}, Lyl0/g;->l()Z

    move-result v0

    if-eqz v0, :cond_b

    move-object v10, v6

    goto :goto_2

    :cond_b
    invoke-virtual {v6}, Lyl0/g;->c()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object v8, v9

    goto :goto_0

    :cond_c
    invoke-virtual {v6}, Lyl0/g;->j()Ljava/lang/Double;

    move-result-object v1

    move-object v8, v1

    :goto_0
    if-eqz v0, :cond_d

    goto :goto_1

    :cond_d
    invoke-virtual {v6}, Lyl0/g;->k()Ljava/lang/Long;

    move-result-object v9

    :goto_1
    sget-object v14, Lyl0/e;->LOADING:Lyl0/e;

    const/16 v18, 0x779

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v19}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_e
    move-object v10, v6

    instance-of v1, v0, Lyl0/h$a$c;

    if-eqz v1, :cond_14

    invoke-virtual {v10}, Lyl0/g;->d()Lyl0/e;

    move-result-object v0

    sget-object v1, Lyl0/e;->LOADING:Lyl0/e;

    if-eq v0, v1, :cond_f

    :goto_2
    return-object v10

    :cond_f
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v5, Lyl0/h$c;->z:Lyl0/h;

    invoke-static {v1}, Lyl0/h;->d(Lyl0/h;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lyl0/h$c$a;

    iget-object v3, v5, Lyl0/h$c;->z:Lyl0/h;

    invoke-direct {v4, v3, v10, v9}, Lyl0/h$c$a;-><init>(Lyl0/h;Lyl0/g;Lq83/d;)V

    iput-object v10, v5, Lyl0/h$c;->x:Ljava/lang/Object;

    iput-object v9, v5, Lyl0/h$c;->y:Ljava/lang/Object;

    iput v2, v5, Lyl0/h$c;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v5

    if-ne v0, v8, :cond_10

    return-object v8

    :cond_10
    :goto_3
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_12

    move-object v1, v9

    sget-object v9, Lyl0/e;->SUCCESS:Lyl0/e;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryResponse;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryResponse;->getFollowupMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_11
    move-object v0, v1

    :goto_4
    const/16 v13, 0x27f

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v1, v10

    move-object v10, v0

    invoke-static/range {v1 .. v14}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_12
    move-object v6, v10

    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_13

    iget-object v1, v15, Lyl0/h$c;->z:Lyl0/h;

    invoke-static {v1}, Lyl0/h;->d(Lyl0/h;)Ltr2/n;

    move-result-object v1

    invoke-virtual {v6}, Lyl0/g;->e()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Commit failed. Path: "

    const-string v5, ". "

    invoke-static {v4, v2, v5, v3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "JournalEntryWidget"

    invoke-interface {v1, v4, v2, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {v0}, Lyl0/i;->a(Lu02/a$b;)Lyl0/e;

    move-result-object v9

    const/16 v13, 0x77f

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v14}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_14
    move-object v15, v5

    move-object v6, v10

    instance-of v1, v0, Lyl0/h$a$b;

    if-eqz v1, :cond_15

    const/16 v13, 0x6ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v14}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_15
    instance-of v0, v0, Lyl0/h$a$a;

    if-eqz v0, :cond_16

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v14}, Lyl0/g;->b(Lyl0/g;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lyl0/g;

    move-result-object v0

    return-object v0

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
