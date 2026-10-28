.class public final Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;",
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
        "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;",
        "z",
        "Ll83/h;",
        "k",
        "()Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;",
        "api",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "E",
        "m",
        "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "onboardingStatusChecker",
        "Lrr2/c;",
        "F",
        "l",
        "()Lrr2/c;",
        "crashReporter",
        "G",
        "a",
        "onboarding-story-domain_release"
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
.field public static final G:Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->G:Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PostOnboardingCompleteFeatureEducationWorker"

    iput-object p1, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$d;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->F:Ll83/h;

    return-void
.end method

.method private final k()Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;

    return-object v0
.end method

.method private final l()Lrr2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    return-object v0
.end method

.method private final m()Lcom/whoop/data/onboarding/OnboardingStatusChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p1, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;

    iget v1, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;

    invoke-direct {v0, p0, p1}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;-><init>(Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget v1, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->w:I

    iget-object v0, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/educationModels/CompleteFeatureEducationBody;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object p1, p1, Lic/g;->a:Ljava/util/HashMap;

    const-string v5, "featureId"

    invoke-virtual {p1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v5, p1, Ljava/lang/Integer;

    if-eqz v5, :cond_3

    move-object v4, p1

    :cond_3
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-ne p1, v2, :cond_4

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_4
    new-instance v2, Lcom/whoop/educationModels/CompleteFeatureEducationBody;

    invoke-direct {v2, p1, v3}, Lcom/whoop/educationModels/CompleteFeatureEducationBody;-><init>(IZ)V

    invoke-direct {p0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->k()Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->x:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->w:I

    iput v3, v0, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$e;->E:I

    invoke-interface {v4, v2, v0}, Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;->completeFeatureEducation(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move v1, p1

    move-object p1, v0

    :goto_1
    check-cast p1, Lpg3/v0;

    :try_start_0
    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->m()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object p1

    invoke-interface {p1}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->retriggerOnboardingFetch()V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_6
    :goto_2
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_3
    const-string v0, "Failed to post feature education update for id "

    invoke-static {v1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;->l()Lrr2/c;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
