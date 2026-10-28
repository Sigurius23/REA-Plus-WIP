.class public final Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$$serializer;,
        Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=>BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eBm\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"Jb\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010/\u0012\u0004\u00081\u00102\u001a\u0004\u00080\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010/\u0012\u0004\u00084\u00102\u001a\u0004\u00083\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010/\u0012\u0004\u00086\u00102\u001a\u0004\u00085\u0010\u001eR \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010\"R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00089\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010/\u001a\u0004\u0008:\u0010\u001eR \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008;\u0010\"\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;",
        "",
        "",
        "title",
        "aboutTitle",
        "aboutImageUrl",
        "",
        "Lcom/whoop/labrador/feature/about/domain/models/InformationItem;",
        "informationItems",
        "manufacturerLabel",
        "manufacturerAddress",
        "Lcom/whoop/labrador/feature/about/domain/models/TileItem;",
        "tileItems",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$labrador_release",
        "(Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getAboutTitle",
        "getAboutTitle$annotations",
        "getAboutImageUrl",
        "getAboutImageUrl$annotations",
        "Ljava/util/List;",
        "getInformationItems",
        "getManufacturerLabel",
        "getManufacturerAddress",
        "getTileItems",
        "Companion",
        "$serializer",
        "a",
        "labrador_release"
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

.field public static final Companion:Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$a;


# instance fields
.field private final aboutImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "about_ecg_image_url"
    .end annotation
.end field

.field private final aboutTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "about_ecg_title"
    .end annotation
.end field

.field private final informationItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "information_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/InformationItem;",
            ">;"
        }
    .end annotation
.end field

.field private final manufacturerAddress:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manufacturer_address"
    .end annotation
.end field

.field private final manufacturerLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manufacturer_label"
    .end annotation
.end field

.field private final tileItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tile_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/TileItem;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "page_title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->Companion:Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lzi1/e0;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lzi1/e0;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lzi1/e0;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lzi1/e0;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v1, 0x6

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/InformationItem;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/TileItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboutTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboutImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "informationItems"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manufacturerLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manufacturerAddress"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileItems"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/labrador/feature/about/domain/models/InformationItem$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/about/domain/models/InformationItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/labrador/feature/about/domain/models/TileItem$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/about/domain/models/TileItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAboutImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "about_ecg_image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getAboutTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "about_ecg_title"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "page_title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$labrador_release(Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/InformationItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/TileItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/InformationItem;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/TileItem;",
            ">;)",
            "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboutTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboutImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "informationItems"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manufacturerLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manufacturerAddress"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileItems"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;

    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAboutImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getAboutTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getInformationItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/InformationItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    return-object v0
.end method

.method public final getManufacturerAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getManufacturerLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTileItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/about/domain/models/TileItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->aboutImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->informationItems:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->manufacturerAddress:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;->tileItems:Ljava/util/List;

    const-string v7, ", aboutTitle="

    const-string v8, ", aboutImageUrl="

    const-string v9, "LabradorAboutResponse(title="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", informationItems="

    const-string v7, ", manufacturerLabel="

    invoke-static {v2, v1, v7, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", manufacturerAddress="

    const-string v2, ", tileItems="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
