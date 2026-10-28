.class public final Lcom/squareup/wire/o;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final a:Lcom/squareup/wire/q;


# direct methods
.method public constructor <init>(Lcom/squareup/wire/q;)V
    .locals 8

    const-class v0, Ljava/util/List;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p1}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v6

    sget-object v7, Lm83/y;->w:Lm83/y;

    sget-object v3, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    iput-object p1, v2, Lcom/squareup/wire/o;->a:Lcom/squareup/wire/q;

    return-void
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 1

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/squareup/wire/o;->a:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Ljava/util/List;

    .line 2
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lcom/squareup/wire/o;->a:Lcom/squareup/wire/q;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lcom/squareup/wire/q;->encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 3

    .line 5
    check-cast p2, Ljava/util/List;

    .line 6
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    .line 8
    iget-object v1, p0, Lcom/squareup/wire/o;->a:Lcom/squareup/wire/q;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/squareup/wire/q;->encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p3, Ljava/util/List;

    .line 2
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 3
    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V
    .locals 1

    .line 5
    check-cast p3, Ljava/util/List;

    .line 6
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 7
    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Ljava/util/List;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lcom/squareup/wire/o;->a:Lcom/squareup/wire/q;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/squareup/wire/q;->encodedSize(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public final encodedSizeWithTag(ILjava/lang/Object;)I
    .locals 1

    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/util/List;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
