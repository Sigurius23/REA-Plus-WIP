.class public final Lstream/video/sfu/event/Migration;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/Migration$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B;\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0019R \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u001e\u001a\u0004\u0008!\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lstream/video/sfu/event/Migration;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "from_sfu_id",
        "",
        "Lstream/video/sfu/models/TrackInfo;",
        "announced_tracks",
        "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
        "subscriptions",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)V",
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
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/event/Migration;",
        "Ljava/lang/String;",
        "getFrom_sfu_id",
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

.field public static final Companion:Lstream/video/sfu/event/Migration$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final announced_tracks:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.TrackInfo#ADAPTER"
        jsonName = "announcedTracks"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x2
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
        tag = 0x1
    .end annotation
.end field

.field private final subscriptions:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.signal.TrackSubscriptionDetails#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x3
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

    new-instance v0, Lstream/video/sfu/event/Migration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/Migration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/Migration;->Companion:Lstream/video/sfu/event/Migration$Companion;

    const-class v0, Lstream/video/sfu/event/Migration;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/Migration$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/Migration$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/Migration;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lstream/video/sfu/event/Migration;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackInfo;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
            ">;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "from_sfu_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "announced_tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subscriptions"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unknownFields"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v2, Lstream/video/sfu/event/Migration;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v2, p4}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 7
    iput-object p1, p0, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

    .line 8
    invoke-static {v0, p2}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    .line 9
    invoke-static {v1, p3}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 2
    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 3
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 4
    sget-object p4, Lne3/l;->E:Lne3/l;

    .line 5
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lstream/video/sfu/event/Migration;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/Migration;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/Migration;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lstream/video/sfu/event/Migration;->copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/event/Migration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/event/Migration;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/TrackInfo;",
            ">;",
            "Ljava/util/List<",
            "Lstream/video/sfu/signal/TrackSubscriptionDetails;",
            ">;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/event/Migration;"
        }
    .end annotation

    const-string v0, "from_sfu_id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "announced_tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subscriptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lstream/video/sfu/event/Migration;

    invoke-direct {v0, p1, p2, p3, p4}, Lstream/video/sfu/event/Migration;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/Migration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/Migration;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

    iget-object v3, p1, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

    iget-object p1, p1, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
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

    iget-object v0, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    return-object v0
.end method

.method public final getFrom_sfu_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

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

    iget-object v0, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

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

    iget-object v2, p0, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

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
    invoke-virtual {p0}, Lstream/video/sfu/event/Migration;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/event/Migration;->from_sfu_id:Ljava/lang/String;

    const-string v2, "from_sfu_id="

    invoke-static {v0, v1, v2}, Ljh3/c;->t(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/event/Migration;->announced_tracks:Ljava/util/List;

    const-string v2, "announced_tracks="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lstream/video/sfu/event/Migration;->subscriptions:Ljava/util/List;

    const-string v2, "subscriptions="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_1
    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "Migration{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
