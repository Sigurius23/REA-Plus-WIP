.class public final Laws/sdk/kotlin/runtime/auth/credentials/CredentialsNotLoadedException;
.super Laws/sdk/kotlin/runtime/ClientException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/sdk/kotlin/runtime/auth/credentials/CredentialsNotLoadedException;",
        "Laws/sdk/kotlin/runtime/ClientException;",
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


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const-string p1, "AWS EC2 metadata is explicitly disabled; credentials not loaded"

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
