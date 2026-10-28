.class public final Lio/getstream/android/video/generated/models/JoinCallRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\u008a\u0001\u0010-\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u00052\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0008H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008 \u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008!\u0010\u0013R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\"\u0010\u0013\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/JoinCallRequest;",
        "",
        "location",
        "",
        "create",
        "",
        "hintHighScaleLivestreamPublisher",
        "membersLimit",
        "",
        "migratingFrom",
        "notify",
        "ring",
        "video",
        "migratingFromList",
        "",
        "data",
        "Lio/getstream/android/video/generated/models/CallRequest;",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)V",
        "getCreate",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getData",
        "()Lio/getstream/android/video/generated/models/CallRequest;",
        "getHintHighScaleLivestreamPublisher",
        "getLocation",
        "()Ljava/lang/String;",
        "getMembersLimit",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMigratingFrom",
        "getMigratingFromList",
        "()Ljava/util/List;",
        "getNotify",
        "getRing",
        "getVideo",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)Lio/getstream/android/video/generated/models/JoinCallRequest;",
        "equals",
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
.field private final create:Ljava/lang/Boolean;

.field private final data:Lio/getstream/android/video/generated/models/CallRequest;

.field private final hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

.field private final location:Ljava/lang/String;

.field private final membersLimit:Ljava/lang/Integer;

.field private final migratingFrom:Ljava/lang/String;

.field private final migratingFromList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final notify:Ljava/lang/Boolean;

.field private final ring:Ljava/lang/Boolean;

.field private final video:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "location"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "create"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "hint_high_scale_livestream_publisher"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "members_limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "migrating_from"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "notify"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "ring"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "migrating_from_list"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/CallRequest;
        .annotation runtime Lqx/q;
            name = "data"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallRequest;",
            ")V"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    .line 11
    iput-object p10, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x2

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_7

    .line 12
    sget-object p9, Lm83/y;->w:Lm83/y;

    :cond_7
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_8

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lio/getstream/android/video/generated/models/JoinCallRequest;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/JoinCallRequest;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/JoinCallRequest;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/android/video/generated/models/JoinCallRequest;->copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)Lio/getstream/android/video/generated/models/JoinCallRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/getstream/android/video/generated/models/CallRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)Lio/getstream/android/video/generated/models/JoinCallRequest;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "location"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "create"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "hint_high_scale_livestream_publisher"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "members_limit"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "migrating_from"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "notify"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "ring"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param
    .param p9    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "migrating_from_list"
        .end annotation
    .end param
    .param p10    # Lio/getstream/android/video/generated/models/CallRequest;
        .annotation runtime Lqx/q;
            name = "data"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallRequest;",
            ")",
            "Lio/getstream/android/video/generated/models/JoinCallRequest;"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/JoinCallRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/android/video/generated/models/JoinCallRequest;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lio/getstream/android/video/generated/models/CallRequest;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/JoinCallRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCreate()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getData()Lio/getstream/android/video/generated/models/CallRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    return-object v0
.end method

.method public final getHintHighScaleLivestreamPublisher()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getLocation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    return-object v0
.end method

.method public final getMembersLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMigratingFrom()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    return-object v0
.end method

.method public final getMigratingFromList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    return-object v0
.end method

.method public final getNotify()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getRing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getVideo()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/CallRequest;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->location:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->create:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->hintHighScaleLivestreamPublisher:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->membersLimit:Ljava/lang/Integer;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFrom:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->notify:Ljava/lang/Boolean;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->ring:Ljava/lang/Boolean;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->video:Ljava/lang/Boolean;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->migratingFromList:Ljava/util/List;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/JoinCallRequest;->data:Lio/getstream/android/video/generated/models/CallRequest;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "JoinCallRequest(location="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", create="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hintHighScaleLivestreamPublisher="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", membersLimit="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", migratingFrom="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", notify="

    const-string v1, ", ring="

    invoke-static {v5, v4, v0, v1, v10}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", video="

    const-string v1, ", migratingFromList="

    invoke-static {v10, v6, v0, v7, v1}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
