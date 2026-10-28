.class public final synthetic Lp3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lp3/b0;->w:I

    iput-object p2, p0, Lp3/b0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lp3/b0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lp3/b0;->w:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lyt0/f;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lzt0/b;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lyt0/f;->l(Lyt0/f;Lzt0/b;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lx71/d;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1}, Lx71/b;->d(Lx71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lad3/c;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/google/gson/Gson;

    check-cast p1, Lb63/b;

    invoke-static {v0, v1, p1}, Lx02/b;->c(Lad3/c;Lcom/google/gson/Gson;Lb63/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lq2/a;

    check-cast p1, Lg1/b2;

    invoke-static {v0, v1, p1}, Lvn1/s;->b(Lc93/a;Lq2/a;Lg1/b2;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Ldc1/c;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ldc1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lv71/i;

    invoke-static {v0, v1, p1}, Lv71/f;->a(Lkotlin/jvm/functions/Function1;Lv71/i;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/room/l1;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Ltr2/g;->i(Ljava/lang/String;Landroidx/room/l1;Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Ltr2/g;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Ltr2/h;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Ltr2/g;->k(Ltr2/g;Ltr2/h;Ltb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lad3/c;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Ljb1/a;

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    invoke-static {v0, v1, p1}, Lto1/l;->e(Lad3/c;Ljb1/a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;)Lso1/e;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lhs1/b;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Ltm1/b;->b(Lhs1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Ltd1/d;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lkk0/a;

    check-cast p1, Ljava/lang/Byte;

    invoke-static {v0, v1, p1}, Ltd1/d;->M(Ltd1/d;Lkk0/a;Ljava/lang/Byte;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    check-cast p1, Lio/sentry/b1;

    invoke-static {v0, v1, p1}, Lrr2/o;->t(Ljava/lang/String;Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lqc/w;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lqc/v;

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lqc/w;->b:Lqc/b;

    invoke-virtual {v0, p1, v1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    const-string v0, "UPDATE workspec SET output=? WHERE id=?"

    iget-object v3, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v3, Lic/g;

    iget-object v4, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    check-cast p1, Ltb/a;

    const-string v5, "_connection"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_0
    sget-object v0, Lic/g;->b:Lic/g;

    invoke-static {v3}, Lpf/c;->X(Lic/g;)[B

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->q(I[B)V

    invoke-interface {p1, v1, v4}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p1}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_d
    const-string v0, "UPDATE workspec SET state=? WHERE id=?"

    iget-object v3, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v3, Lic/m0;

    iget-object v4, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    check-cast p1, Ltb/a;

    const-string v5, "_connection"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_1
    invoke-static {v3}, Lj93/l0;->b0(Lic/m0;)I

    move-result v3

    int-to-long v5, v3

    invoke-interface {v0, v2, v5, v6}, Ltb/c;->p(IJ)V

    invoke-interface {v0, v1, v4}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception p1

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p1

    :pswitch_e
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lqc/l;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lqc/k;

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lqc/l;->b:Lqc/b;

    invoke-virtual {v0, p1, v1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lqc/i;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lqc/h;

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lqc/i;->b:Lqc/b;

    invoke-virtual {v0, p1, v1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lqc/e;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lqc/d;

    check-cast p1, Ltb/a;

    const-string v2, "_connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lqc/e;->b:Lqc/b;

    invoke-virtual {v0, p1, v1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lp31/l;

    check-cast p1, Lp31/j;

    invoke-static {v0, v1, p1}, Lp31/k;->a(Lkotlin/jvm/functions/Function1;Lp31/l;Lp31/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lp3/b0;->x:Ljava/lang/Object;

    check-cast v0, Lp0/n0;

    iget-object v1, p0, Lp3/b0;->y:Ljava/lang/Object;

    check-cast v1, Lp3/a0;

    check-cast p1, Lp3/e0;

    iget-object v2, v0, Lp0/n0;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    monitor-enter v2

    :try_start_2
    invoke-interface {p1}, Lp3/e0;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v0, v0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, La0/a0;

    invoke-virtual {v0, v1, p1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp3/e0;

    goto :goto_0

    :catchall_2
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, v0, Lp0/n0;->y:Ljava/lang/Object;

    check-cast p1, La0/a0;

    invoke-virtual {p1, v1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp3/e0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_0
    monitor-exit v2

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_1
    monitor-exit v2

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
