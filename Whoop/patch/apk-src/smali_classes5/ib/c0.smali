.class public final Lib/c0;
.super Lib/n;
.source "SourceFile"

# interfaces
.implements Lib/q;


# instance fields
.field public final L:Lib/a0;

.field public final M:Lib/e;


# direct methods
.method public constructor <init>(Lib/a0;Lib/m;I)V
    .locals 10

    new-instance v0, Lib/r;

    invoke-direct {v0}, Lib/r;-><init>()V

    sget-object v1, Lt/a;->c:Landroidx/profileinstaller/b;

    sget-object v2, Lt/a;->d:Landroidx/profileinstaller/b;

    invoke-direct {p0, v0, v1, v2, p2}, Lib/n;-><init>(Lib/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lib/m;)V

    new-instance v9, Lib/e;

    const/4 p2, 0x1

    invoke-direct {v9, p0, p2}, Lib/e;-><init>(Lib/n;I)V

    iput-object v9, p0, Lib/c0;->M:Lib/e;

    iput-object p1, p0, Lib/c0;->L:Lib/a0;

    iget-object p2, p0, Lib/n;->y:Lib/m;

    iget v7, p2, Lib/m;->a:I

    iput p3, p0, Lib/n;->E:I

    invoke-virtual {p1}, Lib/j;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lib/n;->d()V

    return-void

    :cond_0
    iget-object p2, p0, Lib/n;->y:Lib/m;

    iget p2, p2, Lib/m;->d:I

    div-int/2addr p2, v7

    const/4 v0, 0x2

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    mul-int v6, p2, v7

    div-int/lit8 p2, v6, 0x2

    sub-int/2addr p3, p2

    div-int/2addr p3, v7

    mul-int/2addr p3, v7

    const/4 p2, 0x0

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v4, 0x1

    iget-object v8, p0, Lib/n;->w:Ljava/util/concurrent/Executor;

    move-object v3, p1

    invoke-virtual/range {v3 .. v9}, Lib/a0;->g(ZIIILjava/util/concurrent/Executor;Lib/k;)V

    return-void
.end method


# virtual methods
.method public final e(Lib/n;Lib/a;)V
    .locals 12

    iget-object p1, p1, Lib/n;->z:Lib/r;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lib/n;->z:Lib/r;

    invoke-virtual {v0}, Lib/r;->size()I

    move-result v1

    iget-object v2, v0, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lib/r;->size()I

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lib/n;->y:Lib/m;

    iget v1, v1, Lib/m;->a:I

    iget v3, v0, Lib/r;->w:I

    div-int/2addr v3, v1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_2

    add-int v7, v6, v3

    move v8, v5

    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_0

    add-int v9, v7, v8

    invoke-virtual {v0, v1, v9}, Lib/r;->e(II)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {p1, v1, v9}, Lib/r;->e(II)Z

    move-result v9

    if-nez v9, :cond_0

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    if-lez v8, :cond_1

    mul-int/2addr v7, v1

    mul-int v9, v1, v8

    iget-object v10, p2, Lib/a;->a:Lib/c;

    iget-object v10, v10, Lib/c;->a:Landroidx/recyclerview/widget/c;

    const/4 v11, 0x0

    invoke-virtual {v10, v7, v9, v11}, Landroidx/recyclerview/widget/c;->c(IILjava/lang/Object;)V

    add-int/lit8 v8, v8, -0x1

    add-int/2addr v6, v8

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid snapshot provided - doesn\'t appear to be a snapshot of this PagedList"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()Lib/j;
    .locals 1

    iget-object v0, p0, Lib/c0;->L:Lib/a0;

    return-object v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lib/n;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o(I)V
    .locals 7

    iget-object v0, p0, Lib/n;->y:Lib/m;

    iget v1, v0, Lib/m;->b:I

    iget v0, v0, Lib/m;->a:I

    iget-object v2, p0, Lib/n;->z:Lib/r;

    iget-object v3, v2, Lib/r;->x:Ljava/util/ArrayList;

    iget v4, v2, Lib/r;->F:I

    const/4 v5, 0x1

    if-eq v0, v4, :cond_2

    if-lt v0, v4, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v5, :cond_0

    iget v4, v2, Lib/r;->y:I

    if-nez v4, :cond_0

    iput v0, v2, Lib/r;->F:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Page size can change only if last page is only one present"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Page size cannot be reduced"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {v2}, Lib/r;->size()I

    move-result v0

    iget v4, v2, Lib/r;->F:I

    add-int/2addr v0, v4

    sub-int/2addr v0, v5

    div-int/2addr v0, v4

    sub-int v6, p1, v1

    div-int/2addr v6, v4

    const/4 v4, 0x0

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    add-int/2addr p1, v1

    iget v1, v2, Lib/r;->F:I

    div-int/2addr p1, v1

    sub-int/2addr v0, v5

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v2, v4, p1}, Lib/r;->a(II)V

    iget v0, v2, Lib/r;->w:I

    iget v1, v2, Lib/r;->F:I

    div-int/2addr v0, v1

    :goto_1
    if-gt v4, p1, :cond_4

    sub-int v1, v4, v0

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Lib/r;->I:Ljava/util/ArrayList;

    invoke-virtual {v3, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lc5/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v4, v2}, Lc5/a;-><init>(Ljava/lang/Object;II)V

    iget-object v2, p0, Lib/n;->x:Ljava/util/concurrent/Executor;

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method
