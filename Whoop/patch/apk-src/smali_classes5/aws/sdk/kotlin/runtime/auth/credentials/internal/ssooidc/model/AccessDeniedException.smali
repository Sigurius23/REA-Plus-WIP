.class public final Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;
.super Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;",
        "Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;",
        "gm/r",
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

.field public final F:Lod/c;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lgm/r;)V
    .locals 2

    invoke-direct {p0}, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/SsoOidcException;-><init>()V

    iget-object v0, p1, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->z:Ljava/lang/String;

    iget-object v0, p1, Lgm/r;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->E:Ljava/lang/String;

    iget-object p1, p1, Lgm/r;->z:Ljava/lang/Object;

    check-cast p1, Lod/c;

    iput-object p1, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->F:Lod/c;

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

    if-eqz p1, :cond_5

    const-class v2, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->z:Ljava/lang/String;

    iget-object v3, p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->z:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->E:Ljava/lang/String;

    iget-object v3, p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->E:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->F:Lod/c;

    iget-object p1, p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->F:Lod/c;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->z:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->E:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->F:Lod/c;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_2
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessDeniedException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "errorDescription="

    iget-object v3, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->z:Ljava/lang/String;

    const/16 v4, 0x2c

    invoke-static {v1, v3, v4, v0, v2}, Lr;->q(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->E:Ljava/lang/String;

    const-string v3, "reason="

    invoke-static {v1, v2, v4, v0, v3}, Lr;->q(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/ssooidc/model/AccessDeniedException;->F:Lod/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
