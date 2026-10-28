.class public final synthetic Ljp1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ljp1/k;->w:I

    iput-object p1, p0, Ljp1/k;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljp1/k;->x:Ljava/lang/Object;

    iput-object p3, p0, Ljp1/k;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Ljp1/k;->w:I

    iput-object p1, p0, Ljp1/k;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljp1/k;->x:Ljava/lang/Object;

    iput-object p3, p0, Ljp1/k;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Ljp1/k;->w:I

    iput-object p1, p0, Ljp1/k;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljp1/k;->z:Ljava/lang/Object;

    iput-object p3, p0, Ljp1/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Llg2/b;)V
    .locals 1

    .line 4
    const/4 v0, 0x6

    iput v0, p0, Ljp1/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/k;->x:Ljava/lang/Object;

    iput-object p2, p0, Ljp1/k;->z:Ljava/lang/Object;

    iput-object p3, p0, Ljp1/k;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lv20/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 5
    const/16 p4, 0x1c

    iput p4, p0, Ljp1/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/k;->y:Ljava/lang/Object;

    iput-object p2, p0, Ljp1/k;->z:Ljava/lang/Object;

    iput-object p3, p0, Ljp1/k;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ljp1/k;->w:I

    const/4 v1, 0x7

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, Ljp1/k;->z:Ljava/lang/Object;

    iget-object v5, p0, Ljp1/k;->x:Ljava/lang/Object;

    iget-object v6, p0, Ljp1/k;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Lv21/c;

    check-cast v5, Lcom/whoop/design/util/TextResource;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lv21/b;->e(Lv21/c;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v6, Lv20/s;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v5, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v4, v5, p1, p2}, Lrg/a;->c(Lv20/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_1
    check-cast v6, Lv20/a;

    check-cast v5, Ljava/lang/String;

    check-cast v4, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lsc3/l;->b(Lv20/a;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_2
    check-cast v6, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    check-cast v5, Lu10/q;

    check-cast v4, Lu10/p;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p2, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->G:I

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v6, v5, v4, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->o(Lu10/q;Lu10/p;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_3
    check-cast v6, Landroidx/compose/ui/Modifier;

    check-cast v5, Lf1/s1;

    check-cast v4, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x181

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lu0/n0;->e(Landroidx/compose/ui/Modifier;Lf1/s1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_4
    check-cast v6, Ltu1/g;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v4, v5, p1, p2}, Ltu1/f;->j(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v6, Landroidx/compose/ui/Modifier;

    check-cast v5, Lt71/f;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lt71/q;->b(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast v6, Lt10/j;

    check-cast v5, Lc93/a;

    check-cast v4, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lt10/o;->b(Lt10/j;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_7
    check-cast v6, Ljava/lang/String;

    check-cast v5, Lcom/whoop/ui/home/HomeAuthWebViewFragment;

    check-cast v4, Lj02/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lcom/whoop/ui/home/HomeAuthWebViewFragment;->z(Ljava/lang/String;Lcom/whoop/ui/home/HomeAuthWebViewFragment;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast v6, Lbc3/c0;

    check-cast v5, Ldp0/g;

    check-cast v4, Lc93/m;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lrs2/c;->b(Lbc3/c0;Ldp0/g;Lc93/m;Ljava/lang/Object;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast v6, Lmm1/k;

    check-cast v5, Lrm1/a;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lrm1/m;->d(Lmm1/k;Lrm1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v6, Lqt2/v;

    check-cast v5, Ljava/lang/String;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lqt2/x;->e(Lqt2/v;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v6, Lzy/c;

    check-cast v5, Lq00/p;

    check-cast v4, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x1b1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lse/h;->l(Lzy/c;Lq00/p;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_c
    check-cast v6, Landroidx/compose/ui/Modifier;

    check-cast v5, Ljava/util/List;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lio/sentry/config/a;->a(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_d
    check-cast v6, Lcom/whoop/aiinsights/AiInsightsFragment;

    check-cast v5, Luh0/b;

    check-cast v4, Lp1/t2;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lcom/whoop/aiinsights/AiInsightsFragment;->A(Lcom/whoop/aiinsights/AiInsightsFragment;Luh0/b;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast v6, Lp31/h;

    check-cast v5, Landroidx/compose/ui/Modifier;

    check-cast v4, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lp31/f;->a(Lp31/h;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v6, Lc93/a;

    check-cast v5, Lx1/b;

    check-cast v4, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lp11/e;->j(Lc93/a;Lx1/b;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v6, Llw2/c;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v4, v5, p1, p2}, Low2/f;->e(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v6, Lnv1/h;

    check-cast v5, Lb91/a;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lnv1/c;->g(Lnv1/h;Lb91/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast v6, Llo0/d0;

    check-cast v5, Ljava/lang/Long;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lno0/l0;->z(Llo0/d0;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v6, Lg40/z1;

    check-cast v5, Lg40/m3;

    check-cast v4, Ln00/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x9

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lse/b;->n(Lg40/z1;Lg40/m3;Ln00/c;Landroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_14
    check-cast v6, Lc93/a;

    check-cast v5, Ljx1/f;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lmx1/m;->u(Lc93/a;Ljx1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast v6, Lc93/a;

    check-cast v5, Lc93/a;

    check-cast v4, Ll1/g1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lmf0/e;->l(Lc93/a;Lc93/a;Ll1/g1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast v5, Lp1/c1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v6, Llg2/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v5, v4, v6, p1, p2}, Llg2/c;->c(Lp1/c1;Lkotlin/jvm/functions/Function1;Llg2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast v6, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    check-cast v5, Landroid/content/Context;

    check-cast v4, Ljava/lang/Integer;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Ll03/h;->t(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast v6, Landroid/content/Context;

    check-cast v5, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;

    check-cast v4, Ljava/lang/Integer;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Ll03/h;->v(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast v6, Liw1/b$c;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v5, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/whoop/payments/domain/models/Card;

    invoke-static {v6, v4, v5, p1, p2}, Lkw1/d;->t(Liw1/b$c;Lkotlin/jvm/functions/Function1;Lp1/c1;ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast v6, Lp1/t2;

    check-cast v5, Lcom/whoop/user/journey/view/UserJourneyFragment;

    check-cast v4, Lmq2/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lcom/whoop/user/journey/view/UserJourneyFragment;->z(Lp1/t2;Lcom/whoop/user/journey/view/UserJourneyFragment;Lmq2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast v6, Lc93/a;

    check-cast v5, Lp1/c1;

    check-cast v4, Lj02/j;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Lkd1/d;->n(Lc93/a;Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v6, Lhp1/j;

    check-cast v5, Lp1/c1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v6, v5, v4, p1, p2}, Ljp1/m;->g(Lhp1/j;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
