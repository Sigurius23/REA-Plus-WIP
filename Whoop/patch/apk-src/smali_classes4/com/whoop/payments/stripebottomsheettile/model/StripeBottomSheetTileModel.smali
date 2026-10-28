.class public final Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$$serializer;,
        Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<=B7\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBQ\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JJ\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020\u000b2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00084\u0010 R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008:\u0010&\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/HeaderModel;",
        "header",
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;",
        "paymentMethodTile",
        "",
        "",
        "acceptedPaymentMethods",
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
        "paymentSheetMetadata",
        "",
        "defaultPaymentMethodOnFile",
        "<init>",
        "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_release",
        "(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/HeaderModel;",
        "component2",
        "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
        "component5",
        "()Z",
        "copy",
        "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/HeaderModel;",
        "getHeader",
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;",
        "getPaymentMethodTile",
        "Ljava/util/List;",
        "getAcceptedPaymentMethods",
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
        "getPaymentSheetMetadata",
        "Z",
        "getDefaultPaymentMethodOnFile",
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

.field public static final Companion:Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$a;


# instance fields
.field private final acceptedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultPaymentMethodOnFile:Z

.field private final header:Lcom/whoop/design/models/items/HeaderModel;

.field private final paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

.field private final paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->Companion:Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcu2/l;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lcu2/l;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    iput-object p3, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    iput-object p4, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    iput-boolean p6, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/HeaderModel;",
            "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
            "Z)V"
        }
    .end annotation

    const-string v0, "paymentMethodTile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedPaymentMethods"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetMetadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;ZILjava/lang/Object;)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->copy(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$payments_release(Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/HeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$$serializer;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-boolean p0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/HeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    return v0
.end method

.method public final copy(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/HeaderModel;",
            "Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
            "Z)",
            "Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;"
        }
    .end annotation

    const-string v0, "paymentMethodTile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedPaymentMethods"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetMetadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;-><init>(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;Ljava/util/List;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    iget-boolean p1, p1, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAcceptedPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getDefaultPaymentMethodOnFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    return v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/HeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    return-object v0
.end method

.method public final getPaymentMethodTile()Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    return-object v0
.end method

.method public final getPaymentSheetMetadata()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/HeaderModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentMethodTile:Lcom/whoop/payments/stripebottomsheettile/model/PaymentMethodMenuTileModel;

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->acceptedPaymentMethods:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->paymentSheetMetadata:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    iget-boolean v4, p0, Lcom/whoop/payments/stripebottomsheettile/model/StripeBottomSheetTileModel;->defaultPaymentMethodOnFile:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "StripeBottomSheetTileModel(header="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodTile="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptedPaymentMethods="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentSheetMetadata="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", defaultPaymentMethodOnFile="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
