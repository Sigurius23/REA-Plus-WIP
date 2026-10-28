.class public interface abstract Llive/hms/video/utils/HMSLogger$Loggable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/utils/HMSLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Loggable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/HMSLogger$Loggable$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ3\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/utils/HMSLogger$Loggable;",
        "",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "level",
        "",
        "tag",
        "message",
        "",
        "isWebRtCLog",
        "Ll83/a0;",
        "onLogMessage",
        "(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Z)V",
        "Llive/hms/video/utils/HMSLogger$LogFiles;",
        "fileName",
        "",
        "Lhms/webrtc/RTCStats;",
        "onLogToFile",
        "(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V",
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
.method public abstract onLogMessage(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method public abstract onLogToFile(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/utils/HMSLogger$LogFiles;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)V"
        }
    .end annotation
.end method
