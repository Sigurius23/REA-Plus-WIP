.class public abstract Lep1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcp1/g;",
        "viewState",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "m",
        "(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "date",
        "",
        "monthIndex",
        "",
        "selectedDays",
        "Ljava/util/Locale;",
        "locale",
        "Lg51/c;",
        "A",
        "(Ljava/lang/String;ILjava/util/List;Lzr2/a;Ljava/util/Locale;)Lg51/c;",
        "selectedMonthIndex",
        "hormonal-insights_release"
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
.method private static final A(Ljava/lang/String;ILjava/util/List;Lzr2/a;Ljava/util/Locale;)Lg51/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lzr2/a;",
            "Ljava/util/Locale;",
            ")",
            "Lg51/c;"
        }
    .end annotation

    invoke-static {p0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object v3

    if-eqz p3, :cond_0

    invoke-interface {p3}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lorg/joda/time/LocalDate;->getYear()I

    move-result p3

    invoke-virtual {p0}, Lorg/joda/time/LocalDate;->getMonthOfYear()I

    move-result v0

    invoke-virtual {p0}, Lorg/joda/time/LocalDate;->getDayOfMonth()I

    move-result p0

    invoke-static {p3, v0, p0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v2, p0

    goto :goto_3

    :cond_2
    :goto_2
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p0

    goto :goto_1

    :goto_3
    sget-object v0, Lh91/b;->j:Lh91/b$a;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v9, 0xe0

    const/4 v10, 0x0

    sget-object v5, Lm83/z;->w:Lm83/z;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v2

    move-object v1, p4

    invoke-static/range {v0 .. v10}, Lh91/b$a;->b(Lh91/b$a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object p0

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p3, p4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_3
    new-instance p2, Leg/j;

    const/4 p4, 0x2

    invoke-direct {p2, p3, p4}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, p1, p2}, Lkb1/d;->a(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Ljava/util/Map;Lkb1/e;)Lqy0/a;
    .locals 1

    const-string v0, "dateArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lvo1/d;->R(Lkb1/e;Ljava/util/Map;)Lqy0/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/h;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lz1/p;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/h;->v(Lz1/p;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/LinkedHashMap;Lkb1/e;)Lqy0/a;
    .locals 0

    invoke-static {p0, p1}, Lep1/h;->B(Ljava/util/Map;Lkb1/e;)Lqy0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lg51/c;Lz1/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lep1/h;->u(Lg51/c;Lz1/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lcp1/g;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/h;->x(Lkotlin/jvm/functions/Function1;Lcp1/g;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/h;->n(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lep1/h;->z(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/h;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lcp1/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/h;->q(Lkotlin/jvm/functions/Function1;Lcp1/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lcp1/g;Lz1/p;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/h;->w(Lkotlin/jvm/functions/Function1;Lcp1/g;Lz1/p;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcp1/g;Lp1/a1;Lp1/a1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep1/h;->s(Lcp1/g;Lp1/a1;Lp1/a1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(ILp1/h1;Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep1/h;->t(ILp1/a1;Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/g;",
            "Lzr2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x75fdf5a5

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_7

    move v8, v11

    goto :goto_5

    :cond_7
    move v8, v10

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_3a

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_8

    new-instance v6, Lep1/a;

    const/4 v7, 0x7

    invoke-direct {v6, v7}, Lep1/a;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v6, v7

    :goto_6
    invoke-virtual {v4}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_a

    invoke-static {v10, v12}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v9

    :cond_a
    check-cast v9, Lp1/a1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v8, :cond_b

    invoke-virtual {v4}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Map;->size()I

    move-result v13

    sub-int/2addr v13, v11

    invoke-static {v13, v12}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v13

    :cond_b
    check-cast v13, Lp1/a1;

    invoke-virtual {v4}, Lcp1/g;->h()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v14, :cond_c

    if-ne v11, v8, :cond_e

    :cond_c
    invoke-virtual {v4}, Lcp1/g;->h()Ljava/util/List;

    move-result-object v11

    if-nez v11, :cond_d

    sget-object v11, Lm83/y;->w:Lm83/y;

    :cond_d
    check-cast v11, Ljava/util/Collection;

    new-array v14, v10, [Ljava/lang/String;

    invoke-interface {v11, v14}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Ljava/lang/String;

    array-length v14, v11

    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    new-instance v14, Lz1/p;

    invoke-direct {v14}, Lz1/p;-><init>()V

    invoke-static {v11}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    invoke-virtual {v14, v11}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v11, v14

    :cond_e
    check-cast v11, Lz1/p;

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v14, v3, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move-object/from16 v32, v2

    iget-wide v1, v12, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v18, v7

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_f

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v12, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    move-object/from16 v19, v7

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v20, v9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto :goto_8

    :cond_10
    move-object/from16 v20, v9

    :goto_8
    invoke-static {v1, v12, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcp1/g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v9, v7

    invoke-virtual {v4}, Lcp1/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v4}, Lcp1/g;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v4}, Lcp1/g;->g()Lcp1/c;

    move-result-object v21

    move-object/from16 v22, v14

    if-eqz v21, :cond_12

    goto :goto_9

    :cond_12
    const/4 v10, 0x0

    :goto_9
    and-int/lit16 v0, v0, 0x380

    const/16 v14, 0x100

    if-ne v0, v14, :cond_13

    const/4 v14, 0x1

    goto :goto_a

    :cond_13
    const/4 v14, 0x0

    :goto_a
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    or-int v14, v14, v23

    move-object/from16 v23, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v14, :cond_14

    if-ne v7, v8, :cond_15

    :cond_14
    new-instance v7, Ld30/l;

    const/16 v14, 0x12

    invoke-direct {v7, v14, v6, v4}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lc93/a;

    const/16 v14, 0x100

    if-ne v0, v14, :cond_16

    const/16 v16, 0x1

    goto :goto_b

    :cond_16
    const/16 v16, 0x0

    :goto_b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v16, :cond_18

    if-ne v14, v8, :cond_17

    goto :goto_c

    :cond_17
    move-object/from16 v16, v7

    goto :goto_d

    :cond_18
    :goto_c
    new-instance v14, Leo2/j;

    move-object/from16 v16, v7

    const/4 v7, 0x6

    invoke-direct {v14, v6, v7}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v14, Lc93/a;

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v25, v7, 0x3

    or-int v33, v7, v25

    shl-int/lit8 v34, v7, 0x9

    move-object/from16 v25, v13

    or-int v13, v33, v34

    move-object/from16 v26, v11

    move-object v11, v14

    const/4 v14, 0x4

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move/from16 p3, v0

    move-object/from16 v35, v3

    move-object/from16 v37, v6

    move/from16 v43, v7

    move-object v6, v9

    move-object v9, v10

    move-object/from16 v10, v16

    move/from16 v38, v18

    move-object/from16 v41, v19

    move-object/from16 v39, v20

    move-object/from16 v42, v22

    move-object/from16 v7, v23

    move-object/from16 p2, v25

    move-object/from16 v40, v26

    move-object/from16 v44, v27

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/16 v16, 0x100

    invoke-static/range {v6 .. v14}, Lep1/s;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x3

    int-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v8, v6, v7

    move-object/from16 v9, v32

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v3, v12, v0}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v11

    const/16 v13, 0xe

    invoke-static {v10, v11, v13}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v13, v11

    const-wide/16 v17, 0x0

    cmpl-double v13, v13, v17

    if-lez v13, :cond_19

    goto :goto_e

    :cond_19
    const-string v13, "invalid weight; must be greater than zero"

    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v17, v11, v14

    if-lez v17, :cond_1a

    goto :goto_f

    :cond_1a
    move v14, v11

    :goto_f
    invoke-direct {v13, v14, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v10, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Ll0/m;->d:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    invoke-static {v13, v14, v12, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move/from16 v36, v3

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_1b

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_10
    move-object/from16 v14, v41

    goto :goto_11

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_10

    :goto_11
    invoke-static {v12, v14, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v42

    invoke-static {v12, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :cond_1c
    invoke-static {v3, v12, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v12, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/g;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v3, v43

    invoke-static {v0, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v4, v12, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v4, v12, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->N()Lb91/a;

    move-result-object v26

    move/from16 v19, v7

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v11, Lw3/k;

    move/from16 v21, v10

    const/4 v10, 0x5

    invoke-direct {v11, v10}, Lw3/k;-><init>(I)V

    sget v22, Lb91/a;->d:I

    shl-int/lit8 v30, v22, 0x12

    const v31, 0x2fdf8

    move-object/from16 v23, v9

    move/from16 v22, v10

    move-wide/from16 v54, v17

    move/from16 v17, v8

    move-object/from16 v18, v11

    move-wide/from16 v8, v54

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v42, v13

    const/4 v13, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move-object/from16 v25, v15

    move/from16 v27, v16

    const-wide/16 v15, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v43, v19

    const/high16 v45, 0x3f800000    # 1.0f

    const-wide/16 v19, 0x0

    move/from16 v46, v21

    const/16 v21, 0x0

    move/from16 v47, v22

    const/16 v22, 0x0

    move-object/from16 v48, v23

    const/16 v23, 0x0

    move-object/from16 v49, v24

    const/16 v24, 0x0

    move-object/from16 v50, v25

    const/16 v25, 0x0

    move/from16 v51, v27

    const/16 v27, 0x0

    move/from16 v52, v29

    const/16 v29, 0x30

    move-object/from16 v45, v2

    move/from16 v53, v6

    move/from16 v2, v46

    move-object/from16 v5, v49

    move-object v6, v0

    move-object/from16 v46, v42

    move-object/from16 v0, v50

    move-object/from16 v42, v1

    move-object/from16 v1, v48

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    const/4 v6, 0x1

    int-to-float v7, v6

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v7, v6

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v4, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    move v2, v6

    move-object v6, v7

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v10, Lw3/k;

    const/4 v11, 0x5

    invoke-direct {v10, v11}, Lw3/k;-><init>(I)V

    move-object/from16 v18, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v28

    invoke-static {v2, v2, v1, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/16 v6, 0x28

    int-to-float v6, v6

    mul-float/2addr v6, v2

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_1e

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v12, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v46

    invoke-static {v12, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_1f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    :cond_1f
    move-object/from16 v0, v45

    goto :goto_14

    :cond_20
    :goto_13
    move-object/from16 v0, v42

    goto :goto_15

    :goto_14
    invoke-static {v8, v12, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0xc

    int-to-float v5, v0

    mul-float/2addr v5, v2

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {p2 .. p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcp1/p;

    if-eqz v5, :cond_22

    invoke-virtual {v5}, Lcp1/p;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_21

    goto :goto_17

    :cond_21
    :goto_16
    move-object v9, v5

    goto :goto_18

    :cond_22
    :goto_17
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_16

    :goto_18
    invoke-static/range {p2 .. p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v5

    if-lez v5, :cond_23

    const/4 v10, 0x1

    goto :goto_19

    :cond_23
    const/4 v10, 0x0

    :goto_19
    invoke-static/range {p2 .. p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v7

    const/16 v41, 0x1

    add-int/lit8 v7, v7, -0x1

    if-ge v5, v7, :cond_24

    move/from16 v11, v41

    goto :goto_1a

    :cond_24
    const/4 v11, 0x0

    :goto_1a
    invoke-virtual/range {p0 .. p0}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {p2 .. p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcp1/p;

    const-string v7, ""

    if-eqz v5, :cond_25

    invoke-virtual {v5}, Lcp1/p;->a()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_26

    :cond_25
    move-object v5, v7

    :cond_26
    invoke-virtual/range {p0 .. p0}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v8

    invoke-static/range {p2 .. p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v13

    const/16 v41, 0x1

    add-int/lit8 v13, v13, 0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcp1/p;

    if-eqz v8, :cond_28

    invoke-virtual {v8}, Lcp1/p;->a()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_27

    goto :goto_1c

    :cond_27
    move-object v13, v8

    :goto_1b
    move-object/from16 v23, v4

    move-object/from16 v4, p0

    goto :goto_1d

    :cond_28
    :goto_1c
    move-object v13, v7

    goto :goto_1b

    :goto_1d
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_2a

    move-object/from16 v7, v44

    if-ne v8, v7, :cond_29

    goto :goto_1e

    :cond_29
    move v15, v0

    move-object/from16 v0, p2

    move/from16 p2, v15

    move-object/from16 v15, v39

    goto :goto_1f

    :cond_2a
    move-object/from16 v7, v44

    :goto_1e
    new-instance v8, Lep1/g;

    const/4 v14, 0x0

    move v15, v0

    move-object/from16 v0, p2

    move/from16 p2, v15

    move-object/from16 v15, v39

    invoke-direct {v8, v4, v15, v0, v14}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    move-object/from16 v18, v8

    check-cast v18, Lkotlin/jvm/functions/Function1;

    or-int/lit8 v20, v34, 0x6

    const/16 v21, 0x0

    const/16 v22, 0xf06

    move-object/from16 v27, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    move-object/from16 v39, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v12

    move-object v12, v5

    move-object/from16 v5, v27

    invoke-static/range {v6 .. v22}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v19

    const/4 v6, 0x1

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v6

    invoke-static {v0}, Lep1/h;->o(Lp1/a1;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcp1/p;

    if-nez v6, :cond_2b

    const v0, -0x558d22e7

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    move-object/from16 v15, p1

    move-object/from16 v0, v40

    :goto_20
    const/4 v6, 0x1

    goto/16 :goto_23

    :cond_2b
    const/4 v8, 0x0

    const v7, -0x558d22e6

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v12, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/res/Configuration;

    invoke-virtual {v7}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v7

    invoke-virtual {v7, v8}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v7

    if-nez v7, :cond_2d

    const v7, -0x24597e12

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_2c

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v7, Ljava/util/Locale;

    :goto_21
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_2d
    const v9, -0x223474df

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    goto :goto_21

    :goto_22
    invoke-virtual {v6}, Lcp1/p;->a()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v9, v39

    check-cast v9, Lp1/h1;

    invoke-virtual {v9}, Lp1/h1;->x()I

    move-result v8

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object/from16 v15, p1

    move-object/from16 v10, v40

    invoke-static {v6, v8, v10, v15, v7}, Lep1/h;->A(Ljava/lang/String;ILjava/util/List;Lzr2/a;Ljava/util/Locale;)Lg51/c;

    move-result-object v6

    invoke-virtual {v9}, Lp1/h1;->x()I

    move-result v7

    move/from16 v8, v38

    sub-int v7, v8, v7

    const/16 v41, 0x1

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v12, v8}, Lp1/q;->e(I)Z

    move-result v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_2e

    if-ne v13, v5, :cond_2f

    :cond_2e
    new-instance v13, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/4 v11, 0x2

    invoke-direct {v13, v8, v9, v0, v11}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(ILjava/lang/Object;Lp1/a1;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    move-object v9, v13

    check-cast v9, Lkotlin/jvm/functions/Function1;

    new-instance v0, Ll;

    const/16 v11, 0x13

    invoke-direct {v0, v11, v6, v10}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x1d204817

    invoke-static {v6, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0x30006

    const/16 v14, 0x10

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move v0, v8

    move v8, v7

    move v7, v0

    move-object v6, v1

    move-object/from16 v0, v26

    invoke-static/range {v6 .. v14}, Lw81/c;->i(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_20

    :goto_23
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    mul-float v19, v6, v43

    const/16 v21, 0x0

    const/16 v22, 0x8

    move/from16 v20, v52

    move/from16 v18, v52

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4}, Lcp1/g;->g()Lcp1/c;

    move-result-object v6

    invoke-virtual {v4}, Lcp1/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lz1/p;->isEmpty()Z

    move-result v9

    const/16 v41, 0x1

    xor-int/lit8 v9, v9, 0x1

    move/from16 v14, p3

    const/16 v10, 0x100

    if-ne v14, v10, :cond_30

    const/4 v11, 0x1

    goto :goto_24

    :cond_30
    const/4 v11, 0x0

    :goto_24
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_32

    if-ne v13, v5, :cond_31

    goto :goto_25

    :cond_31
    move-object/from16 v15, v37

    goto :goto_26

    :cond_32
    :goto_25
    new-instance v13, Ld30/r;

    const/16 v11, 0x8

    move-object/from16 v15, v37

    invoke-direct {v13, v15, v4, v0, v11}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_26
    check-cast v13, Lc93/a;

    move/from16 v16, v10

    move-object v10, v13

    const/4 v13, 0x0

    move-object v11, v12

    move/from16 v0, v16

    move/from16 v12, v33

    invoke-static/range {v6 .. v13}, Lep1/e;->c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v11

    invoke-virtual {v4}, Lcp1/g;->g()Lcp1/c;

    move-result-object v6

    if-nez v6, :cond_36

    const v6, -0x67ec0b51

    move/from16 v7, v53

    invoke-static {v12, v6, v7, v2, v1}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v6, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    move-object/from16 v2, v35

    invoke-direct {v6, v2}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-virtual {v4}, Lcp1/g;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v10, Ly71/g;

    invoke-static/range {v23 .. v23}, Lih0/d0;->E(Lx81/d;)I

    move-result v2

    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-direct {v10, v2, v9, v7, v9}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v14, v0, :cond_33

    const/4 v2, 0x1

    goto :goto_27

    :cond_33
    const/4 v2, 0x0

    :goto_27
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_34

    if-ne v7, v5, :cond_35

    :cond_34
    new-instance v7, Lcom/whoop/profile/view/edit/n;

    const/16 v2, 0x12

    invoke-direct {v7, v2, v15, v4}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    move-object/from16 v18, v7

    check-cast v18, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v2, v3, 0x6

    sget v3, Ly71/g;->c:I

    shl-int/lit8 v3, v3, 0xc

    or-int v20, v2, v3

    const/16 v21, 0x0

    const/16 v22, 0xfea

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v2, v14

    const/4 v14, 0x0

    move-object/from16 v37, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v3, v2

    move-object/from16 v19, v28

    move-object/from16 v2, v37

    move/from16 v0, v52

    invoke-static/range {v6 .. v22}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v19

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_28
    const/4 v6, 0x1

    goto :goto_29

    :cond_36
    move v3, v14

    move-object v2, v15

    move/from16 v0, v52

    const/4 v8, 0x0

    const v6, -0x67e60fb9

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_28

    :goto_29
    invoke-static {v1, v0, v12, v6}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    const/16 v14, 0x100

    if-ne v3, v14, :cond_37

    const/4 v10, 0x1

    goto :goto_2a

    :cond_37
    const/4 v10, 0x0

    :goto_2a
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_38

    if-ne v0, v5, :cond_39

    :cond_38
    new-instance v0, Leo2/j;

    const/4 v1, 0x7

    invoke-direct {v0, v2, v1}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_39
    check-cast v0, Lc93/a;

    const/4 v6, 0x1

    const/4 v8, 0x0

    invoke-static {v0, v8, v12, v8, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v6, v2

    goto :goto_2b

    :cond_3a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v6, v7

    :goto_2b
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_3b

    new-instance v0, Le11/b;

    const/16 v3, 0x10

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_3b
    return-void
.end method

.method private static final n(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final p(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lcp1/g;)Ll83/a0;
    .locals 1

    new-instance v0, Lcp1/i$f;

    invoke-virtual {p1}, Lcp1/g;->i()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {v0, p1}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lcp1/g;Lp1/a1;Lp1/a1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcp1/p;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcp1/p;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Lp1/h1;->y(I)V

    invoke-static {p2}, Lep1/h;->o(Lp1/a1;)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-static {p2, p0}, Lep1/h;->p(Lp1/a1;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcp1/g;->c()Ljava/util/Map;

    move-result-object p0

    invoke-static {p2}, Lep1/h;->o(Lp1/a1;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcp1/p;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcp1/p;->a()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    if-gez p0, :cond_3

    const/4 p0, 0x0

    :cond_3
    invoke-virtual {p1, p0}, Lp1/h1;->y(I)V

    invoke-static {p2}, Lep1/h;->o(Lp1/a1;)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p2, p0}, Lep1/h;->p(Lp1/a1;I)V

    :cond_4
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(ILp1/a1;Lp1/a1;I)Ll83/a0;
    .locals 1

    sub-int p3, p0, p3

    add-int/lit8 v0, p3, -0x1

    check-cast p1, Lp1/h1;

    invoke-virtual {p1, v0}, Lp1/h1;->y(I)V

    sub-int/2addr p0, p3

    invoke-static {p2, p0}, Lep1/h;->p(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lg51/c;Lz1/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    and-int/2addr p4, v1

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_2

    :cond_1
    new-instance p3, Lep1/f;

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lep1/f;-><init>(Lz1/p;I)V

    invoke-virtual {v5, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget p1, Lg51/c;->e:I

    or-int/lit8 v6, p1, 0x30

    const/16 v7, 0x14

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lg51/b;->d(Lg51/c;FLjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lz1/p;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "argument"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkb1/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkb1/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    check-cast p1, Lkb1/e;

    invoke-virtual {p1}, Lkb1/e;->i()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object p1

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lcp1/g;Lz1/p;)Ll83/a0;
    .locals 11

    new-instance v0, Lcp1/i$d;

    invoke-virtual {p1}, Lcp1/g;->f()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    new-instance v1, Lzo1/b;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p2

    invoke-direct/range {v1 .. v10}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Lcp1/i$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lcp1/g;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcp1/i$f;

    invoke-virtual {p1}, Lcp1/g;->i()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {p2, p1}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lep1/h;->m(Lcp1/g;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
