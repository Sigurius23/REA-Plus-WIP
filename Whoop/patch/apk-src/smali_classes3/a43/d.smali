.class public final La43/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La43/f;


# direct methods
.method public synthetic constructor <init>(La43/f;Lq83/d;I)V
    .locals 0

    iput p3, p0, La43/d;->w:I

    iput-object p1, p0, La43/d;->x:La43/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, La43/d;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, La43/d;

    iget-object v0, p0, La43/d;->x:La43/f;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, La43/d;-><init>(La43/f;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, La43/d;

    iget-object v0, p0, La43/d;->x:La43/f;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, La43/d;-><init>(La43/f;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La43/d;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, La43/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La43/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La43/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, La43/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La43/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La43/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, La43/d;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x0

    iget-object v3, p0, La43/d;->x:La43/f;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, La43/f;->x:Landroidx/lifecycle/x;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    iget-object p1, v3, La43/f;->y:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[observe] subscribed"

    invoke-interface {p1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v3, La43/f;->x:Landroidx/lifecycle/x;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object p1, v3, La43/f;->y:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[dispose] unsubscribed"

    invoke-interface {p1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
