.class public abstract Laws/smithy/kotlin/runtime/retries/RetryException;
.super Laws/smithy/kotlin/runtime/ClientException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/retries/RetryException;",
        "Laws/smithy/kotlin/runtime/ClientException;",
        "Laws/smithy/kotlin/runtime/retries/RetryFailureException;",
        "Laws/smithy/kotlin/runtime/retries/TimedOutException;",
        "Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;",
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


# instance fields
.field public final x:I

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p3, p0, Laws/smithy/kotlin/runtime/retries/RetryException;->x:I

    iput-object p4, p0, Laws/smithy/kotlin/runtime/retries/RetryException;->y:Ljava/lang/Object;

    iput-object p5, p0, Laws/smithy/kotlin/runtime/retries/RetryException;->z:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",attempts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Laws/smithy/kotlin/runtime/retries/RetryException;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Laws/smithy/kotlin/runtime/retries/RetryException;->z:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    const-string v2, ",lastException="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Laws/smithy/kotlin/runtime/retries/RetryException;->y:Ljava/lang/Object;

    if-eqz v1, :cond_1

    const-string v2, ",lastResponse="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
