.class public final Lcom/whoop/design/models/modal/ModalTrackingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a!\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00132\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/ModalType;",
        "modalType",
        "",
        "modalId",
        "Liy1/c;",
        "metricWriter",
        "Ll83/a0;",
        "trackModalPresentedMetric",
        "(Lcom/whoop/design/models/modal/ModalType;Ljava/lang/String;Liy1/c;)V",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "Lfi0/a;",
        "analyticsWriter",
        "trackModalViewed",
        "(Lcom/whoop/design/models/modal/AnyModal;Lfi0/a;)V",
        "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;",
        "modalAnalyticEvents",
        "trackModalDismissed",
        "(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;)V",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "trackDialogButtonClicked",
        "(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V",
        "event",
        "trackAnalyticEvent",
        "design-models_release"
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
.method private static final trackAnalyticEvent(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V
    .locals 11

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getSource()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "source"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getProperties()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lu82/h;->c(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v3, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v10

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getCategory()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/analytics/AnalyticEventModel;->getValue()Ljava/lang/String;

    move-result-object v9

    move-object v4, p1

    invoke-interface/range {v4 .. v10}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method

.method public static final trackDialogButtonClicked(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/ModalTrackingKt;->trackAnalyticEvent(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V

    :cond_0
    return-void
.end method

.method public static final trackModalDismissed(Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;->getModalDismissed()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/ModalTrackingKt;->trackAnalyticEvent(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V

    :cond_0
    return-void
.end method

.method public static final trackModalPresentedMetric(Lcom/whoop/design/models/modal/ModalType;Ljava/lang/String;Liy1/c;)V
    .locals 9

    const-string v0, "modalType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modalId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    new-instance v1, Ljy1/a;

    const-string v0, "id:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/ModalType;->getValue()Ljava/lang/String;

    move-result-object p0

    const-string v0, "type:"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "mobile.whoop.modal_presented"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, Liy1/c;->b(Ljy1/a;)V

    :cond_0
    return-void
.end method

.method public static final trackModalViewed(Lcom/whoop/design/models/modal/AnyModal;Lfi0/a;)V
    .locals 1

    const-string v0, "modal"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/AnyModal;->getAnalyticEvents()Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;->getModalViewed()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/whoop/design/models/modal/ModalTrackingKt;->trackAnalyticEvent(Lcom/whoop/analytics/AnalyticEventModel;Lfi0/a;)V

    :cond_0
    return-void
.end method
