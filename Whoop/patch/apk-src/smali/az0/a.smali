.class public final synthetic Laz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p6, p0, Laz0/a;->w:I

    iput-object p1, p0, Laz0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Laz0/a;->E:Ljava/lang/Object;

    iput-object p3, p0, Laz0/a;->F:Ljava/lang/Object;

    iput p4, p0, Laz0/a;->y:I

    iput p5, p0, Laz0/a;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp31/p;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 2
    iput p6, p0, Laz0/a;->w:I

    iput-object p1, p0, Laz0/a;->E:Ljava/lang/Object;

    iput-object p2, p0, Laz0/a;->x:Ljava/lang/Object;

    iput-object p3, p0, Laz0/a;->F:Ljava/lang/Object;

    iput p4, p0, Laz0/a;->y:I

    iput p5, p0, Laz0/a;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Laz0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx71/d;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lx71/b;->a(Landroidx/compose/ui/Modifier;Lx71/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj71/b$i;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lv61/f;->b(Landroidx/compose/ui/Modifier;Lj71/b$i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lu61/c;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lu61/d;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lt61/b;->c(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp31/p$a;

    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lp31/n;->m(Lp31/p$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp31/p;

    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lp31/n;->b(Lp31/p;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lk01/e;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lk01/d;->a(Landroidx/compose/ui/Modifier;Lk01/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj81/c;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/m;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lj81/b;->b(Landroidx/compose/ui/Modifier;Lj81/c;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lem1/v;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lim1/t0;->A(Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgt2/c;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lht2/e;->f(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lgz0/m0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lc41/m3;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc41/i3;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Lc41/m3;->b(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Laz0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Laz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li91/a;

    iget-object v0, p0, Laz0/a;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lk91/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v4, p0, Laz0/a;->y:I

    iget v5, p0, Laz0/a;->z:I

    invoke-static/range {v1 .. v7}, Laz0/b;->a(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
