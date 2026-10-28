.class public final synthetic Lam0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILandroidx/compose/ui/Modifier;Z)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput p2, p0, Lam0/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p4, p0, Lam0/b;->x:Z

    iput p1, p0, Lam0/b;->y:I

    iput-object p3, p0, Lam0/b;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZII)V
    .locals 0

    .line 2
    iput p4, p0, Lam0/b;->w:I

    iput-object p1, p0, Lam0/b;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lam0/b;->x:Z

    iput p3, p0, Lam0/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;II)V
    .locals 0

    .line 3
    iput p4, p0, Lam0/b;->w:I

    iput-boolean p1, p0, Lam0/b;->x:Z

    iput-object p2, p0, Lam0/b;->z:Ljava/lang/Object;

    iput p3, p0, Lam0/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lam0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Ly11/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ly11/c;->c(Ly11/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lc31/k;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lw90/b;->c(Lc31/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lu71/k;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lu71/g;->d(Lu71/k;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lsq2/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lsq2/g;->c(Lsq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Ljn1/d$c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lmn1/c;->f(Ljn1/d$c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v1, v0, v2, p1, p2}, Llq2/a;->b(ZLkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lh02/l0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lh02/h0;->i(Lh02/l0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Leo0/c;->c(Lcom/whoop/design/util/TextResource;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lt00/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, Lam0/b;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    invoke-static {v1, v0, p1, p2}, Lse/g;->l(ZLt00/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lgz0/m0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lc41/h5;->b(Lgz0/m0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lc41/a0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lc41/z;->b(Lc41/a0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lbr2/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lbr2/m;->a(Lbr2/j;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lb72/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lb72/b;->f(Lb72/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lb72/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lb72/b;->e(Lb72/e;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, p1, v2, p2}, Lb30/a5;->c(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lam0/b;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    invoke-static {v1, v0, p1, p2}, Lio/sentry/config/a;->f(ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lam0/b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lam0/b;->x:Z

    iget v2, p0, Lam0/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lam0/d;->b(Ljava/util/List;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
