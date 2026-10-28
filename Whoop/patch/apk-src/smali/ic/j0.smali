.class public final Lic/j0;
.super Lic/q0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v1, "repeatIntervalTimeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "flexIntervalTimeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0, p1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    .line 9
    iget-object p1, p0, Lic/q0;->c:Lqc/q;

    const-wide/16 v1, 0xf

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    const-wide/16 v3, 0x5

    .line 11
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    .line 12
    invoke-virtual {p1, v1, v2, v3, v4}, Lqc/q;->f(JJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    const-string v0, "repeatIntervalTimeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    .line 2
    iget-object p1, p0, Lic/q0;->c:Lqc/q;

    .line 3
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lqc/q;->e(J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/time/Duration;)V
    .locals 2

    .line 4
    invoke-direct {p0, p1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    .line 5
    iget-object p1, p0, Lic/q0;->c:Lqc/q;

    .line 6
    invoke-virtual {p2}, Ljava/time/Duration;->toMillis()J

    move-result-wide v0

    .line 7
    invoke-virtual {p1, v0, v1}, Lqc/q;->e(J)V

    return-void
.end method


# virtual methods
.method public final c()Lic/r0;
    .locals 4

    iget-boolean v0, p0, Lic/q0;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    iget-object v0, v0, Lqc/q;->j:Lic/e;

    iget-boolean v0, v0, Lic/e;->d:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lic/q0;->c:Lqc/q;

    iget-boolean v1, v0, Lqc/q;->q:Z

    if-nez v1, :cond_2

    new-instance v1, Lic/k0;

    iget-object v2, p0, Lic/q0;->b:Ljava/util/UUID;

    iget-object v3, p0, Lic/q0;->d:Ljava/util/Set;

    invoke-direct {v1, v2, v0, v3}, Lic/r0;-><init>(Ljava/util/UUID;Lqc/q;Ljava/util/Set;)V

    return-object v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "PeriodicWorkRequests cannot be expedited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Lic/q0;
    .locals 0

    return-object p0
.end method
