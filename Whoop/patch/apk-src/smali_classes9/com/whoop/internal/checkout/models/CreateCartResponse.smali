.class public final Lcom/whoop/internal/checkout/models/CreateCartResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/internal/checkout/models/CreateCartResponse$$serializer;,
        Lcom/whoop/internal/checkout/models/CreateCartResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u0018\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/internal/checkout/models/CreateCartResponse;",
        "",
        "Lcom/whoop/internal/checkout/models/PaymentPayload;",
        "paymentPayload",
        "<init>",
        "(Lcom/whoop/internal/checkout/models/PaymentPayload;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/internal/checkout/models/PaymentPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$internal_tooling_release",
        "(Lcom/whoop/internal/checkout/models/CreateCartResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "getActualCartId",
        "()Ljava/lang/String;",
        "component1",
        "()Lcom/whoop/internal/checkout/models/PaymentPayload;",
        "copy",
        "(Lcom/whoop/internal/checkout/models/PaymentPayload;)Lcom/whoop/internal/checkout/models/CreateCartResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/internal/checkout/models/PaymentPayload;",
        "getPaymentPayload",
        "Companion",
        "$serializer",
        "internal-tooling_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/internal/checkout/models/CreateCartResponse$Companion;


# instance fields
.field private final paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/internal/checkout/models/CreateCartResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/internal/checkout/models/CreateCartResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->Companion:Lcom/whoop/internal/checkout/models/CreateCartResponse$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/whoop/internal/checkout/models/CreateCartResponse;-><init>(Lcom/whoop/internal/checkout/models/PaymentPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/internal/checkout/models/PaymentPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/internal/checkout/models/PaymentPayload;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/internal/checkout/models/PaymentPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/internal/checkout/models/CreateCartResponse;-><init>(Lcom/whoop/internal/checkout/models/PaymentPayload;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/internal/checkout/models/CreateCartResponse;Lcom/whoop/internal/checkout/models/PaymentPayload;ILjava/lang/Object;)Lcom/whoop/internal/checkout/models/CreateCartResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/internal/checkout/models/CreateCartResponse;->copy(Lcom/whoop/internal/checkout/models/PaymentPayload;)Lcom/whoop/internal/checkout/models/CreateCartResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$internal_tooling_release(Lcom/whoop/internal/checkout/models/CreateCartResponse;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/internal/checkout/models/PaymentPayload$$serializer;->INSTANCE:Lcom/whoop/internal/checkout/models/PaymentPayload$$serializer;

    iget-object p0, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/internal/checkout/models/PaymentPayload;
    .locals 1

    iget-object v0, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    return-object v0
.end method

.method public final copy(Lcom/whoop/internal/checkout/models/PaymentPayload;)Lcom/whoop/internal/checkout/models/CreateCartResponse;
    .locals 1

    new-instance v0, Lcom/whoop/internal/checkout/models/CreateCartResponse;

    invoke-direct {v0, p1}, Lcom/whoop/internal/checkout/models/CreateCartResponse;-><init>(Lcom/whoop/internal/checkout/models/PaymentPayload;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/internal/checkout/models/CreateCartResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/internal/checkout/models/CreateCartResponse;

    iget-object v1, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    iget-object p1, p1, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getActualCartId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/internal/checkout/models/PaymentPayload;->getCartId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPaymentPayload()Lcom/whoop/internal/checkout/models/PaymentPayload;
    .locals 1

    iget-object v0, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/internal/checkout/models/PaymentPayload;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/internal/checkout/models/CreateCartResponse;->paymentPayload:Lcom/whoop/internal/checkout/models/PaymentPayload;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CreateCartResponse(paymentPayload="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
