.class public final Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;
.super Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/SigninException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;",
        "Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/SigninException;",
        "xl/a",
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
.field public final z:Lcd/n;


# direct methods
.method public constructor <init>(Lxl/a;)V
    .locals 2

    iget-object v0, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Lcd/n;

    if-eqz p1, :cond_0

    iput-object p1, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;->z:Lcd/n;

    iget-object p1, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object v0, Lte/e;->g:Lgf/a;

    sget-object v1, Lte/f;->w:Lte/f;

    invoke-virtual {p1, v0, v1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A non-null value must be provided for error"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
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

    const-class v2, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;->z:Lcd/n;

    iget-object v3, p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;->z:Lcd/n;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object p1

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
    .locals 2

    iget-object v0, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;->z:Lcd/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessDeniedException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Laws/sdk/kotlin/runtime/auth/credentials/internal/signin/model/AccessDeniedException;->z:Lcd/n;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "message="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
