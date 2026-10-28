.class public abstract Lfy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/data/onboarding/FeatureEducationType;",
        "deep-dive_release"
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
.method public static final a(Ljava/lang/String;)Lcom/whoop/data/onboarding/FeatureEducationType;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x352abe8b    # -6987962.5f

    if-eq v0, v1, :cond_4

    const v1, -0x2fa1806b

    if-eq v0, v1, :cond_2

    const v1, 0x6872ed7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "sleep"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/whoop/data/onboarding/FeatureEducationType;->OVERLAY_HOME_DEEP_DIVES_SLEEP:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object p0

    :cond_2
    const-string v0, "recovery"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/whoop/data/onboarding/FeatureEducationType;->OVERLAY_HOME_DEEP_DIVES_RECOVERY:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object p0

    :cond_4
    const-string v0, "strain"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_5
    sget-object p0, Lcom/whoop/data/onboarding/FeatureEducationType;->OVERLAY_HOME_DEEP_DIVES_STRAIN:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object p0
.end method
