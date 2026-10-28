.class public final Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$$serializer;,
        Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBU\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JP\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010$J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010$R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00088\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008:\u0010\'\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
        "",
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;",
        "paymentSheetConfiguration",
        "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;",
        "defaultBillingDetails",
        "Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;",
        "setupIntentConfiguration",
        "",
        "paymentMethodConfigurationId",
        "stripePublishableKey",
        "",
        "autoPopUp",
        "<init>",
        "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_release",
        "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;",
        "component2",
        "()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;",
        "component3",
        "()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "()Z",
        "copy",
        "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;",
        "getPaymentSheetConfiguration",
        "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;",
        "getDefaultBillingDetails",
        "Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;",
        "getSetupIntentConfiguration",
        "Ljava/lang/String;",
        "getPaymentMethodConfigurationId",
        "getStripePublishableKey",
        "Z",
        "getAutoPopUp",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$a;


# instance fields
.field private final autoPopUp:Z

.field private final defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

.field private final paymentMethodConfigurationId:Ljava/lang/String;

.field private final paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

.field private final setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

.field private final stripePublishableKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->Companion:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$$serializer;

    invoke-virtual {p8}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    iput-object p3, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    iput-object p4, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    iput-object p5, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    return-void
.end method

.method public constructor <init>(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "paymentSheetConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setupIntentConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripePublishableKey"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    .line 4
    iput-object p2, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    .line 5
    iput-object p3, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    .line 6
    iput-object p4, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->copy(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$payments_release(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration$$serializer;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails$$serializer;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration$$serializer;->INSTANCE:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration$$serializer;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-boolean p0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    return-object v0
.end method

.method public final component2()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    return-object v0
.end method

.method public final component3()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    return v0
.end method

.method public final copy(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;
    .locals 8

    const-string v0, "paymentSheetConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setupIntentConfiguration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripePublishableKey"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;-><init>(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    iget-boolean p1, p1, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAutoPopUp()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    return v0
.end method

.method public final getDefaultBillingDetails()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    return-object v0
.end method

.method public final getPaymentMethodConfigurationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentSheetConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    return-object v0
.end method

.method public final getSetupIntentConfiguration()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    return-object v0
.end method

.method public final getStripePublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    invoke-virtual {v0}, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    invoke-virtual {v2}, Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentSheetConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;

    iget-object v1, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->defaultBillingDetails:Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;

    iget-object v2, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->setupIntentConfiguration:Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;

    iget-object v3, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->paymentMethodConfigurationId:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->stripePublishableKey:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;->autoPopUp:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PaymentSheetMetadata(paymentSheetConfiguration="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", defaultBillingDetails="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", setupIntentConfiguration="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodConfigurationId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stripePublishableKey="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", autoPopUp="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
