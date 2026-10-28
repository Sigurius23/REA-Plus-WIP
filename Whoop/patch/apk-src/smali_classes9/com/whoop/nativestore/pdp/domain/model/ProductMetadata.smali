.class public final Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$$serializer;,
        Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DEB}\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0083\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0086\u0001\u0010#\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010)\u001a\u00020\u00052\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00089\u0010\u0018R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u0008:\u0010\u0018R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010!R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010;\u001a\u0004\u0008?\u0010\u001fR\u0011\u0010@\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0011\u0010B\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010A\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;",
        "",
        "",
        "initiallySelectedSku",
        "initiallySelectedPrice",
        "",
        "initialVariantHasStock",
        "packSku",
        "packPrice",
        "",
        "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
        "packItemMetadata",
        "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;",
        "wywMetadata",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;",
        "products",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/lang/Boolean;",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "()Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getInitiallySelectedSku",
        "getInitiallySelectedPrice",
        "Ljava/lang/Boolean;",
        "getInitialVariantHasStock",
        "getPackSku",
        "getPackPrice",
        "Ljava/util/Map;",
        "getPackItemMetadata",
        "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;",
        "getWywMetadata",
        "getProducts",
        "isPack",
        "()Z",
        "isWhoopYourWay",
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

.field public static final Companion:Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$a;


# instance fields
.field private final initialVariantHasStock:Ljava/lang/Boolean;

.field private final initiallySelectedPrice:Ljava/lang/String;

.field private final initiallySelectedSku:Ljava/lang/String;

.field private final packItemMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
            ">;"
        }
    .end annotation
.end field

.field private final packPrice:Ljava/lang/String;

.field private final packSku:Ljava/lang/String;

.field private final products:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;",
            ">;"
        }
    .end annotation
.end field

.field private final wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->Companion:Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lzz1/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lzz1/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    aput-object v1, v0, v4

    aput-object v1, v0, v6

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const/4 v4, 0x5

    aput-object v3, v0, v4

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/4 v1, 0x7

    aput-object v2, v0, v1

    sput-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const/4 v0, 0x0

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    .line 3
    sget-object p1, Lm83/z;->w:Lm83/z;

    .line 4
    iput-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
            ">;",
            "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;",
            ">;)V"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    .line 9
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    .line 11
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    .line 12
    iput-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    .line 13
    iput-object p8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    .line 14
    sget-object p8, Lm83/z;->w:Lm83/z;

    :cond_7
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 15
    invoke-direct/range {p1 .. p9}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/nativestore/pdp/domain/model/ProductOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/ProductOption$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata$$serializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
            ">;",
            "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;",
            ">;)",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;"
        }
    .end annotation

    const-string v0, "products"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getInitialVariantHasStock()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getInitiallySelectedPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitiallySelectedSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackItemMetadata()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/PackItemProductMetadata;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public final getPackPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getProducts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/ProductOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    return-object v0
.end method

.method public final getWywMetadata()Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isPack()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isWhoopYourWay()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedSku:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initiallySelectedPrice:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->initialVariantHasStock:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packSku:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packPrice:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->packItemMetadata:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->wywMetadata:Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayMetadata;

    iget-object v7, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductMetadata;->products:Ljava/util/Map;

    const-string v8, ", initiallySelectedPrice="

    const-string v9, ", initialVariantHasStock="

    const-string v10, "ProductMetadata(initiallySelectedSku="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", packSku="

    const-string v8, ", packPrice="

    invoke-static {v2, v1, v3, v8, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", packItemMetadata="

    const-string v2, ", wywMetadata="

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
