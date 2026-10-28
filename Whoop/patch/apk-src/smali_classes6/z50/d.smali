.class public abstract Lz50/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a#\u0010\u0008\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lx50/c$c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lx50/a;",
        "Ll83/a0;",
        "onEvent",
        "r",
        "(Lx50/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "B",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lkd1/o;",
        "image",
        "o",
        "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "m",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "footerHeight",
        "access_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final A(Lx50/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lz50/d;->r(Lx50/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, 0x5fb5b17e

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v3, :cond_2

    move v3, v7

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v8, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v5, ""

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v12

    const v26, 0xfffa

    const/16 v27, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

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

    move-object v9, v3

    invoke-direct/range {v9 .. v27}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float v5, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v5, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v4, :cond_3

    move v6, v7

    :cond_3
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_5

    :cond_4
    new-instance v2, Lyk2/i;

    const/16 v4, 0xc

    invoke-direct {v2, v0, v4}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lc93/a;

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v4, v4, 0x3

    or-int/lit8 v9, v4, 0x6

    const/16 v10, 0x34

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v28, v5

    move-object v5, v2

    move-object/from16 v2, v28

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_6
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lcd0/a;

    const/16 v4, 0x15

    invoke-direct {v3, v0, v1, v4}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lx50/a$b;->a:Lx50/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lz50/d;->B(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lz50/d;->D(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz50/d;->C(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lx50/c$c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lz50/d;->v(Lx50/c$c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx50/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz50/d;->A(Lx50/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz50/d;->x(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz50/d;->n(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lx50/c$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lz50/d;->z(Lkotlin/jvm/functions/Function1;Lx50/c$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Lx50/c$c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz50/d;->w(Lp1/c1;Lx50/c$c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lz50/d;->p(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lx50/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz50/d;->s(Lx50/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ly3/c;Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lz50/d;->y(Ly3/c;Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lz50/d;->q(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x2429d17f

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, p3, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int v4, p3, v4

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p3, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_3
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_4

    :cond_4
    const/16 v5, 0x10

    :goto_4
    or-int/2addr v4, v5

    :cond_5
    move/from16 v29, v4

    and-int/lit8 v4, v29, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    if-eq v4, v5, :cond_6

    move v4, v6

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v7, v29, 0x1

    invoke-virtual {v3, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v9, v6

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v9, v10

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v9, v10, v3, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v10, v3, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v8, v4

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v30, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v9, v29, 0xe

    or-int v9, v30, v9

    invoke-static {v0, v3, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v3, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    invoke-virtual {v10, v3, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    new-instance v15, Lw3/k;

    const/4 v14, 0x5

    invoke-direct {v15, v14}, Lw3/k;-><init>(I)V

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v27, v16, 0x12

    const v28, 0x2fdf8

    move-object/from16 v16, v7

    move v5, v8

    const-wide/16 v7, 0x0

    move-object/from16 v25, v3

    move-object v3, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v5

    move/from16 v20, v6

    move-wide v5, v12

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v24, v16

    move-object/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move-object/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const/16 v26, 0x30

    move/from16 v0, v31

    move-object/from16 v2, v35

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shr-int/lit8 v0, v29, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int v0, v30, v0

    invoke-static {v1, v3, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v34

    move/from16 v5, v36

    invoke-virtual {v2, v3, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v5

    new-instance v15, Lw3/k;

    const/4 v2, 0x5

    invoke-direct {v15, v2}, Lw3/k;-><init>(I)V

    move-object v3, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v2, Lam0/c;

    const/16 v3, 0xe

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v1, v5, v3}, Lam0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final n(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lz50/d;->m(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkd1/o;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v6, p2

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v1, -0xe787f2

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v6, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v1, v6

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    and-int/lit8 v4, v1, 0x3

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eq v4, v2, :cond_3

    move v2, v7

    goto :goto_3

    :cond_3
    move v2, v5

    :goto_3
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v14, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {v0}, Lkd1/p;->f(Lkd1/o;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Ld41/d;

    const/16 v3, 0xf

    invoke-direct {v2, v0, v6, v3}, Ld41/d;-><init>(Lkd1/o;II)V

    :goto_4
    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_4
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v2, 0xc

    int-to-float v2, v2

    int-to-float v9, v3

    mul-float v17, v2, v9

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v19, v2, v9

    const/16 v20, 0x5

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_5

    invoke-virtual {v14, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v14, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lkd1/o;->a:I

    and-int/lit8 v1, v1, 0xe

    or-int v4, v2, v1

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v14

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/16 v2, 0x32

    int-to-float v2, v2

    mul-float/2addr v2, v9

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v15, 0x61b0

    const/16 v16, 0x68

    const/4 v8, 0x0

    const/4 v10, 0x0

    sget-object v11, Ly2/j;->c:Ly2/b1;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v21, v7

    move-object v7, v1

    move/from16 v1, v21

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Ld41/d;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v6, v3}, Ld41/d;-><init>(Lkd1/o;II)V

    goto/16 :goto_4

    :cond_9
    return-void
.end method

.method private static final p(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lz50/d;->o(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lz50/d;->o(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Lx50/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx50/c$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x24fc8dfe

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v13, 0x0

    if-eq v4, v5, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v13

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v6, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1a

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_7

    new-instance v2, Lyz1/g;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lyz1/g;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_9

    int-to-float v4, v13

    new-instance v5, Ly3/f;

    invoke-direct {v5, v4}, Ly3/f;-><init>(F)V

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lp1/c1;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v12, v6, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v6, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v6, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-nez v14, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v11, v6, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v6, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v5, v0, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v2, v6, v5}, Lz50/d;->B(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v2

    move-object/from16 p1, v3

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v2, v5

    const-wide/16 v17, 0x0

    cmpl-double v2, v2, v17

    if-lez v2, :cond_d

    const/4 v2, 0x1

    goto :goto_8

    :cond_d
    const/4 v2, 0x0

    :goto_8
    if-nez v2, :cond_e

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_e
    const/4 v2, 0x1

    invoke-static {v5, v5, v2}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x0

    const/4 v5, 0x0

    invoke-static {v3, v14, v2, v5}, Lgb1/c;->f(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v2, Lvq2/d;

    const/4 v5, 0x7

    invoke-direct {v2, v1, v5}, Lvq2/d;-><init>(Ljava/lang/Object;I)V

    const v5, 0x2be2a213

    invoke-static {v5, v6, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    new-instance v5, Lvv2/d;

    const/16 v14, 0x12

    invoke-direct {v5, v14, v4, v1}, Lvv2/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v14, -0x3934a12c

    invoke-static {v14, v6, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    move-object v14, v8

    const/16 v8, 0x36

    move-object/from16 v18, v9

    const/16 v9, 0x18

    move-object/from16 v19, v4

    move-object v4, v3

    move-object v3, v5

    const/4 v5, 0x0

    move-object/from16 v20, v7

    move-object v7, v6

    const/4 v6, 0x0

    move/from16 v17, v0

    move-object/from16 v1, v18

    move-object/from16 v0, p1

    move-object/from16 p1, v11

    move-object/from16 v18, v14

    move-object/from16 v14, v19

    const/high16 v11, 0x3f800000    # 1.0f

    move-object/from16 v19, v12

    move-object/from16 v12, v20

    invoke-static/range {v2 .. v9}, Ll81/d;->g(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/lang/Double;Ljava/lang/Double;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_f

    if-ne v4, v15, :cond_10

    :cond_f
    new-instance v4, Lb30/s2;

    const/16 v3, 0xb

    invoke-direct {v4, v0, v14, v3}, Lb30/s2;-><init>(Ly3/c;Lp1/c1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v4}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/4 v0, 0x4

    int-to-float v2, v0

    const/16 v0, 0x8

    int-to-float v3, v0

    mul-float v22, v2, v3

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float v21, v2, v3

    const/16 v24, 0x0

    const/16 v25, 0x8

    move/from16 v23, v21

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_11

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v7, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    move-object/from16 v1, v19

    goto :goto_b

    :cond_13
    :goto_a
    move-object/from16 v1, p1

    goto :goto_c

    :goto_b
    invoke-static {v5, v7, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v7, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v2, Lny0/a0;

    invoke-virtual/range {p0 .. p0}, Lx50/c$c;->b()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v30, 0x3fe

    const/16 v31, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v19 .. v31}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v1, v17, 0x70

    const/16 v5, 0x20

    if-ne v1, v5, :cond_14

    const/4 v1, 0x1

    goto :goto_d

    :cond_14
    move v1, v4

    :goto_d
    and-int/lit8 v5, v17, 0xe

    const/4 v6, 0x4

    if-eq v5, v6, :cond_17

    and-int/lit8 v0, v17, 0x8

    if-eqz v0, :cond_15

    move-object/from16 v0, p0

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16

    goto :goto_e

    :cond_15
    move-object/from16 v0, p0

    :cond_16
    move v13, v4

    goto :goto_f

    :cond_17
    move-object/from16 v0, p0

    :goto_e
    const/4 v13, 0x1

    :goto_f
    or-int/2addr v1, v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_19

    if-ne v4, v15, :cond_18

    goto :goto_10

    :cond_18
    move-object/from16 v14, v18

    goto :goto_11

    :cond_19
    :goto_10
    new-instance v4, Lyo1/b;

    const/16 v1, 0xc

    move-object/from16 v14, v18

    invoke-direct {v4, v1, v14, v0}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    move-object v5, v4

    check-cast v5, Lc93/a;

    sget v1, Lny0/a0;->k:I

    or-int/lit8 v1, v1, 0x30

    const/4 v8, 0x4

    const/4 v4, 0x0

    move-object v6, v7

    move v7, v1

    invoke-static/range {v2 .. v8}, Lny0/z;->h(Lny0/a0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v6

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object v3, v14

    goto :goto_12

    :cond_1a
    move-object v0, v1

    move-object v7, v6

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lwq1/b;

    const/16 v5, 0x17

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final s(Lx50/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final u(Lp1/c1;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    new-instance v0, Ly3/f;

    invoke-direct {v0, p1}, Ly3/f;-><init>(F)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final v(Lx50/c$c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "$this$SplitColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lx50/c$c;->d()Lkd1/o;

    move-result-object p0

    sget p1, Lkd1/o;->a:I

    invoke-static {p0, p2, p1}, Lz50/d;->o(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp1/c1;Lx50/c$c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    const-string v0, "$this$SplitColumn"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v3, 0x2

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v9, v3, v4

    invoke-static {p0}, Lz50/d;->t(Lp1/c1;)F

    move-result v12

    const/4 v13, 0x2

    const/4 v10, 0x0

    move v11, v9

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx50/c$c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-virtual {p1}, Lx50/c$c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v4, 0x3

    or-int/2addr v4, v5

    invoke-static {p0, v3, v7, v4}, Lz50/d;->m(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    new-instance v3, Ls11/a;

    invoke-direct {v3}, Ls11/a;-><init>()V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {p1}, Lx50/c$c;->c()Lcom/whoop/design/models/items/FeatureListModel;

    move-result-object p0

    invoke-static {p0}, Llb1/u2;->v(Lcom/whoop/design/models/items/FeatureListModel;)Lm91/u;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.card.upsell.FeatureListState"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Ll01/d;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_4

    new-instance p0, Lyz1/g;

    const/16 p1, 0xc

    invoke-direct {p0, p1}, Lyz1/g;-><init>(I)V

    invoke-virtual {v7, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, p0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget p0, Ls11/a;->a:I

    shl-int/lit8 p0, p0, 0x9

    or-int/lit16 v8, p0, 0x186

    invoke-virtual/range {v3 .. v8}, Ls11/a;->b(Landroidx/compose/ui/Modifier;Ll01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ly3/c;Lp1/c1;Ly3/l;)Ll83/a0;
    .locals 4

    iget-wide v0, p2, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p2, v0

    invoke-interface {p0, p2}, Ly3/c;->e0(I)F

    move-result p0

    invoke-static {p1, p0}, Lz50/d;->u(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lx50/c$c;)Ll83/a0;
    .locals 1

    new-instance v0, Lx50/a$a;

    invoke-virtual {p1}, Lx50/c$c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lx50/a$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
