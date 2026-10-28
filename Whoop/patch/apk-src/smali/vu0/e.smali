.class public final Lvu0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0011R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvu0/e;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;",
        "lowBatteryStreakApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(La6/g;Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;Ltr2/n;)V",
        "Lvu0/d;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "b",
        "a",
        "La6/g;",
        "Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;",
        "Ltr2/n;",
        "connectivity-notifications_release"
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
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(La6/g;Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowBatteryStreakApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvu0/e;->a:La6/g;

    .line 3
    iput-object p2, p0, Lvu0/e;->b:Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;

    .line 4
    iput-object p3, p0, Lvu0/e;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "StreakInfoHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvu0/e;-><init>(La6/g;Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lvu0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lvu0/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvu0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "optString(...)"

    const-string v1, ""

    const-string v2, "Raw streak DataStore value: "

    instance-of v3, p1, Lvu0/e$b;

    if-eqz v3, :cond_0

    move-object v3, p1

    check-cast v3, Lvu0/e$b;

    iget v4, v3, Lvu0/e$b;->y:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lvu0/e$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v3, Lvu0/e$b;

    invoke-direct {v3, p0, p1}, Lvu0/e$b;-><init>(Lvu0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v3, Lvu0/e$b;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lvu0/e$b;->y:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v8, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lvu0/e;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v8, v3, Lvu0/e$b;->y:I

    invoke-static {p1, v3}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v4, :cond_3

    return-object v4

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    sget-object v4, Lts0/b;->a:Lts0/b;

    invoke-virtual {v4}, Lts0/b;->a()Lf6/d;

    move-result-object v4

    invoke-virtual {p1, v4}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v4, p0, Lvu0/e;->c:Ltr2/n;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v7, [Lqr2/a$a;

    invoke-interface {v4, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p1, Lvu0/d;

    const-string v4, "streak_value"

    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "streak_state"

    invoke-virtual {v2, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v4, v1}, Lvu0/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :cond_5
    :goto_2
    return-object v6

    :goto_3
    invoke-interface {v3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lvu0/e;->c:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to read streak from DataStore: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v6
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvu0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lvu0/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lvu0/e$a;

    iget v1, v0, Lvu0/e$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvu0/e$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvu0/e$a;

    invoke-direct {v0, p0, p1}, Lvu0/e$a;-><init>(Lvu0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lvu0/e$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvu0/e$a;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lvu0/e$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lvu0/e;->b:Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;

    iput v5, v0, Lvu0/e$a;->z:I

    invoke-interface {p1, v0}, Lcom/whoop/connectivityNotifications/lowbattery/LowBatteryStreakApi;->fetchStreak(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/connectivityNotifications/lowbattery/StreakApiResponse;

    iget-object v2, p0, Lvu0/e;->c:Ltr2/n;

    const-string v5, "Fetched fresh streak data from API"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {v2, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lvu0/d;

    invoke-virtual {p1}, Lcom/whoop/connectivityNotifications/lowbattery/StreakApiResponse;->getStreakValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/connectivityNotifications/lowbattery/StreakApiResponse;->getStreakState()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v5, p1}, Lvu0/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :goto_2
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v2, p0, Lvu0/e;->c:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v5, "API fetch failed, falling back to DataStore: "

    invoke-static {v5, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, p1, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lvu0/e$a;->w:Ljava/lang/Object;

    iput v4, v0, Lvu0/e$a;->z:I

    invoke-direct {p0, v0}, Lvu0/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    :goto_4
    check-cast p1, Lvu0/d;

    return-object p1
.end method
