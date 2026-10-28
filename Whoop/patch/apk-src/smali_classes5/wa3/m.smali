.class public abstract Lwa3/m;
.super Lwa3/p;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public final w:Lwa3/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lwa3/j;

    invoke-direct {v0}, Lwa3/j;-><init>()V

    .line 3
    iput-object v0, p0, Lwa3/m;->w:Lwa3/j;

    return-void
.end method

.method public constructor <init>(Lwa3/l;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-object v0, p1, Lwa3/l;->x:Lwa3/j;

    .line 6
    invoke-virtual {v0}, Lwa3/j;->f()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p1, Lwa3/l;->y:Z

    .line 8
    iget-object p1, p1, Lwa3/l;->x:Lwa3/j;

    .line 9
    iput-object p1, p0, Lwa3/m;->w:Lwa3/j;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 4

    iget-object v0, p0, Lwa3/m;->w:Lwa3/j;

    iget-object v0, v0, Lwa3/j;->a:Lwa3/a0;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, v0, Lwa3/a0;->x:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lwa3/a0;->x:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-static {v3}, Lwa3/j;->e(Ljava/util/Map$Entry;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lwa3/a0;->c()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lwa3/j;->e(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    :goto_1
    return v1

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final j()I
    .locals 5

    iget-object v0, p0, Lwa3/m;->w:Lwa3/j;

    iget-object v0, v0, Lwa3/j;->a:Lwa3/a0;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, v0, Lwa3/a0;->x:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    iget-object v3, v0, Lwa3/a0;->x:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/n;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3}, Lwa3/j;->d(Lwa3/n;Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lwa3/a0;->c()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/n;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Lwa3/j;->d(Lwa3/n;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v2, v1

    goto :goto_1

    :cond_1
    return v2
.end method

.method public final k(Lwa3/o;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, Lwa3/m;->o(Lwa3/o;)V

    iget-object v0, p1, Lwa3/o;->d:Lwa3/n;

    iget-object v1, p0, Lwa3/m;->w:Lwa3/j;

    iget-object v1, v1, Lwa3/j;->a:Lwa3/a0;

    invoke-virtual {v1, v0}, Lwa3/a0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object p1, p1, Lwa3/o;->b:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-boolean v2, v0, Lwa3/n;->y:Z

    if-eqz v2, :cond_3

    iget-object v0, v0, Lwa3/n;->x:Lwa3/o0;

    iget-object v0, v0, Lwa3/o0;->w:Lwa3/p0;

    sget-object v2, Lwa3/p0;->I:Lwa3/p0;

    if-ne v0, v2, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Lwa3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    return-object v1

    :cond_3
    invoke-virtual {p1, v1}, Lwa3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lwa3/o;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lwa3/m;->o(Lwa3/o;)V

    iget-object p1, p1, Lwa3/o;->d:Lwa3/n;

    iget-object v0, p0, Lwa3/m;->w:Lwa3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v1, p1, Lwa3/n;->y:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Lwa3/j;->a:Lwa3/a0;

    invoke-virtual {v0, p1}, Lwa3/a0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "hasField() can only be called on non-repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lwa3/m;->w:Lwa3/j;

    invoke-virtual {v0}, Lwa3/j;->f()V

    return-void
.end method

.method public final n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z
    .locals 8

    invoke-interface {p0}, Lwa3/w;->a()Lwa3/v;

    move-result-object v0

    and-int/lit8 v1, p4, 0x7

    ushr-int/lit8 v2, p4, 0x3

    iget-object v3, p3, Lwa3/i;->a:Ljava/util/Map;

    new-instance v4, Lwa3/h;

    invoke-direct {v4, v0, v2}, Lwa3/h;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwa3/o;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_1

    :cond_0
    move v1, v2

    move v4, v3

    goto :goto_0

    :cond_1
    iget-object v4, v0, Lwa3/o;->d:Lwa3/n;

    iget-object v5, v4, Lwa3/n;->x:Lwa3/o0;

    sget-object v6, Lwa3/j;->c:Lwa3/j;

    iget v6, v5, Lwa3/o0;->x:I

    if-ne v1, v6, :cond_2

    move v1, v3

    move v4, v1

    goto :goto_0

    :cond_2
    iget-boolean v4, v4, Lwa3/n;->y:Z

    if-eqz v4, :cond_0

    invoke-virtual {v5}, Lwa3/o0;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x2

    if-ne v1, v4, :cond_0

    move v4, v2

    move v1, v3

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p1, p4, p2}, Lwa3/f;->r(ILwa3/g;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p2, 0x0

    iget-object p4, p0, Lwa3/m;->w:Lwa3/j;

    if-eqz v4, :cond_7

    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result p3

    invoke-virtual {p1, p3}, Lwa3/f;->e(I)I

    move-result p3

    iget-object v0, v0, Lwa3/o;->d:Lwa3/n;

    iget-object v1, v0, Lwa3/n;->x:Lwa3/o0;

    sget-object v3, Lwa3/o0;->G:Lwa3/o0;

    if-ne v1, v3, :cond_5

    invoke-virtual {p1}, Lwa3/f;->c()I

    move-result p4

    if-gtz p4, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lwa3/f;->l()I

    throw p2

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lwa3/f;->c()I

    move-result p2

    if-lez p2, :cond_6

    iget-object p2, v0, Lwa3/n;->x:Lwa3/o0;

    invoke-static {p1, p2}, Lwa3/j;->h(Lwa3/f;Lwa3/o0;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p4, v0, p2}, Lwa3/j;->a(Lwa3/n;Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    :goto_2
    invoke-virtual {p1, p3}, Lwa3/f;->d(I)V

    return v2

    :cond_7
    iget-object v1, v0, Lwa3/o;->d:Lwa3/n;

    iget-object v4, v1, Lwa3/n;->x:Lwa3/o0;

    iget-boolean v5, v1, Lwa3/n;->y:Z

    iget-object v6, v4, Lwa3/o0;->w:Lwa3/p0;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x7

    if-eq v6, v7, :cond_d

    const/16 v7, 0x8

    if-eq v6, v7, :cond_8

    invoke-static {p1, v4}, Lwa3/j;->h(Lwa3/f;Lwa3/o0;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :cond_8
    if-nez v5, :cond_9

    iget-object v6, p4, Lwa3/j;->a:Lwa3/a0;

    invoke-virtual {v6, v1}, Lwa3/a0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwa3/v;

    if-eqz v6, :cond_9

    invoke-interface {v6}, Lwa3/v;->c()Lwa3/k;

    move-result-object p2

    :cond_9
    if-nez p2, :cond_a

    iget-object p2, v0, Lwa3/o;->c:Lwa3/v;

    invoke-interface {p2}, Lwa3/v;->e()Lwa3/k;

    move-result-object p2

    :cond_a
    sget-object v6, Lwa3/o0;->E:Lwa3/l0;

    if-ne v4, v6, :cond_b

    iget v3, v1, Lwa3/n;->w:I

    invoke-virtual {p1}, Lwa3/f;->b()V

    iget v4, p1, Lwa3/f;->i:I

    add-int/2addr v4, v2

    iput v4, p1, Lwa3/f;->i:I

    invoke-virtual {p2, p1, p3}, Lwa3/k;->h(Lwa3/f;Lwa3/i;)Lwa3/k;

    shl-int/lit8 p3, v3, 0x3

    or-int/lit8 p3, p3, 0x4

    invoke-virtual {p1, p3}, Lwa3/f;->a(I)V

    iget p3, p1, Lwa3/f;->i:I

    sub-int/2addr p3, v2

    iput p3, p1, Lwa3/f;->i:I

    goto :goto_3

    :cond_b
    invoke-virtual {p1}, Lwa3/f;->l()I

    move-result v4

    invoke-virtual {p1}, Lwa3/f;->b()V

    invoke-virtual {p1, v4}, Lwa3/f;->e(I)I

    move-result v4

    iget v6, p1, Lwa3/f;->i:I

    add-int/2addr v6, v2

    iput v6, p1, Lwa3/f;->i:I

    invoke-virtual {p2, p1, p3}, Lwa3/k;->h(Lwa3/f;Lwa3/i;)Lwa3/k;

    invoke-virtual {p1, v3}, Lwa3/f;->a(I)V

    iget p3, p1, Lwa3/f;->i:I

    sub-int/2addr p3, v2

    iput p3, p1, Lwa3/f;->i:I

    invoke-virtual {p1, v4}, Lwa3/f;->d(I)V

    :goto_3
    invoke-virtual {p2}, Lwa3/k;->g()Lwa3/v;

    move-result-object p1

    :goto_4
    if-eqz v5, :cond_c

    invoke-virtual {v0, p1}, Lwa3/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p4, v1, p1}, Lwa3/j;->a(Lwa3/n;Ljava/lang/Object;)V

    return v2

    :cond_c
    invoke-virtual {v0, p1}, Lwa3/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p4, v1, p1}, Lwa3/j;->i(Lwa3/n;Ljava/lang/Object;)V

    return v2

    :cond_d
    invoke-virtual {p1}, Lwa3/f;->l()I

    throw p2
.end method

.method public final o(Lwa3/o;)V
    .locals 1

    iget-object p1, p1, Lwa3/o;->a:Lwa3/v;

    invoke-interface {p0}, Lwa3/w;->a()Lwa3/v;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
