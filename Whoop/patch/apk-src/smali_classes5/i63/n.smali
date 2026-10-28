.class public final Li63/n;
.super Lal/a;
.source "SourceFile"


# virtual methods
.method public final E0(Ljava/lang/String;)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li63/r;->a:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v2, 0x1

    const/16 v5, 0x20

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-lez v5, :cond_0

    const-string v5, "\"(),/:;<=>?@[\\]{}"

    invoke-static {v5, v3, v0}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v3

    if-nez v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/http/IllegalHeaderNameException;

    invoke-direct {v0, p1, v2}, Lio/ktor/http/IllegalHeaderNameException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    return-void
.end method

.method public final F0(Ljava/lang/String;)V
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li63/r;->a:Ljava/util/List;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v3, v1, 0x1

    const/16 v4, 0x20

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-gez v4, :cond_1

    const/16 v4, 0x9

    if-ne v2, v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/ktor/http/IllegalHeaderValueException;

    invoke-direct {v0, p1, v1}, Lio/ktor/http/IllegalHeaderValueException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    move v1, v3

    goto :goto_0

    :cond_2
    return-void
.end method
