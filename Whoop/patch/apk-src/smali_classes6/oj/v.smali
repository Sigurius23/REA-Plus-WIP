.class public abstract Loj/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ll83/k;

    const-string v1, "CONTAINS"

    const-string v2, "Screen contains"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "ENDS_WITH"

    const-string v3, "Screen ends with"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "EXACT"

    const-string v4, "Screen matches exactly"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "PATTERN"

    const-string v5, "Screen matches pattern"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "REGEX"

    const-string v6, "Screen matches regex"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "SIMPLE"

    const-string v7, "Screen matches"

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "STARTS_WITH"

    const-string v8, "Screen starts with"

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v6}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Loj/v;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lcom/amplitude/android/engagement/types/Nudge;)Ll83/q;
    .locals 5

    const-string v0, "Immediately"

    const/4 v1, 0x0

    if-eqz p0, :cond_c

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/Nudge;->getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-result-object p0

    if-nez p0, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v2, p0, Llj/p0;

    if-eqz v2, :cond_6

    check-cast p0, Llj/p0;

    iget-object p0, p0, Llj/p0;->a:Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getType()Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    move-result-object p0

    sget-object v2, Loj/u;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    const/4 v2, 0x1

    if-eq p0, v2, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-ne p0, v0, :cond_1

    new-instance p0, Ll83/q;

    const-string v0, "None"

    const-string v2, "No proactive trigger specified."

    invoke-direct {p0, v0, v1, v2}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Ll83/q;

    const-string v0, "On user confusion"

    const-string v2, "Waiting for user confusion..."

    invoke-direct {p0, v0, v1, v2}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_3
    new-instance p0, Ll83/q;

    const-string v0, "On rage click"

    const-string v2, "Waiting for user rage click..."

    invoke-direct {p0, v0, v1, v2}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_4
    new-instance p0, Ll83/q;

    const-string v0, "Smart delay"

    const-string v2, "Waiting for user activity..."

    invoke-direct {p0, v0, v1, v2}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_5
    new-instance p0, Ll83/q;

    invoke-direct {p0, v0, v1, v1}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_6
    instance-of v0, p0, Llj/o0;

    if-eqz v0, :cond_7

    new-instance v0, Ll83/q;

    check-cast p0, Llj/o0;

    iget-object p0, p0, Llj/o0;->a:Lcom/amplitude/android/engagement/types/EventTriggerConfig;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/EventTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/EventData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/EventData;->getEvent()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Waiting for event..."

    const-string v2, "On event tracked"

    invoke-direct {v0, v2, p0, v1}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_7
    instance-of v0, p0, Llj/m0;

    if-eqz v0, :cond_8

    new-instance v0, Ll83/q;

    check-cast p0, Llj/m0;

    iget-object p0, p0, Llj/m0;->a:Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/ElementAppearedTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/ElementAppearedData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/ElementAppearedData;->getSelector()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Waiting for element to become visible..."

    const-string v2, "When element is visible"

    invoke-direct {v0, v2, p0, v1}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_8
    instance-of v0, p0, Llj/n0;

    if-eqz v0, :cond_9

    new-instance v0, Ll83/q;

    check-cast p0, Llj/n0;

    iget-object p0, p0, Llj/n0;->a:Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/ElementClickedTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/ElementClickedData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/ElementClickedData;->getSelector()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Waiting for element to be tapped..."

    const-string v2, "When element is tapped"

    invoke-direct {v0, v2, p0, v1}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_9
    instance-of v0, p0, Llj/k0;

    if-eqz v0, :cond_b

    check-cast p0, Llj/k0;

    iget-object p0, p0, Llj/k0;->a:Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/AfterTimeData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/AfterTimeData;->getValue()I

    move-result v0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/AfterTimeTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/AfterTimeData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/AfterTimeData;->getUnit()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ll83/q;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "after "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x73

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Triggering after "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "minute"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    const-string p0, "m"

    goto :goto_0

    :cond_a
    const-string p0, "s"

    :goto_0
    const-string v0, " on screen"

    invoke-static {p0, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Time on screen"

    invoke-direct {v1, v0, v2, p0}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_b
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_c
    :goto_1
    new-instance p0, Ll83/q;

    invoke-direct {p0, v0, v1, v1}, Ll83/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static b(Lcom/amplitude/android/engagement/types/SimulationContext;)Lcom/amplitude/android/engagement/types/DebugStatus;
    .locals 3

    if-nez p0, :cond_0

    sget-object p0, Lcom/amplitude/android/engagement/types/DebugStatus;->ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesPageTargeting()Z

    move-result v0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesPinnedElement()Z

    move-result v1

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SimulationContext;->getShouldTemporarilyHide()Z

    move-result v2

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesTriggerMatch()Z

    move-result p0

    if-nez p0, :cond_2

    sget-object p0, Lcom/amplitude/android/engagement/types/DebugStatus;->INFO:Lcom/amplitude/android/engagement/types/DebugStatus;

    return-object p0

    :cond_2
    sget-object p0, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    return-object p0
.end method
