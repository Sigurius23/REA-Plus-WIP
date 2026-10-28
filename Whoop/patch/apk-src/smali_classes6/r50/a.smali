.class public abstract Lr50/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;",
        "Ls50/d;",
        "a",
        "(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;",
        "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;",
        "Ls50/e;",
        "b",
        "(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;)Ls50/e;",
        "access_release"
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
.method public static final a(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getTag()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llb1/g2;->d(Lcom/whoop/design/models/items/ImpactModel;)Lhy0/c2;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getStart()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    move-result-object v0

    invoke-static {v0}, Lr50/a;->b(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;)Ls50/e;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getLatest()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    move-result-object v0

    invoke-static {v0}, Lr50/a;->b(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;)Ls50/e;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getTarget()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    move-result-object v0

    invoke-static {v0}, Lr50/a;->b(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;)Ls50/e;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Llb1/j2;->b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object v1

    :cond_1
    move-object v8, v1

    new-instance v1, Ls50/d;

    invoke-direct/range {v1 .. v8}, Ls50/d;-><init>(Lgz0/m0;Ljava/lang/String;Lhy0/c2;Ls50/e;Ls50/e;Ls50/e;Lc41/p2;)V

    return-object v1
.end method

.method private static final b(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;)Ls50/e;
    .locals 3

    new-instance v0, Ls50/e;

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;->getStyle()Lhy0/b2;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Ls50/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lhy0/b2;)V

    return-object v0
.end method
