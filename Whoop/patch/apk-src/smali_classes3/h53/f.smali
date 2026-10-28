.class public final Lh53/f;
.super Lx43/k;
.source "SourceFile"

# interfaces
.implements Lx43/i;


# instance fields
.field public final a:Lc53/a;

.field public final b:Ll83/p;

.field public final c:Lh53/e;

.field public final d:Lec3/h2;

.field public final e:Lec3/w1;

.field public final f:Lec3/w1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lud3/l0;Lz33/b;Lc53/a;Landroidx/lifecycle/x;Ldb/j0;Le53/d;Lb30/m;)V
    .locals 11

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p8

    move-object/from16 v3, p9

    const-string v4, "apiKey"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "url"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "networkStateProvider"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "lifecycle"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "sfuAnalytics"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh53/f;->a:Lc53/a;

    const-string v4, "Video:SfuSocket"

    invoke-static {p0, v4}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v4

    iput-object v4, p0, Lh53/f;->b:Ll83/p;

    new-instance v4, Lqg3/d;

    invoke-direct {v4, v2}, Lqg3/d;-><init>(Le53/d;)V

    new-instance v5, Lq/f;

    new-instance v6, Lg73/a;

    const/4 v7, 0x3

    invoke-direct {v6, v7}, Lg73/a;-><init>(I)V

    invoke-direct {v5, v6, p3}, Lq/f;-><init>(Lx43/e;Lud3/l0;)V

    new-instance p3, La43/f;

    invoke-direct {p3, v0, v1}, La43/f;-><init>(Lc53/a;Landroidx/lifecycle/x;)V

    new-instance v1, Lh53/e;

    const-string v6, "wssUrl"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "apiKey"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "networkStateProvider"

    invoke-static {p4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sfuAnalytics"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p2, v1, Lh53/e;->a:Ljava/lang/Object;

    iput-object p1, v1, Lh53/e;->b:Ljava/lang/Object;

    iput-object v4, v1, Lh53/e;->c:Ljava/lang/Object;

    iput-object v5, v1, Lh53/e;->d:Ljava/lang/Object;

    iput-object v0, v1, Lh53/e;->e:Ljava/lang/Object;

    iput-object p3, v1, Lh53/e;->f:Ljava/lang/Object;

    iput-object p4, v1, Lh53/e;->g:Ljava/lang/Object;

    iput-object v3, v1, Lh53/e;->h:Ljava/lang/Object;

    const-string p1, "Video:SfuSocket"

    invoke-static {v1, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, v1, Lh53/e;->j:Ljava/lang/Object;

    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    const-string p2, "SafeCall"

    sget-object p3, Lb23/i;->a:Lb23/i;

    sget-object p3, Lb23/i;->d:Lb23/e;

    sget-object p4, Lb23/g;->F:Lb23/g;

    invoke-interface {p3, p4, p2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Exception occurred: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, p4, p2, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p2, Ln23/f;

    new-instance p3, Ln23/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    const-string v0, "Safe call failed with "

    invoke-static {v0, p4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p4, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p2, p3}, Ln23/f;-><init>(Ln23/e;)V

    :goto_0
    iput-object p2, v1, Lh53/e;->k:Ljava/lang/Object;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, v1, Lh53/e;->l:Ljava/lang/Object;

    new-instance p1, Lqg3/d;

    const/16 p2, 0xf

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lqg3/d;-><init>(IB)V

    iput-object p1, v1, Lh53/e;->m:Ljava/lang/Object;

    new-instance v5, Lx43/h;

    iget-object p1, v1, Lh53/e;->e:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lc53/a;

    new-instance v7, Ld0/d;

    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-direct {v7, v1, p2, p1}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v8, La6/e;

    const/4 p1, 0x5

    invoke-direct {v8, v1, p2, p1}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v9, Lav/b;

    const/16 p1, 0x14

    invoke-direct {v9, v1, p1}, Lav/b;-><init>(Ljava/lang/Object;I)V

    const/16 v10, 0x19

    invoke-direct/range {v5 .. v10}, Lx43/h;-><init>(Lc53/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    iput-object v5, v1, Lh53/e;->p:Ljava/lang/Object;

    new-instance p1, La43/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, v1, Lh53/e;->q:Ljava/lang/Object;

    iget-object p1, v1, Lh53/e;->l:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashSet;

    monitor-enter p1

    :try_start_1
    iget-object p3, v1, Lh53/e;->l:Ljava/lang/Object;

    check-cast p3, Ljava/util/LinkedHashSet;

    invoke-interface {p3, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    iput-object v1, p0, Lh53/f;->c:Lh53/e;

    iget-object p1, v1, Lh53/e;->m:Ljava/lang/Object;

    check-cast p1, Lqg3/d;

    invoke-virtual {p1}, Lqg3/d;->s()Ly43/b;

    move-result-object p1

    iget-object p1, p1, Ly43/b;->e:Lec3/h2;

    iput-object p1, p0, Lh53/f;->d:Lec3/h2;

    sget-object p1, Ldc3/a;->w:Ldc3/a;

    const/4 p3, 0x1

    const/16 p4, 0x64

    invoke-static {p3, p4, p1}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lh53/f;->e:Lec3/w1;

    invoke-static {p3, p4, p1}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lh53/f;->f:Lec3/w1;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    new-instance p1, Lio/sentry/internal/debugmeta/c;

    move-object/from16 p2, p7

    invoke-direct {p1, p2, v2}, Lio/sentry/internal/debugmeta/c;-><init>(Le53/c;Le53/d;)V

    iput-object p1, v4, Lqg3/d;->y:Ljava/lang/Object;

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

    new-instance v0, La30/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, La30/s;-><init>(Lh53/f;Lb3/z0;Lc93/m;Lq83/d;)V

    const/4 p1, 0x3

    iget-object p2, p0, Lh53/f;->a:Lc53/a;

    invoke-static {p2, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final c(Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 5

    check-cast p1, Lv33/n;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onConnected] Socket connected with event: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 5

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onConnecting] Socket is connecting"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 5

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onCreated] Socket is created"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final f(Ls40/e0;)V
    .locals 6

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    instance-of v1, p1, Lu33/b;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lu33/b;

    goto :goto_0

    :cond_0
    move-object p1, v4

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lu33/b;->w:Ln23/c;

    goto :goto_1

    :cond_1
    move-object p1, v4

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onDisconnected] Socket disconnected. Cause: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public final g(Lx43/m;)V
    .locals 6

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

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
    iget-object v0, p0, Lh53/f;->f:Lec3/w1;

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

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

    check-cast p1, Lv33/w;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

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
    iget-object v0, p0, Lh53/f;->e:Lec3/w1;

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

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

.method public final i(Lq83/d;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, Lh53/f;->j()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[disconnect] Disconnecting socket"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lh53/f;->c:Lh53/e;

    invoke-virtual {v0}, Lh53/e;->d()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v3, "[disconnect] no args"

    invoke-interface {v1, v2, v5, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, v0, Lh53/e;->m:Ljava/lang/Object;

    check-cast v0, Lqg3/d;

    invoke-virtual {v0}, Lqg3/d;->r()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onRequiredDisconnect] no args"

    invoke-interface {v1, v5, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v0}, Lqg3/d;->s()Ly43/b;

    move-result-object v0

    sget-object v1, Li53/o;->a:Li53/o;

    invoke-virtual {v0, v1, p1}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v1

    :goto_0
    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    if-ne p1, v0, :cond_5

    return-object p1

    :cond_5
    return-object v1
.end method

.method public final j()Lb23/k;
    .locals 1

    iget-object v0, p0, Lh53/f;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method
