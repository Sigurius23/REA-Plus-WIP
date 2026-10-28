.class public final Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0016\u0008\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0003JY\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0016\u0008\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;",
        "",
        "sipCallerNumber",
        "",
        "sipTrunkNumber",
        "routingNumber",
        "trunkId",
        "challenge",
        "Lio/getstream/android/video/generated/models/SIPChallengeRequest;",
        "sipHeaders",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)V",
        "getChallenge",
        "()Lio/getstream/android/video/generated/models/SIPChallengeRequest;",
        "getRoutingNumber",
        "()Ljava/lang/String;",
        "getSipCallerNumber",
        "getSipHeaders",
        "()Ljava/util/Map;",
        "getSipTrunkNumber",
        "getTrunkId",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

.field private final routingNumber:Ljava/lang/String;

.field private final sipCallerNumber:Ljava/lang/String;

.field private final sipHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sipTrunkNumber:Ljava/lang/String;

.field private final trunkId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sip_caller_number"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sip_trunk_number"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "routing_number"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "trunk_id"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/SIPChallengeRequest;
        .annotation runtime Lqx/q;
            name = "challenge"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "sip_headers"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/SIPChallengeRequest;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sipCallerNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sipTrunkNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_3

    .line 8
    sget-object p6, Lm83/z;->w:Lm83/z;

    :cond_3
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p7}, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/SIPChallengeRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sip_caller_number"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sip_trunk_number"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "routing_number"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "trunk_id"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/SIPChallengeRequest;
        .annotation runtime Lqx/q;
            name = "challenge"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "sip_headers"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/SIPChallengeRequest;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;"
        }
    .end annotation

    const-string v0, "sipCallerNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sipTrunkNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SIPChallengeRequest;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getChallenge()Lio/getstream/android/video/generated/models/SIPChallengeRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    return-object v0
.end method

.method public final getRoutingNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getSipCallerNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getSipHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    return-object v0
.end method

.method public final getSipTrunkNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrunkId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/SIPChallengeRequest;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipCallerNumber:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipTrunkNumber:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->routingNumber:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->trunkId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->challenge:Lio/getstream/android/video/generated/models/SIPChallengeRequest;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;->sipHeaders:Ljava/util/Map;

    const-string v6, ", sipTrunkNumber="

    const-string v7, ", routingNumber="

    const-string v8, "ResolveSipInboundRequest(sipCallerNumber="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trunkId="

    const-string v6, ", challenge="

    invoke-static {v0, v2, v1, v3, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sipHeaders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
