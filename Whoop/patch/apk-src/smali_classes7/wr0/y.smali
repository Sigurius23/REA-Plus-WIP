.class public final synthetic Lwr0/y;
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

    iput p3, p0, Lwr0/y;->w:I

    iput-object p1, p0, Lwr0/y;->y:Ljava/lang/Object;

    iput p2, p0, Lwr0/y;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwr0/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lzy0/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lzy0/b;->a(Lzy0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, [Lp01/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lzc1/p0;->a([Lp01/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/DesignSystemModel;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lzc1/l0;->a(Lcom/whoop/design/models/DesignSystemModel;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lwt2/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lyt2/k;->q(Lwt2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lxd2/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lyd2/d;->d(Lxd2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Ly41/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Ly41/d;->g(Ly41/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Ly41/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Ly41/d;->f(Ly41/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Ly11/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Ly11/c;->a(Ly11/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Ly01/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Ly01/b;->d(Ly01/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lw41/z$a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lx41/a;->a(Lw41/z$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lj81/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lwr0/d0;->c(Lj81/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lwr0/y;->y:Ljava/lang/Object;

    check-cast v0, Lwr0/v;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lwr0/y;->x:I

    invoke-static {v0, v1, p1, p2}, Lwr0/z;->e(Lwr0/v;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
