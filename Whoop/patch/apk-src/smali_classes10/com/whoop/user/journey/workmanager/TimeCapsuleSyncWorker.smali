.class public final Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Lof3/a;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "doWork",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lzp2/b;",
        "w",
        "Lzp2/b;",
        "timeCapsuleRepository",
        "Ltr2/n;",
        "x",
        "Ltr2/n;",
        "logger",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Lzp2/b;

.field private final x:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class p2, Lzp2/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzp2/b;

    iput-object p1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->w:Lzp2/b;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "TimeCapsuleSyncWorker"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->x:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->x:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;)Lzp2/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;->w:Lzp2/b;

    return-object p0
.end method


# virtual methods
.method public doWork(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;

    iget v1, v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;

    invoke-direct {v0, p0, p1}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;-><init>(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$b;-><init>(Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;Lq83/d;)V

    iput v3, v0, Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker$a;->y:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string v0, "withContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
