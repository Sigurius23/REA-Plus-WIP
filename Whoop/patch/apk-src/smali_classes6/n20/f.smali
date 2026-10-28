.class public final synthetic Ln20/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ln20/i;


# direct methods
.method public synthetic constructor <init>(Ln20/i;I)V
    .locals 0

    iput p2, p0, Ln20/f;->w:I

    iput-object p1, p0, Ln20/f;->x:Ln20/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ln20/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln20/f;->x:Ln20/i;

    check-cast p1, Ln20/h;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    invoke-virtual {v0, p1, v1}, Ln20/i;->g(Ln20/h;Lq20/y;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ln20/f;->x:Ln20/i;

    check-cast p1, Ln20/h;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    invoke-virtual {v0, p1, v1}, Ln20/i;->g(Ln20/h;Lq20/y;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Ln20/f;->x:Ln20/i;

    check-cast p1, Ln20/h;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    invoke-virtual {v0, p1, v1}, Ln20/i;->g(Ln20/h;Lq20/y;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Ln20/f;->x:Ln20/i;

    check-cast p1, Ln20/h;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Ln20/i;->l:Lxz/f0;

    iget-object v1, v1, Lxz/f0;->b:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/d;

    iget-object v1, v1, Lwz/d;->w:Ld00/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Ld00/l;->L:Ld00/f;

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_1
    sget-object v3, Ld00/d;->a:Ld00/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Ln20/u;->x:Landroidx/lifecycle/k1;

    invoke-virtual {v1}, Ln20/u;->g()Ln20/h;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v4, 0x3

    invoke-static {v1, v2, v4}, Ln20/h;->b(Ln20/h;La30/f1;I)Ln20/h;

    move-result-object v2

    :cond_1
    const-string v1, "state"

    invoke-virtual {v3, v2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    instance-of v3, v1, Lq20/m;

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    check-cast v1, Lq20/m;

    iget-object v1, v1, Lq20/m;->y:Lwz/u0;

    if-eqz v1, :cond_3

    move v1, v4

    goto :goto_2

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lug/m;->G(Lq20/y;)Z

    move-result v1

    :goto_2
    if-nez v1, :cond_5

    move v2, v4

    :cond_5
    if-eqz v2, :cond_6

    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    invoke-virtual {v0, p1, v1}, Ln20/i;->g(Ln20/h;Lq20/y;)V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ln20/f;->x:Ln20/i;

    check-cast p1, Ln20/h;

    const-string v1, "state"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Ln20/h;->w:La30/f1;

    iget-object v1, v1, La30/f1;->E:Lv00/c0;

    iget-object v1, v1, Lv00/c0;->l0:La30/l0;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    iget-object v1, v1, La30/l0;->w:Lwz/g0;

    move-object v6, v1

    goto :goto_3

    :cond_7
    move-object v6, v2

    :goto_3
    iget-object v1, v0, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    iget-object v3, v0, Ln20/i;->l:Lxz/f0;

    iget-object v3, v3, Lxz/f0;->b:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lwz/d;

    if-eqz v6, :cond_a

    iget-object v3, v0, Ln20/i;->h:Ln20/u;

    invoke-virtual {v3}, Ln20/u;->g()Ln20/h;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-boolean v3, v3, Ln20/h;->y:Z

    const/4 v4, 0x1

    if-ne v3, v4, :cond_8

    goto :goto_4

    :cond_8
    instance-of v3, v1, Lq20/m;

    if-eqz v3, :cond_a

    iget-object v3, v5, Lwz/d;->w:Ld00/l;

    if-eqz v3, :cond_a

    iget-object v3, v0, Ln20/i;->j:Lu00/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lb00/a;

    invoke-direct {v3, v6}, Lb00/a;-><init>(Lwz/g0;)V

    invoke-virtual {v3}, Lb00/a;->b()Z

    move-result v4

    if-eqz v4, :cond_a

    iget-boolean v3, v3, Lb00/a;->d:Z

    if-nez v3, :cond_a

    iget-object p1, p1, Ln20/h;->w:La30/f1;

    iget-object v4, p1, La30/f1;->E:Lv00/c0;

    iget-object v3, v0, Ln20/i;->m:Lwz/r0;

    sget-object v7, Lwz/h0;->x:Lwz/h0;

    new-instance v8, Lwz/m0;

    check-cast v1, Lq20/m;

    iget-object p1, v1, Lq20/m;->y:Lwz/u0;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lwz/u0;->h()Ly00/c0;

    move-result-object v2

    :cond_9
    invoke-direct {v8, v2}, Lwz/m0;-><init>(Ly00/c0;)V

    invoke-virtual/range {v3 .. v8}, Lwz/r0;->b(Lv00/c0;Lwz/d;Lwz/g0;Lwz/h0;Lwz/n0;)V

    goto :goto_5

    :cond_a
    :goto_4
    invoke-virtual {v0, p1, v1}, Ln20/i;->g(Ln20/h;Lq20/y;)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
