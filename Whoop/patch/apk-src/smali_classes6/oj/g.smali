.class public final Loj/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;Lc93/a;I)V
    .locals 0

    iput p3, p0, Loj/g;->w:I

    iput-object p1, p0, Loj/g;->x:Lcom/amplitude/android/engagement/a;

    iput-object p2, p0, Loj/g;->y:Lc93/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Loj/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/amplitude/android/engagement/types/Nudge;

    new-instance v0, Lch/c;

    iget-object v1, p0, Loj/g;->y:Lc93/a;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lch/c;-><init>(Lc93/a;I)V

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "triggerNone called with nudge: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/Nudge;->getTitle()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/Nudge;->getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    if-eqz p1, :cond_5

    instance-of v4, v2, Llj/p0;

    if-eqz v4, :cond_5

    move-object v4, v2

    check-cast v4, Llj/p0;

    iget-object v4, v4, Llj/p0;->a:Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getType()Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    move-result-object v4

    sget-object v5, Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;->NONE:Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    if-eq v4, v5, :cond_2

    goto/16 :goto_4

    :cond_2
    new-instance v6, Lcom/amplitude/android/engagement/types/TriggerEventPayload;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v8, Lcom/amplitude/android/engagement/types/Trigger;

    sget-object v2, Lcom/amplitude/android/engagement/types/TriggerType;->DIRECT:Lcom/amplitude/android/engagement/types/TriggerType;

    const/4 v4, 0x2

    invoke-direct {v8, v2, v3, v4, v3}, Lcom/amplitude/android/engagement/types/Trigger;-><init>(Lcom/amplitude/android/engagement/types/TriggerType;Lcom/amplitude/android/engagement/types/TriggerData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/amplitude/android/engagement/types/TriggerSource;

    sget-object v2, Lcom/amplitude/android/engagement/types/TriggerSourceType;->DEBUG:Lcom/amplitude/android/engagement/types/TriggerSourceType;

    invoke-direct {v9, v2, v3, v4, v3}, Lcom/amplitude/android/engagement/types/TriggerSource;-><init>(Lcom/amplitude/android/engagement/types/TriggerSourceType;Lcom/amplitude/android/engagement/types/TriggerSourceProperties;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/amplitude/android/engagement/types/TriggerEventPayload;-><init>(Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "triggerNone calling forceTriggerSingleNudge with payload: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lch/c;->invoke()Ljava/lang/Object;

    const-string v2, "Failed to serialize to JSON string: "

    new-instance v0, Lhj/n;

    const/4 v4, 0x0

    invoke-direct {v0, p1, v6, v4}, Lhj/n;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/TriggerEventPayload;I)V

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    :try_start_0
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/q0;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v0, v4, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p1, v3

    :goto_2
    if-nez p1, :cond_3

    goto/16 :goto_6

    :cond_3
    :try_start_1
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/amplitude/android/engagement/types/TriggerEventPayload;->Companion:Lcom/amplitude/android/engagement/types/g2;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/g2;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v0, v4, v6}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v4}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object v0, v3

    :goto_3
    if-nez v0, :cond_4

    goto :goto_6

    :cond_4
    iget-object v1, p0, Loj/g;->x:Lcom/amplitude/android/engagement/a;

    iget-object v1, v1, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "globalThis.nudgeActions.forceTriggerSingleNudge("

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v3}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    goto :goto_6

    :cond_5
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "triggerNone validation failed - nudge: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", triggerConfig: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", type: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    instance-of p1, v2, Llj/p0;

    if-eqz p1, :cond_6

    check-cast v2, Llj/p0;

    goto :goto_5

    :cond_6
    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_7

    iget-object p1, v2, Llj/p0;->a:Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getType()Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    move-result-object v3

    :cond_7
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/amplitude/android/engagement/types/Nudge;

    new-instance v0, Lch/c;

    iget-object v1, p0, Loj/g;->y:Lc93/a;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lch/c;-><init>(Lc93/a;I)V

    const/4 v1, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/Nudge;->getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-result-object v2

    goto :goto_7

    :cond_8
    move-object v2, v1

    :goto_7
    if-eqz p1, :cond_c

    instance-of v3, v2, Llj/o0;

    if-nez v3, :cond_9

    goto/16 :goto_a

    :cond_9
    new-instance v4, Lcom/amplitude/android/engagement/types/TriggerEventPayload;

    new-instance v6, Lcom/amplitude/android/engagement/types/Trigger;

    sget-object v3, Lcom/amplitude/android/engagement/types/TriggerType;->ANALYTICS_EVENT:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v5, Lcom/amplitude/android/engagement/types/TriggerData;

    check-cast v2, Llj/o0;

    iget-object v2, v2, Llj/o0;->a:Lcom/amplitude/android/engagement/types/EventTriggerConfig;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/EventTriggerConfig;->getData()Lcom/amplitude/android/engagement/types/EventData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/EventData;->getEvent()Ljava/lang/String;

    move-result-object v2

    sget-object v7, Lm83/z;->w:Lm83/z;

    invoke-direct {v5, v2, v7}, Lcom/amplitude/android/engagement/types/TriggerData;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {v6, v3, v5}, Lcom/amplitude/android/engagement/types/Trigger;-><init>(Lcom/amplitude/android/engagement/types/TriggerType;Lcom/amplitude/android/engagement/types/TriggerData;)V

    new-instance v7, Lcom/amplitude/android/engagement/types/TriggerSource;

    sget-object v2, Lcom/amplitude/android/engagement/types/TriggerSourceType;->TRIGGER:Lcom/amplitude/android/engagement/types/TriggerSourceType;

    new-instance v5, Lcom/amplitude/android/engagement/types/TriggerSourceProperties;

    invoke-direct {v5, v3}, Lcom/amplitude/android/engagement/types/TriggerSourceProperties;-><init>(Lcom/amplitude/android/engagement/types/TriggerType;)V

    invoke-direct {v7, v2, v5}, Lcom/amplitude/android/engagement/types/TriggerSource;-><init>(Lcom/amplitude/android/engagement/types/TriggerSourceType;Lcom/amplitude/android/engagement/types/TriggerSourceProperties;)V

    new-instance v8, Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v8, v2}, Lcom/amplitude/android/engagement/types/TriggerEventOverrides;-><init>(Ljava/lang/Boolean;)V

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/amplitude/android/engagement/types/TriggerEventPayload;-><init>(Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lch/c;->invoke()Ljava/lang/Object;

    const-string v2, "Failed to serialize to JSON string: "

    sget-object v3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Lhj/n;

    const/4 v5, 0x1

    invoke-direct {v0, p1, v4, v5}, Lhj/n;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/TriggerEventPayload;I)V

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    :try_start_2
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/q0;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/j;

    invoke-virtual {v0, v5, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    move-object p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p1, v1

    :goto_8
    if-nez p1, :cond_a

    goto :goto_a

    :cond_a
    :try_start_3
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/amplitude/android/engagement/types/TriggerEventPayload;->Companion:Lcom/amplitude/android/engagement/types/g2;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/g2;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/j;

    invoke-virtual {v0, v5, v4}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_9

    :catch_3
    move-exception v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v4}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object v0, v1

    :goto_9
    if-nez v0, :cond_b

    goto :goto_a

    :cond_b
    iget-object v2, p0, Loj/g;->x:Lcom/amplitude/android/engagement/a;

    iget-object v2, v2, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "globalThis.nudgeActions.sendDirectedTrigger("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    :cond_c
    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
