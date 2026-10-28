.class public final Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$$serializer;,
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBS\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJN\u0010#\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001fR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010/\u001a\u0004\u00083\u0010\u001f\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;",
        "",
        "",
        "workoutTemplateKey",
        "parentTemplateKey",
        "",
        "name",
        "",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;",
        "workoutGroups",
        "source",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$strength_workout_release",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Long;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Long;",
        "getWorkoutTemplateKey",
        "getParentTemplateKey",
        "Ljava/lang/String;",
        "getName",
        "Ljava/util/List;",
        "getWorkoutGroups",
        "getSource",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$Companion;


# instance fields
.field private final name:Ljava/lang/String;

.field private final parentTemplateKey:Ljava/lang/Long;

.field private final source:Ljava/lang/String;

.field private final workoutGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final workoutTemplateKey:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lbf2/a;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lbf2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x17

    const/16 v0, 0x17

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    :goto_0
    iput-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutGroups"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    .line 6
    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    .line 7
    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 10
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$strength_workout_release(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutGroups"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getParentTemplateKey()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkoutGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getWorkoutTemplateKey()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

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

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutTemplateKey:Ljava/lang/Long;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->parentTemplateKey:Ljava/lang/Long;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->workoutGroups:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->source:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "StrengthWorkoutTemplateResponse(workoutTemplateKey="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parentTemplateKey="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", workoutGroups="

    const-string v1, ", source="

    invoke-static {v2, v0, v1, v5, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
