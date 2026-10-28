.class public final Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCBY\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bm\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0010\u0010&\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,Jr\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010!J\u0010\u00100\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u00089\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u0008:\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u0008;\u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008=\u0010\'R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008>\u0010\'R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010?\u001a\u0004\u0008@\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010A\u001a\u0004\u0008B\u0010,\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;",
        "",
        "",
        "activityId",
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
        "cta",
        "topLabel",
        "topIconUrl",
        "",
        "positionX",
        "positionY",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "overlayLabelCtaContent",
        "Lgz0/m0;",
        "secondaryIcon",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
        "component3",
        "component4",
        "component5",
        "()F",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lgz0/m0;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getActivityId",
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
        "getCta",
        "getTopLabel",
        "getTopIconUrl",
        "F",
        "getPositionX",
        "getPositionY",
        "Ljava/util/List;",
        "getOverlayLabelCtaContent",
        "Lgz0/m0;",
        "getSecondaryIcon",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$Companion;


# instance fields
.field private final activityId:Ljava/lang/String;

.field private final cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field private final overlayLabelCtaContent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final positionX:F

.field private final positionY:F

.field private final secondaryIcon:Lgz0/m0;

.field private final topIconUrl:Ljava/lang/String;

.field private final topLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->Companion:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lma1/a;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lma1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lma1/a;

    const/16 v5, 0x1b

    invoke-direct {v4, v5}, Lma1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lma1/a;

    const/16 v6, 0x1c

    invoke-direct {v5, v6}, Lma1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v3, v0, v5

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v1, 0x6

    aput-object v4, v0, v1

    const/4 v1, 0x7

    aput-object v2, v0, v1

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    iput p6, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    iput p7, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FF",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lgz0/m0;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    .line 7
    iput p5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    .line 8
    iput p6, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.overlay.OverlayCta"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x5

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "FF",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lgz0/m0;",
            ")",
            "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    iget v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    iget v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getActivityId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCta()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    return-object v0
.end method

.method public final getOverlayLabelCtaContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    return-object v0
.end method

.method public final getPositionX()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    return v0
.end method

.method public final getPositionY()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    return v0
.end method

.method public final getSecondaryIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    return-object v0
.end method

.method public final getTopIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTopLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->activityId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->cta:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->topIconUrl:Ljava/lang/String;

    iget v4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionX:F

    iget v5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->positionY:F

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->overlayLabelCtaContent:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;->secondaryIcon:Lgz0/m0;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "OverlayLabel(activityId="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", topLabel="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", topIconUrl="

    const-string v1, ", positionX="

    invoke-static {v8, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", positionY="

    const-string v1, ", overlayLabelCtaContent="

    invoke-static {v8, v4, v0, v5, v1}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryIcon="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
