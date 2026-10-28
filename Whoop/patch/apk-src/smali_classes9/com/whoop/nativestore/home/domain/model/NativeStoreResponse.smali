.class public final Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$$serializer;,
        Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;<BE\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBS\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JN\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u00089\u0010&\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;",
        "",
        "",
        "navigationBarText",
        "",
        "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
        "sections",
        "Lcom/whoop/nativestore/home/domain/model/CartIndicator;",
        "cart",
        "Lcom/whoop/design/models/items/CountrySelectorModel;",
        "countrySelector",
        "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;",
        "checkoutFooter",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/nativestore/home/domain/model/CartIndicator;",
        "component4",
        "()Lcom/whoop/design/models/items/CountrySelectorModel;",
        "component5",
        "()Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationBarText",
        "Ljava/util/List;",
        "getSections",
        "Lcom/whoop/nativestore/home/domain/model/CartIndicator;",
        "getCart",
        "Lcom/whoop/design/models/items/CountrySelectorModel;",
        "getCountrySelector",
        "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;",
        "getCheckoutFooter",
        "Companion",
        "$serializer",
        "a",
        "native-store_release"
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

.field public static final Companion:Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$a;


# instance fields
.field private final cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

.field private final checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

.field private final countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

.field private final navigationBarText:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->Companion:Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lrx0/f;

    invoke-direct {v3, v0}, Lrx0/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    if-nez p7, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
            ">;",
            "Lcom/whoop/nativestore/home/domain/model/CartIndicator;",
            "Lcom/whoop/design/models/items/CountrySelectorModel;",
            "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationBarText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    .line 10
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    .line 11
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    .line 12
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 13
    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 14
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p7, v0

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move-object p7, p5

    move-object p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 15
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/nativestore/home/domain/model/NativeStoreSection$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/NativeStoreSection$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;ILjava/lang/Object;)Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/nativestore/home/domain/model/CartIndicator$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/CartIndicator$$serializer;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/CountrySelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CountrySelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/nativestore/home/domain/model/CheckoutFooter$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter$$serializer;

    iget-object p0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/nativestore/home/domain/model/CartIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/CountrySelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
            ">;",
            "Lcom/whoop/nativestore/home/domain/model/CartIndicator;",
            "Lcom/whoop/design/models/items/CountrySelectorModel;",
            "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;",
            ")",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;"
        }
    .end annotation

    const-string v0, "navigationBarText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/nativestore/home/domain/model/CartIndicator;Lcom/whoop/design/models/items/CountrySelectorModel;Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    iget-object p1, p1, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCart()Lcom/whoop/nativestore/home/domain/model/CartIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    return-object v0
.end method

.method public final getCheckoutFooter()Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    return-object v0
.end method

.method public final getCountrySelector()Lcom/whoop/design/models/items/CountrySelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    return-object v0
.end method

.method public final getNavigationBarText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/CartIndicator;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CountrySelectorModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->navigationBarText:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->sections:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->cart:Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    iget-object v4, p0, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->checkoutFooter:Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    const-string v5, ", sections="

    const-string v6, ", cart="

    const-string v7, "NativeStoreResponse(navigationBarText="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countrySelector="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", checkoutFooter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
