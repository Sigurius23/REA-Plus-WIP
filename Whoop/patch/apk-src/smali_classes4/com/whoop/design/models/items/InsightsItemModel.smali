.class public final Lcom/whoop/design/models/items/InsightsItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/InsightsItemModel$$serializer;,
        Lcom/whoop/design/models/items/InsightsItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u00a7\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010\u001eJ\u00b0\u0001\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00109\u001a\u0002082\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:J\'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001\u00a2\u0006\u0004\u0008A\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010D\u001a\u0004\u0008E\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010F\u001a\u0004\u0008G\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010D\u001a\u0004\u0008H\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010D\u001a\u0004\u0008I\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010D\u001a\u0004\u0008J\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010D\u001a\u0004\u0008K\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010D\u001a\u0004\u0008L\u0010\u001eR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010M\u001a\u0004\u0008N\u0010\'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010O\u001a\u0004\u0008P\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010D\u001a\u0004\u0008Q\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010R\u0012\u0004\u0008T\u0010U\u001a\u0004\u0008S\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010D\u001a\u0004\u0008V\u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010W\u001a\u0004\u0008X\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010D\u001a\u0004\u0008Y\u0010\u001e\u00a8\u0006\\"
    }
    d2 = {
        "Lcom/whoop/design/models/items/InsightsItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "trend",
        "title",
        "titleColor",
        "titleStyle",
        "description",
        "actionRecommendation",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "callout",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "actionButton",
        "rightIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "textAlignment",
        "Lcom/whoop/design/models/items/ExpandableContentModel;",
        "expandableContent",
        "iconStyle",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/ImpactModel;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component9",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component10",
        "component11",
        "()Lcom/whoop/navigation/e;",
        "component12",
        "component13",
        "()Lcom/whoop/design/models/items/ExpandableContentModel;",
        "component14",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)Lcom/whoop/design/models/items/InsightsItemModel;",
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
        "(Lcom/whoop/design/models/items/InsightsItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "getTrend",
        "getTitle",
        "getTitleColor",
        "getTitleStyle",
        "getDescription",
        "getActionRecommendation",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getCallout",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getActionButton",
        "getRightIcon",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "getTextAlignment",
        "Lcom/whoop/design/models/items/ExpandableContentModel;",
        "getExpandableContent",
        "getIconStyle",
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

.field public static final Companion:Lcom/whoop/design/models/items/InsightsItemModel$Companion;


# instance fields
.field private final actionButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final actionRecommendation:Ljava/lang/String;

.field private final callout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final description:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

.field private final iconStyle:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final rightIcon:Ljava/lang/String;

.field private final textAlignment:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleColor:Ljava/lang/String;

.field private final titleStyle:Ljava/lang/String;

.field private final trend:Lcom/whoop/design/models/items/ImpactModel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/InsightsItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/InsightsItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/InsightsItemModel;->Companion:Lcom/whoop/design/models/items/InsightsItemModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/InsightsItemModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/f;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lw91/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xe

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

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v2, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/InsightsItemModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x7e7

    const/16 v1, 0x7e7

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/InsightsItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/InsightsItemModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/InsightsItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iput-object p4, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    :goto_1
    iput-object p7, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iput-object p10, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p11, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p13, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    goto :goto_3

    :cond_4
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    :goto_3
    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    return-void

    :cond_5
    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trend"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_2

    move-object v15, v2

    goto :goto_2

    :cond_2
    move-object/from16 v15, p12

    :goto_2
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_3

    move-object/from16 v16, v2

    goto :goto_3

    :cond_3
    move-object/from16 v16, p13

    :goto_3
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_4

    move-object/from16 v17, v2

    :goto_4
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    goto :goto_5

    :cond_4
    move-object/from16 v17, p14

    goto :goto_4

    .line 17
    :goto_5
    invoke-direct/range {v3 .. v17}, Lcom/whoop/design/models/items/InsightsItemModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)V

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

    invoke-static {}, Lcom/whoop/design/models/items/InsightsItemModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/InsightsItemModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/InsightsItemModel;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/InsightsItemModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

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
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/items/InsightsItemModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)Lcom/whoop/design/models/items/InsightsItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/InsightsItemModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/InsightsItemModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v4, 0x7

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/16 v4, 0x8

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/items/ExpandableContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ExpandableContentModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    invoke-interface {p1, p2, v0, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    iget-object p0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/ExpandableContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)Lcom/whoop/design/models/items/InsightsItemModel;
    .locals 16

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trend"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/InsightsItemModel;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/InsightsItemModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/InsightsItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/InsightsItemModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getActionButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getActionRecommendation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    return-object v0
.end method

.method public final getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getExpandableContent()Lcom/whoop/design/models/items/ExpandableContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    return-object v0
.end method

.method public final getIconStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextAlignment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrend()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImpactModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ExpandableContentModel;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/InsightsItemModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/InsightsItemModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, v0, Lcom/whoop/design/models/items/InsightsItemModel;->title:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/InsightsItemModel;->titleColor:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/InsightsItemModel;->titleStyle:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/InsightsItemModel;->description:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/InsightsItemModel;->actionRecommendation:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/InsightsItemModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v9, v0, Lcom/whoop/design/models/items/InsightsItemModel;->actionButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v10, v0, Lcom/whoop/design/models/items/InsightsItemModel;->rightIcon:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/InsightsItemModel;->destination:Lcom/whoop/navigation/e;

    iget-object v12, v0, Lcom/whoop/design/models/items/InsightsItemModel;->textAlignment:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/items/InsightsItemModel;->expandableContent:Lcom/whoop/design/models/items/ExpandableContentModel;

    iget-object v14, v0, Lcom/whoop/design/models/items/InsightsItemModel;->iconStyle:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "InsightsItemModel(id="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", trend="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    const-string v1, ", titleStyle="

    invoke-static {v15, v3, v0, v4, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", description="

    const-string v1, ", actionRecommendation="

    invoke-static {v15, v5, v0, v6, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", callout="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionButton="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rightIcon="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textAlignment="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", expandableContent="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconStyle="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
