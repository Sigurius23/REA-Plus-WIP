.class public final Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$$serializer;,
        Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBS\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JR\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0010\u0010(\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\u00072\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00084\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010$\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
        "",
        "",
        "amount",
        "",
        "currency",
        "paymentMethodConfigurationId",
        "",
        "setupFutureUsage",
        "onBehalfOf",
        "requireCvcRecollection",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "component6",
        "()Z",
        "copy",
        "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getAmount",
        "Ljava/lang/String;",
        "getCurrency",
        "getPaymentMethodConfigurationId",
        "Ljava/lang/Boolean;",
        "getSetupFutureUsage",
        "getOnBehalfOf",
        "Z",
        "getRequireCvcRecollection",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$Companion;


# instance fields
.field private final amount:J

.field private final currency:Ljava/lang/String;

.field private final onBehalfOf:Ljava/lang/String;

.field private final paymentMethodConfigurationId:Ljava/lang/String;

.field private final requireCvcRecollection:Z

.field private final setupFutureUsage:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$$serializer;

    invoke-virtual {p9}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    return-void

    :cond_2
    iput-boolean p8, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    .line 4
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    .line 7
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v6, p6

    and-int/lit8 p6, p8, 0x20

    if-eqz p6, :cond_1

    const/4 p6, 0x0

    move v7, p6

    :goto_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    goto :goto_1

    :cond_1
    move v7, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v0 .. v7}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    :cond_4
    move-object v6, p6

    and-int/lit8 p1, p8, 0x20

    if-eqz p1, :cond_5

    iget-boolean p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    :cond_5
    move-object v0, p0

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    if-eqz v1, :cond_3

    :goto_1
    iget-boolean p0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    return v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;
    .locals 9

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;

    iget-wide v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    iget-wide v5, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    iget-boolean p1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAmount()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    return-wide v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnBehalfOf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethodConfigurationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequireCvcRecollection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    return v0
.end method

.method public final getSetupFutureUsage()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->amount:J

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->currency:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->paymentMethodConfigurationId:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->setupFutureUsage:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->onBehalfOf:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;->requireCvcRecollection:Z

    const-string v7, "PaymentSheetIntentConfiguration(amount="

    const-string v8, ", currency="

    invoke-static {v7, v8, v0, v1, v2}, Lvl/b;->m(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodConfigurationId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", setupFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onBehalfOf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", requireCvcRecollection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
