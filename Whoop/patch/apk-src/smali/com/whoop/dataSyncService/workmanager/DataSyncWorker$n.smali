.class final Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->j(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lmx0/d;",
        "state",
        "Ll83/a0;",
        "<anonymous>",
        "(Lmx0/d;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$3"
    f = "DataSyncWorker.kt"
    l = {
        0x6d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-direct {p1, v0, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    return-object p1
.end method

.method public final f(Lmx0/d;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx0/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmx0/d;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->f(Lmx0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->w:I

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

    iget-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {p1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->n(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v1, "strap-sync-rate-limiting"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {p1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->l(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)La6/g;

    move-result-object p1

    new-instance v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;

    iget-object v3, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    iput v2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->w:I

    invoke-static {p1, v1, p0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
