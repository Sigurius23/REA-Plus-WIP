.class public final Lio/getstream/android/video/generated/models/CallEndedEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0013J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\t\u001a\u00020\u00032\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0013J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008,\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010+\u001a\u0004\u00081\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010+\u001a\u0004\u00082\u0010\u0013R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00103\u001a\u0004\u00084\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00105\u001a\u0004\u00086\u0010\u001f\u00a8\u00067"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallEndedEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "call",
        "type",
        "reason",
        "",
        "Lio/getstream/android/video/generated/models/MemberResponse;",
        "members",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "user",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "()Lio/getstream/android/video/generated/models/CallResponse;",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallEndedEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCreatedAt",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "getCall",
        "getType",
        "getReason",
        "Ljava/util/List;",
        "getMembers",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getUser",
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

.field private final callCid:Ljava/lang/String;

.field private final createdAt:Ljg3/i;

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final reason:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponse;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "reason"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ")V"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    .line 10
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_1

    .line 1
    sget-object p6, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_2

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p8, p7

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/android/video/generated/models/CallEndedEvent;-><init>(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallEndedEvent;Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallEndedEvent;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/CallEndedEvent;->copy(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallEndedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallEndedEvent;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "reason"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            ")",
            "Lio/getstream/android/video/generated/models/CallEndedEvent;"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallEndedEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/CallEndedEvent;-><init>(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallEndedEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCall()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v2, v0, v1}, Lc13/a;->b(Lio/getstream/android/video/generated/models/CallResponse;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

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

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->createdAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->type:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->reason:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->members:Ljava/util/List;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallEndedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    const-string v7, ", createdAt="

    const-string v8, ", call="

    const-string v9, "CallEndedEvent(callCid="

    invoke-static {v9, v1, v0, v7, v8}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", members="

    const-string v2, ", user="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
