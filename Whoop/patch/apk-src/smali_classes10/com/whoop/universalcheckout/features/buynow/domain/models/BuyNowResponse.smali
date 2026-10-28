.class public final Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$$serializer;,
        Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@ABS\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBg\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jh\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00089\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008;\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;",
        "",
        "",
        "title",
        "",
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
        "sections",
        "checkoutFooter",
        "analyticsSubtotalValue",
        "Lcom/whoop/navigation/e;",
        "checkoutDestination",
        "paymentMethodId",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/e;",
        "component6",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;",
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
        "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
        "getCheckoutFooter",
        "getAnalyticsSubtotalValue",
        "Lcom/whoop/navigation/e;",
        "getCheckoutDestination",
        "getPaymentMethodId",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getGenericInteraction",
        "Companion",
        "$serializer",
        "a",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$a;


# instance fields
.field private final analyticsSubtotalValue:Ljava/lang/String;

.field private final checkoutDestination:Lcom/whoop/navigation/e;

.field private final checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

.field private final genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final paymentMethodId:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->Companion:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ltb0/b;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Ltb0/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ltb0/b;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Ltb0/b;-><init>(I)V

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

    aput-object v0, v3, v2

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7d

    const/16 v0, 0x7d

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    :goto_0
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    iput-object p7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            ">;",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    .line 7
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    .line 8
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    .line 10
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    .line 12
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    .line 13
    invoke-direct/range {v0 .. v7}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v2, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection$$serializer;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            ">;",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalyticsSubtotalValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getCheckoutDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getCheckoutFooter()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    return-object v0
.end method

.method public final getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getPaymentMethodId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->sections:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutFooter:Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->analyticsSubtotalValue:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->checkoutDestination:Lcom/whoop/navigation/e;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->paymentMethodId:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowResponse;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v7, ", sections="

    const-string v8, ", checkoutFooter="

    const-string v9, "BuyNowResponse(title="

    invoke-static {v9, v0, v7, v8, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsSubtotalValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", checkoutDestination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", genericInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
