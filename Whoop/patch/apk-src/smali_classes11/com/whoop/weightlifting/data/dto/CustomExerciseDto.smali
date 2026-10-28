.class public final Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$$serializer;,
        Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBW\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBw\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJp\u0010\u001f\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001\u00a2\u0006\u0004\u0008.\u0010/R&\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u0015R&\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00101\u0012\u0004\u00086\u00104\u001a\u0004\u00085\u0010\u0015R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00107\u0012\u0004\u00089\u00104\u001a\u0004\u00088\u0010\u0018R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00107\u0012\u0004\u0008;\u00104\u001a\u0004\u0008:\u0010\u0018R \u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00107\u0012\u0004\u0008=\u00104\u001a\u0004\u0008<\u0010\u0018R \u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00107\u0012\u0004\u0008?\u00104\u001a\u0004\u0008>\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00107\u0012\u0004\u0008A\u00104\u001a\u0004\u0008@\u0010\u0018R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010B\u0012\u0004\u0008D\u00104\u001a\u0004\u0008C\u0010\u001e\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;",
        "",
        "",
        "",
        "instructions",
        "muscleGroups",
        "exerciseId",
        "name",
        "equipment",
        "movementPattern",
        "volumeInputFormat",
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "customExerciseInfo",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getInstructions",
        "getInstructions$annotations",
        "()V",
        "getMuscleGroups",
        "getMuscleGroups$annotations",
        "Ljava/lang/String;",
        "getExerciseId",
        "getExerciseId$annotations",
        "getName",
        "getName$annotations",
        "getEquipment",
        "getEquipment$annotations",
        "getMovementPattern",
        "getMovementPattern$annotations",
        "getVolumeInputFormat",
        "getVolumeInputFormat$annotations",
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "getCustomExerciseInfo",
        "getCustomExerciseInfo$annotations",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$Companion;


# instance fields
.field private final customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "custom_exercise_info"
    .end annotation
.end field

.field private final equipment:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "equipment"
    .end annotation
.end field

.field private final exerciseId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_id"
    .end annotation
.end field

.field private final instructions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "instructions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final movementPattern:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "movement_pattern"
    .end annotation
.end field

.field private final muscleGroups:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "muscle_groups"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final volumeInputFormat:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "volume_input_format"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->Companion:Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lkt2/a;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lkt2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lkt2/a;

    const/16 v5, 0x11

    invoke-direct {v4, v5}, Lkt2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
            ")V"
        }
    .end annotation

    const-string v0, "instructions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "muscleGroups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equipment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPattern"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->copy(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCustomExerciseInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "custom_exercise_info"
    .end annotation

    return-void
.end method

.method public static synthetic getEquipment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "equipment"
    .end annotation

    return-void
.end method

.method public static synthetic getExerciseId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercise_id"
    .end annotation

    return-void
.end method

.method public static synthetic getInstructions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "instructions"
    .end annotation

    return-void
.end method

.method public static synthetic getMovementPattern$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "movement_pattern"
    .end annotation

    return-void
.end method

.method public static synthetic getMuscleGroups$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "muscle_groups"
    .end annotation

    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "name"
    .end annotation

    return-void
.end method

.method public static synthetic getVolumeInputFormat$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "volume_input_format"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
            ")",
            "Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;"
        }
    .end annotation

    const-string v0, "instructions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "muscleGroups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equipment"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPattern"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCustomExerciseInfo()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    return-object v0
.end method

.method public final getEquipment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final getMovementPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getMuscleGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeInputFormat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->instructions:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->muscleGroups:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->exerciseId:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->equipment:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->movementPattern:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->volumeInputFormat:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    const-string v8, ", muscleGroups="

    const-string v9, ", exerciseId="

    const-string v10, "CustomExerciseDto(instructions="

    invoke-static {v10, v8, v0, v9, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    const-string v8, ", equipment="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", movementPattern="

    const-string v2, ", volumeInputFormat="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customExerciseInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
