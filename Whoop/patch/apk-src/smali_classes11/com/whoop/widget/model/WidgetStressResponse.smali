.class public final Lcom/whoop/widget/model/WidgetStressResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/widget/model/WidgetStressResponse$$serializer;,
        Lcom/whoop/widget/model/WidgetStressResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ:\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u0008/\u0010\u001c\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/widget/model/WidgetStressResponse;",
        "",
        "Lcom/whoop/widget/model/WidgetStressState;",
        "state",
        "",
        "valueDisplay",
        "",
        "percentage",
        "bucketDisplay",
        "<init>",
        "(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$widget_release",
        "(Lcom/whoop/widget/model/WidgetStressResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/widget/model/WidgetStressState;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()D",
        "component4",
        "copy",
        "(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)Lcom/whoop/widget/model/WidgetStressResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/widget/model/WidgetStressState;",
        "getState",
        "Ljava/lang/String;",
        "getValueDisplay",
        "D",
        "getPercentage",
        "getBucketDisplay",
        "Companion",
        "$serializer",
        "a",
        "widget_release"
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

.field public static final Companion:Lcom/whoop/widget/model/WidgetStressResponse$a;


# instance fields
.field private final bucketDisplay:Ljava/lang/String;

.field private final percentage:D

.field private final state:Lcom/whoop/widget/model/WidgetStressState;

.field private final valueDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/widget/model/WidgetStressResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/widget/model/WidgetStressResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/widget/model/WidgetStressResponse;->Companion:Lcom/whoop/widget/model/WidgetStressResponse$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lfw0/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lfw0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/widget/model/WidgetStressResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xe

    const/16 v0, 0xe

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/widget/model/WidgetStressResponse$$serializer;->INSTANCE:Lcom/whoop/widget/model/WidgetStressResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/widget/model/WidgetStressResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lcom/whoop/widget/model/WidgetStressState;->NO_DATA:Lcom/whoop/widget/model/WidgetStressState;

    .line 3
    iput-object p1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    :goto_0
    iput-object p3, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    iput-wide p4, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    iput-object p6, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    .line 6
    iput-object p2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    .line 7
    iput-wide p3, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    .line 8
    iput-object p5, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p6, 0x1

    if-eqz p6, :cond_0

    .line 9
    sget-object p1, Lcom/whoop/widget/model/WidgetStressState;->NO_DATA:Lcom/whoop/widget/model/WidgetStressState;

    :cond_0
    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 10
    invoke-direct/range {p2 .. p7}, Lcom/whoop/widget/model/WidgetStressResponse;-><init>(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/widget/model/WidgetStressState;->Companion:Lcom/whoop/widget/model/WidgetStressState$a;

    invoke-virtual {v0}, Lcom/whoop/widget/model/WidgetStressState$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/widget/model/WidgetStressResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/widget/model/WidgetStressResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/widget/model/WidgetStressResponse;Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/widget/model/WidgetStressResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-wide p3, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    :cond_3
    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/widget/model/WidgetStressResponse;->copy(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)Lcom/whoop/widget/model/WidgetStressResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$widget_release(Lcom/whoop/widget/model/WidgetStressResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/widget/model/WidgetStressResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    sget-object v3, Lcom/whoop/widget/model/WidgetStressState;->NO_DATA:Lcom/whoop/widget/model/WidgetStressState;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/widget/model/WidgetStressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)Lcom/whoop/widget/model/WidgetStressResponse;
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/widget/model/WidgetStressResponse;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/widget/model/WidgetStressResponse;-><init>(Lcom/whoop/widget/model/WidgetStressState;Ljava/lang/String;DLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/widget/model/WidgetStressResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/widget/model/WidgetStressResponse;

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    iget-object v3, p1, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    iget-wide v5, p1, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBucketDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    return-wide v0
.end method

.method public final getState()Lcom/whoop/widget/model/WidgetStressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    return-object v0
.end method

.method public final getValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetStressResponse;->state:Lcom/whoop/widget/model/WidgetStressState;

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetStressResponse;->valueDisplay:Ljava/lang/String;

    iget-wide v2, p0, Lcom/whoop/widget/model/WidgetStressResponse;->percentage:D

    iget-object v4, p0, Lcom/whoop/widget/model/WidgetStressResponse;->bucketDisplay:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "WidgetStressResponse(state="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", valueDisplay="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", percentage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", bucketDisplay="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
