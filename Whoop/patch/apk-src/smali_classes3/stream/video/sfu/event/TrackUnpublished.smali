.class public final Lstream/video/sfu/event/TrackUnpublished;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/TrackUnpublished$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0014\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*BE\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001e\u001a\u0004\u0008 \u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010!\u001a\u0004\u0008\"\u0010#R\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010$\u001a\u0004\u0008%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lstream/video/sfu/event/TrackUnpublished;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "user_id",
        "session_id",
        "Lstream/video/sfu/models/TrackType;",
        "type",
        "Lstream/video/sfu/models/TrackUnpublishReason;",
        "cause",
        "Lstream/video/sfu/models/Participant;",
        "participant",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)V",
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
        "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)Lstream/video/sfu/event/TrackUnpublished;",
        "Ljava/lang/String;",
        "getUser_id",
        "getSession_id",
        "Lstream/video/sfu/models/TrackType;",
        "getType",
        "()Lstream/video/sfu/models/TrackType;",
        "Lstream/video/sfu/models/TrackUnpublishReason;",
        "getCause",
        "()Lstream/video/sfu/models/TrackUnpublishReason;",
        "Lstream/video/sfu/models/Participant;",
        "getParticipant",
        "()Lstream/video/sfu/models/Participant;",
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

.field public static final Companion:Lstream/video/sfu/event/TrackUnpublished$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final cause:Lstream/video/sfu/models/TrackUnpublishReason;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackUnpublishReason#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation
.end field

.field private final participant:Lstream/video/sfu/models/Participant;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.Participant#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x5
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

.field private final type:Lstream/video/sfu/models/TrackType;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackType#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x3
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

    new-instance v0, Lstream/video/sfu/event/TrackUnpublished$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/TrackUnpublished$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/TrackUnpublished;->Companion:Lstream/video/sfu/event/TrackUnpublished$Companion;

    const-class v0, Lstream/video/sfu/event/TrackUnpublished;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/TrackUnpublished$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lstream/video/sfu/event/TrackUnpublished;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)V
    .locals 1

    const-string v0, "user_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cause"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lstream/video/sfu/event/TrackUnpublished;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p6}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 8
    iput-object p1, p0, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    .line 11
    iput-object p4, p0, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    .line 12
    iput-object p5, p0, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    .line 2
    const-string v0, ""

    if-eqz p8, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 3
    sget-object p3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 4
    sget-object p4, Lstream/video/sfu/models/TrackUnpublishReason;->TRACK_UNPUBLISH_REASON_UNSPECIFIED:Lstream/video/sfu/models/TrackUnpublishReason;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/4 p5, 0x0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 5
    sget-object p6, Lne3/l;->E:Lne3/l;

    :cond_5
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 6
    invoke-direct/range {p1 .. p7}, Lstream/video/sfu/event/TrackUnpublished;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/TrackUnpublished;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/TrackUnpublished;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p6

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lstream/video/sfu/event/TrackUnpublished;->copy(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)Lstream/video/sfu/event/TrackUnpublished;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)Lstream/video/sfu/event/TrackUnpublished;
    .locals 8

    const-string v0, "user_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cause"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/event/TrackUnpublished;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lstream/video/sfu/event/TrackUnpublished;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/TrackUnpublished;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/TrackUnpublished;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    iget-object v3, p1, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    iget-object v3, p1, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    iget-object p1, p1, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCause()Lstream/video/sfu/models/TrackUnpublishReason;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    return-object v0
.end method

.method public final getParticipant()Lstream/video/sfu/models/Participant;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    return-object v0
.end method

.method public final getSession_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lstream/video/sfu/models/TrackType;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    return-object v0
.end method

.method public final getUser_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    const/16 v1, 0x25

    mul-int/2addr v0, v1

    iget-object v2, p0, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lstream/video/sfu/models/Participant;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/wire/l;->hashCode:I

    :cond_1
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/event/TrackUnpublished;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->user_id:Ljava/lang/String;

    const-string v2, "user_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->session_id:Ljava/lang/String;

    const-string v2, "session_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->type:Lstream/video/sfu/models/TrackType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->cause:Lstream/video/sfu/models/TrackUnpublishReason;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "cause="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/event/TrackUnpublished;->participant:Lstream/video/sfu/models/Participant;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "participant="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "TrackUnpublished{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
