.class public final synthetic Lt30/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt30/n;


# direct methods
.method public synthetic constructor <init>(Lt30/n;I)V
    .locals 0

    iput p2, p0, Lt30/i;->w:I

    iput-object p1, p0, Lt30/i;->x:Lt30/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lt30/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt30/i;->x:Lt30/n;

    iget-object v1, v0, Lt30/n;->G:Lq30/n0;

    iget-object v2, v0, Lt30/n;->F:Lr30/j;

    iget-object v3, v0, Lt30/n;->I:Ll83/p;

    check-cast p1, Lq30/t;

    if-eqz p1, :cond_9

    iget-object v4, v0, Lt30/n;->y:Lq30/v0;

    instance-of v5, p1, Lq30/r;

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    check-cast p1, Lq30/r;

    iget-object v4, p1, Lq30/r;->w:Lr30/b;

    iget-object p1, p1, Lq30/r;->x:Lr30/e;

    iget-boolean v5, p1, Lr30/e;->F:Z

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v5

    iget-object v5, v5, Lt30/g;->R:Lbc3/k1;

    invoke-interface {v5, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iget-object v4, v4, Lr30/b;->G:Lr30/a;

    if-eqz v4, :cond_0

    new-instance p1, Lq30/u;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p1, v3, v2, v1}, Lq30/u;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lr30/e;->b0:Ljava/lang/String;

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    const-string v4, "Y"

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lq30/y;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p1, v3, v2, v1}, Lq30/y;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    goto :goto_0

    :cond_2
    new-instance p1, Lq30/v;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p1, v3, v2, v1}, Lq30/v;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    :goto_0
    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    iget-object v4, v4, Lr30/b;->G:Lr30/a;

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    iget-object p1, p1, Lt30/g;->R:Lbc3/k1;

    invoke-interface {p1, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    new-instance v0, Lq30/u;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v3, v2, v1}, Lq30/u;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    iget-object p1, p1, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->N:Lt30/f;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    instance-of v5, p1, Lq30/p;

    if-eqz v5, :cond_6

    check-cast p1, Lq30/p;

    iget-object p1, p1, Lq30/p;->w:Lr30/g;

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v3

    new-instance v5, Lq30/w;

    invoke-direct {v5, p1, v2, v1}, Lq30/w;-><init>(Lr30/g;Lr30/j;Lq30/n0;)V

    iget-object v1, v3, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {v1, v5}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v0

    iget-object v0, v0, Lt30/g;->R:Lbc3/k1;

    invoke-interface {v0, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {v4, p1}, Lq30/v0;->a(Lr30/g;)V

    goto :goto_1

    :cond_6
    instance-of v5, p1, Lq30/q;

    if-eqz v5, :cond_7

    check-cast p1, Lq30/q;

    iget-object p1, p1, Lq30/q;->w:Ljava/lang/Throwable;

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v0

    new-instance v3, Lq30/x;

    invoke-direct {v3, p1, v2, v1}, Lq30/x;-><init>(Ljava/lang/Throwable;Lr30/j;Lq30/n0;)V

    iget-object p1, v0, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    instance-of v5, p1, Lq30/s;

    if-eqz v5, :cond_8

    check-cast p1, Lq30/s;

    iget-object p1, p1, Lq30/s;->w:Lr30/g;

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object v5

    iget-object v5, v5, Lt30/g;->R:Lbc3/k1;

    invoke-interface {v5, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {v4, p1}, Lq30/v0;->a(Lr30/g;)V

    invoke-virtual {v0}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    new-instance v0, Lq30/z;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v3, v2, v1}, Lq30/z;-><init>(Ljava/lang/String;Lr30/j;Lq30/n0;)V

    iget-object p1, p1, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ll83/a0;

    iget-object p1, p0, Lt30/i;->x:Lt30/n;

    iget-object v0, p1, Lt30/n;->H:Lr30/e;

    const/4 v1, 0x0

    const-string v2, "cresData"

    if-eqz v0, :cond_11

    iget-object v3, v0, Lr30/e;->E:Lr30/j;

    sget-object v4, Lr30/j;->H:Lr30/j;

    if-ne v3, v4, :cond_c

    iget-object v0, v0, Lr30/e;->z:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_2

    :cond_a
    iget-object v0, p1, Lt30/n;->Q:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/v;

    iget-object p1, p1, Lt30/n;->H:Lr30/e;

    if-eqz p1, :cond_b

    iget-object p1, p1, Lr30/e;->z:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lt30/v;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_c
    :goto_2
    iget-object v0, p1, Lt30/n;->H:Lr30/e;

    if-eqz v0, :cond_10

    iget-object v3, v0, Lr30/e;->E:Lr30/j;

    sget-object v4, Lr30/j;->G:Lr30/j;

    if-ne v3, v4, :cond_f

    iget-object v0, v0, Lr30/e;->J:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_3

    :cond_d
    invoke-virtual {p1}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    iget-object v3, p1, Lt30/n;->H:Lr30/e;

    if-eqz v3, :cond_e

    iget-object v1, v3, Lr30/e;->J:Ljava/lang/String;

    iget-object v2, p1, Lt30/n;->w:Lm30/h;

    iget-object v2, v2, Lm30/h;->x:Lm30/e;

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->a(Ljava/lang/String;Lm30/e;)V

    invoke-virtual {p1}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoTextIndicator(I)V

    goto :goto_3

    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_f
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lt30/i;->x:Lt30/n;

    iget-object v0, v0, Lt30/n;->O:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/u;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lt30/u;->setText(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
