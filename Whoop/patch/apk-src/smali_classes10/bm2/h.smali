.class public final synthetic Lbm2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    iput p3, p0, Lbm2/h;->w:I

    iput p1, p0, Lbm2/h;->x:I

    iput p2, p0, Lbm2/h;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbm2/h;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lbm2/h;->x:I

    iget v1, p0, Lbm2/h;->y:I

    invoke-static {v0, v1, p1, p2}, Lv31/f;->c(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lbm2/h;->x:I

    iget v1, p0, Lbm2/h;->y:I

    invoke-static {v0, v1, p1, p2}, Lsg2/q;->b(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lbm2/h;->x:I

    iget v1, p0, Lbm2/h;->y:I

    invoke-static {v0, v1, p1, p2}, Lj11/i;->e(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lbm2/h;->x:I

    iget v1, p0, Lbm2/h;->y:I

    invoke-static {v0, v1, p1, p2}, Leg2/n;->g(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lbm2/h;->x:I

    iget v1, p0, Lbm2/h;->y:I

    invoke-static {v0, v1, p1, p2}, Ld41/e;->e(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lbm2/h;->x:I

    iget v1, p0, Lbm2/h;->y:I

    invoke-static {v0, v1, p1, p2}, Lbm2/i;->d(IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
