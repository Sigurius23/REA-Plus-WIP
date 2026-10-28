.class public final synthetic Lv41/b0;
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

    iput p2, p0, Lv41/b0;->w:I

    iput-object p1, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lv41/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lwo1/i;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lwo1/e;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lw71/h0;->b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw71/s;->e(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw71/p;->b(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw71/m;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw71/l;->o(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw71/l;->C(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lw71/l;->f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lw71/l;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lw71/l;->p(JLkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw71/l;->m(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw51/e;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw20/v;

    invoke-direct {v0, p1}, Lw20/v;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lw01/g;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Lvw1/a;->f(Lkotlin/jvm/functions/Function1;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvv2/e;->p(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvv2/e;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvs2/e;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvs2/e;->u(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvo1/r;->H(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvo1/r;->t(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/util/List;

    invoke-static {p1, v0}, Lvo1/g;->r(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvo1/d;->t(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lvl0/d;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    invoke-static {v0, p1}, Lvi0/a;->b(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lkd0/a;

    invoke-static {v0, p1}, Lve0/e;->j(Lkotlin/jvm/functions/Function1;Lkd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lv80/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lv41/b0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lv41/d0;->k(Lkotlin/jvm/functions/Function1;F)Ll83/a0;

    move-result-object p1

    return-object p1

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
