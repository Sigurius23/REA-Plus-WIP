.class public abstract Lcom/whoop/design/models/items/ArticleTileModelEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;,
        Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;,
        Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ArticleTileModelEvent;",
        "",
        "<init>",
        "()V",
        "analyticEvent",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "Url",
        "Cta",
        "Image",
        "Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;",
        "Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;",
        "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/design/models/items/ArticleTileModelEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
.end method
