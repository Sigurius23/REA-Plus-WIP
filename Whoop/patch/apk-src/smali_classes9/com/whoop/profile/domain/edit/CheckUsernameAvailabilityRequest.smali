.class public final Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PostApiRequest;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PostApiRequest<",
        "Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;",
        "Lcom/whoop/network/request/PostApiRequest;",
        "Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;",
        "username",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "path",
        "getPath",
        "()Ljava/lang/String;",
        "body",
        "getBody",
        "()Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;",
        "profile_release"
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


# instance fields
.field private final body:Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;

.field private final path:Ljava/lang/String;

.field private final username:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;->username:Ljava/lang/String;

    const-string v0, "onboarding-service/v1/users/check/username"

    iput-object v0, p0, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;->path:Ljava/lang/String;

    new-instance v0, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;->body:Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;

    return-void
.end method


# virtual methods
.method public getBody()Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;->body:Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;

    return-object v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;->getBody()Lcom/whoop/profile/domain/edit/models/UsernameCheckV2RequestBody;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHasBody()Z

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

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge getParameters()Ljava/util/Map;
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

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getParameters()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PostApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
