.class public final Lad3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Lyc3/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "serialName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    move-object v3, p1

    move v2, v1

    move v4, v2

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_5

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v6

    const/16 v7, 0x5f

    if-eqz v6, :cond_2

    if-nez v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_0

    invoke-static {v0}, Lyb3/r;->j0(Ljava/lang/CharSequence;)C

    move-result v6

    if-eq v6, v7, :cond_0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_4

    const/4 v6, 0x1

    if-le v4, v6, :cond_3

    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object v3, p1

    move v4, v1

    :cond_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase"

    return-object v0
.end method
