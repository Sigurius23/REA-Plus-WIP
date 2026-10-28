.class public final Lcom/amplitude/android/engagement/types/Nudge;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/Nudge$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 s2\u00020\u0001:\u0002tuB\u00d1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008!\u0010\"B\u00df\u0001\u0008\u0017\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008!\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0010\u00106\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00088\u00105J\u0010\u00109\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00089\u00105J\u0010\u0010:\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00105J\u0010\u0010;\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010(J\u0010\u0010<\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u00103J\u0010\u0010?\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010(J\u0012\u0010@\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010EJ\u00ee\u0001\u0010G\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00022\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001eH\u00c6\u0001\u00a2\u0006\u0004\u0008G\u0010HJ\u0010\u0010I\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008I\u0010(J\u0010\u0010J\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008J\u0010*J\u001a\u0010L\u001a\u00020\n2\u0008\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008L\u0010MJ(\u0010T\u001a\u00020S2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020QH\u00c7\u0001\u00a2\u0006\u0004\u0008T\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010V\u001a\u0004\u0008W\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010X\u001a\u0004\u0008Y\u0010*R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010Z\u001a\u0004\u0008[\u0010,R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010V\u001a\u0004\u0008\\\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010]\u001a\u0004\u0008^\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010_\u001a\u0004\u0008`\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010a\u001a\u0004\u0008b\u00103R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010c\u001a\u0004\u0008d\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010e\u001a\u0004\u0008f\u00107R\u0017\u0010\u0012\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010c\u001a\u0004\u0008\u0012\u00105R\u0017\u0010\u0013\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010c\u001a\u0004\u0008\u0013\u00105R\u0017\u0010\u0014\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010c\u001a\u0004\u0008\u0014\u00105R\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010V\u001a\u0004\u0008g\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010h\u001a\u0004\u0008i\u0010=R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010a\u001a\u0004\u0008j\u00103R\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010V\u001a\u0004\u0008k\u0010(R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010l\u001a\u0004\u0008m\u0010AR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010n\u001a\u0004\u0008o\u0010CR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010p\u001a\u0004\u0008q\u0010ER\u0019\u0010 \u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010p\u001a\u0004\u0008r\u0010E\u00a8\u0006v"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/Nudge;",
        "",
        "",
        "title",
        "",
        "variantId",
        "",
        "Lcom/amplitude/android/engagement/types/NudgeStep;",
        "steps",
        "flagKey",
        "",
        "archived",
        "Lcom/amplitude/android/engagement/types/NudgePosition;",
        "position",
        "priority",
        "showStepCounter",
        "Lcom/amplitude/android/engagement/types/StepCounterFormat;",
        "stepCounterFormat",
        "isCarousel",
        "isDismissible",
        "isSnoozable",
        "snoozeLabel",
        "Lcom/amplitude/android/engagement/types/NudgeType;",
        "type",
        "customThemeId",
        "variant",
        "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
        "lifecycleConfig",
        "Lcom/amplitude/android/engagement/types/TriggerConfig;",
        "triggerConfig",
        "Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
        "pageTargeting",
        "temporarilyHideTargeting",
        "<init>",
        "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)V",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "component5",
        "()Ljava/lang/Boolean;",
        "component6",
        "()Lcom/amplitude/android/engagement/types/NudgePosition;",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "()Z",
        "component9",
        "()Lcom/amplitude/android/engagement/types/StepCounterFormat;",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "()Lcom/amplitude/android/engagement/types/NudgeType;",
        "component15",
        "component16",
        "component17",
        "()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
        "component18",
        "()Lcom/amplitude/android/engagement/types/TriggerConfig;",
        "component19",
        "()Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
        "component20",
        "copy",
        "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)Lcom/amplitude/android/engagement/types/Nudge;",
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
        "(Lcom/amplitude/android/engagement/types/Nudge;Lzc3/c;Lyc3/g;)V",
        "Ljava/lang/String;",
        "getTitle",
        "I",
        "getVariantId",
        "Ljava/util/List;",
        "getSteps",
        "getFlagKey",
        "Ljava/lang/Boolean;",
        "getArchived",
        "Lcom/amplitude/android/engagement/types/NudgePosition;",
        "getPosition",
        "Ljava/lang/Integer;",
        "getPriority",
        "Z",
        "getShowStepCounter",
        "Lcom/amplitude/android/engagement/types/StepCounterFormat;",
        "getStepCounterFormat",
        "getSnoozeLabel",
        "Lcom/amplitude/android/engagement/types/NudgeType;",
        "getType",
        "getCustomThemeId",
        "getVariant",
        "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
        "getLifecycleConfig",
        "Lcom/amplitude/android/engagement/types/TriggerConfig;",
        "getTriggerConfig",
        "Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
        "getPageTargeting",
        "getTemporarilyHideTargeting",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/q0",
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
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final $stable:I = 0x8

