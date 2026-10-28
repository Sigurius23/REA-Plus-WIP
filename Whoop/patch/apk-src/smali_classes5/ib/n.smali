.class public abstract Lib/n;
.super Ljava/util/AbstractList;
.source "SourceFile"


# static fields
.field public static final synthetic K:I


# instance fields
.field public E:I

.field public F:Ljava/lang/Object;

.field public G:I

.field public H:I

.field public final I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final J:Ljava/util/ArrayList;

.field public final w:Ljava/util/concurrent/Executor;

.field public final x:Ljava/util/concurrent/Executor;

.field public final y:Lib/m;

.field public final z:Lib/r;


# direct methods
.method public constructor <init>(Lib/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lib/m;)V
    .locals 2

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lib/n;->E:I

    const/4 v1, 0x0

    iput-object v1, p0, Lib/n;->F:Ljava/lang/Object;

    const v1, 0x7fffffff

    iput v1, p0, Lib/n;->G:I

    const/high16 v1, -0x80000000

    iput v1, p0, Lib/n;->H:I

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lib/n;->J:Ljava/util/ArrayList;

    iput-object p1, p0, Lib/n;->z:Lib/r;

    iput-object p2, p0, Lib/n;->w:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lib/n;->x:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lib/n;->y:Lib/m;

    iget p1, p4, Lib/m;->b:I

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lib/n;->p(II)V

    return-void
.end method

.method public final c(Ljava/util/List;Lib/a;)V
    .locals 2

    if-eqz p1, :cond_1

    if-eq p1, p0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lib/n;->z:Lib/r;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lib/r;->size()I

    move-result p1

    iget-object v0, p2, Lib/a;->a:Lib/c;

    iget-object v0, v0, Lib/c;->a:Landroidx/recyclerview/widget/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/c;->a(II)V

    goto :goto_0

    :cond_0
    check-cast p1, Lib/n;

    invoke-virtual {p0, p1, p2}, Lib/n;->e(Lib/n;Lib/a;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lib/n;->J:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lib/a;

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public abstract e(Lib/n;Lib/a;)V
.end method

.method public abstract f()Lib/j;
.end method

.method public abstract g()Ljava/lang/Object;
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lib/n;->z:Lib/r;

    invoke-virtual {v0, p1}, Lib/r;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lib/n;->F:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public abstract j()Z
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    invoke-virtual {p0}, Lib/n;->l()Z

    move-result v0

    return v0
.end method

.method public final n(I)V
    .locals 4

    iget-object v0, p0, Lib/n;->z:Lib/r;

    if-ltz p1, :cond_0

    invoke-virtual {v0}, Lib/r;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    iget v0, v0, Lib/r;->z:I

    add-int/2addr v0, p1

    iput v0, p0, Lib/n;->E:I

    invoke-virtual {p0, p1}, Lib/n;->o(I)V

    iget v0, p0, Lib/n;->G:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lib/n;->G:I

    iget v0, p0, Lib/n;->H:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lib/n;->H:I

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Index: "

    const-string v3, ", Size: "

    invoke-static {p1, v2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Lib/r;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public abstract o(I)V
.end method

.method public final p(II)V
    .locals 4

    if-eqz p2, :cond_1

    iget-object v0, p0, Lib/n;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib/a;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lib/a;->a:Lib/c;

    iget-object v2, v2, Lib/c;->a:Landroidx/recyclerview/widget/c;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, p2, v3}, Landroidx/recyclerview/widget/c;->c(IILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final q(II)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Lib/n;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib/a;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lib/a;->a:Lib/c;

    iget-object v2, v2, Lib/c;->a:Landroidx/recyclerview/widget/c;

    invoke-virtual {v2, p1, p2}, Landroidx/recyclerview/widget/c;->a(II)V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final r(Lib/a;)V
    .locals 3

    iget-object v0, p0, Lib/n;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib/a;

    if-eqz v2, :cond_0

    if-ne v2, p1, :cond_1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lib/n;->z:Lib/r;

    invoke-virtual {v0}, Lib/r;->size()I

    move-result v0

    return v0
.end method
