.class public final Lp6/e0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Lp6/l;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lp6/e0;->w:I

    iput-object p1, p0, Lp6/e0;->z:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp6/e0;->w:I

    check-cast p1, Lx6/k;

    check-cast p2, Lp6/l;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p4, Lq83/d;

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lp6/e0;

    iget-object p3, p0, Lp6/e0;->z:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p1, p3, p4, v0}, Lp6/e0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p2, p1, Lp6/e0;->y:Lp6/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp6/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance p1, Lp6/e0;

    iget-object p3, p0, Lp6/e0;->z:Ljava/lang/Object;

    check-cast p3, Landroid/os/Bundle;

    const/4 v0, 0x0

    invoke-direct {p1, p3, p4, v0}, Lp6/e0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p2, p1, Lp6/e0;->y:Lp6/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp6/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lp6/e0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp6/e0;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/e0;->y:Lp6/l;

    iget-object v1, p0, Lp6/e0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput v3, p0, Lp6/e0;->x:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lp6/d;

    invoke-direct {v3, v1}, Lp6/d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3, p0}, Lp6/l;->e(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v0, v2

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp6/e0;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v0, v2

    goto :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/e0;->y:Lp6/l;

    iget-object v1, p0, Lp6/e0;->z:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    iput v3, p0, Lp6/e0;->x:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lp6/e;

    invoke-direct {v3, v1}, Lp6/e;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p1, v3, p0}, Lp6/l;->e(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v2

    :goto_3
    if-ne p1, v0, :cond_4

    :goto_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
