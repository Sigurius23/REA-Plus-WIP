.class public final synthetic La01/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FFLjava/lang/Object;II)V
    .locals 0

    .line 1
    iput p5, p0, La01/k;->w:I

    iput p1, p0, La01/k;->x:F

    iput p2, p0, La01/k;->y:F

    iput-object p3, p0, La01/k;->E:Ljava/lang/Object;

    iput p4, p0, La01/k;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FFII)V
    .locals 0

    .line 2
    iput p5, p0, La01/k;->w:I

    iput-object p1, p0, La01/k;->E:Ljava/lang/Object;

    iput p2, p0, La01/k;->x:F

    iput p3, p0, La01/k;->y:F

    iput p4, p0, La01/k;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, La01/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljr2/d;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, La01/k;->x:F

    iget v2, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, Lvq2/a;->c(FFLjr2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lq81/i;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, La01/k;->x:F

    iget v3, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, Lq81/g;->e(Lq81/i;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhy0/r1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, La01/k;->x:F

    iget v3, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, Lhy0/q1;->b(Lhy0/r1;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lgz0/m0;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, La01/k;->x:F

    iget v2, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, Lc41/e0;->b(FFLgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly81/f;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, La01/k;->x:F

    iget v3, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, Lbr2/h;->f(Ly81/f;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/z1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, La01/k;->x:F

    iget v3, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, Lb21/d;->a(Ld0/z1;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La01/k;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, La01/k;->x:F

    iget v3, p0, La01/k;->y:F

    iget v4, p0, La01/k;->z:I

    invoke-static/range {v1 .. v6}, La01/l;->c(Ljava/util/List;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
