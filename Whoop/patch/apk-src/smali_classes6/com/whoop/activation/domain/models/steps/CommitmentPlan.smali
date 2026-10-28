.class public final Lcom/whoop/activation/domain/models/steps/CommitmentPlan;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/CommitmentPlan$$serializer;,
        Lcom/whoop/activation/domain/models/steps/CommitmentPlan$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001f\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/CommitmentPlan;",
        "",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "commitmentType",
        "",
        "payload",
        "promoCode",
        "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "orderDetails",
        "<init>",
        "(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/CommitmentPlan;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "copy",
        "(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)Lcom/whoop/activation/domain/models/steps/CommitmentPlan;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "getCommitmentType",
        "Ljava/lang/String;",
        "getPayload",
        "getPromoCode",
        "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "getOrderDetails",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/CommitmentPlan$Companion;


# instance fields
.field private final commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

.field private final orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

.field private final payload:Ljava/lang/String;

.field private final promoCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/CommitmentPlan$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->Companion:Lcom/whoop/activation/domain/models/steps/CommitmentPlan$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqv1/e;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lqv1/e;-><init>(I)V

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

    sput-object v2, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/activation/domain/models/steps/CommitmentPlan$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/CommitmentPlan$$serializer;

    invoke-virtual {p6}, Lcom/whoop/activation/domain/models/steps/CommitmentPlan$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)V
    .locals 1

    const-string v0, "commitmentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promoCode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderDetails"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    .line 4
    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.activation.domain.models.steps.CommitmentType"

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CommitmentType;->values()[Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/CommitmentPlan;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/CommitmentPlan;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->copy(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)Lcom/whoop/activation/domain/models/steps/CommitmentPlan;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/CommitmentPlan;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;

    iget-object p0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/activation/domain/models/steps/CommitmentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/activation/domain/models/steps/OrderDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    return-object v0
.end method

.method public final copy(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)Lcom/whoop/activation/domain/models/steps/CommitmentPlan;
    .locals 1

    const-string v0, "commitmentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promoCode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderDetails"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;-><init>(Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/OrderDetails;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    iget-object p1, p1, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    return-object v0
.end method

.method public final getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    return-object v0
.end method

.method public final getPayload()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    return-object v0
.end method

.method public final getPromoCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->payload:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->promoCode:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/CommitmentPlan;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CommitmentPlan(commitmentType="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", payload="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", promoCode="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", orderDetails="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
