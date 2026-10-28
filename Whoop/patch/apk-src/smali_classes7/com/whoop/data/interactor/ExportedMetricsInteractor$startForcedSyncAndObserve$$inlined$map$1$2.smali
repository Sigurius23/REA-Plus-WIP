.class public final Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $secondsRetrievedBeforeNow$inlined:I

.field final synthetic $this_unsafeFlow:Lec3/m;

.field final synthetic this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/data/interactor/ExportedMetricsInteractor;I)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    iput-object p2, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;->this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    iput p3, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;->$secondsRetrievedBeforeNow$inlined:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;

    iget v1, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;-><init>(Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->I$0:I

    iget-object v2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$6:Ljava/lang/Object;

    check-cast v2, Lts0/c;

    iget-object v2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    check-cast p1, Lts0/c;

    sget-object p2, Lcom/whoop/data/interactor/ExportedMetricsInteractor$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    if-eq p1, v4, :cond_5

    if-ne p1, v3, :cond_4

    sget-object p1, Lcom/whoop/data/interactor/MetricHeartDataSyncState$FullSyncSuccess;->INSTANCE:Lcom/whoop/data/interactor/MetricHeartDataSyncState$FullSyncSuccess;

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;->this$0:Lcom/whoop/data/interactor/ExportedMetricsInteractor;

    iget v6, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2;->$secondsRetrievedBeforeNow$inlined:I

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$4:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$5:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$6:Ljava/lang/Object;

    iput p2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->I$0:I

    iput p2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->I$1:I

    iput v4, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->label:I

    invoke-static {p1, v6, v0}, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->access$prepareHeartDataFile(Lcom/whoop/data/interactor/ExportedMetricsInteractor;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move v7, p2

    move-object p2, p1

    move p1, v7

    :goto_1
    move-object v7, p2

    move p2, p1

    move-object p1, v7

    :goto_2
    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$4:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$5:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->L$6:Ljava/lang/Object;

    iput p2, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->I$0:I

    iput v3, v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1$2$1;->label:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
