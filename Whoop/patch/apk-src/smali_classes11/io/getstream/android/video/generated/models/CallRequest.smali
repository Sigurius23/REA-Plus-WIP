.class public final Lio/getstream/android/video/generated/models/CallRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bo\u0012\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0008\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0018\u0008\u0003\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJx\u0010\u001f\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0018\u0008\u0003\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000c2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0013J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010&\u001a\u00020\u00072\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010(\u001a\u0004\u0008,\u0010\u0013R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008.\u0010\u0018R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u00080\u0010\u001aR\'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00101\u001a\u0004\u00082\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00103\u001a\u0004\u00084\u0010\u001e\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallRequest;",
        "",
        "",
        "channelCid",
        "Ljg3/i;",
        "startsAt",
        "team",
        "",
        "video",
        "",
        "Lio/getstream/android/video/generated/models/MemberRequest;",
        "members",
        "",
        "custom",
        "Lio/getstream/android/video/generated/models/CallSettingsRequest;",
        "settingsOverride",
        "<init>",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "()Lio/getstream/android/video/generated/models/CallSettingsRequest;",
        "copy",
        "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)Lio/getstream/android/video/generated/models/CallRequest;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getChannelCid",
        "Ljg3/i;",
        "getStartsAt",
        "getTeam",
        "Ljava/lang/Boolean;",
        "getVideo",
        "Ljava/util/List;",
        "getMembers",
        "Ljava/util/Map;",
        "getCustom",
        "Lio/getstream/android/video/generated/models/CallSettingsRequest;",
        "getSettingsOverride",
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
.field private final channelCid:Ljava/lang/String;

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

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

.field private final startsAt:Ljg3/i;

.field private final team:Ljava/lang/String;

.field private final video:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/getstream/android/video/generated/models/CallRequest;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "starts_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "team"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/CallSettingsRequest;
        .annotation runtime Lqx/q;
            name = "settings_override"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberRequest;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallSettingsRequest;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 10
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    .line 11
    sget-object p6, Lm83/z;->w:Lm83/z;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

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

    :cond_6
    move-object p8, p7

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/android/video/generated/models/CallRequest;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallRequest;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallRequest;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/CallRequest;->copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)Lio/getstream/android/video/generated/models/CallRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Lio/getstream/android/video/generated/models/CallSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)Lio/getstream/android/video/generated/models/CallRequest;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_cid"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "starts_at"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "team"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "video"
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p7    # Lio/getstream/android/video/generated/models/CallSettingsRequest;
        .annotation runtime Lqx/q;
            name = "settings_override"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberRequest;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallSettingsRequest;",
            ")",
            "Lio/getstream/android/video/generated/models/CallRequest;"
        }
    .end annotation

    new-instance v0, Lio/getstream/android/video/generated/models/CallRequest;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lio/getstream/android/video/generated/models/CallRequest;-><init>(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Lio/getstream/android/video/generated/models/CallSettingsRequest;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getChannelCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getSettingsOverride()Lio/getstream/android/video/generated/models/CallSettingsRequest;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    return-object v0
.end method

.method public final getStartsAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideo()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSettingsRequest;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallRequest;->channelCid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallRequest;->startsAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallRequest;->team:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallRequest;->video:Ljava/lang/Boolean;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/CallRequest;->members:Ljava/util/List;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/CallRequest;->custom:Ljava/util/Map;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/CallRequest;->settingsOverride:Lio/getstream/android/video/generated/models/CallSettingsRequest;

    const-string v7, ", startsAt="

    const-string v8, ", team="

    const-string v9, "CallRequest(channelCid="

    invoke-static {v9, v1, v0, v7, v8}, Lr;->p(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", video="

    const-string v7, ", members="

    invoke-static {v3, v2, v1, v7, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", custom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", settingsOverride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
