.class public final Lx20/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V
    .locals 0

    iput p2, p0, Lx20/h;->w:I

    iput-object p1, p0, Lx20/h;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lx20/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v9

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p1, Lx20/h;

    iget-object p2, p0, Lx20/h;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lx20/h;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    const p2, 0x6a6dd6a3

    invoke-static {p2, v9, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v11, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    iget-object v2, p0, Lx20/h;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    iget-object p2, v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {p2}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx20/w;

    iget-object p2, p2, Lx20/w;->z:Lec3/h2;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v4

    move-object v10, p1

    check-cast v10, Lp1/q;

    const p1, 0x71edcc7b

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_4

    if-ne p2, v7, :cond_5

    :cond_4
    new-instance p2, Lb;

    const/16 p1, 0xc

    invoke-direct {p2, v4, p1}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v10, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 p1, 0x1

    invoke-static {p2, v10, p1}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v3

    const p2, 0x71edf78c

    invoke-virtual {v10, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_6

    if-ne v1, v7, :cond_7

    :cond_6
    new-instance v1, Lwr0/r;

    const/4 p2, 0x4

    invoke-direct {v1, p2, v2, v4}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lc93/a;

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 p2, 0x6

    invoke-static {v1, p1, v10, p2, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx20/p;

    iget-object p1, p1, Lx20/p;->c:Lx20/o;

    const p2, 0x71ee1f94

    invoke-virtual {v10, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_8

    if-ne v1, v7, :cond_9

    :cond_8
    new-instance v1, Lp33/m;

    const/16 v6, 0x9

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v6}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lc93/m;

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-static {v10, v1, p1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x71ee4b3f

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_a

    new-instance p1, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lou1/a;-><init>(I)V

    invoke-virtual {v10, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v8, p1

    check-cast v8, Lc93/a;

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    new-instance p1, Lu10/f;

    const/4 p2, 0x4

    invoke-direct {p1, p2, v2, v4}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x3a6cedfb

    invoke-static {p2, v10, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/16 v11, 0x6c08

    const/4 v12, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v3

    invoke-static/range {v5 .. v12}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
