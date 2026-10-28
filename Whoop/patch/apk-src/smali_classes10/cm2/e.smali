.class public abstract Lcm2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lj71/c;",
        "graphState",
        "",
        "isScrubbing",
        "Lor2/h0;",
        "graphKey",
        "Lvl2/a;",
        "duration",
        "a",
        "(Lj71/c;ZLor2/h0;Lvl2/a;)Lj71/c;",
        "Lj61/h;",
        "plane",
        "b",
        "(Lj61/h;)Lj61/h;",
        "trends_release"
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
.method public static final a(Lj71/c;ZLor2/h0;Lvl2/a;)Lj71/c;
    .locals 24

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "graphState"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "graphKey"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "duration"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lj71/c;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    move v2, v6

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj71/b;

    instance-of v4, v4, Lj71/b$k;

    if-eqz v4, :cond_2

    move v2, v5

    :goto_0
    invoke-virtual {v3}, Lj71/c;->f()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v7, v4, Ljava/util/Collection;

    if-eqz v7, :cond_3

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lj71/b;

    instance-of v8, v7, Lj71/b$g;

    if-nez v8, :cond_5

    instance-of v8, v7, Lj71/b$a;

    if-nez v8, :cond_5

    instance-of v7, v7, Lj71/b$b;

    if-eqz v7, :cond_4

    :cond_5
    move v6, v5

    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    if-eqz v6, :cond_7

    if-eqz p1, :cond_b

    :cond_7
    sget-object v2, Lor2/h0;->RECOVERY:Lor2/h0;

    if-eq v0, v2, :cond_b

    sget-object v2, Lvl2/a;->WEEKLY:Lvl2/a;

    if-ne v1, v2, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Lj71/c;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj71/b;

    instance-of v2, v2, Lj71/b$k;

    if-nez v2, :cond_9

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    invoke-virtual {v3}, Lj71/c;->e()Lj61/h;

    move-result-object v0

    invoke-static {v0}, Lcm2/e;->b(Lj61/h;)Lj61/h;

    move-result-object v4

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    return-object v0

    :cond_b
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lj71/c;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj71/b;

    instance-of v4, v3, Lj71/b$g;

    const/16 v6, 0xa

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v4, :cond_14

    check-cast v3, Lj71/b$g;

    invoke-virtual {v3}, Lj71/b$g;->g()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu61/a;

    new-instance v11, Lu61/a;

    invoke-virtual {v6}, Lu61/a;->d()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v6}, Lu61/a;->c()Lk61/a;

    move-result-object v9

    if-eqz v9, :cond_e

    invoke-virtual {v6}, Lu61/a;->c()Lk61/a;

    move-result-object v13

    if-eqz v13, :cond_c

    invoke-virtual {v13}, Lk61/a;->c()Li91/a;

    move-result-object v13

    if-nez v13, :cond_d

    :cond_c
    sget-wide v13, Li2/x;->f:J

    invoke-static {v13, v14}, Li91/c;->o(J)Li91/a;

    move-result-object v13

    :cond_d
    invoke-static {v9, v13, v8, v7, v8}, Lk61/a;->b(Lk61/a;Li91/a;Li91/a;ILjava/lang/Object;)Lk61/a;

    move-result-object v9

    move-object v13, v9

    goto :goto_6

    :cond_e
    move-object v13, v8

    :goto_6
    invoke-virtual {v6}, Lu61/a;->f()Lk61/c;

    move-result-object v14

    if-eqz v14, :cond_12

    sget-object v9, Lor2/h0;->RECOVERY:Lor2/h0;

    if-ne v0, v9, :cond_f

    int-to-float v9, v5

    :goto_7
    move v15, v9

    goto :goto_8

    :cond_f
    invoke-virtual {v6}, Lu61/a;->f()Lk61/c;

    move-result-object v9

    if-eqz v9, :cond_10

    invoke-virtual {v9}, Lk61/c;->g()F

    move-result v9

    goto :goto_7

    :cond_10
    int-to-float v9, v7

    goto :goto_7

    :goto_8
    invoke-virtual {v6}, Lu61/a;->f()Lk61/c;

    move-result-object v6

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Lk61/c;->f()J

    move-result-wide v5

    const v9, 0x3e99999a    # 0.3f

    invoke-static {v9, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    goto :goto_9

    :cond_11
    sget-wide v5, Li2/x;->f:J

    :goto_9
    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object v18

    const/16 v22, 0x36

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v14 .. v23}, Lk61/c;->b(Lk61/c;FIILi91/a;JZILjava/lang/Object;)Lk61/c;

    move-result-object v5

    move-object v14, v5

    goto :goto_a

    :cond_12
    move-object v14, v8

    :goto_a
    const/16 v16, 0x8

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x1

    goto/16 :goto_5

    :cond_13
    new-instance v9, Lj71/b$g;

    invoke-virtual {v3}, Lj71/b$g;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Lj71/b$g;->d()Z

    move-result v12

    const/16 v16, 0x38

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_14
    instance-of v4, v3, Lj71/b$a;

    if-eqz v4, :cond_1b

    check-cast v3, Lj71/b$a;

    invoke-virtual {v3}, Lj71/b$a;->f()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll61/d;

    new-instance v6, Ll61/d;

    invoke-virtual {v5}, Ll61/d;->b()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v5}, Ll61/d;->a()Lk61/a;

    move-result-object v11

    if-eqz v11, :cond_17

    invoke-virtual {v5}, Ll61/d;->a()Lk61/a;

    move-result-object v12

    if-eqz v12, :cond_15

    invoke-virtual {v12}, Lk61/a;->c()Li91/a;

    move-result-object v12

    if-nez v12, :cond_16

    :cond_15
    sget-wide v12, Li2/x;->f:J

    invoke-static {v12, v13}, Li91/c;->o(J)Li91/a;

    move-result-object v12

    :cond_16
    invoke-static {v11, v12, v8, v7, v8}, Lk61/a;->b(Lk61/a;Li91/a;Li91/a;ILjava/lang/Object;)Lk61/a;

    move-result-object v11

    goto :goto_c

    :cond_17
    move-object v11, v8

    :goto_c
    invoke-virtual {v5}, Ll61/d;->c()Lk61/c;

    move-result-object v12

    if-eqz v12, :cond_19

    invoke-virtual {v5}, Ll61/d;->c()Lk61/c;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-virtual {v5}, Lk61/c;->f()J

    move-result-wide v13

    goto :goto_d

    :cond_18
    sget-wide v13, Li2/x;->f:J

    :goto_d
    invoke-static {v13, v14}, Li91/c;->o(J)Li91/a;

    move-result-object v16

    const/16 v20, 0x37

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v12 .. v21}, Lk61/c;->b(Lk61/c;FIILi91/a;JZILjava/lang/Object;)Lk61/c;

    move-result-object v5

    goto :goto_e

    :cond_19
    move-object v5, v8

    :goto_e
    invoke-direct {v6, v9, v11, v5}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;)V

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_1a
    new-instance v9, Lj71/b$a;

    invoke-virtual {v3}, Lj71/b$a;->e()Lj71/a;

    move-result-object v11

    invoke-virtual {v3}, Lj71/b$a;->c()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3}, Lj71/b$a;->d()Z

    move-result v13

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Lj71/b$a;-><init>(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1b
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_f
    const/4 v5, 0x1

    goto/16 :goto_4

    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lj71/c;->e()Lj61/h;

    move-result-object v0

    invoke-static {v0}, Lcm2/e;->b(Lj61/h;)Lj61/h;

    move-result-object v4

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object v5, v1

    invoke-static/range {v3 .. v9}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    return-object v0
.end method

.method private static final b(Lj61/h;)Lj61/h;
    .locals 18

    new-instance v6, Lh2/c;

    const v0, 0x3ccccccd    # 0.025f

    const v1, 0x3d23d70a    # 0.04f

    const/4 v2, 0x0

    invoke-direct {v6, v2, v0, v0, v1}, Lh2/c;-><init>(FFFF)V

    const/16 v16, 0x1fef

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v17}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v0

    return-object v0
.end method
