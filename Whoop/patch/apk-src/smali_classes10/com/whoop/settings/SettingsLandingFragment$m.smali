.class final Lcom/whoop/settings/SettingsLandingFragment$m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/SettingsLandingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
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
    c = "com.whoop.settings.SettingsLandingFragment$onViewCreated$1"
    f = "SettingsLandingFragment.kt"
    l = {
        0xc6,
        0xc7,
        0xc9,
        0xca,
        0xcb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/settings/SettingsLandingFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/SettingsLandingFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/SettingsLandingFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/SettingsLandingFragment$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

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

    new-instance p1, Lcom/whoop/settings/SettingsLandingFragment$m;

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/settings/SettingsLandingFragment$m;-><init>(Lcom/whoop/settings/SettingsLandingFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/SettingsLandingFragment$m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$m;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->w:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    iput v6, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->w:I

    invoke-static {p1, p0}, Lcom/whoop/settings/SettingsLandingFragment;->R0(Lcom/whoop/settings/SettingsLandingFragment;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    iput v5, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->w:I

    invoke-static {p1, p0}, Lcom/whoop/settings/SettingsLandingFragment;->O0(Lcom/whoop/settings/SettingsLandingFragment;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->Q0(Lcom/whoop/settings/SettingsLandingFragment;)V

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->N0(Lcom/whoop/settings/SettingsLandingFragment;)Lcom/whoop/settings/m;

    move-result-object p1

    iput v4, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->w:I

    invoke-virtual {p1, p0}, Lcom/whoop/settings/m;->f0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->N0(Lcom/whoop/settings/SettingsLandingFragment;)Lcom/whoop/settings/m;

    move-result-object p1

    iput v3, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->w:I

    invoke-virtual {p1, p0}, Lcom/whoop/settings/m;->g0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->N0(Lcom/whoop/settings/SettingsLandingFragment;)Lcom/whoop/settings/m;

    move-result-object p1

    iput v2, p0, Lcom/whoop/settings/SettingsLandingFragment$m;->w:I

    invoke-virtual {p1, p0}, Lcom/whoop/settings/m;->h0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_4
    return-object v0

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
