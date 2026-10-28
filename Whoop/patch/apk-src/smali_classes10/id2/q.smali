.class public final synthetic Lid2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIII)V
    .locals 0

    iput p4, p0, Lid2/q;->w:I

    iput p1, p0, Lid2/q;->x:I

    iput p2, p0, Lid2/q;->y:I

    iput p3, p0, Lid2/q;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lid2/q;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lid2/q;->x:I

    iget v1, p0, Lid2/q;->y:I

    iget v2, p0, Lid2/q;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lv31/f;->e(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lid2/q;->x:I

    iget v1, p0, Lid2/q;->y:I

    iget v2, p0, Lid2/q;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Luu2/g0;->c(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lid2/q;->x:I

    iget v1, p0, Lid2/q;->y:I

    iget v2, p0, Lid2/q;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lrs2/a;->d(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lid2/q;->x:I

    iget v1, p0, Lid2/q;->y:I

    iget v2, p0, Lid2/q;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lq62/b;->a(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lid2/q;->x:I

    iget v1, p0, Lid2/q;->y:I

    iget v2, p0, Lid2/q;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Los0/e;->a(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lid2/q;->x:I

    iget v1, p0, Lid2/q;->y:I

    iget v2, p0, Lid2/q;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lid2/t;->j(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
