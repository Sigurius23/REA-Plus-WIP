.class public final Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"

# interfaces
.implements Lbc3/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/IllegalArgumentException;",
        "Lbc3/x;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u0008\u0012\u0004\u0012\u00020\u00000\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;",
        "Ljava/lang/IllegalArgumentException;",
        "Lkotlin/IllegalArgumentException;",
        "Lbc3/x;",
        "ktor-client-okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final a()Ljava/lang/Throwable;
    .locals 4

    new-instance v0, Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;

    const-string v1, "frame"

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported frame type: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
