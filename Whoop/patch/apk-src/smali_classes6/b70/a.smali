.class public final synthetic Lb70/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;)V
    .locals 0

    iput p3, p0, Lb70/a;->w:I

    iput-object p4, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iput p1, p0, Lb70/a;->y:I

    iput p2, p0, Lb70/a;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb70/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lxq2/c1;->e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lxq1/a;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lvy0/p;->N(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lvy0/p;->w(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lu41/c;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lb70/a;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->z:I

    invoke-static {v0, p2, p1, v1}, Lds/q;->a(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lnq2/e;->e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lnq2/e;->i(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lnq2/e;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ln21/h;->c(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ln21/h;->k(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/r;->b(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/m;->n(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/m;->t(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/m;->i(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/m;->l(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll01/m;->r(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lis0/c0;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lb70/a;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->z:I

    invoke-static {v0, p2, p1, v1}, Luf/c0;->n(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lf61/k;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lf61/j;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lf02/b;->g(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Leu2/a;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Leg2/n;->f(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Le61/i;->b(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Le61/i;->d(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lcp0/g;->e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lcp0/b;->c(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm0/a;->b(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lb70/a;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lb70/a;->y:I

    iget v2, p0, Lb70/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lb70/d;->f(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
