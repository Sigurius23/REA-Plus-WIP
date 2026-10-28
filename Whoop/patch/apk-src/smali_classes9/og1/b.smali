.class public abstract Log1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "Lcom/whoop/connectivityCore/firmware/models/ChipDetails;",
        "",
        "Ltg1/b;",
        "",
        "d",
        "(Ljava/util/List;)Ljava/util/Map;",
        "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;",
        "Ltg1/a;",
        "c",
        "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;)Ltg1/a;",
        "firmware-update-service_release"
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
.method public static final synthetic a(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;)Ltg1/a;
    .locals 0

    invoke-static {p0}, Log1/b;->c(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;)Ltg1/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/util/List;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Log1/b;->d(Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;)Ltg1/a;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->getSerializedValue()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ltg1/a;->UNKNOWN:Ltg1/a;

    invoke-static {}, Ltg1/a;->values()[Ltg1/a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-interface {v4}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    return-object v0

    :cond_2
    return-object v4
.end method

.method private static final d(Ljava/util/List;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/connectivityCore/firmware/models/ChipDetails;",
            ">;)",
            "Ljava/util/Map<",
            "Ltg1/b;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;

    invoke-virtual {v2}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;->getWhoopChip()Lht0/a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ltg1/b;->UNKNOWN:Ltg1/b;

    invoke-static {}, Ltg1/b;->values()[Ltg1/b;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-interface {v8}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_2

    goto :goto_3

    :cond_2
    move-object v4, v8

    :goto_3
    invoke-virtual {v2}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method
