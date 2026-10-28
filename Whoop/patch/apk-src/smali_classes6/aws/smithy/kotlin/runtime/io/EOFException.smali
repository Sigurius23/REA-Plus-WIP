.class public Laws/smithy/kotlin/runtime/io/EOFException;
.super Ljava/io/EOFException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Laws/smithy/kotlin/runtime/io/EOFException;",
        "Ljava/io/EOFException;",
        "<init>",
        "()V",
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
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, v0}, Laws/smithy/kotlin/runtime/io/EOFException;-><init>(Ljava/lang/String;Ljava/io/EOFException;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/EOFException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-void
.end method
