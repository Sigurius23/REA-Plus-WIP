.class public final Lw20/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;I)V
    .locals 0

    iput p2, p0, Lw20/h;->w:I

    iput-object p1, p0, Lw20/h;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lw20/h;->w:I

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
    new-instance p1, Lw20/h;

    iget-object p2, p0, Lw20/h;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lw20/h;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;I)V

    const p2, -0x4b087fff

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

    const/4 v0, 0x3

    and-int/2addr p2, v0

    const/4 v1, 0x2

    if-ne p2, v1, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    const/4 p2, 0x0

    invoke-static {p2, p1, v0}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v1

    iget-object v0, p0, Lw20/h;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v2}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw20/x;

    iget-object v2, v2, Lw20/x;->w:Lec3/h2;

    const/4 v3, 0x0

    invoke-static {v2, p1, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, -0x42e6c789

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr p1, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_4

    if-ne v4, v5, :cond_5

    :cond_4
    new-instance v4, Ls40/c0;

    const/16 p1, 0x13

    invoke-direct {v4, v0, v1, p2, p1}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lc93/m;

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-static {v6, v4, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, -0x42e68ac7

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_6

    if-ne p2, v5, :cond_7

    :cond_6
    new-instance p2, Lw20/g;

    const/4 p1, 0x2

    invoke-direct {p2, v0, p1}, Lw20/g;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v4, p2

    check-cast v4, Lc93/a;

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    new-instance p1, Lu10/f;

    const/4 p2, 0x1

    invoke-direct {p1, p2, v0, v2}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, -0x83f0a7

    invoke-static {p2, v6, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6008

    const/4 v8, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v8}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
