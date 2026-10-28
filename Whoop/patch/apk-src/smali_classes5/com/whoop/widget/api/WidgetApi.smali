.class public interface abstract Lcom/whoop/widget/api/WidgetApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ.\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u0016\u00a8\u0006\u001a\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/widget/api/WidgetApi;",
        "",
        "",
        "collectionName",
        "date",
        "",
        "offset",
        "limit",
        "Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;",
        "getUserWidgetsForCollection",
        "(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;",
        "getSelectTeams",
        "(IILq83/d;)Ljava/lang/Object;",
        "sleep",
        "strain",
        "recovery",
        "Lcom/whoop/widget/model/WidgetModel;",
        "getAppWidgetsInfo",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/widget/model/WidgetSingle;",
        "getRecoveryPercent",
        "(Lq83/d;)Ljava/lang/Object;",
        "getStepsCount",
        "Lcom/whoop/widget/model/HealthspanWidgetModel;",
        "getHealthspanWidgetInfo",
        "widget_release"
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
.method public static synthetic a(Lcom/whoop/widget/api/WidgetApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_3

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-string p1, "SLEEP"

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const-string p2, "STRAIN"

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    const-string p3, "RECOVERY"

    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/whoop/widget/api/WidgetApi;->getAppWidgetsInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getAppWidgetsInfo"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract getAppWidgetsInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "statistics"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "statistics"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "statistics"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/model/WidgetModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "widget-service/v1/statistics/composite"
    .end annotation
.end method

.method public abstract getHealthspanWidgetInfo(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/model/HealthspanWidgetModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "healthspan-service/v1/widget"
    .end annotation
.end method

.method public abstract getRecoveryPercent(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/model/WidgetSingle;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "widget-service/v1/statistics/RECOVERY"
    .end annotation
.end method

.method public abstract getSelectTeams(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "community-service/v1/chat/memberships"
    .end annotation
.end method

.method public abstract getStepsCount(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/model/WidgetSingle;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "widget-service/v1/statistics/rocky"
    .end annotation
.end method

.method public abstract getUserWidgetsForCollection(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "collection"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "social-service/v1/share/widgets"
    .end annotation
.end method
