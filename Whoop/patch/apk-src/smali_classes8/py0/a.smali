.class public final synthetic Lpy0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lpy0/a;->w:I

    iput-object p1, p0, Lpy0/a;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpy0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lzt2/i;->f(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lzi1/q;->a(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Ly11/k;->e(Lc93/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lpy0/a;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lx11/b;->c(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Success;

    invoke-static {v0, p1}, Lwt1/a;->e(Lc93/a;Lcoil/compose/AsyncImagePainter$State$Success;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lwo1/o;->c(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Ls80/c;->e(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lry0/b;->a(Lc93/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Lrm2/e;->c(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lr90/f;->a(Lc93/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;->a(Lc93/a;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->f(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->q(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->j(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->A(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->g(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->o(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->k(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->J(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->I(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->r(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->c(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->z(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->D(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->v(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->E(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lpy0/a;->x:Lc93/a;

    invoke-static {v0, p1}, Lpy0/b;->i(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