.field public static final Companion:Lcom/amplitude/android/engagement/types/q0;


# instance fields
.field private final archived:Ljava/lang/Boolean;

.field private final customThemeId:Ljava/lang/Integer;

.field private final flagKey:Ljava/lang/String;

.field private final isCarousel:Z

.field private final isDismissible:Z

.field private final isSnoozable:Z

.field private final lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

.field private final pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

.field private final position:Lcom/amplitude/android/engagement/types/NudgePosition;

.field private final priority:Ljava/lang/Integer;

.field private final showStepCounter:Z

.field private final snoozeLabel:Ljava/lang/String;

.field private final stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

.field private final steps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeStep;",
            ">;"
        }
    .end annotation
.end field

.field private final temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

.field private final title:Ljava/lang/String;

.field private final triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

.field private final type:Lcom/amplitude/android/engagement/types/NudgeType;

.field private final variant:Ljava/lang/String;

.field private final variantId:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/amplitude/android/engagement/types/q0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/amplitude/android/engagement/types/NudgeStep$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeStep$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    sget-object v1, Lcom/amplitude/android/engagement/types/NudgePosition;->Companion:Llj/s;

    invoke-virtual {v1}, Llj/s;->serializer()Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/amplitude/android/engagement/types/StepCounterFormat;->Companion:Llj/c0;

    invoke-virtual {v2}, Llj/c0;->serializer()Lwc3/c;

    move-result-object v2

    sget-object v3, Lcom/amplitude/android/engagement/types/NudgeType;->Companion:Llj/u;

    invoke-virtual {v3}, Llj/u;->serializer()Lwc3/c;

    move-result-object v3

    const/16 v4, 0x14

    new-array v4, v4, [Lwc3/c;

    const/4 v5, 0x0

    const/4 v6, 0x0

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v6, v4, v5

    const/4 v5, 0x2

    aput-object v0, v4, v5

    const/4 v0, 0x3

    aput-object v6, v4, v0

    const/4 v0, 0x4

    aput-object v6, v4, v0

    const/4 v0, 0x5

    aput-object v1, v4, v0

    const/4 v0, 0x6

    aput-object v6, v4, v0

    const/4 v0, 0x7

    aput-object v6, v4, v0

    const/16 v0, 0x8

    aput-object v2, v4, v0

    const/16 v0, 0x9

    aput-object v6, v4, v0

    const/16 v0, 0xa

    aput-object v6, v4, v0

    const/16 v0, 0xb

    aput-object v6, v4, v0

    const/16 v0, 0xc

    aput-object v6, v4, v0

    const/16 v0, 0xd

    aput-object v3, v4, v0

    const/16 v0, 0xe

    aput-object v6, v4, v0

    const/16 v0, 0xf

    aput-object v6, v4, v0

    const/16 v0, 0x10

    aput-object v6, v4, v0

    const/16 v0, 0x11

    aput-object v6, v4, v0

    const/16 v0, 0x12

    aput-object v6, v4, v0

    const/16 v0, 0x13

    aput-object v6, v4, v0

    sput-object v4, Lcom/amplitude/android/engagement/types/Nudge;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    const v0, 0xbc8f

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Nudge$$serializer;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    iput p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    iput-object p4, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    iput-object p5, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    :goto_2
    iput-boolean p9, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    .line 4
    sget-object p2, Lcom/amplitude/android/engagement/types/StepCounterFormat;->NUMERIC:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    .line 5
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    goto :goto_3

    :cond_4
    iput-object p10, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    :goto_3
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    goto :goto_4

    :cond_5
    iput-boolean p11, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    :goto_4
    iput-boolean p12, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    iput-boolean p13, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    :goto_5
    move-object/from16 p2, p17

    goto :goto_6

    :cond_6
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    goto :goto_5

    :goto_6
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    goto :goto_7

    :cond_7
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    :goto_7
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    goto :goto_8

    :cond_8
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    :goto_8
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    goto :goto_9

    :cond_9
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    :goto_9
    const/high16 p2, 0x80000

    and-int/2addr p1, p2

    if-nez p1, :cond_a

    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-void

    :cond_a
    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeStep;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/amplitude/android/engagement/types/NudgePosition;",
            "Ljava/lang/Integer;",
            "Z",
            "Lcom/amplitude/android/engagement/types/StepCounterFormat;",
            "ZZZ",
            "Ljava/lang/String;",
            "Lcom/amplitude/android/engagement/types/NudgeType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
            "Lcom/amplitude/android/engagement/types/TriggerConfig;",
            "Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
            "Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p13

    move-object/from16 v1, p14

    move-object/from16 v2, p16

    const-string v3, "title"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "steps"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "flagKey"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "stepCounterFormat"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "snoozeLabel"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "type"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "variant"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    .line 8
    iput p2, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    .line 9
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    .line 10
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    .line 12
    iput-object p6, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    .line 13
    iput-object p7, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    .line 14
    iput-boolean p8, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    .line 15
    iput-object p9, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    .line 16
    iput-boolean p10, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    .line 17
    iput-boolean p11, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    move/from16 p1, p12

    .line 18
    iput-boolean p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    .line 19
    iput-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    .line 20
    iput-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    move-object/from16 p1, p15

    .line 21
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    .line 22
    iput-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 23
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    move-object/from16 p1, p18

    .line 24
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-object/from16 p1, p19

    .line 25
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    move-object/from16 p1, p20

    .line 26
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    .line 28
    sget-object v1, Lcom/amplitude/android/engagement/types/StepCounterFormat;->NUMERIC:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    move-object v11, v1

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move v12, v1

    goto :goto_4

    :cond_4
    move/from16 v12, p10

    :goto_4
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_5

    move-object/from16 v17, v2

    goto :goto_5

    :cond_5
    move-object/from16 v17, p15

    :goto_5
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_6

    move-object/from16 v19, v2

    goto :goto_6

    :cond_6
    move-object/from16 v19, p17

    :goto_6
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object/from16 v20, v2

    goto :goto_7

    :cond_7
    move-object/from16 v20, p18

    :goto_7
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v21, v2

    goto :goto_8

    :cond_8
    move-object/from16 v21, p19

    :goto_8
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    move-object/from16 v22, v2

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v10, p8

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v18, p16

    move-object/from16 v2, p0

    goto :goto_9

    :cond_9
    move-object/from16 v22, p20

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v10, p8

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v18, p16

    .line 29
    :goto_9
    invoke-direct/range {v2 .. v22}, Lcom/amplitude/android/engagement/types/Nudge;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/Nudge;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/Nudge;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/Nudge;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    :goto_13
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p21}, Lcom/amplitude/android/engagement/types/Nudge;->copy(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)Lcom/amplitude/android/engagement/types/Nudge;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/Nudge;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/amplitude/android/engagement/types/Nudge;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    iget-boolean v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    sget-object v3, Lcom/amplitude/android/engagement/types/StepCounterFormat;->NUMERIC:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    if-eqz v2, :cond_9

    :goto_4
    iget-boolean v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xb

    iget-boolean v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xd

    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0xf

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Llj/r0;->a:Llj/r0;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PageTargetingConfig$$serializer;

    iget-object p0, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/amplitude/android/engagement/types/NudgeType;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    return-object v0
