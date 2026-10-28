.class public final Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B_\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000e\u0008\u0003\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\u0008\u0003\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0007\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000e\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J\u000f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\u000f\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003Jc\u0010$\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0003\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00072\u000e\u0008\u0003\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u0008\u0008\u0003\u0010\r\u001a\u00020\u000e2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;",
        "",
        "duration",
        "",
        "totalParticipants",
        "",
        "members",
        "",
        "Lio/getstream/android/video/generated/models/MemberResponse;",
        "ownCapabilities",
        "Lio/getstream/android/video/generated/models/OwnCapability;",
        "participants",
        "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
        "call",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "membership",
        "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V",
        "getCall",
        "()Lio/getstream/android/video/generated/models/CallResponse;",
        "getDuration",
        "()Ljava/lang/String;",
        "getMembers",
        "()Ljava/util/List;",
        "getMembership",
        "()Lio/getstream/android/video/generated/models/MemberResponse;",
        "getOwnCapabilities",
        "getParticipants",
        "getTotalParticipants",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final call:Lio/getstream/android/video/generated/models/CallResponse;

.field private final duration:Ljava/lang/String;

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final membership:Lio/getstream/android/video/generated/models/MemberResponse;

.field private final ownCapabilities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;"
        }
    .end annotation
.end field

.field private final participants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final totalParticipants:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "total_participants"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "own_capabilities"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/MemberResponse;
        .annotation runtime Lqx/q;
            name = "membership"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ")V"
        }
    .end annotation

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    .line 3
    iput p2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x4

    .line 9
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p9, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_3

    const/4 p7, 0x0

    :cond_3
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->copy(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/MemberResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "total_participants"
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "own_capabilities"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/MemberResponse;
        .annotation runtime Lqx/q;
            name = "membership"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ")",
            "Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;"
        }
    .end annotation

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    iget v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCall()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getMembership()Lio/getstream/android/video/generated/models/MemberResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    return-object v0
.end method

.method public final getOwnCapabilities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    return-object v0
.end method

.method public final getParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/CallParticipantResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalParticipants()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v2, v0, v1}, Lc13/a;->b(Lio/getstream/android/video/generated/models/CallResponse;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/MemberResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->duration:Ljava/lang/String;

    iget v1, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->totalParticipants:I

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->members:Ljava/util/List;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->ownCapabilities:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->participants:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    const-string v7, ", totalParticipants="

    const-string v8, ", members="

    const-string v9, "QueryCallParticipantsResponse(duration="

    invoke-static {v1, v9, v0, v7, v8}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ownCapabilities="

    const-string v7, ", participants="

    invoke-static {v0, v2, v1, v3, v7}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", call="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
