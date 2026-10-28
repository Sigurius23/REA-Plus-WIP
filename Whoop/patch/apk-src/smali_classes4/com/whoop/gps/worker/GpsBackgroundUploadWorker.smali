.class public final Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;",
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
        "Lii1/a;",
        "z",
        "Ll83/h;",
        "m",
        "()Lii1/a;",
        "gpsStorage",
        "Lji1/a;",
        "E",
        "k",
        "()Lji1/a;",
        "backendUploader",
        "Ljs0/c;",
        "F",
        "l",
        "()Ljs0/c;",
        "configurationRepository",
        "gps-tracking_release"
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

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PERIODIC_GPS_UPLOAD_WORK"

    iput-object p1, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->F:Ll83/h;

    return-void
.end method

.method private final k()Lji1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lji1/a;

    return-object v0
.end method

.method private final l()Ljs0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljs0/c;

    return-object v0
.end method

.method private final m()Lii1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii1/a;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p1, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;

    iget v1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;

    invoke-direct {v0, p0, p1}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;-><init>(Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->w:I

    iget-object v5, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget v2, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->l()Ljs0/c;

    move-result-object p1

    sget-object v2, Lth1/b;->a:Lth1/b;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v10, Ljava/lang/Integer;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_1

    :cond_5
    move-object p1, v7

    goto/16 :goto_1

    :cond_6
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :cond_7
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    goto :goto_1

    :cond_8
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    goto :goto_1

    :cond_9
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_a
    const-class v11, Ljava/lang/String;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_b
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_c

    goto :goto_2

    :cond_c
    move-object v2, p1

    :goto_2
    if-eqz v2, :cond_13

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->m()Lii1/a;

    move-result-object v2

    iput p1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->w:I

    iput v6, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->G:I

    invoke-interface {v2, p1, v0}, Lii1/a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_d

    goto/16 :goto_6

    :cond_d
    move-object v12, v2

    move v2, p1

    move-object p1, v12

    :goto_3
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_e
    invoke-direct {p0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->k()Lji1/a;

    move-result-object v6

    iput-object p1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->x:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->w:I

    iput v5, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->G:I

    invoke-interface {v6, p1, v0}, Lji1/a;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_f

    goto :goto_6

    :cond_f
    move-object v12, v5

    move-object v5, p1

    move-object p1, v12

    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_12

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lyh1/a;

    invoke-virtual {v9}, Lyh1/a;->f()J

    move-result-wide v9

    new-instance v11, Ljava/lang/Long;

    invoke-direct {v11, v9, v10}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_10
    invoke-direct {p0}, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker;->m()Lii1/a;

    move-result-object v6

    iput-object v5, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->x:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->y:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->w:I

    iput-boolean p1, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->z:Z

    iput v4, v0, Lcom/whoop/gps/worker/GpsBackgroundUploadWorker$d;->G:I

    invoke-interface {v6, v8, v0}, Lii1/a;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_11

    :goto_6
    return-object v1

    :cond_11
    move-object v0, v5

    :goto_7
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const-string v2, "Uploaded="

    const-string v4, ", deleted="

    invoke-static {v0, p1, v2, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {v1, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_12
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Upload failed, will try again in next periodic run"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_13
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
