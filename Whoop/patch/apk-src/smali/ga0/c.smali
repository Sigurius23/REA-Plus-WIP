.class public final Lga0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ3\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ9\u0010 \u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\n0\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lga0/c;",
        "",
        "Lcom/whoop/service/network/ActivitiesApi;",
        "activitiesApi",
        "Lbc3/c0;",
        "scope",
        "Lin2/d;",
        "dispatcherFactory",
        "<init>",
        "(Lcom/whoop/service/network/ActivitiesApi;Lbc3/c0;Lin2/d;)V",
        "Lpg3/v0;",
        "Lcom/whoop/addactivity/network/CreateActivityResponse;",
        "response",
        "",
        "sportId",
        "",
        "isGpsEnabled",
        "Lcom/whoop/service/network/model/cycles/Workout;",
        "e",
        "(Lpg3/v0;IZ)Lpg3/v0;",
        "activityCreated",
        "g",
        "(Lcom/whoop/addactivity/network/CreateActivityResponse;IZ)Lcom/whoop/service/network/model/cycles/Workout;",
        "",
        "during",
        "",
        "f",
        "(Ljava/lang/String;)Ljava/util/List;",
        "Lorg/joda/time/DateTime;",
        "startTime",
        "endTime",
        "Lxg3/g;",
        "h",
        "(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;",
        "a",
        "Lcom/whoop/service/network/ActivitiesApi;",
        "b",
        "Lbc3/c0;",
        "c",
        "Lin2/d;",
        "core_release"
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
.field private final a:Lcom/whoop/service/network/ActivitiesApi;

.field private final b:Lbc3/c0;

.field private final c:Lin2/d;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/ActivitiesApi;Lbc3/c0;Lin2/d;)V
    .locals 1

    const-string v0, "activitiesApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lga0/c;->a:Lcom/whoop/service/network/ActivitiesApi;

    iput-object p2, p0, Lga0/c;->b:Lbc3/c0;

    iput-object p3, p0, Lga0/c;->c:Lin2/d;

    return-void
.end method

.method public static synthetic a(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;IZLxg3/q;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lga0/c;->i(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;IZLxg3/q;)V

    return-void
.end method

.method public static synthetic b(Lbc3/c2;)V
    .locals 0

    invoke-static {p0}, Lga0/c;->j(Lbc3/k1;)V

    return-void
.end method

.method public static final synthetic c(Lga0/c;)Lcom/whoop/service/network/ActivitiesApi;
    .locals 0

    iget-object p0, p0, Lga0/c;->a:Lcom/whoop/service/network/ActivitiesApi;

    return-object p0
.end method

.method public static final synthetic d(Lga0/c;Lpg3/v0;IZ)Lpg3/v0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lga0/c;->e(Lpg3/v0;IZ)Lpg3/v0;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lpg3/v0;IZ)Lpg3/v0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "Lcom/whoop/addactivity/network/CreateActivityResponse;",
            ">;IZ)",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/cycles/Workout;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v1, v0, Lud3/x0;->Q:Z

    if-eqz v1, :cond_1

    iget-object v0, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/addactivity/network/CreateActivityResponse;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0, p2, p3}, Lga0/c;->g(Lcom/whoop/addactivity/network/CreateActivityResponse;IZ)Lcom/whoop/service/network/model/cycles/Workout;

    move-result-object p2

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    invoke-static {p2, p1}, Lpg3/v0;->d(Ljava/lang/Object;Lud3/x0;)Lpg3/v0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity creation body shouldn\'t be null on successful creation "

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget p2, v0, Lud3/x0;->z:I

    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    invoke-static {p2, p1}, Lpg3/v0;->a(ILud3/a1;)Lpg3/v0;

    move-result-object p1

    return-object p1
.end method

.method private final f(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, ","

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p1, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final g(Lcom/whoop/addactivity/network/CreateActivityResponse;IZ)Lcom/whoop/service/network/model/cycles/Workout;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/addactivity/network/CreateActivityResponse;->getDuring()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lga0/c;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/whoop/service/network/model/cycles/Workout;

    invoke-virtual {p1}, Lcom/whoop/addactivity/network/CreateActivityResponse;->getState()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/whoop/service/network/model/cycles/Period;

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v3, v4, v0}, Lcom/whoop/service/network/model/cycles/Period;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/addactivity/network/CreateActivityResponse;->getTimeZoneOffset()Ljava/lang/String;

    move-result-object v4

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/whoop/service/network/model/cycles/Workout;-><init>(Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;IZ)V

    return-object v1
.end method

.method private static final i(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;IZLxg3/q;)V
    .locals 9

    iget-object v0, p0, Lga0/c;->b:Lbc3/c0;

    iget-object v1, p0, Lga0/c;->c:Lin2/d;

    invoke-interface {v1}, Lin2/d;->b()Lq83/j;

    move-result-object v1

    new-instance v2, Lga0/c$a;

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, p1

    move v6, p2

    move v7, p3

    move-object v5, p4

    invoke-direct/range {v2 .. v8}, Lga0/c$a;-><init>(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;Lxg3/q;IZLq83/d;)V

    const/4 p0, 0x2

    const/4 p1, 0x0

    invoke-static {v0, v1, p1, v2, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    new-instance p1, Lga0/b;

    invoke-direct {p1, p0}, Lga0/b;-><init>(Lbc3/c2;)V

    move-object p4, v5

    check-cast p4, Lch3/w0;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lfh3/a;

    invoke-direct {p0, p1}, Lfh3/a;-><init>(Ljava/lang/Object;)V

    iget-object p1, p4, Lch3/w0;->x:Lfh3/a;

    invoke-virtual {p1, p0}, Lfh3/a;->c(Lxg3/t;)V

    return-void
.end method

.method private static final j(Lbc3/k1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method


# virtual methods
.method public final h(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/cycles/Workout;",
            ">;>;"
        }
    .end annotation

    const-string v0, "startTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/addactivity/network/CreateActivityRequest;

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {p2, v2}, Lorg/joda/time/base/AbstractInstant;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v4

    const-string p2, "toString(...)"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p3, v0}, Lorg/joda/time/base/AbstractInstant;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    move v2, p1

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/whoop/addactivity/network/CreateActivityRequest;-><init>(IILjava/lang/String;Ljava/lang/String;Z)V

    new-instance p1, Lga0/a;

    invoke-direct {p1, p0, v1, v2, v6}, Lga0/a;-><init>(Lga0/c;Lcom/whoop/addactivity/network/CreateActivityRequest;IZ)V

    invoke-static {p1}, Lxg3/p;->b(Lbh3/b;)Lxg3/p;

    move-result-object p1

    invoke-static {p1}, Lxg3/p;->a(Lxg3/p;)Lxg3/g;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
