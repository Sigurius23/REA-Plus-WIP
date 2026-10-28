.class public final synthetic Lcom/mapbox/common/module/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/mapbox/common/module/c;->w:I

    iput-object p1, p0, Lcom/mapbox/common/module/c;->x:Ljava/lang/Object;

    iput-wide p2, p0, Lcom/mapbox/common/module/c;->y:J

    iput-object p4, p0, Lcom/mapbox/common/module/c;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 0

    .line 2
    iput p5, p0, Lcom/mapbox/common/module/c;->w:I

    iput-object p1, p0, Lcom/mapbox/common/module/c;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcom/mapbox/common/module/c;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lcom/mapbox/common/module/c;->y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Lcom/mapbox/common/module/c;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/16 v4, 0x1a

    iget-wide v5, p0, Lcom/mapbox/common/module/c;->y:J

    iget-object v7, p0, Lcom/mapbox/common/module/c;->z:Ljava/lang/Object;

    iget-object v8, p0, Lcom/mapbox/common/module/c;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v8, Lxl/a;

    iget-object v0, v8, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v1, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v1}, Lc9/h;->k()Lc9/a;

    move-result-object v6

    new-instance v5, Lc9/e;

    const/4 v10, 0x0

    iget-object v7, p0, Lcom/mapbox/common/module/c;->z:Ljava/lang/Object;

    iget-wide v8, p0, Lcom/mapbox/common/module/c;->y:J

    invoke-direct/range {v5 .. v10}, Lc9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    invoke-virtual {v1, v6, v4, v5}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    iget-object v1, v0, Lb9/f0;->r0:Ljava/lang/Object;

    if-ne v1, v7, :cond_0

    iget-object v0, v0, Lb9/f0;->N:Lx8/i;

    new-instance v1, Lab/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lab/a;-><init>(I)V

    invoke-virtual {v0, v4, v1}, Lx8/i;->e(ILx8/f;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v8, Ld1/j;

    iget-object v0, v8, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v1, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v1}, Lsm/d;->y()Lsm/a;

    move-result-object v6

    new-instance v5, Lc9/e;

    const/4 v10, 0x1

    iget-object v7, p0, Lcom/mapbox/common/module/c;->z:Ljava/lang/Object;

    iget-wide v8, p0, Lcom/mapbox/common/module/c;->y:J

    invoke-direct/range {v5 .. v10}, Lc9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    invoke-virtual {v1, v6, v4, v5}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    iget-object v1, v0, Lrm/u;->r0:Ljava/lang/Object;

    if-ne v1, v7, :cond_1

    iget-object v0, v0, Lrm/u;->M:Ld9/p;

    new-instance v1, Lqa/b;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lqa/b;-><init>(I)V

    invoke-virtual {v0, v4, v1}, Ld9/p;->i(ILlo/h;)V

    :cond_1
    return-void

    :pswitch_1
    check-cast v8, Lio/sentry/android/replay/capture/f;

    check-cast v7, Lc4/q;

    iget-object v0, v8, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    if-eqz v0, :cond_2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v0, v4}, Lc4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v0, v8, Lio/sentry/android/replay/capture/f;->t:Lio/sentry/transport/f;

    invoke-interface {v0}, Lio/sentry/transport/f;->c()J

    move-result-wide v4

    iget-object v0, v8, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-wide v6, v0, Lio/sentry/u6;->i:J

    sub-long/2addr v4, v6

    iget-object v0, v8, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v4, v5}, Lio/sentry/android/replay/k;->m(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v3

    :goto_0
    iget-object v6, v8, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/b;

    sget-object v7, Lio/sentry/android/replay/capture/c;->q:[Lj93/z;

    aget-object v2, v7, v2

    invoke-virtual {v6, v8, v2, v0}, Lio/sentry/android/replay/capture/b;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    iget-object v0, v8, Lio/sentry/android/replay/capture/f;->v:Ljava/util/ArrayList;

    new-instance v9, Lkotlin/jvm/internal/b0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    move-object v6, v8

    move-wide v7, v4

    new-instance v5, Lio/sentry/android/replay/j;

    const/4 v10, 0x1

    invoke-direct/range {v5 .. v10}, Lio/sentry/android/replay/j;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    invoke-static {v0, v5}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iget-boolean v2, v9, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v4, v1, 0x1

    if-ltz v1, :cond_6

    check-cast v2, Lio/sentry/android/replay/capture/i;

    iget-object v5, v2, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/s6;

    iput v1, v5, Lio/sentry/s6;->T:I

    iget-object v2, v2, Lio/sentry/android/replay/capture/i;->b:Lio/sentry/x3;

    iget-object v2, v2, Lio/sentry/x3;->x:Ljava/util/List;

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/rrweb/b;

    instance-of v6, v5, Lio/sentry/rrweb/m;

    if-eqz v6, :cond_4

    check-cast v5, Lio/sentry/rrweb/m;

    iput v1, v5, Lio/sentry/rrweb/m;->z:I

    goto :goto_2

    :cond_5
    move v1, v4

    goto :goto_1

    :cond_6
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_7
    return-void

    :pswitch_2
    check-cast v8, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    check-cast v7, Landroid/content/res/Configuration;

    iget-object v0, v8, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->x:Lio/sentry/i4;

    if-eqz v0, :cond_b

    iget-object v0, v8, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->w:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    if-eq v0, v2, :cond_8

    goto :goto_3

    :cond_8
    sget-object v3, Lio/sentry/protocol/e;->LANDSCAPE:Lio/sentry/protocol/e;

    goto :goto_3

    :cond_9
    sget-object v3, Lio/sentry/protocol/e;->PORTRAIT:Lio/sentry/protocol/e;

    :goto_3
    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_a
    const-string v0, "undefined"

    :goto_4
    new-instance v1, Lio/sentry/e;

    invoke-direct {v1, v5, v6}, Lio/sentry/e;-><init>(J)V

    const-string v2, "navigation"

    iput-object v2, v1, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v2, "device.orientation"

    iput-object v2, v1, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v2, "position"

    invoke-virtual {v1, v0, v2}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    iput-object v0, v1, Lio/sentry/e;->I:Lio/sentry/n5;

    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    const-string v2, "android:configuration"

    invoke-virtual {v0, v7, v2}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v8, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->x:Lio/sentry/i4;

    invoke-virtual {v2, v1, v0}, Lio/sentry/i4;->i(Lio/sentry/e;Lio/sentry/g0;)V

    :cond_b
    return-void

    :pswitch_3
    check-cast v8, Lew/f;

    check-cast v7, Ljava/lang/Exception;

    const-string v0, "this$0"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$exception"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v8, Lew/f;->E:Ldw/f;

    invoke-interface {v0, v5, v6, v1, v7}, Ldw/f;->a(JILjava/lang/Exception;)V

    return-void

    :pswitch_4
    check-cast v8, Lcom/mapbox/common/http_backend/RequestObserver;

    check-cast v7, Ljava/lang/Exception;

    invoke-static {v8, v5, v6, v7}, Lcom/mapbox/common/module/MapboxHttpClient;->c(Lcom/mapbox/common/http_backend/RequestObserver;JLjava/lang/Exception;)V

    return-void

    :pswitch_5
    check-cast v8, Lcom/mapbox/common/http_backend/RequestObserver;

    check-cast v7, Lcom/mapbox/common/HttpRequestError;

    invoke-static {v8, v5, v6, v7}, Lcom/mapbox/common/module/MapboxHttpClient;->e(Lcom/mapbox/common/http_backend/RequestObserver;JLcom/mapbox/common/HttpRequestError;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
