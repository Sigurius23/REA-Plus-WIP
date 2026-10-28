.class public abstract Lwr0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0010\"\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0010\"\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0010\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lwr0/e0;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lwr0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lj81/i;",
        "gauge",
        "f",
        "(Lj81/i;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "a",
        "F",
        "MediumGaugeDiameter",
        "b",
        "MediumGaugeStrokeWidth",
        "c",
        "MediumGaugeHorizontalPadding",
        "d",
        "MediumGaugeVerticalPadding",
        "e",
        "GaugeToLabelSpacing",
        "LabelSpacing",
        "community-moments_release"
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

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x58

    int-to-float v0, v0

    sput v0, Lwr0/d0;->a:F

    const-wide v0, 0x401599999999999aL    # 5.4

    double-to-float v0, v0

    sput v0, Lwr0/d0;->b:F

    const-wide/high16 v0, 0x4023000000000000L    # 9.5

    double-to-float v0, v0

    sput v0, Lwr0/d0;->c:F

    const/4 v0, 0x3

    int-to-float v0, v0

    sput v0, Lwr0/d0;->d:F

    const/16 v0, 0xc

    int-to-float v0, v0

    sput v0, Lwr0/d0;->e:F

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Lwr0/d0;->f:F

    return-void
.end method

.method public static synthetic a(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lwr0/d0;->j(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwr0/d0;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj81/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwr0/d0;->g(Lj81/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwr0/e0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwr0/d0;->k(Lwr0/e0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lwr0/e0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwr0/d0;->l(Landroidx/compose/ui/Modifier;Lwr0/e0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lj81/i;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x4c992e5a    # 8.031099E7f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v5, v4, :cond_3

    move v4, v6

    goto :goto_3

    :cond_3
    move v4, v7

    :goto_3
    and-int/2addr v3, v6

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-virtual {v0}, Lj81/i;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v2, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lj81/i;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v2, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lj81/i;->e()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v2, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v2, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->z()Lb91/a;

    move-result-object v12

    invoke-virtual {v12}, Lb91/a;->d()Ll3/v0;

    move-result-object v13

    invoke-virtual {v10, v2, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->B()Lb91/a;

    move-result-object v10

    invoke-virtual {v10}, Lb91/a;->d()Ll3/v0;

    move-result-object v10

    iget-object v11, v13, Ll3/v0;->a:Ll3/m0;

    iget-wide v11, v11, Ll3/m0;->b:J

    invoke-interface {v3}, Ly3/c;->m0()F

    move-result v14

    invoke-static {v11, v12}, Lv63/c;->a(J)V

    const-wide v29, 0xff00000000L

    and-long v6, v11, v29

    invoke-static {v11, v12}, Ly3/o;->c(J)F

    move-result v11

    div-float/2addr v11, v14

    invoke-static {v11, v6, v7}, Lv63/c;->j(FJ)J

    move-result-wide v16

    const/16 v26, 0x0

    const v27, 0xfffffd

    const-wide/16 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v6

    iget-object v7, v10, Ll3/v0;->a:Ll3/m0;

    iget-wide v11, v7, Ll3/m0;->b:J

    invoke-interface {v3}, Ly3/c;->m0()F

    move-result v3

    invoke-static {v11, v12}, Lv63/c;->a(J)V

    and-long v13, v11, v29

    invoke-static {v11, v12}, Ly3/o;->c(J)F

    move-result v7

    div-float/2addr v7, v3

    invoke-static {v7, v13, v14}, Lv63/c;->j(FJ)J

    move-result-wide v17

    const/16 v27, 0x0

    const v28, 0xfffffd

    const-wide/16 v15, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    move-object v14, v10

    invoke-static/range {v14 .. v28}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v3

    const v7, -0x74f8b866

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v7

    const/4 v10, 0x0

    invoke-static {v6, v8, v9, v2, v10}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v11

    new-instance v12, Ll83/k;

    invoke-direct {v12, v4, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v12}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    move v4, v10

    :goto_4
    if-eqz v4, :cond_5

    const v4, -0x7e8afd85

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v8, v9, v2, v10}, Lb91/e;->f(Ll3/v0;JLandroidx/compose/runtime/Composer;I)Ll3/m0;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v4}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_5
    const v3, -0x7e89d4f6

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    :goto_5
    invoke-static {v7}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v3

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    iget-object v4, v6, Ll3/v0;->a:Ll3/m0;

    iget-wide v4, v4, Ll3/m0;->b:J

    invoke-static {v4, v5}, Lv63/c;->a(J)V

    and-long v6, v4, v29

    const v8, 0x3f4ccccd    # 0.8f

    invoke-static {v4, v5, v6, v7, v8}, Ld13/a;->d(JJF)J

    move-result-wide v15

    new-instance v14, Lw3/k;

    const/4 v4, 0x3

    invoke-direct {v14, v4}, Lw3/k;-><init>(I)V

    const/16 v26, 0xd80

    const v27, 0x3c9fe

    move-object/from16 v24, v2

    move-object v2, v3

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    goto :goto_6

    :cond_6
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lwr0/y;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lwr0/y;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final g(Lj81/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lwr0/d0;->f(Lj81/i;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lwr0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lwr0/e0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x3331939c

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_4

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move v6, v7

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    const/16 v8, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v10, v1, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v8

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v4, v11

    :goto_4
    and-int/lit16 v11, v4, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_8

    move v11, v14

    goto :goto_5

    :cond_8
    move v11, v13

    :goto_5
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v9, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1b

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v3, v11

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_a

    new-instance v6, Lwo1/e0;

    invoke-direct {v6, v7}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v12, v6

    goto :goto_6

    :cond_b
    move-object v12, v10

    :goto_6
    invoke-virtual {v5}, Lwr0/e0;->b()Lj81/i;

    move-result-object v6

    invoke-virtual {v6}, Lj81/i;->b()Lcom/whoop/navigation/e;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v15, 0x0

    if-eqz v6, :cond_f

    const v10, 0x764c21bd

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v8, :cond_c

    move v4, v14

    goto :goto_7

    :cond_c
    move v4, v13

    :goto_7
    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_d

    if-ne v8, v0, :cond_e

    :cond_d
    new-instance v8, Lck1/l;

    const/16 v0, 0xd

    invoke-direct {v8, v12, v6, v0}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc93/a;

    invoke-static {v11, v13, v15, v8, v7}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    const v0, 0x764d4dee

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object v0, v11

    :goto_8
    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget v6, Lwr0/d0;->e:F

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/16 v8, 0x36

    invoke-static {v6, v4, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move/from16 p0, v7

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-nez v15, :cond_11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    invoke-static {v6, v9, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lwr0/d0;->c:F

    sget v6, Lwr0/d0;->d:F

    invoke-static {v11, v0, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lwr0/e0;->b()Lj81/i;

    move-result-object v0

    invoke-virtual {v0}, Lj81/i;->k()Lj81/c;

    move-result-object v15

    sget v16, Lwr0/d0;->a:F

    sget v23, Lwr0/d0;->b:F

    const/16 v27, 0x77e

    const/16 v28, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v15 .. v28}, Lj81/c;->b(Lj81/c;FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;ILjava/lang/Object;)Lj81/c;

    move-result-object v0

    new-instance v11, Lwr0/q;

    invoke-direct {v11, v14, v5}, Lwr0/q;-><init>(ILm91/u;)V

    const v15, -0x31bde5b3

    invoke-static {v15, v9, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    sget v15, Lj81/c;->l:I

    shl-int/lit8 v15, v15, 0x3

    or-int/lit16 v15, v15, 0x186

    move-object/from16 v16, v8

    move-object v8, v11

    const/4 v11, 0x0

    move v14, v15

    move-object v15, v10

    move v10, v14

    move-object v14, v7

    move-object v7, v0

    move-object/from16 v0, v16

    invoke-static/range {v6 .. v11}, Lj81/b;->c(Landroidx/compose/ui/Modifier;Lj81/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v7, v6

    const-wide/16 v10, 0x0

    cmpl-double v7, v7, v10

    if-lez v7, :cond_13

    goto :goto_a

    :cond_13
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v6, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v6, Lwr0/d0;->f:F

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v6, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_14

    invoke-virtual {v9, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v9, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    invoke-static {v8, v9, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v9, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lwr0/e0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v0, v9, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v30, v10, 0x12

    const v31, 0x2fffa

    move-object/from16 v28, v9

    move-wide v8, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/16 v19, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move-object/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move/from16 v34, v29

    const/16 v29, 0x0

    move-object/from16 v33, v32

    move/from16 v1, v34

    const/16 v32, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    move/from16 v6, v30

    invoke-virtual {v5}, Lwr0/e0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    if-eqz v15, :cond_17

    invoke-static {v15}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_17

    goto :goto_c

    :cond_17
    move-object/from16 v15, v32

    :goto_c
    if-nez v15, :cond_18

    const v0, -0x7548ef24

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_18
    const v7, -0x7548ef23

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-static {v15, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v9, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    or-int/lit16 v0, v6, 0xc30

    const v31, 0x2d7fa

    move-object/from16 v28, v9

    move-wide v8, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move/from16 v30, v0

    move-object v6, v2

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v5}, Lwr0/e0;->a()Ljava/util/List;

    move-result-object v15

    if-eqz v15, :cond_19

    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_e

    :cond_19
    move-object/from16 v15, v32

    :goto_e
    if-nez v15, :cond_1a

    const v0, -0x75434986

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v0, 0x1

    goto :goto_10

    :cond_1a
    const v0, -0x75434985

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {v15, v0, v9, v1, v2}, Lc41/f1;->p(Ljava/util/List;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v6, v33

    :goto_11
    move-object v4, v3

    goto :goto_12

    :cond_1b
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v6, v10

    goto :goto_11

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lwr0/f;

    const/4 v3, 0x5

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lwr0/e0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lwr0/e0;->b()Lj81/i;

    move-result-object p0

    sget p2, Lj81/i;->t:I

    invoke-static {p0, p1, p2}, Lwr0/d0;->f(Lj81/i;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lwr0/e0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwr0/d0;->h(Landroidx/compose/ui/Modifier;Lwr0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
