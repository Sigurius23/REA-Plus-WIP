.class public final Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$$serializer;,
        Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u0000 \'2\u00020\u0001:\u0002\'(B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010%\u001a\u0004\u0008&\u0010\u001a\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;",
        "",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "lastSavedActiveWorkout",
        "<init>",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Llu2/d;",
        "jsonFormat",
        "",
        "serialize",
        "(Llu2/d;)Ljava/lang/String;",
        "component1",
        "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "copy",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "getLastSavedActiveWorkout",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;


# instance fields
.field private final lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$$serializer;

    invoke-virtual {p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->copy(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lzc3/c;Lyc3/g;)V
    .locals 2

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object v0
.end method

.method public final copy(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    invoke-direct {v0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getLastSavedActiveWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->hashCode()I

    move-result v0

    return v0
.end method

.method public final serialize(Llu2/d;)Ljava/lang/String;
    .locals 1

    const-string v0, "jsonFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llu2/d;->b()Lad3/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p1, v0, p0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->lastSavedActiveWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WorkoutSessionState(lastSavedActiveWorkout="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
