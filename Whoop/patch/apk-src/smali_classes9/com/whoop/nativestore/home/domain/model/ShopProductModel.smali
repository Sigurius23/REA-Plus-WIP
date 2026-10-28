.class public final Lcom/whoop/nativestore/home/domain/model/ShopProductModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/home/domain/model/ShopProductModel$$serializer;,
        Lcom/whoop/nativestore/home/domain/model/ShopProductModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KLB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0093\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u0019J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u0019J\u0094\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u0019J\u0010\u0010+\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008<\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010:\u001a\u0004\u0008=\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008>\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008A\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008B\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008G\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010:\u001a\u0004\u0008H\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010:\u001a\u0004\u0008I\u0010\u0019\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
        "",
        "",
        "productId",
        "imageUrl",
        "title",
        "price",
        "salePrice",
        "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;",
        "tagType",
        "tagText",
        "Lcom/whoop/navigation/e;",
        "destination",
        "",
        "index",
        "analyticsValue",
        "color",
        "category",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;",
        "component7",
        "component8",
        "()Lcom/whoop/navigation/e;",
        "component9",
        "()Ljava/lang/Integer;",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
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
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getProductId",
        "getImageUrl",
        "getTitle",
        "getPrice",
        "getSalePrice",
        "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;",
        "getTagType",
        "getTagText",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Ljava/lang/Integer;",
        "getIndex",
        "getAnalyticsValue",
        "getColor",
        "getCategory",
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

.field public static final Companion:Lcom/whoop/nativestore/home/domain/model/ShopProductModel$a;


# instance fields
.field private final analyticsValue:Ljava/lang/String;

.field private final category:Ljava/lang/String;

.field private final color:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final imageUrl:Ljava/lang/String;

.field private final index:Ljava/lang/Integer;

.field private final price:Ljava/lang/String;

.field private final productId:Ljava/lang/String;

.field private final salePrice:Ljava/lang/String;

.field private final tagText:Ljava/lang/String;

.field private final tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->Companion:Lcom/whoop/nativestore/home/domain/model/ShopProductModel$a;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lrx0/f;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lrx0/f;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v3, 0xc

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

    aput-object v2, v3, v4

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v0, v3, v2

    const/16 v0, 0x8

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0x28f

    const/16 v0, 0x28f

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/nativestore/home/domain/model/ShopProductModel$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/ShopProductModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    :goto_2
    iput-object p9, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    iput-object p10, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    :goto_3
    iput-object p11, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p12, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    :goto_4
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p13, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsValue"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    .line 9
    iput-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    .line 11
    iput-object p9, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    .line 12
    iput-object p10, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x10

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_3

    move-object p9, v0

    :cond_3
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_4

    move-object p11, v0

    :cond_4
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_5

    move-object p13, v0

    :goto_0
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p13, p12

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p13}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;->Companion:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType$a;

    invoke-virtual {v0}, Lcom/whoop/nativestore/home/domain/model/ShopProductTagType$a;->serializer()Lwc3/c;

    move-result-object v0

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

    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/nativestore/home/domain/model/ShopProductModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/home/domain/model/ShopProductModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductModel;
    .locals 14

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsValue"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;

    move-object v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAnalyticsValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndex()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSalePrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getTagText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTagType()Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->productId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->imageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->price:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->salePrice:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagType:Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;

    iget-object v6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->tagText:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->destination:Lcom/whoop/navigation/e;

    iget-object v8, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->index:Ljava/lang/Integer;

    iget-object v9, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->analyticsValue:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->color:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->category:Ljava/lang/String;

    const-string v12, ", imageUrl="

    const-string v13, ", title="

    const-string v14, "ShopProductModel(productId="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", price="

    const-string v12, ", salePrice="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tagType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    const-string v2, ", index="

    invoke-static {v0, v6, v1, v7, v2}, Lq63/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    const-string v1, ", analyticsValue="

    const-string v2, ", color="

    invoke-static {v8, v1, v9, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", category="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
