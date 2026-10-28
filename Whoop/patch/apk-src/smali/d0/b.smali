.class public final Ld0/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ld0/p1;

.field public final synthetic G:J

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public w:Ld0/m;

.field public x:Lkotlin/jvm/internal/b0;

.field public y:I

.field public final synthetic z:Ld0/e;


# direct methods
.method public constructor <init>(Ld0/e;Ljava/lang/Object;Ld0/p1;JLkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld0/b;->z:Ld0/e;

    iput-object p2, p0, Ld0/b;->E:Ljava/lang/Object;

    iput-object p3, p0, Ld0/b;->F:Ld0/p1;

    iput-wide p4, p0, Ld0/b;->G:J

    iput-object p6, p0, Ld0/b;->H:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 8

    new-instance v0, Ld0/b;

    iget-wide v4, p0, Ld0/b;->G:J

    iget-object v6, p0, Ld0/b;->H:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/b;->z:Ld0/e;

    iget-object v2, p0, Ld0/b;->E:Ljava/lang/Object;

    iget-object v3, p0, Ld0/b;->F:Ld0/p1;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Ld0/b;-><init>(Ld0/e;Ljava/lang/Object;Ld0/p1;JLkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ld0/b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v5, p0

    iget-object v1, v5, Ld0/b;->F:Ld0/p1;

    iget-object v7, v5, Ld0/b;->z:Ld0/e;

    iget-object v0, v7, Ld0/e;->c:Ld0/m;

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ld0/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, v5, Ld0/b;->x:Lkotlin/jvm/internal/b0;

    iget-object v1, v5, Ld0/b;->w:Ld0/m;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v2, v7, Ld0/e;->a:Ld0/f2;

    iget-object v2, v2, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    iget-object v4, v5, Ld0/b;->E:Ljava/lang/Object;

    invoke-interface {v2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld0/r;

    iput-object v2, v0, Ld0/m;->y:Ld0/r;

    iget-object v2, v1, Ld0/p1;->c:Ljava/lang/Object;

    iget-object v4, v7, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v4, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v7, Ld0/e;->d:Lp1/k1;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v15

    iget-object v2, v0, Ld0/m;->y:Ld0/r;

    invoke-static {v2}, Ld0/f;->l(Ld0/r;)Ld0/r;

    move-result-object v16

    iget-wide v8, v0, Ld0/m;->z:J

    iget-boolean v2, v0, Ld0/m;->F:Z

    new-instance v13, Ld0/m;

    iget-object v14, v0, Ld0/m;->w:Ld0/f2;

    const-wide/high16 v19, -0x8000000000000000L

    move/from16 v21, v2

    move-wide/from16 v17, v8

    invoke-direct/range {v13 .. v21}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;JJZ)V

    move-object v0, v13

    new-instance v10, Lkotlin/jvm/internal/b0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iget-wide v13, v5, Ld0/b;->G:J

    iget-object v9, v5, Ld0/b;->H:Lkotlin/jvm/functions/Function1;

    new-instance v4, Ld0/a;

    const/4 v11, 0x0

    move-object v8, v0

    move-object v6, v4

    invoke-direct/range {v6 .. v11}, Ld0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, v5, Ld0/b;->w:Ld0/m;

    iput-object v10, v5, Ld0/b;->x:Lkotlin/jvm/internal/b0;

    iput v3, v5, Ld0/b;->y:I

    move-wide v2, v13

    invoke-static/range {v0 .. v5}, Ld0/f;->d(Ld0/m;Ld0/h;JLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_2

    return-object v12

    :cond_2
    move-object v1, v0

    move-object v0, v10

    :goto_0
    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_3

    sget-object v0, Ld0/i;->w:Ld0/i;

    goto :goto_1

    :cond_3
    sget-object v0, Ld0/i;->x:Ld0/i;

    :goto_1
    invoke-static {v7}, Ld0/e;->b(Ld0/e;)V

    new-instance v2, Ld0/j;

    invoke-direct {v2, v1, v0}, Ld0/j;-><init>(Ld0/m;Ld0/i;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :goto_2
    invoke-static {v7}, Ld0/e;->b(Ld0/e;)V

    throw v0
.end method
