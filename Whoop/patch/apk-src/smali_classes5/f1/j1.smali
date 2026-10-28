.class public final Lf1/j1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/s1;


# direct methods
.method public synthetic constructor <init>(Lf1/s1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lf1/j1;->w:I

    iput-object p1, p0, Lf1/j1;->x:Lf1/s1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lf1/j1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf1/j1;

    iget-object v1, p0, Lf1/j1;->x:Lf1/s1;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p1, v2}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lf1/j1;

    iget-object v1, p0, Lf1/j1;->x:Lf1/s1;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p1, v2}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Lf1/j1;

    iget-object v1, p0, Lf1/j1;->x:Lf1/s1;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object v0

    :pswitch_2
    new-instance v0, Lf1/j1;

    iget-object v1, p0, Lf1/j1;->x:Lf1/s1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/j1;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lf1/j1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/j1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf1/j1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_0
    invoke-virtual {p0, p1}, Lf1/j1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/j1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf1/j1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_1
    invoke-virtual {p0, p1}, Lf1/j1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/j1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf1/j1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_2
    invoke-virtual {p0, p1}, Lf1/j1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/j1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf1/j1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf1/j1;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lf1/j1;->x:Lf1/s1;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lf1/s1;->o()V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, v2, Lf1/s1;->B:Z

    invoke-virtual {v2, p1}, Lf1/s1;->d(Z)Lbc3/c2;

    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lf1/s1;->f()V

    return-object v1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, v2, Lf1/s1;->B:Z

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
