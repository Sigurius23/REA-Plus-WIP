.class final Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->doWork(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00070\u0001\u00a2\u0006\u0002\u0008\u0002*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lic/u;",
        "Lkotlin/jvm/internal/EnhancedNullability;",
        "<anonymous>",
        "(Lbc3/c0;)Lic/u;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.user.journey.workmanager.TimeCapsuleSyncWorker$doWork$2"
    f = "TimeCapsuleSyncWorker.kt"
    l = {
        0x17
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;

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

    new-instance p1, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;

    iget-object v0, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;

    invoke-direct {p1, v0, p2}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;-><init>(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;Lq83/d;)V

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
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;

    invoke-static {p1}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->b(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;)Lzp2/b;

    move-result-object p1

    iput v2, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->w:I

    invoke-virtual {p1, p0}, Lzp2/b;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;

    invoke-static {p1}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->a(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;)Ltr2/n;

    move-result-object p1

    const-string v0, "Time capsule synced successfully"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;

    invoke-static {p1}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->a(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;)Ltr2/n;

    move-result-object p1

    const-string v0, "Time capsule sync failed, will retry"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_1
    iget-object v0, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;->x:Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;

    invoke-static {v0}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->a(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;)Ltr2/n;

    move-result-object v0

    const-string v1, "Exception in TimeCapsuleSyncWorker"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
