.class public final Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;",
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
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "z",
        "Ll83/h;",
        "k",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "E",
        "a",
        "labrador-service_release"
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
.field public static final E:Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$a;


# instance fields
.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;->E:Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PERIODIC_ECG_PACKETS_UPLOADER"

    iput-object p1, p0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;->z:Ll83/h;

    return-void
.end method

.method private final k()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;->y:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;

    iget v1, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;-><init>(Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->x:Ljava/lang/Object;

    check-cast v1, Leu1/b;

    iget-object v0, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->w:Ljava/lang/Object;

    check-cast v0, Lku1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker;->k()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v2, "ecg-feature-android"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lku1/a;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v4, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lku1/a;

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v4

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    const-class v6, Leu1/b;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leu1/b;

    sget-object v4, Leu1/a;->ACTION_BACKGROUND_UPLOAD_TRIGGERED:Leu1/a;

    invoke-virtual {v2, v4}, Leu1/b;->a(Leu1/a;)V

    iput-object v5, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->w:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->x:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/labradorService/uploader/LabradorPacketsUploadWorker$c;->E:I

    invoke-virtual {p1, v0}, Lku1/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, v2

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Leu1/a;->ACTION_BACKGROUND_UPLOAD_COMPLETE:Leu1/a;

    invoke-virtual {v1, p1}, Leu1/b;->a(Leu1/a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Leu1/a;->ACTION_BACKGROUND_UPLOAD_FAILURE:Leu1/a;

    invoke-virtual {v1, p1}, Leu1/b;->a(Leu1/a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
