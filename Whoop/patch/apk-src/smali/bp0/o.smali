.class public final synthetic Lbp0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lbp0/o;->w:I

    iput-object p1, p0, Lbp0/o;->y:Ljava/lang/Object;

    iput p2, p0, Lbp0/o;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbp0/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Ly61/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lw61/d;->b(Ly61/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lvn1/m;->b(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lsz0/p0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lsz0/m0;->i(Lsz0/p0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lbp0/o;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lk71/z;->k(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lh01/q;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lh01/p;->h(Lh01/q;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lj61/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Le61/m;->e(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lc41/i3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/m3;->d(Lc41/i3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lep0/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v0, v1, p1, p2}, Lbp0/s;->q(Lep0/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lbp0/o;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbp0/o;->x:I

    invoke-static {v1, v0, p1, p2}, Lbp0/s;->h(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
