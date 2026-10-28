.class public final Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"

# interfaces
.implements Lio/getstream/android/video/generated/models/WSCallEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0008\u0003\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0016J \u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u008a\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\t\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u00032\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0018\u0008\u0003\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001cJ\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u0008/\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00084\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\u000c\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010.\u001a\u0004\u00087\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010.\u001a\u0004\u00088\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010.\u001a\u0004\u00089\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010.\u001a\u0004\u0008:\u0010\u0016R\'\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010;\u001a\u0004\u0008<\u0010%\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Lio/getstream/android/video/generated/models/WSCallEvent;",
        "",
        "callCid",
        "Ljg3/i;",
        "createdAt",
        "",
        "rating",
        "sessionId",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "user",
        "type",
        "reason",
        "sdk",
        "sdkVersion",
        "",
        "",
        "custom",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "getCallCID",
        "component1",
        "component2",
        "()Ljg3/i;",
        "component3",
        "()I",
        "component4",
        "component5",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Ljava/util/Map;",
        "copy",
        "(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallCid",
        "Ljg3/i;",
        "getCreatedAt",
        "I",
        "getRating",
        "getSessionId",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getUser",
        "getType",
        "getReason",
        "getSdk",
        "getSdkVersion",
        "Ljava/util/Map;",
        "getCustom",
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
.field private final callCid:Ljava/lang/String;

.field private final createdAt:Ljg3/i;

.field private final custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final rating:I

.field private final reason:Ljava/lang/String;

.field private final sdk:Ljava/lang/String;

.field private final sdkVersion:Ljava/lang/String;

.field private final sessionId:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponse;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
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
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "rating"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "reason"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk_version"
        .end annotation
    .end param
    .param p10    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    .line 6
    iput p3, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    .line 9
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    .line 10
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    .line 11
    iput-object p8, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    .line 12
    iput-object p9, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    .line 13
    iput-object p10, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x40

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_1

    move-object p8, v0

    :cond_1
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_2

    move-object p9, v0

    :cond_2
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_3

    .line 1
    sget-object p10, Lm83/z;->w:Lm83/z;

    :cond_3
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 2
    invoke-direct/range {p1 .. p11}, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;-><init>(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->copy(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;
    .locals 12
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
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "rating"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "session_id"
        .end annotation
    .end param
    .param p5    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "reason"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk_version"
        .end annotation
    .end param
    .param p10    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;"
        }
    .end annotation

    const-string v0, "callCid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;-><init>(Ljava/lang/String;Ljg3/i;ILjava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    iget v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public getCallCID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getCustom()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getRating()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    return v0
.end method

.method public final getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

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

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->callCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->createdAt:Ljg3/i;

    iget v2, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->rating:I

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sessionId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->user:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->type:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->reason:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdk:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->sdkVersion:Ljava/lang/String;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/CallUserFeedbackSubmittedEvent;->custom:Ljava/util/Map;

    const-string v10, ", createdAt="

    const-string v11, ", rating="

    const-string v12, "CallUserFeedbackSubmittedEvent(callCid="

    invoke-static {v12, v1, v0, v10, v11}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sessionId="

    const-string v10, ", user="

    invoke-static {v2, v1, v3, v10, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdk="

    const-string v2, ", sdkVersion="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", custom="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Lq63/c;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
