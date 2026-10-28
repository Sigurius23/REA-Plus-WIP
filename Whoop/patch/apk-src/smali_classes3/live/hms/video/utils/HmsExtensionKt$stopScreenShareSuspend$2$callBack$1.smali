.class public final Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/HMSActionResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/HmsExtensionKt;->stopScreenShareSuspend(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "live/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "Ll83/a0;",
        "onSuccess",
        "()V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
        "lib_release"
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
.field final synthetic $continuation:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1;->$continuation:Lbc3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1;->$continuation:Lbc3/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->fillInStackTrace()Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "fillInStackTrace(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onSuccess()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1;->$continuation:Lbc3/k;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1$onSuccess$1;->INSTANCE:Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1$onSuccess$1;

    invoke-interface {v0, v1, v2}, Lbc3/k;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
