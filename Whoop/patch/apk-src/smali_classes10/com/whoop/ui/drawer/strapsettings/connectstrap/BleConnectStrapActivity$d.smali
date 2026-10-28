.class final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$resetTimeout$1"
    f = "BleConnectStrapActivity.kt"
    l = {
        0x25c,
        0x262
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {p1, v0, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->w:I

    const-wide/16 v4, 0x4e20

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lbc3/k1;->isActive()Z

    move-result p1

    if-ne p1, v3, :cond_6

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ltr2/n;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v3, "Failing due to timeout"

    invoke-interface {p1, v3, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lqm2/m;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-virtual {p1}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v4}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lqm2/m;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lqm2/m;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v5}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->j0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1, v3, v4, v5}, Lz82/e;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_1

    :cond_4
    const-string p1, "selectedBluetoothDevice"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->a0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lin2/d;

    move-result-object p1

    invoke-interface {p1}, Lin2/d;->a()Lq83/j;

    move-result-object p1

    new-instance v3, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d$a;

    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {v3, v4, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d$a;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

    iput v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;->w:I

    invoke-static {p1, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
