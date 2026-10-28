.class final Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/NotificationRepository;->sendPushNotificationMetric(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.NotificationRepository$sendPushNotificationMetric$2"
    f = "NotificationRepository.kt"
    l = {
        0x22,
        0x28,
        0x32,
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $sourceId:Ljava/lang/String;

.field final synthetic $type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/NotificationRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Lcom/whoop/data/repositories/NotificationRepository;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;",
            "Lcom/whoop/data/repositories/NotificationRepository;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    iput-object p2, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    iput-object p3, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;

    iget-object v0, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;-><init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;Lcom/whoop/data/repositories/NotificationRepository;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->label:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v6, :cond_0

    if-eq v1, v4, :cond_0

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    sget-object v1, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v6, :cond_a

    if-eq p1, v4, :cond_8

    if-eq p1, v3, :cond_6

    if-ne p1, v2, :cond_5

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getRemoteService$p(Lcom/whoop/data/repositories/NotificationRepository;)Lcom/whoop/service/network/NotificationApi;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    new-instance v3, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;

    iget-object v4, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    invoke-direct {v3, v4}, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;-><init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;)V

    iget-object v4, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {v4}, Lcom/whoop/data/repositories/NotificationRepository;->access$getUserContext$p(Lcom/whoop/data/repositories/NotificationRepository;)Lod1/u;

    move-result-object v4

    invoke-virtual {v4}, Lod1/u;->g()I

    move-result v4

    iput v2, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->label:I

    invoke-interface {p1, v1, v3, v4, p0}, Lcom/whoop/service/network/NotificationApi;->sendNotificationMetricsUpdate(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_1

    :cond_3
    :goto_0
    move v5, v6

    goto/16 :goto_3

    :cond_4
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getLogger$p(Lcom/whoop/data/repositories/NotificationRepository;)Ltr2/n;

    move-result-object p1

    const-string v0, "notification failed to open but found no matching delivery"

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_3

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getRemoteService$p(Lcom/whoop/data/repositories/NotificationRepository;)Lcom/whoop/service/network/NotificationApi;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    new-instance v2, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;

    iget-object v4, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    invoke-direct {v2, v4}, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;-><init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;)V

    iget-object v4, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {v4}, Lcom/whoop/data/repositories/NotificationRepository;->access$getUserContext$p(Lcom/whoop/data/repositories/NotificationRepository;)Lod1/u;

    move-result-object v4

    invoke-virtual {v4}, Lod1/u;->g()I

    move-result v4

    iput v3, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->label:I

    invoke-interface {p1, v1, v2, v4, p0}, Lcom/whoop/service/network/NotificationApi;->sendNotificationMetricsUpdate(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_1

    :cond_7
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getLogger$p(Lcom/whoop/data/repositories/NotificationRepository;)Ltr2/n;

    move-result-object p1

    const-string v0, "notification failed to display but found no matching delivery"

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_3

    :cond_8
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getRemoteService$p(Lcom/whoop/data/repositories/NotificationRepository;)Lcom/whoop/service/network/NotificationApi;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    new-instance v2, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;

    iget-object v3, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    invoke-direct {v2, v3}, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;-><init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;)V

    iget-object v3, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/NotificationRepository;->access$getUserContext$p(Lcom/whoop/data/repositories/NotificationRepository;)Lod1/u;

    move-result-object v3

    invoke-virtual {v3}, Lod1/u;->g()I

    move-result v3

    iput v4, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->label:I

    invoke-interface {p1, v1, v2, v3, p0}, Lcom/whoop/service/network/NotificationApi;->sendNotificationMetricsUpdate(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_9
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getLogger$p(Lcom/whoop/data/repositories/NotificationRepository;)Ltr2/n;

    move-result-object p1

    const-string v0, "notification opened but found no matching delivery"

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getNotificationStatusList$p(Lcom/whoop/data/repositories/NotificationRepository;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getRemoteService$p(Lcom/whoop/data/repositories/NotificationRepository;)Lcom/whoop/service/network/NotificationApi;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$sourceId:Ljava/lang/String;

    new-instance v2, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;

    iget-object v3, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    invoke-direct {v2, v3}, Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;-><init>(Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;)V

    iget-object v3, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {v3}, Lcom/whoop/data/repositories/NotificationRepository;->access$getUserContext$p(Lcom/whoop/data/repositories/NotificationRepository;)Lod1/u;

    move-result-object v3

    invoke-virtual {v3}, Lod1/u;->g()I

    move-result v3

    iput v6, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->label:I

    invoke-interface {p1, v1, v2, v3, p0}, Lcom/whoop/service/network/NotificationApi;->sendNotificationMetricsUpdate(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/PushNotificationMetricBody;ILq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_3

    :goto_1
    return-object v0

    :goto_2
    iget-object v0, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->$type:Lcom/whoop/data/remote/domain/dto/PushNotificationMetricType;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to notify push metric service of type "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/NotificationRepository;->access$getLogger$p(Lcom/whoop/data/repositories/NotificationRepository;)Ltr2/n;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/data/repositories/NotificationRepository$sendPushNotificationMetric$2;->this$0:Lcom/whoop/data/repositories/NotificationRepository;

    invoke-static {v2}, Lcom/whoop/data/repositories/NotificationRepository;->access$getCrashReporter$p(Lcom/whoop/data/repositories/NotificationRepository;)Lrr2/c;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