.end method

.method public final component18()Lcom/amplitude/android/engagement/types/TriggerConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    return-object v0
.end method

.method public final component19()Lcom/amplitude/android/engagement/types/PageTargetingConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    return v0
.end method

.method public final component20()Lcom/amplitude/android/engagement/types/PageTargetingConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeStep;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Lcom/amplitude/android/engagement/types/NudgePosition;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    return v0
.end method

.method public final component9()Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)Lcom/amplitude/android/engagement/types/Nudge;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeStep;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/amplitude/android/engagement/types/NudgePosition;",
            "Ljava/lang/Integer;",
            "Z",
            "Lcom/amplitude/android/engagement/types/StepCounterFormat;",
            "ZZZ",
            "Ljava/lang/String;",
            "Lcom/amplitude/android/engagement/types/NudgeType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
            "Lcom/amplitude/android/engagement/types/TriggerConfig;",
            "Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
            "Lcom/amplitude/android/engagement/types/PageTargetingConfig;",
            ")",
            "Lcom/amplitude/android/engagement/types/Nudge;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "steps"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flagKey"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stepCounterFormat"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "snoozeLabel"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "variant"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/amplitude/android/engagement/types/Nudge;

    move/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lcom/amplitude/android/engagement/types/Nudge;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/amplitude/android/engagement/types/NudgePosition;Ljava/lang/Integer;ZLcom/amplitude/android/engagement/types/StepCounterFormat;ZZZLjava/lang/String;Lcom/amplitude/android/engagement/types/NudgeType;Ljava/lang/Integer;Ljava/lang/String;Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lcom/amplitude/android/engagement/types/TriggerConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;Lcom/amplitude/android/engagement/types/PageTargetingConfig;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/Nudge;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    iget v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    iget-boolean v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getArchived()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCustomThemeId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFlagKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getLifecycleConfig()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    return-object v0
