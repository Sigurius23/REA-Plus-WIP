.class public final Lu1/g;
.super Lm83/j;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lu1/g;->w:I

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    iput-object p1, p0, Lu1/g;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    iget v0, v0, Ln83/f;->I:I

    return v0

    :pswitch_0
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-virtual {v0}, Lu1/e;->c()I

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-virtual {v0}, Lu1/e;->c()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0}, Ln83/f;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-virtual {v0}, Lu1/e;->clear()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-virtual {v0}, Lu1/e;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0, p1}, Ln83/f;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-virtual {v0, p1}, Lu1/e;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_1
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lu1/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu1/e;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0}, Ln83/f;->isEmpty()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ln83/d;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ln83/d;-><init>(Ln83/f;I)V

    return-object v1

    :pswitch_0
    new-instance v0, Lu1/h;

    iget-object v1, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v1, Lu1/e;

    const/16 v2, 0x8

    new-array v3, v2, [Lu1/p;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    new-instance v5, Lu1/r;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lu1/r;-><init>(I)V

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {v0, v1, v3}, Lu1/f;-><init>(Lu1/e;[Lu1/p;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lm83/t;

    iget-object v1, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v1, Lu1/e;

    invoke-direct {v0, v1}, Lm83/t;-><init>(Lu1/e;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-virtual {v0, p1}, Ln83/f;->i(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ln83/f;->m(I)V

    const/4 p1, 0x1

    :goto_0
    return p1

    :pswitch_0
    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-virtual {v0, p1}, Lu1/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Lu1/e;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_1
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Lu1/e;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lu1/e;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractSet;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, Lu1/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu1/g;->x:Ljava/lang/Object;

    check-cast v0, Ln83/f;

    invoke-virtual {v0}, Ln83/f;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
