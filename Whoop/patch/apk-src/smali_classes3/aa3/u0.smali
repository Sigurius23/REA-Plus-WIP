.class public final Laa3/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/a;


# instance fields
.field public a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-void

    .line 8
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-void

    .line 10
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Laa3/w0;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(J)Lzr/g0;
    .locals 5

    invoke-virtual {p0, p1, p2}, Laa3/u0;->n(J)I

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    return-object p1

    :cond_0
    iget-object v1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/a;

    iget-wide v1, v0, Lqa/a;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_2

    cmp-long p1, p1, v1

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    return-object p1

    :cond_2
    :goto_0
    iget-object p1, v0, Lqa/a;->a:Lzr/g0;

    return-object p1
.end method

.method public b(J)J
    .locals 8

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_7

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa/a;

    iget-wide v4, v1, Lqa/a;->b:J

    cmp-long v1, p1, v4

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    move v4, v1

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa/a;

    iget-wide v5, v5, Lqa/a;->b:J

    cmp-long v7, p1, v5

    if-nez v7, :cond_1

    return-wide v5

    :cond_1
    if-gez v7, :cond_3

    sub-int/2addr v4, v1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/a;

    iget-wide v4, v0, Lqa/a;->d:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_2

    cmp-long p1, v4, p1

    if-gtz p1, :cond_2

    return-wide v4

    :cond_2
    iget-wide p1, v0, Lqa/a;->b:J

    return-wide p1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v0}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/a;

    iget-wide v4, v0, Lqa/a;->d:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_6

    cmp-long p1, p1, v4

    if-gez p1, :cond_5

    goto :goto_1

    :cond_5
    return-wide v4

    :cond_6
    :goto_1
    iget-wide p1, v0, Lqa/a;->b:J

    return-wide p1

    :cond_7
    :goto_2
    return-wide v2
.end method

.method public c(J)J
    .locals 12

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-wide/high16 v2, -0x8000000000000000L

    if-eqz v1, :cond_0

    return-wide v2

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa/a;

    iget-wide v4, v4, Lqa/a;->b:J

    cmp-long v4, p1, v4

    if-gez v4, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqa/a;

    iget-wide p1, p1, Lqa/a;->b:J

    return-wide p1

    :cond_1
    const/4 v1, 0x1

    move v4, v1

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa/a;

    iget-wide v8, v5, Lqa/a;->b:J

    iget-wide v10, v5, Lqa/a;->b:J

    cmp-long v5, p1, v8

    if-gez v5, :cond_3

    sub-int/2addr v4, v1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/a;

    iget-wide v0, v0, Lqa/a;->d:J

    cmp-long v2, v0, v6

    if-eqz v2, :cond_2

    cmp-long p1, v0, p1

    if-lez p1, :cond_2

    cmp-long p1, v0, v10

    if-gez p1, :cond_2

    return-wide v0

    :cond_2
    return-wide v10

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v0}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/a;

    iget-wide v0, v0, Lqa/a;->d:J

    cmp-long v4, v0, v6

    if-eqz v4, :cond_5

    cmp-long p1, p1, v0

    if-gez p1, :cond_5

    return-wide v0

    :cond_5
    return-wide v2
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public d(J)V
    .locals 6

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Laa3/u0;->n(J)I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v2, v1, -0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa/a;

    iget-wide v2, v2, Lqa/a;->d:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    cmp-long p1, v2, p1

    if-ltz p1, :cond_2

    :cond_1
    add-int/lit8 v1, v1, -0x1

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public e(Lqa/a;J)Z
    .locals 10

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    iget-wide v1, p1, Lqa/a;->b:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    invoke-static {v5}, Lva3/g;->d(Z)V

    cmp-long v5, v1, p2

    if-gtz v5, :cond_2

    iget-wide v8, p1, Lqa/a;->d:J

    cmp-long v3, v8, v3

    if-eqz v3, :cond_1

    cmp-long v3, p2, v8

    if-gez v3, :cond_2

    :cond_1
    move v3, v7

    goto :goto_1

    :cond_2
    move v3, v6

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v7

    :goto_2
    if-ltz v4, :cond_5

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa/a;

    iget-wide v8, v5, Lqa/a;->b:J

    cmp-long v5, v1, v8

    if-ltz v5, :cond_3

    add-int/2addr v4, v7

    invoke-virtual {v0, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return v3

    :cond_3
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa/a;

    iget-wide v8, v5, Lqa/a;->b:J

    cmp-long v5, v8, p2

    if-gtz v5, :cond_4

    move v3, v6

    :cond_4
    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return v3
.end method

.method public f(Lsc3/k;)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    instance-of v1, p1, Lsc3/n;

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    instance-of v1, p1, Lsc3/f;

    if-eqz v1, :cond_2

    check-cast p1, Lsc3/f;

    iget-object p1, p1, Lsc3/f;->a:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsc3/n;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public g(Ljava/util/List;)V
    .locals 8

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void

    :cond_2
    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-object v2, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf3/y;

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Laf3/y;

    iget v4, v2, Laf3/y;->a:I

    iget v5, v3, Laf3/y;->a:I

    if-ne v4, v5, :cond_3

    iget v5, v2, Laf3/y;->b:I

    iget v2, v2, Laf3/y;->c:I

    add-int v6, v5, v2

    iget v7, v3, Laf3/y;->b:I

    if-ne v6, v7, :cond_3

    iget-object v6, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    iget v3, v3, Laf3/y;->c:I

    add-int/2addr v2, v3

    new-instance v3, Laf3/y;

    invoke-direct {v3, v4, v5, v2}, Laf3/y;-><init>(III)V

    invoke-virtual {v6, v0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void

    :cond_3
    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laf3/t;

    invoke-virtual {v0}, Laf3/t;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Laa3/u0;->g(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    sget-object v1, Lo2/i;->c:Lo2/i;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(FFFFFF)V
    .locals 8

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/j;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lo2/j;-><init>(FFFFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(FFFFFF)V
    .locals 8

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/r;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lo2/r;-><init>(FFFFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    if-eqz v2, :cond_0

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf3/d;

    iget-object v3, v3, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n(J)I
    .locals 4

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa/a;

    iget-wide v2, v2, Lqa/a;->b:J

    cmp-long v2, p1, v2

    if-gez v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1
.end method

.method public o()Ljava/util/ArrayList;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbf3/d;

    iget-object v2, v2, Lbf3/d;->b:Laf3/y;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public p()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public q(F)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/s;

    invoke-direct {v1, p1}, Lo2/s;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(FF)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/l;

    invoke-direct {v1, p1, p2}, Lo2/l;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public s(FF)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/t;

    invoke-direct {v1, p1, p2}, Lo2/t;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public t(FF)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/m;

    invoke-direct {v1, p1, p2}, Lo2/m;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public u(FFFF)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/w;

    invoke-direct {v1, p1, p2, p3, p4}, Lo2/w;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public v(F)V
    .locals 2

    iget-object v0, p0, Laa3/u0;->a:Ljava/util/ArrayList;

    new-instance v1, Lo2/y;

    invoke-direct {v1, p1}, Lo2/y;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
