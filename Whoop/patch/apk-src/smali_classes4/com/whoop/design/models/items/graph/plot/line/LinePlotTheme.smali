.class public final Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBM\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JL\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00085\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010#\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "",
        "Ly81/f;",
        "strokeColor",
        "Lcom/whoop/design/models/items/graph/plot/line/LineWidth;",
        "strokeWidth",
        "Lcom/whoop/design/models/items/graph/plot/line/DashPattern;",
        "dashPattern",
        "fillColor",
        "Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;",
        "fillOpacity",
        "<init>",
        "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILy81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ly81/f;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;",
        "copy",
        "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ly81/f;",
        "getStrokeColor",
        "Lcom/whoop/design/models/items/graph/plot/line/LineWidth;",
        "getStrokeWidth",
        "Lcom/whoop/design/models/items/graph/plot/line/DashPattern;",
        "getDashPattern",
        "getFillColor",
        "Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;",
        "getFillOpacity",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$Companion;


# instance fields
.field private final dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

.field private final fillColor:Ly81/f;

.field private final fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

.field private final strokeColor:Ly81/f;

.field private final strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->Companion:Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lqa1/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    new-instance v3, Lqa1/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lqa1/a;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lqa1/a;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lqa1/a;

    const/4 v10, 0x4

    invoke-direct {v9, v10}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v9, 0x5

    new-array v9, v9, [Ll83/h;

    aput-object v1, v9, v2

    aput-object v3, v9, v4

    aput-object v5, v9, v6

    aput-object v7, v9, v8

    aput-object v0, v9, v10

    sput-object v9, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->$childSerializers:[Ll83/h;

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

    invoke-direct/range {v0 .. v7}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILy81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    return-void
.end method

.method public constructor <init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    .line 6
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    .line 7
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    .line 8
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    return-void
.end method

.method public synthetic constructor <init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

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

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.LineWidth"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LineWidth;->values()[Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.DashPattern"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/DashPattern;->values()[Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.FillOpacity"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;->values()[Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->copy(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    return-object v0
.end method

.method public final component4()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    return-object v0
.end method

.method public final copy(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDashPattern()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    return-object v0
.end method

.method public final getFillColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    return-object v0
.end method

.method public final getFillOpacity()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    return-object v0
.end method

.method public final getStrokeColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    return-object v0
.end method

.method public final getStrokeWidth()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeColor:Ly81/f;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->strokeWidth:Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->dashPattern:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillColor:Ly81/f;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->fillOpacity:Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "LinePlotTheme(strokeColor="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strokeWidth="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dashPattern="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillOpacity="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
