.class final Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005*\r\u0012\t\u0012\u00070\u0001\u00a2\u0006\u0002\u0008\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lec3/m;",
        "Lic/u;",
        "Lkotlin/jvm/internal/EnhancedNullability;",
        "",
        "exception",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.workmanager.DataSyncWorker$work$5"
    f = "DataSyncWorker.kt"
    l = {
        0x96
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->z:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;

    iget-object v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->z:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-direct {v0, v1, p3}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lkotlinx/coroutines/TimeoutCancellationException;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->z:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {p1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object p1

    const-string v5, "Timing out as job is not finishing"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p1, v5, v1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->x:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->y:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    iget-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;->z:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {p1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object p1

    const-string v0, "Error occurred while syncing"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    throw v1
.end method
