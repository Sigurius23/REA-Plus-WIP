.class public final synthetic Lqk2/i;
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
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lm91/u;III)V
    .locals 0

    .line 1
    iput p5, p0, Lqk2/i;->w:I

    iput-object p1, p0, Lqk2/i;->x:Ljava/lang/Object;

    iput-object p2, p0, Lqk2/i;->E:Ljava/lang/Object;

    iput p3, p0, Lqk2/i;->y:I

    iput p4, p0, Lqk2/i;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Lqk2/i;->w:I

    iput-object p1, p0, Lqk2/i;->E:Ljava/lang/Object;

    iput-object p3, p0, Lqk2/i;->x:Ljava/lang/Object;

    iput p2, p0, Lqk2/i;->y:I

    iput p4, p0, Lqk2/i;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lqk2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lt71/j;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lt71/a;->d(Landroidx/compose/ui/Modifier;Lt71/j;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt51/c;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lt51/b;->b(Lt51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt21/d;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lt21/g;->a(Lt21/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsz0/e1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsz0/d1;->a(Landroidx/compose/ui/Modifier;Lsz0/e1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsz0/e0;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsz0/g0;->b(Lsz0/e0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsz0/x;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsz0/w;->c(Landroidx/compose/ui/Modifier;Lsz0/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsz0/u;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsz0/t;->b(Landroidx/compose/ui/Modifier;Lsz0/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsz0/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsz0/b;->a(Landroidx/compose/ui/Modifier;Lsz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnl0/m;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsl0/r2;->a(Lnl0/m;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly81/e;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsl0/q1;->a(Ly81/e;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnl0/i;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsl0/p1;->l(Lnl0/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrg2/p;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsg2/q;->d(Lrg2/p;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lqc0/c$c;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsc0/g;->f(Lqc0/c$c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lqc0/c$b;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lsc0/e;->g(Lqc0/c$b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ls51/o;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Ls51/n;->a(Ls51/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ls50/e;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Ls50/c;->f(Ls50/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ls50/d;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Ls50/c;->e(Ls50/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ll01/d;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Ls11/b;->e(Landroidx/compose/ui/Modifier;Ll01/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lry2/c;->a(Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llz2/b;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lry2/a;->b(Llz2/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrx0/c;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lrx0/e;->d(Lrx0/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lus2/a;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lrs2/c;->i(Lus2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lms0/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lrs0/e;->c(Lc93/a;Lms0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/home/domain/models/DayOneTransitionViewState;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lrm1/i;->j(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lr90/g;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lr90/f;->i(Lr90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lr81/d;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lr81/b;->c(Lr81/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lr81/c;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lr81/b;->e(Lr81/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lr71/c;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lr71/b;->g(Lr71/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm62/m;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lr62/b;->b(Lm62/m;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lqk2/i;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lok2/i;

    iget-object v0, p0, Lqk2/i;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lqk2/i;->y:I

    iget v4, p0, Lqk2/i;->z:I

    invoke-static/range {v1 .. v6}, Lqk2/j;->a(Lok2/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
