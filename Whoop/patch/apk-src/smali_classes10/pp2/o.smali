.class public final synthetic Lpp2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lpp2/o;->w:I

    iput-object p2, p0, Lpp2/o;->x:Ljava/lang/Object;

    iput-object p3, p0, Lpp2/o;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lpp2/o;->w:I

    iput-object p1, p0, Lpp2/o;->x:Ljava/lang/Object;

    iput-object p2, p0, Lpp2/o;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lpp2/o;->w:I

    iput-object p1, p0, Lpp2/o;->y:Ljava/lang/Object;

    iput-object p2, p0, Lpp2/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lpp2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lx30/e;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x9

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lrg/j;->a(Lx30/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lx20/w;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ls9/f;->k(Lx20/w;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lh40/k;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x41

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lwz/n1;->a(Lwz/y;Lh40/k;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Ltq1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->z(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Ltq1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lwo1/n0;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lwo1/m0;->b(Lwo1/n0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lso1/s;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lwo1/r;->e(Lso1/s;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lwo1/g;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lwo1/f;->a(Lwo1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lw71/t;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lw71/l;->k(Lw71/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lw41/z;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lw41/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lw41/e;->b(Lw41/z;Lw41/o;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v1, Lv90/r;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lp90/e;

    invoke-static {v0, v1, p1, p2}, Lv90/q;->b(Lkotlin/jvm/functions/Function1;Lv90/r;ZLp90/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v1, Lv90/g;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lp90/e;

    invoke-static {v0, v1, p1, p2}, Lv90/f;->d(Lkotlin/jvm/functions/Function1;Lv90/g;ZLp90/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/components/ReferralsTileViewState;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/profile/view/components/ReferralsTileKt;->i(Lcom/whoop/profile/view/components/ReferralsTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lv21/c;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lv21/b;->b(Lv21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    const-string v2, "str"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lug/f;

    iget p2, p1, Lug/f;->a:I

    iget-object p1, p1, Lug/f;->b:Ljava/lang/Object;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Lug/f;

    invoke-direct {v0, p2, p1}, Lug/f;-><init>(ILjava/lang/Object;)V

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Leb/x0;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    check-cast p2, Lcom/whoop/journal/model/CurrentCycle;

    invoke-static {v0, v1, v2, v3, p2}, Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;->K(Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;Leb/x0;JLcom/whoop/journal/model/CurrentCycle;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lu71/k;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lu71/g;->a(Lu71/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x31

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lu0/n0;->b(Lf1/w0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Ltx0/g;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ltx0/d;->i(Ltx0/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v1, Lsp0/d;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Ltp0/b;->b(Lkotlin/jvm/functions/Function1;Lsp0/d;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lt01/c;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lt01/f;->g(Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lrq2/y;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lrq2/c0;->e(Lrq2/y;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lrq2/a;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lrq2/e;->b(Lrq2/a;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lm91/n;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lrm1/f;->e(Lm91/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lqz0/c;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lqz0/k;->c(Lqz0/c;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lpu2/a;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lqu2/h;->h(Lpu2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lqt2/r;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lqt2/s;->b(Lqt2/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lm72/k;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lq72/d;->a(Lm72/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lzy/c;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lse/h;->c(Lzy/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Ln0/r;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, v0, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr p1, p2

    iget-object p2, v1, Ln0/r;->b:Lh0/k2;

    invoke-interface {p2, p1}, Lh0/k2;->a(F)F

    move-result p1

    iget p2, v0, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr p2, p1

    iput p2, v0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lpp2/o;->x:Ljava/lang/Object;

    check-cast v0, Lnp2/c;

    iget-object v1, p0, Lpp2/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lpp2/p;->e(Lnp2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
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
