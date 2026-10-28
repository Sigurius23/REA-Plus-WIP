.class final Lt81/d$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt81/d;->a(Lu2/v;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.zoomable.PinchToZoomGestureDetectorKt$detectPinchToZoomGesture$2"
    f = "PinchToZoomGestureDetector.kt"
    l = {
        0x26,
        0x28
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:F

.field F:J

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field x:I

.field y:I

.field z:F


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            "Lq83/d<",
            "-",
            "Lt81/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt81/d$a;->I:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

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

    new-instance v0, Lt81/d$a;

    iget-object v1, p0, Lt81/d$a;->I:Lkotlin/jvm/functions/Function3;

    invoke-direct {v0, v1, p2}, Lt81/d$a;-><init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput-object p1, v0, Lt81/d$a;->H:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lt81/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt81/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt81/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt81/d$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lt81/d$a;->H:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lt81/d$a;->G:I

    const-wide/16 v4, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v9, :cond_1

    if-ne v3, v7, :cond_0

    iget-wide v10, v0, Lt81/d$a;->F:J

    iget v3, v0, Lt81/d$a;->E:F

    iget v12, v0, Lt81/d$a;->y:I

    iget v13, v0, Lt81/d$a;->z:F

    iget v14, v0, Lt81/d$a;->x:I

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v15, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-wide v10, v0, Lt81/d$a;->F:J

    iget v3, v0, Lt81/d$a;->E:F

    iget v12, v0, Lt81/d$a;->y:I

    iget v13, v0, Lt81/d$a;->z:F

    iget v14, v0, Lt81/d$a;->x:I

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Lu2/g0;

    invoke-virtual {v3}, Lu2/g0;->f()Lb3/j3;

    move-result-object v10

    invoke-interface {v10}, Lb3/j3;->g()F

    move-result v10

    iput-object v3, v0, Lt81/d$a;->H:Ljava/lang/Object;

    iput v9, v0, Lt81/d$a;->x:I

    iput v6, v0, Lt81/d$a;->z:F

    iput v8, v0, Lt81/d$a;->y:I

    iput v10, v0, Lt81/d$a;->E:F

    iput-wide v4, v0, Lt81/d$a;->F:J

    iput v9, v0, Lt81/d$a;->G:I

    invoke-static {v3, v0, v7}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    goto :goto_1

    :cond_3
    move v13, v6

    move v12, v8

    move v14, v9

    move v3, v10

    move-wide v10, v4

    :goto_0
    iput-object v1, v0, Lt81/d$a;->H:Ljava/lang/Object;

    iput v14, v0, Lt81/d$a;->x:I

    iput v13, v0, Lt81/d$a;->z:F

    iput v12, v0, Lt81/d$a;->y:I

    iput v3, v0, Lt81/d$a;->E:F

    iput-wide v10, v0, Lt81/d$a;->F:J

    iput v7, v0, Lt81/d$a;->G:I

    invoke-static {v1, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v2, :cond_4

    :goto_1
    return-object v2

    :cond_4
    :goto_2
    check-cast v15, Lu2/k;

    move/from16 v16, v6

    iget-object v6, v15, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v6

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_6

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    move v4, v8

    goto :goto_3

    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    invoke-virtual {v5}, Lu2/r;->l()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    if-eq v5, v7, :cond_7

    move v4, v9

    :goto_3
    if-nez v4, :cond_d

    invoke-static {v15}, Lh0/q3;->l(Lu2/k;)F

    move-result v5

    if-nez v12, :cond_8

    mul-float/2addr v13, v5

    invoke-static {v15, v8}, Lh0/q3;->i(Lu2/k;Z)F

    move-result v18

    int-to-float v7, v9

    sub-float/2addr v7, v13

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float v7, v7, v18

    cmpl-float v7, v7, v3

    if-lez v7, :cond_8

    move v12, v9

    :cond_8
    if-eqz v12, :cond_d

    const-wide/16 v8, 0x0

    invoke-static {v10, v11, v8, v9}, Lh2/b;->c(JJ)Z

    move-result v17

    const/4 v7, 0x0

    if-eqz v17, :cond_9

    invoke-static {v15, v7}, Lh0/q3;->h(Lu2/k;Z)J

    move-result-wide v10

    :cond_9
    cmpg-float v15, v5, v16

    if-nez v15, :cond_a

    goto :goto_5

    :cond_a
    iget-object v15, v0, Lt81/d$a;->I:Lkotlin/jvm/functions/Function3;

    new-instance v7, Lh2/b;

    invoke-direct {v7, v10, v11}, Lh2/b;-><init>(J)V

    new-instance v8, Ljava/lang/Float;

    invoke-direct {v8, v5}, Ljava/lang/Float;-><init>(F)V

    if-eqz v14, :cond_b

    const/4 v5, 0x1

    goto :goto_4

    :cond_b
    const/4 v5, 0x0

    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v15, v7, v8, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v14, 0x0

    :goto_5
    move-object v5, v6

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    invoke-static {v7}, Lu2/d0;->l(Lu2/r;)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v7}, Lu2/r;->a()V

    goto :goto_6

    :cond_d
    if-eqz v4, :cond_e

    const/4 v14, 0x1

    :cond_e
    if-nez v4, :cond_11

    check-cast v6, Ljava/lang/Iterable;

    instance-of v4, v6, Ljava/util/Collection;

    if-eqz v4, :cond_f

    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_7

    :cond_f
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    iget-boolean v5, v5, Lu2/r;->d:Z

    if-eqz v5, :cond_10

    move/from16 v6, v16

    const-wide/16 v4, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    goto/16 :goto_0

    :cond_11
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
