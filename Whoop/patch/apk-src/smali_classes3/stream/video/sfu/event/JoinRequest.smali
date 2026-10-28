.class public final Lstream/video/sfu/event/JoinRequest;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/JoinRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008%\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB\u00ab\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\r2\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u00b1\u0001\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00112\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00112\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008,\u0010(R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008-\u0010(R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008.\u0010(R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008/\u0010(R\u001a\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u00080\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00082\u00103R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00104\u0012\u0004\u00087\u00108\u001a\u0004\u00085\u00106R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00109\u0012\u0004\u0008<\u00108\u001a\u0004\u0008:\u0010;R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010=\u001a\u0004\u0008>\u0010?R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010@\u001a\u0004\u0008A\u0010BR \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010C\u001a\u0004\u0008D\u0010ER \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010C\u001a\u0004\u0008F\u0010ER \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010C\u001a\u0004\u0008G\u0010E\u00a8\u0006I"
    }
    d2 = {
        "Lstream/video/sfu/event/JoinRequest;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "token",
        "session_id",
        "unified_session_id",
        "subscriber_sdp",
        "publisher_sdp",
        "Lstream/video/sfu/models/ClientDetails;",
        "client_details",
        "Lstream/video/sfu/event/Migration;",
        "migration",
        "",
        "fast_reconnect",
        "Lstream/video/sfu/event/ReconnectDetails;",
        "reconnect_details",
        "",
        "Lstream/video/sfu/models/PublishOption;",
        "preferred_publish_options",
        "Lstream/video/sfu/models/SubscribeOption;",
        "preferred_subscribe_options",
        "Lstream/video/sfu/models/ClientCapability;",
        "capabilities",
        "Lstream/video/sfu/models/ParticipantSource;",
        "source",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/event/JoinRequest;",
        "Ljava/lang/String;",
        "getToken",
        "getSession_id",
        "getUnified_session_id",
        "getSubscriber_sdp",
        "getPublisher_sdp",
        "Lstream/video/sfu/models/ClientDetails;",
        "getClient_details",
        "()Lstream/video/sfu/models/ClientDetails;",
        "Lstream/video/sfu/event/Migration;",
        "getMigration",
        "()Lstream/video/sfu/event/Migration;",
        "getMigration$annotations",
        "()V",
        "Z",
        "getFast_reconnect",
        "()Z",
        "getFast_reconnect$annotations",
        "Lstream/video/sfu/event/ReconnectDetails;",
        "getReconnect_details",
        "()Lstream/video/sfu/event/ReconnectDetails;",
        "Lstream/video/sfu/models/ParticipantSource;",
        "getSource",
        "()Lstream/video/sfu/models/ParticipantSource;",
        "Ljava/util/List;",
        "getPreferred_publish_options",
        "()Ljava/util/List;",
        "getPreferred_subscribe_options",
        "getCapabilities",
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

.field public static final Companion:Lstream/video/sfu/event/JoinRequest$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final capabilities:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ClientCapability#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        schemaIndex = 0xb
        tag = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/ClientCapability;",
            ">;"
        }
    .end annotation
.end field

.field private final client_details:Lstream/video/sfu/models/ClientDetails;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ClientDetails#ADAPTER"
        jsonName = "clientDetails"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x5
        tag = 0x4
    .end annotation
.end field

.field private final fast_reconnect:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        jsonName = "fastReconnect"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x7
        tag = 0x6
    .end annotation
.end field

.field private final migration:Lstream/video/sfu/event/Migration;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.Migration#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x6
        tag = 0x5
    .end annotation
.end field

.field private final preferred_publish_options:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.PublishOption#ADAPTER"
        jsonName = "preferredPublishOptions"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        schemaIndex = 0x9
        tag = 0x9
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PublishOption;",
            ">;"
        }
    .end annotation
.end field

.field private final preferred_subscribe_options:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.SubscribeOption#ADAPTER"
        jsonName = "preferredSubscribeOptions"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        schemaIndex = 0xa
        tag = 0xa
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/SubscribeOption;",
            ">;"
        }
    .end annotation
.end field

.field private final publisher_sdp:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "publisherSdp"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x4
        tag = 0x8
    .end annotation
.end field

.field private final reconnect_details:Lstream/video/sfu/event/ReconnectDetails;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ReconnectDetails#ADAPTER"
        jsonName = "reconnectDetails"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x8
        tag = 0x7
    .end annotation
.end field

.field private final session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "sessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x1
        tag = 0x2
    .end annotation
.end field

.field private final source:Lstream/video/sfu/models/ParticipantSource;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ParticipantSource#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0xc
        tag = 0xc
    .end annotation
.end field

.field private final subscriber_sdp:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "subscriberSdp"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x3
        tag = 0x3
    .end annotation
.end field

.field private final token:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x0
        tag = 0x1
    .end annotation
.end field

.field private final unified_session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "unifiedSessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        schemaIndex = 0x2
        tag = 0xd
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/event/JoinRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/JoinRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/JoinRequest;->Companion:Lstream/video/sfu/event/JoinRequest$Companion;

    const-class v0, Lstream/video/sfu/event/JoinRequest;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/JoinRequest$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/JoinRequest$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 17

    .line 1
    const/16 v15, 0x3fff

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v16}, Lstream/video/sfu/event/JoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/ClientDetails;",
            "Lstream/video/sfu/event/Migration;",
            "Z",
            "Lstream/video/sfu/event/ReconnectDetails;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PublishOption;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/SubscribeOption;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lstream/video/sfu/models/ClientCapability;",
            ">;",
            "Lstream/video/sfu/models/ParticipantSource;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    move-object v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p10

    move-object/from16 v4, p11

    move-object/from16 v5, p12

    move-object/from16 v6, p13

    move-object/from16 v7, p14

    const-string v8, "token"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "session_id"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "unified_session_id"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "subscriber_sdp"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "publisher_sdp"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "preferred_publish_options"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "preferred_subscribe_options"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "capabilities"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "source"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "unknownFields"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v11, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v11, v7}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 7
    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    .line 10
    iput-object v1, p0, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    .line 11
    iput-object v2, p0, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    move-object/from16 p1, p6

    .line 12
    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    move-object/from16 p1, p7

    .line 13
    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    move/from16 p1, p8

    .line 14
    iput-boolean p1, p0, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    move-object/from16 p1, p9

    .line 15
    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    .line 16
    iput-object v6, p0, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    .line 17
    invoke-static {v8, v3}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    .line 18
    invoke-static {v9, v4}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    .line 19
    invoke-static {v10, v5}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    .line 2
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    move-object v3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    move-object v4, v2

    goto :goto_2

    :cond_3
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    move-object/from16 v2, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    move-object v5, v6

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    move-object v7, v6

    goto :goto_5

    :cond_6
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    const/4 v8, 0x0

    goto :goto_6

    :cond_7
    move/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    goto :goto_7

    :cond_8
    move-object/from16 v6, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    sget-object v10, Lm83/y;->w:Lm83/y;

    if-eqz v9, :cond_9

    move-object v9, v10

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    move-object v11, v10

    goto :goto_9

    :cond_a
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    goto :goto_a

    :cond_b
    move-object/from16 v10, p12

    :goto_a
    and-int/lit16 v12, v0, 0x1000

    if-eqz v12, :cond_c

    .line 3
    sget-object v12, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    goto :goto_b

    :cond_c
    move-object/from16 v12, p13

    :goto_b
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    .line 4
    sget-object v0, Lne3/l;->E:Lne3/l;

    move-object/from16 p15, v0

    :goto_c
    move-object p2, p1

    move-object/from16 p3, v1

    move-object/from16 p6, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p7, v5

    move-object/from16 p10, v6

    move-object/from16 p8, v7

    move/from16 p9, v8

    move-object/from16 p11, v9

    move-object/from16 p13, v10

    move-object/from16 p12, v11

    move-object/from16 p14, v12

    move-object p1, p0

    goto :goto_d

    :cond_d
    move-object/from16 p15, p14

    goto :goto_c

    .line 5
    :goto_d
    invoke-direct/range {p1 .. p15}, Lstream/video/sfu/event/JoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/JoinRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/JoinRequest;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-boolean v8, p0, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    goto :goto_7

    :cond_7
    move/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lstream/video/sfu/event/JoinRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/event/JoinRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getFast_reconnect$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getMigration$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/event/JoinRequest;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/ClientDetails;",
            "Lstream/video/sfu/event/Migration;",
            "Z",
            "Lstream/video/sfu/event/ReconnectDetails;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PublishOption;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/SubscribeOption;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lstream/video/sfu/models/ClientCapability;",
            ">;",
            "Lstream/video/sfu/models/ParticipantSource;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/event/JoinRequest;"
        }
    .end annotation

    const-string v0, "token"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session_id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unified_session_id"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriber_sdp"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publisher_sdp"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferred_publish_options"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferred_subscribe_options"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capabilities"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/event/JoinRequest;

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v15}, Lstream/video/sfu/event/JoinRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/JoinRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/JoinRequest;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    iget-boolean v3, p1, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    iget-object p1, p1, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getCapabilities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/ClientCapability;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    return-object v0
.end method

