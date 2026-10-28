.class public final Le7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb7/b;
.implements Lb7/c;


# instance fields
.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Landroid/content/Context;

.field public final d:Landroid/health/connect/HealthConnectManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    if-eqz v0, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lbc3/c1;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    new-instance v1, Lbc3/p0;

    invoke-direct {v1, v0}, Lbc3/p0;-><init>(Lbc3/z;)V

    :cond_2
    iput-object v1, p0, Le7/r;->b:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Le7/r;->c:Landroid/content/Context;

    const-string v0, "healthconnect"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.health.connect.HealthConnectManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/health/connect/HealthConnectManager;

    iput-object p1, p0, Le7/r;->d:Landroid/health/connect/HealthConnectManager;

    return-void
.end method


# virtual methods
.method public final a(Lo7/b;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Le7/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/p;

    iget v1, v0, Le7/p;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/p;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/p;

    invoke-direct {v0, p0, p2}, Le7/p;-><init>(Le7/r;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/p;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/p;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Le7/m;

    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-direct {p2, p0, p1, v4, v2}, Le7/m;-><init>(Le7/r;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Le7/p;->y:I

    invoke-virtual {p0, p2, v0}, Le7/r;->h(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Landroid/health/connect/ReadRecordsResponse;

    invoke-virtual {p2}, Landroid/health/connect/ReadRecordsResponse;->getRecords()Ljava/util/List;

    move-result-object p1

    const-string v0, "response.records"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/health/connect/datatypes/Record;

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lb3/g1;->K(Landroid/health/connect/datatypes/Record;)Lm7/r0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Landroid/health/connect/ReadRecordsResponse;->getNextPageToken()J

    move-result-wide p1

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, p1, p2}, Ljava/lang/Long;-><init>(J)V

    new-instance p1, Lp7/c;

    invoke-direct {p1, v0}, Lp7/c;-><init>(Ljava/util/ArrayList;)V

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Le7/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/k;

    iget v1, v0, Le7/k;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/k;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/k;

    invoke-direct {v0, p0, p2}, Le7/k;-><init>(Le7/r;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/k;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/k;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/health/connect/HealthConnectException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v4, v0, Le7/k;->y:I

    new-instance p2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p2, v4, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p2}, Lbc3/m;->s()V

    iget-object v0, p0, Le7/r;->d:Landroid/health/connect/HealthConnectManager;

    invoke-static {}, Le7/h;->q()V

    invoke-static {p1}, Le7/h;->a(Ljava/lang/String;)Landroid/health/connect/changelog/ChangeLogsRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/health/connect/changelog/ChangeLogsRequest$Builder;->build()Landroid/health/connect/changelog/ChangeLogsRequest;

    move-result-object p1

    iget-object v2, p0, Le7/r;->b:Ljava/util/concurrent/Executor;

    invoke-static {p2}, Lvd/f;->j(Lbc3/m;)Lb5/e;

    move-result-object v5

    invoke-virtual {v0, p1, v2, v5}, Landroid/health/connect/HealthConnectManager;->getChangeLogs(Landroid/health/connect/changelog/ChangeLogsRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {p2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Landroid/health/connect/changelog/ChangeLogsResponse;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p1

    invoke-virtual {p2}, Landroid/health/connect/changelog/ChangeLogsResponse;->getUpsertedRecords()Ljava/util/List;

    move-result-object v0

    const-string v1, "response.upsertedRecords"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/health/connect/datatypes/Record;

    new-instance v2, Ld7/b;

    const-string v5, "it"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lb3/g1;->K(Landroid/health/connect/datatypes/Record;)Lm7/r0;

    move-result-object v1

    invoke-direct {v2, v1}, Ld7/b;-><init>(Lm7/r0;)V

    invoke-virtual {p1, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Landroid/health/connect/changelog/ChangeLogsResponse;->getDeletedLogs()Ljava/util/List;

    move-result-object v0

    const-string v1, "response.deletedLogs"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/health/connect/changelog/ChangeLogsResponse$DeletedLog;

    new-instance v2, Ld7/a;

    invoke-virtual {v1}, Landroid/health/connect/changelog/ChangeLogsResponse$DeletedLog;->getDeletedRecordId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "it.deletedRecordId"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1}, Ld7/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {p1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    invoke-virtual {p2}, Landroid/health/connect/changelog/ChangeLogsResponse;->getNextChangesToken()Ljava/lang/String;

    move-result-object v0

    const-string v1, "response.nextChangesToken"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/health/connect/changelog/ChangeLogsResponse;->hasMorePages()Z

    move-result p2

    new-instance v1, Lp7/a;

    invoke-direct {v1, p1, v0, p2, v3}, Lp7/a;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V
    :try_end_1
    .catch Landroid/health/connect/HealthConnectException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :goto_4
    invoke-virtual {p1}, Landroid/health/connect/HealthConnectException;->getErrorCode()I

    move-result p2

    const/4 v0, 0x3

    if-ne p2, v0, :cond_6

    new-instance p1, Lp7/a;

    sget-object p2, Lm83/y;->w:Lm83/y;

    const-string v0, ""

    invoke-direct {p1, p2, v0, v3, v4}, Lp7/a;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object p1

    :cond_6
    invoke-static {p1}, Lb3/g1;->w(Landroid/health/connect/HealthConnectException;)Ljava/lang/Exception;

    move-result-object p1

    throw p1
.end method

.method public final c(Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Le7/n;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/n;

    iget v1, v0, Le7/n;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/n;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/n;

    invoke-direct {v0, p0, p2}, Le7/n;-><init>(Le7/r;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/n;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/n;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Le7/o;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Le7/o;-><init>(Le7/r;Ljava/util/List;Lq83/d;)V

    iput v3, v0, Le7/n;->y:I

    invoke-virtual {p0, p2, v0}, Le7/r;->h(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Landroid/health/connect/InsertRecordsResponse;

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lb3/g1;->x(Landroid/health/connect/InsertRecordsResponse;)Lp7/b;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ls83/c;)Ljava/lang/Object;
    .locals 7

    iget-object p1, p0, Le7/r;->c:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v1, 0x1000

    invoke-static {v1, v2}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    new-instance v0, Ln83/i;

    invoke-direct {v0}, Ln83/i;-><init>()V

    iget-object v1, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v1, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    iget-object v4, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    aget-object v4, v4, v3

    const-string v5, "it.requestedPermissions[i]"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "android.permission.health."

    invoke-static {v4, v6, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p1, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    aget v4, v4, v3

    and-int/lit8 v4, v4, 0x2

    if-lez v4, :cond_0

    iget-object v4, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ln83/i;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object p1

    return-object p1
.end method

.method public final e()Lb7/c;
    .locals 0

    return-object p0
.end method

.method public final f(Lo7/a;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Le7/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/l;

    iget v1, v0, Le7/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/l;

    invoke-direct {v0, p0, p2}, Le7/l;-><init>(Le7/r;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/l;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Le7/m;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {p2, p0, p1, v2, v4}, Le7/m;-><init>(Le7/r;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Le7/l;->y:I

    invoke-virtual {p0, p2, v0}, Le7/r;->h(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Landroid/health/connect/changelog/ChangeLogTokenResponse;

    invoke-virtual {p2}, Landroid/health/connect/changelog/ChangeLogTokenResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    const-string p2, "override suspend fun get\u2026\n            .token\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g(Lj93/d;Lm83/y;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1

    new-instance p2, Le7/j;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p3, p1, v0}, Le7/j;-><init>(Le7/r;Ljava/util/List;Lj93/d;Lq83/d;)V

    check-cast p4, Ls83/c;

    invoke-virtual {p0, p2, p4}, Le7/r;->h(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final h(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Le7/q;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/q;

    iget v1, v0, Le7/q;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/q;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/q;

    invoke-direct {v0, p0, p2}, Le7/q;-><init>(Le7/r;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le7/q;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le7/q;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/health/connect/HealthConnectException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Le7/q;->y:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroid/health/connect/HealthConnectException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :goto_1
    invoke-static {p1}, Lb3/g1;->w(Landroid/health/connect/HealthConnectException;)Ljava/lang/Exception;

    move-result-object p1

    throw p1
.end method
