.class public final Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 W2\u00020\u0001:\u0002XWB\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00a7\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0010\u0010%\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\"J\u00a6\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00072\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00072\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010=\u0012\u0004\u0008B\u0010@\u001a\u0004\u0008A\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010=\u0012\u0004\u0008D\u0010@\u001a\u0004\u0008C\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010=\u0012\u0004\u0008F\u0010@\u001a\u0004\u0008E\u0010\u001dR&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010G\u0012\u0004\u0008I\u0010@\u001a\u0004\u0008H\u0010\"R&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010G\u0012\u0004\u0008K\u0010@\u001a\u0004\u0008J\u0010\"R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010G\u0012\u0004\u0008M\u0010@\u001a\u0004\u0008L\u0010\"R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010N\u0012\u0004\u0008P\u0010@\u001a\u0004\u0008O\u0010&R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010G\u0012\u0004\u0008R\u0010@\u001a\u0004\u0008Q\u0010\"R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010S\u0012\u0004\u0008U\u0010@\u001a\u0004\u0008T\u0010)R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010G\u001a\u0004\u0008V\u0010\"\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;",
        "",
        "",
        "workoutLibraryTitle",
        "whoopWorkoutsTitle",
        "myWorkoutsTitle",
        "myWorkoutsCtaText",
        "",
        "Lcom/whoop/design/models/items/ArticleTileModel;",
        "whoopWorkoutsList",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;",
        "myWorkoutsList",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "myWorkoutHeaderItems",
        "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;",
        "myWorkoutsEmptyState",
        "myProgress",
        "Lcom/whoop/weightlifting/data/dto/MetaData;",
        "metadata",
        "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;",
        "metadataList",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;",
        "component9",
        "component10",
        "()Lcom/whoop/weightlifting/data/dto/MetaData;",
        "component11",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;",
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
        "(Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getWorkoutLibraryTitle",
        "getWorkoutLibraryTitle$annotations",
        "()V",
        "getWhoopWorkoutsTitle",
        "getWhoopWorkoutsTitle$annotations",
        "getMyWorkoutsTitle",
        "getMyWorkoutsTitle$annotations",
        "getMyWorkoutsCtaText",
        "getMyWorkoutsCtaText$annotations",
        "Ljava/util/List;",
        "getWhoopWorkoutsList",
        "getWhoopWorkoutsList$annotations",
        "getMyWorkoutsList",
        "getMyWorkoutsList$annotations",
        "getMyWorkoutHeaderItems",
        "getMyWorkoutHeaderItems$annotations",
        "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;",
        "getMyWorkoutsEmptyState",
        "getMyWorkoutsEmptyState$annotations",
        "getMyProgress",
        "getMyProgress$annotations",
        "Lcom/whoop/weightlifting/data/dto/MetaData;",
        "getMetadata",
        "getMetadata$annotations",
        "getMetadataList",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$Companion;


# instance fields
.field private final metadata:Lcom/whoop/weightlifting/data/dto/MetaData;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final metadataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;",
            ">;"
        }
    .end annotation
.end field

.field private final myProgress:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "my_progress"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final myWorkoutHeaderItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "my_workouts_header_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final myWorkoutsCtaText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "my_workouts_ctatext"
    .end annotation
.end field

.field private final myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "my_workouts_empty_state"
    .end annotation
.end field

.field private final myWorkoutsList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "my_workouts_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;",
            ">;"
        }
    .end annotation
.end field

.field private final myWorkoutsTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "my_workouts_title"
    .end annotation
.end field

.field private final whoopWorkoutsList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whoop_workouts_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ArticleTileModel;",
            ">;"
        }
    .end annotation
.end field

.field private final whoopWorkoutsTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whoop_workouts_title"
    .end annotation
.end field

