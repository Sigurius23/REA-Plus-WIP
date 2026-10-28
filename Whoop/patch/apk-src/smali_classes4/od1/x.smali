.class public Lod1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field private final E:Ltr2/n;

.field private final F:Lod1/y;

.field private final w:Li92/l;

.field private final x:Lod1/u;

.field private final y:Lze1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lze1/d<",
            "Lcom/whoop/service/network/model/UserProfileStatistics;",
            ">;"
        }
    .end annotation
.end field

.field private final z:Lu92/d;


# direct methods
.method public constructor <init>(Lod1/u;Landroid/content/Context;Lcom/whoop/service/network/UsersPreferenceApi;Li92/o;Lod1/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v0

    iput-object v0, p0, Lod1/x;->y:Lze1/d;

    const-string v0, "UserMgr"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lod1/x;->E:Ltr2/n;

    new-instance v0, Li92/l;

    invoke-direct {v0, p3, p4}, Li92/l;-><init>(Lcom/whoop/service/network/UsersPreferenceApi;Li92/o;)V

    iput-object v0, p0, Lod1/x;->w:Li92/l;

    iput-object p1, p0, Lod1/x;->x:Lod1/u;

    iput-object p5, p0, Lod1/x;->F:Lod1/y;

    new-instance p3, Lu92/f;

    const-string p4, "UserPrefs"

    invoke-direct {p3, p2, p4, p1}, Lu92/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lod1/u;)V

    iput-object p3, p0, Lod1/x;->z:Lu92/d;

    invoke-direct {p0}, Lod1/x;->g()Lcom/whoop/service/network/model/UserProfileStatistics;

    move-result-object p2

    invoke-direct {p0, p2}, Lod1/x;->t(Lcom/whoop/service/network/model/UserProfileStatistics;)V

    invoke-virtual {p1}, Lod1/u;->n()Lxg3/g;

    move-result-object p2

    new-instance p3, Lod1/w;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lod1/w;-><init>(Lod1/x;I)V

    invoke-virtual {p2, p3}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-virtual {p1}, Lod1/u;->j()Lxg3/g;

    move-result-object p2

    new-instance p3, Lio/sentry/okhttp/b;

    const/16 p4, 0x1d

    invoke-direct {p3, p4}, Lio/sentry/okhttp/b;-><init>(I)V

    invoke-virtual {p2, p3}, Lxg3/g;->n(Lbh3/g;)Lxg3/g;

    move-result-object p2

    new-instance p3, Lod1/w;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p4}, Lod1/w;-><init>(Lod1/x;I)V

    invoke-virtual {p2, p3}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-virtual {p1}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lod1/x;->d()V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lod1/u$a;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lod1/x;->q(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lod1/x;Lod1/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/x;->p(Lod1/u$a;)V

    return-void
.end method

.method public static synthetic c(Lod1/x;Lod1/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/x;->r(Lod1/u$a;)V

    return-void
.end method

.method private d()V
    .locals 4

    invoke-direct {p0}, Lod1/x;->n()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x2932e00

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lod1/x;->B()V

    :cond_0
    return-void
.end method

.method private f()Lcom/whoop/service/network/model/UserProfileStatistics;
    .locals 1

    iget-object v0, p0, Lod1/x;->y:Lze1/d;

    invoke-virtual {v0}, Lze1/d;->Z()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/model/UserProfileStatistics;

    return-object v0
.end method

.method private g()Lcom/whoop/service/network/model/UserProfileStatistics;
    .locals 2

    iget-object v0, p0, Lod1/x;->z:Lu92/d;

    const-string v1, "userProfileStatistics"

    invoke-virtual {v0, v1}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-class v1, Lcom/whoop/service/network/model/UserProfileStatistics;

    invoke-static {v0, v1}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/model/UserProfileStatistics;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private n()J
    .locals 4

    invoke-virtual {p0}, Lod1/x;->l()Lu92/d;

    move-result-object v0

    const-string v1, "userProfileStatisticsUpdated"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private synthetic p(Lod1/u$a;)V
    .locals 0

    invoke-virtual {p1}, Lod1/u$a;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lod1/x;->C()Lxg3/g;

    :cond_0
    return-void
.end method

.method private static synthetic q(Lod1/u$a;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lod1/u$a;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lod1/u$a;->b()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic r(Lod1/u$a;)V
    .locals 0

    invoke-virtual {p0}, Lod1/x;->A()V

    return-void
.end method

.method private t(Lcom/whoop/service/network/model/UserProfileStatistics;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/service/network/model/UserProfileStatistics;->getRecoveryCount()I

    move-result v0

    invoke-direct {p0, v0}, Lod1/x;->z(I)V

    :cond_0
    iget-object v0, p0, Lod1/x;->y:Lze1/d;

    invoke-virtual {v0, p1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private u(Lcom/whoop/service/network/model/UserProfileStatistics;)V
    .locals 2

    invoke-direct {p0, p1}, Lod1/x;->t(Lcom/whoop/service/network/model/UserProfileStatistics;)V

    invoke-direct {p0, p1}, Lod1/x;->y(Lcom/whoop/service/network/model/UserProfileStatistics;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lod1/x;->v(J)V

    return-void
.end method

.method private v(J)V
    .locals 2

    invoke-virtual {p0}, Lod1/x;->l()Lu92/d;

    move-result-object v0

    const-string v1, "userProfileStatisticsUpdated"

    invoke-virtual {v0, v1, p1, p2}, Lu92/d;->u(Ljava/lang/String;J)V

    return-void
.end method

.method private y(Lcom/whoop/service/network/model/UserProfileStatistics;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lod1/x;->l()Lu92/d;

    move-result-object v0

    const-string v1, "userProfileStatistics"

    invoke-virtual {v0, v1, p1}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private z(I)V
    .locals 2

    iget-object v0, p0, Lod1/x;->y:Lze1/d;

    new-instance v1, Lcom/whoop/service/network/model/UserProfileStatistics;

    invoke-direct {v1, p1}, Lcom/whoop/service/network/model/UserProfileStatistics;-><init>(I)V

    invoke-virtual {v0, v1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    iget-object v0, p0, Lod1/x;->x:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lod1/x;->F:Lod1/y;

    invoke-virtual {v0}, Lod1/y;->d()Lxg3/g;

    move-result-object v0

    new-instance v1, Lod1/w;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lod1/w;-><init>(Lod1/x;I)V

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void

    :cond_1
    invoke-direct {p0, v1}, Lod1/x;->u(Lcom/whoop/service/network/model/UserProfileStatistics;)V

    return-void
.end method

.method public B()V
    .locals 0

    invoke-virtual {p0}, Lod1/x;->A()V

    return-void
.end method

.method public C()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/ProfileDto;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lod1/x;->x:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lod1/x;->w:Li92/l;

    invoke-virtual {v0}, Li92/l;->c()Lxg3/g;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()I
    .locals 1

    invoke-direct {p0}, Lod1/x;->f()Lcom/whoop/service/network/model/UserProfileStatistics;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/service/network/model/UserProfileStatistics;->getRecoveryCount()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserPreferences;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lod1/x;->w:Li92/l;

    invoke-virtual {v0}, Li92/l;->a()Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public l()Lu92/d;
    .locals 1

    iget-object v0, p0, Lod1/x;->z:Lu92/d;

    return-object v0
.end method

.method public o(Ll83/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lod1/x;->x:Lod1/u;

    iget-object v1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/User;

    invoke-virtual {v0, v1}, Lod1/u;->t(Lcom/whoop/domain/model/User;)V

    new-instance v0, Lcom/whoop/service/network/model/UserProfileStatistics;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v0, p1}, Lcom/whoop/service/network/model/UserProfileStatistics;-><init>(I)V

    invoke-direct {p0, v0}, Lod1/x;->u(Lcom/whoop/service/network/model/UserProfileStatistics;)V

    return-void

    :cond_0
    iget-object p1, p0, Lod1/x;->E:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to update user v2"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object v0, p0, Lod1/x;->x:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lod1/x;->C()Lxg3/g;

    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public w(Z)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserPreferences;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lod1/x;->w:Li92/l;

    invoke-virtual {v0, p1}, Li92/l;->b(Z)Lxg3/g;

    move-result-object p1

    return-object p1
.end method
