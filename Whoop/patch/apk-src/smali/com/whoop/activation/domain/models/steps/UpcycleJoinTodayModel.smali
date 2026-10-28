.class public final Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/activation/domain/models/ActivationFlowStepModel;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$$serializer;,
        Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0002^]B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\u0008\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00b7\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0010\u0010)\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010%J\u0010\u0010.\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010%J\u0010\u00100\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010%J\u0010\u00101\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u00ba\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00072\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00072\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\u0008\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010%J\u0010\u00109\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010=\u001a\u00020\u000e2\u0008\u0010<\u001a\u0004\u0018\u00010;H\u00d6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001\u00a2\u0006\u0004\u0008E\u0010FR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010H\u001a\u0004\u0008I\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010J\u001a\u0004\u0008K\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010L\u001a\u0004\u0008M\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010N\u001a\u0004\u0008O\u0010\'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010L\u001a\u0004\u0008P\u0010%R\u0017\u0010\u000c\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010L\u001a\u0004\u0008Q\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010L\u001a\u0004\u0008R\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010S\u001a\u0004\u0008\u000f\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010L\u001a\u0004\u0008T\u0010%R\u0017\u0010\u0011\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010L\u001a\u0004\u0008U\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010L\u001a\u0004\u0008V\u0010%R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010L\u001a\u0004\u0008W\u0010%R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010L\u001a\u0004\u0008X\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010Y\u001a\u0004\u0008Z\u00103R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010[\u001a\u0004\u0008\\\u00105\u00a8\u0006_"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;",
        "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "orderDetails",
        "Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
        "paymentMethod",
        "",
        "joinCtaTitle",
        "Lcom/whoop/design/util/TextResource;",
        "securityFooter",
        "disclaimerFooterMarkdown",
        "payload",
        "upcycleCreditCardVariant",
        "",
        "isTrialMember",
        "promoCode",
        "membershipTier",
        "navigationBarText",
        "mobileScreenName",
        "analyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "progressCircle",
        "",
        "footerButtons",
        "<init>",
        "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "component2",
        "()Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/design/util/TextResource;",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Ljava/lang/Boolean;",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "component15",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
        "getOrderDetails",
        "Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
        "getPaymentMethod",
        "Ljava/lang/String;",
        "getJoinCtaTitle",
        "Lcom/whoop/design/util/TextResource;",
        "getSecurityFooter",
        "getDisclaimerFooterMarkdown",
        "getPayload",
        "getUpcycleCreditCardVariant",
        "Ljava/lang/Boolean;",
        "getPromoCode",
        "getMembershipTier",
        "getNavigationBarText",
        "getMobileScreenName",
        "getAnalyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressCircle",
        "Ljava/util/List;",
        "getFooterButtons",
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$Companion;


# instance fields
.field private final analyticsName:Ljava/lang/String;

.field private final disclaimerFooterMarkdown:Ljava/lang/String;

.field private final footerButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final isTrialMember:Ljava/lang/Boolean;

.field private final joinCtaTitle:Ljava/lang/String;

.field private final membershipTier:Ljava/lang/String;

.field private final mobileScreenName:Ljava/lang/String;

.field private final navigationBarText:Ljava/lang/String;

.field private final orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

.field private final payload:Ljava/lang/String;

.field private final paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

.field private final progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

.field private final promoCode:Ljava/lang/String;

.field private final securityFooter:Lcom/whoop/design/util/TextResource;

.field private final upcycleCreditCardVariant:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->Companion:Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lr70/b;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lr70/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xf

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    const/16 v0, 0xe

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x3fff

    const/16 v1, 0x3fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    and-int/lit16 p1, p1, 0x4000

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    :goto_0
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    return-void

    :cond_1
    move-object/from16 p1, p16

    goto :goto_0
.end method

.method public constructor <init>(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
            "Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    move-object v0, p12

    move-object/from16 v1, p13

    const-string v2, "orderDetails"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethod"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "securityFooter"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "disclaimerFooterMarkdown"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "payload"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "membershipTier"

    invoke-static {p10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mobileScreenName"

    invoke-static {p12, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "analyticsName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    .line 6
    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    .line 7
    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    .line 13
    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    .line 16
    iput-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    .line 17
    iput-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    move-object/from16 p1, p14

    .line 18
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p16

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object/from16 v16, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    goto :goto_1

    :cond_0
    move-object/from16 v16, p15

    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v1 .. v16}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;-><init>(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->copy(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/OrderDetails$$serializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PaymentOptions$$serializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0xa

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getNavigationBarText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xc

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v2

    const/16 v3, 0xd

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getFooterButtons()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->getFooterButtons()Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/activation/domain/models/steps/OrderDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/activation/domain/models/steps/PaymentOptions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/domain/models/steps/OrderDetails;",
            "Lcom/whoop/activation/domain/models/steps/PaymentOptions;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;"
        }
    .end annotation

    const-string v0, "orderDetails"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "securityFooter"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimerFooterMarkdown"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTier"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileScreenName"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsName"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;-><init>(Lcom/whoop/activation/domain/models/steps/OrderDetails;Lcom/whoop/activation/domain/models/steps/PaymentOptions;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public getAnalyticsName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimerFooterMarkdown()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;
    .locals 1

    invoke-super {p0}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;

    move-result-object v0

    return-object v0
.end method

.method public getFooterButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final getJoinCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMembershipTier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    return-object v0
.end method

.method public getMobileScreenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public getNavigationBarText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrderDetails()Lcom/whoop/activation/domain/models/steps/OrderDetails;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    return-object v0
.end method

.method public final getPayload()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentMethod()Lcom/whoop/activation/domain/models/steps/PaymentOptions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    return-object v0
.end method

.method public getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getPromoCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecurityFooter()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getUpcycleCreditCardVariant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/OrderDetails;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/steps/PaymentOptions;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public final isTrialMember()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->orderDetails:Lcom/whoop/activation/domain/models/steps/OrderDetails;

    iget-object v2, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->paymentMethod:Lcom/whoop/activation/domain/models/steps/PaymentOptions;

    iget-object v3, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->joinCtaTitle:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->securityFooter:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->disclaimerFooterMarkdown:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->payload:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->upcycleCreditCardVariant:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->isTrialMember:Ljava/lang/Boolean;

    iget-object v9, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->promoCode:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->membershipTier:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->navigationBarText:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->mobileScreenName:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->analyticsName:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v15, v0, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;->footerButtons:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v16, v15

    const-string v15, "UpcycleJoinTodayModel(orderDetails="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", joinCtaTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", securityFooter="

    const-string v2, ", disclaimerFooterMarkdown="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", payload="

    const-string v2, ", upcycleCreditCardVariant="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isTrialMember="

    const-string v2, ", promoCode="

    invoke-static {v8, v7, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", membershipTier="

    const-string v2, ", navigationBarText="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", mobileScreenName="

    const-string v2, ", analyticsName="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progressCircle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerButtons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v16

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
