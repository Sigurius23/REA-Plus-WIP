.class public final synthetic Lbz0/a;
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
.method public synthetic constructor <init>(Lfm1/i;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lbz0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbz0/a;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbz0/a;->z:Ljava/lang/Object;

    iput p3, p0, Lbz0/a;->x:I

    iput p4, p0, Lbz0/a;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Lbz0/a;->w:I

    iput-object p1, p0, Lbz0/a;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbz0/a;->E:Ljava/lang/Object;

    iput p2, p0, Lbz0/a;->x:I

    iput p4, p0, Lbz0/a;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbz0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lyy0/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Lyy0/b;->b(Landroidx/compose/ui/Modifier;Lyy0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lht2/f;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Lym1/c;->a(Lht2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvn1/q;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Lum1/d;->e(Lvn1/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnm1/i;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Lnm1/h;->a(Lnm1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljs1/h;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Ljs1/l;->b(Ljs1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lfm1/i;

    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Ljk2/i;->l(Lfm1/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc41/e5;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Lc41/d5;->a(Lc41/e5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lbz0/a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lbz0/a;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj61/f;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lbz0/a;->x:I

    iget v4, p0, Lbz0/a;->y:I

    invoke-static/range {v1 .. v6}, Lbz0/b;->a(Landroidx/compose/ui/Modifier;Lj61/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
