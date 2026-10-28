.class public final Lgf/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ljava/io/Serializable;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Comparable;


# virtual methods
.method public a(Ljava/lang/Object;Lo23/p;Ls83/c;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lgf/o;->b:Ljava/io/Serializable;

    check-cast v0, Ljava/util/LinkedHashMap;

    instance-of v1, p3, Lgf/n;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lgf/n;

    iget v2, v1, Lgf/n;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lgf/n;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lgf/n;

    invoke-direct {v1, p0, p3}, Lgf/n;-><init>(Lgf/o;Ls83/c;)V

    :goto_0
    iget-object p3, v1, Lgf/n;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lgf/n;->G:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lgf/n;->y:Lmc3/a;

    iget-object p2, v1, Lgf/n;->w:Ljava/lang/Object;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p2

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v1, Lgf/n;->z:I

    iget-object p2, v1, Lgf/n;->y:Lmc3/a;

    iget-object v3, v1, Lgf/n;->x:Lo23/p;

    iget-object v8, v1, Lgf/n;->w:Ljava/lang/Object;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move p3, p1

    move-object p1, v8

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lgf/o;->c:Ljava/lang/Object;

    check-cast p3, Lmc3/c;

    iput-object p1, v1, Lgf/n;->w:Ljava/lang/Object;

    iput-object p2, v1, Lgf/n;->x:Lo23/p;

    iput-object p3, v1, Lgf/n;->y:Lmc3/a;

    iput v4, v1, Lgf/n;->z:I

    iput v6, v1, Lgf/n;->G:I

    invoke-virtual {p3, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto :goto_4

    :cond_4
    move-object v3, p2

    move-object p2, p3

    move p3, v4

    :goto_1
    :try_start_1
    sget-object v8, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v8

    iget-object v9, p0, Lgf/o;->d:Ljava/lang/Comparable;

    check-cast v9, Lug/b;

    invoke-virtual {v8, v9}, Lug/b;->a(Lug/b;)I

    move-result v8

    if-lez v8, :cond_5

    invoke-virtual {p0}, Lgf/o;->b()V

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    goto :goto_7

    :cond_5
    :goto_2
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lvg/h;

    if-eqz v8, :cond_8

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v9

    iget-object v10, v8, Lvg/h;->b:Lug/b;

    invoke-virtual {v9, v10}, Lug/b;->a(Lug/b;)I

    move-result v9

    if-ltz v9, :cond_6

    move v4, v6

    :cond_6
    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    iget-object p1, v8, Lvg/h;->a:Ljava/lang/Object;

    goto :goto_6

    :cond_8
    :goto_3
    iput-object p1, v1, Lgf/n;->w:Ljava/lang/Object;

    iput-object v7, v1, Lgf/n;->x:Lo23/p;

    iput-object p2, v1, Lgf/n;->y:Lmc3/a;

    iput p3, v1, Lgf/n;->z:I

    iput v5, v1, Lgf/n;->G:I

    invoke-interface {v3, p1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v2, :cond_9

    :goto_4
    return-object v2

    :cond_9
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_5
    :try_start_2
    move-object v1, p3

    check-cast v1, Lvg/h;

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Lvg/h;

    iget-object p2, p3, Lvg/h;->a:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_6
    invoke-interface {p2, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_7
    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lgf/o;->b:Ljava/io/Serializable;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvg/h;

    sget-object v2, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v2

    iget-object v1, v1, Lvg/h;->b:Lug/b;

    invoke-virtual {v2, v1}, Lug/b;->a(Lug/b;)I

    move-result v1

    if-ltz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    iget-wide v1, p0, Lgf/o;->a:J

    invoke-virtual {v0, v1, v2}, Lug/b;->d(J)Lug/b;

    move-result-object v0

    iput-object v0, p0, Lgf/o;->d:Ljava/lang/Comparable;

    return-void
.end method
