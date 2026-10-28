.class public final Laws/smithy/kotlin/runtime/retries/RetryFailureException;
.super Laws/smithy/kotlin/runtime/retries/RetryException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/retries/RetryFailureException;",
        "Laws/smithy/kotlin/runtime/retries/RetryException;",
        "runtime-core"
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
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v5, 0x0

    const-string v1, "The operation resulted in a non-retryable failure"

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Laws/smithy/kotlin/runtime/retries/RetryException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method
