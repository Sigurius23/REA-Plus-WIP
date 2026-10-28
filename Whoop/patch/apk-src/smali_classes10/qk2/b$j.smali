.class public final Lqk2/b$j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqk2/b;->q(Lok2/a;Lok2/c;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic E:Lok2/d;

.field final synthetic F:J

.field final synthetic G:Lt0/i;

.field final synthetic H:Z

.field final synthetic I:Lt0/i;

.field final synthetic J:Lqk2/e;

.field final synthetic K:Ly3/c;

.field final synthetic L:J

.field final synthetic M:Lp1/a1;

.field final synthetic w:Lp1/c1;

.field final synthetic x:Le4/k;

.field final synthetic y:Lc93/a;

.field final synthetic z:Lok2/a;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/k;Lc93/a;Lok2/a;Lok2/d;JLt0/i;ZLt0/i;Lqk2/e;Ly3/c;JLp1/a1;)V
    .locals 0

    iput-object p1, p0, Lqk2/b$j;->w:Lp1/c1;

    iput-object p2, p0, Lqk2/b$j;->x:Le4/k;

    iput-object p3, p0, Lqk2/b$j;->y:Lc93/a;

    iput-object p4, p0, Lqk2/b$j;->z:Lok2/a;

    iput-object p5, p0, Lqk2/b$j;->E:Lok2/d;

    iput-wide p6, p0, Lqk2/b$j;->F:J

    iput-object p8, p0, Lqk2/b$j;->G:Lt0/i;

    iput-boolean p9, p0, Lqk2/b$j;->H:Z

    iput-object p10, p0, Lqk2/b$j;->I:Lt0/i;

    iput-object p11, p0, Lqk2/b$j;->J:Lqk2/e;

    iput-object p12, p0, Lqk2/b$j;->K:Ly3/c;

    iput-wide p13, p0, Lqk2/b$j;->L:J

    iput-object p15, p0, Lqk2/b$j;->M:Lp1/a1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    return-void

    :cond_1
    :goto_0
    iget-object v1, v0, Lqk2/b$j;->w:Lp1/c1;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lqk2/b$j;->x:Le4/k;

    iget v2, v1, Le4/k;->b:I

    invoke-virtual {v1}, Le4/k;->e()V

    iget-object v1, v0, Lqk2/b$j;->x:Le4/k;

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v3, 0x7031e3f0

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Le4/k;->d()Lad3/z;

    move-result-object v1

    iget-object v1, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Le4/k;

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v11

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v12

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v13

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v14

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v15

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v1

    iget-object v3, v0, Lqk2/b$j;->z:Lok2/a;

    invoke-virtual {v3}, Lok2/a;->b()Ly81/f;

    move-result-object v3

    const/4 v10, 0x0

    invoke-virtual {v3, v7, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    iget-object v5, v0, Lqk2/b$j;->E:Lok2/d;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lok2/d;->d()Z

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    iget-object v5, v0, Lqk2/b$j;->z:Lok2/a;

    invoke-virtual {v5}, Lok2/a;->a()F

    move-result v5

    :goto_1
    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v16

    iget-wide v3, v0, Lqk2/b$j;->F:J

    iget-object v5, v0, Lqk2/b$j;->G:Lt0/i;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v6, v8, :cond_3

    sget-object v6, Lqk2/b$a;->w:Lqk2/b$a;

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v11, v6}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v21, v18

    move-object/from16 v20, v19

    invoke-static/range {v3 .. v9}, Lqk2/b;->J(JLi2/a1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    iget-object v3, v0, Lqk2/b$j;->E:Lok2/d;

    if-nez v3, :cond_4

    const v3, 0x703a5c1d

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    move-object/from16 p1, v1

    move-object/from16 p2, v15

    move-object/from16 v1, v20

    move-object/from16 v15, v21

    move/from16 v20, v2

    move v2, v10

    goto :goto_3

    :cond_4
    const v3, 0x703a5c1e

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    iget-object v3, v0, Lqk2/b$j;->E:Lok2/d;

    invoke-virtual {v3}, Lok2/d;->a()F

    move-result v3

    iget-wide v4, v0, Lqk2/b$j;->L:J

    iget-object v6, v0, Lqk2/b$j;->I:Lt0/i;

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    iget-object v9, v0, Lqk2/b$j;->J:Lqk2/e;

    invoke-virtual {v7, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_5

    move-object/from16 v8, v21

    if-ne v9, v8, :cond_6

    goto :goto_2

    :cond_5
    move-object/from16 v8, v21

    :goto_2
    new-instance v9, Lqk2/b$b;

    iget-object v10, v0, Lqk2/b$j;->J:Lqk2/e;

    invoke-direct {v9, v11, v10}, Lqk2/b$b;-><init>(Le4/f;Lqk2/e;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, v20

    invoke-static {v10, v12, v9}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v18, v8

    move-object v8, v7

    move-object v7, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 p1, v1

    move/from16 v20, v2

    move-object/from16 p2, v15

    move-object/from16 v15, v18

    move-object/from16 v1, v19

    const/4 v2, 0x0

    invoke-static/range {v3 .. v10}, Lqk2/b;->K(FJLi2/a1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_3
    iget-boolean v3, v0, Lqk2/b$j;->H:Z

    if-eqz v3, :cond_9

    const v3, 0x7042cb57

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    iget-object v3, v0, Lqk2/b$j;->z:Lok2/a;

    invoke-virtual {v3}, Lok2/a;->c()F

    move-result v3

    iget-wide v4, v0, Lqk2/b$j;->F:J

    iget-object v6, v0, Lqk2/b$j;->I:Lt0/i;

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    iget-object v9, v0, Lqk2/b$j;->J:Lqk2/e;

    invoke-virtual {v7, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_7

    if-ne v9, v15, :cond_8

    :cond_7
    new-instance v9, Lqk2/b$c;

    iget-object v8, v0, Lqk2/b$j;->J:Lqk2/e;

    invoke-direct {v9, v11, v8}, Lqk2/b$c;-><init>(Le4/f;Lqk2/e;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v13, v9}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v22, v8

    move-object v8, v7

    move-object/from16 v7, v22

    invoke-static/range {v3 .. v10}, Lqk2/b;->K(FJLi2/a1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_9
    const v3, 0x704a240c    # 2.502382E29f

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_4
    iget-object v3, v0, Lqk2/b$j;->E:Lok2/d;

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lok2/d;->b()Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_5

    :cond_a
    move-object v3, v4

    :goto_5
    if-nez v3, :cond_b

    const v3, 0x704b1b8f

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-wide/from16 v3, v16

    goto :goto_6

    :cond_b
    const v3, 0x704b1b90

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    if-ne v4, v15, :cond_d

    :cond_c
    new-instance v4, Lqk2/b$d;

    invoke-direct {v4, v12}, Lqk2/b$d;-><init>(Le4/f;)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v14, v4}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v8, v7

    const/4 v7, 0x0

    move-object v6, v8

    const/4 v8, 0x0

    move-wide/from16 v3, v16

    invoke-static/range {v3 .. v8}, Lqk2/b;->G(JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v6

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_6
    iget-object v5, v0, Lqk2/b$j;->E:Lok2/d;

    if-nez v5, :cond_e

    const v3, 0x70526049

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object v10, v15

    goto :goto_9

    :cond_e
    const v5, 0x7052604a

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    iget-object v5, v0, Lqk2/b$j;->E:Lok2/d;

    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v7, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    iget-object v8, v0, Lqk2/b$j;->J:Lqk2/e;

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    iget-boolean v8, v0, Lqk2/b$j;->H:Z

    invoke-virtual {v7, v8}, Lp1/q;->h(Z)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_f

    if-ne v8, v15, :cond_10

    :cond_f
    move-object/from16 v18, v12

    goto :goto_7

    :cond_10
    move-object v13, v5

    move-object v10, v15

    move-object/from16 v5, p2

    goto :goto_8

    :goto_7
    new-instance v12, Lqk2/b$e;

    move-object/from16 v21, v15

    iget-object v15, v0, Lqk2/b$j;->J:Lqk2/e;

    iget-boolean v6, v0, Lqk2/b$j;->H:Z

    move/from16 v16, v6

    move-object/from16 v17, v13

    move-object/from16 v10, v21

    move-object v13, v5

    move-object/from16 v5, p2

    invoke-direct/range {v12 .. v18}, Lqk2/b$e;-><init>(Lok2/d;Le4/f;Lqk2/e;ZLe4/f;Le4/f;)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v12

    :goto_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v5, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v9, 0x0

    move-wide v4, v3

    move-object v3, v13

    invoke-static/range {v3 .. v9}, Lqk2/b;->H(Lok2/d;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_9
    iget-object v3, v0, Lqk2/b$j;->z:Lok2/a;

    invoke-virtual {v3}, Lok2/a;->i()Z

    move-result v3

    if-eqz v3, :cond_14

    iget-object v3, v0, Lqk2/b$j;->M:Lp1/a1;

    invoke-static {v3}, Lqk2/b;->I(Lp1/a1;)I

    move-result v3

    if-lez v3, :cond_14

    const v3, 0x705fcd6a

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    iget-object v3, v0, Lqk2/b$j;->K:Ly3/c;

    iget-object v4, v0, Lqk2/b$j;->M:Lp1/a1;

    invoke-static {v4}, Lqk2/b;->I(Lp1/a1;)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, v0, Lqk2/b$j;->J:Lqk2/e;

    invoke-virtual {v5}, Lqk2/e;->v()F

    move-result v5

    invoke-interface {v3, v5}, Ly3/c;->q0(F)F

    move-result v3

    sub-float/2addr v4, v3

    iget-object v3, v0, Lqk2/b$j;->z:Lok2/a;

    invoke-virtual {v3}, Lok2/a;->f()F

    move-result v3

    mul-float/2addr v3, v4

    float-to-int v3, v3

    if-gez v3, :cond_11

    move v3, v2

    :cond_11
    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_12

    if-ne v5, v10, :cond_13

    :cond_12
    new-instance v5, Lqk2/b$f;

    invoke-direct {v5, v11}, Lqk2/b$f;-><init>(Le4/f;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v4, p1

    invoke-static {v1, v4, v5}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v1, v7, v2, v2}, Lqk2/b;->L(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    const v1, 0x7069376c

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    iget-object v1, v0, Lqk2/b$j;->x:Le4/k;

    iget v1, v1, Le4/k;->b:I

    move/from16 v2, v20

    if-eq v1, v2, :cond_15

    iget-object v1, v0, Lqk2/b$j;->y:Lc93/a;

    invoke-static {v1, v7}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :cond_15
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lqk2/b$j;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
