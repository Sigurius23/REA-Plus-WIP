.class final Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lf6/a;",
        "prefs",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$3$1"
    f = "DataSyncWorker.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->y:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;

    iget-object v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->y:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-direct {v0, v1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->x:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ldt0/a;->a()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n$a;->y:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->k(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v1

    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v0, p1, v3}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
