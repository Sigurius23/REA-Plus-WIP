.class public final Lcom/whoop/design/models/items/ArticleTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ArticleTileModel$$serializer;,
        Lcom/whoop/design/models/items/ArticleTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 d2\u00020\u0001:\u0002edB\u00a7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00bb\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u00c6\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010 J\u0010\u00109\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010>\u001a\u00020=2\u0008\u0010<\u001a\u0004\u0018\u00010;H\u00d6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001\u00a2\u0006\u0004\u0008F\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010I\u001a\u0004\u0008J\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010I\u001a\u0004\u0008K\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010I\u001a\u0004\u0008L\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010I\u001a\u0004\u0008M\u0010 R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010N\u001a\u0004\u0008O\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010I\u001a\u0004\u0008P\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010I\u001a\u0004\u0008Q\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010I\u001a\u0004\u0008R\u0010 R\"\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010I\u0012\u0004\u0008T\u0010U\u001a\u0004\u0008S\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008V\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010I\u001a\u0004\u0008W\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010X\u001a\u0004\u0008Y\u0010-R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010Z\u001a\u0004\u0008[\u0010/\"\u0004\u0008\\\u0010]R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010^\u001a\u0004\u0008_\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010`\u001a\u0004\u0008a\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010b\u001a\u0004\u0008c\u00105\u00a8\u0006f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ArticleTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "subText",
        "imageUrl",
        "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;",
        "type",
        "size",
        "icon",
        "paragraph",
        "publishDate",
        "tag",
        "articleUrl",
        "Lcom/whoop/design/models/items/ArticleTileModelEventEnum;",
        "cta",
        "",
        "index",
        "Lcom/whoop/design/models/items/TileBorderStyle;",
        "borderStyle",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/design/models/items/ArticleTileModelEventEnum;",
        "component13",
        "()Ljava/lang/Integer;",
        "component14",
        "()Lcom/whoop/design/models/items/TileBorderStyle;",
        "component15",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component16",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ArticleTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getSubText",
        "getImageUrl",
        "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;",
        "getType",
        "getSize",
        "getIcon",
        "getParagraph",
        "getPublishDate",
        "getPublishDate$annotations",
        "()V",
        "getTag",
        "getArticleUrl",
        "Lcom/whoop/design/models/items/ArticleTileModelEventEnum;",
        "getCta",
        "Ljava/lang/Integer;",
        "getIndex",
        "setIndex",
        "(Ljava/lang/Integer;)V",
        "Lcom/whoop/design/models/items/TileBorderStyle;",
        "getBorderStyle",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getGenericInteraction",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
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

.field public static final Companion:Lcom/whoop/design/models/items/ArticleTileModel$Companion;


# instance fields
.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final articleUrl:Ljava/lang/String;

.field private final borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

.field private final cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

.field private final genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final icon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private index:Ljava/lang/Integer;

.field private final paragraph:Ljava/lang/String;

.field private final publishDate:Ljava/lang/String;

.field private final size:Ljava/lang/String;

.field private final subText:Ljava/lang/String;

.field private final tag:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/items/ArticleTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ArticleTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ArticleTileModel;->Companion:Lcom/whoop/design/models/items/ArticleTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ArticleTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lw91/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lw91/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/a;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lw91/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x10

    new-array v7, v7, [Ll83/h;

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v4, 0x3

    aput-object v1, v7, v4

    const/4 v4, 0x4

    aput-object v3, v7, v4

    const/4 v3, 0x5

    aput-object v1, v7, v3

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v1, v7, v3

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v1, v7, v0

    const/16 v0, 0xa

    aput-object v1, v7, v0

    const/16 v0, 0xb

    aput-object v5, v7, v0

    const/16 v0, 0xc

    aput-object v1, v7, v0

    const/16 v0, 0xd

    aput-object v2, v7, v0

    const/16 v0, 0xe

    aput-object v1, v7, v0

    const/16 v0, 0xf

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/design/models/items/ArticleTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0xffb

    const/16 v1, 0xffb

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/ArticleTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    :goto_0
    iput-object p5, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    iput-object p7, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    :goto_1
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    goto :goto_2

    :cond_3
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    :goto_2
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_3

    :cond_4
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_3
    const p2, 0x8000

    and-int/2addr p1, p2

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void

    :cond_5
    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1

    move-object/from16 v16, v2

    goto :goto_1

    :cond_1
    move-object/from16 v16, p13

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_2

    move-object/from16 v17, v2

    goto :goto_2

    :cond_2
    move-object/from16 v17, p14

    :goto_2
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_3

    move-object/from16 v18, v2

    goto :goto_3

    :cond_3
    move-object/from16 v18, p15

    :goto_3
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    move-object/from16 v19, v2

    :goto_4
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    goto :goto_5

    :cond_4
    move-object/from16 v19, p16

    goto :goto_4

    .line 19
    :goto_5
    invoke-direct/range {v3 .. v19}, Lcom/whoop/design/models/items/ArticleTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ArticleTileTypeDtoEnum"

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->values()[Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ArticleTileModelEventEnum"

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileModelEventEnum;->values()[Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.TileBorderStyle"

    invoke-static {}, Lcom/whoop/design/models/items/TileBorderStyle;->values()[Lcom/whoop/design/models/items/TileBorderStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ArticleTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/ArticleTileModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/design/models/items/ArticleTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getPublishDate$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ArticleTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/ArticleTileModelEventEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/items/TileBorderStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    return-object v0
.end method

.method public final component15()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component16()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModel;
    .locals 18

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ArticleTileModel;

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/design/models/items/ArticleTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ArticleTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getArticleUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBorderStyle()Lcom/whoop/design/models/items/TileBorderStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    return-object v0
.end method

.method public final getCta()Lcom/whoop/design/models/items/ArticleTileModelEventEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    return-object v0
.end method

.method public final getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getIndex()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getParagraph()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    return v0
.end method

.method public final setIndex(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/ArticleTileModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/ArticleTileModel;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/ArticleTileModel;->subText:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/ArticleTileModel;->imageUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/ArticleTileModel;->type:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    iget-object v6, v0, Lcom/whoop/design/models/items/ArticleTileModel;->size:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/ArticleTileModel;->icon:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/ArticleTileModel;->paragraph:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/ArticleTileModel;->publishDate:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/ArticleTileModel;->tag:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/ArticleTileModel;->articleUrl:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/design/models/items/ArticleTileModel;->cta:Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    iget-object v13, v0, Lcom/whoop/design/models/items/ArticleTileModel;->index:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/whoop/design/models/items/ArticleTileModel;->borderStyle:Lcom/whoop/design/models/items/TileBorderStyle;

    iget-object v15, v0, Lcom/whoop/design/models/items/ArticleTileModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/ArticleTileModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    const-string v0, ", title="

    move-object/from16 v17, v15

    const-string v15, ", subText="

    move-object/from16 v18, v14

    const-string v14, "ArticleTileModel(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl="

    const-string v2, ", type="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paragraph="

    const-string v2, ", publishDate="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", tag="

    const-string v2, ", articleUrl="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", genericInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
