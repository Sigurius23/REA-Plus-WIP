.class public final Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lu62/b;",
        "y",
        "Lu62/b;",
        "remoteDeviceConfigInteractor",
        "",
        "z",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "E",
        "a",
        "remote-device-config_release"
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
.field public static final E:Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$a;


# instance fields
.field private final y:Lu62/b;

.field private final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;->E:Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class p2, Lu62/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu62/b;

    iput-object p1, p0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;->y:Lu62/b;

    const-string p1, "RemoteDeviceConfigWorkManager"

    iput-object p1, p0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;->z:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p1, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;

    iget v1, v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;-><init>(Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;->y:I

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

    iget-object p1, p0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager;->y:Lu62/b;

    iput v3, v0, Lcom/whoop/removeDeviceConfig/workmanager/RemoteDeviceConfigWorkManager$b;->y:I

    invoke-virtual {p1, v0}, Lu62/b;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lu62/a;

    sget-object v0, Lu62/a;->SUCCESS:Lu62/a;

    if-ne p1, v0, :cond_4

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
