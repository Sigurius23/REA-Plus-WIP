.class public final synthetic Lzi1/c0;
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

    iput p5, p0, Lzi1/c0;->w:I

    iput-object p1, p0, Lzi1/c0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lzi1/c0;->E:Ljava/lang/Object;

    iput p2, p0, Lzi1/c0;->x:I

    iput p4, p0, Lzi1/c0;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lzi1/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzz0/h;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzz0/g;->k(Landroidx/compose/ui/Modifier;Lzz0/h;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/a1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzy0/f;->b(Landroidx/compose/ui/Modifier;Li2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzq0/d0;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzq0/c0;->a(Landroidx/compose/ui/Modifier;Lzq0/d0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzq0/u;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzq0/t;->a(Landroidx/compose/ui/Modifier;Lzq0/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lxo2/c;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzo2/g;->a(Lxo2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvm2/d;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzm2/a;->a(Lvm2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzm1/f;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzm1/e;->e(Lzm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltk2/o;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzk2/y;->a(Ltk2/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw41/f;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzk2/o;->c(Lw41/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltk2/n;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzk2/i;->b(Ltk2/n;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltk2/c;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzk2/i;->a(Ltk2/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lzi1/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyi1/p;

    iget-object v0, p0, Lzi1/c0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lzi1/c0;->x:I

    iget v4, p0, Lzi1/c0;->y:I

    invoke-static/range {v1 .. v6}, Lzi1/d0;->b(Lyi1/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
