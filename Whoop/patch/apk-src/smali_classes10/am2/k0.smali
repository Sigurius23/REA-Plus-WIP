.class public final synthetic Lam2/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FIII)V
    .locals 0

    iput p5, p0, Lam2/k0;->w:I

    iput-object p1, p0, Lam2/k0;->E:Ljava/lang/Object;

    iput p2, p0, Lam2/k0;->x:F

    iput p3, p0, Lam2/k0;->y:I

    iput p4, p0, Lam2/k0;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lam2/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/k0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lam2/k0;->x:F

    iget v3, p0, Lam2/k0;->y:I

    iget v4, p0, Lam2/k0;->z:I

    invoke-static/range {v1 .. v6}, Lxq2/q0;->j(Lkd1/o;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam2/k0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lam2/k0;->x:F

    iget v3, p0, Lam2/k0;->y:I

    iget v4, p0, Lam2/k0;->z:I

    invoke-static/range {v1 .. v6}, Lqu2/h;->p(Lkotlin/jvm/functions/Function1;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lam2/k0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lam2/k0;->x:F

    iget v3, p0, Lam2/k0;->y:I

    iget v4, p0, Lam2/k0;->z:I

    invoke-static/range {v1 .. v6}, Lc41/f1;->f(Ljava/util/List;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lam2/k0;->E:Ljava/lang/Object;

    check-cast v0, Lb30/m0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lam2/k0;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v1, p0, Lam2/k0;->x:F

    iget v2, p0, Lam2/k0;->z:I

    invoke-static {v0, v1, p1, p2, v2}, Ltx/f;->a(Lb30/m0;FLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lam2/k0;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lam2/o;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lam2/k0;->x:F

    iget v3, p0, Lam2/k0;->y:I

    iget v4, p0, Lam2/k0;->z:I

    invoke-static/range {v1 .. v6}, Lam2/o0;->i(Lam2/o;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
