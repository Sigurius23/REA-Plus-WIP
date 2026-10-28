.class public final synthetic Lp40/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp40/b;->w:I

    iput-object p1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lp40/b;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lp40/b;->w:I

    iput-object p1, p0, Lp40/b;->y:Lp1/c1;

    iput-object p2, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lp40/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Lq3/y;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lxq2/b0;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Ltq1/a;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lwq1/c;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;Ltq1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lwo1/h0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lwi0/e;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {p1, v0, v1}, Lw71/s;->f(ILkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lw51/g;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lvt2/f;->m(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, La81/t;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lvp1/h;->b0(Lkotlin/jvm/functions/Function1;Lp1/c1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lvo1/x;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lvo1/r;->q(Lkotlin/jvm/functions/Function1;Lp1/c1;Lcom/whoop/design/models/modal/DecodedGenericInteraction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lv80/b;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    check-cast p1, Lp1/i0;

    iget-object v1, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lue1/c;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lh2/b;

    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-eqz v0, :cond_0

    iget-wide v1, p1, Lh2/b;->a:J

    iget-object p1, v0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v1, v2}, Ll3/w;->g(J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    check-cast p1, Ll3/r0;

    iget-object v0, p0, Lp40/b;->y:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lsz0/e;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lsz0/e;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lsg2/v;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lq3/y;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lqz0/k;->j(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lqu2/h;->B(Lkotlin/jvm/functions/Function1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lp40/b;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lpj2/i;->J(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    iget-object p1, p0, Lp40/b;->y:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/r0;

    if-eqz v2, :cond_3

    iget-object v2, v2, Ll3/r0;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_3

    invoke-static {v2}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lh2/c;

    invoke-static {v0, v1}, Lh2/b;->e(J)F

    move-result v5

    invoke-virtual {v4}, Lh2/c;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Lh2/b;->e(J)F

    move-result v6

    cmpl-float v5, v5, v6

    if-lez v5, :cond_1

    invoke-static {v0, v1}, Lh2/b;->e(J)F

    move-result v5

    invoke-virtual {v4}, Lh2/c;->g()J

    move-result-wide v6

    invoke-static {v6, v7}, Lh2/b;->e(J)F

    move-result v4

    cmpg-float v4, v5, v4

    if-gez v4, :cond_1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    check-cast v3, Lh2/c;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lh2/c;->g()J

    move-result-wide v0

    invoke-virtual {v3}, Lh2/c;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Lh2/b;->e(J)F

    move-result v2

    const v3, 0x3dcccccd    # 0.1f

    add-float/2addr v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v2, v3, v0, v1, v4}, Lh2/b;->a(FFJI)J

    move-result-wide v0

    :cond_3
    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/r0;

    if-eqz p1, :cond_4

    iget-object p1, p1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v0, v1}, Ll3/w;->g(J)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lp40/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
