.class public Li92/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/whoop/service/network/ActivitiesApi;

.field private final b:Ltr2/n;

.field private final c:Lga0/c;

.field private final d:Lcom/whoop/service/network/GpsServiceApi;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/ActivitiesApi;Lcom/whoop/service/network/GpsServiceApi;Ltr2/n;Lga0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li92/a;->a:Lcom/whoop/service/network/ActivitiesApi;

    iput-object p2, p0, Li92/a;->d:Lcom/whoop/service/network/GpsServiceApi;

    iput-object p3, p0, Li92/a;->b:Ltr2/n;

    iput-object p4, p0, Li92/a;->c:Lga0/c;

    return-void
.end method

.method public static synthetic a(Lpg3/v0;)Lpg3/v0;
    .locals 0

    invoke-static {p0}, Li92/a;->d(Lpg3/v0;)Lpg3/v0;

    move-result-object p0

    return-object p0
.end method

.method private static b(ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;
    .locals 10

    sget-object v0, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p1, v0}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v1

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v1, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-virtual {p2, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, ", "

    const-string v2, ")"

    const-string v3, "["

    invoke-static {v3, v1, v0, p2, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->getZone()Lorg/joda/time/DateTimeZone;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Li92/a;->c(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v8

    new-instance v4, Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;

    const/4 v9, 0x0

    const-string v7, "USER"

    invoke-direct/range {v4 .. v9}, Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4
.end method

.method public static c(Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "nap"

    return-object p0

    :cond_0
    const-string p0, "sleep"

    return-object p0
.end method

.method private static d(Lpg3/v0;)Lpg3/v0;
    .locals 2

    iget-object v0, p0, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v1, v0, Lud3/x0;->Q:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lpg3/v0;->b:Ljava/lang/Object;

    if-eqz v1, :cond_0

    check-cast v1, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;->toSleepActivity()Lcom/whoop/service/network/model/cycles/SleepActivity;

    move-result-object p0

    invoke-static {p0}, Lpg3/v0;->c(Ljava/lang/Object;)Lpg3/v0;

    move-result-object p0

    return-object p0

    :cond_0
    iget v0, v0, Lud3/x0;->z:I

    iget-object p0, p0, Lpg3/v0;->c:Lud3/a1;

    invoke-static {v0, p0}, Lpg3/v0;->a(ILud3/a1;)Lpg3/v0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/cycles/SleepActivity;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Li92/a;->a:Lcom/whoop/service/network/ActivitiesApi;

    invoke-static {p1, p2, p3}, Li92/a;->b(ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/whoop/service/network/ActivitiesApi;->postSleepV2(Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;)Lxg3/g;

    move-result-object p1

    new-instance p2, Li7/g;

    const/4 p3, 0x5

    invoke-direct {p2, p3}, Li7/g;-><init>(I)V

    invoke-virtual {p1, p2}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p1

    const-string p2, "PostSleepV2"

    invoke-static {p1, p2}, Li92/s;->n(Lxg3/g;Ljava/lang/String;)Llh3/k;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/Sport;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/Boolean;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/cycles/Workout;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Li92/a;->c:Lga0/c;

    invoke-virtual {p1}, Lcom/whoop/service/network/model/Sport;->getId()I

    move-result p1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    invoke-virtual {v0, p1, p2, p3, p4}, Lga0/c;->h(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;

    move-result-object p1

    const-string p2, "new Post Workout"

    invoke-static {p1, p2}, Li92/s;->n(Lxg3/g;Ljava/lang/String;)Llh3/k;

    move-result-object p1

    return-object p1
.end method

.method public g(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/domain/model/RouteSummary;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/domain/model/RouteSummary;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V

    iget-object p1, p0, Li92/a;->b:Ltr2/n;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "CycleWs summary:"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Li92/a;->d:Lcom/whoop/service/network/GpsServiceApi;

    invoke-virtual {v0}, Lcom/whoop/domain/model/RouteSummary;->toRouteSummaryDto()Lcom/whoop/domain/model/RouteSummaryDto;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/whoop/service/network/GpsServiceApi;->postGpsData(Lcom/whoop/domain/model/RouteSummaryDto;)Lxg3/g;

    move-result-object p1

    const-string p2, "Post Workout"

    invoke-static {p1, p2}, Li92/s;->n(Lxg3/g;Ljava/lang/String;)Llh3/k;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/UserState;)Lxg3/g;
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

    iget-object p1, p0, Li92/a;->a:Lcom/whoop/service/network/ActivitiesApi;

    new-instance v0, Lcom/whoop/data/remote/domain/request/UserStateRequestBody;

    invoke-direct {v0, p2}, Lcom/whoop/data/remote/domain/request/UserStateRequestBody;-><init>(Lcom/whoop/data/remote/domain/request/UserState;)V

    invoke-interface {p1, v0}, Lcom/whoop/service/network/ActivitiesApi;->setUserStateWithRxJava(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;)Lxg3/g;

    move-result-object p1

    const-string p2, "Set User State"

    invoke-static {p1, p2}, Li92/s;->n(Lxg3/g;Ljava/lang/String;)Llh3/k;

    move-result-object p1

    return-object p1
.end method
