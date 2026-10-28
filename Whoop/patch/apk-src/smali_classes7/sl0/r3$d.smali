.class public final Lsl0/r3$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/r3;->m(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;

.field final synthetic F:Lkotlin/jvm/functions/Function1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lnl0/f;

.field final synthetic y:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(Ljava/util/List;Lnl0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lsl0/r3$d;->w:Ljava/util/List;

    iput-object p2, p0, Lsl0/r3$d;->x:Lnl0/f;

    iput-object p3, p0, Lsl0/r3$d;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p4, p0, Lsl0/r3$d;->z:Lc93/m;

    iput-object p5, p0, Lsl0/r3$d;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lsl0/r3$d;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/2addr v2, v5

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, v0, Lsl0/r3$d;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnl0/c;

    const v2, -0x3cf7e97e

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lnl0/c;->g()Lnl0/b;

    move-result-object v2

    sget-object v3, Lnl0/b;->USER:Lnl0/b;

    if-ne v2, v3, :cond_5

    const v2, -0x3cf82e09

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lnl0/c;->m()Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v1}, Lnl0/c;->e()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v13}, Lsl0/i3;->f(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_6

    :cond_5
    const v2, -0x3cf48dda

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lnl0/c;->k()Z

    move-result v2

    if-nez v2, :cond_b

    const v2, -0x3cf3e2de    # -140.1138f

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v5

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v3, v4, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v4, v11, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v11, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/x2;

    iget-object v3, v0, Lsl0/r3$d;->x:Lnl0/f;

    invoke-virtual {v3}, Lnl0/f;->c()Lnl0/a;

    move-result-object v3

    invoke-virtual {v3}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    iget-object v3, v0, Lsl0/r3$d;->x:Lnl0/f;

    invoke-virtual {v3}, Lnl0/f;->c()Lnl0/a;

    move-result-object v3

    invoke-virtual {v3}, Lnl0/a;->f()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v1}, Lnl0/c;->h()Z

    move-result v9

    invoke-virtual {v1}, Lnl0/c;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lnl0/c;->f()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lnl0/c;->d()Z

    move-result v12

    invoke-virtual {v1}, Lnl0/c;->c()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v14

    invoke-virtual {v1}, Lnl0/c;->j()Z

    move-result v16

    invoke-virtual {v1}, Lnl0/c;->l()Z

    move-result v17

    iget-object v7, v0, Lsl0/r3$d;->x:Lnl0/f;

    iget-object v4, v0, Lsl0/r3$d;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v4, v13

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v4, v13

    iget-object v13, v0, Lsl0/r3$d;->z:Lc93/m;

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v4, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_9

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v13, v4, :cond_a

    :cond_9
    new-instance v13, Lsl0/r3$a;

    iget-object v4, v0, Lsl0/r3$d;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v15, v0, Lsl0/r3$d;->z:Lc93/m;

    invoke-direct {v13, v4, v1, v2, v15}, Lsl0/r3$a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnl0/c;Lb3/x2;Lc93/m;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v18, v13

    check-cast v18, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lsl0/r3$d;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lsl0/r3$d;->F:Lkotlin/jvm/functions/Function1;

    const/16 v25, 0x0

    const v26, 0x8140

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v1

    move-object/from16 v21, v2

    move-object/from16 v23, v11

    move-object v11, v3

    invoke-static/range {v7 .. v26}, Lsl0/g1;->n(Lnl0/f;ZZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZZZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v23

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    const v1, -0x3cd6bc1a

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    return-void

    :cond_c
    invoke-virtual {v11}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lsl0/r3$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
