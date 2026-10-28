.class public final synthetic La11/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, La11/i;->w:I

    iput p1, p0, La11/i;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La11/i;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lvy0/h0;->j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lvy0/h0;->n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lvy0/h0;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lvy0/h0;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lvn1/m;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lsz0/m0;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lsz0/m0;->j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lht2/e;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, Lbp0/s;->m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, La11/q;->p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget v0, p0, La11/i;->x:I

    invoke-static {v0, p1, p2}, La11/q;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
