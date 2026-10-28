.class public final synthetic Lzc1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lzc1/n0;->w:I

    iput-object p2, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzc1/n0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {p1, v0}, Lzc1/o5;->g(ILp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/o5;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/m5;->l(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/k5;->d(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {p1, v0}, Lzc1/k5;->a(ILp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {p1, v0}, Lzc1/k5;->b(ILp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/x4;->d(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u4;->f(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u4;->e(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u4;->g(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u4;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u4;->d(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u4;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/u3;->d(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/t3;->d(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/t3;->c(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/p3;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/d3;->a(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/d3;->c(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/z1;->r(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/z1;->c(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/z1;->e(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/z1;->n(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/z1;->p(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/x0;->a(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/o0;->l(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/o0;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/o0;->j(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/o0;->q(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lzc1/n0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lzc1/o0;->m(Lp1/c1;Z)Ll83/a0;

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
