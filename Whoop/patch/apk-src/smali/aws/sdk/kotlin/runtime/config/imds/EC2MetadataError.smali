.class public final Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;
.super Laws/sdk/kotlin/runtime/AwsServiceException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;",
        "Laws/sdk/kotlin/runtime/AwsServiceException;",
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
.field public final z:Lmf/t;


# direct methods
.method public constructor <init>(Lmf/t;Ljava/lang/String;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;->z:Lmf/t;

    return-void
.end method
