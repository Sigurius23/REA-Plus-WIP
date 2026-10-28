.class public final Lbm/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/d0;FLq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lbm/h;->w:I

    .line 1
    iput-object p1, p0, Lbm/h;->z:Ljava/lang/Object;

    iput p2, p0, Lbm/h;->x:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ly3/c;Lbm/t;FLq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbm/h;->w:I

    .line 2
    iput-object p1, p0, Lbm/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbm/h;->z:Ljava/lang/Object;

    iput p3, p0, Lbm/h;->x:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lbm/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lbm/h;

    iget-object v1, p0, Lbm/h;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/d0;

    iget v2, p0, Lbm/h;->x:F

    invoke-direct {v0, v1, v2, p2}, Lbm/h;-><init>(Lkotlin/jvm/internal/d0;FLq83/d;)V

    iput-object p1, v0, Lbm/h;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance p1, Lbm/h;

    iget-object v0, p0, Lbm/h;->y:Ljava/lang/Object;

    check-cast v0, Ly3/c;

    iget-object v1, p0, Lbm/h;->z:Ljava/lang/Object;

    check-cast v1, Lbm/t;

    iget v2, p0, Lbm/h;->x:F

    invoke-direct {p1, v0, v1, v2, p2}, Lbm/h;-><init>(Ly3/c;Lbm/t;FLq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbm/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbm/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lbm/h;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget v2, p0, Lbm/h;->x:F

    iget-object v3, p0, Lbm/h;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbm/h;->y:Ljava/lang/Object;

    check-cast p1, Lh0/k2;

    check-cast v3, Lkotlin/jvm/internal/d0;

    invoke-interface {p1, v2}, Lh0/k2;->a(F)F

    move-result p1

    iput p1, v3, Lkotlin/jvm/internal/d0;->w:F

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbm/h;->y:Ljava/lang/Object;

    check-cast p1, Ly3/c;

    check-cast v3, Lbm/t;

    invoke-interface {p1, v2}, Ly3/c;->F(F)I

    move-result p1

    iget-object v0, v3, Lbm/t;->c:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
