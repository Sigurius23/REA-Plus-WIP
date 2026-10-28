.class public interface abstract Llive/hms/video/plugin/video/HMSVideoPlugin;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/plugin/video/HMSVideoPlugin$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ+\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/plugin/video/HMSVideoPlugin;",
        "",
        "",
        "getName",
        "()Ljava/lang/String;",
        "",
        "isSupported",
        "()Z",
        "Ll83/a0;",
        "init",
        "(Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/plugin/video/HMSVideoPluginType;",
        "getPluginType",
        "()Llive/hms/video/plugin/video/HMSVideoPluginType;",
        "Lhms/webrtc/VideoFrame;",
        "input",
        "Llive/hms/video/sdk/HMSPluginResultListener;",
        "outputListener",
        "skipProcessing",
        "processVideoFrame",
        "(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V",
        "stop",
        "()V",
        "key",
        "setKey",
        "(Ljava/lang/String;)V",
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


# virtual methods
.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getPluginType()Llive/hms/video/plugin/video/HMSVideoPluginType;
.end method

.method public abstract init(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isSupported()Z
.end method

.method public abstract processVideoFrame(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V
.end method

.method public abstract setKey(Ljava/lang/String;)V
.end method

.method public abstract stop()V
.end method
