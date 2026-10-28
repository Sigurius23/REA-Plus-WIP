.class public final Ln43/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:La30/w0;

.field public final synthetic z:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(La30/w0;Landroid/content/Context;Lq83/d;I)V
    .locals 0

    iput p4, p0, Ln43/c;->w:I

    iput-object p1, p0, Ln43/c;->y:La30/w0;

    iput-object p2, p0, Ln43/c;->z:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Ln43/c;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ln43/c;

    iget-object v0, p0, Ln43/c;->z:Landroid/content/Context;

    const/4 v1, 0x1

    iget-object v2, p0, Ln43/c;->y:La30/w0;

    invoke-direct {p1, v2, v0, p2, v1}, Ln43/c;-><init>(La30/w0;Landroid/content/Context;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ln43/c;

    iget-object v0, p0, Ln43/c;->z:Landroid/content/Context;

    const/4 v1, 0x0

    iget-object v2, p0, Ln43/c;->y:La30/w0;

    invoke-direct {p1, v2, v0, p2, v1}, Ln43/c;-><init>(La30/w0;Landroid/content/Context;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln43/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln43/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln43/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln43/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln43/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln43/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln43/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ln43/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln43/c;->y:La30/w0;

    iget-object v1, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ln43/c;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object p1

    iget-object v3, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object v3, v1, Lt23/c0;->v:Ljava/lang/String;

    const-string v8, "Observing notification updates for call: "

    invoke-static {v8, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v6, v5, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lt23/b4;

    iget-object p1, p1, Lt23/b4;->H:Lh43/b;

    iget-object p1, p1, Lh43/b;->x:Le43/g;

    iget-object p1, p1, Le43/g;->i:Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lt23/c0;->p:Lt23/s0;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec3/l;

    if-nez p1, :cond_3

    iget-object p1, v3, Lt23/s0;->G:Lec3/h2;

    iget-object v1, v3, Lt23/s0;->x:Ln53/e;

    iget-object v5, v3, Lt23/s0;->o:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lec3/f2;

    iget-object v3, v3, Lt23/s0;->Q:Lec3/h2;

    new-instance v6, Ln43/b;

    const/4 v8, 0x5

    invoke-direct {v6, v8, v7}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {p1, v1, v5, v3, v6}, Lec3/v;->o(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lc93/o;)Landroidx/room/y;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    :cond_3
    new-instance v1, Ln43/c;

    iget-object v3, p0, Ln43/c;->z:Landroid/content/Context;

    const/4 v5, 0x0

    invoke-direct {v1, v0, v3, v7, v5}, Ln43/c;-><init>(La30/w0;Landroid/content/Context;Lq83/d;I)V

    iput v4, p0, Ln43/c;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln43/c;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Ln43/c;->x:I

    iget-object p1, p0, Ln43/c;->y:La30/w0;

    iget-object v1, p0, Ln43/c;->z:Landroid/content/Context;

    invoke-static {p1, v1, p0}, La30/w0;->c(La30/w0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
