.class public final Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;",
        "requestBody",
        "Lu02/a;",
        "n",
        "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lcom/whoop/labrador/domain/LabradorApi;",
        "z",
        "Ll83/h;",
        "l",
        "()Lcom/whoop/labrador/domain/LabradorApi;",
        "labradorApi",
        "Lus1/a;",
        "E",
        "m",
        "()Lus1/a;",
        "labradorDao",
        "F",
        "a",
        "labrador_release"
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
.field public static final F:Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;

.field public static final G:I


# instance fields
.field private final E:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->F:Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->G:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "UploadLabradorReadingInBackgroundWorker"

    iput-object p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->E:Ll83/h;

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;)Lcom/whoop/labrador/domain/LabradorApi;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->l()Lcom/whoop/labrador/domain/LabradorApi;

    move-result-object p0

    return-object p0
.end method

.method private final l()Lcom/whoop/labrador/domain/LabradorApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/labrador/domain/LabradorApi;

    return-object v0
.end method

.method private final m()Lus1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lus1/a;

    return-object v0
.end method

.method private final n(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;",
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

    new-instance v4, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$d;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, v2}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$d;-><init>(Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Failed to post new offline Labrador reading in background"

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 12
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

    instance-of v0, p1, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;

    iget v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;

    invoke-direct {v0, p0, p1}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;-><init>(Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->G:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->E:Ljava/lang/Object;

    check-cast v1, Ljava/time/format/DateTimeFormatter;

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    check-cast v1, Ljava/time/Instant;

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    check-cast v1, Lvs1/a;

    iget-object v0, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide v7, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->w:J

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->G:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->E:Ljava/lang/Object;

    check-cast v2, Ljava/time/format/DateTimeFormatter;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    check-cast v2, Ljava/time/Instant;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    check-cast v2, Lvs1/a;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-wide v7, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->w:J

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "trailingTimestamp"

    const-wide/16 v7, 0x0

    invoke-virtual {p1, v2, v7, v8}, Lic/g;->b(Ljava/lang/String;J)J

    move-result-wide v7

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "strapSerial"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, "0"

    :cond_5
    move-object v2, p1

    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->m()Lus1/a;

    move-result-object p1

    iput-object v2, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    iput-wide v7, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->w:J

    iput v5, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    invoke-interface {p1, v7, v8, v0}, Lus1/a;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_1
    check-cast p1, Lvs1/a;

    if-nez p1, :cond_7

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_7
    invoke-virtual {p1}, Lvs1/a;->c()Z

    move-result v9

    if-nez v9, :cond_e

    invoke-virtual {p1}, Lvs1/a;->h()Z

    move-result v9

    if-eqz v9, :cond_8

    goto/16 :goto_5

    :cond_8
    invoke-static {v7, v8}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v9

    const-string v10, "yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX"

    invoke-static {v10}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v10

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v11

    invoke-static {v9, v11}, Ljava/time/OffsetDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/OffsetDateTime;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lvs1/a;->f()Ljava/util/List;

    move-result-object v10

    invoke-virtual {p1}, Lvs1/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_9

    move-object p1, v6

    :cond_9
    new-instance v11, Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;

    invoke-direct {v11, v9, v2, v10, p1}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->E:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->F:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->G:Ljava/lang/Object;

    iput-wide v7, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->w:J

    iput v4, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    invoke-direct {p0, v11, v0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->n(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_c

    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->m()Lus1/a;

    move-result-object p1

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->E:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->F:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->G:Ljava/lang/Object;

    iput-wide v7, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->w:J

    iput v3, v0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    invoke-interface {p1, v7, v8, v5, v0}, Lus1/a;->f(JZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_3
    return-object v1

    :cond_b
    :goto_4
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_c
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_d

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    :goto_5
    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
