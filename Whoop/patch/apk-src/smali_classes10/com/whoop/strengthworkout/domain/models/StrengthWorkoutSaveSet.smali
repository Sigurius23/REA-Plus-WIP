.class public final Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$$serializer;,
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJJ\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008.\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010*\u001a\u0004\u00081\u0010\u001a\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;",
        "",
        "",
        "weightliftingWorkoutSetId",
        "",
        "numberOfReps",
        "timeInSeconds",
        "",
        "weight",
        "during",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$strength_workout_release",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "component4",
        "()Ljava/lang/Float;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getWeightliftingWorkoutSetId",
        "Ljava/lang/Integer;",
        "getNumberOfReps",
        "getTimeInSeconds",
        "Ljava/lang/Float;",
        "getWeight",
        "getDuring",
        "Companion",
        "$serializer",
        "strength-workout_release"
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

.field public static final Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$Companion;


# instance fields
.field private final during:Ljava/lang/String;

.field private final numberOfReps:Ljava/lang/Integer;

.field private final timeInSeconds:Ljava/lang/Integer;

.field private final weight:Ljava/lang/Float;

.field private final weightliftingWorkoutSetId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$$serializer;

    invoke-virtual {p7}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    iput-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V
    .locals 1

    const-string v0, "weightliftingWorkoutSetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    .line 7
    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$strength_workout_release(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;
    .locals 7

    const-string v0, "weightliftingWorkoutSetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumberOfReps()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTimeInSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeight()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    return-object v0
.end method

.method public final getWeightliftingWorkoutSetId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weightliftingWorkoutSetId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->numberOfReps:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->timeInSeconds:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->weight:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveSet;->during:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "StrengthWorkoutSaveSet(weightliftingWorkoutSetId="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", numberOfReps="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeInSeconds="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", during="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
