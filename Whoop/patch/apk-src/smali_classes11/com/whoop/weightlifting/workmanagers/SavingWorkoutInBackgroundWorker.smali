.class public final Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 E2\u00020\u0001:\u0001FB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001c\u0010\u0017\u001a\u0006\u0012\u0002\u0008\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J9\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00082\u0016\u0008\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0096@\u00a2\u0006\u0004\u0008 \u0010!R\u001a\u0010%\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\"\u001a\u0004\u0008#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010(\u001a\u0004\u0008.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u0010(\u001a\u0004\u00083\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u0010(\u001a\u0004\u00088\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010(\u001a\u0004\u0008=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u0010(\u001a\u0004\u0008B\u0010C\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "serializedWorkoutKey",
        "",
        "o",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "failureReason",
        "",
        "workoutId",
        "isLocalSaveDiscarded",
        "Ll83/a0;",
        "y",
        "(Ljava/lang/String;Ljava/lang/Long;Z)V",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "workoutDto",
        "Lu02/a;",
        "v",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;",
        "action",
        "",
        "",
        "otherProperties",
        "w",
        "(Ljava/lang/String;Ljava/util/Map;Z)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lwm0/a;",
        "z",
        "Ll83/h;",
        "s",
        "()Lwm0/a;",
        "scopeCoordinator",
        "Llu2/e;",
        "E",
        "u",
        "()Llu2/e;",
        "weightliftingSerializer",
        "Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "F",
        "t",
        "()Lcom/whoop/weightlifting/data/WeightliftingApi;",
        "weightliftingApi",
        "Lfi0/a;",
        "G",
        "p",
        "()Lfi0/a;",
        "baseAnalytics",
        "Lu92/d;",
        "H",
        "r",
        "()Lu92/d;",
        "mainPrefs",
        "Lin2/d;",
        "I",
        "q",
        "()Lin2/d;",
        "dispatcherFactory",
        "J",
        "a",
        "weightlifting_release"
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
.field public static final J:Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;

