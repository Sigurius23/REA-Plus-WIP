.class public abstract Lr71/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr71/b$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016\u00a8\u0006\u001c\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "parentHorizontalPadding",
        "v",
        "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;",
        "Lr71/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "k",
        "(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ln0/u;",
        "",
        "u",
        "(Ln0/u;)I",
        "Lp1/t1;",
        "",
        "a",
        "Lp1/t1;",
        "y",
        "()Lp1/t1;",
        "LocalIsInHorizontalScrollContainer",
        "b",
        "z",
        "LocalListHorizontalPadding",
        "selectedItemIndex",
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field

.field private static final b:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr70/b;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lr70/b;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lr71/b;->a:Lp1/t1;

    new-instance v0, Lr70/b;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lr70/b;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lr71/b;->b:Lp1/t1;

    return-void
.end method

.method public static synthetic a(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr71/b;->w(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr71/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lr71/b;->o(Lr71/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr71/b;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ln0/u;)I
    .locals 0

    invoke-static {p0}, Lr71/b;->p(Ln0/u;)I

    move-result p0

    return p0
.end method

.method public static synthetic e()Ly3/f;
    .locals 1

    invoke-static {}, Lr71/b;->t()Ly3/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lr71/c;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr71/b;->m(Lr71/c;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lr71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr71/b;->r(Lr71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr71/b;->x(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Z
    .locals 1

    invoke-static {}, Lr71/b;->s()Z

    move-result v0

    return v0
.end method

.method public static synthetic j(Lr71/c;Ln0/u;Lh0/o1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr71/b;->n(Lr71/c;Ln0/u;Lh0/o1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr71/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0x125ae8fe

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v9, 0x0

    if-eq v5, v6, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/2addr v0, v7

    invoke-virtual {v8, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_6

    new-instance v3, Lr61/h;

    invoke-direct {v3, v7}, Lr61/h;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v28, v3

    goto :goto_5

    :cond_7
    move-object/from16 v28, v4

    :goto_5
    sget-object v3, Lr71/b;->b:Lp1/t1;

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/f;

    iget v3, v3, Ly3/f;->w:F

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Lr71/b;->v(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_8

    if-ne v10, v0, :cond_9

    :cond_8
    new-instance v10, Lpf/b;

    const/16 v6, 0x17

    invoke-direct {v10, v1, v6}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v9, v10}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v10, v8, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v10, v8, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v8, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr71/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    const/16 v6, 0x8

    const/4 v12, 0x0

    if-nez v3, :cond_d

    const v3, 0x7cc77224

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object/from16 p2, v0

    move-object v6, v4

    move-wide v0, v10

    move v11, v9

    goto/16 :goto_7

    :cond_d
    const v13, 0x7cc77225

    invoke-virtual {v8, v13}, Lp1/q;->e0(I)V

    invoke-static {v3, v8, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    int-to-float v13, v2

    int-to-float v14, v6

    mul-float/2addr v13, v14

    invoke-static {v4, v13, v12, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v15, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    invoke-virtual {v15, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v15

    const/16 v26, 0x0

    const v27, 0x2fff8

    move v2, v6

    move/from16 v17, v7

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move-wide/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v21, v12

    const-wide/16 v11, 0x0

    move/from16 v23, v2

    move-object v2, v3

    move-object v3, v13

    const/4 v13, 0x0

    move/from16 v25, v14

    const/4 v14, 0x0

    move-object/from16 v30, v4

    move/from16 v29, v5

    move-wide v4, v15

    const-wide/16 v15, 0x0

    move/from16 v31, v17

    const/16 v17, 0x0

    move/from16 v32, v18

    const/16 v18, 0x0

    move-wide/from16 v33, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v23

    const/16 v23, 0x0

    move/from16 v37, v25

    const/16 v25, 0x30

    move-object/from16 p2, v0

    move-object/from16 v38, v30

    move-wide/from16 v0, v33

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    double-to-float v2, v0

    move/from16 v3, v37

    move-object/from16 v6, v38

    const/4 v11, 0x0

    invoke-static {v2, v3, v6, v8, v11}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_7
    const/4 v2, 0x3

    invoke-static {v11, v11, v8, v2}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lr71/c;->f()Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    move-result-object v3

    sget-object v4, Lr71/b$d;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v12, 0x1

    if-eq v3, v12, :cond_11

    const/4 v7, 0x2

    if-ne v3, v7, :cond_10

    const v3, -0x14bf78e9

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_e

    move-object/from16 v4, p2

    if-ne v5, v4, :cond_f

    goto :goto_8

    :cond_e
    move-object/from16 v4, p2

    :goto_8
    new-instance v5, Lh0/b0;

    invoke-direct {v5, v3}, Lh0/b0;-><init>(Ld0/x;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lh0/b0;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_9
    move-object v3, v5

    goto :goto_a

    :cond_10
    const v0, -0x14bf8eab

    invoke-static {v0, v8, v11}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_11
    move-object/from16 v4, p2

    const/4 v7, 0x2

    const v3, -0x14bf8574

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    sget-object v3, Li0/m;->b:Li0/m;

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_12

    if-ne v9, v4, :cond_13

    :cond_12
    new-instance v9, Li0/b;

    invoke-direct {v9, v2, v3}, Li0/b;-><init>(Ln0/u;Li0/n;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Li0/l;

    sget v3, Li0/k;->a:F

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-static {v8}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v5

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_14

    if-ne v10, v4, :cond_15

    :cond_14
    const/high16 v3, 0x43c80000    # 400.0f

    const/4 v10, 0x5

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v14, v3, v10, v13}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v3

    new-instance v10, Li0/g;

    invoke-direct {v10, v9, v5, v3}, Li0/g;-><init>(Li0/l;Ld0/x;Ld0/l;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v5, v10

    check-cast v5, Lh0/p3;

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    sget-object v5, Lr71/b;->a:Lp1/t1;

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v9}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v9

    move-wide/from16 v33, v0

    new-instance v0, Lo71/b;

    const/4 v5, 0x5

    move-object/from16 v1, p0

    move-object v10, v4

    move-object/from16 v4, v28

    move-wide/from16 v13, v33

    invoke-direct/range {v0 .. v5}, Lo71/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    move-object v1, v0

    move-object v0, v4

    const v3, -0x2da4a1f8

    invoke-static {v3, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v3, 0x38

    invoke-static {v9, v1, v8, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lr71/c;->e()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-virtual/range {p0 .. p0}, Lr71/c;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_18

    const v1, 0x7cdb8dd7

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_16

    if-ne v3, v10, :cond_17

    :cond_16
    new-instance v1, Lcom/whoop/profile/view/c;

    invoke-direct {v1, v2, v7}, Lcom/whoop/profile/view/c;-><init>(Ln0/u;I)V

    invoke-static {v1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lp1/t2;

    double-to-float v1, v13

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lr71/c;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v3}, Lr71/b;->q(Lp1/t2;)I

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x180

    const/16 v10, 0x18

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v1 .. v10}, Ljz0/c;->d(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_18
    const v1, 0x7ce1b2ba

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v3, v0

    goto :goto_c

    :cond_19
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v4

    :goto_c
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lqk2/i;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lr71/c;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lr71/c;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lr71/c;Ln0/u;Lh0/o1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    and-int/lit8 v2, p5, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p5, 0x1

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lr71/c;->c()Ll0/k1;

    move-result-object v6

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v8, Lb2/e;->J:Lb2/l;

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lq11/c;

    const/16 v2, 0xf

    invoke-direct {v3, v0, v1, v2}, Lq11/c;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v12, v3

    check-cast v12, Lkotlin/jvm/functions/Function1;

    const v14, 0x36000

    const/16 v15, 0x189

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v5, p1

    move-object/from16 v9, p2

    invoke-static/range {v4 .. v15}, Lkotlin/jvm/internal/j;->d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lr71/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyRow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lr71/c;->b()Ljava/util/List;

    move-result-object p0

    sget-object v0, Lr71/b$a;->w:Lr71/b$a;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lr71/b$b;

    invoke-direct {v2, v0, p0}, Lr71/b$b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lr71/b$c;

    invoke-direct {v0, p0, p1}, Lr71/b$c;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v3, 0x2fd4df92

    invoke-direct {p0, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p2, v1, p1, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ln0/u;)I
    .locals 0

    invoke-static {p0}, Lr71/b;->u(Ln0/u;)I

    move-result p0

    return p0
.end method

.method private static final q(Lp1/t2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final r(Lr71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lr71/b;->k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private static final t()Ly3/f;
    .locals 2

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    new-instance v1, Ly3/f;

    invoke-direct {v1, v0}, Ly3/f;-><init>(F)V

    return-object v1
.end method

.method private static final u(Ln0/u;)I
    .locals 6

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget v1, v1, Ln0/n;->l:I

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object p0

    iget p0, p0, Ln0/n;->m:I

    add-int/2addr v1, p0

    div-int/lit8 v1, v1, 0x2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    :goto_0
    move-object p0, v0

    goto :goto_1

    :cond_2
    move-object v2, v0

    check-cast v2, Ln0/g;

    check-cast v2, Ln0/o;

    iget v3, v2, Ln0/o;->o:I

    iget v2, v2, Ln0/o;->p:I

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v3

    sub-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ln0/g;

    check-cast v4, Ln0/o;

    iget v5, v4, Ln0/o;->o:I

    iget v4, v4, Ln0/o;->p:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v5

    sub-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-le v2, v4, :cond_4

    move-object v0, v3

    move v2, v4

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :goto_1
    check-cast p0, Ln0/g;

    if-eqz p0, :cond_5

    check-cast p0, Ln0/o;

    iget p0, p0, Ln0/o;->a:I

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final v(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$fullParentMaxWidth"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lev2/g;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lev2/g;-><init>(FI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final w(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p3, Ly3/a;->a:J

    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result v0

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float/2addr p0, v3

    invoke-interface {p1, p0}, Ly3/c;->F(F)I

    move-result p0

    add-int v4, p0, v0

    iget-wide v5, p3, Ly3/a;->a:J

    invoke-static {v5, v6}, Ly3/a;->h(J)I

    move-result v6

    const/4 v7, 0x5

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p0

    iget p2, p0, Ly2/j1;->w:I

    iget p3, p0, Ly2/j1;->x:I

    new-instance v0, Lch/m;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, p0, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 2

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v0, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lr71/b;->a:Lp1/t1;

    return-object v0
.end method

.method public static final z()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lr71/b;->b:Lp1/t1;

    return-object v0
.end method
