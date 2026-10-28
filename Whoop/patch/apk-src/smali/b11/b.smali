.class public final synthetic Lb11/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lb11/b;->w:I

    iput-object p1, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lb11/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lz1/j;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz1/f;

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz1/l;->d:Lz1/j;

    invoke-virtual {p1}, Lz1/f;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lz1/j;->g(J)Lz1/j;

    move-result-object v1

    sput-object v1, Lz1/l;->d:Lz1/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_0
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lym1/c;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lx71/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lv71/h;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lv71/f;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1, v0}, Lv71/f;->b(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lv61/a;

    invoke-static {v0, p1}, Lv61/f;->c(Lkotlin/jvm/functions/Function1;Lv61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lp31/d;

    invoke-static {v0, p1}, Lp31/n;->f(Lkotlin/jvm/functions/Function1;Lp31/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lp31/n;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lm91/q;

    invoke-static {v0, p1}, Lm91/m;->d(Lkotlin/jvm/functions/Function1;Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lb3/l2;

    const-string v1, "offset"

    invoke-virtual {p1, v1}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lk71/z;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ld61/a;

    invoke-static {v0, p1}, Lk71/z;->i(Lkotlin/jvm/functions/Function1;Ld61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lk71/e;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lb11/j$a;

    invoke-static {v0, p1}, Ljk2/e;->e(Lkotlin/jvm/functions/Function1;Lb11/j$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lht2/e;->w(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lht2/e;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lh01/h;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lg1/b2;

    new-instance v1, Lg1/a2;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v0, v2}, Lg1/n7;-><init>(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;I)V

    return-object v1

    :pswitch_12
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lc41/n;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lc41/j;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lb11/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lb11/g;->g(Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
