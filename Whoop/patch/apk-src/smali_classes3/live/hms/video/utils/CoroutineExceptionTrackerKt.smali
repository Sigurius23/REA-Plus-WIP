.class public final Llive/hms/video/utils/CoroutineExceptionTrackerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "exceptionSurfacer",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "tag",
        "",
        "lib_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final exceptionSurfacer(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineExceptionHandler;
    .locals 2

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1;

    sget-object v1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v1, p0}, Llive/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1;-><init>(Lbc3/a0;Ljava/lang/String;)V

    return-object v0
.end method
