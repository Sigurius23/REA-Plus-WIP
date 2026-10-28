.class public final Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBBS\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B_\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\\\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010(J\u0010\u0010/\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u00088\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010$R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010=\u001a\u0004\u0008>\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010=\u001a\u0004\u0008?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010@\u001a\u0004\u0008A\u0010+\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
        "",
        "",
        "position",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;",
        "type",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;",
        "style",
        "Lg61/f;",
        "axis",
        "",
        "label",
        "labelStyle",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;",
        "theme",
        "<init>",
        "(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()D",
        "component2",
        "()Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;",
        "component4",
        "()Lg61/f;",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;",
        "copy",
        "(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "getPosition",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;",
        "getType",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;",
        "getStyle",
        "Lg61/f;",
        "getAxis",
        "Ljava/lang/String;",
        "getLabel",
        "getLabelStyle",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$Companion;


# instance fields
.field private final axis:Lg61/f;

.field private final label:Ljava/lang/String;

.field private final labelStyle:Ljava/lang/String;

.field private final position:D

.field private final style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

.field private final theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

.field private final type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->Companion:Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lj02/w;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lj02/w;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lj02/w;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Lj02/w;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lma1/a;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lma1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x7

    new-array v4, v4, [Ll83/h;

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    const/4 v2, 0x2

    aput-object v3, v4, v2

    const/4 v2, 0x3

    aput-object v0, v4, v2

    const/4 v0, 0x4

    aput-object v1, v4, v0

    const/4 v0, 0x5

    aput-object v1, v4, v0

    const/4 v0, 0x6

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;-><init>(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "axis"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    .line 4
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    .line 5
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    .line 7
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    return-void
.end method

.method public synthetic constructor <init>(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    .line 17
    sget-object p3, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    .line 18
    sget-object p4, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    .line 19
    sget-object p5, Lg61/f;->X_AXIS:Lg61/f;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p9, 0x10

    const/4 p2, 0x0

    if-eqz p1, :cond_4

    move-object v6, p2

    goto :goto_0

    :cond_4
    move-object v6, p6

    :goto_0
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    move-object v7, p2

    goto :goto_1

    :cond_5
    move-object/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    move-object v8, p2

    :goto_2
    move-object v0, p0

    goto :goto_3

    :cond_6
    move-object/from16 v8, p8

    goto :goto_2

    .line 20
    :goto_3
    invoke-direct/range {v0 .. v8}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;-><init>(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)V

    return-void
.end method

.method public synthetic constructor <init>(IDLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    if-nez p10, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    iput-wide p2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 11
    sget-object p2, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    .line 12
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 13
    sget-object p2, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    .line 14
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 15
    sget-object p2, Lg61/f;->X_AXIS:Lg61/f;

    .line 16
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    return-void

    :cond_6
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plane.line.GraphLineType"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;->values()[Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plane.line.GraphLineStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;->values()[Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.graph.plane.axis.state.GraphLineAxis"

    invoke-static {}, Lg61/f;->values()[Lg61/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    :cond_4
    move-object v6, p6

    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    move-object v7, p1

    goto :goto_0

    :cond_5
    move-object/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    move-object v8, p1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_6
    move-object/from16 v8, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->copy(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iget-wide v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    sget-object v3, Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;->STANDARD:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    if-eq v2, v3, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    sget-object v3, Lg61/f;->X_AXIS:Lg61/f;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    return-wide v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    return-object v0
.end method

.method public final component4()Lg61/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    return-object v0
.end method

.method public final copy(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;
    .locals 10

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "axis"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;-><init>(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAxis()Lg61/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabelStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getPosition()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    return-wide v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    return-object v0
.end method

.method public final getTheme()Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    return-object v0
.end method

.method public final getType()Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->position:D

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->type:Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->style:Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->axis:Lg61/f;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->label:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->labelStyle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->theme:Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "GraphLineModel(position="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", axis="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    const-string v1, ", labelStyle="

    invoke-static {v8, v0, v5, v1, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", theme="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
