.class public abstract Lo52/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;",
        "currentCycleMetadata",
        "Lm02/c;",
        "a",
        "(Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)Lm02/c;",
        "realtime-activity_release"
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
.method public static final a(Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)Lm02/c;
    .locals 12

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;->getCycleMetadata()Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;

    move-result-object p0

    new-instance v1, Lm02/c;

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;->getCycleId()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;->getStrain()Lcom/whoop/data/remote/domain/dto/StrainDataDto;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/StrainDataDto;->getScaledStrain()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_0
    move-object v6, v0

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataDto;->getSleep()Lcom/whoop/data/remote/domain/dto/SleepDataDto;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/SleepDataDto;->getRecoveryScore()I

    move-result p0

    :goto_0
    move v7, p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v4, ""

    const-string v5, ""

    const-wide/16 v8, 0x0

    invoke-direct/range {v1 .. v11}, Lm02/c;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;IJZI)V

    return-object v1

    :cond_2
    return-object v0
.end method
