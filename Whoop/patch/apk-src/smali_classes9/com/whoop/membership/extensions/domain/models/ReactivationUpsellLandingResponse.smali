.class public final Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$$serializer;,
        Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBQ\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JJ\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001fR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00100\u001a\u0004\u00081\u0010!\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;",
        "",
        "",
        "navigationBarText",
        "trackingLabel",
        "trackingValue",
        "",
        "initiallySelectedSegmentIndex",
        "",
        "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;",
        "segments",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()I",
        "component5",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationBarText",
        "getTrackingLabel",
        "getTrackingValue",
        "I",
        "getInitiallySelectedSegmentIndex",
        "Ljava/util/List;",
        "getSegments",
        "Companion",
        "$serializer",
        "membership_release"
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

.field public static final Companion:Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$Companion;


# instance fields
.field private final initiallySelectedSegmentIndex:I

.field private final navigationBarText:Ljava/lang/String;

.field private final segments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;",
            ">;"
        }
    .end annotation
.end field

.field private final trackingLabel:Ljava/lang/String;

.field private final trackingValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->Companion:Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgw1/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lgw1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v1, 0x4

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    iput-object p6, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "navigationBarText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segments"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    .line 7
    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;",
            ">;)",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;"
        }
    .end annotation

    const-string v0, "navigationBarText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segments"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    iget v3, p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getInitiallySelectedSegmentIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    return v0
.end method

.method public final getNavigationBarText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    return-object v0
.end method

.method public final getTrackingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->navigationBarText:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->trackingValue:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->initiallySelectedSegmentIndex:I

    iget-object v4, p0, Lcom/whoop/membership/extensions/domain/models/ReactivationUpsellLandingResponse;->segments:Ljava/util/List;

    const-string v5, ", trackingLabel="

    const-string v6, ", trackingValue="

    const-string v7, "ReactivationUpsellLandingResponse(navigationBarText="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", initiallySelectedSegmentIndex="

    const-string v5, ", segments="

    invoke-static {v3, v2, v1, v5, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
