.class public final Lio/getstream/video/android/core/socket/ErrorResponse;
.super Ljava/lang/Throwable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/video/android/core/socket/ErrorResponse$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FGBU\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rBs\u0008\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0016J^\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00072\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0014J\u001a\u0010$\u001a\u00020#2\u0008\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%J(\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\'2\u0006\u0010*\u001a\u00020)H\u00c1\u0001\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u0016\"\u0004\u00083\u00104R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0006\u0010/\u0012\u0004\u00088\u00109\u001a\u0004\u00085\u0010\u0014\"\u0004\u00086\u00107R(\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008;\u0010\u0019\"\u0004\u0008<\u0010=R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010>\u001a\u0004\u0008?\u0010\u001bR(\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000b\u00101\u0012\u0004\u0008B\u00109\u001a\u0004\u0008@\u0010\u0016\"\u0004\u0008A\u00104R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u00101\u001a\u0004\u0008C\u0010\u0016\"\u0004\u0008D\u00104\u00a8\u0006H"
    }
    d2 = {
        "Lio/getstream/video/android/core/socket/ErrorResponse;",
        "",
        "",
        "code",
        "",
        "message",
        "statusCode",
        "",
        "details",
        "",
        "exceptionFields",
        "moreInfo",
        "<init>",
        "(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V",
        "seen1",
        "duration",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Ljava/util/Map;",
        "component6",
        "copy",
        "(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/video/android/core/socket/ErrorResponse;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stream_video_android_core_release",
        "(Lio/getstream/video/android/core/socket/ErrorResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getCode",
        "Ljava/lang/String;",
        "getMessage",
        "setMessage",
        "(Ljava/lang/String;)V",
        "getStatusCode",
        "setStatusCode",
        "(I)V",
        "getStatusCode$annotations",
        "()V",
        "Ljava/util/List;",
        "getDetails",
        "setDetails",
        "(Ljava/util/List;)V",
        "Ljava/util/Map;",
        "getExceptionFields",
        "getMoreInfo",
        "setMoreInfo",
        "getMoreInfo$annotations",
        "getDuration",
        "setDuration",
        "Companion",
        "$serializer",
        "io/getstream/video/android/core/socket/a",
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
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final Companion:Lio/getstream/video/android/core/socket/a;


# instance fields
.field private final code:I

.field private details:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private duration:Ljava/lang/String;

.field private final exceptionFields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private message:Ljava/lang/String;

.field private moreInfo:Ljava/lang/String;

.field private statusCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/getstream/video/android/core/socket/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/video/android/core/socket/ErrorResponse;->Companion:Lio/getstream/video/android/core/socket/a;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    new-instance v2, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    invoke-direct {v2, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    const/4 v1, 0x7

    new-array v1, v1, [Lwc3/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v1, v3

    const/4 v3, 0x1

    aput-object v4, v1, v3

    const/4 v3, 0x2

    aput-object v4, v1, v3

    const/4 v3, 0x3

    aput-object v0, v1, v3

    const/4 v0, 0x4

    aput-object v2, v1, v0

    const/4 v0, 0x5

    aput-object v4, v1, v0

    const/4 v0, 0x6

    aput-object v4, v1, v0

    sput-object v1, Lio/getstream/video/android/core/socket/ErrorResponse;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/getstream/video/android/core/socket/ErrorResponse;-><init>(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .param p4    # I
        .annotation runtime Lwc3/h;
            value = "StatusCode"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwc3/h;
            value = "more_info"
        .end annotation
    .end param
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const/4 v0, -0x1

    if-nez p9, :cond_0

    iput v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const-string p9, ""

    if-nez p2, :cond_1

    iput-object p9, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    goto :goto_2

    :cond_2
    iput p4, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 5
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 6
    iput-object p2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p9, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p9, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p8, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "details"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exceptionFields"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moreInfo"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 12
    iput p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    .line 13
    iput-object p2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    .line 14
    iput p3, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    .line 15
    iput-object p4, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    .line 16
    iput-object p5, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    .line 17
    iput-object p6, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    .line 18
    const-string p1, ""

    iput-object p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const/4 v0, -0x1

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 7
    const-string v1, ""

    if-eqz p8, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 8
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 9
    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move-object p7, v1

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p7, p6

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p7}, Lio/getstream/video/android/core/socket/ErrorResponse;-><init>(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lio/getstream/video/android/core/socket/ErrorResponse;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/getstream/video/android/core/socket/ErrorResponse;ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/video/android/core/socket/ErrorResponse;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/video/android/core/socket/ErrorResponse;->copy(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/video/android/core/socket/ErrorResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMoreInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "more_info"
    .end annotation

    return-void
.end method

.method public static synthetic getStatusCode$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "StatusCode"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stream_video_android_core_release(Lio/getstream/video/android/core/socket/ErrorResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lio/getstream/video/android/core/socket/ErrorResponse;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    if-eq v2, v3, :cond_1

    :goto_0
    iget v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v4, ""

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lio/getstream/video/android/core/socket/ErrorResponse;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    invoke-virtual {p0}, Lio/getstream/video/android/core/socket/ErrorResponse;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    if-eq v2, v3, :cond_5

    :goto_2
    iget v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :goto_5
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    :goto_6
    iget-object p0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/video/android/core/socket/ErrorResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/video/android/core/socket/ErrorResponse;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "details"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exceptionFields"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moreInfo"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/video/android/core/socket/ErrorResponse;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/video/android/core/socket/ErrorResponse;-><init>(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/video/android/core/socket/ErrorResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/video/android/core/socket/ErrorResponse;

    iget v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    iget v3, p1, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    iget v3, p1, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCode()I
    .locals 1

    iget v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    return v0
.end method

.method public final getDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final getExceptionFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getMoreInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusCode()I
    .locals 1

    iget v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setDetails(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    return-void
.end method

.method public final setDuration(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->duration:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    return-void
.end method

.method public final setMoreInfo(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    return-void
.end method

.method public final setStatusCode(I)V
    .locals 0

    iput p1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->code:I

    iget-object v1, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->message:Ljava/lang/String;

    iget v2, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->statusCode:I

    iget-object v3, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->details:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->exceptionFields:Ljava/util/Map;

    iget-object v5, p0, Lio/getstream/video/android/core/socket/ErrorResponse;->moreInfo:Ljava/lang/String;

    const-string v6, ", message="

    const-string v7, ", statusCode="

    const-string v8, "ErrorResponse(code="

    invoke-static {v0, v8, v6, v1, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", details="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exceptionFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moreInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
