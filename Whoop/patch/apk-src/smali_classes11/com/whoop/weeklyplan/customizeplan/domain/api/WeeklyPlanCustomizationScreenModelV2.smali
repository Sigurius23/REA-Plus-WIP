.class public final Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$$serializer;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u0093\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0010\u0010%\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u009a\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010=\u001a\u0004\u0008>\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010?\u001a\u0004\u0008@\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010?\u001a\u0004\u0008A\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010B\u001a\u0004\u0008C\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008D\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010B\u001a\u0004\u0008E\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008F\u0010 R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008G\u0010 R\u0017\u0010\r\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008H\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010B\u001a\u0004\u0008I\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010L\u001a\u0004\u0008M\u0010*\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
        "",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "goal",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;",
        "sliderContent",
        "toggleContent",
        "",
        "navigationTitleDisplay",
        "navigationSubtitleDisplay",
        "title",
        "description",
        "buttonDescriptionDisplay",
        "continueButtonDisplay",
        "skipButtonDisplay",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
        "smartAlarmOverride",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;",
        "tipContent",
        "<init>",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "component2",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;",
        "component3",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
        "component12",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;",
        "copy",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;",
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
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "getGoal",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;",
        "getSliderContent",
        "getToggleContent",
        "Ljava/lang/String;",
        "getNavigationTitleDisplay",
        "getNavigationSubtitleDisplay",
        "getTitle",
        "getDescription",
        "getButtonDescriptionDisplay",
        "getContinueButtonDisplay",
        "getSkipButtonDisplay",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;",
        "getSmartAlarmOverride",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;",
        "getTipContent",
        "Companion",
        "$serializer",
        "weekly-plan_release"
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

.field public static final Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$Companion;


# instance fields
.field private final buttonDescriptionDisplay:Ljava/lang/String;

.field private final continueButtonDisplay:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

.field private final navigationSubtitleDisplay:Ljava/lang/String;

.field private final navigationTitleDisplay:Ljava/lang/String;

.field private final skipButtonDisplay:Ljava/lang/String;

.field private final sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

.field private final smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

.field private final tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

.field private final title:Ljava/lang/String;

.field private final toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xc

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    const/4 v0, 0x7

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    const/16 v0, 0xb

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$$serializer;

    invoke-virtual {p14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iput-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    iput-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    iput-object p13, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)V
    .locals 1

    const-string v0, "goal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "continueButtonDisplay"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    .line 14
    iput-object p12, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType$Companion;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    :cond_b
    move-object p13, p11

    move-object p14, p12

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

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->copy(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContentSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    const/16 v2, 0xa

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    const/16 v1, 0xb

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    return-object v0
.end method

.method public final component12()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    return-object v0
.end method

.method public final component2()Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;
    .locals 14

    const-string v0, "goal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationTitleDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "continueButtonDisplay"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    iget-object p1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getButtonDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getContinueButtonDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-object v0
.end method

.method public final getNavigationSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSkipButtonDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSliderContent()Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    return-object v0
.end method

.method public final getSmartAlarmOverride()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    return-object v0
.end method

.method public final getTipContent()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggleContent()Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

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

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->goal:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->sliderContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->toggleContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/GoalScreenContent;

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationTitleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->navigationSubtitleDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->title:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->description:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->buttonDescriptionDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->continueButtonDisplay:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->skipButtonDisplay:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->smartAlarmOverride:Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;

    iget-object v11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;->tipContent:Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "WeeklyPlanCustomizationScreenModelV2(goal="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sliderContent="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", toggleContent="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationTitleDisplay="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationSubtitleDisplay="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    const-string v1, ", description="

    invoke-static {v12, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", buttonDescriptionDisplay="

    const-string v1, ", continueButtonDisplay="

    invoke-static {v12, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", skipButtonDisplay="

    const-string v1, ", smartAlarmOverride="

    invoke-static {v12, v8, v0, v9, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tipContent="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
