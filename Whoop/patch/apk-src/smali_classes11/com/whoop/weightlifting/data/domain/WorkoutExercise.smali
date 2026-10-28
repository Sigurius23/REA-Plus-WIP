.class public final Lcom/whoop/weightlifting/data/domain/WorkoutExercise;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/domain/WorkoutExercise$$serializer;,
        Lcom/whoop/weightlifting/data/domain/WorkoutExercise$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B\'\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001e\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "",
        "",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "sets",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "exercise",
        "Ljava/util/UUID;",
        "id",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "component3",
        "()Ljava/util/UUID;",
        "copy",
        "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getSets",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "getExercise",
        "Ljava/util/UUID;",
        "getId",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/domain/WorkoutExercise$Companion;


# instance fields
.field private final exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

.field private final id:Ljava/util/UUID;

.field private final sets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutExercise$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljp1/p;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Ljp1/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/weightlifting/data/domain/WorkoutExercise$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutExercise$$serializer;

    invoke-virtual {p5}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_1

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    const-string p2, "randomUUID(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    return-void

    :cond_1
    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    const-string v0, "sets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exercise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    .line 6
    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    .line 7
    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p3

    const-string p4, "randomUUID(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->copy(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v3, "randomUUID(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Llu2/c;->a:Llu2/c;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-object v0
.end method

.method public final component3()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            "Ljava/util/UUID;",
            ")",
            "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;"
        }
    .end annotation

    const-string v0, "sets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exercise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-object v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->sets:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->exercise:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->id:Ljava/util/UUID;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "WorkoutExercise(sets="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exercise="

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
