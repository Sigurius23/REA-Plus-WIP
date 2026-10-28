.class public final Lcom/whoop/data/remote/domain/response/growth/UserStrapsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "toDomainModel",
        "Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;",
        "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;",
        "Lcom/whoop/data/remote/domain/response/growth/UserStraps;",
        "Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;)Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;->getGeneration()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;->UNKNOWN:Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    .line 2
    invoke-static {}, Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;->values()[Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;

    move-result-object v2

    .line 3
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 4
    invoke-interface {v5}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    .line 5
    :goto_2
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;->getSerial()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;->getFirstSeen()Ljava/lang/String;

    move-result-object p0

    .line 7
    new-instance v2, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    invoke-direct {v2, v1, v0, p0}, Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;-><init>(Lcom/whoop/data/remote/domain/response/growth/StrapGeneration;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public static final toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;)Lcom/whoop/data/remote/domain/response/growth/UserStraps;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;->getLastSeenStrap()Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/data/remote/domain/response/growth/UserStrapsKt;->toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;)Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 9
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;->getOrderedStrap()Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lcom/whoop/data/remote/domain/response/growth/UserStrapsKt;->toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;)Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    move-result-object v1

    .line 10
    :cond_1
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto;->getPreviousStraps()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast p0, Ljava/lang/Iterable;

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 13
    check-cast v3, Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;

    .line 14
    invoke-static {v3}, Lcom/whoop/data/remote/domain/response/growth/UserStrapsKt;->toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/UserStrapsDto$StrapDto;)Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;

    move-result-object v3

    .line 15
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 16
    :cond_3
    new-instance p0, Lcom/whoop/data/remote/domain/response/growth/UserStraps;

    invoke-direct {p0, v0, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/UserStraps;-><init>(Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;Lcom/whoop/data/remote/domain/response/growth/UserStraps$Strap;Ljava/util/List;)V

    return-object p0
.end method
