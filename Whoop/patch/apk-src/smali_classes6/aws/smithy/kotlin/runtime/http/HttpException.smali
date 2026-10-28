.class public final Laws/smithy/kotlin/runtime/http/HttpException;
.super Laws/smithy/kotlin/runtime/SdkBaseException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/http/HttpException;",
        "Laws/smithy/kotlin/runtime/SdkBaseException;",
        "http"
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
.field public final x:Lmf/p;


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lmf/p;)V
    .locals 1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/Exception;)V

    iput-object p2, p0, Laws/smithy/kotlin/runtime/http/HttpException;->x:Lmf/p;

    iget-object p1, p0, Laws/smithy/kotlin/runtime/SdkBaseException;->w:Lte/c;

    iget-object p1, p1, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/c;->c:Lgf/a;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()Lmf/p;
    .locals 1

    iget-object v0, p0, Laws/smithy/kotlin/runtime/http/HttpException;->x:Lmf/p;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lmf/q;->a:[I

    iget-object v2, p0, Laws/smithy/kotlin/runtime/http/HttpException;->x:Lmf/p;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v1, v1, v3

    const/4 v3, 0x3

    if-ne v1, v3, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; HttpErrorCode("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
