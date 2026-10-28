.class public Laws/sdk/kotlin/runtime/AwsServiceException;
.super Laws/smithy/kotlin/runtime/ServiceException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Laws/sdk/kotlin/runtime/AwsServiceException;",
        "Laws/smithy/kotlin/runtime/ServiceException;",
        "<init>",
        "()V",
        "aws-core"
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
.field public final y:Luc/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Laws/smithy/kotlin/runtime/ServiceException;-><init>()V

    .line 2
    new-instance v0, Luc/a;

    invoke-direct {v0}, Luc/a;-><init>()V

    iput-object v0, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Laws/smithy/kotlin/runtime/ServiceException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 6
    new-instance p1, Luc/a;

    invoke-direct {p1}, Luc/a;-><init>()V

    iput-object p1, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/ServiceException;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance p1, Luc/a;

    invoke-direct {p1}, Luc/a;-><init>()V

    iput-object p1, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    return-void
.end method


# virtual methods
.method public final a()Lte/c;
    .locals 1

    iget-object v0, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    return-object v0
.end method

.method public final b()Lte/e;
    .locals 1

    iget-object v0, p0, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    return-object v0
.end method
