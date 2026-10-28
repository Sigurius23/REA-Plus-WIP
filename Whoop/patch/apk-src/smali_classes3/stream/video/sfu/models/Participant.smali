.class public final Lstream/video/sfu/models/Participant;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/Participant$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008#\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u00bd\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\u0008\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0016\u0012\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\u0008\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u00c3\u0001\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0010\u0008\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00162\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008-\u0010)R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008.\u0010)R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u00080\u00101R\u001a\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010,\u001a\u0004\u00082\u0010)R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00103\u001a\u0004\u00084\u00105R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00106\u001a\u0004\u0008\u0010\u00107R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00106\u001a\u0004\u0008\u0011\u00107R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u00108\u001a\u0004\u00089\u0010:R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010,\u001a\u0004\u0008;\u0010)R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010,\u001a\u0004\u0008<\u0010)R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010=\u001a\u0004\u0008>\u0010?R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008A\u0010BR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010C\u001a\u0004\u0008D\u0010ER \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010@\u001a\u0004\u0008F\u0010B\u00a8\u0006H"
    }
    d2 = {
        "Lstream/video/sfu/models/Participant;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "user_id",
        "session_id",
        "",
        "Lstream/video/sfu/models/TrackType;",
        "published_tracks",
        "Ljava/time/Instant;",
        "Lcom/squareup/wire/Instant;",
        "joined_at",
        "track_lookup_prefix",
        "Lstream/video/sfu/models/ConnectionQuality;",
        "connection_quality",
        "",
        "is_speaking",
        "is_dominant_speaker",
        "",
        "audio_level",
        "name",
        "image",
        "",
        "custom",
        "roles",
        "Lstream/video/sfu/models/ParticipantSource;",
        "source",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V",
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
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/models/Participant;",
        "Ljava/lang/String;",
        "getUser_id",
        "getSession_id",
        "Ljava/time/Instant;",
        "getJoined_at",
        "()Ljava/time/Instant;",
        "getTrack_lookup_prefix",
        "Lstream/video/sfu/models/ConnectionQuality;",
        "getConnection_quality",
        "()Lstream/video/sfu/models/ConnectionQuality;",
        "Z",
        "()Z",
        "F",
        "getAudio_level",
        "()F",
        "getName",
        "getImage",
        "Lstream/video/sfu/models/ParticipantSource;",
        "getSource",
        "()Lstream/video/sfu/models/ParticipantSource;",
        "Ljava/util/List;",
        "getPublished_tracks",
        "()Ljava/util/List;",
        "Ljava/util/Map;",
        "getCustom",
        "()Ljava/util/Map;",
        "getRoles",
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

.field public static final Companion:Lstream/video/sfu/models/Participant$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final audio_level:F
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
        jsonName = "audioLevel"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x9
    .end annotation
.end field

.field private final connection_quality:Lstream/video/sfu/models/ConnectionQuality;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ConnectionQuality#ADAPTER"
        jsonName = "connectionQuality"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x6
    .end annotation
.end field

.field private final custom:Ljava/util/Map;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xc
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation
.end field

.field private final image:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xb
    .end annotation
.end field

.field private final is_dominant_speaker:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        jsonName = "isDominantSpeaker"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x8
    .end annotation
.end field

.field private final is_speaking:Z
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#BOOL"
        jsonName = "isSpeaking"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x7
    .end annotation
.end field

.field private final joined_at:Ljava/time/Instant;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INSTANT"
        jsonName = "joinedAt"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xa
    .end annotation
.end field

.field private final published_tracks:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackType#ADAPTER"
        jsonName = "publishedTracks"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackType;",
            ">;"
        }
    .end annotation
.end field

.field private final roles:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0xd
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final session_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "sessionId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field

.field private final source:Lstream/video/sfu/models/ParticipantSource;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ParticipantSource#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0xe
    .end annotation
.end field

.field private final track_lookup_prefix:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "trackLookupPrefix"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
    .end annotation
.end field

