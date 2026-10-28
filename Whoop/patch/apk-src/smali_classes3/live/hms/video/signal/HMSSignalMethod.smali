.class public final enum Llive/hms/video/signal/HMSSignalMethod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/HMSSignalMethod$Companion;,
        Llive/hms/video/signal/HMSSignalMethod$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/signal/HMSSignalMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u00082\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0080\u0081\u0002\u0018\u0000 72\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u00103\u001a\u000204H\u0016J\u0006\u00105\u001a\u000206j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082\u00a8\u00068"
    }
    d2 = {
        "Llive/hms/video/signal/HMSSignalMethod;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "JOIN",
        "OFFER",
        "ANSWER",
        "TRICKLE",
        "TRACK_UPDATE",
        "ANALYTICS",
        "SERVER_ERROR",
        "SDK_NOTIFICATION",
        "LEAVE",
        "ROLE_CHANGE_REQUEST",
        "ROLE_CHANGE",
        "PEER_LEAVE_REQUEST",
        "END_ROOM",
        "BROADCAST",
        "TRACK_UPDATE_REQUEST",
        "CHANGE_TRACK_MUTE_STATE_REQUEST",
        "RTMP_START",
        "RTMP_STOP",
        "HLS_START",
        "HLS_STOP",
        "PEER_UPDATE",
        "GET_METADATA",
        "SET_METADATA",
        "HLS_TIMED_METADATA",
        "LISTEN_METADATA_CHANGE",
        "POLL_INFO_SET",
        "POLL_INFO_GET",
        "POLL_QUESTIONS_SET",
        "POLL_RESPONSE",
        "POLL_START",
        "POLL_STOP",
        "POLL_QUESTIONS_GET",
        "POLL_RESPONSES",
        "POLL_RESULT",
        "POLL_LEADERBOARD",
        "POLL_LIST",
        "GROUP_JOIN",
        "GROUP_LEAVE",
        "GROUP_ADD",
        "GROUP_REMOVE",
        "FIND_PEER",
        "PEER_ITER_NEXT",
        "WHITEBOARD_CREATE",
        "WHITEBOARD_GET",
        "TRANSCRIPTION_START",
        "TRANSCRIPTION_STOP",
        "PEER_NAME_SEARCH",
        "toString",
        "",
        "toErrorAction",
        "Llive/hms/video/error/ErrorFactory$Action;",
        "Companion",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Llive/hms/video/signal/HMSSignalMethod;

.field public static final enum ANALYTICS:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "analytics"
    .end annotation
.end field

.field public static final enum ANSWER:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "answer"
    .end annotation
.end field

.field public static final enum BROADCAST:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "broadcast"
    .end annotation
.end field

.field public static final enum CHANGE_TRACK_MUTE_STATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "change-track-mute-state-request"
    .end annotation
.end field

.field public static final Companion:Llive/hms/video/signal/HMSSignalMethod$Companion;

.field public static final enum END_ROOM:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end-room"
    .end annotation
.end field

.field public static final enum FIND_PEER:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "find-peer"
    .end annotation
.end field

.field public static final enum GET_METADATA:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "get-metadata"
    .end annotation
.end field

.field public static final enum GROUP_ADD:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "group-add"
    .end annotation
.end field

.field public static final enum GROUP_JOIN:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "group-join"
    .end annotation
.end field

.field public static final enum GROUP_LEAVE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "group-leave"
    .end annotation
.end field

.field public static final enum GROUP_REMOVE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "group-remove"
    .end annotation
.end field

.field public static final enum HLS_START:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hls-start"
    .end annotation
.end field

.field public static final enum HLS_STOP:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hls-stop"
    .end annotation
.end field

.field public static final enum HLS_TIMED_METADATA:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hls-timed-metadata"
    .end annotation
.end field

.field public static final enum JOIN:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "join"
    .end annotation
.end field

.field public static final enum LEAVE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "leave"
    .end annotation
.end field

.field public static final enum LISTEN_METADATA_CHANGE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "listen-metadata-change"
    .end annotation
.end field

.field public static final enum OFFER:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "offer"
    .end annotation
.end field

.field public static final enum PEER_ITER_NEXT:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer-iter-next"
    .end annotation
.end field

.field public static final enum PEER_LEAVE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "on-peer-leave-request"
    .end annotation
.end field

.field public static final enum PEER_NAME_SEARCH:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer-name-search"
    .end annotation
.end field

.field public static final enum PEER_UPDATE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer-update"
    .end annotation
.end field

.field public static final enum POLL_INFO_GET:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-info-get"
    .end annotation
.end field

.field public static final enum POLL_INFO_SET:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-info-set"
    .end annotation
.end field

.field public static final enum POLL_LEADERBOARD:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-leaderboard"
    .end annotation
.end field

.field public static final enum POLL_LIST:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-list"
    .end annotation
.end field

.field public static final enum POLL_QUESTIONS_GET:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-questions-get"
    .end annotation
.end field

.field public static final enum POLL_QUESTIONS_SET:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-questions-set"
    .end annotation
.end field

.field public static final enum POLL_RESPONSE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-response"
    .end annotation
.end field

.field public static final enum POLL_RESPONSES:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-responses"
    .end annotation
.end field

.field public static final enum POLL_RESULT:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-result"
    .end annotation
.end field

.field public static final enum POLL_START:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-start"
    .end annotation
.end field

.field public static final enum POLL_STOP:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "poll-stop"
    .end annotation
.end field

.field public static final enum ROLE_CHANGE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role-change"
    .end annotation
.end field

.field public static final enum ROLE_CHANGE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role-change-request"
    .end annotation
.end field

.field public static final enum RTMP_START:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rtmp-start"
    .end annotation
.end field

.field public static final enum RTMP_STOP:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rtmp-stop"
    .end annotation
.end field

.field public static final enum SDK_NOTIFICATION:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdk-notification"
    .end annotation
.end field

.field public static final enum SERVER_ERROR:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "on-error"
    .end annotation
.end field

.field public static final enum SET_METADATA:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "set-metadata"
    .end annotation
.end field

.field public static final enum TRACK_UPDATE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "track-update"
    .end annotation
.end field

.field public static final enum TRACK_UPDATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "track-update-request"
    .end annotation
.end field

.field public static final enum TRANSCRIPTION_START:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "transcription-start"
    .end annotation
.end field

.field public static final enum TRANSCRIPTION_STOP:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "transcription-stop"
    .end annotation
.end field

.field public static final enum TRICKLE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trickle"
    .end annotation
.end field

.field public static final enum WHITEBOARD_CREATE:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whiteboard-create"
    .end annotation
.end field

.field public static final enum WHITEBOARD_GET:Llive/hms/video/signal/HMSSignalMethod;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whiteboard-get"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Llive/hms/video/signal/HMSSignalMethod;
    .locals 48

    sget-object v1, Llive/hms/video/signal/HMSSignalMethod;->JOIN:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v2, Llive/hms/video/signal/HMSSignalMethod;->OFFER:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v3, Llive/hms/video/signal/HMSSignalMethod;->ANSWER:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v4, Llive/hms/video/signal/HMSSignalMethod;->TRICKLE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v5, Llive/hms/video/signal/HMSSignalMethod;->TRACK_UPDATE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v6, Llive/hms/video/signal/HMSSignalMethod;->ANALYTICS:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v7, Llive/hms/video/signal/HMSSignalMethod;->SERVER_ERROR:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v8, Llive/hms/video/signal/HMSSignalMethod;->SDK_NOTIFICATION:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v9, Llive/hms/video/signal/HMSSignalMethod;->LEAVE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v10, Llive/hms/video/signal/HMSSignalMethod;->ROLE_CHANGE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v11, Llive/hms/video/signal/HMSSignalMethod;->ROLE_CHANGE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v12, Llive/hms/video/signal/HMSSignalMethod;->PEER_LEAVE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v13, Llive/hms/video/signal/HMSSignalMethod;->END_ROOM:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v14, Llive/hms/video/signal/HMSSignalMethod;->BROADCAST:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v15, Llive/hms/video/signal/HMSSignalMethod;->TRACK_UPDATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v16, Llive/hms/video/signal/HMSSignalMethod;->CHANGE_TRACK_MUTE_STATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v17, Llive/hms/video/signal/HMSSignalMethod;->RTMP_START:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v18, Llive/hms/video/signal/HMSSignalMethod;->RTMP_STOP:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v19, Llive/hms/video/signal/HMSSignalMethod;->HLS_START:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v20, Llive/hms/video/signal/HMSSignalMethod;->HLS_STOP:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v21, Llive/hms/video/signal/HMSSignalMethod;->PEER_UPDATE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v22, Llive/hms/video/signal/HMSSignalMethod;->GET_METADATA:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v23, Llive/hms/video/signal/HMSSignalMethod;->SET_METADATA:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v24, Llive/hms/video/signal/HMSSignalMethod;->HLS_TIMED_METADATA:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v25, Llive/hms/video/signal/HMSSignalMethod;->LISTEN_METADATA_CHANGE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v26, Llive/hms/video/signal/HMSSignalMethod;->POLL_INFO_SET:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v27, Llive/hms/video/signal/HMSSignalMethod;->POLL_INFO_GET:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v28, Llive/hms/video/signal/HMSSignalMethod;->POLL_QUESTIONS_SET:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v29, Llive/hms/video/signal/HMSSignalMethod;->POLL_RESPONSE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v30, Llive/hms/video/signal/HMSSignalMethod;->POLL_START:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v31, Llive/hms/video/signal/HMSSignalMethod;->POLL_STOP:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v32, Llive/hms/video/signal/HMSSignalMethod;->POLL_QUESTIONS_GET:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v33, Llive/hms/video/signal/HMSSignalMethod;->POLL_RESPONSES:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v34, Llive/hms/video/signal/HMSSignalMethod;->POLL_RESULT:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v35, Llive/hms/video/signal/HMSSignalMethod;->POLL_LEADERBOARD:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v36, Llive/hms/video/signal/HMSSignalMethod;->POLL_LIST:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v37, Llive/hms/video/signal/HMSSignalMethod;->GROUP_JOIN:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v38, Llive/hms/video/signal/HMSSignalMethod;->GROUP_LEAVE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v39, Llive/hms/video/signal/HMSSignalMethod;->GROUP_ADD:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v40, Llive/hms/video/signal/HMSSignalMethod;->GROUP_REMOVE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v41, Llive/hms/video/signal/HMSSignalMethod;->FIND_PEER:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v42, Llive/hms/video/signal/HMSSignalMethod;->PEER_ITER_NEXT:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v43, Llive/hms/video/signal/HMSSignalMethod;->WHITEBOARD_CREATE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v44, Llive/hms/video/signal/HMSSignalMethod;->WHITEBOARD_GET:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v45, Llive/hms/video/signal/HMSSignalMethod;->TRANSCRIPTION_START:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v46, Llive/hms/video/signal/HMSSignalMethod;->TRANSCRIPTION_STOP:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v47, Llive/hms/video/signal/HMSSignalMethod;->PEER_NAME_SEARCH:Llive/hms/video/signal/HMSSignalMethod;

    filled-new-array/range {v1 .. v47}, [Llive/hms/video/signal/HMSSignalMethod;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "JOIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->JOIN:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "OFFER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->OFFER:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "ANSWER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->ANSWER:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "TRICKLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRICKLE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "TRACK_UPDATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRACK_UPDATE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "ANALYTICS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->ANALYTICS:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "SERVER_ERROR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->SERVER_ERROR:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "SDK_NOTIFICATION"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->SDK_NOTIFICATION:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "LEAVE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->LEAVE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "ROLE_CHANGE_REQUEST"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->ROLE_CHANGE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "ROLE_CHANGE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->ROLE_CHANGE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "PEER_LEAVE_REQUEST"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->PEER_LEAVE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "END_ROOM"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->END_ROOM:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "BROADCAST"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->BROADCAST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "TRACK_UPDATE_REQUEST"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRACK_UPDATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "CHANGE_TRACK_MUTE_STATE_REQUEST"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->CHANGE_TRACK_MUTE_STATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "RTMP_START"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->RTMP_START:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "RTMP_STOP"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->RTMP_STOP:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "HLS_START"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->HLS_START:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "HLS_STOP"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->HLS_STOP:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "PEER_UPDATE"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->PEER_UPDATE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "GET_METADATA"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->GET_METADATA:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "SET_METADATA"

    const/16 v2, 0x16

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->SET_METADATA:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "HLS_TIMED_METADATA"

    const/16 v2, 0x17

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->HLS_TIMED_METADATA:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "LISTEN_METADATA_CHANGE"

    const/16 v2, 0x18

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->LISTEN_METADATA_CHANGE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_INFO_SET"

    const/16 v2, 0x19

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_INFO_SET:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_INFO_GET"

    const/16 v2, 0x1a

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_INFO_GET:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_QUESTIONS_SET"

    const/16 v2, 0x1b

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_QUESTIONS_SET:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_RESPONSE"

    const/16 v2, 0x1c

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_RESPONSE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_START"

    const/16 v2, 0x1d

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_START:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_STOP"

    const/16 v2, 0x1e

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_STOP:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_QUESTIONS_GET"

    const/16 v2, 0x1f

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_QUESTIONS_GET:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_RESPONSES"

    const/16 v2, 0x20

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_RESPONSES:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_RESULT"

    const/16 v2, 0x21

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_RESULT:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_LEADERBOARD"

    const/16 v2, 0x22

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_LEADERBOARD:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "POLL_LIST"

    const/16 v2, 0x23

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->POLL_LIST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "GROUP_JOIN"

    const/16 v2, 0x24

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->GROUP_JOIN:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "GROUP_LEAVE"

    const/16 v2, 0x25

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->GROUP_LEAVE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "GROUP_ADD"

    const/16 v2, 0x26

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->GROUP_ADD:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "GROUP_REMOVE"

    const/16 v2, 0x27

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->GROUP_REMOVE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "FIND_PEER"

    const/16 v2, 0x28

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->FIND_PEER:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "PEER_ITER_NEXT"

    const/16 v2, 0x29

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->PEER_ITER_NEXT:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "WHITEBOARD_CREATE"

    const/16 v2, 0x2a

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->WHITEBOARD_CREATE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "WHITEBOARD_GET"

    const/16 v2, 0x2b

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->WHITEBOARD_GET:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "TRANSCRIPTION_START"

    const/16 v2, 0x2c

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRANSCRIPTION_START:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "TRANSCRIPTION_STOP"

    const/16 v2, 0x2d

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRANSCRIPTION_STOP:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod;

    const-string v1, "PEER_NAME_SEARCH"

    const/16 v2, 0x2e

    invoke-direct {v0, v1, v2}, Llive/hms/video/signal/HMSSignalMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->PEER_NAME_SEARCH:Llive/hms/video/signal/HMSSignalMethod;

    invoke-static {}, Llive/hms/video/signal/HMSSignalMethod;->$values()[Llive/hms/video/signal/HMSSignalMethod;

    move-result-object v0

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->$VALUES:[Llive/hms/video/signal/HMSSignalMethod;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->$ENTRIES:Lt83/a;

    new-instance v0, Llive/hms/video/signal/HMSSignalMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/signal/HMSSignalMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/signal/HMSSignalMethod;->Companion:Llive/hms/video/signal/HMSSignalMethod$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Llive/hms/video/signal/HMSSignalMethod;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/signal/HMSSignalMethod;
    .locals 1

    const-class v0, Llive/hms/video/signal/HMSSignalMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/signal/HMSSignalMethod;

    return-object p0
.end method

.method public static values()[Llive/hms/video/signal/HMSSignalMethod;
    .locals 1

    sget-object v0, Llive/hms/video/signal/HMSSignalMethod;->$VALUES:[Llive/hms/video/signal/HMSSignalMethod;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/signal/HMSSignalMethod;

    return-object v0
.end method


# virtual methods
.method public final toErrorAction()Llive/hms/video/error/ErrorFactory$Action;
    .locals 2

    sget-object v0, Llive/hms/video/signal/HMSSignalMethod$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_0
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_1
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_2
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_3
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_4
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_5
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_6
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->SUBSCRIBE:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_7
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->PUBLISH:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    :pswitch_8
    sget-object v0, Llive/hms/video/error/ErrorFactory$Action;->JOIN:Llive/hms/video/error/ErrorFactory$Action;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "ROOT"

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v2, v0, v1, v3}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const/4 v2, 0x0

    const-string v3, "_"

    invoke-static {v0, v3, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
