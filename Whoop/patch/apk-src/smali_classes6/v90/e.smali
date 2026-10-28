.class public final synthetic Lv90/e;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lv90/e;->w:I

    iput-object p1, p0, Lv90/e;->z:Ljava/lang/Object;

    iput-object p2, p0, Lv90/e;->x:Ljava/lang/Object;

    iput p3, p0, Lv90/e;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lv90/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lwf1/c$c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyf1/d;->a(Lwf1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lxd2/j$a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyd2/k;->l(Lxd2/j$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lxd2/j;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyd2/k;->t(Lxd2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lxd2/a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyd2/k;->h(Lxd2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lwb0/j;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lyb0/k;->H(Lwb0/j;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lnl0/m;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ly12/c;->a(Lnl0/m;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvp2/c$c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lxp2/f;->g(Lvp2/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvp2/c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lxp2/e;->a(Lvp2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvp2/c$b;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lxp2/d;->f(Lvp2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lti2/g$a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lxi2/f;->f(Lti2/g$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lui2/c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lti2/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lxi2/f;->e(Lui2/c;Lti2/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lti0/a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lxi0/b;->a(Lti0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lx80/c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lx80/b;->a(Lx80/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lv90/e;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v1, v0, p1, p2}, Ls9/f;->h(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvt1/c$a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lwt1/a;->l(Lvt1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvt1/c$b;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lwt1/a;->j(Lvt1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvt1/c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lwt1/a;->i(Lvt1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Leu/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lw41/c;->a(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvz0/b;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvz0/a;->c(Lvz0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lvx0/e;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvx0/c;->e(Lvx0/e;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Luv2/c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvv2/e;->i(Luv2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Luv2/c$a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvv2/e;->k(Luv2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lus2/f$c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvs2/e;->y(Lus2/f$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lus2/b;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvs2/e;->l(Lus2/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lol0/c$a;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lvl0/d;->m(Lol0/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lte0/c;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lve0/e;->q(Lte0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lv90/v;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lv90/u;->d(Lv90/v;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lv90/r;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lv90/q;->e(Lv90/r;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lv90/o;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lv90/n;->c(Lv90/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lv90/e;->z:Ljava/lang/Object;

    check-cast v0, Lv90/g;

    iget-object v1, p0, Lv90/e;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lv90/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lv90/f;->a(Lv90/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
