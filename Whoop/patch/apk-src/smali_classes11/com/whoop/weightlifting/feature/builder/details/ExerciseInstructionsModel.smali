.class public final Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$$serializer;,
        Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0089\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0017J\u0092\u0001\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001\u00a2\u0006\u0004\u00083\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00106\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u0008:\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u0008;\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00106\u0012\u0004\u0008=\u00109\u001a\u0004\u0008<\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00106\u0012\u0004\u0008?\u00109\u001a\u0004\u0008>\u0010\u0017R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00106\u0012\u0004\u0008A\u00109\u001a\u0004\u0008@\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00106\u0012\u0004\u0008C\u00109\u001a\u0004\u0008B\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00106\u0012\u0004\u0008E\u00109\u001a\u0004\u0008D\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00106\u0012\u0004\u0008G\u00109\u001a\u0004\u0008F\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010H\u0012\u0004\u0008J\u00109\u001a\u0004\u0008I\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00106\u0012\u0004\u0008L\u00109\u001a\u0004\u0008K\u0010\u0017\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "exerciseId",
        "instructions",
        "name",
        "imageUrl",
        "videoUrl",
        "equipmentTitle",
        "equipmentBody",
        "muscleGroupsTitle",
        "muscleGroupsBody",
        "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;",
        "customExerciseInfo",
        "volumeInputFormat",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;",
        "component11",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getExerciseId",
        "getExerciseId$annotations",
        "()V",
        "getInstructions",
        "getName",
        "getImageUrl",
        "getImageUrl$annotations",
        "getVideoUrl",
        "getVideoUrl$annotations",
        "getEquipmentTitle",
        "getEquipmentTitle$annotations",
        "getEquipmentBody",
        "getEquipmentBody$annotations",
        "getMuscleGroupsTitle",
        "getMuscleGroupsTitle$annotations",
        "getMuscleGroupsBody",
        "getMuscleGroupsBody$annotations",
        "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;",
        "getCustomExerciseInfo",
        "getCustomExerciseInfo$annotations",
        "getVolumeInputFormat",
        "getVolumeInputFormat$annotations",
        "Companion",
        "$serializer",
        "a",
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

.field public static final Companion:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$a;


# instance fields
.field private final customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

.field private final equipmentBody:Ljava/lang/String;

.field private final equipmentTitle:Ljava/lang/String;

.field private final exerciseId:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final instructions:Ljava/lang/String;

.field private final muscleGroupsBody:Ljava/lang/String;

.field private final muscleGroupsTitle:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final videoUrl:Ljava/lang/String;

.field private final volumeInputFormat:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->Companion:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    if-nez p13, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p13, 0x0

    if-nez p2, :cond_1

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    :goto_8
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-object p13, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    return-void

    :cond_a
    iput-object p12, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)V
    .locals 1

    const-string v0, "exerciseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    .line 11
    iput-object p6, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    .line 13
    iput-object p8, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    .line 14
    iput-object p9, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    .line 15
    iput-object p10, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    .line 16
    iput-object p11, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    .line 17
    const-string p1, ""

    :cond_0
    and-int/lit8 p13, p12, 0x2

    const/4 v0, 0x0

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move-object p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move-object p13, v0

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_a
    move-object p13, p11

    move-object p12, p10

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 18
    :goto_0
    invoke-direct/range {p2 .. p13}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

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

.method public static synthetic getEquipmentBody$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "equipment_body"
    .end annotation

    return-void
.end method

.method public static synthetic getEquipmentTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "equipment_title"
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

.method public static synthetic getImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getMuscleGroupsBody$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "muscle_groups_body"
    .end annotation

    return-void
.end method

.method public static synthetic getMuscleGroupsTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "muscle_groups_title"
    .end annotation

    return-void
.end method

.method public static synthetic getVideoUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "video_url"
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

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    if-eqz v1, :cond_15

    :goto_a
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;
    .locals 13

    const-string v0, "exerciseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCustomExerciseInfo()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    return-object v0
.end method

.method public final getEquipmentBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getEquipmentTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstructions()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    return-object v0
.end method

.method public final getMuscleGroupsBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getMuscleGroupsTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeInputFormat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->exerciseId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->instructions:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->imageUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->videoUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->equipmentBody:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsTitle:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->muscleGroupsBody:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->customExerciseInfo:Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    iget-object v10, p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->volumeInputFormat:Ljava/lang/String;

    const-string v11, ", instructions="

    const-string v12, ", name="

    const-string v13, "ExerciseInstructionsModel(exerciseId="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl="

    const-string v11, ", videoUrl="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", equipmentTitle="

    const-string v2, ", equipmentBody="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", muscleGroupsTitle="

    const-string v2, ", muscleGroupsBody="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customExerciseInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", volumeInputFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v10, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
