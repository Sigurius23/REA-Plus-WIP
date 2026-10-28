.class public final synthetic Lb30/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lb30/t2;->w:I

    iput-object p1, p0, Lb30/t2;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/t2;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZII)V
    .locals 0

    .line 2
    iput p4, p0, Lb30/t2;->w:I

    iput-object p1, p0, Lb30/t2;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/t2;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLcj1/r;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lb30/t2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/t2;->x:Z

    iput-object p2, p0, Lb30/t2;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;II)V
    .locals 0

    .line 4
    iput p4, p0, Lb30/t2;->w:I

    iput-boolean p1, p0, Lb30/t2;->x:Z

    iput-object p2, p0, Lb30/t2;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb30/t2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lzm1/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lzm1/e;->h(Lzm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lyi1/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lzi1/a0;->b(Lyi1/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lxq2/l;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lxq2/q0;->c(Lxq2/l;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Ltp1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lvp1/h;->W(Ltp1/b;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lu0/n0;->f(Lf1/s1;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lrq2/y;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lrq2/c0;->g(Lrq2/y;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lmm1/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lmm1/e;->b(Lmm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lj72/l;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Ll72/p;->b(Lj72/l;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v1, v0, p1, p2}, Lse/b;->j(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lg40/z1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Ldp/d;->c(Lg40/z1;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lcj1/r;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v1, v0, p1, p2}, Lfj1/e;->b(ZLcj1/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->y(Lcom/whoop/tiltgraph/view/TiltGraphFragment;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, Lh20/l;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v0, v1, p1, p2}, Lds/q;->j(Lh20/l;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lb30/t2;->y:Ljava/lang/Object;

    check-cast v0, La30/k1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v1, p0, Lb30/t2;->x:Z

    invoke-static {v1, v0, p1, p2}, Lds/p;->k(ZLa30/k1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
