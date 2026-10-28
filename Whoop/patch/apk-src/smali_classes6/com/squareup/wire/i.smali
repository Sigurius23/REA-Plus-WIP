.class public final Lcom/squareup/wire/i;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final a:Lcom/squareup/wire/h;


# direct methods
.method public constructor <init>(Lcom/squareup/wire/q;Lcom/squareup/wire/q;)V
    .locals 8

    const-string v0, "keyAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ljava/util/Map;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p2}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v6

    sget-object v7, Lm83/z;->w:Lm83/z;

    sget-object v3, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    new-instance v0, Lcom/squareup/wire/h;

    invoke-direct {v0, p1, p2}, Lcom/squareup/wire/h;-><init>(Lcom/squareup/wire/q;Lcom/squareup/wire/q;)V

    iput-object v0, v2, Lcom/squareup/wire/i;->a:Lcom/squareup/wire/h;

    return-void
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 8

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/squareup/wire/i;->a:Lcom/squareup/wire/h;

    iget-object v1, v0, Lcom/squareup/wire/h;->a:Lcom/squareup/wire/q;

    invoke-virtual {v1}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Lcom/squareup/wire/h;->b:Lcom/squareup/wire/q;

    invoke-virtual {v2}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v4

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_2

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/squareup/wire/h;->a:Lcom/squareup/wire/q;

    invoke-virtual {v1, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v4, v5}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    if-eqz v1, :cond_4

    if-eqz v3, :cond_3

    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Map entry with null value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Map entry with null key"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/Map;

    .line 2
    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Repeated values can only be encoded with a tag."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 4
    check-cast p2, Ljava/util/Map;

    .line 5
    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Repeated values can only be encoded with a tag."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p3, Ljava/util/Map;

    .line 2
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4
    iget-object v1, p0, Lcom/squareup/wire/i;->a:Lcom/squareup/wire/h;

    invoke-virtual {v1, p1, p2, v0}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V
    .locals 4

    .line 5
    check-cast p3, Ljava/util/Map;

    .line 6
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 8
    new-array v1, v0, [Ljava/util/Map$Entry;

    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    .line 9
    check-cast p3, [Ljava/util/Map$Entry;

    invoke-static {p3}, Lm83/n;->J0([Ljava/lang/Object;)V

    array-length v1, p3

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p3, v0

    .line 10
    iget-object v3, p0, Lcom/squareup/wire/i;->a:Lcom/squareup/wire/h;

    invoke-virtual {v3, p1, p2, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ljava/util/Map;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Repeated values can only be sized with a tag."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final encodedSizeWithTag(ILjava/lang/Object;)I
    .locals 3

    check-cast p2, Ljava/util/Map;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    iget-object v2, p0, Lcom/squareup/wire/i;->a:Lcom/squareup/wire/h;

    invoke-virtual {v2, p1, v1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/util/Map;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/z;->w:Lm83/z;

    return-object p1
.end method