.field public static final K:I


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->J:Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->K:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "SavingWorkoutInBackgroundWorker"

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$d;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$f;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$f;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->F:Ll83/h;

    new-instance p2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$g;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$g;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->G:Ll83/h;

    new-instance p2, Lvf3/c;

    const-string v1, "mainPrefs"

    invoke-direct {p2, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$h;

    invoke-direct {v1, p0, p2, v0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$h;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->H:Ll83/h;

    new-instance p2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$i;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$i;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->I:Ll83/h;

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->o(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;)Lu92/d;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->r()Lu92/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;)Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->t()Lcom/whoop/weightlifting/data/WeightliftingApi;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Ljava/lang/Long;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->y(Ljava/lang/String;Ljava/lang/Long;Z)V

    return-void
.end method

.method private final o(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->q()Lin2/d;

    move-result-object v0

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$b;-><init>(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final p()Lfi0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi0/a;

    return-object v0
.end method

.method private final q()Lin2/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lin2/d;

    return-object v0
.end method

.method private final r()Lu92/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu92/d;

    return-object v0
.end method

.method private final s()Lwm0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwm0/a;

    return-object v0
.end method

.method private final t()Lcom/whoop/weightlifting/data/WeightliftingApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/WeightliftingApi;

    return-object v0
.end method

.method private final u()Llu2/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llu2/e;

    return-object v0
.end method

.method private final v(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "*>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    new-instance v4, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$c;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, v2}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$c;-><init>(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "failed to upload weightlifting workout in background"

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final w(Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->p()Lfi0/a;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getRunAttemptCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "value"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v3, Ll83/k;

    const-string v4, "background"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    new-instance v1, Ll83/k;

    const-string v4, "localSaveDiscarded"

    invoke-direct {v1, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v1}, [Ll83/k;

    move-result-object p3

    invoke-static {p3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p3

    invoke-static {p3, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "Save Workout"

    const/4 v3, 0x0

    const-string v4, "Workout Builder"

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Ljava/util/Map;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x1

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->w(Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method private final y(Ljava/lang/String;Ljava/lang/Long;Z)V
    .locals 6

    new-instance v0, Ll83/k;

    const-string v1, "failureReason"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v1, "workoutId"

    invoke-direct {p1, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance p3, Ll83/k;

    const-string v1, "localSaveDiscarded"

    invoke-direct {p3, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p1, p3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "Async Save Failure"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->x(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Ljava/util/Map;ZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic z(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Ljava/lang/Long;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x1

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->y(Ljava/lang/String;Ljava/lang/Long;Z)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 15
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

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;

    iget v3, v2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;

    invoke-direct {v2, p0, v1}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;-><init>(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->E:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    const/4 v8, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v9, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v8, :cond_1

    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v4, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_4
    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v5, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    iget-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;

    iget-object v4, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v4, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v3

    :goto_2
    move-object v9, v2

    goto :goto_4

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v1

    const-string v2, "serializedWorkout"

    invoke-virtual {v1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-string v1, "noInputData"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->z(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Ljava/lang/Long;ZILjava/lang/Object;)V

    new-instance v1, Lic/r;

    invoke-direct {v1}, Lic/r;-><init>()V

    return-object v1

    :cond_7
    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->r()Lu92/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->u()Llu2/e;

    move-result-object v11

    invoke-virtual {v11, v2}, Llu2/e;->a(Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object v2

    goto :goto_3

    :cond_8
    move-object v2, v10

    :goto_3
    if-nez v2, :cond_a

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    iput-object p0, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    const-string v2, "deserializationError"

    iput-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->z:Ljava/lang/Object;

    iput v9, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    invoke-direct {p0, v1, v6}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->o(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_9

    goto/16 :goto_8

    :cond_9
    move-object v8, p0

    goto :goto_2

    :goto_4
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->z(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Ljava/lang/String;Ljava/lang/Long;ZILjava/lang/Object;)V

    new-instance v1, Lic/r;

    invoke-direct {v1}, Lic/r;-><init>()V

    return-object v1

    :cond_a
    iput-object v1, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    iput-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    iput v5, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    invoke-direct {p0, v2, v6}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->v(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_b

    goto/16 :goto_8

    :cond_b
    move-object v14, v5

    move-object v5, v1

    move-object v1, v14

    :goto_5
    check-cast v1, Lu02/a;

    instance-of v11, v1, Lu02/a$c;

    if-eqz v11, :cond_e

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    iput-object v2, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    iput v4, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    invoke-direct {p0, v5, v6}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->o(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_c

    goto :goto_8

    :cond_c
    :goto_6
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->getWorkout_template_id()Ljava/lang/Long;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "workoutId"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "Async Save Success"

    invoke-direct {p0, v4, v2, v1}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->w(Ljava/lang/String;Ljava/util/Map;Z)V

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->r()Lu92/d;

    move-result-object v1

    const-string v2, "START_ACTIVITY_COMPLETED"

    invoke-virtual {v1, v2, v9}, Lu92/d;->q(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->s()Lwm0/a;

    move-result-object v1

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    iput v3, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    invoke-static {v1, v10, v6, v9, v10}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v1

    return-object v1

    :cond_e
    instance-of v3, v1, Lu02/a$b;

    if-eqz v3, :cond_10

    invoke-static {p0}, Lew2/a;->c(Landroidx/work/CoroutineWorker;)Lic/u;

    move-result-object v9

    new-instance v0, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$k;

    move-object v4, v5

    const/4 v5, 0x0

    move-object v3, v2

    move-object v2, v1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$k;-><init>(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;Lu02/a;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Ljava/lang/String;Lq83/d;)V

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->w:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->x:Ljava/lang/Object;

    iput-object v10, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->y:Ljava/lang/Object;

    iput v8, v6, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$j;->G:I

    invoke-static {v9, v0, v6}, Lew2/a;->b(Lic/u;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_f

    :goto_8
    return-object v7

    :cond_f
    return-object v0

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
