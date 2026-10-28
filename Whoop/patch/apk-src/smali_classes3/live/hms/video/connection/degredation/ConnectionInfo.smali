.class public abstract Llive/hms/video/connection/degredation/ConnectionInfo;
.super Llive/hms/video/connection/degredation/WebrtcStats;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;,
        Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;,
        Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0002\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/ConnectionInfo;",
        "Llive/hms/video/connection/degredation/WebrtcStats;",
        "<init>",
        "()V",
        "PacketLossTracks",
        "PublishConnection",
        "SubscribeConnection",
        "Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;",
        "Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;",
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
    invoke-direct {p0, v0}, Llive/hms/video/connection/degredation/WebrtcStats;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/connection/degredation/ConnectionInfo;-><init>()V

    return-void
.end method
