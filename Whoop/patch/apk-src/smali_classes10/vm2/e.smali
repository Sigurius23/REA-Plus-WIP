.class public abstract Lvm2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lj02/m0;",
        "Leb/x0;",
        "navOptions",
        "a",
        "(Lj02/m0;Leb/x0;)Lj02/m0;",
        "app_prodStandardRelease"
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
.method public static final a(Lj02/m0;Leb/x0;)Lj02/m0;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lj02/m0$m1;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lj02/m0$m1;

    const/16 v12, 0x37f

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, p1

    invoke-static/range {v1 .. v13}, Lj02/m0$m1;->c(Lj02/m0$m1;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lj02/m0$m1;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v8, p1

    instance-of p1, p0, Lj02/m0$e5;

    if-eqz p1, :cond_1

    move-object v0, p0

    check-cast v0, Lj02/m0$e5;

    const/16 v10, 0x17f

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v11}, Lj02/m0$e5;->c(Lj02/m0$e5;Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lj02/m0$e5;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p1, p0, Lj02/m0$i3;

    if-eqz p1, :cond_2

    check-cast p0, Lj02/m0$i3;

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, v8, p1, v0}, Lj02/m0$i3;->c(Lj02/m0$i3;Ljava/lang/String;Leb/x0;ILjava/lang/Object;)Lj02/m0$i3;

    move-result-object p0

    :cond_2
    return-object p0
.end method
