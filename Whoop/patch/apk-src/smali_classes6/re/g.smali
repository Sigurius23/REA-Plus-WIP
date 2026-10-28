.class public final Lre/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/io/Serializable;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/io/Serializable;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly8/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/g;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lre/g;->c:Ljava/io/Serializable;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lre/g;->d:Ljava/io/Serializable;

    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, Lre/g;->e:Ljava/io/Serializable;

    const/4 p1, -0x1

    iput p1, p0, Lre/g;->a:I

    return-void
.end method


# virtual methods
.method public a(JLx8/n;)V
    .locals 8

    iget-object v0, p0, Lre/g;->d:Ljava/io/Serializable;

    check-cast v0, Ljava/util/ArrayDeque;

    iget-object v1, p0, Lre/g;->e:Ljava/io/Serializable;

    check-cast v1, Ljava/util/PriorityQueue;

    iget v2, p0, Lre/g;->a:I

    if-eqz v2, :cond_6

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->size()I

    move-result v2

    iget v4, p0, Lre/g;->a:I

    if-lt v2, v4, :cond_0

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly8/q;

    sget v4, Lx8/t;->a:I

    iget-wide v4, v2, Ly8/q;->x:J

    cmp-long v2, p1, v4

    if-gez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Lre/g;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v2, Lx8/n;

    invoke-direct {v2}, Lx8/n;-><init>()V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx8/n;

    :goto_0
    invoke-virtual {p3}, Lx8/n;->a()I

    move-result v4

    invoke-virtual {v2, v4}, Lx8/n;->C(I)V

    iget-object v4, p3, Lx8/n;->a:[B

    iget p3, p3, Lx8/n;->b:I

    iget-object v5, v2, Lx8/n;->a:[B

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v4, p3, v5, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p3, p0, Lre/g;->f:Ljava/lang/Object;

    check-cast p3, Ly8/q;

    if-eqz p3, :cond_2

    iget-wide v4, p3, Ly8/q;->x:J

    cmp-long v4, p1, v4

    if-nez v4, :cond_2

    iget-object p1, p3, Ly8/q;->w:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance p3, Ly8/q;

    invoke-direct {p3}, Ly8/q;-><init>()V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly8/q;

    :goto_1
    iget-object v0, p3, Ly8/q;->w:Ljava/util/ArrayList;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p1, v4

    if-eqz v4, :cond_4

    const/4 v7, 0x1

    :cond_4
    invoke-static {v7}, Lva3/g;->d(Z)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    invoke-static {v4}, Lva3/g;->i(Z)V

    iput-wide p1, p3, Ly8/q;->x:J

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, p3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iput-object p3, p0, Lre/g;->f:Ljava/lang/Object;

    iget p1, p0, Lre/g;->a:I

    if-eq p1, v3, :cond_5

    invoke-virtual {p0, p1}, Lre/g;->b(I)V

    :cond_5
    return-void

    :cond_6
    :goto_2
    iget-object v0, p0, Lre/g;->b:Ljava/lang/Object;

    check-cast v0, Ly8/r;

    invoke-interface {v0, p1, p2, p3}, Ly8/r;->a(JLx8/n;)V

    return-void
.end method

.method public b(I)V
    .locals 8

    iget-object v0, p0, Lre/g;->e:Ljava/io/Serializable;

    check-cast v0, Ljava/util/PriorityQueue;

    :goto_0
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    move-result v1

    if-le v1, p1, :cond_2

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly8/q;

    sget v2, Lx8/t;->a:I

    const/4 v2, 0x0

    :goto_1
    iget-object v3, v1, Ly8/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_0

    iget-object v4, p0, Lre/g;->b:Ljava/lang/Object;

    check-cast v4, Ly8/r;

    iget-wide v5, v1, Ly8/q;->x:J

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lx8/n;

    invoke-interface {v4, v5, v6, v7}, Ly8/r;->a(JLx8/n;)V

    iget-object v4, p0, Lre/g;->c:Ljava/io/Serializable;

    check-cast v4, Ljava/util/ArrayDeque;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx8/n;

    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v2, p0, Lre/g;->f:Ljava/lang/Object;

    check-cast v2, Ly8/q;

    if-eqz v2, :cond_1

    iget-wide v2, v2, Ly8/q;->x:J

    iget-wide v4, v1, Ly8/q;->x:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    const/4 v2, 0x0

    iput-object v2, p0, Lre/g;->f:Ljava/lang/Object;

    :cond_1
    iget-object v2, p0, Lre/g;->d:Ljava/io/Serializable;

    check-cast v2, Ljava/util/ArrayDeque;

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method
