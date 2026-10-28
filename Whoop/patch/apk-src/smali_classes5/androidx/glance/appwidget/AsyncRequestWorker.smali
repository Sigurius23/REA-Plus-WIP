.class public final Landroidx/glance/appwidget/AsyncRequestWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/glance/appwidget/AsyncRequestWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "p6/t",
        "glance-appwidget"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Lbc3/w1;

.field public final x:Lr6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    iput-object p1, p0, Landroidx/glance/appwidget/AsyncRequestWorker;->w:Lbc3/w1;

    iget-object p1, p2, Landroidx/work/WorkerParameters;->b:Lic/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lic/g;->a:Ljava/util/HashMap;

    const-string p2, "request"

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, [Ljava/lang/Object;

    if-eqz p2, :cond_1

    check-cast p1, [Ljava/lang/Object;

    array-length p2, p1

    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    move-result v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Byte"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :cond_2
    invoke-static {v0}, Lr6/n;->F([B)Lr6/n;

    move-result-object p1

    iput-object p1, p0, Landroidx/glance/appwidget/AsyncRequestWorker;->x:Lr6/n;

    return-void
.end method


# virtual methods
.method public final doWork(Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ln20/j;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-direct {v0, p0, v1, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getCoroutineContext()Lbc3/z;
    .locals 1

    iget-object v0, p0, Landroidx/glance/appwidget/AsyncRequestWorker;->w:Lbc3/w1;

    return-object v0
.end method
