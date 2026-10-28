.class public final Lm7/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/r;->a:Ljava/util/ArrayList;

    new-instance v0, Lb2/d;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lb2/d;-><init>(I)V

    invoke-static {p1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm7/q;

    iget-object v2, v2, Lm7/q;->a:Ljava/time/Instant;

    add-int/lit8 v1, v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm7/q;

    iget-object v3, v3, Lm7/q;->a:Ljava/time/Instant;

    invoke-virtual {v2, v3}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/time/Instant;Ljava/time/Instant;)Z
    .locals 7

    iget-object v0, p0, Lm7/r;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    check-cast v3, Lm7/q;

    iget-object v3, v3, Lm7/q;->a:Ljava/time/Instant;

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lm7/q;

    iget-object v5, v5, Lm7/q;->a:Ljava/time/Instant;

    invoke-virtual {v3, v5}, Ljava/time/Instant;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-lez v6, :cond_2

    move-object v2, v4

    move-object v3, v5

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    :goto_0
    check-cast v2, Lm7/q;

    iget-object v1, v2, Lm7/q;->a:Ljava/time/Instant;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v2

    check-cast v3, Lm7/q;

    iget-object v3, v3, Lm7/q;->a:Ljava/time/Instant;

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lm7/q;

    iget-object v5, v5, Lm7/q;->a:Ljava/time/Instant;

    invoke-virtual {v3, v5}, Ljava/time/Instant;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_5

    move-object v2, v4

    move-object v3, v5

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    :goto_1
    check-cast v2, Lm7/q;

    iget-object v0, v2, Lm7/q;->a:Ljava/time/Instant;

    invoke-virtual {v1, p1}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {v0, p2}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x1

    return p1

    :cond_6
    const/4 p1, 0x0

    return p1

    :cond_7
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_8
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lm7/r;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lm7/r;

    iget-object p1, p1, Lm7/r;->a:Ljava/util/ArrayList;

    iget-object v0, p0, Lm7/r;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lm7/r;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
