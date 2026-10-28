.class public final synthetic Lbm2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lbm2/s;->w:I

    iput-object p2, p0, Lbm2/s;->x:Lp1/c1;

    iput-object p3, p0, Lbm2/s;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbm2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lzc1/z1;->f(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lzc1/z1;->a(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lzc1/z1;->g(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lzc1/z1;->m(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lzc1/z1;->k(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lvp1/h;->g(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lvp1/h;->R(Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lbm2/s;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/s;->y:Lp1/c1;

    invoke-static {v0, v1}, Lbm2/e0;->x(Lp1/c1;Lp1/c1;)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
