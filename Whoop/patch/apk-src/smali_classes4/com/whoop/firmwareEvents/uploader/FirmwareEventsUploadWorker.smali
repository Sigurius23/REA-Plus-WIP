.class public final Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "success",
        "Landroid/content/SharedPreferences;",
        "sharedPrefs",
        "",
        "noOfEvents",
        "Ll83/a0;",
        "l",
        "(ZLandroid/content/SharedPreferences;I)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "z",
        "a",
        "firmware-events_release"
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
.field public static final z:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$a;


# instance fields
.field private final y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;->z:Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PERIODIC_STRAP_FW_EVENTS_UPLOADER"

    iput-object p1, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;->y:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;ZLandroid/content/SharedPreferences;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;->l(ZLandroid/content/SharedPreferences;I)V

    return-void
.end method

.method private final l(ZLandroid/content/SharedPreferences;I)V
    .locals 7

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v0

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Lfi0/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lfi0/a;

    const-string v0, "fw-events-last-attempt-upload-millis"

    const-wide/16 v2, 0x0

    invoke-interface {p2, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long p2, v4, v2

    if-eqz p2, :cond_0

    sget-object p2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-static {p2}, Lorg/joda/time/DateTime;->now(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-virtual {p2}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    const p2, 0xea60

    int-to-long v4, p2

    div-long/2addr v2, v4

    :cond_0
    if-eqz p1, :cond_1

    const-string p1, "Success"

    goto :goto_0

    :cond_1
    const-string p1, "Fail"

    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    new-instance v0, Ll83/k;

    const-string v2, "Frequency"

    invoke-direct {v0, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance p3, Ll83/k;

    const-string v2, "Events Count"

    invoke-direct {p3, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p3}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/4 v4, 0x0

    const-string v5, "Upload FW Events to API"

    const-string v2, "Connectivity"

    move-object v3, p1

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p1, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;

    iget v1, v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;-><init>(Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;->y:I

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

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class v2, Lin2/d;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lin2/d;

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v2, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;

    invoke-direct {v2, p0, v4}, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$c;-><init>(Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker;Lq83/d;)V

    iput v3, v0, Lcom/whoop/firmwareEvents/uploader/FirmwareEventsUploadWorker$b;->y:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string v0, "withContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
