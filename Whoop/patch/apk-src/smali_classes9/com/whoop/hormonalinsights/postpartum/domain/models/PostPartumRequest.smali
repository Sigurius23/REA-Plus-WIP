.class public final Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$$serializer;,
        Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rBQ\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJP\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\t2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001fR\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010-\u001a\u0004\u00085\u0010\u001d\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;",
        "",
        "",
        "deliveryDate",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;",
        "deliveryMethod",
        "",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
        "babies",
        "",
        "turnOnStealth",
        "pregnancyName",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Z",
        "component5",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDeliveryDate",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;",
        "getDeliveryMethod",
        "Ljava/util/List;",
        "getBabies",
        "Z",
        "getTurnOnStealth",
        "getPregnancyName",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$Companion;


# instance fields
.field private final babies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
            ">;"
        }
    .end annotation
.end field

.field private final deliveryDate:Ljava/lang/String;

.field private final deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

.field private final pregnancyName:Ljava/lang/String;

.field private final turnOnStealth:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgp1/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lgp1/a;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Lgp1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v2, v4, v6

    const/4 v2, 0x2

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    aput-object v1, v4, v5

    sput-object v4, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$$serializer;

    invoke-virtual {p7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    iput-boolean p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    iput-object p6, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.postpartum.domain.models.DeliveryType"

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->copy(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    invoke-interface {p1, p2, v0, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;-><init>(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;Ljava/util/List;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    iget-boolean v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBabies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/BabyData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    return-object v0
.end method

.method public final getDeliveryDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeliveryMethod()Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    return-object v0
.end method

.method public final getPregnancyName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTurnOnStealth()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryDate:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->deliveryMethod:Lcom/whoop/hormonalinsights/postpartum/domain/models/DeliveryType;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->babies:Ljava/util/List;

    iget-boolean v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->turnOnStealth:Z

    iget-object v4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;->pregnancyName:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PostPartumRequest(deliveryDate="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deliveryMethod="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", babies="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", turnOnStealth="

    const-string v1, ", pregnancyName="

    invoke-static {v0, v1, v5, v2, v3}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
