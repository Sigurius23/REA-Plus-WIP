.class final Lfs2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs2/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfs2/h;",
        "Lfs2/c;",
        "Llive/hms/video/sdk/HMSSDK;",
        "sdk",
        "<init>",
        "(Llive/hms/video/sdk/HMSSDK;)V",
        "Llive/hms/video/signal/init/TokenRequest;",
        "request",
        "Llive/hms/video/signal/init/HMSTokenListener;",
        "listener",
        "Ll83/a0;",
        "c",
        "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/HMSTokenListener;)V",
        "Llive/hms/video/sdk/models/HMSConfig;",
        "config",
        "Llive/hms/video/sdk/HMSPreviewListener;",
        "b",
        "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "a",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/sdk/HMSSDK;",
        "video-call_release"
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
.field private final b:Llive/hms/video/sdk/HMSSDK;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/HMSSDK;)V
    .locals 1

    const-string v0, "sdk"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfs2/h;->b:Llive/hms/video/sdk/HMSSDK;

    return-void
.end method


# virtual methods
.method public a(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/h;->b:Llive/hms/video/sdk/HMSSDK;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/HMSSDK;->leave(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public b(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/h;->b:Llive/hms/video/sdk/HMSSDK;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/HMSSDK;->preview(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V

    return-void
.end method

.method public c(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/HMSTokenListener;)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/h;->b:Llive/hms/video/sdk/HMSSDK;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Llive/hms/video/sdk/HMSSDK;->getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V

    return-void
.end method
