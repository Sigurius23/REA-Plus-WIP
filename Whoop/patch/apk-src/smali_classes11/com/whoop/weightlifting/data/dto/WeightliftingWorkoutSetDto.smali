.class public final Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008)\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABU\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bi\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(Jn\u0010+\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010(J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00101\u001a\u00020\t2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00103\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u00087\u0010\"R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008\n\u0010&R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010=\u001a\u0004\u0008>\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008@\u0010(\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;",
        "",
        "",
        "number_of_reps",
        "time_in_seconds",
        "",
        "weight",
        "Ljava/util/UUID;",
        "weightlifting_workout_set_id",
        "",
        "is_exercise_trackable",
        "",
        "during",
        "strap_location",
        "strap_location_laterality",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Integer;",
        "component2",
        "component3",
        "()Ljava/lang/Float;",
        "component4",
        "()Ljava/util/UUID;",
        "component5",
        "()Z",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Integer;",
        "getNumber_of_reps",
        "getTime_in_seconds",
        "Ljava/lang/Float;",
        "getWeight",
        "Ljava/util/UUID;",
        "getWeightlifting_workout_set_id",
        "getWeightlifting_workout_set_id$annotations",
        "()V",
        "Z",
        "Ljava/lang/String;",
        "getDuring",
        "getStrap_location",
        "getStrap_location_laterality",
        "Companion",
        "$serializer",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$Companion;


# instance fields
.field private final during:Ljava/lang/String;

.field private final is_exercise_trackable:Z

.field private final number_of_reps:Ljava/lang/Integer;

.field private final strap_location:Ljava/lang/String;

.field private final strap_location_laterality:Ljava/lang/String;

.field private final time_in_seconds:Ljava/lang/Integer;

.field private final weight:Ljava/lang/Float;

.field private final weightlifting_workout_set_id:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    iput-boolean p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-boolean p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getWeightlifting_workout_set_id$annotations()V
    .locals 0
    .annotation runtime Lwc3/i;
        with = Llu2/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Llu2/c;->a:Llu2/c;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;
    .locals 9

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumber_of_reps()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStrap_location()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    return-object v0
.end method

.method public final getStrap_location_laterality()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    return-object v0
.end method

.method public final getTime_in_seconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeight()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    return-object v0
.end method

.method public final getWeightlifting_workout_set_id()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/util/UUID;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public final is_exercise_trackable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->number_of_reps:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->time_in_seconds:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weight:Ljava/lang/Float;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->weightlifting_workout_set_id:Ljava/util/UUID;

    iget-boolean v4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->is_exercise_trackable:Z

    iget-object v5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->during:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;->strap_location_laterality:Ljava/lang/String;

    const-string v8, ", time_in_seconds="

    const-string v9, ", weight="

    const-string v10, "WeightliftingWorkoutSetDto(number_of_reps="

    invoke-static {v10, v0, v8, v1, v9}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weightlifting_workout_set_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", is_exercise_trackable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", during="

    const-string v2, ", strap_location="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", strap_location_laterality="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
