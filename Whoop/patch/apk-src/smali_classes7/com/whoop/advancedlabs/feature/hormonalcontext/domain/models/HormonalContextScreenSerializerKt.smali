.class public final Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toHormonalContextScreenId",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;",
        "",
        "advanced-labs_release"
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
.method public static final toHormonalContextScreenId(Ljava/lang/String;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->UNKNOWN:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    invoke-static {}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->values()[Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

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
