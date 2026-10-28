.class final Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/viewModels/OfflineAnalyticsManager;->flushExistingLogs(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.viewModels.OfflineAnalyticsManager$flushExistingLogs$1"
    f = "OfflineAnalyticsManager.kt"
    l = {
        0x31,
        0x33,
        0x35
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $deviceId:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;


# direct methods
.method public constructor <init>(Llive/hms/video/viewModels/OfflineAnalyticsManager;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/viewModels/OfflineAnalyticsManager;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    iput-object p2, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->$deviceId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;

    iget-object v0, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    iget-object v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->$deviceId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;-><init>(Llive/hms/video/viewModels/OfflineAnalyticsManager;Ljava/lang/String;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->label:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    iget-object v5, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$1:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/viewModels/OfflineAnalyticsManager;

    iget-object v8, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    iget-object v5, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$4:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/database/entity/AnalyticsEntityModel;

    iget-object v6, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$1:Ljava/lang/Object;

    check-cast v8, Llive/hms/video/viewModels/OfflineAnalyticsManager;

    iget-object v9, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    invoke-static {p1}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->access$getAnalyticsRepository$p(Llive/hms/video/viewModels/OfflineAnalyticsManager;)Llive/hms/video/database/OfflineAnalyticsRepository;

    move-result-object p1

    iput v5, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->label:I

    invoke-virtual {p1, p0}, Llive/hms/video/database/OfflineAnalyticsRepository;->getAllLogs(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->$deviceId:Ljava/lang/String;

    iget-object v5, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->this$0:Llive/hms/video/viewModels/OfflineAnalyticsManager;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {p1, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llive/hms/video/database/entity/AnalyticsEntityModel;

    invoke-virtual {v7, v1}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setDeviceId(Ljava/lang/String;)V

    invoke-static {v5}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->access$getAnalyticsRepository$p(Llive/hms/video/viewModels/OfflineAnalyticsManager;)Llive/hms/video/database/OfflineAnalyticsRepository;

    move-result-object v8

    iput-object v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$1:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$2:Ljava/lang/Object;

    iput-object p1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$3:Ljava/lang/Object;

    iput-object v7, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$4:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$5:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->label:I

    invoke-virtual {v8, v7, p0}, Llive/hms/video/database/OfflineAnalyticsRepository;->flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v9, v1

    move-object v1, v6

    move-object v6, p1

    move-object p1, v8

    move-object v8, v5

    move-object v5, v7

    move-object v7, v1

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v8}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->access$getAnalyticsRepository$p(Llive/hms/video/viewModels/OfflineAnalyticsManager;)Llive/hms/video/database/OfflineAnalyticsRepository;

    move-result-object p1

    iput-object v9, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$0:Ljava/lang/Object;

    iput-object v8, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$3:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$4:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->L$5:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/viewModels/OfflineAnalyticsManager$flushExistingLogs$1;->label:I

    invoke-virtual {p1, v5, p0}, Llive/hms/video/database/OfflineAnalyticsRepository;->deleteLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    :goto_4
    move-object p1, v5

    move-object v5, v7

    goto :goto_5

    :cond_7
    const-string p1, "OfflineAnalyticsManager"

    const-string v5, "unable to delete log"

    invoke-static {p1, v5}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, v6

    move-object v6, v7

    move-object v5, v8

    move-object v8, v9

    :goto_5
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v8

    goto :goto_1

    :cond_8
    check-cast v6, Ljava/util/List;

    return-object v2
.end method
