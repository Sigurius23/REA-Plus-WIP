.class public final Lt10/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V
    .locals 0

    iput p2, p0, Lt10/h;->w:I

    iput-object p1, p0, Lt10/h;->x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lt10/h;->w:I

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
    new-instance p1, Lt10/h;

    iget-object p2, p0, Lt10/h;->x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lt10/h;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    const p2, -0x3d75af6b

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
    iget-object v3, p0, Lt10/h;->x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    iget-object p2, v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->E:Lt10/e;

    if-eqz p2, :cond_8

    iget-object p2, p2, Lt10/e;->g:Lec3/h2;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p2

    move-object v9, p1

    check-cast v9, Lp1/q;

    const p1, 0x5f9ed2c0

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_4

    if-ne v1, v2, :cond_5

    :cond_4
    new-instance v1, Lb;

    const/16 p1, 0xa

    invoke-direct {v1, p2, p1}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const/4 p1, 0x1

    invoke-static {v1, v9, p1}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object p1

    const v1, 0x5f9ee75d

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_6

    if-ne v4, v2, :cond_7

    :cond_6
    new-instance v1, Lp00/j;

    const/4 v7, 0x0

    const/16 v8, 0xf

    const/4 v2, 0x0

    const-class v4, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    const-string v5, "setCancelAndFinish"

    const-string v6, "setCancelAndFinish()V"

    invoke-direct/range {v1 .. v8}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v1

    :cond_7
    check-cast v4, Lj93/g;

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object v7, v4

    check-cast v7, Lc93/a;

    new-instance v0, Lb30/w2;

    const/16 v1, 0x1c

    invoke-direct {v0, v1, v3, p2}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, -0x65f37c13

    invoke-static {p2, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v10, 0x6008

    const/4 v11, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v11}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    const-string p1, "formActivityStateHelper"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
