.class public final Lcom/whoop/design/models/items/DataHighlightModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DataHighlightModel$$serializer;,
        Lcom/whoop/design/models/items/DataHighlightModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BI\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB]\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J^\u0010)\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010(J\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00103\u0012\u0004\u00085\u00106\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u00088\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u0008;\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008=\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008?\u0010(\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DataHighlightModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/ScoreGaugeRowModel;",
        "pillarGauges",
        "Lcom/whoop/design/models/items/DividerModel;",
        "streaksDivider",
        "Lcom/whoop/design/models/items/StreaksContainer;",
        "streaks",
        "notableStatsDivider",
        "",
        "Lcom/whoop/design/models/items/NotableStatsModel;",
        "notableStats",
        "",
        "footer",
        "<init>",
        "(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/DataHighlightModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/ScoreGaugeRowModel;",
        "component2",
        "()Lcom/whoop/design/models/items/DividerModel;",
        "component3",
        "()Lcom/whoop/design/models/items/StreaksContainer;",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Ljava/lang/String;",
        "copy",
        "(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/items/DataHighlightModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/ScoreGaugeRowModel;",
        "getPillarGauges",
        "getPillarGauges$annotations",
        "()V",
        "Lcom/whoop/design/models/items/DividerModel;",
        "getStreaksDivider",
        "Lcom/whoop/design/models/items/StreaksContainer;",
        "getStreaks",
        "getNotableStatsDivider",
        "Ljava/util/List;",
        "getNotableStats",
        "Ljava/lang/String;",
        "getFooter",
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

.field public static final Companion:Lcom/whoop/design/models/items/DataHighlightModel$Companion;


# instance fields
.field private final footer:Ljava/lang/String;

.field private final notableStats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/NotableStatsModel;",
            ">;"
        }
    .end annotation
.end field

.field private final notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

.field private final pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sticky_score_gauges"
    .end annotation
.end field

.field private final streaks:Lcom/whoop/design/models/items/StreaksContainer;

.field private final streaksDivider:Lcom/whoop/design/models/items/DividerModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/DataHighlightModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DataHighlightModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DataHighlightModel;->Companion:Lcom/whoop/design/models/items/DataHighlightModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/DataHighlightModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/c;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lw91/c;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v0, v2, v3

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/DataHighlightModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/design/models/items/DataHighlightModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DataHighlightModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/design/models/items/DataHighlightModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    iput-object p3, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    iput-object p4, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    iput-object p5, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    iput-object p6, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/ScoreGaugeRowModel;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Lcom/whoop/design/models/items/StreaksContainer;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/NotableStatsModel;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/NotableStatsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NotableStatsModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DataHighlightModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DataHighlightModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DataHighlightModel;Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/DataHighlightModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/items/DataHighlightModel;->copy(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/items/DataHighlightModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPillarGauges$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sticky_score_gauges"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DataHighlightModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/DataHighlightModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/ScoreGaugeRowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ScoreGaugeRowModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/DividerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DividerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/StreaksContainer$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StreaksContainer$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/ScoreGaugeRowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/StreaksContainer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/NotableStatsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/items/DataHighlightModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/ScoreGaugeRowModel;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Lcom/whoop/design/models/items/StreaksContainer;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/NotableStatsModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/design/models/items/DataHighlightModel;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/design/models/items/DataHighlightModel;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/whoop/design/models/items/DataHighlightModel;-><init>(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DataHighlightModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DataHighlightModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    iget-object v3, p1, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getFooter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotableStats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/NotableStatsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    return-object v0
.end method

.method public final getNotableStatsDivider()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final getPillarGauges()Lcom/whoop/design/models/items/ScoreGaugeRowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    return-object v0
.end method

.method public final getStreaks()Lcom/whoop/design/models/items/StreaksContainer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    return-object v0
.end method

.method public final getStreaksDivider()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ScoreGaugeRowModel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DividerModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/StreaksContainer;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DividerModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/items/DataHighlightModel;->pillarGauges:Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaksDivider:Lcom/whoop/design/models/items/DividerModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/DataHighlightModel;->streaks:Lcom/whoop/design/models/items/StreaksContainer;

    iget-object v3, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStatsDivider:Lcom/whoop/design/models/items/DividerModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/DataHighlightModel;->notableStats:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/design/models/items/DataHighlightModel;->footer:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DataHighlightModel(pillarGauges="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", streaksDivider="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", streaks="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", notableStatsDivider="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", notableStats="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    const-string v1, ")"

    invoke-static {v0, v5, v1, v6, v4}, Ly00/t7;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