.field private final user_id:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "userId"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/Participant$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/Participant$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/Participant;->Companion:Lstream/video/sfu/models/Participant$Companion;

    const-class v0, Lstream/video/sfu/models/Participant;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/Participant$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 18

    .line 1
    const/16 v16, 0x7fff

    const/16 v17, 0x0

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

    const/4 v15, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v17}, Lstream/video/sfu/models/Participant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lstream/video/sfu/models/TrackType;",
            ">;",
            "Ljava/time/Instant;",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/ConnectionQuality;",
            "ZZF",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lstream/video/sfu/models/ParticipantSource;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    move-object v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p13

    move-object/from16 v5, p14

    move-object/from16 v6, p15

    const-string v7, "user_id"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "session_id"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "published_tracks"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "track_lookup_prefix"

    invoke-static {p5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "connection_quality"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "name"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "image"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "roles"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "source"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "unknownFields"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v9, Lstream/video/sfu/models/Participant;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v9, v6}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 8
    iput-object p1, p0, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    .line 11
    iput-object v0, p0, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    .line 12
    iput-object v1, p0, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    move/from16 p1, p7

    .line 13
    iput-boolean p1, p0, Lstream/video/sfu/models/Participant;->is_speaking:Z

    move/from16 p1, p8

    .line 14
    iput-boolean p1, p0, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    move/from16 p1, p9

    .line 15
    iput p1, p0, Lstream/video/sfu/models/Participant;->audio_level:F

    .line 16
    iput-object v2, p0, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    .line 17
    iput-object v3, p0, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    .line 18
    iput-object v5, p0, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

    .line 19
    invoke-static {v7, p3}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    .line 20
    invoke-static/range {p12 .. p12}, Ls30/e;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    .line 21
    invoke-static {v8, v4}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    .line 2
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    sget-object v5, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_2

    move-object v4, v5

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    move-object v6, v7

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    .line 3
    sget-object v9, Lstream/video/sfu/models/ConnectionQuality;->CONNECTION_QUALITY_UNSPECIFIED:Lstream/video/sfu/models/ConnectionQuality;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    const/4 v11, 0x0

    if-eqz v10, :cond_6

    move v10, v11

    goto :goto_6

    :cond_6
    move/from16 v10, p7

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    const/4 v12, 0x0

    goto :goto_8

    :cond_8
    move/from16 v12, p9

    :goto_8
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_9

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    goto :goto_a

    :cond_a
    move-object/from16 v2, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move-object/from16 v7, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    goto :goto_c

    :cond_c
    move-object/from16 v5, p13

    :goto_c
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    .line 4
    sget-object v14, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    goto :goto_d

    :cond_d
    move-object/from16 v14, p14

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    .line 5
    sget-object v0, Lne3/l;->E:Lne3/l;

    move-object/from16 p16, v0

    :goto_e
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p12, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p14, v5

    move-object/from16 p5, v6

    move-object/from16 p13, v7

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move/from16 p8, v10

    move/from16 p9, v11

    move/from16 p10, v12

    move-object/from16 p11, v13

    move-object/from16 p15, v14

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    .line 6
    :goto_f
    invoke-direct/range {p1 .. p16}, Lstream/video/sfu/models/Participant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/Participant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/Participant;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lstream/video/sfu/models/Participant;->is_speaking:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lstream/video/sfu/models/Participant;->audio_level:F

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    invoke-virtual {v0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lstream/video/sfu/models/Participant;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/models/Participant;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/models/Participant;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lstream/video/sfu/models/TrackType;",
            ">;",
            "Ljava/time/Instant;",
            "Ljava/lang/String;",
            "Lstream/video/sfu/models/ConnectionQuality;",
            "ZZF",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lstream/video/sfu/models/ParticipantSource;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/models/Participant;"
        }
    .end annotation

    const-string v0, "user_id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session_id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "published_tracks"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track_lookup_prefix"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection_quality"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roles"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/Participant;

    move-object/from16 v5, p4

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lstream/video/sfu/models/Participant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/Participant;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/Participant;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lstream/video/sfu/models/Participant;->is_speaking:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/Participant;->is_speaking:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    iget-boolean v3, p1, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lstream/video/sfu/models/Participant;->audio_level:F

    iget v3, p1, Lstream/video/sfu/models/Participant;->audio_level:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_10

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

    iget-object p1, p1, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0

    :cond_10
    return v2
.end method

.method public final getAudio_level()F
    .locals 1

    iget v0, p0, Lstream/video/sfu/models/Participant;->audio_level:F

    return v0
.end method

.method public final getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    return-object v0
.end method

.method public final getCustom()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getJoined_at()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublished_tracks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    return-object v0
.end method

.method public final getRoles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    return-object v0
.end method

.method public final getSession_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Lstream/video/sfu/models/ParticipantSource;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

    return-object v0
.end method

.method public final getTrack_lookup_prefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/time/Instant;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lstream/video/sfu/models/Participant;->is_speaking:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lstream/video/sfu/models/Participant;->audio_level:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :cond_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_2
    return v0
.end method

.method public final is_dominant_speaker()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    return v0
.end method

.method public final is_speaking()Z
    .locals 1

    iget-boolean v0, p0, Lstream/video/sfu/models/Participant;->is_speaking:Z

    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/models/Participant;->newBuilder()Ljava/lang/Void;

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
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->user_id:Ljava/lang/String;

    const-string v2, "user_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->session_id:Ljava/lang/String;

    const-string v2, "session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->published_tracks:Ljava/util/List;

    const-string v2, "published_tracks="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->joined_at:Ljava/time/Instant;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "joined_at="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->track_lookup_prefix:Ljava/lang/String;

    const-string v2, "track_lookup_prefix="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->connection_quality:Lstream/video/sfu/models/ConnectionQuality;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "connection_quality="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v1, p0, Lstream/video/sfu/models/Participant;->is_speaking:Z

    const-string v2, "is_speaking="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget-boolean v1, p0, Lstream/video/sfu/models/Participant;->is_dominant_speaker:Z

    const-string v2, "is_dominant_speaker="

    invoke-static {v2, v1, v0}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    iget v1, p0, Lstream/video/sfu/models/Participant;->audio_level:F

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "audio_level="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->name:Ljava/lang/String;

    const-string v2, "name="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->image:Ljava/lang/String;

    const-string v2, "image="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->custom:Ljava/util/Map;

    if-eqz v1, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "custom="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lstream/video/sfu/models/Participant;->roles:Ljava/util/List;

    const-string v2, "values"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    sget-object v7, Ltx/e;->w:Ltx/e;

    const/16 v8, 0x19

    const/4 v4, 0x0

    const-string v5, "["

    const-string v6, "]"

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "roles="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/models/Participant;->source:Lstream/video/sfu/models/ParticipantSource;

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

    const-string v2, "Participant{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
