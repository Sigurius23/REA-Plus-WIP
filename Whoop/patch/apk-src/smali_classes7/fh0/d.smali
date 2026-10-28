.class public abstract Lfh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a]\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00168CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "sublabel",
        "",
        "isActive",
        "isEnabled",
        "errorMessage",
        "showError",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onToggle",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lt0/i;",
        "a",
        "Lt0/i;",
        "cardShape",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "previewError",
        "Li2/t;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)Li2/t;",
        "aiBrush",
        "bot_release"
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

.field private static final b:Lcom/whoop/design/util/TextResource;


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

    sput-object v0, Lfh0/d;->a:Lt0/i;

    const-string v0, "Unable to update status. Please try again."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sput-object v0, Lfh0/d;->b:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfh0/d;->e(Lcom/whoop/design/util/TextResource;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lfh0/d;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lfh0/d;->f(Lc93/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "ZZ",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p3

    move-object/from16 v0, p5

    move-object/from16 v1, p7

    move/from16 v15, p9

    const-string v4, "label"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "errorMessage"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onToggle"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v4, 0x2f7cab8b

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p10, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v8, v15, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v15, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v15

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v15

    :goto_1
    and-int/lit8 v10, v15, 0x30

    if-nez v10, :cond_5

    and-int/lit8 v10, v15, 0x40

    if-nez v10, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_2
    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_3

    :cond_4
    const/16 v10, 0x10

    :goto_3
    or-int/2addr v9, v10

    :cond_5
    and-int/lit16 v10, v15, 0x180

    if-nez v10, :cond_8

    and-int/lit16 v10, v15, 0x200

    if-nez v10, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_4
    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_5

    :cond_7
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v9, v10

    :cond_8
    and-int/lit16 v10, v15, 0xc00

    if-nez v10, :cond_a

    invoke-virtual {v12, v5}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_6

    :cond_9
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v9, v10

    :cond_a
    and-int/lit8 v10, p10, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v9, v9, 0x6000

    :cond_b
    move/from16 v11, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_b

    move/from16 v11, p4

    invoke-virtual {v12, v11}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_7

    :cond_d
    const/16 v13, 0x2000

    :goto_7
    or-int/2addr v9, v13

    :goto_8
    const/high16 v13, 0x30000

    and-int/2addr v13, v15

    if-nez v13, :cond_10

    const/high16 v13, 0x40000

    and-int/2addr v13, v15

    if-nez v13, :cond_e

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_9

    :cond_e
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    :goto_9
    if-eqz v13, :cond_f

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v9, v13

    :cond_10
    and-int/lit8 v13, p10, 0x40

    const/high16 v14, 0x180000

    if-eqz v13, :cond_12

    or-int/2addr v9, v14

    :cond_11
    move/from16 v14, p6

    goto :goto_c

    :cond_12
    and-int/2addr v14, v15

    if-nez v14, :cond_11

    move/from16 v14, p6

    invoke-virtual {v12, v14}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_b

    :cond_13
    const/high16 v16, 0x80000

    :goto_b
    or-int v9, v9, v16

    :goto_c
    const/high16 v16, 0xc00000

    and-int v16, v15, v16

    if-nez v16, :cond_15

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x800000

    goto :goto_d

    :cond_14
    const/high16 v16, 0x400000

    :goto_d
    or-int v9, v9, v16

    :cond_15
    const v16, 0x492493

    and-int v6, v9, v16

    const v7, 0x492492

    move/from16 v17, v4

    const/4 v4, 0x0

    if-eq v6, v7, :cond_16

    const/4 v6, 0x1

    goto :goto_e

    :cond_16
    move v6, v4

    :goto_e
    and-int/lit8 v7, v9, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_2e

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v17, :cond_17

    move-object v7, v6

    goto :goto_f

    :cond_17
    move-object/from16 v7, p0

    :goto_f
    if-eqz v10, :cond_18

    const/4 v11, 0x1

    :cond_18
    if-eqz v13, :cond_19

    move v14, v4

    :cond_19
    invoke-static {v12, v4}, Lfh0/d;->h(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v10

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v5, v12, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move-object/from16 p4, v5

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v42, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v43, v9

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_1a

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_10
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v12, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    move-object/from16 p6, v10

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_1b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move/from16 v44, v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1c

    goto :goto_11

    :cond_1b
    move/from16 v44, v11

    :goto_11
    invoke-static {v4, v12, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v8, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move/from16 v45, v14

    invoke-virtual/range {v17 .. v17}, Ly81/i;->a1()J

    move-result-wide v14

    sget-object v1, Lfh0/d;->a:Lt0/i;

    invoke-static {v10, v14, v15, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v10, 0x2

    int-to-float v10, v10

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v10, v14

    invoke-static {v1, v10, v10}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, Lb2/e;->K:Lb2/l;

    sget-object v15, Ll0/m;->g:Ll0/h;

    const/16 v0, 0x36

    invoke-static {v15, v10, v12, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v15

    move-object/from16 v16, v1

    iget-wide v0, v12, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    move-object/from16 v3, v16

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-eqz v2, :cond_1d

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v12, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_1e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    :cond_1e
    invoke-static {v0, v12, v0, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v12, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    mul-float/2addr v0, v14

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    const-wide/16 v15, 0x0

    cmpl-double v1, v2, v15

    if-lez v1, :cond_20

    const/4 v1, 0x1

    goto :goto_13

    :cond_20
    const/4 v1, 0x0

    :goto_13
    if-nez v1, :cond_21

    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_21
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v2, 0x36

    invoke-static {v0, v10, v12, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_22

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_22
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v12, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    :cond_23
    invoke-static {v2, v12, v2, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    invoke-static {v12, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lgy0/a;->j:I

    const/4 v1, 0x0

    invoke-static {v0, v12, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v16

    const v0, 0x3ecccccd    # 0.4f

    if-eqz p3, :cond_25

    const v2, -0x7a5da8cc

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    move-object/from16 v22, v2

    goto :goto_15

    :cond_25
    const v2, 0x77ec795e

    invoke-static {v12, v2, v8, v12, v11}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v10, Li2/p;

    const/4 v15, 0x5

    invoke-direct {v10, v2, v3, v15}, Li2/p;-><init>(JI)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v22, v10

    :goto_15
    const/4 v1, 0x6

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v24, 0x1b0

    const/16 v25, 0x38

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v12

    invoke-static/range {v16 .. v25}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    move-object/from16 v3, p4

    invoke-static {v2, v14, v3, v12, v1}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_26

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_26
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v12, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_27

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    :cond_27
    invoke-static {v3, v12, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v12, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v3, v43, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/2addr v3, v2

    move-object/from16 v15, p1

    invoke-static {v15, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v8, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v36

    invoke-virtual {v8, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v18

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v40, v3, 0x12

    const v41, 0x2fffa

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    move-object/from16 v38, v12

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    if-nez p2, :cond_29

    const v0, 0x1e01c94

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, p2

    goto/16 :goto_18

    :cond_29
    const v4, 0x1e01c95

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    if-eqz p3, :cond_2a

    const v0, 0x165cc924

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object/from16 v4, p2

    invoke-static {v4, v12, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    new-instance v17, Ll3/m0;

    sget-wide v20, Ly3/o;->c:J

    sget-wide v32, Li2/x;->n:J

    const/high16 v19, 0x7fc00000    # Float.NaN

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-wide/from16 v27, v20

    move-object/from16 v18, p6

    invoke-direct/range {v17 .. v37}, Ll3/m0;-><init>(Li2/t;FJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    move-object/from16 v2, v17

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    invoke-virtual {v8, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v37

    shl-int/lit8 v40, v3, 0x15

    const v41, 0x1fffe

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v39, 0x0

    move-object/from16 v38, v12

    invoke-static/range {v16 .. v41}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_2a
    move-object/from16 v4, p2

    const v3, 0x16617b5c

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-static {v4, v12, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v8, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->c()Lb91/a;

    move-result-object v36

    invoke-static {v8, v12, v11, v0}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v18

    const/16 v39, 0x0

    const v41, 0x2fffa

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v38, v12

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_18
    new-instance v2, Lby1/c;

    const/4 v3, 0x2

    move-object/from16 v5, p5

    invoke-direct {v2, v5, v3}, Lby1/c;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const v3, -0x6038e4e9

    invoke-static {v3, v12, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v22

    shr-int/lit8 v2, v43, 0xf

    and-int/lit8 v2, v2, 0x70

    const v3, 0x180006

    or-int v24, v3, v2

    const/16 v25, 0x1e

    sget-object v16, Ll0/z;->a:Ll0/z;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v12

    move/from16 v17, v45

    invoke-static/range {v16 .. v25}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const/high16 v2, 0x1c00000

    and-int v2, v43, v2

    const/high16 v6, 0x800000

    if-ne v2, v6, :cond_2b

    move v0, v3

    :cond_2b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2d

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_2c

    goto :goto_19

    :cond_2c
    move-object/from16 v6, p7

    goto :goto_1a

    :cond_2d
    :goto_19
    new-instance v2, Laz1/b;

    const/16 v0, 0x1a

    move-object/from16 v6, p7

    invoke-direct {v2, v6, v0}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v43, 0x6

    and-int/lit16 v13, v0, 0x3f0

    const/16 v14, 0x39

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v5, p3

    move/from16 v6, v44

    invoke-static/range {v4 .. v14}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move v5, v6

    move-object/from16 v1, v42

    move/from16 v7, v45

    goto :goto_1b

    :cond_2e
    move-object v15, v2

    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move v5, v11

    move v7, v14

    :goto_1b
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_2f

    new-instance v0, Lfh0/c;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    move-object v2, v15

    invoke-direct/range {v0 .. v10}, Lfh0/c;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 26

    move-object/from16 v0, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v20

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b()J

    move-result-wide v2

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v24, v4, 0x12

    const v25, 0x2fffa

    move-object v0, v1

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lfh0/d;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/runtime/Composer;I)Li2/t;
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
