.class public final Llive/hms/video/audio/manager/HMSAudioManagerApi31$start$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/IErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/audio/manager/HMSAudioManagerApi31;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "live/hms/video/audio/manager/HMSAudioManagerApi31$start$1",
        "Llive/hms/video/sdk/IErrorListener;",
        "Llive/hms/video/error/HMSException;",
        "error",
        "Ll83/a0;",
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
.field final synthetic this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;


# direct methods
.method public constructor <init>(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$start$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$start$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->getErrorListener()Llive/hms/video/sdk/IErrorListener;

    move-result-object v0

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method
