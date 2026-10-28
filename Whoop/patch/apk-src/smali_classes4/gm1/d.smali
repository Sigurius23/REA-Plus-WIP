.class public abstract Lgm1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lk71/m;",
        "c",
        "(Lk71/m;)Lk71/m;",
        "Lj71/c;",
        "b",
        "(Lj71/c;)Lj71/c;",
        "Lj61/h;",
        "a",
        "(Lj61/h;)Lj61/h;",
        "home_release"
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
.method private static final a(Lj61/h;)Lj61/h;
    .locals 18

    invoke-virtual/range {p0 .. p0}, Lj61/h;->d()Lg61/b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v9, 0xfe

    const/4 v10, 0x0

    const v1, 0x3e4ccccd    # 0.2f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lg61/b;->b(Lg61/b;FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILjava/lang/Object;)Lg61/b;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v16, 0x1ffb

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

.method private static final b(Lj71/c;)Lj71/c;
    .locals 21

    invoke-virtual/range {p0 .. p0}, Lj71/c;->e()Lj61/h;

    move-result-object v0

    invoke-static {v0}, Lgm1/d;->a(Lj61/h;)Lj61/h;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lj71/c;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj71/b;

    instance-of v5, v4, Lj71/b$g;

    if-eqz v5, :cond_3

    check-cast v4, Lj71/b$g;

    invoke-virtual {v4}, Lj71/b$g;->g()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v5, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu61/a;

    new-instance v8, Lu61/a;

    invoke-virtual {v6}, Lu61/a;->d()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v6}, Lu61/a;->c()Lk61/a;

    move-result-object v10

    invoke-virtual {v6}, Lu61/a;->f()Lk61/c;

    move-result-object v11

    if-eqz v11, :cond_1

    invoke-virtual {v6}, Lu61/a;->f()Lk61/c;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lk61/c;->f()J

    move-result-wide v12

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v6, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    goto :goto_2

    :cond_0
    sget-wide v12, Li2/x;->f:J

    :goto_2
    invoke-static {v12, v13}, Li91/c;->o(J)Li91/a;

    move-result-object v15

    const/16 v19, 0x37

    const/16 v20, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v11 .. v20}, Lk61/c;->b(Lk61/c;FIILi91/a;JZILjava/lang/Object;)Lk61/c;

    move-result-object v6

    :goto_3
    move-object v11, v6

    goto :goto_4

    :cond_1
    const/4 v6, 0x0

    goto :goto_3

    :goto_4
    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v6, Lj71/b$g;

    invoke-virtual {v4}, Lj71/b$g;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lj71/b$g;->d()Z

    move-result v9

    const/16 v13, 0x38

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v6

    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v7}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Lk71/m;)Lk71/m;
    .locals 27

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lk71/m;->k()Lm91/u;

    move-result-object v0

    instance-of v2, v0, Lj71/c;

    if-eqz v2, :cond_0

    check-cast v0, Lj71/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lgm1/d;->b(Lj71/c;)Lj71/c;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_1
    move-object v9, v0

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Lk71/m;->k()Lm91/u;

    move-result-object v0

    goto :goto_1

    :goto_2
    const v25, 0x7fff7f

    const/16 v26, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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

    invoke-static/range {v1 .. v26}, Lk71/m;->b(Lk71/m;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILjava/lang/Object;)Lk71/m;

    move-result-object v0

    return-object v0
.end method
