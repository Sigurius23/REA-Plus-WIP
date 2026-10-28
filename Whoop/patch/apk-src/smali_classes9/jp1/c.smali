.class public final synthetic Ljp1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ljp1/c;->w:I

    iput-object p2, p0, Ljp1/c;->y:Ljava/lang/Object;

    iput-object p3, p0, Ljp1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ljp1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lin1/d;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lln1/q;->e(Lin1/d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Ltr2/n;

    check-cast p1, Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v0, v1, p1}, Llg2/c;->a(Lkotlin/jvm/functions/Function1;Ltr2/n;Lcom/whoop/navigation/models/GenericInteraction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Llf0/r2;

    invoke-static {v0, v1, p1}, Llf0/q2;->a(Lkotlin/jvm/functions/Function1;Llf0/r2;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lld0/e;

    check-cast p1, Ly2/y;

    invoke-static {v0, v1, p1}, Llf0/f2;->h(Lkotlin/jvm/functions/Function1;Lld0/e;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lld0/k;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Llf0/b2;->c(Lkotlin/jvm/functions/Function1;Lld0/k;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Llf0/m1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1, p1}, Llf0/l1;->c(Llf0/m1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Llf0/i1;

    invoke-static {v0, v1, p1}, Llf0/h1;->a(Lkotlin/jvm/functions/Function1;Llf0/i1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Llf0/m0;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Llf0/l0;->d(Llf0/m0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Ll62/b;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lh62/a;

    invoke-static {v0, v1, p1}, Ll62/b;->a(Ll62/b;Ljava/lang/String;Lh62/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/achievements/celebration/d;

    invoke-static {v0, v1, p1}, Lcom/whoop/achievements/celebration/a;->c(Lkotlin/jvm/functions/Function1;Lcom/whoop/achievements/celebration/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Ld0/e;

    check-cast p1, Li2/g0;

    iget-object v0, v0, Ll1/w3;->e:Lm1/g;

    iget-object v0, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    move-object v2, p1

    check-cast v2, Li2/x0;

    iget-wide v2, v2, Li2/x0;->R:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x0

    cmpg-float v3, v2, v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1, p1}, Ll1/n2;->e(FLi2/g0;)F

    move-result v3

    move-object v4, p1

    check-cast v4, Li2/x0;

    invoke-virtual {v4, v3}, Li2/x0;->p(F)V

    invoke-static {v1, p1}, Ll1/n2;->f(FLi2/g0;)F

    move-result p1

    invoke-virtual {v4, p1}, Li2/x0;->r(F)V

    add-float/2addr v0, v2

    div-float/2addr v0, v2

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-static {p1, v0}, Li2/w0;->l(FF)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Li2/x0;->y(J)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li2/j;

    iget-object v0, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v0, Ll1/t1;

    check-cast p1, Lk2/c;

    move-object v1, p1

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    new-instance v3, Li2/c1;

    iget-object p1, v0, Ll1/t1;->X:Ld0/e;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/x;

    iget-wide v4, p1, Li2/x;->a:J

    invoke-direct {v3, v4, v5}, Li2/c1;-><init>(J)V

    const/4 v5, 0x0

    const/16 v6, 0x3c

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll1/n3;

    iget-object v0, p0, Ljp1/c;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/Locale;

    check-cast p1, Ljava/util/List;

    new-instance v1, Ll1/h1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Long;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    new-instance v4, Li93/j;

    const/4 v5, 0x2

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v9, 0x3

    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-direct {v4, v5, v9, v0}, Li93/h;-><init>(III)V

    const/4 v0, 0x4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct/range {v1 .. v7}, Ll1/h1;-><init>(Ljava/lang/Long;Ljava/lang/Long;Li93/j;ILl1/n3;Ljava/util/Locale;)V

    return-object v1

    :pswitch_c
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Ll01/h;

    invoke-static {v0, v1, p1}, Ll01/g;->e(Lkotlin/jvm/functions/Function1;Ll01/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->C(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Ljv2/c$b;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lkv2/b;->c(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lku0/d;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Llu0/c;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lku0/d;->e(Lku0/d;Llu0/c;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lgr1/r;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lkr1/d;->d(Lc93/m;Lgr1/r;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkm0/a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lkm0/b;->a(Lkotlin/jvm/functions/Function1;Lkm0/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lnl2/c$f;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lkl2/k;->c(Lnl2/c$f;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lil2/b;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Lml2/a;

    invoke-static {v0, v1, p1}, Lkl2/k;->b(Lil2/b;Ll83/h;Lml2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lk01/e;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lk01/d;->i(Lk01/e;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lju0/b;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Liu0/a;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lju0/b;->e(Lju0/b;Liu0/a;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lfr1/d;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/integrations/view/IntegrationsFragment;

    check-cast p1, Lfr1/c;

    invoke-static {v0, v1, p1}, Lcom/whoop/integrations/view/IntegrationsFragment;->D(Lfr1/d;Lcom/whoop/integrations/view/IntegrationsFragment;Lfr1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lgr1/h;

    invoke-static {v0, v1, p1}, Ljr1/g;->c(Lkotlin/jvm/functions/Function1;Lgr1/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lgr1/q;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Ljr1/g;->g(Lgr1/q;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lgr1/b;

    invoke-static {v0, v1, p1}, Ljr1/d;->h(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lhp1/m;

    invoke-static {v0, v1, p1}, Ljp1/u;->d(Lkotlin/jvm/functions/Function1;Lhp1/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lhp1/b;

    invoke-static {v0, v1, p1}, Ljp1/f;->h(Lkotlin/jvm/functions/Function1;Lhp1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Ljp1/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Calendar;

    iget-object v1, p0, Ljp1/c;->x:Ljava/lang/Object;

    check-cast v1, Lhp1/b;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Ljp1/f;->b(Ljava/util/Calendar;Lhp1/b;Landroid/content/Context;)Landroid/widget/CalendarView;

    move-result-object p1

    return-object p1

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
