.class public final synthetic Leo2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p5, p0, Leo2/l;->w:I

    iput-object p1, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Leo2/l;->y:Ljava/lang/String;

    iput p3, p0, Leo2/l;->z:I

    iput p4, p0, Leo2/l;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 2
    iput p5, p0, Leo2/l;->w:I

    iput-object p1, p0, Leo2/l;->y:Ljava/lang/String;

    iput-object p2, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iput p3, p0, Leo2/l;->z:I

    iput p4, p0, Leo2/l;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Leo2/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Leo2/l;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Leo2/l;->y:Ljava/lang/String;

    iget-object v1, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget v2, p0, Leo2/l;->E:I

    invoke-static {v0, v1, p1, p2, v2}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lwl0/a;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lvy0/h0;->m(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lvy0/p;->k(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lpx0/c;->n(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lpx0/c;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lp71/b;->h(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lp71/b;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lp71/b;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Lgt1/p;->f(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Leo2/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Leo2/l;->y:Ljava/lang/String;

    iget v2, p0, Leo2/l;->z:I

    iget v3, p0, Leo2/l;->E:I

    invoke-static/range {v0 .. v5}, Leo2/m;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
