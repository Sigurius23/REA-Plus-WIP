.class public final Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;
.super Lcom/whoop/design/models/items/ArticleTileModelEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/ArticleTileModelEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Image"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;",
        "Lcom/whoop/design/models/items/ArticleTileModelEvent;",
        "imageUrl",
        "",
        "analyticEvent",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "getImageUrl",
        "()Ljava/lang/String;",
        "getAnalyticEvent",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final imageUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;-><init>(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->copy(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;
    .locals 1

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    invoke-direct {v0, p1, p2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;-><init>(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;

    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->imageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Image(imageUrl="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
