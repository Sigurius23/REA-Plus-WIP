.class public abstract Lcp1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "Lcp1/c;",
        "a",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcp1/c;",
        "hormonal-insights_release"
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
.method public static final a(Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcp1/c;
    .locals 3

    if-eqz p0, :cond_0

    new-instance v0, Lcp1/c;

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;->getScreenCount()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;->getMaxScreenCount()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lcp1/c;-><init>(Lcom/whoop/design/util/TextResource;II)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
