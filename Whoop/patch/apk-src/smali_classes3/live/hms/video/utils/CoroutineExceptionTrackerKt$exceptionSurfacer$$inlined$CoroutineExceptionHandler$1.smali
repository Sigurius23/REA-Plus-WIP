.class public final Llive/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/CoroutineExceptionTrackerKt;->exceptionSurfacer(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineExceptionHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "live/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1",
        "Lq83/a;",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "Lq83/j;",
        "context",
        "",
        "exception",
        "Ll83/a0;",
        "handleException",
        "(Lq83/j;Ljava/lang/Throwable;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $tag$inlined:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbc3/a0;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Llive/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1;->$tag$inlined:Ljava/lang/String;

    invoke-direct {p0, p1}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method


# virtual methods
.method public handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Llive/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1;->$tag$inlined:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Got coroutine exception "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " in context: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    throw p2
.end method
