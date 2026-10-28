.class public final Lstream/video/sfu/signal/SendMetricsRequest;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/signal/SendMetricsRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Be\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJk\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010!\u001a\u0004\u0008\"\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010!\u001a\u0004\u0008#\u0010\u001eR \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010$\u001a\u0004\u0008%\u0010&R \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010$\u001a\u0004\u0008\'\u0010&R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010$\u001a\u0004\u0008(\u0010&R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010$\u001a\u0004\u0008)\u0010&\u00a8\u0006+"
    }
    d2 = {
        "Lstream/video/sfu/signal/SendMetricsRequest;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "session_id",
        "unified_session_id",
        "",
        "Lstream/video/sfu/models/InboundRtp;",
        "inbounds",
        "Lstream/video/sfu/models/OutboundRtp;",
        "outbounds",
        "Lstream/video/sfu/models/RemoteInboundRtp;",
        "remote_inbounds",
        "Lstream/video/sfu/models/RemoteOutboundRtp;",
        "remote_outbounds",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/signal/SendMetricsRequest;",
        "Ljava/lang/String;",
        "getSession_id",
        "getUnified_session_id",
        "Ljava/util/List;",
        "getInbounds",
        "()Ljava/util/List;",
        "getOutbounds",
        "getRemote_inbounds",
        "getRemote_outbounds",
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

.field public static final Companion:Lstream/video/sfu/signal/SendMetricsRequest$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final inbounds:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.InboundRtp#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/InboundRtp;",
            ">;"
        }
    .end annotation
.end field

.field private final outbounds:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.OutboundRtp#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/OutboundRtp;",
            ">;"
        }
    .end annotation
.end field

.field private final remote_inbounds:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.RemoteInboundRtp#ADAPTER"
        jsonName = "remoteInbounds"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteInboundRtp;",
            ">;"
        }
    .end annotation
.end field

.field private final remote_outbounds:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.RemoteOutboundRtp#ADAPTER"
        jsonName = "remoteOutbounds"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteOutboundRtp;",
            ">;"
        }
    .end annotation
.end field

.field private final session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "sessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field

.field private final unified_session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "unifiedSessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/signal/SendMetricsRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/signal/SendMetricsRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/signal/SendMetricsRequest;->Companion:Lstream/video/sfu/signal/SendMetricsRequest$Companion;

    const-class v0, Lstream/video/sfu/signal/SendMetricsRequest;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/signal/SendMetricsRequest$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/signal/SendMetricsRequest$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/signal/SendMetricsRequest;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lstream/video/sfu/signal/SendMetricsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/InboundRtp;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/OutboundRtp;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteInboundRtp;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteOutboundRtp;",
            ">;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "session_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unified_session_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inbounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "outbounds"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "remote_inbounds"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "remote_outbounds"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "unknownFields"

    invoke-static {p7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v4, Lstream/video/sfu/signal/SendMetricsRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v4, p7}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 6
    iput-object p1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

    .line 8
    invoke-static {v0, p3}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    .line 9
    invoke-static {v1, p4}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    .line 10
    invoke-static {v2, p5}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    .line 11
    invoke-static {v3, p6}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 2
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    .line 3
    sget-object p7, Lne3/l;->E:Lne3/l;

    :cond_6
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p8}, Lstream/video/sfu/signal/SendMetricsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/signal/SendMetricsRequest;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/signal/SendMetricsRequest;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p7

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lstream/video/sfu/signal/SendMetricsRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/signal/SendMetricsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/signal/SendMetricsRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/InboundRtp;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/OutboundRtp;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteInboundRtp;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteOutboundRtp;",
            ">;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/signal/SendMetricsRequest;"
        }
    .end annotation

    const-string v0, "session_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unified_session_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inbounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outbounds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote_inbounds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remote_outbounds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/signal/SendMetricsRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lstream/video/sfu/signal/SendMetricsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/signal/SendMetricsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/signal/SendMetricsRequest;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    iget-object p1, p1, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getInbounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/InboundRtp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    return-object v0
.end method

.method public final getOutbounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/OutboundRtp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    return-object v0
.end method

.method public final getRemote_inbounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteInboundRtp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    return-object v0
.end method

.method public final getRemote_outbounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/RemoteOutboundRtp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    return-object v0
.end method

.method public final getSession_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnified_session_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

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

    iget-object v2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    invoke-virtual {p0}, Lstream/video/sfu/signal/SendMetricsRequest;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->session_id:Ljava/lang/String;

    const-string v2, "session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->unified_session_id:Ljava/lang/String;

    const-string v2, "unified_session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->inbounds:Ljava/util/List;

    const-string v2, "inbounds="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->outbounds:Ljava/util/List;

    const-string v2, "outbounds="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_1
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_inbounds:Ljava/util/List;

    const-string v2, "remote_inbounds="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lstream/video/sfu/signal/SendMetricsRequest;->remote_outbounds:Ljava/util/List;

    const-string v2, "remote_outbounds="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_3
    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "SendMetricsRequest{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
