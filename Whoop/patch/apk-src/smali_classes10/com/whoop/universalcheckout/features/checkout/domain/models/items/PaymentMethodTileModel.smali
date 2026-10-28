.class public final Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$$serializer;,
        Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J@\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010\"\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/HeaderModel;",
        "header",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
        "paymentMethodTile",
        "Lcom/whoop/design/models/items/MenuItemModel;",
        "truemedPaymentMenuItem",
        "",
        "",
        "acceptedPaymentMethods",
        "<init>",
        "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/HeaderModel;",
        "component2",
        "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
        "component3",
        "()Lcom/whoop/design/models/items/MenuItemModel;",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/HeaderModel;",
        "getHeader",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
        "getPaymentMethodTile",
        "Lcom/whoop/design/models/items/MenuItemModel;",
        "getTruemedPaymentMenuItem",
        "Ljava/util/List;",
        "getAcceptedPaymentMethods",
        "Companion",
        "$serializer",
        "universal-checkout_release"
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$Companion;


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

.field private final header:Lcom/whoop/design/models/items/HeaderModel;

.field private final paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

.field private final truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lno2/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lno2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/HeaderModel;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodTile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedPaymentMethods"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

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

    invoke-static {}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->copy(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/HeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/MenuItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MenuItemModel$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/HeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/MenuItemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    return-object v0
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

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/HeaderModel;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodTile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptedPaymentMethods"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;-><init>(Lcom/whoop/design/models/items/HeaderModel;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lcom/whoop/design/models/items/MenuItemModel;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
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

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/HeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    return-object v0
.end method

.method public final getPaymentMethodTile()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    return-object v0
.end method

.method public final getTruemedPaymentMenuItem()Lcom/whoop/design/models/items/MenuItemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/HeaderModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/MenuItemModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->header:Lcom/whoop/design/models/items/HeaderModel;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->paymentMethodTile:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->truemedPaymentMenuItem:Lcom/whoop/design/models/items/MenuItemModel;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->acceptedPaymentMethods:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PaymentMethodTileModel(header="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodTile="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", truemedPaymentMenuItem="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptedPaymentMethods="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
