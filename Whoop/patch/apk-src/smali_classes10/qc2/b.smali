.class public abstract Lqc2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lqc2/c;",
        "state",
        "Ll83/a0;",
        "g",
        "(Landroidx/compose/ui/Modifier;Lqc2/c;Landroidx/compose/runtime/Composer;II)V",
        "Lqc2/c$a;",
        "i",
        "(Landroidx/compose/ui/Modifier;Lqc2/c$a;Landroidx/compose/runtime/Composer;II)V",
        "Lqc2/c$b;",
        "k",
        "(Landroidx/compose/ui/Modifier;Lqc2/c$b;Landroidx/compose/runtime/Composer;II)V",
        "Lqc2/a;",
        "content",
        "e",
        "(Lqc2/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "a",
        "F",
        "FIRST_COLUMN_WEIGHT",
        "b",
        "SECOND_COLUMN_WEIGHT",
        "settings_release"
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
.field private static final a:F = 0.4f

.field private static final b:F = 0.6f


# direct methods
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lqc2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqc2/b;->h(Landroidx/compose/ui/Modifier;Lqc2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lqc2/c$a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqc2/b;->j(Landroidx/compose/ui/Modifier;Lqc2/c$a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lqc2/c$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqc2/b;->l(Landroidx/compose/ui/Modifier;Lqc2/c$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lqc2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqc2/b;->f(Lqc2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lqc2/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    sget-object v2, Lb2/e;->M:Lb2/k;

    const-string v3, "content"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v3, -0x76fea0db

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    const/4 v8, 0x0

    if-eq v5, v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/2addr v3, v6

    invoke-virtual {v7, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    instance-of v3, v0, Lqc2/a$b;

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_7

    const v3, 0x76a140fb

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    invoke-static {v3, v2, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x7b152ac7

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v0

    check-cast v2, Lqc2/a$b;

    invoke-virtual {v2}, Lqc2/a$b;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/util/TextResource;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v7, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    const-string v5, "getDefault(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v3, "toUpperCase(...)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->F()J

    move-result-wide v9

    invoke-virtual {v3, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->d()Lb91/a;

    move-result-object v24

    new-instance v3, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v3, v5}, Lw3/k;-><init>(I)V

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v28, v5, 0x12

    const v29, 0x2fdfa

    const/4 v5, 0x0

    move-object/from16 v26, v7

    move v11, v8

    move-wide/from16 v31, v9

    move v10, v6

    move-wide/from16 v6, v31

    const-wide/16 v8, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move v15, v14

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v30, v27

    const/16 v27, 0x0

    move/from16 v1, v16

    move-object/from16 v16, v3

    move/from16 v3, v30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move v8, v1

    move v6, v3

    move-object/from16 v7, v26

    goto/16 :goto_4

    :cond_6
    move v3, v6

    move v1, v8

    invoke-static {v7, v1, v3, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto/16 :goto_7

    :cond_7
    move v3, v6

    move v1, v8

    instance-of v5, v0, Lqc2/a$a;

    if-eqz v5, :cond_8

    const v2, 0x76a82459

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v0

    check-cast v2, Lqc2/a$a;

    invoke-virtual {v2}, Lqc2/a$a;->a()Lkd1/o;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    const/4 v9, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->F()J

    move-result-wide v2

    const/16 v10, 0x30

    const/4 v11, 0x4

    const-string v5, ""

    move-object v9, v7

    move-wide v7, v2

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_7

    :cond_8
    instance-of v5, v0, Lqc2/a$c;

    if-eqz v5, :cond_d

    const v5, 0x76abe4be

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    const/4 v8, 0x6

    invoke-static {v5, v6, v2, v7, v8}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_9

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v5, v7, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x43af8891

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    move-object v2, v0

    check-cast v2, Lqc2/a$c;

    invoke-virtual {v2}, Lqc2/a$c;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqc2/a;

    invoke-static {v4, v7, v1}, Lqc2/b;->e(Lqc2/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_c
    invoke-static {v7, v1, v3, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_7

    :cond_d
    const v0, 0x4e2636ca    # 6.971521E8f

    invoke-static {v0, v7, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Los0/d;

    const/16 v3, 0x10

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(Lqc2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqc2/b;->e(Lqc2/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lqc2/c;Landroidx/compose/runtime/Composer;II)V
    .locals 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x4eb9009b    # 1.5519123E9f

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    move v2, v4

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    if-eqz v0, :cond_6

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_6
    instance-of v0, p1, Lqc2/c$a;

    if-eqz v0, :cond_7

    const v0, -0x7b84a51d

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    move-object v0, p1

    check-cast v0, Lqc2/c$a;

    and-int/lit8 v1, v1, 0x7e

    invoke-static {p0, v0, p2, v1, v4}, Lqc2/b;->i(Landroidx/compose/ui/Modifier;Lqc2/c$a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    instance-of v0, p1, Lqc2/c$b;

    if-eqz v0, :cond_8

    const v0, -0x7b8498fa

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    move-object v0, p1

    check-cast v0, Lqc2/c$b;

    and-int/lit8 v1, v1, 0x7e

    invoke-static {p0, v0, p2, v1, v4}, Lqc2/b;->k(Landroidx/compose/ui/Modifier;Lqc2/c$b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    :goto_4
    move-object v1, p0

    goto :goto_5

    :cond_8
    const p0, -0x7b84ac54

    invoke-static {p0, p2, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_4

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance v0, Lno0/y0;

    const/16 v5, 0x18

    move-object v2, p1

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lqc2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lqc2/b;->g(Landroidx/compose/ui/Modifier;Lqc2/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lqc2/c$a;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x5fdea518

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v0, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_8

    if-eqz v1, :cond_7

    sget-object v1, Lb2/t;->w:Lb2/t;

    move/from16 v29, v4

    move-object v4, v1

    move/from16 v1, v29

    goto :goto_5

    :cond_7
    move v1, v4

    move-object v4, v3

    :goto_5
    invoke-virtual {v2}, Lqc2/c$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    const-string v7, "getDefault(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "toUpperCase(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v5, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    new-instance v15, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v15, v5}, Lw3/k;-><init>(I)V

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v26, v1, 0x70

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v27, v1, 0x12

    const v28, 0x2fdf8

    move-wide v5, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v4

    goto :goto_6

    :cond_8
    move-object/from16 v25, v0

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    move-object v1, v3

    :goto_6
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lno0/y0;

    const/16 v5, 0x19

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lqc2/c$a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lqc2/b;->i(Landroidx/compose/ui/Modifier;Lqc2/c$a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Lqc2/c$b;Landroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v2, p1

    sget-object v0, Lb2/e;->M:Lb2/k;

    const-string v1, "state"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v3, 0x39b14938

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p4, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v8

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v1, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_15

    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v3, v4

    :goto_4
    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v5, v1, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v1, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-nez v13, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    :cond_8
    invoke-static {v5, v1, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v10, Lqc2/b;->a:F

    float-to-double v13, v10

    const-wide/16 v29, 0x0

    cmpl-double v13, v13, v29

    const-string v31, "invalid weight; must be greater than zero"

    if-lez v13, :cond_a

    goto :goto_6

    :cond_a
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v32, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v14, v10, v32

    if-lez v14, :cond_b

    move/from16 v10, v32

    :cond_b
    invoke-direct {v13, v10, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v10, Ll0/m;->c:Ll0/g;

    invoke-static {v10, v0, v1, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v14, v1, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v1, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v1}, Lp1/q;->i0()V

    move/from16 p2, v7

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v1, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v14, v1, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v1, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x7be2d0ba

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lqc2/c$b;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v33

    :goto_8
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/util/TextResource;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v1, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    const-string v6, "getDefault(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toUpperCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v5, v1, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    new-instance v15, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v15, v5}, Lw3/k;-><init>(I)V

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v27, v5, 0x12

    const v28, 0x2fdfa

    move-object v5, v3

    move-object v3, v4

    const/4 v4, 0x0

    move v6, v8

    const-wide/16 v7, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v13, v6

    move-wide/from16 v36, v10

    move-object v11, v5

    move-wide/from16 v5, v36

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    move/from16 v16, v13

    const-wide/16 v12, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v16

    move/from16 v20, v17

    const-wide/16 v16, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v34, p2

    move-object/from16 p0, v25

    move-object/from16 v25, v1

    move/from16 v1, v35

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, p0

    move v8, v1

    move-object/from16 v1, v25

    const/4 v9, 0x1

    goto/16 :goto_8

    :cond_f
    move-object/from16 p0, v3

    move-object v3, v1

    move v1, v8

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    sget v4, Lqc2/b;->b:F

    float-to-double v5, v4

    cmpl-double v5, v5, v29

    if-lez v5, :cond_10

    goto :goto_9

    :cond_10
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v4, v32

    if-lez v6, :cond_11

    move/from16 v4, v32

    :cond_11
    invoke-direct {v5, v4, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Ll0/m;->c:Ll0/g;

    invoke-static {v4, v0, v3, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v3, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_a
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v4, v3, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lqc2/c$b;->a()Lqc2/a;

    move-result-object v0

    invoke-static {v0, v3, v1}, Lqc2/b;->e(Lqc2/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    goto :goto_b

    :cond_15
    move-object v3, v1

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, v4

    :goto_b
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lno0/y0;

    const/16 v5, 0x1a

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lqc2/c$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lqc2/b;->k(Landroidx/compose/ui/Modifier;Lqc2/c$b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
