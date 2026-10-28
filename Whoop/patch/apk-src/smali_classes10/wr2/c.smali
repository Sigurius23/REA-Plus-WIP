.class public abstract Lwr2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\n\u001aK\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\t\u0010\n\u001aE\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0006*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a#\u0010\u0014\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lwr2/d;",
        "T",
        "",
        "",
        "searchQuery",
        "Lkotlin/Function2;",
        "",
        "maxEditDistance",
        "",
        "n",
        "(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;)Ljava/util/List;",
        "Lwr2/a;",
        "A",
        "(Lwr2/d;Ljava/lang/String;Lc93/m;)Lwr2/a;",
        "l",
        "(I)I",
        "",
        "z",
        "(Z)Z",
        "target",
        "m",
        "(Ljava/lang/String;Ljava/lang/String;I)Z",
        "s1",
        "s2",
        "k",
        "(Ljava/lang/String;Ljava/lang/String;)I",
        "feature_release"
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
.method private static final A(Lwr2/d;Ljava/lang/String;Lc93/m;)Lwr2/a;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lwr2/d;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Lwr2/a<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v0, p2

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, Lwr2/d;->a()Lyb3/p;

    move-result-object v3

    invoke-virtual {v3, v1}, Lyb3/p;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Lwr2/c$b;

    invoke-direct {v1}, Lwr2/c$b;-><init>()V

    invoke-static {v3, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Lwr2/d;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v6, v4

    move v9, v6

    move v11, v9

    move v13, v11

    move v15, v13

    move/from16 v16, v15

    move/from16 v17, v16

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v10, v6, 0x1

    if-ltz v6, :cond_f

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    const/16 p1, 0x0

    move-object v8, v14

    check-cast v8, Ljava/lang/String;

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_3

    :cond_4
    const/16 p1, 0x0

    move-object/from16 v14, p1

    :goto_3
    check-cast v14, Ljava/lang/String;

    if-eqz v14, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-nez v6, :cond_5

    const/4 v15, 0x1

    :cond_5
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v8, v14

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v8, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/Number;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v8, v7, v5}, Lwr2/c;->m(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    const/16 v5, 0xa

    goto :goto_4

    :cond_8
    move-object/from16 v14, p1

    :goto_5
    check-cast v14, Ljava/lang/String;

    if-eqz v14, :cond_a

    add-int/lit8 v11, v11, 0x1

    if-nez v6, :cond_9

    const/16 v16, 0x1

    :cond_9
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/lang/String;

    invoke-static {v7, v12, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_b

    goto :goto_6

    :cond_c
    move-object/from16 v8, p1

    :goto_6
    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_e

    add-int/lit8 v13, v13, 0x1

    if-nez v6, :cond_d

    const/4 v15, 0x1

    :cond_d
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_e
    add-int/lit8 v17, v17, 0x1

    :goto_7
    move v6, v10

    const/16 v5, 0xa

    goto/16 :goto_2

    :cond_f
    const/16 p1, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw p1

    :cond_10
    const/16 p1, 0x0

    invoke-interface/range {p0 .. p0}, Lwr2/d;->c()Ljava/lang/Iterable;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    invoke-interface/range {p0 .. p0}, Lwr2/d;->b()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v3, v5}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_11
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v10, v4

    move v12, v10

    move v14, v12

    :cond_12
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_a

    :cond_14
    move-object/from16 v6, p1

    :goto_a
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_15

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v7, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-static {v7, v3, v8}, Lwr2/c;->m(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_16

    goto :goto_b

    :cond_17
    move-object/from16 v6, p1

    :goto_b
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_18

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {v3, v7, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_19

    goto :goto_c

    :cond_1a
    move-object/from16 v6, p1

    :goto_c
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_12

    add-int/lit8 v14, v14, 0x1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_1b
    new-instance v7, Lwr2/a;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v18

    move-object/from16 v8, p0

    invoke-direct/range {v7 .. v18}, Lwr2/a;-><init>(Lwr2/d;IIIIIIZZII)V

    return-object v7
.end method

.method public static synthetic a(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->w(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->y(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->x(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->v(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->t(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->q(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->s(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->p(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->u(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwr2/a;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lwr2/c;->r(Lwr2/a;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "s1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 p1, 0x2

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-gt p1, p0, :cond_1

    const/4 v0, 0x6

    if-ge p0, v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return p1
.end method

.method private static final l(I)I
    .locals 0

    mul-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static final m(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "target"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    const/4 v4, 0x0

    if-le v3, v2, :cond_0

    return v4

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x1

    add-int/2addr v3, v5

    new-array v6, v3, [I

    move v7, v4

    :goto_0
    if-ge v7, v3, :cond_1

    aput v7, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v5

    new-array v7, v3, [I

    move v8, v4

    :goto_1
    if-ge v8, v3, :cond_2

    aput v4, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    move v3, v4

    move v8, v3

    :goto_2
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v3, v9, :cond_7

    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    add-int/2addr v8, v5

    aput v8, v7, v4

    move v10, v4

    move v11, v10

    :goto_3
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-ge v10, v12, :cond_4

    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    add-int/lit8 v13, v11, 0x1

    aget v14, v6, v13

    add-int/2addr v14, v5

    aget v15, v7, v11

    add-int/2addr v15, v5

    if-eq v9, v12, :cond_3

    aget v11, v6, v11

    add-int/2addr v11, v5

    goto :goto_4

    :cond_3
    aget v11, v6, v11

    :goto_4
    invoke-static {v15, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v14, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    aput v11, v7, v13

    add-int/lit8 v10, v10, 0x1

    move v11, v13

    goto :goto_3

    :cond_4
    array-length v9, v7

    move v10, v4

    :goto_5
    if-ge v10, v9, :cond_6

    aget v11, v7, v10

    if-le v11, v2, :cond_5

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_5
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v16, v7

    move-object v7, v6

    move-object/from16 v6, v16

    goto :goto_2

    :cond_6
    return v4

    :cond_7
    array-length v0, v6

    if-eqz v0, :cond_9

    array-length v0, v6

    sub-int/2addr v0, v5

    aget v0, v6, v0

    if-gt v0, v2, :cond_8

    return v5

    :cond_8
    return v4

    :cond_9
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final n(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lwr2/d;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;",
            "Ljava/lang/String;",
            "Lc93/m;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "searchQuery"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "maxEditDistance"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwr2/d;

    invoke-static {v5, v1, v2}, Lwr2/c;->A(Lwr2/d;Ljava/lang/String;Lc93/m;)Lwr2/a;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lwr2/a;

    invoke-virtual {v3}, Lwr2/a;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, Lwr2/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lwr2/b;-><init>(I)V

    new-instance v3, Lwr2/b;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Lwr2/b;-><init>(I)V

    new-instance v6, Lwr2/b;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lwr2/b;-><init>(I)V

    new-instance v8, Lwr2/b;

    const/4 v9, 0x3

    invoke-direct {v8, v9}, Lwr2/b;-><init>(I)V

    new-instance v10, Lwr2/b;

    const/4 v11, 0x4

    invoke-direct {v10, v11}, Lwr2/b;-><init>(I)V

    new-instance v12, Lwr2/b;

    const/4 v13, 0x5

    invoke-direct {v12, v13}, Lwr2/b;-><init>(I)V

    new-instance v14, Lwr2/b;

    const/4 v15, 0x6

    invoke-direct {v14, v15}, Lwr2/b;-><init>(I)V

    move/from16 p0, v2

    new-instance v2, Lwr2/b;

    move/from16 p1, v5

    const/4 v5, 0x7

    invoke-direct {v2, v5}, Lwr2/b;-><init>(I)V

    move/from16 p2, v5

    new-instance v5, Lwr2/b;

    move/from16 v16, v7

    const/16 v7, 0x8

    invoke-direct {v5, v7}, Lwr2/b;-><init>(I)V

    move/from16 v17, v7

    new-instance v7, Lwr2/b;

    move/from16 v18, v9

    const/16 v9, 0x9

    invoke-direct {v7, v9}, Lwr2/b;-><init>(I)V

    move/from16 v19, v9

    new-array v9, v4, [Lkotlin/jvm/functions/Function1;

    aput-object v1, v9, p0

    aput-object v3, v9, p1

    aput-object v6, v9, v16

    aput-object v8, v9, v18

    aput-object v10, v9, v11

    aput-object v12, v9, v13

    aput-object v14, v9, v15

    aput-object v2, v9, p2

    aput-object v5, v9, v17

    aput-object v7, v9, v19

    invoke-static {v9}, Lq83/g;->p([Lkotlin/jvm/functions/Function1;)Lea2/l;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwr2/a;

    invoke-virtual {v2}, Lwr2/a;->i()Lwr2/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-object v1
.end method

.method public static synthetic o(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lwr2/c$a;->w:Lwr2/c$a;

    :cond_0
    invoke-static {p0, p1, p2}, Lwr2/c;->n(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->g()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->i()Lwr2/d;

    move-result-object p0

    invoke-interface {p0}, Lwr2/d;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->f()I

    move-result p0

    invoke-static {p0}, Lwr2/c;->l(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->c()I

    move-result p0

    invoke-static {p0}, Lwr2/c;->l(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->e()I

    move-result p0

    invoke-static {p0}, Lwr2/c;->l(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->b()I

    move-result p0

    invoke-static {p0}, Lwr2/c;->l(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->h()I

    move-result p0

    invoke-static {p0}, Lwr2/c;->l(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->k()Z

    move-result p0

    invoke-static {p0}, Lwr2/c;->z(Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->j()Z

    move-result p0

    invoke-static {p0}, Lwr2/c;->z(Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Lwr2/a;)Ljava/lang/Comparable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwr2/a;->d()I

    move-result p0

    invoke-static {p0}, Lwr2/c;->l(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final z(Z)Z
    .locals 0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
