.class public final Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J@\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010!\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;",
        "",
        "Ly81/f;",
        "pointColor",
        "Lcom/whoop/design/models/items/graph/plot/line/PointSize;",
        "pointSize",
        "Lcom/whoop/design/models/items/graph/plot/line/PointShape;",
        "pointShape",
        "Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;",
        "pointVisibility",
        "<init>",
        "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILy81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ly81/f;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/plot/line/PointSize;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plot/line/PointShape;",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;",
        "copy",
        "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;",
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
        "getPointColor",
        "Lcom/whoop/design/models/items/graph/plot/line/PointSize;",
        "getPointSize",
        "Lcom/whoop/design/models/items/graph/plot/line/PointShape;",
        "getPointShape",
        "Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;",
        "getPointVisibility",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$Companion;


# instance fields
.field private final pointColor:Ly81/f;

.field private final pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

.field private final pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

.field private final pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->Companion:Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lqa1/a;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    new-instance v2, Lqa1/a;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lqa1/a;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lqa1/a;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lqa1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x4

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILy81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    return-void
.end method

.method public constructor <init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    .line 6
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    .line 7
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    return-void
.end method

.method public synthetic constructor <init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)V

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

    const-string v0, "com.whoop.design.models.items.graph.plot.line.PointSize"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/PointSize;->values()[Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.PointShape"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/PointShape;->values()[Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.line.PointVisibility"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;->values()[Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->copy(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/plot/line/PointSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plot/line/PointShape;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    return-object v0
.end method

.method public final copy(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;
    .locals 1

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPointColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    return-object v0
.end method

.method public final getPointShape()Lcom/whoop/design/models/items/graph/plot/line/PointShape;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    return-object v0
.end method

.method public final getPointSize()Lcom/whoop/design/models/items/graph/plot/line/PointSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    return-object v0
.end method

.method public final getPointVisibility()Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointColor:Ly81/f;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointSize:Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointShape:Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->pointVisibility:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "LinePointTheme(pointColor="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pointSize="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pointShape="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pointVisibility="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