.method public final getClient_details()Lstream/video/sfu/models/ClientDetails;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    return-object v0
.end method

.method public final getFast_reconnect()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    return v0
.end method

.method public final getMigration()Lstream/video/sfu/event/Migration;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    return-object v0
.end method

.method public final getPreferred_publish_options()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/PublishOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    return-object v0
.end method

.method public final getPreferred_subscribe_options()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/SubscribeOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    return-object v0
.end method

.method public final getPublisher_sdp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    return-object v0
.end method

.method public final getReconnect_details()Lstream/video/sfu/event/ReconnectDetails;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    return-object v0
.end method

.method public final getSession_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Lstream/video/sfu/models/ParticipantSource;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    return-object v0
.end method

.method public final getSubscriber_sdp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnified_session_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lstream/video/sfu/models/ClientDetails;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lstream/video/sfu/event/Migration;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lstream/video/sfu/event/ReconnectDetails;->hashCode()I

    move-result v3

    :cond_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_3
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/event/JoinRequest;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->token:Ljava/lang/String;

    const-string v2, "token="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->session_id:Ljava/lang/String;

    const-string v2, "session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->unified_session_id:Ljava/lang/String;

    const-string v2, "unified_session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->subscriber_sdp:Ljava/lang/String;

    const-string v2, "subscriber_sdp="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->publisher_sdp:Ljava/lang/String;

    const-string v2, "publisher_sdp="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->client_details:Lstream/video/sfu/models/ClientDetails;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "client_details="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->migration:Lstream/video/sfu/event/Migration;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "migration="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-boolean v1, p0, Lstream/video/sfu/event/JoinRequest;->fast_reconnect:Z

    const-string v2, "fast_reconnect="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->reconnect_details:Lstream/video/sfu/event/ReconnectDetails;

    if-eqz v1, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "reconnect_details="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_publish_options:Ljava/util/List;

    const-string v2, "preferred_publish_options="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->preferred_subscribe_options:Ljava/util/List;

    const-string v2, "preferred_subscribe_options="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->capabilities:Ljava/util/List;

    const-string v2, "capabilities="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/event/JoinRequest;->source:Lstream/video/sfu/models/ParticipantSource;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "source="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "JoinRequest{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
