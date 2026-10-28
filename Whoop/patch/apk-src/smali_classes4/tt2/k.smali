.class public final Ltt2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ltt2/i;",
        "Ltt2/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ)\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00132\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00132\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Ltt2/k;",
        "Lod1/g;",
        "Ltt2/i;",
        "Ltt2/j;",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "api",
        "Lnm0/e;",
        "cachedApiSource",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lls2/b;",
        "analytics",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Lzr2/a;Lls2/b;Ltr2/n;)V",
        "",
        "date",
        "source",
        "Lec3/l;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;",
        "data",
        "Ll83/a0;",
        "g",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Ljava/lang/String;)V",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "b",
        "Lnm0/e;",
        "c",
        "Lzr2/a;",
        "getDateAndTimeProvider",
        "()Lzr2/a;",
        "d",
        "Lls2/b;",
        "getAnalytics",
        "()Lls2/b;",
        "e",
        "Ltr2/n;",
        "weekly-plan_release"
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
.field private final a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

.field private final b:Lnm0/e;

.field private final c:Lzr2/a;

.field private final d:Lls2/b;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Lzr2/a;Lls2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltt2/k;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    iput-object p2, p0, Ltt2/k;->b:Lnm0/e;

    iput-object p3, p0, Ltt2/k;->c:Lzr2/a;

    iput-object p4, p0, Ltt2/k;->d:Lls2/b;

    iput-object p5, p0, Ltt2/k;->e:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Ltt2/k;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltt2/k;->f(Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltt2/k;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ltt2/k;->e:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Ltt2/k;Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltt2/k;->g(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weeklyplan/api/WeeklyPlanGetRequest;

    invoke-direct {v0, p1}, Lcom/whoop/weeklyplan/api/WeeklyPlanGetRequest;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Ltt2/k;->b:Lnm0/e;

    new-instance v3, Ltt2/k$a;

    invoke-direct {v3, v2, v1}, Ltt2/k$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Ltt2/k$b;

    invoke-direct {v1, v0, p0, p1, p2}, Ltt2/k$b;-><init>(Lec3/l;Ltt2/k;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private final g(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;->getPlan()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->getGradientStyle()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    move-result-object v0

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;->JANUARY_JUMPSTART:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    if-ne v0, v1, :cond_0

    const-string v0, "jan_jump"

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ltt2/k;->d:Lls2/b;

    new-instance v2, Lls2/a$t;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;->getPlan()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->getGoalSection()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lxt2/c;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Ltt2/k;->c:Lzr2/a;

    invoke-interface {v3}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v3

    invoke-static {p2, v3}, Lxt2/c;->b(Ljava/lang/String;Lorg/joda/time/LocalDate;)I

    move-result p2

    invoke-direct {v2, p1, p2, p3, v0}, Lls2/a$t;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lls2/b;->q(Lls2/a;)V

    return-void
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltt2/k$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ltt2/k$c;-><init>(Lq83/d;Ltt2/k;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
