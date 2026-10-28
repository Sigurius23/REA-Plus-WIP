.class public final Lj23/b;
.super Lfc/a;
.source "SourceFile"


# instance fields
.field public final c:Landroid/util/SparseArray;

.field public d:Landroid/util/SparseArray;

.field public final e:Landroid/content/Context;

.field public final f:Li23/a;

.field public final g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Li23/a;Z)V
    .locals 1

    const-string v0, "imageLoader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lfc/a;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lj23/b;->c:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lj23/b;->d:Landroid/util/SparseArray;

    iput-object p1, p0, Lj23/b;->e:Landroid/content/Context;

    iput-object p3, p0, Lj23/b;->f:Li23/a;

    iput-boolean p4, p0, Lj23/b;->g:Z

    iput-object p2, p0, Lj23/b;->h:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lj23/b;->i:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    const-string p2, "item"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p3, Lj23/a;

    if-eqz p2, :cond_0

    check-cast p3, Lj23/a;

    iget-object p2, p3, Lj23/a;->a:Lio/getstream/photoview/PhotoView;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 p1, 0x0

    iput-boolean p1, p3, Lj23/a;->c:Z

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lj23/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x2

    return p1
.end method

.method public final h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lj23/b;->c:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh23/a;

    if-nez v2, :cond_0

    new-instance v2, Lh23/a;

    invoke-direct {v2, p0}, Lh23/a;-><init>(Lj23/b;)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    iget-object v0, v2, Lh23/a;->b:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    if-ge v1, v3, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj23/a;

    iget-boolean v5, v3, Lj23/a;->c:Z

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, v2, Lh23/a;->a:Lj23/b;

    new-instance v2, Lio/getstream/photoview/PhotoView;

    iget-object v3, v1, Lj23/b;->e:Landroid/content/Context;

    const/4 v5, 0x6

    invoke-direct {v2, v3, v4, v5}, Lio/getstream/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iget-boolean v3, v1, Lj23/b;->g:Z

    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    new-instance v3, Lhn/p;

    const/16 v5, 0x15

    invoke-direct {v3, v2, v5}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Lio/getstream/photoview/PhotoView;->setOnViewDragListener(Lc23/h;)V

    new-instance v3, Lj23/a;

    invoke-direct {v3, v1, v2}, Lj23/a;-><init>(Lj23/b;Lio/getstream/photoview/PhotoView;)V

    iget-object v1, v1, Lj23/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, v3, Lj23/a;->a:Lio/getstream/photoview/PhotoView;

    const/4 v1, 0x1

    iput-boolean v1, v3, Lj23/a;->c:Z

    iput p2, v3, Lj23/a;->b:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput p2, v3, Lj23/a;->b:I

    iget-object p1, v3, Lj23/a;->e:Lj23/b;

    iget-object v1, p1, Lj23/b;->f:Li23/a;

    iget-object v2, v3, Lj23/a;->d:Lio/getstream/photoview/PhotoView;

    iget-object p1, p1, Lj23/b;->h:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Li23/a;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    iget-object p1, p0, Lj23/b;->d:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    if-eqz p1, :cond_3

    instance-of p2, p1, Landroid/os/Bundle;

    if-eqz p2, :cond_3

    check-cast p1, Landroid/os/Bundle;

    const-string p2, "a"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v4

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v0, v4}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :cond_4
    return-object v3
.end method

.method public final i(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lj23/a;

    if-eqz v0, :cond_0

    check-cast p2, Lj23/a;

    iget-object p2, p2, Lj23/a;->a:Lio/getstream/photoview/PhotoView;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 2

    if-eqz p1, :cond_1

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v0, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string v1, "b"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    :cond_0
    iput-object v0, p0, Lj23/b;->d:Landroid/util/SparseArray;

    :cond_1
    invoke-super {p0, p1, p2}, Lfc/a;->l(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public final m()Landroid/os/Parcelable;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lj23/b;->c:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ne v2, v4, :cond_2

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->keyAt(I)I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh23/a;

    iget-object v4, v4, Lh23/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj23/a;

    iget-boolean v6, v5, Lj23/a;->c:Z

    if-eqz v6, :cond_0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj23/a;

    iget-object v2, p0, Lj23/b;->d:Landroid/util/SparseArray;

    iget v3, v1, Lj23/a;->b:I

    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    iget-object v1, v1, Lj23/a;->a:Lio/getstream/photoview/PhotoView;

    invoke-virtual {v1, v4}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v5, "a"

    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "b"

    iget-object v2, p0, Lj23/b;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method
