.class public final synthetic Lk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;I)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput v0, p0, Lk;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk;->z:Ljava/lang/Object;

    iput-object p2, p0, Lk;->y:Ljava/lang/Object;

    iput p3, p0, Lk;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lk;->w:I

    iput-object p1, p0, Lk;->y:Ljava/lang/Object;

    iput-object p2, p0, Lk;->z:Ljava/lang/Object;

    iput p3, p0, Lk;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lk;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lc41/n3;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lc41/j2;->e(Lc41/n3;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lk;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lio/sentry/config/a;->e(Lk20/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lby1/a;->c(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbv2/c;->i(Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;Leb/u0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lhv1/g;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/z0;->m(Lhv1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lhv1/c;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/z0;->d(Lhv1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lbm2/r0;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/q0;->a(Lbm2/r0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lgz0/m0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/g0;->d(Lkd1/o;Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lbm2/f;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/e;->f(Lbm2/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lti0/j;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbj0/b;->d(Lti0/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lzf0/c;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbg0/f;->d(Lzf0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lzf0/c$b;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbg0/d;->d(Lzf0/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lze0/c$a;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbf0/k;->h(Lze0/c$a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lze0/c$e$c;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lbf0/b;->a(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lb81/j;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lb81/i;->b(Lb81/j;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lc71/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lb71/c;->b(Landroidx/compose/ui/Modifier;Lc71/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lb30/y0;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lk;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Luf/c0;->w(Lb30/y0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lr20/s;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lk;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lds/p;->m(Lf0/r1;Lr20/s;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lb30/j0;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lk;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lse/a;->b(Lb30/j0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lzt1/c$c;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lau1/q;->c(Lzt1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lk;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lk;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lau1/i;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lys2/e$j;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lat2/c0;->q(Lys2/e$j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lys2/e$i;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lat2/w;->u(Lys2/e$i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lk21/d;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lam2/o0;->d(Lk21/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lti0/f;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Laj0/a;->a(Lti0/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Ly70/c$d;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, La80/l;->a(Ly70/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Ly70/c;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, La80/h;->a(Ly70/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Ly70/c$b;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lk;->x:I

    invoke-static {v0, v1, v2, p1, p2}, La80/e;->d(Ly70/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lk;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lk;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lk;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v1, v0, p1, p2}, Lx;->b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
