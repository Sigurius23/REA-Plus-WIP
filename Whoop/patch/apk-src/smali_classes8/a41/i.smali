.class public final synthetic La41/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, La41/i;->w:I

    iput-object p1, p0, La41/i;->y:Ljava/lang/Object;

    iput p2, p0, La41/i;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La41/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lbt1/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lct1/a;->c(Lbt1/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->h(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lch0/m0;->x(Lf0/r1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lzg0/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lch0/u;->c(Lzg0/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc81/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc81/d;->a(Lc81/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc60/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc60/c;->c(Lc60/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/h2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/j2;->d(Lc41/h2;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/z1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/y1;->a(Lc41/z1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/u0$c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/q0;->j(Lc41/u0$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/u0$a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/q0;->c(Lc41/u0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/u0$e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/q0;->f(Lc41/u0$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/u0$d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/q0;->h(Lc41/u0$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/u0$b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/q0;->e(Lc41/u0$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc41/u0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc41/q0;->g(Lc41/u0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lc21/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lc21/b;->e(Lc21/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lyx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lby1/a;->b(Lyx1/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Ly81/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lbr2/h;->a(Ly81/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/i;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lbr2/e;->a(Lxq2/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lbm2/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lbm2/e;->d(Lbm2/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lbm0/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lbm0/r;->h(Lbm0/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lbd1/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lbd1/g;->a(Lbd1/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lbd1/a;->a(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lb72/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lb72/b;->c(Lb72/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Le30/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, La41/i;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Lds/p;->j(Le30/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lau2/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lau2/c;->c(Lau2/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lwt2/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lau2/c;->a(Lwt2/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lys2/e$j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lat2/c0;->i(Lys2/e$j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lam2/p0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lam2/o0;->H(Lam2/p0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, Lam0/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, Lam0/d;->e(Lam0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, La41/i;->y:Ljava/lang/Object;

    check-cast v0, La41/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, La41/i;->x:I

    invoke-static {v0, v1, p1, p2}, La41/l;->k(La41/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
