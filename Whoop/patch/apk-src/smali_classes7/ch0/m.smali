.class public final synthetic Lch0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lch0/m;->w:I

    iput-object p2, p0, Lch0/m;->x:Ljava/lang/Object;

    iput-object p3, p0, Lch0/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lch0/v0;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lch0/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/m;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/m;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch0/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/m;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lch0/m;->y:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    invoke-static {v0, v1}, Lch0/c1;->f(Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/m;->x:Ljava/lang/Object;

    check-cast v0, Lsl0/n0;

    iget-object v1, p0, Lch0/m;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    invoke-static {v0, v1}, Lch0/w0;->c(Lsl0/n0;Ll83/h;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lch0/m;->y:Ljava/lang/Object;

    check-cast v0, Lch0/v0;

    iget-object v1, p0, Lch0/m;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-static {v0, v1}, Lch0/c1$m;->i(Lch0/v0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lch0/m;->x:Ljava/lang/Object;

    check-cast v0, Lch0/o0;

    iget-object v1, p0, Lch0/m;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1}, Lch0/q0$h;->f(Lch0/o0;Lp1/t2;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lch0/m;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lch0/m;->y:Ljava/lang/Object;

    check-cast v1, Ly3/c;

    invoke-static {v0, v1}, Lch0/m0$h;->f(Lp1/t2;Ly3/c;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lch0/m;->x:Ljava/lang/Object;

    check-cast v0, Lnl0/g;

    iget-object v1, p0, Lch0/m;->y:Ljava/lang/Object;

    check-cast v1, Lch0/v0;

    invoke-static {v0, v1}, Lch0/n$a;->f(Lnl0/g;Lch0/v0;)Ll83/a0;

    move-result-object v0

    return-object v0

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