.end method

.method public final getPageTargeting()Lcom/amplitude/android/engagement/types/PageTargetingConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-object v0
.end method

.method public final getPosition()Lcom/amplitude/android/engagement/types/NudgePosition;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    return-object v0
.end method

.method public final getPriority()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getShowStepCounter()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    return v0
.end method

.method public final getSnoozeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getStepCounterFormat()Lcom/amplitude/android/engagement/types/StepCounterFormat;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    return-object v0
.end method

.method public final getSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeStep;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    return-object v0
.end method

.method public final getTemporarilyHideTargeting()Lcom/amplitude/android/engagement/types/PageTargetingConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    return-object v0
.end method

.method public final getType()Lcom/amplitude/android/engagement/types/NudgeType;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    return-object v0
.end method

.method public final getVariant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    return-object v0
.end method

.method public final getVariantId()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

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

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    move v2, v4

    :cond_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    if-eqz v0, :cond_4

    move v0, v4

    :cond_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    if-eqz v0, :cond_5

    move v0, v4

    :cond_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    move v4, v0

    :goto_3
    add-int/2addr v2, v4

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_6

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    if-nez v1, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public final isCarousel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    return v0
.end method

.method public final isDismissible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    return v0
.end method

.method public final isSnoozable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Nudge(title="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variantId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->variantId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->steps:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", flagKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->flagKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", archived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->archived:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->position:Lcom/amplitude/android/engagement/types/NudgePosition;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->priority:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showStepCounter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->showStepCounter:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", stepCounterFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->stepCounterFormat:Lcom/amplitude/android/engagement/types/StepCounterFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCarousel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isDismissible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSnoozable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->isSnoozable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", snoozeLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->snoozeLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->type:Lcom/amplitude/android/engagement/types/NudgeType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customThemeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->customThemeId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", variant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->variant:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lifecycleConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->lifecycleConfig:Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", triggerConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->triggerConfig:Lcom/amplitude/android/engagement/types/TriggerConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pageTargeting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->pageTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", temporarilyHideTargeting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/Nudge;->temporarilyHideTargeting:Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
