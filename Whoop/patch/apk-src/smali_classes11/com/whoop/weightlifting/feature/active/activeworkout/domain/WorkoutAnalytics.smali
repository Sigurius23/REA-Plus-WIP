.class public final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EFB\u0081\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0083\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u008a\u0001\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u0018J\u001a\u0010,\u001a\u00020\n2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u0008:\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u0008;\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u0008<\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u0008=\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u0008>\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010 R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010\"R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010A\u001a\u0004\u0008C\u0010\"R\u0017\u0010\u0010\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010?\u001a\u0004\u0008\u0010\u0010 \u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
        "",
        "",
        "numExercisesAddedDuringWorkout",
        "numExercisesRemovedDuringWorkout",
        "numSetsAddedDuringWorkout",
        "numSetsRemovedDuringWorkout",
        "numDragAndDrops",
        "numTimesPlayButtonClicked",
        "numSetsCancelled",
        "",
        "changedTemplate",
        "",
        "Ljava/util/UUID;",
        "setIdsRepsEditedDuringWorkout",
        "setIdsWeightEditedDuringWorkout",
        "isQuickStart",
        "<init>",
        "(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIIIIIIIZLjava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Z",
        "component9",
        "()Ljava/util/Set;",
        "component10",
        "component11",
        "copy",
        "(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getNumExercisesAddedDuringWorkout",
        "getNumExercisesRemovedDuringWorkout",
        "getNumSetsAddedDuringWorkout",
        "getNumSetsRemovedDuringWorkout",
        "getNumDragAndDrops",
        "getNumTimesPlayButtonClicked",
        "getNumSetsCancelled",
        "Z",
        "getChangedTemplate",
        "Ljava/util/Set;",
        "getSetIdsRepsEditedDuringWorkout",
        "getSetIdsWeightEditedDuringWorkout",
        "Companion",
        "$serializer",
        "a",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$a;


# instance fields
.field private final changedTemplate:Z

.field private final isQuickStart:Z

.field private final numDragAndDrops:I

.field private final numExercisesAddedDuringWorkout:I

.field private final numExercisesRemovedDuringWorkout:I

.field private final numSetsAddedDuringWorkout:I

.field private final numSetsCancelled:I

.field private final numSetsRemovedDuringWorkout:I

.field private final numTimesPlayButtonClicked:I

.field private final setIdsRepsEditedDuringWorkout:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private final setIdsWeightEditedDuringWorkout:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lno2/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lno2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lno2/a;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Lno2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xb

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v5, 0x7

    aput-object v1, v4, v5

    aput-object v3, v4, v0

    const/16 v0, 0x9

    aput-object v2, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIZLjava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    const/4 v0, 0x0

    if-nez p13, :cond_0

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    goto :goto_1

    :cond_1
    iput p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    goto :goto_2

    :cond_2
    iput p4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    goto :goto_3

    :cond_3
    iput p5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    goto :goto_4

    :cond_4
    iput p6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    goto :goto_5

    :cond_5
    iput p7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    goto :goto_6

    :cond_6
    iput p8, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    goto :goto_7

    :cond_7
    iput-boolean p9, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    :goto_7
    and-int/lit16 p2, p1, 0x100

    sget-object p3, Lm83/a0;->w:Lm83/a0;

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    :goto_9
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    return-void

    :cond_a
    iput-boolean p12, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    return-void
.end method

.method public constructor <init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIZ",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "setIdsRepsEditedDuringWorkout"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setIdsWeightEditedDuringWorkout"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    .line 5
    iput p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    .line 6
    iput p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    .line 7
    iput p4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    .line 8
    iput p5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    .line 9
    iput p6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    .line 10
    iput p7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    .line 11
    iput-boolean p8, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    .line 12
    iput-object p9, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    .line 13
    iput-object p10, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    .line 14
    iput-boolean p11, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    .line 15
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    if-eqz p13, :cond_8

    move-object p9, v1

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move-object p10, v1

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_a
    move p12, p11

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    sget-object v1, Llu2/c;->a:Llu2/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    sget-object v1, Llu2/c;->a:Llu2/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget p6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-boolean p8, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-boolean p11, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    :cond_a
    move-object p12, p10

    move p13, p11

    move p10, p8

    move-object p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->copy(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    if-eqz v2, :cond_3

    :goto_1
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    if-eqz v2, :cond_5

    :goto_2
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    if-eqz v2, :cond_7

    :goto_3
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    if-eqz v2, :cond_9

    :goto_4
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    if-eqz v2, :cond_b

    :goto_5
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    if-eqz v2, :cond_d

    :goto_6
    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-boolean v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    if-eqz v2, :cond_f

    :goto_7
    iget-boolean v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :goto_8
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :goto_9
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    if-eqz v1, :cond_15

    :goto_a
    iget-boolean p0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_15
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    return v0
.end method

.method public final component10()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    return v0
.end method

.method public final component9()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIZ",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;Z)",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;"
        }
    .end annotation

    const-string v0, "setIdsRepsEditedDuringWorkout"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setIdsWeightEditedDuringWorkout"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    iget-boolean p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getChangedTemplate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    return v0
.end method

.method public final getNumDragAndDrops()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    return v0
.end method

.method public final getNumExercisesAddedDuringWorkout()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    return v0
.end method

.method public final getNumExercisesRemovedDuringWorkout()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    return v0
.end method

.method public final getNumSetsAddedDuringWorkout()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    return v0
.end method

.method public final getNumSetsCancelled()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    return v0
.end method

.method public final getNumSetsRemovedDuringWorkout()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    return v0
.end method

.method public final getNumTimesPlayButtonClicked()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    return v0
.end method

.method public final getSetIdsRepsEditedDuringWorkout()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    return-object v0
.end method

.method public final getSetIdsWeightEditedDuringWorkout()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isQuickStart()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesAddedDuringWorkout:I

    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numExercisesRemovedDuringWorkout:I

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsAddedDuringWorkout:I

    iget v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsRemovedDuringWorkout:I

    iget v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numDragAndDrops:I

    iget v5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numTimesPlayButtonClicked:I

    iget v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->numSetsCancelled:I

    iget-boolean v7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->changedTemplate:Z

    iget-object v8, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsRepsEditedDuringWorkout:Ljava/util/Set;

    iget-object v9, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->setIdsWeightEditedDuringWorkout:Ljava/util/Set;

    iget-boolean v10, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->isQuickStart:Z

    const-string v11, ", numExercisesRemovedDuringWorkout="

    const-string v12, ", numSetsAddedDuringWorkout="

    const-string v13, "WorkoutAnalytics(numExercisesAddedDuringWorkout="

    invoke-static {v0, v1, v13, v11, v12}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numSetsRemovedDuringWorkout="

    const-string v11, ", numDragAndDrops="

    invoke-static {v0, v2, v1, v3, v11}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", numTimesPlayButtonClicked="

    const-string v2, ", numSetsCancelled="

    invoke-static {v0, v4, v1, v5, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", changedTemplate="

    const-string v2, ", setIdsRepsEditedDuringWorkout="

    invoke-static {v6, v1, v2, v0, v7}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", setIdsWeightEditedDuringWorkout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isQuickStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
