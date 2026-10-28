.class public final Lio/getstream/android/video/generated/models/CallRingEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u000e\u0008\u0003\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0015Jf\u0010$\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\u000e\u0008\u0003\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0003\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0015J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020\u00082\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u0008/\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u00082\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010\u001cR\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u00086\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00107\u001a\u0004\u00088\u0010 R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00109\u001a\u0004\u0008:\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010.\u001a\u0004\u0008;\u0010\u0015\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallRingEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "sessionId",
        "",
        "video",
        "",
        "Lio/getstream/android/video/generated/models/MemberResponse;",
        "members",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "call",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "user",
        "type",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "()Z",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Lio/getstream/android/video/generated/models/CallResponse;",
        "component7",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRingEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCreatedAt",
        "getSessionId",
        "Z",
        "getVideo",
        "Ljava/util/List;",
        "getMembers",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "getCall",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getUser",
        "getType",
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

.field private final sessionId:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponse;

.field private final video:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V
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
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    .line 6
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    .line 7
    iput-boolean p4, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    .line 10
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    .line 11
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_0

    .line 1
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 2
    invoke-direct/range {v0 .. v8}, Lio/getstream/android/video/generated/models/CallRingEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallRingEvent;Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallRingEvent;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-boolean p4, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/android/video/generated/models/CallRingEvent;->copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRingEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRingEvent;
    .locals 10
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
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p6    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/android/video/generated/models/CallRingEvent;"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallRingEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lio/getstream/android/video/generated/models/CallRingEvent;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLjava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallRingEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallRingEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCall()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final getVideo()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v2, v0, v1}, Lc13/a;->b(Lio/getstream/android/video/generated/models/CallResponse;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->createdAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->sessionId:Ljava/lang/String;

    iget-boolean v3, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->video:Z

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->members:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/CallRingEvent;->type:Ljava/lang/String;

    const-string v8, ", createdAt="

    const-string v9, ", sessionId="

    const-string v10, "CallRingEvent(callCid="

    invoke-static {v10, v1, v0, v8, v9}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", video="

    const-string v8, ", members="

    invoke-static {v0, v2, v1, v3, v8}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", call="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
