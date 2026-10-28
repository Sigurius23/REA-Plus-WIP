.class public final synthetic Ll;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ll;->w:I

    iput-object p2, p0, Ll;->x:Ljava/lang/Object;

    iput-object p3, p0, Ll;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Ll;->w:I

    iput-object p1, p0, Ll;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lhh2/g;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/stealthmode/view/StealthModeFragment;

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/stealthmode/view/StealthModeFragment;->I(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lf60/c$c;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lh60/g;->d(Lf60/c$c;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lh02/i0;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/s0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lh02/h0;->k(Lh02/i0;Lkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lh0/f1;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lv2/c;

    check-cast p1, Lu2/r;

    check-cast p2, Lu2/r;

    check-cast p3, Lh2/b;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lh0/f1;->X:J

    iget-object v4, v0, Lh0/f1;->R:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lh0/f1;->W:Z

    if-nez v4, :cond_1

    iget-object v4, v0, Lh0/f1;->U:Ldc3/h;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    const v4, 0x7fffffff

    const/4 v6, 0x6

    invoke-static {v4, v6, v5}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v4

    iput-object v4, v0, Lh0/f1;->U:Ldc3/h;

    :cond_0
    const/4 v4, 0x1

    iput-boolean v4, v0, Lh0/f1;->W:Z

    invoke-virtual {v0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v4

    new-instance v6, Lh0/e1;

    invoke-direct {v6, v0, v5}, Lh0/e1;-><init>(Lh0/f1;Lq83/d;)V

    const/4 v7, 0x3

    invoke-static {v4, v5, v5, v6, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    invoke-static {v1, p1, v2, v3}, Lsb3/a;->a(Lv2/c;Lu2/r;J)V

    iget-wide p1, p2, Lu2/r;->c:J

    iget-wide v1, p3, Lh2/b;->a:J

    invoke-static {p1, p2, v1, v2}, Lh2/b;->g(JJ)J

    move-result-wide p1

    iget-object p3, v0, Lh0/f1;->U:Ldc3/h;

    if-eqz p3, :cond_2

    new-instance v0, Lh0/i0;

    invoke-direct {v0, p1, p2}, Lh0/i0;-><init>(J)V

    invoke-interface {p3, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lep2/c$a;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lgp2/e;->c(Lep2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lep2/c;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lgp2/d;->b(Lep2/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Ll;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll;->x:Ljava/lang/Object;

    check-cast v1, Lf41/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lf41/p;->s(Lkotlin/jvm/functions/Function1;Lf41/e;ZZI)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lcy0/c;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Ley0/i;->i(Lcy0/c;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lcv1/c;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lev1/f;->a(Lcv1/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Leu2/p;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Lo11/m$b;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Leu2/o;->b(Leu2/p;Landroidx/compose/ui/Modifier;Lo11/m$b;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lg51/c;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lz1/p;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lep1/h;->d(Lg51/c;Lz1/p;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Leo2/g;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Leo2/m;->e(Leo2/g;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lbo0/c;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Leo0/g;->m(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lbn0/e;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Ldn0/p;->e(Lbn0/e;Lp1/h1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lc42/q;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Ld42/p;->m(Lc42/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/weightlifting/StrengthTrainerDestination;

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/weightlifting/a;->e(Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    check-cast p1, Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/weightlifting/a;->r(Leb/u0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/profile/view/ProfileScreenContentKt;->m(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lc42/r;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, La42/a;

    check-cast p1, Leb/q;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->H(Lc42/r;La42/a;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lc41/p2;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lm91/o;

    check-cast p1, Lm91/u;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lc41/r2;->e(Lc41/p2;Lm91/o;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lc11/i;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lc11/h;->r(Lc11/i;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lc11/i;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lc11/b;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lc11/h;->t(Lc11/i;Lc11/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lbu2/q;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lbu2/x;->h(Lbu2/q;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lbu2/n;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lbu2/m;->d(Lbu2/n;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lbd1/n;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lbd1/m;

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lbd1/m;->c(Lbd1/n;Lbd1/m;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Ll;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll;->x:Ljava/lang/Object;

    check-cast v1, Lzt1/c$c;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lau1/q;->i(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lzt1/b;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lau1/q;->h(Lzt1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Ly70/c$a;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, La80/l;->d(Ly70/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    check-cast v1, Lg1/m1;

    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, La11/q;->o(Lcom/whoop/design/util/TextResource;Lg1/m1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Ll;->x:Ljava/lang/Object;

    check-cast v0, Lpv0/d;

    iget-object v1, p0, Ll;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const-string v1, "$this$item"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq p1, v1, :cond_3

    move p1, v2

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v6, p2

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lpv0/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lpv0/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p2, p1, 0x3

    or-int/2addr p2, p1

    shl-int/lit8 p1, p1, 0x6

    or-int v7, p2, p1

    invoke-static/range {v2 .. v7}, Lx;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
