.class public abstract Lcom/squareup/wire/c;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj93/d;Lcom/squareup/wire/x;Lcom/squareup/wire/y;)V
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntax"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public decode(Lcom/squareup/wire/r;)Lcom/squareup/wire/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/r;",
            ")",
            "Lcom/squareup/wire/y;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/r;->k()I

    move-result p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/squareup/wire/c;->fromValue(I)Lcom/squareup/wire/y;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;

    invoke-virtual {p0}, Lcom/squareup/wire/q;->getType()Lj93/d;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;-><init>(ILj93/d;)V

    throw v0
.end method

.method public bridge synthetic decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/squareup/wire/c;->decode(Lcom/squareup/wire/r;)Lcom/squareup/wire/y;

    move-result-object p1

    return-object p1
.end method

.method public encode(Lcom/squareup/wire/s;Lcom/squareup/wire/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/s;",
            "Lcom/squareup/wire/y;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-interface {p2}, Lcom/squareup/wire/y;->getValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->c(I)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/squareup/wire/y;

    invoke-virtual {p0, p1, p2}, Lcom/squareup/wire/c;->encode(Lcom/squareup/wire/s;Lcom/squareup/wire/y;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lcom/squareup/wire/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/v;",
            "Lcom/squareup/wire/y;",
            ")V"
        }
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p2}, Lcom/squareup/wire/y;->getValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->h(I)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/squareup/wire/y;

    invoke-virtual {p0, p1, p2}, Lcom/squareup/wire/c;->encode(Lcom/squareup/wire/v;Lcom/squareup/wire/y;)V

    return-void
.end method

.method public encodedSize(Lcom/squareup/wire/y;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/y;",
            ")I"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lcom/squareup/wire/y;->getValue()I

    move-result p1

    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    and-int/lit16 v0, p1, -0x4000

    if-nez v0, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p1

    if-nez v0, :cond_2

    const/4 p1, 0x3

    goto :goto_0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p1, v0

    if-nez p1, :cond_3

    const/4 p1, 0x4

    goto :goto_0

    :cond_3
    const/4 p1, 0x5

    :goto_0
    return p1
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/squareup/wire/y;

    invoke-virtual {p0, p1}, Lcom/squareup/wire/c;->encodedSize(Lcom/squareup/wire/y;)I

    move-result p1

    return p1
.end method

.method public abstract fromValue(I)Lcom/squareup/wire/y;
.end method

.method public redact(Lcom/squareup/wire/y;)Lcom/squareup/wire/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/y;",
            ")",
            "Lcom/squareup/wire/y;"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/squareup/wire/y;

    invoke-virtual {p0, p1}, Lcom/squareup/wire/c;->redact(Lcom/squareup/wire/y;)Lcom/squareup/wire/y;

    move-result-object p1

    return-object p1
.end method
