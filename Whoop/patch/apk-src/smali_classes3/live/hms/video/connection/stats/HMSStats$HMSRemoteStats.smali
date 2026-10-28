.class public abstract Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;
.super Llive/hms/video/connection/stats/HMSStats;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/stats/HMSStats;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "HMSRemoteStats"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;",
        "Llive/hms/video/connection/stats/HMSStats;",
        "<init>",
        "()V",
        "Llive/hms/video/connection/stats/HMSRemoteAudioStats;",
        "Llive/hms/video/connection/stats/HMSRemoteVideoStats;",
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


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Llive/hms/video/connection/stats/HMSStats;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;-><init>()V

    return-void
.end method
