.class public final Li20/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Leb/u0;

.field public final synthetic y:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V
    .locals 0

    iput p3, p0, Li20/f;->w:I

    iput-object p1, p0, Li20/f;->x:Leb/u0;

    iput-object p2, p0, Li20/f;->y:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Li20/f;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v11

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v1, Li20/f;

    iget-object v3, v0, Li20/f;->y:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    const/4 v4, 0x0

    iget-object v5, v0, Li20/f;->x:Leb/u0;

    invoke-direct {v1, v5, v3, v4}, Li20/f;-><init>(Leb/u0;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    const v3, 0x2cf6fda3

    invoke-static {v3, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const v12, 0x180006

    const/16 v13, 0x3e

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    move-object v14, v1

    check-cast v14, Lp1/q;

    const v1, 0x3eab0b1c

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Li20/f;->y:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_5

    :cond_4
    new-instance v3, Lhb2/c;

    const/4 v2, 0x5

    invoke-direct {v3, v1, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v13, v3

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    const/4 v15, 0x0

    const/16 v16, 0x3fc

    iget-object v4, v0, Li20/f;->x:Leb/u0;

    const-string v5, "InputAddress"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v16}, Lhg3/i;->d(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
