.class public final synthetic Luo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Luo1/b;->w:I

    iput-object p1, p0, Luo1/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Luo1/b;->w:I

    const-string v1, "$this$ImdsClient"

    const-string v2, "$this$addCallback"

    const/4 v3, 0x0

    const-string v4, "it"

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    iget-object v6, p0, Luo1/b;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Lx30/p0;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lx30/p0;->b:Lx30/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_0
    check-cast v6, Lx30/w;

    check-cast p1, Lv30/j;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v6, Lx30/w;->b:Lx30/v;

    iget-object v0, v0, Lx30/v;->c:Lx30/t;

    iget-object v0, v0, Lx30/t;->f:Luo1/b;

    invoke-virtual {v0, p1}, Luo1/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    :pswitch_1
    check-cast v6, Lx30/t;

    check-cast p1, Lv30/j;

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lv30/h;

    if-eqz v0, :cond_0

    check-cast p1, Lv30/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p1, Lv30/h;->a:Lv30/m;

    iget-object v0, p1, Lv30/m;->b:Ljava/lang/Integer;

    iget-object v1, p1, Lv30/m;->c:Ljava/lang/Integer;

    iget-object v2, v6, Lx30/t;->d:Lx30/f0;

    iget-object v2, v2, Lx30/f0;->c:Lx30/e0;

    const-string v3, ""

    invoke-virtual {v2, v3}, Lx30/e0;->s(Ljava/lang/String;)V

    iget-object v2, v6, Lx30/t;->c:Lx30/z;

    iget-object v2, v2, Lx30/z;->c:Lx30/p0;

    iget-object p1, p1, Lv30/m;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lx30/p0;->s(Ljava/lang/String;)V

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {p1, v2}, Lv8/b;->I(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    rem-int/lit8 p1, p1, 0x64

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    iget-object p1, v6, Lx30/t;->e:Lg40/c3;

    iget-object p1, p1, Lg40/c3;->c:Lg40/m3;

    invoke-interface {p1, v3}, Lg40/k1;->s(Ljava/lang/String;)V

    :cond_2
    return-object v5

    :pswitch_2
    check-cast v6, Lx30/k;

    check-cast p1, Ljava/lang/String;

    const-string v0, "textFieldValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lx30/k;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ls40/d;

    iget-object v4, v4, Ls40/d;->w:Ljava/lang/String;

    invoke-static {p1, v4, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls40/d;

    iget-object v1, v1, Ls40/d;->x:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :pswitch_3
    check-cast v6, Lx30/i;

    check-cast p1, Ll40/a;

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast v6, Lwz/y;

    check-cast p1, Lg1/z3;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v6, Lwz/y;->w:Lc00/a;

    invoke-virtual {p1}, Lc00/a;->a()Lwz/m1;

    move-result-object p1

    iget-boolean p1, p1, Lwz/m1;->a:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v6, Lcom/stripe/android/link/LinkActivity;

    check-cast p1, Lg/t;

    sget v0, Lcom/stripe/android/link/LinkActivity;->E:I

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v6, Lcom/stripe/android/link/LinkActivity;->x:Lwz/y;

    if-eqz p1, :cond_6

    new-instance v0, Lwz/m;

    iget-object v1, p1, Lwz/y;->x:Lxz/x;

    invoke-static {v1}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lwz/m;-><init>(Lwz/e;)V

    invoke-virtual {p1, v0}, Lwz/y;->l(Lwz/q;)V

    :cond_6
    return-object v5

    :pswitch_6
    check-cast v6, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v6, p1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_7
    check-cast v6, Ltq1/b;

    check-cast p1, Ltq1/a;

    invoke-static {v6, p1}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->y(Ltq1/b;Ltq1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast v6, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;

    check-cast p1, Luq1/a;

    invoke-static {v6, p1}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->B(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Luq1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast v6, Lsi2/a;

    check-cast p1, Lsi2/b;

    invoke-static {v6, p1}, Lcom/whoop/streaks/view/StreaksFragment;->C(Lsi2/a;Lsi2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v6, Lwe/g;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    sget-object v0, Lwe/m;->a:Ljava/util/Set;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, v6, Lwe/g;->e:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 v3, 0x1

    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v6, Lwc/m0;

    check-cast p1, Lbe/c;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lwc/m0;->x:Lvg/n;

    invoke-virtual {p1, v0}, Lbe/c;->b(Lvg/n;)V

    iget-object v0, v6, Lwc/m0;->y:Lpf/a;

    invoke-virtual {p1, v0}, Lbe/c;->a(Lpf/a;)V

    return-object v5

    :pswitch_c
    check-cast v6, Lwc/c;

    check-cast p1, Lbe/c;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lwc/c;->w:Lvg/n;

    invoke-virtual {p1, v0}, Lbe/c;->b(Lvg/n;)V

    iget-object v0, v6, Lwc/c;->y:Lpf/a;

    invoke-virtual {p1, v0}, Lbe/c;->a(Lpf/a;)V

    return-object v5

    :pswitch_d
    check-cast v6, Luy1/e;

    check-cast p1, Lvy1/c;

    invoke-static {v6, p1}, Lvy1/b;->d(Luy1/e;Lvy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast v6, Lls2/b;

    check-cast p1, Lls2/a;

    invoke-static {v6, p1}, Lvt2/f;->l(Lls2/b;Lls2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v6, Ln0/u;

    check-cast p1, Li2/g0;

    invoke-static {v6, p1}, Lvs2/e;->i(Ln0/u;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v6, Lro1/b;

    check-cast p1, Lro1/a;

    invoke-static {v6, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;->B(Lro1/b;Lro1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v6, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;

    check-cast p1, Lto1/a;

    invoke-static {v6, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->A(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;Lto1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast v6, Lvn2/c;

    check-cast p1, Ljava/lang/String;

    invoke-static {v6, p1}, Lvn2/c;->a(Lvn2/c;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v6, Lvh2/e;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v6, p1}, Lvh2/e;->e(Lvh2/e;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast v6, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;

    check-cast p1, Lre2/a$a;

    invoke-static {v6, p1}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->B(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lre2/a$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast v6, Lse0/b;

    check-cast p1, Lse0/a;

    invoke-static {v6, p1}, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;->D(Lse0/b;Lse0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast v6, Lv51/c;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v6, p1}, Lv51/b;->d(Lv51/c;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;

    check-cast p1, Lg/t;

    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;->y:I

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;->o()Lv20/r;

    move-result-object p1

    sget-object v0, Lv20/l;->a:Lv20/l;

    invoke-virtual {p1, v0}, Lv20/r;->g(Lv20/o;)V

    return-object v5

    :pswitch_18
    check-cast v6, Lcom/whoop/nativestore/home/view/NativeStoreFragment;

    invoke-static {v6, p1}, Lcom/whoop/nativestore/home/view/NativeStoreFragment;->B(Lcom/whoop/nativestore/home/view/NativeStoreFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast v6, Lcom/whoop/debug/share/ShareDebugFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v6, p1}, Lcom/whoop/debug/share/ShareDebugFragment;->A(Lcom/whoop/debug/share/ShareDebugFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast v6, Lux/s0;

    check-cast p1, Ls40/a;

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lux/e0;

    invoke-direct {v0, p1}, Lux/e0;-><init>(Ls40/a;)V

    return-object v0

    :pswitch_1b
    check-cast v6, Lus1/b;

    check-cast p1, Ltb/a;

    invoke-static {v6, p1}, Lus1/b;->l(Lus1/b;Ltb/a;)Lvs1/a;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v6, Luo1/a;

    check-cast p1, Lkb1/e;

    invoke-static {v6, p1}, Luo1/c;->a(Luo1/a;Lkb1/e;)Lqy0/a;

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
