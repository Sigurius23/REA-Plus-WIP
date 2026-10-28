.class final Llive/hms/video/events/AnalyticsEventsService$flush$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/events/AnalyticsEventsService;->flush()V
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
    c = "live.hms.video.events.AnalyticsEventsService$flush$1$1"
    f = "AnalyticsEventsService.kt"
    l = {
        0x89
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $event:Llive/hms/video/events/AnalyticsEvent;

.field final synthetic $logEntityModel:Llive/hms/video/database/entity/AnalyticsEntityModel;

.field label:I

.field final synthetic this$0:Llive/hms/video/events/AnalyticsEventsService;


# direct methods
.method public constructor <init>(Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/events/AnalyticsEvent;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Llive/hms/video/events/AnalyticsEvent;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/events/AnalyticsEventsService$flush$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p2, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$logEntityModel:Llive/hms/video/database/entity/AnalyticsEntityModel;

    iput-object p3, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$event:Llive/hms/video/events/AnalyticsEvent;

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

    new-instance p1, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    iget-object v1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$logEntityModel:Llive/hms/video/database/entity/AnalyticsEntityModel;

    iget-object v2, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$event:Llive/hms/video/events/AnalyticsEvent;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;-><init>(Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/events/AnalyticsEvent;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    invoke-static {p1}, Llive/hms/video/events/AnalyticsEventsService;->access$getOfflineAnalyticsManager$p(Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/viewModels/OfflineAnalyticsManager;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$logEntityModel:Llive/hms/video/database/entity/AnalyticsEntityModel;

    iput v2, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->label:I

    invoke-virtual {p1, v1, p0}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->flushLog(Llive/hms/video/database/entity/AnalyticsEntityModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    invoke-static {p1}, Llive/hms/video/events/AnalyticsEventsService;->access$getPendingEvents$p(Llive/hms/video/events/AnalyticsEventsService;)Ljava/util/Deque;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$event:Llive/hms/video/events/AnalyticsEvent;

    invoke-interface {p1, v0}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object p1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    invoke-static {p1}, Llive/hms/video/events/AnalyticsEventsService;->access$getOfflineAnalyticsManager$p(Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/viewModels/OfflineAnalyticsManager;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService$flush$1$1;->$logEntityModel:Llive/hms/video/database/entity/AnalyticsEntityModel;

    invoke-virtual {p1, v0}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->persistLog(Llive/hms/video/database/entity/AnalyticsEntityModel;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
