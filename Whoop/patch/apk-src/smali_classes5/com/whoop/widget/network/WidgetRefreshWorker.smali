.class public final Lcom/whoop/widget/network/WidgetRefreshWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008#\u0010\u000bJ\u0010\u0010%\u001a\u00020$H\u0096@\u00a2\u0006\u0004\u0008%\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001a\u0010,\u001a\u00020\u00168\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010.\u001a\u0004\u0008/\u00100R\u001b\u00104\u001a\u0002028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010.\u001a\u0004\u0008&\u00103R\u001b\u00108\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010.\u001a\u0004\u00086\u00107R\u001b\u0010<\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010.\u001a\u0004\u0008:\u0010;R!\u0010A\u001a\u0008\u0012\u0004\u0012\u00020>0=8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u0010.\u001a\u0004\u0008(\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010.\u001a\u0004\u0008D\u0010E\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/widget/network/WidgetRefreshWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Lof3/a;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Ll83/a0;",
        "D",
        "(Lq83/d;)Ljava/lang/Object;",
        "H",
        "()V",
        "G",
        "F",
        "E",
        "Lcom/whoop/widget/model/HealthspanWidgetModel;",
        "response",
        "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
        "B",
        "(Lcom/whoop/widget/model/HealthspanWidgetModel;Lq83/d;)Ljava/lang/Object;",
        "",
        "url",
        "Lbc3/i0;",
        "",
        "t",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "u",
        "()Ljava/lang/Integer;",
        "Lf6/a;",
        "preferences",
        "s",
        "(Lf6/a;)V",
        "C",
        "Lic/u;",
        "j",
        "y",
        "Landroid/content/Context;",
        "z",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lcom/whoop/widget/api/WidgetApi;",
        "Ll83/h;",
        "v",
        "()Lcom/whoop/widget/api/WidgetApi;",
        "api",
        "Lcom/whoop/widget/api/StressWidgetApi;",
        "()Lcom/whoop/widget/api/StressWidgetApi;",
        "stressApi",
        "Ltd1/b;",
        "A",
        "()Ltd1/b;",
        "whoopStrapProxy",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "w",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ly6/g;",
        "Lf6/f;",
        "I",
        "()Ly6/g;",
        "stressStateDefinition",
        "Lcom/whoop/widget/ui/healthspan/a;",
        "J",
        "x",
        "()Lcom/whoop/widget/ui/healthspan/a;",
        "healthspanWidgetStateWriter",
        "widget_release"
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

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final y:Landroid/content/Context;

