.class public Landroidx/lifecycle/t0;
.super Landroidx/lifecycle/u0;
.source "SourceFile"


# instance fields
.field public final a:Lu/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    .line 4
    new-instance v0, Lu/f;

    invoke-direct {v0}, Lu/f;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t0;->a:Lu/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/lifecycle/p0;-><init>(Ljava/lang/Object;)V

    .line 2
    new-instance p1, Lu/f;

    invoke-direct {p1}, Lu/f;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/t0;->a:Lu/f;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V
    .locals 3

    if-eqz p1, :cond_4

    new-instance v0, Landroidx/lifecycle/s0;

    invoke-direct {v0, p1, p2}, Landroidx/lifecycle/s0;-><init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    iget-object v1, p0, Landroidx/lifecycle/t0;->a:Lu/f;

    invoke-virtual {v1, p1, v0}, Lu/f;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s0;

    if-eqz v1, :cond_1

    iget-object v2, v1, Landroidx/lifecycle/s0;->x:Landroidx/lifecycle/v0;

    if-ne v2, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This source was already added with the different observer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/lifecycle/p0;->hasActiveObservers()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1, v0}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    :cond_3
    :goto_1
    return-void

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Landroidx/lifecycle/p0;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/t0;->a:Lu/f;

    invoke-virtual {v0, p1}, Lu/f;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/s0;

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/s0;->w:Landroidx/lifecycle/p0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    :cond_0
    return-void
.end method

.method public onActive()V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t0;->a:Lu/f;

    invoke-virtual {v0}, Lu/f;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v1, v0

    check-cast v1, Lu/b;

    invoke-virtual {v1}, Lu/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lu/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s0;

    iget-object v2, v1, Landroidx/lifecycle/s0;->w:Landroidx/lifecycle/p0;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onInactive()V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t0;->a:Lu/f;

    invoke-virtual {v0}, Lu/f;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v1, v0

    check-cast v1, Lu/b;

    invoke-virtual {v1}, Lu/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lu/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s0;

    iget-object v2, v1, Landroidx/lifecycle/s0;->w:Landroidx/lifecycle/p0;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

    goto :goto_0

    :cond_0
    return-void
.end method
