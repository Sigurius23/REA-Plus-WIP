.class public final Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$$serializer;,
        Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBi\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J`\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00082\u0010\u001dR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;",
        "",
        "",
        "type",
        "id",
        "ctaText",
        "title",
        "",
        "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
        "shippingMethods",
        "",
        "analyticsPayload",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Ljava/util/Map;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getType",
        "getId",
        "getCtaText",
        "getTitle",
        "Ljava/util/List;",
        "getShippingMethods",
        "Ljava/util/Map;",
        "getAnalyticsPayload",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$Companion;


# instance fields
.field private final analyticsPayload:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final ctaText:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final shippingMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->Companion:Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ltb0/b;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Ltb0/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ltb0/b;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, Ltb0/b;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v1, 0x4

    aput-object v2, v3, v1

    const/4 v1, 0x5

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$$serializer;

    invoke-virtual {p8}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    return-void

    :cond_1
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shippingMethods"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    new-instance v2, Lwc3/a;

    const-class v3, Ljava/lang/Object;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lwc3/c;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v5, v4}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shippingMethods"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAnalyticsPayload()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getShippingMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

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
    .locals 9

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->type:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->id:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->ctaText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->title:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->shippingMethods:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->analyticsPayload:Ljava/util/Map;

    const-string v6, ", id="

    const-string v7, ", ctaText="

    const-string v8, "ShippingMethodModels(type="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    const-string v6, ", shippingMethods="

    invoke-static {v0, v2, v1, v3, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
