.class public final synthetic Lpj2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lpj2/g;->w:I

    iput-object p1, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpj2/g;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lpj2/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/g;->y:Lp1/c1;

    iput-object p2, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lpj2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lyb0/k;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lyb0/k;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lvp1/h;->O(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lvo1/d;->p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lux0/b;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lun1/g;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lry2/b;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lrx0/g;->f(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lrm1/h;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lpj2/g;->y:Lp1/c1;

    iget-object v1, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lpp1/i;->n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lpj2/i;->l(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lpj2/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpj2/g;->y:Lp1/c1;

    invoke-static {v0, v1}, Lpj2/i;->L(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
