.class public final Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$$serializer;,
        Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<=BO\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"JZ\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\"J\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00084\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00087\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u0008:\u0010\"\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;",
        "header",
        "",
        "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
        "products",
        "",
        "internalName",
        "analyticsValue",
        "Lcom/whoop/design/models/ContentType;",
        "backgroundContentType",
        "backgroundContentUrl",
        "<init>",
        "(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/ContentType;",
        "component6",
        "copy",
        "(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;",
        "getHeader",
        "Ljava/util/List;",
        "getProducts",
        "Ljava/lang/String;",
        "getInternalName",
        "getAnalyticsValue",
        "Lcom/whoop/design/models/ContentType;",
        "getBackgroundContentType",
        "getBackgroundContentUrl",
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

.field public static final Companion:Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$a;


# instance fields
.field private final analyticsValue:Ljava/lang/String;

.field private final backgroundContentType:Lcom/whoop/design/models/ContentType;

.field private final backgroundContentUrl:Ljava/lang/String;

.field private final header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

.field private final internalName:Ljava/lang/String;

.field private final products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->Companion:Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lrx0/f;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lrx0/f;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

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

    sput-object v3, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x20

    const/16 v0, 0x20

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    const/4 v0, 0x0

    if-nez p8, :cond_1

    iput-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_5

    .line 4
    sget-object p1, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    .line 5
    iput-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    goto :goto_4

    :cond_5
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    :goto_4
    iput-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ContentType;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundContentType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    .line 8
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    .line 12
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 13
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    .line 14
    sget-object p5, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    :cond_4
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 15
    invoke-direct/range {p1 .. p7}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;-><init>(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/nativestore/home/domain/model/ShopProductModel$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/ShopProductModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ContentType;->Companion:Lcom/whoop/design/models/ContentType$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/ContentType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->copy(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel$$serializer;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    sget-object v3, Lcom/whoop/design/models/ContentType;->IMAGE:Lcom/whoop/design/models/ContentType;

    if-eq v2, v3, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/ContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ContentType;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundContentType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;-><init>(Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ContentType;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAnalyticsValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundContentType()Lcom/whoop/design/models/ContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    return-object v0
.end method

.method public final getBackgroundContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    return-object v0
.end method

.method public final getInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/nativestore/home/domain/model/ShopProductModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->header:Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->products:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->internalName:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->analyticsValue:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentType:Lcom/whoop/design/models/ContentType;

    iget-object v5, p0, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->backgroundContentUrl:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ShopProductCarouselModel(header="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", products="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", internalName="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticsValue="

    const-string v1, ", backgroundContentType="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundContentUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
