.class public final Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$$serializer;,
        Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u0000 H2\u00020\u0001:\u0002IHBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bs\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010!J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010!Jj\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010!J\u0010\u0010/\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010!R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010#R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008:\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008<\u0010\'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u0008=\u0010!R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008?\u0010*R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00105\u001a\u0004\u0008@\u0010!R\"\u0010B\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008B\u0010C\u0012\u0004\u0008F\u0010G\u001a\u0004\u0008D\u0010E\u00a8\u0006J"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;",
        "",
        "",
        "title",
        "",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;",
        "sections",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;",
        "paymentSheetConfiguration",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
        "paymentSheetIntentConfiguration",
        "stripePublishableKey",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "analyticsPayload",
        "cartId",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;",
        "component4",
        "()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
        "component5",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/List;",
        "getSections",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;",
        "getPaymentSheetConfiguration",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
        "getPaymentSheetIntentConfiguration",
        "getStripePublishableKey",
        "Ljava/util/Map;",
        "getAnalyticsPayload",
        "getCartId",
        "Lcom/whoop/navigation/e;",
        "postCheckoutNavigation",
        "Lcom/whoop/navigation/e;",
        "getPostCheckoutNavigation",
        "()Lcom/whoop/navigation/e;",
        "getPostCheckoutNavigation$annotations",
        "()V",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$Companion;


# instance fields
.field private final analyticsPayload:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final cartId:Ljava/lang/String;

.field private final paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

.field private final paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

.field private final postCheckoutNavigation:Lcom/whoop/navigation/e;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final stripePublishableKey:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lm22/m;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lm22/m;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lm22/m;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lm22/m;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    iput-object p8, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    .line 2
    check-cast p3, Ljava/lang/Iterable;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 5
    check-cast p3, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;

    .line 6
    invoke-virtual {p3}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;->getItems()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    .line 7
    invoke-static {p1, p3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    .line 8
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    instance-of p4, p3, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    if-eqz p4, :cond_2

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_3
    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getPostCheckoutNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    .line 12
    :goto_2
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->postCheckoutNavigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;",
            ">;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetIntentConfiguration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripePublishableKey"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    .line 16
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    .line 17
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    .line 18
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    .line 19
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    .line 20
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    .line 21
    check-cast p2, Ljava/lang/Iterable;

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 24
    check-cast p3, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;

    .line 25
    invoke-virtual {p3}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;->getItems()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    .line 26
    invoke-static {p1, p3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    .line 27
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    instance-of p4, p3, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    if-eqz p4, :cond_1

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 29
    :cond_2
    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    if-eqz p1, :cond_3

    .line 30
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getPostCheckoutNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->postCheckoutNavigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPostCheckoutNavigation$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    return-object v0
.end method

.method public final component4()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;",
            ">;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSheetIntentConfiguration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripePublishableKey"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cartId"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalyticsPayload()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final getCartId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentSheetConfiguration()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    return-object v0
.end method

.method public final getPaymentSheetIntentConfiguration()Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    return-object v0
.end method

.method public final getPostCheckoutNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->postCheckoutNavigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getStripePublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->sections:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->paymentSheetIntentConfiguration:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->stripePublishableKey:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->analyticsPayload:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/UniversalCheckoutResponse;->cartId:Ljava/lang/String;

    const-string v7, ", sections="

    const-string v8, ", paymentSheetConfiguration="

    const-string v9, "UniversalCheckoutResponse(title="

    invoke-static {v9, v0, v7, v8, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentSheetIntentConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stripePublishableKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsPayload="

    const-string v2, ", cartId="

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
