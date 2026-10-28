.class public abstract Lm91/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "action",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "a",
        "(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Ljava/lang/Object;",
        "design_release"
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
.method public static final a(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)Ljava/lang/Object;
    .locals 1

    const-string v0, "action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/whoop/design/item/DesignItemInteraction;

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {v0, p0, p1}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method
