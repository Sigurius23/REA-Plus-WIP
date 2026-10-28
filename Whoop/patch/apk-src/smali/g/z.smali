.class public final Lg/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lm83/m;

.field public c:Lg/t;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/z;->a:Ljava/lang/Runnable;

    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lg/z;->b:Lm83/m;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    new-instance p1, Lg/u;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lg/u;-><init>(Lg/z;I)V

    new-instance v0, Lg/u;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lg/u;-><init>(Lg/z;I)V

    new-instance v1, Lg/v;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lg/v;-><init>(Lg/z;I)V

    new-instance v2, Lg/v;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lg/v;-><init>(Lg/z;I)V

    new-instance v3, Lg/w;

    invoke-direct {v3, p1, v0, v1, v2}, Lg/w;-><init>(Lg/u;Lg/u;Lg/v;Lg/v;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lav/b;

    const/16 v0, 0x12

    invoke-direct {p1, p0, v0}, Lav/b;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lc4/u;

    const/4 v0, 0x2

    invoke-direct {v3, p1, v0}, Lc4/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    iput-object v3, p0, Lg/z;->d:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/g0;Lg/t;)V
    .locals 9

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lg/x;

    invoke-direct {v0, p0, p1, p2}, Lg/x;-><init>(Lg/z;Landroidx/lifecycle/x;Lg/t;)V

    invoke-virtual {p2, v0}, Lg/t;->a(Lg/b;)V

    invoke-virtual {p0}, Lg/z;->f()V

    new-instance v1, Landroidx/room/u0;

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/4 v2, 0x0

    const-class v4, Lg/z;

    const-string v5, "updateEnabledCallbacks"

    const-string v6, "updateEnabledCallbacks()V"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/room/u0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {p2, v1}, Lg/t;->k(Lc93/a;)V

    return-void
.end method

.method public final b(Lg/t;)Lg/y;
    .locals 9

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg/z;->b:Lm83/m;

    invoke-virtual {v0, p1}, Lm83/m;->addLast(Ljava/lang/Object;)V

    new-instance v0, Lg/y;

    invoke-direct {v0, p0, p1}, Lg/y;-><init>(Lg/z;Lg/t;)V

    invoke-virtual {p1, v0}, Lg/t;->a(Lg/b;)V

    invoke-virtual {p0}, Lg/z;->f()V

    new-instance v1, Landroidx/room/u0;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v2, 0x0

    const-class v4, Lg/z;

    const-string v5, "updateEnabledCallbacks"

    const-string v6, "updateEnabledCallbacks()V"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/room/u0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {p1, v1}, Lg/t;->k(Lc93/a;)V

    return-object v0
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lg/z;->c:Lg/t;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lg/z;->b:Lm83/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lg/t;

    invoke-virtual {v3}, Lg/t;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Lg/t;

    :cond_2
    iput-object v1, p0, Lg/z;->c:Lg/t;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lg/t;->c()V

    :cond_3
    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lg/z;->c:Lg/t;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lg/z;->b:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lg/t;

    invoke-virtual {v3}, Lg/t;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Lg/t;

    :cond_2
    iput-object v1, p0, Lg/z;->c:Lg/t;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lg/t;->d()V

    return-void

    :cond_3
    iget-object v0, p0, Lg/z;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final e(Z)V
    .locals 3

    iget-object v0, p0, Lg/z;->e:Landroid/window/OnBackInvokedDispatcher;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lg/z;->d:Landroid/window/OnBackInvokedCallback;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lg/z;->f:Z

    if-nez v2, :cond_0

    invoke-static {v0, v1}, Lb5/c;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg/z;->f:Z

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lg/z;->f:Z

    if-eqz p1, :cond_1

    invoke-static {v0, v1}, Lb5/c;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg/z;->f:Z

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 4

    iget-boolean v0, p0, Lg/z;->g:Z

    const/4 v1, 0x0

    iget-object v2, p0, Lg/z;->b:Lm83/m;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg/t;

    invoke-virtual {v3}, Lg/t;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    iput-boolean v1, p0, Lg/z;->g:Z

    if-eq v1, v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v0, v2, :cond_3

    invoke-virtual {p0, v1}, Lg/z;->e(Z)V

    :cond_3
    return-void
.end method
