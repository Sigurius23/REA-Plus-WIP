.class public final Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$$serializer;,
        Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J@\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00081\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00102\u001a\u0004\u00083\u0010\"\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "",
        "",
        "id",
        "",
        "Lcom/whoop/design/models/TimeSegmentModel;",
        "timeSegments",
        "Lcom/whoop/design/models/items/SegmentControllerModel;",
        "segmentController",
        "Lcom/whoop/design/models/items/NoDataGraphModel;",
        "noDataGraphState",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$exercise_progress_mini_arch_release",
        "(Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/SegmentControllerModel;",
        "component4",
        "()Lcom/whoop/design/models/items/NoDataGraphModel;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Ljava/util/List;",
        "getTimeSegments",
        "Lcom/whoop/design/models/items/SegmentControllerModel;",
        "getSegmentController",
        "Lcom/whoop/design/models/items/NoDataGraphModel;",
        "getNoDataGraphState",
        "Companion",
        "$serializer",
        "exercise-progress-mini-arch_release"
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

.field public static final Companion:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$Companion;


# instance fields
.field private final id:Ljava/lang/String;

.field private final noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

.field private final segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

.field private final timeSegments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TimeSegmentModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->Companion:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldb2/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Ldb2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$$serializer;->INSTANCE:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$$serializer;

    invoke-virtual {p6}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    iput-object p5, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TimeSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/SegmentControllerModel;",
            "Lcom/whoop/design/models/items/NoDataGraphModel;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeSegments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/TimeSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/TimeSegmentModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;ILjava/lang/Object;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$exercise_progress_mini_arch_release(Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/SegmentControllerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SegmentControllerModel$$serializer;

    iget-object v1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/NoDataGraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NoDataGraphModel$$serializer;

    iget-object p0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TimeSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/SegmentControllerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/NoDataGraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TimeSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/SegmentControllerModel;",
            "Lcom/whoop/design/models/items/NoDataGraphModel;",
            ")",
            "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeSegments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/NoDataGraphModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    iget-object v1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    iget-object v3, p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    iget-object p1, p1, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoDataGraphState()Lcom/whoop/design/models/items/NoDataGraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    return-object v0
.end method

.method public final getSegmentController()Lcom/whoop/design/models/items/SegmentControllerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    return-object v0
.end method

.method public final getTimeSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/TimeSegmentModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SegmentControllerModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NoDataGraphModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->timeSegments:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->segmentController:Lcom/whoop/design/models/items/SegmentControllerModel;

    iget-object v3, p0, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->noDataGraphState:Lcom/whoop/design/models/items/NoDataGraphModel;

    const-string v4, ", timeSegments="

    const-string v5, ", segmentController="

    const-string v6, "ExerciseProgressModels(id="

    invoke-static {v6, v0, v4, v5, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noDataGraphState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
