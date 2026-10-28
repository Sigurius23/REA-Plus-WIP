.class public final Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/GetApiRequest;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0014\u0010\n\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008R \u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;",
        "Lcom/whoop/network/request/GetApiRequest;",
        "testCount",
        "",
        "initiallySelectedSegmentId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getTestCount",
        "()Ljava/lang/String;",
        "getInitiallySelectedSegmentId",
        "path",
        "getPath",
        "parameters",
        "",
        "getParameters",
        "()Ljava/util/Map;",
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
        "advanced-labs-join_release"
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
.field private final initiallySelectedSegmentId:Ljava/lang/String;

.field private final parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final path:Ljava/lang/String;

.field private final testCount:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "testCount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "initiallySelectedSegmentId"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    .line 4
    const-string v2, "growth-content-service/v1/advanced-labs/join"

    iput-object v2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->path:Ljava/lang/String;

    .line 5
    new-instance v2, Ln83/f;

    invoke-direct {v2}, Ln83/f;-><init>()V

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {v2, v0, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    invoke-virtual {v2, v1, p2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_1
    invoke-virtual {v2}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->parameters:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 10
    const-string p2, ""

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;
    .locals 1

    const-string v0, "testCount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initiallySelectedSegmentId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge getBody()Ljava/lang/Void;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHasBody()Z

    move-result v0

    return v0
.end method

.method public bridge getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public final getInitiallySelectedSegmentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTestCount()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->testCount:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabsjoin/feature/join/domain/GetAdvancedLabsJoinRequest;->initiallySelectedSegmentId:Ljava/lang/String;

    const-string v2, ", initiallySelectedSegmentId="

    const-string v3, ")"

    const-string v4, "GetAdvancedLabsJoinRequest(testCount="

    invoke-static {v4, v0, v2, v1, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/GetApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
