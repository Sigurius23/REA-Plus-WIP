.class public abstract Lzc1/r7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a)\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "title",
        "Lny0/h;",
        "k",
        "(Ljava/lang/String;)Lny0/h;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBack",
        "h",
        "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "e",
        "Ll81/e;",
        "a",
        "Ll81/e;",
        "splitColumnSpaceBetweenSample",
        "b",
        "splitColumnScrollableSample",
        "design-showcase_release"
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
.field private static final a:Ll81/e;

.field private static final b:Ll81/e;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Ll81/e;

    const-string v1, "Welcome"

    invoke-static {v1}, Lzc1/r7;->k(Ljava/lang/String;)Lny0/h;

    move-result-object v1

    const-string v2, "Set up your profile"

    invoke-static {v2}, Lzc1/r7;->k(Ljava/lang/String;)Lny0/h;

    move-result-object v2

    const-string v3, "Review your goals"

    invoke-static {v3}, Lzc1/r7;->k(Ljava/lang/String;)Lny0/h;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lny0/h;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v7, "Continue"

    invoke-static {v7}, Lzc1/r7;->k(Ljava/lang/String;)Lny0/h;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Ll81/e;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzc1/r7;->a:Ll81/e;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v0, 0x28

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    const-string v2, "Item "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lzc1/r7;->k(Ljava/lang/String;)Lny0/h;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v7}, Lzc1/r7;->k(Ljava/lang/String;)Lny0/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v8, Ll81/e;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v14}, Ll81/e;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lzc1/r7;->b:Ll81/e;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzc1/r7;->j(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzc1/r7;->g(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/r7;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/r7;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object v3, p2

    check-cast v3, Lp1/q;

    const v0, 0x2c19c4f2

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_6

    move v6, v9

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v3, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v10, v0

    goto :goto_5

    :cond_7
    move-object v10, p0

    :goto_5
    if-eqz v4, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_8

    new-instance v0, Lzc1/h6;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lc93/a;

    goto :goto_6

    :cond_9
    move-object v0, p1

    :goto_6
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v3, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v5, v3, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v4, "Split Column - Scrollable"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v1

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v2, v2, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int v7, v4, v2

    const/16 v8, 0x35

    move-object v6, v3

    move-object v3, v0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v3

    sget-object v0, Lzc1/r7;->b:Ll81/e;

    float-to-double v1, v11

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_d

    goto :goto_8

    :cond_d
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    invoke-static {v11, v11, v9}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v4, Ll81/e;->e:I

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v3, v6

    invoke-static/range {v0 .. v5}, Ll81/d;->h(Ll81/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    move-object v2, v7

    move-object v1, v10

    goto :goto_9

    :cond_e
    move-object v6, v3

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, p0

    move-object v2, p1

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lau1/d;

    const/16 v5, 0x9

    move v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lau1/d;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzc1/r7;->e(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object v3, p2

    check-cast v3, Lp1/q;

    const v0, 0x578be3d7

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_6

    move v6, v9

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/lit8 v7, v2, 0x1

    invoke-virtual {v3, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v10, v0

    goto :goto_5

    :cond_7
    move-object v10, p0

    :goto_5
    if-eqz v4, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_8

    new-instance v0, Lzc1/h6;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lc93/a;

    goto :goto_6

    :cond_9
    move-object v0, p1

    :goto_6
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v3, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v5, v3, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v4, "Split Column - Space Between"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v1

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v2, v2, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int v7, v4, v2

    const/16 v8, 0x35

    move-object v6, v3

    move-object v3, v0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v3

    sget-object v0, Lzc1/r7;->a:Ll81/e;

    float-to-double v1, v11

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_d

    goto :goto_8

    :cond_d
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    invoke-static {v11, v11, v9}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v4, Ll81/e;->e:I

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v3, v6

    invoke-static/range {v0 .. v5}, Ll81/d;->h(Ll81/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    move-object v2, v7

    move-object v1, v10

    goto :goto_9

    :cond_e
    move-object v6, v3

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, p0

    move-object v2, p1

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lau1/d;

    const/16 v5, 0xa

    move v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lau1/d;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzc1/r7;->h(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljava/lang/String;)Lny0/h;
    .locals 28

    new-instance v0, Lny0/h;

    invoke-static/range {p0 .. p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v7, Lny0/p;->DEFAULT:Lny0/p;

    new-instance v8, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v26, 0x1ffdf3c

    const/16 v27, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
