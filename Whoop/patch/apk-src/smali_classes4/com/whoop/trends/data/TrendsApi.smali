.class public interface abstract Lcom/whoop/trends/data/TrendsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J.\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ$\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J*\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u001cH\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\u0008\u0008\u0001\u0010 \u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\"\u0010\u001bJ*\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010#\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008$\u0010%J*\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010#\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0012\u001a\u00020&H\u00a7@\u00a2\u0006\u0004\u0008\'\u0010(J*\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010#\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0012\u001a\u00020&H\u00a7@\u00a2\u0006\u0004\u0008)\u0010(J \u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0001\u0010\u0012\u001a\u00020*H\u00a7@\u00a2\u0006\u0004\u0008+\u0010,\u00a8\u0006-\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/trends/data/TrendsApi;",
        "",
        "Lor2/h0;",
        "graphKey",
        "",
        "dateTime",
        "firmWareVersion",
        "Lcom/whoop/trends/data/model/TrendsDtoV3;",
        "getTrendsV3",
        "(Lor2/h0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/trends/data/model/RecordedData;",
        "getRecordedData",
        "(Lor2/h0;Lq83/d;)Ljava/lang/Object;",
        "nextToken",
        "Lcom/whoop/trends/data/model/Sections;",
        "getPaginatedRecordedData",
        "(Lor2/h0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "addManualMeasurement",
        "(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;",
        "id",
        "updateManualMeasurement",
        "(Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;",
        "deleteManualMeasurement",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/trends/data/model/TrendTileProperties;",
        "properties",
        "updateTrendTileProperties",
        "(Lcom/whoop/trends/data/model/TrendTileProperties;Lq83/d;)Ljava/lang/Object;",
        "measurementType",
        "Lcom/whoop/trends/data/model/MeasurementRecord;",
        "fetchMeasurementReportData",
        "measurementId",
        "deleteMeasurementReport",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;",
        "addMeasurementReport",
        "(Ljava/lang/String;Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;",
        "editMeasurementReport",
        "Lcom/whoop/trends/data/DismissBody;",
        "dismissRequest",
        "(Lcom/whoop/trends/data/DismissBody;Lq83/d;)Ljava/lang/Object;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract addManualMeasurement(Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "progression-service/v3/trends/WEIGHT/readings"
    .end annotation
.end method

.method public abstract addMeasurementReport(Ljava/lang/String;Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "measurementType"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "vo2max-service/v2/{measurementType}/manual"
    .end annotation
.end method

.method public abstract deleteManualMeasurement(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "progression-service/v3/trends/WEIGHT/readings/{id}"
    .end annotation
.end method

.method public abstract deleteMeasurementReport(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "measurementType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "vo2max-service/v2/{measurementType}/manual/{id}"
    .end annotation
.end method

.method public abstract dismissRequest(Lcom/whoop/trends/data/DismissBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/trends/data/DismissBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trends/data/DismissBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "user-preferences-service/v1/components/dismissals"
    .end annotation
.end method

.method public abstract editMeasurementReport(Ljava/lang/String;Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "measurementType"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/Vo2ManualMeasurementRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "vo2max-service/v2/{measurementType}/manual"
    .end annotation
.end method

.method public abstract fetchMeasurementReportData(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "measurementType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trends/data/model/MeasurementRecord;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v3/{measurementType}/manual/readings"
    .end annotation
.end method

.method public abstract getPaginatedRecordedData(Lor2/h0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lor2/h0;
        .annotation runtime Lwg3/s;
            value = "graphKey"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "next_token"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor2/h0;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trends/data/model/Sections;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v3/trends/{graphKey}/readings/paginated"
    .end annotation
.end method

.method public abstract getRecordedData(Lor2/h0;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lor2/h0;
        .annotation runtime Lwg3/s;
            value = "graphKey"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor2/h0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trends/data/model/RecordedData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v3/trends/{graphKey}/readings"
    .end annotation
.end method

.method public abstract getTrendsV3(Lor2/h0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lor2/h0;
        .annotation runtime Lwg3/s;
            value = "graphKey"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endDate"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor2/h0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trends/data/model/TrendsDtoV3;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v3/trends/{graphKey}"
    .end annotation
.end method

.method public abstract updateManualMeasurement(Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/ManualMeasurementRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "progression-service/v3/trends/WEIGHT/readings/{id}"
    .end annotation
.end method

.method public abstract updateTrendTileProperties(Lcom/whoop/trends/data/model/TrendTileProperties;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/trends/data/model/TrendTileProperties;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trends/data/model/TrendTileProperties;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "user-preferences-service/v1/home/dashboard/customize/properties"
    .end annotation
.end method
