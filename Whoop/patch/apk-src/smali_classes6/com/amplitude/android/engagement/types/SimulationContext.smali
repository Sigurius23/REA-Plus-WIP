.class public final Lcom/amplitude/android/engagement/types/SimulationContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 d2\u00020\u0001:\u0002efB\u00a7\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB\u00b9\u0001\u0008\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001c\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010+J\u0010\u0010-\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010+J\u0010\u0010.\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010+J\u0010\u0010/\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010+J\u0010\u00100\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010+J\u0010\u00101\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010+J\u0010\u00102\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010+J\u0010\u00103\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010+J\u0012\u00104\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00105J\u0010\u00107\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010+J\u0010\u00108\u001a\u00020\u0018H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u00cc\u0001\u0010<\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\n2\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u00c6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u0008>\u00109J\u0010\u0010?\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010)J\u001a\u0010A\u001a\u00020\n2\u0008\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ(\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u00c7\u0001\u00a2\u0006\u0004\u0008I\u0010JR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010K\u001a\u0004\u0008L\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010M\u001a\u0004\u0008N\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010O\u001a\u0004\u0008P\u0010\'R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010Q\u001a\u0004\u0008R\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010S\u001a\u0004\u0008T\u0010+R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010S\u001a\u0004\u0008U\u0010+R\u0017\u0010\r\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010S\u001a\u0004\u0008V\u0010+R\u0017\u0010\u000e\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010S\u001a\u0004\u0008W\u0010+R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010S\u001a\u0004\u0008X\u0010+R\u0017\u0010\u0010\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010S\u001a\u0004\u0008Y\u0010+R\u0017\u0010\u0011\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010S\u001a\u0004\u0008Z\u0010+R\u0017\u0010\u0012\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010S\u001a\u0004\u0008\u0012\u0010+R\u0017\u0010\u0013\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010S\u001a\u0004\u0008[\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\\\u001a\u0004\u0008]\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\\\u001a\u0004\u0008^\u00105R\u0017\u0010\u0017\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010S\u001a\u0004\u0008_\u0010+R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010`\u001a\u0004\u0008a\u00109R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010b\u001a\u0004\u0008c\u0010;\u00a8\u0006g"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/SimulationContext;",
        "",
        "Lcom/amplitude/android/engagement/types/TriggerEvent;",
        "lastTriggerEvent",
        "Lcom/amplitude/android/engagement/types/Nudge;",
        "simulatedNudge",
        "Lcom/amplitude/android/engagement/types/LastEvent;",
        "lastEvent",
        "",
        "currentStepIndex",
        "",
        "passesCooldown",
        "passesSnoozedConditions",
        "passesPageTargeting",
        "passesPinnedElement",
        "shouldTemporarilyHide",
        "passesTriggerMatch",
        "passesClickedElement",
        "isAnchorableStep",
        "passesCustomThrottles",
        "Lcom/amplitude/android/engagement/types/ThrottleLimit;",
        "surveyThrottleLimit",
        "guideThrottleLimit",
        "bypassCustomThrottles",
        "",
        "screen",
        "Lcom/amplitude/android/engagement/types/EndUser;",
        "endUser",
        "<init>",
        "(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)V",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/amplitude/android/engagement/types/TriggerEvent;",
        "component2",
        "()Lcom/amplitude/android/engagement/types/Nudge;",
        "component3",
        "()Lcom/amplitude/android/engagement/types/LastEvent;",
        "component4",
        "()I",
        "component5",
        "()Z",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "()Lcom/amplitude/android/engagement/types/ThrottleLimit;",
        "component15",
        "component16",
        "component17",
        "()Ljava/lang/String;",
        "component18",
        "()Lcom/amplitude/android/engagement/types/EndUser;",
        "copy",
        "(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)Lcom/amplitude/android/engagement/types/SimulationContext;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/SimulationContext;Lzc3/c;Lyc3/g;)V",
        "Lcom/amplitude/android/engagement/types/TriggerEvent;",
        "getLastTriggerEvent",
        "Lcom/amplitude/android/engagement/types/Nudge;",
        "getSimulatedNudge",
        "Lcom/amplitude/android/engagement/types/LastEvent;",
        "getLastEvent",
        "I",
        "getCurrentStepIndex",
        "Z",
        "getPassesCooldown",
        "getPassesSnoozedConditions",
        "getPassesPageTargeting",
        "getPassesPinnedElement",
        "getShouldTemporarilyHide",
        "getPassesTriggerMatch",
        "getPassesClickedElement",
        "getPassesCustomThrottles",
        "Lcom/amplitude/android/engagement/types/ThrottleLimit;",
        "getSurveyThrottleLimit",
        "getGuideThrottleLimit",
        "getBypassCustomThrottles",
        "Ljava/lang/String;",
        "getScreen",
        "Lcom/amplitude/android/engagement/types/EndUser;",
        "getEndUser",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/e1",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Lcom/amplitude/android/engagement/types/e1;


# instance fields
.field private final bypassCustomThrottles:Z

.field private final currentStepIndex:I

.field private final endUser:Lcom/amplitude/android/engagement/types/EndUser;

.field private final guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

.field private final isAnchorableStep:Z

.field private final lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

.field private final lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

.field private final passesClickedElement:Z

.field private final passesCooldown:Z

.field private final passesCustomThrottles:Z

.field private final passesPageTargeting:Z

.field private final passesPinnedElement:Z

.field private final passesSnoozedConditions:Z

.field private final passesTriggerMatch:Z

.field private final screen:Ljava/lang/String;

.field private final shouldTemporarilyHide:Z

.field private final simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

.field private final surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/e1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/SimulationContext;->Companion:Lcom/amplitude/android/engagement/types/e1;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    const v0, 0x39ffa

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SimulationContext$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    :goto_0
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    :goto_1
    iput p5, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    iput-boolean p6, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    iput-boolean p7, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    iput-boolean p8, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    iput-boolean p9, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    iput-boolean p10, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    iput-boolean p11, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    iput-boolean p12, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    iput-boolean p13, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    move/from16 p2, p14

    iput-boolean p2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    goto :goto_2

    :cond_3
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    :goto_2
    and-int/lit16 p1, p1, 0x4000

    if-nez p1, :cond_4

    iput-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    :goto_3
    move/from16 p1, p17

    goto :goto_4

    :cond_4
    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    goto :goto_3

    :goto_4
    iput-boolean p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)V
    .locals 3

    move-object/from16 v0, p17

    move-object/from16 v1, p18

    const-string v2, "simulatedNudge"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "screen"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "endUser"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    .line 4
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    .line 5
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    .line 6
    iput p4, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    .line 7
    iput-boolean p5, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    .line 8
    iput-boolean p6, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    .line 9
    iput-boolean p7, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    .line 10
    iput-boolean p8, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    .line 11
    iput-boolean p9, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    .line 12
    iput-boolean p10, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    .line 13
    iput-boolean p11, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    .line 14
    iput-boolean p12, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    move/from16 p1, p13

    .line 15
    iput-boolean p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    move/from16 p1, p16

    .line 18
    iput-boolean p1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    .line 19
    iput-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    .line 20
    iput-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_2

    move-object/from16 v17, v2

    goto :goto_2

    :cond_2
    move-object/from16 v17, p14

    :goto_2
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_3

    move-object/from16 v18, v2

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v16, p13

    move/from16 v19, p16

    move-object/from16 v20, p17

    move-object/from16 v21, p18

    goto :goto_4

    :cond_3
    move-object/from16 v18, p15

    goto :goto_3

    .line 21
    :goto_4
    invoke-direct/range {v3 .. v21}, Lcom/amplitude/android/engagement/types/SimulationContext;-><init>(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/SimulationContext;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move/from16 p17, p2

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/amplitude/android/engagement/types/SimulationContext;->copy(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)Lcom/amplitude/android/engagement/types/SimulationContext;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/SimulationContext;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/amplitude/android/engagement/types/LastEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/LastEvent$$serializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    iget v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x8

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x9

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0xa

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0xb

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0xc

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ThrottleLimit$$serializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xf

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x10

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/amplitude/android/engagement/types/EndUser$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/EndUser$$serializer;

    iget-object p0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    const/16 v1, 0x11

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/amplitude/android/engagement/types/TriggerEvent;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    return v0
.end method

.method public final component14()Lcom/amplitude/android/engagement/types/ThrottleLimit;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    return-object v0
.end method

.method public final component15()Lcom/amplitude/android/engagement/types/ThrottleLimit;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    return v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Lcom/amplitude/android/engagement/types/EndUser;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    return-object v0
.end method

.method public final component2()Lcom/amplitude/android/engagement/types/Nudge;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    return-object v0
.end method

.method public final component3()Lcom/amplitude/android/engagement/types/LastEvent;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    return v0
.end method

.method public final copy(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)Lcom/amplitude/android/engagement/types/SimulationContext;
    .locals 20

    const-string v0, "simulatedNudge"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screen"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endUser"

    move-object/from16 v2, p18

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/amplitude/android/engagement/types/SimulationContext;

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, v2

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v19}, Lcom/amplitude/android/engagement/types/SimulationContext;-><init>(Lcom/amplitude/android/engagement/types/TriggerEvent;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/LastEvent;IZZZZZZZZZLcom/amplitude/android/engagement/types/ThrottleLimit;Lcom/amplitude/android/engagement/types/ThrottleLimit;ZLjava/lang/String;Lcom/amplitude/android/engagement/types/EndUser;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/SimulationContext;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/SimulationContext;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    iget v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getBypassCustomThrottles()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    return v0
.end method

.method public final getCurrentStepIndex()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    return v0
.end method

.method public final getEndUser()Lcom/amplitude/android/engagement/types/EndUser;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    return-object v0
.end method

.method public final getGuideThrottleLimit()Lcom/amplitude/android/engagement/types/ThrottleLimit;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    return-object v0
.end method

.method public final getLastEvent()Lcom/amplitude/android/engagement/types/LastEvent;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    return-object v0
.end method

.method public final getLastTriggerEvent()Lcom/amplitude/android/engagement/types/TriggerEvent;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    return-object v0
.end method

.method public final getPassesClickedElement()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    return v0
.end method

.method public final getPassesCooldown()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    return v0
.end method

.method public final getPassesCustomThrottles()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    return v0
.end method

.method public final getPassesPageTargeting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    return v0
.end method

.method public final getPassesPinnedElement()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    return v0
.end method

.method public final getPassesSnoozedConditions()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    return v0
.end method

.method public final getPassesTriggerMatch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    return v0
.end method

.method public final getScreen()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldTemporarilyHide()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    return v0
.end method

.method public final getSimulatedNudge()Lcom/amplitude/android/engagement/types/Nudge;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    return-object v0
.end method

.method public final getSurveyThrottleLimit()Lcom/amplitude/android/engagement/types/ThrottleLimit;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/TriggerEvent;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/Nudge;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/LastEvent;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    invoke-static {v0, v3, v2}, Ld;->b(III)I

    move-result v0

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    move v3, v4

    :cond_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    if-eqz v3, :cond_3

    move v3, v4

    :cond_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    if-eqz v3, :cond_4

    move v3, v4

    :cond_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    if-eqz v3, :cond_5

    move v3, v4

    :cond_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    if-eqz v3, :cond_6

    move v3, v4

    :cond_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    if-eqz v3, :cond_7

    move v3, v4

    :cond_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    if-eqz v3, :cond_8

    move v3, v4

    :cond_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    if-eqz v3, :cond_9

    move v3, v4

    :cond_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    if-eqz v3, :cond_a

    move v3, v4

    :cond_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_2

    :cond_b
    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/ThrottleLimit;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    if-nez v3, :cond_c

    goto :goto_3

    :cond_c
    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/ThrottleLimit;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    if-eqz v1, :cond_d

    goto :goto_4

    :cond_d
    move v4, v1

    :goto_4
    add-int/2addr v0, v4

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/EndUser;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isAnchorableStep()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SimulationContext(lastTriggerEvent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastTriggerEvent:Lcom/amplitude/android/engagement/types/TriggerEvent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", simulatedNudge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->simulatedNudge:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->lastEvent:Lcom/amplitude/android/engagement/types/LastEvent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentStepIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->currentStepIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", passesCooldown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCooldown:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passesSnoozedConditions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesSnoozedConditions:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passesPageTargeting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPageTargeting:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passesPinnedElement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesPinnedElement:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldTemporarilyHide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->shouldTemporarilyHide:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passesTriggerMatch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesTriggerMatch:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passesClickedElement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesClickedElement:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isAnchorableStep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", passesCustomThrottles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->passesCustomThrottles:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", surveyThrottleLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->surveyThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", guideThrottleLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->guideThrottleLimit:Lcom/amplitude/android/engagement/types/ThrottleLimit;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bypassCustomThrottles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->bypassCustomThrottles:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", screen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->screen:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SimulationContext;->endUser:Lcom/amplitude/android/engagement/types/EndUser;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
