.class public abstract Lp51/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp51/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lp51/e;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "g",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "Lt0/i;",
        "a",
        "Lt0/i;",
        "cardShape",
        "Li2/t;",
        "i",
        "(Landroidx/compose/runtime/Composer;I)Li2/t;",
        "aiBrush",
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
.field private static final a:Lt0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    sput-object v0, Lp51/c;->a:Lt0/i;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp51/c;->h(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp51/e;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp51/c;->e(Lp51/e;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp51/c;->f(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lp51/e;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    sget-object v1, Lb2/e;->K:Lb2/l;

    const-string v4, "viewState"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onClick"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v4, -0x450273ed

    invoke-virtual {v10, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p5, 0x1

    const/4 v9, 0x4

    const/4 v11, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v9

    goto :goto_0

    :cond_1
    move v6, v11

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v8, :cond_7

    move v7, v13

    goto :goto_4

    :cond_7
    move v7, v12

    :goto_4
    and-int/2addr v6, v13

    invoke-virtual {v10, v6, v7}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_2c

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_8

    move-object v15, v14

    goto :goto_5

    :cond_8
    move-object v15, v5

    :goto_5
    invoke-virtual {v2}, Lp51/e;->e()Lp51/d;

    move-result-object v4

    sget-object v5, Lp51/c$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x6

    if-eq v4, v13, :cond_b

    if-eq v4, v11, :cond_a

    if-ne v4, v6, :cond_9

    const v4, -0xe34de53

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->n()J

    move-result-wide v6

    sget-object v4, Lp51/c;->a:Lt0/i;

    invoke-static {v14, v6, v7, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v6, 0x6

    goto :goto_7

    :cond_9
    const v0, -0xe35184e

    invoke-static {v0, v10, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_a
    const v4, -0xe3501a8

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    sget-object v16, Li2/t;->b:Li2/s;

    const-wide v6, 0xff8b62ffL

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v6

    const v4, 0x3e19999a    # 0.15f

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    const-wide v6, 0xff50d5ffL

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v6

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v4, Li2/x;

    invoke-direct {v4, v6, v7}, Li2/x;-><init>(J)V

    filled-new-array {v8, v4}, [Li2/x;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-wide/16 v20, 0x0

    const/16 v22, 0xe

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v22}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v4

    sget-object v6, Lp51/c;->a:Lt0/i;

    invoke-static {v14, v4, v6, v5, v9}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    goto :goto_6

    :cond_b
    const v4, -0xe350f9d

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v4, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v7

    sget-object v4, Lp51/c;->a:Lt0/i;

    invoke-static {v14, v7, v8, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_7
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move v8, v6

    const/4 v6, 0x0

    move/from16 v16, v8

    const/16 v8, 0xf

    move-object v3, v4

    const/4 v4, 0x0

    move/from16 v17, v5

    const/4 v5, 0x0

    move/from16 v9, v16

    move-object/from16 v16, v14

    move v14, v9

    move v9, v7

    move-object/from16 v7, p2

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v11

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->J:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v7, 0x36

    invoke-static {v6, v4, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    :cond_d
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v12, v9

    const-wide/16 v20, 0x0

    cmpl-double v3, v12, v20

    if-lez v3, :cond_f

    goto :goto_9

    :cond_f
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v12, 0x1

    invoke-direct {v3, v9, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x0

    invoke-static {v13, v9, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_10

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v12, v10, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v10, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lp51/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v12, 0x0

    invoke-static {v0, v10, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v3, v10, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v2}, Lp51/e;->e()Lp51/d;

    move-result-object v13

    sget-object v12, Lp51/d;->INACTIVE:Lp51/d;

    if-ne v13, v12, :cond_13

    const v12, -0x6466314c

    invoke-static {v10, v12, v3, v10, v9}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v12

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move-wide/from16 v17, v12

    const/4 v13, 0x6

    goto :goto_b

    :cond_13
    const/4 v9, 0x0

    const v12, -0x64651dcf

    const/4 v13, 0x6

    invoke-static {v10, v12, v3, v10, v13}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v17

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_b
    const/16 v29, 0x0

    const v30, 0x2fffa

    move-object v12, v6

    const/4 v6, 0x0

    move/from16 v21, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    move-object/from16 v26, v15

    const-wide/16 v14, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    move-object/from16 v33, v7

    move-wide/from16 v56, v17

    move-object/from16 v18, v8

    move-wide/from16 v7, v56

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/high16 v35, 0x3f800000    # 1.0f

    const-wide/16 v18, 0x0

    const/16 v36, 0x1

    const/16 v20, 0x0

    move/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v24

    const/16 v24, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move-object/from16 v42, v28

    const/16 v28, 0x0

    move/from16 p0, v5

    move-object v5, v0

    move/from16 v0, p0

    move-object/from16 p0, v32

    move-object/from16 v32, v1

    move-object/from16 v1, p0

    move-object/from16 p0, v4

    move-object/from16 v46, v33

    move-object/from16 v45, v34

    move/from16 v4, v37

    move-object/from16 v43, v38

    move-object/from16 v44, v42

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v2}, Lp51/e;->a()Lp51/a;

    move-result-object v5

    if-nez v5, :cond_14

    const v5, -0x6462ffeb

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 p3, v3

    const/4 v3, 0x1

    goto/16 :goto_d

    :cond_14
    const v6, -0x6462ffea

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v13, 0x1

    int-to-float v6, v13

    invoke-static {v6, v0, v1, v10}, Ld;->w(FFLb2/t;Lp1/q;)V

    instance-of v6, v5, Lp51/a$a;

    if-eqz v6, :cond_15

    const v6, -0x21e983a2

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    check-cast v5, Lp51/a$a;

    invoke-virtual {v5}, Lp51/a$a;->a()Lsz0/c0;

    move-result-object v14

    invoke-virtual {v5}, Lp51/a$a;->a()Lsz0/c0;

    move-result-object v5

    invoke-virtual {v5}, Lsz0/c0;->m()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\n\n"

    invoke-static {v5, v6}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const/16 v25, 0x3fe

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v14 .. v26}, Lsz0/c0;->b(Lsz0/c0;Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILjava/lang/Object;)Lsz0/c0;

    move-result-object v6

    const/16 v11, 0x6180

    const/16 v12, 0x9

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-static/range {v5 .. v12}, Lsz0/b0;->d(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 p3, v3

    move v3, v13

    goto :goto_c

    :cond_15
    instance-of v6, v5, Lp51/a$b;

    if-eqz v6, :cond_2b

    const v6, -0x1b42a0d7

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    check-cast v5, Lp51/a$b;

    invoke-virtual {v5}, Lp51/a$b;->a()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    invoke-virtual {v3, v10, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v29, 0xc30

    const v30, 0x2d7fa

    move/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move/from16 v47, v17

    const/16 v17, 0x0

    move/from16 v48, v19

    const-wide/16 v18, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 p3, v3

    move/from16 v3, v48

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v2}, Lp51/e;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    if-nez v5, :cond_16

    const v5, -0x6456dc0b

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    double-to-float v5, v6

    invoke-static {v5, v0, v1, v10}, Ld;->w(FFLb2/t;Lp1/q;)V

    int-to-float v5, v3

    mul-float/2addr v5, v0

    move-wide v7, v6

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    new-instance v9, Llz1/a;

    const/16 v11, 0xc

    invoke-direct {v9, v2, v11}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v11, 0x7d528eed

    invoke-static {v11, v10, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0x1801b0

    const/16 v14, 0x39

    move-wide v8, v7

    move-object v7, v5

    const/4 v5, 0x0

    move-wide v15, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_16
    const v5, -0x6450c26b

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v2}, Lp51/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_18

    invoke-virtual {v2}, Lp51/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_17

    goto :goto_f

    :cond_17
    const v5, -0x6426cceb

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 v4, p0

    move/from16 v31, v0

    move v13, v3

    move-object/from16 v3, v32

    move-object/from16 v0, v43

    move-object/from16 v2, v44

    move-object/from16 v54, v45

    move-object/from16 v55, v46

    move-object/from16 v32, p3

    goto/16 :goto_21

    :cond_18
    :goto_f
    const v5, -0x644e24a6

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    int-to-float v5, v3

    invoke-static {v5, v0, v1, v10}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v6, v32

    move-object/from16 v12, v39

    const/16 v7, 0x36

    invoke-static {v12, v6, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_19

    move-object/from16 v12, v43

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_10
    move-object/from16 v13, v44

    goto :goto_11

    :cond_19
    move-object/from16 v12, v43

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_10

    :goto_11
    invoke-static {v10, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, p0

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1b

    :cond_1a
    move-object/from16 v11, v45

    goto :goto_13

    :cond_1b
    move-object/from16 v11, v45

    :goto_12
    move-object/from16 v9, v46

    goto :goto_14

    :goto_13
    invoke-static {v9, v10, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v10, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lp51/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    if-nez v5, :cond_1c

    const v5, 0x276d05d3

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    move-object/from16 v2, p3

    move-object v3, v6

    move-object/from16 v51, v8

    move-object/from16 v53, v9

    move-object/from16 v52, v11

    move-object/from16 v49, v12

    move-object/from16 v50, v13

    move v12, v4

    const/4 v4, 0x6

    goto/16 :goto_18

    :cond_1c
    const v3, 0x276d05d4

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp51/e;->i()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    double-to-float v4, v14

    invoke-static {v4, v0, v6, v10, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v4

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_1d

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v10, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_1e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    :cond_1e
    invoke-static {v14, v10, v14, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v10, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v3, :cond_20

    const v2, 0x4d9efae6

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v4, v3

    mul-float/2addr v2, v4

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v10, v4}, Lp51/c;->i(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v7

    const/16 v14, 0x32

    invoke-static {v14}, Lt0/j;->b(I)Lt0/i;

    move-result-object v14

    const/4 v15, 0x0

    invoke-static {v2, v7, v14, v15, v3}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v10, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v5, v10, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v2, p3

    const/4 v4, 0x6

    invoke-virtual {v2, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v7

    invoke-static {v1, v7}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v29, 0x0

    const v30, 0x2fffc

    move-object/from16 v32, v6

    move-object v6, v7

    move-object v14, v8

    const-wide/16 v7, 0x0

    move-object/from16 v46, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v45, v11

    const/4 v11, 0x0

    move-object/from16 v43, v12

    const/4 v12, 0x0

    move-object/from16 v42, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const-wide/16 v14, 0x0

    const-wide/high16 v19, 0x3fe0000000000000L    # 0.5

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-wide/from16 v21, v19

    move-object/from16 v20, v18

    const-wide/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move-wide/from16 v33, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v31, v28

    const/16 v28, 0x0

    move-object/from16 v51, v31

    move-object/from16 v3, v32

    move-object/from16 v50, v42

    move-object/from16 v49, v43

    move-object/from16 v52, v45

    move-object/from16 v53, v46

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_16
    const/4 v13, 0x1

    goto :goto_17

    :cond_20
    move-object/from16 v2, p3

    move-object v3, v6

    move-object/from16 v51, v8

    move-object/from16 v53, v9

    move-object/from16 v52, v11

    move-object/from16 v49, v12

    move-object/from16 v50, v13

    const/4 v4, 0x6

    const/4 v12, 0x0

    const v6, 0x4da88027    # 3.5337136E8f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-static {v5, v10, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_16

    :goto_17
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    :goto_18
    if-nez v5, :cond_21

    const v5, 0x32d298be

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_19
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_21
    const v5, 0x32d1f48a

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    goto :goto_19

    :goto_1a
    invoke-virtual/range {p1 .. p1}, Lp51/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v13, :cond_22

    const v5, 0x278203d8

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move/from16 v31, v0

    move-object/from16 v32, v2

    move-object/from16 v0, v49

    move-object/from16 v2, v50

    move-object/from16 v4, v51

    move-object/from16 v54, v52

    move-object/from16 v55, v53

    const/4 v13, 0x1

    goto/16 :goto_20

    :cond_22
    const v5, 0x278203d9

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    const/16 v7, 0x36

    invoke-static {v5, v0, v3, v10, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_23

    move-object/from16 v14, v49

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_1b
    move-object/from16 v15, v50

    goto :goto_1c

    :cond_23
    move-object/from16 v14, v49

    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_1b

    :goto_1c
    invoke-static {v10, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v51

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_24

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    :cond_24
    move-object/from16 v7, v52

    goto :goto_1e

    :cond_25
    move-object/from16 v7, v52

    :goto_1d
    move-object/from16 v6, v53

    goto :goto_1f

    :goto_1e
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1d

    :goto_1f
    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v8, Lgy0/a;->s0:I

    invoke-static {v8, v10, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    invoke-virtual {v2, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v11

    const/4 v9, 0x4

    int-to-float v4, v9

    mul-float/2addr v4, v4

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v26, v5

    move-object v5, v8

    move-wide v8, v11

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    move-object/from16 v46, v6

    const/4 v6, 0x0

    move-object/from16 v54, v7

    move-object/from16 v55, v46

    move-object v7, v4

    move-object/from16 v4, v26

    invoke-static/range {v5 .. v12}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x0

    invoke-static {v13, v10, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    invoke-virtual {v2, v10, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v43, v14

    move-object/from16 v42, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v31, v0

    move-object/from16 v32, v2

    move-object/from16 v2, v42

    move-object/from16 v0, v43

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_20
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_21
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v5, v3, v10, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_26

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_22

    :cond_26
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_22
    invoke-static {v10, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_27

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    :cond_27
    move-object/from16 v11, v54

    goto :goto_24

    :cond_28
    :goto_23
    move-object/from16 v6, v55

    goto :goto_25

    :goto_24
    invoke-static {v5, v10, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_23

    :goto_25
    invoke-static {v10, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lp51/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_2a

    const v0, -0x1143fd11

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lp51/e;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_29

    const v0, -0x173ba50e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    :goto_26
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_27

    :cond_29
    const/4 v12, 0x0

    const v2, -0x173ba50d

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-static {v0, v10, v12}, Lp51/c;->g(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    goto :goto_26

    :goto_27
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_28

    :cond_2a
    const/4 v12, 0x0

    const v0, -0x173b23b9

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_28
    invoke-virtual/range {v32 .. v32}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->n()I

    move-result v0

    const/4 v6, 0x6

    invoke-static {v0, v10, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    move-object/from16 v2, v32

    invoke-virtual {v2, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v8

    const/4 v13, 0x1

    int-to-float v0, v13

    mul-float v15, v0, v31

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v1

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v3, 0x4

    int-to-float v2, v3

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object/from16 v1, v41

    goto :goto_29

    :cond_2b
    const v0, -0x21e98af2

    const/4 v12, 0x0

    invoke-static {v0, v10, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_2c
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    :goto_29
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2d

    new-instance v0, Lot1/f;

    const/16 v6, 0xe

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc93/a;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final e(Lp51/e;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$FlowRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    move-object v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lp51/e;->f()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lhy0/h1;

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lp51/c;->d(Landroidx/compose/ui/Modifier;Lp51/e;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x63c42952

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    if-eq v5, v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v2, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->w()J

    move-result-wide v7

    int-to-float v6, v6

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v11, v6, v9

    const/4 v14, 0x0

    const/16 v15, 0xe

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    const/16 v10, 0x32

    invoke-static {v10}, Lt0/j;->b(I)Lt0/i;

    move-result-object v10

    invoke-static {v6, v4, v5, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    mul-float/2addr v5, v9

    invoke-static {v4, v11, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v26, 0x0

    const v27, 0x2fff8

    move-object/from16 v24, v2

    move-object v2, v3

    move-object v3, v4

    move-wide v4, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lbm2/b1;

    const/16 v4, 0x8

    invoke-direct {v3, v0, v1, v4}, Lbm2/b1;-><init>(Lcom/whoop/design/util/TextResource;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final h(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lp51/c;->g(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/runtime/Composer;I)Li2/t;
    .locals 7

    sget-object v0, Li2/t;->b:Li2/s;

    const-wide p0, 0xff8b62ffL

    invoke-static {p0, p1}, Li2/w0;->e(J)J

    move-result-wide p0

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    const-wide p0, 0xff50d5ffL

    invoke-static {p0, p1}, Li2/w0;->e(J)J

    move-result-wide p0

    new-instance v2, Li2/x;

    invoke-direct {v2, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v1, v2}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-wide/16 v4, 0x0

    const/16 v6, 0xe

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v6}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
