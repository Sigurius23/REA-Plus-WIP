.class public final synthetic Lwq1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    iput p5, p0, Lwq1/b;->w:I

    iput-object p1, p0, Lwq1/b;->z:Ljava/lang/Object;

    iput-object p3, p0, Lwq1/b;->E:Ljava/lang/Object;

    iput p2, p0, Lwq1/b;->x:I

    iput p4, p0, Lwq1/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lwq1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyi1/b;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxi1/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lzi1/h;->a(Lyi1/b;Lxi1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyi1/d$c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lzi1/g;->b(Lyi1/d$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyi1/a;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lzi1/f;->a(Lyi1/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyi1/d$a;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lzi1/a;->b(Lyi1/d$a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw72/d$c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lz72/a;->a(Lw72/d$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw72/d;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lz72/a;->d(Lw72/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lx50/c$c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lz50/d;->d(Lx50/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lx22/c$d;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lz22/h;->h(Lx22/c$d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lx22/c$b;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lz22/d;->c(Lx22/c$b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwf1/c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lyf1/h;->d(Lwf1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly80/d;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly80/c;->d(Ly80/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly51/c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly51/b;->e(Ly51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly11/q;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly11/p;->a(Landroidx/compose/ui/Modifier;Ly11/q;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly11/r;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly11/n;->a(Landroidx/compose/ui/Modifier;Ly11/r;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly11/d;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly11/c;->b(Ly11/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly01/f;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly01/e;->a(Landroidx/compose/ui/Modifier;Ly01/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly01/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Ly01/b;->b(Landroidx/compose/ui/Modifier;Ly01/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxz0/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxz0/e;->f(Landroidx/compose/ui/Modifier;Lxz0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc51/s;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxq2/c1;->d(Lc51/s;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxq2/g1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxq2/c1;->k(Landroidx/compose/ui/Modifier;Lxq2/g1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxq2/u0;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxq2/t0;->a(Landroidx/compose/ui/Modifier;Lxq2/u0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxq2/d;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxq2/c;->b(Lxq2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxq1/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxq1/b;->a(Landroidx/compose/ui/Modifier;Lxq1/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvp2/c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxp2/g;->a(Lvp2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxo1/c;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxo1/b;->e(Lxo1/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxn2/g;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxn2/f;->a(Lxn2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lti2/h;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxi2/b;->b(Lti2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lti2/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lxi2/b;->c(Landroidx/compose/ui/Modifier;Lti2/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lx31/f;->i(Ljava/util/List;[IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lwq1/b;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwq1/d;

    iget-object v0, p0, Lwq1/b;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lwq1/b;->x:I

    iget v4, p0, Lwq1/b;->y:I

    invoke-static/range {v1 .. v6}, Lwq1/c;->j(Lwq1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
