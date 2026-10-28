.class public final Lf53/k;
.super Lx43/k;
.source "SourceFile"

# interfaces
.implements Lx43/i;


# instance fields
.field public final a:Ld33/c;

.field public final b:Lc53/a;

.field public final c:Le53/d;

.field public final d:Lqg3/d;

.field public final e:Ll83/p;

.field public final f:Lec3/w1;

.field public final g:Lec3/w1;

.field public final h:Lec3/h2;

.field public final i:Lf53/j;

.field public final j:Lec3/h2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ld33/c;Ljava/lang/String;Lud3/l0;Lz33/b;Lc53/a;Landroidx/lifecycle/x;Le53/c;Le53/d;)V
    .locals 11

    move-object/from16 v5, p7

    move-object/from16 v0, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    const-string v1, "apiKey"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "url"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "token"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "networkStateProvider"

    move-object/from16 v7, p6

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lifecycle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "tokenProvider"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "tokenRepository"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lf53/k;->a:Ld33/c;

    iput-object v5, p0, Lf53/k;->b:Lc53/a;

    iput-object v9, p0, Lf53/k;->c:Le53/d;

    new-instance v1, Ld1/j;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ld1/j;-><init>(I)V

    new-instance v3, Lqg3/d;

    invoke-direct {v3, v9}, Lqg3/d;-><init>(Le53/d;)V

    iput-object v3, p0, Lf53/k;->d:Lqg3/d;

    const-string v2, "Video:Socket"

    invoke-static {p0, v2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v2

    iput-object v2, p0, Lf53/k;->e:Ll83/p;

    sget-object v2, Ldc3/a;->x:Ldc3/a;

    const/4 v4, 0x1

    const/16 v6, 0x64

    invoke-static {v4, v6, v2}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object v10

    iput-object v10, p0, Lf53/k;->f:Lec3/w1;

    invoke-static {v4, v6, v2}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object v2

    iput-object v2, p0, Lf53/k;->g:Lec3/w1;

    const/4 v2, 0x0

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, p0, Lf53/k;->h:Lec3/h2;

    new-instance v2, Lf53/j;

    new-instance v4, Lq/f;

    move-object/from16 v6, p5

    invoke-direct {v4, v1, v6}, Lq/f;-><init>(Lx43/e;Lud3/l0;)V

    new-instance v6, La43/f;

    invoke-direct {v6, v5, v0}, La43/f;-><init>(Lc53/a;Landroidx/lifecycle/x;)V

    move-object v1, p1

    move-object v0, v2

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lf53/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lqg3/d;Lq/f;Lc53/a;La43/f;Lz33/b;)V

    iget-object p1, v0, Lf53/j;->k:Ljava/util/LinkedHashSet;

    monitor-enter p1

    :try_start_0
    iget-object p2, v0, Lf53/j;->k:Ljava/util/LinkedHashSet;

    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    iput-object v0, p0, Lf53/k;->i:Lf53/j;

    iget-object p1, v0, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p1

    iget-object p1, p1, Ly43/b;->e:Lec3/h2;

    iput-object p1, p0, Lf53/k;->j:Lec3/h2;

    new-instance p1, Lio/sentry/internal/debugmeta/c;

    invoke-direct {p1, v8, v9}, Lio/sentry/internal/debugmeta/c;-><init>(Le53/c;Le53/d;)V

    iput-object p1, v3, Lqg3/d;->y:Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    move-object p2, v0

    monitor-exit p1

    throw p2
.end method


# virtual methods
.method public final b(Lb3/z0;Lc93/m;)V
    .locals 2

    new-instance v0, La1/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, La1/h;-><init>(Lf53/k;Lb3/z0;Lc93/m;Lq83/d;)V

    const/4 p1, 0x3

    iget-object p2, p0, Lf53/k;->b:Lc53/a;

    invoke-static {p2, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final c(Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 6

    check-cast p1, Lio/getstream/android/video/generated/models/ConnectedEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/room/e;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p0, v0}, Lx43/i;->a(Lx43/i;Lc93/m;)V

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onConnected] Socket connected with event: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v4, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 5

    iget-object v0, p0, Lf53/k;->h:Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onConnecting] Socket is connecting"

    invoke-interface {v0, v3, v4, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 5

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onCreated] Socket is created"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, La20/b;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v4, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lf53/k;->b:Lc53/a;

    invoke-static {v2, v4, v4, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final f(Ls40/e0;)V
    .locals 6

    iget-object v0, p0, Lf53/k;->h:Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    instance-of v2, p1, Lu33/b;

    if-eqz v2, :cond_0

    check-cast p1, Lu33/b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lu33/b;->w:Ln23/c;

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[onDisconnected] Socket disconnected. Cause: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v4, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public final g(Lx43/m;)V
    .locals 6

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onError] Socket error: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lf53/k;->f:Lec3/w1;

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onError] Failed to emit error: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onEvent] Received event: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lf53/k;->g:Lec3/w1;

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf53/k;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onEvent] Failed to emit event: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final i(Lio/getstream/video/android/model/User;Ls83/i;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lio/getstream/video/android/model/User;->Companion:Lio/getstream/video/android/model/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "!anon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lf53/k;->i:Lf53/j;

    iget-object v2, v1, Lf53/j;->a:Ljava/lang/String;

    iget-object v3, v1, Lf53/j;->b:Ljava/lang/String;

    invoke-virtual {v1}, Lf53/j;->f()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->y:Lb23/g;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    const/4 v8, 0x0

    if-eqz v5, :cond_0

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v9, "[connectUser] user.id: "

    const-string v10, ", isAnonymous: "

    invoke-static {v9, v5, v10, v0}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v6, v7, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v4, v1, Lf53/j;->m:Lbc3/c2;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v8}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, v1, Lf53/j;->e:Lc53/a;

    new-instance v6, La1/h;

    const/16 v7, 0x17

    invoke-direct {v6, v1, v4, v8, v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v5, v8, v8, v6, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v4

    iput-object v4, v1, Lf53/j;->m:Lbc3/c2;

    iget-object v1, v1, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    new-instance v0, Lx43/b;

    invoke-direct {v0, v3, v2, p1}, Lx43/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;)V

    goto :goto_0

    :cond_2
    if-nez v0, :cond_7

    new-instance v0, Lx43/d;

    invoke-direct {v0, v3, v2, p1}, Lx43/d;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/video/android/model/User;)V

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lio/sentry/internal/debugmeta/c;->z:I

    sput p1, Lio/sentry/internal/debugmeta/c;->E:I

    const/4 p1, 0x0

    sput p1, Lio/sentry/internal/debugmeta/c;->z:I

    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Lrb3/g;->b()Lio/getstream/video/android/model/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-boolean v5, v0, Lrb3/g;->a:Z

    const-string v6, "[onConnect] user.id: \'"

    const-string v7, "\', isReconnection: "

    invoke-static {v6, v2, v7, v5}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v4, v3, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object p1

    new-instance v1, Lg53/n;

    sget-object v2, Lg53/b;->w:Lg53/b;

    invoke-direct {v1, v0, v2}, Lg53/n;-><init>(Lrb3/g;Lg53/b;)V

    invoke-virtual {p1, v1, p2}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v0

    :goto_1
    if-ne p1, p2, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v0

    :goto_2
    if-ne p1, p2, :cond_6

    return-object p1

    :cond_6
    return-object v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final j()Lb23/k;
    .locals 1

    iget-object v0, p0, Lf53/k;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method
