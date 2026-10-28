.class public final Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$$serializer;,
        Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJV\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00084\u0010 R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00101\u001a\u0004\u00089\u0010\u001eR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00101\u001a\u0004\u0008:\u0010\u001e\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "trends",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "button",
        "Lcom/whoop/design/models/items/PieChartModel;",
        "pieChart",
        "count",
        "category",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$healthspan_release",
        "(Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "component4",
        "()Lcom/whoop/design/models/items/PieChartModel;",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/List;",
        "getTrends",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "getButton",
        "Lcom/whoop/design/models/items/PieChartModel;",
        "getPieChart",
        "getCount",
        "getCategory",
        "Companion",
        "$serializer",
        "healthspan_release"
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

.field public static final Companion:Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$Companion;


# instance fields
.field private final button:Lcom/whoop/design/models/items/SecondaryButtonModel;

.field private final category:Ljava/lang/String;

.field private final count:Ljava/lang/String;

.field private final pieChart:Lcom/whoop/design/models/items/PieChartModel;

.field private final title:Ljava/lang/String;

.field private final trends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ImpactModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->Companion:Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lga1/a;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lga1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ImpactModel;",
            ">;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            "Lcom/whoop/design/models/items/PieChartModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trends"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "count"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$healthspan_release(Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/PieChartModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/PieChartModel$$serializer;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ImpactModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/PieChartModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ImpactModel;",
            ">;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            "Lcom/whoop/design/models/items/PieChartModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trends"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "count"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getCount()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    return-object v0
.end method

.method public final getPieChart()Lcom/whoop/design/models/items/PieChartModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrends()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ImpactModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/PieChartModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->trends:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->button:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->pieChart:Lcom/whoop/design/models/items/PieChartModel;

    iget-object v4, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->count:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;->category:Ljava/lang/String;

    const-string v6, ", trends="

    const-string v7, ", button="

    const-string v8, "LabsImpactCardModel(title="

    invoke-static {v8, v0, v6, v7, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pieChart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
