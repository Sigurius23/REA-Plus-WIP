.class public final Li20/m0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/s;


# direct methods
.method public synthetic constructor <init>(Lg2/s;Lq83/d;I)V
    .locals 0

    iput p3, p0, Li20/m0;->w:I

    iput-object p1, p0, Li20/m0;->x:Lg2/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Li20/m0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Li20/m0;

    iget-object v0, p0, Li20/m0;->x:Lg2/s;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Li20/m0;-><init>(Lg2/s;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Li20/m0;

    iget-object v0, p0, Li20/m0;->x:Lg2/s;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Li20/m0;-><init>(Lg2/s;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li20/m0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Li20/m0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/m0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Li20/m0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/m0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Li20/m0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Li20/m0;->x:Lg2/s;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lg2/s;->b()V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Landroidx/fragment/app/m;

    const/16 v3, 0x1a

    invoke-direct {v0, v2, v3}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
