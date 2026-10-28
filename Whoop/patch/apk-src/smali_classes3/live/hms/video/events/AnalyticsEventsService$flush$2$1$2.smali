.class final Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;
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
    c = "live.hms.video.events.AnalyticsEventsService$flush$2$1$2"
    f = "AnalyticsEventsService.kt"
    l = {
        0x9f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $event:Llive/hms/video/events/AnalyticsEvent;

.field label:I

.field final synthetic this$0:Llive/hms/video/events/AnalyticsEventsService;


# direct methods
.method public constructor <init>(Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/events/AnalyticsEvent;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/events/AnalyticsEventsService;",
            "Llive/hms/video/events/AnalyticsEvent;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p2, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->$event:Llive/hms/video/events/AnalyticsEvent;

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

    new-instance p1, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;

    iget-object v0, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    iget-object v1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->$event:Llive/hms/video/events/AnalyticsEvent;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;-><init>(Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/events/AnalyticsEvent;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->label:I

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

    iget-object p1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    invoke-static {p1}, Llive/hms/video/events/AnalyticsEventsService;->access$getOfflineAnalyticsManager$p(Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/viewModels/OfflineAnalyticsManager;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->this$0:Llive/hms/video/events/AnalyticsEventsService;

    invoke-static {v1}, Llive/hms/video/events/AnalyticsEventsService;->access$getAgentOs$p(Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/utils/HMSAgentOs;

    move-result-object v1

    iget-object v3, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->$event:Llive/hms/video/events/AnalyticsEvent;

    invoke-virtual {v1, v3}, Llive/hms/video/utils/HMSAgentOs;->getUniqueEventId(Llive/hms/video/events/AnalyticsEvent;)Ljava/lang/String;

    move-result-object v1

    iput v2, p0, Llive/hms/video/events/AnalyticsEventsService$flush$2$1$2;->label:I

    invoke-virtual {p1, v1, p0}, Llive/hms/video/viewModels/OfflineAnalyticsManager;->deleteLogById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
