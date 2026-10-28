.class public final Lb30/i5;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb30/i5;->w:I

    iput-object p1, p0, Lb30/i5;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, Lb30/i5;->w:I

    iput-object p1, p0, Lb30/i5;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/i5;->x:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p4, p0, Lb30/i5;->w:I

    iput-boolean p1, p0, Lb30/i5;->x:Z

    iput-object p2, p0, Lb30/i5;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lb30/i5;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lb30/i5;

    iget-object v0, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    iget-boolean v1, p0, Lb30/i5;->x:Z

    const/4 v2, 0x6

    invoke-direct {p1, v0, v1, p2, v2}, Lb30/i5;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lb30/i5;

    iget-object v0, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v0, Lg40/w2;

    iget-boolean v1, p0, Lb30/i5;->x:Z

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, Lb30/i5;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance v0, Lb30/i5;

    iget-object v1, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v1, Ln00/k;

    const/4 v2, 0x4

    invoke-direct {v0, v1, p2, v2}, Lb30/i5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lb30/i5;->x:Z

    return-object v0

    :pswitch_2
    new-instance v0, Lb30/i5;

    iget-object v1, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v1, Ll1/x4;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, Lb30/i5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lb30/i5;->x:Z

    return-object v0

    :pswitch_3
    new-instance p1, Lb30/i5;

    iget-object v0, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v0, Li20/j1;

    iget-boolean v1, p0, Lb30/i5;->x:Z

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, Lb30/i5;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lb30/i5;

    iget-boolean v0, p0, Lb30/i5;->x:Z

    iget-object v1, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v1, Lg2/s;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Lb30/i5;-><init>(ZLjava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Lb30/i5;

    iget-boolean v0, p0, Lb30/i5;->x:Z

    iget-object v1, p0, Lb30/i5;->y:Ljava/lang/Object;

    check-cast v1, Lg2/i;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lb30/i5;-><init>(ZLjava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/i5;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb30/i5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb30/i5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb30/i5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lb30/i5;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lb30/i5;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/view/CardNumberEditText;

    iget-object p1, v2, Lcom/stripe/android/view/CardNumberEditText;->n0:Lkotlin/jvm/functions/Function1;

    iget-boolean v0, p0, Lb30/i5;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Lg40/w2;

    iget-object p1, v2, Lg40/w2;->b:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-boolean v0, p0, Lb30/i5;->x:Z

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/y2;

    invoke-interface {v2, v0}, Lg40/y2;->b(Z)V

    goto :goto_0

    :cond_0
    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v4, p0, Lb30/i5;->x:Z

    check-cast v2, Ln00/k;

    sget p1, Ln00/k;->R:I

    iget-object v0, v2, Ln00/k;->N:Lec3/h2;

    :cond_1
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ln00/c;

    const/4 v8, 0x0

    const/16 v9, 0xfd

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lb30/i5;->x:Z

    if-nez p1, :cond_2

    check-cast v2, Ll1/x4;

    invoke-virtual {v2}, Ll1/x4;->a()V

    :cond_2
    return-object v1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Li20/j1;

    iget-object p1, v2, Li20/j1;->L:Lm63/d;

    iget-object v0, v2, Li20/j1;->F:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li20/i1;

    instance-of v0, v0, Li20/h1;

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lb30/i5;->x:Z

    if-eqz v0, :cond_3

    iget-object v0, v2, Li20/j1;->E:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lm63/d;->z:Ljava/lang/Object;

    check-cast p1, Lg40/v;

    invoke-virtual {p1, v0}, Lg40/v;->h(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    iget-object v0, v2, Li20/j1;->G:Ljava/util/LinkedHashMap;

    if-nez v0, :cond_4

    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lm63/d;->z:Ljava/lang/Object;

    check-cast p1, Lg40/v;

    invoke-virtual {p1, v0}, Lg40/v;->h(Ljava/util/Map;)V

    :cond_5
    :goto_1
    return-object v1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lb30/i5;->x:Z

    if-eqz p1, :cond_6

    check-cast v2, Lg2/s;

    invoke-virtual {v2}, Lg2/s;->b()V

    :cond_6
    return-object v1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lb30/i5;->x:Z

    if-eqz p1, :cond_7

    check-cast v2, Lg2/i;

    invoke-static {v2}, Lg2/i;->a(Lg2/i;)V

    :cond_7
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
