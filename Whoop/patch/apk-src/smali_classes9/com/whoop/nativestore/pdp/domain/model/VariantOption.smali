.class public final Lcom/whoop/nativestore/pdp/domain/model/VariantOption;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/pdp/domain/model/VariantOption$$serializer;,
        Lcom/whoop/nativestore/pdp/domain/model/VariantOption$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 K2\u00020\u0001:\u0002LMB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u0012\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u00a3\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010!J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u00a4\u0001\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001aJ\u0010\u0010-\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u001a\u0010/\u001a\u00020\r2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008<\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008>\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008?\u0010\u001aR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008@\u0010\u001aR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010!R%\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010%R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010A\u001a\u0004\u0008G\u0010!R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010A\u001a\u0004\u0008H\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010I\u001a\u0004\u0008J\u0010)\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;",
        "",
        "",
        "sku",
        "price",
        "",
        "priceAmount",
        "priceCurrencyCode",
        "discountedPrice",
        "",
        "images",
        "",
        "imagesWithLabels",
        "",
        "hasStock",
        "Lkotlinx/serialization/json/JsonElement;",
        "attributes",
        "productAccordionEntries",
        "productTag",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Ljava/util/Map;",
        "component8",
        "()Z",
        "component9",
        "component10",
        "component11",
        "()Lkotlinx/serialization/json/JsonElement;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;",
        "toString",
        "hashCode",
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
        "(Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getSku",
        "getPrice",
        "I",
        "getPriceAmount",
        "getPriceCurrencyCode",
        "getDiscountedPrice",
        "Ljava/util/List;",
        "getImages",
        "Ljava/util/Map;",
        "getImagesWithLabels",
        "Z",
        "getHasStock",
        "getAttributes",
        "getProductAccordionEntries",
        "Lkotlinx/serialization/json/JsonElement;",
        "getProductTag",
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

.field public static final Companion:Lcom/whoop/nativestore/pdp/domain/model/VariantOption$a;


# instance fields
.field private final attributes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final discountedPrice:Ljava/lang/String;

.field private final hasStock:Z

.field private final images:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final imagesWithLabels:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final price:Ljava/lang/String;

.field private final priceAmount:I

.field private final priceCurrencyCode:Ljava/lang/String;

.field private final productAccordionEntries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final productTag:Lkotlinx/serialization/json/JsonElement;

.field private final sku:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->Companion:Lcom/whoop/nativestore/pdp/domain/model/VariantOption$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lzz1/a;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lzz1/a;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lzz1/a;

    const/16 v8, 0xb

    invoke-direct {v7, v8}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lzz1/a;

    const/16 v10, 0xc

    invoke-direct {v9, v10}, Lzz1/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v8, v8, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v9, 0x1

    aput-object v1, v8, v9

    const/4 v9, 0x2

    aput-object v1, v8, v9

    const/4 v9, 0x3

    aput-object v1, v8, v9

    const/4 v9, 0x4

    aput-object v1, v8, v9

    const/4 v9, 0x5

    aput-object v3, v8, v9

    const/4 v3, 0x6

    aput-object v5, v8, v3

    const/4 v3, 0x7

    aput-object v1, v8, v3

    aput-object v7, v8, v0

    aput-object v2, v8, v4

    aput-object v1, v8, v6

    sput-object v8, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p1, 0xb

    const/16 v0, 0xb

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/nativestore/pdp/domain/model/VariantOption$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/VariantOption$$serializer;

    invoke-virtual {p13}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput p3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    goto :goto_0

    :cond_1
    iput p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    :goto_0
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p4, 0x0

    if-nez p2, :cond_2

    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x20

    sget-object p5, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_3

    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_5

    iput-boolean p3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    goto :goto_4

    :cond_5
    iput-boolean p9, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    :goto_4
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    :goto_5
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_7

    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    goto :goto_6

    :cond_7
    iput-object p11, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    :goto_6
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_8

    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    return-void

    :cond_8
    iput-object p12, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")V"
        }
    .end annotation

    const-string v0, "sku"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceCurrencyCode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "images"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productAccordionEntries"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    .line 6
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    .line 11
    iput-object p9, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    .line 13
    iput-object p11, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v8, v3

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    .line 14
    sget-object v4, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_2

    move-object v9, v4

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v3

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v11, v2

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v3

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v4

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_7

    move-object v14, v3

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p4

    move-object v3, p0

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    move-object v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p4

    :goto_7
    invoke-direct/range {v3 .. v14}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

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

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-boolean p8, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    if-eqz v2, :cond_9

    :goto_4
    iget-boolean v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object p0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    return v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/nativestore/pdp/domain/model/VariantOption;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;"
        }
    .end annotation

    const-string v0, "sku"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceCurrencyCode"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "images"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productAccordionEntries"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ZLjava/util/List;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    iget v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    iget-boolean v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    iget-object p1, p1, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAttributes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    return-object v0
.end method

.method public final getDiscountedPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasStock()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    return v0
.end method

.method public final getImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    return-object v0
.end method

.method public final getImagesWithLabels()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    return-object v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final getPriceAmount()I
    .locals 1

    iget v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    return v0
.end method

.method public final getPriceCurrencyCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getProductAccordionEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    return-object v0
.end method

.method public final getProductTag()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->sku:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->price:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceAmount:I

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->priceCurrencyCode:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->discountedPrice:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->images:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->imagesWithLabels:Ljava/util/Map;

    iget-boolean v7, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->hasStock:Z

    iget-object v8, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->attributes:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productAccordionEntries:Ljava/util/List;

    iget-object v10, p0, Lcom/whoop/nativestore/pdp/domain/model/VariantOption;->productTag:Lkotlinx/serialization/json/JsonElement;

    const-string v11, ", price="

    const-string v12, ", priceAmount="

    const-string v13, "VariantOption(sku="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", priceCurrencyCode="

    const-string v11, ", discountedPrice="

    invoke-static {v2, v1, v3, v11, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", images="

    const-string v2, ", imagesWithLabels="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasStock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", attributes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", productAccordionEntries="

    const-string v2, ", productTag="

    invoke-static {v0, v8, v1, v9, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
