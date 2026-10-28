.class public abstract Lqe0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aC\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a9\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0016H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Loe0/e;",
        "viewState",
        "Lkotlin/Function1;",
        "Lne0/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Lkd0/a$c;",
        "onAnalyticsEvent",
        "Loe0/c;",
        "onViewEvent",
        "G",
        "(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Loe0/e$c;",
        "t",
        "(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ln0/u;",
        "listState",
        "",
        "Loe0/b;",
        "sections",
        "A",
        "(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ll0/u;",
        "r",
        "(Ll0/u;Landroidx/compose/runtime/Composer;I)V",
        "",
        "viewEvent",
        "M",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V",
        "advanced-labs_release"
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
.method private static final A(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "Ljava/util/List<",
            "Loe0/b;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x49d07ad5

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v1, 0x2

    const/4 v5, 0x4

    move-object/from16 v6, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v4, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v7, v9, :cond_6

    move v7, v11

    goto :goto_4

    :cond_6
    move v7, v10

    :goto_4
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v14, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_a

    sget-object v7, Lb2/t;->w:Lb2/t;

    const-string v9, "test_history_list_tag"

    invoke-static {v7, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/4 v7, 0x6

    int-to-float v7, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v19, v7, v9

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v1, v1

    int-to-float v5, v5

    mul-float/2addr v1, v5

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v9, Lb2/e;->N:Lb2/k;

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit16 v12, v0, 0x380

    if-ne v12, v8, :cond_7

    move v10, v11

    :cond_7
    or-int/2addr v5, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_8

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v8, v5, :cond_9

    :cond_8
    new-instance v8, La81/h;

    const/4 v5, 0x4

    invoke-direct {v8, v2, v5, v3}, La81/h;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v13, v8

    check-cast v13, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const v5, 0x36006

    or-int v15, v0, v5

    const/16 v16, 0x1cc

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v1

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_a
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lnx1/g;

    const/16 v5, 0x17

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final B(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 7

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe0/b;

    invoke-virtual {v0}, Loe0/b;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Llz1/a;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lx1/b;

    const/4 v4, 0x1

    const v5, 0x64221274

    invoke-direct {v3, v2, v4, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v2, 0x2

    invoke-static {p2, v1, v3, v2}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {v0}, Loe0/b;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lqe0/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lqe0/b;-><init>(I)V

    sget-object v2, Lqe0/c$b;->w:Lqe0/c$b;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-instance v5, Lqe0/c$c;

    invoke-direct {v5, v1, v0}, Lqe0/c$c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v1, Lqe0/c$d;

    invoke-direct {v1, v2, v0}, Lqe0/c$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v2, Lqe0/c$e;

    invoke-direct {v2, v0, p1}, Lqe0/c$e;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lx1/b;

    const v6, 0x2fd4df92

    invoke-direct {v0, v2, v4, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v2, p2

    check-cast v2, Ln0/f;

    invoke-virtual {v2, v3, v5, v1, v0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Loe0/b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    and-int/2addr p3, v1

    move-object v7, p2

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Loe0/b;->c()Lhy0/e;

    move-result-object v3

    if-nez v3, :cond_1

    const p0, -0x66fdee06

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    const p0, -0x66fdee05

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    new-instance v5, Lno0/r0;

    const/16 p0, 0x19

    invoke-direct {v5, p0}, Lno0/r0;-><init>(I)V

    sget v8, Lhy0/e;->d:I

    const/16 v9, 0xa

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object p0, p2

    :goto_1
    if-nez p0, :cond_2

    const p0, -0x1c18aa6d

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x2

    int-to-float p0, p0

    const/4 p1, 0x4

    int-to-float p1, p1

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p1, p3, v7, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    return-object p2

    :cond_2
    const p0, -0x1c18b7bf

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    return-object p2

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final D(Lhy0/e;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x53d7ff4f

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x1

    int-to-float p2, p0

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p2, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, p0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final E(Lm91/u;)Ljava/lang/Object;
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llf0/d1;

    if-eqz v0, :cond_0

    check-cast p0, Llf0/d1;

    invoke-virtual {p0}, Llf0/d1;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lk11/f;

    if-eqz v0, :cond_1

    check-cast p0, Lk11/f;

    invoke-virtual {p0}, Lk11/f;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lqe0/c;->A(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loe0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x375bc736

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    const/16 v10, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    move v12, v10

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v0, v12

    :goto_5
    and-int/lit8 v12, p6, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v5, 0xc00

    if-nez v13, :cond_8

    move-object/from16 v13, p3

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v0, v14

    :goto_7
    and-int/lit16 v14, v0, 0x493

    const/16 v15, 0x492

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v14, v15, :cond_b

    move v14, v2

    goto :goto_8

    :cond_b
    move v14, v3

    :goto_8
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v9, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_1f

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_c

    new-instance v4, Lqe0/b;

    const/4 v7, 0x0

    invoke-direct {v4, v7}, Lqe0/b;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v4, v7

    :goto_9
    if-eqz v8, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_e

    new-instance v7, Lqe0/b;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lqe0/b;-><init>(I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v11, v7

    :cond_f
    if-eqz v12, :cond_11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_10

    new-instance v7, Lqe0/b;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Lqe0/b;-><init>(I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v22, v7

    goto :goto_a

    :cond_11
    move-object/from16 v22, v13

    :goto_a
    and-int/lit8 v7, v0, 0xe

    or-int/lit8 v8, v7, 0x30

    const-string v12, "advanced_labs_test_history"

    invoke-static {v1, v12, v9, v8}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    instance-of v8, v1, Loe0/e$b;

    if-eqz v8, :cond_15

    const v0, -0x214d0e7f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v0, v6, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_12

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    :cond_13
    invoke-static {v6, v9, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v19, v0, v8

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_c
    move-object v13, v0

    move-object v7, v4

    move-object/from16 v8, v22

    goto/16 :goto_11

    :cond_15
    instance-of v8, v1, Loe0/e$a;

    const/4 v12, 0x0

    if-eqz v8, :cond_19

    const v7, -0x21473681

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    new-instance v23, Lsz0/p0$b;

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lgy0/f;->P1:I

    const/4 v10, 0x2

    invoke-direct {v7, v8, v12, v10, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v27, 0x6

    const/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v24, v7

    invoke-direct/range {v23 .. v28}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v13, Luv0/c;->E:I

    invoke-direct {v8, v13, v12, v10, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v6, :cond_16

    goto :goto_d

    :cond_16
    move v2, v3

    :goto_d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_17

    if-ne v0, v14, :cond_18

    :cond_17
    new-instance v0, Lp62/h;

    const/16 v2, 0x1a

    invoke-direct {v0, v4, v2}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v10, v0

    check-cast v10, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x9

    or-int v19, v0, v2

    const/16 v20, 0x0

    const/16 v21, 0xfe4

    move-object/from16 v18, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object v0, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v6, v23

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_19
    move-object v13, v11

    instance-of v6, v1, Loe0/e$c;

    if-eqz v6, :cond_1e

    const v6, -0x2140dbda

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v0, 0x380

    if-ne v6, v10, :cond_1a

    move v6, v2

    :goto_e
    const/4 v8, 0x4

    goto :goto_f

    :cond_1a
    move v6, v3

    goto :goto_e

    :goto_f
    if-ne v7, v8, :cond_1b

    goto :goto_10

    :cond_1b
    move v2, v3

    :goto_10
    or-int/2addr v2, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_1c

    if-ne v6, v14, :cond_1d

    :cond_1c
    new-instance v6, Lqe0/c$f;

    invoke-direct {v6, v13, v1, v12}, Lqe0/c$f;-><init>(Lkotlin/jvm/functions/Function1;Loe0/e;Lq83/d;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Lc93/m;

    invoke-static {v9, v6, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v6, v1

    check-cast v6, Loe0/e$c;

    and-int/lit8 v2, v0, 0x7e

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v10, v2, v0

    const/4 v11, 0x0

    move-object v7, v4

    move-object/from16 v8, v22

    invoke-static/range {v6 .. v11}, Lqe0/c;->t(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_11
    move-object v4, v8

    move-object v3, v13

    :goto_12
    move-object v2, v7

    goto :goto_13

    :cond_1e
    const v0, 0x30795e46

    invoke-static {v0, v9, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v11

    move-object v4, v13

    goto :goto_12

    :goto_13
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lo72/a;

    const/16 v7, 0xe

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final H(Lne0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Loe0/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lne0/a$a;->a:Lne0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lqe0/c;->G(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final M(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "viewEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llf0/d1;

    if-eqz v0, :cond_0

    check-cast p0, Llf0/d1;

    invoke-virtual {p0}, Llf0/d1;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lne0/a$b;

    invoke-direct {v0, p0}, Lne0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    instance-of v0, p0, Lny0/h;

    if-eqz v0, :cond_1

    new-instance v0, Lne0/a$b;

    check-cast p0, Lny0/h;

    invoke-virtual {p0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, p0}, Lne0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    instance-of v0, p0, Lk11/e$b;

    if-eqz v0, :cond_2

    new-instance v0, Lne0/a$b;

    check-cast p0, Lk11/e$b;

    invoke-virtual {p0}, Lk11/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, p0}, Lne0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public static synthetic a(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqe0/c;->s(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Loe0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->J(Loe0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Loe0/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqe0/c;->x(Loe0/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lqe0/c;->L(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Loe0/e$c;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqe0/c;->y(Loe0/e$c;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqe0/c;->F(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lne0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->H(Lne0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqe0/c;->B(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqe0/c;->z(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Loe0/b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqe0/c;->C(Loe0/b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lne0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->u(Lne0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->I(Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Loe0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->v(Loe0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqe0/c;->K(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lm91/u;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lqe0/c;->E(Lm91/u;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lhy0/e;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lqe0/c;->D(Lhy0/e;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Ll0/u;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v2, 0x57a12b7c

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    const/4 v14, 0x1

    if-eq v5, v3, :cond_2

    move v3, v14

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/2addr v2, v14

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lb2/t;->w:Lb2/t;

    sget-object v3, Lb2/e;->H:Lb2/m;

    invoke-interface {v0, v2, v3}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v19, v2, v3

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v11, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v11, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lgy0/e;->d:I

    invoke-static {v2}, Lv41/r0$d;->b(I)I

    move-result v2

    invoke-static {v2}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v3

    const/4 v12, 0x0

    const/16 v13, 0x1fd

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v13}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lc41/u1;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lc41/u1;-><init>(Ll0/u;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final s(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqe0/c;->r(Ll0/u;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loe0/e$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x712cb6b7

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v15, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v15

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_21

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_9

    new-instance v3, Lqe0/b;

    const/4 v6, 0x4

    invoke-direct {v3, v6}, Lqe0/b;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v3, v6

    :goto_7
    if-eqz v7, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_b

    new-instance v6, Lqe0/b;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Lqe0/b;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v6, v8

    :goto_8
    const/4 v7, 0x3

    invoke-static {v15, v15, v11, v7}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v8

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    move/from16 p1, v7

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object/from16 v31, v3

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_d

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v11, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v2, v11, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v13, v7}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    move-object/from16 v20, v6

    const/4 v4, 0x0

    invoke-static {v15, v7, v11, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 v21, v7

    move-object v4, v8

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v22, v4

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-eqz v4, :cond_10

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v11, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v7, v11, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v11, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v32, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Loe0/e$c;->c()Lte0/a;

    move-result-object v6

    invoke-virtual {v6}, Lte0/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    sget-object v6, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v35

    invoke-virtual {v1}, Loe0/e$c;->c()Lte0/a;

    move-result-object v6

    invoke-virtual {v6}, Lte0/a;->b()Lgz0/m0;

    move-result-object v6

    if-eqz v6, :cond_13

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_b
    move-object/from16 v37, v6

    goto :goto_c

    :cond_13
    const/4 v6, 0x0

    goto :goto_b

    :goto_c
    const v49, 0xffea

    const/16 v50, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    invoke-direct/range {v32 .. v50}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v6, v0, 0x70

    const/16 v7, 0x20

    if-ne v6, v7, :cond_14

    const/4 v7, 0x1

    goto :goto_d

    :cond_14
    const/4 v7, 0x0

    :goto_d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_16

    if-ne v8, v9, :cond_15

    goto :goto_e

    :cond_15
    move-object/from16 v10, v31

    goto :goto_f

    :cond_16
    :goto_e
    new-instance v8, Lp62/h;

    const/16 v7, 0x1b

    move-object/from16 v10, v31

    invoke-direct {v8, v10, v7}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v8, Lc93/a;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    move-object/from16 p2, v4

    const/16 v4, 0x20

    if-ne v6, v4, :cond_17

    const/4 v4, 0x1

    goto :goto_10

    :cond_17
    const/4 v4, 0x0

    :goto_10
    or-int/2addr v4, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_18

    if-ne v6, v9, :cond_19

    :cond_18
    new-instance v6, Lox0/b;

    const/16 v4, 0x1c

    invoke-direct {v6, v4, v1, v10}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Lc93/a;

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v4, v4, 0x3

    const/4 v7, 0x6

    or-int/2addr v4, v7

    move-object/from16 v18, v13

    const/16 v13, 0x24

    move/from16 v23, v7

    const/4 v7, 0x0

    move-object/from16 v31, v10

    const/4 v10, 0x0

    move-object/from16 p1, v2

    move-object v1, v5

    move-object/from16 v52, v9

    move-object/from16 v2, v18

    move-object/from16 v51, v20

    move-object/from16 v33, v31

    move-object/from16 v5, p2

    move/from16 v31, v0

    move-object v9, v6

    move-object v0, v12

    move-object/from16 v6, v32

    move v12, v4

    move-object/from16 v4, v21

    move-object/from16 v32, v22

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x2

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v15, v4, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1a

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v11, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_1c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_13

    :cond_1b
    :goto_12
    move-object/from16 v0, p1

    goto :goto_14

    :cond_1c
    :goto_13
    invoke-static {v8, v11, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v11, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Loe0/e$c;->f()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->P()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v29, v8, 0x12

    const v30, 0x2fffa

    move v8, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x100

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move-wide/from16 v53, v3

    move v3, v8

    move-wide/from16 v7, v53

    move/from16 v4, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual/range {p0 .. p0}, Loe0/e$c;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    const/4 v0, 0x1

    int-to-float v1, v0

    mul-float v18, v1, v3

    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    double-to-float v1, v9

    mul-float v20, v1, v3

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v28, 0x30

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual/range {p0 .. p0}, Loe0/e$c;->d()Loe0/a;

    move-result-object v1

    invoke-virtual {v1}, Loe0/a;->b()Ljava/util/List;

    move-result-object v1

    shl-int/lit8 v2, v31, 0x3

    and-int/lit16 v2, v2, 0x380

    move-object/from16 v5, v32

    move-object/from16 v3, v33

    invoke-static {v5, v1, v3, v11, v2}, Lqe0/c;->A(Ln0/u;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Loe0/e$c;->d()Loe0/a;

    move-result-object v1

    invoke-virtual {v1}, Loe0/a;->a()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    move/from16 v6, v31

    and-int/lit16 v6, v6, 0x380

    if-ne v6, v4, :cond_1d

    move v15, v0

    goto :goto_15

    :cond_1d
    const/4 v15, 0x0

    :goto_15
    or-int/2addr v2, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1f

    move-object/from16 v2, v52

    if-ne v4, v2, :cond_1e

    goto :goto_16

    :cond_1e
    move-object/from16 v12, v51

    goto :goto_17

    :cond_1f
    :goto_16
    new-instance v4, Lq11/c;

    const/4 v2, 0x7

    move-object/from16 v12, v51

    invoke-direct {v4, v1, v12, v2}, Lq11/c;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x1

    const/4 v6, 0x0

    move-object/from16 v9, v27

    invoke-static/range {v5 .. v11}, Lgb1/q;->h(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Loe0/e$c;->g()Z

    move-result v2

    if-eqz v2, :cond_20

    const v2, -0x390e3137

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    const/4 v4, 0x6

    invoke-static {v2, v11, v4}, Lqe0/c;->r(Ll0/u;Landroidx/compose/runtime/Composer;I)V

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_20
    const/4 v4, 0x0

    const v2, -0x390d938d

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v2, v3

    move-object v3, v12

    goto :goto_19

    :cond_21
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v6

    move-object v3, v8

    :goto_19
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lqb0/a;

    const/4 v6, 0x4

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final u(Lne0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Loe0/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lne0/a$a;->a:Lne0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Loe0/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Loe0/e$c;->c()Lte0/a;

    move-result-object p0

    invoke-virtual {p0}, Lte0/a;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lne0/a$b;

    invoke-direct {v0, p0}, Lne0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Loe0/e$c;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Loe0/e$c;->d()Loe0/a;

    move-result-object p0

    invoke-virtual {p0}, Loe0/a;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p2, Loe0/c$b;

    invoke-direct {p2, p0}, Loe0/c$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqe0/c;->t(Loe0/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
