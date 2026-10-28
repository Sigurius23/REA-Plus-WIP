.class public final synthetic Lc41/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lc41/j0;->w:I

    iput-object p1, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc41/j0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lyi0/d;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lwr0/g;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lw71/l;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lw01/g;->k(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lv01/l;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lqn0/k;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lqn0/f;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lqn0/f;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lqn0/e;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lnr0/f;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Ln31/b;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lln1/c;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Ll01/m;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Ljs1/l;->j(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lf02/b;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Ldl1/d;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lc41/j0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc41/j0;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lc41/l0;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
