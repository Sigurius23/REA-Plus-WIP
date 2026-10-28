.class public final Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;
.super Laws/smithy/kotlin/runtime/retries/RetryException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;",
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
.method public constructor <init>(Ljava/lang/String;Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;ILjava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p5}, Laws/smithy/kotlin/runtime/retries/RetryException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method
