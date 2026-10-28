.class public final synthetic Lgt1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lc93/a;III)V
    .locals 0

    iput p4, p0, Lgt1/g;->w:I

    iput-object p1, p0, Lgt1/g;->x:Lc93/a;

    iput p2, p0, Lgt1/g;->y:I

    iput p3, p0, Lgt1/g;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lgt1/g;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lye1/a;->a(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lvn1/h;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lsz0/n0;->g(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lsl0/p1;->i(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpy0/b;->n(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpy0/b;->B(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpy0/b;->C(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpy0/b;->m(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpy0/b;->a(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lpy0/b;->s(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/j;->f(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll72/o;->h(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lgt1/g;->x:Lc93/a;

    iget v1, p0, Lgt1/g;->y:I

    iget v2, p0, Lgt1/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lgt1/h;->b(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
