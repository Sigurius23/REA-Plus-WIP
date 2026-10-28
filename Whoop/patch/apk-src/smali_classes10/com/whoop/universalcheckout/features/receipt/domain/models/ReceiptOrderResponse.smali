.class public final Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$$serializer;,
        Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rBU\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JN\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u0010\u0010\'\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010!R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u00084\u0010#\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;",
        "",
        "",
        "title",
        "",
        "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;",
        "sections",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "closeInteraction",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "analyticsPayload",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component4",
        "()Ljava/util/Map;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;",
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
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getCloseInteraction",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$Companion;


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

.field private final closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->Companion:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcp0/m;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lcp0/m;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcp0/m;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lcp0/m;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v1, 0x3

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    return-void

    :cond_2
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;",
            ">;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel$$serializer;

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

    invoke-static {}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;",
            ">;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;)",
            "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
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

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    return-object v0
.end method

.method public final getCloseInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->sections:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->closeInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->analyticsPayload:Ljava/util/Map;

    const-string v4, ", sections="

    const-string v5, ", closeInteraction="

    const-string v6, "ReceiptOrderResponse(title="

    invoke-static {v6, v0, v4, v5, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
