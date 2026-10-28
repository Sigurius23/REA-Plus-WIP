.class public abstract Ll82/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "Lm91/o;",
        "wrappers",
        "",
        "followerRequestId",
        "b",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "Lv11/j;",
        "c",
        "(Lv11/j;)Lv11/j;",
        "search-arch-mini_release"
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
.method public static final synthetic a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Ll82/b;->b(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm91/o;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lm91/o;",
            ">;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/o;

    invoke-virtual {v1}, Lm91/o;->e()Lm91/u;

    move-result-object v2

    instance-of v3, v2, Lv11/j;

    if-eqz v3, :cond_0

    check-cast v2, Lv11/j;

    invoke-virtual {v2}, Lv11/j;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Ll82/b;->c(Lv11/j;)Lv11/j;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lm91/o;->b(Lm91/o;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lm91/o;

    move-result-object v1

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final c(Lv11/j;)Lv11/j;
    .locals 27

    invoke-virtual/range {p0 .. p0}, Lv11/j;->g()Lv11/b;

    move-result-object v0

    const/4 v13, 0x0

    if-eqz v0, :cond_0

    const/16 v11, 0x3ef

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v12}, Lv11/b;->b(Lv11/b;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lv11/c;Lgz0/m0;ZLcom/whoop/whoopaction/domain/models/Action;Ljava/lang/Object;Lv11/k;Lv11/a;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lv11/b;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, v13

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lv11/j;->c()Lv11/b;

    move-result-object v14

    if-eqz v14, :cond_1

    const/16 v25, 0x3ef

    const/16 v26, 0x0

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

    invoke-static/range {v14 .. v26}, Lv11/b;->b(Lv11/b;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lv11/c;Lgz0/m0;ZLcom/whoop/whoopaction/domain/models/Action;Ljava/lang/Object;Lv11/k;Lv11/a;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lv11/b;

    move-result-object v13

    :cond_1
    move-object v8, v13

    const/16 v10, 0x9f

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v11}, Lv11/j;->b(Lv11/j;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lv11/b;Lv11/b;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lv11/j;

    move-result-object v0

    return-object v0
.end method
