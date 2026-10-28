.class public final Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;",
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
        "Lei1/a;",
        "z",
        "Ll83/h;",
        "k",
        "()Lei1/a;",
        "foregroundGpsRouteStorage",
        "Lfi1/b;",
        "E",
        "l",
        "()Lfi1/b;",
        "foregroundGpsUploader",
        "F",
        "a",
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


# static fields
.field public static final F:Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$a;

.field public static final G:I


# instance fields
.field private final E:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->F:Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->G:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "ForegroundGpsUploadWorker"

    iput-object p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->E:Ll83/h;

    return-void
.end method

.method private final k()Lei1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lei1/a;

    return-object v0
.end method

.method private final l()Lfi1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi1/b;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 26
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

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;

    iget v2, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;-><init>(Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->H:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v9, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->F:I

    iget-wide v10, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->x:J

    iget-wide v12, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->w:J

    iget-object v14, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->E:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v14, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->z:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->y:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v14

    move-wide/from16 v24, v12

    move-wide v13, v10

    move-wide/from16 v11, v24

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->F:I

    iget-wide v10, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->x:J

    iget-wide v12, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->w:J

    iget-object v14, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->E:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->z:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v5, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-wide v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->x:J

    iget-wide v10, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->w:J

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v4, "sessionStartTimeMs"

    const-wide/16 v10, -0x1

    invoke-virtual {v0, v4, v10, v11}, Lic/g;->b(Ljava/lang/String;J)J

    move-result-wide v10

    const-wide/16 v4, 0x0

    cmp-long v0, v10, v4

    if-gez v0, :cond_5

    new-instance v0, Lic/r;

    invoke-direct {v0}, Lic/r;-><init>()V

    return-object v0

    :cond_5
    invoke-virtual {v2}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v4, "sessionEndTimeMs"

    invoke-virtual {v0, v4, v10, v11}, Lic/g;->b(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-direct {v2}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->k()Lei1/a;

    move-result-object v0

    iput-wide v10, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->w:J

    iput-wide v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->x:J

    iput v9, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    invoke-interface {v0, v10, v11, v1}, Lei1/a;->a(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_1
    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v0

    return-object v0

    :cond_7
    check-cast v0, Ljava/lang/Iterable;

    const/16 v12, 0x7d0

    invoke-static {v0, v12}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide v13, v4

    move-wide v11, v10

    const/4 v4, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Ljava/util/List;

    invoke-direct {v2}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->l()Lfi1/b;

    move-result-object v10

    iput-object v8, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->y:Ljava/lang/Object;

    iput-object v0, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->z:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->E:Ljava/lang/Object;

    iput-wide v11, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->w:J

    iput-wide v13, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->x:J

    iput v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->F:I

    iput v7, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    move-object/from16 v16, v1

    invoke-interface/range {v10 .. v16}, Lfi1/b;->a(JJLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_4

    :cond_8
    move-wide/from16 v24, v13

    move-wide v12, v11

    move-wide/from16 v10, v24

    move-object v14, v15

    move-object v15, v0

    move-object v0, v1

    move-object/from16 v1, v16

    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {v2}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->k()Lei1/a;

    move-result-object v16

    invoke-static {v14}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfv1/b;

    invoke-virtual {v5}, Lfv1/b;->e()J

    move-result-wide v19

    invoke-static {v14}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfv1/b;

    invoke-virtual {v5}, Lfv1/b;->e()J

    move-result-wide v21

    iput-object v8, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->y:Ljava/lang/Object;

    iput-object v15, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->z:Ljava/lang/Object;

    iput-object v8, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->E:Ljava/lang/Object;

    iput-wide v12, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->w:J

    iput-wide v10, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->x:J

    iput v4, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->F:I

    iput-boolean v0, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->G:Z

    iput v6, v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    move-object/from16 v23, v1

    move-wide/from16 v17, v12

    invoke-interface/range {v16 .. v23}, Lei1/a;->d(JJJLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_9

    :goto_4
    return-object v3

    :cond_9
    move-wide v13, v10

    move-object v0, v15

    move-wide/from16 v11, v17

    move-object/from16 v1, v23

    goto :goto_2

    :cond_a
    move-object/from16 v23, v1

    move-wide/from16 v17, v12

    move v4, v9

    move-wide v13, v10

    move-object v0, v15

    move-wide/from16 v11, v17

    goto :goto_2

    :cond_b
    if-eqz v4, :cond_c

    invoke-virtual {v2}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    const-string v1, "One or more foreground GPS batches failed to upload, will retry with backoff"

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lic/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_c
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v0

    return-object v0
.end method
