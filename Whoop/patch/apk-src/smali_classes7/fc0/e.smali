.class public final synthetic Lfc0/e;
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
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p5, p0, Lfc0/e;->w:I

    iput-object p1, p0, Lfc0/e;->x:Ljava/lang/Object;

    iput-object p2, p0, Lfc0/e;->E:Ljava/lang/Object;

    iput p3, p0, Lfc0/e;->y:I

    iput p4, p0, Lfc0/e;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Lfc0/e;->w:I

    iput-object p1, p0, Lfc0/e;->E:Ljava/lang/Object;

    iput-object p3, p0, Lfc0/e;->x:Ljava/lang/Object;

    iput p2, p0, Lfc0/e;->y:I

    iput p4, p0, Lfc0/e;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lfc0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio2/k;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lio2/j;->c(Landroidx/compose/ui/Modifier;Lio2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgh1/d;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lih1/i;->b(Lgh1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgg0/c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lig0/i;->d(Lgg0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lib2/d;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lib2/b;->h(Lib2/d;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhz0/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lhz0/b;->b(Landroidx/compose/ui/Modifier;Lhz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhy0/i0;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lhy0/b0;->c(Lhy0/i0;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lht2/i;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lht2/e;->s(Lht2/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgt2/c$a;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lht2/e;->h(Lgt2/c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhp2/g;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lhp2/f;->a(Lhp2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhp2/c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lhp2/b;->a(Lhp2/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lid1/e;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lhd1/b;->c(Lid1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh90/c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh90/b;->g(Lh90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh81/c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh81/b;->a(Lh81/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf60/c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh60/h;->a(Lf60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf60/c$c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh60/g;->f(Lf60/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf60/c$a;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh60/e;->a(Lf60/c$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh31/c;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh31/e;->b(Lh31/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lh02/k;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh02/o0;->a(Lh02/k;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lh02/x;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh02/w;->a(Landroidx/compose/ui/Modifier;Lh02/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lh02/s;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lh02/r;->a(Landroidx/compose/ui/Modifier;Lh02/s;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    check-cast v0, Lh00/h0;

    iget-object v1, p0, Lfc0/e;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lfc0/e;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v2, p0, Lfc0/e;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lv8/b;->e(Lh00/h0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lfc0/e;->E:Ljava/lang/Object;

    check-cast v1, Ly3/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lfc0/e;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v2, p0, Lfc0/e;->z:I

    invoke-static {v0, v1, p1, p2, v2}, Lug/m;->b(Landroidx/compose/ui/Modifier;Ly3/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ldt1/a;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lgt1/c;->b(Ldt1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg90/g;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lg90/f;->d(Lg90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg41/e;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lg41/d;->g(Lg41/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg01/g;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lg01/f;->a(Landroidx/compose/ui/Modifier;Lg01/g;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    check-cast v0, Ld40/m;

    iget-object v1, p0, Lfc0/e;->x:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lfc0/e;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v2, p0, Lfc0/e;->z:I

    invoke-static {v0, v1, p1, p2, v2}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfo2/h;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lfo2/g;->a(Lfo2/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfc0/b;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lfc0/g;->d(Lfc0/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lfc0/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfc0/h;

    iget-object v0, p0, Lfc0/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lfc0/e;->y:I

    iget v4, p0, Lfc0/e;->z:I

    invoke-static/range {v1 .. v6}, Lfc0/g;->a(Lfc0/h;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

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
