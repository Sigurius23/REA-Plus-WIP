.class public final Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;
.super Laws/smithy/kotlin/runtime/ClientException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;",
        "Laws/smithy/kotlin/runtime/ClientException;",
        "aws-credentials"
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
.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p2, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method
