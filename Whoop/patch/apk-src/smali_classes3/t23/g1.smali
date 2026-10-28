.class public final Lt23/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/b4;

.field public final b:Ll83/p;

.field public final c:Lt23/b4;

.field public final d:Lec3/h2;

.field public final e:Lec3/h2;

.field public final f:Lec3/h2;

.field public final g:Lec3/h2;

.field public final h:Lec3/h2;

.field public final i:Lbi/p;

.field public final j:La30/w0;

.field public final k:Lz23/c;


# direct methods
.method public constructor <init>(Lt23/b4;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/g1;->a:Lt23/b4;

    const-string v0, "ClientState"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lt23/g1;->b:Ll83/p;

    iput-object p1, p0, Lt23/g1;->c:Lt23/b4;

    sget-object v0, Lt23/k1;->a:Lt23/k1;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lt23/g1;->d:Lec3/h2;

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lt23/g1;->e:Lec3/h2;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lt23/g1;->f:Lec3/h2;

    iget-object v2, p1, Lt23/b4;->I:Ld33/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, p0, Lt23/g1;->g:Lec3/h2;

    iput-object v0, p0, Lt23/g1;->h:Lec3/h2;

    iget-object v0, p1, Lt23/b4;->K:Lbi/p;

    iput-object v0, p0, Lt23/g1;->i:Lbi/p;

    new-instance v0, La30/w0;

    iget-object v1, p1, Lt23/b4;->w:Landroid/content/Context;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, La30/w0;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lt23/g1;->j:La30/w0;

    iget-object p1, p1, Lt23/b4;->S:Lt9/u;

    iget-object p1, p1, Lt9/u;->w:Ljava/lang/Object;

    check-cast p1, Lz23/c;

    iput-object p1, p0, Lt23/g1;->k:Lz23/c;

    return-void
.end method


# virtual methods
.method public final a()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/g1;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final b(Lt23/c0;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p1, Lt23/c0;->v:Ljava/lang/String;

    iget-object p1, p1, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lt23/g1;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[maybeStartForegroundService], trigger: "

    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const-string v1, "ongoing_call"

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "streamVideo"

    iget-object v3, p0, Lt23/g1;->c:Lt23/b4;

    iget-object v4, p0, Lt23/g1;->j:La30/w0;

    if-eqz v1, :cond_2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v3, Lt23/b4;->K:Lbi/p;

    invoke-virtual {v1, p1}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object p1

    iget-boolean v1, p1, Lj43/c;->a:Z

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v0

    iget-object v1, v3, Lt23/b4;->w:Landroid/content/Context;

    new-instance v2, Lj43/g;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lj43/g;-><init>(I)V

    new-instance v3, Lj43/i;

    invoke-direct {v3, v0, p2, v5, p1}, Lj43/i;-><init>(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/lang/String;Lj43/c;)V

    invoke-virtual {v2, v1, v3}, Lj43/g;->a(Landroid/content/Context;Lj43/i;)Landroid/content/Intent;

    move-result-object p1

    invoke-static {v1, p1}, Ls4/c;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_2
    const-string v1, "outgoing_call"

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v4, La30/w0;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Lt23/b4;->K:Lbi/p;

    invoke-virtual {v2, p1}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object p1

    iget-boolean v2, p1, Lj43/c;->a:Z

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v0

    new-instance v2, Lj43/g;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lj43/g;-><init>(I)V

    new-instance v3, Lj43/i;

    invoke-direct {v3, v0, p2, v5, p1}, Lj43/i;-><init>(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/lang/String;Lj43/c;)V

    invoke-virtual {v2, v1, v3}, Lj43/g;->a(Landroid/content/Context;Lj43/i;)Landroid/content/Intent;

    move-result-object p2

    invoke-static {v1, p2}, Ls4/c;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    new-instance p2, Lng3/o;

    const/16 v0, 0x10

    invoke-direct {p2, v0}, Lng3/o;-><init>(I)V

    invoke-static {p1, v1}, Lng3/o;->m(Lj43/c;Landroid/content/Context;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final c(Lt23/c0;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lt23/g1;->c:Lt23/b4;

    iget-object v3, v2, Lt23/b4;->K:Lbi/p;

    iget-object v4, v1, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v3

    iget-boolean v3, v3, Lj43/c;->a:Z

    if-eqz v3, :cond_7

    iget-object v2, v2, Lt23/b4;->w:Landroid/content/Context;

    invoke-virtual {v0}, Lt23/g1;->a()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_0

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v4, v1, Lt23/c0;->v:Ljava/lang/String;

    const-string v8, "Building stop intent for call_id: "

    invoke-static {v8, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v3, La30/w0;

    const/16 v4, 0x8

    invoke-direct {v3, v2, v4}, La30/w0;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3}, La30/w0;->r()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v4, "[stopService]"

    invoke-interface {v2, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v2, v3, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Lg43/e;

    new-instance v4, La3/z0;

    const/16 v5, 0xf

    invoke-direct {v4, v5, v3, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    const-string v3, "getStackTrace(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-static {v3, v1}, Lm83/n;->y0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/StackTraceElement;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "#"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v1

    const-string v3, "fallback_"

    invoke-static {v1, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    const-string v3, "key"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v3, v2, Lg43/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    const-wide/16 v10, 0x0

    if-nez v5, :cond_4

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    sub-long v14, v8, v12

    iget-object v5, v2, Lg43/e;->a:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb23/k;

    move-wide/from16 v16, v10

    iget-object v10, v5, Lb23/k;->c:Lb23/e;

    iget-object v11, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v6, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    const-string v10, "[throttleFirst], timeDiff: "

    const-string v7, ", current: "

    invoke-static {v14, v15, v10, v7}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, ", lastExecutionTime: "

    const-string v0, ", key:"

    invoke-static {v7, v10, v12, v13, v0}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hashcode: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v5, v6, v11, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    cmp-long v0, v12, v16

    if-eqz v0, :cond_6

    const-wide/16 v5, 0x3e8

    cmp-long v0, v14, v5

    if-ltz v0, :cond_7

    :cond_6
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, La3/z0;->invoke()Ljava/lang/Object;

    :cond_7
    return-void
.end method

.method public final d(Lt23/c0;)V
    .locals 7

    iget-object p1, p1, Lt23/c0;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lt23/g1;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    iget-object v5, p0, Lt23/g1;->g:Lec3/h2;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/c0;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "[removeRingingCall] call.id == ringingCall.value?.id: "

    invoke-static {v6, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/c0;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v0, v4

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lt23/g1;->a:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->b0:La30/w0;

    invoke-virtual {p1}, La30/w0;->I()V

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt23/c0;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Lt23/g1;->c(Lt23/c0;)V

    :cond_3
    iget-object p1, p0, Lt23/g1;->e:Lec3/h2;

    invoke-virtual {p1, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final e(Lt23/c0;)V
    .locals 2

    iget-object p1, p1, Lt23/c0;->c:Ljava/lang/String;

    iget-object v0, p0, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt23/g1;->a:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->b0:La30/w0;

    invoke-virtual {p1}, La30/w0;->I()V

    iget-object p1, p0, Lt23/g1;->e:Lec3/h2;

    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
