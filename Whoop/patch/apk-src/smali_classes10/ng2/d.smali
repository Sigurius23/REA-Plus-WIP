.class public abstract Lng2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a)\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "",
        "selectedActivityInternalName",
        "",
        "isGpsTrackingEnabled",
        "dismissModal",
        "Lcom/whoop/design/item/DesignItemInteraction;",
        "b",
        "(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;",
        "internalName",
        "a",
        "start-activity_release"
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
.method public static final a(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 4

    const-string v0, "internalName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    new-instance v1, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-static {p0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    new-instance v2, Ll83/k;

    const-string v3, "$selected_activity_internal_name"

    invoke-direct {v2, v3, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    new-instance p1, Ll83/k;

    const-string v3, "$gps_tracking_enabled"

    invoke-direct {p1, v3, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-direct {v1, p0, p2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;Z)V

    const/4 p0, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 1

    const-string v0, "selectedActivityInternalName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lng2/d;->a(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ZZILjava/lang/Object;)Lcom/whoop/design/item/DesignItemInteraction;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lng2/d;->b(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;

    move-result-object p0

    return-object p0
.end method
