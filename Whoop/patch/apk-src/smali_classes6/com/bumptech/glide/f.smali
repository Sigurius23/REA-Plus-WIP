.class public final Lcom/bumptech/glide/f;
.super Lpl/a;
.source "SourceFile"


# instance fields
.field public final T:Landroid/content/Context;

.field public final U:Lcom/bumptech/glide/h;

.field public final V:Ljava/lang/Class;

.field public final W:Lcom/bumptech/glide/c;

.field public X:Lcom/bumptech/glide/i;

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/util/ArrayList;

.field public a0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpl/d;

    invoke-direct {v0}, Lpl/a;-><init>()V

    sget-object v1, Lzk/k;->d:Lzk/k;

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    invoke-virtual {v0}, Lpl/a;->l()Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpl/a;->r(Z)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Lpl/a;-><init>()V

    iput-object p2, p0, Lcom/bumptech/glide/f;->U:Lcom/bumptech/glide/h;

    iput-object p3, p0, Lcom/bumptech/glide/f;->V:Ljava/lang/Class;

    iput-object p4, p0, Lcom/bumptech/glide/f;->T:Landroid/content/Context;

    iget-object p4, p2, Lcom/bumptech/glide/h;->w:Lcom/bumptech/glide/b;

    iget-object p4, p4, Lcom/bumptech/glide/b;->z:Lcom/bumptech/glide/c;

    iget-object p4, p4, Lcom/bumptech/glide/c;->f:La0/g;

    invoke-virtual {p4, p3}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/i;

    if-nez v0, :cond_1

    invoke-virtual {p4}, La0/g;->entrySet()Ljava/util/Set;

    move-result-object p4

    check-cast p4, La0/a;

    invoke-virtual {p4}, La0/a;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/i;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lcom/bumptech/glide/c;->j:Lcom/bumptech/glide/a;

    :cond_2
    iput-object v0, p0, Lcom/bumptech/glide/f;->X:Lcom/bumptech/glide/i;

    iget-object p1, p1, Lcom/bumptech/glide/b;->z:Lcom/bumptech/glide/c;

    iput-object p1, p0, Lcom/bumptech/glide/f;->W:Lcom/bumptech/glide/c;

    iget-object p1, p2, Lcom/bumptech/glide/h;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lpl/c;

    if-eqz p3, :cond_3

    iget-object p4, p0, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    if-nez p4, :cond_4

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    iput-object p4, p0, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    :cond_4
    iget-object p4, p0, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    monitor-enter p2

    :try_start_0
    iget-object p1, p2, Lcom/bumptech/glide/h;->K:Lpl/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final A(Lql/i;Lpl/a;Ljava/util/concurrent/Executor;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v8, p2

    invoke-static/range {p1 .. p1}, Lpf/c;->o(Ljava/lang/Object;)V

    iget-boolean v0, v1, Lcom/bumptech/glide/f;->a0:Z

    if-eqz v0, :cond_b

    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object v0, v1, Lcom/bumptech/glide/f;->X:Lcom/bumptech/glide/i;

    iget-object v11, v8, Lpl/a;->y:Lcom/bumptech/glide/d;

    iget v9, v8, Lpl/a;->I:I

    iget v10, v8, Lpl/a;->H:I

    iget-object v3, v1, Lcom/bumptech/glide/f;->T:Landroid/content/Context;

    iget-object v4, v1, Lcom/bumptech/glide/f;->W:Lcom/bumptech/glide/c;

    iget-object v6, v1, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    iget-object v7, v1, Lcom/bumptech/glide/f;->V:Ljava/lang/Class;

    iget-object v13, v1, Lcom/bumptech/glide/f;->Z:Ljava/util/ArrayList;

    iget-object v14, v4, Lcom/bumptech/glide/c;->g:Lzk/l;

    iget-object v15, v0, Lcom/bumptech/glide/i;->w:Lrl/d;

    new-instance v2, Lpl/e;

    move-object/from16 v12, p1

    move-object/from16 v16, p3

    invoke-direct/range {v2 .. v16}, Lpl/e;-><init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lpl/a;IILcom/bumptech/glide/d;Lql/i;Ljava/util/ArrayList;Lzk/l;Lrl/d;Ljava/util/concurrent/Executor;)V

    invoke-interface/range {p1 .. p1}, Lql/i;->d()Lpl/b;

    move-result-object v0

    instance-of v3, v0, Lpl/e;

    if-nez v3, :cond_1

    move-object/from16 v17, v0

    move-object/from16 v16, v2

    :cond_0
    const/4 v4, 0x0

    goto/16 :goto_3

    :cond_1
    iget-object v3, v2, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget v5, v2, Lpl/e;->i:I

    iget v6, v2, Lpl/e;->j:I

    iget-object v7, v2, Lpl/e;->f:Ljava/lang/Object;

    iget-object v9, v2, Lpl/e;->g:Ljava/lang/Class;

    iget-object v10, v2, Lpl/e;->h:Lpl/a;

    iget-object v11, v2, Lpl/e;->k:Lcom/bumptech/glide/d;

    iget-object v13, v2, Lpl/e;->m:Ljava/util/List;

    if-eqz v13, :cond_2

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    const/4 v13, 0x0

    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v0

    check-cast v3, Lpl/e;

    iget-object v14, v3, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v14

    :try_start_1
    iget v15, v3, Lpl/e;->i:I

    iget v4, v3, Lpl/e;->j:I

    move-object/from16 v16, v2

    iget-object v2, v3, Lpl/e;->f:Ljava/lang/Object;

    iget-object v12, v3, Lpl/e;->g:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    iget-object v1, v3, Lpl/e;->h:Lpl/a;

    move-object/from16 v17, v0

    iget-object v0, v3, Lpl/e;->k:Lcom/bumptech/glide/d;

    iget-object v3, v3, Lpl/e;->m:Ljava/util/List;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_6

    :cond_3
    const/4 v3, 0x0

    :goto_1
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v5, v15, :cond_0

    if-ne v6, v4, :cond_0

    sget-object v4, Ltl/l;->a:[C

    const/4 v4, 0x1

    if-nez v7, :cond_5

    if-nez v2, :cond_4

    move v2, v4

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    :cond_5
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_0

    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v10, v1}, Lpl/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-ne v11, v0, :cond_0

    if-ne v13, v3, :cond_0

    :goto_3
    if-eqz v4, :cond_6

    iget-boolean v0, v8, Lpl/a;->G:Z

    if-nez v0, :cond_7

    move-object/from16 v0, v17

    check-cast v0, Lpl/e;

    invoke-virtual {v0}, Lpl/e;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move-object/from16 v1, p0

    goto :goto_4

    :cond_7
    const-string v0, "Argument must not be null"

    move-object/from16 v1, v17

    invoke-static {v1, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Lpl/e;

    invoke-virtual {v0}, Lpl/e;->f()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lpl/e;->a()V

    :cond_8
    return-void

    :goto_4
    iget-object v0, v1, Lcom/bumptech/glide/f;->U:Lcom/bumptech/glide/h;

    move-object/from16 v12, p1

    invoke-virtual {v0, v12}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    move-object/from16 v2, v16

    invoke-interface {v12, v2}, Lql/i;->f(Lpl/b;)V

    iget-object v3, v1, Lcom/bumptech/glide/f;->U:Lcom/bumptech/glide/h;

    monitor-enter v3

    :try_start_3
    iget-object v0, v3, Lcom/bumptech/glide/h;->F:Lml/j;

    iget-object v0, v0, Lml/j;->w:Ljava/util/Set;

    invoke-interface {v0, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, v3, Lcom/bumptech/glide/h;->z:Lf1/p1;

    const-string v4, "RequestTracker"

    iget-object v5, v0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean v5, v0, Lf1/p1;->x:Z

    if-nez v5, :cond_9

    invoke-virtual {v2}, Lpl/e;->a()V

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Lpl/e;->c()V

    const/4 v5, 0x2

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "Paused, delaying request"

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    iget-object v0, v0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_5
    monitor-exit v3

    return-void

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :catchall_3
    move-exception v0

    :goto_6
    :try_start_5
    monitor-exit v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v0

    :goto_7
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "You must call #load() before calling #into()"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final bridge synthetic a(Lpl/a;)Lpl/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b()Lpl/a;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    move-result-object v0

    return-object v0
.end method

.method public final w(Lpl/a;)Lcom/bumptech/glide/f;
    .locals 0

    invoke-static {p1}, Lpf/c;->o(Ljava/lang/Object;)V

    invoke-super {p0, p1}, Lpl/a;->a(Lpl/a;)Lpl/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/f;

    return-object p1
.end method

.method public final x()Lcom/bumptech/glide/f;
    .locals 2

    invoke-super {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/f;

    iget-object v1, v0, Lcom/bumptech/glide/f;->X:Lcom/bumptech/glide/i;

    invoke-virtual {v1}, Lcom/bumptech/glide/i;->a()Lcom/bumptech/glide/i;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/f;->X:Lcom/bumptech/glide/i;

    return-object v0
.end method

.method public final y(Landroid/widget/ImageView;)Lql/k;
    .locals 4

    sget-object v0, Ltl/l;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {p1}, Lpf/c;->o(Ljava/lang/Object;)V

    const/16 v0, 0x800

    iget v1, p0, Lpl/a;->w:I

    invoke-static {v1, v0}, Lpl/a;->g(II)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lpl/a;->L:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bumptech/glide/e;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v2, Lgl/k;->c:Lgl/k;

    new-instance v3, Lgl/g;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3, v1}, Lpl/a;->n(Lgl/k;Lgl/d;Z)Lpl/a;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v2, Lgl/k;->b:Lgl/k;

    new-instance v3, Lgl/r;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3, v1}, Lpl/a;->n(Lgl/k;Lgl/d;Z)Lpl/a;

    move-result-object v0

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v2, Lgl/k;->c:Lgl/k;

    new-instance v3, Lgl/g;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3, v1}, Lpl/a;->n(Lgl/k;Lgl/d;Z)Lpl/a;

    move-result-object v0

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0}, Lcom/bumptech/glide/f;->x()Lcom/bumptech/glide/f;

    move-result-object v0

    sget-object v2, Lgl/k;->d:Lgl/k;

    new-instance v3, Lgl/f;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2, v3}, Lpl/a;->h(Lgl/k;Lgl/d;)Lpl/a;

    move-result-object v0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v0, p0

    :goto_1
    iget-object v2, p0, Lcom/bumptech/glide/f;->W:Lcom/bumptech/glide/c;

    iget-object v2, v2, Lcom/bumptech/glide/c;->c:Ljc/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v2, Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/bumptech/glide/f;->V:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lql/b;

    invoke-direct {v2, p1, v1}, Lql/b;-><init>(Landroid/widget/ImageView;I)V

    goto :goto_2

    :cond_1
    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v2, Lql/b;

    const/4 v1, 0x1

    invoke-direct {v2, p1, v1}, Lql/b;-><init>(Landroid/widget/ImageView;I)V

    :goto_2
    sget-object p1, Ltl/f;->a:Lc5/l;

    invoke-virtual {p0, v2, v0, p1}, Lcom/bumptech/glide/f;->A(Lql/i;Lpl/a;Ljava/util/concurrent/Executor;)V

    return-object v2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unhandled class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", try .as*(Class).transcode(ResourceTranscoder)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must call this method on the main thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Lql/i;)V
    .locals 1

    sget-object v0, Ltl/f;->a:Lc5/l;

    invoke-virtual {p0, p1, p0, v0}, Lcom/bumptech/glide/f;->A(Lql/i;Lpl/a;Ljava/util/concurrent/Executor;)V

    return-void
.end method
