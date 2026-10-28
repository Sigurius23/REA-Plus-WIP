.class public final synthetic Leg2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIIILandroidx/compose/ui/Modifier;)V
    .locals 0

    .line 1
    iput p4, p0, Leg2/l;->w:I

    iput p1, p0, Leg2/l;->x:I

    iput-object p5, p0, Leg2/l;->y:Ljava/lang/Object;

    iput p2, p0, Leg2/l;->z:I

    iput p3, p0, Leg2/l;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Leg2/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Leg2/l;->x:I

    iput p2, p0, Leg2/l;->z:I

    iput-object p4, p0, Leg2/l;->y:Ljava/lang/Object;

    iput p3, p0, Leg2/l;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IIII)V
    .locals 0

    .line 3
    iput p5, p0, Leg2/l;->w:I

    iput-object p1, p0, Leg2/l;->y:Ljava/lang/Object;

    iput p2, p0, Leg2/l;->x:I

    iput p3, p0, Leg2/l;->z:I

    iput p4, p0, Leg2/l;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Leg2/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lir2/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Leg2/l;->x:I

    iget v3, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Lir2/d;->e(Lir2/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Leg2/l;->x:I

    iget v2, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Lzz0/g;->f(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Leg2/l;->x:I

    iget v2, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Lzc1/s0;->d(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Leg2/l;->x:I

    iget v2, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Lw12/b;->a(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Leg2/l;->x:I

    iget v2, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Lqk2/b;->i(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Leg2/l;->x:I

    iget v2, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Leg2/n;->h(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Leg2/l;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Leg2/l;->x:I

    iget v2, p0, Leg2/l;->z:I

    iget v4, p0, Leg2/l;->E:I

    invoke-static/range {v1 .. v6}, Leg2/n;->c(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
