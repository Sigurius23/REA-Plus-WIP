.class public final Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$$serializer;,
        Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000223B?\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008-\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008.\u0010\u001aR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001f\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "price",
        "salePrice",
        "color",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductRating;",
        "rating",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/nativestore/pdp/domain/model/ProductRating;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getPrice",
        "getSalePrice",
        "getColor",
        "Lcom/whoop/nativestore/pdp/domain/model/ProductRating;",
        "getRating",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$a;


# instance fields
.field private final color:Ljava/lang/String;

.field private final price:Ljava/lang/String;

.field private final rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

.field private final salePrice:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->Companion:Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel$a;

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

    invoke-direct/range {v0 .. v7}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const-string v0, ""

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    .line 9
    const-string v0, ""

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

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

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;ILjava/lang/Object;)Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/nativestore/pdp/domain/model/ProductRating$$serializer;->INSTANCE:Lcom/whoop/nativestore/pdp/domain/model/ProductRating$$serializer;

    iget-object p0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/nativestore/pdp/domain/model/ProductRating;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;
    .locals 7

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/ProductRating;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    iget-object p1, p1, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final getRating()Lcom/whoop/nativestore/pdp/domain/model/ProductRating;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    return-object v0
.end method

.method public final getSalePrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/nativestore/pdp/domain/model/ProductRating;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->price:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->salePrice:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->color:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionHeaderModel;->rating:Lcom/whoop/nativestore/pdp/domain/model/ProductRating;

    const-string v5, ", price="

    const-string v6, ", salePrice="

    const-string v7, "ProductDescriptionHeaderModel(title="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", color="

    const-string v5, ", rating="

    invoke-static {v0, v2, v1, v3, v5}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
