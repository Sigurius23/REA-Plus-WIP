.class public final Lng3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng3/q;
.implements Ltp/a;
.implements Loa/d;
.implements Lpm/a;
.implements Lp9/i;
.implements Lr/w;
.implements Lxr/l;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lng3/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final f(Lr30/b;)Lq30/s;
    .locals 11

    sget v0, Lq30/t0;->h:I

    new-instance v0, Lq30/s;

    iget-object v9, p0, Lr30/b;->z:Lq30/q0;

    iget-object v8, p0, Lr30/b;->w:Ljava/lang/String;

    iget-object v3, p0, Lr30/b;->y:Ljava/lang/String;

    iget-object v2, p0, Lr30/b;->x:Ljava/lang/String;

    sget-object p0, Lr30/i;->y:Lr30/i;

    const/16 p0, 0x192

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    sget-object p0, Lr30/f;->x:Lng3/n;

    new-instance v1, Lr30/g;

    const-string v7, "CReq"

    const/4 v10, 0x4

    const-string v5, "Transaction timed-out."

    const-string v6, "Challenge request timed-out"

    invoke-direct/range {v1 .. v10}, Lr30/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;I)V

    invoke-direct {v0, v1}, Lq30/s;-><init>(Lr30/g;)V

    return-object v0
.end method

.method public static h(Lzr/g0;J)[B
    .locals 3

    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Llive/hms/video/factories/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "c"

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "d"

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->marshall()[B

    move-result-object p0

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p0
.end method

.method public static i(Ljava/lang/String;)Lo33/a;
    .locals 5

    invoke-static {}, Lo33/a;->values()[Lo33/a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lo33/a;->w:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    sget-object p0, Lo33/a;->y:Lo33/a;

    return-object p0

    :cond_2
    return-object v3
.end method

.method public static k(Lat/p;)Lng3/n;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance p0, Lng3/n;

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lng3/n;-><init>(I)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid curve type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Lng3/n;

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lng3/n;-><init>(I)V

    return-object p0

    :cond_2
    new-instance p0, Lng3/n;

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lng3/n;-><init>(I)V

    return-object p0
.end method

.method public static m(Lp93/k;)V
    .locals 1

    const-string v0, "functionTypeKind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp93/g;->c:Lp93/g;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lp93/d;->w:Lng3/n;

    return-void

    :cond_0
    sget-object v0, Lp93/j;->c:Lp93/j;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lp93/d;->w:Lng3/n;

    return-void

    :cond_1
    sget-object v0, Lp93/h;->c:Lp93/h;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lp93/d;->w:Lng3/n;

    return-void

    :cond_2
    sget-object v0, Lp93/i;->c:Lp93/i;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lp93/d;->w:Lng3/n;

    return-void

    :cond_3
    sget-object p0, Lp93/d;->w:Lng3/n;

    return-void
.end method

.method public static n(Ljava/lang/String;Ln30/d;)Lt30/a;
    .locals 5

    const-string v0, "directoryServerName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt30/a;->H:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lt30/a;

    iget-object v2, v2, Lt30/a;->w:Ljava/lang/String;

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lt30/a;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget-object v0, Lt30/a;->H:Lt83/b;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, La0/i1;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :goto_1
    invoke-virtual {v2}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v2}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/a;

    iget-object v0, v0, Lt30/a;->w:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Directory server name \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' is not supported. Must be one of "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_4

    check-cast p1, Ln30/c;

    invoke-virtual {p1, p0}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_4
    sget-object p0, Lt30/a;->F:Lt30/a;

    instance-of p1, v0, Ll83/m;

    if-eqz p1, :cond_5

    move-object v0, p0

    :cond_5
    check-cast v0, Lt30/a;

    return-object v0
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lxr/t;

    const-string v1, "StandardIntegrity"

    invoke-direct {v0, v1}, Lxr/t;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public b()V
    .locals 4

    sget-object v0, Lq9/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lq9/b;->b:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-boolean v2, Lq9/b;->c:Z

    if-eqz v2, :cond_0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_0

    :cond_0
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {}, Lq9/b;->a()J

    move-result-wide v2

    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    sput-wide v2, Lq9/b;->d:J

    const/4 v2, 0x1

    sput-boolean v2, Lq9/b;->c:Z

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-void

    :catchall_2
    move-exception v2

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_0
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v2

    :goto_1
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    throw v1
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()Lt9/e0;
    .locals 3

    new-instance v0, Lt9/t;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lt9/t;-><init>(J)V

    return-object v0
.end method

.method public e(J)V
    .locals 0

    return-void
.end method

.method public g(Lr/l;Z)V
    .locals 0

    return-void
.end method

.method public getTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public j(Lt9/o;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public l(Lng3/k;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lng3/n;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lng3/a;->z:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->a(Lng3/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lng3/a;->f0:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->a(Lng3/m;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Lng3/k;->f(Lng3/m;)I

    move-result p1

    invoke-static {p1}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    invoke-interface {p1, p0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lng3/r;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public s(Lr/l;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
