.class public final Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "toDomainModel",
        "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfo;",
        "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;",
        "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;",
        "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;",
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
.method public static final toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;)Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfo;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfo;

    .line 2
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;->getRequirePostalCode()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 3
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;->getHeader()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 4
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;->getMonthlyPlan()Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoKt;->toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;)Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 5
    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfo;-><init>(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;)V

    return-object v0

    .line 6
    :cond_1
    new-instance p0, Lcom/whoop/network/exception/DeserializationException;

    const-string v0, "SubscriptionInfoDto#monthlyPlan cannot be null"

    invoke-direct {p0, v0}, Lcom/whoop/network/exception/DeserializationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 7
    :cond_2
    new-instance p0, Lcom/whoop/network/exception/DeserializationException;

    const-string v0, "SubscriptionInfoDto#header cannot be null"

    invoke-direct {p0, v0}, Lcom/whoop/network/exception/DeserializationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final toDomainModel(Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;)Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;

    .line 9
    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;->getFooter()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 10
    invoke-direct {v0, p0}, Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlan;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 11
    :cond_0
    new-instance p0, Lcom/whoop/network/exception/DeserializationException;

    const-string v0, "SubscriptionInfoDto#footer cannot be null"

    invoke-direct {p0, v0}, Lcom/whoop/network/exception/DeserializationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
