.class public final Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$$serializer;,
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ<\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008.\u0010\u001b\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;",
        "",
        "",
        "workoutTemplateKey",
        "",
        "name",
        "userId",
        "updatedAt",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$strength_workout_release",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "copy",
        "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getWorkoutTemplateKey",
        "Ljava/lang/String;",
        "getName",
        "Ljava/lang/Long;",
        "getUserId",
        "getUpdatedAt",
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

.field public static final Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$Companion;


# instance fields
.field private final name:Ljava/lang/String;

.field private final updatedAt:Ljava/lang/String;

.field private final userId:Ljava/lang/Long;

.field private final workoutTemplateKey:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$$serializer;

    invoke-virtual {p7}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    iput-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    .line 4
    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    .line 6
    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    :cond_3
    move-object v0, p0

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->copy(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$strength_workout_release(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;
    .locals 7

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;-><init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;

    iget-wide v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    iget-wide v5, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getWorkoutTemplateKey()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

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

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->workoutTemplateKey:J

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->userId:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    const-string v5, "StrengthWorkoutTemplateOverview(workoutTemplateKey="

    const-string v6, ", name="

    invoke-static {v5, v6, v0, v1, v2}, Lvl/b;->m(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
