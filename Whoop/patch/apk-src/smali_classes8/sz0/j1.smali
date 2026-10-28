.class public abstract Lsz0/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\r\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/k1;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lsz0/k1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "g",
        "(Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lsz0/k1;",
        "getFakeTitleSubtitleStateWithTrailingIcon",
        "()Lsz0/k1;",
        "fakeTitleSubtitleStateWithTrailingIcon",
        "b",
        "i",
        "fakeTitleSubtitleState",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lsz0/k1;

.field private static final b:Lsz0/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lsz0/k1;

    const-string v1, "Visits & Notes"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v1, ""

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v6, Lb91/c;->T3:Lb91/c;

    sget-object v7, Lb91/c;->B2:Lb91/c;

    const/16 v12, 0x798

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v13}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsz0/j1;->a:Lsz0/k1;

    new-instance v4, Lsz0/k1;

    const-string v0, "Title"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const-string v1, "Subtitle"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/16 v16, 0x798

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v6

    move-object v11, v7

    move-object v6, v0

    move-object v7, v1

    invoke-direct/range {v4 .. v17}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lsz0/j1;->b:Lsz0/k1;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsz0/j1;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsz0/j1;->h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lsz0/k1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/j1;->f(Landroidx/compose/ui/Modifier;Lsz0/k1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lsz0/k1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lsz0/k1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x3b1686fe

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v8, 0x92

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v14, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_18

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v1, v7

    :cond_9
    if-eqz v5, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v0, v5, :cond_a

    new-instance v0, Lsz0/k;

    const/4 v5, 0x3

    invoke-direct {v0, v5}, Lsz0/k;-><init>(I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v0, v6

    :goto_6
    invoke-virtual {v2}, Lsz0/k1;->h()I

    move-result v5

    const/4 v6, 0x3

    const/4 v8, 0x6

    if-ne v5, v6, :cond_c

    sget-object v5, Lb2/e;->N:Lb2/k;

    goto :goto_7

    :cond_c
    if-ne v5, v8, :cond_d

    sget-object v5, Lb2/e;->O:Lb2/k;

    goto :goto_7

    :cond_d
    sget-object v5, Lb2/e;->M:Lb2/k;

    :goto_7
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v12, v12

    const/16 v13, 0x8

    int-to-float v13, v13

    invoke-static {v12, v13, v5, v14, v8}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v14, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v14, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static {v8, v14, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v14, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v10, v8, v14, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    move-object/from16 v31, v0

    invoke-static {v14, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v32, v1

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-eqz v1, :cond_11

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v14, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v10, v14, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v14, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lsz0/k1;->m()Lny0/p0;

    move-result-object v0

    if-eqz v0, :cond_15

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v5, v0

    const-wide/16 v7, 0x0

    cmpl-double v1, v5, v7

    if-lez v1, :cond_14

    goto :goto_a

    :cond_14
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v1, 0x1

    invoke-direct {v7, v0, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    :goto_b
    move-object v6, v7

    goto :goto_c

    :cond_15
    const/4 v1, 0x1

    goto :goto_b

    :goto_c
    invoke-virtual {v2}, Lsz0/k1;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v14, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v7, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v2}, Lsz0/k1;->l()Lb91/c;

    move-result-object v8

    invoke-virtual {v7, v8}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v25

    invoke-virtual {v2}, Lsz0/k1;->j()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v14, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    invoke-virtual {v2}, Lsz0/k1;->h()I

    move-result v10

    invoke-virtual {v2}, Lsz0/k1;->k()I

    move-result v22

    new-instance v11, Lw3/k;

    invoke-direct {v11, v10}, Lw3/k;-><init>(I)V

    const/16 v29, 0x30

    const v30, 0x2d5f8

    move-object v12, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v27, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v21, v18

    move/from16 v20, v19

    const-wide/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x2

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move v1, v5

    move-object v5, v0

    move-object/from16 v0, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    invoke-virtual {v2}, Lsz0/k1;->m()Lny0/p0;

    move-result-object v5

    if-nez v5, :cond_16

    const v3, -0x1c2c5140

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v3, 0x1

    goto :goto_e

    :cond_16
    const v6, -0x1c2c513f

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Lny0/p0;->c()Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_17

    invoke-virtual {v5}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object v6

    :cond_17
    move-object/from16 v16, v6

    invoke-virtual {v5}, Lny0/p0;->k()Ly71/g;

    move-result-object v9

    invoke-virtual {v5}, Lny0/p0;->n()Ly81/e;

    move-result-object v11

    invoke-virtual {v5}, Lny0/p0;->o()Lj91/b;

    move-result-object v12

    invoke-virtual {v5}, Lny0/p0;->q()Z

    move-result v13

    and-int/lit16 v3, v3, 0x380

    const/16 v21, 0x62b

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v27, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    move/from16 v20, v3

    move-object/from16 v18, v27

    move-object/from16 v17, v31

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v18

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lsz0/k1;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v14, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v34

    sget-object v5, Liz0/l;->a:Liz0/l;

    invoke-virtual {v2}, Lsz0/k1;->e()Lb91/c;

    move-result-object v6

    invoke-virtual {v0, v6}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v15

    invoke-virtual {v2}, Lsz0/k1;->h()I

    move-result v24

    const/16 v28, 0x0

    const v29, 0xff7fff

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v15 .. v29}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v6

    invoke-virtual {v2}, Lsz0/k1;->f()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v14, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v14, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v9

    int-to-float v0, v3

    mul-float v26, v0, v33

    const v29, 0x36000

    const/16 v30, 0x3ff8

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v27, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    invoke-virtual/range {v5 .. v30}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v8

    invoke-virtual {v2}, Lsz0/k1;->g()I

    move-result v10

    const v15, 0xc00180

    const/16 v16, 0x152

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    move-object/from16 v14, v27

    move-object/from16 v5, v34

    invoke-static/range {v5 .. v16}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    move-object/from16 v3, v31

    move-object/from16 v1, v32

    goto :goto_f

    :cond_18
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v6

    :goto_f
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Ls51/b;

    const/16 v6, 0x1a

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lsz0/k1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsz0/j1;->d(Landroidx/compose/ui/Modifier;Lsz0/k1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x24d38abd

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lsz0/j1$a;

    invoke-direct {v1}, Lsz0/j1$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/16 v1, 0x16

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lsz0/j1;->g(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i()Lsz0/k1;
    .locals 1

    sget-object v0, Lsz0/j1;->b:Lsz0/k1;

    return-object v0
.end method
