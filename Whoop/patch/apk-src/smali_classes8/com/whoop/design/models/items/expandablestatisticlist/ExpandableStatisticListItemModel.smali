.class public final Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$$serializer;,
        Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBU\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JL\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010+\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010+\u0012\u0004\u00081\u0010/\u001a\u0004\u00080\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010+\u0012\u0004\u00083\u0010/\u001a\u0004\u00082\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010+\u0012\u0004\u00085\u0010/\u001a\u0004\u00084\u0010\u001bR \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00106\u0012\u0004\u00088\u0010/\u001a\u0004\u00087\u0010!\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
        "",
        "",
        "icon",
        "activityNameDisplay",
        "avgStrainDisplay",
        "activityCountDisplay",
        "barFillStyle",
        "",
        "barFillPercentage",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()D",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getActivityNameDisplay",
        "getActivityNameDisplay$annotations",
        "()V",
        "getAvgStrainDisplay",
        "getAvgStrainDisplay$annotations",
        "getActivityCountDisplay",
        "getActivityCountDisplay$annotations",
        "getBarFillStyle",
        "getBarFillStyle$annotations",
        "D",
        "getBarFillPercentage",
        "getBarFillPercentage$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$Companion;


# instance fields
.field private final activityCountDisplay:Ljava/lang/String;

.field private final activityNameDisplay:Ljava/lang/String;

.field private final avgStrainDisplay:Ljava/lang/String;

.field private final barFillPercentage:D

.field private final barFillStyle:Ljava/lang/String;

.field private final icon:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->Companion:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    iput-wide p7, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityNameDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avgStrainDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityCountDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barFillStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    .line 8
    iput-wide p6, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Object;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-wide p6, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    :cond_5
    move-wide p8, p6

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getActivityCountDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_count_display"
    .end annotation

    return-void
.end method

.method public static synthetic getActivityNameDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_name_display"
    .end annotation

    return-void
.end method

.method public static synthetic getAvgStrainDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "avg_strain_display"
    .end annotation

    return-void
.end method

.method public static synthetic getBarFillPercentage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bar_fill_percentage"
    .end annotation

    return-void
.end method

.method public static synthetic getBarFillStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bar_fill_style"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;
    .locals 9

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityNameDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avgStrainDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityCountDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barFillStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getActivityCountDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getActivityNameDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvgStrainDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getBarFillPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    return-wide v0
.end method

.method public final getBarFillStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityNameDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->avgStrainDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->activityCountDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillStyle:Ljava/lang/String;

    iget-wide v5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;->barFillPercentage:D

    const-string v7, ", activityNameDisplay="

    const-string v8, ", avgStrainDisplay="

    const-string v9, "ExpandableStatisticListItemModel(icon="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityCountDisplay="

    const-string v7, ", barFillStyle="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", barFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
