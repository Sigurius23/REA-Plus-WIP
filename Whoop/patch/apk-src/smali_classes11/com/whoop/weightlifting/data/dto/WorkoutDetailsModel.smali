.class public final Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bw\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0018J\u0010\u0010!\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"Jl\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00107\u0012\u0004\u00089\u0010:\u001a\u0004\u00088\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00107\u0012\u0004\u0008<\u0010:\u001a\u0004\u0008;\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00107\u0012\u0004\u0008>\u0010:\u001a\u0004\u0008=\u0010\u0018R&\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010?\u0012\u0004\u0008A\u0010:\u001a\u0004\u0008@\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010B\u0012\u0004\u0008D\u0010:\u001a\u0004\u0008C\u0010\u001eR&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010?\u0012\u0004\u0008F\u0010:\u001a\u0004\u0008E\u0010\u001cR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u00107\u0012\u0004\u0008H\u0010:\u001a\u0004\u0008G\u0010\u0018R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010I\u0012\u0004\u0008K\u0010:\u001a\u0004\u0008J\u0010\"\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "callToActionDisplay",
        "detailsPageTitle",
        "exerciseListTitleDisplay",
        "",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "exercises",
        "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
        "prebuiltTemplateDetailsHeader",
        "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
        "workoutMetadataDescriptions",
        "workoutSummaryDisplay",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "workoutTemplate",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
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
        "(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getCallToActionDisplay",
        "getCallToActionDisplay$annotations",
        "()V",
        "getDetailsPageTitle",
        "getDetailsPageTitle$annotations",
        "getExerciseListTitleDisplay",
        "getExerciseListTitleDisplay$annotations",
        "Ljava/util/List;",
        "getExercises",
        "getExercises$annotations",
        "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
        "getPrebuiltTemplateDetailsHeader",
        "getPrebuiltTemplateDetailsHeader$annotations",
        "getWorkoutMetadataDescriptions",
        "getWorkoutMetadataDescriptions$annotations",
        "getWorkoutSummaryDisplay",
        "getWorkoutSummaryDisplay$annotations",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "getWorkoutTemplate",
        "getWorkoutTemplate$annotations",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$Companion;


# instance fields
.field private final callToActionDisplay:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "call_to_action_display"
    .end annotation
.end field

.field private final detailsPageTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "details_page_title"
    .end annotation
.end field

.field private final exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_list_title_display"
    .end annotation
.end field

.field private final exercises:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercises"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ">;"
        }
    .end annotation
.end field

.field private final prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "prebuilt_template_details_header"
    .end annotation
.end field

.field private final workoutMetadataDescriptions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_metadata_descriptions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
            ">;"
        }
    .end annotation
.end field

.field private final workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_summary_display"
    .end annotation
.end field

.field private final workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_template"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->Companion:Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lku2/a;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lku2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lku2/a;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lku2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const/4 v5, 0x2

    aput-object v1, v0, v5

    const/4 v5, 0x3

    aput-object v3, v0, v5

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v2, v0, v3

    aput-object v1, v0, v4

    aput-object v1, v0, v6

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            ")V"
        }
    .end annotation

    const-string v0, "callToActionDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsPageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseListTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exercises"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prebuiltTemplateDetailsHeader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutMetadataDescriptions"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutSummaryDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutTemplate"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCallToActionDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "call_to_action_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDetailsPageTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "details_page_title"
    .end annotation

    return-void
.end method

.method public static synthetic getExerciseListTitleDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercise_list_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getExercises$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercises"
    .end annotation

    return-void
.end method

.method public static synthetic getPrebuiltTemplateDetailsHeader$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "prebuilt_template_details_header"
    .end annotation

    return-void
.end method

.method public static synthetic getWorkoutMetadataDescriptions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_metadata_descriptions"
    .end annotation

    return-void
.end method

.method public static synthetic getWorkoutSummaryDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_summary_display"
    .end annotation

    return-void
.end method

.method public static synthetic getWorkoutTemplate$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_template"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$$serializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto$$serializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            ")",
            "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;"
        }
    .end annotation

    const-string v0, "callToActionDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsPageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseListTitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exercises"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prebuiltTemplateDetailsHeader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutMetadataDescriptions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutSummaryDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutTemplate"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCallToActionDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDetailsPageTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getExerciseListTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getExercises()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    return-object v0
.end method

.method public final getPrebuiltTemplateDetailsHeader()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    return-object v0
.end method

.method public final getWorkoutMetadataDescriptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    return-object v0
.end method

.method public final getWorkoutSummaryDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWorkoutTemplate()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->callToActionDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->detailsPageTitle:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exerciseListTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->exercises:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->prebuiltTemplateDetailsHeader:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    iget-object v5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutMetadataDescriptions:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutSummaryDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->workoutTemplate:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    const-string v8, ", detailsPageTitle="

    const-string v9, ", exerciseListTitleDisplay="

    const-string v10, "WorkoutDetailsModel(callToActionDisplay="

    invoke-static {v10, v0, v8, v1, v9}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exercises="

    const-string v8, ", prebuiltTemplateDetailsHeader="

    invoke-static {v2, v1, v8, v0, v3}, Ljh3/c;->n(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutMetadataDescriptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutSummaryDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutTemplate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
