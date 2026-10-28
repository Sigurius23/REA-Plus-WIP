.class public final synthetic Lc41/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIJI)V
    .locals 0

    iput p5, p0, Lc41/i0;->w:I

    iput p1, p0, Lc41/i0;->x:I

    iput-wide p3, p0, Lc41/i0;->y:J

    iput p2, p0, Lc41/i0;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc41/i0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lc41/i0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lc41/i0;->x:I

    iget-wide v1, p0, Lc41/i0;->y:J

    invoke-static {v0, v1, v2, p1, p2}, Lz0/i;->b(IJLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lc41/i0;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lc41/i0;->x:I

    iget-wide v1, p0, Lc41/i0;->y:J

    invoke-static {v0, v1, v2, p1, p2}, Lz0/i;->b(IJLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lc41/i0;->x:I

    iget-wide v1, p0, Lc41/i0;->y:J

    iget v3, p0, Lc41/i0;->z:I

    invoke-static/range {v0 .. v5}, Lyd2/f;->g(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lc41/i0;->x:I

    iget-wide v1, p0, Lc41/i0;->y:J

    iget v3, p0, Lc41/i0;->z:I

    invoke-static/range {v0 .. v5}, Lhy0/w1;->b(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lc41/i0;->x:I

    iget-wide v1, p0, Lc41/i0;->y:J

    iget v3, p0, Lc41/i0;->z:I

    invoke-static/range {v0 .. v5}, Lhe1/a;->n(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lc41/i0;->x:I

    iget-wide v1, p0, Lc41/i0;->y:J

    iget v3, p0, Lc41/i0;->z:I

    invoke-static/range {v0 .. v5}, Lc41/l0;->g(IJILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
