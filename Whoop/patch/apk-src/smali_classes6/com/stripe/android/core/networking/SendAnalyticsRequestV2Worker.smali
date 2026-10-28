.class public final Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lab/i0;

.field public static final x:Lyv0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lab/i0;

    const/4 v1, 0x0

    const/16 v2, 0x1f

    invoke-direct {v0, v1, v1, v2}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    sput-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->w:Lab/i0;

    new-instance v0, Lyv0/h;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    sput-object v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->x:Lyv0/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final doWork(Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lyy/h0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lyy/h0;

    iget v1, v0, Lyy/h0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyy/h0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyy/h0;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Lyy/h0;-><init>(Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lyy/h0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyy/h0;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lyy/h0;->w:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lyy/h0;->x:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    iget-object v5, v0, Lyy/h0;->w:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "data"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v6, "getApplicationContext(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->x:Lyv0/h;

    invoke-virtual {v6, v2}, Lyv0/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq30/w0;

    iput-object p0, v0, Lyy/h0;->w:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    iput-object p0, v0, Lyy/h0;->x:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    iput v5, v0, Lyy/h0;->E:I

    iget-object v5, v2, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v5, Lbc3/z;

    new-instance v6, Lo23/p;

    const/16 v7, 0x13

    invoke-direct {v6, v2, p1, v3, v7}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v6, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p0

    move-object v5, v2

    :goto_1
    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    if-nez p1, :cond_6

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_6
    invoke-virtual {v2}, Lic/v;->getRunAttemptCount()I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->withWorkManagerParams(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    :try_start_1
    sget-object v2, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->w:Lab/i0;

    iput-object v5, v0, Lyy/h0;->w:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    iput-object v3, v0, Lyy/h0;->x:Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    iput v4, v0, Lyy/h0;->E:I

    invoke-virtual {v2, p1, v0}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object v0, v5

    :goto_3
    :try_start_2
    check-cast p1, Lyy/n0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception p1

    move-object v0, v5

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_8

    check-cast p1, Lyy/n0;

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    goto :goto_6

    :cond_8
    instance-of p1, v1, Lcom/stripe/android/core/exception/InvalidRequestException;

    if-nez p1, :cond_9

    invoke-virtual {v0}, Lic/v;->getRunAttemptCount()I

    move-result p1

    const/4 v0, 0x4

    if-ge p1, v0, :cond_9

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_6

    :cond_9
    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    :goto_6
    return-object p1
.end method
