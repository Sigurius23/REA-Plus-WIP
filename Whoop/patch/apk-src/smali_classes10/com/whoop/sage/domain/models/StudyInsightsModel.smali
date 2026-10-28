.class public final Lcom/whoop/sage/domain/models/StudyInsightsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sage/domain/models/StudyInsightsModel$$serializer;,
        Lcom/whoop/sage/domain/models/StudyInsightsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBS\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JH\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u00080\u0010\u001cR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010\"\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/sage/domain/models/StudyInsightsModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "imageUrl",
        "cardTitle",
        "cardSubtitle",
        "",
        "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;",
        "metricList",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "secondaryButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sage_release",
        "(Lcom/whoop/sage/domain/models/StudyInsightsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/sage/domain/models/StudyInsightsModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getImageUrl",
        "getCardTitle",
        "getCardSubtitle",
        "Ljava/util/List;",
        "getMetricList",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "getSecondaryButton",
        "Companion",
        "$serializer",
        "sage_release"
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

.field public static final Companion:Lcom/whoop/sage/domain/models/StudyInsightsModel$Companion;


# instance fields
.field private final cardSubtitle:Ljava/lang/String;

.field private final cardTitle:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final metricList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;",
            ">;"
        }
    .end annotation
.end field

.field private final secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/sage/domain/models/StudyInsightsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->Companion:Lcom/whoop/sage/domain/models/StudyInsightsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldx2/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/sage/domain/models/StudyInsightsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/sage/domain/models/StudyInsightsModel$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/StudyInsightsModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/sage/domain/models/StudyInsightsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;",
            ">;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/sage/domain/models/StudyInsightsMetricModel$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/StudyInsightsMetricModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sage/domain/models/StudyInsightsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;ILjava/lang/Object;)Lcom/whoop/sage/domain/models/StudyInsightsModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/sage/domain/models/StudyInsightsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sage_release(Lcom/whoop/sage/domain/models/StudyInsightsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/sage/domain/models/StudyInsightsModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;",
            ">;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            ")",
            "Lcom/whoop/sage/domain/models/StudyInsightsModel;"
        }
    .end annotation

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secondaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sage/domain/models/StudyInsightsModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/sage/domain/models/StudyInsightsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object p1, p1, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCardSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getCardTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->imageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->cardSubtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->metricList:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/sage/domain/models/StudyInsightsModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const-string v5, ", cardTitle="

    const-string v6, ", cardSubtitle="

    const-string v7, "StudyInsightsModel(imageUrl="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metricList="

    const-string v5, ", secondaryButton="

    invoke-static {v2, v1, v5, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
