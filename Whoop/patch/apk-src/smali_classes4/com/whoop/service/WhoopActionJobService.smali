.class public Lcom/whoop/service/WhoopActionJobService;
.super Landroid/app/job/JobService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method

.method public static a(Ly82/b;Landroid/content/Context;I)Landroid/app/job/JobInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/service/WhoopActionJobService;->c(Ly82/b;Landroid/content/Context;I)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/PersistableBundle;Landroid/content/Context;IZ)Landroid/app/job/JobInfo$Builder;
    .locals 3

    new-instance v0, Landroid/app/job/JobInfo$Builder;

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/whoop/service/WhoopActionJobService;

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {v0, p2, v1}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    invoke-virtual {v0, p3}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    const-wide/16 v0, 0x7530

    const/4 p2, 0x1

    invoke-virtual {p1, v0, v1, p2}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    if-nez p3, :cond_0

    const-wide/16 p1, 0x1388

    invoke-virtual {p0, p1, p2}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    :cond_0
    return-object p0
.end method

.method public static c(Ly82/b;Landroid/content/Context;I)Landroid/app/job/JobInfo$Builder;
    .locals 3

    new-instance v0, Landroid/os/PersistableBundle;

    invoke-direct {v0}, Landroid/os/PersistableBundle;-><init>()V

    const-string v1, "actionString"

    invoke-virtual {p0}, Ly82/b;->getActionString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly82/b;->requiresNetwork()Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/whoop/service/WhoopActionJobService;->b(Landroid/os/PersistableBundle;Landroid/content/Context;IZ)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    return-object p0
.end method

.method private d(Landroid/app/job/JobParameters;Ltr2/n;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v0

    const-string v1, "actionString"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly82/b;->fromActionString(Ljava/lang/String;)Ly82/b;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Attempting to perform WhoopAction: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {p2, v3, v4}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v1, p0}, Ly82/b;->attemptToPerform(Landroid/content/Context;)Ly82/b$t;

    move-result-object v1

    invoke-static {v1}, Ly82/b$t;->g(Ly82/b$t;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Performed WhoopAction: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " Result: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_0
    const-string v1, "Failure detected - rescheduling WhoopAction: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    xor-int/lit8 p2, v3, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    goto :goto_1

    :cond_1
    const-string v1, "No WhoopAction found for: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, p1, v2}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    :goto_1
    return v2
.end method


# virtual methods
.method public onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 4

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "WhoopActionJobService"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Starting job"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v2

    const-string v3, "actionString"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/whoop/service/WhoopActionJobService;->d(Landroid/app/job/JobParameters;Ltr2/n;)Z

    move-result p1

    return p1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Found no action to take: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return v1
.end method

.method public onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
