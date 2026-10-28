.class public Lod1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field private final w:Li92/a;

.field private final x:Llm2/a;

.field private final y:Ltr2/n;


# direct methods
.method public constructor <init>(Li92/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "CycleMgr"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lod1/f;->y:Ltr2/n;

    iput-object p1, p0, Lod1/f;->w:Li92/a;

    new-instance p1, Llm2/a;

    invoke-direct {p1}, Llm2/a;-><init>()V

    iput-object p1, p0, Lod1/f;->x:Llm2/a;

    return-void
.end method

.method public static synthetic a(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lod1/f;->e(Lcom/whoop/service/network/model/cycles/Activity;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lod1/f;->f(Lcom/whoop/service/network/model/cycles/Activity;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lod1/f;Lcom/whoop/service/network/model/cycles/SleepActivity;ZLpg3/v0;)Lod1/k;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lod1/f;->d(Lcom/whoop/service/network/model/cycles/Activity;ZLpg3/v0;)Lod1/k;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(Lcom/whoop/service/network/model/cycles/Activity;ZLpg3/v0;)Lod1/k;
    .locals 1

    new-instance v0, Lod1/k;

    invoke-direct {v0, p1, p3}, Lod1/k;-><init>(Lcom/whoop/service/network/model/cycles/Activity;Lpg3/v0;)V

    invoke-virtual {v0}, Lod1/k;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lod1/f;->x:Llm2/a;

    new-instance p3, Llm2/c;

    invoke-direct {p3, p2}, Llm2/c;-><init>(Z)V

    invoke-virtual {p1, p3}, Llm2/a;->e(Llm2/b;)V

    :cond_0
    return-object v0
.end method

.method private synthetic e(Lcom/whoop/service/network/model/cycles/Activity;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;
    .locals 1

    new-instance v0, Lod1/k;

    invoke-direct {v0, p1, p3}, Lod1/k;-><init>(Lcom/whoop/service/network/model/cycles/Activity;Lpg3/v0;)V

    invoke-virtual {v0}, Lod1/k;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lod1/f;->x:Llm2/a;

    new-instance p3, Llm2/d;

    invoke-direct {p3, p2}, Llm2/d;-><init>(Lcom/whoop/service/network/model/Sport;)V

    invoke-virtual {p1, p3}, Llm2/a;->e(Llm2/b;)V

    :cond_0
    return-object v0
.end method

.method private synthetic f(Lcom/whoop/service/network/model/cycles/Activity;Lcom/whoop/service/network/model/Sport;Lpg3/v0;)Lod1/k;
    .locals 1

    new-instance v0, Lod1/k;

    invoke-direct {v0, p1, p3}, Lod1/k;-><init>(Lcom/whoop/service/network/model/cycles/Activity;Lpg3/v0;)V

    invoke-virtual {v0}, Lod1/k;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lod1/f;->x:Llm2/a;

    new-instance p3, Llm2/d;

    invoke-direct {p3, p2}, Llm2/d;-><init>(Lcom/whoop/service/network/model/Sport;)V

    invoke-virtual {p1, p3}, Llm2/a;->e(Llm2/b;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public g(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;)",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v0

    iget-object v1, p0, Lod1/f;->w:Li92/a;

    invoke-virtual {v1, p1, p2, p3}, Li92/a;->g(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lxg3/g;

    move-result-object p1

    new-instance p2, Llive/hms/video/factories/c;

    const/16 p3, 0x16

    invoke-direct {p2, p3}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {p1, p2}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    return-object v0
.end method

.method public j(ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lxg3/g<",
            "Lod1/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-direct {v0, p1}, Lcom/whoop/service/network/model/cycles/SleepActivity;-><init>(Z)V

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v1

    iget-object v2, p0, Lod1/f;->w:Li92/a;

    invoke-virtual {v2, p1, p2, p3}, Li92/a;->e(ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;

    move-result-object p2

    new-instance p3, Lod1/e;

    invoke-direct {p3, p0, v0, p1}, Lod1/e;-><init>(Lod1/f;Lcom/whoop/service/network/model/cycles/SleepActivity;Z)V

    invoke-virtual {p2, p3}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p1

    invoke-virtual {p1, v1}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    return-object v1
.end method

.method public l(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/Sport;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lxg3/g<",
            "Lod1/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lod1/f;->y:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "StrainCoach postingWorkout sport "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " start "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " end "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, v2, v3}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/service/network/model/cycles/Workout;

    invoke-direct {v0}, Lcom/whoop/service/network/model/cycles/Workout;-><init>()V

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v1

    iget-object v2, p0, Lod1/f;->w:Li92/a;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, p1, p2, p3, v3}, Li92/a;->f(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Lxg3/g;

    move-result-object p2

    new-instance p3, Lod1/d;

    const/4 v2, 0x1

    invoke-direct {p3, p0, v0, p1, v2}, Lod1/d;-><init>(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;I)V

    invoke-virtual {p2, p3}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p1

    invoke-virtual {p1, v1}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    return-object v1
.end method

.method public n(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/Sport;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z)",
            "Lxg3/g<",
            "Lod1/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/service/network/model/cycles/Workout;

    invoke-direct {v0}, Lcom/whoop/service/network/model/cycles/Workout;-><init>()V

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v1

    iget-object v2, p0, Lod1/f;->w:Li92/a;

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-virtual {v2, p1, p2, p3, p4}, Li92/a;->f(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Lxg3/g;

    move-result-object p2

    new-instance p3, Lod1/d;

    const/4 p4, 0x0

    invoke-direct {p3, p0, v0, p1, p4}, Lod1/d;-><init>(Lod1/f;Lcom/whoop/service/network/model/cycles/Workout;Lcom/whoop/service/network/model/Sport;I)V

    invoke-virtual {p2, p3}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p1

    invoke-virtual {p1, v1}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    return-object v1
.end method

.method public o(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/UserState;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/data/remote/domain/request/UserState;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserState;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lod1/f;->w:Li92/a;

    invoke-virtual {v0, p1, p2}, Li92/a;->h(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/UserState;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method
