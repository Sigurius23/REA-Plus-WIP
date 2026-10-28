.class public final synthetic Lc;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc;->w:I

    iput-object p1, p0, Lc;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc;->y:Ljava/lang/Object;

    iput-object p3, p0, Lc;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lc;->w:I

    iput-object p1, p0, Lc;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc;->z:Ljava/lang/Object;

    iput-object p4, p0, Lc;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lp1/t2;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lc;->w:I

    iput-object p1, p0, Lc;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lqx1/a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/whoop/membership/view/upcycle/b;->e(Lkotlin/jvm/functions/Function1;Lqx1/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lcp0/x0;->B(Ljava/util/List;Lc93/m;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v1, p0, Lc;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lc;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->k(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, La42/a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lc42/q;

    invoke-static {v0, v1, v2}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->T(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;La42/a;Lc42/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lgz0/m0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lc41/w1;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lc41/v1;->m(Lgz0/m0;Lc41/w1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/navigation/e;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkd1/l;

    invoke-static {v0, v1, v2}, Lc41/l0;->h(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkd1/l;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lq2/a;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lc31/k;

    invoke-static {v0, v1, v2}, Lc31/j;->d(Lq2/a;Lkotlin/jvm/functions/Function1;Lc31/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lyx1/a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lby1/g;->a(Lkotlin/jvm/functions/Function1;Lyx1/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->z:Ljava/lang/Object;

    check-cast v1, Lf0/r1;

    iget-object v2, p0, Lc;->y:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    invoke-static {v0, v1, v2}, Lbs1/c0;->k(Lkotlin/jvm/functions/Function1;Lf0/r1;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lb3/x2;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    invoke-static {v0, v1, v2}, Lbm2/z0;->p(Lbc3/c0;Lb3/x2;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lhv1/f;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lbm2/z0;->g(Lkotlin/jvm/functions/Function1;Lhv1/f;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lc;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lc;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lc;->y:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-static {v0, v1, v2}, Lbm2/e0;->D(Lp1/c1;Lp1/c1;Lp1/t2;)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lc;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lc;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lc;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lbm2/e0;->s(Lp1/c1;Lp1/c1;Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/LocalDate;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lbm2/e0;->v(Lorg/joda/time/LocalDate;Ljava/lang/String;Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lc;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lc;->x:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v2, p0, Lc;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lbm2/e0;->j(Lp1/c1;Lp1/t2;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/straphistorysync/sync/e;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Ljk0/d;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/whoop/straphistorysync/sync/e;->d(Lcom/whoop/straphistorysync/sync/e;Ljk0/d;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lze0/c$e$b;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    invoke-static {v0, v1, v2}, Lbf0/k;->g(Lbc3/c0;Lze0/c$e$b;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lze0/c$e$c;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    invoke-static {v0, v1, v2}, Lbf0/k;->f(Lbc3/c0;Lze0/c$e$c;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lze0/c$e$a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    invoke-static {v0, v1, v2}, Lbf0/k;->j(Lbc3/c0;Lze0/c$e$a;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lzd1/d$a;

    invoke-static {v0, v1, v2}, Lbe1/g;->D(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzd1/d$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lb90/g;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lb90/f;->d(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lb01/p;->a(Lc93/m;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Laz1/n;->b(Leb/u0;Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Laz1/n;->a(Leb/a0;Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lys2/e$n;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lat2/o0;->e(Lys2/e$n;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lcm2/l;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lam2/w;->d(Lkotlin/jvm/functions/Function1;Lcm2/l;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lcm2/q;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lam2/k;->s(Lkotlin/jvm/functions/Function1;Lcm2/q;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lpv0/d;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Lpv0/b$c;

    invoke-virtual {v1}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/whoop/design/util/TextResource;->resolve(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lpv0/b$c;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lpv0/d;

    new-instance v3, Lpv0/b$d;

    invoke-static {v1}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lpv0/b$d;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lpv0/b$b;

    invoke-virtual {v2}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lpv0/b$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lc;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lc;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lc;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    new-instance v3, Le;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v1, v2, v5, v4}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v0, v5, v5, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

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
