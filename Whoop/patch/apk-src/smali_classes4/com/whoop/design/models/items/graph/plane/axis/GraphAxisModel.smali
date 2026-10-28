.class public final Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBY\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bc\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.Jb\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010*J\u0010\u00102\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00105\u001a\u00020\r2\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010$R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010;\u001a\u0004\u0008<\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010=\u001a\u0004\u0008>\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008@\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010C\u001a\u0004\u0008D\u0010.\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "",
        "Lg61/d;",
        "type",
        "Lg61/c;",
        "style",
        "",
        "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
        "labels",
        "",
        "offset",
        "",
        "axisDescription",
        "",
        "scrimPresent",
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;",
        "theme",
        "<init>",
        "(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lg61/d;",
        "component2",
        "()Lg61/c;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()D",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Z",
        "component7",
        "()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;",
        "copy",
        "(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lg61/d;",
        "getType",
        "Lg61/c;",
        "getStyle",
        "Ljava/util/List;",
        "getLabels",
        "D",
        "getOffset",
        "Ljava/lang/String;",
        "getAxisDescription",
        "Z",
        "getScrimPresent",
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;",
        "getTheme",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$Companion;


# instance fields
.field private final axisDescription:Ljava/lang/String;

.field private final labels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
            ">;"
        }
    .end annotation
.end field

.field private final offset:D

.field private final scrimPresent:Z

.field private final style:Lg61/c;

.field private final theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

.field private final type:Lg61/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->Companion:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lj02/w;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lj02/w;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lj02/w;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Lj02/w;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lj02/w;

    const/4 v7, 0x7

    invoke-direct {v6, v7}, Lj02/w;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v6, v7, [Ll83/h;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    const/4 v2, 0x1

    aput-object v4, v6, v2

    const/4 v2, 0x2

    aput-object v0, v6, v2

    const/4 v0, 0x3

    aput-object v1, v6, v0

    const/4 v0, 0x4

    aput-object v1, v6, v0

    aput-object v1, v6, v3

    aput-object v1, v6, v5

    sput-object v6, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;-><init>(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    if-nez p10, :cond_0

    .line 3
    sget-object p2, Lg61/d;->STANDARD:Lg61/d;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    and-int/lit8 p2, p1, 0x2

    const/4 p10, 0x0

    if-nez p2, :cond_1

    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    goto :goto_2

    :cond_3
    iput-wide p5, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    goto :goto_4

    :cond_5
    iput-boolean p8, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p10, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    return-void

    :cond_6
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    return-void
.end method

.method public constructor <init>(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg61/d;",
            "Lg61/c;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
            ">;D",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;",
            ")V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labels"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    .line 10
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    .line 11
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    .line 12
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    .line 13
    iput-boolean p7, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    .line 14
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    return-void
.end method

.method public synthetic constructor <init>(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    .line 15
    sget-object p1, Lg61/d;->STANDARD:Lg61/d;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    .line 16
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    const-wide/16 p4, 0x0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    const/4 p7, 0x0

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    move-object p10, v0

    move-object p8, p6

    move p9, p7

    :goto_0
    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    goto :goto_1

    :cond_6
    move-object p10, p8

    move p9, p7

    move-object p8, p6

    goto :goto_0

    .line 17
    :goto_1
    invoke-direct/range {p2 .. p10}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;-><init>(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.graph.plane.axis.state.GraphAxisType"

    invoke-static {}, Lg61/d;->values()[Lg61/d;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.graph.plane.axis.state.GraphAxisStyle"

    invoke-static {}, Lg61/c;->values()[Lg61/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p4, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p7, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-object p8, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    :cond_6
    move p9, p7

    move-object p10, p8

    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->copy(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    sget-object v3, Lg61/d;->STANDARD:Lg61/d;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    if-eqz v1, :cond_b

    :goto_5
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Lg61/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    return-object v0
.end method

.method public final component2()Lg61/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    return v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    return-object v0
.end method

.method public final copy(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg61/d;",
            "Lg61/c;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
            ">;D",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;",
            ")",
            "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labels"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;-><init>(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAxisDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    return-object v0
.end method

.method public final getOffset()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    return-wide v0
.end method

.method public final getScrimPresent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    return v0
.end method

.method public final getStyle()Lg61/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    return-object v0
.end method

.method public final getTheme()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    return-object v0
.end method

.method public final getType()Lg61/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->type:Lg61/d;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->style:Lg61/c;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->labels:Ljava/util/List;

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->offset:D

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->axisDescription:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->scrimPresent:Z

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->theme:Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "GraphAxisModel(type="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labels="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", axisDescription="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scrimPresent="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", theme="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
