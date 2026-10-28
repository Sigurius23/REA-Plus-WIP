.class public abstract Lf21/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf21/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\u000c\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0008\u001a\u0004\u0008\u000f\u0010\n\"\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0008\u001a\u0004\u0008\u0012\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf21/d;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lf21/d;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lf21/d;",
        "getPreviewCompactWithIconViewState",
        "()Lf21/d;",
        "previewCompactWithIconViewState",
        "getPreviewCompactNoIconViewState",
        "previewCompactNoIconViewState",
        "c",
        "getPreviewProminentWithIconViewState",
        "previewProminentWithIconViewState",
        "d",
        "getPreviewProminentNoIconViewState",
        "previewProminentNoIconViewState",
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
.field private static final a:Lf21/d;

.field private static final b:Lf21/d;

.field private static final c:Lf21/d;

.field private static final d:Lf21/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lf21/d;

    sget-object v1, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lf21/a;->COMPACT:Lf21/a;

    const-string v4, "callout-1"

    const-string v5, "This is a sample callout with enough text to demonstrate the two-line maximum constraint and ellipsis truncation behavior."

    invoke-direct {v0, v4, v2, v5, v3}, Lf21/d;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V

    sput-object v0, Lf21/c;->a:Lf21/d;

    new-instance v0, Lf21/d;

    const-string v2, "callout-2"

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v5, v3}, Lf21/d;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V

    sput-object v0, Lf21/c;->b:Lf21/d;

    new-instance v0, Lf21/d;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lf21/a;->PROMINENT:Lf21/a;

    const-string v3, "callout-3"

    invoke-direct {v0, v3, v1, v5, v2}, Lf21/d;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V

    sput-object v0, Lf21/c;->c:Lf21/d;

    new-instance v0, Lf21/d;

    const-string v1, "callout-4"

    invoke-direct {v0, v1, v4, v5, v2}, Lf21/d;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V

    sput-object v0, Lf21/c;->d:Lf21/d;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lf21/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf21/c;->c(Landroidx/compose/ui/Modifier;Lf21/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lf21/d;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v3, p1

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, -0x8a5c165

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_3

    :cond_5
    move v5, v7

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v13, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v4

    move-object v2, v0

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    sget-object v4, Liz0/l;->a:Liz0/l;

    invoke-virtual {v3}, Lf21/d;->c()Lf21/a;

    move-result-object v5

    sget-object v6, Lf21/c$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x6

    if-eq v5, v8, :cond_8

    if-ne v5, v1, :cond_7

    const v1, -0x763acf20

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v13, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    :goto_5
    move-object v5, v1

    goto :goto_6

    :cond_7
    const v0, -0x763ae675

    invoke-static {v0, v13, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_8
    const v1, -0x763ada20

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v13, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v9

    const/high16 v28, 0x30000

    const/16 v29, 0x7ffc

    move v1, v7

    move-wide v6, v9

    move v10, v8

    const-wide/16 v8, 0x0

    move v12, v10

    const-wide/16 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    move v15, v14

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v30, v27

    const/16 v27, 0x0

    invoke-virtual/range {v4 .. v29}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v12

    move-object/from16 v13, v26

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->a:Ll0/e;

    invoke-virtual {v3}, Lf21/d;->c()Lf21/a;

    move-result-object v5

    invoke-virtual {v5}, Lf21/a;->getSpacing-D9Ej5fM()F

    move-result v5

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    invoke-virtual {v3}, Lf21/d;->c()Lf21/a;

    move-result-object v6

    invoke-virtual {v6}, Lf21/a;->getVerticalAlignment()Lb2/g;

    move-result-object v6

    invoke-static {v5, v6, v13, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_9

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v13, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v6, v13, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf21/d;->b()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_c

    const v4, -0x3d92e42c

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lf21/d;->c()Lf21/a;

    move-result-object v4

    invoke-virtual {v4}, Lf21/a;->getIconSize-D9Ej5fM()F

    move-result v4

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v4

    invoke-static {v0, v4}, Lgb1/b0;->s(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Lf21/d;->b()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0, v13, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    sget-wide v7, Li2/x;->f:J

    const/16 v10, 0xc30

    const/4 v11, 0x0

    const/4 v5, 0x0

    move-object v9, v13

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const v0, -0x3d8e4bfd

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_8
    float-to-double v0, v14

    const-wide/16 v4, 0x0

    cmpl-double v0, v0, v4

    if-lez v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v0, 0x1

    invoke-direct {v5, v14, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v3}, Lf21/d;->a()Ljava/lang/String;

    move-result-object v4

    const/high16 v14, 0xc30000

    const/16 v15, 0x154

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x2

    move-object v7, v12

    const/4 v12, 0x0

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    :goto_a
    move-object v1, v2

    goto :goto_b

    :cond_e
    invoke-virtual {v13}, Lp1/q;->X()V

    goto :goto_a

    :goto_b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Ld62/b;

    const/16 v5, 0x19

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lf21/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf21/c;->b(Landroidx/compose/ui/Modifier;Lf21/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
