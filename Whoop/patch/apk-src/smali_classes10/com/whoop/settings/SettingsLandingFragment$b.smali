.class final Lcom/whoop/settings/SettingsLandingFragment$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/SettingsLandingFragment;->H1(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.settings.SettingsLandingFragment$initClickListeners$16$1$1"
    f = "SettingsLandingFragment.kt"
    l = {
        0x2a8
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
            "Lcom/whoop/settings/SettingsLandingFragment$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->x:Lcom/whoop/settings/SettingsLandingFragment;

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

    new-instance p1, Lcom/whoop/settings/SettingsLandingFragment$b;

    iget-object v0, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/settings/SettingsLandingFragment$b;-><init>(Lcom/whoop/settings/SettingsLandingFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/SettingsLandingFragment$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/SettingsLandingFragment$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {p1}, Lcom/whoop/settings/SettingsLandingFragment;->M0(Lcom/whoop/settings/SettingsLandingFragment;)Lz92/a;

    move-result-object p1

    iput v2, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->w:I

    invoke-interface {p1, p0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/User;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    iget-object v1, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v1}, Lcom/whoop/settings/SettingsLandingFragment;->K0(Lcom/whoop/settings/SettingsLandingFragment;)Lor2/y;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    const-string v3, "requireActivity(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/whoop/settings/SettingsLandingFragment$b;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v3}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v5, Ljs0/c;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v3, v6, v5, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljs0/c;

    sget-object v5, Lea2/i;->a:Lea2/i;

    invoke-virtual {v3}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v3

    invoke-virtual {v5}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v5

    const-class v8, Ljava/lang/String;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_1

    :cond_3
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-static {v3}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_1

    :cond_4
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_1

    :cond_5
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-static {v3}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_1

    :cond_6
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    invoke-static {v3}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_1

    :cond_7
    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v3, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_1

    :cond_8
    move-object v6, v5

    :cond_9
    :goto_1
    if-nez v6, :cond_a

    goto :goto_2

    :cond_a
    move-object v5, v6

    :goto_2
    if-eqz v5, :cond_b

    check-cast v5, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Lor2/y;->x(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-object v0

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    return-object v0
.end method
