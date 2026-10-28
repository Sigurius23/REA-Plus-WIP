.class public abstract Ls61/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a+\u0010\u0008\u001a\u00020\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "Lh2/b;",
        "points",
        "Li2/s0;",
        "b",
        "(Ljava/util/List;)Li2/s0;",
        "topPoints",
        "bottomPoints",
        "a",
        "(Ljava/util/List;Ljava/util/List;)Li2/s0;",
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


# direct methods
.method public static final a(Ljava/util/List;Ljava/util/List;)Li2/s0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh2/b;",
            ">;",
            "Ljava/util/List<",
            "Lh2/b;",
            ">;)",
            "Li2/s0;"
        }
    .end annotation

    const-string v0, "topPoints"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomPoints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/b;

    iget-wide v3, v3, Lh2/b;->a:J

    const/16 v5, 0x20

    shr-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/b;

    iget-wide v6, v2, Lh2/b;->a:J

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v2, v6

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v0, v3, v2}, Li2/j;->i(FF)V

    move-object v2, p0

    check-cast v2, Ljava/lang/Iterable;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh2/b;

    iget-wide v6, v4, Lh2/b;->a:J

    shr-long v10, v6, v5

    long-to-int v4, v10

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    and-long/2addr v6, v8

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-virtual {v0, v4, v6}, Li2/j;->h(FF)V

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    move-object v4, v1

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_1

    move-object v4, v1

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v3

    sub-int/2addr v6, v4

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh2/b;

    iget-wide v6, v4, Lh2/b;->a:J

    new-instance v4, Lh2/b;

    invoke-direct {v4, v6, v7}, Lh2/b;-><init>(J)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v1, v1, Lh2/b;->a:J

    shr-long v3, v1, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    and-long/2addr v1, v8

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v0, v3, v1}, Li2/j;->h(FF)V

    goto :goto_2

    :cond_2
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/b;

    iget-wide v1, p1, Lh2/b;->a:J

    shr-long/2addr v1, v5

    long-to-int p1, v1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh2/b;

    iget-wide v1, p0, Lh2/b;->a:J

    shr-long/2addr v1, v5

    long-to-int p0, v1

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-virtual {v0, p1, p0}, Li2/j;->h(FF)V

    invoke-virtual {v0}, Li2/j;->f()V

    :cond_3
    return-object v0
.end method

.method public static final b(Ljava/util/List;)Li2/s0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh2/b;",
            ">;)",
            "Li2/s0;"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/b;

    iget-wide v2, v2, Lh2/b;->a:J

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v5, v1, Lh2/b;->a:J

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v1, v5

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v0, v2, v1}, Li2/j;->i(FF)V

    check-cast p0, Ljava/lang/Iterable;

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v1, v1, Lh2/b;->a:J

    shr-long v5, v1, v4

    long-to-int v3, v5

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    and-long/2addr v1, v7

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v0, v3, v1}, Li2/j;->h(FF)V

    goto :goto_0

    :cond_0
    return-object v0
.end method
