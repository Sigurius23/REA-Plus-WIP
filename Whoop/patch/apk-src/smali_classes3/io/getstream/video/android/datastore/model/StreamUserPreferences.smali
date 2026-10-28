.class public final Lio/getstream/video/android/datastore/model/StreamUserPreferences;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/video/android/datastore/model/StreamUserPreferences$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000234B;\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0008\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u000c\u0008\u0002\u0010\u0008\u001a\u00060\u0004j\u0002`\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBO\u0008\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\u0008\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u00c1\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00060\u0004j\u0002`\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00060\u0004j\u0002`\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JD\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000c\u0008\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u000c\u0008\u0002\u0010\u0008\u001a\u00060\u0004j\u0002`\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0010\u0010%\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001cR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001eR\u001b\u0010\u0008\u001a\u00060\u0004j\u0002`\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008/\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00100\u001a\u0004\u00081\u0010!\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/video/android/datastore/model/StreamUserPreferences;",
        "",
        "Lio/getstream/video/android/model/User;",
        "user",
        "",
        "Lio/getstream/video/android/model/ApiKey;",
        "apiKey",
        "Lio/getstream/video/android/model/UserToken;",
        "userToken",
        "Lio/getstream/video/android/model/Device;",
        "userDevice",
        "<init>",
        "(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stream_video_android_core_release",
        "(Lio/getstream/video/android/datastore/model/StreamUserPreferences;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lio/getstream/video/android/model/User;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lio/getstream/video/android/model/Device;",
        "copy",
        "(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)Lio/getstream/video/android/datastore/model/StreamUserPreferences;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lio/getstream/video/android/model/User;",
        "getUser",
        "Ljava/lang/String;",
        "getApiKey",
        "getUserToken",
        "Lio/getstream/video/android/model/Device;",
        "getUserDevice",
        "Companion",
        "$serializer",
        "io/getstream/video/android/datastore/model/a",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lio/getstream/video/android/datastore/model/a;


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final user:Lio/getstream/video/android/model/User;

.field private final userDevice:Lio/getstream/video/android/model/Device;

.field private final userToken:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/video/android/datastore/model/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->Companion:Lio/getstream/video/android/datastore/model/a;

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

    invoke-direct/range {v0 .. v6}, Lio/getstream/video/android/datastore/model/StreamUserPreferences;-><init>(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const-string p6, ""

    if-nez p2, :cond_1

    iput-object p6, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    return-void

    :cond_3
    iput-object p5, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    return-void
.end method

.method public constructor <init>(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)V
    .locals 1

    const-string v0, "apiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    .line 5
    iput-object p2, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    const-string v1, ""

    if-eqz p6, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/video/android/datastore/model/StreamUserPreferences;-><init>(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/video/android/datastore/model/StreamUserPreferences;Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;ILjava/lang/Object;)Lio/getstream/video/android/datastore/model/StreamUserPreferences;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->copy(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)Lio/getstream/video/android/datastore/model/StreamUserPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$stream_video_android_core_release(Lio/getstream/video/android/datastore/model/StreamUserPreferences;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lio/getstream/video/android/model/User$$serializer;->INSTANCE:Lio/getstream/video/android/model/User$$serializer;

    iget-object v2, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lio/getstream/video/android/model/Device$$serializer;->INSTANCE:Lio/getstream/video/android/model/Device$$serializer;

    iget-object p0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lio/getstream/video/android/model/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lio/getstream/video/android/model/Device;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    return-object v0
.end method

.method public final copy(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)Lio/getstream/video/android/datastore/model/StreamUserPreferences;
    .locals 1

    const-string v0, "apiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userToken"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/video/android/datastore/model/StreamUserPreferences;-><init>(Lio/getstream/video/android/model/User;Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/Device;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/video/android/datastore/model/StreamUserPreferences;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/video/android/datastore/model/StreamUserPreferences;

    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    iget-object v3, p1, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    iget-object p1, p1, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getApiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/video/android/model/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    return-object v0
.end method

.method public final getUserDevice()Lio/getstream/video/android/model/Device;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    return-object v0
.end method

.method public final getUserToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/video/android/model/Device;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->user:Lio/getstream/video/android/model/User;

    iget-object v1, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->apiKey:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userToken:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/video/android/datastore/model/StreamUserPreferences;->userDevice:Lio/getstream/video/android/model/Device;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StreamUserPreferences(user="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", apiKey="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userToken="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userDevice="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
