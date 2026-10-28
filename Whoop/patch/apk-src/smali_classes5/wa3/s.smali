.class public final Lwa3/s;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lwa3/t;


# static fields
.field public static final x:Lwa3/j0;


# instance fields
.field public final w:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwa3/s;

    invoke-direct {v0}, Lwa3/s;-><init>()V

    new-instance v1, Lwa3/j0;

    invoke-direct {v1, v0}, Lwa3/j0;-><init>(Lwa3/s;)V

    sput-object v1, Lwa3/s;->x:Lwa3/j0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Lwa3/t;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    .line 5
    invoke-virtual {p0, p1}, Lwa3/s;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final S0(Lwa3/u;)V
    .locals 1

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 3
    instance-of v0, p2, Lwa3/t;

    if-eqz v0, :cond_0

    check-cast p2, Lwa3/t;

    invoke-interface {p2}, Lwa3/t;->b()Ljava/util/List;

    move-result-object p2

    .line 4
    :cond_0
    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    move-result p1

    .line 5
    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2
    invoke-virtual {p0, v0, p1}, Lwa3/s;->addAll(ILjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b0(I)Lwa3/e;
    .locals 6

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lwa3/e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwa3/e;

    goto :goto_0

    :cond_0
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    :try_start_0
    new-instance v3, Lwa3/u;

    const-string v4, "UTF-8"

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v3, v2}, Lwa3/u;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UTF-8 not supported?"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    move-object v2, v1

    check-cast v2, [B

    array-length v3, v2

    new-array v4, v3, [B

    const/4 v5, 0x0

    invoke-static {v2, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Lwa3/u;

    invoke-direct {v2, v4}, Lwa3/u;-><init>([B)V

    :goto_0
    if-eq v2, v1, :cond_2

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v2
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    return-object v1

    :cond_0
    instance-of v2, v1, Lwa3/e;

    if-eqz v2, :cond_2

    check-cast v1, Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lwa3/e;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v2

    :cond_2
    check-cast v1, [B

    invoke-static {v1}, Lwa3/r;->b([B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lwa3/r;->a([B)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final k()Lwa3/j0;
    .locals 1

    new-instance v0, Lwa3/j0;

    invoke-direct {v0, p0}, Lwa3/j0;-><init>(Lwa3/s;)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    instance-of v0, p1, Lwa3/e;

    if-eqz v0, :cond_1

    check-cast p1, Lwa3/e;

    invoke-virtual {p1}, Lwa3/e;->q()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast p1, [B

    invoke-static {p1}, Lwa3/r;->b([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    instance-of p2, p1, Lwa3/e;

    if-eqz p2, :cond_1

    check-cast p1, Lwa3/e;

    invoke-virtual {p1}, Lwa3/e;->q()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast p1, [B

    invoke-static {p1}, Lwa3/r;->b([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
