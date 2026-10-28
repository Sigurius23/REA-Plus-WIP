.class public abstract Lc41/r2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc41/r2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/p2;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lc41/n2;",
        "l",
        "(Lc41/n2;)Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "a",
        "F",
        "IconContentSpacing",
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
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr v0, v0

    sput v0, Lc41/r2;->a:F

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/r2;->k(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/r2;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc41/p2;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/r2;->j(Lc41/p2;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/r2;->h(Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc41/p2;Lm91/o;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc41/r2;->i(Lc41/p2;Lm91/o;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/p2;",
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

    const v0, 0x5bca5362

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

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_8

    move v7, v10

    goto :goto_5

    :cond_8
    move v7, v9

    :goto_5
    and-int/2addr v3, v10

    invoke-virtual {v14, v3, v7}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v1

    :goto_6
    if-eqz v5, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_a

    new-instance v1, Lc31/m;

    const/16 v3, 0xe

    invoke-direct {v1, v3}, Lc31/m;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v1, v6

    :goto_7
    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v14, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v5, v14, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lc41/p2;->u()Lrz0/f;

    move-result-object v6

    invoke-virtual {v2}, Lc41/p2;->e()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v14, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    new-instance v3, La0;

    const/16 v5, 0xb

    invoke-direct {v3, v5, v2, v1}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, -0x14d07de4

    invoke-static {v5, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x79

    const/4 v5, 0x0

    const/4 v9, 0x0

    move v3, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    move-object v3, v1

    move-object v1, v0

    goto :goto_9

    :cond_f
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v6

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lc41/d1;

    const/4 v6, 0x2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    and-int/lit8 v1, p3, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    move v1, v9

    :goto_0
    and-int/lit8 v3, p3, 0x1

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1d

    int-to-float v1, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v10, v15, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v15, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v15, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v12, v15, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v8, v5, v15, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object/from16 p3, v10

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v15, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v9, v15, v9, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v15, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/p2;->o()Lgz0/m0;

    move-result-object v5

    const/4 v9, 0x6

    if-nez v5, :cond_7

    const v5, 0x13612b73

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    move-object/from16 v5, p3

    move-object/from16 v36, v11

    move-object/from16 v37, v13

    move-object v9, v14

    goto/16 :goto_4

    :cond_7
    const v10, 0x13612b74

    invoke-static {v15, v10, v5, v15, v9}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v10

    invoke-virtual {v0}, Lc41/p2;->q()F

    move-result v5

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0}, Lc41/p2;->p()Lc41/n2;

    move-result-object v12

    invoke-static {v12}, Lc41/r2;->l(Lc41/n2;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-interface {v5, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lc41/p2;->p()Lc41/n2;

    move-result-object v5

    sget-object v17, Lc41/r2$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v17, v5

    const/4 v8, 0x1

    if-eq v5, v8, :cond_9

    const/4 v8, 0x2

    if-ne v5, v8, :cond_8

    const v5, 0x1564c1f8

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x0

    invoke-static {v5, v15, v9, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_3

    :cond_8
    const/4 v8, 0x0

    const v0, 0x1564a7cf

    invoke-static {v0, v15, v8}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_9
    const/4 v8, 0x0

    const v5, 0x1564b4c1

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lc41/p2;->h()Ly81/e;

    move-result-object v5

    invoke-interface {v5, v15, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    :goto_3
    const/16 v5, 0x30

    move-object/from16 v18, v13

    move-wide/from16 v39, v16

    move-object/from16 v16, v14

    move-wide/from16 v13, v39

    const/16 v17, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v9, v16

    move-object/from16 v37, v18

    move-object/from16 v36, v19

    move/from16 v16, v5

    move-object/from16 v5, p3

    invoke-static/range {v10 .. v17}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v10, Lc41/r2;->a:F

    invoke-static {v4, v10, v15, v8}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_4
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v10

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v10, v11

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v13, v12

    const-wide/16 v16, 0x0

    cmpl-double v13, v13, v16

    if-lez v13, :cond_a

    goto :goto_5

    :cond_a
    const-string v13, "invalid weight; must be greater than zero"

    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v14, 0x1

    invoke-direct {v13, v12, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v0}, Lc41/p2;->x()Z

    move-result v14

    if-eqz v14, :cond_b

    :goto_6
    move/from16 v19, v1

    goto :goto_7

    :cond_b
    const/4 v8, 0x0

    int-to-float v1, v8

    mul-float/2addr v1, v3

    goto :goto_6

    :goto_7
    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v13

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v13, 0x36

    invoke-static {v10, v5, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v15, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v36

    invoke-static {v15, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-nez v8, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    :cond_d
    move-object/from16 v14, v37

    goto :goto_9

    :cond_e
    move-object/from16 v14, v37

    goto :goto_a

    :goto_9
    invoke-static {v13, v15, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_a
    invoke-static {v15, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/p2;->v()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_f

    const v1, 0x41dc6044

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    move-object v1, v10

    move/from16 v36, v11

    move/from16 v37, v12

    move v10, v8

    move-object v8, v14

    goto/16 :goto_b

    :cond_f
    const/4 v8, 0x0

    const v13, 0x41dc6045

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    invoke-static {v1, v15, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v13, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v13, v15, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->b()Lb91/a;

    move-result-object v30

    invoke-virtual {v0}, Lc41/p2;->w()Ly81/e;

    move-result-object v12

    invoke-interface {v12, v15, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    const/16 v34, 0x0

    const v35, 0x2fffa

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v18, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v37, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const-wide/16 v23, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    move/from16 v33, v31

    const/16 v31, 0x0

    move/from16 v36, v33

    const/16 v33, 0x0

    move-object v8, v10

    move-object v10, v1

    move-object v1, v8

    move-object/from16 v8, v37

    const/high16 v37, 0x3f800000    # 1.0f

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v10, 0x0

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    :goto_b
    sget-object v11, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v0}, Lc41/p2;->i()Lb91/c;

    move-result-object v12

    invoke-virtual {v11, v12}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v11

    invoke-virtual {v11}, Lb91/a;->d()Ll3/v0;

    move-result-object v11

    invoke-virtual {v0}, Lc41/p2;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v12, v15, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v38

    sget-object v12, Liz0/l;->a:Liz0/l;

    invoke-virtual {v0}, Lc41/p2;->h()Ly81/e;

    move-result-object v13

    invoke-interface {v13, v15, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    sget-object v10, Lx81/d;->a:Lx81/d;

    move/from16 p2, v3

    const/4 v3, 0x6

    invoke-virtual {v10, v15, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->k0()J

    move-result-wide v18

    invoke-virtual {v0}, Lc41/p2;->n()Ly81/e;

    move-result-object v3

    const/4 v10, 0x0

    invoke-interface {v3, v15, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v22

    invoke-virtual {v0}, Lc41/p2;->t()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v15, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    const/high16 v34, 0x30000

    const/16 v35, 0x7f58

    move-object v10, v12

    move-wide v12, v13

    move-object/from16 v32, v15

    move-wide/from16 v14, v18

    move-wide/from16 v19, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    invoke-virtual/range {v10 .. v35}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v13

    move-object/from16 v15, v32

    const/16 v20, 0x0

    const/16 v21, 0x1f6

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v32

    move-object/from16 v10, v38

    invoke-static/range {v10 .. v21}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v19

    const/4 v14, 0x1

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lc41/p2;->r()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    if-nez v10, :cond_14

    const v10, 0x498ae598    # 1137843.0f

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-static {v7, v5, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    invoke-virtual {v15, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v15, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    :cond_11
    invoke-static {v5, v15, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v15, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x6185c8ce

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lc41/p2;->r()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/o;

    double-to-float v2, v11

    mul-float v2, v2, p2

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v15, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v3, Ll;

    const/16 v2, 0xa

    invoke-direct {v3, v2, v0, v1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v2, 0x0

    move/from16 v9, p2

    move-object v10, v4

    move-object v5, v15

    move/from16 v13, v37

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v7}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v10

    goto :goto_d

    :cond_13
    move/from16 v9, p2

    move-object v10, v4

    move/from16 v13, v37

    const/4 v3, 0x0

    const/4 v14, 0x1

    move-object/from16 v4, p1

    invoke-static {v15, v3, v14, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_e

    :cond_14
    move/from16 v9, p2

    move-object v10, v4

    move/from16 v13, v37

    const/4 v3, 0x0

    const/4 v14, 0x1

    move-object/from16 v4, p1

    const v1, 0x4998181c    # 1245955.5f

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lc41/p2;->x()Z

    move-result v1

    if-eqz v1, :cond_1c

    const v1, -0x3233f750

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-static {v13, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    double-to-float v1, v11

    mul-float v18, v1, v9

    const/16 v20, 0x0

    const/16 v21, 0x9

    const/16 v17, 0x0

    move/from16 v19, v18

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->b:Ll0/e;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    invoke-static {v2, v3, v15, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v15, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_f
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v15, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v15, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_16

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    :cond_16
    invoke-static {v3, v15, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float v11, v36, v36

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_18

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_19

    :cond_18
    new-instance v3, Lbs1/v;

    const/16 v2, 0xd

    invoke-direct {v3, v0, v4, v2}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v5, v3

    check-cast v5, Lc93/a;

    const/16 v6, 0xf

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->e()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v15, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v10

    sget v2, Lgy0/f;->b0:I

    const/4 v8, 0x0

    invoke-static {v2, v15, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lc41/p2;->l()Ly81/e;

    move-result-object v0

    if-nez v0, :cond_1a

    const v0, -0x2ccf0aef

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_10

    :cond_1a
    const v2, 0x175428f0

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-interface {v0, v15, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-static {v15, v8, v2, v3}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v0

    :goto_10
    if-nez v0, :cond_1b

    const v0, 0x17542e04

    const/4 v3, 0x6

    invoke-static {v15, v0, v1, v15, v3}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    :goto_11
    move-wide v13, v0

    goto :goto_12

    :cond_1b
    const v1, 0x17542625

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    iget-wide v0, v0, Li2/x;->a:J

    goto :goto_11

    :goto_12
    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v10 .. v17}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1c
    const/4 v8, 0x0

    const v0, -0x3223b07a

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1d
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_13
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lc41/p2;Lm91/o;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p2, -0x65cdfeaf

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lc41/p2;->s()Lc41/o2;

    move-result-object p2

    sget-object p4, Lc41/o2;->TEXT:Lc41/o2;

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-ne p2, p4, :cond_0

    invoke-virtual {p1}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    instance-of p1, p1, Lny0/p0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lc41/p2;->q()F

    move-result p0

    sget p1, Lc41/r2;->a:F

    add-float v1, p0, p1

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p3, p0}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method private static final j(Lc41/p2;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lc41/p2;->j()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p0}, Lc41/p2;->k()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lc41/m2;

    invoke-virtual {p0}, Lc41/p2;->f()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lc41/m2;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lc41/n2;)Landroidx/compose/ui/Modifier;
    .locals 4

    sget-object v0, Lc41/r2$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Li2/t;->b:Li2/s;

    invoke-static {}, Lgb1/b0;->m()Ljava/util/List;

    move-result-object v0

    const/16 v2, 0xe

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v3, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    invoke-static {v1, p0}, Lgb1/b0;->s(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    return-object v1
.end method
