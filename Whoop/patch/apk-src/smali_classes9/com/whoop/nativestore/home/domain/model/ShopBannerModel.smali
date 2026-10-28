.class public final Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$$serializer;,
        Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:;BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rBa\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ^\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0010\u0010(\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00083\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u00088\u0010\u001c\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "subCopy",
        "ctaText",
        "backgroundMedia",
        "Lcom/whoop/navigation/e;",
        "destination",
        "",
        "index",
        "analyticsValue",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$native_store_release",
        "(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/e;",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;",
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
        "getSubCopy",
        "getCtaText",
        "getBackgroundMedia",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Ljava/lang/Integer;",
        "getIndex",
        "getAnalyticsValue",
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

.field public static final Companion:Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$a;


# instance fields
.field private final analyticsValue:Ljava/lang/String;

.field private final backgroundMedia:Ljava/lang/String;

.field private final ctaText:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final index:Ljava/lang/Integer;

.field private final subCopy:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->Companion:Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$a;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lrx0/f;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v0, v2, v3

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$$serializer;->INSTANCE:Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const-string p9, ""

    if-nez p2, :cond_1

    iput-object p9, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p9, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subCopy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    .line 8
    iput-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    .line 10
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$native_store_release(Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;
    .locals 9

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subCopy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalyticsValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundMedia()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getIndex()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSubCopy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->subCopy:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->ctaText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->backgroundMedia:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->destination:Lcom/whoop/navigation/e;

    iget-object v5, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->index:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->analyticsValue:Ljava/lang/String;

    const-string v7, ", subCopy="

    const-string v8, ", ctaText="

    const-string v9, "ShopBannerModel(title="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", backgroundMedia="

    const-string v7, ", destination="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
