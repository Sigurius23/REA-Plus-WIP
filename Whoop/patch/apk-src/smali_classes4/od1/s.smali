.class public Lod1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ltr2/n;

.field private b:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final c:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final d:Lu92/e;

.field private final e:Lcom/whoop/data/repositories/SportsRepository;


# direct methods
.method public constructor <init>(Lu92/e;Lcom/whoop/data/repositories/SportsRepository;Lod1/a0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SportMgr"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lod1/s;->a:Ltr2/n;

    iput-object p1, p0, Lod1/s;->d:Lu92/e;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v0

    iput-object v0, p0, Lod1/s;->c:Llh3/b;

    invoke-virtual {v0}, Lxg3/g;->E()Lxg3/g;

    move-result-object v0

    iput-object p2, p0, Lod1/s;->e:Lcom/whoop/data/repositories/SportsRepository;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/whoop/data/onboarding/c;

    const/16 v1, 0xf

    invoke-direct {p2, p1, v1}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-interface {p3}, Lod1/a0;->e()Lxg3/g;

    move-result-object p1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p1

    new-instance p2, Lod1/r;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p3}, Lod1/r;-><init>(Lod1/s;I)V

    new-instance p3, Lod1/r;

    const/4 v0, 0x3

    invoke-direct {p3, p0, v0}, Lod1/r;-><init>(Lod1/s;I)V

    invoke-virtual {p1, p2, p3}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    invoke-virtual {p0}, Lod1/s;->o()V

    return-void
.end method

.method public static synthetic a(Lod1/s;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/s;->k(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(Lod1/s;Ljava/util/List;)Lxg3/g;
    .locals 0

    invoke-direct {p0, p1}, Lod1/s;->i(Ljava/util/List;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lod1/s;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/s;->l(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic d(Lod1/s;Lcom/whoop/domain/model/Login;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/s;->j(Lcom/whoop/domain/model/Login;)V

    return-void
.end method

.method public static synthetic e(Lod1/s;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/s;->m(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static g(I)Z
    .locals 1

    const/16 v0, 0x47

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Lcom/whoop/service/network/model/Sport;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/Sport;->getId()I

    move-result p0

    invoke-static {p0}, Lod1/s;->g(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private synthetic i(Ljava/util/List;)Lxg3/g;
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lod1/s;->a:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Local store is empty \u2014 triggering updateSports()"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lod1/s;->o()V

    iget-object p1, p0, Lod1/s;->c:Llh3/b;

    return-object p1

    :cond_0
    invoke-static {p1}, Lxg3/g;->u(Ljava/lang/Object;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method private synthetic j(Lcom/whoop/domain/model/Login;)V
    .locals 0

    invoke-virtual {p0}, Lod1/s;->o()V

    return-void
.end method

.method private synthetic k(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lod1/s;->a:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "SportMgr getAllSports error"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method private synthetic l(Ljava/util/List;)V
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lod1/s;->d:Lu92/e;

    invoke-virtual {v0, p1}, Lu92/e;->d(Ljava/util/List;)V

    iget-object v0, p0, Lod1/s;->c:Llh3/b;

    invoke-virtual {v0, p1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, Lod1/s;->a:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SportMgr getAllSportV2 sportList success "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lod1/s;->n(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    iget-object p1, p0, Lod1/s;->a:Ltr2/n;

    const-string v0, "Sports list is empty"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private synthetic m(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lod1/s;->a:Ltr2/n;

    const-string v1, "SportMgr getAllSportsV2 sportList error "

    invoke-static {v1, p1}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static n(Ljava/util/Collection;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/whoop/service/network/model/Sport;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "list of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " sports: {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/model/Sport;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/Sport;->getId()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p0, " }"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public f()Llh3/b;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Llh3/b;"
        }
    .end annotation

    iget-object v0, p0, Lod1/s;->b:Llh3/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v0

    iput-object v0, p0, Lod1/s;->b:Llh3/b;

    iget-object v0, p0, Lod1/s;->d:Lu92/e;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/sentry/i0;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lio/sentry/i0;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lch3/s;

    invoke-direct {v0, v1, v2}, Lch3/s;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lxg3/p;

    invoke-direct {v1, v0}, Lxg3/p;-><init>(Lxg3/o;)V

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v0, v0, Lkh3/a;->b:Leh3/e;

    new-instance v2, Lch3/b1;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v0, v3}, Lch3/b1;-><init>(Lxg3/p;Ljava/lang/Object;I)V

    new-instance v0, Lxg3/p;

    invoke-direct {v0, v2}, Lxg3/p;-><init>(Lxg3/o;)V

    new-instance v1, Lmm/d;

    const/16 v2, 0xd

    invoke-direct {v1, p0, v2}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lch3/b1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lch3/b1;-><init>(Lxg3/p;Ljava/lang/Object;I)V

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->f()Ljh3/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lch3/n;

    const/4 v1, 0x1

    invoke-direct {v0, v2, v1}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object v0

    invoke-static {v0}, Lxg3/g;->y(Lxg3/g;)Lxg3/g;

    move-result-object v0

    new-instance v1, Llive/hms/video/factories/c;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lod1/s;->b:Llh3/b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lod1/q;

    invoke-direct {v2, v1, v3}, Lod1/q;-><init>(Llh3/b;I)V

    iget-object v1, p0, Lod1/s;->b:Llh3/b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lod1/q;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lod1/q;-><init>(Llh3/b;I)V

    invoke-virtual {v0, v2, v3}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    :cond_0
    iget-object v0, p0, Lod1/s;->b:Llh3/b;

    return-object v0
.end method

.method public o()V
    .locals 4

    iget-object v0, p0, Lod1/s;->e:Lcom/whoop/data/repositories/SportsRepository;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/SportsRepository;->getSports()Lxg3/g;

    move-result-object v0

    invoke-virtual {v0}, Lxg3/g;->E()Lxg3/g;

    move-result-object v0

    new-instance v1, Lod1/r;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lod1/r;-><init>(Lod1/s;I)V

    new-instance v2, Lod1/r;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lod1/r;-><init>(Lod1/s;I)V

    invoke-virtual {v0, v1, v2}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    return-void
.end method
