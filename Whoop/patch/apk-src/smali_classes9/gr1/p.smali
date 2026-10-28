.class public abstract Lgr1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lgr1/q;",
        "",
        "loading",
        "c",
        "(Lgr1/q;Z)Lgr1/q;",
        "Lm91/u;",
        "b",
        "(Lm91/u;Z)Lm91/u;",
        "integrations_release"
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
.method public static final synthetic a(Lgr1/q;Z)Lgr1/q;
    .locals 0

    invoke-static {p0, p1}, Lgr1/p;->c(Lgr1/q;Z)Lgr1/q;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lm91/u;Z)Lm91/u;
    .locals 8

    instance-of v0, p0, Lny0/h0;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lny0/h0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, p1

    invoke-static/range {v1 .. v7}, Lny0/h0;->b(Lny0/h0;Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;ZILjava/lang/Object;)Lny0/h0;

    move-result-object p0

    return-object p0

    :cond_0
    move v5, p1

    instance-of p1, p0, Lr01/c;

    if-eqz p1, :cond_2

    move-object v0, p0

    check-cast v0, Lr01/c;

    invoke-virtual {v0}, Lr01/c;->c()Lm91/u;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0, v5}, Lgr1/p;->b(Lm91/u;Z)Lm91/u;

    move-result-object p0

    :goto_0
    move-object v4, p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lr01/c;->b(Lr01/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ILjava/lang/Object;)Lr01/c;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private static final c(Lgr1/q;Z)Lgr1/q;
    .locals 31

    move/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lgr1/q;->c()Lgr1/b;

    move-result-object v1

    const/16 v2, 0xa

    const/16 v29, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lgr1/b;->j()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/u;

    invoke-static {v5, v0}, Lgr1/p;->b(Lm91/u;Z)Lm91/u;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object/from16 v22, v4

    goto :goto_1

    :cond_1
    move-object/from16 v22, v29

    :goto_1
    invoke-virtual {v1}, Lgr1/b;->u()Lm91/u;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3, v0}, Lgr1/p;->b(Lm91/u;Z)Lm91/u;

    move-result-object v3

    move-object/from16 v21, v3

    goto :goto_2

    :cond_2
    move-object/from16 v21, v29

    :goto_2
    const v27, 0x1e7ffff

    const/16 v28, 0x0

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v0, v30

    invoke-static/range {v1 .. v28}, Lgr1/b;->b(Lgr1/b;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lm91/u;Lm91/u;Ljava/util/List;Lm91/u;Lcom/whoop/design/util/TextResource;Lm91/u;Lgr1/s;ILjava/lang/Object;)Lgr1/b;

    move-result-object v1

    move-object v7, v1

    goto :goto_3

    :cond_3
    move v0, v2

    move-object/from16 v7, v29

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lgr1/q;->e()Lgr1/d;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lgr1/d;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    move/from16 v2, p1

    invoke-static {v1, v2}, Lgr1/p;->b(Lm91/u;Z)Lm91/u;

    move-result-object v1

    invoke-interface {v13, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    move/from16 v2, p1

    invoke-virtual {v8}, Lgr1/d;->j()Lm91/u;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0, v2}, Lgr1/p;->b(Lm91/u;Z)Lm91/u;

    move-result-object v29

    :cond_5
    move-object/from16 v17, v29

    const/16 v18, 0xef

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v8 .. v19}, Lgr1/d;->b(Lgr1/d;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;Ljava/lang/String;Ljava/lang/String;Lm91/u;ILjava/lang/Object;)Lgr1/d;

    move-result-object v29

    :cond_6
    move-object/from16 v9, v29

    const/16 v11, 0xaf

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v12}, Lgr1/q;->b(Lgr1/q;Lgr1/k;ZLgr1/m;Lgr1/f;Lgr1/b;Lgr1/c;Lgr1/d;ZILjava/lang/Object;)Lgr1/q;

    move-result-object v0

    return-object v0
.end method
