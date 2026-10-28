.class public abstract Lw71/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\" \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "context",
        "",
        "hasContext",
        "Lw71/a0;",
        "padding",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V",
        "Lp1/t1;",
        "a",
        "Lp1/t1;",
        "f",
        "()Lp1/t1;",
        "LocalJournalQuestionTextPadding",
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw70/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw70/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lw71/z;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lw71/z;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Lw71/a0;
    .locals 1

    invoke-static {}, Lw71/z;->e()Lw71/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "question"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x26661fad

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p6, 0x2

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    move-object/from16 v3, p1

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_4
    move-object/from16 v3, p1

    :goto_3
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    move/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    :goto_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_a

    and-int/lit8 v7, p6, 0x8

    if-nez v7, :cond_9

    if-nez p3, :cond_8

    const/4 v7, -0x1

    goto :goto_6

    :cond_8
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_6
    invoke-virtual {v0, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_7

    :cond_9
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v2, v7

    :cond_a
    and-int/lit16 v7, v2, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_b

    move v7, v10

    goto :goto_8

    :cond_b
    move v7, v9

    :goto_8
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v0, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v7, v5, 0x1

    if-eqz v7, :cond_f

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_a

    :cond_c
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_d

    and-int/lit8 v2, v2, -0x71

    :cond_d
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_e

    and-int/lit16 v2, v2, -0x1c01

    :cond_e
    move-object/from16 v4, p3

    :goto_9
    move/from16 v32, v2

    move v2, v6

    goto :goto_b

    :cond_f
    :goto_a
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_10

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    const-string v7, ""

    invoke-direct {v3, v7}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    and-int/lit8 v2, v2, -0x71

    :cond_10
    if-eqz v4, :cond_11

    move v6, v9

    :cond_11
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_e

    sget-object v4, Lw71/z;->a:Lp1/t1;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw71/a0;

    and-int/lit16 v2, v2, -0x1c01

    goto :goto_9

    :goto_b
    invoke-virtual {v0}, Lp1/q;->r()V

    const/4 v6, 0x0

    invoke-virtual {v4}, Lw71/a0;->getVerticalPadding-D9Ej5fM()F

    move-result v7

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v6, v7, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v8, v7, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_12

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_14

    :cond_13
    invoke-static {v8, v0, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v6, v32, 0xe

    invoke-static {v1, v0, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    int-to-float v7, v10

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v14, v7, v8

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v8, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v8, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    const/16 v30, 0x0

    const v31, 0x2fff8

    move v14, v10

    move v15, v11

    const-wide/16 v10, 0x0

    move/from16 v16, v9

    move-wide/from16 v36, v12

    move-object v13, v8

    move-wide/from16 v8, v36

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v20, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move/from16 v24, v20

    const-wide/16 v19, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x0

    move/from16 v34, v27

    const/16 v27, 0x0

    move/from16 v35, v29

    const/16 v29, 0x30

    move-object/from16 v28, v0

    move-object/from16 v0, v33

    move/from16 v1, v35

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v28

    if-eqz v2, :cond_15

    const v7, 0x5e8ff041

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    shr-int/lit8 v7, v32, 0x3

    and-int/lit8 v7, v7, 0xe

    invoke-static {v3, v6, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v30, 0x0

    const v31, 0x2fffa

    move-object/from16 v28, v6

    move-object v6, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v28

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v14, 0x1

    goto :goto_e

    :cond_15
    move-object v0, v6

    const/4 v1, 0x0

    const v6, 0x5e92952b

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move-object/from16 v36, v3

    move v3, v2

    move-object/from16 v2, v36

    goto :goto_f

    :cond_16
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v2, v3

    move v3, v6

    :goto_f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lry2/h;

    const/16 v7, 0xa

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e()Lw71/a0;
    .locals 1

    sget-object v0, Lw71/a0;->DEFAULT:Lw71/a0;

    return-object v0
.end method

.method public static final f()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lw71/z;->a:Lp1/t1;

    return-object v0
.end method
