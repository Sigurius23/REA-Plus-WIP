.class public final Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0083\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u009b\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0098\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\u001dJ\u0010\u00102\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00105\u001a\u00020\u00132\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010@\u001a\u0004\u0008A\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008B\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010@\u001a\u0004\u0008C\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010@\u001a\u0004\u0008D\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008F\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010G\u001a\u0004\u0008H\u0010$R\u0017\u0010\n\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010G\u001a\u0004\u0008I\u0010$R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010G\u001a\u0004\u0008J\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010K\u001a\u0004\u0008L\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010M\u001a\u0004\u0008N\u0010*R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010O\u001a\u0004\u0008P\u0010,R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010Q\u001a\u0004\u0008\u0014\u0010.R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010@\u001a\u0004\u0008R\u0010\u001d\u00a8\u0006U"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "",
        "",
        "source",
        "during",
        "timezone",
        "name",
        "",
        "msk_total_volume_kg",
        "raw_msk_strain_score",
        "msk_intensity_percent",
        "scaled_msk_strain_score",
        "",
        "workout_template_id",
        "",
        "rpe",
        "",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
        "workout_groups",
        "",
        "is_simple_strength_logging",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V",
        "seen0",
        "type",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Float;",
        "component6",
        "()F",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Long;",
        "component10",
        "()Ljava/lang/Integer;",
        "component11",
        "()Ljava/util/List;",
        "component12",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getSource",
        "getDuring",
        "getTimezone",
        "getName",
        "Ljava/lang/Float;",
        "getMsk_total_volume_kg",
        "F",
        "getRaw_msk_strain_score",
        "getMsk_intensity_percent",
        "getScaled_msk_strain_score",
        "Ljava/lang/Long;",
        "getWorkout_template_id",
        "Ljava/lang/Integer;",
        "getRpe",
        "Ljava/util/List;",
        "getWorkout_groups",
        "Z",
        "getType",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;


# instance fields
.field private final during:Ljava/lang/String;

.field private final is_simple_strength_logging:Z

.field private final msk_intensity_percent:F

.field private final msk_total_volume_kg:Ljava/lang/Float;

.field private final name:Ljava/lang/String;

.field private final raw_msk_strain_score:F

.field private final rpe:Ljava/lang/Integer;

.field private final scaled_msk_strain_score:F

.field private final source:Ljava/lang/String;

.field private final timezone:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final workout_groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
            ">;"
        }
    .end annotation
.end field

.field private final workout_template_id:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lku2/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lku2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xd

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

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

    aput-object v2, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1e6

    const/16 v1, 0x1e6

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_1

    .line 2
    const-string p2, "user"

    .line 3
    :cond_1
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    goto :goto_1

    :cond_3
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    :goto_1
    iput p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    iput p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    iput p9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    iput-object p10, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    goto :goto_2

    :cond_4
    iput-object p11, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    :goto_2
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    goto :goto_3

    :cond_5
    iput-object p12, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    :goto_3
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_6

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    goto :goto_4

    :cond_6
    iput-boolean p13, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    :goto_4
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_7

    .line 4
    const-string p1, "weightlifting_msk"

    .line 5
    :goto_5
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->type:Ljava/lang/String;

    return-void

    :cond_7
    move-object/from16 p1, p14

    goto :goto_5
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "FFF",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "during"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    .line 12
    iput p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    .line 13
    iput p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    .line 14
    iput p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    .line 15
    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    .line 16
    iput-object p10, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    .line 17
    iput-object p11, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    .line 18
    iput-boolean p12, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    .line 19
    const-string p1, "weightlifting_msk"

    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    .line 20
    const-string p1, "user"

    :cond_0
    and-int/lit8 p14, p13, 0x8

    const/4 v0, 0x0

    if-eqz p14, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_3

    move-object p10, v0

    :cond_3
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_4

    move-object p11, v0

    :cond_4
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_5

    const/4 p12, 0x0

    :cond_5
    move-object p13, p11

    move p14, p12

    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 21
    invoke-direct/range {p2 .. p14}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-boolean p12, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    :cond_b
    move-object p13, p11

    move p14, p12

    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    const-string v3, "user"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x7

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    if-eqz v1, :cond_b

    :goto_5
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_b
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->type:Ljava/lang/String;

    const-string v2, "weightlifting_msk"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    :goto_6
    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    return-object v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    return v0
.end method

.method public final component9()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "FFF",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
            ">;Z)",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "during"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-object v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FFFLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    iget v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    iget v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    iget v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    iget-boolean p1, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getMsk_intensity_percent()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    return v0
.end method

.method public final getMsk_total_volume_kg()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRaw_msk_strain_score()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    return v0
.end method

.method public final getRpe()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getScaled_msk_strain_score()F
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    return v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimezone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkout_groups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    return-object v0
.end method

.method public final getWorkout_template_id()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final is_simple_strength_logging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->source:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->during:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->timezone:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_total_volume_kg:Ljava/lang/Float;

    iget v5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->raw_msk_strain_score:F

    iget v6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->msk_intensity_percent:F

    iget v7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->scaled_msk_strain_score:F

    iget-object v8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_template_id:Ljava/lang/Long;

    iget-object v9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->rpe:Ljava/lang/Integer;

    iget-object v10, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->workout_groups:Ljava/util/List;

    iget-boolean v11, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->is_simple_strength_logging:Z

    const-string v12, ", during="

    const-string v13, ", timezone="

    const-string v14, "WeightliftingWorkoutDto(source="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    const-string v12, ", msk_total_volume_kg="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", raw_msk_strain_score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", msk_intensity_percent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", scaled_msk_strain_score="

    const-string v2, ", workout_template_id="

    invoke-static {v0, v6, v1, v7, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rpe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workout_groups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", is_simple_strength_logging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
