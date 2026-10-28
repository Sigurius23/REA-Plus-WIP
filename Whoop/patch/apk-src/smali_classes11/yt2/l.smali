.class public abstract Lyt2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "scrollId",
        "",
        "Lzt2/h;",
        "goalSectionList",
        "Ln0/u;",
        "a",
        "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ln0/u;",
        "weekly-plan_release"
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
.method public static final a(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ln0/u;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lzt2/h;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ln0/u;"
        }
    .end annotation

    const-string p3, "scrollId"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0xc

    int-to-float p3, p3

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p3, v0

    const/16 v1, 0x22

    int-to-float v1, v1

    mul-float/2addr v1, v0

    const/4 v2, 0x3

    int-to-float v3, v2

    mul-float/2addr v3, v0

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v5

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lzt2/h;

    invoke-virtual {v8}, Lzt2/h;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_1
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v8, v5

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzt2/h;

    invoke-virtual {v9}, Lzt2/h;->h()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    instance-of v10, v9, Ljava/util/Collection;

    if-eqz v10, :cond_2

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lm91/u;

    instance-of v11, v10, Lw11/c;

    if-eqz v11, :cond_3

    check-cast v10, Lw11/c;

    invoke-virtual {v10}, Lw11/c;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    move v8, v4

    :goto_4
    if-ltz v7, :cond_6

    const p0, 0x384497a4

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    add-int/lit8 v7, v7, 0x1

    const/4 p0, 0x2

    invoke-static {v7, v5, p2, p0}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object p0

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    return-object p0

    :cond_6
    if-ltz v8, :cond_a

    const v2, 0x38489150

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_7

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzt2/h;

    goto :goto_5

    :cond_7
    const/4 p1, 0x0

    :goto_5
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lzt2/h;->h()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v2, v5

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/u;

    instance-of v7, v6, Lw11/c;

    if-eqz v7, :cond_8

    check-cast v6, Lw11/c;

    invoke-virtual {v6}, Lw11/c;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    move v4, v2

    goto :goto_7

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    add-float/2addr v3, v1

    int-to-float p0, v4

    mul-float/2addr v3, p0

    add-float/2addr v3, p3

    add-int/lit8 v8, v8, 0x1

    invoke-interface {v0, v3}, Ly3/c;->F(F)I

    move-result p0

    invoke-static {v8, p0, p2, v5}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object p0

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    return-object p0

    :cond_a
    const p0, 0x38514c95

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-static {v5, v5, p2, v2}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object p0

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    return-object p0
.end method
