.class public final Ly2/t1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly2/u1;


# direct methods
.method public synthetic constructor <init>(Ly2/u1;I)V
    .locals 0

    iput p2, p0, Ly2/t1;->w:I

    iput-object p1, p0, Ly2/t1;->x:Ly2/u1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ly2/t1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, La3/n0;

    check-cast p2, Ly2/u1;

    iget-object p2, p0, Ly2/t1;->x:Ly2/u1;

    iget-object v0, p2, Ly2/u1;->a:Ly2/x1;

    iget-object v1, p1, La3/n0;->f0:Ly2/n0;

    if-nez v1, :cond_0

    new-instance v1, Ly2/n0;

    invoke-direct {v1, p1, v0}, Ly2/n0;-><init>(La3/n0;Ly2/x1;)V

    iput-object v1, p1, La3/n0;->f0:Ly2/n0;

    :cond_0
    iput-object v1, p2, Ly2/u1;->b:Ly2/n0;

    invoke-virtual {p2}, Ly2/u1;->a()Ly2/n0;

    move-result-object p1

    invoke-virtual {p1}, Ly2/n0;->d()V

    invoke-virtual {p2}, Ly2/u1;->a()Ly2/n0;

    move-result-object p1

    iget-object p2, p1, Ly2/n0;->y:Ly2/x1;

    if-eq p2, v0, :cond_1

    iput-object v0, p1, Ly2/n0;->y:Ly2/x1;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ly2/n0;->g(Z)V

    iget-object p1, p1, Ly2/n0;->w:La3/n0;

    const/4 v0, 0x7

    invoke-static {p1, p2, v0}, La3/n0;->v0(La3/n0;ZI)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, La3/n0;

    check-cast p2, Lc93/m;

    iget-object v0, p0, Ly2/t1;->x:Ly2/u1;

    invoke-virtual {v0}, Ly2/u1;->a()Ly2/n0;

    move-result-object v0

    iget-object v1, v0, Ly2/n0;->P:Ljava/lang/String;

    new-instance v2, Ly2/k0;

    invoke-direct {v2, v0, p2, v1}, Ly2/k0;-><init>(Ly2/n0;Lc93/m;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, La3/n0;->D0(Ly2/r0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, La3/n0;

    check-cast p2, Lp1/t;

    iget-object p1, p0, Ly2/t1;->x:Ly2/u1;

    invoke-virtual {p1}, Ly2/u1;->a()Ly2/n0;

    move-result-object p1

    iput-object p2, p1, Ly2/n0;->x:Lp1/t;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
