.class public final synthetic Leu/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Leu/k;->w:I

    iput-object p2, p0, Leu/k;->x:Ljava/lang/Object;

    iput-object p3, p0, Leu/k;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq81/b;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x6

    iput v0, p0, Leu/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/k;->y:Ljava/lang/Object;

    iput-object p2, p0, Leu/k;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 6

    iget v0, p0, Leu/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v0, Lq81/b;

    iget-object v1, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1, p1, p2}, Lq81/a;->b(Lq81/b;Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    iget-object v1, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Q(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    invoke-static {v0, v1, p1, p2}, Ljs2/i;->b(Landroid/content/Context;Ll83/h;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1, p1, p2}, Ljs2/i;->a(Lp1/t2;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/integrations/view/IntegrationsFragment;

    iget-object v1, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/integrations/view/IntegrationsFragment;->F(Lcom/whoop/integrations/view/IntegrationsFragment;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast p1, Lh5/n;

    iget-object v0, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v0, Lh5/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v1, :cond_0

    invoke-virtual {p1, v0}, Lh5/n;->b(Lh5/o;)V

    :cond_0
    return-void

    :pswitch_5
    iget-object v0, p0, Leu/k;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Leu/k;->y:Ljava/lang/Object;

    check-cast v1, Lup/c;

    const-string v2, "$previousState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$this_lifecycleObserver"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lup/c;->w:Lev/i;

    const-string v3, "<anonymous parameter 0>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/lifecycle/v;->a()Landroidx/lifecycle/w;

    sget-object p1, Leu/r;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget p1, p1, v3

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x5

    packed-switch p1, :pswitch_data_1

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_6
    iget-object p1, v2, Lev/i;->a:Ljava/lang/Object;

    check-cast p1, Lq30/w0;

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p1, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lvp/f;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p1, v1, v5}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Lev/i;->n(I)V

    goto/16 :goto_2

    :pswitch_7
    iget-object p1, v2, Lev/i;->a:Ljava/lang/Object;

    check-cast p1, Lq30/w0;

    if-eqz p1, :cond_2

    :try_start_1
    iget-object p1, p1, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lvp/f;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {p1, v1, v2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    invoke-virtual {v2, v4}, Lev/i;->n(I)V

    goto/16 :goto_2

    :pswitch_8
    iget-object p1, v2, Lev/i;->a:Ljava/lang/Object;

    check-cast p1, Lq30/w0;

    if-eqz p1, :cond_3

    :try_start_2
    iget-object p1, p1, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lvp/f;

    invoke-virtual {p1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v1

    invoke-virtual {p1, v1, v4}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    new-instance p2, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    invoke-virtual {v2, v5}, Lev/i;->n(I)V

    goto :goto_2

    :pswitch_9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lcp/e;

    const/4 v1, 0x1

    invoke-direct {p1, v2, v1}, Lcp/e;-><init>(Lev/i;I)V

    invoke-virtual {v2, v3, p1}, Lev/i;->o(Landroid/os/Bundle;Lcp/f;)V

    goto :goto_2

    :pswitch_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lcp/e;

    const/4 v1, 0x0

    invoke-direct {p1, v2, v1}, Lcp/e;-><init>(Lev/i;I)V

    invoke-virtual {v2, v3, p1}, Lev/i;->o(Landroid/os/Bundle;Lcp/f;)V

    goto :goto_2

    :pswitch_b
    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v3, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-eq p1, v3, :cond_5

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Landroid/os/StrictMode;->getThreadPolicy()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v3

    new-instance v4, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v4, v3}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>(Landroid/os/StrictMode$ThreadPolicy;)V

    invoke-virtual {v4}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v4

    invoke-static {v4}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lcp/c;

    invoke-direct {v4, v2, p1}, Lcp/c;-><init>(Lev/i;Landroid/os/Bundle;)V

    invoke-virtual {v2, p1, v4}, Lev/i;->o(Landroid/os/Bundle;Lcp/f;)V

    iget-object p1, v2, Lev/i;->a:Ljava/lang/Object;

    check-cast p1, Lq30/w0;

    if-nez p1, :cond_4

    invoke-static {v1}, Lev/i;->l(Landroid/widget/FrameLayout;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_2

    :goto_1
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p1

    :cond_5
    :goto_2
    invoke-interface {v0, p2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
