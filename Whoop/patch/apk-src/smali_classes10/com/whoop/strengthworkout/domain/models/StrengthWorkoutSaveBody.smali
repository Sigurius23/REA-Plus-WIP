.class public final Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;,
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000c\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000c\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0010\u0010(\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0096\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001bJ\u0010\u0010.\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010=\u001a\u0004\u0008>\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010=\u001a\u0004\u0008?\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008@\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008A\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008B\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008D\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010E\u001a\u0004\u0008F\u0010#R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010G\u001a\u0004\u0008H\u0010%R\u0017\u0010\u000e\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010G\u001a\u0004\u0008I\u0010%R\u0017\u0010\u000f\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008J\u0010%R\u0017\u0010\u0010\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008K\u0010%R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010L\u001a\u0004\u0008M\u0010*\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
        "",
        "",
        "weightliftingWorkoutId",
        "activityId",
        "during",
        "timezone",
        "name",
        "",
        "workoutTemplateId",
        "",
        "rpe",
        "",
        "mskTotalVolumeKg",
        "rawMskStrainScore",
        "mskIntensityPercent",
        "scaledMskStrainScore",
        "",
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;",
        "workoutGroups",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Long;",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "()F",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;",
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
        "write$Self$strength_workout_release",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getWeightliftingWorkoutId",
        "getActivityId",
        "getDuring",
        "getTimezone",
        "getName",
        "Ljava/lang/Long;",
        "getWorkoutTemplateId",
        "Ljava/lang/Integer;",
        "getRpe",
        "F",
        "getMskTotalVolumeKg",
        "getRawMskStrainScore",
        "getMskIntensityPercent",
        "getScaledMskStrainScore",
        "Ljava/util/List;",
        "getWorkoutGroups",
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

.field public static final Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$Companion;


# instance fields
.field private final activityId:Ljava/lang/String;

.field private final during:Ljava/lang/String;

.field private final mskIntensityPercent:F

.field private final mskTotalVolumeKg:F

.field private final name:Ljava/lang/String;

.field private final rawMskStrainScore:F

.field private final rpe:Ljava/lang/Integer;

.field private final scaledMskStrainScore:F

.field private final timezone:Ljava/lang/String;

.field private final weightliftingWorkoutId:Ljava/lang/String;

.field private final workoutGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final workoutTemplateId:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lbf2/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lbf2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xc

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;

    invoke-virtual {p14}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    iput-object p8, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    iput p9, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    iput p10, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    iput p11, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    iput p12, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    iput-object p13, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "FFFF",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;",
            ">;)V"
        }
    .end annotation

    const-string v0, "weightliftingWorkoutId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "during"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutGroups"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    .line 9
    iput-object p7, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    .line 10
    iput p8, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    .line 11
    iput p9, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    .line 12
    iput p10, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    .line 13
    iput p11, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    .line 14
    iput-object p12, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;ILjava/lang/Object;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget p11, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    :cond_b
    move p13, p11

    move-object p14, p12

    move p11, p9

    move p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$strength_workout_release(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v1, 0x8

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v1, 0x9

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v1, 0xa

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    return v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    return v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "FFFF",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;",
            ">;)",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;"
        }
    .end annotation

    const-string v0, "weightliftingWorkoutId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "during"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutGroups"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;FFFFLjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    iget v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    iget v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    iget v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    iget v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getActivityId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getMskIntensityPercent()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    return v0
.end method

.method public final getMskTotalVolumeKg()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRawMskStrainScore()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    return v0
.end method

.method public final getRpe()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getScaledMskStrainScore()F
    .locals 1

    iget v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    return v0
.end method

.method public final getTimezone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightliftingWorkoutId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkoutGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getWorkoutTemplateId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->weightliftingWorkoutId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->activityId:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->during:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->timezone:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->name:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutTemplateId:Ljava/lang/Long;

    iget-object v6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rpe:Ljava/lang/Integer;

    iget v7, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskTotalVolumeKg:F

    iget v8, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->rawMskStrainScore:F

    iget v9, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->mskIntensityPercent:F

    iget v10, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->scaledMskStrainScore:F

    iget-object v11, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->workoutGroups:Ljava/util/List;

    const-string v12, ", activityId="

    const-string v13, ", during="

    const-string v14, "StrengthWorkoutSaveBody(weightliftingWorkoutId="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timezone="

    const-string v12, ", name="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutTemplateId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rpe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mskTotalVolumeKg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rawMskStrainScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mskIntensityPercent="

    const-string v2, ", scaledMskStrainScore="

    invoke-static {v0, v8, v1, v9, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", workoutGroups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
