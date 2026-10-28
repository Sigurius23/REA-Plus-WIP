.class public final synthetic Lig0/d;
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

    iput p4, p0, Lig0/d;->w:I

    iput-object p1, p0, Lig0/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lig0/d;->x:Ljava/lang/Object;

    iput p3, p0, Lig0/d;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lig0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lnl2/c$d;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkl2/d;->d(Lnl2/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lkf0/k;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkf0/j;->d(Lkf0/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lkd0/c;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkf0/c;->a(Lkd0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lkd0/c$d;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkf0/b;->c(Lkd0/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lje2/c$b;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lke2/c;->d(Lje2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lje2/c;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lke2/c;->a(Lje2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lje2/c$a;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lke2/c;->j(Lje2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkd1/q;->c(Lkd1/o;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/v;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lkd1/e;->b(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lk71/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lk71/b;->e(Landroidx/compose/ui/Modifier;Lk71/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lit1/c;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljt1/c;->i(Lit1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lit1/c$a;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljt1/c;->k(Lit1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lit1/c$b;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljt1/c;->l(Lit1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/h;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljr1/g;->f(Lgr1/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/j;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljr1/g;->a(Lgr1/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/b;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljr1/d;->l(Lgr1/b;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/q;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljr1/b;->b(Lgr1/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgr1/i;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljr1/a;->c(Lgr1/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Laf3/k;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Liz0/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Liz0/g;->p(Laf3/k;Liz0/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Liw0/l0;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Liw0/k0;->e(Liw0/l0;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Liw0/x;->Z(Ljava/util/Map;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lj71/c;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Liw0/x;->g0(Lj71/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Ld11/i;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Liw0/x;->u(Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lt71/f;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Liw0/x;->d(Lt71/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lio2/t;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lio2/s;->f(Lio2/t;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lik2/a;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lim1/h;->a(Lik2/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgh1/d$e;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lih1/h;->g(Lgh1/d$e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgh1/d;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lih1/g;->a(Lgh1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgh1/d$b;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lih1/e;->e(Lgh1/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lig0/d;->z:Ljava/lang/Object;

    check-cast v0, Lgg0/c$b;

    iget-object v1, p0, Lig0/d;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lig0/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lig0/e;->f(Lgg0/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