.field private final workoutLibraryTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_library_title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->Companion:Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lku2/a;

    invoke-direct {v3, v0}, Lku2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lku2/a;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lku2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lku2/a;

    const/16 v7, 0xa

    invoke-direct {v6, v7}, Lku2/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v8, Lku2/a;

    const/16 v9, 0xb

    invoke-direct {v8, v9}, Lku2/a;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    new-instance v10, Lku2/a;

    const/16 v11, 0xc

    invoke-direct {v10, v11}, Lku2/a;-><init>(I)V

    invoke-static {v2, v10}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v9, v9, [Ll83/h;

    const/4 v10, 0x0

    aput-object v1, v9, v10

    const/4 v10, 0x1

    aput-object v1, v9, v10

    const/4 v10, 0x2

    aput-object v1, v9, v10

    const/4 v10, 0x3

    aput-object v1, v9, v10

    const/4 v10, 0x4

    aput-object v3, v9, v10

    const/4 v3, 0x5

    aput-object v4, v9, v3

    const/4 v3, 0x6

    aput-object v6, v9, v3

    const/4 v3, 0x7

    aput-object v1, v9, v3

    aput-object v8, v9, v0

    aput-object v1, v9, v5

    aput-object v2, v9, v7

    sput-object v9, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x1bf

    const/16 v0, 0x1bf

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    :goto_0
    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    iput-object p10, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    goto :goto_1

    :cond_2
    iput-object p11, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    :goto_1
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    return-void

    :cond_3
    iput-object p12, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ArticleTileModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/MetaData;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "workoutLibraryTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopWorkoutsTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWorkoutsTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopWorkoutsList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWorkoutsList"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWorkoutsEmptyState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    .line 11
    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    .line 13
    iput-object p11, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x40

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_1

    move-object p10, v0

    :cond_1
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_2

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/ArticleTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

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

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metadata"
    .end annotation

    return-void
.end method

.method public static synthetic getMyProgress$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "my_progress"
    .end annotation

    return-void
.end method

.method public static synthetic getMyWorkoutHeaderItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "my_workouts_header_items"
    .end annotation

    return-void
.end method

.method public static synthetic getMyWorkoutsCtaText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "my_workouts_ctatext"
    .end annotation

    return-void
.end method

.method public static synthetic getMyWorkoutsEmptyState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "my_workouts_empty_state"
    .end annotation

    return-void
.end method

.method public static synthetic getMyWorkoutsList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "my_workouts_list"
    .end annotation

    return-void
.end method

.method public static synthetic getMyWorkoutsTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "my_workouts_title"
    .end annotation

    return-void
.end method

.method public static synthetic getWhoopWorkoutsList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "whoop_workouts_list"
    .end annotation

    return-void
.end method

.method public static synthetic getWhoopWorkoutsTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "whoop_workouts_title"
    .end annotation

    return-void
.end method

.method public static synthetic getWorkoutLibraryTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_library_title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/weightlifting/data/dto/MetaData$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/MetaData$$serializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/weightlifting/data/dto/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ArticleTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ArticleTileModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/MetaData;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;",
            ">;)",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;"
        }
    .end annotation

    const-string v0, "workoutLibraryTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopWorkoutsTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWorkoutsTitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopWorkoutsList"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWorkoutsList"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myWorkoutsEmptyState"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v5, p4

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getMetadata()Lcom/whoop/weightlifting/data/dto/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-object v0
.end method

.method public final getMetadataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryMetadataListItemDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    return-object v0
.end method

.method public final getMyProgress()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    return-object v0
.end method

.method public final getMyWorkoutHeaderItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    return-object v0
.end method

.method public final getMyWorkoutsCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getMyWorkoutsEmptyState()Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    return-object v0
.end method

.method public final getMyWorkoutsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateOverviewDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    return-object v0
.end method

.method public final getMyWorkoutsTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhoopWorkoutsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/ArticleTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    return-object v0
.end method

.method public final getWhoopWorkoutsTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkoutLibraryTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/MetaData;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->workoutLibraryTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsCtaText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->whoopWorkoutsList:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsList:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutHeaderItems:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myWorkoutsEmptyState:Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;

    iget-object v8, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->myProgress:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    iget-object v10, p0, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->metadataList:Ljava/util/List;

    const-string v11, ", whoopWorkoutsTitle="

    const-string v12, ", myWorkoutsTitle="

    const-string v13, "WorkoutLibraryModel(workoutLibraryTitle="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", myWorkoutsCtaText="

    const-string v11, ", whoopWorkoutsList="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", myWorkoutsList="

    const-string v2, ", myWorkoutHeaderItems="

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", myWorkoutsEmptyState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", myProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadataList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
