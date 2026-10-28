.class public final Lstream/video/sfu/event/ICETrickle;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/ICETrickle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB%\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0016\u00a8\u0006\u001f"
    }
    d2 = {
        "Lstream/video/sfu/event/ICETrickle;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/models/PeerType;",
        "peer_type",
        "",
        "ice_candidate",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)V",
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
        "(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ICETrickle;",
        "Lstream/video/sfu/models/PeerType;",
        "getPeer_type",
        "()Lstream/video/sfu/models/PeerType;",
        "Ljava/lang/String;",
        "getIce_candidate",
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

.field public static final Companion:Lstream/video/sfu/event/ICETrickle$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final ice_candidate:Ljava/lang/String;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
        jsonName = "iceCandidate"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field

.field private final peer_type:Lstream/video/sfu/models/PeerType;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.PeerType#ADAPTER"
        jsonName = "peerType"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/event/ICETrickle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/ICETrickle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/ICETrickle;->Companion:Lstream/video/sfu/event/ICETrickle$Companion;

    const-class v0, Lstream/video/sfu/event/ICETrickle;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/ICETrickle$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/ICETrickle$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lstream/video/sfu/event/ICETrickle;-><init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)V
    .locals 1

    const-string v0, "peer_type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ice_candidate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Lstream/video/sfu/event/ICETrickle;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v0, p3}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 7
    iput-object p1, p0, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    .line 8
    iput-object p2, p0, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 2
    sget-object p1, Lstream/video/sfu/models/PeerType;->PEER_TYPE_PUBLISHER_UNSPECIFIED:Lstream/video/sfu/models/PeerType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 3
    const-string p2, ""

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 4
    sget-object p3, Lne3/l;->E:Lne3/l;

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lstream/video/sfu/event/ICETrickle;-><init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/ICETrickle;Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/ICETrickle;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lstream/video/sfu/event/ICETrickle;->copy(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ICETrickle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ICETrickle;
    .locals 1

    const-string v0, "peer_type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ice_candidate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lstream/video/sfu/event/ICETrickle;

    invoke-direct {v0, p1, p2, p3}, Lstream/video/sfu/event/ICETrickle;-><init>(Lstream/video/sfu/models/PeerType;Ljava/lang/String;Lne3/l;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/ICETrickle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/ICETrickle;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    iget-object v3, p1, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    iget-object p1, p1, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIce_candidate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeer_type()Lstream/video/sfu/models/PeerType;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x25

    iget-object v0, p0, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/wire/l;->hashCode:I

    :cond_0
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/event/ICETrickle;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/event/ICETrickle;->peer_type:Lstream/video/sfu/models/PeerType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "peer_type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lstream/video/sfu/event/ICETrickle;->ice_candidate:Ljava/lang/String;

    const-string v2, "ice_candidate="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "ICETrickle{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
