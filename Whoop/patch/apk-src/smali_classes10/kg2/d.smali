.class public final synthetic Lkg2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkg2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lkg2/d;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lkl2/k;->q()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/bot/models/feedback/FeedbackReason;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lkk1/g;->A()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lki0/a;->c()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_18
    :try_start_0
    new-instance v0, Lwh/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lmi/b;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-array v3, v3, [Lki/b;

    aput-object v0, v3, v2

    aput-object v4, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :pswitch_19
    :try_start_1
    new-instance v0, Lmi/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lei/c;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-array v3, v3, [Lki/c;

    aput-object v0, v3, v2

    aput-object v4, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v0}, Lxb3/k;->n(Ljava/util/Iterator;)Lxb3/i;

    move-result-object v0

    invoke-static {v0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :catchall_1
    move-exception v0

    new-instance v1, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :pswitch_1a
    invoke-static {}, Lcom/whoop/startactivity/goals/TargetsScoreType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
