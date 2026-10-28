.class public final Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001b\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001b\u001a\u0004\u0008&\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "id",
        "Ll83/a0;",
        "p",
        "(JLq83/d;)Ljava/lang/Object;",
        "",
        "metricName",
        "o",
        "(Ljava/lang/String;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lrk2/f;",
        "z",
        "Ll83/h;",
        "n",
        "()Lrk2/f;",
        "pendingActivitySaveStore",
        "Lcom/whoop/service/network/ActivitiesApi;",
        "E",
        "m",
        "()Lcom/whoop/service/network/ActivitiesApi;",
        "activitiesApi",
        "Liy1/c;",
        "F",
        "d",
        "()Liy1/c;",
        "metricWriter",
        "G",
        "a",
        "track-activity_release"
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
.field private static final G:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$a;

.field public static final H:I


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->G:Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->H:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PERIODIC_SAVE_ACTIVITY_WORK"

    iput-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$d;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->F:Ll83/h;

    return-void
.end method

.method private final d()Liy1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    return-object v0
.end method

.method public static final synthetic k(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;)Lcom/whoop/service/network/ActivitiesApi;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->m()Lcom/whoop/service/network/ActivitiesApi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->p(JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final m()Lcom/whoop/service/network/ActivitiesApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/ActivitiesApi;

    return-object v0
.end method

.method private final n()Lrk2/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrk2/f;

    return-object v0
.end method

.method private final o(Ljava/lang/String;)V
    .locals 9

    invoke-direct {p0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->d()Liy1/c;

    move-result-object v0

    new-instance v1, Ljy1/a;

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method private final p(JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;

    iget v1, v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;

    invoke-direct {v0, p0, p3}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;-><init>(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->n()Lrk2/f;

    move-result-object p3

    iput-wide p1, v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->w:J

    iput v3, v0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$b;->z:I

    invoke-interface {p3, p1, p2, v0}, Lrk2/f;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Failed to remove pending activity save after success"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const-string p1, "track_activity.pending_save.remove_failure"

    invoke-direct {p0, p1}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->o(Ljava/lang/String;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 23
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;

    iget v3, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;

    invoke-direct {v2, v0, v1}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;-><init>(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget v4, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->F:I

    iget-object v10, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->E:Ljava/lang/Object;

    check-cast v10, Lu02/a;

    iget-object v10, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->z:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    iget-object v10, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->y:Ljava/lang/Object;

    check-cast v10, Lrk2/b;

    iget-object v10, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->x:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->w:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v2

    move-object v1, v10

    :goto_1
    move v2, v4

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->F:I

    iget-object v10, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->z:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    iget-object v10, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->y:Ljava/lang/Object;

    check-cast v10, Lrk2/b;

    iget-object v11, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->x:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->w:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v2

    goto/16 :goto_4

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->n()Lrk2/f;

    move-result-object v1

    iput v8, v2, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    invoke-interface {v1, v2}, Lrk2/f;->getAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_2
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v1

    return-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v15, v2

    move v2, v7

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrk2/b;

    new-instance v16, Lcom/whoop/addactivity/network/CreateActivityRequestV1;

    invoke-virtual {v4}, Lrk2/b;->a()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v4}, Lrk2/b;->c()I

    move-result v18

    invoke-virtual {v4}, Lrk2/b;->g()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v4}, Lrk2/b;->b()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v4}, Lrk2/b;->d()Z

    move-result v21

    invoke-virtual {v4}, Lrk2/b;->f()Ljava/util/List;

    move-result-object v22

    invoke-direct/range {v16 .. v22}, Lcom/whoop/addactivity/network/CreateActivityRequestV1;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    move-object/from16 v10, v16

    sget-object v11, Lu02/a;->a:Lu02/a$a;

    move-object v12, v11

    invoke-virtual {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v11

    new-instance v14, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$g;

    invoke-direct {v14, v0, v10, v9}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$g;-><init>(Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)V

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->w:Ljava/lang/Object;

    iput-object v1, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->x:Ljava/lang/Object;

    iput-object v4, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->y:Ljava/lang/Object;

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->z:Ljava/lang/Object;

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->E:Ljava/lang/Object;

    iput v2, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->F:I

    iput v6, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    move-object v10, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    invoke-static/range {v10 .. v17}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_7

    goto :goto_5

    :cond_7
    move-object v11, v1

    move-object v1, v10

    move-object v10, v4

    move v4, v2

    :goto_4
    check-cast v1, Lu02/a;

    instance-of v2, v1, Lu02/a$c;

    if-eqz v2, :cond_9

    invoke-virtual {v10}, Lrk2/b;->e()J

    move-result-wide v1

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->w:Ljava/lang/Object;

    iput-object v11, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->x:Ljava/lang/Object;

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->y:Ljava/lang/Object;

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->z:Ljava/lang/Object;

    iput-object v9, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->E:Ljava/lang/Object;

    iput v4, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->F:I

    iput v5, v15, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$f;->I:I

    invoke-direct {v0, v1, v2, v15}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->p(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    :goto_5
    return-object v3

    :cond_8
    move-object v1, v11

    goto/16 :goto_1

    :cond_9
    instance-of v2, v1, Lu02/a$b$a;

    if-eqz v2, :cond_b

    check-cast v1, Lu02/a$b$a;

    invoke-virtual {v1}, Lu02/a$b$a;->d()I

    move-result v1

    const/16 v2, 0x199

    if-ne v1, v2, :cond_a

    invoke-virtual {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    const-string v2, "Pending activity save rejected as a conflict (409) - will retry later"

    new-array v4, v7, [Lqr2/a$a;

    invoke-interface {v1, v2, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v1, "track_activity.pending_save.create_conflict"

    invoke-direct {v0, v1}, Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;->o(Ljava/lang/String;)V

    :cond_a
    :goto_6
    move v2, v8

    move-object v1, v11

    goto/16 :goto_3

    :cond_b
    instance-of v1, v1, Lu02/a$b$b;

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_d
    if-eqz v2, :cond_e

    invoke-virtual {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    const-string v2, "One or more pending activity saves failed, will retry with backoff"

    new-array v3, v7, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lic/s;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1

    :cond_e
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v1

    return-object v1
.end method
