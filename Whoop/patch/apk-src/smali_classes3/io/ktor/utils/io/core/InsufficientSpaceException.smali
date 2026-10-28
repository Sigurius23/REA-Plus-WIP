.class public final Lio/ktor/utils/io/core/InsufficientSpaceException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lio/ktor/utils/io/core/InsufficientSpaceException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "ktor-io"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Not enough free space"

    invoke-direct {p0, v0}, Lio/ktor/utils/io/core/InsufficientSpaceException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 3

    .line 3
    const-string v0, " of "

    const-string v1, " bytes, available "

    .line 4
    const-string v2, "Not enough free space to write "

    invoke-static {p2, v2, p1, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 5
    const-string p2, " bytes."

    .line 6
    invoke-static {p1, p3, p2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lio/ktor/utils/io/core/InsufficientSpaceException;-><init>(Ljava/lang/String;)V

    return-void
.end method
