.class public final Lcom/whoop/design/models/tiles/OfferBannerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/tiles/OfferBannerModel$$serializer;,
        Lcom/whoop/design/models/tiles/OfferBannerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0081\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0083\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u008c\u0001\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020\n2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010:\u0012\u0004\u0008<\u0010=\u001a\u0004\u0008;\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010>\u001a\u0004\u0008?\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008@\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008A\u0010\u0019R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010>\u001a\u0004\u0008B\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008C\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010D\u001a\u0004\u0008E\u0010!R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010F\u001a\u0004\u0008G\u0010#R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008I\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010J\u0012\u0004\u0008L\u0010=\u001a\u0004\u0008K\u0010\'\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/design/models/tiles/OfferBannerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "offerId",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "markdownTitle",
        "borderStyle",
        "subtitle",
        "leadingIcon",
        "",
        "showChevron",
        "showHighlight",
        "",
        "timerMetadata",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Z",
        "component8",
        "()Ljava/lang/Boolean;",
        "component9",
        "()Ljava/util/List;",
        "component10",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/tiles/OfferBannerModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/tiles/OfferBannerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getOfferId",
        "getOfferId$annotations",
        "()V",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getMarkdownTitle",
        "getBorderStyle",
        "getSubtitle",
        "getLeadingIcon",
        "Z",
        "getShowChevron",
        "Ljava/lang/Boolean;",
        "getShowHighlight",
        "Ljava/util/List;",
        "getTimerMetadata",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
        "getNavigation$annotations",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/tiles/OfferBannerModel$Companion;


# instance fields
.field private final borderStyle:Ljava/lang/String;

.field private final leadingIcon:Ljava/lang/String;

.field private final markdownTitle:Ljava/lang/String;

.field private final navigation:Lcom/whoop/navigation/e;

.field private final offerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final showChevron:Z

.field private final showHighlight:Ljava/lang/Boolean;

.field private final subtitle:Lcom/whoop/design/util/TextResource;

.field private final timerMetadata:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/tiles/OfferBannerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/tiles/OfferBannerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/tiles/OfferBannerModel;->Companion:Lcom/whoop/design/models/tiles/OfferBannerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/tiles/OfferBannerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lf1/z1;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lf1/z1;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xa

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v1, v5, v7

    const/4 v7, 0x3

    aput-object v1, v5, v7

    const/4 v7, 0x4

    aput-object v1, v5, v7

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/4 v4, 0x7

    aput-object v1, v5, v4

    aput-object v3, v5, v0

    const/16 v0, 0x9

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/design/models/tiles/OfferBannerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x40

    const/16 v0, 0x40

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/design/models/tiles/OfferBannerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/tiles/OfferBannerModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/design/models/tiles/OfferBannerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const/4 v0, 0x0

    if-nez p12, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p4, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_5
    iput-object p6, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p7, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    :goto_5
    iput-boolean p8, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    :goto_7
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    return-void

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_7

    move-object p9, v0

    :cond_7
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_8

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/tiles/OfferBannerModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

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

    invoke-static {}, Lcom/whoop/design/models/tiles/OfferBannerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/tiles/OfferBannerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/tiles/OfferBannerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/tiles/OfferBannerModel;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/tiles/OfferBannerModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/tiles/OfferBannerModel;->copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/tiles/OfferBannerModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getNavigation$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getOfferId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/tiles/OfferBannerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/tiles/OfferBannerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_11

    :goto_8
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    return v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/tiles/OfferBannerModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/design/models/tiles/OfferBannerModel;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/design/models/tiles/OfferBannerModel;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/tiles/OfferBannerModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/util/List;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/tiles/OfferBannerModel;

    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBorderStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeadingIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getMarkdownTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getOfferId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowChevron()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    return v0
.end method

.method public final getShowHighlight()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTimerMetadata()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->offerId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->markdownTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->borderStyle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->leadingIcon:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showChevron:Z

    iget-object v7, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->showHighlight:Ljava/lang/Boolean;

    iget-object v8, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->timerMetadata:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/design/models/tiles/OfferBannerModel;->navigation:Lcom/whoop/navigation/e;

    const-string v10, ", title="

    const-string v11, ", markdownTitle="

    const-string v12, "OfferBannerModel(offerId="

    invoke-static {v12, v0, v10, v1, v11}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", borderStyle="

    const-string v10, ", subtitle="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", leadingIcon="

    const-string v2, ", showChevron="

    invoke-static {v0, v4, v1, v5, v2}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", showHighlight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timerMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
