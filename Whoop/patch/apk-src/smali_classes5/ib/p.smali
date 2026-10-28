.class public abstract Lib/p;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field final a:Lib/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lib/c;"
        }
    .end annotation
.end field

.field private final b:Lib/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lib/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/u;)V
    .locals 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    new-instance v0, Lib/o;

    invoke-direct {v0, p0}, Lib/o;-><init>(Lib/p;)V

    iput-object v0, p0, Lib/p;->b:Lib/b;

    new-instance v1, Lib/c;

    invoke-direct {v1, p0, p1}, Lib/c;-><init>(Lib/p;Landroidx/recyclerview/widget/u;)V

    iput-object v1, p0, Lib/p;->a:Lib/c;

    iget-object p1, v1, Lib/c;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Lib/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib/n;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public b(Lib/n;Lib/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib/n;",
            "Lib/n;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public c(Lib/n;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib/n;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lib/p;->a:Lib/c;

    iget-object v0, v1, Lib/c;->a:Landroidx/recyclerview/widget/c;

    iget-object v2, v1, Lib/c;->h:Lib/a;

    if-eqz p1, :cond_2

    iget-object v3, v1, Lib/c;->e:Lib/n;

    if-nez v3, :cond_0

    iget-object v3, v1, Lib/c;->f:Lib/n;

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lib/n;->j()Z

    move-result v3

    iput-boolean v3, v1, Lib/c;->d:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lib/n;->j()Z

    move-result v3

    iget-boolean v4, v1, Lib/c;->d:Z

    if-ne v3, v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget v3, v1, Lib/c;->g:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v1, Lib/c;->g:I

    iget-object v3, v1, Lib/c;->e:Lib/n;

    if-ne p1, v3, :cond_3

    return-void

    :cond_3
    iget-object v5, v1, Lib/c;->f:Lib/n;

    if-eqz v5, :cond_4

    move-object v6, v5

    goto :goto_1

    :cond_4
    move-object v6, v3

    :goto_1
    const/4 v7, 0x0

    const/4 v8, 0x0

    if-nez p1, :cond_9

    if-eqz v3, :cond_5

    iget-object p1, v3, Lib/n;->z:Lib/r;

    invoke-virtual {p1}, Lib/r;->size()I

    move-result p1

    goto :goto_2

    :cond_5
    if-nez v5, :cond_6

    move p1, v7

    goto :goto_2

    :cond_6
    iget-object p1, v5, Lib/n;->z:Lib/r;

    invoke-virtual {p1}, Lib/r;->size()I

    move-result p1

    :goto_2
    iget-object v3, v1, Lib/c;->e:Lib/n;

    if-eqz v3, :cond_7

    invoke-virtual {v3, v2}, Lib/n;->r(Lib/a;)V

    iput-object v8, v1, Lib/c;->e:Lib/n;

    goto :goto_3

    :cond_7
    iget-object v2, v1, Lib/c;->f:Lib/n;

    if-eqz v2, :cond_8

    iput-object v8, v1, Lib/c;->f:Lib/n;

    :cond_8
    :goto_3
    invoke-virtual {v0, v7, p1}, Landroidx/recyclerview/widget/c;->b(II)V

    invoke-virtual {v1, v6, v8}, Lib/c;->a(Lib/n;Lib/n;)V

    return-void

    :cond_9
    if-nez v3, :cond_a

    if-nez v5, :cond_a

    iput-object p1, v1, Lib/c;->e:Lib/n;

    invoke-virtual {p1, v8, v2}, Lib/n;->c(Ljava/util/List;Lib/a;)V

    iget-object v2, p1, Lib/n;->z:Lib/r;

    invoke-virtual {v2}, Lib/r;->size()I

    move-result v2

    invoke-virtual {v0, v7, v2}, Landroidx/recyclerview/widget/c;->a(II)V

    invoke-virtual {v1, v8, p1}, Lib/c;->a(Lib/n;Lib/n;)V

    return-void

    :cond_a
    if-eqz v3, :cond_c

    invoke-virtual {v3, v2}, Lib/n;->r(Lib/a;)V

    iget-object v0, v1, Lib/c;->e:Lib/n;

    invoke-virtual {v0}, Lib/n;->m()Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_4

    :cond_b
    new-instance v2, Lib/b0;

    invoke-direct {v2, v0}, Lib/b0;-><init>(Lib/n;)V

    move-object v0, v2

    :goto_4
    iput-object v0, v1, Lib/c;->f:Lib/n;

    iput-object v8, v1, Lib/c;->e:Lib/n;

    :cond_c
    iget-object v2, v1, Lib/c;->f:Lib/n;

    if-eqz v2, :cond_e

    iget-object v0, v1, Lib/c;->e:Lib/n;

    if-nez v0, :cond_e

    invoke-virtual {p1}, Lib/n;->m()Z

    move-result v0

    if-eqz v0, :cond_d

    move-object v3, p1

    goto :goto_5

    :cond_d
    new-instance v0, Lib/b0;

    invoke-direct {v0, p1}, Lib/b0;-><init>(Lib/n;)V

    move-object v3, v0

    :goto_5
    iget-object v0, v1, Lib/c;->b:Lqg3/d;

    iget-object v0, v0, Lqg3/d;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/fragment/app/j2;

    const/4 v6, 0x2

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Landroidx/fragment/app/j2;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;I)V

    invoke-interface {v7, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "must be in snapshot state to diff"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lib/p;->a:Lib/c;

    iget-object v1, v0, Lib/c;->e:Lib/n;

    if-nez v1, :cond_1

    iget-object v0, v0, Lib/c;->f:Lib/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lib/n;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Item count is zero, getItem() call is invalid"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v1, p1}, Lib/n;->n(I)V

    iget-object v0, v0, Lib/c;->e:Lib/n;

    invoke-virtual {v0, p1}, Lib/n;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemCount()I
    .locals 2

    iget-object v0, p0, Lib/p;->a:Lib/c;

    iget-object v1, v0, Lib/c;->e:Lib/n;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lib/n;->z:Lib/r;

    invoke-virtual {v0}, Lib/r;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, v0, Lib/c;->f:Lib/n;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, v0, Lib/n;->z:Lib/r;

    invoke-virtual {v0}, Lib/r;->size()I

    move-result v0

    return v0
.end method
