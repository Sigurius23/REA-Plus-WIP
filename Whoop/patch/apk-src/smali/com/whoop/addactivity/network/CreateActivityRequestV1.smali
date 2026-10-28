.class public final Lcom/whoop/addactivity/network/CreateActivityRequestV1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/addactivity/network/CreateActivityRequestV1$$serializer;,
        Lcom/whoop/addactivity/network/CreateActivityRequestV1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eBY\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JT\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u001a\u0010+\u001a\u00020\u00082\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u00081\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u00082\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010#R\"\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u00086\u0010%\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/addactivity/network/CreateActivityRequestV1;",
        "",
        "",
        "activityInternalName",
        "",
        "garmentId",
        "startTime",
        "endTime",
        "",
        "gpsEnabled",
        "",
        "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
        "pauseSegments",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "()Z",
        "component6",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/whoop/addactivity/network/CreateActivityRequestV1;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getActivityInternalName",
        "I",
        "getGarmentId",
        "getStartTime",
        "getEndTime",
        "Z",
        "getGpsEnabled",
        "Ljava/util/List;",
        "getPauseSegments",
        "Companion",
        "$serializer",
        "a",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/addactivity/network/CreateActivityRequestV1$a;


# instance fields
.field private final activityInternalName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "activity_internal_name"
    .end annotation
.end field

.field private final endTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_time"
    .end annotation
.end field

.field private final garmentId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "garment_id"
    .end annotation
.end field

.field private final gpsEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gps_enabled"
    .end annotation
.end field

.field private final pauseSegments:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pause_segments"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;"
        }
    .end annotation
.end field

.field private final startTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_time"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/addactivity/network/CreateActivityRequestV1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/addactivity/network/CreateActivityRequestV1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->Companion:Lcom/whoop/addactivity/network/CreateActivityRequestV1$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lj02/y0;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lj02/y0;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v1, 0x5

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/addactivity/network/CreateActivityRequestV1$$serializer;->INSTANCE:Lcom/whoop/addactivity/network/CreateActivityRequestV1$$serializer;

    invoke-virtual {p8}, Lcom/whoop/addactivity/network/CreateActivityRequestV1$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    iput-object p4, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    return-void

    :cond_1
    iput-object p7, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityInternalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    .line 5
    iput-object p3, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/addactivity/network/CreateActivityRequestV1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/addactivity/network/CreateActivityPauseSegment$$serializer;->INSTANCE:Lcom/whoop/addactivity/network/CreateActivityPauseSegment$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/whoop/addactivity/network/CreateActivityRequestV1;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/whoop/addactivity/network/CreateActivityRequestV1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;)",
            "Lcom/whoop/addactivity/network/CreateActivityRequestV1;"
        }
    .end annotation

    const-string v0, "activityInternalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/addactivity/network/CreateActivityRequestV1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    iget-object v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    iget v3, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getActivityInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getGarmentId()I
    .locals 1

    iget v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    return v0
.end method

.method public final getGpsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    return v0
.end method

.method public final getPauseSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    return-object v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->activityInternalName:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->garmentId:I

    iget-object v2, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->startTime:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->endTime:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->gpsEnabled:Z

    iget-object v5, p0, Lcom/whoop/addactivity/network/CreateActivityRequestV1;->pauseSegments:Ljava/util/List;

    const-string v6, ", garmentId="

    const-string v7, ", startTime="

    const-string v8, "CreateActivityRequestV1(activityInternalName="

    invoke-static {v1, v8, v0, v6, v7}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    const-string v6, ", gpsEnabled="

    invoke-static {v0, v2, v1, v3, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pauseSegments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
