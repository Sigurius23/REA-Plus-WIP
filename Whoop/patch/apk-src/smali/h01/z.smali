.class public abstract Lh01/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001a\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lh01/a0;",
        "viewState",
        "",
        "isExpandedView",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "a",
        "Ljava/util/List;",
        "getVowStates",
        "()Ljava/util/List;",
        "vowStates",
        "hasOverflow",
        "isExpanded",
        "Ly3/f;",
        "maxHeight",
        "",
        "titleMaxLines",
        "bodyMaxLinesWhenExpanded",
        "bodyMaxLines",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh01/a0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 30

    const-string v0, "Optimal Health"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v15, "Take advantage of your green Recovery by meeting your Strain target of 15.5. Your body is signaling it can take on significant exertion today."

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v1, Lh01/a0;

    const/16 v13, 0x778

    const/4 v14, 0x0

    const-string v2, "1"

    const-string v4, "VOW_PRIMARY"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lh01/a0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v26, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    new-instance v16, Lh01/a0;

    const/16 v28, 0x578

    const/16 v29, 0x0

    const-string v17, "2"

    const-string v19, "VOW_SECONDARY"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v16 .. v29}, Lh01/a0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    filled-new-array {v1, v0}, [Lh01/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lh01/z;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh01/z;->p(Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh01/a0;Lp1/t2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lh01/z;->o(Lh01/a0;Lp1/t2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lh01/z;->z(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lp1/c1;)Ly3/f;
    .locals 0

    invoke-static {p0}, Lh01/z;->x(Lp1/c1;)Ly3/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lh01/a0;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh01/z;->r(Lkotlin/jvm/functions/Function1;Lh01/a0;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lh01/z;->s(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lh01/z;->q(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh01/z;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lh01/a0;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v10, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x4c23243e

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v10, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v10

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_5

    move/from16 v6, p2

    invoke-virtual {v11, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :goto_4
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v8, p3

    :goto_5
    move v12, v4

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v4, v9

    goto :goto_5

    :goto_7
    and-int/lit16 v4, v12, 0x493

    const/16 v9, 0x492

    const/4 v13, 0x0

    if-eq v4, v9, :cond_b

    const/4 v4, 0x1

    goto :goto_8

    :cond_b
    move v4, v13

    :goto_8
    and-int/lit8 v9, v12, 0x1

    invoke-virtual {v11, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_18

    if-eqz v0, :cond_c

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v15, v0

    goto :goto_9

    :cond_c
    move-object v15, v3

    :goto_9
    if-eqz v5, :cond_d

    move v0, v13

    goto :goto_a

    :cond_d
    move v0, v6

    :goto_a
    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_e

    new-instance v4, Lh01/u;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lh01/u;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_f
    move-object v4, v8

    :goto_b
    invoke-virtual {v1}, Lh01/a0;->c()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_11

    const v5, -0x2d72901e

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lh01/a0;->e()Lh01/a;

    move-result-object v5

    invoke-virtual {v5}, Lh01/a;->getBorderInformation()Ld11/a;

    move-result-object v5

    if-nez v5, :cond_10

    const v5, -0x2d72901f

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    :goto_c
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_10
    const v6, 0x30151420

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x30

    invoke-static {v5, v6, v11, v7}, Ld11/f;->y(Ld11/a;FLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v6

    goto :goto_c

    :goto_d
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v16, v6

    goto :goto_e

    :cond_11
    const v5, -0x2d7207c5

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    goto :goto_d

    :goto_e
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_12

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v6, v5

    check-cast v6, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_13

    invoke-static {v0, v11}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v5

    :cond_13
    move-object v9, v5

    check-cast v9, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_14

    new-instance v5, Lh01/i;

    const/4 v7, 0x2

    invoke-direct {v5, v7, v9}, Lh01/i;-><init>(ILp1/c1;)V

    invoke-static {v5}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v5

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v5, Lp1/t2;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_15

    new-instance v7, Lh01/i;

    const/4 v8, 0x3

    invoke-direct {v7, v8, v9}, Lh01/i;-><init>(ILp1/c1;)V

    invoke-static {v7}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v7

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lp1/t2;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_16

    const/16 v3, 0x64

    invoke-static {v3, v11}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v8

    :cond_16
    check-cast v8, Lp1/c1;

    invoke-static {v9}, Lh01/z;->v(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-static {v8}, Lh01/z;->l(Lp1/c1;)I

    move-result v3

    goto :goto_f

    :cond_17
    const/4 v3, 0x5

    :goto_f
    invoke-static {v3, v11}, Ld0/g;->c(ILp1/q;)Lp1/t2;

    move-result-object v3

    invoke-virtual {v1}, Lh01/a0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {v14, v11, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    sget-object v14, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v14, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->V0()J

    move-result-wide v18

    const/4 v2, 0x3

    int-to-float v2, v2

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v2, v14

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v17

    const/4 v2, 0x1

    int-to-float v2, v2

    mul-float/2addr v14, v2

    move v2, v0

    new-instance v0, Lh01/l;

    move/from16 v23, v2

    move-object v2, v5

    move-object v5, v7

    move-object v7, v3

    move-object v3, v4

    move-object v4, v13

    invoke-direct/range {v0 .. v9}, Lh01/l;-><init>(Lh01/a0;Lp1/t2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;)V

    const v1, -0x49721cae

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    and-int/lit8 v1, v12, 0xe

    const/high16 v2, 0xd80000

    or-int v21, v1, v2

    const/16 v22, 0x22

    const/4 v12, 0x0

    move-object/from16 v20, v11

    move-object v11, v15

    move-object/from16 v15, v17

    const/16 v17, 0x0

    move-wide/from16 v24, v18

    move/from16 v18, v14

    move-wide/from16 v13, v24

    move-object/from16 v19, v0

    invoke-static/range {v11 .. v22}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v3

    move-object v4, v11

    move/from16 v7, v23

    goto :goto_10

    :cond_18
    move-object/from16 v20, v11

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    move-object v4, v3

    move v7, v6

    move-object v6, v8

    :goto_10
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lf61/e;

    const/4 v3, 0x3

    move-object/from16 v5, p1

    move/from16 v2, p6

    move v1, v10

    invoke-direct/range {v0 .. v7}, Lf61/e;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/t2;)I
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

.method private static final l(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final m(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lp1/t2;)I
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

.method private static final o(Lh01/a0;Lp1/t2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/t2;Lp1/c1;Lp1/t2;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 39

    move-object/from16 v0, p5

    and-int/lit8 v1, p10, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v5, p10, 0x1

    move-object/from16 v9, p9

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual/range {p0 .. p0}, Lh01/a0;->e()Lh01/a;

    move-result-object v1

    invoke-virtual {v1}, Lh01/a;->getStyleModifier()Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-static {v1, v5, v6}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v5, 0x1e

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v12, v6

    mul-float/2addr v5, v12

    invoke-static/range {p1 .. p1}, Lh01/z;->y(Lp1/t2;)F

    move-result v6

    invoke-static {v1, v5, v6}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v7, v9, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v9, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lh01/a0;->b()Ll0/k1;

    move-result-object v14

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lb2/e;->z:Lb2/m;

    sget-object v15, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v15, v13, v14}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v14, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v14, v4

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    sget-object v2, Lb2/e;->K:Lb2/l;

    const/16 v3, 0x36

    invoke-static {v14, v2, v9, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move/from16 v17, v4

    iget-wide v3, v9, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v9, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3, v9, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v9, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v4, v3

    const-wide/16 v13, 0x0

    cmpl-double v4, v4, v13

    if-lez v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v13

    mul-float v3, v3, v17

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v3, v5, v9, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_8

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v9, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v5, v9, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v9, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->g:Ll0/h;

    const/16 v5, 0x36

    invoke-static {v4, v2, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v9, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    invoke-static {v4, v9, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v9, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lh01/a0;->g()Lkd1/o;

    move-result-object v6

    if-nez v6, :cond_e

    const v2, 0xe137786

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move v5, v12

    move-object v4, v15

    const/4 v3, 0x6

    goto :goto_6

    :cond_e
    const v2, 0xe137787

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v2, v12

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    const/16 v14, 0x1b0

    move-object v4, v15

    const/16 v15, 0x78

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v5, v12

    const/4 v12, 0x0

    move-object v8, v3

    move-object/from16 v13, v28

    const/4 v3, 0x6

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v9, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_6
    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-static/range {p4 .. p4}, Lh01/z;->k(Lp1/t2;)I

    move-result v23

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v8, v10, :cond_f

    new-instance v8, Lh01/m;

    const/4 v11, 0x2

    invoke-direct {v8, v11, v0}, Lh01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v25, v8

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const v30, 0x30030

    const v31, 0x257fa

    move-object/from16 v28, v9

    move-wide v8, v6

    const/4 v7, 0x0

    move-object v6, v10

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

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v32, v6

    move-object/from16 v6, p3

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual/range {p0 .. p0}, Lh01/a0;->a()Lgz0/m0;

    move-result-object v6

    if-nez v6, :cond_10

    const v1, 0xe21b5e6

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v5, 0x1

    goto :goto_8

    :cond_10
    const v7, 0xe21b5e7

    invoke-static {v9, v7, v6, v9, v3}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v6

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    mul-float v12, v5, v5

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    move-object/from16 v28, v9

    move-wide v9, v7

    const/4 v7, 0x0

    move-object v8, v1

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lh01/a0;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v2, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-static/range {p6 .. p6}, Lh01/z;->n(Lp1/t2;)I

    move-result v23

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v32

    if-ne v1, v2, :cond_11

    new-instance v1, Lh01/n;

    const/4 v3, 0x1

    move-object/from16 v5, p7

    invoke-direct {v1, v3, v0, v5}, Lh01/n;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v25, v1

    check-cast v25, Lkotlin/jvm/functions/Function1;

    const v30, 0x30030

    const v31, 0x257fa

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

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-static {v0}, Lh01/z;->t(Lp1/c1;)Z

    move-result v0

    if-nez v0, :cond_13

    invoke-static/range {p8 .. p8}, Lh01/z;->v(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_9

    :cond_12
    const/4 v1, 0x0

    goto :goto_b

    :cond_13
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lh01/a0;->h()Z

    move-result v0

    if-eqz v0, :cond_12

    const v0, 0x7d4d72d5

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-static/range {p8 .. p8}, Lh01/z;->v(Lp1/c1;)Z

    move-result v0

    move-object/from16 v1, p2

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v5, p0

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    move-object/from16 v6, p3

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_14

    if-ne v7, v2, :cond_15

    :cond_14
    new-instance v33, Ld0/m0;

    const/16 v38, 0x2

    move-object/from16 v37, p8

    move-object/from16 v34, v1

    move-object/from16 v35, v5

    move-object/from16 v36, v6

    invoke-direct/range {v33 .. v38}, Ld0/m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v7, v33

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lc93/a;

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v5, 0x0

    move/from16 p2, v0

    move/from16 p6, v1

    move/from16 p7, v2

    move-object/from16 p1, v3

    move-object/from16 p0, v4

    move/from16 p3, v5

    move-object/from16 p4, v7

    move-object/from16 p5, v9

    invoke-static/range {p0 .. p7}, Lh01/x;->e(Ll0/u;Landroidx/compose/ui/Modifier;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_a
    const/4 v5, 0x1

    goto :goto_c

    :goto_b
    const v0, 0x7d53db4a

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_c
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_16
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll3/r0;->e()Z

    move-result p1

    invoke-static {p0, p1}, Lh01/z;->u(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll3/r0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lh01/z;->u(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    iget-object p0, p2, Ll3/r0;->b:Ll3/w;

    iget p0, p0, Ll3/w;->f:I

    invoke-static {p1, p0}, Lh01/z;->m(Lp1/c1;I)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lh01/a0;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p3}, Lh01/z;->v(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p3, v0}, Lh01/z;->w(Lp1/c1;Z)V

    new-instance p3, Lh01/r;

    invoke-virtual {p1}, Lh01/a0;->getAppNotificationType()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {p3, p1, p2}, Lh01/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lh01/z;->i(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final u(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final v(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final w(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final x(Lp1/c1;)Ly3/f;
    .locals 1

    invoke-static {p0}, Lh01/z;->v(Lp1/c1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/high16 p0, 0x7fc00000    # Float.NaN

    goto :goto_0

    :cond_0
    sget-object p0, Lh01/c;->a:Lh01/c;

    invoke-virtual {p0}, Lh01/c;->b()F

    move-result p0

    :goto_0
    new-instance v0, Ly3/f;

    invoke-direct {v0, p0}, Ly3/f;-><init>(F)V

    return-object v0
.end method

.method private static final y(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final z(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lh01/z;->v(Lp1/c1;)Z

    move-result p0

    if-eqz p0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0
.end method
