.class public final Lio/getstream/android/video/generated/models/DeviceResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bk\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017Jt\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00042\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010#\u001a\u00020\u00082\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010%\u001a\u0004\u0008&\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008)\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008*\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010+\u001a\u0004\u0008,\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\'\u001a\u0004\u0008-\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\'\u001a\u0004\u0008.\u0010\u0013R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\'\u001a\u0004\u0008/\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010+\u001a\u0004\u00080\u0010\u0017\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/DeviceResponse;",
        "",
        "Ljg3/i;",
        "createdAt",
        "",
        "id",
        "pushProvider",
        "userId",
        "",
        "disabled",
        "disabledReason",
        "hardwareId",
        "pushProviderName",
        "voip",
        "<init>",
        "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "component1",
        "()Ljg3/i;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Boolean;",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/DeviceResponse;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljg3/i;",
        "getCreatedAt",
        "Ljava/lang/String;",
        "getId",
        "getPushProvider",
        "getUserId",
        "Ljava/lang/Boolean;",
        "getDisabled",
        "getDisabledReason",
        "getHardwareId",
        "getPushProviderName",
        "getVoip",
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
.field private final createdAt:Ljg3/i;

.field private final disabled:Ljava/lang/Boolean;

.field private final disabledReason:Ljava/lang/String;

.field private final hardwareId:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final pushProvider:Ljava/lang/String;

.field private final pushProviderName:Ljava/lang/String;

.field private final userId:Ljava/lang/String;

.field private final voip:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "push_provider"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "disabled"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "disabled_reason"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "hardware_id"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "push_provider_name"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "voip"
        .end annotation
    .end param

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_3

    move-object p8, v0

    :cond_3
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_4

    move-object p10, v0

    :goto_0
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

    :cond_4
    move-object p10, p9

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p10}, Lio/getstream/android/video/generated/models/DeviceResponse;-><init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/DeviceResponse;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/DeviceResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/android/video/generated/models/DeviceResponse;->copy(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/DeviceResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/DeviceResponse;
    .locals 11
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "push_provider"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "disabled"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "disabled_reason"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "hardware_id"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "push_provider_name"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "voip"
        .end annotation
    .end param

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/DeviceResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/android/video/generated/models/DeviceResponse;-><init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/DeviceResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/DeviceResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getDisabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDisabledReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getHardwareId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPushProvider()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    return-object v0
.end method

.method public final getPushProviderName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final getVoip()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->createdAt:Ljg3/i;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProvider:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->userId:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabled:Ljava/lang/Boolean;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->disabledReason:Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->hardwareId:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->pushProviderName:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/DeviceResponse;->voip:Ljava/lang/Boolean;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "DeviceResponse(createdAt="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pushProvider="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    const-string v1, ", disabled="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", disabledReason="

    const-string v1, ", hardwareId="

    invoke-static {v4, v0, v5, v1, v9}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", pushProviderName="

    const-string v1, ", voip="

    invoke-static {v9, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