.field private final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    const-string p1, "WIDGET_REFRESH_WORKER"

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->z:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/widget/network/WidgetRefreshWorker$i;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker$i;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/widget/network/WidgetRefreshWorker$j;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker$j;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->F:Ll83/h;

    new-instance p2, Lcom/whoop/widget/network/WidgetRefreshWorker$k;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker$k;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->G:Ll83/h;

    new-instance p2, Lcom/whoop/widget/network/WidgetRefreshWorker$l;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker$l;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->H:Ll83/h;

    new-instance p2, Lvf3/c;

    const-string v1, "STRESS_WIDGET_STATE_DEFINITION"

    invoke-direct {p2, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/widget/network/WidgetRefreshWorker$m;

    invoke-direct {v1, p0, p2, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker$m;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->I:Ll83/h;

    new-instance p2, Lcom/whoop/widget/network/WidgetRefreshWorker$n;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker$n;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->J:Ll83/h;

    return-void
.end method

.method private final A()Ltd1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd1/b;

    return-object v0
.end method

.method private final B(Lcom/whoop/widget/model/HealthspanWidgetModel;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/model/HealthspanWidgetModel;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/whoop/widget/network/WidgetRefreshWorker$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;

    iget v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;

    invoke-direct {v2, v0, v1}, Lcom/whoop/widget/network/WidgetRefreshWorker$b;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->E:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    iget-object v2, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/widget/model/HealthspanWidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v3

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    iget-object v6, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->w:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/widget/model/HealthspanWidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->u()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getLockedContent()Lcom/whoop/widget/model/WidgetLockedContent;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getLockedContent()Lcom/whoop/widget/model/WidgetLockedContent;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/widget/model/WidgetLockedContent;->getLockedIcon()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v7, p1

    iput-object v7, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->w:Ljava/lang/Object;

    iput-object v1, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->x:Ljava/lang/Object;

    iput v6, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->E:I

    invoke-direct {v0, v4, v2}, Lcom/whoop/widget/network/WidgetRefreshWorker;->t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v6, v4

    move-object v4, v1

    move-object v1, v6

    move-object v6, v7

    :goto_1
    check-cast v1, Lbc3/i0;

    iput-object v6, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->w:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->x:Ljava/lang/Object;

    iput v5, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$b;->E:I

    invoke-interface {v1, v2}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    move-object v12, v4

    move-object v2, v6

    :goto_3
    check-cast v1, [B

    invoke-virtual {v2}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getLockedContent()Lcom/whoop/widget/model/WidgetLockedContent;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/widget/model/WidgetLockedContent;->getHeaderTextDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getLockedContent()Lcom/whoop/widget/model/WidgetLockedContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/widget/model/WidgetLockedContent;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v2

    new-instance v10, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;

    invoke-direct {v10, v1, v3, v2}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    const/16 v13, 0x3f

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x1

    invoke-direct/range {v3 .. v14}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;-><init>(Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_6
    move-object/from16 v7, p1

    invoke-virtual {v7}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v2

    if-nez v2, :cond_7

    new-instance v7, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    const/16 v17, 0x7f

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v7 .. v18}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;-><init>(Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_7
    move-object/from16 v16, v1

    new-instance v7, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    sget-object v1, Lg93/d;->x:Lg93/a;

    invoke-virtual {v1}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    new-instance v8, Ljava/lang/Long;

    invoke-direct {v8, v1, v2}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getPaceOfAgingAnimationScore()D

    move-result-wide v1

    double-to-float v1, v1

    new-instance v9, Ljava/lang/Float;

    invoke-direct {v9, v1}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getYearsDifferenceAnimationScore()D

    move-result-wide v1

    double-to-float v1, v1

    new-instance v10, Ljava/lang/Float;

    invoke-direct {v10, v1}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getStyleValues()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoebaStyleValues;->getAge()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getAgeSubtitleDisplay()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/widget/model/HealthspanWidgetModel;->getAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->getAgeSubtitleStyle()Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0x40

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v18}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;-><init>(Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method private final C(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/widget/network/WidgetRefreshWorker$c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/widget/network/WidgetRefreshWorker$c;

    iget v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/whoop/widget/network/WidgetRefreshWorker$c;

    invoke-direct {v2, v0, v1}, Lcom/whoop/widget/network/WidgetRefreshWorker$c;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->P:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v2, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1e

    :pswitch_1
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1c

    :pswitch_2
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1b

    :pswitch_3
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1a

    :pswitch_4
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_19

    :pswitch_5
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    check-cast v6, Ln6/l;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v4

    move-object v10, v6

    move-object v13, v7

    move-object v7, v8

    move-object v6, v9

    goto/16 :goto_17

    :pswitch_6
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_7
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    check-cast v6, Ln6/l;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v3

    move v3, v4

    move v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v9

    goto/16 :goto_15

    :pswitch_8
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_14

    :pswitch_9
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    check-cast v6, Ln6/l;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v3

    move v3, v4

    move v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v9

    move-object v9, v13

    goto/16 :goto_13

    :pswitch_a
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_b
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    check-cast v6, Ln6/l;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v3

    move v3, v4

    move v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v9

    move-object v9, v13

    goto/16 :goto_11

    :pswitch_c
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_d
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    check-cast v6, Ln6/l;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v13, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v14, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v3

    move v3, v4

    move v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v9

    move-object v9, v13

    goto/16 :goto_f

    :pswitch_e
    iget v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iget v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iget-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_f
    iget-object v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_10
    iget-object v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/widget/model/WidgetModel;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v3

    goto :goto_3

    :pswitch_11
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_12
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->v()Lcom/whoop/widget/api/WidgetApi;

    move-result-object v3

    iput v10, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x7

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lcom/whoop/widget/api/WidgetApi;->a(Lcom/whoop/widget/api/WidgetApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_1

    goto/16 :goto_1d

    :cond_1
    :goto_2
    check-cast v1, Lcom/whoop/widget/model/WidgetModel;

    invoke-direct {v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->v()Lcom/whoop/widget/api/WidgetApi;

    move-result-object v3

    iput-object v1, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-interface {v3, v7}, Lcom/whoop/widget/api/WidgetApi;->getRecoveryPercent(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    goto/16 :goto_1d

    :cond_2
    move-object v4, v1

    move-object v1, v3

    :goto_3
    move-object v3, v1

    check-cast v3, Lcom/whoop/widget/model/WidgetSingle;

    invoke-direct {v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->v()Lcom/whoop/widget/api/WidgetApi;

    move-result-object v1

    iput-object v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-interface {v1, v7}, Lcom/whoop/widget/api/WidgetApi;->getStepsCount(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    goto/16 :goto_1d

    :cond_3
    :goto_4
    check-cast v1, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    sget v6, Ld03/b;->a:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "getString(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/whoop/widget/model/WidgetSingle;->getPercentage()F

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/widget/model/WidgetSingle;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lcom/whoop/widget/model/WidgetModel;->getWidgets()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/widget/model/WidgetStatistic;

    invoke-virtual {v9}, Lcom/whoop/widget/model/WidgetStatistic;->getType()Lcom/whoop/widget/model/WidgetType;

    move-result-object v9

    sget-object v13, Lcom/whoop/widget/model/WidgetType;->SLEEP:Lcom/whoop/widget/model/WidgetType;

    if-ne v9, v13, :cond_4

    goto :goto_5

    :cond_5
    move-object v6, v12

    :goto_5
    check-cast v6, Lcom/whoop/widget/model/WidgetStatistic;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/whoop/widget/model/WidgetStatistic;->getText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    move-object v6, v1

    goto :goto_7

    :cond_7
    :goto_6
    move-object v6, v5

    :goto_7
    invoke-virtual {v4}, Lcom/whoop/widget/model/WidgetModel;->getWidgets()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v13, v9

    check-cast v13, Lcom/whoop/widget/model/WidgetStatistic;

    invoke-virtual {v13}, Lcom/whoop/widget/model/WidgetStatistic;->getType()Lcom/whoop/widget/model/WidgetType;

    move-result-object v13

    sget-object v14, Lcom/whoop/widget/model/WidgetType;->STRAIN:Lcom/whoop/widget/model/WidgetType;

    if-ne v13, v14, :cond_8

    goto :goto_8

    :cond_9
    move-object v9, v12

    :goto_8
    check-cast v9, Lcom/whoop/widget/model/WidgetStatistic;

    if-eqz v9, :cond_b

    invoke-virtual {v9}, Lcom/whoop/widget/model/WidgetStatistic;->getText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_9

    :cond_a
    move-object v5, v1

    :cond_b
    :goto_9
    invoke-virtual {v4}, Lcom/whoop/widget/model/WidgetModel;->getWidgets()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lcom/whoop/widget/model/WidgetStatistic;

    invoke-virtual {v9}, Lcom/whoop/widget/model/WidgetStatistic;->getType()Lcom/whoop/widget/model/WidgetType;

    move-result-object v9

    sget-object v13, Lcom/whoop/widget/model/WidgetType;->RECOVERY:Lcom/whoop/widget/model/WidgetType;

    if-ne v9, v13, :cond_c

    goto :goto_a

    :cond_d
    move-object v4, v12

    :goto_a
    check-cast v4, Lcom/whoop/widget/model/WidgetStatistic;

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/whoop/widget/model/WidgetStatistic;->isCalibrating()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_b

    :cond_e
    move v1, v11

    :goto_b
    new-instance v4, Lp6/n0;

    iget-object v9, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v4, v9}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v8, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v1, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/4 v9, 0x4

    iput v9, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const-class v9, Ln03/f;

    invoke-virtual {v4, v9, v7}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v4

    if-ne v4, v2, :cond_f

    goto/16 :goto_1d

    :cond_f
    move/from16 v16, v3

    move v3, v1

    move-object v1, v4

    move/from16 v4, v16

    :goto_c
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move v1, v11

    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ln6/l;

    iget-object v14, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    new-instance v15, Lcom/whoop/widget/network/WidgetRefreshWorker$d;

    if-eqz v3, :cond_10

    goto :goto_e

    :cond_10
    move v10, v11

    :goto_e
    invoke-direct {v15, v4, v10, v12}, Lcom/whoop/widget/network/WidgetRefreshWorker$d;-><init>(FZLq83/d;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v9, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iput v1, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iput v11, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->O:I

    const/4 v10, 0x5

    iput v10, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v14, v13, v15, v8}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_11

    goto/16 :goto_1d

    :cond_11
    :goto_f
    const/4 v10, 0x1

    goto :goto_d

    :cond_12
    new-instance v1, Lp6/n0;

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v1, v6}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v9, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/4 v6, 0x6

    iput v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const-class v6, Ln03/g;

    invoke-virtual {v1, v6, v8}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v2, :cond_13

    goto/16 :goto_1d

    :cond_13
    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    :goto_10
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move v1, v11

    :cond_14
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ln6/l;

    iget-object v13, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    new-instance v14, Lcom/whoop/widget/network/WidgetRefreshWorker$e;

    invoke-direct {v14, v7, v12}, Lcom/whoop/widget/network/WidgetRefreshWorker$e;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v9, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iput v1, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iput v11, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->O:I

    const/4 v15, 0x7

    iput v15, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v13, v10, v14, v8}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_14

    goto/16 :goto_1d

    :cond_15
    new-instance v1, Lp6/n0;

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v1, v6}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v9, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0x8

    iput v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const-class v6, Ln03/i;

    invoke-virtual {v1, v6, v8}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v2, :cond_16

    goto/16 :goto_1d

    :cond_16
    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    :goto_12
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move v1, v11

    :cond_17
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ln6/l;

    iget-object v13, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    new-instance v14, Lcom/whoop/widget/network/WidgetRefreshWorker$f;

    invoke-direct {v14, v5, v12}, Lcom/whoop/widget/network/WidgetRefreshWorker$f;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v9, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iput v1, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iput v11, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->O:I

    const/16 v15, 0x9

    iput v15, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v13, v10, v14, v8}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_17

    goto/16 :goto_1d

    :cond_18
    new-instance v1, Lp6/n0;

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v1, v6}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v9, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0xa

    iput v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const-class v6, Ln03/h;

    invoke-virtual {v1, v6, v8}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v2, :cond_19

    goto/16 :goto_1d

    :cond_19
    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    :goto_14
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v13, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v1

    move v1, v11

    :cond_1a
    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ln6/l;

    iget-object v10, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    new-instance v14, Lcom/whoop/widget/network/WidgetRefreshWorker$g;

    invoke-direct {v14, v13, v12}, Lcom/whoop/widget/network/WidgetRefreshWorker$g;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v13, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iput v1, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iput v11, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->O:I

    const/16 v15, 0xb

    iput v15, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v10, v9, v14, v8}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_1a

    goto/16 :goto_1d

    :cond_1b
    new-instance v1, Lp6/n0;

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v1, v6}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0xc

    iput v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    const-class v6, Lk03/c;

    invoke-virtual {v1, v6, v8}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v2, :cond_1c

    goto/16 :goto_1d

    :cond_1c
    move-object v6, v7

    move-object v7, v8

    :goto_16
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v10, v1

    move v1, v3

    move-object v13, v7

    move v3, v11

    move-object v7, v5

    move v5, v4

    :cond_1d
    :goto_17
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ln6/l;

    iget-object v15, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    new-instance v4, Lcom/whoop/widget/network/WidgetRefreshWorker$h;

    if-eqz v1, :cond_1e

    const/4 v8, 0x1

    goto :goto_18

    :cond_1e
    move v8, v11

    :goto_18
    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/widget/network/WidgetRefreshWorker$h;-><init>(FLjava/lang/String;Ljava/lang/String;ZLq83/d;)V

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v6, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v7, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v10, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v5, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v1, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    iput v3, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->N:I

    iput v11, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->O:I

    const/16 v8, 0xd

    iput v8, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v15, v14, v4, v13}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1d

    goto/16 :goto_1d

    :cond_1f
    new-instance v3, Ln03/f;

    invoke-direct {v3}, Ln03/f;-><init>()V

    iget-object v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->H:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->I:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->J:Ljava/lang/Object;

    iput-object v12, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->K:Ljava/lang/Object;

    iput v5, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v1, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0xe

    iput v6, v13, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v3, v4, v13}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_20

    goto/16 :goto_1d

    :cond_20
    move v3, v1

    move v4, v5

    move-object v7, v13

    :goto_19
    new-instance v1, Ln03/i;

    invoke-direct {v1}, Ln03/i;-><init>()V

    iget-object v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0xf

    iput v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v1, v5, v7}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_21

    goto :goto_1d

    :cond_21
    :goto_1a
    new-instance v1, Ln03/h;

    invoke-direct {v1}, Ln03/h;-><init>()V

    iget-object v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0x10

    iput v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v1, v5, v7}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_22

    goto :goto_1d

    :cond_22
    :goto_1b
    new-instance v1, Ln03/g;

    invoke-direct {v1}, Ln03/g;-><init>()V

    iget-object v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v6, 0x11

    iput v6, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v1, v5, v7}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_23

    goto :goto_1d

    :cond_23
    :goto_1c
    new-instance v1, Lk03/c;

    invoke-direct {v1}, Lk03/c;-><init>()V

    iget-object v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->w:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->x:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->y:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->z:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->E:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->F:Ljava/lang/Object;

    iput-object v12, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->G:Ljava/lang/Object;

    iput v4, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->L:F

    iput v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->M:I

    const/16 v3, 0x12

    iput v3, v7, Lcom/whoop/widget/network/WidgetRefreshWorker$c;->R:I

    invoke-static {v1, v5, v7}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_24

    :goto_1d
    return-object v2

    :cond_24
    :goto_1e
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final D(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/widget/network/WidgetRefreshWorker$o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;

    iget v1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;

    invoke-direct {v0, p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker$o;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->F:I

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->E:Ljava/lang/Object;

    check-cast v6, Ln6/l;

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->y:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lp6/n0;

    iget-object v2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {p1, v2}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    const-class v2, Ln03/j;

    invoke-virtual {p1, v2, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    new-instance p1, Lp6/n0;

    iget-object v7, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {p1, v7}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->w:Ljava/lang/Object;

    iput v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    const-class v6, Lk03/c;

    invoke-virtual {p1, v6, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v6, p1

    move v2, v3

    :cond_8
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v7, 0x0

    if-eqz p1, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln6/l;

    iget-object v8, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    new-instance v9, Lcom/whoop/widget/network/WidgetRefreshWorker$p;

    invoke-direct {v9, p0, v7}, Lcom/whoop/widget/network/WidgetRefreshWorker$p;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->w:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->x:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->y:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->z:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->E:Ljava/lang/Object;

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->F:I

    iput v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->G:I

    iput v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    invoke-static {v8, p1, v9, v0}, Ls6/a;->k(Landroid/content/Context;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_9
    new-instance p1, Ln03/j;

    invoke-direct {p1}, Ln03/j;-><init>()V

    iget-object v2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->w:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->x:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->y:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->z:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->E:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$o;->J:I

    invoke-static {p1, v2, v0}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final E(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/widget/network/WidgetRefreshWorker$q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;

    iget v1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/widget/network/WidgetRefreshWorker$q;

    invoke-direct {v0, p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker$q;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/widget/model/HealthspanWidgetModel;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :pswitch_1
    iget-object v1, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/widget/ui/healthspan/a;

    iget-object v2, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/widget/model/HealthspanWidgetModel;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->x()Lcom/whoop/widget/ui/healthspan/a;

    move-result-object p1

    const/4 v1, 0x1

    iput v1, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    invoke-virtual {p1, v6}, Lcom/whoop/widget/ui/healthspan/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->w()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v1, "healthspan-widget"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Ll03/h;

    invoke-direct {p1}, Ll03/h;-><init>()V

    iget-object v1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    const/4 v2, 0x2

    iput v2, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    invoke-static {p1, v1, v6}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_3
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v2

    new-instance v5, Lcom/whoop/widget/network/WidgetRefreshWorker$r;

    invoke-direct {v5, p0, v10}, Lcom/whoop/widget/network/WidgetRefreshWorker$r;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    const/4 p1, 0x3

    iput p1, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch healthspan widget info"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_5

    :cond_4
    :goto_3
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/widget/model/HealthspanWidgetModel;

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->x()Lcom/whoop/widget/ui/healthspan/a;

    move-result-object v1

    iput-object v10, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->w:Ljava/lang/Object;

    iput-object v1, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->x:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    invoke-direct {p0, p1, v6}, Lcom/whoop/widget/network/WidgetRefreshWorker;->B(Lcom/whoop/widget/model/HealthspanWidgetModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    check-cast p1, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    iput-object v10, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->w:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->x:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    invoke-virtual {v1, p1, v6}, Lcom/whoop/widget/ui/healthspan/a;->f(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_6
    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->x()Lcom/whoop/widget/ui/healthspan/a;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->u()Ljava/lang/Integer;

    move-result-object v1

    iput-object v10, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v6, Lcom/whoop/widget/network/WidgetRefreshWorker$q;->E:I

    invoke-virtual {p1, v1, v6}, Lcom/whoop/widget/ui/healthspan/a;->e(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_5
    return-object v0

    :cond_7
    :goto_6
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final F()V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->w()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v1, "healthspan-widget"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    iget-object v1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    const-class v5, Lcom/whoop/widget/network/AmoebaWidgetProvider;

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v3, v0, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    return-void
.end method

.method private final G(Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/widget/network/WidgetRefreshWorker$s;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/widget/network/WidgetRefreshWorker$s;

    iget v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/whoop/widget/network/WidgetRefreshWorker$s;

    invoke-direct {v2, v0, v1}, Lcom/whoop/widget/network/WidgetRefreshWorker$s;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->I:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    const/4 v11, 0x0

    const/4 v12, 0x5

    const/4 v13, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    const/4 v15, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_6

    if-eq v3, v15, :cond_5

    if-eq v3, v5, :cond_1

    if-eq v3, v4, :cond_4

    if-eq v3, v13, :cond_3

    if-ne v3, v12, :cond_2

    iget-object v2, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/widget/model/WidgetStressResponse;

    :cond_1
    iget-object v2, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v14

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->G:I

    iget-object v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->F:Ljava/lang/Object;

    check-cast v4, Ln6/l;

    iget-object v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->y:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/widget/model/WidgetStressResponse;

    iget-object v7, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v6

    goto/16 :goto_4

    :cond_4
    iget-object v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v6

    goto/16 :goto_3

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lp6/n0;

    iget-object v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v1, v3}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput v15, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    const-class v3, Ln03/k;

    invoke-virtual {v1, v3, v8}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v2, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_2
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_6

    :cond_8
    invoke-direct {v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->w()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v3

    const-string v7, "stress-monitor-widget"

    invoke-interface {v3, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    new-instance v1, Ln03/k;

    invoke-direct {v1, v6, v15, v6}, Ln03/k;-><init>(Ly6/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v6, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    iput v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    invoke-static {v1, v3, v8}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_d

    goto/16 :goto_5

    :cond_9
    sget-object v3, Lu02/a;->a:Lu02/a$a;

    invoke-virtual {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v5

    new-instance v7, Lcom/whoop/widget/network/WidgetRefreshWorker$u;

    invoke-direct {v7, v0, v6}, Lcom/whoop/widget/network/WidgetRefreshWorker$u;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    iput-object v1, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    move-object v4, v5

    const/4 v5, 0x0

    move-object v9, v6

    const-string v6, "Failed to fetch stress for widget"

    move-object v10, v9

    const/4 v9, 0x2

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v12, v16

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    goto :goto_5

    :cond_a
    move-object/from16 v17, v3

    move-object v3, v1

    move-object/from16 v1, v17

    :goto_3
    check-cast v1, Lu02/a;

    invoke-static {v1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/widget/model/WidgetStressResponse;

    if-eqz v1, :cond_c

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v5, v1

    move-object v4, v3

    move v3, v11

    :cond_b
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln6/l;

    iget-object v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->z()Ly6/g;

    move-result-object v7

    new-instance v9, Lcom/whoop/widget/network/WidgetRefreshWorker$t;

    invoke-direct {v9, v5, v12}, Lcom/whoop/widget/network/WidgetRefreshWorker$t;-><init>(Lcom/whoop/widget/model/WidgetStressResponse;Lq83/d;)V

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    iput-object v5, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->y:Ljava/lang/Object;

    iput-object v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->z:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->E:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->F:Ljava/lang/Object;

    iput v3, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->G:I

    iput v11, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->H:I

    iput v13, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    invoke-static {v6, v7, v1, v9, v8}, Ls6/a;->l(Landroid/content/Context;Ly6/g;Ln6/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_b

    goto :goto_5

    :cond_c
    new-instance v1, Ln03/k;

    invoke-direct {v1, v12, v15, v12}, Ln03/k;-><init>(Ly6/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->w:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->x:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->y:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->z:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->E:Ljava/lang/Object;

    iput-object v12, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->F:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v8, Lcom/whoop/widget/network/WidgetRefreshWorker$s;->K:I

    invoke-static {v1, v3, v8}, Lpf/c;->a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_d

    :goto_5
    return-object v2

    :cond_d
    :goto_6
    return-object v14
.end method

.method private final H()V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->w()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v1, "stress-monitor-widget"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    iget-object v1, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    const-class v5, Lcom/whoop/widget/network/SmallWidgetStressProvider;

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v3, v0, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/widget/network/WidgetRefreshWorker;Lf6/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker;->s(Lf6/a;)V

    return-void
.end method

.method public static final synthetic l(Lcom/whoop/widget/network/WidgetRefreshWorker;)Lcom/whoop/widget/api/WidgetApi;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->v()Lcom/whoop/widget/api/WidgetApi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/widget/network/WidgetRefreshWorker;)Lcom/whoop/widget/api/StressWidgetApi;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->y()Lcom/whoop/widget/api/StressWidgetApi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/whoop/widget/network/WidgetRefreshWorker;Lcom/whoop/widget/model/HealthspanWidgetModel;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/widget/network/WidgetRefreshWorker;->B(Lcom/whoop/widget/model/HealthspanWidgetModel;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker;->C(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker;->D(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker;->E(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker;->G(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final s(Lf6/a;)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->u()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "WIDGET_KEY_STRAP_BATTERY_PERCENT"

    if-eqz v0, :cond_0

    invoke-static {v1}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v1, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {v1}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/a;->f(Lf6/d;)V

    return-void
.end method

.method private final t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lbc3/i0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/widget/network/WidgetRefreshWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/whoop/widget/network/WidgetRefreshWorker$a;-><init>(Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final u()Ljava/lang/Integer;
    .locals 2

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->A()Ltd1/b;

    move-result-object v0

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    sget-object v1, Ltd1/e;->READY:Ltd1/e;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->A()Ltd1/b;

    move-result-object v0

    invoke-interface {v0}, Ltd1/b;->b()Lkk0/a;

    move-result-object v0

    invoke-virtual {v0}, Lkk0/a;->d()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final v()Lcom/whoop/widget/api/WidgetApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/widget/api/WidgetApi;

    return-object v0
.end method

.method private final w()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final x()Lcom/whoop/widget/ui/healthspan/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/widget/ui/healthspan/a;

    return-object v0
.end method

.method private final y()Lcom/whoop/widget/api/StressWidgetApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/widget/api/StressWidgetApi;

    return-object v0
.end method

.method private final z()Ly6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly6/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/g;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->z:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/widget/network/WidgetRefreshWorker$v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;

    iget v1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;

    invoke-direct {v0, p0, p1}, Lcom/whoop/widget/network/WidgetRefreshWorker$v;-><init>(Lcom/whoop/widget/network/WidgetRefreshWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_a

    :catch_0
    move-exception p1

    goto/16 :goto_b

    :pswitch_1
    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->E:I

    iget v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->z:I

    iget v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    iget v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iget v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_8

    :pswitch_2
    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->z:I

    iget v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    iget v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iget v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move v6, v5

    move v5, v4

    move v4, v3

    move v3, v2

    goto/16 :goto_7

    :pswitch_3
    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    iget v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iget v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_6

    :pswitch_4
    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iget v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    :try_start_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move v4, v3

    move v3, v2

    goto/16 :goto_5

    :pswitch_5
    iget v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    :try_start_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_1

    :pswitch_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_6
    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->H()V

    invoke-direct {p0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->F()V

    const/4 p1, 0x1

    iput p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->D(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_9

    :cond_1
    :goto_1
    const/4 p1, 0x2

    iput p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->G(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_9

    :cond_2
    :goto_2
    new-instance p1, Lp6/n0;

    iget-object v2, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {p1, v2}, Lp6/n0;-><init>(Landroid/content/Context;)V

    const-class v2, Ln03/f;

    const/4 v3, 0x3

    iput v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-virtual {p1, v2, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_9

    :cond_3
    :goto_3
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    new-instance p1, Lp6/n0;

    iget-object v3, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {p1, v3}, Lp6/n0;-><init>(Landroid/content/Context;)V

    const-class v3, Ln03/g;

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    const/4 v4, 0x4

    iput v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-virtual {p1, v3, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_9

    :cond_4
    :goto_4
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-instance v3, Lp6/n0;

    iget-object v4, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v3, v4}, Lp6/n0;-><init>(Landroid/content/Context;)V

    const-class v4, Ln03/i;

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    iput p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    const/4 v5, 0x5

    iput v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-virtual {v3, v4, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v3

    if-ne v3, v1, :cond_5

    goto/16 :goto_9

    :cond_5
    move-object v4, v3

    move v3, p1

    move-object p1, v4

    move v4, v2

    :goto_5
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    new-instance p1, Lp6/n0;

    iget-object v5, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {p1, v5}, Lp6/n0;-><init>(Landroid/content/Context;)V

    const-class v5, Ln03/h;

    iput v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    iput v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    const/4 v6, 0x6

    iput v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-virtual {p1, v5, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_9

    :cond_6
    :goto_6
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-instance v5, Lp6/n0;

    iget-object v6, p0, Lcom/whoop/widget/network/WidgetRefreshWorker;->y:Landroid/content/Context;

    invoke-direct {v5, v6}, Lp6/n0;-><init>(Landroid/content/Context;)V

    const-class v6, Lk03/c;

    iput v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    iput v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    iput p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->z:I

    const/4 v7, 0x7

    iput v7, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-virtual {v5, v6, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object v5

    if-ne v5, v1, :cond_7

    goto :goto_9

    :cond_7
    move v6, v3

    move v3, p1

    move-object p1, v5

    move v5, v6

    move v6, v4

    move v4, v2

    :goto_7
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int p1, v6, v5

    add-int/2addr p1, v4

    add-int/2addr p1, v3

    add-int/2addr p1, v2

    if-lez p1, :cond_8

    iput v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    iput v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iput v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    iput v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->z:I

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->E:I

    const/16 p1, 0x8

    iput p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->C(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_9

    :cond_8
    :goto_8
    iput v6, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->w:I

    iput v5, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->x:I

    iput v4, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->y:I

    iput v3, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->z:I

    iput v2, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->E:I

    const/16 p1, 0x9

    iput p1, v0, Lcom/whoop/widget/network/WidgetRefreshWorker$v;->H:I

    invoke-direct {p0, v0}, Lcom/whoop/widget/network/WidgetRefreshWorker;->E(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_9
    return-object v1

    :cond_9
    :goto_a
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-object p1

    :goto_b
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Caught an exception when updating widgets: "

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
