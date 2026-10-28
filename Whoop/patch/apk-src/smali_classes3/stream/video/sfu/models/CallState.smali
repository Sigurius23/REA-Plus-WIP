.class public final Lstream/video/sfu/models/CallState;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/models/CallState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*BO\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJU\u0010\u001e\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0010\u0008\u0002\u0010\u0008\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\"\u0010\u0008\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010 \u001a\u0004\u0008!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010#\u001a\u0004\u0008$\u0010%R \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010&\u001a\u0004\u0008\'\u0010(R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010&\u001a\u0004\u0008)\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lstream/video/sfu/models/CallState;",
        "Lcom/squareup/wire/l;",
        "",
        "",
        "Lstream/video/sfu/models/Participant;",
        "participants",
        "Ljava/time/Instant;",
        "Lcom/squareup/wire/Instant;",
        "started_at",
        "Lstream/video/sfu/models/ParticipantCount;",
        "participant_count",
        "Lstream/video/sfu/models/Pin;",
        "pins",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)V",
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
        "",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)Lstream/video/sfu/models/CallState;",
        "Ljava/time/Instant;",
        "getStarted_at",
        "()Ljava/time/Instant;",
        "Lstream/video/sfu/models/ParticipantCount;",
        "getParticipant_count",
        "()Lstream/video/sfu/models/ParticipantCount;",
        "Ljava/util/List;",
        "getParticipants",
        "()Ljava/util/List;",
        "getPins",
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

.field public static final Companion:Lstream/video/sfu/models/CallState$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final participant_count:Lstream/video/sfu/models/ParticipantCount;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ParticipantCount#ADAPTER"
        jsonName = "participantCount"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x3
    .end annotation
.end field

.field private final participants:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.Participant#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x1
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Participant;",
            ">;"
        }
    .end annotation
.end field

.field private final pins:Ljava/util/List;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.Pin#ADAPTER"
        label = .enum Lcom/squareup/wire/z;->y:Lcom/squareup/wire/z;
        tag = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Pin;",
            ">;"
        }
    .end annotation
.end field

.field private final started_at:Ljava/time/Instant;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "com.squareup.wire.ProtoAdapter#INSTANT"
        jsonName = "startedAt"
        label = .enum Lcom/squareup/wire/z;->F:Lcom/squareup/wire/z;
        tag = 0x2
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/models/CallState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/models/CallState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/models/CallState;->Companion:Lstream/video/sfu/models/CallState$Companion;

    const-class v0, Lstream/video/sfu/models/CallState;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/models/CallState$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/models/CallState$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/models/CallState;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lstream/video/sfu/models/CallState;-><init>(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Participant;",
            ">;",
            "Ljava/time/Instant;",
            "Lstream/video/sfu/models/ParticipantCount;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Pin;",
            ">;",
            "Lne3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "participants"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "pins"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unknownFields"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v2, Lstream/video/sfu/models/CallState;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {p0, v2, p5}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 6
    iput-object p2, p0, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

    .line 7
    iput-object p3, p0, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    .line 8
    invoke-static {v0, p1}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    .line 9
    invoke-static {v1, p4}, Ls30/e;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p7, p6, 0x1

    .line 2
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v1, 0x0

    if-eqz p7, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 3
    sget-object p5, Lne3/l;->E:Lne3/l;

    :cond_4
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p6}, Lstream/video/sfu/models/CallState;-><init>(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/models/CallState;Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/CallState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p5

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lstream/video/sfu/models/CallState;->copy(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)Lstream/video/sfu/models/CallState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)Lstream/video/sfu/models/CallState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Participant;",
            ">;",
            "Ljava/time/Instant;",
            "Lstream/video/sfu/models/ParticipantCount;",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Pin;",
            ">;",
            "Lne3/l;",
            ")",
            "Lstream/video/sfu/models/CallState;"
        }
    .end annotation

    const-string v0, "participants"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pins"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unknownFields"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/CallState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lstream/video/sfu/models/CallState;-><init>(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/models/CallState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/models/CallState;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    iget-object v3, p1, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

    iget-object v3, p1, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    iget-object v3, p1, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    iget-object p1, p1, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getParticipant_count()Lstream/video/sfu/models/ParticipantCount;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    return-object v0
.end method

.method public final getParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Participant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final getPins()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lstream/video/sfu/models/Pin;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    return-object v0
.end method

.method public final getStarted_at()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

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

    iget-object v2, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

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

    iget-object v2, p0, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lstream/video/sfu/models/ParticipantCount;->hashCode()I

    move-result v3

    :cond_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/l;->hashCode:I

    return v1

    :cond_2
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/models/CallState;->newBuilder()Ljava/lang/Void;

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

    iget-object v1, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lstream/video/sfu/models/CallState;->participants:Ljava/util/List;

    const-string v2, "participants="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->started_at:Ljava/time/Instant;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "started_at="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->participant_count:Lstream/video/sfu/models/ParticipantCount;

    if-eqz v1, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "participant_count="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lstream/video/sfu/models/CallState;->pins:Ljava/util/List;

    const-string v2, "pins="

    invoke-static {v2, v1, v0}, Lnh3/a;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    :cond_3
    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "CallState{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
