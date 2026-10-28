.class public final Lcom/whoop/puffin/workManager/PuffinScanWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001fR!\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000b0!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/puffin/workManager/PuffinScanWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Ly42/j;",
        "z",
        "Ll83/h;",
        "l",
        "()Ly42/j;",
        "puffinManager",
        "Le52/a;",
        "E",
        "m",
        "()Le52/a;",
        "puffinStore",
        "Lm32/a;",
        "F",
        "k",
        "()Lm32/a;",
        "permissionChecker",
        "",
        "G",
        "n",
        "()Ljava/util/List;",
        "requiredPermissions",
        "puffin_release"
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PuffinScanWorker"

    iput-object p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/puffin/workManager/PuffinScanWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/puffin/workManager/PuffinScanWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/puffin/workManager/PuffinScanWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/puffin/workManager/PuffinScanWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/puffin/workManager/PuffinScanWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/puffin/workManager/PuffinScanWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->F:Ll83/h;

    new-instance p2, Lvf3/c;

    const-string v1, "bluetooth-device-permissions"

    invoke-direct {p2, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/puffin/workManager/PuffinScanWorker$d;

    invoke-direct {v1, p0, p2, v0}, Lcom/whoop/puffin/workManager/PuffinScanWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->G:Ll83/h;

    return-void
.end method

.method private final k()Lm32/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm32/a;

    return-object v0
.end method

.method private final l()Ly42/j;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly42/j;

    return-object v0
.end method

.method private final m()Le52/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le52/a;

    return-object v0
.end method

.method private final n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/workManager/PuffinScanWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;

    iget v1, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;

    invoke-direct {v0, p0, p1}, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;-><init>(Lcom/whoop/puffin/workManager/PuffinScanWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->w:Ljava/lang/Object;

    check-cast v0, Lc52/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v2, "Puffin scan worker started"

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/puffin/workManager/PuffinScanWorker;->n()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v2, p1, Ljava/util/Collection;

    if-eqz v2, :cond_4

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0}, Lcom/whoop/puffin/workManager/PuffinScanWorker;->k()Lm32/a;

    move-result-object v7

    invoke-interface {v7, v2}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Puffin scan worker \u2014 Missing required Bluetooth permissions, aborting"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_6
    :goto_1
    invoke-direct {p0}, Lcom/whoop/puffin/workManager/PuffinScanWorker;->m()Le52/a;

    move-result-object p1

    iput v4, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    invoke-virtual {p1, v0}, Le52/a;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast p1, Lc52/e;

    if-nez p1, :cond_8

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "No last connected Puffin MAC address found"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v2

    const-string v4, "key_source"

    invoke-virtual {v2, v4}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v2

    const-string v4, "Puffin scan worker \u2014 No trigger source provided in input data, using default"

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {v2, v4, v7}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v2, Lus0/d$c;->PERIODIC_SCAN:Lus0/d$c;

    invoke-virtual {v2}, Lus0/d$c;->getValue()Ljava/lang/String;

    move-result-object v2

    :cond_9
    invoke-direct {p0}, Lcom/whoop/puffin/workManager/PuffinScanWorker;->l()Ly42/j;

    move-result-object v4

    invoke-virtual {p1}, Lc52/e;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v7, Lus0/d$c;->Companion:Lus0/d$c$a;

    invoke-virtual {v7, v2}, Lus0/d$c$a;->a(Ljava/lang/String;)Lus0/d$c;

    move-result-object v2

    iput-object v5, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->w:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->x:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/puffin/workManager/PuffinScanWorker$e;->E:I

    invoke-virtual {v4, p1, v2, v0}, Ly42/j;->c(Ljava/lang/String;Lus0/d$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_3
    return-object v1

    :cond_a
    :goto_4
    check-cast p1, Ly42/a;

    if-eqz p1, :cond_b

    invoke-interface {p1}, Ly42/a;->l()Lec3/t1;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-interface {p1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lc52/b;

    :cond_b
    sget-object p1, Lc52/b$f;->a:Lc52/b$f;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    sget-object p1, Lc52/b$a;->a:Lc52/b$a;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Puffin scan worker \u2014 Puffin connection state is not ready or connected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_d
    :goto_5
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Puffin scan worker \u2014 Puffin is ready"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1
.end method
