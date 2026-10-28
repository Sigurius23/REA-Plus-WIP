.class public final Li20/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

.field public final synthetic y:Li20/b0;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Li20/b0;I)V
    .locals 0

    iput p3, p0, Li20/x;->w:I

    iput-object p1, p0, Li20/x;->x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iput-object p2, p0, Li20/x;->y:Li20/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Li20/x;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v10

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
    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance p1, Li20/x;

    iget-object p2, p0, Li20/x;->y:Li20/b0;

    const/4 v0, 0x0

    iget-object v2, p0, Li20/x;->x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-direct {p1, v2, p2, v0}, Li20/x;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Li20/b0;I)V

    const p2, 0x51ee391a

    invoke-static {p2, v10, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const v11, 0x180006

    const/16 v12, 0x3e

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

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

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p2, p0, Li20/x;->x:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iget-object p2, p2, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {p2}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li20/v0;

    invoke-static {p1}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v0

    new-instance v1, Lg40/l0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lg40/l0;-><init>(I)V

    invoke-static {v0, v1}, Ly30/d;->e(ZLg40/l0;)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Li20/x;->y:Li20/b0;

    const/16 v2, 0xc00

    invoke-static {p2, v1, v0, p1, v2}, Li20/l1;->b(Li20/v0;Li20/b0;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
