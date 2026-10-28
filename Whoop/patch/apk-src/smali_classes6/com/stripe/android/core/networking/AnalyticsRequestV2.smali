.class public final Lcom/stripe/android/core/networking/AnalyticsRequestV2;
.super Lyy/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0012\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 ^2\u00020\u0001:\u0003_`aB1\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0099\u0001\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0015\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\n\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000c\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010$J\u0010\u0010(\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008/\u0010$J)\u00102\u001a\u00020\u00022\u000e\u00100\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u000f2\u0008\u0008\u0002\u00101\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u00082\u00103J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0\u000fH\u0002\u00a2\u0006\u0004\u00084\u00105J!\u00106\u001a\u000c\u0012\u0004\u0012\u00020\u0002\u0012\u0002\u0008\u00030\u000f2\u0006\u0010 \u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0002H\u00c2\u0003\u00a2\u0006\u0004\u00088\u0010$J\u0010\u00109\u001a\u00020\u0002H\u00c2\u0003\u00a2\u0006\u0004\u00089\u0010$J\u0010\u0010:\u001a\u00020\u0006H\u00c2\u0003\u00a2\u0006\u0004\u0008:\u0010;JB\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c2\u0001\u00a2\u0006\u0004\u0008<\u0010=J\'\u0010E\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001\u00a2\u0006\u0004\u0008C\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028G\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010F\u001a\u0004\u0008G\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010FR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010HR\u0017\u0010\t\u001a\u00020\u00088G\u00a2\u0006\u000c\n\u0004\u0008\t\u0010I\u001a\u0004\u0008J\u0010&R \u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010F\u0012\u0004\u0008L\u0010M\u001a\u0004\u0008K\u0010$R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010N\u001a\u0004\u0008O\u00105R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010P\u001a\u0004\u0008Q\u0010RR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010S\u001a\u0004\u0008T\u0010UR \u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010V\u001a\u0004\u0008W\u0010XR\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010F\u001a\u0004\u0008Y\u0010$R\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008[\u0010\\\u00a8\u0006b"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "Lyy/m0;",
        "",
        "eventName",
        "clientId",
        "origin",
        "",
        "created",
        "Lkotlinx/serialization/json/JsonElement;",
        "params",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V",
        "",
        "seen0",
        "postParameters",
        "",
        "headers",
        "Lyy/k0;",
        "method",
        "Lyy/l0;",
        "mimeType",
        "",
        "retryResponseCodes",
        "url",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lyy/k0;Lyy/l0;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Ljava/io/OutputStream;",
        "outputStream",
        "Ll83/a0;",
        "writePostBody",
        "(Ljava/io/OutputStream;)V",
        "runAttemptCount",
        "withWorkManagerParams",
        "(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "component1",
        "()Ljava/lang/String;",
        "component5",
        "()Lkotlinx/serialization/json/JsonElement;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "createPostParams",
        "map",
        "level",
        "encodeMapParam",
        "(Ljava/util/Map;I)Ljava/lang/String;",
        "analyticParams",
        "()Ljava/util/Map;",
        "createWorkManagerParams",
        "(I)Ljava/util/Map;",
        "component2",
        "component3",
        "component4",
        "()D",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "write$Self$stripe_core_release",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getEventName",
        "D",
        "Lkotlinx/serialization/json/JsonElement;",
        "getParams",
        "getPostParameters$stripe_core_release",
        "getPostParameters$stripe_core_release$annotations",
        "()V",
        "Ljava/util/Map;",
        "getHeaders",
        "Lyy/k0;",
        "getMethod",
        "()Lyy/k0;",
        "Lyy/l0;",
        "getMimeType",
        "()Lyy/l0;",
        "Ljava/lang/Iterable;",
        "getRetryResponseCodes",
        "()Ljava/lang/Iterable;",
        "getUrl",
        "",
        "getPostBodyBytes",
        "()[B",
        "postBodyBytes",
        "Companion",
        "yy/d",
        "com/stripe/android/core/networking/a",
        "$serializer",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
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

.field public static final ANALYTICS_HOST:Ljava/lang/String; = "https://r.stripe.com/0"

.field public static final Companion:Lcom/stripe/android/core/networking/a;

.field public static final HEADER_ORIGIN:Ljava/lang/String; = "origin"

.field private static final INDENTATION:Ljava/lang/String; = "  "

.field public static final PARAM_CLIENT_ID:Ljava/lang/String; = "client_id"

.field public static final PARAM_CREATED:Ljava/lang/String; = "created"

.field private static final PARAM_DELAYED:Ljava/lang/String; = "delayed"

.field public static final PARAM_EVENT_ID:Ljava/lang/String; = "event_id"

.field public static final PARAM_EVENT_NAME:Ljava/lang/String; = "event_name"

.field private static final PARAM_IS_RETRY:Ljava/lang/String; = "is_retry"

.field private static final PARAM_USES_WORK_MANAGER:Ljava/lang/String; = "uses_work_manager"


# instance fields
.field private final clientId:Ljava/lang/String;

.field private final created:D

.field private final eventName:Ljava/lang/String;

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final method:Lyy/k0;

.field private final mimeType:Lyy/l0;

.field private final origin:Ljava/lang/String;

.field private final params:Lkotlinx/serialization/json/JsonElement;

.field private final postParameters:Ljava/lang/String;

.field private final retryResponseCodes:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/stripe/android/core/networking/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->Companion:Lcom/stripe/android/core/networking/a;

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    const-string v1, "com.stripe.android.core.networking.StripeRequest.Method"

    invoke-static {}, Lyy/k0;->values()[Lyy/k0;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v1

    const-string v2, "com.stripe.android.core.networking.StripeRequest.MimeType"

    invoke-static {}, Lyy/l0;->values()[Lyy/l0;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v2

    new-instance v3, Lwc3/e;

    const-class v4, Ljava/lang/Iterable;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/annotation/Annotation;

    invoke-direct {v3, v4, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    const/16 v4, 0xb

    new-array v4, v4, [Lwc3/c;

    const/4 v6, 0x0

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v6, v4, v5

    const/4 v5, 0x2

    aput-object v6, v4, v5

    const/4 v5, 0x3

    aput-object v6, v4, v5

    const/4 v5, 0x4

    aput-object v6, v4, v5

    const/4 v5, 0x5

    aput-object v6, v4, v5

    const/4 v5, 0x6

    aput-object v0, v4, v5

    const/4 v0, 0x7

    aput-object v1, v4, v0

    const/16 v0, 0x8

    aput-object v2, v4, v0

    const/16 v0, 0x9

    aput-object v3, v4, v0

    const/16 v0, 0xa

    aput-object v6, v4, v0

    sput-object v4, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lyy/k0;Lyy/l0;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p14, :cond_0

    .line 26
    sget-object p14, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->INSTANCE:Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;

    invoke-virtual {p14}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    .line 27
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    iput-wide p5, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    iput-object p7, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_1

    .line 29
    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams()Ljava/lang/String;

    move-result-object p2

    .line 30
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    .line 31
    sget-object p2, Lyy/l0;->x:Lyy/l0;

    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    const-string p3, "application/x-www-form-urlencoded; charset="

    .line 32
    invoke-static {p3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 33
    new-instance p3, Ll83/k;

    const-string p5, "Content-Type"

    invoke-direct {p3, p5, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    new-instance p2, Ll83/k;

    const-string p5, "origin"

    invoke-direct {p2, p5, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    new-instance p4, Ll83/k;

    const-string p5, "User-Agent"

    const-string p6, "Stripe/v1 android/22.6.1"

    invoke-direct {p4, p5, p6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    filled-new-array {p3, p2, p4}, [Ll83/k;

    move-result-object p2

    .line 37
    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 38
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p9, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    :goto_1
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    .line 39
    sget-object p2, Lyy/k0;->y:Lyy/k0;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lyy/k0;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lyy/k0;

    :goto_2
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    .line 41
    sget-object p2, Lyy/l0;->x:Lyy/l0;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lyy/l0;

    goto :goto_3

    :cond_4
    iput-object p11, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lyy/l0;

    :goto_3
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    .line 43
    new-instance p2, Li93/j;

    const/4 p3, 0x1

    const/16 p4, 0x1ad

    .line 44
    invoke-direct {p2, p4, p4, p3}, Li93/h;-><init>(III)V

    .line 45
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    goto :goto_4

    :cond_5
    iput-object p12, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    :goto_4
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_6

    .line 46
    const-string p1, "https://r.stripe.com/0"

    .line 47
    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p13, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    .line 7
    iput-object p6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    .line 8
    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    .line 9
    sget-object p1, Lyy/l0;->x:Lyy/l0;

    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p2

    const-string p4, "application/x-www-form-urlencoded; charset="

    .line 10
    invoke-static {p4, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    new-instance p4, Ll83/k;

    const-string p5, "Content-Type"

    invoke-direct {p4, p5, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    new-instance p2, Ll83/k;

    const-string p5, "origin"

    invoke-direct {p2, p5, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    new-instance p3, Ll83/k;

    const-string p5, "User-Agent"

    const-string p6, "Stripe/v1 android/22.6.1"

    invoke-direct {p3, p5, p6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    filled-new-array {p4, p2, p3}, [Ll83/k;

    move-result-object p2

    .line 15
    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    .line 16
    sget-object p2, Lyy/k0;->y:Lyy/k0;

    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lyy/k0;

    .line 17
    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lyy/l0;

    .line 18
    new-instance p1, Li93/j;

    const/16 p2, 0x1ad

    const/4 p3, 0x1

    .line 19
    invoke-direct {p1, p2, p2, p3}, Li93/h;-><init>(III)V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    .line 21
    const-string p1, "https://r.stripe.com/0"

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam$lambda$2(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method private final analyticParams()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    new-instance v1, Ll83/k;

    const-string v2, "client_id"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-wide v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "created"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    new-instance v3, Ll83/k;

    const-string v4, "event_name"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "event_id"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lyy/d;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams$lambda$1(Lyy/d;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    return-object v0
.end method

.method private final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    return-object v0
.end method

.method private final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    return-wide v0
.end method

.method private final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 7

    new-instance v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-wide p4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    :cond_4
    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-direct/range {p2 .. p8}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p0

    return-object p0
.end method

.method private final createPostParams()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v0}, Lyy/q;->l(Lkotlinx/serialization/json/JsonElement;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->analyticParams()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lyy/q;->b(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/util/Map;

    if-eqz v4, :cond_0

    new-instance v4, Lyy/d;

    check-cast v2, Ljava/util/Map;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p0, v2, v7, v5, v6}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v3, v2}, Lyy/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v4, Lyy/d;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v3, v2}, Lyy/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v5, Lyv0/h;

    const/4 v0, 0x6

    invoke-direct {v5, v0}, Lyv0/h;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, "&"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final createPostParams$lambda$1(Lyy/d;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lyy/d;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final createWorkManagerParams(I)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    iget-wide v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    cmpl-double v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v4, Ll83/k;

    const-string v5, "uses_work_manager"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "is_retry"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v2, "delayed"

    invoke-direct {v0, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v1, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final encodeMapParam(Ljava/util/Map;I)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Lm3/g;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lm3/g;-><init>(I)V

    invoke-static {p1, v1}, Lm83/g0;->o0(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/TreeMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "  "

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_1

    check-cast v2, Ljava/util/Map;

    add-int/lit8 v5, p2, 0x1

    invoke-direct {p0, v2, v5}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam(Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    const-string v2, ""

    goto :goto_1

    :cond_2
    const-string v5, "\""

    invoke-static {v2, v5, v5}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "\": "

    const-string v6, "  \""

    if-eqz v1, :cond_3

    invoke-static {p2, v3}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    goto :goto_0

    :cond_3
    const-string v7, ",\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, v3}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p2, v3}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic encodeMapParam$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam(Ljava/util/Map;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final encodeMapParam$lambda$2(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private final getPostBodyBytes()[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic getPostParameters$stripe_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self$stripe_core_release(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-wide v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getHeaders()Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lyy/l0;->x:Lyy/l0;

    sget-object v4, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v4}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v4

    const-string v5, "application/x-www-form-urlencoded; charset="

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    const-string v6, "Content-Type"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    new-instance v6, Ll83/k;

    const-string v7, "origin"

    invoke-direct {v6, v7, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v7, "User-Agent"

    const-string v8, "Stripe/v1 android/22.6.1"

    invoke-direct {v4, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v6, v4}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_1
    aget-object v3, v0, v1

    check-cast v3, Lwc3/j;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getHeaders()Ljava/util/Map;

    move-result-object v4

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMethod()Lyy/k0;

    move-result-object v3

    sget-object v4, Lyy/k0;->y:Lyy/k0;

    if-eq v3, v4, :cond_5

    :goto_2
    aget-object v3, v0, v1

    check-cast v3, Lwc3/j;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMethod()Lyy/k0;

    move-result-object v4

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMimeType()Lyy/l0;

    move-result-object v3

    sget-object v4, Lyy/l0;->x:Lyy/l0;

    if-eq v3, v4, :cond_7

    :goto_3
    aget-object v3, v0, v1

    check-cast v3, Lwc3/j;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMimeType()Lyy/l0;

    move-result-object v4

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v3

    new-instance v4, Li93/j;

    const/16 v5, 0x1ad

    invoke-direct {v4, v5, v5, v2}, Li93/h;-><init>(III)V

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "https://r.stripe.com/0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :goto_5
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    iget-wide v5, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    iget-object p1, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getMethod()Lyy/k0;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lyy/k0;

    return-object v0
.end method

.method public getMimeType()Lyy/l0;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lyy/l0;

    return-object v0
.end method

.method public final getParams()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getPostParameters$stripe_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    return-object v0
.end method

.method public getRetryResponseCodes()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    iget-wide v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    iget-object v5, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    const-string v6, ", clientId="

    const-string v7, ", origin="

    const-string v8, "AnalyticsRequestV2(eventName="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", params="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withWorkManagerParams(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v0}, Lyy/q;->l(Lkotlinx/serialization/json/JsonElement;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createWorkManagerParams(I)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-static {p1}, Lyy/q;->k(Ljava/util/Map;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v6

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->copy$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    return-object p1
.end method

.method public writePostBody(Ljava/io/OutputStream;)V
    .locals 1

    const-string v0, "outputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getPostBodyBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method
