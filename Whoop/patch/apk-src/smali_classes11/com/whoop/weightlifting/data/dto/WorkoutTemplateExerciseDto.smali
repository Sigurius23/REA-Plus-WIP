.class public final Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J6\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010-\u0012\u0004\u0008/\u00100\u001a\u0004\u0008.\u0010\u001dR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00101\u0012\u0004\u00083\u00100\u001a\u0004\u00082\u0010\u001fR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00104\u0012\u0004\u00086\u00100\u001a\u0004\u00085\u0010!\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;",
        "",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "exerciseDetails",
        "",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
        "sets",
        "Ljava/util/UUID;",
        "id",
        "<init>",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "toWorkoutExercise",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "component1",
        "()Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/util/UUID;",
        "copy",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "getExerciseDetails",
        "getExerciseDetails$annotations",
        "()V",
        "Ljava/util/List;",
        "getSets",
        "getSets$annotations",
        "Ljava/util/UUID;",
        "getId",
        "getId$annotations",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$Companion;


# instance fields
.field private final exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_details"
    .end annotation
.end field

.field private final id:Ljava/util/UUID;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_exercise_id"
    .end annotation
.end field

.field private final sets:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sets"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->Companion:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lku2/a;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lku2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$$serializer;

    invoke-virtual {p5}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
            ">;",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    const-string v0, "exerciseDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->copy(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getExerciseDetails$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercise_details"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_exercise_id"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Llu2/c;
    .end annotation

    return-void
.end method

.method public static synthetic getSets$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sets"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Llu2/c;->a:Llu2/c;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final copy(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
            ">;",
            "Ljava/util/UUID;",
            ")",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;"
        }
    .end annotation

    const-string v0, "exerciseDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;-><init>(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/util/List;Ljava/util/UUID;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getExerciseDetails()Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    return-object v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/UUID;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "WorkoutTemplateExerciseDto(exerciseDetails="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sets="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toWorkoutExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->sets:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->toWorkoutTemplateSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->exerciseDetails:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->toWeightliftingExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->id:Ljava/util/UUID;

    if-nez v2, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v3, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-direct {v3, v1, v0, v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V

    return-object v3
.end method
