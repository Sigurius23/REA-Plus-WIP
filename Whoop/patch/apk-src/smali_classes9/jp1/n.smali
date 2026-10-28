.class public final synthetic Ljp1/n;
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

    iput p2, p0, Ljp1/n;->w:I

    iput-object p1, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljp1/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Ll80/n;->p(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Ll80/n;->B(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Ll80/n;->z(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Double;

    invoke-static {p1, v0}, Ll72/i;->m(Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Double;

    invoke-static {p1, v0}, Ll72/i;->k(Ljava/lang/Double;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lb3/l2;

    const-string v0, "absoluteOffset"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object p1

    const-string v0, "offset"

    iget-object v1, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v1, v0}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lkw1/t;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lkw1/t;->d(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Llw1/i;

    invoke-static {v0, p1}, Lkw1/j;->a(Lkotlin/jvm/functions/Function1;Llw1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Llw1/i;

    invoke-static {v0, p1}, Lkw1/j;->g(Lkotlin/jvm/functions/Function1;Llw1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/payments/domain/models/Card;

    invoke-static {v0, p1}, Lkw1/d;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lkl2/k;->l(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lkk1/g;->t(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    invoke-static {v0, p1}, Lkf0/h;->g(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lke2/c;->b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lke2/c;->i(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lk71/b;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lk71/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lk51/b;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lk51/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Ljt1/c;->b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Ljt1/c;->c(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljr1/f;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljr1/f;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljr1/f;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljr1/e;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljr1/d;->i(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljr1/d;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljp1/o;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Ljp1/n;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ljp1/o;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
