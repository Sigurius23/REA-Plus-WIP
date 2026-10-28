.class public final Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBK\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JF\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u00081\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
        "",
        "",
        "label",
        "",
        "position",
        "subLabel",
        "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;",
        "style",
        "Lgz0/m0;",
        "icon",
        "<init>",
        "(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;",
        "component5",
        "()Lgz0/m0;",
        "copy",
        "(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLabel",
        "D",
        "getPosition",
        "getSubLabel",
        "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;",
        "getStyle",
        "Lgz0/m0;",
        "getIcon",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$Companion;


# instance fields
.field private final icon:Lgz0/m0;

.field private final label:Ljava/lang/String;

.field private final position:D

.field private final style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

.field private final subLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->Companion:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lj02/w;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lj02/w;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lj02/w;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lj02/w;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v1, 0x3

    aput-object v2, v3, v1

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;-><init>(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    if-nez p8, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    goto :goto_0

    :cond_1
    iput-wide p3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 5
    sget-object p2, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    return-void

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    .line 9
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    .line 10
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    .line 12
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 13
    const-string p1, ""

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 14
    sget-object p5, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    move-object p8, v0

    move-object p6, p4

    move-object p7, p5

    :goto_0
    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    goto :goto_1

    :cond_4
    move-object p8, p6

    move-object p7, p5

    move-object p6, p4

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p2 .. p8}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;-><init>(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plane.axis.label.AxisLabelStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;->values()[Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    :cond_4
    move-object p7, p5

    move-object p8, p6

    move-object p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->copy(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    return-object v0
.end method

.method public final component5()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;
    .locals 8

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;-><init>(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getPosition()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    return-wide v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    return-object v0
.end method

.method public final getSubLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->label:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->position:D

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->subLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->style:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->icon:Lgz0/m0;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AxisLabelModel(label="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", position="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", subLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
