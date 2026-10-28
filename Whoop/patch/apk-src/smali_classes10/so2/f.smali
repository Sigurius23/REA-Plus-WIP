.class public final synthetic Lso2/f;
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

    iput p4, p0, Lso2/f;->w:I

    iput-object p1, p0, Lso2/f;->z:Ljava/lang/Object;

    iput-object p2, p0, Lso2/f;->x:Ljava/lang/Object;

    iput p3, p0, Lso2/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lso2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lny0/h;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/components/ReferralsTileKt;->f(Lny0/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Ltz1/a;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Luz1/h;->g(Ltz1/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Luw0/p;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Luw0/n;->b(Luw0/p;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Luu2/i0;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Luu2/l;->q(Luu2/i0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Luu2/b0;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Luu2/l;->l(Luu2/b0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lri0/e$b;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lui0/k;->b(Lri0/e$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lsf0/c;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Luf0/d;->b(Lsf0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lsf0/c$c;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Luf0/b;->a(Lsf0/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lue1/c;->a(Lf0/r1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Ltd2/i$a;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lud2/e;->g(Ltd2/i$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Ltd2/i$b;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lud2/e;->k(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v1, p0, Lso2/f;->z:Ljava/lang/Object;

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v1, v0, v2, p1, p2}, Lu11/i;->u(Ljava/lang/Object;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lu11/d;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lu11/i;->w(Lu11/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lso2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lu0/n0;->c(Lf1/s1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lso2/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lu0/d;->a(Ll3/g;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lsu2/a;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ltu2/b;->j(Lsu2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Ltq2/h;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ltq2/c;->b(Ltq2/h;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lty2/a$a$h;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsy2/q;->c(Lty2/a$a$h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lty2/a$a$d;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsy2/m;->f(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lty2/a$a$b;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsy2/e;->b(Lty2/a$a$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lux1/d;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsx1/j;->p(Lux1/d;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lsx0/d;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsx0/a;->b(Lsx0/d;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv2/h$b;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsv2/e;->y(Lrv2/h$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv2/b;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsv2/e;->M(Lrv2/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv2/h$a;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsv2/e;->D(Lrv2/h$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lqu1/h;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsu1/c;->b(Lqu1/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lqu1/g;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsu1/b;->d(Lqu1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lrt1/h$b;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lst1/l;->d(Lrt1/h$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lrt1/h$a;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lst1/l;->g(Lrt1/h$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lso2/f;->z:Ljava/lang/Object;

    check-cast v0, Lpo2/c$c;

    iget-object v1, p0, Lso2/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lso2/f;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lso2/g;->a(Lpo2/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
