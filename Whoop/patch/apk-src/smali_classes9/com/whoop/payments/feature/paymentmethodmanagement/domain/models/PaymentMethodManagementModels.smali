.class public final Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$$serializer;,
        Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000234B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBK\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u001f\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;",
        "",
        "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;",
        "navigationBar",
        "",
        "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;",
        "sections",
        "",
        "",
        "analyticsProperties",
        "<init>",
        "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_release",
        "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/util/Map;",
        "copy",
        "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;",
        "getNavigationBar",
        "Ljava/util/List;",
        "getSections",
        "Ljava/util/Map;",
        "getAnalyticsProperties",
        "getAnalyticsProperties$annotations",
        "()V",
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

.field public static final Companion:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$a;


# instance fields
.field private final analyticsProperties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->Companion:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lut2/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lut2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lut2/a;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lut2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$$serializer;->INSTANCE:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$$serializer;

    invoke-virtual {p5}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    iput-object p3, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel$$serializer;->INSTANCE:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->copy(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAnalyticsProperties$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "payment_error_state_analytics_properties"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_release(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;-><init>(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;Ljava/util/List;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    iget-object v1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    iget-object v3, p1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAnalyticsProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    invoke-virtual {v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

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
    .locals 5

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->navigationBar:Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementNavigationBarModel;

    iget-object v1, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->sections:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;->analyticsProperties:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PaymentMethodManagementModels(navigationBar="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sections="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticsProperties="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
