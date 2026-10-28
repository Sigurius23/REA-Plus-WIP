.class public final Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 c2\u00020\u0001:\u0002dcB\u00a3\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00b7\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0019\u0010\u001eJ\r\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010*J\u0010\u0010/\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010%J\u0010\u00102\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00100J\u0012\u00103\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010%J\u0012\u00105\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u00cc\u0001\u00109\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008;\u0010%J\u0010\u0010<\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u001a\u0010?\u001a\u00020\t2\u0008\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001\u00a2\u0006\u0004\u0008G\u0010HR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010J\u001a\u0004\u0008K\u0010#\"\u0004\u0008L\u0010MR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010N\u001a\u0004\u0008O\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010N\u001a\u0004\u0008P\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010N\u001a\u0004\u0008Q\u0010%R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010N\u001a\u0004\u0008R\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010S\u001a\u0004\u0008T\u0010*R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010U\u001a\u0004\u0008V\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010N\u001a\u0004\u0008W\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010S\u001a\u0004\u0008X\u0010*R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010Y\u001a\u0004\u0008Z\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010N\u001a\u0004\u0008[\u0010%R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010Y\u001a\u0004\u0008\\\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010N\u001a\u0004\u0008]\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010N\u001a\u0004\u0008^\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010_\u001a\u0004\u0008`\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010a\u001a\u0004\u0008b\u00108\u00a8\u0006e"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;",
        "",
        "",
        "id",
        "",
        "description",
        "title",
        "questionText",
        "status",
        "",
        "sticky",
        "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "magnitude",
        "category",
        "deprecated",
        "",
        "createdAt",
        "timeLabel",
        "updatedAt",
        "timeContextLabel",
        "questionType",
        "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;",
        "weeklyPlanGoal",
        "Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;",
        "destination",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "toJournalBehaviorTracker",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "component1",
        "()Ljava/lang/Integer;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Boolean;",
        "component7",
        "()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "component8",
        "component9",
        "component10",
        "()D",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;",
        "component16",
        "()Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;",
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
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/Integer;",
        "getId",
        "setId",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/String;",
        "getDescription",
        "getTitle",
        "getQuestionText",
        "getStatus",
        "Ljava/lang/Boolean;",
        "getSticky",
        "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;",
        "getMagnitude",
        "getCategory",
        "getDeprecated",
        "D",
        "getCreatedAt",
        "getTimeLabel",
        "getUpdatedAt",
        "getTimeContextLabel",
        "getQuestionType",
        "Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;",
        "getWeeklyPlanGoal",
        "Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;",
        "getDestination",
        "Companion",
        "$serializer",
        "core_release"
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$Companion;


# instance fields
.field private final category:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "category"
    .end annotation
.end field

.field private final createdAt:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final deprecated:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deprecated"
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private final destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "destination"
    .end annotation
.end field

.field private id:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "magnitude"
    .end annotation
.end field

.field private final questionText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "question_text"
    .end annotation
.end field

.field private final questionType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "question_type"
    .end annotation
.end field

.field private final status:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "status"
    .end annotation
.end field

.field private final sticky:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sticky"
    .end annotation
.end field

.field private final timeContextLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_context_label"
    .end annotation
.end field

.field private final timeLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_label"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final updatedAt:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weekly_plan_goal"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->Companion:Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$$serializer;

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    iput-wide p11, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    iput-object p13, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    move-wide/from16 p1, p14

    iput-wide p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    .line 12
    iput-wide p10, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    .line 13
    iput-object p12, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    .line 14
    iput-wide p13, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    .line 15
    iput-object p15, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-wide v11, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    goto :goto_9

    :cond_9
    move-wide/from16 v11, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-wide v14, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    goto :goto_b

    :cond_b
    move-wide/from16 v14, p13

    :goto_b
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p15

    :goto_c
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p16

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    move-object/from16 p19, v1

    :goto_f
    move-object/from16 p16, p2

    move-object/from16 p17, p3

    move-object/from16 p18, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-wide/from16 p14, v14

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move-object/from16 p19, p18

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto$$serializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    const/4 v4, 0x6

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-wide v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    iget-wide v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    const/16 v2, 0xe

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto$$serializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    const/16 v1, 0xf

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    return-wide v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    return-wide v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    return-object v0
.end method

.method public final component16()Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;
    .locals 19

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-object/from16 v12, p12

    move-wide/from16 v13, p13

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;Ljava/lang/String;Ljava/lang/Boolean;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    return-wide v0
.end method

.method public final getDeprecated()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    return-object v0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMagnitude()Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    return-object v0
.end method

.method public final getQuestionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuestionType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getSticky()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTimeContextLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    return-wide v0
.end method

.method public final getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

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

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    if-nez v3, :cond_c

    move v3, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    if-nez v2, :cond_d

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    return v0
.end method

.method public final setId(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    return-void
.end method

.method public final toJournalBehaviorTracker()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;
    .locals 21

    move-object/from16 v0, p0

    new-instance v1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v4, v3

    goto :goto_0

    :cond_0
    move v2, v3

    move v4, v2

    :goto_0
    iget-object v3, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    move v5, v4

    iget-object v4, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    move v6, v5

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    if-nez v7, :cond_1

    const-string v7, ""

    :cond_1
    iget-object v8, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_1

    :cond_2
    move v8, v6

    :goto_1
    iget-object v9, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    const/4 v10, 0x0

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;->toJournalMagnitude()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    move-result-object v9

    goto :goto_2

    :cond_3
    move-object v9, v10

    :goto_2
    iget-object v11, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v12}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    if-eqz v13, :cond_4

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    move-object v14, v10

    move-object v10, v12

    iget-wide v12, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    move-object/from16 v16, v14

    iget-wide v14, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    invoke-static {v1}, Lcom/whoop/data/remote/domain/dto/JournalResponseDtoKt;->access$convertToQuestionTypeEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-result-object v1

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;->toWeeklyPlanGoal()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_3

    :cond_5
    move-object/from16 v20, v16

    :goto_3
    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;->toBehaviorTrackerDestination()Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    move-result-object v1

    move-object/from16 v16, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v16

    move-object/from16 v16, v11

    move-object v11, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-object/from16 v9, v16

    :goto_4
    move-object/from16 v16, v18

    move-object/from16 v18, v20

    goto :goto_5

    :cond_6
    move-object v1, v11

    move-object v11, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-object v9, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v16

    goto :goto_4

    :goto_5
    invoke-direct/range {v1 .. v19}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->id:Ljava/lang/Integer;

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->description:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->title:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionText:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->status:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->sticky:Ljava/lang/Boolean;

    iget-object v7, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->magnitude:Lcom/whoop/data/remote/domain/dto/JournalMagnitudeDto;

    iget-object v8, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->category:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->deprecated:Ljava/lang/Boolean;

    iget-wide v10, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->createdAt:D

    iget-object v12, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeLabel:Ljava/lang/String;

    iget-wide v13, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->updatedAt:D

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->timeContextLabel:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->questionType:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/dto/WeeklyPlanGoalDto;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->destination:Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;

    const-string v0, ", description="

    move-object/from16 v19, v15

    const-string v15, ", title="

    move-wide/from16 v20, v13

    const-string v13, "JournalBehaviorTrackerDto(id="

    invoke-static {v13, v0, v1, v2, v15}, Lr80/c;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", questionText="

    const-string v2, ", status="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", sticky="

    const-string v2, ", magnitude="

    invoke-static {v6, v5, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deprecated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", timeLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", timeContextLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
