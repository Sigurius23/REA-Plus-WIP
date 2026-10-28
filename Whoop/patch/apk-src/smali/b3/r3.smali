.class public final Lb3/r3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic E:Landroid/view/View;

.field public final synthetic w:Lhc3/d;

.field public final synthetic x:Lb3/d1;

.field public final synthetic y:Lp1/y1;

.field public final synthetic z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Lhc3/d;Lb3/d1;Lp1/y1;Lkotlin/jvm/internal/g0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/r3;->w:Lhc3/d;

    iput-object p2, p0, Lb3/r3;->x:Lb3/d1;

    iput-object p3, p0, Lb3/r3;->y:Lp1/y1;

    iput-object p4, p0, Lb3/r3;->z:Lkotlin/jvm/internal/g0;

    iput-object p5, p0, Lb3/r3;->E:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 10

    sget-object v0, Lb3/q3;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    packed-switch p2, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lb3/r3;->y:Lp1/y1;

    invoke-virtual {p1}, Lp1/y1;->v()V

    return-void

    :pswitch_1
    iget-object p1, p0, Lb3/r3;->y:Lp1/y1;

    iget-object p2, p1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iput-boolean v1, p1, Lp1/y1;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit p2

    throw p1

    :pswitch_2
    iget-object p1, p0, Lb3/r3;->x:Lb3/d1;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p1, Lb3/d1;->y:Ljava/lang/Object;

    check-cast p1, Leh/a;

    iget-object v2, p1, Leh/a;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_1
    iget-object v3, p1, Leh/a;->b:Ljava/lang/Object;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-boolean v4, p1, Leh/a;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v4, :cond_0

    monitor-exit v2

    goto :goto_2

    :cond_0
    :try_start_4
    iget-object v3, p1, Leh/a;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, p1, Leh/a;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    iput-object v4, p1, Leh/a;->c:Ljava/io/Serializable;

    iput-object v3, p1, Leh/a;->d:Ljava/lang/Object;

    iput-boolean v1, p1, Leh/a;->a:Z

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    move v1, p2

    :goto_0
    if-ge v1, p1, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq83/d;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v4, v5}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v2

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object p1, v0

    :try_start_5
    monitor-exit v3

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_1
    monitor-exit v2

    throw p1

    :cond_2
    :goto_2
    iget-object p1, p0, Lb3/r3;->y:Lp1/y1;

    iget-object v1, p1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_6
    iget-boolean v2, p1, Lp1/y1;->t:Z

    if-eqz v2, :cond_3

    iput-boolean p2, p1, Lp1/y1;->t:Z

    invoke-virtual {p1}, Lp1/y1;->w()Lbc3/k;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_3
    :goto_3
    monitor-exit v1

    if-eqz v0, :cond_4

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    check-cast v0, Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    :pswitch_3
    return-void

    :goto_4
    monitor-exit v1

    throw p1

    :pswitch_4
    iget-object p2, p0, Lb3/r3;->w:Lhc3/d;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, La6/f;

    iget-object v4, p0, Lb3/r3;->z:Lkotlin/jvm/internal/g0;

    iget-object v5, p0, Lb3/r3;->y:Lp1/y1;

    iget-object v8, p0, Lb3/r3;->E:Landroid/view/View;

    const/4 v9, 0x0

    move-object v7, p0

    move-object v6, p1

    invoke-direct/range {v3 .. v9}, La6/f;-><init>(Lkotlin/jvm/internal/g0;Lp1/y1;Landroidx/lifecycle/g0;Lb3/r3;Landroid/view/View;Lq83/d;)V

    invoke-static {p2, v0, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method
