.class public final Lu10/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V
    .locals 0

    iput p2, p0, Lu10/g;->w:I

    iput-object p1, p0, Lu10/g;->x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lu10/g;->w:I

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
    new-instance p1, Lu10/g;

    iget-object p2, p0, Lu10/g;->x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lu10/g;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    const p2, -0x4dbd4aae

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

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p2, p0, Lu10/g;->x:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->r()Lu10/q;

    move-result-object v0

    iget-object v0, v0, Lu10/q;->c:Ln53/e;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, 0x37f42b33

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_4

    if-ne v2, v3, :cond_5

    :cond_4
    new-instance v2, Lb;

    const/16 p1, 0xb

    invoke-direct {v2, v0, p1}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const/4 p1, 0x1

    invoke-static {v2, v7, p1}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v2

    const p1, 0x37f44270

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez p1, :cond_6

    if-ne v4, v3, :cond_7

    :cond_6
    new-instance v4, Lu10/e;

    const/4 p1, 0x4

    invoke-direct {v4, p2, p1}, Lu10/e;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v5, v4

    check-cast v5, Lc93/a;

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    new-instance p1, Lu10/f;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p2, v0}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, 0x6d3706aa

    invoke-static {p2, v7, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v8, 0x6008

    const/4 v9, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lds/p;->b(Lh40/k;Landroidx/compose/ui/Modifier;FLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
