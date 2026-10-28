.class public final Lcom/whoop/design/models/items/graph/GraphModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/GraphModel$$serializer;,
        Lcom/whoop/design/models/items/graph/GraphModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBS\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JL\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\"J\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00084\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008:\u0010&\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "plane",
        "",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
        "plots",
        "",
        "graphTitleDisplay",
        "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
        "graphButtons",
        "Lcom/whoop/design/models/items/graph/LayoutDirection;",
        "layoutDirection",
        "<init>",
        "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
        "component5",
        "()Lcom/whoop/design/models/items/graph/LayoutDirection;",
        "copy",
        "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)Lcom/whoop/design/models/items/graph/GraphModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "getPlane",
        "Ljava/util/List;",
        "getPlots",
        "Ljava/lang/String;",
        "getGraphTitleDisplay",
        "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
        "getGraphButtons",
        "Lcom/whoop/design/models/items/graph/LayoutDirection;",
        "getLayoutDirection",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/GraphModel$Companion;


# instance fields
.field private final graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

.field private final graphTitleDisplay:Ljava/lang/String;

.field private final layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

.field private final plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

.field private final plots:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/GraphModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/GraphModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/GraphModel;->Companion:Lcom/whoop/design/models/items/graph/GraphModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/GraphModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lep0/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lep0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lep0/a;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lep0/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/design/models/items/graph/GraphModel;->$childSerializers:[Ll83/h;

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

    invoke-direct/range {v0 .. v7}, Lcom/whoop/design/models/items/graph/GraphModel;-><init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 3
    new-instance v1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;-><init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    goto :goto_3

    :cond_3
    move-object/from16 p2, p5

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    .line 7
    sget-object p1, Lcom/whoop/design/models/items/graph/LayoutDirection;->LEFT_TO_RIGHT:Lcom/whoop/design/models/items/graph/LayoutDirection;

    .line 8
    :goto_4
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    return-void

    :cond_4
    move-object/from16 p1, p6

    goto :goto_4
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
            "Lcom/whoop/design/models/items/graph/LayoutDirection;",
            ")V"
        }
    .end annotation

    const-string v0, "plane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plots"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    .line 11
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    .line 12
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    .line 13
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    .line 14
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    .line 15
    new-instance v1, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;-><init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v1

    :cond_0
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_1

    .line 16
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 v0, p6, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 v0, p6, 0x10

    if-eqz v0, :cond_4

    .line 17
    sget-object v0, Lcom/whoop/design/models/items/graph/LayoutDirection;->LEFT_TO_RIGHT:Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-object/from16 p6, v0

    :goto_0
    move-object/from16 p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object/from16 p6, p5

    goto :goto_0

    .line 18
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/design/models/items/graph/GraphModel;-><init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lo91/e;->a:Lo91/e;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/LayoutDirection;->Companion:Lcom/whoop/design/models/items/graph/LayoutDirection$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/LayoutDirection$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/GraphModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/graph/GraphModel;->copy(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/GraphModel;Lzc3/c;Lyc3/g;)V
    .locals 13

    sget-object v0, Lcom/whoop/design/models/items/graph/GraphModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    new-instance v3, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;-><init>(Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/items/graph/plane/button/GraphButtons$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    sget-object v3, Lcom/whoop/design/models/items/graph/LayoutDirection;->LEFT_TO_RIGHT:Lcom/whoop/design/models/items/graph/LayoutDirection;

    if-eq v2, v3, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/graph/LayoutDirection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
            "Lcom/whoop/design/models/items/graph/LayoutDirection;",
            ")",
            "Lcom/whoop/design/models/items/graph/GraphModel;"
        }
    .end annotation

    const-string v0, "plane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plots"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/GraphModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/graph/GraphModel;-><init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getGraphButtons()Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    return-object v0
.end method

.method public final getGraphTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLayoutDirection()Lcom/whoop/design/models/items/graph/LayoutDirection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    return-object v0
.end method

.method public final getPlane()Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    return-object v0
.end method

.method public final getPlots()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/GraphPlot;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plane:Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphModel;->plots:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphTitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphModel;->graphButtons:Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/GraphModel;->layoutDirection:Lcom/whoop/design/models/items/graph/LayoutDirection;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "GraphModel(plane="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", plots="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graphTitleDisplay="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", graphButtons="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", layoutDirection="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
