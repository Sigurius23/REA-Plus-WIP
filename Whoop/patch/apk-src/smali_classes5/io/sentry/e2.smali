.class public final Lio/sentry/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    return-void

    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/graphics/Path;)V
    .locals 6

    iget-object v0, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsi/t;

    sget-object v3, Ldj/i;->a:Landroid/graphics/Matrix;

    if-eqz v2, :cond_1

    iget-boolean v3, v2, Lsi/t;->a:Z

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v2, Lsi/t;->d:Lti/h;

    invoke-virtual {v3}, Lti/h;->l()F

    move-result v3

    iget-object v4, v2, Lsi/t;->e:Lti/h;

    invoke-virtual {v4}, Lti/h;->l()F

    move-result v4

    iget-object v2, v2, Lsi/t;->f:Lti/h;

    invoke-virtual {v2}, Lti/h;->l()F

    move-result v2

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v3, v5

    div-float/2addr v4, v5

    const/high16 v5, 0x43b40000    # 360.0f

    div-float/2addr v2, v5

    invoke-static {p1, v3, v4, v2}, Ldj/i;->a(Landroid/graphics/Path;FFF)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public declared-synchronized b(Ljava/lang/Class;)Lwk/k;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lol/e;

    iget-object v3, v2, Lol/e;->a:Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, v2, Lol/e;->b:Lwk/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c()Lio/sentry/z1;
    .locals 2

    iget-object v0, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/z1;

    return-object v0
.end method

.method public d()Z
    .locals 3

    iget-object v0, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    invoke-virtual {p0}, Lio/sentry/e2;->f()V

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/c2;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v1

    check-cast v1, Lio/sentry/c2;

    invoke-virtual {p0}, Lio/sentry/e2;->f()V

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v2

    check-cast v2, Lio/sentry/b2;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    iget-object v2, v2, Lio/sentry/b2;->a:Ljava/util/HashMap;

    iget-object v1, v1, Lio/sentry/c2;->a:Ljava/lang/String;

    invoke-interface {v0}, Lio/sentry/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/a2;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v1

    check-cast v1, Lio/sentry/a2;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v1, v1, Lio/sentry/a2;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Lio/sentry/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lio/sentry/y1;)Z
    .locals 2

    invoke-interface {p1}, Lio/sentry/y1;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lio/sentry/d2;

    invoke-direct {v0, p1}, Lio/sentry/d2;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/c2;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    check-cast v0, Lio/sentry/c2;

    invoke-virtual {p0}, Lio/sentry/e2;->f()V

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v1

    check-cast v1, Lio/sentry/b2;

    iget-object v1, v1, Lio/sentry/b2;->a:Ljava/util/HashMap;

    iget-object v0, v0, Lio/sentry/c2;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/a2;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/sentry/e2;->c()Lio/sentry/z1;

    move-result-object v0

    check-cast v0, Lio/sentry/a2;

    iget-object v0, v0, Lio/sentry/a2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method
