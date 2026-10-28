.class public final synthetic Lt80/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    iput p5, p0, Lt80/b;->w:I

    iput-object p1, p0, Lt80/b;->E:Ljava/lang/Object;

    iput-object p3, p0, Lt80/b;->x:Ljava/lang/Object;

    iput p2, p0, Lt80/b;->y:I

    iput p4, p0, Lt80/b;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lt80/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lso1/e0;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lwo1/k0;->c(Lso1/e0;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lso1/s;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lwo1/r;->d(Lso1/s;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lwl0/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lwl0/a;->a(Landroidx/compose/ui/Modifier;Lwl0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw90/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw90/b;->h(Lw90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw80/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw80/b;->b(Lw80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly61/a;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw61/c;->a(Ly61/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu60/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw60/c;->b(Lu60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu60/c$c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw60/b;->f(Lu60/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw51/f;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw51/g;->g(Lw51/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw51/d;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lw51/g;->b(Lw51/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvq2/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lvq2/a;->b(Lvq2/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/i;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lvp1/h;->n(Ltp1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lso1/l0;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lvo1/h;->b(Lso1/l0;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvm1/b;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lvm1/a;->b(Lvm1/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lv90/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lv90/q;->f(Landroidx/compose/ui/Modifier;Lv90/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lv90/i;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lv90/f;->f(Landroidx/compose/ui/Modifier;Lv90/i;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lv80/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lv80/b;->d(Lv80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lv01/a;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lv01/c;->g(Lv01/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luy0/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Luy0/c;->a(Landroidx/compose/ui/Modifier;Luy0/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Luw0/n;->f(Ljava/util/List;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luu2/k0;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Luu2/l;->g(Luu2/k0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luu1/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Luu1/b;->a(Landroidx/compose/ui/Modifier;Luu1/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsf0/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Luf0/h;->c(Lsf0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltd2/a;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lud2/a;->b(Ltd2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu80/d;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lu80/c;->a(Lu80/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lu80/a;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lu80/c;->e(Lu80/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lu41/b;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lu41/c;->c(Landroidx/compose/ui/Modifier;Lu41/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lpo2/c;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lto2/a;->a(Lpo2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt81/r;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lt81/l;->j(Lt81/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lt80/b;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt80/d;

    iget-object v0, p0, Lt80/b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lt80/b;->y:I

    iget v4, p0, Lt80/b;->z:I

    invoke-static/range {v1 .. v6}, Lt80/c;->b(Lt80/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
