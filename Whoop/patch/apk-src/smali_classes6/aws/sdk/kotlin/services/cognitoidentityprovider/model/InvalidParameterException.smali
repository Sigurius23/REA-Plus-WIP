.class public final Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;
.super Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;",
        "Laws/sdk/kotlin/services/cognitoidentityprovider/model/CognitoIdentityProviderException;",
        "io/seon/androidsdk/service/c0",
        "cognitoidentityprovider"
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
.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/seon/androidsdk/service/c0;)V
    .locals 2

    iget-object v0, p1, Lio/seon/androidsdk/service/c0;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lio/seon/androidsdk/service/c0;->b:Ljava/lang/String;

    iput-object p1, p0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;->z:Ljava/lang/String;

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

    const-class v2, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;->z:Ljava/lang/String;

    iget-object p1, p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;->z:Ljava/lang/String;

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

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;->z:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InvalidParameterException("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "message="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "reasonCode="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;->z:Ljava/lang/String;

    const-string v3, ")"

    invoke-static {v1, v2, v0, v3}, Lc13/a;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
