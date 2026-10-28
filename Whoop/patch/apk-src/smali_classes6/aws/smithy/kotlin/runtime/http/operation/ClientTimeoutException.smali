.class public abstract Laws/smithy/kotlin/runtime/http/operation/ClientTimeoutException;
.super Laws/smithy/kotlin/runtime/ClientException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/http/operation/ClientTimeoutException;",
        "Laws/smithy/kotlin/runtime/ClientException;",
        "http-client"
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
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cause"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Laws/smithy/kotlin/runtime/SdkBaseException;->w:Lte/c;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/c;->c:Lgf/a;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method
