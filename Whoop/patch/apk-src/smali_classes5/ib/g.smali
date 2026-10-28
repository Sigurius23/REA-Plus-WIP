.class public final Lib/g;
.super Lib/n;
.source "SourceFile"

# interfaces
.implements Lib/q;


# instance fields
.field public final L:Lib/d;

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public final Q:Lib/e;


# direct methods
.method public constructor <init>(Lib/d;Lib/m;Ljava/lang/Object;I)V
    .locals 7

    new-instance v0, Lib/r;

    invoke-direct {v0}, Lib/r;-><init>()V

    sget-object v1, Lt/a;->c:Landroidx/profileinstaller/b;

    sget-object v2, Lt/a;->d:Landroidx/profileinstaller/b;

    invoke-direct {p0, v0, v1, v2, p2}, Lib/n;-><init>(Lib/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lib/m;)V

    const/4 p2, 0x0

    iput p2, p0, Lib/g;->M:I

    iput p2, p0, Lib/g;->N:I

    iput p2, p0, Lib/g;->O:I

    iput p2, p0, Lib/g;->P:I

    new-instance v6, Lib/e;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v0}, Lib/e;-><init>(Lib/n;I)V

    iput-object v6, p0, Lib/g;->Q:Lib/e;

    iput-object p1, p0, Lib/g;->L:Lib/d;

    iput p4, p0, Lib/n;->E:I

    move-object p4, p1

    check-cast p4, Lib/t;

    iget-object v0, p4, Lib/t;->c:Lib/a0;

    invoke-virtual {v0}, Lib/j;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lib/n;->d()V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lib/n;->y:Lib/m;

    iget v1, v0, Lib/m;->d:I

    iget v4, v0, Lib/m;->a:I

    iget-object v5, p0, Lib/n;->w:Ljava/util/concurrent/Executor;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p3, Ljava/lang/Integer;

    if-nez p3, :cond_1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_1
    div-int/2addr v1, v4

    const/4 v0, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int v1, v0, v4

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    div-int/lit8 v0, v1, 0x2

    sub-int/2addr p3, v0

    div-int/2addr p3, v4

    mul-int/2addr p3, v4

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :goto_1
    iget-object v0, p4, Lib/t;->c:Lib/a0;

    const/4 v1, 0x0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual/range {v0 .. v6}, Lib/a0;->g(ZIIILjava/util/concurrent/Executor;Lib/k;)V

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lib/n;->y:Lib/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Tiled callback on ContiguousPagedList"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lib/n;Lib/a;)V
    .locals 8

    iget-object p1, p1, Lib/n;->z:Lib/r;

    iget-object v0, p0, Lib/n;->z:Lib/r;

    iget v1, v0, Lib/r;->H:I

    iget v2, p1, Lib/r;->H:I

    sub-int/2addr v1, v2

    iget v2, v0, Lib/r;->G:I

    iget v3, p1, Lib/r;->G:I

    sub-int/2addr v2, v3

    iget v3, p1, Lib/r;->y:I

    iget v4, p1, Lib/r;->w:I

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    if-ltz v1, :cond_4

    if-ltz v2, :cond_4

    iget v5, v0, Lib/r;->y:I

    sub-int v6, v3, v1

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-ne v5, v6, :cond_4

    iget v5, v0, Lib/r;->w:I

    sub-int v6, v4, v2

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-ne v5, v6, :cond_4

    iget v0, v0, Lib/r;->E:I

    iget v5, p1, Lib/r;->E:I

    add-int/2addr v5, v1

    add-int/2addr v5, v2

    if-ne v0, v5, :cond_4

    const/4 v0, 0x0

    if-eqz v1, :cond_1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v1, v3

    iget v5, p1, Lib/r;->w:I

    iget p1, p1, Lib/r;->E:I

    add-int/2addr v5, p1

    if-eqz v3, :cond_0

    iget-object p1, p2, Lib/a;->a:Lib/c;

    iget-object p1, p1, Lib/c;->a:Landroidx/recyclerview/widget/c;

    invoke-virtual {p1, v5, v3, v0}, Landroidx/recyclerview/widget/c;->c(IILjava/lang/Object;)V

    :cond_0
    if-eqz v1, :cond_1

    add-int/2addr v5, v3

    iget-object p1, p2, Lib/a;->a:Lib/c;

    iget-object p1, p1, Lib/c;->a:Landroidx/recyclerview/widget/c;

    invoke-virtual {p1, v5, v1}, Landroidx/recyclerview/widget/c;->a(II)V

    :cond_1
    if-eqz v2, :cond_3

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr v2, p1

    if-eqz p1, :cond_2

    iget-object v1, p2, Lib/a;->a:Lib/c;

    iget-object v1, v1, Lib/c;->a:Landroidx/recyclerview/widget/c;

    invoke-virtual {v1, v4, p1, v0}, Landroidx/recyclerview/widget/c;->c(IILjava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    iget-object p1, p2, Lib/a;->a:Lib/c;

    iget-object p1, p1, Lib/c;->a:Landroidx/recyclerview/widget/c;

    invoke-virtual {p1, v7, v2}, Landroidx/recyclerview/widget/c;->a(II)V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid snapshot provided - doesn\'t appear to be a snapshot of this PagedList"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()Lib/j;
    .locals 1

    iget-object v0, p0, Lib/g;->L:Lib/d;

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lib/n;->E:I

    iget-object v1, p0, Lib/g;->L:Lib/d;

    check-cast v1, Lib/t;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final o(I)V
    .locals 4

    iget-object v0, p0, Lib/n;->y:Lib/m;

    iget v0, v0, Lib/m;->b:I

    iget-object v1, p0, Lib/n;->z:Lib/r;

    iget v2, v1, Lib/r;->w:I

    sub-int v3, p1, v2

    sub-int v3, v0, v3

    iget v1, v1, Lib/r;->E:I

    add-int/2addr v2, v1

    add-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x1

    sub-int/2addr p1, v2

    iget v0, p0, Lib/g;->O:I

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lib/g;->O:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lib/g;->u()V

    :cond_0
    iget v0, p0, Lib/g;->P:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lib/g;->P:I

    if-lez p1, :cond_1

    invoke-virtual {p0}, Lib/g;->t()V

    :cond_1
    return-void
.end method

.method public final t()V
    .locals 4

    iget v0, p0, Lib/g;->N:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lib/g;->N:I

    iget-object v1, p0, Lib/n;->z:Lib/r;

    iget v2, v1, Lib/r;->w:I

    iget v3, v1, Lib/r;->E:I

    add-int/2addr v2, v3

    sub-int/2addr v2, v0

    iget v3, v1, Lib/r;->z:I

    add-int/2addr v2, v3

    iget-object v1, v1, Lib/r;->x:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lib/f;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v2, v0, v3}, Lib/f;-><init>(Lib/g;ILjava/lang/Object;I)V

    iget-object v0, p0, Lib/n;->x:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final u()V
    .locals 4

    iget v0, p0, Lib/g;->M:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lib/g;->M:I

    iget-object v0, p0, Lib/n;->z:Lib/r;

    iget v1, v0, Lib/r;->w:I

    iget v2, v0, Lib/r;->z:I

    add-int/2addr v1, v2

    iget-object v0, v0, Lib/r;->x:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Lib/f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v1, v0, v3}, Lib/f;-><init>(Lib/g;ILjava/lang/Object;I)V

    iget-object v0, p0, Lib/n;->x:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
