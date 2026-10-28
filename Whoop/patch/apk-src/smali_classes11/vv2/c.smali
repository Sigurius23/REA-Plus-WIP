.class public final synthetic Lvv2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p5, p0, Lvv2/c;->w:I

    iput-object p1, p0, Lvv2/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lvv2/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Lvv2/c;->E:Ljava/lang/Object;

    iput p4, p0, Lvv2/c;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lvv2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lay2/a$b;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lzx2/a;->k(Lay2/a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lay2/a;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lzx2/a;->a(Lay2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzq0/o;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lzq0/m;->d(Lm91/u;Lzq0/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxo2/c$b;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lzo2/c;->c(Ll0/u;Lxo2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lyi1/k;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lzi1/d;->a(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/x;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lzc1/e4;->b(Ljava/lang/String;Li2/x;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lz51/k;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lz51/d;->d(Lz51/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw50/a;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx50/b;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lz50/e;->c(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lw22/c;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lw22/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lz22/i;->b(Ljava/lang/String;Lw22/c;Lw22/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx22/c$b;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lz22/d;->f(Ll0/u;Lx22/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    check-cast v0, Lx0/g;

    iget-object v1, p0, Lvv2/c;->z:Ljava/lang/Object;

    check-cast v1, Lb1/f;

    iget-object v2, p0, Lvv2/c;->E:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lvv2/c;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lz0/i;->c(Lx0/g;Lb1/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luw1/d$b;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyw1/k;->b(Ll0/u;Luw1/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luw1/c$b;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyw1/d;->a(Ll0/u;Luw1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lyo0/f;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyo0/e;->b(Ll0/u;Lyo0/f;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyl0/c;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyl0/b;->c(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwf1/a$e;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lvf1/c;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lvf1/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyf1/h;->c(Lwf1/a$e;Lvf1/c;Lvf1/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lwf1/c$c;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyf1/d;->e(Ll0/u;Lwf1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxd2/j;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyd2/k;->j(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxd2/e;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyd2/f;->f(Lxd2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxd2/f;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyd2/f;->b(Lxd2/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxd2/e;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyd2/f;->c(Lxd2/e;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwb0/e;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lyb0/k;->l(Lwb0/e;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly71/d;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Ly71/c;->b(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgz0/m0;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Ly31/d;->i(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Ly31/d;->d(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lvp2/c$b;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lxp2/d;->e(Ll0/u;Lvp2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lu60/c$c;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lw60/b;->d(Ll0/u;Lu60/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lw41/e;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvy0/z;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lvy0/c0;->b(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lvv2/c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;

    iget-object v0, p0, Lvv2/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lfi0/a;

    iget-object v0, p0, Lvv2/c;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lvv2/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, Lvv2/c;->x:I

    invoke-static/range {v1 .. v6}, Lvv2/e;->q(Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Lfi0/a;Lvv2/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
