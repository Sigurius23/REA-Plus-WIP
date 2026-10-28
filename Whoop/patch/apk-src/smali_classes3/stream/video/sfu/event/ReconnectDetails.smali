.class public final Lstream/video/sfu/event/ReconnectDetails;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/ReconnectDetails$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.Bc\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJi\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010$\u001a\u0004\u0008%\u0010\u001cR\u001a\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010&\u001a\u0004\u0008\'\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010&\u001a\u0004\u0008(\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010&\u001a\u0004\u0008)\u0010\u001eR \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008+\u0010,R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010*\u001a\u0004\u0008-\u0010,\u00a8\u0006/"
    }
    d2 = {
        "Lstream/video/sfu/event/ReconnectDetails;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/WebsocketReconnectStrategy;",
        "strategy",
        "",
        "Lstream/video/sfu/models/TrackInfo;",
        "announced_tracks",
        "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
        "subscriptions",
        "",
        "reconnect_attempt",
        "",
        "from_sfu_id",
        "previous_session_id",
        "reason",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ReconnectDetails;",
        "Lstream/video/sfu/models/WebsocketReconnectStrategy;",
        "getStrategy",
        "()Lstream/video/sfu/models/WebsocketReconnectStrategy;",
        "I",
        "getReconnect_attempt",
        "Ljava/lang/String;",
        "getFrom_sfu_id",
        "getPrevious_session_id",
        "getReason",
        "Ljava/util/List;",
        "getAnnounced_tracks",
        "()Ljava/util/List;",
        "getSubscriptions",
        "Companion",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final Companion:Lstream/video/sfu/event/ReconnectDetails$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final announced_tracks:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackInfo#ADAPTER"
        jsonName = "announcedTracks"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final from_sfu_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "fromSfuId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation
.end field

.field private final previous_session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "previousSessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x7
    .end annotation
.end field

.field private final reason:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x8
    .end annotation
.end field

.field private final reconnect_attempt:I
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#UINT32"
        jsonName = "reconnectAttempt"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field

.field private final strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.WebsocketReconnectStrategy#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final subscriptions:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.signal.TrackSubscriptionDetails#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/event/ReconnectDetails$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/ReconnectDetails$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/ReconnectDetails;->Companion:Lstream/video/sfu/event/ReconnectDetails$Companion;

    const-class v0, Lstream/video/sfu/event/ReconnectDetails;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/ReconnectDetails$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/ReconnectDetails;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/WebsocketReconnectStrategy;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackInfo;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "announced_tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subscriptions"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "from_sfu_id"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "previous_session_id"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "reason"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unknownFields"

    invoke-static {p8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v2, Lstream/video/sfu/event/ReconnectDetails;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v2, p8}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 7
    iput-object p1, p0, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    .line 8
    iput p4, p0, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    .line 9
    iput-object p5, p0, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    .line 12
    invoke-static {v0, p2}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    .line 13
    invoke-static {v1, p3}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    .line 2
    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 3
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    const/4 p4, 0x0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    const-string v0, ""

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 4
    sget-object p8, Lne3/l;->E:Lne3/l;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 5
    invoke-direct/range {p2 .. p10}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/ReconnectDetails;Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/ReconnectDetails;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p8

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lstream/video/sfu/event/ReconnectDetails;->copy(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ReconnectDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ReconnectDetails;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/WebsocketReconnectStrategy;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackInfo;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
            ">;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/event/ReconnectDetails;"
        }
    .end annotation

    const-string v0, "strategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "announced_tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "from_sfu_id"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previous_session_id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/event/ReconnectDetails;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lstream/video/sfu/event/ReconnectDetails;-><init>(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/ReconnectDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/ReconnectDetails;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    iget-object v3, p1, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    iget v3, p1, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    iget-object p1, p1, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAnnounced_tracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    return-object v0
.end method

.method public final getFrom_sfu_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrevious_session_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final getReconnect_attempt()I
    .locals 1

    iget v0, p0, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    return v0
.end method

.method public final getStrategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    return-object v0
.end method

.method public final getSubscriptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_0
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/event/ReconnectDetails;->newBuilder()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/j;

    return-object v0
.end method

.method public synthetic newBuilder()Ljava/lang/Void;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->strategy:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "strategy="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->announced_tracks:Ljava/util/List;

    const-string v2, "announced_tracks="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->subscriptions:Ljava/util/List;

    const-string v2, "subscriptions="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_1
    iget v1, p0, Lstream/video/sfu/event/ReconnectDetails;->reconnect_attempt:I

    const-string v2, "reconnect_attempt="

    invoke-static {v1, v2, v0}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->from_sfu_id:Ljava/lang/String;

    const-string v2, "from_sfu_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->previous_session_id:Ljava/lang/String;

    const-string v2, "previous_session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/ReconnectDetails;->reason:Ljava/lang/String;

    const-string v2, "reason="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "ReconnectDetails{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
