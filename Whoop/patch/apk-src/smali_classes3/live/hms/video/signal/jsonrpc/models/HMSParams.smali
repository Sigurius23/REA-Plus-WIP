.class public abstract Llive/hms/video/signal/jsonrpc/models/HMSParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$EndRoomRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStart;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStop;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$HMSWhiteBoardGetOption;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Leave;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerMetadataUpdate;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResultsQuery;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStartRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStopRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$RemovePeerRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeAccept;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStop;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$SendBroadcast;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$SessionMetadataRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$SetHLSSessionMetadata;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateAllRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateRequest;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;,
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Unsupported;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u00083\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \u00112\u00020\u0001:1\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./01234B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001056789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcd\u00a8\u0006e"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "",
        "<init>",
        "()V",
        "Answer",
        "Join",
        "Offer",
        "SendOffer",
        "TrackUpdate",
        "Trickle",
        "OnError",
        "Event",
        "Leave",
        "RoleChangeRequest",
        "BulkRoleChangeRequest",
        "RoleChangeAccept",
        "Unsupported",
        "Companion",
        "RemovePeerRequest",
        "EndRoomRequest",
        "TrackUpdateRequest",
        "TrackUpdateAllRequest",
        "SendBroadcast",
        "RtmpStart",
        "HLSStart",
        "HLSStop",
        "RtmpStop",
        "PeerMetadataUpdate",
        "SessionMetadataRequest",
        "SetSessionMetadata",
        "SetHLSSessionMetadata",
        "ListenMetadataChangeRequest",
        "SetPollParams",
        "PollQuestionsSet",
        "PollStartRequest",
        "PollStopRequest",
        "PollQuestionsGet",
        "PollResponseSet",
        "PollResponsesQuery",
        "Options",
        "HMSWhiteBoardGetOption",
        "PollResultsQuery",
        "PollLeaderboardQuery",
        "PollListQuery",
        "GroupJoin",
        "GroupLeave",
        "GroupAdd",
        "GroupRemove",
        "FindPeer",
        "PeerIteratorNext",
        "StartTranscription",
        "StopTranscription",
        "PeerNameSearch",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$EndRoomRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStart;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$HLSStop;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$HMSWhiteBoardGetOption;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Leave;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerMetadataUpdate;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResultsQuery;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStartRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollStopRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$RemovePeerRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeAccept;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStop;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SendBroadcast;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SessionMetadataRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetHLSSessionMetadata;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateAllRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Unsupported;",
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
.field public static final Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/signal/jsonrpc/models/HMSParams;->Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;

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
    invoke-direct {p0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>()V

    return-void
.end method
