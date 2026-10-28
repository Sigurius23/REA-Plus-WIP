.class public final Lcom/squareup/wire/h;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final a:Lcom/squareup/wire/q;

.field public final b:Lcom/squareup/wire/q;


# direct methods
.method public constructor <init>(Lcom/squareup/wire/q;Lcom/squareup/wire/q;)V
    .locals 4

    const-string v0, "keyAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ljava/util/Map$Entry;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v2

    sget-object v3, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;)V

    iput-object p1, p0, Lcom/squareup/wire/h;->a:Lcom/squareup/wire/q;

    iput-object p2, p0, Lcom/squareup/wire/h;->b:Lcom/squareup/wire/q;

    return-void
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 1

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Ljava/util/Map$Entry;

    .line 2
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/wire/h;->a:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1, v0, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    const/4 v0, 0x2

    .line 4
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    iget-object v1, p0, Lcom/squareup/wire/h;->b:Lcom/squareup/wire/q;

    invoke-virtual {v1, p1, v0, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    return-void
.end method

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 3

    .line 5
    check-cast p2, Ljava/util/Map$Entry;

    .line 6
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 7
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/wire/h;->b:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1, v0, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    const/4 v0, 0x1

    .line 8
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    iget-object v1, p0, Lcom/squareup/wire/h;->a:Lcom/squareup/wire/q;

    invoke-virtual {v1, p1, v0, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    return-void
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/wire/h;->a:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0, v1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object v2, p0, Lcom/squareup/wire/h;->b:Lcom/squareup/wire/q;

    invoke-virtual {v2, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
