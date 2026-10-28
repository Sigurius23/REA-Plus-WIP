.class final Lcom/whoop/settings/strap/StrapSettingsFragment$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/strap/StrapSettingsFragment;->x0()V
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
    c = "com.whoop.settings.strap.StrapSettingsFragment$requestBluetoothPermissions$1"
    f = "StrapSettingsFragment.kt"
    l = {
        0x108
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/settings/strap/StrapSettingsFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/strap/StrapSettingsFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/strap/StrapSettingsFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/strap/StrapSettingsFragment$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->y:Lcom/whoop/settings/strap/StrapSettingsFragment;

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

    new-instance p1, Lcom/whoop/settings/strap/StrapSettingsFragment$b;

    iget-object v0, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->y:Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/settings/strap/StrapSettingsFragment$b;-><init>(Lcom/whoop/settings/strap/StrapSettingsFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/strap/StrapSettingsFragment$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->w:Ljava/lang/Object;

    check-cast v0, Lsc2/s;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->y:Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {p1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->Z(Lcom/whoop/settings/strap/StrapSettingsFragment;)Lsc2/s;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->y:Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->Y(Lcom/whoop/settings/strap/StrapSettingsFragment;)Lm32/c;

    move-result-object v1

    iput-object p1, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/settings/strap/StrapSettingsFragment$b;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v3, p0, v2, v4}, Lm32/c;->s(Lm32/c;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Lm32/e;

    invoke-virtual {v0, p1}, Lsc2/s;->c1(Lm32/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
