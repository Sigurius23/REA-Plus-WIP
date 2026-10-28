.class public final Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u0006\u0012\u0002\u0008\u00030\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;",
        "body",
        "Lu02/a;",
        "n",
        "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)Ljava/lang/Object;",
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
.field public static final F:Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;

.field public static final G:I


# instance fields
.field private final E:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->F:Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->G:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "UpdateLabradorReadingInBackgroundWorker"

    iput-object p1, p0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->E:Ll83/h;

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;)Lcom/whoop/labrador/domain/LabradorApi;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->l()Lcom/whoop/labrador/domain/LabradorApi;

    move-result-object p0

    return-object p0
.end method

.method private final l()Lcom/whoop/labrador/domain/LabradorApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/labrador/domain/LabradorApi;

    return-object v0
.end method

.method private final m()Lus1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lus1/a;

    return-object v0
.end method

.method private final n(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;",
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

    new-instance v4, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$d;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, v2}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$d;-><init>(Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v3, "Failed to update symptoms and notes in background"

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->y:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;

    iget v1, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;

    invoke-direct {v0, p0, p1}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;-><init>(Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/String;

    iget-object v0, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide v6, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->E:J

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "id"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v2

    const-string v6, "trailingTimestamp"

    const-wide/16 v7, 0x0

    invoke-virtual {v2, v6, v7, v8}, Lic/g;->b(Ljava/lang/String;J)J

    move-result-wide v6

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lic/g;->a:Ljava/util/HashMap;

    const-string v8, "symptoms"

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v8, v2, [Ljava/lang/Object;

    if-eqz v8, :cond_5

    check-cast v2, [Ljava/lang/Object;

    array-length v8, v2

    new-array v9, v8, [Ljava/lang/String;

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v8, :cond_6

    aget-object v11, v2, v10

    if-eqz v11, :cond_4

    check-cast v11, Ljava/lang/String;

    aput-object v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    move-object v9, v5

    :cond_6
    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v2

    const-string v8, "notes"

    invoke-virtual {v2, v8}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_c

    if-nez v9, :cond_7

    goto :goto_5

    :cond_7
    new-instance v8, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;

    invoke-static {v9}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-direct {v8, p1, v9, v2}, Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->w:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    iput-wide v6, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->E:J

    iput v4, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->H:I

    invoke-direct {p0, v8, v0}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->n(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_a

    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;->m()Lus1/a;

    move-result-object p1

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->w:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->x:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->y:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->z:Ljava/lang/Object;

    iput-wide v6, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->E:J

    iput v3, v0, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$e;->H:I

    invoke-interface {p1, v6, v7, v4, v0}, Lus1/a;->f(JZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_b

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_c
    :goto_5
    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
