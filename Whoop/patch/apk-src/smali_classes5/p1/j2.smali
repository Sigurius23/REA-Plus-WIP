.class public final synthetic Lp1/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/g1;


# direct methods
.method public synthetic constructor <init>(Lp1/g1;I)V
    .locals 0

    iput p2, p0, Lp1/j2;->w:I

    iput-object p1, p0, Lp1/j2;->x:Lp1/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp1/j2;->w:I

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/w6;->h(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/w6;->f(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->p(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->i(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->c(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->u(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->l(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->n(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->m(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/d6;->t(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/o4;->a(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/o4;->b(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-static {v0, p1}, Lzc1/o4;->c(Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lp1/j2;->x:Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
