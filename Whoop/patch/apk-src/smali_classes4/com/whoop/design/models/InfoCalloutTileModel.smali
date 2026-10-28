.class public final Lcom/whoop/design/models/InfoCalloutTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;,
        Lcom/whoop/design/models/InfoCalloutTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 l2\u00020\u0001:\u0002mlB\u00bd\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u00b9\u0001\u0008\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001d\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u001e\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u00c6\u0001\u0010?\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0004\u0008?\u0010@J\u0010\u0010A\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008A\u00104J\u0010\u0010B\u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008B\u0010CJ\u001a\u0010F\u001a\u00020\u000b2\u0008\u0010E\u001a\u0004\u0018\u00010DH\u00d6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001\u00a2\u0006\u0004\u0008N\u0010OR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010Q\u001a\u0004\u0008R\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010Q\u001a\u0004\u0008S\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010T\u001a\u0004\u0008U\u0010(R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010V\u001a\u0004\u0008W\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010X\u001a\u0004\u0008Y\u0010,R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010Z\u001a\u0004\u0008[\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\\\u001a\u0004\u0008]\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010^\u001a\u0004\u0008_\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010`\u001a\u0004\u0008a\u00104R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010b\u001a\u0004\u0008c\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010d\u001a\u0004\u0008e\u00108R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010f\u001a\u0004\u0008g\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010h\u001a\u0004\u0008i\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010j\u001a\u0004\u0008k\u0010>\u00a8\u0006n"
    }
    d2 = {
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "description",
        "Lb91/c;",
        "descriptionTypography",
        "Lcom/whoop/design/models/items/InfoCalloutStyle;",
        "style",
        "Lgz0/m0;",
        "icon",
        "",
        "useFallbackIcon",
        "Lcom/whoop/design/models/IconGradient;",
        "iconGradient",
        "Lcom/whoop/design/models/IconSize;",
        "iconSize",
        "",
        "componentDismissalId",
        "",
        "items",
        "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;",
        "itemsAlignment",
        "",
        "analyticsProperties",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "dismissAction",
        "Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;",
        "analyticEvents",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Lb91/c;",
        "component4",
        "()Lcom/whoop/design/models/items/InfoCalloutStyle;",
        "component5",
        "()Lgz0/m0;",
        "component6",
        "()Ljava/lang/Boolean;",
        "component7",
        "()Lcom/whoop/design/models/IconGradient;",
        "component8",
        "()Lcom/whoop/design/models/IconSize;",
        "component9",
        "()Ljava/lang/String;",
        "component10",
        "()Ljava/util/List;",
        "component11",
        "()Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;",
        "component12",
        "()Ljava/util/Map;",
        "component13",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component14",
        "()Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)Lcom/whoop/design/models/InfoCalloutTileModel;",
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
        "(Lcom/whoop/design/models/InfoCalloutTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getDescription",
        "Lb91/c;",
        "getDescriptionTypography",
        "Lcom/whoop/design/models/items/InfoCalloutStyle;",
        "getStyle",
        "Lgz0/m0;",
        "getIcon",
        "Ljava/lang/Boolean;",
        "getUseFallbackIcon",
        "Lcom/whoop/design/models/IconGradient;",
        "getIconGradient",
        "Lcom/whoop/design/models/IconSize;",
        "getIconSize",
        "Ljava/lang/String;",
        "getComponentDismissalId",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;",
        "getItemsAlignment",
        "Ljava/util/Map;",
        "getAnalyticsProperties",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getDismissAction",
        "Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;",
        "getAnalyticEvents",
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

.field public static final Companion:Lcom/whoop/design/models/InfoCalloutTileModel$Companion;


# instance fields
.field private final analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

.field private final analyticsProperties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final componentDismissalId:Ljava/lang/String;

.field private final description:Lcom/whoop/design/util/TextResource;

.field private final descriptionTypography:Lb91/c;

.field private final dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

.field private final icon:Lgz0/m0;

.field private final iconGradient:Lcom/whoop/design/models/IconGradient;

.field private final iconSize:Lcom/whoop/design/models/IconSize;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

.field private final style:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final useFallbackIcon:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Lcom/whoop/design/models/InfoCalloutTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/InfoCalloutTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/InfoCalloutTileModel;->Companion:Lcom/whoop/design/models/InfoCalloutTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/InfoCalloutTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/design/models/a;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lcom/whoop/design/models/a;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lcom/whoop/design/models/a;

    const/4 v8, 0x6

    invoke-direct {v7, v8}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lcom/whoop/design/models/a;

    const/4 v10, 0x7

    invoke-direct {v9, v10}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Lcom/whoop/design/models/a;

    invoke-direct {v11, v0}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v12, Lcom/whoop/design/models/a;

    const/16 v13, 0x9

    invoke-direct {v12, v13}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v12}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v12

    new-instance v14, Lcom/whoop/design/models/a;

    const/16 v15, 0xa

    invoke-direct {v14, v15}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v14}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v14

    move/from16 v16, v0

    new-instance v0, Lcom/whoop/design/models/a;

    move-object/from16 v17, v1

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    move/from16 v18, v1

    new-instance v1, Lcom/whoop/design/models/a;

    move/from16 v19, v4

    const/16 v4, 0xc

    invoke-direct {v1, v4}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    const/16 v2, 0xe

    new-array v2, v2, [Ll83/h;

    const/16 v20, 0x0

    aput-object v17, v2, v20

    const/16 v20, 0x1

    aput-object v17, v2, v20

    const/16 v20, 0x2

    aput-object v3, v2, v20

    const/4 v3, 0x3

    aput-object v5, v2, v3

    aput-object v7, v2, v19

    aput-object v17, v2, v6

    aput-object v9, v2, v8

    aput-object v11, v2, v10

    aput-object v17, v2, v16

    aput-object v12, v2, v13

    aput-object v14, v2, v15

    aput-object v0, v2, v18

    aput-object v1, v2, v4

    const/16 v0, 0xd

    aput-object v17, v2, v0

    sput-object v2, Lcom/whoop/design/models/InfoCalloutTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 17

    .line 1
    const/16 v15, 0x3fff

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v16}, Lcom/whoop/design/models/InfoCalloutTileModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 5
    sget-object p2, Lcom/whoop/design/models/items/InfoCalloutStyle;->NEUTRAL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    .line 7
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    goto :goto_b

    :cond_b
    iput-object p13, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    :goto_b
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_c

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_c
    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_d

    iput-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    return-void

    :cond_d
    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lb91/c;",
            "Lcom/whoop/design/models/items/InfoCalloutStyle;",
            "Lgz0/m0;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/IconGradient;",
            "Lcom/whoop/design/models/IconSize;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;",
            ")V"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    .line 11
    iput-object p2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    .line 12
    iput-object p3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    .line 13
    iput-object p4, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    .line 14
    iput-object p5, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    .line 15
    iput-object p6, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    .line 16
    iput-object p7, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    .line 17
    iput-object p8, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    .line 18
    iput-object p9, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    .line 19
    iput-object p10, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    .line 20
    iput-object p11, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    .line 21
    iput-object p12, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    .line 22
    iput-object p13, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    .line 23
    iput-object p14, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 24
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    .line 25
    sget-object v5, Lcom/whoop/design/models/items/InfoCalloutStyle;->NEUTRAL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    .line 26
    sget-object v11, Lm83/y;->w:Lm83/y;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    move-object v12, v2

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    move-object v13, v2

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    move-object/from16 p15, v2

    :goto_d
    move-object/from16 p1, p0

    move-object/from16 p2, v1

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

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    .line 27
    :goto_e
    invoke-direct/range {p1 .. p15}, Lcom/whoop/design/models/InfoCalloutTileModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.typography.WhoopTextStyle"

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.InfoCalloutStyle"

    invoke-static {}, Lcom/whoop/design/models/items/InfoCalloutStyle;->values()[Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.IconGradient"

    invoke-static {}, Lcom/whoop/design/models/IconGradient;->values()[Lcom/whoop/design/models/IconGradient;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.IconSize"

    invoke-static {}, Lcom/whoop/design/models/IconSize;->values()[Lcom/whoop/design/models/IconSize;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$4()Lwc3/c;
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

.method private static final synthetic _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.InfoCalloutTileItemsAlignment"

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;->values()[Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$6()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$7()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$6()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;ILjava/lang/Object;)Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/InfoCalloutTileModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$7()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/InfoCalloutTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/InfoCalloutTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v3, Lcom/whoop/design/models/items/InfoCalloutStyle;->NEUTRAL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :goto_9
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    if-eqz v2, :cond_15

    :goto_a
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    if-eqz v2, :cond_17

    :goto_b
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v2, :cond_19

    :goto_c
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    if-eqz v1, :cond_1b

    :goto_d
    sget-object v1, Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/InfoCalloutStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    return-object v0
.end method

.method public final component5()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/IconGradient;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/IconSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lb91/c;",
            "Lcom/whoop/design/models/items/InfoCalloutStyle;",
            "Lgz0/m0;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/design/models/IconGradient;",
            "Lcom/whoop/design/models/IconSize;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;",
            ")",
            "Lcom/whoop/design/models/InfoCalloutTileModel;"
        }
    .end annotation

    const-string v0, "description"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/InfoCalloutTileModel;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/InfoCalloutTileModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    iget-object p1, p1, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getAnalyticEvents()Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    return-object v0
.end method

.method public final getAnalyticsProperties()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    return-object v0
.end method

.method public final getComponentDismissalId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDescriptionTypography()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    return-object v0
.end method

.method public final getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getIconGradient()Lcom/whoop/design/models/IconGradient;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    return-object v0
.end method

.method public final getIconSize()Lcom/whoop/design/models/IconSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getItemsAlignment()Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/InfoCalloutStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getUseFallbackIcon()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_8
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    if-nez v0, :cond_9

    move v0, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_9
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v0, :cond_a

    move v0, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_a
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    if-nez v0, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v0}, Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->description:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->descriptionTypography:Lb91/c;

    iget-object v4, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->style:Lcom/whoop/design/models/items/InfoCalloutStyle;

    iget-object v5, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->icon:Lgz0/m0;

    iget-object v6, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->useFallbackIcon:Ljava/lang/Boolean;

    iget-object v7, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconGradient:Lcom/whoop/design/models/IconGradient;

    iget-object v8, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->iconSize:Lcom/whoop/design/models/IconSize;

    iget-object v9, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->componentDismissalId:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->items:Ljava/util/List;

    iget-object v11, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->itemsAlignment:Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    iget-object v12, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticsProperties:Ljava/util/Map;

    iget-object v13, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v14, v0, Lcom/whoop/design/models/InfoCalloutTileModel;->analyticEvents:Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    const-string v15, ", description="

    const-string v0, ", descriptionTypography="

    move-object/from16 v16, v14

    const-string v14, "InfoCalloutTileModel(title="

    invoke-static {v14, v1, v15, v2, v0}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", useFallbackIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconGradient="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", componentDismissalId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    const-string v2, ", itemsAlignment="

    invoke-static {v9, v1, v2, v0, v10}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticsProperties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
