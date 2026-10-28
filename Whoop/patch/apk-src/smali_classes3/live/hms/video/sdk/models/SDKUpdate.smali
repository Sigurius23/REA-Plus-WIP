.class public abstract Llive/hms/video/sdk/models/SDKUpdate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/models/SDKUpdate$Broadcast;,
        Llive/hms/video/sdk/models/SDKUpdate$Companion;,
        Llive/hms/video/sdk/models/SDKUpdate$HMSPeerRemoved;,
        Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;,
        Llive/hms/video/sdk/models/SDKUpdate$HMSTrackStateUpdate;,
        Llive/hms/video/sdk/models/SDKUpdate$Peer;,
        Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;,
        Llive/hms/video/sdk/models/SDKUpdate$Room;,
        Llive/hms/video/sdk/models/SDKUpdate$Track;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \u00052\u00020\u0001:\t\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0008\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "",
        "<init>",
        "()V",
        "Track",
        "Companion",
        "Peer",
        "PeerListUpdate",
        "Broadcast",
        "Room",
        "HMSRoleChangeRequest",
        "HMSPeerRemoved",
        "HMSTrackStateUpdate",
        "Llive/hms/video/sdk/models/SDKUpdate$Broadcast;",
        "Llive/hms/video/sdk/models/SDKUpdate$HMSPeerRemoved;",
        "Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;",
        "Llive/hms/video/sdk/models/SDKUpdate$HMSTrackStateUpdate;",
        "Llive/hms/video/sdk/models/SDKUpdate$Peer;",
        "Llive/hms/video/sdk/models/SDKUpdate$PeerListUpdate;",
        "Llive/hms/video/sdk/models/SDKUpdate$Room;",
        "Llive/hms/video/sdk/models/SDKUpdate$Track;",
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


# static fields
.field public static final Companion:Llive/hms/video/sdk/models/SDKUpdate$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/models/SDKUpdate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/models/SDKUpdate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/models/SDKUpdate;->Companion:Llive/hms/video/sdk/models/SDKUpdate$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/sdk/models/SDKUpdate;-><init>()V

    return-void
.end method
