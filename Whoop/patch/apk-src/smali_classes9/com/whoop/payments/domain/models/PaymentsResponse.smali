.class public final Lcom/whoop/payments/domain/models/PaymentsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/payments/domain/models/PaymentsResponse$$serializer;,
        Lcom/whoop/payments/domain/models/PaymentsResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;<BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBg\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&Jb\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010!J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010!R\u001a\u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00085\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00086\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010/\u001a\u0004\u00087\u0010\u001dR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u00089\u0010&\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/payments/domain/models/PaymentsResponse;",
        "",
        "",
        "paymentMethodId",
        "brand",
        "country",
        "",
        "expMonth",
        "expYear",
        "funding",
        "last4",
        "Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;",
        "expirationStatus",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_release",
        "(Lcom/whoop/payments/domain/models/PaymentsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()I",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)Lcom/whoop/payments/domain/models/PaymentsResponse;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPaymentMethodId",
        "getBrand",
        "getCountry",
        "I",
        "getExpMonth",
        "getExpYear",
        "getFunding",
        "getLast4",
        "Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;",
        "getExpirationStatus",
        "Companion",
        "$serializer",
        "a",
        "payments_release"
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

.field public static final Companion:Lcom/whoop/payments/domain/models/PaymentsResponse$a;


# instance fields
.field private final brand:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "brand"
    .end annotation
.end field

.field private final country:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "country"
    .end annotation
.end field

.field private final expMonth:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exp_month"
    .end annotation
.end field

.field private final expYear:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exp_year"
    .end annotation
.end field

.field private final expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "expiration_status"
    .end annotation
.end field

.field private final funding:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "funding"
    .end annotation
.end field

.field private final last4:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last4"
    .end annotation
.end field

.field private final paymentMethodId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "payment_method_id"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/payments/domain/models/PaymentsResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/payments/domain/models/PaymentsResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/payments/domain/models/PaymentsResponse;->Companion:Lcom/whoop/payments/domain/models/PaymentsResponse$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lrx0/f;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x8

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

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v1, 0x7

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/payments/domain/models/PaymentsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/payments/domain/models/PaymentsResponse$$serializer;->INSTANCE:Lcom/whoop/payments/domain/models/PaymentsResponse$$serializer;

    invoke-virtual {p10}, Lcom/whoop/payments/domain/models/PaymentsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    iput p6, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    iput-object p7, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)V
    .locals 1

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "funding"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    .line 7
    iput p5, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    .line 8
    iput-object p6, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;->Companion:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus$a;

    invoke-virtual {v0}, Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/payments/domain/models/PaymentsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/payments/domain/models/PaymentsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/payments/domain/models/PaymentsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;ILjava/lang/Object;)Lcom/whoop/payments/domain/models/PaymentsResponse;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/payments/domain/models/PaymentsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)Lcom/whoop/payments/domain/models/PaymentsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$payments_release(Lcom/whoop/payments/domain/models/PaymentsResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/payments/domain/models/PaymentsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x4

    iget v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)Lcom/whoop/payments/domain/models/PaymentsResponse;
    .locals 10

    const-string v0, "paymentMethodId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "funding"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last4"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/payments/domain/models/PaymentsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/payments/domain/models/PaymentsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/payments/domain/models/PaymentsResponse;

    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    iget v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    iget v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    iget-object p1, p1, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBrand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpMonth()I
    .locals 1

    iget v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    return v0
.end method

.method public final getExpYear()I
    .locals 1

    iget v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    return v0
.end method

.method public final getExpirationStatus()Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    return-object v0
.end method

.method public final getFunding()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

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
    .locals 11

    iget-object v0, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->paymentMethodId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->brand:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->country:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expMonth:I

    iget v4, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expYear:I

    iget-object v5, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->funding:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->last4:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/payments/domain/models/PaymentsResponse;->expirationStatus:Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;

    const-string v8, ", brand="

    const-string v9, ", country="

    const-string v10, "PaymentsResponse(paymentMethodId="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expMonth="

    const-string v8, ", expYear="

    invoke-static {v3, v2, v1, v8, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", funding="

    const-string v2, ", last4="

    invoke-static {v4, v1, v5, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expirationStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
