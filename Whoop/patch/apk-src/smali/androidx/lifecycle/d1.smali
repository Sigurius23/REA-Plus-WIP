.class public final Landroidx/lifecycle/d1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lq83/d;I)V
    .locals 0

    iput p3, p0, Landroidx/lifecycle/d1;->w:I

    iput-object p1, p0, Landroidx/lifecycle/d1;->z:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Landroidx/lifecycle/d1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/lifecycle/d1;

    iget-object v1, p0, Landroidx/lifecycle/d1;->z:Lc93/m;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Landroidx/lifecycle/d1;-><init>(Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Landroidx/lifecycle/d1;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Landroidx/lifecycle/d1;

    iget-object v1, p0, Landroidx/lifecycle/d1;->z:Lc93/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Landroidx/lifecycle/d1;-><init>(Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Landroidx/lifecycle/d1;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/lifecycle/d1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/d1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/d1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/d1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/d1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/d1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/d1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Landroidx/lifecycle/d1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/lifecycle/d1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/d1;->y:Ljava/lang/Object;

    check-cast p1, Lf6/f;

    iput v2, p0, Landroidx/lifecycle/d1;->x:I

    iget-object v1, p0, Landroidx/lifecycle/d1;->z:Lc93/m;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v0, p1

    check-cast v0, Lf6/f;

    const-string p1, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v0

    check-cast p1, Lf6/a;

    iget-object p1, p1, Lf6/a;->b:Lad3/z;

    iget-object p1, p1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/lifecycle/d1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/d1;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iput v2, p0, Landroidx/lifecycle/d1;->x:I

    iget-object v1, p0, Landroidx/lifecycle/d1;->z:Lc93/m;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
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
