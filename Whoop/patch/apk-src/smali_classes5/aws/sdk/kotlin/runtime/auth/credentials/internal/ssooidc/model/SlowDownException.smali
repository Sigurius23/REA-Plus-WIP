.class public final Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;
.super Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;",
        "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;",
        "f9/u",
        "aws-config"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lf9/u;)V
    .locals 2

    invoke-direct {p0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;-><init>()V

    iget-object v0, p1, Lf9/u;->b:Ljava/lang/String;

    iput-object v0, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->z:Ljava/lang/String;

    iget-object p1, p1, Lf9/u;->c:Ljava/lang/String;

    iput-object p1, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->E:Ljava/lang/String;

    iget-object p1, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object v0, Lte/e;->g:Lgf/a;

    sget-object v1, Lte/f;->w:Lte/f;

    invoke-virtual {p1, v0, v1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-class v2, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->z:Ljava/lang/String;

    iget-object v3, p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->z:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->E:Ljava/lang/String;

    iget-object p1, p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->E:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->z:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->E:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SlowDownException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2c

    const-string v3, "errorDescription="

    iget-object v4, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->z:Ljava/lang/String;

    invoke-static {v1, v4, v2, v0, v3}, Lr;->q(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SlowDownException;->E:Ljava/lang/String;

    const-string v3, ")"

    invoke-static {v1, v2, v0, v3}, Lc13/a;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
