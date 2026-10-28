.class public final Llg3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# instance fields
.field public final w:[Llg3/f;

.field public final x:Z


# direct methods
.method public constructor <init>(ZLjava/util/ArrayList;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Llg3/f;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Llg3/f;

    invoke-direct {p0, p2, p1}, Llg3/e;-><init>([Llg3/f;Z)V

    return-void
.end method

.method public constructor <init>([Llg3/f;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llg3/e;->w:[Llg3/f;

    .line 4
    iput-boolean p2, p0, Llg3/e;->x:Z

    return-void
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 7

    iget-object v0, p1, Llg3/q;->f:Ljava/io/Serializable;

    check-cast v0, Ljava/util/ArrayList;

    iget-boolean v1, p0, Llg3/e;->x:Z

    iget-object v2, p0, Llg3/e;->w:[Llg3/f;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Llg3/q;->c()Llg3/p;

    move-result-object v1

    new-instance v4, Llg3/p;

    iget-object v5, v1, Llg3/p;->J:Llg3/q;

    invoke-direct {v4, v5}, Llg3/p;-><init>(Llg3/q;)V

    iget-object v5, v1, Llg3/p;->F:Ljg3/o;

    iput-object v5, v4, Llg3/p;->F:Ljg3/o;

    iget-object v5, v4, Llg3/p;->G:Ljava/util/HashMap;

    iget-object v6, v1, Llg3/p;->G:Ljava/util/HashMap;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    iget-boolean v1, v1, Llg3/p;->H:Z

    iput-boolean v1, v4, Llg3/p;->H:Z

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    array-length v1, v2

    move v4, p3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v2, v3

    invoke-interface {v5, p1, p2, v4}, Llg3/f;->a(Llg3/q;Ljava/lang/CharSequence;I)I

    move-result v4

    if-gez v4, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return p3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x2

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return v4

    :cond_2
    array-length v0, v2

    :goto_1
    if-ge v3, v0, :cond_4

    aget-object v1, v2, v3

    invoke-interface {v1, p1, p2, p3}, Llg3/f;->a(Llg3/q;Ljava/lang/CharSequence;I)I

    move-result p3

    if-gez p3, :cond_3

    return p3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return p3
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 7

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    iget-boolean v2, p0, Llg3/e;->x:Z

    if-eqz v2, :cond_0

    iget v3, p1, Lab/h0;->x:I

    add-int/2addr v3, v1

    iput v3, p1, Lab/h0;->x:I

    :cond_0
    :try_start_0
    iget-object v3, p0, Llg3/e;->w:[Llg3/f;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    invoke-interface {v6, p1, p2}, Llg3/f;->b(Lab/h0;Ljava/lang/StringBuilder;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    :goto_1
    iget p2, p1, Lab/h0;->x:I

    sub-int/2addr p2, v1

    iput p2, p1, Lab/h0;->x:I

    return v1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :goto_2
    if-eqz v2, :cond_4

    iget v0, p1, Lab/h0;->x:I

    sub-int/2addr v0, v1

    iput v0, p1, Lab/h0;->x:I

    :cond_4
    throw p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llg3/e;->w:[Llg3/f;

    if-eqz v1, :cond_3

    iget-boolean v2, p0, Llg3/e;->x:Z

    if-eqz v2, :cond_0

    const-string v3, "["

    goto :goto_0

    :cond_0
    const-string v3, "("

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    const-string v1, "]"

    goto :goto_2

    :cond_2
    const-string v1, ")"

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
