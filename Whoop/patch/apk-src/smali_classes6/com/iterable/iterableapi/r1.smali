.class public final Lcom/iterable/iterableapi/r1;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/iterable/iterableapi/r1;->a:I

    iput-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method public constructor <init>(Llq0/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/iterable/iterableapi/r1;->a:I

    .line 2
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 6

    iget v0, p0, Lcom/iterable/iterableapi/r1;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    return-void

    :pswitch_1
    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast v0, Lz33/b;

    invoke-virtual {v0}, Lz33/b;->b()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[callback#onAvailable] #network; onAvailable :: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {v0}, Lz33/b;->a(Lz33/b;)V

    return-void

    :pswitch_2
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    iget-object v1, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string p1, "NetworkConnectivityManager"

    const-string v1, "Network Connected"

    invoke-static {p1, v1}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Lb9/b;->x:Z

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, v0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/iterable/iterableapi/d2;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/d2;->c()V

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 5

    iget v0, p0, Lcom/iterable/iterableapi/r1;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    return-void

    :pswitch_0
    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "networkCapabilities"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast p1, Lz33/b;

    invoke-virtual {p1}, Lz33/b;->b()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[callback#onCapabilitiesChanged] #network; onCapabilitiesChanged :: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lz33/b;->a(Lz33/b;)V

    return-void

    :pswitch_1
    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "networkCapabilities"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object p2, Lmc/i;->a:Ljava/lang/String;

    const-string v0, "NetworkRequestConstraintController onCapabilitiesChanged callback"

    invoke-virtual {p1, p2, v0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast p1, Llq0/d;

    sget-object p2, Lmc/a;->a:Lmc/a;

    invoke-virtual {p1, p2}, Llq0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 6

    iget v0, p0, Lcom/iterable/iterableapi/r1;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast v0, Lz33/b;

    invoke-virtual {v0}, Lz33/b;->b()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[callback#onLost] #network; onLost :: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, v0, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast p1, Lz33/b;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lz33/b;->f:Z

    iget-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast p1, Lz33/b;

    iget-object v0, p1, Lz33/b;->g:Ljava/lang/Object;

    iget-object p1, p1, Lz33/b;->a:Lbc3/c0;

    new-instance v1, Lz33/a;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v3, v2}, Lz33/a;-><init>(Ljava/util/Set;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :pswitch_0
    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object v0, Lmc/i;->a:Ljava/lang/String;

    const-string v1, "NetworkRequestConstraintController onLost callback"

    invoke-virtual {p1, v0, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast p1, Llq0/d;

    new-instance v0, Lmc/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lmc/b;-><init>(I)V

    invoke-virtual {p1, v0}, Llq0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    const-string v0, "NetworkConnectivityManager"

    const-string v1, "Network Disconnected"

    invoke-static {v0, v1}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/r1;->b:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    iget-object v1, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, v0, Lb9/b;->x:Z

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, v0, Lb9/b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/iterable/iterableapi/d2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
