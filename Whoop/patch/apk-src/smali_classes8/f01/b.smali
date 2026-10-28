.class public final synthetic Lf01/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg1/l6;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput v0, p0, Lf01/b;->w:I

    sget-object v0, Lg1/i1;->a:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf01/b;->z:Ljava/lang/Object;

    iput-object p2, p0, Lf01/b;->x:Ljava/lang/Object;

    iput p3, p0, Lf01/b;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lf01/b;->w:I

    iput-object p1, p0, Lf01/b;->z:Ljava/lang/Object;

    iput-object p2, p0, Lf01/b;->x:Ljava/lang/Object;

    iput p3, p0, Lf01/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lf01/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget v2, p0, Lf01/b;->y:I

    iget-object v3, p0, Lf01/b;->x:Ljava/lang/Object;

    iget-object v4, p0, Lf01/b;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lid2/h;

    check-cast v3, Lcom/whoop/share/model/ShareBackground;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lid2/h;->a(Lid2/h;Lcom/whoop/share/model/ShareBackground;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v4, Lic2/a;

    check-cast v3, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lic2/f;->l(Lic2/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v3, Ln0/u;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhy0/v0;->h(Ljava/lang/Object;Ln0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast v4, Landroidx/compose/ui/Modifier;

    check-cast v3, Lhy0/h0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhy0/f0;->e(Landroidx/compose/ui/Modifier;Lhy0/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast v4, Landroidx/compose/ui/Modifier;

    check-cast v3, Lhy0/r;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhy0/n;->h(Landroidx/compose/ui/Modifier;Lhy0/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast v4, Lgv2/d;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhv2/i;->w(Lgv2/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v4, Lhv2/k$b;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhv2/i;->q(Lhv2/k$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast v4, Lhv2/k;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhv2/i;->e(Lhv2/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast v4, Lhh0/c;

    check-cast v3, Lkd1/u;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhh0/f;->f(Lhh0/c;Lkd1/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast v4, Lge2/f$a;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhe2/h;->c(Lge2/f$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast v4, Lge2/f;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhe2/h;->h(Lge2/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v4, Lge2/i;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhe2/c;->d(Lge2/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v4, Lge1/d$e;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lhe1/a;->f(Lge1/d$e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast v4, Lf60/c$b;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lh60/f;->b(Lf60/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast v4, Lcom/stripe/android/shoppay/ShopPayActivity;

    check-cast v3, Landroid/webkit/WebView;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p2, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v4, v3, p1, p2}, Lcom/stripe/android/shoppay/ShopPayActivity;->n(Landroid/webkit/WebView;Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_e
    check-cast v4, Ljava/util/List;

    check-cast v3, Lh02/d0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lh02/b0;->b(Ljava/util/List;Lh02/d0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v4, Lh02/l;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lh02/n;->c(Lh02/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v4, Lgr2/a;

    check-cast v3, Lgr2/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lgr2/e;->c(Lgr2/a;Lgr2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v4, Lep2/c;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lgp2/d;->a(Lep2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast v4, Lep2/c$b;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lgp2/c;->e(Lep2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v4, Lg40/h1;

    check-cast v3, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v4, v3, p1, p2}, Lse/a;->r(Lg40/h1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_14
    check-cast v4, Lg40/u2;

    check-cast v3, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v4, v3, p1, p2}, Lio/sentry/config/a;->l(Lg40/u2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_15
    check-cast v4, Ll1/g1;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lg11/c;->i(Ll1/g1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast v4, Lg1/l6;

    check-cast v3, Landroidx/compose/ui/Modifier;

    sget-object v0, Lg1/i1;->a:Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v4, v3, p1, p2}, Lse/g;->c(Lg1/l6;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_17
    check-cast v4, Lfy2/b$b;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lfy2/a;->d(Lfy2/b$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast v4, Lfy1/k;

    check-cast v3, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lfy1/j;->b(Lfy1/k;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast v4, Lf90/c;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lf90/b;->b(Lf90/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast v4, Lf61/i;

    check-cast v3, Ll0/u;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lf61/i;->s(Lf61/i;Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast v4, Lf01/a1;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lf01/z0;->a(Lf01/a1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v4, Lf01/d;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v4, v3, v2, p1, p2}, Lf01/c;->a(Lf01/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
