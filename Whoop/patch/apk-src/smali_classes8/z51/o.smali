.class public abstract Lz51/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz51/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aQ\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lz51/s;",
        "type",
        "",
        "fillPercent",
        "Lcom/whoop/design/util/TextResource;",
        "score",
        "",
        "showOptimalStrain",
        "optimalStrainPercent",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "k",
        "(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "g",
        "(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Li91/a;",
        "o",
        "(Lz51/s;Landroidx/compose/runtime/Composer;I)Li91/a;",
        "",
        "p",
        "(Lz51/s;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "Ly3/f;",
        "a",
        "F",
        "PILLAR_GAUGE_RADIUS",
        "b",
        "PILLAR_GAUGE_STROKE",
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

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x94

    int-to-float v0, v0

    sput v0, Lz51/o;->a:F

    const-wide v0, 0x4032666666666666L    # 18.4

    double-to-float v0, v0

    sput v0, Lz51/o;->b:F

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz51/o;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz51/o;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz51/o;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lz51/o;->j(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lz51/o;->n(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz51/o;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz51/s;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x57aab36d

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v8, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x93

    const/16 v9, 0x92

    if-eq v7, v9, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_8

    new-instance v3, Lyz1/g;

    const/16 v6, 0x11

    invoke-direct {v3, v6}, Lyz1/g;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v3, v6

    :goto_6
    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v9, v6, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v9, v8, v9, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v8, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->h:Ll0/h;

    const/16 v14, 0x36

    invoke-static {v11, v10, v8, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    move-object/from16 p2, v3

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_d

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v8, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    :cond_e
    invoke-static {v3, v8, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v0, 0xe

    invoke-static {v1, v8, v3}, Lz51/o;->p(Lz51/s;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v3, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->q()Lb91/a;

    move-result-object v25

    new-instance v6, Lw3/k;

    const/4 v11, 0x3

    invoke-direct {v6, v11}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdfa

    move-object/from16 v17, v6

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object v13, v7

    move-object/from16 v27, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move/from16 v20, v15

    const-wide/16 v14, 0x0

    const/16 v21, 0x1

    const/16 v16, 0x0

    move-object/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v31, v0

    move/from16 v0, v32

    move/from16 v4, v33

    move-object/from16 v35, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    shr-int/lit8 v5, v31, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v2, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll83/k;

    const/4 v7, 0x6

    invoke-virtual {v3, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->u()Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    invoke-virtual {v3, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-static {v9, v10, v11, v8, v0}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v9

    invoke-direct {v6, v5, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6}, [Ll83/k;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v5

    sget-object v6, Lz51/s;->STRAIN:Lz51/s;

    if-eq v1, v6, :cond_10

    const v6, -0x2f693020

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    new-instance v6, Ll83/k;

    invoke-virtual {v3, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->x()Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    invoke-virtual {v3, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v10

    invoke-static {v9, v10, v11, v8, v0}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v3

    const-string v7, "%"

    invoke-direct {v6, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    const v3, -0x2f673cdb

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_9
    new-instance v3, Lw3/k;

    const/4 v14, 0x3

    invoke-direct {v3, v14}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x3fdfe

    const/4 v6, 0x0

    move-object/from16 v27, v8

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v17, v3

    invoke-static/range {v5 .. v30}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v5, "remove-squarables"

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_14

    const v3, -0x2f6351d6

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    move/from16 v3, v31

    and-int/lit16 v3, v3, 0x380

    const/16 v5, 0x100

    if-ne v3, v5, :cond_11

    move v10, v4

    goto :goto_a

    :cond_11
    move v10, v0

    :goto_a
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v10, :cond_13

    move-object/from16 v13, v35

    if-ne v3, v13, :cond_12

    goto :goto_b

    :cond_12
    move-object/from16 v11, p2

    goto :goto_c

    :cond_13
    :goto_b
    new-instance v3, Lyk2/i;

    const/16 v5, 0xf

    move-object/from16 v11, p2

    invoke-direct {v3, v11, v5}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v7, v3

    check-cast v7, Lc93/a;

    const/16 v9, 0x30

    const/4 v10, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static/range {v5 .. v10}, Loy0/a;->c(Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_14
    move-object/from16 v11, p2

    const v3, -0x2f61841b

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    move-object v3, v11

    goto :goto_e

    :cond_15
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v6

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lz51/n;

    const/4 v6, 0x0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lz51/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lz51/p;->SHARE:Lz51/p;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lz51/o;->g(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz51/s;",
            "F",
            "Lcom/whoop/design/util/TextResource;",
            "ZF",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v7, p7

    const-string v2, "type"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "score"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v2, -0x559dd379

    invoke-virtual {v13, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v13, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_3

    move/from16 v4, p1

    invoke-virtual {v13, v4}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_3

    :cond_3
    move/from16 v4, p1

    :goto_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_4

    :cond_4
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v2, v5

    :cond_5
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0xc00

    :cond_6
    move/from16 v6, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v6, v7, 0xc00

    if-nez v6, :cond_6

    move/from16 v6, p3

    invoke-virtual {v13, v6}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_5

    :cond_8
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v2, v8

    :goto_6
    and-int/lit8 v8, p8, 0x10

    if-eqz v8, :cond_a

    or-int/lit16 v2, v2, 0x6000

    :cond_9
    move/from16 v9, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v7, 0x6000

    if-nez v9, :cond_9

    move/from16 v9, p4

    invoke-virtual {v13, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_7

    :cond_b
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v2, v10

    :goto_8
    and-int/lit8 v10, p8, 0x20

    const/high16 v12, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v2, v12

    :cond_c
    move-object/from16 v12, p5

    :goto_9
    move/from16 v20, v2

    goto :goto_b

    :cond_d
    and-int/2addr v12, v7

    if-nez v12, :cond_c

    move-object/from16 v12, p5

    invoke-virtual {v13, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v2, v14

    goto :goto_9

    :goto_b
    const v2, 0x12493

    and-int v2, v20, v2

    const v14, 0x12492

    move/from16 p6, v5

    const/4 v5, 0x0

    if-eq v2, v14, :cond_f

    const/4 v2, 0x1

    goto :goto_c

    :cond_f
    move v2, v5

    :goto_c
    and-int/lit8 v14, v20, 0x1

    invoke-virtual {v13, v14, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1c

    if-eqz p6, :cond_10

    move v6, v5

    :cond_10
    if-eqz v8, :cond_11

    const/4 v2, 0x0

    goto :goto_d

    :cond_11
    move v2, v9

    :goto_d
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_13

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_12

    new-instance v9, Lyz1/g;

    const/16 v10, 0x10

    invoke-direct {v9, v10}, Lyz1/g;-><init>(I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move/from16 v21, v2

    move-object v2, v9

    goto :goto_e

    :cond_13
    move/from16 v21, v2

    move-object v2, v12

    :goto_e
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_14

    invoke-static {v13}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_14
    move-object/from16 v23, v9

    check-cast v23, Lj0/i;

    sget-object v9, Lb2/e;->E:Lb2/m;

    int-to-float v3, v3

    mul-float v26, v3, v3

    const/16 v28, 0x0

    const/16 v29, 0xd

    sget-object v24, Lb2/t;->w:Lb2/t;

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_15

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_f
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v13, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v13, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-nez v12, :cond_16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_17

    :cond_16
    invoke-static {v11, v13, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v13, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v9, Lz51/o;->a:F

    sget v12, Lz51/o;->b:F

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v10, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->W0()J

    move-result-wide v14

    invoke-static {v14, v15}, Li91/c;->o(J)Li91/a;

    move-result-object v14

    const/16 v18, 0x61b0

    const/16 v19, 0x1e1

    move-object v15, v8

    const/4 v8, 0x0

    move-object/from16 v17, v10

    const/high16 v10, 0x3f800000    # 1.0f

    move-object/from16 v22, v17

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v25, v11

    move-object v11, v14

    const/4 v14, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    const/16 v27, 0x1

    const/16 v16, 0x0

    move/from16 p3, v6

    move-object/from16 v5, v22

    move-object/from16 v30, v24

    move/from16 v7, v25

    move-object/from16 v6, v26

    invoke-static/range {v8 .. v19}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    if-eqz p3, :cond_18

    const v8, 0xdb766a

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->X0()J

    move-result-wide v10

    invoke-static {v10, v11}, Li91/c;->o(J)Li91/a;

    move-result-object v11

    shr-int/lit8 v8, v20, 0x6

    and-int/lit16 v8, v8, 0x380

    const v10, 0x36030

    or-int v18, v8, v10

    const/16 v19, 0x1c1

    const/4 v8, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v10, v21

    invoke-static/range {v8 .. v19}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_18
    const/4 v8, 0x0

    const v10, 0xdfb481

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    :goto_10
    and-int/lit8 v10, v20, 0xe

    invoke-static {v0, v13, v10}, Lz51/o;->o(Lz51/s;Landroidx/compose/runtime/Composer;I)Li91/a;

    move-result-object v11

    shl-int/lit8 v14, v20, 0x3

    and-int/lit16 v14, v14, 0x380

    or-int/lit16 v14, v14, 0x6030

    const/16 v19, 0x1e1

    move v15, v8

    const/4 v8, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    const/16 v16, 0x0

    move/from16 v31, v10

    move v10, v4

    move/from16 v4, v31

    invoke-static/range {v8 .. v19}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    shr-int/lit8 v8, v20, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v4, v8

    shr-int/lit8 v8, v20, 0x9

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v4, v8

    move-object v8, v5

    const/4 v5, 0x0

    move-object v9, v8

    move v8, v3

    move-object/from16 v3, v17

    invoke-static/range {v0 .. v5}, Lz51/o;->g(Lz51/s;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v3

    sget-object v0, Lb2/e;->y:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v3, v30

    invoke-virtual {v1, v3, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x70000

    and-int v1, v20, v1

    const/high16 v3, 0x20000

    if-ne v1, v3, :cond_19

    const/4 v15, 0x1

    goto :goto_11

    :cond_19
    move/from16 v15, v24

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v15, :cond_1a

    if-ne v1, v6, :cond_1b

    :cond_1a
    new-instance v1, Lyk2/i;

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v27, v1

    check-cast v27, Lc93/a;

    const/16 v28, 0x1c

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v7

    mul-float/2addr v1, v8

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "Help"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->q()I

    move-result v0

    invoke-static {v0, v13, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget v0, Lgy0/f;->G1:I

    invoke-static {v13, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v11

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v9, v0

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move/from16 v4, p3

    move-object v6, v2

    move/from16 v5, v21

    goto :goto_12

    :cond_1c
    invoke-virtual {v13}, Lp1/q;->X()V

    move v4, v6

    move v5, v9

    move-object v6, v12

    :goto_12
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1d

    new-instance v0, Lv41/u;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lv41/u;-><init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lz51/p;->HELP:Lz51/p;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lz51/s;Landroidx/compose/runtime/Composer;I)Li91/a;
    .locals 4

    sget-object p2, Lz51/o$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    const/4 v0, 0x6

    const/4 v1, 0x0

    if-eq p0, p2, :cond_4

    const/4 p2, 0x2

    if-eq p0, p2, :cond_3

    const/4 p2, 0x3

    if-eq p0, p2, :cond_2

    const/4 p2, 0x4

    if-eq p0, p2, :cond_1

    const/4 p2, 0x5

    if-ne p0, p2, :cond_0

    check-cast p1, Lp1/q;

    const p0, 0x17edc52e

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    sget-object p0, Li2/t;->b:Li2/s;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-wide v0, 0xff132c5fL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance p2, Li2/x;

    invoke-direct {p2, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-wide v1, 0xff66ddffL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance p2, Li2/x;

    invoke-direct {p2, v1, v2}, Li2/x;-><init>(J)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p0, p1}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object p0

    invoke-static {p0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_0
    const p0, 0x17ed9463

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    check-cast p1, Lp1/q;

    const p0, 0x17edba1f

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->Z()J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0

    :cond_2
    check-cast p1, Lp1/q;

    const p0, 0x17edae41

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->c0()J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0

    :cond_3
    check-cast p1, Lp1/q;

    const p0, 0x17eda27e

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->b0()J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0

    :cond_4
    check-cast p1, Lp1/q;

    const p0, 0x17ed9892

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->b1()J

    move-result-wide v2

    invoke-static {v2, v3}, Li91/c;->o(J)Li91/a;

    move-result-object p0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final p(Lz51/s;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 1

    sget-object p2, Lz51/o$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x5

    const/4 v0, 0x0

    if-ne p0, p2, :cond_0

    check-cast p1, Lp1/q;

    const p0, -0x30b19ea8

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget p0, Lgy0/f;->E1:I

    invoke-static {p1, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p0

    :cond_0
    check-cast p1, Lp1/q;

    const p0, -0x30b196a6

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget p0, Lgy0/f;->C1:I

    invoke-static {p1, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method
