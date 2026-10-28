.class public final synthetic Lre1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lre1/k;->w:I

    iput-object p2, p0, Lre1/k;->x:Ljava/lang/Object;

    iput-object p3, p0, Lre1/k;->z:Ljava/lang/Object;

    iput-object p4, p0, Lre1/k;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lre1/k;->w:I

    iput-object p1, p0, Lre1/k;->x:Ljava/lang/Object;

    iput-object p2, p0, Lre1/k;->y:Ljava/lang/Object;

    iput-object p3, p0, Lre1/k;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lre1/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lxd0/e$c;

    invoke-static {v0, v1, v2}, Lzd0/b;->c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxd0/e$c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/a1;

    invoke-static {v0, v1, v2}, Lz80/a;->a(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lp1/a1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lwt2/q$c;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lyt2/m;->q(Lkotlin/jvm/functions/Function1;Lwt2/q$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lxc2/a;

    iget-object v1, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lyc2/c;->c(Lxc2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lwb0/i$d;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lyb0/k;->e(Lkotlin/jvm/functions/Function1;Lwb0/i$d;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lxq2/d0;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lb3/x2;

    invoke-static {v0, v1, v2}, Lxq2/b0;->h(Lxq2/d0;Lkotlin/jvm/functions/Function1;Lb3/x2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lvh0/e;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lqh0/b;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lxh0/c;->q(Lvh0/e;Lqh0/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lx30/w;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lv30/e;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v0, v0, Lx30/w;->a:Lb5/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb5/d;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k1;

    const-string v3, "KEY_HAS_AUTOMATICALLY_LAUNCHED_CARD_SCAN"

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v4, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1, v2}, Lv30/e;->a(Landroid/content/Context;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lx21/a;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lx21/d;->f(Lx21/a;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lso1/c;

    invoke-static {v0, v1, v2}, Lwo1/f0;->d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lso1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lua2/a;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lwa2/a;->c(Lkotlin/jvm/functions/Function1;Lua2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lvy0/z;

    invoke-static {v0, v1, v2}, Lvy0/c0;->c(Lc93/a;Lkotlin/jvm/functions/Function1;Lvy0/z;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lso1/e0;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lvo1/r;->m(Lso1/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lv90/s;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lv90/u;->a(Lv90/s;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lv80/c;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lv80/b;->e(Lkotlin/jvm/functions/Function1;Lv80/c;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lv71/i;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lv71/h;->c(Lv71/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Luz0/i;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Luz0/g;->a(Lkotlin/jvm/functions/Function1;Luz0/i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Luu2/h0;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v0, v1, v2}, Luu2/c0;->b(Luu2/h0;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Leb/a0;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Leb/a0;

    invoke-static {v0, v1, v2}, Luu2/w;->n(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/a0;Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Leb/a0;

    invoke-static {v0, v1, v2}, Luu2/l;->t(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/u0;Leb/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/analytics/ScreenAnalyticEventModel;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/navigation/CachePolicyModel;

    invoke-static {v0, v1, v2}, Lui0/n;->k(Lcom/whoop/analytics/ScreenAnalyticEventModel;Ljava/lang/String;Lcom/whoop/navigation/CachePolicyModel;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lsf0/c$d;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lny0/h;

    invoke-static {v0, v1, v2}, Luf0/g;->g(Lkotlin/jvm/functions/Function1;Lsf0/c$d;Lny0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v1, Lpv0/d;

    iget-object v2, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ltv0/b;->c(Lkotlin/jvm/functions/Function1;Lpv0/d;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Ltu1/g;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Ltu1/f;->f(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lsp0/j;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Ltp0/e;->f(Lkotlin/jvm/functions/Function1;Lsp0/j;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v1, Lqb2/a;

    iget-object v2, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lsb2/b;->b(Lkotlin/jvm/functions/Function1;Lqb2/a;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Ls90/c;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Ls90/g;->m(Lkotlin/jvm/functions/Function1;Ls90/c;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lvn1/q;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-static {v0, v1, v2}, Lrm1/i;->g(Lvn1/q;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lre1/k;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lre1/k;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lre1/k;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/educationModels/MediaHeader;

    invoke-static {v0, v1, v2}, Lre1/l;->e(Lc93/m;Ljava/lang/String;Lcom/whoop/educationModels/MediaHeader;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
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
