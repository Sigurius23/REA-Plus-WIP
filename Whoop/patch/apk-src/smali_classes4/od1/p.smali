.class public Lod1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/whoop/service/store/SessionStore;

.field private final b:Lod1/u;

.field private final c:Ltr2/n;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/whoop/domain/model/Session;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/whoop/domain/model/Session;

.field private final f:Lu92/d;

.field private final g:Ln92/e;

.field private final h:Lod1/j;

.field private final i:Ly92/b;


# direct methods
.method public constructor <init>(Lcom/whoop/service/store/SessionStore;Lod1/u;Lu92/d;Ln92/e;Lod1/j;Ly92/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SessionMgr"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lod1/p;->c:Ltr2/n;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lod1/p;->d:Ljava/util/Map;

    iput-object p1, p0, Lod1/p;->a:Lcom/whoop/service/store/SessionStore;

    iput-object p2, p0, Lod1/p;->b:Lod1/u;

    iput-object p3, p0, Lod1/p;->f:Lu92/d;

    iput-object p4, p0, Lod1/p;->g:Ln92/e;

    iput-object p5, p0, Lod1/p;->h:Lod1/j;

    iput-object p6, p0, Lod1/p;->i:Ly92/b;

    invoke-direct {p0}, Lod1/p;->f()V

    iget-object p1, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Starting session for "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    invoke-interface {v0, p1, p3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    invoke-virtual {p2, p1}, Lod1/u;->r(Lcom/whoop/domain/model/Session;)V

    iget-object p1, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    invoke-virtual {p2, p1}, Lod1/u;->q(Lcom/whoop/domain/model/Session;)V

    iget-object p1, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    invoke-virtual {p6, p1}, Ly92/b;->d(Lcom/whoop/domain/model/Session;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lod1/u;->r(Lcom/whoop/domain/model/Session;)V

    invoke-virtual {p2, p1}, Lod1/u;->q(Lcom/whoop/domain/model/Session;)V

    :goto_0
    invoke-virtual {p2}, Lod1/u;->j()Lxg3/g;

    move-result-object p1

    new-instance p2, Lcom/whoop/data/onboarding/c;

    const/16 p3, 0xe

    invoke-direct {p2, p0, p3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lxg3/g;->p(Lbh3/b;)V

    return-void
.end method

.method public static synthetic a(Lod1/p;Lod1/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lod1/p;->e(Lod1/u$a;)V

    return-void
.end method

.method private c()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/Session;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lod1/p;->c:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "List of sessions: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, ".dumpSessions"

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->b(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private synthetic e(Lod1/u$a;)V
    .locals 2

    invoke-virtual {p1}, Lod1/u$a;->a()Lcom/whoop/domain/model/Session;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    :cond_0
    invoke-direct {p0}, Lod1/p;->h()V

    return-void
.end method

.method private declared-synchronized f()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/p;->a:Lcom/whoop/service/store/SessionStore;

    invoke-virtual {v0}, Lcom/whoop/service/store/SessionStore;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/Session;

    iget-object v2, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/domain/model/User;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lod1/p;->c()V

    iget-object v0, p0, Lod1/p;->a:Lcom/whoop/service/store/SessionStore;

    invoke-virtual {v0}, Lcom/whoop/service/store/SessionStore;->a()Lcom/whoop/domain/model/Session;

    move-result-object v0

    iput-object v0, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private declared-synchronized h()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/p;->a:Lcom/whoop/service/store/SessionStore;

    iget-object v1, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/service/store/SessionStore;->d(Ljava/util/Collection;)V

    iget-object v0, p0, Lod1/p;->e:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lod1/p;->a:Lcom/whoop/service/store/SessionStore;

    invoke-virtual {v1, v0}, Lcom/whoop/service/store/SessionStore;->c(Lcom/whoop/domain/model/Session;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private declared-synchronized i(Lcom/whoop/domain/model/Session;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lod1/p;->b:Lod1/u;

    invoke-virtual {v0, p1}, Lod1/u;->s(Lcom/whoop/domain/model/Session;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "specified Session is not a currently logged in Session"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public declared-synchronized b(Lcom/whoop/domain/model/Session;)V
    .locals 4

    const-string v0, "Adding session for "

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lod1/p;->c:Ltr2/n;

    const-string v2, ".addSession"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->b(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lod1/p;->g:Ln92/e;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ln92/e;->d(Ljava/lang/String;)V

    invoke-direct {p0}, Lod1/p;->c()V

    invoke-direct {p0, p1}, Lod1/p;->i(Lcom/whoop/domain/model/Session;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d()Lod1/u;
    .locals 1

    iget-object v0, p0, Lod1/p;->b:Lod1/u;

    return-object v0
.end method

.method public declared-synchronized g(Lcom/whoop/domain/model/Session;)V
    .locals 5

    const-string v0, "Removing session for "

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lod1/p;->c:Ltr2/n;

    const-string v2, ".logout"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v4}, Ltr2/n;->b(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lod1/p;->c()V

    iget-object v0, p0, Lod1/p;->f:Lu92/d;

    invoke-virtual {v0}, Lu92/d;->x()V

    iget-object v0, p0, Lod1/p;->b:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/whoop/domain/model/User;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lod1/p;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v3

    check-cast p1, Lcom/whoop/domain/model/Session;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lod1/p;->b:Lod1/u;

    invoke-virtual {v0, p1}, Lod1/u;->s(Lcom/whoop/domain/model/Session;)V

    iget-object p1, p0, Lod1/p;->g:Ln92/e;

    invoke-interface {p1}, Ln92/e;->a()V

    iget-object p1, p0, Lod1/p;->h:Lod1/j;

    invoke-virtual {p1}, Lod1/j;->d()V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lod1/p;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
