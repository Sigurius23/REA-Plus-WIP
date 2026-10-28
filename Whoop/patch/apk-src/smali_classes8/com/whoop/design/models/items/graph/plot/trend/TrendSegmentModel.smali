.class public final Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B;\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bBQ\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJP\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00082\u0010\u001f\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
        "",
        "",
        "topLabel",
        "bottomLabel",
        "style",
        "",
        "positionX",
        "positionY",
        "widthPercent",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()D",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTopLabel",
        "getBottomLabel",
        "getStyle",
        "D",
        "getPositionX",
        "getPositionY",
        "getWidthPercent",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$Companion;


# instance fields
.field private final bottomLabel:Ljava/lang/String;

.field private final positionX:D

.field private final positionY:D

.field private final style:Ljava/lang/String;

.field private final topLabel:Ljava/lang/String;

.field private final widthPercent:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->Companion:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    iput-wide p5, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    iput-wide p7, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    iput-wide p9, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V
    .locals 1

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    .line 7
    iput-wide p6, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    .line 8
    iput-wide p8, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-wide p4, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-wide p6, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    :cond_4
    and-int/lit8 p10, p10, 0x20

    if-eqz p10, :cond_5

    iget-wide p8, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    :cond_5
    move-wide p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;
    .locals 11

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBottomLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getPositionX()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    return-wide v0
.end method

.method public final getPositionY()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    return-wide v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTopLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidthPercent()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->topLabel:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->bottomLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->style:Ljava/lang/String;

    iget-wide v3, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionX:D

    iget-wide v5, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->positionY:D

    iget-wide v7, p0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->widthPercent:D

    const-string v9, ", bottomLabel="

    const-string v10, ", style="

    const-string v11, "TrendSegmentModel(topLabel="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", positionX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", positionY="

    const-string v2, ", widthPercent="

    invoke-static {v0, v1, v5, v6, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v7, v8, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
