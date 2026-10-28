.class public final Llive/hms/video/utils/HmsExtensionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080@\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Llive/hms/video/sdk/SDKDelegate;",
        "Ll83/a0;",
        "stopScreenShareSuspend",
        "(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;",
        "stopAudioShareSuspend",
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
.method public static final stopAudioShareSuspend(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Llive/hms/video/utils/HmsExtensionKt$stopAudioShareSuspend$2$callBack$1;

    invoke-direct {p1, v0}, Llive/hms/video/utils/HmsExtensionKt$stopAudioShareSuspend$2$callBack$1;-><init>(Lbc3/k;)V

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/SDKDelegate;->stopAudioshare(Llive/hms/video/sdk/HMSActionResultListener;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final stopScreenShareSuspend(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p1, Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1;

    invoke-direct {p1, v0}, Llive/hms/video/utils/HmsExtensionKt$stopScreenShareSuspend$2$callBack$1;-><init>(Lbc3/k;)V

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/SDKDelegate;->stopScreenshare(Llive/hms/video/sdk/HMSActionResultListener;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
