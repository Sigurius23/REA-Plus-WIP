.class public final synthetic Le81/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;III)V
    .locals 0

    .line 1
    iput p5, p0, Le81/g;->w:I

    iput-object p1, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Le81/g;->x:Ljava/util/List;

    iput p3, p0, Le81/g;->z:I

    iput p4, p0, Le81/g;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 2
    iput p5, p0, Le81/g;->w:I

    iput-object p1, p0, Le81/g;->x:Ljava/util/List;

    iput-object p2, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iput p3, p0, Le81/g;->z:I

    iput p4, p0, Le81/g;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Le81/g;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Le81/g;->x:Ljava/util/List;

    iget v3, p0, Le81/g;->z:I

    iget v4, p0, Le81/g;->E:I

    invoke-static/range {v1 .. v6}, Lzz0/g;->j(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Lzk2/q;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Lsq2/e;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Lqs1/a;->i(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Lqs1/a;->g(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Ljd2/b;->f(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Ljd2/b;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Leo0/c;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Le81/g;->y:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Le81/g;->x:Ljava/util/List;

    iget v2, p0, Le81/g;->z:I

    iget v3, p0, Le81/g;->E:I

    invoke-static/range {v0 .. v5}, Le81/k;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
