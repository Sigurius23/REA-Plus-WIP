.class public final Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;",
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
        "z",
        "a",
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


# static fields
.field public static final z:Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;


# instance fields
.field private final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;->z:Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "BatteryPackRelativeEventsWorker"

    iput-object p1, p0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p1, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;

    iget v1, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;-><init>(Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->x:Ljava/lang/Object;

    check-cast v0, Lf52/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->x:Ljava/lang/Object;

    check-cast v0, Lf52/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "isConsole"

    const/4 v5, 0x0

    invoke-virtual {p1, v2, v5}, Lic/g;->a(Ljava/lang/String;Z)Z

    move-result p1

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v2

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v2, v2, Lwf3/a;->d:Lxf3/c;

    const-class v5, Lf52/d;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v2, v6, v5, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf52/d;

    if-eqz p1, :cond_5

    iput-object v6, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->x:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->w:Z

    iput v4, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->E:I

    invoke-virtual {v2, v0}, Lf52/d;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_4

    :cond_5
    iput-object v6, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->x:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->w:Z

    iput v3, v0, Lcom/whoop/puffin/sync/BatteryPackRelativeEventsWorker$b;->E:I

    invoke-virtual {v2, v0}, Lf52/d;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_4
    if-eqz p1, :cond_7

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
