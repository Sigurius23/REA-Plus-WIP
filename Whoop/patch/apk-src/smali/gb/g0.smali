.class public final Lgb/g0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lgb/g0;->w:I

    iput-object p1, p0, Lgb/g0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lgb/g0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lgb/g0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lgb/g0;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lgb/g0;->w:I

    const-string v1, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"

    const/4 v2, 0x0

    iget-object v3, p0, Lgb/g0;->E:Ljava/lang/Object;

    iget-object v4, p0, Lgb/g0;->z:Ljava/lang/Object;

    iget-object v5, p0, Lgb/g0;->y:Ljava/lang/Object;

    iget-object v6, p0, Lgb/g0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Leb/q;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lkotlin/jvm/internal/b0;

    const/4 v0, 0x1

    iput-boolean v0, v6, Lkotlin/jvm/internal/b0;->w:Z

    check-cast v5, Leb/a0;

    check-cast v4, Leb/n0;

    check-cast v3, Landroid/os/Bundle;

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-virtual {v5, v4, v3, p1, v0}, Leb/a0;->a(Leb/n0;Landroid/os/Bundle;Leb/q;Ljava/util/List;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/q;

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgb/h;

    check-cast v6, Lgb/i;

    iget-object v1, v6, Lgb/i;->c:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_4

    check-cast v3, Lp1/c1;

    invoke-static {v3}, Lhg3/i;->f(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    sget v1, Leb/n0;->K:I

    invoke-static {v0}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    instance-of v3, v1, Lgb/h;

    if-eqz v3, :cond_2

    check-cast v1, Lgb/h;

    iget-object v1, v1, Lgb/h;->N:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/e1;

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    move-object v2, v1

    :cond_3
    if-nez v2, :cond_8

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lc0/e1;

    goto :goto_3

    :cond_4
    :goto_1
    sget v1, Leb/n0;->K:I

    invoke-static {v0}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    instance-of v3, v1, Lgb/h;

    if-eqz v3, :cond_6

    check-cast v1, Lgb/h;

    iget-object v1, v1, Lgb/h;->P:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_6

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/e1;

    goto :goto_2

    :cond_6
    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_5

    move-object v2, v1

    :cond_7
    if-nez v2, :cond_8

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lc0/e1;

    :cond_8
    :goto_3
    return-object v2

    :pswitch_1
    check-cast p1, Lc0/q;

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->x:Leb/n0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lgb/h;

    check-cast v6, Lgb/i;

    iget-object v1, v6, Lgb/i;->c:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_d

    check-cast v3, Lp1/c1;

    invoke-static {v3}, Lhg3/i;->f(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    sget v1, Leb/n0;->K:I

    invoke-static {v0}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    instance-of v3, v1, Lgb/h;

    if-eqz v3, :cond_b

    check-cast v1, Lgb/h;

    iget-object v1, v1, Lgb/h;->M:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_b

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/c1;

    goto :goto_4

    :cond_b
    move-object v1, v2

    :goto_4
    if-eqz v1, :cond_a

    move-object v2, v1

    :cond_c
    if-nez v2, :cond_11

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lc0/c1;

    goto :goto_7

    :cond_d
    :goto_5
    sget v1, Leb/n0;->K:I

    invoke-static {v0}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v0

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/n0;

    instance-of v3, v1, Lgb/h;

    if-eqz v3, :cond_f

    check-cast v1, Lgb/h;

    iget-object v1, v1, Lgb/h;->O:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_f

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/c1;

    goto :goto_6

    :cond_f
    move-object v1, v2

    :goto_6
    if-eqz v1, :cond_e

    move-object v2, v1

    :cond_10
    if-nez v2, :cond_11

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lc0/c1;

    :cond_11
    :goto_7
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
