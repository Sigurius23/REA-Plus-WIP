.class public final Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;,
        Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000256B\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B5\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010$\u001a\u00020#2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010&\u0012\u0004\u0008\'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008*\u0010\u001aR!\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010\u000fR\u0011\u00100\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010!R\u0011\u00101\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u00081\u00102R\u0011\u00104\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010!\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
        "",
        "",
        "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "_exercises",
        "Ljava/util/UUID;",
        "id",
        "<init>",
        "(Ljava/util/List;Ljava/util/UUID;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component2",
        "()Ljava/util/UUID;",
        "copy",
        "(Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
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
        "get_exercises$annotations",
        "()V",
        "Ljava/util/UUID;",
        "getId",
        "exercises$delegate",
        "Ll83/h;",
        "getExercises",
        "exercises",
        "getNumSetsPerExercise",
        "numSetsPerExercise",
        "isSuperset",
        "()Z",
        "getTotalSets",
        "totalSets",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;


# instance fields
.field private final _exercises:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
            ">;"
        }
    .end annotation
.end field

.field private final exercises$delegate:Ll83/h;

.field private final id:Ljava/util/UUID;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljp1/p;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Ljp1/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;

    invoke-virtual {p4}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    const-string p2, "randomUUID(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    .line 4
    :goto_0
    new-instance p1, Lju2/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Lju2/a;-><init>(ILcom/whoop/weightlifting/data/domain/WorkoutGroup;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->exercises$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/UUID;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
            ">;",
            "Ljava/util/UUID;",
            ")V"
        }
    .end annotation

    const-string v0, "_exercises"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    .line 8
    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    .line 9
    new-instance p1, Lju2/a;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0}, Lju2/a;-><init>(ILcom/whoop/weightlifting/data/domain/WorkoutGroup;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->exercises$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 10
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    const-string p3, "randomUUID(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;-><init>(Ljava/util/List;Ljava/util/UUID;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutExercise$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _init_$lambda$0(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;
    .locals 9

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-lez v3, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_5

    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    return-object v1

    :cond_7
    :goto_5
    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->exercises_delegate$lambda$0(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_init_$lambda$0(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Ljava/util/List;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->copy(Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object p0

    return-object p0
.end method

.method private static final exercises_delegate$lambda$0(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Ljava/util/List;
    .locals 9

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-lez v3, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_4

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_5

    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    return-object v1

    :cond_7
    :goto_5
    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    return-object p0
.end method

.method private static synthetic get_exercises$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercises"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v3, "randomUUID(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Llu2/c;->a:Llu2/c;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component2()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
            ">;",
            "Ljava/util/UUID;",
            ")",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;"
        }
    .end annotation

    const-string v0, "_exercises"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-direct {v0, p1, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;-><init>(Ljava/util/List;Ljava/util/UUID;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getExercises()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->exercises$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getNumSetsPerExercise()I
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getTotalSets()I
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isSuperset()Z
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->_exercises:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->id:Ljava/util/UUID;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkoutGroup(_exercises="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
