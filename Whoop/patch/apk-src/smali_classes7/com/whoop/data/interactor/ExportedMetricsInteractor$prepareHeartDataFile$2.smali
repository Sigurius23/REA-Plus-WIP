.class final Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/interactor/ExportedMetricsInteractor;->prepareHeartDataFile(ILq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/data/interactor/MetricHeartDataSyncState;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/data/interactor/MetricHeartDataSyncState;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.interactor.ExportedMetricsInteractor$prepareHeartDataFile$2"
    f = "ExportedMetricsInteractor.kt"
    l = {
        0x3e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $secondsRetrievedBeforeNow:I

.field label:I

.field final synthetic this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/data/interactor/ExportedMetricsInteractor;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/interactor/ExportedMetricsInteractor;",
            "I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    iput p2, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->$secondsRetrievedBeforeNow:I

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

    new-instance p1, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;

    iget-object v0, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    iget v1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->$secondsRetrievedBeforeNow:I

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;-><init>(Lcom/whoop/data/interactor/ExportedMetricsInteractor;ILq83/d;)V

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
            "Lcom/whoop/data/interactor/MetricHeartDataSyncState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->label:I

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

    iget-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    invoke-static {p1}, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->access$getHeartDataStore$p(Lcom/whoop/data/interactor/ExportedMetricsInteractor;)Lbi2/d;

    move-result-object p1

    iget v1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->$secondsRetrievedBeforeNow:I

    iput v2, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->label:I

    invoke-interface {p1, v1, p0}, Lbi2/d;->c(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lbi2/c;

    instance-of v0, p1, Lbi2/c$a;

    if-eqz v0, :cond_3

    check-cast p1, Lbi2/c$a;

    invoke-virtual {p1}, Lbi2/c$a;->a()Lyh2/b;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {p1}, Lyh2/b;->a()Ljava/io/File;

    move-result-object v1

    sget-object v2, Lud3/h0;->e:Lyb3/p;

    const-string v2, "application/json"

    invoke-static {v2}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1;

    invoke-direct {v1}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1;-><init>()V

    new-instance v1, Lcom/whoop/data/interactor/MetricHeartDataSyncState$ForcedSyncSuccess;

    new-instance v2, Lcom/whoop/data/interactor/MetricsHeartDataBundle;

    invoke-direct {v2, p1, v0}, Lcom/whoop/data/interactor/MetricsHeartDataBundle;-><init>(Lyh2/b;Lud3/v0;)V

    invoke-direct {v1, v2}, Lcom/whoop/data/interactor/MetricHeartDataSyncState$ForcedSyncSuccess;-><init>(Lcom/whoop/data/interactor/MetricsHeartDataBundle;)V

    return-object v1

    :cond_4
    sget-object p1, Lcom/whoop/data/interactor/MetricHeartDataSyncState$EmptyHeartData;->INSTANCE:Lcom/whoop/data/interactor/MetricHeartDataSyncState$EmptyHeartData;

    return-object p1
.end method
