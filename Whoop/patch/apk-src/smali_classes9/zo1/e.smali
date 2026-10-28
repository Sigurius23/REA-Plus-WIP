.class public final Lzo1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lzo1/e;",
        "",
        "<init>",
        "()V",
        "Lzo1/b;",
        "saveRequest",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;",
        "a",
        "(Lzo1/b;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
        "mciOnboardingResponse",
        "",
        "",
        "b",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;)Ljava/util/List;",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lzo1/b;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;
    .locals 12

    const-string v0, "saveRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzo1/b;->d()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1}, Lzo1/b;->g()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    invoke-virtual {p1}, Lzo1/b;->h()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, v0

    :goto_1
    invoke-virtual {p1}, Lzo1/b;->f()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    move-result-object v7

    array-length v8, v7

    move v9, v2

    :goto_2
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_3
    move-object v10, v3

    :goto_3
    invoke-virtual {p1}, Lzo1/b;->c()Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;->values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    move-result-object v7

    array-length v8, v7

    :goto_4
    if-ge v2, v8, :cond_5

    aget-object v9, v7, v2

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move-object v3, v9

    goto :goto_5

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    invoke-virtual {p1}, Lzo1/b;->i()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v7, v1

    goto :goto_6

    :cond_6
    move-object v7, v0

    :goto_6
    invoke-virtual {p1}, Lzo1/b;->e()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_7

    move-object v8, v1

    goto :goto_7

    :cond_7
    move-object v8, p1

    :goto_7
    new-instance v1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;

    move-object v2, v10

    invoke-direct/range {v1 .. v8}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;-><init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final b(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;->getScreens()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v2

    sget-object v3, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->MENSTRUAL_CYCLE_LAST_PERIOD:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object p1

    instance-of v1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;

    if-eqz v1, :cond_4

    check-cast p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciDateInputScreen;->getSelectedDays()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method
