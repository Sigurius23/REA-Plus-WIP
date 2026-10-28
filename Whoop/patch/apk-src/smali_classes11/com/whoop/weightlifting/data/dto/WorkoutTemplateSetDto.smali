.class public final Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J<\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010-\u0012\u0004\u0008/\u00100\u001a\u0004\u0008.\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00101\u0012\u0004\u00083\u00100\u001a\u0004\u00082\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00104\u0012\u0004\u00086\u00100\u001a\u0004\u00085\u0010 R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00107\u0012\u0004\u00089\u00100\u001a\u0004\u00088\u0010\"\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
        "",
        "",
        "numberOfReps",
        "timeInSeconds",
        "",
        "weight",
        "Ljava/util/UUID;",
        "id",
        "<init>",
        "(ILjava/lang/Integer;FLjava/util/UUID;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/Integer;FLjava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "toWorkoutTemplateSet",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "()F",
        "component4",
        "()Ljava/util/UUID;",
        "copy",
        "(ILjava/lang/Integer;FLjava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getNumberOfReps",
        "getNumberOfReps$annotations",
        "()V",
        "Ljava/lang/Integer;",
        "getTimeInSeconds",
        "getTimeInSeconds$annotations",
        "F",
        "getWeight",
        "getWeight$annotations",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$Companion;


# instance fields
.field private final id:Ljava/util/UUID;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weightlifting_workout_set_id"
    .end annotation
.end field

.field private final numberOfReps:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "number_of_reps"
    .end annotation
.end field

.field private final timeInSeconds:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_in_seconds"
    .end annotation
.end field

.field private final weight:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weight"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->Companion:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;FLjava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    iput p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;FLjava/util/UUID;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    .line 5
    iput p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;ILjava/lang/Integer;FLjava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->copy(ILjava/lang/Integer;FLjava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weightlifting_workout_set_id"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Llu2/c;
    .end annotation

    return-void
.end method

.method public static synthetic getNumberOfReps$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "number_of_reps"
    .end annotation

    return-void
.end method

.method public static synthetic getTimeInSeconds$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "time_in_seconds"
    .end annotation

    return-void
.end method

.method public static synthetic getWeight$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    sget-object v0, Llu2/c;->a:Llu2/c;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    return v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    return v0
.end method

.method public final component4()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final copy(ILjava/lang/Integer;FLjava/util/UUID;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;-><init>(ILjava/lang/Integer;FLjava/util/UUID;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;

    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    iget v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    iget v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getNumberOfReps()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    return v0
.end method

.method public final getTimeInSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/UUID;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WorkoutTemplateSetDto(numberOfReps="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", timeInSeconds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toWorkoutTemplateSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 5

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->numberOfReps:I

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->timeInSeconds:Ljava/lang/Integer;

    iget v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->weight:F

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;->id:Ljava/util/UUID;

    if-nez v4, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;FLjava/util/UUID;)V

    return-object v0
.end method
