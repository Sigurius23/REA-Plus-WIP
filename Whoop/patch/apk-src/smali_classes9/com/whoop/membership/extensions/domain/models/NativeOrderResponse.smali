.class public final Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$$serializer;,
        Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 ^2\u00020\u0001:\u0002_^Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u0086\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010\u001dJ\u0010\u00101\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010@\u0012\u0004\u0008B\u0010C\u001a\u0004\u0008A\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010D\u0012\u0004\u0008F\u0010C\u001a\u0004\u0008E\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010G\u0012\u0004\u0008I\u0010C\u001a\u0004\u0008H\u0010!R&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010J\u0012\u0004\u0008L\u0010C\u001a\u0004\u0008K\u0010#R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010M\u0012\u0004\u0008O\u0010C\u001a\u0004\u0008N\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010@\u0012\u0004\u0008Q\u0010C\u001a\u0004\u0008P\u0010\u001dR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010@\u0012\u0004\u0008S\u0010C\u001a\u0004\u0008R\u0010\u001dR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010@\u0012\u0004\u0008U\u0010C\u001a\u0004\u0008T\u0010\u001dR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010V\u0012\u0004\u0008X\u0010C\u001a\u0004\u0008W\u0010*R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010Y\u0012\u0004\u0008[\u0010C\u001a\u0004\u0008Z\u0010,R \u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010@\u0012\u0004\u0008]\u0010C\u001a\u0004\u0008\\\u0010\u001d\u00a8\u0006`"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;",
        "",
        "",
        "title",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;",
        "paymentOptions",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;",
        "orderDetails",
        "",
        "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
        "orderOptions",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;",
        "promoCode",
        "checkoutCtaTitle",
        "securityFooter",
        "disclaimerFooterMarkdown",
        "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
        "checkoutStep",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "loadingProgressContent",
        "payload",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;",
        "component3",
        "()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
        "component10",
        "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "component11",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;",
        "getPaymentOptions",
        "getPaymentOptions$annotations",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;",
        "getOrderDetails",
        "getOrderDetails$annotations",
        "Ljava/util/List;",
        "getOrderOptions",
        "getOrderOptions$annotations",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;",
        "getPromoCode",
        "getPromoCode$annotations",
        "getCheckoutCtaTitle",
        "getCheckoutCtaTitle$annotations",
        "getSecurityFooter",
        "getSecurityFooter$annotations",
        "getDisclaimerFooterMarkdown",
        "getDisclaimerFooterMarkdown$annotations",
        "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
        "getCheckoutStep",
        "getCheckoutStep$annotations",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "getLoadingProgressContent",
        "getLoadingProgressContent$annotations",
        "getPayload",
        "getPayload$annotations",
        "Companion",
        "$serializer",
        "membership_release"
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

.field public static final Companion:Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$Companion;


# instance fields
.field private final checkoutCtaTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "checkout_cta_title"
    .end annotation
.end field

.field private final checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "checkout_step"
    .end annotation
.end field

.field private final disclaimerFooterMarkdown:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disclaimer_footer_markdown"
    .end annotation
.end field

.field private final loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "loading_progress_content"
    .end annotation
.end field

.field private final orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "order_details"
    .end annotation
.end field

.field private final orderOptions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "order_options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "payload"
    .end annotation
.end field

.field private final paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "payment_options"
    .end annotation
.end field

.field private final promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "promo_code"
    .end annotation
.end field

.field private final securityFooter:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "security_footer"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->Companion:Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lgw1/a;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lgw1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xb

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v2, v3, v5

    const/4 v2, 0x4

    aput-object v1, v3, v2

    aput-object v1, v3, v4

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$$serializer;

    invoke-virtual {p13}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    iput-object p7, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    iput-object p11, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iput-object p12, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderDetails"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkoutCtaTitle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "securityFooter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimerFooterMarkdown"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkoutStep"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadingProgressContent"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    .line 8
    iput-object p6, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    .line 12
    iput-object p10, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    .line 13
    iput-object p11, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/membership/extensions/domain/models/OrderOption$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/OrderOption$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->copy(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCheckoutCtaTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "checkout_cta_title"
    .end annotation

    return-void
.end method

.method public static synthetic getCheckoutStep$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "checkout_step"
    .end annotation

    return-void
.end method

.method public static synthetic getDisclaimerFooterMarkdown$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disclaimer_footer_markdown"
    .end annotation

    return-void
.end method

.method public static synthetic getLoadingProgressContent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "loading_progress_content"
    .end annotation

    return-void
.end method

.method public static synthetic getOrderDetails$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "order_details"
    .end annotation

    return-void
.end method

.method public static synthetic getOrderOptions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "order_options"
    .end annotation

    return-void
.end method

.method public static synthetic getPayload$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "payload"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentOptions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "payment_options"
    .end annotation

    return-void
.end method

.method public static synthetic getPromoCode$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "promo_code"
    .end annotation

    return-void
.end method

.method public static synthetic getSecurityFooter$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "security_footer"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption$$serializer;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails$$serializer;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ProgressContent$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/ProgressContent$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    const/16 v2, 0x9

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-object p0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/membership/extensions/domain/models/ProgressContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    return-object v0
.end method

.method public final component3()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;",
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderDetails"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orderOptions"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkoutCtaTitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "securityFooter"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimerFooterMarkdown"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkoutStep"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadingProgressContent"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v12}, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;-><init>(Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCheckoutCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getCheckoutStep()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    return-object v0
.end method

.method public final getDisclaimerFooterMarkdown()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoadingProgressContent()Lcom/whoop/membership/extensions/domain/models/ProgressContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    return-object v0
.end method

.method public final getOrderDetails()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    return-object v0
.end method

.method public final getOrderOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getPayload()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentOptions()Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    return-object v0
.end method

.method public final getPromoCode()Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    return-object v0
.end method

.method public final getSecurityFooter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->paymentOptions:Lcom/whoop/membership/extensions/domain/models/NativeOrderPaymentOption;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderDetails:Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->orderOptions:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->promoCode:Lcom/whoop/membership/extensions/domain/models/NativeOrderPromoCode;

    iget-object v5, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutCtaTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->securityFooter:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->disclaimerFooterMarkdown:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->checkoutStep:Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    iget-object v9, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->loadingProgressContent:Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v10, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderResponse;->payload:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "NativeOrderResponse(title="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentOptions="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", orderDetails="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", orderOptions="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", promoCode="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", checkoutCtaTitle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", securityFooter="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disclaimerFooterMarkdown="

    const-string v1, ", checkoutStep="

    invoke-static {v11, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", loadingProgressContent="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", payload="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v10, v0, v11}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
