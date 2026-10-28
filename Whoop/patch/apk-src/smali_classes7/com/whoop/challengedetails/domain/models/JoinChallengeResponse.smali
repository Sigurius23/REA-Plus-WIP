.class public final Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$$serializer;,
        Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0081\u0008\u0018\u0000 82\u00020\u0001:\u000298B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJF\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010+\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008,\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010/\u0012\u0004\u00081\u0010.\u001a\u0004\u00080\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010/\u0012\u0004\u00083\u0010.\u001a\u0004\u00082\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010/\u0012\u0004\u00085\u0010.\u001a\u0004\u00084\u0010\u001cR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010/\u0012\u0004\u00087\u0010.\u001a\u0004\u00086\u0010\u001c\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;",
        "",
        "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;",
        "status",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "subText",
        "ctaText",
        "ctaClose",
        "<init>",
        "(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$challenge_details_release",
        "(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;",
        "getStatus",
        "getStatus$annotations",
        "()V",
        "Lcom/whoop/design/util/TextResource;",
        "getText",
        "getText$annotations",
        "getSubText",
        "getSubText$annotations",
        "getCtaText",
        "getCtaText$annotations",
        "getCtaClose",
        "getCtaClose$annotations",
        "Companion",
        "$serializer",
        "challenge-details_release"
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

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$Companion;


# instance fields
.field private final ctaClose:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_close"
    .end annotation
.end field

.field private final ctaText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_text"
    .end annotation
.end field

.field private final status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "status"
    .end annotation
.end field

.field private final subText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sub_text"
    .end annotation
.end field

.field private final text:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->Companion:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lkg2/d;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lkg2/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$$serializer;->INSTANCE:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    iput-object p3, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    .line 4
    iput-object p2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;->Companion:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus$Companion;

    invoke-virtual {v0}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->copy(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCtaClose$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_close"
    .end annotation

    return-void
.end method

.method public static synthetic getCtaText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_text"
    .end annotation

    return-void
.end method

.method public static synthetic getStatus$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "status"
    .end annotation

    return-void
.end method

.method public static synthetic getSubText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sub_text"
    .end annotation

    return-void
.end method

.method public static synthetic getText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "text"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$challenge_details_release(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;
    .locals 7

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;-><init>(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCtaClose()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCtaText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getStatus()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    return-object v0
.end method

.method public final getSubText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

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

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->status:Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->text:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->subText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->ctaClose:Lcom/whoop/design/util/TextResource;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "JoinChallengeResponse(status="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subText="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ctaText="

    const-string v1, ", ctaClose="

    invoke-static {v5, v2, v0, v3, v1}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lq63/c;->k(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
